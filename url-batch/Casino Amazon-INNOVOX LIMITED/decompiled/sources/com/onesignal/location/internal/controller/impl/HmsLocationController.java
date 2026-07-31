package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.app.NotificationCompat;
import com.facebook.react.uimanager.ViewProps;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: HmsLocationController.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0017\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/onesignal/location/internal/controller/impl/HmsLocationController;", "Lcom/onesignal/location/internal/controller/ILocationController;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "(Lcom/onesignal/core/internal/application/IApplicationService;)V", NotificationCompat.CATEGORY_EVENT, "Lcom/onesignal/common/events/EventProducer;", "Lcom/onesignal/location/internal/controller/ILocationUpdatedHandler;", "hasSubscribers", "", "getHasSubscribers", "()Z", "hmsFusedLocationClient", "Lcom/huawei/hms/location/FusedLocationProviderClient;", "lastLocation", "Landroid/location/Location;", "locationHandlerThread", "Lcom/onesignal/location/internal/controller/impl/HmsLocationController$LocationHandlerThread;", "locationUpdateListener", "Lcom/onesignal/location/internal/controller/impl/HmsLocationController$LocationUpdateListener;", "startStopMutex", "Lkotlinx/coroutines/sync/Mutex;", "getLastLocation", ViewProps.START, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "", "subscribe", "handler", "unsubscribe", "LocationHandlerThread", "LocationUpdateListener", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HmsLocationController implements ILocationController {
    private final IApplicationService _applicationService;
    private final EventProducer<ILocationUpdatedHandler> event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final LocationHandlerThread locationHandlerThread;
    private LocationUpdateListener locationUpdateListener;
    private final Mutex startStopMutex;

    public HmsLocationController(IApplicationService _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
        this.locationHandlerThread = new LocationHandlerThread();
        this.startStopMutex = MutexKt.Mutex$default(false, 1, null);
        this.event = new EventProducer<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(Continuation<? super Boolean> continuation) {
        HmsLocationController$start$1 hmsLocationController$start$1;
        int i;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof HmsLocationController$start$1) {
            hmsLocationController$start$1 = (HmsLocationController$start$1) continuation;
            if ((hmsLocationController$start$1.label & Integer.MIN_VALUE) != 0) {
                hmsLocationController$start$1.label -= Integer.MIN_VALUE;
                Object obj = hmsLocationController$start$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hmsLocationController$start$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = this;
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    HmsLocationController$start$2 hmsLocationController$start$2 = new HmsLocationController$start$2(this, booleanRef2, objectRef, null);
                    hmsLocationController$start$1.L$0 = booleanRef2;
                    hmsLocationController$start$1.label = 1;
                    if (BuildersKt.withContext(io2, hmsLocationController$start$2, hmsLocationController$start$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) hmsLocationController$start$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        hmsLocationController$start$1 = new HmsLocationController$start$1(this, continuation);
        Object obj2 = hmsLocationController$start$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hmsLocationController$start$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x005b, B:16:0x005f, B:17:0x0061), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x005b, B:16:0x005f, B:17:0x0061), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(Continuation<? super Unit> continuation) {
        HmsLocationController$stop$1 hmsLocationController$stop$1;
        int i;
        HmsLocationController hmsLocationController;
        Mutex mutex;
        LocationUpdateListener locationUpdateListener;
        try {
            if (continuation instanceof HmsLocationController$stop$1) {
                hmsLocationController$stop$1 = (HmsLocationController$stop$1) continuation;
                if ((hmsLocationController$stop$1.label & Integer.MIN_VALUE) != 0) {
                    hmsLocationController$stop$1.label -= Integer.MIN_VALUE;
                    Object obj = hmsLocationController$stop$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = hmsLocationController$stop$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.startStopMutex;
                        hmsLocationController$stop$1.L$0 = this;
                        hmsLocationController$stop$1.L$1 = mutex2;
                        hmsLocationController$stop$1.label = 1;
                        if (mutex2.lock(null, hmsLocationController$stop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hmsLocationController = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) hmsLocationController$stop$1.L$1;
                        hmsLocationController = (HmsLocationController) hmsLocationController$stop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    locationUpdateListener = hmsLocationController.locationUpdateListener;
                    if (locationUpdateListener != null) {
                        Intrinsics.checkNotNull(locationUpdateListener);
                        locationUpdateListener.close();
                        hmsLocationController.locationUpdateListener = null;
                    }
                    if (hmsLocationController.hmsFusedLocationClient != null) {
                        hmsLocationController.hmsFusedLocationClient = null;
                    }
                    hmsLocationController.lastLocation = null;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            locationUpdateListener = hmsLocationController.locationUpdateListener;
            if (locationUpdateListener != null) {
            }
            if (hmsLocationController.hmsFusedLocationClient != null) {
            }
            hmsLocationController.lastLocation = null;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        hmsLocationController$stop$1 = new HmsLocationController$stop$1(this, continuation);
        Object obj2 = hmsLocationController$stop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hmsLocationController$stop$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.location.internal.controller.ILocationController
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ThreadUtilsKt.suspendifyOnIO(new HmsLocationController$getLastLocation$1(fusedLocationProviderClient, objectRef, null));
        return (Location) objectRef.element;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationUpdatedHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationUpdatedHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.event.unsubscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    /* compiled from: HmsLocationController.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/onesignal/location/internal/controller/impl/HmsLocationController$LocationUpdateListener;", "Lcom/huawei/hms/location/LocationCallback;", "Lcom/onesignal/core/internal/application/IApplicationLifecycleHandler;", "Ljava/io/Closeable;", "_parent", "Lcom/onesignal/location/internal/controller/impl/HmsLocationController;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "huaweiFusedLocationProviderClient", "Lcom/huawei/hms/location/FusedLocationProviderClient;", "(Lcom/onesignal/location/internal/controller/impl/HmsLocationController;Lcom/onesignal/core/internal/application/IApplicationService;Lcom/huawei/hms/location/FusedLocationProviderClient;)V", "hasExistingRequest", "", "close", "", "onFocus", "firedOnSubscribe", "onLocationResult", "locationResult", "Lcom/huawei/hms/location/LocationResult;", "onUnfocused", "refreshRequest", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LocationUpdateListener extends LocationCallback implements IApplicationLifecycleHandler, Closeable {
        private final IApplicationService _applicationService;
        private final HmsLocationController _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public LocationUpdateListener(HmsLocationController _parent, IApplicationService _applicationService, FusedLocationProviderClient huaweiFusedLocationProviderClient) {
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
            Intrinsics.checkNotNullParameter(huaweiFusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = _parent;
            this._applicationService = _applicationService;
            this.huaweiFusedLocationProviderClient = huaweiFusedLocationProviderClient;
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onFocus(boolean firedOnSubscribe) {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onUnfocused() {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
        }

        public void onLocationResult(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            Logging.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        private final void refreshRequest() {
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
            long j = this._applicationService.isInForeground() ? LocationConstants.FOREGROUND_UPDATE_TIME_MS : LocationConstants.BACKGROUND_UPDATE_TIME_MS;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            Logging.debug$default("HMSLocationController Huawei LocationServices requestLocationUpdates!", null, 2, null);
            this.huaweiFusedLocationProviderClient.requestLocationUpdates(priority, this, this._parent.locationHandlerThread.getLooper());
            this.hasExistingRequest = true;
        }
    }

    /* compiled from: HmsLocationController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/location/internal/controller/impl/HmsLocationController$LocationHandlerThread;", "Landroid/os/HandlerThread;", "()V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LocationHandlerThread extends HandlerThread {
        private Handler mHandler;

        public LocationHandlerThread() {
            super("OSH_LocationHandlerThread");
            start();
            this.mHandler = new Handler(getLooper());
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "<set-?>");
            this.mHandler = handler;
        }
    }
}
