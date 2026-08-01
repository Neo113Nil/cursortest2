package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f803a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f804b;

    /* renamed from: c, reason: collision with root package name */
    public t f805c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f806e;

    /* renamed from: f, reason: collision with root package name */
    public int f807f;

    public q(t tVar) {
        this.f804b = tVar;
        this.f805c = tVar;
    }

    public final void a() {
        this.f803a = 1;
        this.f805c = this.f804b;
        this.f807f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f805c.f815b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f341a) == 0) || this.f806e == 65039;
    }
}
