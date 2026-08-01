package o3;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f7451a;

    /* renamed from: b, reason: collision with root package name */
    public h3.b[] f7452b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect[][] f7453c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect[][] f7454d;

    public y0(k1 k1Var) {
        this.f7453c = new Rect[10][];
        this.f7454d = new Rect[10][];
        this.f7451a = k1Var;
        c(k1Var);
    }

    public final void a() {
        h3.b[] bVarArr = this.f7452b;
        if (bVarArr != null) {
            h3.b bVar = bVarArr[0];
            h3.b bVar2 = bVarArr[1];
            k1 k1Var = this.f7451a;
            if (bVar2 == null) {
                bVar2 = k1Var.f7415a.i(2);
            }
            if (bVar == null) {
                bVar = k1Var.f7415a.i(1);
            }
            h(h3.b.a(bVar, bVar2));
            h3.b bVar3 = this.f7452b[i7.a.Q(16)];
            if (bVar3 != null) {
                g(bVar3);
            }
            h3.b bVar4 = this.f7452b[i7.a.Q(32)];
            if (bVar4 != null) {
                e(bVar4);
            }
            h3.b bVar5 = this.f7452b[i7.a.Q(64)];
            if (bVar5 != null) {
                i(bVar5);
            }
        }
    }

    public abstract k1 b();

    public void c(k1 k1Var) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            List<Rect> f3 = k1Var.f7415a.f(i3);
            int Q = i7.a.Q(i3);
            this.f7453c[Q] = (Rect[]) f3.toArray(new Rect[f3.size()]);
            if (i3 != 8) {
                List<Rect> g = k1Var.f7415a.g(i3);
                this.f7454d[Q] = (Rect[]) g.toArray(new Rect[g.size()]);
            }
        }
    }

    public void d(int i3, h3.b bVar) {
        if (this.f7452b == null) {
            this.f7452b = new h3.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0) {
                this.f7452b[i7.a.Q(i10)] = bVar;
            }
        }
    }

    public abstract void f(h3.b bVar);

    public abstract void h(h3.b bVar);

    public y0() {
        this(new k1((k1) null));
    }

    public void e(h3.b bVar) {
    }

    public void g(h3.b bVar) {
    }

    public void i(h3.b bVar) {
    }
}
