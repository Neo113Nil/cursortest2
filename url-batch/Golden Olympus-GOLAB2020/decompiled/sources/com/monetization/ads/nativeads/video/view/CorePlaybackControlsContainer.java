package com.monetization.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.iv0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class CorePlaybackControlsContainer extends FrameLayout implements iv0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public TextView getCountDownProgress() {
        return (TextView) findViewById(R.id.video_count_down_control);
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public CheckBox getMuteControl() {
        return (CheckBox) findViewById(R.id.video_mute_control);
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public ProgressBar getVideoProgress() {
        return (ProgressBar) findViewById(R.id.video_progress_control);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
