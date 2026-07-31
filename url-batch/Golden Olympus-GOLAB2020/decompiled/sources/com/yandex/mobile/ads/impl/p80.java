package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p80 extends AbstractC1978hj<String> {

    /* renamed from: J, reason: collision with root package name */
    @Nullable
    private final aa0 f30359J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull String url, @NotNull String query, @NotNull AbstractC2025jj requestListener, @NotNull AbstractC2025jj listener, @Nullable aa0 aa0Var, @NotNull hx1 sessionStorage, @NotNull qc1 networkResponseParserCreator, @NotNull C2108n7 adRequestReporter) {
        super(context, adConfiguration, url, query, networkResponseParserCreator, requestListener, listener, adRequestReporter, sessionStorage, 1536);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(sessionStorage, "sessionStorage");
        Intrinsics.checkNotNullParameter(networkResponseParserCreator, "networkResponseParserCreator");
        Intrinsics.checkNotNullParameter(adRequestReporter, "adRequestReporter");
        this.f30359J = aa0Var;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1978hj, com.yandex.mobile.ads.impl.x52, com.yandex.mobile.ads.impl.op1
    @NotNull
    public final Map<String, String> e() {
        Map<String, String> e4 = super.e();
        Map createMapBuilder = MapsKt.createMapBuilder();
        if (this.f30359J != null) {
            createMapBuilder.put(bh0.f23759L.a(), this.f30359J.a());
        }
        createMapBuilder.putAll(e4);
        return MapsKt.build(createMapBuilder);
    }
}
