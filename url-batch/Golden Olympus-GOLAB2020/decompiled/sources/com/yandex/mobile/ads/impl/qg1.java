package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qg1 implements rg1 {
    @Override // com.yandex.mobile.ads.impl.rg1
    @NotNull
    public final Map<String, Object> a(long j4) {
        return MapsKt.mapOf(TuplesKt.to(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)));
    }
}
