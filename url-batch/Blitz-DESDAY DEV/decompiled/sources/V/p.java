package V;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f898a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final s f899b;

    /* renamed from: c, reason: collision with root package name */
    public s f900c;
    public s d;

    /* renamed from: e, reason: collision with root package name */
    public int f901e;

    /* renamed from: f, reason: collision with root package name */
    public int f902f;

    public p(s sVar) {
        this.f899b = sVar;
        this.f900c = sVar;
    }

    public final void a() {
        this.f898a = 1;
        this.f900c = this.f899b;
        this.f902f = 0;
    }

    public final boolean b() {
        W.a c2 = this.f900c.f910b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f503a) == 0) || this.f901e == 65039;
    }
}
