package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f1105a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f1106b;

    /* renamed from: c, reason: collision with root package name */
    public u f1107c;
    public u d;

    /* renamed from: e, reason: collision with root package name */
    public int f1108e;

    /* renamed from: f, reason: collision with root package name */
    public int f1109f;

    public r(u uVar) {
        this.f1106b = uVar;
        this.f1107c = uVar;
    }

    public final void a() {
        this.f1105a = 1;
        this.f1107c = this.f1106b;
        this.f1109f = 0;
    }

    public final boolean b() {
        V.a c2 = this.f1107c.f1117b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f568a) == 0) || this.f1108e == 65039;
    }
}
