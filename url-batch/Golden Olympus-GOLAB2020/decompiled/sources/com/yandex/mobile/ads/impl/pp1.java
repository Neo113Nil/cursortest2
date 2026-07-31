package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C1885dm;
import com.yandex.mobile.ads.impl.ff0;
import com.yandex.mobile.ads.impl.mh0;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mh0 f30519a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30520b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ff0 f30521c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final sp1 f30522d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<Class<?>, Object> f30523e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private C1885dm f30524f;

    public pp1(@NotNull mh0 url, @NotNull String method, @NotNull ff0 headers, @Nullable sp1 sp1Var, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f30519a = url;
        this.f30520b = method;
        this.f30521c = headers;
        this.f30522d = sp1Var;
        this.f30523e = tags;
    }

    @Nullable
    public final sp1 a() {
        return this.f30522d;
    }

    @NotNull
    public final C1885dm b() {
        C1885dm c1885dm = this.f30524f;
        if (c1885dm != null) {
            return c1885dm;
        }
        int i4 = C1885dm.f24664n;
        C1885dm a4 = C1885dm.b.a(this.f30521c);
        this.f30524f = a4;
        return a4;
    }

    @NotNull
    public final Map<Class<?>, Object> c() {
        return this.f30523e;
    }

    @NotNull
    public final ff0 d() {
        return this.f30521c;
    }

    public final boolean e() {
        return this.f30519a.h();
    }

    @NotNull
    public final String f() {
        return this.f30520b;
    }

    @NotNull
    public final mh0 g() {
        return this.f30519a;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f30520b);
        sb.append(", url=");
        sb.append(this.f30519a);
        if (this.f30521c.size() != 0) {
            sb.append(", headers=[");
            int i4 = 0;
            for (Pair<? extends String, ? extends String> pair : this.f30521c) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String component1 = pair2.component1();
                String component2 = pair2.component2();
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(component1);
                sb.append(':');
                sb.append(component2);
                i4 = i5;
            }
            sb.append(']');
        }
        if (!this.f30523e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f30523e);
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @Nullable
    public final String a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f30521c.a(name);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private mh0 f30525a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f30526b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private ff0.a f30527c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private sp1 f30528d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private Map<Class<?>, Object> f30529e;

        public a() {
            this.f30529e = new LinkedHashMap();
            this.f30526b = com.ironsource.jn.f16864a;
            this.f30527c = new ff0.a();
        }

        @NotNull
        public final void a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ff0.a aVar = this.f30527c;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ff0.b.b(name);
            ff0.b.b(value, name);
            aVar.a(name, value);
        }

        @NotNull
        public final a b(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ff0.a aVar = this.f30527c;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ff0.b.b(name);
            ff0.b.b(value, name);
            aVar.a(name);
            aVar.a(name, value);
            return this;
        }

        public a(@NotNull pp1 request) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f30529e = new LinkedHashMap();
            this.f30525a = request.g();
            this.f30526b = request.f();
            this.f30528d = request.a();
            if (request.c().isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = MapsKt.toMutableMap(request.c());
            }
            this.f30529e = mutableMap;
            this.f30527c = request.d().b();
        }

        @NotNull
        public final pp1 a() {
            Map unmodifiableMap;
            mh0 mh0Var = this.f30525a;
            if (mh0Var != null) {
                String str = this.f30526b;
                ff0 a4 = this.f30527c.a();
                sp1 sp1Var = this.f30528d;
                Map<Class<?>, Object> map = this.f30529e;
                byte[] bArr = v82.f33550a;
                Intrinsics.checkNotNullParameter(map, "<this>");
                if (map.isEmpty()) {
                    unmodifiableMap = MapsKt.emptyMap();
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                    Intrinsics.checkNotNull(unmodifiableMap);
                }
                return new pp1(mh0Var, str, a4, sp1Var, unmodifiableMap);
            }
            throw new IllegalStateException("url == null");
        }

        @NotNull
        public final void a(@NotNull C1885dm cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String value = cacheControl.toString();
            if (value.length() == 0) {
                Intrinsics.checkNotNullParameter("Cache-Control", "name");
                this.f30527c.a("Cache-Control");
                return;
            }
            Intrinsics.checkNotNullParameter("Cache-Control", "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ff0.a aVar = this.f30527c;
            aVar.getClass();
            Intrinsics.checkNotNullParameter("Cache-Control", "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ff0.b.b("Cache-Control");
            ff0.b.b(value, "Cache-Control");
            aVar.a("Cache-Control");
            aVar.a("Cache-Control", value);
        }

        @NotNull
        public final a a(@NotNull ff0 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f30527c = headers.b();
            return this;
        }

        @NotNull
        public final a a(@NotNull String method, @Nullable sp1 sp1Var) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() > 0) {
                if (sp1Var == null) {
                    if (fh0.b(method)) {
                        throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                    }
                } else if (!fh0.a(method)) {
                    throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
                }
                this.f30526b = method;
                this.f30528d = sp1Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        @NotNull
        public final void a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f30527c.a(name);
        }

        @NotNull
        public final a a(@NotNull mh0 url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f30525a = url;
            return this;
        }

        @NotNull
        public final a a(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
            Intrinsics.checkNotNullParameter(url2, "<this>");
            mh0 url3 = new mh0.a().a(null, url2).a();
            Intrinsics.checkNotNullParameter(url3, "url");
            this.f30525a = url3;
            return this;
        }
    }
}
