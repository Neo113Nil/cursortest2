package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f788a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f789b;

    /* renamed from: c, reason: collision with root package name */
    public t f790c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f791e;

    /* renamed from: f, reason: collision with root package name */
    public int f792f;

    public q(t tVar) {
        this.f789b = tVar;
        this.f790c = tVar;
    }

    public final void a() {
        this.f788a = 1;
        this.f790c = this.f789b;
        this.f792f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f790c.f800b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f359a) == 0) || this.f791e == 65039;
    }
}
