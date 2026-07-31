package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2336x6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2036k6 f34455a;

    public C2336x6(@NotNull C2036k6 verificationPolicy) {
        Intrinsics.checkNotNullParameter(verificationPolicy, "verificationPolicy");
        this.f34455a = verificationPolicy;
    }

    @Nullable
    public final AdQualityVerificationResult.NotVerified a(@NotNull AdQualityVerificationAdConfiguration adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        C2313w6 c2313w6 = this.f34455a.a().get(adConfiguration.getVerifiableAdNetwork());
        int b4 = c2313w6 != null ? c2313w6.b() : this.f34455a.e();
        boolean z4 = true;
        boolean c4 = c2313w6 != null ? !c2313w6.a() : this.f34455a.c();
        if (!this.f34455a.d().contains(adConfiguration.getAdUnitId()) && !this.f34455a.d().isEmpty()) {
            z4 = false;
        }
        if (!c4 || !z4) {
            return new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.DisabledError());
        }
        if (kotlin.random.e.f41170b.l(0, 100) < b4) {
            return null;
        }
        return new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.LowUsagePercent());
    }
}
