package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.InterfaceC3247m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
final /* synthetic */ class cn2 implements na2, InterfaceC3247m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dn2 f24270a;

    cn2(dn2 dn2Var) {
        this.f24270a = dn2Var;
    }

    @Override // com.yandex.mobile.ads.impl.na2
    public final void a(@NotNull ma2 p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        dn2.a(this.f24270a, p02);
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof na2) && (obj instanceof InterfaceC3247m)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((InterfaceC3247m) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3247m
    @NotNull
    public final W1.e getFunctionDelegate() {
        return new kotlin.jvm.internal.p(1, this.f24270a, dn2.class, "trackVerificationNotExecuted", "trackVerificationNotExecuted(Lcom/yandex/mobile/ads/video/playback/tracker/verification/omsdk/error/VerificationNotExecutedException;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
