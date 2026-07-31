package com.onesignal.core.internal.permissions;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import H5.n0;
import K5.i;
import K5.k;
import L5.l;
import M5.o;
import a1.AbstractC0223a;
import android.app.Activity;
import androidx.lifecycle.C0238e;
import androidx.lifecycle.S;
import f2.InterfaceC0365b;
import k5.InterfaceC0475e;
import k5.v;
import kotlin.jvm.internal.j;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class h extends S {
    public static final a Companion = new a(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private final K5.h _shouldFinish;
    private final K5.h _waiting;
    private String androidPermissionString;
    private String permissionRequestType;
    private final i shouldFinish;
    private final i waiting;
    private final InterfaceC0475e requestPermissionService$delegate = AbstractC0521b.x(e.INSTANCE);
    private final InterfaceC0475e preferenceService$delegate = AbstractC0521b.x(d.INSTANCE);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.initialize(null, null, null, this);
        }
    }

    public static final class c extends q5.g implements InterfaceC0747p {
        final /* synthetic */ int[] $grantResults;
        final /* synthetic */ String[] $permissions;
        final /* synthetic */ boolean $shouldShowRationaleAfter;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr, int[] iArr, h hVar, boolean z5, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$permissions = strArr;
            this.$grantResults = iArr;
            this.this$0 = hVar;
            this.$shouldShowRationaleAfter = z5;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new c(this.$permissions, this.$grantResults, this.this$0, this.$shouldShowRationaleAfter, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                this.label = 1;
                if (AbstractC0165z.d(500L, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            String[] strArr = this.$permissions;
            boolean z6 = false;
            if (strArr.length == 0) {
                z5 = false;
            } else {
                String str = strArr[0];
                int[] iArr = this.$grantResults;
                boolean z7 = !(iArr.length == 0) && iArr[0] == 0;
                if (z7) {
                    this.this$0.getPreferenceService().saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, C1.c.h("USER_RESOLVED_PERMISSION_", str), Boolean.TRUE);
                } else {
                    z6 = this.this$0.shouldShowSettings(str, this.$shouldShowRationaleAfter);
                }
                this.this$0.getPreferenceService().saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, C1.c.h("PROMPTED_PERMISSION_", str), Boolean.TRUE);
                z5 = z6;
                z6 = z7;
            }
            this.this$0.executeCallback(z6, z5);
            ((k) this.this$0._shouldFinish).e(Boolean.TRUE);
            return v.f5219a;
        }
    }

    public static final class d extends j implements InterfaceC0732a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final InterfaceC0365b invoke() {
            return (InterfaceC0365b) L1.f.d().getService(InterfaceC0365b.class);
        }
    }

    public static final class e extends j implements InterfaceC0732a {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.core.internal.permissions.impl.a invoke() {
            return (com.onesignal.core.internal.permissions.impl.a) L1.f.d().getService(com.onesignal.core.internal.permissions.impl.a.class);
        }
    }

    public h() {
        Boolean bool = Boolean.FALSE;
        k kVar = new k(bool);
        this._shouldFinish = kVar;
        this.shouldFinish = new J1.c(9, kVar);
        k kVar2 = new k(bool);
        this._waiting = kVar2;
        this.waiting = new J1.c(9, kVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeCallback(boolean z5, boolean z6) {
        v vVar;
        String str = this.permissionRequestType;
        if (str != null) {
            f callback = getRequestPermissionService().getCallback(str);
            if (callback == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: ".concat(str));
            }
            if (z5) {
                callback.onAccept();
            } else {
                callback.onReject(z6);
            }
            vVar = v.f5219a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            com.onesignal.debug.internal.logging.b.error$default("PermissionsViewModel: Cannot resolve callback because permissionRequestType is null. Ending permission flow.", null, 2, null);
            ((k) this._shouldFinish).e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0365b getPreferenceService() {
        return (InterfaceC0365b) this.preferenceService$delegate.getValue();
    }

    private final com.onesignal.core.internal.permissions.impl.a getRequestPermissionService() {
        return (com.onesignal.core.internal.permissions.impl.a) this.requestPermissionService$delegate.getValue();
    }

    public static /* synthetic */ void onRequestPermissionsResult$default(h hVar, String[] strArr, int[] iArr, boolean z5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        hVar.onRequestPermissionsResult(strArr, iArr, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowSettings(String str, boolean z5) {
        if (!getRequestPermissionService().getFallbackToSettings()) {
            return false;
        }
        String h7 = C1.c.h("USER_RESOLVED_PERMISSION_", str);
        boolean shouldShowRequestPermissionRationaleBeforeRequest = getRequestPermissionService().getShouldShowRequestPermissionRationaleBeforeRequest();
        if (shouldShowRequestPermissionRationaleBeforeRequest && !z5) {
            getPreferenceService().saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, h7, Boolean.TRUE);
            return false;
        }
        InterfaceC0365b preferenceService = getPreferenceService();
        String h8 = C1.c.h("PROMPTED_PERMISSION_", str);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = preferenceService.getBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, h8, bool);
        if ((bool2 != null ? bool2.booleanValue() : false) && !shouldShowRequestPermissionRationaleBeforeRequest && !z5) {
            getPreferenceService().saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, h7, Boolean.TRUE);
            return true;
        }
        Boolean bool3 = getPreferenceService().getBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, h7, bool);
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        return false;
    }

    public final String getPermissionRequestType() {
        return this.permissionRequestType;
    }

    public final i getShouldFinish() {
        return this.shouldFinish;
    }

    public final i getWaiting() {
        return this.waiting;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialize(Activity activity, String str, String str2, InterfaceC0564d interfaceC0564d) {
        b bVar;
        Object obj;
        int i7;
        h hVar;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    bVar.L$0 = this;
                    bVar.L$1 = str;
                    bVar.L$2 = str2;
                    bVar.label = 1;
                    obj = L1.f.f(activity, bVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    hVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) bVar.L$2;
                    str = (String) bVar.L$1;
                    hVar = (h) bVar.L$0;
                    AbstractC0676f.w(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ((k) hVar._shouldFinish).e(Boolean.TRUE);
                    return Boolean.FALSE;
                }
                if (str != null && str2 != null) {
                    hVar.permissionRequestType = str;
                    hVar.androidPermissionString = str2;
                    return Boolean.TRUE;
                }
                ((k) hVar._shouldFinish).e(Boolean.TRUE);
                return Boolean.FALSE;
            }
        }
        bVar = new b(interfaceC0564d);
        obj = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // androidx.lifecycle.S
    public void onCleared() {
    }

    public final void onRequestPermissionsResult(String[] permissions, int[] grantResults, boolean z5) {
        kotlin.jvm.internal.i.e(permissions, "permissions");
        kotlin.jvm.internal.i.e(grantResults, "grantResults");
        ((k) this._waiting).e(Boolean.FALSE);
        InterfaceC0163x interfaceC0163x = (InterfaceC0163x) getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (interfaceC0163x == null) {
            n0 n0Var = new n0();
            O5.d dVar = F.f1027a;
            interfaceC0163x = (InterfaceC0163x) setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0238e(AbstractC0223a.D(n0Var, o.f1618a.f1227j)));
        }
        AbstractC0165z.l(interfaceC0163x, null, new c(permissions, grantResults, this, z5, null), 3);
    }

    public final void recordRationaleState(boolean z5) {
        getRequestPermissionService().setShouldShowRequestPermissionRationaleBeforeRequest(z5);
    }

    public final void resetWaitingState() {
        ((k) this._waiting).e(Boolean.FALSE);
    }

    public final boolean shouldRequestPermission() {
        k kVar = (k) this._waiting;
        kVar.getClass();
        Object obj = k.f1411k.get(kVar);
        if (obj == l.f1515a) {
            obj = null;
        }
        if (((Boolean) obj).booleanValue()) {
            return false;
        }
        ((k) this._waiting).e(Boolean.TRUE);
        return true;
    }
}
