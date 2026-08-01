package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f832a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final v f833b;

    /* renamed from: c, reason: collision with root package name */
    public v f834c;
    public v d;

    /* renamed from: e, reason: collision with root package name */
    public int f835e;

    /* renamed from: f, reason: collision with root package name */
    public int f836f;

    public s(v vVar) {
        this.f833b = vVar;
        this.f834c = vVar;
    }

    public final void a() {
        this.f832a = 1;
        this.f834c = this.f833b;
        this.f836f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f834c.f844b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f355a) == 0) || this.f835e == 65039;
    }
}
