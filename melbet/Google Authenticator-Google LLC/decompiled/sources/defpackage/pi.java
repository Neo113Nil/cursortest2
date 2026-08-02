package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pi {
    public static TypedArray A(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence B(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String C(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean D(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean E(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] F(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int G(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int H(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (E(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static int I(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static Shader.TileMode J(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0173, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(r22.getPositionDescription()).concat(": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0241 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ifn K(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ifn ifnVar;
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        float f;
        Shader radialGradient;
        if (E(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return new ifn(null, null, typedValue.data);
            }
            Resources resources = typedArray.getResources();
            try {
                xml = resources.getXml(typedArray.getResourceId(i, 0));
                asAttributeSet = Xml.asAttributeSet(xml);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                ifnVar = null;
            }
            do {
                next = xml.next();
                if (next == 2) {
                    String name = xml.getName();
                    int hashCode = name.hashCode();
                    if (hashCode != 89650992) {
                        if (hashCode == 1191572447 && name.equals("selector")) {
                            ColorStateList b = ut.b(resources, xml, asAttributeSet, theme);
                            ifnVar = new ifn(null, b, b.getDefaultColor());
                            if (ifnVar != null) {
                                return ifnVar;
                            }
                        }
                    } else if (name.equals("gradient")) {
                        String name2 = xml.getName();
                        if (!name2.equals("gradient")) {
                            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                        }
                        TypedArray A = A(resources, theme, asAttributeSet, ud.e);
                        float w = w(A, xml, "startX", 8, 0.0f);
                        float w2 = w(A, xml, "startY", 9, 0.0f);
                        float w3 = w(A, xml, "endX", 10, 0.0f);
                        float w4 = w(A, xml, "endY", 11, 0.0f);
                        float w5 = w(A, xml, "centerX", 3, 0.0f);
                        float w6 = w(A, xml, "centerY", 4, 0.0f);
                        int y = y(A, xml, "type", 2, 0);
                        int H = H(A, xml, "startColor", 0);
                        boolean E = E(xml, "centerColor");
                        int H2 = H(A, xml, "centerColor", 7);
                        int H3 = H(A, xml, "endColor", 1);
                        int i2 = 1;
                        int y2 = y(A, xml, "tileMode", 6, 0);
                        float w7 = w(A, xml, "gradientRadius", 5, 0.0f);
                        A.recycle();
                        int depth = xml.getDepth() + 1;
                        ArrayList arrayList = new ArrayList(20);
                        ArrayList arrayList2 = new ArrayList(20);
                        while (true) {
                            int next2 = xml.next();
                            XmlResourceParser xmlResourceParser = xml;
                            if (next2 == i2) {
                                f = w;
                                break;
                            }
                            int depth2 = xmlResourceParser.getDepth();
                            f = w;
                            if (depth2 < depth && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                                TypedArray A2 = A(resources, theme, asAttributeSet, ud.f);
                                boolean hasValue = A2.hasValue(0);
                                boolean hasValue2 = A2.hasValue(1);
                                if (!hasValue || !hasValue2) {
                                    break;
                                }
                                int color = A2.getColor(0, 0);
                                float f2 = A2.getFloat(1, 0.0f);
                                A2.recycle();
                                arrayList2.add(Integer.valueOf(color));
                                arrayList.add(Float.valueOf(f2));
                            }
                            xml = xmlResourceParser;
                            w = f;
                            i2 = 1;
                        }
                        brr brrVar = arrayList2.size() > 0 ? new brr((List) arrayList2, (List) arrayList) : null;
                        if (brrVar == null) {
                            brrVar = E ? new brr(H, H2, H3) : new brr(H, H3);
                        }
                        if (y != 1) {
                            if (y != 2) {
                                radialGradient = new LinearGradient(f, w2, w3, w4, (int[]) brrVar.a, (float[]) brrVar.b, J(y2));
                            } else {
                                radialGradient = new SweepGradient(w5, w6, (int[]) brrVar.a, (float[]) brrVar.b);
                            }
                        } else {
                            if (w7 <= 0.0f) {
                                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                            }
                            radialGradient = new RadialGradient(w5, w6, w7, (int[]) brrVar.a, (float[]) brrVar.b, J(y2));
                        }
                        ifnVar = new ifn(radialGradient, null, 0);
                        if (ifnVar != null) {
                        }
                    }
                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        }
        return new ifn(null, null, 0);
    }

    private static void L(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new vc(c, fArr));
    }

    static BiometricPrompt.Builder a(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    static BiometricPrompt b(BiometricPrompt.Builder builder) {
        BiometricPrompt build;
        build = builder.build();
        return build;
    }

    static void c(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    static void d(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static int k(qk qkVar, int i) {
        try {
            return rb.a(qkVar.a, qkVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int l(qk qkVar, Object obj, int i) {
        int i2 = qkVar.c;
        if (i2 == 0) {
            return -1;
        }
        int k = k(qkVar, i);
        if (k < 0 || ksp.b(obj, qkVar.b[k])) {
            return k;
        }
        int i3 = k + 1;
        while (i3 < i2 && qkVar.a[i3] == i) {
            if (ksp.b(obj, qkVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = k - 1; i4 >= 0 && qkVar.a[i4] == i; i4--) {
            if (ksp.b(obj, qkVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static void m(qk qkVar, int i) {
        qkVar.a = new int[i];
        qkVar.b = new Object[i];
    }

    public static float n(acd acdVar) {
        return ((qa) acdVar.a).b;
    }

    public static float o(acd acdVar) {
        return ((qa) acdVar.a).a;
    }

    public static void p(acd acdVar) {
        if (!acdVar.c()) {
            acdVar.a(0, 0, 0, 0);
            return;
        }
        float n = n(acdVar);
        float o = o(acdVar);
        int ceil = (int) Math.ceil(qb.a(n, o, acdVar.b()));
        int ceil2 = (int) Math.ceil(qb.b(n, o, acdVar.b()));
        acdVar.a(ceil, ceil2, ceil, ceil2);
    }

    public static Path r(String str) {
        Path path = new Path();
        try {
            s(t(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void s(vc[] vcVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        vc vcVar;
        int i3;
        char c;
        int i4;
        float f;
        boolean z;
        float f2;
        float f3;
        vc vcVar2;
        boolean z2;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z3;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        vc[] vcVarArr2 = vcVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = vcVarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c2 = 'm';
        while (i6 < length) {
            vc vcVar3 = vcVarArr2[i6];
            char c3 = vcVar3.a;
            float[] fArr3 = vcVar3.b;
            float f15 = fArr2[i5];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            int i7 = i5;
            float f20 = fArr2[5];
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
                    path2.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i8;
                    vcVar = vcVar3;
                    float f25 = f23;
                    float f26 = f24;
                    i3 = i6;
                    c = c3;
                    int i9 = i2 + 6;
                    int i10 = i2 + 5;
                    int i11 = i2 + 4;
                    float f27 = fArr[i10];
                    float f28 = fArr[i9];
                    float f29 = fArr[i2];
                    float f30 = fArr[i2 + 1];
                    float f31 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        i4 = i11;
                        f = f30;
                        z = 1;
                    } else {
                        i4 = i11;
                        f = f30;
                        z = i7;
                    }
                    vc.a(path, f25, f26, f27, f28, f29, f, f31, z, fArr[i4] != 0.0f ? 1 : i7);
                    f17 = fArr[i10];
                    f2 = fArr[i9];
                    f18 = f2;
                    f3 = f17;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    vcVar = vcVar3;
                    c = c3;
                    int i12 = i2 + 5;
                    int i13 = i2 + 4;
                    int i14 = i2 + 3;
                    int i15 = i2 + 2;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i15], fArr[i14], fArr[i13], fArr[i12]);
                    float f32 = fArr[i13];
                    float f33 = fArr[i12];
                    f17 = fArr[i15];
                    f18 = fArr[i14];
                    f2 = f33;
                    f3 = f32;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i8;
                    vcVar = vcVar3;
                    c = c3;
                    f2 = f24;
                    i3 = i6;
                    path2.lineTo(fArr[i2], f2);
                    f3 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    vcVar = vcVar3;
                    c = c3;
                    int i16 = i2 + 3;
                    int i17 = i2 + 2;
                    int i18 = i2 + 1;
                    path2.quadTo(fArr[i2], fArr[i18], fArr[i17], fArr[i16]);
                    float f34 = fArr[i2];
                    float f35 = fArr[i18];
                    f3 = fArr[i17];
                    f18 = f35;
                    f2 = fArr[i16];
                    f17 = f34;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    vcVar = vcVar3;
                    f3 = f23;
                    c = c3;
                    path2.lineTo(f3, fArr[i2]);
                    f2 = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i8;
                        int i19 = i2 + 5;
                        int i20 = i2 + 4;
                        int i21 = i2 + 3;
                        int i22 = i2 + 2;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i22], fArr[i21], fArr[i20], fArr[i19]);
                        float f36 = fArr[i22] + f23;
                        float f37 = fArr[i21] + f24;
                        f23 += fArr[i20];
                        f24 += fArr[i19];
                        f17 = f36;
                        f18 = f37;
                    } else if (c3 == 'h') {
                        fArr = fArr3;
                        i2 = i8;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f23 += fArr[i2];
                    } else if (c3 != 'q') {
                        if (c3 != 'v') {
                            if (c3 != 'L') {
                                if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    f9 = fArr[i2];
                                    f10 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f9, f10);
                                    } else {
                                        path2.moveTo(f9, f10);
                                        f21 = f9;
                                        f2 = f10;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                        f3 = f21;
                                    }
                                } else if (c3 == 'S') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i23 = i2 + 3;
                                    int i24 = i2 + 2;
                                    int i25 = i2 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.cubicTo(f23, f24, fArr[i2], fArr[i25], fArr[i24], fArr[i23]);
                                    f17 = fArr[i2];
                                    f18 = fArr[i25];
                                    f3 = fArr[i24];
                                    i3 = i6;
                                    c = c3;
                                    f2 = fArr[i23];
                                } else if (c3 == 'T') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i26 = i2 + 1;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.quadTo(f23, f24, fArr[i2], fArr[i26]);
                                    float f38 = fArr[i2];
                                    f2 = fArr[i26];
                                    f17 = f23;
                                    f18 = f24;
                                    f3 = f38;
                                    i3 = i6;
                                    vcVar = vcVar3;
                                    c = c3;
                                } else if (c3 == 'l') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i27 = i2 + 1;
                                    path2.rLineTo(fArr[i2], fArr[i27]);
                                    f23 += fArr[i2];
                                    f8 = fArr[i27];
                                } else if (c3 == 'm') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    float f39 = fArr[i2];
                                    f23 += f39;
                                    float f40 = fArr[i2 + 1];
                                    f24 += f40;
                                    if (i2 > 0) {
                                        path2.rLineTo(f39, f40);
                                    } else {
                                        path2.rMoveTo(f39, f40);
                                        vcVar = vcVar3;
                                        f3 = f23;
                                        f21 = f3;
                                        f2 = f24;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 == 't') {
                                        int i28 = i8 + 1;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f13 = f24 - f18;
                                            f14 = f23 - f17;
                                        } else {
                                            f13 = 0.0f;
                                            f14 = 0.0f;
                                        }
                                        path2.rQuadTo(f14, f13, fArr3[i8], fArr3[i28]);
                                        float f41 = f14 + f23;
                                        float f42 = f13 + f24;
                                        f23 += fArr3[i8];
                                        f24 += fArr3[i28];
                                        f18 = f42;
                                        f17 = f41;
                                    }
                                    fArr = fArr3;
                                    i2 = i8;
                                    vcVar = vcVar3;
                                    f3 = f23;
                                    f2 = f24;
                                    i3 = i6;
                                    c = c3;
                                } else {
                                    int i29 = i8 + 3;
                                    int i30 = i8 + 2;
                                    int i31 = i8 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f11 = f24 - f18;
                                        f12 = f23 - f17;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i32 = i8;
                                    fArr = fArr3;
                                    i2 = i32;
                                    path2.rCubicTo(f12, f11, fArr3[i32], fArr3[i31], fArr3[i30], fArr3[i29]);
                                    float f43 = fArr[i2] + f23;
                                    float f44 = fArr[i31] + f24;
                                    f23 += fArr[i30];
                                    f24 += fArr[i29];
                                    f17 = f43;
                                    f18 = f44;
                                }
                                vcVar = vcVar3;
                            } else {
                                fArr = fArr3;
                                i2 = i8;
                                int i33 = i2 + 1;
                                path2.lineTo(fArr[i2], fArr[i33]);
                                f9 = fArr[i2];
                                f10 = fArr[i33];
                            }
                            f2 = f10;
                            i3 = i6;
                            c = c3;
                            f3 = f9;
                            vcVar = vcVar3;
                        } else {
                            fArr = fArr3;
                            i2 = i8;
                            path2.rLineTo(0.0f, fArr[i2]);
                            f8 = fArr[i2];
                        }
                        f24 += f8;
                    } else {
                        fArr = fArr3;
                        i2 = i8;
                        int i34 = i2 + 3;
                        int i35 = i2 + 2;
                        int i36 = i2 + 1;
                        path2.rQuadTo(fArr[i2], fArr[i36], fArr[i35], fArr[i34]);
                        float f45 = fArr[i2] + f23;
                        float f46 = fArr[i36] + f24;
                        f23 += fArr[i35];
                        f24 += fArr[i34];
                        f18 = f46;
                        f17 = f45;
                    }
                    vcVar = vcVar3;
                    f3 = f23;
                    f2 = f24;
                    i3 = i6;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i8;
                    int i37 = i2 + 6;
                    int i38 = i2 + 5;
                    int i39 = i2 + 4;
                    float f47 = fArr[i38] + f23;
                    float f48 = fArr[i37] + f24;
                    float f49 = fArr[i2];
                    float f50 = fArr[i2 + 1];
                    float f51 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        vcVar2 = vcVar3;
                        z2 = 1;
                    } else {
                        vcVar2 = vcVar3;
                        z2 = i7;
                    }
                    if (fArr[i39] != 0.0f) {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = 1;
                    } else {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = i7;
                    }
                    vcVar = vcVar2;
                    vc.a(path, f7, f5, f47, f48, f49, f4, f6, z2, z3);
                    f3 = f7 + fArr[i38];
                    f2 = f5 + fArr[i37];
                    f17 = f3;
                    f18 = f2;
                }
                i8 = i2 + i;
                path2 = path;
                vcVar3 = vcVar;
                c3 = c;
                i6 = i3;
                f23 = f3;
                f24 = f2;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i7] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            c2 = vcVar3.a;
            i6++;
            vcVarArr2 = vcVarArr;
            path2 = path;
            i5 = i7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: NumberFormatException -> 0x00d4, LOOP:3: B:25:0x0084->B:34:0x00b1, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:22:0x0070, B:25:0x0084, B:27:0x008a, B:31:0x0096, B:34:0x00b1, B:38:0x00b7, B:43:0x00c8, B:56:0x00cd), top: B:21:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:22:0x0070, B:25:0x0084, B:27:0x008a, B:31:0x0096, B:34:0x00b1, B:38:0x00b7, B:43:0x00c8, B:56:0x00cd), top: B:21:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:22:0x0070, B:25:0x0084, B:27:0x008a, B:31:0x0096, B:34:0x00b1, B:38:0x00b7, B:43:0x00c8, B:56:0x00cd), top: B:21:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vc[] t(String str) {
        String trim;
        int i;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if (((charAt - 'A') * (charAt - 'Z') > 0 && (charAt - 'a') * (charAt - 'z') > 0) || charAt == 'e' || charAt == 'E') {
                    i4++;
                } else {
                    trim = str.substring(i5, i4).trim();
                    if (trim.isEmpty()) {
                        if (trim.charAt(i3) == 'z' || trim.charAt(i3) == 'Z') {
                            i = i3;
                            fArr = new float[i];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i6 = i2;
                                int i7 = i3;
                                while (i6 < length) {
                                    int i8 = i3;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i10;
                                    for (int i12 = i6; i12 < trim.length(); i12++) {
                                        char charAt2 = trim.charAt(i12);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i12 != i6 && i9 == 0) {
                                                            i9 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                            break;
                                                        }
                                                        i9 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i8 = 1;
                                                            i9 = 0;
                                                            break;
                                                        } else {
                                                            i8 = 1;
                                                            i9 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                            break;
                                                        }
                                                    default:
                                                        i9 = 0;
                                                        break;
                                                }
                                            } else {
                                                i9 = 1;
                                            }
                                            if (i10 == 0) {
                                                if (i6 < i12) {
                                                    fArr2[i7] = Float.parseFloat(trim.substring(i6, i12));
                                                    i7++;
                                                }
                                                i6 = i11 == 0 ? i12 : i12 + 1;
                                                i3 = 0;
                                            }
                                        }
                                        i9 = 0;
                                        i10 = 1;
                                        if (i10 == 0) {
                                        }
                                    }
                                    if (i6 < i12) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    i3 = 0;
                                }
                                fArr = v(fArr2, i7);
                                i = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(a.Z(trim, "error in parsing \"", "\""), e);
                            }
                        }
                        L(arrayList, trim.charAt(i), fArr);
                    } else {
                        i = i3;
                    }
                    i5 = i4;
                    i4++;
                    i3 = i;
                    i2 = 1;
                }
            }
            trim = str.substring(i5, i4).trim();
            if (trim.isEmpty()) {
            }
            i5 = i4;
            i4++;
            i3 = i;
            i2 = 1;
        }
        if (i4 - i5 == i2 && i5 < str.length()) {
            L(arrayList, str.charAt(i5), new float[i3]);
        }
        return (vc[]) arrayList.toArray(new vc[i3]);
    }

    public static vc[] u(vc[] vcVarArr) {
        vc[] vcVarArr2 = new vc[vcVarArr.length];
        for (int i = 0; i < vcVarArr.length; i++) {
            vcVarArr2[i] = new vc(vcVarArr[i]);
        }
        return vcVarArr2;
    }

    public static float[] v(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int min = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static float w(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !E(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int x(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int y(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !E(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int z(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public void j() {
    }

    public void q(bsh bshVar) {
    }

    public void i(int i, CharSequence charSequence) {
    }
}
