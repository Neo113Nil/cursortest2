package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zc2 implements ug1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tg1 f35551a;

    public /* synthetic */ zc2(C2105n4 c2105n4) {
        this(c2105n4, new tg1(c2105n4));
    }

    @Override // com.yandex.mobile.ads.impl.ug1
    @NotNull
    public final LinkedHashMap a() {
        return this.f35551a.a(kotlin.collections.T.h(EnumC2082m4.f28864u, EnumC2082m4.f28865v));
    }

    public zc2(@NotNull C2105n4 adLoadingPhasesManager, @NotNull tg1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f35551a = phasesParametersExtractor;
    }
}
