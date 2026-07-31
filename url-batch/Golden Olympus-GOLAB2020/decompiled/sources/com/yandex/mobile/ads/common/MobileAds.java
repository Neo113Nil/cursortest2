package com.yandex.mobile.ads.common;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import com.yandex.mobile.ads.impl.d11;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.pl2;
import com.yandex.mobile.ads.impl.um2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class MobileAds {

    @NotNull
    public static final MobileAds INSTANCE = new MobileAds();

    private MobileAds() {
    }

    public static final void enableDebugErrorIndicator(boolean z4) {
        d11 d11Var = d11.f24391a;
        int i4 = ew1.f25476l;
        ew1.a.a().a(z4);
    }

    public static final void enableLogging(boolean z4) {
        d11.a(z4);
    }

    @NotNull
    public static final String getLibraryVersion() {
        d11 d11Var = d11.f24391a;
        return "7.15.0";
    }

    public static /* synthetic */ void getLibraryVersion$annotations() {
    }

    public static final void initialize(@NotNull Context context, @NotNull InitializationListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        d11.a(context, new um2(context), new pl2(initializationListener));
    }

    public static final void setAgeRestrictedUser(boolean z4) {
        d11 d11Var = d11.f24391a;
        int i4 = ew1.f25476l;
        ew1.a.a().c(z4);
    }

    public static final void setAppAdAnalyticsReporting(boolean z4) {
        d11 d11Var = d11.f24391a;
        int i4 = ew1.f25476l;
        ew1.a.a().d(z4);
    }

    public static final void setLocationConsent(boolean z4) {
        d11 d11Var = d11.f24391a;
        int i4 = ew1.f25476l;
        ew1.a.a().e(z4);
    }

    public static final void setUserConsent(boolean z4) {
        d11 d11Var = d11.f24391a;
        int i4 = ew1.f25476l;
        ew1.a.a().f(z4);
    }

    public static final void showDebugPanel(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) IntegrationInspectorActivity.class);
        intent.addFlags(805306368);
        context.startActivity(intent);
    }
}
