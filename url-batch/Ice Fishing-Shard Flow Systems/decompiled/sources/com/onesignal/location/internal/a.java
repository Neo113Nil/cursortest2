package com.onesignal.location.internal;

import X5.j;
import b3.InterfaceC0273a;
import com.onesignal.common.AndroidUtils;
import e3.InterfaceC0373a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;
import o6.C0809e;
import s6.n;
import v2.f;

/* loaded from: classes.dex */
public final class a implements Z2.a, com.onesignal.core.internal.startup.b, com.onesignal.location.internal.permissions.a {
    private final f _applicationService;
    private final InterfaceC0273a _capturer;
    private boolean _isShared;
    private final InterfaceC0373a _locationController;
    private final com.onesignal.location.internal.permissions.b _locationPermissionController;
    private final H2.b _prefs;

    /* renamed from: com.onesignal.location.internal.a$a, reason: collision with other inner class name */
    public static final class C0048a extends j implements Function1 {
        int label;

        public C0048a(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new C0048a(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((C0048a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
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

    public static final class b extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.requestPermission(this);
        }
    }

    public static final class c extends j implements Function2 {
        final /* synthetic */ B $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(B b7, V5.b bVar) {
            super(2, bVar);
            this.$result = b7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return a.this.new c(this.$result, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L64;
         */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z7;
            Object backgroundLocationPermissionLogic;
            B b7;
            B b8;
            Object prompt;
            B b9;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                String str = null;
                if (!a.this.isShared()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean hasPermission = androidUtils.hasPermission("android.permission.ACCESS_FINE_LOCATION", true, a.this._applicationService);
                if (hasPermission) {
                    z7 = false;
                } else {
                    z7 = androidUtils.hasPermission("android.permission.ACCESS_COARSE_LOCATION", true, a.this._applicationService);
                    a.this._capturer.setLocationCoarse(true);
                }
                int androidSDKInt = androidUtils.getAndroidSDKInt();
                boolean hasPermission2 = androidSDKInt >= 29 ? androidUtils.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", true, a.this._applicationService) : false;
                if (androidSDKInt < 23) {
                    if (!hasPermission && !z7) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file < M", null, 2, null);
                        return Boolean.FALSE;
                    }
                    a aVar2 = a.this;
                    this.label = 1;
                } else if (!hasPermission) {
                    List<String> filterManifestPermissions = androidUtils.filterManifestPermissions(r.d("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"), a.this._applicationService);
                    if (filterManifestPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        str = "android.permission.ACCESS_FINE_LOCATION";
                    } else if (!filterManifestPermissions.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                    } else if (!z7) {
                        str = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (androidSDKInt >= 29 && filterManifestPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                    b8 = this.$result;
                    if (str != null) {
                        com.onesignal.location.internal.permissions.b bVar = a.this._locationPermissionController;
                        this.L$0 = b8;
                        this.label = 2;
                        prompt = bVar.prompt(true, str, this);
                        if (prompt != aVar) {
                            b9 = b8;
                            z7 = ((Boolean) prompt).booleanValue();
                            b8 = b9;
                        }
                    }
                    b8.f6150d = z7;
                } else if (androidSDKInt < 29 || hasPermission2) {
                    this.$result.f6150d = true;
                    a aVar3 = a.this;
                    this.label = 4;
                } else {
                    B b10 = this.$result;
                    a aVar4 = a.this;
                    this.L$0 = b10;
                    this.label = 3;
                    backgroundLocationPermissionLogic = aVar4.backgroundLocationPermissionLogic(true, this);
                    if (backgroundLocationPermissionLogic != aVar) {
                        b7 = b10;
                        b7.f6150d = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
                    }
                }
                return aVar;
            }
            if (i2 == 1) {
                V6.b.P(obj);
                this.$result.f6150d = true;
            } else if (i2 == 2) {
                b9 = (B) this.L$0;
                V6.b.P(obj);
                prompt = obj;
                z7 = ((Boolean) prompt).booleanValue();
                b8 = b9;
                b8.f6150d = z7;
            } else if (i2 == 3) {
                b7 = (B) this.L$0;
                V6.b.P(obj);
                backgroundLocationPermissionLogic = obj;
                b7.f6150d = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class d extends j implements Function1 {
        int label;

        public d(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new d(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
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

    public static final class e extends X5.c {
        int label;
        /* synthetic */ Object result;

        public e(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.startGetLocation(this);
        }
    }

    public a(f _applicationService, InterfaceC0273a _capturer, InterfaceC0373a _locationController, com.onesignal.location.internal.permissions.b _locationPermissionController, H2.b _prefs) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_capturer, "_capturer");
        Intrinsics.checkNotNullParameter(_locationController, "_locationController");
        Intrinsics.checkNotNullParameter(_locationPermissionController, "_locationPermissionController");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._applicationService = _applicationService;
        this._capturer = _capturer;
        this._locationController = _locationController;
        this._locationPermissionController = _locationPermissionController;
        this._prefs = _prefs;
        Boolean bool = _prefs.getBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, "OS_LOCATION_SHARED", Boolean.FALSE);
        Intrinsics.b(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z7, V5.b bVar) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z7, "android.permission.ACCESS_BACKGROUND_LOCATION", bVar) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(2:20|(2:22|23)(3:24|25|(1:27)))|11|(1:13)|15|16))|30|6|7|(0)(0)|11|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x004f, B:13:0x0057, B:25:0x0044), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startGetLocation(V5.b bVar) {
        e eVar;
        Object obj;
        int i2;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i5 = eVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.label = i5 - Integer.MIN_VALUE;
                obj = eVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = eVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (!isShared()) {
                        return Unit.f6114a;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("LocationManager.startGetLocation()", null, 2, null);
                    InterfaceC0373a interfaceC0373a = this._locationController;
                    eVar.label = 1;
                    obj = interfaceC0373a.start(eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
                }
                return Unit.f6114a;
            }
        }
        eVar = new e(bVar);
        obj = eVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = eVar.label;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.f6114a;
    }

    @Override // Z2.a
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.a
    public void onLocationPermissionChanged(boolean z7) {
        if (z7) {
            com.onesignal.common.threading.b.suspendifyOnIO(new C0048a(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Z2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(V5.b bVar) {
        b bVar2;
        int i2;
        B b7;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "LocationManager.requestPermission()");
                    B b8 = new B();
                    C0809e c0809e = n.f7850a;
                    c cVar = new c(b8, null);
                    bVar2.L$0 = b8;
                    bVar2.label = 1;
                    if (AbstractC0792z.t(c0809e, cVar, bVar2) == aVar) {
                        return aVar;
                    }
                    b7 = b8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b7 = (B) bVar2.L$0;
                    V6.b.P(obj);
                }
                return Boolean.valueOf(b7.f6150d);
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(b7.f6150d);
    }

    @Override // Z2.a
    public void setShared(boolean z7) {
        com.onesignal.debug.internal.logging.b.debug$default("LocationManager.setIsShared(value: " + z7 + ')', null, 2, null);
        this._prefs.saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, "OS_LOCATION_SHARED", Boolean.valueOf(z7));
        this._isShared = z7;
        onLocationPermissionChanged(z7);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._locationPermissionController.subscribe((com.onesignal.location.internal.permissions.a) this);
        if (d3.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.onesignal.common.threading.b.suspendifyOnIO(new d(null));
        }
    }
}
