package com.onesignal.common;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;

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
        Intrinsics.checkNotNullParameter(id, "id");
        return p.l(id, LOCAL_PREFIX);
    }
}
