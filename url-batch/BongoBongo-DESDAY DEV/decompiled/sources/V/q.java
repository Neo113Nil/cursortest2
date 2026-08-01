package V;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f912a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f913b;

    /* renamed from: c, reason: collision with root package name */
    public t f914c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f915e;

    /* renamed from: f, reason: collision with root package name */
    public int f916f;

    public q(t tVar) {
        this.f913b = tVar;
        this.f914c = tVar;
    }

    public final void a() {
        this.f912a = 1;
        this.f914c = this.f913b;
        this.f916f = 0;
    }

    public final boolean b() {
        W.a c2 = this.f914c.f925b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f480a) == 0) || this.f915e == 65039;
    }
}
