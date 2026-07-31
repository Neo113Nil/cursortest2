package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.app.NotificationCompat;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: GmsLocationController.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0004\"#$%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u000e\u0010\u001c\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/onesignal/location/internal/controller/impl/GmsLocationController;", "Lcom/onesignal/location/internal/controller/ILocationController;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_fusedLocationApiWrapper", "Lcom/onesignal/location/internal/controller/impl/IFusedLocationApiWrapper;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/location/internal/controller/impl/IFusedLocationApiWrapper;)V", NotificationCompat.CATEGORY_EVENT, "Lcom/onesignal/common/events/EventProducer;", "Lcom/onesignal/location/internal/controller/ILocationUpdatedHandler;", "googleApiClient", "Lcom/onesignal/location/internal/controller/impl/GoogleApiClientCompatProxy;", "hasSubscribers", "", "getHasSubscribers", "()Z", "lastLocation", "Landroid/location/Location;", "locationHandlerThread", "Lcom/onesignal/location/internal/controller/impl/GmsLocationController$LocationHandlerThread;", "locationUpdateListener", "Lcom/onesignal/location/internal/controller/impl/GmsLocationController$LocationUpdateListener;", "startStopMutex", "Lkotlinx/coroutines/sync/Mutex;", "getLastLocation", "setLocationAndFire", "", InAppMessagePromptTypes.LOCATION_PROMPT_KEY, ViewProps.START, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "subscribe", "handler", "unsubscribe", "Companion", "GoogleApiClientListener", "LocationHandlerThread", "LocationUpdateListener", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GmsLocationController implements ILocationController {
    private final IApplicationService _applicationService;
    private final IFusedLocationApiWrapper _fusedLocationApiWrapper;
    private final EventProducer<ILocationUpdatedHandler> event;
    private GoogleApiClientCompatProxy googleApiClient;
    private Location lastLocation;
    private final LocationHandlerThread locationHandlerThread;
    private LocationUpdateListener locationUpdateListener;
    private final Mutex startStopMutex;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int API_FALLBACK_TIME = HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT;

    public GmsLocationController(IApplicationService _applicationService, IFusedLocationApiWrapper _fusedLocationApiWrapper) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = _applicationService;
        this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
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
        GmsLocationController$start$1 gmsLocationController$start$1;
        int i;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof GmsLocationController$start$1) {
            gmsLocationController$start$1 = (GmsLocationController$start$1) continuation;
            if ((gmsLocationController$start$1.label & Integer.MIN_VALUE) != 0) {
                gmsLocationController$start$1.label -= Integer.MIN_VALUE;
                Object obj = gmsLocationController$start$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gmsLocationController$start$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = this;
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    GmsLocationController$start$2 gmsLocationController$start$2 = new GmsLocationController$start$2(this, booleanRef2, objectRef, null);
                    gmsLocationController$start$1.L$0 = booleanRef2;
                    gmsLocationController$start$1.label = 1;
                    if (BuildersKt.withContext(io2, gmsLocationController$start$2, gmsLocationController$start$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) gmsLocationController$start$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        gmsLocationController$start$1 = new GmsLocationController$start$1(this, continuation);
        Object obj2 = gmsLocationController$start$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gmsLocationController$start$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x005b, B:16:0x005f, B:17:0x0067), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x005b, B:16:0x005f, B:17:0x0067), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(Continuation<? super Unit> continuation) {
        GmsLocationController$stop$1 gmsLocationController$stop$1;
        int i;
        GmsLocationController gmsLocationController;
        Mutex mutex;
        LocationUpdateListener locationUpdateListener;
        GoogleApiClientCompatProxy googleApiClientCompatProxy;
        try {
            if (continuation instanceof GmsLocationController$stop$1) {
                gmsLocationController$stop$1 = (GmsLocationController$stop$1) continuation;
                if ((gmsLocationController$stop$1.label & Integer.MIN_VALUE) != 0) {
                    gmsLocationController$stop$1.label -= Integer.MIN_VALUE;
                    Object obj = gmsLocationController$stop$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gmsLocationController$stop$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.startStopMutex;
                        gmsLocationController$stop$1.L$0 = this;
                        gmsLocationController$stop$1.L$1 = mutex2;
                        gmsLocationController$stop$1.label = 1;
                        if (mutex2.lock(null, gmsLocationController$stop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        gmsLocationController = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) gmsLocationController$stop$1.L$1;
                        gmsLocationController = (GmsLocationController) gmsLocationController$stop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    locationUpdateListener = gmsLocationController.locationUpdateListener;
                    if (locationUpdateListener != null) {
                        Intrinsics.checkNotNull(locationUpdateListener);
                        locationUpdateListener.close();
                        gmsLocationController.locationUpdateListener = null;
                    }
                    googleApiClientCompatProxy = gmsLocationController.googleApiClient;
                    if (googleApiClientCompatProxy != null) {
                        Intrinsics.checkNotNull(googleApiClientCompatProxy);
                        googleApiClientCompatProxy.disconnect();
                        gmsLocationController.googleApiClient = null;
                    }
                    gmsLocationController.lastLocation = null;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            locationUpdateListener = gmsLocationController.locationUpdateListener;
            if (locationUpdateListener != null) {
            }
            googleApiClientCompatProxy = gmsLocationController.googleApiClient;
            if (googleApiClientCompatProxy != null) {
            }
            gmsLocationController.lastLocation = null;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        gmsLocationController$stop$1 = new GmsLocationController$stop$1(this, continuation);
        Object obj2 = gmsLocationController$stop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gmsLocationController$stop$1.label;
        if (i != 0) {
        }
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        GoogleApiClientCompatProxy googleApiClientCompatProxy = this.googleApiClient;
        if (googleApiClientCompatProxy == null || (realInstance = googleApiClientCompatProxy.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(final Location location) {
        Logging.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new Function1<ILocationUpdatedHandler, Unit>() { // from class: com.onesignal.location.internal.controller.impl.GmsLocationController$setLocationAndFire$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ILocationUpdatedHandler iLocationUpdatedHandler) {
                invoke2(iLocationUpdatedHandler);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ILocationUpdatedHandler it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onLocationChanged(location);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GmsLocationController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/onesignal/location/internal/controller/impl/GmsLocationController$GoogleApiClientListener;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "_parent", "Lcom/onesignal/location/internal/controller/impl/GmsLocationController;", "(Lcom/onesignal/location/internal/controller/impl/GmsLocationController;)V", "onConnected", "", "bundle", "Landroid/os/Bundle;", "onConnectionFailed", "connectionResult", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "i", "", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class GoogleApiClientListener implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        private final GmsLocationController _parent;

        public GoogleApiClientListener(GmsLocationController _parent) {
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            this._parent = _parent;
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(Bundle bundle) {
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i, null, 2, null);
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            ThreadUtilsKt.suspendifyOnIO(new GmsLocationController$GoogleApiClientListener$onConnectionFailed$1(this, null));
        }
    }

    /* compiled from: GmsLocationController.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0017\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/onesignal/location/internal/controller/impl/GmsLocationController$LocationUpdateListener;", "Lcom/google/android/gms/location/LocationListener;", "Lcom/onesignal/core/internal/application/IApplicationLifecycleHandler;", "Ljava/io/Closeable;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_parent", "Lcom/onesignal/location/internal/controller/impl/GmsLocationController;", "googleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "_fusedLocationApiWrapper", "Lcom/onesignal/location/internal/controller/impl/IFusedLocationApiWrapper;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/location/internal/controller/impl/GmsLocationController;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/onesignal/location/internal/controller/impl/IFusedLocationApiWrapper;)V", "hasExistingRequest", "", "requestLock", "", "close", "", "onFocus", "firedOnSubscribe", "onLocationChanged", InAppMessagePromptTypes.LOCATION_PROMPT_KEY, "Landroid/location/Location;", "onUnfocused", "refreshRequest", "onlyIfInactive", "refreshRequest$com_onesignal_location", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LocationUpdateListener implements LocationListener, IApplicationLifecycleHandler, Closeable {
        private final IApplicationService _applicationService;
        private final IFusedLocationApiWrapper _fusedLocationApiWrapper;
        private final GmsLocationController _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;
        private final Object requestLock;

        public LocationUpdateListener(IApplicationService _applicationService, GmsLocationController _parent, GoogleApiClient googleApiClient, IFusedLocationApiWrapper _fusedLocationApiWrapper) {
            Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
            Intrinsics.checkNotNullParameter(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
            this._applicationService = _applicationService;
            this._parent = _parent;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
            this.requestLock = new Object();
            if (!googleApiClient.isConnected()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onFocus(boolean firedOnSubscribe) {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onUnfocused() {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            synchronized (this.requestLock) {
                if (this.hasExistingRequest) {
                    this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
                    this.hasExistingRequest = false;
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        public static /* synthetic */ void refreshRequest$com_onesignal_location$default(LocationUpdateListener locationUpdateListener, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            locationUpdateListener.refreshRequest$com_onesignal_location(z);
        }

        public final void refreshRequest$com_onesignal_location(boolean onlyIfInactive) {
            if (!this.googleApiClient.isConnected()) {
                Logging.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            long j = this._applicationService.isInForeground() ? LocationConstants.FOREGROUND_UPDATE_TIME_MS : LocationConstants.BACKGROUND_UPDATE_TIME_MS;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            synchronized (this.requestLock) {
                if (this.hasExistingRequest) {
                    if (!onlyIfInactive) {
                        this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
                    }
                    Unit unit = Unit.INSTANCE;
                }
                Logging.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
                IFusedLocationApiWrapper iFusedLocationApiWrapper = this._fusedLocationApiWrapper;
                GoogleApiClient googleApiClient = this.googleApiClient;
                Intrinsics.checkNotNull(priority);
                this.hasExistingRequest = iFusedLocationApiWrapper.requestLocationUpdates(googleApiClient, priority, this);
                Unit unit2 = Unit.INSTANCE;
            }
        }

        @Override // com.google.android.gms.location.LocationListener
        public void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            Logging.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }
    }

    /* compiled from: GmsLocationController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/location/internal/controller/impl/GmsLocationController$LocationHandlerThread;", "Landroid/os/HandlerThread;", "()V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
    protected static final class LocationHandlerThread extends HandlerThread {
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

    /* compiled from: GmsLocationController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/location/internal/controller/impl/GmsLocationController$Companion;", "", "()V", "API_FALLBACK_TIME", "", "getAPI_FALLBACK_TIME", "()I", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getAPI_FALLBACK_TIME() {
            return GmsLocationController.API_FALLBACK_TIME;
        }
    }
}
