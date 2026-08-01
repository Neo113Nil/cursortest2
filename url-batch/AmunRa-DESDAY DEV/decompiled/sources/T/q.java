package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f778a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f779b;

    /* renamed from: c, reason: collision with root package name */
    public t f780c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f781e;

    /* renamed from: f, reason: collision with root package name */
    public int f782f;

    public q(t tVar) {
        this.f779b = tVar;
        this.f780c = tVar;
    }

    public final void a() {
        this.f778a = 1;
        this.f780c = this.f779b;
        this.f782f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f780c.f790b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f352a) == 0) || this.f781e == 65039;
    }
}
