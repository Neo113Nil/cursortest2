package m3;

import C.F;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final A0.q f8473d;

    /* renamed from: e, reason: collision with root package name */
    public final t f8474e;

    /* renamed from: i, reason: collision with root package name */
    public final String f8475i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8476j;

    /* renamed from: k, reason: collision with root package name */
    public final k f8477k;

    /* renamed from: l, reason: collision with root package name */
    public final l f8478l;

    /* renamed from: m, reason: collision with root package name */
    public final x f8479m;

    /* renamed from: n, reason: collision with root package name */
    public final w f8480n;

    /* renamed from: o, reason: collision with root package name */
    public final w f8481o;

    /* renamed from: p, reason: collision with root package name */
    public final w f8482p;

    /* renamed from: q, reason: collision with root package name */
    public final long f8483q;

    /* renamed from: r, reason: collision with root package name */
    public final long f8484r;

    /* renamed from: s, reason: collision with root package name */
    public final F f8485s;

    public w(A0.q request, t protocol, String message, int i2, k kVar, l headers, x xVar, w wVar, w wVar2, w wVar3, long j4, long j5, F f4) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f8473d = request;
        this.f8474e = protocol;
        this.f8475i = message;
        this.f8476j = i2;
        this.f8477k = kVar;
        this.f8478l = headers;
        this.f8479m = xVar;
        this.f8480n = wVar;
        this.f8481o = wVar2;
        this.f8482p = wVar3;
        this.f8483q = j4;
        this.f8484r = j5;
        this.f8485s = f4;
    }

    public static String a(String name, w wVar) {
        wVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String e4 = wVar.f8478l.e(name);
        if (e4 == null) {
            return null;
        }
        return e4;
    }

    public final v b() {
        Intrinsics.checkNotNullParameter(this, "response");
        v vVar = new v();
        vVar.f8460a = this.f8473d;
        vVar.f8461b = this.f8474e;
        vVar.f8462c = this.f8476j;
        vVar.f8463d = this.f8475i;
        vVar.f8464e = this.f8477k;
        vVar.f8465f = this.f8478l.s();
        vVar.f8466g = this.f8479m;
        vVar.f8467h = this.f8480n;
        vVar.f8468i = this.f8481o;
        vVar.f8469j = this.f8482p;
        vVar.f8470k = this.f8483q;
        vVar.f8471l = this.f8484r;
        vVar.f8472m = this.f8485s;
        return vVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f8479m;
        if (xVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        xVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f8474e + ", code=" + this.f8476j + ", message=" + this.f8475i + ", url=" + ((m) this.f8473d.f362c) + '}';
    }
}
