package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bg2 f23428a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o31 f23429b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final dz1 f23430c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final il1 f23431d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final rm0 f23432e;

    public /* synthetic */ as(Context context, kn0 kn0Var, ss ssVar, ob2 ob2Var, bg2 bg2Var, cb2 cb2Var) {
        this(context, kn0Var, ssVar, ob2Var, bg2Var, cb2Var, new o31(kn0Var), new dz1(kn0Var, (on0) ob2Var.d()), new il1(), new rm0(ssVar, ob2Var));
    }

    public final void a(@NotNull db2 uiElements, @NotNull tm0 controlsState) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        this.f23432e.a(uiElements);
        this.f23429b.a(uiElements, controlsState);
        View n4 = uiElements.n();
        if (n4 != null) {
            this.f23430c.a(n4, controlsState);
        }
        ProgressBar progressBar = uiElements.j();
        if (progressBar != null) {
            this.f23431d.getClass();
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            Intrinsics.checkNotNullParameter(controlsState, "controlsState");
            progressBar.setProgress((int) (progressBar.getMax() * controlsState.b()));
        }
    }

    public as(@NotNull Context context, @NotNull kn0 instreamVastAdPlayer, @NotNull ss adBreak, @NotNull ob2 videoAdInfo, @NotNull bg2 videoTracker, @NotNull cb2 playbackListener, @NotNull o31 muteControlConfigurator, @NotNull dz1 skipControlConfigurator, @NotNull il1 progressBarConfigurator, @NotNull rm0 instreamContainerTagConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(muteControlConfigurator, "muteControlConfigurator");
        Intrinsics.checkNotNullParameter(skipControlConfigurator, "skipControlConfigurator");
        Intrinsics.checkNotNullParameter(progressBarConfigurator, "progressBarConfigurator");
        Intrinsics.checkNotNullParameter(instreamContainerTagConfigurator, "instreamContainerTagConfigurator");
        this.f23428a = videoTracker;
        this.f23429b = muteControlConfigurator;
        this.f23430c = skipControlConfigurator;
        this.f23431d = progressBarConfigurator;
        this.f23432e = instreamContainerTagConfigurator;
    }
}
