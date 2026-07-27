package T4;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final M0.e f3015a;

    /* renamed from: b, reason: collision with root package name */
    public final v f3016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3017c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3018d;

    /* renamed from: e, reason: collision with root package name */
    public final n f3019e;

    /* renamed from: f, reason: collision with root package name */
    public final o f3020f;

    /* renamed from: g, reason: collision with root package name */
    public final B f3021g;

    /* renamed from: h, reason: collision with root package name */
    public final B0.e f3022h;

    /* renamed from: i, reason: collision with root package name */
    public final z f3023i;

    /* renamed from: j, reason: collision with root package name */
    public final z f3024j;

    /* renamed from: k, reason: collision with root package name */
    public final z f3025k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3026l;

    /* renamed from: m, reason: collision with root package name */
    public final long f3027m;

    /* renamed from: n, reason: collision with root package name */
    public final X4.i f3028n;

    /* renamed from: o, reason: collision with root package name */
    public final E f3029o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3030p;

    public z(M0.e request, v protocol, String message, int i2, n nVar, o oVar, B body, B0.e eVar, z zVar, z zVar2, z zVar3, long j2, long j6, X4.i iVar, E trailersSource) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(body, "body");
        kotlin.jvm.internal.i.e(trailersSource, "trailersSource");
        this.f3015a = request;
        this.f3016b = protocol;
        this.f3017c = message;
        this.f3018d = i2;
        this.f3019e = nVar;
        this.f3020f = oVar;
        this.f3021g = body;
        this.f3022h = eVar;
        this.f3023i = zVar;
        this.f3024j = zVar2;
        this.f3025k = zVar3;
        this.f3026l = j2;
        this.f3027m = j6;
        this.f3028n = iVar;
        this.f3029o = trailersSource;
        boolean z = false;
        if (200 <= i2 && i2 < 300) {
            z = true;
        }
        this.f3030p = z;
    }

    public final y a() {
        y yVar = new y();
        yVar.f3002c = -1;
        yVar.f3006g = B.f2804a;
        yVar.f3014o = E.f2816a;
        yVar.f3000a = this.f3015a;
        yVar.f3001b = this.f3016b;
        yVar.f3002c = this.f3018d;
        yVar.f3003d = this.f3017c;
        yVar.f3004e = this.f3019e;
        yVar.f3005f = this.f3020f.e();
        yVar.f3006g = this.f3021g;
        yVar.f3007h = this.f3022h;
        yVar.f3008i = this.f3023i;
        yVar.f3009j = this.f3024j;
        yVar.f3010k = this.f3025k;
        yVar.f3011l = this.f3026l;
        yVar.f3012m = this.f3027m;
        yVar.f3013n = this.f3028n;
        yVar.f3014o = this.f3029o;
        return yVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3021g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f3016b + ", code=" + this.f3018d + ", message=" + this.f3017c + ", url=" + ((q) this.f3015a.f1783c) + '}';
    }
}
