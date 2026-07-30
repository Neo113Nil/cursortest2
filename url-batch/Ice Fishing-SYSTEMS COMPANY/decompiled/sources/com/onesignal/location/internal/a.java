package com.onesignal.location.internal;

import E7.l;
import E7.p;
import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import T7.o;
import b5.InterfaceC0528a;
import com.onesignal.common.AndroidUtils;
import java.util.List;
import q7.v;
import r7.AbstractC4980k;
import t4.f;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import x7.h;

/* loaded from: classes2.dex */
public final class a implements W4.a, com.onesignal.core.internal.startup.b, com.onesignal.location.internal.permissions.a {
    private final f _applicationService;
    private final Y4.a _capturer;
    private boolean _isShared;
    private final InterfaceC0528a _locationController;
    private final com.onesignal.location.internal.permissions.b _locationPermissionController;
    private final F4.b _prefs;

    /* renamed from: com.onesignal.location.internal.a$a, reason: collision with other inner class name */
    public static final class C0217a extends h implements l {
        int label;

        public C0217a(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new C0217a(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                a aVar = a.this;
                this.label = 1;
                if (aVar.startGetLocation(this) == enumC5179a) {
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
            return ((C0217a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.requestPermission(this);
        }
    }

    public static final class c extends h implements p {
        final /* synthetic */ kotlin.jvm.internal.p $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.jvm.internal.p pVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$result = pVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return a.this.new c(this.$result, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((c) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L64;
         */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Object backgroundLocationPermissionLogic;
            kotlin.jvm.internal.p pVar;
            kotlin.jvm.internal.p pVar2;
            Object prompt;
            kotlin.jvm.internal.p pVar3;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                String str = null;
                if (!a.this.isShared()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean hasPermission = androidUtils.hasPermission("android.permission.ACCESS_FINE_LOCATION", true, a.this._applicationService);
                if (hasPermission) {
                    z8 = false;
                } else {
                    z8 = androidUtils.hasPermission("android.permission.ACCESS_COARSE_LOCATION", true, a.this._applicationService);
                    a.this._capturer.setLocationCoarse(true);
                }
                int androidSDKInt = androidUtils.getAndroidSDKInt();
                boolean hasPermission2 = androidSDKInt >= 29 ? androidUtils.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", true, a.this._applicationService) : false;
                if (androidSDKInt < 23) {
                    if (!hasPermission && !z8) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file < M", null, 2, null);
                        return Boolean.FALSE;
                    }
                    a aVar = a.this;
                    this.label = 1;
                } else if (!hasPermission) {
                    List<String> filterManifestPermissions = androidUtils.filterManifestPermissions(AbstractC4980k.B("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"), a.this._applicationService);
                    if (filterManifestPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        str = "android.permission.ACCESS_FINE_LOCATION";
                    } else if (!filterManifestPermissions.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                    } else if (!z8) {
                        str = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (androidSDKInt >= 29 && filterManifestPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                    pVar2 = this.$result;
                    if (str != null) {
                        com.onesignal.location.internal.permissions.b bVar = a.this._locationPermissionController;
                        this.L$0 = pVar2;
                        this.label = 2;
                        prompt = bVar.prompt(true, str, this);
                        if (prompt != enumC5179a) {
                            pVar3 = pVar2;
                            z8 = ((Boolean) prompt).booleanValue();
                            pVar2 = pVar3;
                        }
                    }
                    pVar2.f38859n = z8;
                } else if (androidSDKInt < 29 || hasPermission2) {
                    this.$result.f38859n = true;
                    a aVar2 = a.this;
                    this.label = 4;
                } else {
                    kotlin.jvm.internal.p pVar4 = this.$result;
                    a aVar3 = a.this;
                    this.L$0 = pVar4;
                    this.label = 3;
                    backgroundLocationPermissionLogic = aVar3.backgroundLocationPermissionLogic(true, this);
                    if (backgroundLocationPermissionLogic != enumC5179a) {
                        pVar = pVar4;
                        pVar.f38859n = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
                    }
                }
                return enumC5179a;
            }
            if (i == 1) {
                com.bumptech.glide.f.r(obj);
                this.$result.f38859n = true;
            } else if (i == 2) {
                pVar3 = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.f.r(obj);
                prompt = obj;
                z8 = ((Boolean) prompt).booleanValue();
                pVar2 = pVar3;
                pVar2.f38859n = z8;
            } else if (i == 3) {
                pVar = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.f.r(obj);
                backgroundLocationPermissionLogic = obj;
                pVar.f38859n = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }
    }

    public static final class d extends h implements l {
        int label;

        public d(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new d(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                a aVar = a.this;
                this.label = 1;
                if (aVar.startGetLocation(this) == enumC5179a) {
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
            return ((d) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class e extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.startGetLocation(this);
        }
    }

    public a(f _applicationService, Y4.a _capturer, InterfaceC0528a _locationController, com.onesignal.location.internal.permissions.b _locationPermissionController, F4.b _prefs) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_capturer, "_capturer");
        kotlin.jvm.internal.h.e(_locationController, "_locationController");
        kotlin.jvm.internal.h.e(_locationPermissionController, "_locationPermissionController");
        kotlin.jvm.internal.h.e(_prefs, "_prefs");
        this._applicationService = _applicationService;
        this._capturer = _capturer;
        this._locationController = _locationController;
        this._locationPermissionController = _locationPermissionController;
        this._prefs = _prefs;
        Boolean bool = _prefs.getBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, "OS_LOCATION_SHARED", Boolean.FALSE);
        kotlin.jvm.internal.h.b(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z8, InterfaceC5133d interfaceC5133d) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z8, "android.permission.ACCESS_BACKGROUND_LOCATION", interfaceC5133d) : Boolean.TRUE;
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
    public final Object startGetLocation(InterfaceC5133d interfaceC5133d) {
        e eVar;
        Object obj;
        int i;
        if (interfaceC5133d instanceof e) {
            eVar = (e) interfaceC5133d;
            int i4 = eVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.label = i4 - Integer.MIN_VALUE;
                obj = eVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = eVar.label;
                v vVar = v.f40183a;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    if (!isShared()) {
                        return vVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("LocationManager.startGetLocation()", null, 2, null);
                    InterfaceC0528a interfaceC0528a = this._locationController;
                    eVar.label = 1;
                    obj = interfaceC0528a.start(eVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
                }
                return vVar;
            }
        }
        eVar = new e(interfaceC5133d);
        obj = eVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = eVar.label;
        v vVar2 = v.f40183a;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return vVar2;
    }

    @Override // W4.a
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.a
    public void onLocationPermissionChanged(boolean z8) {
        if (z8) {
            com.onesignal.common.threading.c.suspendifyOnIO(new C0217a(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // W4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "LocationManager.requestPermission()");
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    P7.e eVar = o.f3162a;
                    c cVar = new c(pVar2, null);
                    bVar.L$0 = pVar2;
                    bVar.label = 1;
                    if (AbstractC0399y.y(eVar, cVar, bVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return Boolean.valueOf(pVar.f38859n);
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        return Boolean.valueOf(pVar.f38859n);
    }

    @Override // W4.a
    public void setShared(boolean z8) {
        com.onesignal.debug.internal.logging.b.debug$default("LocationManager.setIsShared(value: " + z8 + ')', null, 2, null);
        this._prefs.saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, "OS_LOCATION_SHARED", Boolean.valueOf(z8));
        this._isShared = z8;
        onLocationPermissionChanged(z8);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._locationPermissionController.subscribe((com.onesignal.location.internal.permissions.a) this);
        if (a5.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.onesignal.common.threading.c.suspendifyOnIO(new d(null));
        }
    }
}
