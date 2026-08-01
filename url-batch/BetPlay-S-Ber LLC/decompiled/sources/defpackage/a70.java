package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a70 extends z60 {
    public final /* synthetic */ e7 a;
    public final /* synthetic */ b70 b;

    public a70(b70 b70Var, e7 e7Var) {
        this.b = b70Var;
        this.a = e7Var;
    }

    @Override // defpackage.v60
    public final void d(y60 y60Var) {
        ((ArrayList) this.a.get(this.b.g)).remove(y60Var);
        y60Var.y(this);
    }
}
