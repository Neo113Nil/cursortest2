package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ha, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1969ha implements rg1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ip1.c f26674a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f26675b;

    public C1969ha(@NotNull ip1.c status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f26674a = status;
        this.f26675b = str;
    }

    @Override // com.yandex.mobile.ads.impl.rg1
    @NotNull
    public final Map<String, Object> a(long j4) {
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(this.f26675b, com.ironsource.ge.f16389B1);
        jp1Var.b(this.f26674a.a(), "status");
        jp1Var.b(Long.valueOf(j4), IronSourceConstants.EVENTS_DURATION);
        return jp1Var.b();
    }
}
