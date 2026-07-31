package u0;

import I.C0160l0;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import q2.AbstractC0831s;

/* loaded from: classes.dex */
public final class W extends AbstractC0831s {

    /* renamed from: p, reason: collision with root package name */
    public static final R1.n f9278p = R1.a.d(M.f9219l);

    /* renamed from: q, reason: collision with root package name */
    public static final L2.c f9279q = new L2.c(2);

    /* renamed from: f, reason: collision with root package name */
    public final Choreographer f9280f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f9281g;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9286l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9287m;

    /* renamed from: o, reason: collision with root package name */
    public final C0160l0 f9289o;

    /* renamed from: h, reason: collision with root package name */
    public final Object f9282h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final S1.j f9283i = new S1.j();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f9284j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f9285k = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final V f9288n = new V(this);

    public W(Choreographer choreographer, Handler handler) {
        this.f9280f = choreographer;
        this.f9281g = handler;
        this.f9289o = new C0160l0(choreographer, this);
    }

    public static final void H(W w2) {
        Runnable runnable;
        boolean z3;
        do {
            synchronized (w2.f9282h) {
                S1.j jVar = w2.f9283i;
                runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (w2.f9282h) {
                    S1.j jVar2 = w2.f9283i;
                    runnable = (Runnable) (jVar2.isEmpty() ? null : jVar2.removeFirst());
                }
            }
            synchronized (w2.f9282h) {
                if (w2.f9283i.isEmpty()) {
                    z3 = false;
                    w2.f9286l = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // q2.AbstractC0831s
    public final void D(V1.i iVar, Runnable runnable) {
        synchronized (this.f9282h) {
            this.f9283i.addLast(runnable);
            if (!this.f9286l) {
                this.f9286l = true;
                this.f9281g.post(this.f9288n);
                if (!this.f9287m) {
                    this.f9287m = true;
                    this.f9280f.postFrameCallback(this.f9288n);
                }
            }
        }
    }
}
