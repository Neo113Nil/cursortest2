package r;

import m0.l2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f6276e;

    public /* synthetic */ d1(l1 l1Var, int i) {
        this.f6275d = i;
        this.f6276e = l1Var;
    }

    @Override // p6.a
    public final Object b() {
        boolean z3;
        switch (this.f6275d) {
            case 0:
                l1 l1Var = this.f6276e;
                if (q6.i.a(l1Var.f6349d.getValue(), l1Var.f6346a.b())) {
                    m0.f1 f1Var = l1Var.f6352g;
                    if (((l2) w0.m.t(f1Var.f4927e, f1Var)).f5014c == Long.MIN_VALUE && !((Boolean) l1Var.f6353h.getValue()).booleanValue()) {
                        z3 = false;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = true;
                return Boolean.valueOf(z3);
            default:
                return Long.valueOf(this.f6276e.b());
        }
    }
}
