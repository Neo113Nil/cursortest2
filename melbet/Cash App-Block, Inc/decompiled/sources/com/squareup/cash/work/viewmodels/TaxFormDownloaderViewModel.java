package com.squareup.cash.work.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxFormDownloaderViewModel {
    public final String cancelButton;
    public final String title;

    public TaxFormDownloaderViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.cancelButton = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxFormDownloaderViewModel)) {
            return false;
        }
        TaxFormDownloaderViewModel taxFormDownloaderViewModel = (TaxFormDownloaderViewModel) obj;
        return Intrinsics.areEqual(this.title, taxFormDownloaderViewModel.title) && Intrinsics.areEqual(this.cancelButton, taxFormDownloaderViewModel.cancelButton);
    }

    public final int hashCode() {
        return this.cancelButton.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("TaxFormDownloaderViewModel(title=", this.title, ", cancelButton=", this.cancelButton, ")");
    }
}
