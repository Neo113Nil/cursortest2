package x1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m0 extends a7.q {

    /* renamed from: p, reason: collision with root package name */
    public static final c6.k f8498p = a.a.r(h0.f8427k);

    /* renamed from: q, reason: collision with root package name */
    public static final t6.b f8499q = new t6.b(1);

    /* renamed from: f, reason: collision with root package name */
    public final Choreographer f8500f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f8501g;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8505l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8506m;

    /* renamed from: o, reason: collision with root package name */
    public final m0.j1 f8508o;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8502h = new Object();
    public final d6.k i = new d6.k();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f8503j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f8504k = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final l0 f8507n = new l0(this);

    public m0(Choreographer choreographer, Handler handler) {
        this.f8500f = choreographer;
        this.f8501g = handler;
        this.f8508o = new m0.j1(choreographer, this);
    }

    public static final void m(m0 m0Var) {
        Runnable runnable;
        boolean z3;
        do {
            synchronized (m0Var.f8502h) {
                d6.k kVar = m0Var.i;
                runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (m0Var.f8502h) {
                    d6.k kVar2 = m0Var.i;
                    runnable = (Runnable) (kVar2.isEmpty() ? null : kVar2.removeFirst());
                }
            }
            synchronized (m0Var.f8502h) {
                if (m0Var.i.isEmpty()) {
                    z3 = false;
                    m0Var.f8505l = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // a7.q
    public final void h(g6.h hVar, Runnable runnable) {
        synchronized (this.f8502h) {
            this.i.addLast(runnable);
            if (!this.f8505l) {
                this.f8505l = true;
                this.f8501g.post(this.f8507n);
                if (!this.f8506m) {
                    this.f8506m = true;
                    this.f8500f.postFrameCallback(this.f8507n);
                }
            }
        }
    }
}
