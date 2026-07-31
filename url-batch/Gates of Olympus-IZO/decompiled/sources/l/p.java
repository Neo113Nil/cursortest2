package l;

import m.s0;

/* loaded from: classes.dex */
public final class p extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f5494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s0 s0Var, int i3) {
        super(0);
        this.f5493e = i3;
        this.f5494f = s0Var;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f5493e) {
            case 0:
                s0 s0Var = this.f5494f;
                Object a3 = s0Var.f5841a.a();
                x xVar = x.f5516f;
                return Boolean.valueOf(a3 == xVar && s0Var.f5844d.getValue() == xVar);
            default:
                return Long.valueOf(this.f5494f.b());
        }
    }
}
