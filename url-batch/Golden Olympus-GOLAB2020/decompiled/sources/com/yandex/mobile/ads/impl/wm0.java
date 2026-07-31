package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wm0 implements xe1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f34126a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dn0 f34127b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final n82 f34128c;

    public wm0(@NotNull Context context, @NotNull dn0 instreamInteractionTracker, @NotNull n82 urlViewerLauncher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instreamInteractionTracker, "instreamInteractionTracker");
        Intrinsics.checkNotNullParameter(urlViewerLauncher, "urlViewerLauncher");
        this.f34126a = context;
        this.f34127b = instreamInteractionTracker;
        this.f34128c = urlViewerLauncher;
    }

    @Override // com.yandex.mobile.ads.impl.xe1
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.f34128c.a(this.f34126a, url)) {
            this.f34127b.a();
        }
    }
}
