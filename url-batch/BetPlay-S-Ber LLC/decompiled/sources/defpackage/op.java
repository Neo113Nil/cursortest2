package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EdgeEffect;
import android.window.BackEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class op {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = new int[0];
    public static final Object[] h = new Object[0];
    public static final int[] i = {R.attr.theme, com.awerser.monnit.betplay.R.attr.theme};
    public static final int[] j = {com.awerser.monnit.betplay.R.attr.materialThemeOverlay};
    public static final byte[] k = {112, 114, 111, 0};
    public static final byte[] l = {112, 114, 109, 0};
    public static final Object m = new Object();
    public static boolean n = true;

    public op() {
        new ConcurrentHashMap();
    }

    public static Drawable A(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable p;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (p = l70.p(context, resourceId)) == null) ? typedArray.getDrawable(i2) : p;
    }

    public static Set B() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static boolean D(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static float E(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return mg.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u8 F(nn nnVar) {
        int i2;
        int i3;
        int i4;
        String str;
        nn nnVar2 = nnVar;
        int size = nnVar2.size();
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
            String b2 = nnVar2.b(i5);
            String d2 = nnVar2.d(i5);
            if (t40.b0(b2, "Cache-Control")) {
                if (str2 == null) {
                    str2 = d2;
                    i2 = 0;
                    while (i2 < d2.length()) {
                        int length = d2.length();
                        int i10 = i2;
                        while (true) {
                            if (i10 >= length) {
                                i3 = size;
                                i10 = d2.length();
                                break;
                            }
                            i3 = size;
                            if (l40.f0("=,;", d2.charAt(i10))) {
                                break;
                            }
                            i10++;
                            size = i3;
                        }
                        String obj = l40.q0(d2.substring(i2, i10)).toString();
                        if (i10 == d2.length() || d2.charAt(i10) == ',' || d2.charAt(i10) == ';') {
                            i4 = i10 + 1;
                            str = null;
                        } else {
                            int i11 = i10 + 1;
                            byte[] bArr = y70.a;
                            int length2 = d2.length();
                            while (true) {
                                if (i11 < length2) {
                                    char charAt = d2.charAt(i11);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = d2.length();
                                    break;
                                }
                            }
                            if (i11 >= d2.length() || d2.charAt(i11) != '\"') {
                                int length3 = d2.length();
                                int i12 = i11;
                                while (true) {
                                    if (i12 >= length3) {
                                        i12 = d2.length();
                                        break;
                                    }
                                    int i13 = length3;
                                    if (l40.f0(",;", d2.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    length3 = i13;
                                }
                                int i14 = i12;
                                str = l40.q0(d2.substring(i11, i12)).toString();
                                i4 = i14;
                            } else {
                                int i15 = i11 + 1;
                                int j0 = l40.j0(d2, '\"', i15, 4);
                                str = d2.substring(i15, j0);
                                i4 = j0 + 1;
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
                                i6 = y70.v(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = y70.v(str, -1);
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
                                i8 = y70.v(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = y70.v(str, -1);
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
                    nnVar2 = nnVar;
                    size = size;
                }
            } else if (!t40.b0(b2, "Pragma")) {
                i5++;
                nnVar2 = nnVar;
                size = size;
            }
            z = false;
            i2 = 0;
            while (i2 < d2.length()) {
            }
            i5++;
            nnVar2 = nnVar;
            size = size;
        }
        return new u8(z2, z3, i6, i7, z4, z5, z6, i8, i9, z7, z8, z9, !z ? null : str2);
    }

    public static void G(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static wu H(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            o8.x("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (j4 + j2));
                    wu wuVar = new wu();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    wuVar.d = duplicate;
                    wuVar.a = position;
                    int i7 = position - duplicate.getInt(position);
                    wuVar.b = i7;
                    wuVar.c = ((ByteBuffer) wuVar.d).getShort(i7);
                    return wuVar;
                }
            }
        }
        o8.x("Cannot read metadata.");
        return null;
    }

    public static int[] I(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) l70.O(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static kf[] J(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, kf[] kfVarArr) {
        byte[] bArr3 = vw.i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, vw.j)) {
                o8.t("Unsupported meta version");
                return null;
            }
            int O = (int) l70.O(fileInputStream, 2);
            byte[] N = l70.N(fileInputStream, (int) l70.O(fileInputStream, 4), (int) l70.O(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                o8.t("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(N);
            try {
                kf[] L = L(byteArrayInputStream, bArr2, O, kfVarArr);
                byteArrayInputStream.close();
                return L;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(vw.d, bArr2)) {
            o8.t("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            o8.t("Unsupported meta version");
            return null;
        }
        int O2 = (int) l70.O(fileInputStream, 1);
        byte[] N2 = l70.N(fileInputStream, (int) l70.O(fileInputStream, 4), (int) l70.O(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            o8.t("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(N2);
        try {
            kf[] K = K(byteArrayInputStream2, O2, kfVarArr);
            byteArrayInputStream2.close();
            return K;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static kf[] K(ByteArrayInputStream byteArrayInputStream, int i2, kf[] kfVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new kf[0];
        }
        if (i2 != kfVarArr.length) {
            o8.t("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int O = (int) l70.O(byteArrayInputStream, 2);
            iArr[i3] = (int) l70.O(byteArrayInputStream, 2);
            strArr[i3] = new String(l70.L(byteArrayInputStream, O), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            kf kfVar = kfVarArr[i4];
            if (!kfVar.b.equals(strArr[i4])) {
                o8.t("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            kfVar.e = i5;
            kfVar.h = I(byteArrayInputStream, i5);
        }
        return kfVarArr;
    }

    public static kf[] L(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, kf[] kfVarArr) {
        kf kfVar;
        if (byteArrayInputStream.available() == 0) {
            return new kf[0];
        }
        if (i2 != kfVarArr.length) {
            o8.t("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            l70.O(byteArrayInputStream, 2);
            String str = new String(l70.L(byteArrayInputStream, (int) l70.O(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long O = l70.O(byteArrayInputStream, 4);
            int O2 = (int) l70.O(byteArrayInputStream, 2);
            if (kfVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < kfVarArr.length; i4++) {
                    if (kfVarArr[i4].b.equals(substring)) {
                        kfVar = kfVarArr[i4];
                        break;
                    }
                }
            }
            kfVar = null;
            if (kfVar == null) {
                o8.t("Missing profile key: ".concat(str));
                return null;
            }
            kfVar.d = O;
            int[] I = I(byteArrayInputStream, O2);
            if (Arrays.equals(bArr, vw.h)) {
                kfVar.e = O2;
                kfVar.h = I;
            }
        }
        return kfVarArr;
    }

    public static kf[] M(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, vw.e)) {
            o8.t("Unsupported version");
            return null;
        }
        int O = (int) l70.O(fileInputStream, 1);
        byte[] N = l70.N(fileInputStream, (int) l70.O(fileInputStream, 4), (int) l70.O(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            o8.t("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(N);
        try {
            kf[] N2 = N(byteArrayInputStream, str, O);
            byteArrayInputStream.close();
            return N2;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static kf[] N(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new kf[0];
        }
        kf[] kfVarArr = new kf[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int O = (int) l70.O(byteArrayInputStream, 2);
            int O2 = (int) l70.O(byteArrayInputStream, 2);
            kfVarArr[i4] = new kf(str, new String(l70.L(byteArrayInputStream, O), StandardCharsets.UTF_8), l70.O(byteArrayInputStream, 4), O2, (int) l70.O(byteArrayInputStream, 4), (int) l70.O(byteArrayInputStream, 4), new int[O2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            kf kfVar = kfVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = kfVar.f;
            int i7 = kfVar.g;
            TreeMap treeMap = kfVar.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) l70.O(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int O3 = (int) l70.O(byteArrayInputStream, 2);
                while (O3 > 0) {
                    l70.O(byteArrayInputStream, 2);
                    int O4 = (int) l70.O(byteArrayInputStream, 1);
                    if (O4 != 6 && O4 != 7) {
                        while (O4 > 0) {
                            l70.O(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int O5 = (int) l70.O(byteArrayInputStream, 1); O5 > 0; O5--) {
                                l70.O(byteArrayInputStream, 2);
                            }
                            O4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    O3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                o8.t("Read too much data during profile line parse");
                return null;
            }
            kfVar.h = I(byteArrayInputStream, kfVar.e);
            BitSet valueOf = BitSet.valueOf(l70.L(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
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
        return kfVarArr;
    }

    public static void O(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void P(Window window, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            d0.d(window, z);
        } else {
            if (i2 >= 30) {
                d0.c(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static jp R(lp lpVar, int i2) {
        lpVar.getClass();
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i3 = lpVar.f;
        int i4 = lpVar.g;
        if (lpVar.h <= 0) {
            i2 = -i2;
        }
        return new jp(i3, i4, i2);
    }

    public static void S(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            j90.b(viewGroup, z);
        } else if (n) {
            try {
                j90.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                n = false;
            }
        }
    }

    public static void T(String str) {
        gk gkVar = new gk("lateinit property " + str + " has not been initialized");
        O(gkVar, op.class.getName());
        throw gkVar;
    }

    public static final String U(String str) {
        str.getClass();
        int i2 = -1;
        int i3 = 0;
        if (!l40.g0(str, ":")) {
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
                    if (i(charAt, 31) <= 0 || i(charAt, 127) >= 0 || l40.j0(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress s = (t40.e0(str, "[", false) && str.endsWith("]")) ? s(str, 1, str.length() - 1) : s(str, 0, str.length());
        if (s == null) {
            return null;
        }
        byte[] address = s.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return s.getHostAddress();
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
        p8 p8Var = new p8();
        while (i3 < address.length) {
            if (i3 == i2) {
                p8Var.w(58);
                i3 += i6;
                if (i3 == 16) {
                    p8Var.w(58);
                }
            } else {
                if (i3 > 0) {
                    p8Var.w(58);
                }
                byte b2 = address[i3];
                byte[] bArr = y70.a;
                p8Var.x(((b2 & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return p8Var.r(p8Var.g, v9.a);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean V(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, kf[] kfVarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = vw.h;
        byte[] bArr3 = vw.g;
        byte[] bArr4 = vw.d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = vw.e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] n2 = n(kfVarArr, bArr5);
                l70.X(byteArrayOutputStream, kfVarArr.length, 1);
                l70.X(byteArrayOutputStream, n2.length, 4);
                byte[] k2 = l70.k(n2);
                l70.X(byteArrayOutputStream, k2.length, 4);
                byteArrayOutputStream.write(k2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                l70.X(byteArrayOutputStream, kfVarArr.length, 1);
                for (kf kfVar : kfVarArr) {
                    int size = kfVar.i.size() * 4;
                    String v = v(kfVar.a, kfVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    l70.Y(byteArrayOutputStream, v.getBytes(charset).length);
                    l70.Y(byteArrayOutputStream, kfVar.h.length);
                    l70.X(byteArrayOutputStream, size, 4);
                    l70.X(byteArrayOutputStream, kfVar.c, 4);
                    byteArrayOutputStream.write(v.getBytes(charset));
                    Iterator it = kfVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        l70.Y(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        l70.Y(byteArrayOutputStream, 0);
                    }
                    for (int i4 : kfVar.h) {
                        l70.Y(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = vw.f;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] n3 = n(kfVarArr, bArr6);
                l70.X(byteArrayOutputStream, kfVarArr.length, 1);
                l70.X(byteArrayOutputStream, n3.length, 4);
                byte[] k3 = l70.k(n3);
                l70.X(byteArrayOutputStream, k3.length, 4);
                byteArrayOutputStream.write(k3);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            l70.Y(byteArrayOutputStream, kfVarArr.length);
            for (kf kfVar2 : kfVarArr) {
                String str = kfVar2.a;
                TreeMap treeMap = kfVar2.i;
                String v2 = v(str, kfVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                l70.Y(byteArrayOutputStream, v2.getBytes(charset2).length);
                l70.Y(byteArrayOutputStream, treeMap.size());
                l70.Y(byteArrayOutputStream, kfVar2.h.length);
                l70.X(byteArrayOutputStream, kfVar2.c, 4);
                byteArrayOutputStream.write(v2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    l70.Y(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : kfVar2.h) {
                    l70.Y(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            l70.Y(byteArrayOutputStream2, kfVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (kf kfVar3 : kfVarArr) {
                l70.X(byteArrayOutputStream2, kfVar3.c, 4);
                l70.X(byteArrayOutputStream2, kfVar3.d, 4);
                l70.X(byteArrayOutputStream2, kfVar3.g, 4);
                String v3 = v(kfVar3.a, kfVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = v3.getBytes(charset3).length;
                l70.Y(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(v3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            fc0 fc0Var = new fc0(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(fc0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < kfVarArr.length) {
                try {
                    kf kfVar4 = kfVarArr[i8];
                    l70.Y(byteArrayOutputStream3, i8);
                    l70.Y(byteArrayOutputStream3, kfVar4.e);
                    i9 = i9 + 4 + (kfVar4.e * i6);
                    int[] iArr = kfVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        l70.Y(byteArrayOutputStream3, i11 - i10);
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
            fc0 fc0Var2 = new fc0(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(fc0Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < kfVarArr.length; i14++) {
                try {
                    kf kfVar5 = kfVarArr[i14];
                    Iterator it3 = kfVar5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        c0(byteArrayOutputStream4, i15, kfVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            d0(byteArrayOutputStream4, kfVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            l70.Y(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            l70.X(byteArrayOutputStream3, length4, 4);
                            l70.Y(byteArrayOutputStream3, i15);
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
            fc0 fc0Var3 = new fc0(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(fc0Var3);
            long size2 = 12 + (arrayList.size() * 16);
            l70.X(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                fc0 fc0Var4 = (fc0) arrayList.get(i17);
                int i18 = fc0Var4.a;
                byte[] bArr7 = fc0Var4.b;
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
                l70.X(byteArrayOutputStream, j2, 4);
                l70.X(byteArrayOutputStream, size2, 4);
                if (fc0Var4.c) {
                    long length5 = bArr7.length;
                    byte[] k4 = l70.k(bArr7);
                    arrayList2.add(k4);
                    l70.X(byteArrayOutputStream, k4.length, 4);
                    l70.X(byteArrayOutputStream, length5, 4);
                    length = k4.length;
                } else {
                    arrayList2.add(bArr7);
                    l70.X(byteArrayOutputStream, bArr7.length, 4);
                    l70.X(byteArrayOutputStream, 0L, 4);
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

    public static lp W(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new lp(i2, i3 - 1, 1);
        }
        lp lpVar = lp.i;
        return lp.i;
    }

    public static boolean X(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static Context Y(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof od) && ((od) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        od odVar = new od(context, i4);
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
                odVar.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, i);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            odVar.getTheme().applyStyle(resourceId, true);
        }
        return odVar;
    }

    public static Context Z(Context context, AttributeSet attributeSet, int i2, int i3) {
        return Y(i2, i3, context, attributeSet, new int[0]);
    }

    public static final hv a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new hv(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, kf kfVar) {
        d0(byteArrayOutputStream, kfVar);
        int i2 = kfVar.g;
        int[] iArr = kfVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            l70.Y(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : kfVar.i.entrySet()) {
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

    public static final String b(Object[] objArr, int i2, int i3, l lVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == lVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void b0(ByteArrayOutputStream byteArrayOutputStream, kf kfVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        l70.Y(byteArrayOutputStream, str.getBytes(charset).length);
        l70.Y(byteArrayOutputStream, kfVar.e);
        l70.X(byteArrayOutputStream, kfVar.f, 4);
        l70.X(byteArrayOutputStream, kfVar.c, 4);
        l70.X(byteArrayOutputStream, kfVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028a, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(fd fdVar, xq xqVar, ArrayList arrayList, int i2) {
        int i3;
        o9[] o9VarArr;
        int i4;
        int i5;
        pc[] pcVarArr;
        boolean z;
        ed edVar;
        float f2;
        boolean z2;
        boolean z3;
        int i6;
        ed edVar2;
        xq xqVar2;
        ed edVar3;
        p30 p30Var;
        pc pcVar;
        p30 p30Var2;
        ed edVar4;
        int i7;
        pc[] pcVarArr2;
        pc pcVar2;
        p30 p30Var3;
        ed edVar5;
        ed edVar6;
        int i8;
        pc pcVar3;
        pc[] pcVarArr3;
        int i9;
        pc pcVar4;
        p30 p30Var4;
        p30 p30Var5;
        int size;
        ArrayList arrayList2;
        int i10;
        ed edVar7;
        int i11;
        float f3;
        int i12;
        float f4;
        ed edVar8;
        int i13;
        int i14;
        int i15;
        ed edVar9;
        pc pcVar5;
        ed edVar10;
        fd fdVar2 = fdVar;
        xq xqVar3 = xqVar;
        ArrayList arrayList3 = arrayList;
        if (i2 == 0) {
            i3 = fdVar2.z0;
            o9VarArr = fdVar2.C0;
            i4 = 0;
        } else {
            i3 = fdVar2.A0;
            o9VarArr = fdVar2.B0;
            i4 = 2;
        }
        int i16 = i3;
        o9[] o9VarArr2 = o9VarArr;
        int i17 = 0;
        while (i17 < i16) {
            o9 o9Var = o9VarArr2[i17];
            boolean z4 = o9Var.q;
            ed edVar11 = o9Var.a;
            pc[] pcVarArr4 = edVar11.Q;
            int i18 = 3;
            int i19 = 8;
            float f5 = 0.0f;
            if (z4) {
                i5 = i17;
            } else {
                int i20 = o9Var.l;
                int i21 = i20 * 2;
                ed edVar12 = edVar11;
                ed edVar13 = edVar12;
                boolean z5 = false;
                while (!z5) {
                    o9Var.i++;
                    ed[] edVarArr = edVar12.m0;
                    pc[] pcVarArr5 = edVar12.Q;
                    edVarArr[i20] = null;
                    edVar12.l0[i20] = null;
                    if (edVar12.g0 != i19) {
                        edVar12.j(i20);
                        pcVarArr5[i21].e();
                        int i22 = i21 + 1;
                        pcVarArr5[i22].e();
                        pcVarArr5[i21].e();
                        pcVarArr5[i22].e();
                        if (o9Var.b == null) {
                            o9Var.b = edVar12;
                        }
                        o9Var.d = edVar12;
                        int i23 = edVar12.p0[i20];
                        if (i23 == i18) {
                            int i24 = edVar12.t[i20];
                            if (i24 == 0 || i24 == i18 || i24 == 2) {
                                o9Var.j++;
                                float f6 = edVar12.k0[i20];
                                if (f6 > 0.0f) {
                                    i14 = i17;
                                    o9Var.k += f6;
                                } else {
                                    i14 = i17;
                                }
                                i15 = i20;
                                if (edVar12.g0 != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                    if (f6 < 0.0f) {
                                        o9Var.n = true;
                                    } else {
                                        o9Var.o = true;
                                    }
                                    if (o9Var.h == null) {
                                        o9Var.h = new ArrayList();
                                    }
                                    o9Var.h.add(edVar12);
                                }
                                if (o9Var.f == null) {
                                    o9Var.f = edVar12;
                                }
                                ed edVar14 = o9Var.g;
                                if (edVar14 != null) {
                                    edVar14.l0[i15] = edVar12;
                                }
                                o9Var.g = edVar12;
                            } else {
                                i14 = i17;
                                i15 = i20;
                            }
                            if (i15 == 0) {
                                if (edVar12.r == 0 && edVar12.u == 0) {
                                    int i25 = edVar12.v;
                                }
                            } else if (edVar12.s == 0 && edVar12.x == 0) {
                                int i26 = edVar12.y;
                            }
                            edVar9 = edVar13;
                            if (edVar9 != edVar12) {
                                edVar9.m0[i15] = edVar12;
                            }
                            pcVar5 = pcVarArr5[i21 + 1].f;
                            if (pcVar5 != null) {
                                edVar10 = pcVar5.d;
                                pc pcVar6 = edVar10.Q[i21].f;
                                if (pcVar6 != null) {
                                }
                            }
                            edVar10 = null;
                            if (edVar10 != null) {
                                edVar10 = edVar12;
                                z5 = true;
                            }
                            edVar13 = edVar12;
                            i20 = i15;
                            i18 = 3;
                            i19 = 8;
                            edVar12 = edVar10;
                            i17 = i14;
                        }
                    }
                    i14 = i17;
                    i15 = i20;
                    edVar9 = edVar13;
                    if (edVar9 != edVar12) {
                    }
                    pcVar5 = pcVarArr5[i21 + 1].f;
                    if (pcVar5 != null) {
                    }
                    edVar10 = null;
                    if (edVar10 != null) {
                    }
                    edVar13 = edVar12;
                    i20 = i15;
                    i18 = 3;
                    i19 = 8;
                    edVar12 = edVar10;
                    i17 = i14;
                }
                i5 = i17;
                int i27 = i20;
                ed edVar15 = o9Var.b;
                if (edVar15 != null) {
                    edVar15.Q[i21].e();
                }
                ed edVar16 = o9Var.d;
                if (edVar16 != null) {
                    edVar16.Q[i21 + 1].e();
                }
                o9Var.c = edVar12;
                if (i27 == 0 && o9Var.m) {
                    o9Var.e = edVar12;
                } else {
                    o9Var.e = edVar11;
                }
                o9Var.p = o9Var.o && o9Var.n;
            }
            o9Var.q = true;
            if (arrayList3 == null || arrayList3.contains(edVar11)) {
                ed edVar17 = o9Var.c;
                ed edVar18 = o9Var.b;
                ed edVar19 = o9Var.d;
                ed edVar20 = o9Var.e;
                float f7 = o9Var.k;
                int[] iArr = fdVar2.p0;
                pc[] pcVarArr6 = fdVar2.Q;
                boolean z6 = iArr[i2] == 2;
                if (i2 == 0) {
                    int i28 = edVar20.i0;
                    boolean z7 = i28 == 0;
                    pcVarArr = pcVarArr4;
                    boolean z8 = i28 == 1;
                    z = i28 == 2;
                    edVar = edVar11;
                    f2 = f7;
                    z3 = z8;
                    z2 = z7;
                } else {
                    pcVarArr = pcVarArr4;
                    int i29 = edVar20.j0;
                    boolean z9 = i29 == 0;
                    boolean z10 = i29 == 1;
                    z = i29 == 2;
                    edVar = edVar11;
                    f2 = f7;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    pc[] pcVarArr7 = edVar.Q;
                    int[] iArr2 = edVar.p0;
                    pc pcVar7 = pcVarArr7[i4];
                    int i30 = z ? 1 : 4;
                    int e2 = pcVar7.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i2] == 3 && edVar.t[i2] == 0;
                    pc pcVar8 = pcVar7.f;
                    if (pcVar8 != null && edVar != edVar11) {
                        e2 = pcVar8.e() + e2;
                    }
                    int i31 = e2;
                    if (z13 && edVar != edVar11 && edVar != edVar18) {
                        i30 = 8;
                    }
                    ed edVar21 = edVar11;
                    pc pcVar9 = pcVar7.f;
                    if (pcVar9 != null) {
                        boolean z15 = z14;
                        p30 p30Var6 = pcVar7.i;
                        p30 p30Var7 = pcVar9.i;
                        if (edVar == edVar18) {
                            xqVar3.f(p30Var6, p30Var7, i31, 6);
                        } else {
                            xqVar3.f(p30Var6, p30Var7, i31, 8);
                        }
                        if (z15 && !z13) {
                            i30 = 5;
                        }
                        xqVar3.e(pcVar7.i, pcVar7.f.i, i31, (edVar == edVar18 && z13 && edVar.S[i2]) ? 5 : i30);
                    }
                    if (z12) {
                        if (edVar.g0 == 8 || iArr2[i2] != 3) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            xqVar3.f(pcVarArr7[i4 + 1].i, pcVarArr7[i4].i, 0, 5);
                        }
                        xqVar3.f(pcVarArr7[i4].i, pcVarArr6[i4].i, i13, 8);
                    }
                    pc pcVar10 = pcVarArr7[i4 + 1].f;
                    if (pcVar10 != null) {
                        edVar8 = pcVar10.d;
                        pc pcVar11 = edVar8.Q[i4].f;
                        if (pcVar11 != null) {
                        }
                    }
                    edVar8 = null;
                    if (edVar8 != null) {
                        edVar = edVar8;
                    } else {
                        z11 = true;
                    }
                    edVar11 = edVar21;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (edVar19 != null) {
                    int i32 = i4 + 1;
                    if (edVar17.Q[i32].f != null) {
                        pc pcVar12 = edVar19.Q[i32];
                        if (edVar19.p0[i2] == 3 && edVar19.t[i2] == 0 && !z17) {
                            pc pcVar13 = pcVar12.f;
                            if (pcVar13.d == fdVar2) {
                                xqVar3.e(pcVar12.i, pcVar13.i, -pcVar12.e(), 5);
                                xqVar3.g(pcVar12.i, edVar17.Q[i32].f.i, -pcVar12.e(), 6);
                            }
                        }
                        if (z17) {
                            pc pcVar14 = pcVar12.f;
                            if (pcVar14.d == fdVar2) {
                                xqVar3.e(pcVar12.i, pcVar14.i, -pcVar12.e(), 4);
                            }
                        }
                        xqVar3.g(pcVar12.i, edVar17.Q[i32].f.i, -pcVar12.e(), 6);
                    }
                }
                if (z16) {
                    int i33 = i4 + 1;
                    p30 p30Var8 = pcVarArr6[i33].i;
                    pc pcVar15 = edVar17.Q[i33];
                    xqVar3.f(p30Var8, pcVar15.i, pcVar15.e(), 8);
                }
                ArrayList arrayList4 = o9Var.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (o9Var.n && !o9Var.p) {
                        f2 = o9Var.j;
                    }
                    ed edVar22 = null;
                    float f8 = 0.0f;
                    int i34 = 0;
                    while (i34 < size) {
                        ed edVar23 = (ed) arrayList4.get(i34);
                        float[] fArr = edVar23.k0;
                        pc[] pcVarArr8 = edVar23.Q;
                        float f9 = fArr[i2];
                        if (f9 < f5) {
                            if (o9Var.p) {
                                arrayList2 = arrayList4;
                                i10 = size;
                                xqVar3.e(pcVarArr8[i4 + 1].i, pcVarArr8[i4].i, 0, 4);
                                f4 = f8;
                                i11 = i16;
                                f3 = f5;
                                f8 = f4;
                                i12 = i34;
                                i34 = i12 + 1;
                                i16 = i11;
                                arrayList4 = arrayList2;
                                size = i10;
                                f5 = f3;
                            } else {
                                f9 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        i10 = size;
                        if (f9 == f5) {
                            f4 = f8;
                            xqVar3.e(pcVarArr8[i4 + 1].i, pcVarArr8[i4].i, 0, 8);
                            i11 = i16;
                            f3 = f5;
                            f8 = f4;
                            i12 = i34;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList4 = arrayList2;
                            size = i10;
                            f5 = f3;
                        } else {
                            float f10 = f8;
                            if (edVar22 != null) {
                                pc[] pcVarArr9 = edVar22.Q;
                                p30 p30Var9 = pcVarArr9[i4].i;
                                int i35 = i4 + 1;
                                p30 p30Var10 = pcVarArr9[i35].i;
                                p30 p30Var11 = pcVarArr8[i4].i;
                                p30 p30Var12 = pcVarArr8[i35].i;
                                f7 l2 = xqVar3.l();
                                edVar7 = edVar23;
                                float f11 = f5;
                                l2.b = f11;
                                f3 = f11;
                                if (f2 == f11 || f10 == f9) {
                                    i12 = i34;
                                    i11 = i16;
                                    l2.d.g(p30Var9, 1.0f);
                                    l2.d.g(p30Var10, -1.0f);
                                    l2.d.g(p30Var12, 1.0f);
                                    l2.d.g(p30Var11, -1.0f);
                                } else {
                                    y6 y6Var = l2.d;
                                    if (f10 == f3) {
                                        i12 = i34;
                                        y6Var.g(p30Var9, 1.0f);
                                        l2.d.g(p30Var10, -1.0f);
                                        i11 = i16;
                                    } else {
                                        i12 = i34;
                                        i11 = i16;
                                        if (f9 == f5) {
                                            y6Var.g(p30Var11, 1.0f);
                                            l2.d.g(p30Var12, -1.0f);
                                        } else {
                                            float f12 = (f10 / f2) / (f9 / f2);
                                            y6Var.g(p30Var9, 1.0f);
                                            l2.d.g(p30Var10, -1.0f);
                                            l2.d.g(p30Var12, f12);
                                            l2.d.g(p30Var11, -f12);
                                        }
                                    }
                                }
                                xqVar3.c(l2);
                            } else {
                                edVar7 = edVar23;
                                i11 = i16;
                                f3 = f5;
                                i12 = i34;
                            }
                            f8 = f9;
                            edVar22 = edVar7;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList4 = arrayList2;
                            size = i10;
                            f5 = f3;
                        }
                    }
                }
                i6 = i16;
                if (edVar18 == null || !(edVar18 == edVar19 || z17)) {
                    edVar2 = edVar19;
                    if (z2 && edVar18 != null) {
                        int i36 = o9Var.j;
                        boolean z18 = i36 > 0 && o9Var.i == i36;
                        ed edVar24 = edVar18;
                        ed edVar25 = edVar24;
                        while (true) {
                            pc[] pcVarArr10 = edVar25.Q;
                            if (edVar24 == null) {
                                break;
                            }
                            pc[] pcVarArr11 = edVar24.Q;
                            ed edVar26 = edVar24.m0[i2];
                            while (true) {
                                if (edVar26 == null) {
                                    i7 = 8;
                                    break;
                                }
                                i7 = 8;
                                if (edVar26.g0 != 8) {
                                    break;
                                } else {
                                    edVar26 = edVar26.m0[i2];
                                }
                            }
                            if (edVar26 != null || edVar24 == edVar2) {
                                pc pcVar16 = pcVarArr11[i4];
                                p30 p30Var13 = pcVar16.i;
                                pc pcVar17 = pcVar16.f;
                                p30 p30Var14 = pcVar17 != null ? pcVar17.i : null;
                                if (edVar25 != edVar24) {
                                    p30Var14 = pcVarArr10[i4 + 1].i;
                                } else if (edVar24 == edVar18) {
                                    pc pcVar18 = pcVarArr[i4].f;
                                    p30Var14 = pcVar18 != null ? pcVar18.i : null;
                                }
                                int e3 = pcVar16.e();
                                int i37 = i4 + 1;
                                int e4 = pcVarArr11[i37].e();
                                if (edVar26 != null) {
                                    pcVar2 = edVar26.Q[i4];
                                    pcVarArr2 = pcVarArr10;
                                    p30Var3 = pcVar2.i;
                                } else {
                                    pcVarArr2 = pcVarArr10;
                                    pcVar2 = edVar17.Q[i37].f;
                                    p30Var3 = pcVar2 != null ? pcVar2.i : null;
                                }
                                p30 p30Var15 = pcVarArr11[i37].i;
                                if (pcVar2 != null) {
                                    e4 += pcVar2.e();
                                }
                                int e5 = pcVarArr2[i37].e() + e3;
                                if (p30Var13 == null || p30Var14 == null || p30Var3 == null || p30Var15 == null) {
                                    edVar5 = edVar26;
                                    edVar6 = edVar25;
                                    i8 = 8;
                                } else {
                                    if (edVar24 == edVar18) {
                                        e5 = edVar18.Q[i4].e();
                                    }
                                    int i38 = e5;
                                    if (edVar24 == edVar2) {
                                        e4 = edVar2.Q[i37].e();
                                    }
                                    edVar5 = edVar26;
                                    edVar6 = edVar25;
                                    i8 = 8;
                                    xqVar.b(p30Var13, p30Var14, i38, 0.5f, p30Var3, p30Var15, e4, z18 ? 8 : 5);
                                }
                            } else {
                                edVar5 = edVar26;
                                edVar6 = edVar25;
                                i8 = i7;
                            }
                            if (edVar24.g0 != i8) {
                                edVar6 = edVar24;
                            }
                            edVar24 = edVar5;
                            edVar25 = edVar6;
                        }
                    } else {
                        int i39 = 8;
                        if (z3 && edVar18 != null) {
                            int i40 = o9Var.j;
                            boolean z19 = i40 > 0 && o9Var.i == i40;
                            ed edVar27 = edVar18;
                            ed edVar28 = edVar27;
                            while (true) {
                                pc[] pcVarArr12 = edVar27.Q;
                                if (edVar28 == null) {
                                    break;
                                }
                                pc[] pcVarArr13 = edVar28.Q;
                                ed edVar29 = edVar28.m0[i2];
                                while (edVar29 != null && edVar29.g0 == i39) {
                                    edVar29 = edVar29.m0[i2];
                                }
                                if (edVar28 == edVar18 || edVar28 == edVar2 || edVar29 == null) {
                                    edVar3 = edVar27;
                                } else {
                                    if (edVar29 == edVar2) {
                                        edVar29 = null;
                                    }
                                    pc pcVar19 = pcVarArr13[i4];
                                    p30 p30Var16 = pcVar19.i;
                                    int i41 = i4 + 1;
                                    p30 p30Var17 = pcVarArr12[i41].i;
                                    int e6 = pcVar19.e();
                                    int e7 = pcVarArr13[i41].e();
                                    if (edVar29 != null) {
                                        pcVar = edVar29.Q[i4];
                                        p30Var = pcVar.i;
                                        edVar3 = edVar27;
                                        pc pcVar20 = pcVar.f;
                                        p30Var2 = pcVar20 != null ? pcVar20.i : null;
                                    } else {
                                        edVar3 = edVar27;
                                        pc pcVar21 = edVar2.Q[i4];
                                        p30Var = pcVar21 != null ? pcVar21.i : null;
                                        p30 p30Var18 = pcVarArr13[i41].i;
                                        pcVar = pcVar21;
                                        p30Var2 = p30Var18;
                                    }
                                    if (pcVar != null) {
                                        e7 += pcVar.e();
                                    }
                                    int e8 = pcVarArr12[i41].e() + e6;
                                    ed edVar30 = edVar29;
                                    int i42 = e7;
                                    int i43 = z19 ? 8 : 4;
                                    if (p30Var16 == null || p30Var17 == null || p30Var == null || p30Var2 == null) {
                                        edVar4 = edVar30;
                                    } else {
                                        p30 p30Var19 = p30Var;
                                        edVar4 = edVar30;
                                        xqVar.b(p30Var16, p30Var17, e8, 0.5f, p30Var19, p30Var2, i42, i43);
                                    }
                                    edVar29 = edVar4;
                                }
                                if (edVar28.g0 != 8) {
                                    edVar3 = edVar28;
                                }
                                edVar28 = edVar29;
                                i39 = 8;
                                edVar27 = edVar3;
                            }
                            xqVar2 = xqVar;
                            pc pcVar22 = edVar18.Q[i4];
                            pc pcVar23 = pcVarArr[i4].f;
                            int i44 = i4 + 1;
                            pc pcVar24 = edVar2.Q[i44];
                            pc pcVar25 = edVar17.Q[i44].f;
                            if (pcVar23 != null) {
                                if (edVar18 != edVar2) {
                                    xqVar2.e(pcVar22.i, pcVar23.i, pcVar22.e(), 5);
                                } else if (pcVar25 != null) {
                                    xqVar2.b(pcVar22.i, pcVar23.i, pcVar22.e(), 0.5f, pcVar24.i, pcVar25.i, pcVar24.e(), 5);
                                }
                            }
                            if (pcVar25 != null && edVar18 != edVar2) {
                                xqVar2.e(pcVar24.i, pcVar25.i, -pcVar24.e(), 5);
                            }
                            if ((!z2 || z3) && edVar18 != null && edVar18 != edVar2) {
                                pc[] pcVarArr14 = edVar18.Q;
                                pcVar3 = pcVarArr14[i4];
                                if (edVar2 == null) {
                                    edVar2 = edVar18;
                                }
                                pcVarArr3 = edVar2.Q;
                                i9 = i4 + 1;
                                pcVar4 = pcVarArr3[i9];
                                pc pcVar26 = pcVar3.f;
                                p30Var4 = pcVar26 == null ? pcVar26.i : null;
                                pc pcVar27 = pcVar4.f;
                                p30Var5 = pcVar27 == null ? pcVar27.i : null;
                                if (edVar17 != edVar2) {
                                    pc pcVar28 = edVar17.Q[i9].f;
                                    p30Var5 = pcVar28 != null ? pcVar28.i : null;
                                }
                                if (edVar18 == edVar2) {
                                    pcVar4 = pcVarArr14[i9];
                                }
                                if (p30Var4 != null && p30Var5 != null) {
                                    xqVar2.b(pcVar3.i, p30Var4, pcVar3.e(), 0.5f, p30Var5, pcVar4.i, pcVarArr3[i9].e(), 5);
                                }
                            }
                        }
                    }
                } else {
                    pc pcVar29 = pcVarArr[i4];
                    int i45 = i4 + 1;
                    pc pcVar30 = edVar17.Q[i45];
                    pc pcVar31 = pcVar29.f;
                    p30 p30Var20 = pcVar31 != null ? pcVar31.i : null;
                    pc pcVar32 = pcVar30.f;
                    p30 p30Var21 = pcVar32 != null ? pcVar32.i : null;
                    pc pcVar33 = edVar18.Q[i4];
                    if (edVar19 != null) {
                        pcVar30 = edVar19.Q[i45];
                    }
                    if (p30Var20 == null || p30Var21 == null) {
                        edVar2 = edVar19;
                    } else {
                        float f13 = i2 == 0 ? edVar20.d0 : edVar20.e0;
                        int e9 = pcVar33.e();
                        int e10 = pcVar30.e();
                        p30 p30Var22 = pcVar33.i;
                        p30 p30Var23 = pcVar30.i;
                        p30 p30Var24 = p30Var20;
                        edVar2 = edVar19;
                        xqVar3.b(p30Var22, p30Var24, e9, f13, p30Var21, p30Var23, e10, 7);
                    }
                }
                xqVar2 = xqVar;
                if (!z2) {
                }
                pc[] pcVarArr142 = edVar18.Q;
                pcVar3 = pcVarArr142[i4];
                if (edVar2 == null) {
                }
                pcVarArr3 = edVar2.Q;
                i9 = i4 + 1;
                pcVar4 = pcVarArr3[i9];
                pc pcVar262 = pcVar3.f;
                if (pcVar262 == null) {
                }
                pc pcVar272 = pcVar4.f;
                if (pcVar272 == null) {
                }
                if (edVar17 != edVar2) {
                }
                if (edVar18 == edVar2) {
                }
                if (p30Var4 != null) {
                    xqVar2.b(pcVar3.i, p30Var4, pcVar3.e(), 0.5f, p30Var5, pcVar4.i, pcVarArr3[i9].e(), 5);
                }
            } else {
                i6 = i16;
            }
            i17 = i5 + 1;
            fdVar2 = fdVar;
            xqVar3 = xqVar;
            arrayList3 = arrayList;
            i16 = i6;
        }
    }

    public static void c0(ByteArrayOutputStream byteArrayOutputStream, int i2, kf kfVar) {
        int i3 = kfVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : kfVar.i.entrySet()) {
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

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void d0(ByteArrayOutputStream byteArrayOutputStream, kf kfVar) {
        int i2 = 0;
        for (Map.Entry entry : kfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                l70.Y(byteArrayOutputStream, intValue - i2);
                l70.Y(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final int e(int i2, int i3, int[] iArr) {
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

    public static final int f(long[] jArr, int i2, long j2) {
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

    public static final void g(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static int h(Context context, String str) {
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
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, u6.a(context)) : 1;
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

    public static int i(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int j(zz zzVar, zg zgVar, View view, View view2, nz nzVar, boolean z) {
        if (nzVar.v() == 0 || zzVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(nz.H(view) - nz.H(view2)) + 1;
        }
        return Math.min(zgVar.l(), zgVar.b(view2) - zgVar.e(view));
    }

    public static int k(zz zzVar, zg zgVar, View view, View view2, nz nzVar, boolean z, boolean z2) {
        if (nzVar.v() == 0 || zzVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (zzVar.b() - Math.max(nz.H(view), nz.H(view2))) - 1) : Math.max(0, Math.min(nz.H(view), nz.H(view2)));
        if (z) {
            return Math.round((max * (Math.abs(zgVar.b(view2) - zgVar.e(view)) / (Math.abs(nz.H(view) - nz.H(view2)) + 1))) + (zgVar.k() - zgVar.e(view)));
        }
        return max;
    }

    public static int l(zz zzVar, zg zgVar, View view, View view2, nz nzVar, boolean z) {
        if (nzVar.v() == 0 || zzVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zzVar.b();
        }
        return (int) (((zgVar.b(view2) - zgVar.e(view)) / (Math.abs(nz.H(view) - nz.H(view2)) + 1)) * zzVar.b());
    }

    public static final void m(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    public static byte[] n(kf[] kfVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (kf kfVar : kfVarArr) {
            i3 += ((((kfVar.g * 2) + 7) & (-8)) / 8) + (kfVar.e * 2) + v(kfVar.a, kfVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + kfVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, vw.f)) {
            int length = kfVarArr.length;
            while (i2 < length) {
                kf kfVar2 = kfVarArr[i2];
                b0(byteArrayOutputStream, kfVar2, v(kfVar2.a, kfVar2.b, bArr));
                a0(byteArrayOutputStream, kfVar2);
                i2++;
            }
        } else {
            for (kf kfVar3 : kfVarArr) {
                b0(byteArrayOutputStream, kfVar3, v(kfVar3.a, kfVar3.b, bArr));
            }
            int length2 = kfVarArr.length;
            while (i2 < length2) {
                a0(byteArrayOutputStream, kfVarArr[i2]);
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
    public static final InetAddress s(String str, int i2, int i3) {
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
            if (i9 <= i3 && t40.d0(str, "::", i5, false)) {
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
                if (t40.d0(str, ":", i5, false)) {
                    i5++;
                } else {
                    if (!t40.d0(str, ".", i5, false)) {
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
                            if (i(charAt, 48) < 0 || i(charAt, 57) > 0) {
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
                int o = y70.o(str.charAt(i5));
                if (o == -1) {
                    break;
                }
                i102 = (i102 << 4) + o;
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

    public static qa0 t(ed edVar, int i2, ArrayList arrayList, qa0 qa0Var) {
        int i3;
        int i4 = i2 == 0 ? edVar.n0 : edVar.o0;
        if (i4 != -1 && (qa0Var == null || i4 != qa0Var.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                qa0 qa0Var2 = (qa0) arrayList.get(i5);
                if (qa0Var2.b == i4) {
                    if (qa0Var != null) {
                        qa0Var.c(i2, qa0Var2);
                        arrayList.remove(qa0Var);
                    }
                    qa0Var = qa0Var2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return qa0Var;
        }
        if (qa0Var == null) {
            if (edVar instanceof pn) {
                pn pnVar = (pn) edVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= pnVar.r0) {
                        i3 = -1;
                        break;
                    }
                    ed edVar2 = pnVar.q0[i6];
                    if ((i2 == 0 && (i3 = edVar2.n0) != -1) || (i2 == 1 && (i3 = edVar2.o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        qa0 qa0Var3 = (qa0) arrayList.get(i7);
                        if (qa0Var3.b == i3) {
                            qa0Var = qa0Var3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (qa0Var == null) {
                qa0Var = new qa0();
                qa0Var.a = new ArrayList();
                qa0Var.d = null;
                qa0Var.e = -1;
                int i8 = qa0.f;
                qa0.f = i8 + 1;
                qa0Var.b = i8;
                qa0Var.c = i2;
            }
            arrayList.add(qa0Var);
        }
        ArrayList arrayList2 = qa0Var.a;
        if (arrayList2.contains(edVar)) {
            return qa0Var;
        }
        arrayList2.add(edVar);
        if (edVar instanceof bn) {
            bn bnVar = (bn) edVar;
            bnVar.t0.c(bnVar.u0 == 0 ? 1 : 0, qa0Var, arrayList);
        }
        int i9 = qa0Var.b;
        if (i2 == 0) {
            edVar.n0 = i9;
            edVar.I.c(i2, qa0Var, arrayList);
            edVar.K.c(i2, qa0Var, arrayList);
        } else {
            edVar.o0 = i9;
            edVar.J.c(i2, qa0Var, arrayList);
            edVar.M.c(i2, qa0Var, arrayList);
            edVar.L.c(i2, qa0Var, arrayList);
        }
        edVar.P.c(i2, qa0Var, arrayList);
        return qa0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static h60 u(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return h60.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return h60.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return h60.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return h60.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return h60.SSL_3_0;
        }
        o8.j("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static String v(String str, String str2, byte[] bArr) {
        byte[] bArr2 = vw.g;
        byte[] bArr3 = vw.h;
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

    public static ColorStateList w(Context context, r6 r6Var, int i2) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) r6Var.b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (q = j8.q(context, resourceId)) == null) ? r6Var.j(i2) : q;
    }

    public static ColorStateList x(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList q;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (q = j8.q(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : q;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return mg.b(edgeEffect);
        }
        return 0.0f;
    }

    public abstract float C(y20 y20Var);

    public abstract void Q(y20 y20Var, float f2);

    public abstract Typeface o(Context context, vj vjVar, Resources resources, int i2);

    public abstract Typeface p(Context context, yj[] yjVarArr, int i2);

    public Typeface q(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface r(Context context, Resources resources, int i2, String str);

    public abstract void y(x20 x20Var, float f2, float f3);
}
