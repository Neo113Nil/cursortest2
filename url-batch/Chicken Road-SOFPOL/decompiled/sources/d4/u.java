package d4;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int f2285a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final x f2286b;

    /* renamed from: c, reason: collision with root package name */
    public x f2287c;

    /* renamed from: d, reason: collision with root package name */
    public x f2288d;

    /* renamed from: e, reason: collision with root package name */
    public int f2289e;

    /* renamed from: f, reason: collision with root package name */
    public int f2290f;

    public u(x xVar) {
        this.f2286b = xVar;
        this.f2287c = xVar;
    }

    public final void a() {
        this.f2285a = 1;
        this.f2287c = this.f2286b;
        this.f2290f = 0;
    }

    public final boolean b() {
        e4.a b8 = this.f2287c.f2304b.b();
        int a8 = b8.a(6);
        return !(a8 == 0 || ((ByteBuffer) b8.f2491g).get(a8 + b8.f2488d) == 0) || this.f2289e == 65039;
    }
}
