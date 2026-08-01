package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f803a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f804b;

    /* renamed from: c, reason: collision with root package name */
    public u f805c;

    /* renamed from: d, reason: collision with root package name */
    public u f806d;

    /* renamed from: e, reason: collision with root package name */
    public int f807e;

    /* renamed from: f, reason: collision with root package name */
    public int f808f;

    public q(u uVar) {
        this.f804b = uVar;
        this.f805c = uVar;
    }

    public final void a() {
        this.f803a = 1;
        this.f805c = this.f804b;
        this.f808f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f805c.f823b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.f410d).get(a2 + c2.f407a) == 0) || this.f807e == 65039;
    }
}
