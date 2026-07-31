package com.onesignal.location.internal;

import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import M5.o;
import T1.f;
import com.onesignal.common.AndroidUtils;
import f2.InterfaceC0365b;
import java.util.List;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import l5.AbstractC0507k;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import q5.g;
import u0.AbstractC0676f;
import x2.InterfaceC0728a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;
import z2.InterfaceC0772a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0728a, com.onesignal.core.internal.startup.b, com.onesignal.location.internal.permissions.a {
    private final f _applicationService;
    private final InterfaceC0772a _capturer;
    private boolean _isShared;
    private final C2.a _locationController;
    private final com.onesignal.location.internal.permissions.b _locationPermissionController;
    private final InterfaceC0365b _prefs;

    /* renamed from: com.onesignal.location.internal.a$a, reason: collision with other inner class name */
    public static final class C0048a extends g implements InterfaceC0743l {
        int label;

        public C0048a(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new C0048a(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                a aVar = a.this;
                this.label = 1;
                if (aVar.startGetLocation(this) == enumC0580a) {
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
            return ((C0048a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.requestPermission(this);
        }
    }

    public static final class c extends g implements InterfaceC0747p {
        final /* synthetic */ q $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$result = qVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return a.this.new c(this.$result, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L64;
         */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            Object backgroundLocationPermissionLogic;
            q qVar;
            q qVar2;
            Object prompt;
            q qVar3;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                String str = null;
                if (!a.this.isShared()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean hasPermission = androidUtils.hasPermission("android.permission.ACCESS_FINE_LOCATION", true, a.this._applicationService);
                if (hasPermission) {
                    z5 = false;
                } else {
                    z5 = androidUtils.hasPermission("android.permission.ACCESS_COARSE_LOCATION", true, a.this._applicationService);
                    a.this._capturer.setLocationCoarse(true);
                }
                int androidSDKInt = androidUtils.getAndroidSDKInt();
                boolean hasPermission2 = androidSDKInt >= 29 ? androidUtils.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", true, a.this._applicationService) : false;
                if (androidSDKInt < 23) {
                    if (!hasPermission && !z5) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file < M", null, 2, null);
                        return Boolean.FALSE;
                    }
                    a aVar = a.this;
                    this.label = 1;
                } else if (!hasPermission) {
                    List<String> filterManifestPermissions = androidUtils.filterManifestPermissions(AbstractC0507k.z("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"), a.this._applicationService);
                    if (filterManifestPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        str = "android.permission.ACCESS_FINE_LOCATION";
                    } else if (!filterManifestPermissions.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                    } else if (!z5) {
                        str = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (androidSDKInt >= 29 && filterManifestPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                    qVar2 = this.$result;
                    if (str != null) {
                        com.onesignal.location.internal.permissions.b bVar = a.this._locationPermissionController;
                        this.L$0 = qVar2;
                        this.label = 2;
                        prompt = bVar.prompt(true, str, this);
                        if (prompt != enumC0580a) {
                            qVar3 = qVar2;
                            z5 = ((Boolean) prompt).booleanValue();
                            qVar2 = qVar3;
                        }
                    }
                    qVar2.f5231f = z5;
                } else if (androidSDKInt < 29 || hasPermission2) {
                    this.$result.f5231f = true;
                    a aVar2 = a.this;
                    this.label = 4;
                } else {
                    q qVar4 = this.$result;
                    a aVar3 = a.this;
                    this.L$0 = qVar4;
                    this.label = 3;
                    backgroundLocationPermissionLogic = aVar3.backgroundLocationPermissionLogic(true, this);
                    if (backgroundLocationPermissionLogic != enumC0580a) {
                        qVar = qVar4;
                        qVar.f5231f = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
                    }
                }
                return enumC0580a;
            }
            if (i7 == 1) {
                AbstractC0676f.w(obj);
                this.$result.f5231f = true;
            } else if (i7 == 2) {
                qVar3 = (q) this.L$0;
                AbstractC0676f.w(obj);
                prompt = obj;
                z5 = ((Boolean) prompt).booleanValue();
                qVar2 = qVar3;
                qVar2.f5231f = z5;
            } else if (i7 == 3) {
                qVar = (q) this.L$0;
                AbstractC0676f.w(obj);
                backgroundLocationPermissionLogic = obj;
                qVar.f5231f = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }
    }

    public static final class d extends g implements InterfaceC0743l {
        int label;

        public d(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new d(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                a aVar = a.this;
                this.label = 1;
                if (aVar.startGetLocation(this) == enumC0580a) {
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
            return ((d) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class e extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.startGetLocation(this);
        }
    }

    public a(f _applicationService, InterfaceC0772a _capturer, C2.a _locationController, com.onesignal.location.internal.permissions.b _locationPermissionController, InterfaceC0365b _prefs) {
        i.e(_applicationService, "_applicationService");
        i.e(_capturer, "_capturer");
        i.e(_locationController, "_locationController");
        i.e(_locationPermissionController, "_locationPermissionController");
        i.e(_prefs, "_prefs");
        this._applicationService = _applicationService;
        this._capturer = _capturer;
        this._locationController = _locationController;
        this._locationPermissionController = _locationPermissionController;
        this._prefs = _prefs;
        Boolean bool = _prefs.getBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, "OS_LOCATION_SHARED", Boolean.FALSE);
        i.b(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z5, InterfaceC0564d interfaceC0564d) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z5, "android.permission.ACCESS_BACKGROUND_LOCATION", interfaceC0564d) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:17|18))(2:19|(1:21)(3:22|23|(1:25)))|11|(1:13)|15))|28|6|7|(0)(0)|11|(0)|15) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:10:0x0027, B:11:0x004f, B:13:0x0057, B:23:0x0044), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startGetLocation(InterfaceC0564d interfaceC0564d) {
        e eVar;
        Object obj;
        int i7;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i8 = eVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.label = i8 - Integer.MIN_VALUE;
                obj = eVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = eVar.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (!isShared()) {
                        return vVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("LocationManager.startGetLocation()", null, 2, null);
                    C2.a aVar = this._locationController;
                    eVar.label = 1;
                    obj = aVar.start(eVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
                }
                return vVar;
            }
        }
        eVar = new e(interfaceC0564d);
        obj = eVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return vVar2;
    }

    @Override // x2.InterfaceC0728a
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.a
    public void onLocationPermissionChanged(boolean z5) {
        if (z5) {
            com.onesignal.common.threading.b.suspendifyOnIO(new C0048a(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // x2.InterfaceC0728a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        q qVar;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "LocationManager.requestPermission()");
                    q qVar2 = new q();
                    I5.e eVar = o.f1618a;
                    c cVar = new c(qVar2, null);
                    bVar.L$0 = qVar2;
                    bVar.label = 1;
                    if (AbstractC0165z.t(eVar, cVar, bVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    qVar = qVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) bVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return Boolean.valueOf(qVar.f5231f);
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        return Boolean.valueOf(qVar.f5231f);
    }

    @Override // x2.InterfaceC0728a
    public void setShared(boolean z5) {
        com.onesignal.debug.internal.logging.b.debug$default("LocationManager.setIsShared(value: " + z5 + ')', null, 2, null);
        this._prefs.saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, "OS_LOCATION_SHARED", Boolean.valueOf(z5));
        this._isShared = z5;
        onLocationPermissionChanged(z5);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._locationPermissionController.subscribe((com.onesignal.location.internal.permissions.a) this);
        if (B2.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.onesignal.common.threading.b.suspendifyOnIO(new d(null));
        }
    }
}
