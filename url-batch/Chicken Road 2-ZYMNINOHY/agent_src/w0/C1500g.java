package w0;

import T.e0;
import a0.C0132H;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* renamed from: w0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500g implements InterfaceC1491F {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15798b;

    public C1500g(k kVar) {
        this.f15798b = kVar;
    }

    @Override // w0.InterfaceC1491F
    public final void a() {
        k kVar = this.f15798b;
        Surface surface = kVar.f15834f1;
        if (surface != null) {
            c0.q qVar = kVar.f15820Q0;
            Handler handler = qVar.f5600a;
            if (handler != null) {
                handler.post(new RunnableC1489D(qVar, surface, SystemClock.elapsedRealtime()));
            }
            kVar.f15836i1 = true;
        }
    }

    @Override // w0.InterfaceC1491F
    public final void b() {
        k kVar = this.f15798b;
        if (kVar.f15834f1 != null) {
            kVar.R0(0, 1);
        }
    }

    @Override // w0.InterfaceC1491F
    public final void c() {
        C0132H c0132h = this.f15798b.f13805I;
        if (c0132h != null) {
            c0132h.a();
        }
    }

    @Override // w0.InterfaceC1491F
    public final void onVideoSizeChanged(e0 e0Var) {
    }
}
