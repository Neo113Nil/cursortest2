package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ep1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gg2 f25382a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gp1 f25383b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cp1 f25384c;

    public ep1(@NotNull gg2 videoViewAdapter, @NotNull gp1 replayController, @NotNull cp1 replayViewConfigurator) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        Intrinsics.checkNotNullParameter(replayController, "replayController");
        Intrinsics.checkNotNullParameter(replayViewConfigurator, "replayViewConfigurator");
        this.f25382a = videoViewAdapter;
        this.f25383b = replayController;
        this.f25384c = replayViewConfigurator;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        mb1 b4 = this.f25382a.b();
        if (b4 != null) {
            bp1 b5 = b4.a().b();
            this.f25384c.getClass();
            cp1.b(b5);
            this.f25383b.a(b4);
        }
    }
}
