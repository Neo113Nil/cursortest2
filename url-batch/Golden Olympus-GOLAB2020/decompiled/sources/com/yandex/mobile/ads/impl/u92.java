package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u92 implements rg1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32894a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final hb2 f32895b;

    public u92(@NotNull String responseStatus, @Nullable hb2 hb2Var) {
        Intrinsics.checkNotNullParameter(responseStatus, "responseStatus");
        this.f32894a = responseStatus;
        this.f32895b = hb2Var;
    }

    @Override // com.yandex.mobile.ads.impl.rg1
    @NotNull
    public final Map<String, Object> a(long j4) {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)), TuplesKt.to("status", this.f32894a));
        hb2 hb2Var = this.f32895b;
        if (hb2Var != null) {
            mutableMapOf.put("failure_reason", hb2Var.a());
        }
        return mutableMapOf;
    }
}
