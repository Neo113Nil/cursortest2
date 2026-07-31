package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2009j3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f27448a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ss f27449b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rl0 f27450c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zi0 f27451d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final km0 f27452e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ec2<on0> f27453f;

    public C2009j3(@NotNull Context context, @NotNull ss adBreak, @NotNull rl0 adPlayerController, @NotNull sk1 imageProvider, @NotNull km0 adViewsHolderManager, @NotNull C2150p3 playbackEventsListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adPlayerController, "adPlayerController");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        this.f27448a = context;
        this.f27449b = adBreak;
        this.f27450c = adPlayerController;
        this.f27451d = imageProvider;
        this.f27452e = adViewsHolderManager;
        this.f27453f = playbackEventsListener;
    }

    @NotNull
    public final C1986i3 a() {
        return new C1986i3(new C2241t3(this.f27448a, this.f27449b, this.f27450c, this.f27451d, this.f27452e, this.f27453f).a(this.f27449b.f()));
    }
}
