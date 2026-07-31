package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ph1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gg2 f30445a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cc2 f30446b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ob1 f30447c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final df2 f30448d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f30449e;

    private final class a implements ic2 {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private ic2 f30450a;

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ic2
        public final void a() {
            ic2 ic2Var = this.f30450a;
            if (ic2Var != null) {
                ic2Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ic2
        public final void b() {
            mb1 b4 = ph1.this.f30445a.b();
            if (b4 != null) {
                ea1 a4 = b4.a();
                ob1 ob1Var = ph1.this.f30447c;
                iv0 a5 = a4.a();
                ob1Var.getClass();
                if (a5 != null) {
                    CheckBox muteControl = a5.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = a5.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = a5.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            ic2 ic2Var = this.f30450a;
            if (ic2Var != null) {
                ic2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ic2
        public final void c() {
            mb1 b4 = ph1.this.f30445a.b();
            if (b4 != null) {
                ph1.this.f30448d.a(b4);
            }
            ic2 ic2Var = this.f30450a;
            if (ic2Var != null) {
                ic2Var.c();
            }
        }

        public final void a(@Nullable ic2 ic2Var) {
            this.f30450a = ic2Var;
        }
    }

    public ph1(@NotNull gg2 videoViewAdapter, @NotNull cc2 playbackController, @NotNull ob1 controlsConfigurator, @NotNull hl1 progressBarConfigurator) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        Intrinsics.checkNotNullParameter(playbackController, "playbackController");
        Intrinsics.checkNotNullParameter(controlsConfigurator, "controlsConfigurator");
        Intrinsics.checkNotNullParameter(progressBarConfigurator, "progressBarConfigurator");
        this.f30445a = videoViewAdapter;
        this.f30446b = playbackController;
        this.f30447c = controlsConfigurator;
        this.f30448d = new df2(controlsConfigurator, progressBarConfigurator);
        this.f30449e = new a();
    }

    public final void a(@Nullable ic2 ic2Var) {
        this.f30449e.a(ic2Var);
    }

    public final void a() {
        this.f30446b.a(this.f30449e);
        this.f30446b.play();
    }

    public final void a(@NotNull mb1 videoView) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.f30446b.stop();
        ea1 a4 = videoView.a();
        ob1 ob1Var = this.f30447c;
        iv0 a5 = a4.a();
        ob1Var.getClass();
        if (a5 != null) {
            CheckBox muteControl = a5.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(null);
                muteControl.setVisibility(8);
            }
            ProgressBar videoProgress = a5.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setProgress(0);
                videoProgress.setVisibility(8);
            }
            TextView countDownProgress = a5.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(8);
            }
        }
    }
}
