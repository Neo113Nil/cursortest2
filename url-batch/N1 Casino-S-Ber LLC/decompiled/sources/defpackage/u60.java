package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class u60 extends t60 {
    public final /* synthetic */ n6 a;
    public final /* synthetic */ v60 b;

    public u60(v60 v60Var, n6 n6Var) {
        this.b = v60Var;
        this.a = n6Var;
    }

    @Override // defpackage.p60
    public final void d(s60 s60Var) {
        ((ArrayList) this.a.get(this.b.g)).remove(s60Var);
        s60Var.x(this);
    }
}
