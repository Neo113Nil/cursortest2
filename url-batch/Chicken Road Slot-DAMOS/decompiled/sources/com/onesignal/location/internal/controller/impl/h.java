package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements nb.a {
    @Override // nb.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // nb.a
    public Location getLastLocation() {
        return null;
    }

    @Override // nb.a
    public Object start(ld.a aVar) {
        return Boolean.FALSE;
    }

    @Override // nb.a
    public Object stop(ld.a aVar) {
        return Unit.f5554a;
    }

    @Override // nb.a, com.onesignal.common.events.d
    public void subscribe(nb.b bVar) {
        bVar.getClass();
    }

    @Override // nb.a, com.onesignal.common.events.d
    public void unsubscribe(nb.b bVar) {
        bVar.getClass();
    }
}
