package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1791a0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dp1 f23105a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hv0 f23106b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2375z f23107c;

    public /* synthetic */ C1791a0() {
        this(new dp1(), new hv0(), new C2375z());
    }

    @NotNull
    public final ea1 a(@NotNull Context context, @NotNull me2 videoOptions, @NotNull iv0 customControls, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(customControls, "customControls");
        ea1 actionViewsContainer = new ea1(context, this.f23105a.a(context), this.f23106b.a(context, i4, customControls));
        this.f23107c.getClass();
        Intrinsics.checkNotNullParameter(actionViewsContainer, "actionViewsContainer");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        iv0 a4 = actionViewsContainer.a();
        actionViewsContainer.b().setVisibility(8);
        CheckBox muteControl = a4 != null ? a4.getMuteControl() : null;
        if (muteControl != null) {
            muteControl.setVisibility(8);
        }
        ProgressBar videoProgress = a4 != null ? a4.getVideoProgress() : null;
        if (videoProgress != null) {
            videoProgress.setVisibility(8);
        }
        TextView countDownProgress = a4 != null ? a4.getCountDownProgress() : null;
        if (countDownProgress != null) {
            countDownProgress.setVisibility(8);
        }
        CheckBox muteControl2 = a4 != null ? a4.getMuteControl() : null;
        if (muteControl2 == null) {
            return actionViewsContainer;
        }
        muteControl2.setChecked(videoOptions.e());
        return actionViewsContainer;
    }

    public C1791a0(@NotNull dp1 replayActionViewCreator, @NotNull hv0 controlsContainerCreator, @NotNull C2375z mediaControlsContainerConfigurator) {
        Intrinsics.checkNotNullParameter(replayActionViewCreator, "replayActionViewCreator");
        Intrinsics.checkNotNullParameter(controlsContainerCreator, "controlsContainerCreator");
        Intrinsics.checkNotNullParameter(mediaControlsContainerConfigurator, "mediaControlsContainerConfigurator");
        this.f23105a = replayActionViewCreator;
        this.f23106b = controlsContainerCreator;
        this.f23107c = mediaControlsContainerConfigurator;
    }
}
