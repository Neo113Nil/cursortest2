package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ff2 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gg2 f25776a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2160pd f25777b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final gu f25778c;

    public /* synthetic */ ff2(gg2 gg2Var) {
        this(gg2Var, new C2160pd(), new gu());
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        mb1 b4 = this.f25776a.b();
        if (b4 != null) {
            iv0 a4 = b4.a().a();
            ProgressBar videoProgress = a4 != null ? a4.getVideoProgress() : null;
            if (videoProgress != null) {
                this.f25777b.getClass();
                C2160pd.a(videoProgress, j4, j5);
            }
            iv0 a5 = b4.a().a();
            TextView countDownProgress = a5 != null ? a5.getCountDownProgress() : null;
            if (countDownProgress != null) {
                this.f25778c.a(countDownProgress, j4, j5);
            }
        }
    }

    public ff2(@NotNull gg2 videoViewAdapter, @NotNull C2160pd animatedProgressBarController, @NotNull gu countDownProgressController) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        Intrinsics.checkNotNullParameter(animatedProgressBarController, "animatedProgressBarController");
        Intrinsics.checkNotNullParameter(countDownProgressController, "countDownProgressController");
        this.f25776a = videoViewAdapter;
        this.f25777b = animatedProgressBarController;
        this.f25778c = countDownProgressController;
    }
}
