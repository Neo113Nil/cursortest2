package com.onesignal.inAppMessages.internal.prompt.impl;

import F2.n;
import kotlin.jvm.internal.i;
import t2.InterfaceC0661a;
import x2.InterfaceC0728a;

/* loaded from: classes.dex */
public final class c implements InterfaceC0661a {
    private final InterfaceC0728a _locationManager;
    private final n _notificationsManager;

    public c(n _notificationsManager, InterfaceC0728a _locationManager) {
        i.e(_notificationsManager, "_notificationsManager");
        i.e(_locationManager, "_locationManager");
        this._notificationsManager = _notificationsManager;
        this._locationManager = _locationManager;
    }

    @Override // t2.InterfaceC0661a
    public b createPrompt(String promptType) {
        i.e(promptType, "promptType");
        if (promptType.equals("push")) {
            return new d(this._notificationsManager);
        }
        if (promptType.equals("location")) {
            return new a(this._locationManager);
        }
        return null;
    }
}
