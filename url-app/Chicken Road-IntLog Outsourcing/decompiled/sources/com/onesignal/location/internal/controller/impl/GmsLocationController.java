package com.onesignal.location.internal.controller.impl;

import D4.AbstractC0024y;
import D4.E;
import K4.c;
import L4.d;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import e5.g;
import f4.v;
import java.io.Closeable;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import m1.i;
import m1.j;

/* loaded from: classes.dex */
public final class GmsLocationController implements ILocationController {
    private final IApplicationService _applicationService;
    private final IFusedLocationApiWrapper _fusedLocationApiWrapper;
    private final EventProducer<ILocationUpdatedHandler> event;
    private GoogleApiClientCompatProxy googleApiClient;
    private Location lastLocation;
    private final LocationHandlerThread locationHandlerThread;
    private LocationUpdateListener locationUpdateListener;
    private final L4.a startStopMutex;
    public static final Companion Companion = new Companion(null);
    private static final int API_FALLBACK_TIME = 30000;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return GmsLocationController.API_FALLBACK_TIME;
        }

        private Companion() {
        }
    }

    public static final class GoogleApiClientListener implements i, j {
        private final GmsLocationController _parent;

        public GoogleApiClientListener(GmsLocationController _parent) {
            kotlin.jvm.internal.i.e(_parent, "_parent");
            this._parent = _parent;
        }

        @Override // m1.i
        public void onConnected(Bundle bundle) {
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // m1.j
        public void onConnectionFailed(l1.b connectionResult) {
            kotlin.jvm.internal.i.e(connectionResult, "connectionResult");
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            ThreadUtilsKt.suspendifyOnIO(new GmsLocationController$GoogleApiClientListener$onConnectionFailed$1(this, null));
        }

        @Override // m1.i
        public void onConnectionSuspended(int i2) {
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i2, null, 2, null);
        }
    }

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
            kotlin.jvm.internal.i.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class LocationUpdateListener implements E1.b, IApplicationLifecycleHandler, Closeable {
        private final IApplicationService _applicationService;
        private final IFusedLocationApiWrapper _fusedLocationApiWrapper;
        private final GmsLocationController _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public LocationUpdateListener(IApplicationService _applicationService, GmsLocationController _parent, GoogleApiClient googleApiClient, IFusedLocationApiWrapper _fusedLocationApiWrapper) {
            kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
            kotlin.jvm.internal.i.e(_parent, "_parent");
            kotlin.jvm.internal.i.e(googleApiClient, "googleApiClient");
            kotlin.jvm.internal.i.e(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
            this._applicationService = _applicationService;
            this._parent = _parent;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
            if (!googleApiClient.f()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.f()) {
                Logging.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
            long j2 = this._applicationService.isInForeground() ? LocationConstants.FOREGROUND_UPDATE_TIME_MS : LocationConstants.BACKGROUND_UPDATE_TIME_MS;
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.f5309i = true;
            LocationRequest.b(j2);
            locationRequest.f5304d = true;
            locationRequest.f5303c = j2;
            LocationRequest.b(j2);
            locationRequest.f5302b = j2;
            if (!locationRequest.f5304d) {
                locationRequest.f5303c = (long) (j2 / 6.0d);
            }
            long j6 = (long) (j2 * 1.5d);
            LocationRequest.b(j6);
            locationRequest.f5308h = j6;
            locationRequest.a(102);
            Logging.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
            this._fusedLocationApiWrapper.requestLocationUpdates(this.googleApiClient, locationRequest, this);
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onFocus(boolean z) {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        @Override // E1.b
        public void onLocationChanged(Location location) {
            kotlin.jvm.internal.i.e(location, "location");
            Logging.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onUnfocused() {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public GmsLocationController(IApplicationService _applicationService, IFusedLocationApiWrapper _fusedLocationApiWrapper) {
        kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.i.e(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = _applicationService;
        this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
        this.locationHandlerThread = new LocationHandlerThread();
        this.startStopMutex = L4.e.a();
        this.event = new EventProducer<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        Logging.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new GmsLocationController$setLocationAndFire$1(location));
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(InterfaceC1218d interfaceC1218d) {
        GmsLocationController$start$1 gmsLocationController$start$1;
        int i2;
        q qVar;
        if (interfaceC1218d instanceof GmsLocationController$start$1) {
            gmsLocationController$start$1 = (GmsLocationController$start$1) interfaceC1218d;
            int i3 = gmsLocationController$start$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gmsLocationController$start$1.label = i3 - Integer.MIN_VALUE;
                Object obj = gmsLocationController$start$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = gmsLocationController$start$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    s sVar = new s();
                    sVar.f10741a = this;
                    q qVar2 = new q();
                    c cVar = E.f461c;
                    GmsLocationController$start$2 gmsLocationController$start$2 = new GmsLocationController$start$2(this, qVar2, sVar, null);
                    gmsLocationController$start$1.L$0 = qVar2;
                    gmsLocationController$start$1.label = 1;
                    if (AbstractC0024y.w(cVar, gmsLocationController$start$2, gmsLocationController$start$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar = qVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) gmsLocationController$start$1.L$0;
                    g.y(obj);
                }
                return Boolean.valueOf(qVar.f10739a);
            }
        }
        gmsLocationController$start$1 = new GmsLocationController$start$1(this, interfaceC1218d);
        Object obj2 = gmsLocationController$start$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = gmsLocationController$start$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(qVar.f10739a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(InterfaceC1218d interfaceC1218d) {
        GmsLocationController$stop$1 gmsLocationController$stop$1;
        int i2;
        GmsLocationController gmsLocationController;
        L4.a aVar;
        LocationUpdateListener locationUpdateListener;
        GoogleApiClientCompatProxy googleApiClientCompatProxy;
        try {
            if (interfaceC1218d instanceof GmsLocationController$stop$1) {
                gmsLocationController$stop$1 = (GmsLocationController$stop$1) interfaceC1218d;
                int i3 = gmsLocationController$stop$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gmsLocationController$stop$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = gmsLocationController$stop$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = gmsLocationController$stop$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        L4.a aVar2 = this.startStopMutex;
                        gmsLocationController$stop$1.L$0 = this;
                        gmsLocationController$stop$1.L$1 = aVar2;
                        gmsLocationController$stop$1.label = 1;
                        d dVar = (d) aVar2;
                        if (dVar.c(gmsLocationController$stop$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        gmsLocationController = this;
                        aVar = dVar;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (L4.a) gmsLocationController$stop$1.L$1;
                        gmsLocationController = (GmsLocationController) gmsLocationController$stop$1.L$0;
                        g.y(obj);
                    }
                    locationUpdateListener = gmsLocationController.locationUpdateListener;
                    if (locationUpdateListener != null) {
                        locationUpdateListener.close();
                        gmsLocationController.locationUpdateListener = null;
                    }
                    googleApiClientCompatProxy = gmsLocationController.googleApiClient;
                    if (googleApiClientCompatProxy != null) {
                        googleApiClientCompatProxy.disconnect();
                        gmsLocationController.googleApiClient = null;
                    }
                    gmsLocationController.lastLocation = null;
                    ((d) aVar).e(null);
                    return v.f5689a;
                }
            }
            locationUpdateListener = gmsLocationController.locationUpdateListener;
            if (locationUpdateListener != null) {
            }
            googleApiClientCompatProxy = gmsLocationController.googleApiClient;
            if (googleApiClientCompatProxy != null) {
            }
            gmsLocationController.lastLocation = null;
            ((d) aVar).e(null);
            return v.f5689a;
        } catch (Throwable th) {
            ((d) aVar).e(null);
            throw th;
        }
        gmsLocationController$stop$1 = new GmsLocationController$stop$1(this, interfaceC1218d);
        Object obj2 = gmsLocationController$stop$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = gmsLocationController$stop$1.label;
        if (i2 != 0) {
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationUpdatedHandler handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationUpdatedHandler handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
