package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ob1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final me2 f29961a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ka1 f29962b;

    /* renamed from: c, reason: collision with root package name */
    private final double f29963c;

    public /* synthetic */ ob1(ga1 ga1Var, me2 me2Var) {
        this(ga1Var, me2Var, new ka1(ga1Var));
    }

    public final void a(@Nullable iv0 iv0Var) {
        if (iv0Var != null) {
            final CheckBox muteControl = iv0Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Lb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ob1.a(ob1.this, muteControl, view);
                    }
                });
                muteControl.setVisibility(this.f29961a.d() ? 0 : 8);
            }
            ProgressBar videoProgress = iv0Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f29961a.b() ? 8 : 0);
            }
            TextView countDownProgress = iv0Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    public ob1(@NotNull ga1 nativeVideoAdPlayer, @NotNull me2 videoOptions, @NotNull ka1 playerVolumeManager) {
        double d4;
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(playerVolumeManager, "playerVolumeManager");
        this.f29961a = videoOptions;
        this.f29962b = playerVolumeManager;
        Double a4 = videoOptions.a();
        if (a4 != null) {
            a4 = (a4.doubleValue() > 0.0d ? 1 : (a4.doubleValue() == 0.0d ? 0 : -1)) == 0 ? null : a4;
            if (a4 != null) {
                d4 = a4.doubleValue();
                this.f29963c = d4;
            }
        }
        d4 = 1.0d;
        this.f29963c = d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ob1 this$0, CheckBox checkBox, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f29962b.a(Double.valueOf(!checkBox.isChecked() ? this$0.f29963c : 0.0d));
    }
}
