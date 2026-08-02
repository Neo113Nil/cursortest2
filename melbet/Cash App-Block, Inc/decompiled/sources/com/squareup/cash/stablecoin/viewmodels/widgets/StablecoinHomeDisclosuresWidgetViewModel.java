package com.squareup.cash.stablecoin.viewmodels.widgets;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StablecoinHomeDisclosuresWidgetViewModel implements StablecoinHomeWidgetViewModel {
    public final String formattedText;
    public final String url;

    public StablecoinHomeDisclosuresWidgetViewModel(String str, String str2) {
        str.getClass();
        this.url = str;
        this.formattedText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinHomeDisclosuresWidgetViewModel)) {
            return false;
        }
        StablecoinHomeDisclosuresWidgetViewModel stablecoinHomeDisclosuresWidgetViewModel = (StablecoinHomeDisclosuresWidgetViewModel) obj;
        return Intrinsics.areEqual(this.url, stablecoinHomeDisclosuresWidgetViewModel.url) && this.formattedText.equals(stablecoinHomeDisclosuresWidgetViewModel.formattedText);
    }

    public final int hashCode() {
        return this.formattedText.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StablecoinHomeDisclosuresWidgetViewModel(url=", this.url, ", formattedText=", this.formattedText, ")");
    }
}
