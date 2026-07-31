package com.onesignal.common;

import F5.q;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d {
    public static final d INSTANCE = new d();
    public static final String LOCAL_PREFIX = "local-";

    private d() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String id) {
        kotlin.jvm.internal.i.e(id, "id");
        return q.I(id, LOCAL_PREFIX);
    }
}
