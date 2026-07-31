package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.AbstractC2372yj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j51 extends AbstractC1978hj<n61> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j51(@NotNull Context context, @NotNull bq1<n61> requestPolicy, @NotNull C2286v2 adConfiguration, @NotNull String url, @NotNull String query, @NotNull yp1 requestListener, @NotNull AbstractC2372yj.a<C2360y7<n61>> listener, @NotNull d61 responseParserCreator, @NotNull m61 nativeAdRequestReporter) {
        super(context, adConfiguration, url, query, responseParserCreator, requestListener, listener, nativeAdRequestReporter, null, 1792);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(responseParserCreator, "responseParserCreator");
        Intrinsics.checkNotNullParameter(nativeAdRequestReporter, "nativeAdRequestReporter");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if ((!(r5.length == 0)) == true) goto L15;
     */
    @Override // com.yandex.mobile.ads.impl.AbstractC1978hj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean b(@NotNull lc1 networkResponse, int i4) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        if (200 == i4) {
            Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
            byte[] bArr = networkResponse.f28506b;
            if (bArr != null) {
            }
        }
        return 204 == i4;
    }
}
