package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lh0 extends AbstractC2303vj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC2303vj f28580a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r82 f28581b;

    public lh0(@NotNull AbstractC2303vj httpStackDelegate, @NotNull r82 userAgentProvider) {
        Intrinsics.checkNotNullParameter(httpStackDelegate, "httpStackDelegate");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.f28580a = httpStackDelegate;
        this.f28581b = userAgentProvider;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2303vj
    @NotNull
    public final hh0 a(@NotNull op1<?> request, @NotNull Map<String, String> additionalHeaders) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(additionalHeaders, "additionalHeaders");
        HashMap hashMap = new HashMap();
        hashMap.putAll(additionalHeaders);
        hashMap.put(bh0.f23767T.a(), this.f28581b.a());
        hh0 a4 = this.f28580a.a(request, hashMap);
        Intrinsics.checkNotNullExpressionValue(a4, "executeRequest(...)");
        return a4;
    }
}
