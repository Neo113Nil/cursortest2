package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public final class h implements C2.a {
    @Override // C2.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // C2.a
    public Location getLastLocation() {
        return null;
    }

    @Override // C2.a
    public Object start(InterfaceC0564d interfaceC0564d) {
        return Boolean.FALSE;
    }

    @Override // C2.a
    public Object stop(InterfaceC0564d interfaceC0564d) {
        return v.f5219a;
    }

    @Override // C2.a, com.onesignal.common.events.d
    public void subscribe(C2.b handler) {
        i.e(handler, "handler");
    }

    @Override // C2.a, com.onesignal.common.events.d
    public void unsubscribe(C2.b handler) {
        i.e(handler, "handler");
    }
}
