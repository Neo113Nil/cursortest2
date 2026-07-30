package com.onesignal.inAppMessages.internal.prompt.impl;

import h3.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements V2.a {
    private final Z2.a _locationManager;
    private final n _notificationsManager;

    public c(n _notificationsManager, Z2.a _locationManager) {
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        this._notificationsManager = _notificationsManager;
        this._locationManager = _locationManager;
    }

    @Override // V2.a
    public b createPrompt(String promptType) {
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        if (Intrinsics.a(promptType, "push")) {
            return new d(this._notificationsManager);
        }
        if (Intrinsics.a(promptType, "location")) {
            return new a(this._locationManager);
        }
        return null;
    }
}
