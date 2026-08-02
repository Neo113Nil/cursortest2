package com.squareup.cash.stablecoin.viewmodels.widgets;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StablecoinWelcomeWidgetViewModel implements StablecoinHomeWidgetViewModel {
    public final String subtitle;
    public final String title;

    public StablecoinWelcomeWidgetViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinWelcomeWidgetViewModel)) {
            return false;
        }
        StablecoinWelcomeWidgetViewModel stablecoinWelcomeWidgetViewModel = (StablecoinWelcomeWidgetViewModel) obj;
        return Intrinsics.areEqual(this.title, stablecoinWelcomeWidgetViewModel.title) && Intrinsics.areEqual(this.subtitle, stablecoinWelcomeWidgetViewModel.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StablecoinWelcomeWidgetViewModel(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
