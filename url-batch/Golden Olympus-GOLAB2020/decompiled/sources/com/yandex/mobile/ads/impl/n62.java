package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n62 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1920f9 f29466a;

    public n62(@NotNull C1920f9 adTracker) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        this.f29466a = adTracker;
    }

    public final void a(@NotNull List<String> trackingUrls) {
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        Iterator<T> it = trackingUrls.iterator();
        while (it.hasNext()) {
            this.f29466a.a((String) it.next(), o62.f29919d);
        }
    }
}
