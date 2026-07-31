package com.onesignal.location.internal.controller.impl;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import java.io.Closeable;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class d implements C2.a {
    private final T1.f _applicationService;
    private final com.onesignal.common.events.b event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final a locationHandlerThread;
    private b locationUpdateListener;
    private final P5.a startStopMutex;

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
            i.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class b extends LocationCallback implements T1.e, Closeable {
        private final T1.f _applicationService;
        private final d _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(d _parent, T1.f _applicationService, FusedLocationProviderClient huaweiFusedLocationProviderClient) {
            i.e(_parent, "_parent");
            i.e(_applicationService, "_applicationService");
            i.e(huaweiFusedLocationProviderClient, "huaweiFusedLocationProviderClient");
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
            long j4 = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j4).setInterval(j4).setMaxWaitTime((long) (j4 * 1.5d)).setPriority(102);
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

        @Override // T1.e
        public void onFocus(boolean z5) {
            com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            i.e(locationResult, "locationResult");
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // T1.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public static final class c extends q5.g implements InterfaceC0743l {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ s $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, s sVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = sVar;
        }

        private static final void invokeSuspend$lambda$0(s sVar, s sVar2, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.c) sVar.f5233f).wake();
            } else {
                sVar2.f5233f = location;
                ((com.onesignal.common.threading.c) sVar.f5233f).wake();
            }
        }

        private static final void invokeSuspend$lambda$1(s sVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.warn("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.c) sVar.f5233f).wake();
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new c(this.$locationClient, this.$retVal, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                this.$locationClient.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.label = 1;
                if (cVar.waitForWake(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.d$d, reason: collision with other inner class name */
    public static final class C0051d extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0051d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.start(this);
        }
    }

    public static final class e extends q5.g implements InterfaceC0747p {
        final /* synthetic */ s $self;
        final /* synthetic */ q $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        public static final class a extends j implements InterfaceC0743l {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C2.b) obj);
                return v.f5219a;
            }

            public final void invoke(C2.b it) {
                i.e(it, "it");
                Location location = this.this$0.lastLocation;
                i.b(location);
                it.onLocationChanged(location);
            }
        }

        public static final class b extends j implements InterfaceC0743l {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C2.b) obj);
                return v.f5219a;
            }

            public final void invoke(C2.b it) {
                i.e(it, "it");
                Location location = this.this$0.lastLocation;
                i.b(location);
                it.onLocationChanged(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q qVar, s sVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$wasSuccessful = qVar;
            this.$self = sVar;
        }

        private static final void invokeSuspend$lambda$2$lambda$0(s sVar, d dVar, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.d) sVar.f5233f).wake(Boolean.FALSE);
            } else {
                dVar.lastLocation = location;
                ((com.onesignal.common.threading.d) sVar.f5233f).wake(Boolean.TRUE);
            }
        }

        private static final void invokeSuspend$lambda$2$lambda$1(s sVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.warn("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.d) sVar.f5233f).wake(Boolean.FALSE);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return d.this.new e(this.$wasSuccessful, this.$self, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00f7 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:7:0x0023, B:8:0x00eb, B:10:0x00f7), top: B:6:0x0023 }] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8, types: [P5.a] */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r7v9, types: [P5.a] */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P5.d dVar;
            q qVar;
            d dVar2;
            s sVar;
            ?? r42;
            Throwable th;
            s sVar2;
            q qVar2;
            q qVar3;
            d dVar3;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    P5.a aVar = d.this.startStopMutex;
                    d dVar4 = d.this;
                    q qVar4 = this.$wasSuccessful;
                    s sVar3 = this.$self;
                    this.L$0 = aVar;
                    this.L$1 = dVar4;
                    this.L$2 = qVar4;
                    this.L$3 = sVar3;
                    this.label = 1;
                    dVar = (P5.d) aVar;
                    if (dVar.c(this) != enumC0580a) {
                        qVar = qVar4;
                        dVar2 = dVar4;
                        sVar = sVar3;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar2 = (q) this.L$4;
                    sVar2 = (s) this.L$3;
                    qVar3 = (q) this.L$2;
                    dVar3 = (d) this.L$1;
                    r42 = (P5.a) this.L$0;
                    try {
                        AbstractC0676f.w(obj);
                        r42 = r42;
                        qVar2.f5231f = ((Boolean) obj).booleanValue();
                        if (qVar3.f5231f) {
                            dVar3.event.fire(new b(dVar3));
                            d dVar5 = (d) sVar2.f5233f;
                            T1.f fVar = dVar3._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = dVar3.hmsFusedLocationClient;
                            i.b(fusedLocationProviderClient);
                            dVar3.locationUpdateListener = new b(dVar5, fVar, fusedLocationProviderClient);
                        }
                        dVar = r42;
                        dVar.d(null);
                        return v.f5219a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((P5.d) r42).d(null);
                        throw th;
                    }
                }
                sVar = (s) this.L$3;
                qVar = (q) this.L$2;
                dVar2 = (d) this.L$1;
                ?? r7 = (P5.a) this.L$0;
                AbstractC0676f.w(obj);
                dVar = r7;
                if (dVar2.hmsFusedLocationClient == null) {
                    try {
                        dVar2.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(dVar2._applicationService.getAppContext());
                    } catch (Exception e4) {
                        com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e4, null, 2, null);
                        qVar.f5231f = false;
                    }
                }
                if (dVar2.lastLocation != null) {
                    dVar2.event.fire(new a(dVar2));
                    dVar.d(null);
                    return v.f5219a;
                }
                com.onesignal.common.threading.d dVar6 = new com.onesignal.common.threading.d();
                FusedLocationProviderClient fusedLocationProviderClient2 = dVar2.hmsFusedLocationClient;
                i.b(fusedLocationProviderClient2);
                fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.L$0 = dVar;
                this.L$1 = dVar2;
                this.L$2 = qVar;
                this.L$3 = sVar;
                this.L$4 = qVar;
                this.label = 2;
                Object waitForWake = dVar6.waitForWake(this);
                if (waitForWake != enumC0580a) {
                    r42 = dVar;
                    obj = waitForWake;
                    sVar2 = sVar;
                    qVar2 = qVar;
                    qVar3 = qVar2;
                    dVar3 = dVar2;
                    qVar2.f5231f = ((Boolean) obj).booleanValue();
                    if (qVar3.f5231f) {
                    }
                    dVar = r42;
                    dVar.d(null);
                    return v.f5219a;
                }
                return enumC0580a;
            } catch (Throwable th3) {
                r42 = dVar;
                th = th3;
                ((P5.d) r42).d(null);
                throw th;
            }
        }
    }

    public static final class f extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.stop(this);
        }
    }

    public d(T1.f _applicationService) {
        i.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
        this.locationHandlerThread = new a();
        this.startStopMutex = new P5.d();
        this.event = new com.onesignal.common.events.b();
    }

    @Override // C2.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // C2.a
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        s sVar = new s();
        com.onesignal.common.threading.b.suspendifyOnIO(new c(fusedLocationProviderClient, sVar, null));
        return (Location) sVar.f5233f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // C2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(InterfaceC0564d interfaceC0564d) {
        C0051d c0051d;
        int i7;
        q qVar;
        if (interfaceC0564d instanceof C0051d) {
            c0051d = (C0051d) interfaceC0564d;
            int i8 = c0051d.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0051d.label = i8 - Integer.MIN_VALUE;
                Object obj = c0051d.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0051d.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    s sVar = new s();
                    sVar.f5233f = this;
                    q qVar2 = new q();
                    O5.c cVar = F.f1029c;
                    e eVar = new e(qVar2, sVar, null);
                    c0051d.L$0 = qVar2;
                    c0051d.label = 1;
                    if (AbstractC0165z.t(cVar, eVar, c0051d) == enumC0580a) {
                        return enumC0580a;
                    }
                    qVar = qVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) c0051d.L$0;
                    AbstractC0676f.w(obj);
                }
                return Boolean.valueOf(qVar.f5231f);
            }
        }
        c0051d = new C0051d(interfaceC0564d);
        Object obj2 = c0051d.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0051d.label;
        if (i7 != 0) {
        }
        return Boolean.valueOf(qVar.f5231f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // C2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(InterfaceC0564d interfaceC0564d) {
        f fVar;
        int i7;
        d dVar;
        P5.a aVar;
        b bVar;
        try {
            if (interfaceC0564d instanceof f) {
                fVar = (f) interfaceC0564d;
                int i8 = fVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i8 - Integer.MIN_VALUE;
                    Object obj = fVar.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = fVar.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        P5.a aVar2 = this.startStopMutex;
                        fVar.L$0 = this;
                        fVar.L$1 = aVar2;
                        fVar.label = 1;
                        P5.d dVar2 = (P5.d) aVar2;
                        if (dVar2.c(fVar) == enumC0580a) {
                            return enumC0580a;
                        }
                        dVar = this;
                        aVar = dVar2;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (P5.a) fVar.L$1;
                        dVar = (d) fVar.L$0;
                        AbstractC0676f.w(obj);
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
                    ((P5.d) aVar).d(null);
                    return v.f5219a;
                }
            }
            bVar = dVar.locationUpdateListener;
            if (bVar != null) {
            }
            if (dVar.hmsFusedLocationClient != null) {
            }
            dVar.lastLocation = null;
            ((P5.d) aVar).d(null);
            return v.f5219a;
        } catch (Throwable th) {
            ((P5.d) aVar).d(null);
            throw th;
        }
        fVar = new f(interfaceC0564d);
        Object obj2 = fVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = fVar.label;
        if (i7 != 0) {
        }
    }

    @Override // C2.a, com.onesignal.common.events.d
    public void subscribe(C2.b handler) {
        i.e(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // C2.a, com.onesignal.common.events.d
    public void unsubscribe(C2.b handler) {
        i.e(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
