package I;

import android.view.Choreographer;
import e2.InterfaceC0424c;
import q2.C0821h;

/* loaded from: classes.dex */
public final class C implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2641d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0821h f2642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f2643f;

    public C(InterfaceC0424c interfaceC0424c, C0821h c0821h) {
        this.f2642e = c0821h;
        this.f2643f = interfaceC0424c;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        Object b3;
        Object b4;
        C0821h c0821h = this.f2642e;
        InterfaceC0424c interfaceC0424c = this.f2643f;
        switch (this.f2641d) {
            case 0:
                D d3 = D.f2646d;
                try {
                    b4 = interfaceC0424c.n(Long.valueOf(j3));
                } catch (Throwable th) {
                    b4 = R1.a.b(th);
                }
                c0821h.u(b4);
                break;
            default:
                try {
                    b3 = interfaceC0424c.n(Long.valueOf(j3));
                } catch (Throwable th2) {
                    b3 = R1.a.b(th2);
                }
                c0821h.u(b3);
                break;
        }
    }

    public C(C0821h c0821h, C0160l0 c0160l0, InterfaceC0424c interfaceC0424c) {
        this.f2642e = c0821h;
        this.f2643f = interfaceC0424c;
    }
}
