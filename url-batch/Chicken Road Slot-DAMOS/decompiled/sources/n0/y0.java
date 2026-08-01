package n0;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y0 extends c1.b {

    /* renamed from: e, reason: collision with root package name */
    public final s.h0 f6855e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6856i;

    /* renamed from: r, reason: collision with root package name */
    public final s.i0 f6857r;

    /* renamed from: s, reason: collision with root package name */
    public final s.h0 f6858s;

    /* renamed from: t, reason: collision with root package name */
    public final b1.h f6859t;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public y0() {
        super(1);
        this.f6855e = z4.w.k();
        this.f6856i = new ArrayList();
        int i3 = s.q0.f8360a;
        this.f6857r = new s.i0();
        this.f6858s = new s.h0();
        b1.y yVar = new b1.y(4, this);
        b1.r.e(b1.r.f1028a);
        synchronized (b1.r.f1030c) {
            b1.r.f1034h = CollectionsKt.F(b1.r.f1034h, yVar);
        }
        this.f6859t = new b1.h(0, yVar);
    }

    @Override // c1.b
    public final void i(ie.o oVar) {
        this.f6856i.add(new w0(oVar));
    }

    @Override // c1.b
    public final void j() {
        synchronized (this.f1478d) {
            try {
                ArrayList arrayList = this.f6856i;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    x0 x0Var = (x0) arrayList.get(i3);
                    if (x0Var instanceof v0) {
                        z4.w.e(this.f6855e, ((v0) x0Var).f6822a, ((v0) x0Var).f6823b);
                    } else {
                        if (!(x0Var instanceof w0)) {
                            throw new hd.j();
                        }
                        z4.w.K(this.f6855e, ((w0) x0Var).f6831a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6856i.clear();
    }

    @Override // c1.b
    public final void k() {
        this.f6859t.d();
        this.f6856i.clear();
        this.f6858s.a();
        synchronized (this.f1478d) {
            this.f6855e.a();
        }
    }

    @Override // c1.b
    public final Function1 n(ie.o oVar) {
        s.h0 h0Var = this.f6858s;
        Function1 function1 = (Function1) h0Var.g(oVar);
        if (function1 == null) {
            function1 = new b0.l0(8, this, oVar);
            int f3 = h0Var.f(oVar);
            if (f3 < 0) {
                f3 = ~f3;
            }
            Object[] objArr = h0Var.f8314c;
            Object obj = objArr[f3];
            h0Var.f8313b[f3] = oVar;
            objArr[f3] = function1;
        }
        return function1;
    }

    @Override // c1.b
    public final void o(ie.g gVar) {
        this.f6858s.k(gVar);
        i(gVar);
        j();
    }
}
