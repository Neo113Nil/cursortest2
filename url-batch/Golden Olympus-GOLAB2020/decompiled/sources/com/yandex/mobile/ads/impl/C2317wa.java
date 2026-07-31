package com.yandex.mobile.ads.impl;

import androidx.media3.common.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2317wa {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2373yk f33967a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2288v4 f33968b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final de2 f33969c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final lj1 f33970d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33971e;

    public C2317wa(@NotNull C2373yk bindingControllerHolder, @NotNull C2288v4 adPlaybackStateController, @NotNull de2 videoDurationHolder, @NotNull lj1 positionProviderHolder) {
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f33967a = bindingControllerHolder;
        this.f33968b = adPlaybackStateController;
        this.f33969c = videoDurationHolder;
        this.f33970d = positionProviderHolder;
    }

    public final boolean a() {
        return this.f33971e;
    }

    public final void b() {
        C2281uk a4 = this.f33967a.a();
        if (a4 != null) {
            gi1 b4 = this.f33970d.b();
            if (b4 == null) {
                ap0.b(new Object[0]);
                return;
            }
            this.f33971e = true;
            int adGroupIndexForPositionUs = this.f33968b.a().getAdGroupIndexForPositionUs(Util.msToUs(b4.a()), Util.msToUs(this.f33969c.a()));
            if (adGroupIndexForPositionUs == -1) {
                a4.a();
            } else if (adGroupIndexForPositionUs == this.f33968b.a().adGroupCount) {
                this.f33967a.c();
            } else {
                a4.a();
            }
        }
    }
}
