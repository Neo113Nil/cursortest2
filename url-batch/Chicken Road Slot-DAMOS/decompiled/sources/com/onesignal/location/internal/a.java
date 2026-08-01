package com.onesignal.location.internal;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import ea.f;
import ge.a0;
import ge.k0;
import ge.x;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import le.o;
import nd.i;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ib.a, ra.b, com.onesignal.location.internal.permissions.a {
    private final f _applicationService;
    private final kb.a _capturer;
    private boolean _isShared;
    private final nb.a _locationController;
    private final com.onesignal.location.internal.permissions.b _locationPermissionController;
    private final qa.b _prefs;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.location.internal.a$a, reason: collision with other inner class name */
    public static final class C0040a extends i implements Function1 {
        int label;

        public C0040a(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new C0040a(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((C0040a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
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
    public static final class b extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.requestPermission(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends i implements Function2 {
        final /* synthetic */ z $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z zVar, ld.a aVar) {
            super(2, aVar);
            this.$result = zVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new c(this.$result, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0104, code lost:
        
            if (r15.startGetLocation(r14) == r0) goto L54;
         */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            z zVar;
            z zVar2;
            z zVar3;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                String str = null;
                if (!a.this.isShared()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean hasPermission = androidUtils.hasPermission("android.permission.ACCESS_FINE_LOCATION", true, a.this._applicationService);
                if (hasPermission) {
                    z10 = false;
                } else {
                    z10 = androidUtils.hasPermission("android.permission.ACCESS_COARSE_LOCATION", true, a.this._applicationService);
                    a.this._capturer.setLocationCoarse(true);
                }
                int i10 = Build.VERSION.SDK_INT;
                boolean hasPermission2 = i10 >= 29 ? androidUtils.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", true, a.this._applicationService) : false;
                if (!hasPermission) {
                    List<String> filterManifestPermissions = androidUtils.filterManifestPermissions(y.f("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"), a.this._applicationService);
                    if (filterManifestPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        str = "android.permission.ACCESS_FINE_LOCATION";
                    } else if (!filterManifestPermissions.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                    } else if (!z10) {
                        str = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (i10 >= 29 && filterManifestPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                    zVar2 = this.$result;
                    if (str != null) {
                        com.onesignal.location.internal.permissions.b bVar = a.this._locationPermissionController;
                        this.L$0 = zVar2;
                        this.label = 2;
                        Object prompt = bVar.prompt(true, str, this);
                        if (prompt != aVar) {
                            zVar3 = zVar2;
                            obj = prompt;
                            z10 = ((Boolean) obj).booleanValue();
                            zVar2 = zVar3;
                        }
                    }
                    zVar2.f10164d = z10;
                } else if (i10 < 29 || hasPermission2) {
                    this.$result.f10164d = true;
                    a aVar2 = a.this;
                    this.label = 4;
                } else {
                    z zVar4 = this.$result;
                    a aVar3 = a.this;
                    this.L$0 = zVar4;
                    this.label = 3;
                    Object backgroundLocationPermissionLogic = aVar3.backgroundLocationPermissionLogic(true, this);
                    if (backgroundLocationPermissionLogic != aVar) {
                        zVar = zVar4;
                        obj = backgroundLocationPermissionLogic;
                        zVar.f10164d = ((Boolean) obj).booleanValue();
                    }
                }
                return aVar;
            }
            if (i3 == 1) {
                cf.c.M(obj);
                this.$result.f10164d = true;
            } else if (i3 == 2) {
                zVar3 = (z) this.L$0;
                cf.c.M(obj);
                z10 = ((Boolean) obj).booleanValue();
                zVar2 = zVar3;
                zVar2.f10164d = z10;
            } else if (i3 == 3) {
                zVar = (z) this.L$0;
                cf.c.M(obj);
                zVar.f10164d = ((Boolean) obj).booleanValue();
            } else {
                if (i3 != 4) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends i implements Function1 {
        int label;

        public d(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new d(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((d) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
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
    public static final class e extends nd.c {
        int label;
        /* synthetic */ Object result;

        public e(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.startGetLocation(this);
        }
    }

    public a(f fVar, kb.a aVar, nb.a aVar2, com.onesignal.location.internal.permissions.b bVar, qa.b bVar2) {
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        this._applicationService = fVar;
        this._capturer = aVar;
        this._locationController = aVar2;
        this._locationPermissionController = bVar;
        this._prefs = bVar2;
        Boolean bool = bVar2.getBool("OneSignal", "OS_LOCATION_SHARED", Boolean.FALSE);
        bool.getClass();
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z10, ld.a aVar) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z10, "android.permission.ACCESS_BACKGROUND_LOCATION", aVar) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(2:20|(2:22|23)(3:24|25|(1:27)))|11|(1:13)|15|16))|30|6|7|(0)(0)|11|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x004e, B:13:0x0056, B:25:0x0043), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startGetLocation(ld.a aVar) {
        e eVar;
        Object obj;
        int i3;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
                obj = eVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = eVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (!isShared()) {
                        return Unit.f5554a;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("LocationManager.startGetLocation()", null, 2, null);
                    nb.a aVar3 = this._locationController;
                    eVar.label = 1;
                    obj = aVar3.start(eVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
                }
                return Unit.f5554a;
            }
        }
        eVar = new e(aVar);
        obj = eVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = eVar.label;
        if (i3 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.f5554a;
    }

    @Override // ib.a
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.a
    public void onLocationPermissionChanged(boolean z10) {
        if (z10) {
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new C0040a(null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ib.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(ld.a aVar) {
        b bVar;
        int i3;
        z zVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "LocationManager.requestPermission()");
                    z zVar2 = new z();
                    ne.e eVar = k0.f4372a;
                    he.d dVar = o.f5995a;
                    c cVar = new c(zVar2, null);
                    bVar.L$0 = zVar2;
                    bVar.label = 1;
                    if (a0.B(dVar, cVar, bVar) == aVar2) {
                        return aVar2;
                    }
                    zVar = zVar2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zVar = (z) bVar.L$0;
                    cf.c.M(obj);
                }
                return Boolean.valueOf(zVar.f10164d);
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        return Boolean.valueOf(zVar.f10164d);
    }

    @Override // ib.a
    public void setShared(boolean z10) {
        com.onesignal.debug.internal.logging.b.debug$default("LocationManager.setIsShared(value: " + z10 + ')', null, 2, null);
        this._prefs.saveBool("OneSignal", "OS_LOCATION_SHARED", Boolean.valueOf(z10));
        this._isShared = z10;
        onLocationPermissionChanged(z10);
    }

    @Override // ra.b
    public void start() {
        this._locationPermissionController.subscribe((com.onesignal.location.internal.permissions.a) this);
        if (mb.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new d(null), 1, null);
        }
    }
}
