package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2128o4 implements ug1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tg1 f29895a;

    public /* synthetic */ C2128o4(C2105n4 c2105n4) {
        this(c2105n4, new tg1(c2105n4));
    }

    @Override // com.yandex.mobile.ads.impl.ug1
    @NotNull
    public final LinkedHashMap a() {
        return this.f29895a.a(kotlin.collections.T.h(EnumC2082m4.f28846c, EnumC2082m4.f28847d, EnumC2082m4.f28848e, EnumC2082m4.f28850g, EnumC2082m4.f28851h, EnumC2082m4.f28852i, EnumC2082m4.f28854k, EnumC2082m4.f28853j, EnumC2082m4.f28855l, EnumC2082m4.f28856m, EnumC2082m4.f28857n, EnumC2082m4.f28858o, EnumC2082m4.f28859p, EnumC2082m4.f28860q, EnumC2082m4.f28861r, EnumC2082m4.f28862s, EnumC2082m4.f28863t, EnumC2082m4.f28866w, EnumC2082m4.f28869z));
    }

    public C2128o4(@NotNull C2105n4 adLoadingPhasesManager, @NotNull tg1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f29895a = phasesParametersExtractor;
    }
}
