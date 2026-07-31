package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kv1 implements ug1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tg1 f28335a;

    public /* synthetic */ kv1(C2105n4 c2105n4) {
        this(c2105n4, new tg1(c2105n4));
    }

    @Override // com.yandex.mobile.ads.impl.ug1
    @NotNull
    public final LinkedHashMap a() {
        return this.f28335a.a(kotlin.collections.T.h(EnumC2082m4.f28851h, EnumC2082m4.f28852i, EnumC2082m4.f28854k, EnumC2082m4.f28853j, EnumC2082m4.f28855l, EnumC2082m4.f28856m, EnumC2082m4.f28869z));
    }

    public kv1(@NotNull C2105n4 adLoadingPhasesManager, @NotNull tg1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f28335a = phasesParametersExtractor;
    }
}
