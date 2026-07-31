package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f35626a = CollectionsKt.listOf((Object[]) new String[]{"adsdk.yandex.ru", "yandex.ru/ads"});

    public static boolean a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return CollectionsKt.contains(f35626a, uri.getHost());
    }
}
