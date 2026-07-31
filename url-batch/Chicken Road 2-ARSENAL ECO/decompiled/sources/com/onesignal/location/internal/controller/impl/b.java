package com.onesignal.location.internal.controller.impl;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import H5.r0;
import T0.S;
import T0.u;
import U0.t;
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
import h1.AbstractC0403b;
import h1.C0402a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import k.v0;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q.C0582b;
import q.C0587g;
import q.C0588h;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class b implements C2.a {
    private final T1.f _applicationService;
    private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
    private final com.onesignal.common.events.b event;
    private com.onesignal.location.internal.controller.impl.c googleApiClient;
    private Location lastLocation;
    private final c locationHandlerThread;
    private d locationUpdateListener;
    private final P5.a startStopMutex;
    public static final a Companion = new a(null);
    private static final int API_FALLBACK_TIME = 30000;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return b.API_FALLBACK_TIME;
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.b$b, reason: collision with other inner class name */
    public static final class C0049b implements S0.e, S0.f {
        private final b _parent;

        /* renamed from: com.onesignal.location.internal.controller.impl.b$b$a */
        public static final class a extends q5.g implements InterfaceC0743l {
            int label;

            public a(InterfaceC0564d interfaceC0564d) {
                super(1, interfaceC0564d);
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
                return C0049b.this.new a(interfaceC0564d);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                int i7 = this.label;
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    b bVar = C0049b.this._parent;
                    this.label = 1;
                    if (bVar.stop(this) == enumC0580a) {
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
                return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
            }
        }

        public C0049b(b _parent) {
            i.e(_parent, "_parent");
            this._parent = _parent;
        }

        @Override // S0.e
        public void onConnected(Bundle bundle) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // S0.f
        public void onConnectionFailed(R0.a connectionResult) {
            i.e(connectionResult, "connectionResult");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            com.onesignal.common.threading.b.suspendifyOnIO(new a(null));
        }

        @Override // S0.e
        public void onConnectionSuspended(int i7) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i7, null, 2, null);
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
            i.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class d implements LocationListener, T1.e, Closeable {
        private final T1.f _applicationService;
        private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
        private final b _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;
        private final Object requestLock;

        public d(T1.f _applicationService, b _parent, GoogleApiClient googleApiClient, com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper) {
            i.e(_applicationService, "_applicationService");
            i.e(_parent, "_parent");
            i.e(googleApiClient, "googleApiClient");
            i.e(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
            this._applicationService = _applicationService;
            this._parent = _parent;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
            this.requestLock = new Object();
            if (!googleApiClient.c()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        public static /* synthetic */ void refreshRequest$com_onesignal_location$default(d dVar, boolean z5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z5 = false;
            }
            dVar.refreshRequest$com_onesignal_location(z5);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            synchronized (this.requestLock) {
                if (this.hasExistingRequest) {
                    this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
                    this.hasExistingRequest = false;
                }
            }
        }

        @Override // T1.e
        public void onFocus(boolean z5) {
            com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        public void onLocationChanged(Location location) {
            i.e(location, "location");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // T1.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest$com_onesignal_location$default(this, false, 1, null);
        }

        public final void refreshRequest$com_onesignal_location(boolean z5) {
            if (!this.googleApiClient.c()) {
                com.onesignal.debug.internal.logging.b.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            long j4 = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j4).setInterval(j4).setMaxWaitTime((long) (j4 * 1.5d)).setPriority(102);
            synchronized (this.requestLock) {
                try {
                    if (this.hasExistingRequest) {
                        if (!z5) {
                            this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
                        }
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
                    com.onesignal.location.internal.controller.impl.g gVar = this._fusedLocationApiWrapper;
                    GoogleApiClient googleApiClient = this.googleApiClient;
                    i.b(priority);
                    this.hasExistingRequest = gVar.requestLocationUpdates(googleApiClient, priority, this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e extends j implements InterfaceC0743l {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Location location) {
            super(1);
            this.$location = location;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2.b) obj);
            return v.f5219a;
        }

        public final void invoke(C2.b it) {
            i.e(it, "it");
            it.onLocationChanged(this.$location);
        }
    }

    public static final class f extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.start(this);
        }
    }

    public static final class g extends q5.g implements InterfaceC0747p {
        final /* synthetic */ s $self;
        final /* synthetic */ q $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public static final class a extends j implements InterfaceC0743l {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.this$0 = bVar;
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

        /* renamed from: com.onesignal.location.internal.controller.impl.b$g$b, reason: collision with other inner class name */
        public static final class C0050b extends q5.g implements InterfaceC0747p {
            final /* synthetic */ s $self;
            final /* synthetic */ q $wasSuccessful;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0050b(s sVar, b bVar, q qVar, InterfaceC0564d interfaceC0564d) {
                super(2, interfaceC0564d);
                this.$self = sVar;
                this.this$0 = bVar;
                this.$wasSuccessful = qVar;
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
                return new C0050b(this.$self, this.this$0, this.$wasSuccessful, interfaceC0564d);
            }

            @Override // x5.InterfaceC0747p
            public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
                return ((C0050b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                C0049b c0049b = new C0049b((b) this.$self.f5233f);
                Context appContext = this.this$0._applicationService.getAppContext();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                C0582b c0582b = new C0582b();
                C0582b c0582b2 = new C0582b();
                Object obj2 = R0.d.f2062b;
                W0.b bVar = AbstractC0403b.f4334a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                appContext.getMainLooper();
                String packageName = appContext.getPackageName();
                String name = appContext.getClass().getName();
                S0.c cVar = LocationServices.API;
                t.g(cVar, "Api must not be null");
                Object obj3 = null;
                c0582b2.put(cVar, null);
                t.g(cVar.f2200a, "Base client builder must not be null");
                List list = Collections.EMPTY_LIST;
                hashSet2.addAll(list);
                hashSet.addAll(list);
                arrayList.add(c0049b);
                arrayList2.add(c0049b);
                Handler mHandler = this.this$0.locationHandlerThread.getMHandler();
                t.g(mHandler, "Handler must not be null");
                Looper looper = mHandler.getLooper();
                t.a("must call addApi() to add at least one API", !c0582b2.isEmpty());
                C0402a c0402a = C0402a.f4333a;
                S0.c cVar2 = AbstractC0403b.f4335b;
                if (c0582b2.containsKey(cVar2)) {
                    c0402a = (C0402a) c0582b2.getOrDefault(cVar2, null);
                }
                v0 v0Var = new v0(hashSet, c0582b, packageName, name, c0402a);
                Map map = (Map) v0Var.f5138h;
                C0582b c0582b3 = new C0582b();
                C0582b c0582b4 = new C0582b();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((C0588h) c0582b2.keySet()).iterator();
                while (true) {
                    C0587g c0587g = (C0587g) it;
                    if (!c0587g.hasNext()) {
                        break;
                    }
                    S0.c cVar3 = (S0.c) c0587g.next();
                    Object orDefault = c0582b2.getOrDefault(cVar3, obj3);
                    boolean z5 = map.get(cVar3) != null;
                    c0582b3.put(cVar3, Boolean.valueOf(z5));
                    S s6 = new S(cVar3, z5);
                    arrayList3.add(s6);
                    C0582b c0582b5 = c0582b4;
                    AbstractC0521b abstractC0521b = cVar3.f2200a;
                    t.f(abstractC0521b);
                    v0 v0Var2 = v0Var;
                    Looper looper2 = looper;
                    S0.a c7 = abstractC0521b.c(appContext, looper2, v0Var2, orDefault, s6, s6);
                    c0582b5.put(cVar3.f2201b, c7);
                    c7.getClass();
                    c0582b4 = c0582b5;
                    looper = looper2;
                    v0Var = v0Var2;
                    obj3 = null;
                }
                v0 v0Var3 = v0Var;
                Looper looper3 = looper;
                C0582b c0582b6 = c0582b4;
                u uVar = new u(appContext, new ReentrantLock(), looper3, v0Var3, c0582b3, arrayList, arrayList2, c0582b6, u.d(c0582b6.values(), true), arrayList3);
                Set set = GoogleApiClient.f3856f;
                synchronized (set) {
                    set.add(uVar);
                }
                com.onesignal.location.internal.controller.impl.c cVar4 = new com.onesignal.location.internal.controller.impl.c(uVar);
                R0.a blockingConnect = cVar4.blockingConnect();
                if (blockingConnect == null || !blockingConnect.b()) {
                    StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb.append(blockingConnect != null ? new Integer(blockingConnect.f2053g) : null);
                    sb.append(") ");
                    sb.append(blockingConnect != null ? blockingConnect.f2055i : null);
                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(uVar)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    ((b) this.$self.f5233f).locationUpdateListener = new d(this.this$0._applicationService, (b) this.$self.f5233f, cVar4.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    ((b) this.$self.f5233f).googleApiClient = cVar4;
                    this.$wasSuccessful.f5231f = true;
                }
                return v.f5219a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q qVar, s sVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$wasSuccessful = qVar;
            this.$self = sVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new g(this.$wasSuccessful, this.$self, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((g) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0055, code lost:
        
            if (r11.c(r10) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v16, types: [P5.a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r7v4, types: [P5.a] */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            q qVar;
            s sVar;
            P5.d dVar;
            ?? r02;
            Throwable th;
            long api_fallback_time;
            C0050b c0050b;
            P5.d dVar2;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    P5.a aVar = b.this.startStopMutex;
                    bVar = b.this;
                    qVar = this.$wasSuccessful;
                    sVar = this.$self;
                    this.L$0 = aVar;
                    this.L$1 = bVar;
                    this.L$2 = qVar;
                    this.L$3 = sVar;
                    this.label = 1;
                    dVar = (P5.d) aVar;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r02 = (P5.a) this.L$0;
                        try {
                            try {
                                AbstractC0676f.w(obj);
                                dVar2 = r02;
                            } catch (r0 unused) {
                                com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                                dVar2 = r02;
                                dVar = dVar2;
                                dVar.d(null);
                                return v.f5219a;
                            }
                            dVar = dVar2;
                            dVar.d(null);
                            return v.f5219a;
                        } catch (Throwable th2) {
                            th = th2;
                            ((P5.d) r02).d(null);
                            throw th;
                        }
                    }
                    sVar = (s) this.L$3;
                    qVar = (q) this.L$2;
                    bVar = (b) this.L$1;
                    ?? r7 = (P5.a) this.L$0;
                    AbstractC0676f.w(obj);
                    dVar = r7;
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
                    d dVar3 = bVar.locationUpdateListener;
                    if (dVar3 != null) {
                        dVar3.refreshRequest$com_onesignal_location(true);
                    }
                    qVar.f5231f = true;
                    dVar.d(null);
                    return v.f5219a;
                }
                try {
                    api_fallback_time = b.Companion.getAPI_FALLBACK_TIME();
                    c0050b = new C0050b(sVar, bVar, qVar, null);
                    this.L$0 = dVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                } catch (r0 unused2) {
                    r02 = dVar;
                    com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                    dVar2 = r02;
                    dVar = dVar2;
                    dVar.d(null);
                    return v.f5219a;
                }
                if (AbstractC0165z.u(api_fallback_time, c0050b, this) != enumC0580a) {
                    dVar2 = dVar;
                    dVar = dVar2;
                    dVar.d(null);
                    return v.f5219a;
                }
                return enumC0580a;
            } catch (Throwable th3) {
                r02 = dVar;
                th = th3;
                ((P5.d) r02).d(null);
                throw th;
            }
        }
    }

    public static final class h extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.stop(this);
        }
    }

    public b(T1.f _applicationService, com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper) {
        i.e(_applicationService, "_applicationService");
        i.e(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = _applicationService;
        this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
        this.locationHandlerThread = new c();
        this.startStopMutex = new P5.d();
        this.event = new com.onesignal.common.events.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // C2.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // C2.a
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
    @Override // C2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(InterfaceC0564d interfaceC0564d) {
        f fVar;
        int i7;
        q qVar;
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
                    s sVar = new s();
                    sVar.f5233f = this;
                    q qVar2 = new q();
                    O5.c cVar = F.f1029c;
                    g gVar = new g(qVar2, sVar, null);
                    fVar.L$0 = qVar2;
                    fVar.label = 1;
                    if (AbstractC0165z.t(cVar, gVar, fVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    qVar = qVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) fVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return Boolean.valueOf(qVar.f5231f);
            }
        }
        fVar = new f(interfaceC0564d);
        Object obj2 = fVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = fVar.label;
        if (i7 != 0) {
        }
        return Boolean.valueOf(qVar.f5231f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // C2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(InterfaceC0564d interfaceC0564d) {
        h hVar;
        int i7;
        b bVar;
        P5.a aVar;
        d dVar;
        com.onesignal.location.internal.controller.impl.c cVar;
        try {
            if (interfaceC0564d instanceof h) {
                hVar = (h) interfaceC0564d;
                int i8 = hVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    hVar.label = i8 - Integer.MIN_VALUE;
                    Object obj = hVar.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = hVar.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        P5.a aVar2 = this.startStopMutex;
                        hVar.L$0 = this;
                        hVar.L$1 = aVar2;
                        hVar.label = 1;
                        P5.d dVar2 = (P5.d) aVar2;
                        if (dVar2.c(hVar) == enumC0580a) {
                            return enumC0580a;
                        }
                        bVar = this;
                        aVar = dVar2;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (P5.a) hVar.L$1;
                        bVar = (b) hVar.L$0;
                        AbstractC0676f.w(obj);
                    }
                    dVar = bVar.locationUpdateListener;
                    if (dVar != null) {
                        dVar.close();
                        bVar.locationUpdateListener = null;
                    }
                    cVar = bVar.googleApiClient;
                    if (cVar != null) {
                        cVar.disconnect();
                        bVar.googleApiClient = null;
                    }
                    bVar.lastLocation = null;
                    ((P5.d) aVar).d(null);
                    return v.f5219a;
                }
            }
            dVar = bVar.locationUpdateListener;
            if (dVar != null) {
            }
            cVar = bVar.googleApiClient;
            if (cVar != null) {
            }
            bVar.lastLocation = null;
            ((P5.d) aVar).d(null);
            return v.f5219a;
        } catch (Throwable th) {
            ((P5.d) aVar).d(null);
            throw th;
        }
        hVar = new h(interfaceC0564d);
        Object obj2 = hVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = hVar.label;
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
