package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fp1 f24731a;

    public /* synthetic */ dp1() {
        this(new fp1());
    }

    @NotNull
    public final bp1 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Button a4 = this.f24731a.a(context);
        a4.setTag(jh2.a("replay_button"));
        a4.setVisibility(8);
        bp1 bp1Var = new bp1(context, a4);
        bp1Var.addView(a4);
        return bp1Var;
    }

    public dp1(@NotNull fp1 replayButtonCreator) {
        Intrinsics.checkNotNullParameter(replayButtonCreator, "replayButtonCreator");
        this.f24731a = replayButtonCreator;
    }
}
