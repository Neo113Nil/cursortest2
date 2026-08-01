package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class ia {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f2397a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f2398b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2399c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static volatile b1.j f2400d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile b1.j f2401e;

    public static int A(o2 o2Var, int i3, byte[] bArr, int i10, int i11, t1 t1Var, r0 r0Var) {
        k1 a9 = o2Var.a();
        o2 o2Var2 = o2Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        r0 r0Var2 = r0Var;
        int t6 = t(a9, o2Var2, bArr2, i10, i12, r0Var2);
        o2Var2.h(a9);
        r0Var2.f2722c = a9;
        t1Var.add(a9);
        while (t6 < i12) {
            r0 r0Var3 = r0Var2;
            int i13 = i12;
            int a10 = a(bArr2, t6, r0Var3);
            if (i3 != r0Var3.f2720a) {
                break;
            }
            byte[] bArr3 = bArr2;
            o2 o2Var3 = o2Var2;
            k1 a11 = o2Var3.a();
            t6 = t(a11, o2Var3, bArr3, a10, i13, r0Var3);
            o2Var2 = o2Var3;
            bArr2 = bArr3;
            i12 = i13;
            r0Var2 = r0Var3;
            o2Var2.h(a11);
            r0Var2.f2722c = a11;
            t1Var.add(a11);
        }
        return t6;
    }

    public static int B(int i3, byte[] bArr, int i10, int i11, u2 u2Var, r0 r0Var) {
        if ((i3 >>> 3) == 0) {
            a2.r.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i12 = i3 & 7;
        if (i12 == 0) {
            int g = g(bArr, i10, r0Var);
            u2Var.d(i3, Long.valueOf(r0Var.f2721b));
            return g;
        }
        if (i12 == 1) {
            u2Var.d(i3, Long.valueOf(l(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int a9 = a(bArr, i10, r0Var);
            int i13 = r0Var.f2720a;
            if (i13 < 0) {
                a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i13 > bArr.length - a9) {
                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i13 == 0) {
                u2Var.d(i3, v0.f2860e);
            } else {
                u2Var.d(i3, v0.k(bArr, a9, i13));
            }
            return a9 + i13;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                u2Var.d(i3, Integer.valueOf(i(i10, bArr)));
                return i10 + 4;
            }
            a2.r.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i14 = (i3 & (-8)) | 4;
        u2 a10 = u2.a();
        int i15 = r0Var.f2723d + 1;
        r0Var.f2723d = i15;
        if (i15 >= 100) {
            a2.r.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int a11 = a(bArr, i10, r0Var);
            int i17 = r0Var.f2720a;
            if (i17 == i14) {
                i16 = i17;
                i10 = a11;
                break;
            }
            i10 = B(i17, bArr, a11, i11, a10, r0Var);
            i16 = i17;
        }
        r0Var.f2723d--;
        if (i10 > i11 || i16 != i14) {
            a2.r.o("Failed to parse the message.");
            return 0;
        }
        u2Var.d(i3, a10);
        return i10;
    }

    public static int C(int i3, byte[] bArr, int i10, int i11, r0 r0Var) {
        if ((i3 >>> 3) == 0) {
            a2.r.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i12 = i3 & 7;
        if (i12 == 0) {
            return g(bArr, i10, r0Var);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return a(bArr, i10, r0Var) + r0Var.f2720a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            a2.r.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i13 = (i3 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = a(bArr, i10, r0Var);
            i14 = r0Var.f2720a;
            if (i14 == i13) {
                break;
            }
            i10 = C(i14, bArr, i10, i11, r0Var);
        }
        if (i10 <= i11 && i14 == i13) {
            return i10;
        }
        a2.r.o("Failed to parse the message.");
        return 0;
    }

    public static int a(byte[] bArr, int i3, r0 r0Var) {
        int i10 = i3 + 1;
        byte b10 = bArr[i3];
        if (b10 < 0) {
            return e(b10, bArr, i10, r0Var);
        }
        r0Var.f2720a = b10;
        return i10;
    }

    public static final File b(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new androidx.datastore.preferences.protobuf.k("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new androidx.datastore.preferences.protobuf.k("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new androidx.datastore.preferences.protobuf.k("Did not expect uri to have authority");
    }

    public static void c(String str, List list, int i3) {
        if (list.size() == i3) {
            return;
        }
        a2.r.d(i3, list.size(), str, " operation requires ");
    }

    public static /* synthetic */ boolean d(int i3, rg rgVar, StringBuilder sb2) {
        if (i3 - 1 != 0 || rgVar == rg.f2766a) {
            return false;
        }
        sb2.append(rgVar.a());
        sb2.append('.');
        sb2.append(rgVar.b());
        sb2.append(':');
        sb2.append(rgVar.c());
        return true;
    }

    public static int e(int i3, byte[] bArr, int i10, r0 r0Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i3 & 127;
        if (b10 >= 0) {
            r0Var.f2720a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            r0Var.f2720a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            r0Var.f2720a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            r0Var.f2720a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                r0Var.f2720a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static void f(String str, List list, int i3) {
        if (list.size() >= i3) {
            return;
        }
        a2.r.d(i3, list.size(), str, " operation requires at least ");
    }

    public static int g(byte[] bArr, int i3, r0 r0Var) {
        long j = bArr[i3];
        int i10 = i3 + 1;
        if (j >= 0) {
            r0Var.f2721b = j;
            return i10;
        }
        int i11 = i3 + 2;
        byte b10 = bArr[i10];
        long j3 = (j & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        r0Var.f2721b = j3;
        return i11;
    }

    public static void h(String str, int i3, ArrayList arrayList) {
        if (arrayList.size() <= i3) {
            return;
        }
        a2.r.d(i3, arrayList.size(), str, " operation requires at most ");
    }

    public static int i(int i3, byte[] bArr) {
        int i10 = bArr[i3] & 255;
        int i11 = bArr[i3 + 1] & 255;
        int i12 = bArr[i3 + 2] & 255;
        return ((bArr[i3 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static f8.r j(Context context, Callable callable, Executor executor) {
        v5 v5Var = new v5(9, callable);
        if (s(context)) {
            f8.z0 z0Var = new f8.z0();
            z0Var.f4204w = new f8.y0(z0Var, v5Var);
            executor.execute(z0Var);
            return z0Var;
        }
        f8.x0 x0Var = new f8.x0();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ga gaVar = new ga(atomicBoolean, context, x0Var, v5Var, executor);
        context.registerReceiver(gaVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!s(context) || !atomicBoolean.compareAndSet(false, true)) {
            x0Var.a(new ha(0, atomicBoolean, x0Var, context, gaVar), f8.d0.f4128d);
            return x0Var;
        }
        try {
            context.unregisterReceiver(gaVar);
        } catch (IllegalArgumentException e2) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
        }
        f8.z0 z0Var2 = new f8.z0();
        z0Var2.f4204w = new f8.y0(z0Var2, v5Var);
        executor.execute(z0Var2);
        x0Var.n(z0Var2);
        return x0Var;
    }

    public static boolean k(f5 f5Var) {
        if (f5Var == null) {
            return false;
        }
        Double g = f5Var.g();
        return !g.isNaN() && g.doubleValue() >= 0.0d && g.equals(Double.valueOf(Math.floor(g.doubleValue())));
    }

    public static long l(int i3, byte[] bArr) {
        return (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48) | ((bArr[i3 + 7] & 255) << 56);
    }

    public static o5 m(String str) {
        o5 o5Var = null;
        if (str != null && !str.isEmpty()) {
            o5Var = (o5) o5.f2634z0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (o5Var != null) {
            return o5Var;
        }
        te.a1.e(v4.a.k("Unsupported commandId ", str));
        return null;
    }

    public static int n(byte[] bArr, int i3, r0 r0Var) {
        int a9 = a(bArr, i3, r0Var);
        int i10 = r0Var.f2720a;
        if (i10 < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i10 == 0) {
            r0Var.f2722c = "";
            return a9;
        }
        r0Var.f2722c = b3.d(bArr, a9, i10);
        return a9 + i10;
    }

    public static boolean o(f5 f5Var, f5 f5Var2) {
        if (!f5Var.getClass().equals(f5Var2.getClass())) {
            return false;
        }
        if ((f5Var instanceof j5) || (f5Var instanceof d5)) {
            return true;
        }
        if (!(f5Var instanceof l3)) {
            return f5Var instanceof i5 ? f5Var.f().equals(f5Var2.f()) : f5Var instanceof d2 ? f5Var.b().equals(f5Var2.b()) : f5Var == f5Var2;
        }
        if (Double.isNaN(f5Var.g().doubleValue()) || Double.isNaN(f5Var2.g().doubleValue())) {
            return false;
        }
        return f5Var.g().equals(f5Var2.g());
    }

    public static int p(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static int q(byte[] bArr, int i3, r0 r0Var) {
        int a9 = a(bArr, i3, r0Var);
        int i10 = r0Var.f2720a;
        if (i10 < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i10 > bArr.length - a9) {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i10 == 0) {
            r0Var.f2722c = v0.f2860e;
            return a9;
        }
        r0Var.f2722c = v0.k(bArr, a9, i10);
        return a9 + i10;
    }

    public static double r(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s(Context context) {
        boolean z10;
        if (f2398b) {
            return true;
        }
        synchronized (ia.class) {
            try {
                if (f2398b) {
                    return true;
                }
                int i3 = 1;
                while (true) {
                    z10 = false;
                    if (i3 > 2) {
                        break;
                    }
                    if (f2397a == null) {
                        f2397a = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = f2397a;
                    if (userManager == null) {
                        z10 = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e2) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                        f2397a = null;
                        i3++;
                    }
                }
                if (z10) {
                    f2397a = null;
                }
                if (z10) {
                    f2398b = true;
                }
                return z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int t(Object obj, o2 o2Var, byte[] bArr, int i3, int i10, r0 r0Var) {
        int i11 = i3 + 1;
        int i12 = bArr[i3];
        if (i12 < 0) {
            i11 = e(i12, bArr, i11, r0Var);
            i12 = r0Var.f2720a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i14 = r0Var.f2723d + 1;
        r0Var.f2723d = i14;
        if (i14 >= 100) {
            a2.r.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i15 = i13 + i12;
        o2Var.c(obj, bArr, i13, i15, r0Var);
        r0Var.f2723d--;
        r0Var.f2722c = obj;
        return i15;
    }

    public static Object u(f5 f5Var) {
        if (f5.f2281c.equals(f5Var)) {
            return null;
        }
        if (f5.f2280b.equals(f5Var)) {
            return "";
        }
        if (f5Var instanceof c5) {
            return w((c5) f5Var);
        }
        if (!(f5Var instanceof n1)) {
            return !f5Var.g().isNaN() ? f5Var.g() : f5Var.f();
        }
        ArrayList arrayList = new ArrayList();
        n1 n1Var = (n1) f5Var;
        int i3 = 0;
        while (i3 < n1Var.q()) {
            if (i3 >= n1Var.q()) {
                throw new NoSuchElementException(v4.a.n(new StringBuilder(String.valueOf(i3).length() + 21), "Out of bounds index: ", i3));
            }
            int i10 = i3 + 1;
            Object u2 = u(n1Var.r(i3));
            if (u2 != null) {
                arrayList.add(u2);
            }
            i3 = i10;
        }
        return arrayList;
    }

    public static int v(Object obj, o2 o2Var, byte[] bArr, int i3, int i10, int i11, r0 r0Var) {
        g2 g2Var = (g2) o2Var;
        int i12 = r0Var.f2723d + 1;
        r0Var.f2723d = i12;
        if (i12 >= 100) {
            a2.r.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int y3 = g2Var.y(obj, bArr, i3, i10, i11, r0Var);
        r0Var.f2723d--;
        r0Var.f2722c = obj;
        return y3;
    }

    public static HashMap w(c5 c5Var) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(c5Var.f2190d.keySet());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str = (String) obj;
            Object u2 = u(c5Var.c(str));
            if (u2 != null) {
                hashMap.put(str, u2);
            }
        }
        return hashMap;
    }

    public static int x(int i3, byte[] bArr, int i10, int i11, t1 t1Var, r0 r0Var) {
        l1 l1Var = (l1) t1Var;
        int a9 = a(bArr, i10, r0Var);
        l1Var.f(r0Var.f2720a);
        while (a9 < i11) {
            int a10 = a(bArr, a9, r0Var);
            if (i3 != r0Var.f2720a) {
                break;
            }
            a9 = a(bArr, a10, r0Var);
            l1Var.f(r0Var.f2720a);
        }
        return a9;
    }

    public static void y(e7 e7Var) {
        int p4 = p(e7Var.h("runtime.counter").g().doubleValue() + 1.0d);
        if (p4 <= 1000000) {
            e7Var.f("runtime.counter", new l3(Double.valueOf(p4)));
        } else {
            kotlin.collections.i0.l("Instructions allowed exceeded");
        }
    }

    public static int z(byte[] bArr, int i3, t1 t1Var, r0 r0Var) {
        l1 l1Var = (l1) t1Var;
        int a9 = a(bArr, i3, r0Var);
        int i10 = r0Var.f2720a + a9;
        while (a9 < i10) {
            a9 = a(bArr, a9, r0Var);
            l1Var.f(r0Var.f2720a);
        }
        if (a9 == i10) {
            return a9;
        }
        a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }
}
