package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f870a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f871b;

    /* renamed from: c, reason: collision with root package name */
    public t f872c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f873e;

    /* renamed from: f, reason: collision with root package name */
    public int f874f;

    public q(t tVar) {
        this.f871b = tVar;
        this.f872c = tVar;
    }

    public final void a() {
        this.f870a = 1;
        this.f872c = this.f871b;
        this.f874f = 0;
    }

    public final boolean b() {
        V.a c2 = this.f872c.f882b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f430a) == 0) || this.f873e == 65039;
    }
}
