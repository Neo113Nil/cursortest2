package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1968h9 {
    @NotNull
    public static String a(@NotNull C1944g9 adTuneInfo) {
        Intrinsics.checkNotNullParameter(adTuneInfo, "adTuneInfo");
        ArrayList arrayList = new ArrayList();
        if (!StringsKt.z(adTuneInfo.a())) {
            arrayList.add(adTuneInfo.a());
        }
        if (!StringsKt.z(adTuneInfo.c())) {
            arrayList.add("erid: " + adTuneInfo.c());
        }
        return CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null);
    }
}
