package com.squareup.cash.support.chat.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;

/* loaded from: classes7.dex */
public final class BodyViewModel$TypingIndicatorBodyViewModel extends ViewModelKt {
    public final boolean chatUiUpliftEnabled;

    public BodyViewModel$TypingIndicatorBodyViewModel(boolean z) {
        this.chatUiUpliftEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BodyViewModel$TypingIndicatorBodyViewModel) && this.chatUiUpliftEnabled == ((BodyViewModel$TypingIndicatorBodyViewModel) obj).chatUiUpliftEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.chatUiUpliftEnabled);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("TypingIndicatorBodyViewModel(chatUiUpliftEnabled=", ")", this.chatUiUpliftEnabled);
    }
}
