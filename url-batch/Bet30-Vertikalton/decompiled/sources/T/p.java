package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f735a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final s f736b;

    /* renamed from: c, reason: collision with root package name */
    public s f737c;
    public s d;

    /* renamed from: e, reason: collision with root package name */
    public int f738e;

    /* renamed from: f, reason: collision with root package name */
    public int f739f;

    public p(s sVar) {
        this.f736b = sVar;
        this.f737c = sVar;
    }

    public final void a() {
        this.f735a = 1;
        this.f737c = this.f736b;
        this.f739f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f737c.f747b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f371a) == 0) || this.f738e == 65039;
    }
}
