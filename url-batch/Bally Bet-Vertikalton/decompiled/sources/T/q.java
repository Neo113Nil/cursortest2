package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f739a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f740b;

    /* renamed from: c, reason: collision with root package name */
    public t f741c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f742e;

    /* renamed from: f, reason: collision with root package name */
    public int f743f;

    public q(t tVar) {
        this.f740b = tVar;
        this.f741c = tVar;
    }

    public final void a() {
        this.f739a = 1;
        this.f741c = this.f740b;
        this.f743f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f741c.f751b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f371a) == 0) || this.f742e == 65039;
    }
}
