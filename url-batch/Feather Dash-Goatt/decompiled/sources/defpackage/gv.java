package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gv {
    public int a = 1;
    public final tl0 b;
    public tl0 c;
    public tl0 d;
    public int e;
    public int f;

    public gv(tl0 tl0Var) {
        this.b = tl0Var;
        this.c = tl0Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        rl0 b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.h).get(a + b.d) == 0) || this.e == 65039;
    }
}
