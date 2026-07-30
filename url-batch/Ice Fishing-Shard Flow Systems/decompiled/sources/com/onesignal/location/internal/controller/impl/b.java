package com.onesignal.location.internal.controller.impl;

import X5.j;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import e3.InterfaceC0373a;
import e3.InterfaceC0374b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n.w1;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import n6.q0;
import r1.InterfaceC0844c;
import r1.k;
import r1.l;
import s1.C0868J;
import s1.C0885p;
import t1.u;
import u.C0930a;
import u.C0931b;
import u.C0934e;
import u6.C0953e;
import u6.ExecutorC0952d;
import v6.InterfaceC0979a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class b implements InterfaceC0373a {
    private final v2.f _applicationService;
    private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
    private final com.onesignal.common.events.b event;
    private com.onesignal.location.internal.controller.impl.c googleApiClient;
    private Location lastLocation;
    private final c locationHandlerThread;
    private d locationUpdateListener;
    private final InterfaceC0979a startStopMutex;
    public static final a Companion = new a(null);
    private static final int API_FALLBACK_TIME = 30000;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return b.API_FALLBACK_TIME;
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.b$b, reason: collision with other inner class name */
    public static final class C0049b implements k, l {
        private final b _parent;

        /* renamed from: com.onesignal.location.internal.controller.impl.b$b$a */
        public static final class a extends j implements Function1 {
            int label;

            public a(V5.b bVar) {
                super(1, bVar);
            }

            @Override // X5.a
            public final V5.b create(V5.b bVar) {
                return C0049b.this.new a(bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(V5.b bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    b bVar = C0049b.this._parent;
                    this.label = 1;
                    if (bVar.stop(this) == aVar) {
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

        public C0049b(b _parent) {
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            this._parent = _parent;
        }

        @Override // r1.k
        public void onConnected(Bundle bundle) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // r1.l
        public void onConnectionFailed(q1.b connectionResult) {
            Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            com.onesignal.common.threading.b.suspendifyOnIO(new a(null));
        }

        @Override // r1.k
        public void onConnectionSuspended(int i2) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i2, null, 2, null);
        }
    }

    public static final class c extends HandlerThread {
        private Handler mHandler;

        public c() {
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

    public static final class d implements LocationListener, v2.e, Closeable {
        private final v2.f _applicationService;
        private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
        private final b _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;
        private final Object requestLock;

        public d(v2.f _applicationService, b _parent, GoogleApiClient googleApiClient, com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper) {
            Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
            Intrinsics.checkNotNullParameter(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
            this._applicationService = _applicationService;
            this._parent = _parent;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
            this.requestLock = new Object();
            if (!googleApiClient.a()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        public static /* synthetic */ void refreshRequest$com_onesignal_location$default(d dVar, boolean z7, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z7 = false;
            }
            dVar.refreshRequest$com_onesignal_location(z7);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            synchronized (this.requestLock) {
                try {
                    if (this.hasExistingRequest) {
                        this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
                        this.hasExistingRequest = false;
                    }
                    Unit unit = Unit.f6114a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // v2.e
        public void onFocus(boolean z7) {
            com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        public void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // v2.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        public final void refreshRequest$com_onesignal_location(boolean z7) {
            if (!this.googleApiClient.a()) {
                com.onesignal.debug.internal.logging.b.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            synchronized (this.requestLock) {
                try {
                    if (this.hasExistingRequest) {
                        if (!z7) {
                            this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
                        }
                        Unit unit = Unit.f6114a;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
                    com.onesignal.location.internal.controller.impl.g gVar = this._fusedLocationApiWrapper;
                    GoogleApiClient googleApiClient = this.googleApiClient;
                    Intrinsics.b(priority);
                    this.hasExistingRequest = gVar.requestLocationUpdates(googleApiClient, priority, this);
                    Unit unit2 = Unit.f6114a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e extends p implements Function1 {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Location location) {
            super(1);
            this.$location = location;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0374b) obj);
            return Unit.f6114a;
        }

        public final void invoke(InterfaceC0374b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onLocationChanged(this.$location);
        }
    }

    public static final class f extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.start(this);
        }
    }

    public static final class g extends j implements Function2 {
        final /* synthetic */ D $self;
        final /* synthetic */ B $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public static final class a extends p implements Function1 {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.this$0 = bVar;
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

        /* renamed from: com.onesignal.location.internal.controller.impl.b$g$b, reason: collision with other inner class name */
        public static final class C0050b extends j implements Function2 {
            final /* synthetic */ D $self;
            final /* synthetic */ B $wasSuccessful;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0050b(D d7, b bVar, B b7, V5.b bVar2) {
                super(2, bVar2);
                this.$self = d7;
                this.this$0 = bVar;
                this.$wasSuccessful = b7;
            }

            @Override // X5.a
            public final V5.b create(Object obj, V5.b bVar) {
                return new C0050b(this.$self, this.this$0, this.$wasSuccessful, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v1 */
            /* JADX WARN: Type inference failed for: r12v2, types: [int] */
            /* JADX WARN: Type inference failed for: r12v3 */
            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                W5.a aVar = W5.a.f2787d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                C0049b c0049b = new C0049b((b) this.$self.f6152d);
                Context appContext = this.this$0._applicationService.getAppContext();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                boolean z7 = false;
                C0934e c0934e = new C0934e(0);
                C0934e c0934e2 = new C0934e(0);
                Object obj2 = q1.e.f7322d;
                D1.d dVar = H1.b.f956a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                appContext.getMainLooper();
                String packageName = appContext.getPackageName();
                String name = appContext.getClass().getName();
                r1.e eVar = LocationServices.API;
                u.g(eVar, "Api must not be null");
                c0934e2.put(eVar, null);
                u.g(eVar.f7435a, "Base client builder must not be null");
                List list = Collections.EMPTY_LIST;
                hashSet2.addAll(list);
                hashSet.addAll(list);
                arrayList.add(c0049b);
                arrayList2.add(c0049b);
                Handler mHandler = this.this$0.locationHandlerThread.getMHandler();
                u.g(mHandler, "Handler must not be null");
                Looper looper = mHandler.getLooper();
                boolean z8 = true;
                u.a("must call addApi() to add at least one API", !c0934e2.isEmpty());
                H1.a aVar2 = H1.a.f955b;
                r1.e eVar2 = H1.b.f957b;
                if (c0934e2.containsKey(eVar2)) {
                    aVar2 = (H1.a) c0934e2.get(eVar2);
                }
                w1 w1Var = new w1(hashSet, c0934e, packageName, name, aVar2);
                Map map = (Map) w1Var.f6943i;
                C0934e c0934e3 = new C0934e(0);
                C0934e c0934e4 = new C0934e(0);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((C0931b) c0934e2.keySet()).iterator();
                while (true) {
                    C0930a c0930a = (C0930a) it;
                    if (!c0930a.hasNext()) {
                        break;
                    }
                    r1.e eVar3 = (r1.e) c0930a.next();
                    Object obj3 = c0934e2.get(eVar3);
                    boolean z9 = map.get(eVar3) != null ? z8 : z7;
                    c0934e3.put(eVar3, Boolean.valueOf(z9));
                    C0868J c0868j = new C0868J(eVar3, z9);
                    arrayList3.add(c0868j);
                    AbstractC1053a abstractC1053a = eVar3.f7435a;
                    u.f(abstractC1053a);
                    boolean z10 = z7;
                    C0934e c0934e5 = c0934e4;
                    w1 w1Var2 = w1Var;
                    Looper looper2 = looper;
                    InterfaceC0844c g7 = abstractC1053a.g(appContext, looper2, w1Var2, obj3, c0868j, c0868j);
                    c0934e5.put(eVar3.f7436b, g7);
                    g7.getClass();
                    z8 = true;
                    looper = looper2;
                    w1Var = w1Var2;
                    c0934e4 = c0934e5;
                    z7 = z10;
                }
                boolean z11 = z7;
                C0934e c0934e6 = c0934e4;
                w1 w1Var3 = w1Var;
                Looper looper3 = looper;
                boolean z12 = z8;
                Collection values = c0934e6.values();
                int i2 = C0885p.f7696F;
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    z11 = ((InterfaceC0844c) it2.next()).b() | z11;
                }
                C0885p c0885p = new C0885p(appContext, new ReentrantLock(), looper3, w1Var3, c0934e3, arrayList, arrayList2, c0934e6, z11 ? z12 : 3, arrayList3);
                Set set = GoogleApiClient.f4366d;
                synchronized (set) {
                    set.add(c0885p);
                }
                com.onesignal.location.internal.controller.impl.c cVar = new com.onesignal.location.internal.controller.impl.c(c0885p);
                q1.b blockingConnect = cVar.blockingConnect();
                if (blockingConnect == null || blockingConnect.b() != z12) {
                    StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb.append(blockingConnect != null ? new Integer(blockingConnect.f7311e) : null);
                    sb.append(") ");
                    sb.append(blockingConnect != null ? blockingConnect.f7313l : null);
                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(c0885p)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    ((b) this.$self.f6152d).locationUpdateListener = new d(this.this$0._applicationService, (b) this.$self.f6152d, cVar.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    ((b) this.$self.f6152d).googleApiClient = cVar;
                    this.$wasSuccessful.f6150d = z12;
                }
                return Unit.f6114a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
                return ((C0050b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(B b7, D d7, V5.b bVar) {
            super(2, bVar);
            this.$wasSuccessful = b7;
            this.$self = d7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new g(this.$wasSuccessful, this.$self, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
        
            if (n6.AbstractC0792z.u(r7, r3, r10) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0055, code lost:
        
            if (r11.c(r10) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [v6.a] */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            B b7;
            D d7;
            v6.c cVar;
            InterfaceC0979a interfaceC0979a;
            Throwable th;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    InterfaceC0979a interfaceC0979a2 = b.this.startStopMutex;
                    bVar = b.this;
                    b7 = this.$wasSuccessful;
                    d7 = this.$self;
                    this.L$0 = interfaceC0979a2;
                    this.L$1 = bVar;
                    this.L$2 = b7;
                    this.L$3 = d7;
                    this.label = 1;
                    cVar = (v6.c) interfaceC0979a2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0979a = (InterfaceC0979a) this.L$0;
                        try {
                            try {
                                V6.b.P(obj);
                            } catch (q0 unused) {
                                com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                                Unit unit = Unit.f6114a;
                                ((v6.c) interfaceC0979a).e(null);
                                return Unit.f6114a;
                            }
                            Unit unit2 = Unit.f6114a;
                            ((v6.c) interfaceC0979a).e(null);
                            return Unit.f6114a;
                        } catch (Throwable th2) {
                            th = th2;
                            ((v6.c) interfaceC0979a).e(null);
                            throw th;
                        }
                    }
                    d7 = (D) this.L$3;
                    b7 = (B) this.L$2;
                    bVar = (b) this.L$1;
                    ?? r7 = (InterfaceC0979a) this.L$0;
                    V6.b.P(obj);
                    cVar = r7;
                }
                if (bVar.googleApiClient != null) {
                    if (bVar.lastLocation != null) {
                        bVar.event.fire(new a(bVar));
                    } else {
                        Location lastLocation = bVar.getLastLocation();
                        if (lastLocation != null) {
                            bVar.setLocationAndFire(lastLocation);
                        }
                    }
                    d dVar = bVar.locationUpdateListener;
                    if (dVar != null) {
                        dVar.refreshRequest$com_onesignal_location(true);
                    }
                    b7.f6150d = true;
                } else {
                    try {
                        long api_fallback_time = b.Companion.getAPI_FALLBACK_TIME();
                        C0050b c0050b = new C0050b(d7, bVar, b7, null);
                        this.L$0 = cVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                    } catch (q0 unused2) {
                        interfaceC0979a = cVar;
                        com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                        Unit unit22 = Unit.f6114a;
                        ((v6.c) interfaceC0979a).e(null);
                        return Unit.f6114a;
                    }
                }
                interfaceC0979a = cVar;
                Unit unit222 = Unit.f6114a;
                ((v6.c) interfaceC0979a).e(null);
                return Unit.f6114a;
            } catch (Throwable th3) {
                interfaceC0979a = cVar;
                th = th3;
                ((v6.c) interfaceC0979a).e(null);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((g) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class h extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.stop(this);
        }
    }

    public b(v2.f _applicationService, com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = _applicationService;
        this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
        this.locationHandlerThread = new c();
        this.startStopMutex = new v6.c();
        this.event = new com.onesignal.common.events.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // e3.InterfaceC0373a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // e3.InterfaceC0373a
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        com.onesignal.location.internal.controller.impl.c cVar = this.googleApiClient;
        if (cVar == null || (realInstance = cVar.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // e3.InterfaceC0373a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(V5.b bVar) {
        f fVar;
        int i2;
        B b7;
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
                    D d7 = new D();
                    d7.f6152d = this;
                    B b8 = new B();
                    C0953e c0953e = F.f7011a;
                    ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                    g gVar = new g(b8, d7, null);
                    fVar.L$0 = b8;
                    fVar.label = 1;
                    if (AbstractC0792z.t(executorC0952d, gVar, fVar) == aVar) {
                        return aVar;
                    }
                    b7 = b8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b7 = (B) fVar.L$0;
                    V6.b.P(obj);
                }
                return Boolean.valueOf(b7.f6150d);
            }
        }
        fVar = new f(bVar);
        Object obj2 = fVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = fVar.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(b7.f6150d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // e3.InterfaceC0373a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(V5.b bVar) {
        h hVar;
        int i2;
        b bVar2;
        InterfaceC0979a interfaceC0979a;
        d dVar;
        com.onesignal.location.internal.controller.impl.c cVar;
        try {
            if (bVar instanceof h) {
                hVar = (h) bVar;
                int i5 = hVar.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    hVar.label = i5 - Integer.MIN_VALUE;
                    Object obj = hVar.result;
                    W5.a aVar = W5.a.f2787d;
                    i2 = hVar.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        InterfaceC0979a interfaceC0979a2 = this.startStopMutex;
                        hVar.L$0 = this;
                        hVar.L$1 = interfaceC0979a2;
                        hVar.label = 1;
                        v6.c cVar2 = (v6.c) interfaceC0979a2;
                        if (cVar2.c(hVar) == aVar) {
                            return aVar;
                        }
                        bVar2 = this;
                        interfaceC0979a = cVar2;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0979a = (InterfaceC0979a) hVar.L$1;
                        bVar2 = (b) hVar.L$0;
                        V6.b.P(obj);
                    }
                    dVar = bVar2.locationUpdateListener;
                    if (dVar != null) {
                        dVar.close();
                        bVar2.locationUpdateListener = null;
                    }
                    cVar = bVar2.googleApiClient;
                    if (cVar != null) {
                        cVar.disconnect();
                        bVar2.googleApiClient = null;
                    }
                    bVar2.lastLocation = null;
                    Unit unit = Unit.f6114a;
                    ((v6.c) interfaceC0979a).e(null);
                    return Unit.f6114a;
                }
            }
            dVar = bVar2.locationUpdateListener;
            if (dVar != null) {
            }
            cVar = bVar2.googleApiClient;
            if (cVar != null) {
            }
            bVar2.lastLocation = null;
            Unit unit2 = Unit.f6114a;
            ((v6.c) interfaceC0979a).e(null);
            return Unit.f6114a;
        } catch (Throwable th) {
            ((v6.c) interfaceC0979a).e(null);
            throw th;
        }
        hVar = new h(bVar);
        Object obj2 = hVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = hVar.label;
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
