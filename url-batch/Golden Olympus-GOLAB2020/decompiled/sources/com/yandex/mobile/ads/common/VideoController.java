package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.impl.fe2;
import com.yandex.mobile.ads.impl.in2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class VideoController {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fe2 f22437a;

    public VideoController(@NotNull fe2 videoEventController) {
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        this.f22437a = videoEventController;
    }

    public final void setVideoEventListener(@Nullable VideoEventListener videoEventListener) {
        if (videoEventListener == null) {
            this.f22437a.a((in2) null);
        } else {
            this.f22437a.a(new in2(videoEventListener));
        }
    }
}
