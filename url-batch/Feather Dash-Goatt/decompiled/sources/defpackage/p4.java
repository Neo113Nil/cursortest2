package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.feathherdashh.dashgame.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.function.DoubleUnaryOperator;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class p4 {
    public static final c51 i;
    public static final c51 j;
    public static final c51 k;
    public static final c51 l;
    public static final c51 m;
    public static final c51 o;
    public static final me1 p;
    public static final dn[] a = new dn[0];
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final ps e = new ps();
    public static final fv f = new fv("NO_OWNER", 1);
    public static final byte[] g = {112, 114, 111, 0};
    public static final byte[] h = {112, 114, 109, 0};
    public static final di1 n = new di1(0, new long[0], new Object[0]);

    static {
        int i2 = 16;
        int i3 = 3;
        i = new c51(new j61(i2), i3, new k61(1));
        int i4 = 17;
        j = new c51(new j61(i4), i3, new k61(2));
        int i5 = 18;
        k = new c51(new j61(i5), i3, new k61(i3));
        int i6 = 19;
        l = new c51(new j61(i6), i3, new k61(4));
        int i7 = 20;
        m = new c51(new j61(i7), i3, new k61(5));
        int i8 = 7;
        o = new c51(new k61(13), i8, new km1(0));
        new c51(new k61(14), i8, new k61(15));
        new c51(new k61(i2), i8, new k61(i4));
        new c51(new k61(i5), i8, new k61(i6));
        new c51(new k61(i7), i8, new k61(21));
        new c51(new k61(22), i8, new k61(23));
        new c51(new k61(24), i8, new k61(25));
        new c51(new k61(26), i8, new k61(27));
        new c51(new k61(28), i8, new k61(29));
        p = new me1(6);
    }

    public static final sn A(g gVar, hl hlVar) {
        gVar.getClass();
        return new n21(hlVar.R, gVar);
    }

    public static byte[] B(as[] asVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (as asVar : asVarArr) {
            i3 += ((((asVar.g * 2) + 7) & (-8)) / 8) + (asVar.e * 2) + H(asVar.a, asVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + asVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, mo.k)) {
            int length = asVarArr.length;
            while (i2 < length) {
                as asVar2 = asVarArr[i2];
                f0(byteArrayOutputStream, asVar2, H(asVar2.a, asVar2.b, bArr));
                e0(byteArrayOutputStream, asVar2);
                i2++;
            }
        } else {
            for (as asVar3 : asVarArr) {
                f0(byteArrayOutputStream, asVar3, H(asVar3.a, asVar3.b, bArr));
            }
            int length2 = asVarArr.length;
            while (i2 < length2) {
                e0(byteArrayOutputStream, asVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final jm C(pi piVar, pi piVar2) {
        return piVar == piVar2 ? new hm(piVar, piVar, 1) : (uq1.D(piVar.b, 12884901888L) && uq1.D(piVar2.b, 12884901888L)) ? new im((w31) piVar, (w31) piVar2) : new jm(piVar, piVar2, 0);
    }

    public static boolean D(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = D(file2) && z;
        }
        return z;
    }

    public static final c00 E(c00 c00Var) {
        return c00Var instanceof zd1 ? c00Var : c00Var instanceof xs ? c00Var : new xs(c00Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(c00 c00Var, Function2 function2, fn fnVar) {
        q00 q00Var;
        int i2;
        Function2 function22;
        z11 z11Var;
        a e2;
        ws wsVar;
        Object obj;
        fv fvVar = op.l;
        if (fnVar instanceof q00) {
            q00Var = (q00) fnVar;
            int i3 = q00Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q00Var.l = i3 - Integer.MIN_VALUE;
                Object obj2 = q00Var.k;
                Object obj3 = tn.d;
                i2 = q00Var.l;
                if (i2 != 0) {
                    ca0.v(obj2);
                    z11 z11Var2 = new z11();
                    z11Var2.d = fvVar;
                    ws wsVar2 = new ws(function2, z11Var2);
                    try {
                        q00Var.h = (sf1) function2;
                        q00Var.i = z11Var2;
                        q00Var.j = wsVar2;
                        q00Var.l = 1;
                        if (c00Var.f(wsVar2, q00Var) == obj3) {
                            return obj3;
                        }
                        function22 = function2;
                        z11Var = z11Var2;
                    } catch (a e3) {
                        function22 = function2;
                        z11Var = z11Var2;
                        e2 = e3;
                        wsVar = wsVar2;
                        if (e2.d != wsVar) {
                        }
                        obj = z11Var.d;
                        if (obj == fvVar) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wsVar = q00Var.j;
                    z11Var = q00Var.i;
                    function22 = (Function2) q00Var.h;
                    try {
                        ca0.v(obj2);
                    } catch (a e4) {
                        e2 = e4;
                        if (e2.d != wsVar) {
                            throw e2;
                        }
                        obj = z11Var.d;
                        if (obj == fvVar) {
                        }
                    }
                }
                obj = z11Var.d;
                if (obj == fvVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + function22);
            }
        }
        q00Var = new q00(fnVar);
        Object obj22 = q00Var.k;
        Object obj32 = tn.d;
        i2 = q00Var.l;
        if (i2 != 0) {
        }
        obj = z11Var.d;
        if (obj == fvVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(c00 c00Var, fn fnVar) {
        r00 r00Var;
        int i2;
        z11 z11Var;
        a e2;
        x8 x8Var;
        if (fnVar instanceof r00) {
            r00Var = (r00) fnVar;
            int i3 = r00Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r00Var.k = i3 - Integer.MIN_VALUE;
                Object obj = r00Var.j;
                Object obj2 = tn.d;
                i2 = r00Var.k;
                if (i2 != 0) {
                    ca0.v(obj);
                    z11 z11Var2 = new z11();
                    x8 x8Var2 = new x8(2, z11Var2);
                    try {
                        r00Var.h = z11Var2;
                        r00Var.i = x8Var2;
                        r00Var.k = 1;
                        if (c00Var.f(x8Var2, r00Var) == obj2) {
                            return obj2;
                        }
                        z11Var = z11Var2;
                    } catch (a e3) {
                        z11Var = z11Var2;
                        e2 = e3;
                        x8Var = x8Var2;
                        if (e2.d != x8Var) {
                            throw e2;
                        }
                        return z11Var.d;
                    }
                } else {
                    if (i2 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x8Var = r00Var.i;
                    z11Var = r00Var.h;
                    try {
                        ca0.v(obj);
                    } catch (a e4) {
                        e2 = e4;
                        if (e2.d != x8Var) {
                        }
                        return z11Var.d;
                    }
                }
                return z11Var.d;
            }
        }
        r00Var = new r00(fnVar);
        Object obj3 = r00Var.j;
        Object obj22 = tn.d;
        i2 = r00Var.k;
        if (i2 != 0) {
        }
        return z11Var.d;
    }

    public static String H(String str, String str2, byte[] bArr) {
        byte[] bArr2 = mo.l;
        byte[] bArr3 = mo.m;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static g80 I(lu luVar, int i2) {
        return new g80(luVar, q21.d);
    }

    public static final float[] J(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final boolean K(KeyEvent keyEvent) {
        long a2 = xa0.a(keyEvent.getKeyCode());
        return fc0.a(a2, fc0.h) || fc0.a(a2, fc0.k) || fc0.a(a2, fc0.o) || fc0.a(a2, fc0.j);
    }

    public static final boolean L(long j2, int i2, int i3) {
        int j3 = mm.j(j2);
        if (i2 > mm.h(j2) || j3 > i2) {
            return false;
        }
        return i3 <= mm.g(j2) && mm.i(j2) <= i3;
    }

    public static final am0 M(s30 s30Var) {
        return new wc0(s30Var);
    }

    public static final am0 N(hl hlVar, am0 am0Var) {
        hlVar.W(439770924);
        if (!am0Var.a(y3.p)) {
            hlVar.X(1219399079);
            am0Var = (am0) am0Var.b(xl0.a, new n(3, hlVar));
            hlVar.p(false);
        }
        hlVar.p(false);
        return am0Var;
    }

    public static final float[] O(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] P(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static am0 R(am0 am0Var, mu0 mu0Var, ym ymVar, float f2) {
        return am0Var.c(new nu0(mu0Var, ymVar, f2));
    }

    public static int[] S(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) yr1.b0(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static as[] T(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, as[] asVarArr) {
        byte[] bArr3 = mo.n;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, mo.o)) {
                dd0.j("Unsupported meta version");
                return null;
            }
            int b0 = (int) yr1.b0(fileInputStream, 2);
            byte[] a0 = yr1.a0(fileInputStream, (int) yr1.b0(fileInputStream, 4), (int) yr1.b0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                dd0.j("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a0);
            try {
                as[] V = V(byteArrayInputStream, bArr2, b0, asVarArr);
                byteArrayInputStream.close();
                return V;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(mo.i, bArr2)) {
            dd0.j("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            dd0.j("Unsupported meta version");
            return null;
        }
        int b02 = (int) yr1.b0(fileInputStream, 1);
        byte[] a02 = yr1.a0(fileInputStream, (int) yr1.b0(fileInputStream, 4), (int) yr1.b0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            dd0.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(a02);
        try {
            as[] U = U(byteArrayInputStream2, b02, asVarArr);
            byteArrayInputStream2.close();
            return U;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static as[] U(ByteArrayInputStream byteArrayInputStream, int i2, as[] asVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new as[0];
        }
        if (i2 != asVarArr.length) {
            dd0.j("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int b0 = (int) yr1.b0(byteArrayInputStream, 2);
            iArr[i3] = (int) yr1.b0(byteArrayInputStream, 2);
            strArr[i3] = new String(yr1.Z(byteArrayInputStream, b0), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            as asVar = asVarArr[i4];
            if (!asVar.b.equals(strArr[i4])) {
                dd0.j("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            asVar.e = i5;
            asVar.h = S(byteArrayInputStream, i5);
        }
        return asVarArr;
    }

    public static as[] V(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, as[] asVarArr) {
        as asVar;
        if (byteArrayInputStream.available() == 0) {
            return new as[0];
        }
        if (i2 != asVarArr.length) {
            dd0.j("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            yr1.b0(byteArrayInputStream, 2);
            String str = new String(yr1.Z(byteArrayInputStream, (int) yr1.b0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long b0 = yr1.b0(byteArrayInputStream, 4);
            int b02 = (int) yr1.b0(byteArrayInputStream, 2);
            if (asVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < asVarArr.length; i4++) {
                    if (asVarArr[i4].b.equals(substring)) {
                        asVar = asVarArr[i4];
                        break;
                    }
                }
            }
            asVar = null;
            if (asVar == null) {
                dd0.j("Missing profile key: ".concat(str));
                return null;
            }
            asVar.d = b0;
            int[] S = S(byteArrayInputStream, b02);
            if (Arrays.equals(bArr, mo.m)) {
                asVar.e = b02;
                asVar.h = S;
            }
        }
        return asVarArr;
    }

    public static as[] W(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, mo.j)) {
            dd0.j("Unsupported version");
            return null;
        }
        int b0 = (int) yr1.b0(fileInputStream, 1);
        byte[] a0 = yr1.a0(fileInputStream, (int) yr1.b0(fileInputStream, 4), (int) yr1.b0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            dd0.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a0);
        try {
            as[] X = X(byteArrayInputStream, str, b0);
            byteArrayInputStream.close();
            return X;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static as[] X(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new as[0];
        }
        as[] asVarArr = new as[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int b0 = (int) yr1.b0(byteArrayInputStream, 2);
            int b02 = (int) yr1.b0(byteArrayInputStream, 2);
            asVarArr[i4] = new as(str, new String(yr1.Z(byteArrayInputStream, b0), StandardCharsets.UTF_8), yr1.b0(byteArrayInputStream, 4), b02, (int) yr1.b0(byteArrayInputStream, 4), (int) yr1.b0(byteArrayInputStream, 4), new int[b02], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            as asVar = asVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = asVar.f;
            int i7 = asVar.g;
            TreeMap treeMap = asVar.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) yr1.b0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int b03 = (int) yr1.b0(byteArrayInputStream, 2);
                while (b03 > 0) {
                    yr1.b0(byteArrayInputStream, 2);
                    int b04 = (int) yr1.b0(byteArrayInputStream, 1);
                    if (b04 != 6 && b04 != 7) {
                        while (b04 > 0) {
                            yr1.b0(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int b05 = (int) yr1.b0(byteArrayInputStream, 1); b05 > 0; b05--) {
                                yr1.b0(byteArrayInputStream, 2);
                            }
                            b04--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    b03--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                dd0.j("Read too much data during profile line parse");
                return null;
            }
            asVar.h = S(byteArrayInputStream, asVar.e);
            BitSet valueOf = BitSet.valueOf(yr1.Z(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return asVarArr;
    }

    public static final qj0 Y(uq1 uq1Var, Function1 function1, hl hlVar, int i2) {
        hlVar.X(-1408504823);
        gb0.H(uq1Var, hlVar);
        ao0 H = gb0.H(function1, hlVar);
        String str = (String) y90.A(new Object[0], null, p2.e, hlVar, 3080, 6);
        zl zlVar = fi0.a;
        hlVar.X(1418020823);
        wj wjVar = (wj) hlVar.j(fi0.a);
        if (wjVar == null) {
            Context context = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                }
                if (context instanceof wj) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            wjVar = (wj) context;
        }
        hlVar.p(false);
        if (wjVar == null) {
            dd0.j("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        rj rjVar = wjVar.o;
        hlVar.X(-3687241);
        Object L = hlVar.L();
        Object obj = bl.a;
        if (L == obj) {
            L = new j2();
            hlVar.h0(L);
        }
        hlVar.p(false);
        j2 j2Var = (j2) L;
        hlVar.X(-3687241);
        Object L2 = hlVar.L();
        if (L2 == obj) {
            L2 = new qj0(j2Var);
            hlVar.h0(L2);
        }
        hlVar.p(false);
        qj0 qj0Var = (qj0) L2;
        o2 o2Var = new o2(j2Var, rjVar, str, uq1Var, H);
        boolean f2 = hlVar.f(rjVar) | hlVar.f(str) | hlVar.f(uq1Var);
        Object L3 = hlVar.L();
        if (f2 || L3 == obj) {
            L3 = new ns(o2Var);
            hlVar.h0(L3);
        }
        hlVar.p(false);
        return qj0Var;
    }

    public static final void Z(tf tfVar, dn dnVar, boolean z) {
        Object f2;
        Object v = tfVar.v();
        Throwable e2 = tfVar.e(v);
        if (e2 != null) {
            i31 i31Var = k31.d;
            f2 = new j31(e2);
        } else {
            i31 i31Var2 = k31.d;
            f2 = tfVar.f(v);
        }
        if (!z) {
            dnVar.l(f2);
            return;
        }
        dnVar.getClass();
        hs hsVar = (hs) dnVar;
        fn fnVar = hsVar.i;
        Object obj = hsVar.k;
        CoroutineContext g2 = fnVar.g();
        Object c2 = bi1.c(g2, obj);
        zk1 c3 = c2 != bi1.a ? jn.c(fnVar, g2, c2) : null;
        try {
            fnVar.l(f2);
            if (c3 == null || c3.s0()) {
                bi1.a(g2, c2);
            }
        } catch (Throwable th) {
            if (c3 == null || c3.s0()) {
                bi1.a(g2, c2);
            }
            throw th;
        }
    }

    public static final void a(Object obj, Object obj2, Function1 function1, hl hlVar) {
        boolean f2 = hlVar.f(obj) | hlVar.f(obj2);
        Object L = hlVar.L();
        if (f2 || L == bl.a) {
            L = new ns(function1);
            hlVar.h0(L);
        }
    }

    public static oc1 a0(int i2, Object obj) {
        float f2 = (i2 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new oc1(f2, obj);
    }

    public static final void b(Object obj, Function1 function1, hl hlVar) {
        boolean f2 = hlVar.f(obj);
        Object L = hlVar.L();
        if (f2 || L == bl.a) {
            L = new ns(function1);
            hlVar.h0(L);
        }
    }

    public static final g11 b0(nq0 nq0Var, cn cnVar, vc1 vc1Var, Float f2) {
        fg.a.getClass();
        eg egVar = eg.a;
        ue ueVar = ue.d;
        c51 c51Var = new c51(nq0Var, 4, g.d);
        be1 c2 = m90.c(f2);
        CoroutineContext coroutineContext = (CoroutineContext) c51Var.g;
        c00 c00Var = (c00) c51Var.e;
        vn vnVar = vc1Var.equals(ma1.a) ? vn.d : vn.h;
        qk qkVar = new qk(vc1Var, c00Var, c2, f2, null, 2);
        CoroutineContext b2 = jn.b(cnVar, coroutineContext);
        p bg0Var = vnVar == vn.e ? new bg0(b2, qkVar) : new rc1(b2, true);
        bg0Var.r0(vnVar, bg0Var, qkVar);
        return new g11(c2);
    }

    public static c31 c() {
        return new c31(x20.i, new w20(new v20[0]));
    }

    public static byte[] c0(bf bfVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = bfVar.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return x(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j2 = min * (min < 4096 ? 4 : 2);
            min = j2 > 2147483647L ? Integer.MAX_VALUE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (bfVar.read() == -1) {
            return x(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final void d(e40 e40Var, Function0 function0, am0 am0Var, hl hlVar, int i2) {
        e40Var.getClass();
        hlVar.Y(-11506929);
        int i3 = i2 | (hlVar.h(e40Var) ? 4 : 2) | (hlVar.f(am0Var) ? 256 : 128);
        int i4 = 1;
        if (hlVar.O(i3 & 1, (i3 & 131) != 130)) {
            t5 C = op.C(R.drawable.rooster_runner, hlVar);
            Map c2 = ik0.c(new Pair(z50.COMPACT_CAR, op.C(R.drawable.vehicle_compact_car, hlVar)), new Pair(z50.VAN, op.C(R.drawable.vehicle_van, hlVar)), new Pair(z50.TRUCK, op.C(R.drawable.vehicle_truck, hlVar)), new Pair(z50.MOTORCYCLE, op.C(R.drawable.vehicle_motorcycle, hlVar)), new Pair(z50.TRACTOR, op.C(R.drawable.vehicle_tractor, hlVar)), new Pair(z50.BARRIER, op.C(R.drawable.vehicle_compact_car, hlVar)));
            am0 c3 = am0Var.c(xa1.b);
            boolean h2 = hlVar.h(e40Var) | hlVar.h(C) | hlVar.h(c2);
            Object L = hlVar.L();
            if (h2 || L == bl.a) {
                L = new tm(e40Var, C, c2, i4);
                hlVar.h0(L);
            }
            la0.a(c3, (Function1) L, hlVar, 0);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new fk(e40Var, function0, am0Var, i2, 1);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean d0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, as[] asVarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = mo.m;
        byte[] bArr3 = mo.l;
        byte[] bArr4 = mo.i;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = mo.j;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] B = B(asVarArr, bArr5);
                yr1.i0(byteArrayOutputStream, asVarArr.length, 1);
                yr1.i0(byteArrayOutputStream, B.length, 4);
                byte[] E = yr1.E(B);
                yr1.i0(byteArrayOutputStream, E.length, 4);
                byteArrayOutputStream.write(E);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                yr1.i0(byteArrayOutputStream, asVarArr.length, 1);
                for (as asVar : asVarArr) {
                    int size = asVar.i.size() * 4;
                    String H = H(asVar.a, asVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    yr1.j0(byteArrayOutputStream, H.getBytes(charset).length);
                    yr1.j0(byteArrayOutputStream, asVar.h.length);
                    yr1.i0(byteArrayOutputStream, size, 4);
                    yr1.i0(byteArrayOutputStream, asVar.c, 4);
                    byteArrayOutputStream.write(H.getBytes(charset));
                    Iterator it = asVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        yr1.j0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        yr1.j0(byteArrayOutputStream, 0);
                    }
                    for (int i4 : asVar.h) {
                        yr1.j0(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = mo.k;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] B2 = B(asVarArr, bArr6);
                yr1.i0(byteArrayOutputStream, asVarArr.length, 1);
                yr1.i0(byteArrayOutputStream, B2.length, 4);
                byte[] E2 = yr1.E(B2);
                yr1.i0(byteArrayOutputStream, E2.length, 4);
                byteArrayOutputStream.write(E2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            yr1.j0(byteArrayOutputStream, asVarArr.length);
            for (as asVar2 : asVarArr) {
                String str = asVar2.a;
                TreeMap treeMap = asVar2.i;
                String H2 = H(str, asVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                yr1.j0(byteArrayOutputStream, H2.getBytes(charset2).length);
                yr1.j0(byteArrayOutputStream, treeMap.size());
                yr1.j0(byteArrayOutputStream, asVar2.h.length);
                yr1.i0(byteArrayOutputStream, asVar2.c, 4);
                byteArrayOutputStream.write(H2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    yr1.j0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : asVar2.h) {
                    yr1.j0(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            yr1.j0(byteArrayOutputStream2, asVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (as asVar3 : asVarArr) {
                yr1.i0(byteArrayOutputStream2, asVar3.c, 4);
                yr1.i0(byteArrayOutputStream2, asVar3.d, 4);
                yr1.i0(byteArrayOutputStream2, asVar3.g, 4);
                String H3 = H(asVar3.a, asVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = H3.getBytes(charset3).length;
                yr1.j0(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(H3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            oq1 oq1Var = new oq1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(oq1Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < asVarArr.length) {
                try {
                    as asVar4 = asVarArr[i8];
                    yr1.j0(byteArrayOutputStream3, i8);
                    yr1.j0(byteArrayOutputStream3, asVar4.e);
                    i9 = i9 + 4 + (asVar4.e * i6);
                    int[] iArr = asVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        yr1.j0(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            oq1 oq1Var2 = new oq1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(oq1Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < asVarArr.length; i14++) {
                try {
                    as asVar5 = asVarArr[i14];
                    Iterator it3 = asVar5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        g0(byteArrayOutputStream4, i15, asVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            h0(byteArrayOutputStream4, asVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            yr1.j0(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            yr1.i0(byteArrayOutputStream3, length4, 4);
                            yr1.j0(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i16 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            oq1 oq1Var3 = new oq1(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(oq1Var3);
            long size2 = 12 + (arrayList.size() * 16);
            yr1.i0(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                oq1 oq1Var4 = (oq1) arrayList.get(i17);
                int i18 = oq1Var4.a;
                byte[] bArr7 = oq1Var4.b;
                if (i18 != 1) {
                    i2 = i12;
                    if (i18 == i2) {
                        j2 = 1;
                    } else if (i18 == 3) {
                        j2 = 2;
                    } else if (i18 == 4) {
                        j2 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                yr1.i0(byteArrayOutputStream, j2, 4);
                yr1.i0(byteArrayOutputStream, size2, 4);
                if (oq1Var4.c) {
                    long length5 = bArr7.length;
                    byte[] E3 = yr1.E(bArr7);
                    arrayList2.add(E3);
                    yr1.i0(byteArrayOutputStream, E3.length, 4);
                    yr1.i0(byteArrayOutputStream, length5, 4);
                    length = E3.length;
                } else {
                    arrayList2.add(bArr7);
                    yr1.i0(byteArrayOutputStream, bArr7.length, 4);
                    yr1.i0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                i12 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final void e(e40 e40Var, Function0 function0, Function0 function02, hl hlVar, int i2) {
        hl hlVar2 = hlVar;
        hlVar2.Y(-1675631835);
        int i3 = (hlVar2.h(e40Var) ? 4 : 2) | i2 | (hlVar2.h(function0) ? 32 : 16) | (hlVar2.h(function02) ? 256 : 128);
        if (hlVar2.O(i3 & 1, (i3 & 147) != 146)) {
            vy vyVar = xa1.b;
            vk0 d2 = vd.d(j50.g, false);
            int hashCode = Long.hashCode(hlVar2.T);
            kw0 l2 = hlVar2.l();
            am0 N = N(hlVar2, vyVar);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            e7 e7Var = xk.e;
            ka0.C(hlVar2, d2, e7Var);
            e7 e7Var2 = xk.d;
            ka0.C(hlVar2, l2, e7Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            e7 e7Var3 = xk.f;
            ka0.u(hlVar2, valueOf, e7Var3);
            y3 y3Var = xk.g;
            ka0.A(hlVar2, y3Var);
            e7 e7Var4 = xk.c;
            ka0.C(hlVar2, N, e7Var4);
            mo.c(t80.F(R.drawable.gameplay_background_horizontal_road, hlVar2, 0), null, vyVar, null, xm.a, 0.0f, hlVar, 25016);
            hlVar2 = hlVar;
            am0 S = uq1.S(vyVar);
            yi a2 = wi.a(yr1.c, j50.s, hlVar2, 0);
            int hashCode2 = Long.hashCode(hlVar2.T);
            kw0 l3 = hlVar2.l();
            am0 N2 = N(hlVar2, S);
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            ka0.C(hlVar2, a2, e7Var);
            ka0.C(hlVar2, l3, e7Var2);
            ka0.u(hlVar2, Integer.valueOf(hashCode2), e7Var3);
            ka0.A(hlVar2, y3Var);
            ka0.C(hlVar2, N2, e7Var4);
            int i4 = i3 & 14;
            f(e40Var, function0, hlVar2, i3 & 126);
            int i5 = (i3 >> 3) & 112;
            d(e40Var, function02, xa1.a(new yd0(1.0f, true), 1.0f), hlVar2, i4 | i5);
            am0 S2 = yr1.S(xa1.a(xl0.a, 1.0f), 22.0f, 14.0f);
            r41 a3 = q41.a(yr1.b, j50.q, hlVar2, 48);
            int hashCode3 = Long.hashCode(hlVar2.T);
            kw0 l4 = hlVar2.l();
            am0 N3 = N(hlVar2, S2);
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            ka0.C(hlVar2, a3, e7Var);
            ka0.C(hlVar2, l4, e7Var2);
            ka0.u(hlVar2, Integer.valueOf(hashCode3), e7Var3);
            ka0.A(hlVar2, y3Var);
            ka0.C(hlVar2, N3, e7Var4);
            yr1.t(R.drawable.button_dash, function02, xa1.b(new yd0(1.0f, true), 78.0f), false, "Dash", hlVar2, i5 | 24576, 8);
            hlVar2.p(true);
            hlVar2.p(true);
            hlVar2.p(true);
        } else {
            hlVar2.R();
        }
        i11 r = hlVar2.r();
        if (r != null) {
            r.d = new h40(e40Var, function0, function02, i2);
        }
    }

    public static void e0(ByteArrayOutputStream byteArrayOutputStream, as asVar) {
        h0(byteArrayOutputStream, asVar);
        int i2 = asVar.g;
        int[] iArr = asVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            yr1.j0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : asVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void f(e40 e40Var, Function0 function0, hl hlVar, int i2) {
        e40Var.getClass();
        function0.getClass();
        hlVar.Y(1185550167);
        int i3 = (hlVar.h(e40Var) ? 4 : 2) | i2 | (hlVar.h(function0) ? 32 : 16);
        int i4 = 1;
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            xl0 xl0Var = xl0.a;
            am0 S = yr1.S(xa1.a(xl0Var, 1.0f), 16.0f, 8.0f);
            r41 a2 = q41.a(yr1.f, j50.q, hlVar, 54);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = N(hlVar, S);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, a2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            yr1.n(e40Var.d, xa1.b(xa1.e(xl0Var, 120.0f), 48.0f), hlVar, 48);
            yr1.u(R.drawable.icon_pause, function0, xa1.c(xl0Var, 48.0f), "Pause", hlVar, (i3 & 112) | 3456);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new il(i2, i4, e40Var, function0);
        }
    }

    public static void f0(ByteArrayOutputStream byteArrayOutputStream, as asVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        yr1.j0(byteArrayOutputStream, str.getBytes(charset).length);
        yr1.j0(byteArrayOutputStream, asVar.e);
        yr1.i0(byteArrayOutputStream, asVar.f, 4);
        yr1.i0(byteArrayOutputStream, asVar.c, 4);
        yr1.i0(byteArrayOutputStream, asVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final void g(w8 w8Var, z8 z8Var, hl hlVar, int i2) {
        int i3;
        i11 r;
        g40 g40Var;
        w8Var.getClass();
        hlVar.Y(1302078423);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(w8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(z8Var) ? 32 : 16;
        }
        int i4 = 1;
        int i5 = 0;
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            e40 e40Var = w8Var.i;
            if (e40Var == null) {
                r = hlVar.r();
                if (r != null) {
                    g40Var = new g40(w8Var, z8Var, i2, i5);
                    r.d = g40Var;
                }
                return;
            }
            ds dsVar = e40Var.a;
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            j41 j41Var = bl.a;
            if (h2 || L == j41Var) {
                L = new d(z8Var, null, 11);
                hlVar.h0(L);
            }
            i(hlVar, dsVar, (Function2) L);
            boolean h3 = hlVar.h(z8Var);
            Object L2 = hlVar.L();
            if (h3 || L2 == j41Var) {
                v3 v3Var = new v3(0, z8Var, z8.class, "pauseGame", "pauseGame()V", 0, 3);
                hlVar.h0(v3Var);
                L2 = v3Var;
            }
            Function0 function0 = (Function0) ((b40) L2);
            boolean h4 = hlVar.h(z8Var);
            Object L3 = hlVar.L();
            if (h4 || L3 == j41Var) {
                v3 v3Var2 = new v3(0, z8Var, z8.class, "dash", "dash()V", 0, 4);
                hlVar.h0(v3Var2);
                L3 = v3Var2;
            }
            e(e40Var, function0, (Function0) ((b40) L3), hlVar, 0);
        } else {
            hlVar.R();
        }
        r = hlVar.r();
        if (r != null) {
            g40Var = new g40(w8Var, z8Var, i2, i4);
            r.d = g40Var;
        }
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, int i2, as asVar) {
        int i3 = asVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : asVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
    
        if (r1 != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t5 h(int i2, int i3, int i4) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        ColorSpace rgb2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        w31 w31Var = si.e;
        op.P(i4);
        Bitmap.Config P = op.P(i4);
        if (Intrinsics.a(w31Var, w31Var)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.a(w31Var, si.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.a(w31Var, si.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.a(w31Var, si.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.a(w31Var, si.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.a(w31Var, si.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.a(w31Var, si.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.a(w31Var, si.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.a(w31Var, si.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.a(w31Var, si.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.a(w31Var, si.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.a(w31Var, si.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.a(w31Var, si.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.a(w31Var, si.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (Intrinsics.a(w31Var, si.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (Intrinsics.a(w31Var, si.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                if (Intrinsics.a(w31Var, si.v)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    rgb2 = ColorSpace.get(named2);
                } else if (Intrinsics.a(w31Var, si.w)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    rgb2 = ColorSpace.get(named);
                } else {
                    rgb2 = null;
                }
            }
            if (w31Var != null) {
                String str = w31Var.a;
                float[] a2 = w31Var.d.a();
                zi1 zi1Var = w31Var.g;
                ColorSpace.Rgb.TransferParameters transferParameters = zi1Var != null ? new ColorSpace.Rgb.TransferParameters(zi1Var.b, zi1Var.c, zi1Var.d, zi1Var.e, zi1Var.f, zi1Var.g, zi1Var.a) : null;
                if (transferParameters != null) {
                    rgb2 = new ColorSpace.Rgb(str, w31Var.h, a2, transferParameters);
                    rgb = rgb2;
                    return new t5(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, P, true, rgb));
                }
                float[] fArr = w31Var.h;
                final v31 v31Var = w31Var.l;
                final int i5 = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: qi
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d2) {
                        int i6 = i5;
                        Function1 function1 = v31Var;
                        switch (i6) {
                        }
                        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
                    }
                };
                final v31 v31Var2 = w31Var.o;
                final int i6 = 1;
                rgb = new ColorSpace.Rgb(str, fArr, a2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: qi
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d2) {
                        int i62 = i6;
                        Function1 function1 = v31Var2;
                        switch (i62) {
                        }
                        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
                    }
                }, w31Var.e, w31Var.f);
                return new t5(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, P, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        rgb = colorSpace;
        return new t5(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, P, true, rgb));
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, as asVar) {
        int i2 = 0;
        for (Map.Entry entry : asVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                yr1.j0(byteArrayOutputStream, intValue - i2);
                yr1.j0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final void i(hl hlVar, Object obj, Function2 function2) {
        CoroutineContext coroutineContext = hlVar.R;
        boolean f2 = hlVar.f(obj);
        Object L = hlVar.L();
        if (f2 || L == bl.a) {
            L = new qc0(coroutineContext, function2);
            hlVar.h0(L);
        }
    }

    public static final void j(Object obj, Object obj2, Function2 function2, hl hlVar) {
        CoroutineContext coroutineContext = hlVar.R;
        boolean f2 = hlVar.f(obj) | hlVar.f(obj2);
        Object L = hlVar.L();
        if (f2 || L == bl.a) {
            L = new qc0(coroutineContext, function2);
            hlVar.h0(L);
        }
    }

    public static final void k(Function0 function0, hl hlVar) {
        bt0 bt0Var = hlVar.M.b.a;
        bt0Var.D(rs0.c);
        y90.D(bt0Var, 0, function0);
    }

    public static final boolean l(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static pi m(pi piVar) {
        oo1 oo1Var = uq1.f;
        if (uq1.D(piVar.b, 12884901888L)) {
            w31 w31Var = (w31) piVar;
            oo1 oo1Var2 = w31Var.d;
            if (!y(oo1Var2, oo1Var)) {
                return new w31(w31Var.a, w31Var.h, oo1Var, O(u(s2.c.b, oo1Var2.a(), oo1Var.a()), w31Var.i), w31Var.k, w31Var.n, w31Var.e, w31Var.f, w31Var.g, -1);
            }
        }
        return piVar;
    }

    public static am0 n(am0 am0Var, float f2) {
        return am0Var.c(new z9(f2));
    }

    public static final int o(int[] iArr, int i2, int i3) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int p(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static c00 q(c00 c00Var, int i2) {
        ue ueVar = ue.d;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(qy0.i(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i2 == -1) {
            ueVar = ue.e;
            i2 = 0;
        }
        return c00Var instanceof d40 ? ((d40) c00Var).i(g.d, i2, ueVar) : new ig(c00Var, g.d, i2, ueVar);
    }

    public static final void s(long j2, et0 et0Var) {
        if (et0Var == et0.d) {
            if (mm.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            r80.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (mm.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            r80.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static int t(Context context, String str) {
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new mq0(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static final float[] u(float[] fArr, float[] fArr2, float[] fArr3) {
        P(fArr, fArr2);
        P(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] J = J(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return O(J, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static am0 v(am0 am0Var, gn0 gn0Var, boolean z, Function0 function0, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return am0Var.c(new ch(gn0Var, false, z, function0));
    }

    public static am0 w(am0 am0Var, Function0 function0) {
        return am0Var.c(new ch(null, true, true, function0));
    }

    public static byte[] x(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final boolean y(oo1 oo1Var, oo1 oo1Var2) {
        if (oo1Var == oo1Var2) {
            return true;
        }
        return Math.abs(oo1Var.a - oo1Var2.a) < 0.001f && Math.abs(oo1Var.b - oo1Var2.b) < 0.001f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h20 z(Context context) {
        ProviderInfo providerInfo;
        f20 f20Var;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        ka0.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                f20Var = new f20(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (f20Var != null) {
                return null;
            }
            return new h20(new g20(context, f20Var));
        }
        f20Var = null;
        if (f20Var != null) {
        }
    }

    public abstract void Q(int i2);

    public abstract void r(int i2);
}
