package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.AbstractC3398h;

/* renamed from: com.yandex.mobile.ads.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2107n6 implements AdQualityVerificationStateFlow {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AdQualityVerificationMode f29453a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AdQualityVerificationError f29454b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final r2.G f29455c;

    public C2107n6(@NotNull AdQualityVerificationMode verificationMode, @NotNull AdQualityVerificationError error) {
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f29453a = verificationMode;
        this.f29454b = error;
        this.f29455c = AbstractC3398h.a(r2.I.a(new AdQualityVerificationState.Blocked(new AdQualityVerificationBlockingReasons(CollectionsKt.listOf((Object[]) new String[]{"Ad is blocked by validation policy", error.getDescription()}), CollectionsKt.listOf((Object[]) new String[]{"Ad is blocked by validation policy", error.getDescription()})))));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2107n6)) {
            return false;
        }
        C2107n6 c2107n6 = (C2107n6) obj;
        return this.f29453a == c2107n6.f29453a && Intrinsics.areEqual(this.f29454b, c2107n6.f29454b);
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    @NotNull
    public final AdQualityVerificationMode getVerificationMode() {
        return this.f29453a;
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    @NotNull
    public final r2.G getVerificationResultStateFlow() {
        return this.f29455c;
    }

    public final int hashCode() {
        return this.f29454b.hashCode() + (this.f29453a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "AdQualityVerificationStateFlowBlockedByPolicy(verificationMode=" + this.f29453a + ", error=" + this.f29454b + ")";
    }
}
