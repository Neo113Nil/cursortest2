package com.onesignal.location.internal.controller.impl;

import E7.l;
import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import b5.InterfaceC0528a;
import b5.InterfaceC0529b;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import java.io.Closeable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.r;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class d implements InterfaceC0528a {
    private final t4.f _applicationService;
    private final com.onesignal.common.events.b event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final a locationHandlerThread;
    private b locationUpdateListener;
    private final W7.a startStopMutex;

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
            kotlin.jvm.internal.h.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class b extends LocationCallback implements t4.e, Closeable {
        private final t4.f _applicationService;
        private final d _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(d _parent, t4.f _applicationService, FusedLocationProviderClient huaweiFusedLocationProviderClient) {
            kotlin.jvm.internal.h.e(_parent, "_parent");
            kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
            kotlin.jvm.internal.h.e(huaweiFusedLocationProviderClient, "huaweiFusedLocationProviderClient");
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
            long j9 = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j9).setInterval(j9).setMaxWaitTime((long) (j9 * 1.5d)).setPriority(102);
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

        @Override // t4.e
        public void onFocus(boolean z8) {
            com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            kotlin.jvm.internal.h.e(locationResult, "locationResult");
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // t4.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public static final class c extends x7.h implements l {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ r $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, r rVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = rVar;
        }

        private static final void invokeSuspend$lambda$0(r rVar, r rVar2, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.e) rVar.f38861n).wake();
            } else {
                rVar2.f38861n = location;
                ((com.onesignal.common.threading.e) rVar.f38861n).wake();
            }
        }

        private static final void invokeSuspend$lambda$1(r rVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.warn("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.e) rVar.f38861n).wake();
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new c(this.$locationClient, this.$retVal, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                com.onesignal.common.threading.e eVar = new com.onesignal.common.threading.e();
                this.$locationClient.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.label = 1;
                if (eVar.waitForWake(this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((c) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.d$d, reason: collision with other inner class name */
    public static final class C0220d extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0220d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.start(this);
        }
    }

    public static final class e extends x7.h implements p {
        final /* synthetic */ r $self;
        final /* synthetic */ kotlin.jvm.internal.p $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        public static final class a extends i implements l {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC0529b) obj);
                return v.f40183a;
            }

            public final void invoke(InterfaceC0529b it) {
                kotlin.jvm.internal.h.e(it, "it");
                Location location = this.this$0.lastLocation;
                kotlin.jvm.internal.h.b(location);
                it.onLocationChanged(location);
            }
        }

        public static final class b extends i implements l {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC0529b) obj);
                return v.f40183a;
            }

            public final void invoke(InterfaceC0529b it) {
                kotlin.jvm.internal.h.e(it, "it");
                Location location = this.this$0.lastLocation;
                kotlin.jvm.internal.h.b(location);
                it.onLocationChanged(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.jvm.internal.p pVar, r rVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$wasSuccessful = pVar;
            this.$self = rVar;
        }

        private static final void invokeSuspend$lambda$2$lambda$0(r rVar, d dVar, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.f) rVar.f38861n).wake(Boolean.FALSE);
            } else {
                dVar.lastLocation = location;
                ((com.onesignal.common.threading.f) rVar.f38861n).wake(Boolean.TRUE);
            }
        }

        private static final void invokeSuspend$lambda$2$lambda$1(r rVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.warn("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.f) rVar.f38861n).wake(Boolean.FALSE);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return d.this.new e(this.$wasSuccessful, this.$self, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((e) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00f7 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:7:0x0023, B:8:0x00eb, B:10:0x00f7), top: B:6:0x0023 }] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8, types: [W7.a] */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r7v9, types: [W7.a] */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W7.d dVar;
            kotlin.jvm.internal.p pVar;
            d dVar2;
            r rVar;
            ?? r42;
            Throwable th;
            r rVar2;
            kotlin.jvm.internal.p pVar2;
            kotlin.jvm.internal.p pVar3;
            d dVar3;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    W7.a aVar = d.this.startStopMutex;
                    d dVar4 = d.this;
                    kotlin.jvm.internal.p pVar4 = this.$wasSuccessful;
                    r rVar3 = this.$self;
                    this.L$0 = aVar;
                    this.L$1 = dVar4;
                    this.L$2 = pVar4;
                    this.L$3 = rVar3;
                    this.label = 1;
                    dVar = (W7.d) aVar;
                    if (dVar.c(this) != enumC5179a) {
                        pVar = pVar4;
                        dVar2 = dVar4;
                        rVar = rVar3;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar2 = (kotlin.jvm.internal.p) this.L$4;
                    rVar2 = (r) this.L$3;
                    pVar3 = (kotlin.jvm.internal.p) this.L$2;
                    dVar3 = (d) this.L$1;
                    r42 = (W7.a) this.L$0;
                    try {
                        com.bumptech.glide.f.r(obj);
                        r42 = r42;
                        pVar2.f38859n = ((Boolean) obj).booleanValue();
                        if (pVar3.f38859n) {
                            dVar3.event.fire(new b(dVar3));
                            d dVar5 = (d) rVar2.f38861n;
                            t4.f fVar = dVar3._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = dVar3.hmsFusedLocationClient;
                            kotlin.jvm.internal.h.b(fusedLocationProviderClient);
                            dVar3.locationUpdateListener = new b(dVar5, fVar, fusedLocationProviderClient);
                        }
                        dVar = r42;
                        dVar.d(null);
                        return v.f40183a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((W7.d) r42).d(null);
                        throw th;
                    }
                }
                rVar = (r) this.L$3;
                pVar = (kotlin.jvm.internal.p) this.L$2;
                dVar2 = (d) this.L$1;
                ?? r72 = (W7.a) this.L$0;
                com.bumptech.glide.f.r(obj);
                dVar = r72;
                if (dVar2.hmsFusedLocationClient == null) {
                    try {
                        dVar2.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(dVar2._applicationService.getAppContext());
                    } catch (Exception e6) {
                        com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e6, null, 2, null);
                        pVar.f38859n = false;
                    }
                }
                if (dVar2.lastLocation != null) {
                    dVar2.event.fire(new a(dVar2));
                    dVar.d(null);
                    return v.f40183a;
                }
                com.onesignal.common.threading.f fVar2 = new com.onesignal.common.threading.f();
                FusedLocationProviderClient fusedLocationProviderClient2 = dVar2.hmsFusedLocationClient;
                kotlin.jvm.internal.h.b(fusedLocationProviderClient2);
                fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.L$0 = dVar;
                this.L$1 = dVar2;
                this.L$2 = pVar;
                this.L$3 = rVar;
                this.L$4 = pVar;
                this.label = 2;
                Object waitForWake = fVar2.waitForWake(this);
                if (waitForWake != enumC5179a) {
                    r42 = dVar;
                    obj = waitForWake;
                    rVar2 = rVar;
                    pVar2 = pVar;
                    pVar3 = pVar2;
                    dVar3 = dVar2;
                    pVar2.f38859n = ((Boolean) obj).booleanValue();
                    if (pVar3.f38859n) {
                    }
                    dVar = r42;
                    dVar.d(null);
                    return v.f40183a;
                }
                return enumC5179a;
            } catch (Throwable th3) {
                r42 = dVar;
                th = th3;
                ((W7.d) r42).d(null);
                throw th;
            }
        }
    }

    public static final class f extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.stop(this);
        }
    }

    public d(t4.f _applicationService) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
        this.locationHandlerThread = new a();
        this.startStopMutex = new W7.d();
        this.event = new com.onesignal.common.events.b();
    }

    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // b5.InterfaceC0528a
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        r rVar = new r();
        com.onesignal.common.threading.c.suspendifyOnIO(new c(fusedLocationProviderClient, rVar, null));
        return (Location) rVar.f38861n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // b5.InterfaceC0528a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(InterfaceC5133d interfaceC5133d) {
        C0220d c0220d;
        int i;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5133d instanceof C0220d) {
            c0220d = (C0220d) interfaceC5133d;
            int i4 = c0220d.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0220d.label = i4 - Integer.MIN_VALUE;
                Object obj = c0220d.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0220d.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    r rVar = new r();
                    rVar.f38861n = this;
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    V7.d dVar = F.f2553c;
                    e eVar = new e(pVar2, rVar, null);
                    c0220d.L$0 = pVar2;
                    c0220d.label = 1;
                    if (AbstractC0399y.y(dVar, eVar, c0220d) == enumC5179a) {
                        return enumC5179a;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) c0220d.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return Boolean.valueOf(pVar.f38859n);
            }
        }
        c0220d = new C0220d(interfaceC5133d);
        Object obj2 = c0220d.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0220d.label;
        if (i != 0) {
        }
        return Boolean.valueOf(pVar.f38859n);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // b5.InterfaceC0528a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(InterfaceC5133d interfaceC5133d) {
        f fVar;
        int i;
        d dVar;
        W7.a aVar;
        b bVar;
        try {
            if (interfaceC5133d instanceof f) {
                fVar = (f) interfaceC5133d;
                int i4 = fVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i4 - Integer.MIN_VALUE;
                    Object obj = fVar.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = fVar.label;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        W7.a aVar2 = this.startStopMutex;
                        fVar.L$0 = this;
                        fVar.L$1 = aVar2;
                        fVar.label = 1;
                        W7.d dVar2 = (W7.d) aVar2;
                        if (dVar2.c(fVar) == enumC5179a) {
                            return enumC5179a;
                        }
                        dVar = this;
                        aVar = dVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (W7.a) fVar.L$1;
                        dVar = (d) fVar.L$0;
                        com.bumptech.glide.f.r(obj);
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
                    ((W7.d) aVar).d(null);
                    return v.f40183a;
                }
            }
            bVar = dVar.locationUpdateListener;
            if (bVar != null) {
            }
            if (dVar.hmsFusedLocationClient != null) {
            }
            dVar.lastLocation = null;
            ((W7.d) aVar).d(null);
            return v.f40183a;
        } catch (Throwable th) {
            ((W7.d) aVar).d(null);
            throw th;
        }
        fVar = new f(interfaceC5133d);
        Object obj2 = fVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = fVar.label;
        if (i != 0) {
        }
    }

    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public void subscribe(InterfaceC0529b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC0529b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
