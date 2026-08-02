package com.squareup.cash.support.chat.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SuggestedReply {
    public final ByteString payload;
    public final String text;
    public final String token;

    public SuggestedReply(String str, String str2, ByteString byteString) {
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.token = str;
        this.text = str2;
        this.payload = byteString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedReply)) {
            return false;
        }
        SuggestedReply suggestedReply = (SuggestedReply) obj;
        return Intrinsics.areEqual(this.token, suggestedReply.token) && Intrinsics.areEqual(this.text, suggestedReply.text) && Intrinsics.areEqual(this.payload, suggestedReply.payload);
    }

    public final ByteString getPayload() {
        return this.payload;
    }

    public final String getText() {
        return this.text;
    }

    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        return this.payload.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.text);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SuggestedReply(token=", this.token, ", text=", this.text, ", payload=");
        m.append(this.payload);
        m.append(")");
        return m.toString();
    }
}
