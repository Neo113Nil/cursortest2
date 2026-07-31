package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class PathParser {
    static ArrayList<PathElement> elements;
    private static int i;
    private static int l;
    private static Path mPath;
    private static boolean mPenDown;
    private static float mPenDownX;
    private static float mPenDownY;
    private static float mPenX;
    private static float mPenY;
    private static float mPivotX;
    private static float mPivotY;
    static float mScale;
    private static String s;

    private static boolean is_cmd(char c) {
        switch (c) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
            case 'q':
            case 's':
            case io.appmetrica.analytics.BuildConfig.API_LEVEL /* 116 */:
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean is_number_start(char c) {
        return (c >= '0' && c <= '9') || c == '.' || c == '-' || c == '+';
    }

    PathParser() {
    }

    static Path parse(String str) {
        elements = new ArrayList<>();
        Path path = new Path();
        mPath = path;
        if (str == null) {
            return path;
        }
        l = str.length();
        s = str;
        i = 0;
        mPenX = 0.0f;
        mPenY = 0.0f;
        mPivotX = 0.0f;
        mPivotY = 0.0f;
        mPenDownX = 0.0f;
        mPenDownY = 0.0f;
        mPenDown = false;
        char c = ' ';
        while (i < l) {
            skip_spaces();
            int i2 = i;
            if (i2 < l) {
                boolean z = true;
                boolean z2 = c != ' ';
                char charAt = s.charAt(i2);
                if (!z2 && charAt != 'M' && charAt != 'm') {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(i), s));
                }
                if (is_cmd(charAt)) {
                    i++;
                    z = false;
                    c = charAt;
                } else {
                    if (!is_number_start(charAt) || !z2) {
                        throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(i), s));
                    }
                    if (c == 'Z' || c == 'z') {
                        throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", s));
                    }
                    if (c == 'M' || c == 'm') {
                        c = is_absolute(c) ? 'L' : 'l';
                    } else {
                        z = false;
                    }
                }
                boolean is_absolute = is_absolute(c);
                switch (c) {
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        arcTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_flag(), parse_flag(), parse_list_number(), parse_list_number());
                        break;
                    case 'C':
                        curveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                        break;
                    case 'H':
                        lineTo(parse_list_number(), mPenY);
                        break;
                    case 'L':
                        lineTo(parse_list_number(), parse_list_number());
                        break;
                    case 'M':
                        moveTo(parse_list_number(), parse_list_number());
                        break;
                    case 'Q':
                        quadraticBezierCurveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                        break;
                    case 'S':
                        smoothCurveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                        break;
                    case 'T':
                        smoothQuadraticBezierCurveTo(parse_list_number(), parse_list_number());
                        break;
                    case 'V':
                        lineTo(mPenX, parse_list_number());
                        break;
                    case 'Z':
                    case 'z':
                        close();
                        break;
                    case 'a':
                        arc(parse_list_number(), parse_list_number(), parse_list_number(), parse_flag(), parse_flag(), parse_list_number(), parse_list_number());
                        break;
                    case 'c':
                        curve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                        break;
                    case 'h':
                        line(parse_list_number(), 0.0f);
                        break;
                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                        line(parse_list_number(), parse_list_number());
                        break;
                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                        move(parse_list_number(), parse_list_number());
                        break;
                    case 'q':
                        quadraticBezierCurve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                        break;
                    case 's':
                        smoothCurve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                        break;
                    case io.appmetrica.analytics.BuildConfig.API_LEVEL /* 116 */:
                        smoothQuadraticBezierCurve(parse_list_number(), parse_list_number());
                        break;
                    case 'v':
                        line(0.0f, parse_list_number());
                        break;
                    default:
                        throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c), s));
                }
                if (z) {
                    c = is_absolute ? 'M' : 'm';
                }
            } else {
                return mPath;
            }
        }
        return mPath;
    }

    private static void move(float f, float f2) {
        moveTo(f + mPenX, f2 + mPenY);
    }

    private static void moveTo(float f, float f2) {
        mPenX = f;
        mPivotX = f;
        mPenDownX = f;
        mPenY = f2;
        mPivotY = f2;
        mPenDownY = f2;
        Path path = mPath;
        float f3 = mScale;
        path.moveTo(f * f3, f3 * f2);
        elements.add(new PathElement(ElementType.kCGPathElementMoveToPoint, new Point[]{new Point(f, f2)}));
    }

    private static void line(float f, float f2) {
        lineTo(f + mPenX, f2 + mPenY);
    }

    private static void lineTo(float f, float f2) {
        setPenDown();
        mPenX = f;
        mPivotX = f;
        mPenY = f2;
        mPivotY = f2;
        Path path = mPath;
        float f3 = mScale;
        path.lineTo(f * f3, f3 * f2);
        elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(f, f2)}));
    }

    private static void curve(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = mPenX;
        float f8 = mPenY;
        curveTo(f + f7, f2 + f8, f3 + f7, f4 + f8, f5 + f7, f6 + f8);
    }

    private static void curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        mPivotX = f3;
        mPivotY = f4;
        cubicTo(f, f2, f3, f4, f5, f6);
    }

    private static void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        setPenDown();
        mPenX = f5;
        mPenY = f6;
        Path path = mPath;
        float f7 = mScale;
        path.cubicTo(f * f7, f2 * f7, f3 * f7, f4 * f7, f5 * f7, f7 * f6);
        elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f, f2), new Point(f3, f4), new Point(f5, f6)}));
    }

    private static void smoothCurve(float f, float f2, float f3, float f4) {
        float f5 = mPenX;
        float f6 = mPenY;
        smoothCurveTo(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }

    private static void smoothCurveTo(float f, float f2, float f3, float f4) {
        float f5 = (mPenX * 2.0f) - mPivotX;
        float f6 = (mPenY * 2.0f) - mPivotY;
        mPivotX = f;
        mPivotY = f2;
        cubicTo(f5, f6, f, f2, f3, f4);
    }

    private static void quadraticBezierCurve(float f, float f2, float f3, float f4) {
        float f5 = mPenX;
        float f6 = mPenY;
        quadraticBezierCurveTo(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }

    private static void quadraticBezierCurveTo(float f, float f2, float f3, float f4) {
        mPivotX = f;
        mPivotY = f2;
        float f5 = f * 2.0f;
        float f6 = f2 * 2.0f;
        cubicTo((mPenX + f5) / 3.0f, (mPenY + f6) / 3.0f, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
    }

    private static void smoothQuadraticBezierCurve(float f, float f2) {
        smoothQuadraticBezierCurveTo(f + mPenX, f2 + mPenY);
    }

    private static void smoothQuadraticBezierCurveTo(float f, float f2) {
        quadraticBezierCurveTo((mPenX * 2.0f) - mPivotX, (mPenY * 2.0f) - mPivotY, f, f2);
    }

    private static void arc(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        arcTo(f, f2, f3, z, z2, f4 + mPenX, f5 + mPenY);
    }

    private static void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = mPenX;
        float f11 = mPenY;
        float abs = Math.abs(f2 == 0.0f ? f == 0.0f ? f5 - f11 : f : f2);
        float abs2 = Math.abs(f == 0.0f ? f4 - f10 : f);
        if (abs2 == 0.0f || abs == 0.0f || (f4 == f10 && f5 == f11)) {
            lineTo(f4, f5);
            return;
        }
        float radians = (float) Math.toRadians(f3);
        double d = radians;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = f4 - f10;
        float f13 = f5 - f11;
        float f14 = ((cos * f12) / 2.0f) + ((sin * f13) / 2.0f);
        float f15 = -sin;
        float f16 = ((f15 * f12) / 2.0f) + ((cos * f13) / 2.0f);
        float f17 = abs2 * abs2;
        float f18 = f17 * abs * abs;
        float f19 = (f18 - ((f17 * f16) * f16)) - (((abs * abs) * f14) * f14);
        if (f19 < 0.0f) {
            float f20 = 1.0f - (f19 / f18);
            f6 = 0.0f;
            float sqrt = (float) Math.sqrt(f20);
            abs2 *= sqrt;
            f9 = abs * sqrt;
            f8 = f12 / 2.0f;
            f7 = f13 / 2.0f;
        } else {
            f6 = 0.0f;
            float sqrt2 = (float) Math.sqrt(f19 / (r16 + r18));
            if (z == z2) {
                sqrt2 = -sqrt2;
            }
            float f21 = (((-sqrt2) * f16) * abs2) / abs;
            float f22 = ((sqrt2 * f14) * abs) / abs2;
            f7 = (f13 / 2.0f) + (f21 * sin) + (f22 * cos);
            f8 = ((cos * f21) - (sin * f22)) + (f12 / 2.0f);
            f9 = abs;
        }
        float f23 = cos / abs2;
        float f24 = sin / abs2;
        float f25 = f15 / f9;
        float f26 = cos / f9;
        float f27 = -f8;
        float f28 = -f7;
        float f29 = f8;
        float atan2 = (float) Math.atan2((f25 * f27) + (f26 * f28), (f27 * f23) + (f24 * f28));
        float f30 = f12 - f29;
        float f31 = f13 - f7;
        float atan22 = (float) Math.atan2((f25 * f30) + (f26 * f31), (f23 * f30) + (f24 * f31));
        float f32 = f29 + f10;
        float f33 = f7 + f11;
        float f34 = f12 + f10;
        float f35 = f13 + f11;
        setPenDown();
        mPivotX = f34;
        mPenX = f34;
        mPivotY = f35;
        mPenY = f35;
        if (abs2 != f9 || radians != f6) {
            arcToBezier(f32, f33, abs2, f9, atan2, atan22, z2, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(atan2);
        float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
        if (!z ? abs3 > 180.0f : abs3 < 180.0f) {
            abs3 = 360.0f - abs3;
        }
        if (!z2) {
            abs3 = -abs3;
        }
        float f36 = mScale;
        mPath.arcTo(new RectF((f32 - abs2) * f36, (f33 - abs2) * f36, (f32 + abs2) * f36, (f33 + abs2) * f36), degrees, abs3);
        elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f34, f35)}));
    }

    private static void close() {
        if (mPenDown) {
            mPenX = mPenDownX;
            mPenY = mPenDownY;
            mPenDown = false;
            mPath.close();
            elements.add(new PathElement(ElementType.kCGPathElementCloseSubpath, new Point[]{new Point(mPenX, mPenY)}));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[LOOP:0: B:7:0x0065->B:8:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void arcToBezier(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7) {
        double d;
        int ceil;
        int i2;
        float f8 = f5;
        double d2 = f7;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f9 = cos * f3;
        float f10 = (-sin) * f4;
        float f11 = sin * f3;
        float f12 = cos * f4;
        float f13 = f6 - f8;
        if (f13 >= 0.0f || !z) {
            if (f13 > 0.0f && !z) {
                d = f13 - 6.283185307179586d;
            }
            ceil = (int) Math.ceil(Math.abs(round(f13 / 1.5707963267948966d)));
            float f14 = f13 / ceil;
            float tan = (float) (Math.tan(f14 / 4.0f) * 1.3333333333333333d);
            double d3 = f8;
            float cos2 = (float) Math.cos(d3);
            float sin2 = (float) Math.sin(d3);
            i2 = 0;
            while (i2 < ceil) {
                float f15 = cos2 - (tan * sin2);
                float f16 = sin2 + (cos2 * tan);
                float f17 = f8 + f14;
                double d4 = f17;
                float cos3 = (float) Math.cos(d4);
                float sin3 = (float) Math.sin(d4);
                float f18 = (tan * sin3) + cos3;
                float f19 = sin3 - (tan * cos3);
                float f20 = f + (f9 * f15) + (f10 * f16);
                float f21 = f2 + (f15 * f11) + (f16 * f12);
                float f22 = f + (f9 * f18) + (f10 * f19);
                float f23 = f2 + (f18 * f11) + (f19 * f12);
                float f24 = f + (f9 * cos3) + (f10 * sin3);
                float f25 = f2 + (f11 * cos3) + (f12 * sin3);
                Path path = mPath;
                float f26 = mScale;
                path.cubicTo(f20 * f26, f21 * f26, f22 * f26, f23 * f26, f24 * f26, f26 * f25);
                elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f20, f21), new Point(f22, f23), new Point(f24, f25)}));
                i2++;
                f8 = f17;
                f14 = f14;
                f11 = f11;
                cos2 = cos3;
                f9 = f9;
                f12 = f12;
                f10 = f10;
                ceil = ceil;
                tan = tan;
                sin2 = sin3;
            }
        }
        d = f13 + 6.283185307179586d;
        f13 = (float) d;
        ceil = (int) Math.ceil(Math.abs(round(f13 / 1.5707963267948966d)));
        float f142 = f13 / ceil;
        float tan2 = (float) (Math.tan(f142 / 4.0f) * 1.3333333333333333d);
        double d32 = f8;
        float cos22 = (float) Math.cos(d32);
        float sin22 = (float) Math.sin(d32);
        i2 = 0;
        while (i2 < ceil) {
        }
    }

    private static void setPenDown() {
        if (mPenDown) {
            return;
        }
        mPenDownX = mPenX;
        mPenDownY = mPenY;
        mPenDown = true;
    }

    private static double round(double d) {
        return Math.round(d * r0) / Math.pow(10.0d, 4.0d);
    }

    private static void skip_spaces() {
        while (true) {
            int i2 = i;
            if (i2 >= l || !Character.isWhitespace(s.charAt(i2))) {
                return;
            } else {
                i++;
            }
        }
    }

    private static boolean is_absolute(char c) {
        return Character.isUpperCase(c);
    }

    private static boolean parse_flag() {
        skip_spaces();
        char charAt = s.charAt(i);
        if (charAt == '0' || charAt == '1') {
            int i2 = i + 1;
            i = i2;
            if (i2 < l && s.charAt(i2) == ',') {
                i++;
            }
            skip_spaces();
            return charAt == '1';
        }
        throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(i), s));
    }

    private static float parse_list_number() {
        if (i == l) {
            throw new Error(String.format("Unexpected end (s=%s)", s));
        }
        float parse_number = parse_number();
        skip_spaces();
        parse_list_separator();
        return parse_number;
    }

    private static float parse_number() {
        char charAt;
        skip_spaces();
        int i2 = i;
        if (i2 == l) {
            throw new Error(String.format("Unexpected end (s=%s)", s));
        }
        char charAt2 = s.charAt(i2);
        if (charAt2 == '-' || charAt2 == '+') {
            int i3 = i + 1;
            i = i3;
            charAt2 = s.charAt(i3);
        }
        if (charAt2 >= '0' && charAt2 <= '9') {
            skip_digits();
            int i4 = i;
            if (i4 < l) {
                charAt2 = s.charAt(i4);
            }
        } else if (charAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt2), Integer.valueOf(i), s));
        }
        if (charAt2 == '.') {
            i++;
            skip_digits();
            int i5 = i;
            if (i5 < l) {
                charAt2 = s.charAt(i5);
            }
        }
        if (charAt2 == 'e' || charAt2 == 'E') {
            int i6 = i;
            if (i6 + 1 < l && (charAt = s.charAt(i6 + 1)) != 'm' && charAt != 'x') {
                int i7 = i + 1;
                i = i7;
                char charAt3 = s.charAt(i7);
                if (charAt3 == '+' || charAt3 == '-') {
                    i++;
                    skip_digits();
                } else if (charAt3 >= '0' && charAt3 <= '9') {
                    skip_digits();
                } else {
                    throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt3), Integer.valueOf(i), s));
                }
            }
        }
        String substring = s.substring(i2, i);
        float parseFloat = Float.parseFloat(substring);
        if (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", substring, Integer.valueOf(i2), Integer.valueOf(i), s));
        }
        return parseFloat;
    }

    private static void parse_list_separator() {
        int i2 = i;
        if (i2 >= l || s.charAt(i2) != ',') {
            return;
        }
        i++;
    }

    private static void skip_digits() {
        while (true) {
            int i2 = i;
            if (i2 >= l || !Character.isDigit(s.charAt(i2))) {
                return;
            } else {
                i++;
            }
        }
    }
}
