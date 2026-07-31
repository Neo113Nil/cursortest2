package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class bv0 extends bz {

    /* renamed from: f, reason: collision with root package name */
    private final tq0 f3531f;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f3533h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f3534i;

    /* renamed from: j, reason: collision with root package name */
    private int f3535j;

    /* renamed from: k, reason: collision with root package name */
    private gz f3536k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3537l;

    /* renamed from: n, reason: collision with root package name */
    private float f3539n;

    /* renamed from: o, reason: collision with root package name */
    private float f3540o;

    /* renamed from: p, reason: collision with root package name */
    private float f3541p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3542q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f3543r;

    /* renamed from: s, reason: collision with root package name */
    private s50 f3544s;

    /* renamed from: g, reason: collision with root package name */
    private final Object f3532g = new Object();

    /* renamed from: m, reason: collision with root package name */
    private boolean f3538m = true;

    public bv0(tq0 tq0Var, float f7, boolean z6, boolean z7) {
        this.f3531f = tq0Var;
        this.f3539n = f7;
        this.f3533h = z6;
        this.f3534i = z7;
    }

    private final void A6(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.av0
            @Override // java.lang.Runnable
            public final void run() {
                bv0.this.v6(hashMap);
            }
        });
    }

    private final void z6(final int i7, final int i8, final boolean z6, final boolean z7) {
        wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zu0
            @Override // java.lang.Runnable
            public final void run() {
                bv0.this.u6(i7, i8, z6, z7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void M5(gz gzVar) {
        synchronized (this.f3532g) {
            this.f3536k = gzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float b() {
        float f7;
        synchronized (this.f3532g) {
            f7 = this.f3541p;
        }
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float d() {
        float f7;
        synchronized (this.f3532g) {
            f7 = this.f3540o;
        }
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float e() {
        float f7;
        synchronized (this.f3532g) {
            f7 = this.f3539n;
        }
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final int f() {
        int i7;
        synchronized (this.f3532g) {
            i7 = this.f3535j;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final gz h() {
        gz gzVar;
        synchronized (this.f3532g) {
            gzVar = this.f3536k;
        }
        return gzVar;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void j() {
        A6("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void k() {
        A6("play", null);
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final boolean l() {
        boolean z6;
        synchronized (this.f3532g) {
            z6 = false;
            if (this.f3533h && this.f3542q) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void m() {
        A6("stop", null);
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final boolean n() {
        boolean z6;
        boolean l7 = l();
        synchronized (this.f3532g) {
            z6 = false;
            if (!l7) {
                try {
                    if (this.f3543r && this.f3534i) {
                        z6 = true;
                    }
                } finally {
                }
            }
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final boolean r() {
        boolean z6;
        synchronized (this.f3532g) {
            z6 = this.f3538m;
        }
        return z6;
    }

    public final void t6(float f7, float f8, int i7, boolean z6, float f9) {
        boolean z7;
        boolean z8;
        int i8;
        synchronized (this.f3532g) {
            z7 = true;
            if (f8 == this.f3539n && f9 == this.f3541p) {
                z7 = false;
            }
            this.f3539n = f8;
            this.f3540o = f7;
            z8 = this.f3538m;
            this.f3538m = z6;
            i8 = this.f3535j;
            this.f3535j = i7;
            float f10 = this.f3541p;
            this.f3541p = f9;
            if (Math.abs(f9 - f10) > 1.0E-4f) {
                this.f3531f.c0().invalidate();
            }
        }
        if (z7) {
            try {
                s50 s50Var = this.f3544s;
                if (s50Var != null) {
                    s50Var.b();
                }
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
        z6(i8, i7, z8, z6);
    }

    final /* synthetic */ void u6(int i7, int i8, boolean z6, boolean z7) {
        int i9;
        boolean z8;
        boolean z9;
        gz gzVar;
        gz gzVar2;
        gz gzVar3;
        synchronized (this.f3532g) {
            boolean z10 = this.f3537l;
            if (z10 || i8 != 1) {
                i9 = i8;
                z8 = false;
            } else {
                i9 = 1;
                z8 = true;
            }
            if (i7 == i8 || i9 != 1) {
                z9 = false;
            } else {
                i9 = 1;
                z9 = true;
            }
            boolean z11 = i7 != i8 && i9 == 2;
            boolean z12 = i7 != i8 && i9 == 3;
            this.f3537l = z10 || z8;
            if (z8) {
                try {
                    gz gzVar4 = this.f3536k;
                    if (gzVar4 != null) {
                        gzVar4.h();
                    }
                } catch (RemoteException e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
            if (z9 && (gzVar3 = this.f3536k) != null) {
                gzVar3.f();
            }
            if (z11 && (gzVar2 = this.f3536k) != null) {
                gzVar2.e();
            }
            if (z12) {
                gz gzVar5 = this.f3536k;
                if (gzVar5 != null) {
                    gzVar5.b();
                }
                this.f3531f.C();
            }
            if (z6 != z7 && (gzVar = this.f3536k) != null) {
                gzVar.S3(z7);
            }
        }
    }

    final /* synthetic */ void v6(Map map) {
        this.f3531f.t("pubVideoCmd", map);
    }

    public final void w6(s00 s00Var) {
        boolean z6 = s00Var.f11592f;
        boolean z7 = s00Var.f11593g;
        boolean z8 = s00Var.f11594h;
        synchronized (this.f3532g) {
            this.f3542q = z7;
            this.f3543r = z8;
        }
        A6("initialState", v3.e.a("muteStart", true != z6 ? "0" : "1", "customControlsRequested", true != z7 ? "0" : "1", "clickToExpandRequested", true != z8 ? "0" : "1"));
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void x3(boolean z6) {
        A6(true != z6 ? "unmute" : "mute", null);
    }

    public final void x6(float f7) {
        synchronized (this.f3532g) {
            this.f3540o = f7;
        }
    }

    public final void y() {
        boolean z6;
        int i7;
        synchronized (this.f3532g) {
            z6 = this.f3538m;
            i7 = this.f3535j;
            this.f3535j = 3;
        }
        z6(i7, 3, z6, z6);
    }

    public final void y6(s50 s50Var) {
        synchronized (this.f3532g) {
            this.f3544s = s50Var;
        }
    }
}
