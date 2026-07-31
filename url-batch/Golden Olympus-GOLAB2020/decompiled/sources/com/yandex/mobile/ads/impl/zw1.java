package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zw1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gr f35810a;

    public /* synthetic */ zw1() {
        this(new gr());
    }

    public static boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        return a4 == null || a4.h0();
    }

    public final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = ew1.f25476l;
        du1 sdkConfiguration = ew1.a.a().a(context);
        if (sdkConfiguration == null || !sdkConfiguration.y0() || a(context)) {
            return true;
        }
        this.f35810a.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        return !Intrinsics.areEqual(ew1.a.a().e(), sdkConfiguration.W()) && Intrinsics.areEqual(ew1.a.a().e(), Boolean.TRUE);
    }

    public zw1(@NotNull gr consentUpdateValidator) {
        Intrinsics.checkNotNullParameter(consentUpdateValidator, "consentUpdateValidator");
        this.f35810a = consentUpdateValidator;
    }
}
