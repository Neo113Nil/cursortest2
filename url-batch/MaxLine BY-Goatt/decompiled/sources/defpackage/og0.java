package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class og0 {
    public int a = 1;
    public final ml1 b;
    public ml1 c;
    public ml1 d;
    public int e;
    public int f;

    public og0(ml1 ml1Var) {
        this.b = ml1Var;
        this.c = ml1Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        kl1 b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.p).get(a + b.m) == 0) || this.e == 65039;
    }
}
