package com.squareup.cash.support.chat.backend.api;

import androidx.glance.session.TimerScopeKt;

/* loaded from: classes7.dex */
public final class MessageStatus$Recorded extends TimerScopeKt {
    public static final MessageStatus$Recorded INSTANCE = new MessageStatus$Recorded();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MessageStatus$Recorded);
    }

    public final int hashCode() {
        return -1954999080;
    }

    public final String toString() {
        return "Recorded";
    }
}
