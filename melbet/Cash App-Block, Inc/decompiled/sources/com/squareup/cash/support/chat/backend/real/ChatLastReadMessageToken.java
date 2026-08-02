package com.squareup.cash.support.chat.backend.real;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ChatLastReadMessageToken {
    public final String token;

    public final boolean equals(Object obj) {
        if (obj instanceof ChatLastReadMessageToken) {
            return Intrinsics.areEqual(this.token, ((ChatLastReadMessageToken) obj).token);
        }
        return false;
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChatLastReadMessageToken(token=", this.token, ")");
    }
}
