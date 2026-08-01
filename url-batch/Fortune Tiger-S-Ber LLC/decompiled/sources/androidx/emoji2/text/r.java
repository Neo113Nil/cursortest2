package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f350a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final v f351b;
    public v c;

    /* renamed from: d, reason: collision with root package name */
    public v f352d;

    /* renamed from: e, reason: collision with root package name */
    public int f353e;

    /* renamed from: f, reason: collision with root package name */
    public int f354f;

    public r(v vVar) {
        this.f351b = vVar;
        this.c = vVar;
    }

    public final void a() {
        this.f350a = 1;
        this.c = this.f351b;
        this.f354f = 0;
    }

    public final boolean b() {
        s0.a b2 = this.c.f367b.b();
        int a4 = b2.a(6);
        return !(a4 == 0 || ((ByteBuffer) b2.f2795d).get(a4 + b2.f2793a) == 0) || this.f353e == 65039;
    }
}
