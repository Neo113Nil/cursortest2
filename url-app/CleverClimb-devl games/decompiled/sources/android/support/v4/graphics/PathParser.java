package android.support.v4.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class PathParser {
    private static final String LOGTAG = "PathParser";

    static float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int min = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, min);
        return fArr2;
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] createNodesFromPathData = createNodesFromPathData(str);
        if (createNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(createNodesFromPathData, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int nextStart = nextStart(str, i);
            String trim = str.substring(i2, nextStart).trim();
            if (trim.length() > 0) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i2 = nextStart;
            i = nextStart + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            addNode(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            if (pathDataNodeArr[i].mType != pathDataNodeArr2[i].mType || pathDataNodeArr[i].mParams.length != pathDataNodeArr2[i].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            for (int i2 = 0; i2 < pathDataNodeArr2[i].mParams.length; i2++) {
                pathDataNodeArr[i].mParams[i2] = pathDataNodeArr2[i].mParams[i2];
            }
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c2, float[] fArr) {
        arrayList.add(new PathDataNode(c2, fArr));
    }

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[LOOP:0: B:2:0x0007->B:14:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void extract(String str, int i, ExtractFloatResult extractFloatResult) {
        extractFloatResult.mEndWithNegOrDot = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != ' ') {
                if (charAt != 'E' && charAt != 'e') {
                    switch (charAt) {
                        case ',':
                            break;
                        case '-':
                            if (i2 != i && !z) {
                                extractFloatResult.mEndWithNegOrDot = true;
                                break;
                            }
                            z = false;
                            break;
                        case '.':
                            if (z2) {
                                extractFloatResult.mEndWithNegOrDot = true;
                                break;
                            } else {
                                z = false;
                                z2 = true;
                                break;
                            }
                        default:
                            z = false;
                            break;
                    }
                } else {
                    z = true;
                }
                if (!z3) {
                    extractFloatResult.mEndPosition = i2;
                }
            }
            z = false;
            z3 = true;
            if (!z3) {
            }
        }
        extractFloatResult.mEndPosition = i2;
    }

    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        PathDataNode(char c2, float[] fArr) {
            this.mType = c2;
            this.mParams = fArr;
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            this.mParams = PathParser.copyOfRange(pathDataNode.mParams, 0, pathDataNode.mParams.length);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                addCommand(path, fArr, c2, pathDataNodeArr[i].mType, pathDataNodeArr[i].mParams);
                c2 = pathDataNodeArr[i].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            for (int i = 0; i < pathDataNode.mParams.length; i++) {
                this.mParams[i] = (pathDataNode.mParams[i] * (1.0f - f)) + (pathDataNode2.mParams[i] * f);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void addCommand(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i = 2;
                    break;
            }
            float f16 = f10;
            float f17 = f11;
            float f18 = f14;
            float f19 = f15;
            int i3 = 0;
            char c4 = c2;
            while (i3 < fArr2.length) {
                float f20 = 0.0f;
                switch (c3) {
                    case 'A':
                        i2 = i3;
                        int i4 = i2 + 5;
                        int i5 = i2 + 6;
                        drawArc(path, f16, f17, fArr2[i4], fArr2[i5], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                        f16 = fArr2[i4];
                        f17 = fArr2[i5];
                        f13 = f17;
                        f12 = f16;
                        break;
                    case 'C':
                        i2 = i3;
                        int i6 = i2 + 2;
                        int i7 = i2 + 3;
                        int i8 = i2 + 4;
                        int i9 = i2 + 5;
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                        f16 = fArr2[i8];
                        float f21 = fArr2[i9];
                        float f22 = fArr2[i6];
                        float f23 = fArr2[i7];
                        f17 = f21;
                        f13 = f23;
                        f12 = f22;
                        break;
                    case 'H':
                        i2 = i3;
                        int i10 = i2 + 0;
                        path.lineTo(fArr2[i10], f17);
                        f16 = fArr2[i10];
                        break;
                    case 'L':
                        i2 = i3;
                        int i11 = i2 + 0;
                        int i12 = i2 + 1;
                        path.lineTo(fArr2[i11], fArr2[i12]);
                        f16 = fArr2[i11];
                        f17 = fArr2[i12];
                        break;
                    case 'M':
                        i2 = i3;
                        int i13 = i2 + 0;
                        f16 = fArr2[i13];
                        int i14 = i2 + 1;
                        f17 = fArr2[i14];
                        if (i2 > 0) {
                            path.lineTo(fArr2[i13], fArr2[i14]);
                            break;
                        } else {
                            path.moveTo(fArr2[i13], fArr2[i14]);
                            f19 = f17;
                            f18 = f16;
                            break;
                        }
                    case 'Q':
                        i2 = i3;
                        int i15 = i2 + 0;
                        int i16 = i2 + 1;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        path.quadTo(fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                        f = fArr2[i15];
                        f2 = fArr2[i16];
                        f16 = fArr2[i17];
                        f17 = fArr2[i18];
                        f12 = f;
                        f13 = f2;
                        break;
                    case 'S':
                        float f24 = f17;
                        float f25 = f16;
                        i2 = i3;
                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                            float f26 = (f25 * 2.0f) - f12;
                            f3 = (f24 * 2.0f) - f13;
                            f4 = f26;
                        } else {
                            f4 = f25;
                            f3 = f24;
                        }
                        int i19 = i2 + 0;
                        int i20 = i2 + 1;
                        int i21 = i2 + 2;
                        int i22 = i2 + 3;
                        path.cubicTo(f4, f3, fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                        f = fArr2[i19];
                        f2 = fArr2[i20];
                        f16 = fArr2[i21];
                        f17 = fArr2[i22];
                        f12 = f;
                        f13 = f2;
                        break;
                    case 'T':
                        float f27 = f17;
                        float f28 = f16;
                        i2 = i3;
                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                            f27 = (f27 * 2.0f) - f13;
                            f28 = (f28 * 2.0f) - f12;
                        }
                        int i23 = i2 + 0;
                        int i24 = i2 + 1;
                        path.quadTo(f28, f27, fArr2[i23], fArr2[i24]);
                        f16 = fArr2[i23];
                        f17 = fArr2[i24];
                        f12 = f28;
                        f13 = f27;
                        break;
                    case 'V':
                        i2 = i3;
                        int i25 = i2 + 0;
                        path.lineTo(f16, fArr2[i25]);
                        f17 = fArr2[i25];
                        break;
                    case 'a':
                        int i26 = i3 + 5;
                        float f29 = fArr2[i26] + f16;
                        int i27 = i3 + 6;
                        float f30 = fArr2[i27] + f17;
                        float f31 = fArr2[i3 + 0];
                        float f32 = fArr2[i3 + 1];
                        float f33 = fArr2[i3 + 2];
                        float f34 = f16;
                        boolean z = fArr2[i3 + 3] != 0.0f;
                        i2 = i3;
                        drawArc(path, f16, f17, f29, f30, f31, f32, f33, z, fArr2[i3 + 4] != 0.0f);
                        f16 = f34 + fArr2[i26];
                        f17 += fArr2[i27];
                        f13 = f17;
                        f12 = f16;
                        break;
                    case 'c':
                        int i28 = i3 + 2;
                        int i29 = i3 + 3;
                        int i30 = i3 + 4;
                        int i31 = i3 + 5;
                        path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                        f5 = fArr2[i28] + f16;
                        f6 = fArr2[i29] + f17;
                        f16 += fArr2[i30];
                        f17 += fArr2[i31];
                        f12 = f5;
                        f13 = f6;
                        i2 = i3;
                        break;
                    case 'h':
                        int i32 = i3 + 0;
                        path.rLineTo(fArr2[i32], 0.0f);
                        f16 += fArr2[i32];
                        i2 = i3;
                        break;
                    case 'l':
                        int i33 = i3 + 0;
                        int i34 = i3 + 1;
                        path.rLineTo(fArr2[i33], fArr2[i34]);
                        f16 += fArr2[i33];
                        f17 += fArr2[i34];
                        i2 = i3;
                        break;
                    case 'm':
                        int i35 = i3 + 0;
                        f16 += fArr2[i35];
                        int i36 = i3 + 1;
                        f17 += fArr2[i36];
                        if (i3 > 0) {
                            path.rLineTo(fArr2[i35], fArr2[i36]);
                        } else {
                            path.rMoveTo(fArr2[i35], fArr2[i36]);
                            f19 = f17;
                            f18 = f16;
                        }
                        i2 = i3;
                        break;
                    case 'q':
                        int i37 = i3 + 0;
                        int i38 = i3 + 1;
                        int i39 = i3 + 2;
                        int i40 = i3 + 3;
                        path.rQuadTo(fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                        f5 = fArr2[i37] + f16;
                        f6 = fArr2[i38] + f17;
                        f16 += fArr2[i39];
                        f17 += fArr2[i40];
                        f12 = f5;
                        f13 = f6;
                        i2 = i3;
                        break;
                    case 's':
                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                            float f35 = f16 - f12;
                            f7 = f17 - f13;
                            f8 = f35;
                        } else {
                            f8 = 0.0f;
                            f7 = 0.0f;
                        }
                        int i41 = i3 + 0;
                        int i42 = i3 + 1;
                        int i43 = i3 + 2;
                        int i44 = i3 + 3;
                        path.rCubicTo(f8, f7, fArr2[i41], fArr2[i42], fArr2[i43], fArr2[i44]);
                        f5 = fArr2[i41] + f16;
                        f6 = fArr2[i42] + f17;
                        f16 += fArr2[i43];
                        f17 += fArr2[i44];
                        f12 = f5;
                        f13 = f6;
                        i2 = i3;
                        break;
                    case 't':
                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                            f20 = f16 - f12;
                            f9 = f17 - f13;
                        } else {
                            f9 = 0.0f;
                        }
                        int i45 = i3 + 0;
                        int i46 = i3 + 1;
                        path.rQuadTo(f20, f9, fArr2[i45], fArr2[i46]);
                        float f36 = f20 + f16;
                        float f37 = f9 + f17;
                        f16 += fArr2[i45];
                        f17 += fArr2[i46];
                        f13 = f37;
                        f12 = f36;
                        i2 = i3;
                        break;
                    case 'v':
                        int i47 = i3 + 0;
                        path.rLineTo(0.0f, fArr2[i47]);
                        f17 += fArr2[i47];
                        i2 = i3;
                        break;
                    default:
                        i2 = i3;
                        break;
                }
                i3 = i2 + i;
                c4 = c3;
            }
            fArr[0] = f16;
            fArr[1] = f17;
            fArr[2] = f12;
            fArr[3] = f13;
            fArr[4] = f18;
            fArr[5] = f19;
        }

        private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d2;
            double d3;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d4 = f;
            Double.isNaN(d4);
            double d5 = d4 * cos;
            double d6 = f2;
            Double.isNaN(d6);
            double d7 = f5;
            Double.isNaN(d7);
            double d8 = (d5 + (d6 * sin)) / d7;
            double d9 = -f;
            Double.isNaN(d9);
            Double.isNaN(d6);
            double d10 = (d9 * sin) + (d6 * cos);
            double d11 = f6;
            Double.isNaN(d11);
            double d12 = d10 / d11;
            double d13 = f3;
            Double.isNaN(d13);
            double d14 = f4;
            Double.isNaN(d14);
            Double.isNaN(d7);
            double d15 = ((d13 * cos) + (d14 * sin)) / d7;
            double d16 = -f3;
            Double.isNaN(d16);
            Double.isNaN(d14);
            Double.isNaN(d11);
            double d17 = ((d16 * sin) + (d14 * cos)) / d11;
            double d18 = d8 - d15;
            double d19 = d12 - d17;
            double d20 = (d8 + d15) / 2.0d;
            double d21 = (d12 + d17) / 2.0d;
            double d22 = (d18 * d18) + (d19 * d19);
            if (d22 == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d22);
                float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
                drawArc(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d23);
            double d24 = d18 * sqrt2;
            double d25 = sqrt2 * d19;
            if (z == z2) {
                d2 = d20 - d25;
                d3 = d21 + d24;
            } else {
                d2 = d20 + d25;
                d3 = d21 - d24;
            }
            double atan2 = Math.atan2(d12 - d3, d8 - d2);
            double atan22 = Math.atan2(d17 - d3, d15 - d2) - atan2;
            if (z2 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            Double.isNaN(d7);
            double d26 = d2 * d7;
            Double.isNaN(d11);
            double d27 = d3 * d11;
            arcToBezier(path, (d26 * cos) - (d27 * sin), (d26 * sin) + (d27 * cos), d7, d11, d4, d6, radians, atan2, atan22);
        }

        private static void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d4;
            int ceil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d8);
            double sin = Math.sin(d8);
            double cos2 = Math.cos(d9);
            double sin2 = Math.sin(d9);
            double d12 = -d11;
            double d13 = d12 * cos;
            double d14 = d5 * sin;
            double d15 = (d13 * sin2) - (d14 * cos2);
            double d16 = d12 * sin;
            double d17 = d5 * cos;
            double d18 = (sin2 * d16) + (cos2 * d17);
            double d19 = ceil;
            Double.isNaN(d19);
            double d20 = d10 / d19;
            int i = 0;
            double d21 = d7;
            double d22 = d18;
            double d23 = d15;
            double d24 = d6;
            double d25 = d9;
            while (i < ceil) {
                double d26 = d25 + d20;
                double sin3 = Math.sin(d26);
                double cos3 = Math.cos(d26);
                double d27 = d20;
                double d28 = (d2 + ((d11 * cos) * cos3)) - (d14 * sin3);
                double d29 = d3 + (d11 * sin * cos3) + (d17 * sin3);
                double d30 = (d13 * sin3) - (d14 * cos3);
                double d31 = (sin3 * d16) + (cos3 * d17);
                double d32 = d26 - d25;
                double tan = Math.tan(d32 / 2.0d);
                double sin4 = (Math.sin(d32) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d24 + (d23 * sin4)), (float) (d21 + (d22 * sin4)), (float) (d28 - (sin4 * d30)), (float) (d29 - (sin4 * d31)), (float) d28, (float) d29);
                i++;
                d21 = d29;
                d24 = d28;
                d25 = d26;
                d22 = d31;
                d23 = d30;
                d20 = d27;
                d17 = d17;
                d16 = d16;
                ceil = ceil;
                cos = cos;
                sin = sin;
                d11 = d4;
            }
        }
    }
}
