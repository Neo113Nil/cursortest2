package H2;

import I.C0089d;
import I.C0102j0;
import I.X;
import k2.AbstractC0552y;
import n.a0;
import o.C0739o;
import o.C0740p;
import o.h0;

/* loaded from: classes.dex */
public final class h implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1959a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1960b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1961c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1962d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1963e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1964f;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Y1.c cVar) {
        this.f1959a = (Z1.j) cVar;
        this.f1960b = new C0740p(this);
        this.f1961c = new a0();
        Boolean bool = Boolean.FALSE;
        X x3 = X.f2228i;
        this.f1962d = C0089d.J(bool, x3);
        this.f1963e = C0089d.J(bool, x3);
        this.f1964f = C0089d.J(bool, x3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.c, Z1.j] */
    @Override // o.h0
    public float b(float f3) {
        return ((Number) ((Z1.j) this.f1959a).j(Float.valueOf(f3))).floatValue();
    }

    @Override // o.h0
    public boolean d() {
        return ((Boolean) ((C0102j0) this.f1962d).getValue()).booleanValue();
    }

    @Override // o.h0
    public Object e(n.X x3, Y1.e eVar, R1.c cVar) {
        Object d3 = AbstractC0552y.d(new C0739o(this, x3, eVar, null), cVar);
        return d3 == Q1.a.f3113d ? d3 : L1.z.f2729a;
    }

    public h(D2.e eVar) {
        Z1.i.f(eVar, "taskRunner");
        this.f1959a = eVar;
        this.f1964f = j.f1965a;
    }
}
