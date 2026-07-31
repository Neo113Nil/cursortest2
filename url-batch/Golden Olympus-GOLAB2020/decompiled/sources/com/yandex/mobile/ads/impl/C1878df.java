package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.df, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1878df {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f24607a = CollectionsKt.listOf((Object[]) new String[]{StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url"});

    @NotNull
    public static List a() {
        return f24607a;
    }
}
