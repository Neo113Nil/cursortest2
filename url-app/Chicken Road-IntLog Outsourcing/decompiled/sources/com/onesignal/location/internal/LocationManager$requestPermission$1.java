package com.onesignal.location.internal;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.location.internal.LocationManager", f = "LocationManager.kt", l = {79}, m = "requestPermission")
/* loaded from: classes.dex */
public final class LocationManager$requestPermission$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManager$requestPermission$1(LocationManager locationManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = locationManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.requestPermission(this);
    }
}
