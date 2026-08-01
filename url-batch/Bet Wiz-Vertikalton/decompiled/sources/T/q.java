package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f815a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f816b;

    /* renamed from: c, reason: collision with root package name */
    public t f817c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f818e;

    /* renamed from: f, reason: collision with root package name */
    public int f819f;

    public q(t tVar) {
        this.f816b = tVar;
        this.f817c = tVar;
    }

    public final void a() {
        this.f815a = 1;
        this.f817c = this.f816b;
        this.f819f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f817c.f827b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f412a) == 0) || this.f818e == 65039;
    }
}
