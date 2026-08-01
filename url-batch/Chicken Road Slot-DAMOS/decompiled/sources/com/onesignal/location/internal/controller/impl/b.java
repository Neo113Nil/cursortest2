package com.onesignal.location.internal.controller.impl;

import a7.k;
import a7.l;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import b7.u0;
import b7.v;
import c7.c0;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import ge.a0;
import ge.k0;
import ge.v1;
import ge.x;
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
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.g2;
import nd.i;
import wd.b0;
import wd.p;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements nb.a {
    private final ea.f _applicationService;
    private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
    private final com.onesignal.common.events.b event;
    private com.onesignal.location.internal.controller.impl.c googleApiClient;
    private Location lastLocation;
    private final c locationHandlerThread;
    private d locationUpdateListener;
    private final oe.a startStopMutex;
    public static final a Companion = new a(null);
    private static final int API_FALLBACK_TIME = 30000;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.location.internal.controller.impl.b$b, reason: collision with other inner class name */
    public static final class C0041b implements k, l {
        private final b _parent;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.location.internal.controller.impl.b$b$a */
        public static final class a extends i implements Function1 {
            int label;

            public a(ld.a aVar) {
                super(1, aVar);
            }

            @Override // nd.a
            public final ld.a create(ld.a aVar) {
                return C0041b.this.new a(aVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(ld.a aVar) {
                return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                md.a aVar = md.a.f6622d;
                int i3 = this.label;
                if (i3 == 0) {
                    cf.c.M(obj);
                    b bVar = C0041b.this._parent;
                    this.label = 1;
                    if (bVar.stop(this) == aVar) {
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

        public C0041b(b bVar) {
            bVar.getClass();
            this._parent = bVar;
        }

        @Override // a7.k
        public void onConnected(Bundle bundle) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // a7.l
        public void onConnectionFailed(z6.b bVar) {
            bVar.getClass();
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + bVar, null, 2, null);
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(null), 1, null);
        }

        @Override // a7.k
        public void onConnectionSuspended(int i3) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i3, null, 2, null);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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
            handler.getClass();
            this.mHandler = handler;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d implements LocationListener, ea.e, Closeable {
        private final ea.f _applicationService;
        private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
        private final b _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public d(ea.f fVar, b bVar, GoogleApiClient googleApiClient, com.onesignal.location.internal.controller.impl.g gVar) {
            fVar.getClass();
            bVar.getClass();
            googleApiClient.getClass();
            gVar.getClass();
            this._applicationService = fVar;
            this._parent = bVar;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = gVar;
            if (!googleApiClient.d()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            fVar.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.d()) {
                com.onesignal.debug.internal.logging.b.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
            com.onesignal.location.internal.controller.impl.g gVar = this._fusedLocationApiWrapper;
            GoogleApiClient googleApiClient = this.googleApiClient;
            priority.getClass();
            gVar.requestLocationUpdates(googleApiClient, priority, this);
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
        }

        @Override // ea.e
        public void onFocus(boolean z10) {
            com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationChanged(Location location) {
            location.getClass();
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // ea.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.start(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.stop(this);
        }
    }

    public b(ea.f fVar, com.onesignal.location.internal.controller.impl.g gVar) {
        fVar.getClass();
        gVar.getClass();
        this._applicationService = fVar;
        this._fusedLocationApiWrapper = gVar;
        this.locationHandlerThread = new c();
        this.startStopMutex = new oe.c();
        this.event = new com.onesignal.common.events.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // nb.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // nb.a
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        com.onesignal.location.internal.controller.impl.c cVar = this.googleApiClient;
        if (cVar == null || (realInstance = cVar.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // nb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(ld.a aVar) {
        f fVar;
        int i3;
        z zVar;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = fVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    b0 b0Var = new b0();
                    b0Var.f10141d = this;
                    z zVar2 = new z();
                    ne.e eVar = k0.f4372a;
                    ne.d dVar = ne.d.f7275i;
                    g gVar = new g(zVar2, b0Var, null);
                    fVar.L$0 = zVar2;
                    fVar.label = 1;
                    if (a0.B(dVar, gVar, fVar) == aVar2) {
                        return aVar2;
                    }
                    zVar = zVar2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zVar = (z) fVar.L$0;
                    cf.c.M(obj);
                }
                return Boolean.valueOf(zVar.f10164d);
            }
        }
        fVar = new f(aVar);
        Object obj2 = fVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = fVar.label;
        if (i3 != 0) {
        }
        return Boolean.valueOf(zVar.f10164d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:12:0x004b, B:14:0x004f, B:15:0x0057, B:17:0x005b, B:18:0x0060), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:12:0x004b, B:14:0x004f, B:15:0x0057, B:17:0x005b, B:18:0x0060), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // nb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(ld.a aVar) {
        h hVar;
        int i3;
        b bVar;
        oe.a aVar2;
        d dVar;
        com.onesignal.location.internal.controller.impl.c cVar;
        try {
            if (aVar instanceof h) {
                hVar = (h) aVar;
                int i10 = hVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    hVar.label = i10 - Integer.MIN_VALUE;
                    Object obj = hVar.result;
                    md.a aVar3 = md.a.f6622d;
                    i3 = hVar.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        oe.a aVar4 = this.startStopMutex;
                        hVar.L$0 = this;
                        hVar.L$1 = aVar4;
                        hVar.label = 1;
                        if (aVar4.a(hVar) == aVar3) {
                            return aVar3;
                        }
                        bVar = this;
                        aVar2 = aVar4;
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar2 = (oe.a) hVar.L$1;
                        bVar = (b) hVar.L$0;
                        cf.c.M(obj);
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
                    aVar2.d(null);
                    return Unit.f5554a;
                }
            }
            dVar = bVar.locationUpdateListener;
            if (dVar != null) {
            }
            cVar = bVar.googleApiClient;
            if (cVar != null) {
            }
            bVar.lastLocation = null;
            aVar2.d(null);
            return Unit.f5554a;
        } catch (Throwable th) {
            aVar2.d(null);
            throw th;
        }
        hVar = new h(aVar);
        Object obj2 = hVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = hVar.label;
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

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends p implements Function1 {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Location location) {
            super(1);
            this.$location = location;
        }

        public final void invoke(nb.b bVar) {
            bVar.getClass();
            bVar.onLocationChanged(this.$location);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((nb.b) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends i implements Function2 {
        final /* synthetic */ b0 $self;
        final /* synthetic */ z $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.location.internal.controller.impl.b$g$b, reason: collision with other inner class name */
        public static final class C0042b extends i implements Function2 {
            final /* synthetic */ b0 $self;
            final /* synthetic */ z $wasSuccessful;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0042b(b0 b0Var, b bVar, z zVar, ld.a aVar) {
                super(2, aVar);
                this.$self = b0Var;
                this.this$0 = bVar;
                this.$wasSuccessful = zVar;
            }

            @Override // nd.a
            public final ld.a create(Object obj, ld.a aVar) {
                return new C0042b(this.$self, this.this$0, this.$wasSuccessful, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, ld.a aVar) {
                return ((C0042b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v1 */
            /* JADX WARN: Type inference failed for: r13v2, types: [int] */
            /* JADX WARN: Type inference failed for: r13v3 */
            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                md.a aVar = md.a.f6622d;
                if (this.label != 0) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                C0041b c0041b = new C0041b((b) this.$self.f10141d);
                Context appContext = this.this$0._applicationService.getAppContext();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                boolean z10 = false;
                s.e eVar = new s.e(0);
                s.e eVar2 = new s.e(0);
                Object obj2 = z6.f.f10878d;
                aa aaVar = t7.b.f9323a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                appContext.getMainLooper();
                String packageName = appContext.getPackageName();
                String name = appContext.getClass().getName();
                a7.d dVar = LocationServices.API;
                c0.h(dVar, "Api must not be null");
                eVar2.put(dVar, null);
                c0.h(dVar.f313a, "Base client builder must not be null");
                List list = Collections.EMPTY_LIST;
                hashSet2.addAll(list);
                hashSet.addAll(list);
                arrayList.add(c0041b);
                arrayList2.add(c0041b);
                Handler mHandler = this.this$0.locationHandlerThread.getMHandler();
                c0.h(mHandler, "Handler must not be null");
                Looper looper = mHandler.getLooper();
                boolean z11 = true;
                c0.a("must call addApi() to add at least one API", !eVar2.isEmpty());
                t7.a aVar2 = t7.a.f9322b;
                a7.d dVar2 = t7.b.f9324b;
                if (eVar2.containsKey(dVar2)) {
                    aVar2 = (t7.a) eVar2.get(dVar2);
                }
                g2 g2Var = new g2(hashSet, eVar, packageName, name, aVar2);
                Map map = (Map) g2Var.f6079i;
                s.e eVar3 = new s.e(0);
                s.e eVar4 = new s.e(0);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((s.b) eVar2.keySet()).iterator();
                while (true) {
                    s.a aVar3 = (s.a) it;
                    if (!aVar3.hasNext()) {
                        break;
                    }
                    a7.d dVar3 = (a7.d) aVar3.next();
                    Object obj3 = eVar2.get(dVar3);
                    boolean z12 = map.get(dVar3) != null ? z11 : z10;
                    eVar3.put(dVar3, Boolean.valueOf(z12));
                    u0 u0Var = new u0(dVar3, z12);
                    arrayList3.add(u0Var);
                    a.a aVar4 = dVar3.f313a;
                    c0.g(aVar4);
                    boolean z13 = z10;
                    s.e eVar5 = eVar4;
                    g2 g2Var2 = g2Var;
                    Looper looper2 = looper;
                    c7.i i3 = aVar4.i(appContext, looper2, g2Var2, obj3, u0Var, u0Var);
                    eVar5.put(dVar3.f314b, i3);
                    i3.getClass();
                    z11 = true;
                    looper = looper2;
                    g2Var = g2Var2;
                    eVar4 = eVar5;
                    z10 = z13;
                }
                boolean z14 = z10;
                s.e eVar6 = eVar4;
                g2 g2Var3 = g2Var;
                Looper looper3 = looper;
                boolean z15 = z11;
                Collection values = eVar6.values();
                int i10 = v.f1365x;
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    z14 = ((c7.i) it2.next()).s() | z14;
                }
                v vVar = new v(appContext, new ReentrantLock(), looper3, g2Var3, eVar3, arrayList, arrayList2, eVar6, z14 ? z15 : 3, arrayList3);
                Set set = GoogleApiClient.f2116a;
                synchronized (set) {
                    set.add(vVar);
                }
                com.onesignal.location.internal.controller.impl.c cVar = new com.onesignal.location.internal.controller.impl.c(vVar);
                z6.b blockingConnect = cVar.blockingConnect();
                if (blockingConnect == null || blockingConnect.c() != z15) {
                    StringBuilder sb2 = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb2.append(blockingConnect != null ? new Integer(blockingConnect.f10867e) : null);
                    sb2.append(") ");
                    sb2.append(blockingConnect != null ? blockingConnect.f10869r : null);
                    com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(vVar)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    ((b) this.$self.f10141d).locationUpdateListener = new d(this.this$0._applicationService, (b) this.$self.f10141d, cVar.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    ((b) this.$self.f10141d).googleApiClient = cVar;
                    this.$wasSuccessful.f10164d = z15;
                }
                return Unit.f5554a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(z zVar, b0 b0Var, ld.a aVar) {
            super(2, aVar);
            this.$wasSuccessful = zVar;
            this.$self = b0Var;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new g(this.$wasSuccessful, this.$self, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((g) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
        
            if (r11.a(r10) == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.a] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v2, types: [oe.a] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oe.a aVar;
            b bVar;
            z zVar;
            b0 b0Var;
            oe.a aVar2;
            long api_fallback_time;
            C0042b c0042b;
            ?? r02 = md.a.f6622d;
            int i3 = this.label;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (i3 == 0) {
                    cf.c.M(obj);
                    aVar = b.this.startStopMutex;
                    bVar = b.this;
                    zVar = this.$wasSuccessful;
                    b0Var = this.$self;
                    this.L$0 = aVar;
                    this.L$1 = bVar;
                    this.L$2 = zVar;
                    this.L$3 = b0Var;
                    this.label = 1;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar2 = (oe.a) this.L$0;
                        try {
                            cf.c.M(obj);
                            r02 = aVar2;
                        } catch (v1 unused) {
                            com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                            r02 = aVar2;
                            aVar = r02;
                            aVar.d(null);
                            return Unit.f5554a;
                        }
                        aVar = r02;
                        aVar.d(null);
                        return Unit.f5554a;
                    }
                    b0Var = (b0) this.L$3;
                    zVar = (z) this.L$2;
                    bVar = (b) this.L$1;
                    oe.a aVar3 = (oe.a) this.L$0;
                    cf.c.M(obj);
                    aVar = aVar3;
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
                    zVar.f10164d = true;
                    aVar.d(null);
                    return Unit.f5554a;
                }
                try {
                    api_fallback_time = b.Companion.getAPI_FALLBACK_TIME();
                    c0042b = new C0042b(b0Var, bVar, zVar, null);
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                } catch (v1 unused2) {
                    aVar2 = aVar;
                    com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                    r02 = aVar2;
                    aVar = r02;
                    aVar.d(null);
                    return Unit.f5554a;
                }
                if (a0.C(api_fallback_time, c0042b, this) != r02) {
                    r02 = aVar;
                    aVar = r02;
                    aVar.d(null);
                    return Unit.f5554a;
                }
                return r02;
            } catch (Throwable th2) {
                r02 = aVar;
                th = th2;
                r02.d(null);
                throw th;
            }
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends p implements Function1 {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.this$0 = bVar;
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
