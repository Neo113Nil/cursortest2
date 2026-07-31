package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j82 f35444a;

    public z20(@NotNull dh1 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f35444a = tracker;
    }

    public final void a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("trackingUrl");
        if (queryParameter == null || queryParameter.length() <= 0) {
            return;
        }
        this.f35444a.a(queryParameter);
    }
}
