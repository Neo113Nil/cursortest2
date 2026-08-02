package com.squareup.cash.support.chat.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class ChatFailedDeliveryViewModel {
    public final boolean allowResend;

    public ChatFailedDeliveryViewModel(boolean z) {
        this.allowResend = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatFailedDeliveryViewModel) && this.allowResend == ((ChatFailedDeliveryViewModel) obj).allowResend;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.allowResend);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("ChatFailedDeliveryViewModel(allowResend=", ")", this.allowResend);
    }
}
