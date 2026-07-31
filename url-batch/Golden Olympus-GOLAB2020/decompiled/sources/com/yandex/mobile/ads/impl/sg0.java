package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ff0;
import com.yandex.mobile.ads.impl.i22;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.ug0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sg0 implements s50 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final List<String> f31732g = v82.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final List<String> f31733h = v82.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final un1 f31734a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xn1 f31735b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ng0 f31736c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile ug0 f31737d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final gm1 f31738e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f31739f;

    public static final class a {
        @NotNull
        public static oq1.a a(@NotNull ff0 headerBlock, @NotNull gm1 protocol) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            ff0.a aVar = new ff0.a();
            int size = headerBlock.size();
            i22 i22Var = null;
            for (int i4 = 0; i4 < size; i4++) {
                String a4 = headerBlock.a(i4);
                String b4 = headerBlock.b(i4);
                if (Intrinsics.areEqual(a4, ":status")) {
                    i22Var = i22.a.a("HTTP/1.1 " + b4);
                } else if (!sg0.f31733h.contains(a4)) {
                    aVar.a(a4, b4);
                }
            }
            if (i22Var != null) {
                return new oq1.a().a(protocol).a(i22Var.f27074b).a(i22Var.f27075c).a(aVar.a());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public sg0(@NotNull td1 client, @NotNull un1 connection, @NotNull xn1 chain, @NotNull ng0 http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f31734a = connection;
        this.f31735b = chain;
        this.f31736c = http2Connection;
        List<gm1> r4 = client.r();
        gm1 gm1Var = gm1.f26232h;
        this.f31738e = r4.contains(gm1Var) ? gm1Var : gm1.f26231g;
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @NotNull
    public final okio.z a(@NotNull pp1 request, long j4) {
        Intrinsics.checkNotNullParameter(request, "request");
        ug0 ug0Var = this.f31737d;
        Intrinsics.checkNotNull(ug0Var);
        return ug0Var.j();
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void b() {
        this.f31736c.flush();
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @NotNull
    public final un1 c() {
        return this.f31734a;
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void cancel() {
        this.f31739f = true;
        ug0 ug0Var = this.f31737d;
        if (ug0Var != null) {
            ug0Var.a(i50.f27095i);
        }
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final long b(@NotNull oq1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (dh0.a(response)) {
            return v82.a(response);
        }
        return 0L;
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void a() {
        ug0 ug0Var = this.f31737d;
        Intrinsics.checkNotNull(ug0Var);
        ug0Var.j().close();
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @NotNull
    public final okio.B a(@NotNull oq1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ug0 ug0Var = this.f31737d;
        Intrinsics.checkNotNull(ug0Var);
        return ug0Var.l();
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @Nullable
    public final oq1.a a(boolean z4) {
        ug0 ug0Var = this.f31737d;
        Intrinsics.checkNotNull(ug0Var);
        oq1.a a4 = a.a(ug0Var.s(), this.f31738e);
        if (z4 && a4.b() == 100) {
            return null;
        }
        return a4;
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void a(@NotNull pp1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f31737d != null) {
            return;
        }
        boolean z4 = request.a() != null;
        Intrinsics.checkNotNullParameter(request, "request");
        ff0 d4 = request.d();
        ArrayList arrayList = new ArrayList(d4.size() + 4);
        arrayList.add(new af0(af0.f23261f, request.f()));
        arrayList.add(new af0(af0.f23262g, wp1.a(request.g())));
        String a4 = request.a("Host");
        if (a4 != null) {
            arrayList.add(new af0(af0.f23264i, a4));
        }
        arrayList.add(new af0(af0.f23263h, request.g().k()));
        int size = d4.size();
        for (int i4 = 0; i4 < size; i4++) {
            String a5 = d4.a(i4);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = a5.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!f31732g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(d4.b(i4), "trailers"))) {
                arrayList.add(new af0(lowerCase, d4.b(i4)));
            }
        }
        this.f31737d = this.f31736c.a(arrayList, z4);
        if (!this.f31739f) {
            ug0 ug0Var = this.f31737d;
            Intrinsics.checkNotNull(ug0Var);
            ug0.c r4 = ug0Var.r();
            long e4 = this.f31735b.e();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            r4.timeout(e4, timeUnit);
            ug0 ug0Var2 = this.f31737d;
            Intrinsics.checkNotNull(ug0Var2);
            ug0Var2.u().timeout(this.f31735b.g(), timeUnit);
            return;
        }
        ug0 ug0Var3 = this.f31737d;
        Intrinsics.checkNotNull(ug0Var3);
        ug0Var3.a(i50.f27095i);
        throw new IOException("Canceled");
    }
}
