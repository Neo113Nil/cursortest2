package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f728a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final s f729b;

    /* renamed from: c, reason: collision with root package name */
    public s f730c;
    public s d;

    /* renamed from: e, reason: collision with root package name */
    public int f731e;

    /* renamed from: f, reason: collision with root package name */
    public int f732f;

    public p(s sVar) {
        this.f729b = sVar;
        this.f730c = sVar;
    }

    public final void a() {
        this.f728a = 1;
        this.f730c = this.f729b;
        this.f732f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f730c.f740b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f371a) == 0) || this.f731e == 65039;
    }
}
