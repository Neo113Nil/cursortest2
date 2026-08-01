package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f802a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f803b;

    /* renamed from: c, reason: collision with root package name */
    public u f804c;

    /* renamed from: d, reason: collision with root package name */
    public u f805d;

    /* renamed from: e, reason: collision with root package name */
    public int f806e;

    /* renamed from: f, reason: collision with root package name */
    public int f807f;

    public q(u uVar) {
        this.f803b = uVar;
        this.f804c = uVar;
    }

    public final void a() {
        this.f802a = 1;
        this.f804c = this.f803b;
        this.f807f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f804c.f822b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.f409d).get(a2 + c2.f406a) == 0) || this.f806e == 65039;
    }
}
