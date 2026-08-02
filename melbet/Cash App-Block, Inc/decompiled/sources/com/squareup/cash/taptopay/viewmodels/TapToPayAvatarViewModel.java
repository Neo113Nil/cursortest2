package com.squareup.cash.taptopay.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TapToPayAvatarViewModel {
    public final ColorModel.Accented backgroundColor;
    public final Character monogram;
    public final String photoUrl;

    public TapToPayAvatarViewModel(String str, Character ch, ColorModel.Accented accented) {
        this.photoUrl = str;
        this.monogram = ch;
        this.backgroundColor = accented;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapToPayAvatarViewModel)) {
            return false;
        }
        TapToPayAvatarViewModel tapToPayAvatarViewModel = (TapToPayAvatarViewModel) obj;
        return Intrinsics.areEqual(this.photoUrl, tapToPayAvatarViewModel.photoUrl) && Intrinsics.areEqual(this.monogram, tapToPayAvatarViewModel.monogram) && Intrinsics.areEqual(this.backgroundColor, tapToPayAvatarViewModel.backgroundColor);
    }

    public final int hashCode() {
        String str = this.photoUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Character ch = this.monogram;
        int hashCode2 = (hashCode + (ch == null ? 0 : ch.hashCode())) * 31;
        ColorModel.Accented accented = this.backgroundColor;
        return (hashCode2 + (accented != null ? accented.color.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "TapToPayAvatarViewModel(photoUrl=" + this.photoUrl + ", monogram=" + this.monogram + ", backgroundColor=" + this.backgroundColor + ", accessibilityText=null)";
    }
}
