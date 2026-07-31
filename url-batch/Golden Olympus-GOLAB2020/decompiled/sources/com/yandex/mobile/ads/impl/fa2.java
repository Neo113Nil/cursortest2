package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fa2 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final qa2 f25726a;

    public fa2(@NotNull Context context, @NotNull sa2 verificationResourcesLoaderProvider, @Nullable qa2 qa2Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationResourcesLoaderProvider, "verificationResourcesLoaderProvider");
        this.f25726a = qa2Var;
    }

    public final void a(@NotNull List<bb2> videoAds, @NotNull ra2 listener) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f25726a != null && (!(videoAds instanceof Collection) || !videoAds.isEmpty())) {
            Iterator<T> it = videoAds.iterator();
            while (it.hasNext()) {
                if (!((bb2) it.next()).d().isEmpty()) {
                    this.f25726a.a(listener);
                    return;
                }
            }
        }
        listener.a();
    }
}
