package com.squareup.cash.support.chat.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ChatErrorViewModel {
    public final String message;
    public final String title;

    public ChatErrorViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatErrorViewModel)) {
            return false;
        }
        ChatErrorViewModel chatErrorViewModel = (ChatErrorViewModel) obj;
        return Intrinsics.areEqual(this.title, chatErrorViewModel.title) && Intrinsics.areEqual(this.message, chatErrorViewModel.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ChatErrorViewModel(title=", this.title, ", message=", this.message, ")");
    }
}
