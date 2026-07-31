package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2631fk extends C2953s5 {
    public C2631fk(@NonNull Context context, @NonNull C2633fm c2633fm, @NonNull C2772l5 c2772l5, @NonNull J4 j4, @NonNull InterfaceC3017uh interfaceC3017uh, @NonNull AbstractC2902q5 abstractC2902q5, @NonNull C2746k5 c2746k5) {
        this(context, c2772l5, new C2690i0(), new TimePassedChecker(), new C3083x5(context, c2772l5, j4, abstractC2902q5, c2633fm, interfaceC3017uh, Ia.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ia.j().k(), c2746k5), j4);
    }

    @Override // io.appmetrica.analytics.impl.C2953s5, io.appmetrica.analytics.impl.Za
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C2631fk(Context context, C2772l5 c2772l5, C2690i0 c2690i0, TimePassedChecker timePassedChecker, C3083x5 c3083x5, J4 j4) {
        super(context, c2772l5, c2690i0, timePassedChecker, c3083x5, j4);
    }
}
