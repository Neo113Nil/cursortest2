package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ff0;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oq1 implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pp1 f30153a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gm1 f30154b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f30155c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30156d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final xe0 f30157e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ff0 f30158f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final sq1 f30159g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final oq1 f30160h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final oq1 f30161i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private final oq1 f30162j;

    /* renamed from: k, reason: collision with root package name */
    private final long f30163k;

    /* renamed from: l, reason: collision with root package name */
    private final long f30164l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private final r50 f30165m;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private pp1 f30166a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private gm1 f30167b;

        /* renamed from: c, reason: collision with root package name */
        private int f30168c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private String f30169d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private xe0 f30170e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private ff0.a f30171f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private sq1 f30172g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private oq1 f30173h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private oq1 f30174i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        private oq1 f30175j;

        /* renamed from: k, reason: collision with root package name */
        private long f30176k;

        /* renamed from: l, reason: collision with root package name */
        private long f30177l;

        /* renamed from: m, reason: collision with root package name */
        @Nullable
        private r50 f30178m;

        public a() {
            this.f30168c = -1;
            this.f30171f = new ff0.a();
        }

        @NotNull
        public final a a(@Nullable sq1 sq1Var) {
            this.f30172g = sq1Var;
            return this;
        }

        public final int b() {
            return this.f30168c;
        }

        @NotNull
        public final a c() {
            Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
            Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
            ff0.a aVar = this.f30171f;
            aVar.getClass();
            Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
            Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
            ff0.b.b("Proxy-Authenticate");
            ff0.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
            aVar.a("Proxy-Authenticate");
            aVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
            return this;
        }

        @NotNull
        public final oq1 a() {
            int i4 = this.f30168c;
            if (i4 < 0) {
                throw new IllegalStateException(("code < 0: " + i4).toString());
            }
            pp1 pp1Var = this.f30166a;
            if (pp1Var == null) {
                throw new IllegalStateException("request == null");
            }
            gm1 gm1Var = this.f30167b;
            if (gm1Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f30169d;
            if (str != null) {
                return new oq1(pp1Var, gm1Var, str, i4, this.f30170e, this.f30171f.a(), this.f30172g, this.f30173h, this.f30174i, this.f30175j, this.f30176k, this.f30177l, this.f30178m);
            }
            throw new IllegalStateException("message == null");
        }

        @NotNull
        public final a b(@Nullable oq1 oq1Var) {
            a(oq1Var, "networkResponse");
            this.f30173h = oq1Var;
            return this;
        }

        public a(@NotNull oq1 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f30168c = -1;
            this.f30166a = response.o();
            this.f30167b = response.m();
            this.f30168c = response.d();
            this.f30169d = response.i();
            this.f30170e = response.f();
            this.f30171f = response.g().b();
            this.f30172g = response.a();
            this.f30173h = response.j();
            this.f30174i = response.b();
            this.f30175j = response.l();
            this.f30176k = response.p();
            this.f30177l = response.n();
            this.f30178m = response.e();
        }

        @NotNull
        public final a b(long j4) {
            this.f30176k = j4;
            return this;
        }

        @NotNull
        public final a c(@Nullable oq1 oq1Var) {
            if (oq1Var.a() == null) {
                this.f30175j = oq1Var;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }

        @NotNull
        public final a a(@Nullable oq1 oq1Var) {
            a(oq1Var, "cacheResponse");
            this.f30174i = oq1Var;
            return this;
        }

        private static void a(oq1 oq1Var, String str) {
            if (oq1Var != null) {
                if (oq1Var.a() == null) {
                    if (oq1Var.j() == null) {
                        if (oq1Var.b() == null) {
                            if (oq1Var.l() == null) {
                                return;
                            }
                            throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        @NotNull
        public final a a(int i4) {
            this.f30168c = i4;
            return this;
        }

        @NotNull
        public final a a(@Nullable xe0 xe0Var) {
            this.f30170e = xe0Var;
            return this;
        }

        @NotNull
        public final a a(@NotNull ff0 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f30171f = headers.b();
            return this;
        }

        public final void a(@NotNull r50 deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f30178m = deferredTrailers;
        }

        @NotNull
        public final a a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f30169d = message;
            return this;
        }

        @NotNull
        public final a a(@NotNull gm1 protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f30167b = protocol;
            return this;
        }

        @NotNull
        public final a a(long j4) {
            this.f30177l = j4;
            return this;
        }

        @NotNull
        public final a a(@NotNull pp1 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f30166a = request;
            return this;
        }
    }

    public oq1(@NotNull pp1 request, @NotNull gm1 protocol, @NotNull String message, int i4, @Nullable xe0 xe0Var, @NotNull ff0 headers, @Nullable sq1 sq1Var, @Nullable oq1 oq1Var, @Nullable oq1 oq1Var2, @Nullable oq1 oq1Var3, long j4, long j5, @Nullable r50 r50Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f30153a = request;
        this.f30154b = protocol;
        this.f30155c = message;
        this.f30156d = i4;
        this.f30157e = xe0Var;
        this.f30158f = headers;
        this.f30159g = sq1Var;
        this.f30160h = oq1Var;
        this.f30161i = oq1Var2;
        this.f30162j = oq1Var3;
        this.f30163k = j4;
        this.f30164l = j5;
        this.f30165m = r50Var;
    }

    @Nullable
    public final sq1 a() {
        return this.f30159g;
    }

    @Nullable
    public final oq1 b() {
        return this.f30161i;
    }

    @NotNull
    public final List<pn> c() {
        String str;
        ff0 ff0Var = this.f30158f;
        int i4 = this.f30156d;
        if (i4 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i4 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return dh0.a(ff0Var, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        sq1 sq1Var = this.f30159g;
        if (sq1Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        v82.a((Closeable) sq1Var.c());
    }

    public final int d() {
        return this.f30156d;
    }

    @Nullable
    public final r50 e() {
        return this.f30165m;
    }

    @Nullable
    public final xe0 f() {
        return this.f30157e;
    }

    @NotNull
    public final ff0 g() {
        return this.f30158f;
    }

    public final boolean h() {
        int i4 = this.f30156d;
        return 200 <= i4 && i4 < 300;
    }

    @NotNull
    public final String i() {
        return this.f30155c;
    }

    @Nullable
    public final oq1 j() {
        return this.f30160h;
    }

    @NotNull
    public final a k() {
        return new a(this);
    }

    @Nullable
    public final oq1 l() {
        return this.f30162j;
    }

    @NotNull
    public final gm1 m() {
        return this.f30154b;
    }

    public final long n() {
        return this.f30164l;
    }

    @NotNull
    public final pp1 o() {
        return this.f30153a;
    }

    public final long p() {
        return this.f30163k;
    }

    @NotNull
    public final String toString() {
        return "Response{protocol=" + this.f30154b + ", code=" + this.f30156d + ", message=" + this.f30155c + ", url=" + this.f30153a.g() + "}";
    }

    public static String a(oq1 oq1Var, String name) {
        oq1Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String a4 = oq1Var.f30158f.a(name);
        if (a4 == null) {
            return null;
        }
        return a4;
    }
}
