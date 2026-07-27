package com.onesignal;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class UserJwtInvalidatedEvent {
    private final String externalId;

    public UserJwtInvalidatedEvent(String externalId) {
        i.e(externalId, "externalId");
        this.externalId = externalId;
    }

    public final String getExternalId() {
        return this.externalId;
    }
}
