package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mm {
    public int a = 1;
    public final n20 b;
    public n20 c;
    public n20 d;
    public int e;
    public int f;

    public mm(n20 n20Var) {
        this.b = n20Var;
        this.c = n20Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        l20 b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.i).get(a + b.f) == 0) || this.e == 65039;
    }
}
