package V;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f1290a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f1291b;

    /* renamed from: c, reason: collision with root package name */
    public u f1292c;

    /* renamed from: d, reason: collision with root package name */
    public u f1293d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1294f;

    public r(u uVar) {
        this.f1291b = uVar;
        this.f1292c = uVar;
    }

    public final void a() {
        this.f1290a = 1;
        this.f1292c = this.f1291b;
        this.f1294f = 0;
    }

    public final boolean b() {
        W.a c2 = this.f1292c.f1304b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.f702d).get(a2 + c2.f699a) == 0) || this.e == 65039;
    }
}
