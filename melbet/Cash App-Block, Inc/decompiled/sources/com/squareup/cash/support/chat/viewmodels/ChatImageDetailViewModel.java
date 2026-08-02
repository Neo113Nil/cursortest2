package com.squareup.cash.support.chat.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ChatImageDetailViewModel {
    public final String imageUrl;
    public final boolean showBars;

    public ChatImageDetailViewModel(String str, boolean z) {
        str.getClass();
        this.imageUrl = str;
        this.showBars = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatImageDetailViewModel)) {
            return false;
        }
        ChatImageDetailViewModel chatImageDetailViewModel = (ChatImageDetailViewModel) obj;
        return Intrinsics.areEqual(this.imageUrl, chatImageDetailViewModel.imageUrl) && this.showBars == chatImageDetailViewModel.showBars;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showBars) + (this.imageUrl.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("ChatImageDetailViewModel(imageUrl=", this.imageUrl, ", showBars=", ")", this.showBars);
    }
}
