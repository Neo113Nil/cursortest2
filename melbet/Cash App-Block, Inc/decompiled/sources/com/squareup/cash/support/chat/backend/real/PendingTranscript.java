package com.squareup.cash.support.chat.backend.real;

import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class PendingTranscript {
    public final LinkedHashMap messagesMap;

    public PendingTranscript(LinkedHashMap linkedHashMap) {
        this.messagesMap = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PendingTranscript) && this.messagesMap.equals(((PendingTranscript) obj).messagesMap);
    }

    public final int hashCode() {
        return this.messagesMap.hashCode();
    }

    public final String toString() {
        return "PendingTranscript(messagesMap=" + this.messagesMap + ")";
    }
}
