package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ej2 implements iv0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f71 f25332a;

    public ej2(@NotNull f71 weakViewProvider) {
        Intrinsics.checkNotNullParameter(weakViewProvider, "weakViewProvider");
        this.f25332a = weakViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public final CheckBox getMuteControl() {
        return this.f25332a.d();
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public final ProgressBar getVideoProgress() {
        return this.f25332a.f();
    }
}
