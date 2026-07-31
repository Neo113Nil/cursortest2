package com.onesignal.location.internal;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.ILocationManager;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.common.LocationUtils;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.permissions.ILocationPermissionChangedHandler;
import com.onesignal.location.internal.permissions.LocationPermissionController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: LocationManager.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u000e\u0010\u001c\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u000e\u0010\u001f\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/onesignal/location/internal/LocationManager;", "Lcom/onesignal/location/ILocationManager;", "Lcom/onesignal/core/internal/startup/IStartableService;", "Lcom/onesignal/location/internal/permissions/ILocationPermissionChangedHandler;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_capturer", "Lcom/onesignal/location/internal/capture/ILocationCapturer;", "_locationController", "Lcom/onesignal/location/internal/controller/ILocationController;", "_locationPermissionController", "Lcom/onesignal/location/internal/permissions/LocationPermissionController;", "_prefs", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/location/internal/capture/ILocationCapturer;Lcom/onesignal/location/internal/controller/ILocationController;Lcom/onesignal/location/internal/permissions/LocationPermissionController;Lcom/onesignal/core/internal/preferences/IPreferencesService;)V", "_isShared", "", "value", "isShared", "()Z", "setShared", "(Z)V", "backgroundLocationPermissionLogic", "fallbackToSettings", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLocationPermissionChanged", "", ViewProps.ENABLED, "requestPermission", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ViewProps.START, "startGetLocation", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationManager implements ILocationManager, IStartableService, ILocationPermissionChangedHandler {
    private final IApplicationService _applicationService;
    private final ILocationCapturer _capturer;
    private boolean _isShared;
    private final ILocationController _locationController;
    private final LocationPermissionController _locationPermissionController;
    private final IPreferencesService _prefs;

    public LocationManager(IApplicationService _applicationService, ILocationCapturer _capturer, ILocationController _locationController, LocationPermissionController _locationPermissionController, IPreferencesService _prefs) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_capturer, "_capturer");
        Intrinsics.checkNotNullParameter(_locationController, "_locationController");
        Intrinsics.checkNotNullParameter(_locationPermissionController, "_locationPermissionController");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._applicationService = _applicationService;
        this._capturer = _capturer;
        this._locationController = _locationController;
        this._locationPermissionController = _locationPermissionController;
        this._prefs = _prefs;
        Boolean bool = _prefs.getBool("OneSignal", PreferenceOneSignalKeys.PREFS_OS_LOCATION_SHARED, false);
        Intrinsics.checkNotNull(bool);
        this._isShared = bool.booleanValue();
    }

    @Override // com.onesignal.location.ILocationManager
    /* renamed from: isShared, reason: from getter */
    public boolean get_isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.ILocationManager
    public void setShared(boolean z) {
        Logging.debug$default("LocationManager.setIsShared(value: " + z + ')', null, 2, null);
        this._prefs.saveBool("OneSignal", PreferenceOneSignalKeys.PREFS_OS_LOCATION_SHARED, Boolean.valueOf(z));
        this._isShared = z;
        onLocationPermissionChanged(z);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._locationPermissionController.subscribe((ILocationPermissionChangedHandler) this);
        if (LocationUtils.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            ThreadUtilsKt.suspendifyOnIO(new LocationManager$start$1(this, null));
        }
    }

    @Override // com.onesignal.location.internal.permissions.ILocationPermissionChangedHandler
    public void onLocationPermissionChanged(boolean enabled) {
        if (enabled) {
            ThreadUtilsKt.suspendifyOnIO(new LocationManager$onLocationPermissionChanged$1(this, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.location.ILocationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(Continuation<? super Boolean> continuation) {
        LocationManager$requestPermission$1 locationManager$requestPermission$1;
        int i;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof LocationManager$requestPermission$1) {
            locationManager$requestPermission$1 = (LocationManager$requestPermission$1) continuation;
            if ((locationManager$requestPermission$1.label & Integer.MIN_VALUE) != 0) {
                locationManager$requestPermission$1.label -= Integer.MIN_VALUE;
                Object obj = locationManager$requestPermission$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = locationManager$requestPermission$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logging.log(LogLevel.DEBUG, "LocationManager.requestPermission()");
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    LocationManager$requestPermission$2 locationManager$requestPermission$2 = new LocationManager$requestPermission$2(this, booleanRef2, null);
                    locationManager$requestPermission$1.L$0 = booleanRef2;
                    locationManager$requestPermission$1.label = 1;
                    if (BuildersKt.withContext(main, locationManager$requestPermission$2, locationManager$requestPermission$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) locationManager$requestPermission$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        locationManager$requestPermission$1 = new LocationManager$requestPermission$1(this, continuation);
        Object obj2 = locationManager$requestPermission$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = locationManager$requestPermission$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z, Continuation<? super Boolean> continuation) {
        if (AndroidUtils.INSTANCE.hasPermission(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, false, this._applicationService)) {
            return this._locationPermissionController.prompt(z, LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, continuation);
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(2:20|(2:22|23)(3:24|25|(1:27)))|11|(1:13)|15|16))|30|6|7|(0)(0)|11|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        com.onesignal.debug.internal.logging.Logging.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:10:0x0028, B:11:0x0052, B:13:0x005a, B:25:0x0047), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startGetLocation(Continuation<? super Unit> continuation) {
        LocationManager$startGetLocation$1 locationManager$startGetLocation$1;
        Object obj;
        int i;
        if (continuation instanceof LocationManager$startGetLocation$1) {
            locationManager$startGetLocation$1 = (LocationManager$startGetLocation$1) continuation;
            if ((locationManager$startGetLocation$1.label & Integer.MIN_VALUE) != 0) {
                locationManager$startGetLocation$1.label -= Integer.MIN_VALUE;
                obj = locationManager$startGetLocation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = locationManager$startGetLocation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!get_isShared()) {
                        return Unit.INSTANCE;
                    }
                    Logging.debug$default("LocationManager.startGetLocation()", null, 2, null);
                    ILocationController iLocationController = this._locationController;
                    locationManager$startGetLocation$1.label = 1;
                    obj = iLocationController.start(locationManager$startGetLocation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    Logging.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
                }
                return Unit.INSTANCE;
            }
        }
        locationManager$startGetLocation$1 = new LocationManager$startGetLocation$1(this, continuation);
        obj = locationManager$startGetLocation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = locationManager$startGetLocation$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }
}
