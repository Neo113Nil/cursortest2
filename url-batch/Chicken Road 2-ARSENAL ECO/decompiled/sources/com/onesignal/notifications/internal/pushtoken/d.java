package com.onesignal.notifications.internal.pushtoken;

import kotlin.jvm.internal.i;
import w3.f;

/* loaded from: classes.dex */
public final class d {
    private final f status;
    private final String token;

    public d(String str, f status) {
        i.e(status, "status");
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
