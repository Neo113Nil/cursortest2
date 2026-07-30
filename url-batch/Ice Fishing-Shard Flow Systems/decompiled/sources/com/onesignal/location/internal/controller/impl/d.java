package com.onesignal.location.internal.controller.impl;

import X5.j;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import e3.InterfaceC0373a;
import e3.InterfaceC0374b;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import u6.C0953e;
import u6.ExecutorC0952d;
import v6.InterfaceC0979a;

/* loaded from: classes.dex */
public final class d implements InterfaceC0373a {
    private final v2.f _applicationService;
    private final com.onesignal.common.events.b event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final a locationHandlerThread;
    private b locationUpdateListener;
    private final InterfaceC0979a startStopMutex;

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
            Intrinsics.checkNotNullParameter(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class b extends LocationCallback implements v2.e, Closeable {
        private final v2.f _applicationService;
        private final d _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(d _parent, v2.f _applicationService, FusedLocationProviderClient huaweiFusedLocationProviderClient) {
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
            Intrinsics.checkNotNullParameter(huaweiFusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = _parent;
            this._applicationService = _applicationService;
            this.huaweiFusedLocationProviderClient = huaweiFusedLocationProviderClient;
            _applicationService.addApplicationLifecycleHandler(this);
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

        @Override // v2.e
        public void onFocus(boolean z7) {
            com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // v2.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public static final class c extends j implements Function1 {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ D $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, D d7, V5.b bVar) {
            super(1, bVar);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = d7;
        }

        private static final void invokeSuspend$lambda$0(D d7, D d8, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.d) d7.f6152d).wake();
            } else {
                d8.f6152d = location;
                ((com.onesignal.common.threading.d) d7.f6152d).wake();
            }
        }

        private static final void invokeSuspend$lambda$1(D d7, Exception exc) {
            com.onesignal.debug.internal.logging.b.warn("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.d) d7.f6152d).wake();
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new c(this.$locationClient, this.$retVal, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                D d7 = new D();
                d7.f6152d = new com.onesignal.common.threading.d();
                this.$locationClient.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                com.onesignal.common.threading.d dVar = (com.onesignal.common.threading.d) d7.f6152d;
                this.label = 1;
                if (dVar.waitForWake(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.d$d, reason: collision with other inner class name */
    public static final class C0051d extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0051d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.start(this);
        }
    }

    public static final class e extends j implements Function2 {
        final /* synthetic */ D $self;
        final /* synthetic */ B $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        public static final class a extends p implements Function1 {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC0374b) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC0374b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Location location = this.this$0.lastLocation;
                Intrinsics.b(location);
                it.onLocationChanged(location);
            }
        }

        public static final class b extends p implements Function1 {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC0374b) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC0374b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Location location = this.this$0.lastLocation;
                Intrinsics.b(location);
                it.onLocationChanged(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(B b7, D d7, V5.b bVar) {
            super(2, bVar);
            this.$wasSuccessful = b7;
            this.$self = d7;
        }

        private static final void invokeSuspend$lambda$2$lambda$0(D d7, d dVar, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.e) d7.f6152d).wake(Boolean.FALSE);
            } else {
                dVar.lastLocation = location;
                ((com.onesignal.common.threading.e) d7.f6152d).wake(Boolean.TRUE);
            }
        }

        private static final void invokeSuspend$lambda$2$lambda$1(D d7, Exception exc) {
            com.onesignal.debug.internal.logging.b.warn("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.e) d7.f6152d).wake(Boolean.FALSE);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return d.this.new e(this.$wasSuccessful, this.$self, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0103 A[Catch: all -> 0x0028, TryCatch #2 {all -> 0x0028, blocks: (B:7:0x0023, B:8:0x00f7, B:10:0x0103, B:13:0x0129), top: B:6:0x0023 }] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10, types: [v6.a] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r7v10, types: [v6.a] */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v6.c cVar;
            B b7;
            d dVar;
            D d7;
            ?? r42;
            Throwable th;
            v6.c cVar2;
            D d8;
            B b8;
            B b9;
            d dVar2;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    InterfaceC0979a interfaceC0979a = d.this.startStopMutex;
                    d dVar3 = d.this;
                    B b10 = this.$wasSuccessful;
                    D d9 = this.$self;
                    this.L$0 = interfaceC0979a;
                    this.L$1 = dVar3;
                    this.L$2 = b10;
                    this.L$3 = d9;
                    this.label = 1;
                    cVar = (v6.c) interfaceC0979a;
                    if (cVar.c(this) != aVar) {
                        b7 = b10;
                        dVar = dVar3;
                        d7 = d9;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b8 = (B) this.L$4;
                    d8 = (D) this.L$3;
                    b9 = (B) this.L$2;
                    dVar2 = (d) this.L$1;
                    r42 = (InterfaceC0979a) this.L$0;
                    try {
                        V6.b.P(obj);
                        cVar2 = r42;
                        b8.f6150d = ((Boolean) obj).booleanValue();
                        if (b9.f6150d) {
                            dVar2.event.fire(new b(dVar2));
                            d dVar4 = (d) d8.f6152d;
                            v2.f fVar = dVar2._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = dVar2.hmsFusedLocationClient;
                            Intrinsics.b(fusedLocationProviderClient);
                            dVar2.locationUpdateListener = new b(dVar4, fVar, fusedLocationProviderClient);
                        }
                        cVar = cVar2;
                        r42 = cVar;
                        Unit unit = Unit.f6114a;
                        ((v6.c) r42).e(null);
                        return Unit.f6114a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((v6.c) r42).e(null);
                        throw th;
                    }
                }
                d7 = (D) this.L$3;
                b7 = (B) this.L$2;
                dVar = (d) this.L$1;
                ?? r7 = (InterfaceC0979a) this.L$0;
                V6.b.P(obj);
                cVar = r7;
                if (dVar.hmsFusedLocationClient == null) {
                    try {
                        dVar.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(dVar._applicationService.getAppContext());
                    } catch (Exception e7) {
                        com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e7, null, 2, null);
                        b7.f6150d = false;
                    }
                }
                if (dVar.lastLocation != null) {
                    dVar.event.fire(new a(dVar));
                    r42 = cVar;
                    Unit unit2 = Unit.f6114a;
                    ((v6.c) r42).e(null);
                    return Unit.f6114a;
                }
                D d10 = new D();
                d10.f6152d = new com.onesignal.common.threading.e();
                FusedLocationProviderClient fusedLocationProviderClient2 = dVar.hmsFusedLocationClient;
                Intrinsics.b(fusedLocationProviderClient2);
                fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                com.onesignal.common.threading.e eVar = (com.onesignal.common.threading.e) d10.f6152d;
                this.L$0 = cVar;
                this.L$1 = dVar;
                this.L$2 = b7;
                this.L$3 = d7;
                this.L$4 = b7;
                this.label = 2;
                Object waitForWake = eVar.waitForWake(this);
                if (waitForWake != aVar) {
                    cVar2 = cVar;
                    obj = waitForWake;
                    d8 = d7;
                    b8 = b7;
                    b9 = b8;
                    dVar2 = dVar;
                    b8.f6150d = ((Boolean) obj).booleanValue();
                    if (b9.f6150d) {
                    }
                    cVar = cVar2;
                    r42 = cVar;
                    Unit unit22 = Unit.f6114a;
                    ((v6.c) r42).e(null);
                    return Unit.f6114a;
                }
                return aVar;
            } catch (Throwable th3) {
                r42 = cVar;
                th = th3;
                ((v6.c) r42).e(null);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((e) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class f extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.stop(this);
        }
    }

    public d(v2.f _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
        this.locationHandlerThread = new a();
        this.startStopMutex = new v6.c();
        this.event = new com.onesignal.common.events.b();
    }

    @Override // e3.InterfaceC0373a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // e3.InterfaceC0373a
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        D d7 = new D();
        com.onesignal.common.threading.b.suspendifyOnIO(new c(fusedLocationProviderClient, d7, null));
        return (Location) d7.f6152d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // e3.InterfaceC0373a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(V5.b bVar) {
        C0051d c0051d;
        int i2;
        B b7;
        if (bVar instanceof C0051d) {
            c0051d = (C0051d) bVar;
            int i5 = c0051d.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0051d.label = i5 - Integer.MIN_VALUE;
                Object obj = c0051d.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0051d.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    D d7 = new D();
                    d7.f6152d = this;
                    B b8 = new B();
                    C0953e c0953e = F.f7011a;
                    ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                    e eVar = new e(b8, d7, null);
                    c0051d.L$0 = b8;
                    c0051d.label = 1;
                    if (AbstractC0792z.t(executorC0952d, eVar, c0051d) == aVar) {
                        return aVar;
                    }
                    b7 = b8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b7 = (B) c0051d.L$0;
                    V6.b.P(obj);
                }
                return Boolean.valueOf(b7.f6150d);
            }
        }
        c0051d = new C0051d(bVar);
        Object obj2 = c0051d.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0051d.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(b7.f6150d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // e3.InterfaceC0373a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(V5.b bVar) {
        f fVar;
        int i2;
        d dVar;
        InterfaceC0979a interfaceC0979a;
        b bVar2;
        try {
            if (bVar instanceof f) {
                fVar = (f) bVar;
                int i5 = fVar.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i5 - Integer.MIN_VALUE;
                    Object obj = fVar.result;
                    W5.a aVar = W5.a.f2787d;
                    i2 = fVar.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        InterfaceC0979a interfaceC0979a2 = this.startStopMutex;
                        fVar.L$0 = this;
                        fVar.L$1 = interfaceC0979a2;
                        fVar.label = 1;
                        v6.c cVar = (v6.c) interfaceC0979a2;
                        if (cVar.c(fVar) == aVar) {
                            return aVar;
                        }
                        dVar = this;
                        interfaceC0979a = cVar;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0979a = (InterfaceC0979a) fVar.L$1;
                        dVar = (d) fVar.L$0;
                        V6.b.P(obj);
                    }
                    bVar2 = dVar.locationUpdateListener;
                    if (bVar2 != null) {
                        bVar2.close();
                        dVar.locationUpdateListener = null;
                    }
                    if (dVar.hmsFusedLocationClient != null) {
                        dVar.hmsFusedLocationClient = null;
                    }
                    dVar.lastLocation = null;
                    Unit unit = Unit.f6114a;
                    ((v6.c) interfaceC0979a).e(null);
                    return Unit.f6114a;
                }
            }
            bVar2 = dVar.locationUpdateListener;
            if (bVar2 != null) {
            }
            if (dVar.hmsFusedLocationClient != null) {
            }
            dVar.lastLocation = null;
            Unit unit2 = Unit.f6114a;
            ((v6.c) interfaceC0979a).e(null);
            return Unit.f6114a;
        } catch (Throwable th) {
            ((v6.c) interfaceC0979a).e(null);
            throw th;
        }
        fVar = new f(bVar);
        Object obj2 = fVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = fVar.label;
        if (i2 != 0) {
        }
    }

    @Override // e3.InterfaceC0373a, com.onesignal.common.events.d
    public void subscribe(InterfaceC0374b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // e3.InterfaceC0373a, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC0374b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
