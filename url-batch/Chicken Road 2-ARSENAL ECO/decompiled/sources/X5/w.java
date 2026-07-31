package X5;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class w implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final D0.h f3061f;

    /* renamed from: g, reason: collision with root package name */
    public final t f3062g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3063h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3064i;

    /* renamed from: j, reason: collision with root package name */
    public final m f3065j;

    /* renamed from: k, reason: collision with root package name */
    public final n f3066k;

    /* renamed from: l, reason: collision with root package name */
    public final y f3067l;

    /* renamed from: m, reason: collision with root package name */
    public final n6.v f3068m;

    /* renamed from: n, reason: collision with root package name */
    public final w f3069n;

    /* renamed from: o, reason: collision with root package name */
    public final w f3070o;

    /* renamed from: p, reason: collision with root package name */
    public final w f3071p;

    /* renamed from: q, reason: collision with root package name */
    public final long f3072q;

    /* renamed from: r, reason: collision with root package name */
    public final long f3073r;

    /* renamed from: s, reason: collision with root package name */
    public final U.a f3074s;

    /* renamed from: t, reason: collision with root package name */
    public final B f3075t;

    public w(D0.h request, t protocol, String message, int i7, m mVar, n nVar, y body, n6.v vVar, w wVar, w wVar2, w wVar3, long j4, long j7, U.a aVar, B trailersSource) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(body, "body");
        kotlin.jvm.internal.i.e(trailersSource, "trailersSource");
        this.f3061f = request;
        this.f3062g = protocol;
        this.f3063h = message;
        this.f3064i = i7;
        this.f3065j = mVar;
        this.f3066k = nVar;
        this.f3067l = body;
        this.f3068m = vVar;
        this.f3069n = wVar;
        this.f3070o = wVar2;
        this.f3071p = wVar3;
        this.f3072q = j4;
        this.f3073r = j7;
        this.f3074s = aVar;
        this.f3075t = trailersSource;
    }

    public final v a() {
        v vVar = new v();
        vVar.f3048c = -1;
        vVar.f3052g = y.f3078f;
        vVar.f3060o = B.f2877a;
        vVar.f3046a = this.f3061f;
        vVar.f3047b = this.f3062g;
        vVar.f3048c = this.f3064i;
        vVar.f3049d = this.f3063h;
        vVar.f3050e = this.f3065j;
        vVar.f3051f = this.f3066k.c();
        vVar.f3052g = this.f3067l;
        vVar.f3053h = this.f3068m;
        vVar.f3054i = this.f3069n;
        vVar.f3055j = this.f3070o;
        vVar.f3056k = this.f3071p;
        vVar.f3057l = this.f3072q;
        vVar.f3058m = this.f3073r;
        vVar.f3059n = this.f3074s;
        vVar.f3060o = this.f3075t;
        return vVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3067l.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f3062g + ", code=" + this.f3064i + ", message=" + this.f3063h + ", url=" + ((o) this.f3061f.f331c) + '}';
    }
}
