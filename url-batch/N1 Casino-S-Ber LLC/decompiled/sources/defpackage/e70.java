package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
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
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
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
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class e70 {
    public static ExecutorService b;
    public static final Object a = new Object();
    public static final ja c = new ja(2);
    public static final int[] d = {R.attr.theme, com.derinko.gbini.n1casino.R.attr.theme};
    public static final int[] e = {com.derinko.gbini.n1casino.R.attr.materialThemeOverlay};
    public static final byte[] f = {112, 114, 111, 0};
    public static final byte[] g = {112, 114, 109, 0};
    public static final Object h = new Object();

    public e70() {
        new ConcurrentHashMap();
    }

    public static boolean B(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                t8.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean D(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static int E(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                t8.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int F(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        t8.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void G(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static hu H(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            t8.y("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    hu huVar = new hu();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    huVar.d = duplicate;
                    huVar.a = position;
                    int i6 = position - duplicate.getInt(position);
                    huVar.b = i6;
                    huVar.c = ((ByteBuffer) huVar.d).getShort(i6);
                    return huVar;
                }
            }
        }
        t8.y("Cannot read metadata.");
        return null;
    }

    public static int[] I(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) o8.h0(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static mf[] J(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, mf[] mfVarArr) {
        byte[] bArr3 = o8.m;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, o8.n)) {
                t8.t("Unsupported meta version");
                return null;
            }
            int h0 = (int) o8.h0(fileInputStream, 2);
            byte[] g0 = o8.g0(fileInputStream, (int) o8.h0(fileInputStream, 4), (int) o8.h0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                t8.t("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(g0);
            try {
                mf[] L = L(byteArrayInputStream, bArr2, h0, mfVarArr);
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
        if (Arrays.equals(o8.h, bArr2)) {
            t8.t("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            t8.t("Unsupported meta version");
            return null;
        }
        int h02 = (int) o8.h0(fileInputStream, 1);
        byte[] g02 = o8.g0(fileInputStream, (int) o8.h0(fileInputStream, 4), (int) o8.h0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            t8.t("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(g02);
        try {
            mf[] K = K(byteArrayInputStream2, h02, mfVarArr);
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

    public static mf[] K(ByteArrayInputStream byteArrayInputStream, int i, mf[] mfVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new mf[0];
        }
        if (i != mfVarArr.length) {
            t8.t("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int h0 = (int) o8.h0(byteArrayInputStream, 2);
            iArr[i2] = (int) o8.h0(byteArrayInputStream, 2);
            strArr[i2] = new String(o8.e0(byteArrayInputStream, h0), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            mf mfVar = mfVarArr[i3];
            if (!mfVar.b.equals(strArr[i3])) {
                t8.t("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            mfVar.e = i4;
            mfVar.h = I(byteArrayInputStream, i4);
        }
        return mfVarArr;
    }

    public static mf[] L(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, mf[] mfVarArr) {
        mf mfVar;
        if (byteArrayInputStream.available() == 0) {
            return new mf[0];
        }
        if (i != mfVarArr.length) {
            t8.t("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            o8.h0(byteArrayInputStream, 2);
            String str = new String(o8.e0(byteArrayInputStream, (int) o8.h0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long h0 = o8.h0(byteArrayInputStream, 4);
            int h02 = (int) o8.h0(byteArrayInputStream, 2);
            if (mfVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < mfVarArr.length; i3++) {
                    if (mfVarArr[i3].b.equals(substring)) {
                        mfVar = mfVarArr[i3];
                        break;
                    }
                }
            }
            mfVar = null;
            if (mfVar == null) {
                t8.t("Missing profile key: ".concat(str));
                return null;
            }
            mfVar.d = h0;
            int[] I = I(byteArrayInputStream, h02);
            if (Arrays.equals(bArr, o8.l)) {
                mfVar.e = h02;
                mfVar.h = I;
            }
        }
        return mfVarArr;
    }

    public static mf[] M(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, o8.i)) {
            t8.t("Unsupported version");
            return null;
        }
        int h0 = (int) o8.h0(fileInputStream, 1);
        byte[] g0 = o8.g0(fileInputStream, (int) o8.h0(fileInputStream, 4), (int) o8.h0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            t8.t("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(g0);
        try {
            mf[] N = N(byteArrayInputStream, str, h0);
            byteArrayInputStream.close();
            return N;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static mf[] N(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new mf[0];
        }
        mf[] mfVarArr = new mf[i];
        for (int i3 = 0; i3 < i; i3++) {
            int h0 = (int) o8.h0(byteArrayInputStream, 2);
            int h02 = (int) o8.h0(byteArrayInputStream, 2);
            mfVarArr[i3] = new mf(str, new String(o8.e0(byteArrayInputStream, h0), StandardCharsets.UTF_8), o8.h0(byteArrayInputStream, 4), h02, (int) o8.h0(byteArrayInputStream, 4), (int) o8.h0(byteArrayInputStream, 4), new int[h02], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            mf mfVar = mfVarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = mfVar.f;
            int i6 = mfVar.g;
            TreeMap treeMap = mfVar.i;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) o8.h0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int h03 = (int) o8.h0(byteArrayInputStream, 2);
                while (h03 > 0) {
                    o8.h0(byteArrayInputStream, 2);
                    int h04 = (int) o8.h0(byteArrayInputStream, 1);
                    if (h04 != 6 && h04 != 7) {
                        while (h04 > 0) {
                            o8.h0(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int h05 = (int) o8.h0(byteArrayInputStream, 1); h05 > 0; h05--) {
                                o8.h0(byteArrayInputStream, 2);
                            }
                            h04--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    h03--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                t8.t("Read too much data during profile line parse");
                return null;
            }
            mfVar.h = I(byteArrayInputStream, mfVar.e);
            BitSet valueOf = BitSet.valueOf(o8.e0(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return mfVarArr;
    }

    public static final int O(x10 x10Var, int i) {
        int i2;
        int[] iArr = x10Var.k;
        int i3 = i + 1;
        int length = x10Var.j.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static void R(q4 q4Var, float f2) {
        n00 n00Var = (n00) q4Var.g;
        i9 i9Var = (i9) q4Var.h;
        boolean useCompatPadding = i9Var.getUseCompatPadding();
        boolean preventCornerOverlap = i9Var.getPreventCornerOverlap();
        if (f2 != n00Var.e || n00Var.f != useCompatPadding || n00Var.g != preventCornerOverlap) {
            n00Var.e = f2;
            n00Var.f = useCompatPadding;
            n00Var.g = preventCornerOverlap;
            n00Var.b(null);
            n00Var.invalidateSelf();
        }
        if (!i9Var.getUseCompatPadding()) {
            q4Var.S(0, 0, 0, 0);
            return;
        }
        n00 n00Var2 = (n00) q4Var.g;
        float f3 = n00Var2.e;
        float f4 = n00Var2.a;
        int ceil = (int) Math.ceil(o00.a(f3, f4, i9Var.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(o00.b(f3, f4, i9Var.getPreventCornerOverlap()));
        q4Var.S(ceil, ceil2, ceil, ceil2);
    }

    public static final String S(String str) {
        str.getClass();
        int i = -1;
        int i2 = 0;
        if (!c40.o0(str, ":")) {
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
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = lowerCase.charAt(i3);
                    if (zo.k(charAt, 31) <= 0 || zo.k(charAt, 127) >= 0 || c40.r0(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress r = (k40.m0(str, "[", false) && str.endsWith("]")) ? r(str, 1, str.length() - 1) : r(str, 0, str.length());
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
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        u8 u8Var = new u8();
        while (i2 < address.length) {
            if (i2 == i) {
                u8Var.w(58);
                i2 += i5;
                if (i2 == 16) {
                    u8Var.w(58);
                }
            } else {
                if (i2 > 0) {
                    u8Var.w(58);
                }
                byte b2 = address[i2];
                byte[] bArr = r70.a;
                u8Var.x(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return u8Var.r(u8Var.g, z9.a);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean T(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, mf[] mfVarArr) {
        int i;
        long j;
        int length;
        byte[] bArr2 = o8.l;
        byte[] bArr3 = o8.k;
        byte[] bArr4 = o8.h;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = o8.i;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] l = l(mfVarArr, bArr5);
                o8.C0(byteArrayOutputStream, mfVarArr.length, 1);
                o8.C0(byteArrayOutputStream, l.length, 4);
                byte[] p = o8.p(l);
                o8.C0(byteArrayOutputStream, p.length, 4);
                byteArrayOutputStream.write(p);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                o8.C0(byteArrayOutputStream, mfVarArr.length, 1);
                for (mf mfVar : mfVarArr) {
                    int size = mfVar.i.size() * 4;
                    String v = v(mfVar.a, mfVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    o8.D0(byteArrayOutputStream, v.getBytes(charset).length);
                    o8.D0(byteArrayOutputStream, mfVar.h.length);
                    o8.C0(byteArrayOutputStream, size, 4);
                    o8.C0(byteArrayOutputStream, mfVar.c, 4);
                    byteArrayOutputStream.write(v.getBytes(charset));
                    Iterator it = mfVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        o8.D0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        o8.D0(byteArrayOutputStream, 0);
                    }
                    for (int i3 : mfVar.h) {
                        o8.D0(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = o8.j;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] l2 = l(mfVarArr, bArr6);
                o8.C0(byteArrayOutputStream, mfVarArr.length, 1);
                o8.C0(byteArrayOutputStream, l2.length, 4);
                byte[] p2 = o8.p(l2);
                o8.C0(byteArrayOutputStream, p2.length, 4);
                byteArrayOutputStream.write(p2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            o8.D0(byteArrayOutputStream, mfVarArr.length);
            for (mf mfVar2 : mfVarArr) {
                String str = mfVar2.a;
                TreeMap treeMap = mfVar2.i;
                String v2 = v(str, mfVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                o8.D0(byteArrayOutputStream, v2.getBytes(charset2).length);
                o8.D0(byteArrayOutputStream, treeMap.size());
                o8.D0(byteArrayOutputStream, mfVar2.h.length);
                o8.C0(byteArrayOutputStream, mfVar2.c, 4);
                byteArrayOutputStream.write(v2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    o8.D0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : mfVar2.h) {
                    o8.D0(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            o8.D0(byteArrayOutputStream2, mfVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (mf mfVar3 : mfVarArr) {
                o8.C0(byteArrayOutputStream2, mfVar3.c, 4);
                o8.C0(byteArrayOutputStream2, mfVar3.d, 4);
                o8.C0(byteArrayOutputStream2, mfVar3.g, 4);
                String v3 = v(mfVar3.a, mfVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = v3.getBytes(charset3).length;
                o8.D0(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(v3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            wb0 wb0Var = new wb0(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(wb0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < mfVarArr.length) {
                try {
                    mf mfVar4 = mfVarArr[i7];
                    o8.D0(byteArrayOutputStream3, i7);
                    o8.D0(byteArrayOutputStream3, mfVar4.e);
                    i8 = i8 + 4 + (mfVar4.e * i5);
                    int[] iArr = mfVar4.h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        o8.D0(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            wb0 wb0Var2 = new wb0(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(wb0Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < mfVarArr.length; i13++) {
                try {
                    mf mfVar5 = mfVarArr[i13];
                    Iterator it3 = mfVar5.i.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        Z(byteArrayOutputStream4, i14, mfVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            a0(byteArrayOutputStream4, mfVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            o8.D0(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i12 + 6;
                            o8.C0(byteArrayOutputStream3, length4, 4);
                            o8.D0(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i15 + length4;
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
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            wb0 wb0Var3 = new wb0(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(wb0Var3);
            long size2 = 12 + (arrayList.size() * 16);
            o8.C0(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                wb0 wb0Var4 = (wb0) arrayList.get(i16);
                int i17 = wb0Var4.a;
                byte[] bArr7 = wb0Var4.b;
                if (i17 != 1) {
                    i = i11;
                    if (i17 == i) {
                        j = 1;
                    } else if (i17 == 3) {
                        j = 2;
                    } else if (i17 == 4) {
                        j = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                o8.C0(byteArrayOutputStream, j, 4);
                o8.C0(byteArrayOutputStream, size2, 4);
                if (wb0Var4.c) {
                    long length5 = bArr7.length;
                    byte[] p3 = o8.p(bArr7);
                    arrayList2.add(p3);
                    o8.C0(byteArrayOutputStream, p3.length, 4);
                    o8.C0(byteArrayOutputStream, length5, 4);
                    length = p3.length;
                } else {
                    arrayList2.add(bArr7);
                    o8.C0(byteArrayOutputStream, bArr7.length, 4);
                    o8.C0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                i11 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
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

    public static boolean U(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static Context V(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, i, i2);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof kd) && ((kd) context).a == i3;
        if (i3 == 0 || z) {
            return context;
        }
        kd kdVar = new kd(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = obtainStyledAttributes2.getResourceId(i4, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                kdVar.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, d);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            kdVar.getTheme().applyStyle(resourceId, true);
        }
        return kdVar;
    }

    public static Context W(Context context, AttributeSet attributeSet, int i, int i2) {
        return V(i, i2, context, attributeSet, new int[0]);
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, mf mfVar) {
        a0(byteArrayOutputStream, mfVar);
        int i = mfVar.g;
        int[] iArr = mfVar.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            o8.D0(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : mfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, mf mfVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        o8.D0(byteArrayOutputStream, str.getBytes(charset).length);
        o8.D0(byteArrayOutputStream, mfVar.e);
        o8.C0(byteArrayOutputStream, mfVar.f, 4);
        o8.C0(byteArrayOutputStream, mfVar.c, 4);
        o8.C0(byteArrayOutputStream, mfVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, int i, mf mfVar) {
        int i2 = mfVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : mfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final ru a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new ru(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, mf mfVar) {
        int i = 0;
        for (Map.Entry entry : mfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                o8.D0(byteArrayOutputStream, intValue - i);
                o8.D0(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static final String b(Object[] objArr, int i, int i2, l lVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == lVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = E(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        defpackage.t8.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean d2 = d(i, rect, rect2);
        if (!d(i, rect, rect3) && d2) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            t8.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        t8.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
    }

    public static void e(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new xo(2, 36, 1));
        }
    }

    public static int f(kz kzVar, hh hhVar, View view, View view2, xy xyVar, boolean z) {
        if (xyVar.v() == 0 || kzVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(xy.H(view) - xy.H(view2)) + 1;
        }
        return Math.min(hhVar.l(), hhVar.b(view2) - hhVar.e(view));
    }

    public static int g(kz kzVar, hh hhVar, View view, View view2, xy xyVar, boolean z, boolean z2) {
        if (xyVar.v() == 0 || kzVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (kzVar.b() - Math.max(xy.H(view), xy.H(view2))) - 1) : Math.max(0, Math.min(xy.H(view), xy.H(view2)));
        if (z) {
            return Math.round((max * (Math.abs(hhVar.b(view2) - hhVar.e(view)) / (Math.abs(xy.H(view) - xy.H(view2)) + 1))) + (hhVar.k() - hhVar.e(view)));
        }
        return max;
    }

    public static int h(kz kzVar, hh hhVar, View view, View view2, xy xyVar, boolean z) {
        if (xyVar.v() == 0 || kzVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return kzVar.b();
        }
        return (int) (((hhVar.b(view2) - hhVar.e(view)) / (Math.abs(xy.H(view) - xy.H(view2)) + 1)) * kzVar.b());
    }

    public static float[] i(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static final void j(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uj k(Context context) {
        ProviderInfo providerInfo;
        sj sjVar;
        ApplicationInfo applicationInfo;
        int i = 15;
        dh jeVar = Build.VERSION.SDK_INT >= 28 ? new je(i) : new dh(i);
        PackageManager packageManager = context.getPackageManager();
        zo.g(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] k = jeVar.k(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : k) {
                    arrayList.add(signature.toByteArray());
                }
                sjVar = new sj(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (sjVar != null) {
                return null;
            }
            return new uj(new tj(context, sjVar));
        }
        sjVar = null;
        if (sjVar != null) {
        }
    }

    public static byte[] l(mf[] mfVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (mf mfVar : mfVarArr) {
            i2 += ((((mfVar.g * 2) + 7) & (-8)) / 8) + (mfVar.e * 2) + v(mfVar.a, mfVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + mfVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, o8.j)) {
            int length = mfVarArr.length;
            while (i < length) {
                mf mfVar2 = mfVarArr[i];
                Y(byteArrayOutputStream, mfVar2, v(mfVar2.a, mfVar2.b, bArr));
                X(byteArrayOutputStream, mfVar2);
                i++;
            }
        } else {
            for (mf mfVar3 : mfVarArr) {
                Y(byteArrayOutputStream, mfVar3, v(mfVar3.a, mfVar3.b, bArr));
            }
            int length2 = mfVarArr.length;
            while (i < length2) {
                X(byteArrayOutputStream, mfVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rw[] q(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = i(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e2);
                            }
                        }
                        arrayList.add(new rw(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new rw(str.charAt(i3), new float[0]));
        }
        return (rw[]) arrayList.toArray(new rw[i]);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress r(String str, int i, int i2) {
        int i3;
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (i5 == 16) {
                return null;
            }
            int i8 = i4 + 2;
            if (i8 <= i2 && k40.l0(str, "::", i4, false)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                int i9 = 0;
                i4 = i7;
                while (i4 < i2) {
                }
                i3 = i4 - i7;
                return i3 == 0 ? null : null;
            }
            if (i5 != 0) {
                if (k40.l0(str, ":", i4, false)) {
                    i4++;
                } else {
                    if (!k40.l0(str, ".", i4, false)) {
                        return null;
                    }
                    int i10 = i5 - 2;
                    int i11 = i10;
                    while (i7 < i2) {
                        if (i11 == 16) {
                            return null;
                        }
                        if (i11 != i10) {
                            if (str.charAt(i7) != '.') {
                                return null;
                            }
                            i7++;
                        }
                        int i12 = 0;
                        int i13 = i7;
                        while (i13 < i2) {
                            char charAt = str.charAt(i13);
                            if (zo.k(charAt, 48) < 0 || zo.k(charAt, 57) > 0) {
                                break;
                            }
                            if ((i12 == 0 && i7 != i13) || ((i12 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i13++;
                        }
                        if (i13 - i7 == 0) {
                            return null;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                        i7 = i13;
                    }
                    if (i11 != i5 + 2) {
                        return null;
                    }
                    i5 += 2;
                }
            }
            i7 = i4;
            int i92 = 0;
            i4 = i7;
            while (i4 < i2) {
                int o = r70.o(str.charAt(i4));
                if (o == -1) {
                    break;
                }
                i92 = (i92 << 4) + o;
                i4++;
            }
            i3 = i4 - i7;
            if (i3 == 0 && i3 <= 4) {
                int i14 = i5 + 1;
                bArr[i5] = (byte) (255 & (i92 >>> 8));
                i5 += 2;
                bArr[i14] = (byte) (i92 & 255);
            }
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i15 = i5 - i6;
            System.arraycopy(bArr, i6, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final boolean s(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static ja0 t(ad adVar, int i, ArrayList arrayList, ja0 ja0Var) {
        int i2;
        int i3 = i == 0 ? adVar.n0 : adVar.o0;
        if (i3 != -1 && (ja0Var == null || i3 != ja0Var.b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                ja0 ja0Var2 = (ja0) arrayList.get(i4);
                if (ja0Var2.b == i3) {
                    if (ja0Var != null) {
                        ja0Var.c(i, ja0Var2);
                        arrayList.remove(ja0Var);
                    }
                    ja0Var = ja0Var2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return ja0Var;
        }
        if (ja0Var == null) {
            if (adVar instanceof an) {
                an anVar = (an) adVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= anVar.r0) {
                        i2 = -1;
                        break;
                    }
                    ad adVar2 = anVar.q0[i5];
                    if ((i == 0 && (i2 = adVar2.n0) != -1) || (i == 1 && (i2 = adVar2.o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        ja0 ja0Var3 = (ja0) arrayList.get(i6);
                        if (ja0Var3.b == i2) {
                            ja0Var = ja0Var3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (ja0Var == null) {
                ja0Var = new ja0();
                ja0Var.a = new ArrayList();
                ja0Var.d = null;
                ja0Var.e = -1;
                int i7 = ja0.f;
                ja0.f = i7 + 1;
                ja0Var.b = i7;
                ja0Var.c = i;
            }
            arrayList.add(ja0Var);
        }
        ArrayList arrayList2 = ja0Var.a;
        if (arrayList2.contains(adVar)) {
            return ja0Var;
        }
        arrayList2.add(adVar);
        if (adVar instanceof om) {
            om omVar = (om) adVar;
            omVar.t0.c(omVar.u0 == 0 ? 1 : 0, ja0Var, arrayList);
        }
        int i8 = ja0Var.b;
        if (i == 0) {
            adVar.n0 = i8;
            adVar.I.c(i, ja0Var, arrayList);
            adVar.K.c(i, ja0Var, arrayList);
        } else {
            adVar.o0 = i8;
            adVar.J.c(i, ja0Var, arrayList);
            adVar.M.c(i, ja0Var, arrayList);
            adVar.L.c(i, ja0Var, arrayList);
        }
        adVar.P.c(i, ja0Var, arrayList);
        return ja0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static z50 u(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return z50.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return z50.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return z50.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return z50.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return z50.SSL_3_0;
        }
        t8.k("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static String v(String str, String str2, byte[] bArr) {
        byte[] bArr2 = o8.k;
        byte[] bArr3 = o8.l;
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

    public static nx w(String str) {
        if (str.equals("http/1.0")) {
            return nx.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return nx.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return nx.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return nx.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return nx.SPDY_3;
        }
        if (str.equals("quic")) {
            return nx.QUIC;
        }
        t8.y("Unexpected protocol: ".concat(str));
        return null;
    }

    public static ColorStateList x(Context context, a6 a6Var, int i) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) a6Var.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q = zo.q(context, resourceId)) == null) ? a6Var.j(i) : q;
    }

    public static ColorStateList y(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList q;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q = zo.q(context, resourceId)) == null) ? typedArray.getColorStateList(i) : q;
    }

    public static Drawable z(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable s;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (s = zo.s(context, resourceId)) == null) ? typedArray.getDrawable(i) : s;
    }

    public abstract InputFilter[] A(InputFilter[] inputFilterArr);

    public abstract void P(boolean z);

    public abstract void Q(boolean z);

    public abstract Typeface m(Context context, ak akVar, Resources resources, int i);

    public abstract Typeface n(Context context, dk[] dkVarArr, int i);

    public Typeface o(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface p(Context context, Resources resources, int i, String str);
}
