package com.onesignal.location.internal.permissions;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class LocationPermissionController$showFallbackAlertDialog$1$onDecline$1 extends j implements InterfaceC1441l {
    public static final LocationPermissionController$showFallbackAlertDialog$1$onDecline$1 INSTANCE = new LocationPermissionController$showFallbackAlertDialog$1$onDecline$1();

    public LocationPermissionController$showFallbackAlertDialog$1$onDecline$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ILocationPermissionChangedHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ILocationPermissionChangedHandler it) {
        i.e(it, "it");
        it.onLocationPermissionChanged(false);
    }
}
