package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cz1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kn0 f24372a;

    public cz1(@NotNull kn0 instreamVastAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        this.f24372a = instreamVastAdPlayer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        this.f24372a.e();
    }
}
