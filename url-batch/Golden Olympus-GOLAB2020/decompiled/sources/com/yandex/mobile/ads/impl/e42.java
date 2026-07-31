package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e42 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f25086a = TimeUnit.SECONDS.toMillis(1);

    public static void a(@NotNull TextView rewardDelayTextView, long j4, long j5) {
        Intrinsics.checkNotNullParameter(rewardDelayTextView, "rewardDelayTextView");
        rewardDelayTextView.setText(String.valueOf((int) Math.ceil((j4 - j5) / f25086a)));
    }
}
