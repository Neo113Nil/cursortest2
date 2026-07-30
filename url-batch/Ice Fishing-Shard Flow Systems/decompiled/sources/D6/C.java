package D6;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class C implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final z f426d;

    /* renamed from: e, reason: collision with root package name */
    public final x f427e;

    /* renamed from: i, reason: collision with root package name */
    public final String f428i;

    /* renamed from: l, reason: collision with root package name */
    public final int f429l;

    /* renamed from: m, reason: collision with root package name */
    public final p f430m;

    /* renamed from: n, reason: collision with root package name */
    public final q f431n;

    /* renamed from: o, reason: collision with root package name */
    public final E f432o;

    /* renamed from: p, reason: collision with root package name */
    public final T6.v f433p;

    /* renamed from: q, reason: collision with root package name */
    public final C f434q;

    /* renamed from: r, reason: collision with root package name */
    public final C f435r;

    /* renamed from: s, reason: collision with root package name */
    public final C f436s;

    /* renamed from: t, reason: collision with root package name */
    public final long f437t;

    /* renamed from: u, reason: collision with root package name */
    public final long f438u;

    /* renamed from: v, reason: collision with root package name */
    public final H6.h f439v;

    /* renamed from: w, reason: collision with root package name */
    public final H f440w;

    public C(z request, x protocol, String message, int i2, p pVar, q headers, E body, T6.v vVar, C c7, C c8, C c9, long j, long j7, H6.h hVar, H trailersSource) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
        this.f426d = request;
        this.f427e = protocol;
        this.f428i = message;
        this.f429l = i2;
        this.f430m = pVar;
        this.f431n = headers;
        this.f432o = body;
        this.f433p = vVar;
        this.f434q = c7;
        this.f435r = c8;
        this.f436s = c9;
        this.f437t = j;
        this.f438u = j7;
        this.f439v = hVar;
        this.f440w = trailersSource;
    }

    public static String a(C c7, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String a7 = c7.f431n.a(name);
        if (a7 == null) {
            return null;
        }
        return a7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f432o.close();
    }

    public final B d() {
        Intrinsics.checkNotNullParameter(this, "response");
        B b7 = new B();
        b7.f414c = -1;
        b7.f418g = E.f443d;
        b7.f425o = H.f455b;
        b7.f412a = this.f426d;
        b7.f413b = this.f427e;
        b7.f414c = this.f429l;
        b7.f415d = this.f428i;
        b7.f416e = this.f430m;
        b7.f417f = this.f431n.c();
        b7.f418g = this.f432o;
        b7.f419h = this.f433p;
        b7.f420i = this.f434q;
        b7.j = this.f435r;
        b7.f421k = this.f436s;
        b7.f422l = this.f437t;
        b7.f423m = this.f438u;
        b7.f424n = this.f439v;
        b7.f425o = this.f440w;
        return b7;
    }

    public final String toString() {
        return "Response{protocol=" + this.f427e + ", code=" + this.f429l + ", message=" + this.f428i + ", url=" + ((s) this.f426d.f640c) + '}';
    }
}
