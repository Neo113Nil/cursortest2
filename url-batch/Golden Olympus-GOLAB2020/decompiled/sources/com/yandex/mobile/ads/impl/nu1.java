package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C2355y2;
import com.yandex.mobile.ads.impl.ew1;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nu1 extends AbstractC2372yj<du1> {

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Context f29756w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final bq1<du1> f29757x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f29758y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(@NotNull Context context, @NotNull String url, @NotNull ou1 requestPolicy, @NotNull Map customHeaders, @NotNull pu1 requestListener, @NotNull pu1 listener) {
        super(context, 0, url, listener, requestListener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        Intrinsics.checkNotNullParameter(customHeaders, "customHeaders");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f29756w = context;
        this.f29757x = requestPolicy;
        this.f29758y = customHeaders;
        r();
        s();
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    public final qq1<du1> a(@NotNull lc1 response) {
        EnumC1890e3 enumC1890e3;
        Intrinsics.checkNotNullParameter(response, "response");
        if (200 == response.f28505a) {
            du1 a4 = this.f29757x.a(response);
            if (a4 != null) {
                Map<String, String> map = response.f28507c;
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                a(map);
                qq1<du1> a5 = qq1.a(a4, ch0.a(response));
                Intrinsics.checkNotNullExpressionValue(a5, "success(...)");
                return a5;
            }
            enumC1890e3 = EnumC1890e3.f25069c;
        } else {
            enumC1890e3 = EnumC1890e3.f25071e;
        }
        qq1<du1> a6 = qq1.a(new C2355y2(enumC1890e3, response));
        Intrinsics.checkNotNullExpressionValue(a6, "error(...)");
        return a6;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2372yj, com.yandex.mobile.ads.impl.op1
    @NotNull
    public final hi2 b(@NotNull hi2 volleyError) {
        Intrinsics.checkNotNullParameter(volleyError, "volleyError");
        ap0.c(new Object[0]);
        int i4 = C2355y2.f34774d;
        C2355y2 volleyError2 = C2355y2.a.a(volleyError);
        Intrinsics.checkNotNullParameter(volleyError2, "volleyError");
        Intrinsics.checkNotNullExpressionValue(volleyError2, "parseNetworkError(...)");
        return volleyError2;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    public final Map<String, String> e() {
        HashMap headers = new HashMap();
        Context context = this.f29756w;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 != null && a4.e0()) {
            headers.put(bh0.f23768U.a(), "1");
        }
        headers.putAll(this.f29758y);
        return headers;
    }
}
