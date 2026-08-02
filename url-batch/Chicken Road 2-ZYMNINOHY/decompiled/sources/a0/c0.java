package a0;

import android.util.Pair;
import java.io.IOException;
import q0.C1353B;
import q0.C1377t;

/* loaded from: classes.dex */
public final class c0 implements q0.H, f0.f {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f4078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f4079b;

    public c0(f0 f0Var, e0 e0Var) {
        this.f4079b = f0Var;
        this.f4078a = e0Var;
    }

    @Override // q0.H
    public final void a(int i4, C1353B c1353b, n0.g gVar) {
        Pair g4 = g(i4, c1353b);
        if (g4 != null) {
            this.f4079b.f4118i.c(new Y(this, g4, gVar, 0));
        }
    }

    @Override // q0.H
    public final void b(int i4, C1353B c1353b, n0.g gVar) {
        Pair g4 = g(i4, c1353b);
        if (g4 != null) {
            this.f4079b.f4118i.c(new Y(this, g4, gVar, 1));
        }
    }

    @Override // q0.H
    public final void c(int i4, C1353B c1353b, final C1377t c1377t, final n0.g gVar, final int i5) {
        final Pair g4 = g(i4, c1353b);
        if (g4 != null) {
            this.f4079b.f4118i.c(new Runnable() { // from class: a0.a0
                @Override // java.lang.Runnable
                public final void run() {
                    b0.d dVar = c0.this.f4079b.f4117h;
                    Pair pair = g4;
                    dVar.c(((Integer) pair.first).intValue(), (C1353B) pair.second, c1377t, gVar, i5);
                }
            });
        }
    }

    @Override // q0.H
    public final void d(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar) {
        Pair g4 = g(i4, c1353b);
        if (g4 != null) {
            this.f4079b.f4118i.c(new Z(this, g4, c1377t, gVar, 0));
        }
    }

    @Override // q0.H
    public final void e(int i4, C1353B c1353b, final C1377t c1377t, final n0.g gVar, final IOException iOException, final boolean z) {
        final Pair g4 = g(i4, c1353b);
        if (g4 != null) {
            this.f4079b.f4118i.c(new Runnable() { // from class: a0.b0
                @Override // java.lang.Runnable
                public final void run() {
                    b0.d dVar = c0.this.f4079b.f4117h;
                    Pair pair = g4;
                    dVar.e(((Integer) pair.first).intValue(), (C1353B) pair.second, c1377t, gVar, iOException, z);
                }
            });
        }
    }

    @Override // q0.H
    public final void f(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar) {
        Pair g4 = g(i4, c1353b);
        if (g4 != null) {
            this.f4079b.f4118i.c(new Z(this, g4, c1377t, gVar, 1));
        }
    }

    public final Pair g(int i4, C1353B c1353b) {
        C1353B c1353b2;
        e0 e0Var = this.f4078a;
        C1353B c1353b3 = null;
        if (c1353b != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= e0Var.f4103c.size()) {
                    c1353b2 = null;
                    break;
                }
                if (((C1353B) e0Var.f4103c.get(i5)).f14815d == c1353b.f14815d) {
                    Object obj = c1353b.f14812a;
                    Object obj2 = e0Var.f4102b;
                    int i6 = l0.f4182k;
                    c1353b2 = c1353b.a(Pair.create(obj2, obj));
                    break;
                }
                i5++;
            }
            if (c1353b2 == null) {
                return null;
            }
            c1353b3 = c1353b2;
        }
        return Pair.create(Integer.valueOf(i4 + e0Var.f4104d), c1353b3);
    }
}
