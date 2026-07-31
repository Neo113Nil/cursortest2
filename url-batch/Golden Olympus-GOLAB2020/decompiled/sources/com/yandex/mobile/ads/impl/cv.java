package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cv implements iv0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final CheckBox f24325a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ProgressBar f24326b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final TextView f24327c;

    public cv() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv)) {
            return false;
        }
        cv cvVar = (cv) obj;
        return Intrinsics.areEqual(this.f24325a, cvVar.f24325a) && Intrinsics.areEqual(this.f24326b, cvVar.f24326b) && Intrinsics.areEqual(this.f24327c, cvVar.f24327c);
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public final TextView getCountDownProgress() {
        return this.f24327c;
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public final CheckBox getMuteControl() {
        return this.f24325a;
    }

    @Override // com.yandex.mobile.ads.impl.iv0
    @Nullable
    public final ProgressBar getVideoProgress() {
        return this.f24326b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.f24325a;
        int hashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.f24326b;
        int hashCode2 = (hashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.f24327c;
        return hashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.f24325a + ", videoProgress=" + this.f24326b + ", countDownProgress=" + this.f24327c + ")";
    }

    public /* synthetic */ cv(int i4) {
        this(null, null, null);
    }

    public cv(@Nullable CheckBox checkBox, @Nullable ProgressBar progressBar, @Nullable TextView textView) {
        this.f24325a = checkBox;
        this.f24326b = progressBar;
        this.f24327c = textView;
    }
}
