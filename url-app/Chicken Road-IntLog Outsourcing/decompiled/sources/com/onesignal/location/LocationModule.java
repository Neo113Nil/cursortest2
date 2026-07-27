package com.onesignal.location;

import b2.AbstractC0279e;
import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.location.internal.LocationManager;
import com.onesignal.location.internal.background.LocationBackgroundService;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.capture.impl.LocationCapturer;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.impl.FusedLocationApiWrapperImpl;
import com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper;
import com.onesignal.location.internal.permissions.LocationPermissionController;
import com.onesignal.location.internal.preferences.ILocationPreferencesService;
import com.onesignal.location.internal.preferences.impl.LocationPreferencesService;
import kotlin.jvm.internal.i;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class LocationModule implements IModule {
    @Override // com.onesignal.common.modules.IModule
    public void register(ServiceBuilder builder) {
        i.e(builder, "builder");
        builder.register(LocationPermissionController.class).provides(LocationPermissionController.class).provides(IStartableService.class);
        builder.register(FusedLocationApiWrapperImpl.class).provides(IFusedLocationApiWrapper.class);
        builder.register((InterfaceC1441l) LocationModule$register$1.INSTANCE).provides(ILocationController.class);
        builder.register(LocationPreferencesService.class).provides(ILocationPreferencesService.class);
        AbstractC0279e.n(builder, LocationCapturer.class, ILocationCapturer.class, LocationBackgroundService.class, IBackgroundService.class);
        builder.register(LocationManager.class).provides(ILocationManager.class).provides(IStartableService.class);
    }
}
