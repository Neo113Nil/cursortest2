package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f861a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f862b;

    /* renamed from: c, reason: collision with root package name */
    public t f863c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f864e;

    /* renamed from: f, reason: collision with root package name */
    public int f865f;

    public q(t tVar) {
        this.f862b = tVar;
        this.f863c = tVar;
    }

    public final void a() {
        this.f861a = 1;
        this.f863c = this.f862b;
        this.f865f = 0;
    }

    public final boolean b() {
        V.a c2 = this.f863c.f873b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f413a) == 0) || this.f864e == 65039;
    }
}
