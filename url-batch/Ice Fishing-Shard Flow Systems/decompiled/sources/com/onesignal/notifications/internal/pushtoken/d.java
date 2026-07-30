package com.onesignal.notifications.internal.pushtoken;

import Y3.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {
    private final f status;
    private final String token;

    public d(String str, f status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.token = str;
        this.status = status;
    }

    public final f getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }
}
