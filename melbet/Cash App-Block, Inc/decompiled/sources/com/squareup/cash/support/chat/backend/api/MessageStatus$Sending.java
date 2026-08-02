package com.squareup.cash.support.chat.backend.api;

import androidx.glance.session.TimerScopeKt;

/* loaded from: classes7.dex */
public final class MessageStatus$Sending extends TimerScopeKt {
    public static final MessageStatus$Sending INSTANCE = new MessageStatus$Sending();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MessageStatus$Sending);
    }

    public final int hashCode() {
        return -1659590094;
    }

    public final String toString() {
        return "Sending";
    }
}
