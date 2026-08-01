package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f734a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final s f735b;

    /* renamed from: c, reason: collision with root package name */
    public s f736c;
    public s d;

    /* renamed from: e, reason: collision with root package name */
    public int f737e;

    /* renamed from: f, reason: collision with root package name */
    public int f738f;

    public p(s sVar) {
        this.f735b = sVar;
        this.f736c = sVar;
    }

    public final void a() {
        this.f734a = 1;
        this.f736c = this.f735b;
        this.f738f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f736c.f746b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f371a) == 0) || this.f737e == 65039;
    }
}
