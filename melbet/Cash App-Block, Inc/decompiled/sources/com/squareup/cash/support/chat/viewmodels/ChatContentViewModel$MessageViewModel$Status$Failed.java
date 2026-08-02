package com.squareup.cash.support.chat.viewmodels;

import androidx.media3.common.FileTypes;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ChatContentViewModel$MessageViewModel$Status$Failed extends FileTypes {
    public final String reason;

    public ChatContentViewModel$MessageViewModel$Status$Failed(String str) {
        str.getClass();
        this.reason = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatContentViewModel$MessageViewModel$Status$Failed) && Intrinsics.areEqual(this.reason, ((ChatContentViewModel$MessageViewModel$Status$Failed) obj).reason);
    }

    public final int hashCode() {
        return this.reason.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed(reason=", this.reason, ")");
    }
}
