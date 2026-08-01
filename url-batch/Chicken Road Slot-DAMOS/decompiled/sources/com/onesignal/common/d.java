package com.onesignal.common;

import java.util.UUID;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {
    public static final d INSTANCE = new d();
    public static final String LOCAL_PREFIX = "local-";

    private d() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String str) {
        str.getClass();
        return str.startsWith(LOCAL_PREFIX);
    }
}
