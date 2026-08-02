package com.squareup.cash.support.chat.viewmodels;

import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BodyViewModel$SystemMessageBodyViewModel extends ViewModelKt {
    public final boolean chatUiUpliftEnabled;
    public final String text;

    public BodyViewModel$SystemMessageBodyViewModel(String str, boolean z) {
        str.getClass();
        this.text = str;
        this.chatUiUpliftEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyViewModel$SystemMessageBodyViewModel)) {
            return false;
        }
        BodyViewModel$SystemMessageBodyViewModel bodyViewModel$SystemMessageBodyViewModel = (BodyViewModel$SystemMessageBodyViewModel) obj;
        return Intrinsics.areEqual(this.text, bodyViewModel$SystemMessageBodyViewModel.text) && this.chatUiUpliftEnabled == bodyViewModel$SystemMessageBodyViewModel.chatUiUpliftEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.chatUiUpliftEnabled) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("SystemMessageBodyViewModel(text=", this.text, ", chatUiUpliftEnabled=", ")", this.chatUiUpliftEnabled);
    }
}
