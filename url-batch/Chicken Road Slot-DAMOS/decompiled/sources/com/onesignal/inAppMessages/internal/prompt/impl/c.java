package com.onesignal.inAppMessages.internal.prompt.impl;

import kotlin.jvm.internal.Intrinsics;
import qb.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements eb.a {
    private final ib.a _locationManager;
    private final n _notificationsManager;

    public c(n nVar, ib.a aVar) {
        nVar.getClass();
        aVar.getClass();
        this._notificationsManager = nVar;
        this._locationManager = aVar;
    }

    @Override // eb.a
    public b createPrompt(String str) {
        str.getClass();
        if (Intrinsics.a(str, "push")) {
            return new d(this._notificationsManager);
        }
        if (Intrinsics.a(str, "location")) {
            return new a(this._locationManager);
        }
        return null;
    }
}
