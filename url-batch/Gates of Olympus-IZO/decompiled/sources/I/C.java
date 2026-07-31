package I;

import android.view.Choreographer;
import k2.C0536h;

/* loaded from: classes.dex */
public final class C implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2080d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0536h f2081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.c f2082f;

    public C(Y1.c cVar, C0536h c0536h) {
        this.f2081e = c0536h;
        this.f2082f = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        Object t3;
        Object t4;
        C0536h c0536h = this.f2081e;
        Y1.c cVar = this.f2082f;
        switch (this.f2080d) {
            case 0:
                D d3 = D.f2085d;
                try {
                    t4 = cVar.j(Long.valueOf(j3));
                } catch (Throwable th) {
                    t4 = I2.l.t(th);
                }
                c0536h.resumeWith(t4);
                break;
            default:
                try {
                    t3 = cVar.j(Long.valueOf(j3));
                } catch (Throwable th2) {
                    t3 = I2.l.t(th2);
                }
                c0536h.resumeWith(t3);
                break;
        }
    }

    public C(C0536h c0536h, C0106l0 c0106l0, Y1.c cVar) {
        this.f2081e = c0536h;
        this.f2082f = cVar;
    }
}
