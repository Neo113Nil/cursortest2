package com.facebook.messenger;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MessengerThreadParams {
    private final String metadata;
    private final Origin origin;
    private final List<String> participants;
    private final String threadToken;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum Origin {
        REPLY_FLOW,
        COMPOSE_FLOW,
        UNKNOWN
    }

    public MessengerThreadParams(Origin origin, String str, String str2, List<String> list) {
        origin.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        this.origin = origin;
        this.threadToken = str;
        this.metadata = str2;
        this.participants = list;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final List<String> getParticipants() {
        return this.participants;
    }

    public final String getThreadToken() {
        return this.threadToken;
    }
}
