package i0;

import a0.a0;
import a0.h0;
import m0.e1;
import o.q;
import q1.k;
import r2.o;
import w1.f0;
import w1.p;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3282a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3283b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3284c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3285d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3286e;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(a0 a0Var, t tVar, boolean z3) {
        Object[] objArr;
        int i;
        int i8;
        q1.b bVar = (q1.b) this.f3284c;
        p pVar = (p) this.f3286e;
        if (this.f3282a) {
            return 0;
        }
        try {
            this.f3282a = true;
            a0 v7 = ((b1.b) this.f3285d).v(a0Var, tVar);
            q qVar = (q) v7.f11e;
            int g3 = qVar.g();
            for (int i9 = 0; i9 < g3; i9++) {
                k kVar = (k) qVar.h(i9);
                if (!kVar.f5997d && !kVar.f6001h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int g7 = qVar.g();
            for (int i10 = 0; i10 < g7; i10++) {
                k kVar2 = (k) qVar.h(i10);
                if (objArr != false || h0.a.k(kVar2)) {
                    ((f0) this.f3283b).y(kVar2.f5996c, (p) this.f3286e, kVar2.i, true);
                    if (!pVar.f7745d.g()) {
                        bVar.a(kVar2.f5994a, pVar, h0.a.k(kVar2));
                        pVar.clear();
                    }
                }
            }
            boolean b8 = bVar.b(v7, z3);
            int g8 = qVar.g();
            int i11 = 0;
            while (true) {
                if (i11 >= g8) {
                    i = 0;
                    break;
                }
                k kVar3 = (k) qVar.h(i11);
                if (!e1.b.b(h0.a.R(kVar3, true), 0L) && kVar3.b()) {
                    i = 1;
                    break;
                }
                i11++;
            }
            int g9 = qVar.g();
            int i12 = 0;
            while (true) {
                if (i12 >= g9) {
                    i8 = 0;
                    break;
                }
                if (((k) qVar.h(i12)).b()) {
                    i8 = 1;
                    break;
                }
                i12++;
            }
            int i13 = (b8 ? 1 : 0) | (i << 1) | (i8 << 2);
            this.f3282a = false;
            return i13;
        } catch (Throwable th) {
            this.f3282a = false;
            throw th;
        }
    }

    public void b(int i, int i8) {
        if (i < 0.0f) {
            w.a.a("Index should be non-negative (" + i + ')');
        }
        ((e1) this.f3283b).h(i);
        h0 h0Var = (h0) this.f3286e;
        if (i != h0Var.f89e) {
            h0Var.f89e = i;
            int i9 = (i / 30) * 30;
            h0Var.f88d.setValue(o.u0(Math.max(i9 - 100, 0), i9 + 130));
        }
        ((e1) this.f3284c).h(i8);
    }
}
