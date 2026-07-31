package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2340xa {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2396zk f34504a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2311w4 f34505b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ee2 f34506c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mj1 f34507d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34508e;

    public C2340xa(@NotNull C2396zk bindingControllerHolder, @NotNull C2311w4 adPlaybackStateController, @NotNull ee2 videoDurationHolder, @NotNull mj1 positionProviderHolder) {
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f34504a = bindingControllerHolder;
        this.f34505b = adPlaybackStateController;
        this.f34506c = videoDurationHolder;
        this.f34507d = positionProviderHolder;
    }

    public final boolean a() {
        return this.f34508e;
    }

    public final void b() {
        C2304vk a4 = this.f34504a.a();
        if (a4 != null) {
            hi1 b4 = this.f34507d.b();
            if (b4 == null) {
                ap0.b(new Object[0]);
                return;
            }
            this.f34508e = true;
            int adGroupIndexForPositionUs = this.f34505b.a().getAdGroupIndexForPositionUs(Util.msToUs(b4.a()), Util.msToUs(this.f34506c.a()));
            if (adGroupIndexForPositionUs == -1) {
                a4.a();
            } else if (adGroupIndexForPositionUs == this.f34505b.a().adGroupCount) {
                this.f34504a.c();
            } else {
                a4.a();
            }
        }
    }
}
