package com.ironsource;

import com.ironsource.C1511m3;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f19739a;

    public tb(@NotNull InterfaceC1541q3 analytics, @NotNull String adRequestAdId, @NotNull zp adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.f19739a = analytics;
        analytics.a(new C1511m3.s(adRequestProviderName.value()), new C1511m3.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC1490j3.c.f16799a.a().a(this.f19739a);
    }

    public final void a(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC1490j3.c.f16799a.a(new C1511m3.j(error.getErrorCode()), new C1511m3.k(error.getErrorMessage()), new C1511m3.f(0L)).a(this.f19739a);
    }
}
