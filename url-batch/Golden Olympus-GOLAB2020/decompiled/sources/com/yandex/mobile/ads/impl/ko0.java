package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ko0 extends AbstractC2372yj<gx> {

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Context f28281w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final bq1<gx> f28282x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f28283y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(@NotNull Context context, @NotNull String url, @NotNull bq1 requestPolicy, @NotNull Map customHeaders, @NotNull vk0 listener) {
        super(context, url, listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        Intrinsics.checkNotNullParameter(customHeaders, "customHeaders");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f28281w = context;
        this.f28282x = requestPolicy;
        this.f28283y = customHeaders;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    protected final qq1<gx> a(@NotNull lc1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (200 != response.f28505a) {
            qq1<gx> a4 = qq1.a(new C2355y2(EnumC1890e3.f25071e, response));
            Intrinsics.checkNotNull(a4);
            return a4;
        }
        gx a5 = this.f28282x.a(response);
        qq1<gx> a6 = a5 != null ? qq1.a(a5, ch0.a(response)) : qq1.a(new C2355y2(EnumC1890e3.f25069c, response));
        Intrinsics.checkNotNull(a6);
        return a6;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2372yj, com.yandex.mobile.ads.impl.op1
    @NotNull
    protected final hi2 b(@NotNull hi2 volleyError) {
        Intrinsics.checkNotNullParameter(volleyError, "volleyError");
        ap0.c(new Object[0]);
        Intrinsics.checkNotNullParameter(volleyError, "volleyError");
        Intrinsics.checkNotNullExpressionValue(volleyError, "parseNetworkError(...)");
        return volleyError;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    public final Map<String, String> e() {
        HashMap headers = new HashMap();
        Context context = this.f28281w;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 != null && a4.e0()) {
            headers.put(bh0.f23768U.a(), "1");
        }
        headers.putAll(this.f28283y);
        return headers;
    }
}
