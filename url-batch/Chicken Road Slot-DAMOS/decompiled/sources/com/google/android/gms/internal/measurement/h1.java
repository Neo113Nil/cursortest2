package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h1 implements e2, b7.i, a8.m, w7.a, p1 {

    /* renamed from: e, reason: collision with root package name */
    public static final h1 f2355e = new h1(0);

    /* renamed from: i, reason: collision with root package name */
    public static final h1 f2356i = new h1(2);

    /* renamed from: r, reason: collision with root package name */
    public static final h1 f2357r = new h1(3);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ h1 f2358s = new h1(10);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ h1 f2359t = new h1(12);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ h1 f2360u = new h1(16);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2361d;

    public /* synthetic */ h1(int i3) {
        this.f2361d = i3;
    }

    public static final t1 c(long j, Object obj) {
        t1 t1Var = (t1) z2.i(j, obj);
        if (((p0) t1Var).f2659d) {
            return t1Var;
        }
        int size = t1Var.size();
        t1 j3 = t1Var.j(size == 0 ? 10 : size + size);
        z2.j(j, obj, j3);
        return j3;
    }

    public static tf d(String str) {
        boolean z10;
        bg B;
        wf wfVar = vf.f2896e;
        ag c10 = mf.c();
        bg bgVar = c10.f2149b;
        if (bgVar == sf.f2803u) {
            bgVar = null;
            mf.b(c10, null);
            z10 = true;
        } else {
            z10 = false;
        }
        if (bgVar == null) {
            UUID b10 = nf.f2582c.b();
            String a9 = ff.a(b10);
            b1.j jVar = qf.f2716u;
            b8.i iVar = (b8.i) mf.f2542a.get();
            if (!iVar.isEmpty()) {
                iVar.forEach(new pf(1));
            }
            B = new rf(b10, a9, str, wfVar, jVar, c10);
        } else {
            B = bgVar instanceof hf ? ((hf) bgVar).B(str, wfVar, false, c10) : bgVar.I(str, wfVar, c10);
        }
        mf.b(c10, B);
        return new tf(B, z10);
    }

    public static final b2 e(Object obj, Object obj2) {
        b2 b2Var = (b2) obj;
        b2 b2Var2 = (b2) obj2;
        if (!b2Var2.isEmpty()) {
            if (!b2Var.f2160d) {
                b2Var = b2Var.a();
            }
            b2Var.c();
            if (!b2Var2.isEmpty()) {
                b2Var.putAll(b2Var2);
            }
        }
        return b2Var;
    }

    public static /* bridge */ u2 g(Object obj) {
        k1 k1Var = (k1) obj;
        u2 u2Var = k1Var.zzc;
        if (u2Var != u2.f2837f) {
            return u2Var;
        }
        u2 a9 = u2.a();
        k1Var.zzc = a9;
        return a9;
    }

    public static boolean h(int i3, androidx.datastore.preferences.protobuf.j jVar, Object obj) {
        y0 y0Var = (y0) jVar.f567d;
        int i10 = jVar.f564a;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            jVar.Q(0);
            ((u2) obj).d(i11 << 3, Long.valueOf(y0Var.r()));
            return true;
        }
        if (i12 == 1) {
            jVar.Q(1);
            ((u2) obj).d((i11 << 3) | 1, Long.valueOf(y0Var.t()));
            return true;
        }
        if (i12 == 2) {
            ((u2) obj).d((i11 << 3) | 2, jVar.Y());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i3 != 0) {
                    return false;
                }
                a2.r.o("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i12 != 5) {
                a2.r.m();
                return false;
            }
            jVar.Q(5);
            ((u2) obj).d(5 | (i11 << 3), Integer.valueOf(y0Var.u()));
            return true;
        }
        u2 a9 = u2.a();
        int i13 = i11 << 3;
        int i14 = i3 + 1;
        if (i14 >= 100) {
            a2.r.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (jVar.X() != Integer.MAX_VALUE && h(i14, jVar, a9)) {
        }
        if ((i13 | 4) != jVar.f564a) {
            a2.r.o("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (a9.f2842e) {
            a9.f2842e = false;
        }
        ((u2) obj).d(i13 | 3, a9);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public boolean a(Class cls) {
        switch (this.f2361d) {
            case 0:
                return k1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // b7.i
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i3 = da.f2231k;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public n2 b(Class cls) {
        switch (this.f2361d) {
            case 0:
                if (!k1.class.isAssignableFrom(cls)) {
                    te.a1.e("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (n2) k1.n(cls.asSubclass(k1.class)).s(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // w7.a
    public Object f(Task task) {
        k1 d10;
        t9 t9Var = (t9) task.getResult();
        db z10 = eb.z();
        String str = t9Var.f2815d;
        z10.b();
        ((eb) z10.f2389e).A(str);
        String str2 = t9Var.f2817i;
        z10.b();
        ((eb) z10.f2389e).C(str2);
        boolean z11 = t9Var.f2820t;
        z10.b();
        ((eb) z10.f2389e).F(z11);
        long j = t9Var.f2821u;
        z10.b();
        ((eb) z10.f2389e).G(j);
        byte[] bArr = t9Var.f2816e;
        if (bArr != null) {
            u0 k10 = v0.k(bArr, 0, bArr.length);
            z10.b();
            ((eb) z10.f2389e).B(k10);
        }
        for (s9 s9Var : t9Var.f2818r) {
            for (w9 w9Var : s9Var.f2780e) {
                int i3 = w9Var.f2942u;
                String str3 = w9Var.f2936d;
                if (i3 == 1) {
                    fb z12 = gb.z();
                    z12.g(str3);
                    if (i3 != 1) {
                        te.a1.e("Not a long type");
                        return null;
                    }
                    long j3 = w9Var.f2937e;
                    z12.b();
                    ((gb) z12.f2389e).C(j3);
                    d10 = z12.d();
                } else if (i3 == 2) {
                    fb z13 = gb.z();
                    z13.g(str3);
                    if (i3 != 2) {
                        te.a1.e("Not a boolean type");
                        return null;
                    }
                    boolean z14 = w9Var.f2938i;
                    z13.b();
                    ((gb) z13.f2389e).D(z14);
                    d10 = z13.d();
                } else if (i3 == 3) {
                    fb z15 = gb.z();
                    z15.g(str3);
                    if (i3 != 3) {
                        te.a1.e("Not a double type");
                        return null;
                    }
                    double d11 = w9Var.f2939r;
                    z15.b();
                    ((gb) z15.f2389e).E(d11);
                    d10 = z15.d();
                } else if (i3 == 4) {
                    fb z16 = gb.z();
                    z16.g(str3);
                    if (i3 != 4) {
                        te.a1.e("Not a String type");
                        return null;
                    }
                    String str4 = w9Var.f2940s;
                    c7.c0.g(str4);
                    z16.b();
                    ((gb) z16.f2389e).F(str4);
                    d10 = z16.d();
                } else {
                    if (i3 != 5) {
                        te.a1.e(v4.a.n(new StringBuilder(String.valueOf(i3).length() + 24), "Unrecognized flag type: ", i3));
                        return null;
                    }
                    fb z17 = gb.z();
                    z17.g(str3);
                    if (i3 != 5) {
                        te.a1.e("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = w9Var.f2941t;
                    c7.c0.g(bArr2);
                    u0 k11 = v0.k(bArr2, 0, bArr2.length);
                    z17.b();
                    ((gb) z17.f2389e).G(k11);
                    d10 = z17.d();
                }
                z10.b();
                ((eb) z10.f2389e).D((gb) d10);
            }
            String[] strArr = s9Var.f2781i;
            if (strArr != null) {
                for (String str5 : strArr) {
                    z10.b();
                    ((eb) z10.f2389e).E(str5);
                }
            }
        }
        return (eb) z10.d();
    }

    @Override // a8.m
    public Object get() {
        switch (this.f2361d) {
            case 12:
                Object obj = sa.j;
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ua.f2851a);
                return newSingleThreadScheduledExecutor instanceof f8.u0 ? (f8.u0) newSingleThreadScheduledExecutor : new f8.u0(newSingleThreadScheduledExecutor);
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z10 = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i3 = runningAppProcessInfo.importance;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 17);
                    sb2.append("Memory state is: ");
                    sb2.append(i3);
                    Log.i("PhenotypeProcessReaper", sb2.toString());
                    if (runningAppProcessInfo.importance >= 400) {
                        z10 = true;
                    }
                } catch (RuntimeException e2) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e2);
                }
                return new Boolean(z10);
        }
    }
}
