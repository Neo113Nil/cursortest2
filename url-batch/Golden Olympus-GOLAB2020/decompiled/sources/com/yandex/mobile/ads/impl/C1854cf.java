package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1854cf implements StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2367ye f24189a;

    public C1854cf(@NotNull InterfaceC2367ye appMetricaStartupParamsCallback) {
        Intrinsics.checkNotNullParameter(appMetricaStartupParamsCallback, "appMetricaStartupParamsCallback");
        this.f24189a = appMetricaStartupParamsCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(@Nullable StartupParamsCallback.Result result) {
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        InterfaceC2367ye interfaceC2367ye = this.f24189a;
        String str = null;
        String id = (result == null || (map3 = result.parameters) == null || (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) == null) ? null : startupParamsItem3.getId();
        String id2 = (result == null || (map2 = result.parameters) == null || (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) == null) ? null : startupParamsItem2.getId();
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            str = startupParamsItem.getId();
        }
        interfaceC2367ye.a(new C2321we(id, id2, str));
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(@NotNull StartupParamsCallback.Reason reason, @Nullable StartupParamsCallback.Result result) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f24189a.a(Intrinsics.areEqual(reason, StartupParamsCallback.Reason.NETWORK) ? EnumC2344xe.f34532c : Intrinsics.areEqual(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? EnumC2344xe.f34533d : EnumC2344xe.f34531b);
    }
}
