package com.squareup.cash.support.chat.viewmodels;

import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BodyViewModel$TextBodyViewModel extends ViewModelKt {
    public final boolean chatUiUpliftEnabled;
    public final String text;

    public BodyViewModel$TextBodyViewModel(String str, boolean z) {
        str.getClass();
        this.text = str;
        this.chatUiUpliftEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyViewModel$TextBodyViewModel)) {
            return false;
        }
        BodyViewModel$TextBodyViewModel bodyViewModel$TextBodyViewModel = (BodyViewModel$TextBodyViewModel) obj;
        return Intrinsics.areEqual(this.text, bodyViewModel$TextBodyViewModel.text) && this.chatUiUpliftEnabled == bodyViewModel$TextBodyViewModel.chatUiUpliftEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.chatUiUpliftEnabled) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("TextBodyViewModel(text=", this.text, ", chatUiUpliftEnabled=", ")", this.chatUiUpliftEnabled);
    }
}
