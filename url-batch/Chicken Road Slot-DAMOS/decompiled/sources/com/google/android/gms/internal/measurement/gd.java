package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class gd implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2335d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2336e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2337i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2338r;

    public gd(s7.b3 b3Var, s7.y2 y2Var, long j) {
        this.f2337i = y2Var;
        this.f2336e = j;
        Objects.requireNonNull(b3Var);
        this.f2338r = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2335d) {
            case 0:
                ((bd) this.f2337i).run();
                f8.u0 u0Var = (f8.u0) this.f2338r;
                u0Var.getClass();
                f8.z0 z0Var = new f8.z0(Executors.callable(this, null));
                f8.s0 s0Var = new f8.s0(z0Var, u0Var.f4186e.schedule(z0Var, this.f2336e, TimeUnit.MINUTES));
                s0Var.a(new bd(1, s0Var), f8.d0.f4128d);
                break;
            default:
                s7.b3 b3Var = (s7.b3) this.f2338r;
                b3Var.B((s7.y2) this.f2337i, false, this.f2336e);
                b3Var.f8524s = null;
                s7.l3 o6 = ((s7.q1) b3Var.f1478d).o();
                o6.s();
                o6.t();
                o6.G(new f8.j0(o6, (s7.y2) null));
                break;
        }
    }

    public gd(hd hdVar, bd bdVar, f8.u0 u0Var, long j) {
        this.f2337i = bdVar;
        this.f2338r = u0Var;
        this.f2336e = j;
    }
}
