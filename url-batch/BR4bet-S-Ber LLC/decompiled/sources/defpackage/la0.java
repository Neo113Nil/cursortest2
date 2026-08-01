package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class la0 {
    public static final xj j;
    public static final xj k;
    public static final float[][] f = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] g = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] h = {95.047f, 100.0f, 108.883f};
    public static final float[][] i = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final int[] l = {R.attr.theme, com.moontiko.really.admiralcasino.R.attr.theme};
    public static final int[] m = {com.moontiko.really.admiralcasino.R.attr.materialThemeOverlay};
    public static final byte[] n = {112, 114, 111, 0};
    public static final byte[] o = {112, 114, 109, 0};
    public static final int[] p = {com.moontiko.really.admiralcasino.R.attr.colorPrimary};
    public static final int[] q = {com.moontiko.really.admiralcasino.R.attr.colorPrimaryVariant};

    static {
        int i2 = 1;
        j = new xj("UNDEFINED", i2);
        k = new xj("REUSABLE_CLAIMED", i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class B(gb gbVar) {
        gbVar.getClass();
        Class a = gbVar.a();
        if (a.isPrimitive()) {
            String name = a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a;
    }

    public static final int H(z6 z6Var, Object obj, int i2) {
        int i3 = z6Var.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int f2 = xf.f(i3, i2, z6Var.f);
            if (f2 < 0 || kr.b(obj, z6Var.g[f2])) {
                return f2;
            }
            int i4 = f2 + 1;
            while (i4 < i3 && z6Var.f[i4] == i2) {
                if (kr.b(obj, z6Var.g[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = f2 - 1; i5 >= 0 && z6Var.f[i5] == i2; i5--) {
                if (kr.b(obj, z6Var.g[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int I(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = h;
        return gc.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean K(int i2, Object obj) {
        if (obj instanceof po) {
            if ((obj instanceof qo ? ((qo) obj).b() : obj instanceof rn ? 0 : obj instanceof co ? 1 : obj instanceof ho ? 2 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static float N(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray O(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        j(context, attributeSet, i2, i3);
        m(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m9 R(kp kpVar) {
        int i2;
        int i3;
        int i4;
        String str;
        kp kpVar2 = kpVar;
        int size = kpVar2.size();
        int i5 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = -1;
        int i9 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i5 < size) {
            String b = kpVar2.b(i5);
            String d = kpVar2.d(i5);
            if (n70.R(b, "Cache-Control")) {
                if (str2 == null) {
                    str2 = d;
                    i2 = 0;
                    while (i2 < d.length()) {
                        int length = d.length();
                        int i10 = i2;
                        while (true) {
                            if (i10 >= length) {
                                i3 = size;
                                i10 = d.length();
                                break;
                            }
                            i3 = size;
                            if (f70.V("=,;", d.charAt(i10))) {
                                break;
                            }
                            i10++;
                            size = i3;
                        }
                        String obj = f70.g0(d.substring(i2, i10)).toString();
                        if (i10 == d.length() || d.charAt(i10) == ',' || d.charAt(i10) == ';') {
                            i4 = i10 + 1;
                            str = null;
                        } else {
                            int i11 = i10 + 1;
                            byte[] bArr = cb0.a;
                            int length2 = d.length();
                            while (true) {
                                if (i11 < length2) {
                                    char charAt = d.charAt(i11);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = d.length();
                                    break;
                                }
                            }
                            if (i11 >= d.length() || d.charAt(i11) != '\"') {
                                int length3 = d.length();
                                int i12 = i11;
                                while (true) {
                                    if (i12 >= length3) {
                                        i12 = d.length();
                                        break;
                                    }
                                    int i13 = length3;
                                    if (f70.V(",;", d.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    length3 = i13;
                                }
                                int i14 = i12;
                                str = f70.g0(d.substring(i11, i12)).toString();
                                i4 = i14;
                            } else {
                                int i15 = i11 + 1;
                                int Z = f70.Z(d, '\"', i15, 4);
                                str = d.substring(i15, Z);
                                i4 = Z + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i6 = cb0.v(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = cb0.v(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i8 = cb0.v(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = cb0.v(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z9 = true;
                            }
                            i2 = i4;
                        }
                        size = i3;
                    }
                    i5++;
                    kpVar2 = kpVar;
                    size = size;
                }
            } else if (!n70.R(b, "Pragma")) {
                i5++;
                kpVar2 = kpVar;
                size = size;
            }
            z = false;
            i2 = 0;
            while (i2 < d.length()) {
            }
            i5++;
            kpVar2 = kpVar;
            size = size;
        }
        return new m9(z2, z3, i6, i7, z4, z5, z6, i8, i9, z7, z8, z9, !z ? null : str2);
    }

    public static PorterDuff.Mode S(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static int[] T(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) mz.F(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static jh[] U(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, jh[] jhVarArr) {
        byte[] bArr3 = b9.k;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, b9.l)) {
                g9.s("Unsupported meta version");
                return null;
            }
            int F = (int) mz.F(fileInputStream, 2);
            byte[] E = mz.E(fileInputStream, (int) mz.F(fileInputStream, 4), (int) mz.F(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                g9.s("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(E);
            try {
                jh[] W = W(byteArrayInputStream, bArr2, F, jhVarArr);
                byteArrayInputStream.close();
                return W;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(b9.f, bArr2)) {
            g9.s("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            g9.s("Unsupported meta version");
            return null;
        }
        int F2 = (int) mz.F(fileInputStream, 1);
        byte[] E2 = mz.E(fileInputStream, (int) mz.F(fileInputStream, 4), (int) mz.F(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            g9.s("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(E2);
        try {
            jh[] V = V(byteArrayInputStream2, F2, jhVarArr);
            byteArrayInputStream2.close();
            return V;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static jh[] V(ByteArrayInputStream byteArrayInputStream, int i2, jh[] jhVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new jh[0];
        }
        if (i2 != jhVarArr.length) {
            g9.s("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int F = (int) mz.F(byteArrayInputStream, 2);
            iArr[i3] = (int) mz.F(byteArrayInputStream, 2);
            strArr[i3] = new String(mz.D(byteArrayInputStream, F), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            jh jhVar = jhVarArr[i4];
            if (!jhVar.b.equals(strArr[i4])) {
                g9.s("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            jhVar.e = i5;
            jhVar.h = T(byteArrayInputStream, i5);
        }
        return jhVarArr;
    }

    public static jh[] W(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, jh[] jhVarArr) {
        jh jhVar;
        if (byteArrayInputStream.available() == 0) {
            return new jh[0];
        }
        if (i2 != jhVarArr.length) {
            g9.s("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            mz.F(byteArrayInputStream, 2);
            String str = new String(mz.D(byteArrayInputStream, (int) mz.F(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long F = mz.F(byteArrayInputStream, 4);
            int F2 = (int) mz.F(byteArrayInputStream, 2);
            if (jhVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < jhVarArr.length; i4++) {
                    if (jhVarArr[i4].b.equals(substring)) {
                        jhVar = jhVarArr[i4];
                        break;
                    }
                }
            }
            jhVar = null;
            if (jhVar == null) {
                g9.s("Missing profile key: ".concat(str));
                return null;
            }
            jhVar.d = F;
            int[] T = T(byteArrayInputStream, F2);
            if (Arrays.equals(bArr, b9.j)) {
                jhVar.e = F2;
                jhVar.h = T;
            }
        }
        return jhVarArr;
    }

    public static jh[] X(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, b9.g)) {
            g9.s("Unsupported version");
            return null;
        }
        int F = (int) mz.F(fileInputStream, 1);
        byte[] E = mz.E(fileInputStream, (int) mz.F(fileInputStream, 4), (int) mz.F(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            g9.s("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(E);
        try {
            jh[] Y = Y(byteArrayInputStream, str, F);
            byteArrayInputStream.close();
            return Y;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static jh[] Y(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new jh[0];
        }
        jh[] jhVarArr = new jh[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int F = (int) mz.F(byteArrayInputStream, 2);
            int F2 = (int) mz.F(byteArrayInputStream, 2);
            jhVarArr[i4] = new jh(str, new String(mz.D(byteArrayInputStream, F), StandardCharsets.UTF_8), mz.F(byteArrayInputStream, 4), F2, (int) mz.F(byteArrayInputStream, 4), (int) mz.F(byteArrayInputStream, 4), new int[F2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            jh jhVar = jhVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = jhVar.f;
            int i7 = jhVar.g;
            TreeMap treeMap = jhVar.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) mz.F(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int F3 = (int) mz.F(byteArrayInputStream, 2);
                while (F3 > 0) {
                    mz.F(byteArrayInputStream, 2);
                    int F4 = (int) mz.F(byteArrayInputStream, 1);
                    if (F4 != 6 && F4 != 7) {
                        while (F4 > 0) {
                            mz.F(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int F5 = (int) mz.F(byteArrayInputStream, 1); F5 > 0; F5--) {
                                mz.F(byteArrayInputStream, 2);
                            }
                            F4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    F3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                g9.s("Read too much data during profile line parse");
                return null;
            }
            jhVar.h = T(byteArrayInputStream, jhVar.e);
            BitSet valueOf = BitSet.valueOf(mz.D(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
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
        return jhVarArr;
    }

    public static final void Z(le leVar) {
        ej ejVar = ej.q;
        if (!(leVar instanceof yh)) {
            leVar.e(ejVar);
            return;
        }
        yh yhVar = (yh) leVar;
        bf bfVar = yhVar.i;
        x70 x70Var = yhVar.j;
        ye yeVar = x70Var.g;
        yeVar.getClass();
        if (bfVar.r(yeVar)) {
            yhVar.k = ejVar;
            yhVar.h = 1;
            yeVar.getClass();
            bfVar.q(yeVar, yhVar);
            return;
        }
        ThreadLocal threadLocal = a90.a;
        sk skVar = (sk) threadLocal.get();
        if (skVar == null) {
            skVar = new n8(Thread.currentThread());
            threadLocal.set(skVar);
        }
        long j2 = skVar.h;
        if (j2 >= 4294967296L) {
            yhVar.k = ejVar;
            yhVar.h = 1;
            q6 q6Var = skVar.j;
            if (q6Var == null) {
                q6Var = new q6();
                skVar.j = q6Var;
            }
            q6Var.addLast(yhVar);
            return;
        }
        skVar.h = 4294967296L + j2;
        try {
            yeVar.getClass();
            ur urVar = (ur) yeVar.h(ej.l);
            if (urVar == null || urVar.s()) {
                Object obj = yhVar.l;
                yeVar.getClass();
                Object V = b9.V(yeVar, obj);
                if (V != b9.m && yeVar.h(va0.f) != null) {
                    jf jfVar = x70Var;
                    do {
                        jfVar = jfVar.c();
                    } while (jfVar != null);
                }
                try {
                    x70Var.e(ejVar);
                } finally {
                    b9.O(yeVar, V);
                }
            } else {
                yhVar.e(new q30(urVar.m()));
            }
            while (skVar.y()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final int a0(w40 w40Var, int i2) {
        int i3;
        int[] iArr = w40Var.k;
        int i4 = i2 + 1;
        int length = w40Var.j.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static void b0(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final void c(h80 h80Var, k80 k80Var, String str) {
        l80.i.fine(k80Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + h80Var.a);
    }

    public static void d0(Serializable serializable, String str) {
        ClassCastException classCastException = new ClassCastException((serializable == null ? "null" : serializable.getClass().getName()) + " cannot be cast to " + str);
        kr.Z(classCastException, la0.class.getName());
        throw classCastException;
    }

    public static final String e0(String str) {
        str.getClass();
        int i2 = -1;
        int i3 = 0;
        if (!f70.W(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = lowerCase.charAt(i4);
                    if (kr.k(charAt, 31) <= 0 || kr.k(charAt, 127) >= 0 || f70.Z(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress r = (n70.U(str, "[", false) && str.endsWith("]")) ? r(str, 1, str.length() - 1) : r(str, 0, str.length());
        if (r == null) {
            return null;
        }
        byte[] address = r.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return r.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        h9 h9Var = new h9();
        while (i3 < address.length) {
            if (i3 == i2) {
                h9Var.w(58);
                i3 += i6;
                if (i3 == 16) {
                    h9Var.w(58);
                }
            } else {
                if (i3 > 0) {
                    h9Var.w(58);
                }
                byte b = address[i3];
                byte[] bArr = cb0.a;
                h9Var.x(((b & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return h9Var.r(h9Var.g, la.a);
    }

    public static void f(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = lr.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = a00.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean f0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, jh[] jhVarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = b9.j;
        byte[] bArr3 = b9.i;
        byte[] bArr4 = b9.f;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = b9.g;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] q2 = q(jhVarArr, bArr5);
                mz.T(byteArrayOutputStream, jhVarArr.length, 1);
                mz.T(byteArrayOutputStream, q2.length, 4);
                byte[] h2 = mz.h(q2);
                mz.T(byteArrayOutputStream, h2.length, 4);
                byteArrayOutputStream.write(h2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                mz.T(byteArrayOutputStream, jhVarArr.length, 1);
                for (jh jhVar : jhVarArr) {
                    int size = jhVar.i.size() * 4;
                    String v = v(jhVar.a, jhVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    mz.U(byteArrayOutputStream, v.getBytes(charset).length);
                    mz.U(byteArrayOutputStream, jhVar.h.length);
                    mz.T(byteArrayOutputStream, size, 4);
                    mz.T(byteArrayOutputStream, jhVar.c, 4);
                    byteArrayOutputStream.write(v.getBytes(charset));
                    Iterator it = jhVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        mz.U(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        mz.U(byteArrayOutputStream, 0);
                    }
                    for (int i4 : jhVar.h) {
                        mz.U(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = b9.h;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] q3 = q(jhVarArr, bArr6);
                mz.T(byteArrayOutputStream, jhVarArr.length, 1);
                mz.T(byteArrayOutputStream, q3.length, 4);
                byte[] h3 = mz.h(q3);
                mz.T(byteArrayOutputStream, h3.length, 4);
                byteArrayOutputStream.write(h3);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            mz.U(byteArrayOutputStream, jhVarArr.length);
            for (jh jhVar2 : jhVarArr) {
                String str = jhVar2.a;
                TreeMap treeMap = jhVar2.i;
                String v2 = v(str, jhVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                mz.U(byteArrayOutputStream, v2.getBytes(charset2).length);
                mz.U(byteArrayOutputStream, treeMap.size());
                mz.U(byteArrayOutputStream, jhVar2.h.length);
                mz.T(byteArrayOutputStream, jhVar2.c, 4);
                byteArrayOutputStream.write(v2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    mz.U(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : jhVar2.h) {
                    mz.U(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            mz.U(byteArrayOutputStream2, jhVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (jh jhVar3 : jhVarArr) {
                mz.T(byteArrayOutputStream2, jhVar3.c, 4);
                mz.T(byteArrayOutputStream2, jhVar3.d, 4);
                mz.T(byteArrayOutputStream2, jhVar3.g, 4);
                String v3 = v(jhVar3.a, jhVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = v3.getBytes(charset3).length;
                mz.U(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(v3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            ef0 ef0Var = new ef0(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(ef0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < jhVarArr.length) {
                try {
                    jh jhVar4 = jhVarArr[i8];
                    mz.U(byteArrayOutputStream3, i8);
                    mz.U(byteArrayOutputStream3, jhVar4.e);
                    i9 = i9 + 4 + (jhVar4.e * i6);
                    int[] iArr = jhVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        mz.U(byteArrayOutputStream3, i11 - i10);
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
            ef0 ef0Var2 = new ef0(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(ef0Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < jhVarArr.length; i14++) {
                try {
                    jh jhVar5 = jhVarArr[i14];
                    Iterator it3 = jhVar5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m0(byteArrayOutputStream4, i15, jhVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            n0(byteArrayOutputStream4, jhVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            mz.U(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            mz.T(byteArrayOutputStream3, length4, 4);
                            mz.U(byteArrayOutputStream3, i15);
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
            ef0 ef0Var3 = new ef0(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(ef0Var3);
            long size2 = 12 + (arrayList.size() * 16);
            mz.T(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                ef0 ef0Var4 = (ef0) arrayList.get(i17);
                int i18 = ef0Var4.a;
                byte[] bArr7 = ef0Var4.b;
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
                mz.T(byteArrayOutputStream, j2, 4);
                mz.T(byteArrayOutputStream, size2, 4);
                if (ef0Var4.c) {
                    long length5 = bArr7.length;
                    byte[] h4 = mz.h(bArr7);
                    arrayList2.add(h4);
                    mz.T(byteArrayOutputStream, h4.length, 4);
                    mz.T(byteArrayOutputStream, length5, 4);
                    length = h4.length;
                } else {
                    arrayList2.add(bArr7);
                    mz.T(byteArrayOutputStream, bArr7.length, 4);
                    mz.T(byteArrayOutputStream, 0L, 4);
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

    public static void g(x70 x70Var) {
        if (K(2, x70Var)) {
            return;
        }
        d0(x70Var, "kotlin.jvm.functions.Function2");
        throw null;
    }

    public static Context i0(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof ke) && ((ke) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        ke keVar = new ke(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = obtainStyledAttributes2.getResourceId(i5, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                keVar.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, l);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            keVar.getTheme().applyStyle(resourceId, true);
        }
        return keVar;
    }

    public static void j(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.N, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(com.moontiko.really.admiralcasino.R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                n(context, q, "Theme.MaterialComponents");
            }
        }
        n(context, p, "Theme.AppCompat");
    }

    public static Context j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        return i0(i2, i3, context, attributeSet, new int[0]);
    }

    public static void k(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new ir(2, 36, 1));
        }
    }

    public static void k0(ByteArrayOutputStream byteArrayOutputStream, jh jhVar) {
        n0(byteArrayOutputStream, jhVar);
        int i2 = jhVar.g;
        int[] iArr = jhVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            mz.U(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : jhVar.i.entrySet()) {
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

    public static int l(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, n6.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, jh jhVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        mz.U(byteArrayOutputStream, str.getBytes(charset).length);
        mz.U(byteArrayOutputStream, jhVar.e);
        mz.T(byteArrayOutputStream, jhVar.f, 4);
        mz.T(byteArrayOutputStream, jhVar.c, 4);
        mz.T(byteArrayOutputStream, jhVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.N, i2, i3);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (z) {
                return;
            }
            g9.i("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, int i2, jh jhVar) {
        int i3 = jhVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : jhVar.i.entrySet()) {
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

    public static void n(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                g9.i(f60.f("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static void n0(ByteArrayOutputStream byteArrayOutputStream, jh jhVar) {
        int i2 = 0;
        for (Map.Entry entry : jhVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                mz.U(byteArrayOutputStream, intValue - i2);
                mz.U(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static int o(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static float o0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yl p(Context context) {
        ProviderInfo providerInfo;
        wl wlVar;
        ApplicationInfo applicationInfo;
        int i2 = 18;
        ej agVar = Build.VERSION.SDK_INT >= 28 ? new ag(i2) : new ej(i2);
        PackageManager packageManager = context.getPackageManager();
        b9.f(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] j2 = agVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j2) {
                    arrayList.add(signature.toByteArray());
                }
                wlVar = new wl(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (wlVar != null) {
                return null;
            }
            return new yl(new xl(context, wlVar));
        }
        wlVar = null;
        if (wlVar != null) {
        }
    }

    public static byte[] q(jh[] jhVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (jh jhVar : jhVarArr) {
            i3 += ((((jhVar.g * 2) + 7) & (-8)) / 8) + (jhVar.e * 2) + v(jhVar.a, jhVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + jhVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, b9.h)) {
            int length = jhVarArr.length;
            while (i2 < length) {
                jh jhVar2 = jhVarArr[i2];
                l0(byteArrayOutputStream, jhVar2, v(jhVar2.a, jhVar2.b, bArr));
                k0(byteArrayOutputStream, jhVar2);
                i2++;
            }
        } else {
            for (jh jhVar3 : jhVarArr) {
                l0(byteArrayOutputStream, jhVar3, v(jhVar3.a, jhVar3.b, bArr));
            }
            int length2 = jhVarArr.length;
            while (i2 < length2) {
                k0(byteArrayOutputStream, jhVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress r(String str, int i2, int i3) {
        int i4;
        byte[] bArr = new byte[16];
        int i5 = i2;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i3 && n70.T(str, "::", i5, false)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i3) {
                    break;
                }
                i8 = i9;
                int i10 = 0;
                i5 = i8;
                while (i5 < i3) {
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (n70.T(str, ":", i5, false)) {
                    i5++;
                } else {
                    if (!n70.T(str, ".", i5, false)) {
                        return null;
                    }
                    int i11 = i6 - 2;
                    int i12 = i11;
                    while (i8 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i13 = 0;
                        int i14 = i8;
                        while (i14 < i3) {
                            char charAt = str.charAt(i14);
                            if (kr.k(charAt, 48) < 0 || kr.k(charAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i8 != i14) || ((i13 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i8 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i8 = i14;
                    }
                    if (i12 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                }
            }
            i8 = i5;
            int i102 = 0;
            i5 = i8;
            while (i5 < i3) {
                int o2 = cb0.o(str.charAt(i5));
                if (o2 == -1) {
                    break;
                }
                i102 = (i102 << 4) + o2;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i15 = i6 + 1;
                bArr[i6] = (byte) (255 & (i102 >>> 8));
                i6 += 2;
                bArr[i15] = (byte) (i102 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i16 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final boolean s(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static View t(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View findViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final String u(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static String v(String str, String str2, byte[] bArr) {
        byte[] bArr2 = b9.i;
        byte[] bArr3 = b9.j;
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

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList w(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i30 i30Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        j30 j30Var = new j30(resources, theme);
        synchronized (k30.c) {
            try {
                SparseArray sparseArray = (SparseArray) k30.b.get(j30Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (i30Var = (i30) sparseArray.get(i2)) != null) {
                    if (i30Var.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (i30Var.c != 0) {
                            }
                            colorStateList2 = i30Var.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = k30.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = fc.a(resources, resources.getXml(i2), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (k30.c) {
            try {
                WeakHashMap weakHashMap = k30.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(j30Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(j30Var, sparseArray2);
                }
                sparseArray2.append(i2, new i30(colorStateList, j30Var.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public abstract int A();

    public abstract int C();

    public abstract int D();

    public abstract int E(View view);

    public abstract int F(CoordinatorLayout coordinatorLayout);

    public abstract int G();

    public abstract boolean J(float f2);

    public abstract boolean L(View view);

    public abstract boolean M(float f2, float f3);

    public abstract View P(int i2);

    public abstract boolean Q();

    public abstract boolean c0(View view, float f2);

    public abstract void g0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    public abstract int h(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract void h0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract float i(int i2);

    public abstract int x(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract void y(p50 p50Var, float f2, float f3);

    public abstract int z();
}
