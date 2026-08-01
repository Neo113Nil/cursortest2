package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import ge.a0;
import ge.k0;
import ge.x;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nd.i;
import wd.b0;
import wd.p;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements nb.a {
    private final ea.f _applicationService;
    private final com.onesignal.common.events.b event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final a locationHandlerThread;
    private b locationUpdateListener;
    private final oe.a startStopMutex;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends HandlerThread {
        private Handler mHandler;

        public a() {
            super("OSH_LocationHandlerThread");
            start();
            this.mHandler = new Handler(getLooper());
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(Handler handler) {
            handler.getClass();
            this.mHandler = handler;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends LocationCallback implements ea.e, Closeable {
        private final ea.f _applicationService;
        private final d _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(d dVar, ea.f fVar, FusedLocationProviderClient fusedLocationProviderClient) {
            dVar.getClass();
            fVar.getClass();
            fusedLocationProviderClient.getClass();
            this._parent = dVar;
            this._applicationService = fVar;
            this.huaweiFusedLocationProviderClient = fusedLocationProviderClient;
            fVar.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController Huawei LocationServices requestLocationUpdates!", null, 2, null);
            this.huaweiFusedLocationProviderClient.requestLocationUpdates(priority, this, this._parent.locationHandlerThread.getLooper());
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
        }

        @Override // ea.e
        public void onFocus(boolean z10) {
            com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            locationResult.getClass();
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // ea.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends i implements Function1 {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ b0 $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, b0 b0Var, ld.a aVar) {
            super(1, aVar);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = b0Var;
        }

        private static final void invokeSuspend$lambda$0(b0 b0Var, b0 b0Var2, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.c) b0Var.f10141d).wake();
            } else {
                b0Var2.f10141d = location;
                ((com.onesignal.common.threading.c) b0Var.f10141d).wake();
            }
        }

        private static final void invokeSuspend$lambda$1(b0 b0Var, Exception exc) {
            com.onesignal.debug.internal.logging.b.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.c) b0Var.f10141d).wake();
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new c(this.$locationClient, this.$retVal, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((c) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                b0 b0Var = new b0();
                b0Var.f10141d = new com.onesignal.common.threading.c();
                this.$locationClient.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                com.onesignal.common.threading.c cVar = (com.onesignal.common.threading.c) b0Var.f10141d;
                this.label = 1;
                if (cVar.waitForWake(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.location.internal.controller.impl.d$d, reason: collision with other inner class name */
    public static final class C0043d extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0043d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.start(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.stop(this);
        }
    }

    public d(ea.f fVar) {
        fVar.getClass();
        this._applicationService = fVar;
        this.locationHandlerThread = new a();
        this.startStopMutex = new oe.c();
        this.event = new com.onesignal.common.events.b();
    }

    @Override // nb.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // nb.a
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        b0 b0Var = new b0();
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new c(fusedLocationProviderClient, b0Var, null), 1, null);
        return (Location) b0Var.f10141d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // nb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(ld.a aVar) {
        C0043d c0043d;
        int i3;
        z zVar;
        if (aVar instanceof C0043d) {
            c0043d = (C0043d) aVar;
            int i10 = c0043d.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0043d.label = i10 - Integer.MIN_VALUE;
                Object obj = c0043d.result;
                md.a aVar2 = md.a.f6622d;
                i3 = c0043d.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    b0 b0Var = new b0();
                    b0Var.f10141d = this;
                    z zVar2 = new z();
                    ne.e eVar = k0.f4372a;
                    ne.d dVar = ne.d.f7275i;
                    e eVar2 = new e(zVar2, b0Var, null);
                    c0043d.L$0 = zVar2;
                    c0043d.label = 1;
                    if (a0.B(dVar, eVar2, c0043d) == aVar2) {
                        return aVar2;
                    }
                    zVar = zVar2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zVar = (z) c0043d.L$0;
                    cf.c.M(obj);
                }
                return Boolean.valueOf(zVar.f10164d);
            }
        }
        c0043d = new C0043d(aVar);
        Object obj2 = c0043d.result;
        md.a aVar22 = md.a.f6622d;
        i3 = c0043d.label;
        if (i3 != 0) {
        }
        return Boolean.valueOf(zVar.f10164d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:12:0x004b, B:14:0x004f, B:15:0x0057, B:17:0x005b, B:18:0x005d), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:12:0x004b, B:14:0x004f, B:15:0x0057, B:17:0x005b, B:18:0x005d), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // nb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(ld.a aVar) {
        f fVar;
        int i3;
        d dVar;
        oe.a aVar2;
        b bVar;
        try {
            if (aVar instanceof f) {
                fVar = (f) aVar;
                int i10 = fVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i10 - Integer.MIN_VALUE;
                    Object obj = fVar.result;
                    md.a aVar3 = md.a.f6622d;
                    i3 = fVar.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        oe.a aVar4 = this.startStopMutex;
                        fVar.L$0 = this;
                        fVar.L$1 = aVar4;
                        fVar.label = 1;
                        if (aVar4.a(fVar) == aVar3) {
                            return aVar3;
                        }
                        dVar = this;
                        aVar2 = aVar4;
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar2 = (oe.a) fVar.L$1;
                        dVar = (d) fVar.L$0;
                        cf.c.M(obj);
                    }
                    bVar = dVar.locationUpdateListener;
                    if (bVar != null) {
                        bVar.close();
                        dVar.locationUpdateListener = null;
                    }
                    if (dVar.hmsFusedLocationClient != null) {
                        dVar.hmsFusedLocationClient = null;
                    }
                    dVar.lastLocation = null;
                    aVar2.d(null);
                    return Unit.f5554a;
                }
            }
            bVar = dVar.locationUpdateListener;
            if (bVar != null) {
            }
            if (dVar.hmsFusedLocationClient != null) {
            }
            dVar.lastLocation = null;
            aVar2.d(null);
            return Unit.f5554a;
        } catch (Throwable th) {
            aVar2.d(null);
            throw th;
        }
        fVar = new f(aVar);
        Object obj2 = fVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = fVar.label;
        if (i3 != 0) {
        }
    }

    @Override // nb.a, com.onesignal.common.events.d
    public void subscribe(nb.b bVar) {
        bVar.getClass();
        this.event.subscribe(bVar);
    }

    @Override // nb.a, com.onesignal.common.events.d
    public void unsubscribe(nb.b bVar) {
        bVar.getClass();
        this.event.unsubscribe(bVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends i implements Function2 {
        final /* synthetic */ b0 $self;
        final /* synthetic */ z $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z zVar, b0 b0Var, ld.a aVar) {
            super(2, aVar);
            this.$wasSuccessful = zVar;
            this.$self = b0Var;
        }

        private static final void invokeSuspend$lambda$2$lambda$0(b0 b0Var, d dVar, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.d) b0Var.f10141d).wake(Boolean.FALSE);
            } else {
                dVar.lastLocation = location;
                ((com.onesignal.common.threading.d) b0Var.f10141d).wake(Boolean.TRUE);
            }
        }

        private static final void invokeSuspend$lambda$2$lambda$1(b0 b0Var, Exception exc) {
            com.onesignal.debug.internal.logging.b.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.d) b0Var.f10141d).wake(Boolean.FALSE);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return d.this.new e(this.$wasSuccessful, this.$self, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0100 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:7:0x0023, B:8:0x00f4, B:10:0x0100), top: B:6:0x0023 }] */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oe.a aVar;
            z zVar;
            d dVar;
            b0 b0Var;
            oe.a aVar2;
            Throwable th;
            b0 b0Var2;
            z zVar2;
            z zVar3;
            d dVar2;
            md.a aVar3 = md.a.f6622d;
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    cf.c.M(obj);
                    aVar = d.this.startStopMutex;
                    d dVar3 = d.this;
                    z zVar4 = this.$wasSuccessful;
                    b0 b0Var3 = this.$self;
                    this.L$0 = aVar;
                    this.L$1 = dVar3;
                    this.L$2 = zVar4;
                    this.L$3 = b0Var3;
                    this.label = 1;
                    if (aVar.a(this) != aVar3) {
                        zVar = zVar4;
                        dVar = dVar3;
                        b0Var = b0Var3;
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zVar2 = (z) this.L$4;
                    b0Var2 = (b0) this.L$3;
                    zVar3 = (z) this.L$2;
                    dVar2 = (d) this.L$1;
                    aVar2 = (oe.a) this.L$0;
                    try {
                        cf.c.M(obj);
                        zVar2.f10164d = ((Boolean) obj).booleanValue();
                        if (zVar3.f10164d) {
                            dVar2.event.fire(new b(dVar2));
                            d dVar4 = (d) b0Var2.f10141d;
                            ea.f fVar = dVar2._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = dVar2.hmsFusedLocationClient;
                            fusedLocationProviderClient.getClass();
                            dVar2.locationUpdateListener = new b(dVar4, fVar, fusedLocationProviderClient);
                        }
                        aVar = aVar2;
                        aVar.d(null);
                        return Unit.f5554a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.d(null);
                        throw th;
                    }
                }
                b0Var = (b0) this.L$3;
                zVar = (z) this.L$2;
                dVar = (d) this.L$1;
                oe.a aVar4 = (oe.a) this.L$0;
                cf.c.M(obj);
                aVar = aVar4;
                if (dVar.hmsFusedLocationClient == null) {
                    try {
                        dVar.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(dVar._applicationService.getAppContext());
                    } catch (Exception e2) {
                        com.onesignal.debug.internal.logging.b.error$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e2, null, 2, null);
                        zVar.f10164d = false;
                    }
                }
                if (dVar.lastLocation != null) {
                    dVar.event.fire(new a(dVar));
                    aVar.d(null);
                    return Unit.f5554a;
                }
                b0 b0Var4 = new b0();
                b0Var4.f10141d = new com.onesignal.common.threading.d();
                FusedLocationProviderClient fusedLocationProviderClient2 = dVar.hmsFusedLocationClient;
                fusedLocationProviderClient2.getClass();
                fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                com.onesignal.common.threading.d dVar5 = (com.onesignal.common.threading.d) b0Var4.f10141d;
                this.L$0 = aVar;
                this.L$1 = dVar;
                this.L$2 = zVar;
                this.L$3 = b0Var;
                this.L$4 = zVar;
                this.label = 2;
                Object waitForWake = dVar5.waitForWake(this);
                if (waitForWake != aVar3) {
                    aVar2 = aVar;
                    obj = waitForWake;
                    b0Var2 = b0Var;
                    zVar2 = zVar;
                    zVar3 = zVar2;
                    dVar2 = dVar;
                    zVar2.f10164d = ((Boolean) obj).booleanValue();
                    if (zVar3.f10164d) {
                    }
                    aVar = aVar2;
                    aVar.d(null);
                    return Unit.f5554a;
                }
                return aVar3;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                aVar2.d(null);
                throw th;
            }
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends p implements Function1 {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            public final void invoke(nb.b bVar) {
                bVar.getClass();
                Location location = this.this$0.lastLocation;
                location.getClass();
                bVar.onLocationChanged(location);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((nb.b) obj);
                return Unit.f5554a;
            }
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class b extends p implements Function1 {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            public final void invoke(nb.b bVar) {
                bVar.getClass();
                Location location = this.this$0.lastLocation;
                location.getClass();
                bVar.onLocationChanged(location);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((nb.b) obj);
                return Unit.f5554a;
            }
        }
    }
}
