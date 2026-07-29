package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f729a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final s f730b;

    /* renamed from: c, reason: collision with root package name */
    public s f731c;
    public s d;

    /* renamed from: e, reason: collision with root package name */
    public int f732e;

    /* renamed from: f, reason: collision with root package name */
    public int f733f;

    public p(s sVar) {
        this.f730b = sVar;
        this.f731c = sVar;
    }

    public final void a() {
        this.f729a = 1;
        this.f731c = this.f730b;
        this.f733f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f731c.f741b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f371a) == 0) || this.f732e == 65039;
    }
}
