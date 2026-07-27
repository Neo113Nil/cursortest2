package com.onesignal.location.internal.permissions;

import android.app.Activity;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.location.R;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class LocationPermissionController implements IRequestPermissionService.PermissionCallback, IStartableService, IEventNotifier<ILocationPermissionChangedHandler> {
    public static final Companion Companion = new Companion(null);
    private static final String PERMISSION_TYPE = "LOCATION";
    private final IApplicationService _applicationService;
    private final IRequestPermissionService _requestPermission;
    private String currPermission;
    private final EventProducer<ILocationPermissionChangedHandler> events;
    private final WaiterWithValue<Boolean> waiter;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public LocationPermissionController(IRequestPermissionService _requestPermission, IApplicationService _applicationService) {
        i.e(_requestPermission, "_requestPermission");
        i.e(_applicationService, "_applicationService");
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this.waiter = new WaiterWithValue<>();
        this.events = new EventProducer<>();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        final Activity current = this._applicationService.getCurrent();
        if (current == null) {
            return false;
        }
        AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
        String string = current.getString(R.string.location_permission_name_for_title);
        i.d(string, "getString(...)");
        String string2 = current.getString(R.string.location_permission_settings_message);
        i.d(string2, "getString(...)");
        alertDialogPrepromptForAndroidSettings.show(current, string, string2, new AlertDialogPrepromptForAndroidSettings.Callback() { // from class: com.onesignal.location.internal.permissions.LocationPermissionController$showFallbackAlertDialog$1
            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onAccept() {
                IApplicationService iApplicationService;
                iApplicationService = LocationPermissionController.this._applicationService;
                final LocationPermissionController locationPermissionController = LocationPermissionController.this;
                iApplicationService.addApplicationLifecycleHandler(new ApplicationLifecycleHandlerBase() { // from class: com.onesignal.location.internal.permissions.LocationPermissionController$showFallbackAlertDialog$1$onAccept$1
                    @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
                    public void onFocus(boolean z) {
                        IApplicationService iApplicationService2;
                        String str;
                        IApplicationService iApplicationService3;
                        WaiterWithValue waiterWithValue;
                        EventProducer eventProducer;
                        if (z) {
                            return;
                        }
                        super.onFocus(false);
                        iApplicationService2 = LocationPermissionController.this._applicationService;
                        iApplicationService2.removeApplicationLifecycleHandler(this);
                        AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                        str = LocationPermissionController.this.currPermission;
                        iApplicationService3 = LocationPermissionController.this._applicationService;
                        boolean hasPermission = androidUtils.hasPermission(str, true, iApplicationService3);
                        waiterWithValue = LocationPermissionController.this.waiter;
                        waiterWithValue.wake(Boolean.valueOf(hasPermission));
                        eventProducer = LocationPermissionController.this.events;
                        eventProducer.fire(new LocationPermissionController$showFallbackAlertDialog$1$onAccept$1$onFocus$1(hasPermission));
                    }
                });
                NavigateToAndroidSettingsForLocation.INSTANCE.show(current);
            }

            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onDecline() {
                WaiterWithValue waiterWithValue;
                EventProducer eventProducer;
                waiterWithValue = LocationPermissionController.this.waiter;
                waiterWithValue.wake(Boolean.FALSE);
                eventProducer = LocationPermissionController.this.events;
                eventProducer.fire(LocationPermissionController$showFallbackAlertDialog$1$onDecline$1.INSTANCE);
            }
        });
        return true;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(LocationPermissionController$onAccept$1.INSTANCE);
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onReject(boolean z) {
        if (z ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(LocationPermissionController$onReject$1.INSTANCE);
    }

    public final Object prompt(boolean z, String str, InterfaceC1218d interfaceC1218d) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z, PERMISSION_TYPE, str, LocationPermissionController.class);
        return this.waiter.waitForWake(interfaceC1218d);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._requestPermission.registerAsCallback(PERMISSION_TYPE, this);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationPermissionChangedHandler handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationPermissionChangedHandler handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }
}
