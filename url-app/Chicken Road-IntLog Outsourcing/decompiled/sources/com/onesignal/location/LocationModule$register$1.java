package com.onesignal.location;

import com.onesignal.common.services.IServiceProvider;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.location.internal.common.LocationUtils;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.impl.GmsLocationController;
import com.onesignal.location.internal.controller.impl.HmsLocationController;
import com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper;
import com.onesignal.location.internal.controller.impl.NullLocationController;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class LocationModule$register$1 extends j implements InterfaceC1441l {
    public static final LocationModule$register$1 INSTANCE = new LocationModule$register$1();

    public LocationModule$register$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final ILocationController invoke(IServiceProvider it) {
        i.e(it, "it");
        IDeviceService iDeviceService = (IDeviceService) it.getService(IDeviceService.class);
        return (iDeviceService.isAndroidDeviceType() && LocationUtils.INSTANCE.hasGMSLocationLibrary()) ? new GmsLocationController((IApplicationService) it.getService(IApplicationService.class), (IFusedLocationApiWrapper) it.getService(IFusedLocationApiWrapper.class)) : (iDeviceService.isHuaweiDeviceType() && LocationUtils.INSTANCE.hasHMSLocationLibrary()) ? new HmsLocationController((IApplicationService) it.getService(IApplicationService.class)) : new NullLocationController();
    }
}
