package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2060l6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f28431a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1869d6 f28432b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2084m6 f28433c;

    public /* synthetic */ C2060l6(C2286v2 c2286v2) {
        this(c2286v2, new C1869d6(), new C2084m6());
    }

    public final void a(@NotNull Context context, @NotNull AdQualityVerificationResult verificationResult, @Nullable C2360y7<?> c2360y7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
        if (verificationResult instanceof AdQualityVerificationResult.NotImplemented) {
            return;
        }
        jp1 a4 = this.f28432b.a(c2360y7, this.f28431a);
        this.f28433c.getClass();
        jp1 a5 = kp1.a(a4, C2084m6.b(verificationResult));
        ip1.b bVar = ip1.b.f27339a0;
        Map<String, Object> b4 = a5.b();
        ip1 ip1Var = new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a5, bVar, "reportType", b4, "reportData"));
        this.f28431a.p().f();
        C1900ed.a(context, zm2.f35627a, this.f28431a.p().b()).a(ip1Var);
    }

    public C2060l6(@NotNull C2286v2 adConfiguration, @NotNull C1869d6 adQualityAdapterReportDataProvider, @NotNull C2084m6 adQualityVerificationResultReportDataProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adQualityAdapterReportDataProvider, "adQualityAdapterReportDataProvider");
        Intrinsics.checkNotNullParameter(adQualityVerificationResultReportDataProvider, "adQualityVerificationResultReportDataProvider");
        this.f28431a = adConfiguration;
        this.f28432b = adQualityAdapterReportDataProvider;
        this.f28433c = adQualityVerificationResultReportDataProvider;
    }
}
