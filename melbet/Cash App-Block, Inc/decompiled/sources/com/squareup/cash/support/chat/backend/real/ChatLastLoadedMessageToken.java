package com.squareup.cash.support.chat.backend.real;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ChatLastLoadedMessageToken {
    public final String token;

    public final boolean equals(Object obj) {
        if (obj instanceof ChatLastLoadedMessageToken) {
            return Intrinsics.areEqual(this.token, ((ChatLastLoadedMessageToken) obj).token);
        }
        return false;
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChatLastLoadedMessageToken(token=", this.token, ")");
    }
}
