package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1846c7 implements ug1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tg1 f24075a;

    public /* synthetic */ C1846c7(C2105n4 c2105n4) {
        this(c2105n4, new tg1(c2105n4));
    }

    @Override // com.yandex.mobile.ads.impl.ug1
    @NotNull
    public final LinkedHashMap a() {
        return this.f24075a.a(kotlin.collections.T.c(EnumC2082m4.f28849f));
    }

    public C1846c7(@NotNull C2105n4 adLoadingPhasesManager, @NotNull tg1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f24075a = phasesParametersExtractor;
    }
}
