package q;

import r.g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k0 extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f5859f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, int i) {
        super(1);
        this.f5858e = i;
        this.f5859f = l0Var;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f5858e) {
            case 0:
                g1 g1Var = (g1) obj;
                c0 c0Var = c0.f5806d;
                c0 c0Var2 = c0.f5807e;
                boolean a8 = g1Var.a(c0Var, c0Var2);
                r.u0 u0Var = null;
                l0 l0Var = this.f5859f;
                if (a8) {
                    a0 a0Var = l0Var.f5864u.f5874a.f5921b;
                    if (a0Var != null) {
                        u0Var = a0Var.f5799c;
                    }
                } else if (g1Var.a(c0Var2, c0.f5808f)) {
                    a0 a0Var2 = l0Var.f5865v.f5880a.f5921b;
                    if (a0Var2 != null) {
                        u0Var = a0Var2.f5799c;
                    }
                } else {
                    u0Var = h0.f5845d;
                }
                return u0Var == null ? h0.f5845d : u0Var;
            default:
                g1 g1Var2 = (g1) obj;
                c0 c0Var3 = c0.f5806d;
                c0 c0Var4 = c0.f5807e;
                if (g1Var2.a(c0Var3, c0Var4)) {
                    return h0.f5844c;
                }
                if (!g1Var2.a(c0Var4, c0.f5808f)) {
                    return h0.f5844c;
                }
                v0 v0Var = this.f5859f.f5865v.f5880a;
                return h0.f5844c;
        }
    }
}
