package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q12 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1968h9 f30638a = new C1968h9();

    @NotNull
    public final String a(@NotNull String sponsoredText, @NotNull C1944g9 adTuneInfo) {
        Intrinsics.checkNotNullParameter(sponsoredText, "sponsoredText");
        Intrinsics.checkNotNullParameter(adTuneInfo, "adTuneInfo");
        List mutableListOf = CollectionsKt.mutableListOf(sponsoredText);
        this.f30638a.getClass();
        String a4 = C1968h9.a(adTuneInfo);
        if (!StringsKt.z(a4)) {
            mutableListOf.add(a4);
        }
        return CollectionsKt.joinToString$default(mutableListOf, " · ", null, null, 0, null, null, 62, null);
    }
}
