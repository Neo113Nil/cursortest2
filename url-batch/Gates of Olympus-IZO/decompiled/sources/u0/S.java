package u0;

import I.C0106l0;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.AbstractC0546s;

/* loaded from: classes.dex */
public final class S extends AbstractC0546s {
    public static final L1.o p = I2.d.F(M.f8198l);

    /* renamed from: q, reason: collision with root package name */
    public static final F2.c f8234q = new F2.c(2);

    /* renamed from: f, reason: collision with root package name */
    public final Choreographer f8235f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f8236g;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8241l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8242m;

    /* renamed from: o, reason: collision with root package name */
    public final C0106l0 f8244o;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8237h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final M1.j f8238i = new M1.j();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f8239j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f8240k = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final Q f8243n = new Q(this);

    public S(Choreographer choreographer, Handler handler) {
        this.f8235f = choreographer;
        this.f8236g = handler;
        this.f8244o = new C0106l0(choreographer, this);
    }

    public static final void S(S s3) {
        Runnable runnable;
        boolean z3;
        do {
            synchronized (s3.f8237h) {
                M1.j jVar = s3.f8238i;
                runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (s3.f8237h) {
                    M1.j jVar2 = s3.f8238i;
                    runnable = (Runnable) (jVar2.isEmpty() ? null : jVar2.removeFirst());
                }
            }
            synchronized (s3.f8237h) {
                if (s3.f8238i.isEmpty()) {
                    z3 = false;
                    s3.f8241l = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // k2.AbstractC0546s
    public final void P(P1.i iVar, Runnable runnable) {
        synchronized (this.f8237h) {
            this.f8238i.addLast(runnable);
            if (!this.f8241l) {
                this.f8241l = true;
                this.f8236g.post(this.f8243n);
                if (!this.f8242m) {
                    this.f8242m = true;
                    this.f8235f.postFrameCallback(this.f8243n);
                }
            }
        }
    }
}
