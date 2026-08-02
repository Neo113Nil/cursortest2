package com.squareup.cash.support.chat.viewmodels;

import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BodyViewModel$ImageBodyViewModel extends ViewModelKt {
    public final boolean chatUiUpliftEnabled;
    public final String imageUrl;

    public BodyViewModel$ImageBodyViewModel(String str, boolean z) {
        str.getClass();
        this.imageUrl = str;
        this.chatUiUpliftEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyViewModel$ImageBodyViewModel)) {
            return false;
        }
        BodyViewModel$ImageBodyViewModel bodyViewModel$ImageBodyViewModel = (BodyViewModel$ImageBodyViewModel) obj;
        return Intrinsics.areEqual(this.imageUrl, bodyViewModel$ImageBodyViewModel.imageUrl) && this.chatUiUpliftEnabled == bodyViewModel$ImageBodyViewModel.chatUiUpliftEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.chatUiUpliftEnabled) + (this.imageUrl.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("ImageBodyViewModel(imageUrl=", this.imageUrl, ", chatUiUpliftEnabled=", ")", this.chatUiUpliftEnabled);
    }
}
