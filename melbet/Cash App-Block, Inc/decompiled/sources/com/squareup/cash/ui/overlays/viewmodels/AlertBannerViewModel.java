package com.squareup.cash.ui.overlays.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AlertBannerViewModel {
    public final String message;
    public final BannerStyle style;

    public AlertBannerViewModel(String str, BannerStyle bannerStyle) {
        str.getClass();
        this.message = str;
        this.style = bannerStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertBannerViewModel)) {
            return false;
        }
        AlertBannerViewModel alertBannerViewModel = (AlertBannerViewModel) obj;
        return Intrinsics.areEqual(this.message, alertBannerViewModel.message) && this.style == alertBannerViewModel.style;
    }

    public final int hashCode() {
        return this.style.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return "AlertBannerViewModel(message=" + this.message + ", style=" + this.style + ")";
    }
}
