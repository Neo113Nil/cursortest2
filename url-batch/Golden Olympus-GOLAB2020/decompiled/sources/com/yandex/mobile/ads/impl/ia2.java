package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ia2 extends x52<bb2, List<? extends bb2>> {

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final r92 f27147C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull String url, @NotNull oi2 listener, @NotNull bb2 wrapper, @NotNull pk2 requestReporter, @NotNull r92 vastDataResponseParser) {
        super(context, adConfiguration, 0, url, listener, wrapper, requestReporter, null, 1920);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        Intrinsics.checkNotNullParameter(requestReporter, "requestReporter");
        Intrinsics.checkNotNullParameter(vastDataResponseParser, "vastDataResponseParser");
        this.f27147C = vastDataResponseParser;
    }

    @Override // com.yandex.mobile.ads.impl.x52
    @NotNull
    public final qq1<List<? extends bb2>> a(@NotNull lc1 networkResponse, int i4) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        o92 a4 = this.f27147C.a(networkResponse);
        if (a4 == null) {
            qq1<List<? extends bb2>> a5 = qq1.a(new uf1("Can't parse VAST response."));
            Intrinsics.checkNotNullExpressionValue(a5, "error(...)");
            return a5;
        }
        List<bb2> b4 = a4.b().b();
        if (b4.isEmpty()) {
            qq1<List<? extends bb2>> a6 = qq1.a(new v40());
            Intrinsics.checkNotNull(a6);
            return a6;
        }
        qq1<List<? extends bb2>> a7 = qq1.a(b4, null);
        Intrinsics.checkNotNull(a7);
        return a7;
    }
}
