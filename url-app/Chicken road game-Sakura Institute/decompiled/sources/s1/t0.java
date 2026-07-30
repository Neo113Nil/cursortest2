package s1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 extends c7.t {

    /* renamed from: r, reason: collision with root package name */
    public static final d6.o f8420r = d6.a.d(k0.f8258n);

    /* renamed from: s, reason: collision with root package name */
    public static final r0 f8421s = new r0(0);

    /* renamed from: h, reason: collision with root package name */
    public final Choreographer f8422h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f8423i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8428n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8429o;

    /* renamed from: q, reason: collision with root package name */
    public final g0.i1 f8431q;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8424j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final e6.j f8425k = new e6.j();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f8426l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f8427m = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final s0 f8430p = new s0(this);

    public t0(Choreographer choreographer, Handler handler) {
        this.f8422h = choreographer;
        this.f8423i = handler;
        this.f8431q = new g0.i1(choreographer, this);
    }

    public static final void Z(t0 t0Var) {
        Runnable runnable;
        boolean z8;
        do {
            synchronized (t0Var.f8424j) {
                e6.j jVar = t0Var.f8425k;
                runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (t0Var.f8424j) {
                    e6.j jVar2 = t0Var.f8425k;
                    runnable = (Runnable) (jVar2.isEmpty() ? null : jVar2.removeFirst());
                }
            }
            synchronized (t0Var.f8424j) {
                if (t0Var.f8425k.isEmpty()) {
                    z8 = false;
                    t0Var.f8428n = false;
                } else {
                    z8 = true;
                }
            }
        } while (z8);
    }

    @Override // c7.t
    public final void V(h6.i iVar, Runnable runnable) {
        synchronized (this.f8424j) {
            this.f8425k.addLast(runnable);
            if (!this.f8428n) {
                this.f8428n = true;
                this.f8423i.post(this.f8430p);
                if (!this.f8429o) {
                    this.f8429o = true;
                    this.f8422h.postFrameCallback(this.f8430p);
                }
            }
        }
    }
}
