package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C1914f3;
import com.yandex.mobile.ads.impl.C2355y2;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ci2 extends x52<di2, zh2> {

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final bi2 f24224C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final ki2 f24225D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull String url, @NotNull oi2 listener, @NotNull di2 configuration, @NotNull gi2 requestReporter, @NotNull bi2 vmapParser, @NotNull ki2 volleyNetworkResponseDecoder) {
        super(context, adConfiguration, 0, url, listener, configuration, requestReporter, null, 1920);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(requestReporter, "requestReporter");
        Intrinsics.checkNotNullParameter(vmapParser, "vmapParser");
        Intrinsics.checkNotNullParameter(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        this.f24224C = vmapParser;
        this.f24225D = volleyNetworkResponseDecoder;
        ap0.e(url);
    }

    @Override // com.yandex.mobile.ads.impl.x52
    @NotNull
    public final qq1<zh2> a(@NotNull lc1 networkResponse, int i4) {
        byte[] data;
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        if (200 == i4 && (data = networkResponse.f28506b) != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            if (data.length != 0) {
                String a4 = this.f24225D.a(networkResponse);
                Map<String, String> map = networkResponse.f28507c;
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                C1882dj c1882dj = new C1882dj(map);
                if (a4 == null || a4.length() == 0) {
                    qq1<zh2> a5 = qq1.a(new uf1("Can't parse VMAP response"));
                    Intrinsics.checkNotNull(a5);
                    return a5;
                }
                try {
                    qq1<zh2> a6 = qq1.a(this.f24224C.a(a4, c1882dj), null);
                    Intrinsics.checkNotNullExpressionValue(a6, "success(...)");
                    return a6;
                } catch (Exception e4) {
                    qq1<zh2> a7 = qq1.a(new uf1(e4));
                    Intrinsics.checkNotNullExpressionValue(a7, "error(...)");
                    return a7;
                }
            }
        }
        int i5 = C2355y2.f34774d;
        qq1<zh2> a8 = qq1.a(new hi2(C1914f3.a.a(null, C2355y2.a.a(networkResponse).a()).c()));
        Intrinsics.checkNotNullExpressionValue(a8, "error(...)");
        return a8;
    }
}
