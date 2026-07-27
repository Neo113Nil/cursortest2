package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class HmsLocationController$start$2$1$4 extends j implements InterfaceC1441l {
    final /* synthetic */ HmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmsLocationController$start$2$1$4(HmsLocationController hmsLocationController) {
        super(1);
        this.this$0 = hmsLocationController;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ILocationUpdatedHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ILocationUpdatedHandler it) {
        Location location;
        i.e(it, "it");
        location = this.this$0.lastLocation;
        i.b(location);
        it.onLocationChanged(location);
    }
}
