package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import e3.InterfaceC0373a;
import e3.InterfaceC0374b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements InterfaceC0373a {
    @Override // e3.InterfaceC0373a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // e3.InterfaceC0373a
    public Location getLastLocation() {
        return null;
    }

    @Override // e3.InterfaceC0373a
    public Object start(V5.b bVar) {
        return Boolean.FALSE;
    }

    @Override // e3.InterfaceC0373a
    public Object stop(V5.b bVar) {
        return Unit.f6114a;
    }

    @Override // e3.InterfaceC0373a, com.onesignal.common.events.d
    public void subscribe(InterfaceC0374b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // e3.InterfaceC0373a, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC0374b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
