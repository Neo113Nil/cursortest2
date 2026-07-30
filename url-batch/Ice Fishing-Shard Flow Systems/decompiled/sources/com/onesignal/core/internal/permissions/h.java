package com.onesignal.core.internal.permissions;

import R5.InterfaceC0168h;
import R5.i;
import X5.j;
import android.app.Activity;
import androidx.lifecycle.C0239e;
import androidx.lifecycle.W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n2.AbstractC0755f;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import n6.m0;
import q6.r;
import q6.s;
import q6.t;
import q6.v;
import s6.n;
import u6.C0953e;

/* loaded from: classes.dex */
public final class h extends W {
    public static final a Companion = new a(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private final r _shouldFinish;
    private final r _waiting;
    private String androidPermissionString;
    private String permissionRequestType;
    private final t shouldFinish;
    private final t waiting;
    private final InterfaceC0168h requestPermissionService$delegate = i.b(e.INSTANCE);
    private final InterfaceC0168h preferenceService$delegate = i.b(d.INSTANCE);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.initialize(null, null, null, this);
        }
    }

    public static final class c extends j implements Function2 {
        final /* synthetic */ int[] $grantResults;
        final /* synthetic */ String[] $permissions;
        final /* synthetic */ boolean $shouldShowRationaleAfter;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr, int[] iArr, h hVar, boolean z7, V5.b bVar) {
            super(2, bVar);
            this.$permissions = strArr;
            this.$grantResults = iArr;
            this.this$0 = hVar;
            this.$shouldShowRationaleAfter = z7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new c(this.$permissions, this.$grantResults, this.this$0, this.$shouldShowRationaleAfter, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            boolean z7;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                this.label = 1;
                if (AbstractC0792z.d(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            String[] strArr = this.$permissions;
            boolean z8 = false;
            if (strArr.length == 0) {
                z7 = false;
            } else {
                String str = strArr[0];
                int[] iArr = this.$grantResults;
                boolean z9 = !(iArr.length == 0) && iArr[0] == 0;
                if (z9) {
                    this.this$0.getPreferenceService().saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, r4.f.i("USER_RESOLVED_PERMISSION_", str), Boolean.TRUE);
                } else {
                    z8 = this.this$0.shouldShowSettings(str, this.$shouldShowRationaleAfter);
                }
                this.this$0.getPreferenceService().saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, r4.f.i("PROMPTED_PERMISSION_", str), Boolean.TRUE);
                z7 = z8;
                z8 = z9;
            }
            this.this$0.executeCallback(z8, z7);
            r rVar = this.this$0._shouldFinish;
            Boolean bool = Boolean.TRUE;
            v vVar = (v) rVar;
            vVar.getClass();
            vVar.c(null, bool);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class d extends p implements Function0 {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final H2.b invoke() {
            return (H2.b) AbstractC0755f.d().getService(H2.b.class);
        }
    }

    public static final class e extends p implements Function0 {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.core.internal.permissions.impl.a invoke() {
            return (com.onesignal.core.internal.permissions.impl.a) AbstractC0755f.d().getService(com.onesignal.core.internal.permissions.impl.a.class);
        }
    }

    public h() {
        Boolean bool = Boolean.FALSE;
        v vVar = new v(bool);
        this._shouldFinish = vVar;
        this.shouldFinish = new s(vVar);
        v vVar2 = new v(bool);
        this._waiting = vVar2;
        this.waiting = new s(vVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeCallback(boolean z7, boolean z8) {
        Unit unit;
        String str = this.permissionRequestType;
        if (str != null) {
            f callback = getRequestPermissionService().getCallback(str);
            if (callback == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: ".concat(str));
            }
            if (z7) {
                callback.onAccept();
            } else {
                callback.onReject(z8);
            }
            unit = Unit.f6114a;
        } else {
            unit = null;
        }
        if (unit == null) {
            com.onesignal.debug.internal.logging.b.error$default("PermissionsViewModel: Cannot resolve callback because permissionRequestType is null. Ending permission flow.", null, 2, null);
            r rVar = this._shouldFinish;
            Boolean bool = Boolean.TRUE;
            v vVar = (v) rVar;
            vVar.getClass();
            vVar.c(null, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H2.b getPreferenceService() {
        return (H2.b) this.preferenceService$delegate.getValue();
    }

    private final com.onesignal.core.internal.permissions.impl.a getRequestPermissionService() {
        return (com.onesignal.core.internal.permissions.impl.a) this.requestPermissionService$delegate.getValue();
    }

    public static /* synthetic */ void onRequestPermissionsResult$default(h hVar, String[] strArr, int[] iArr, boolean z7, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z7 = false;
        }
        hVar.onRequestPermissionsResult(strArr, iArr, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowSettings(String str, boolean z7) {
        if (!getRequestPermissionService().getFallbackToSettings()) {
            return false;
        }
        String i2 = r4.f.i("USER_RESOLVED_PERMISSION_", str);
        boolean shouldShowRequestPermissionRationaleBeforeRequest = getRequestPermissionService().getShouldShowRequestPermissionRationaleBeforeRequest();
        if (shouldShowRequestPermissionRationaleBeforeRequest && !z7) {
            getPreferenceService().saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, i2, Boolean.TRUE);
            return false;
        }
        H2.b preferenceService = getPreferenceService();
        String i5 = r4.f.i("PROMPTED_PERMISSION_", str);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = preferenceService.getBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, i5, bool);
        if ((bool2 != null ? bool2.booleanValue() : false) && !shouldShowRequestPermissionRationaleBeforeRequest && !z7) {
            getPreferenceService().saveBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, i2, Boolean.TRUE);
            return true;
        }
        Boolean bool3 = getPreferenceService().getBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, i2, bool);
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        return false;
    }

    public final String getPermissionRequestType() {
        return this.permissionRequestType;
    }

    public final t getShouldFinish() {
        return this.shouldFinish;
    }

    public final t getWaiting() {
        return this.waiting;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialize(Activity activity, String str, String str2, V5.b bVar) {
        b bVar2;
        Object obj;
        int i2;
        h hVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                obj = bVar2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    bVar2.L$0 = this;
                    bVar2.L$1 = str;
                    bVar2.L$2 = str2;
                    bVar2.label = 1;
                    obj = AbstractC0755f.f(activity, bVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    hVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) bVar2.L$2;
                    str = (String) bVar2.L$1;
                    hVar = (h) bVar2.L$0;
                    V6.b.P(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    r rVar = hVar._shouldFinish;
                    Boolean bool = Boolean.TRUE;
                    v vVar = (v) rVar;
                    vVar.getClass();
                    vVar.c(null, bool);
                    return Boolean.FALSE;
                }
                if (str != null && str2 != null) {
                    hVar.permissionRequestType = str;
                    hVar.androidPermissionString = str2;
                    return Boolean.TRUE;
                }
                r rVar2 = hVar._shouldFinish;
                Boolean bool2 = Boolean.TRUE;
                v vVar2 = (v) rVar2;
                vVar2.getClass();
                vVar2.c(null, bool2);
                return Boolean.FALSE;
            }
        }
        bVar2 = new b(bVar);
        obj = bVar2.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // androidx.lifecycle.W
    public void onCleared() {
    }

    public final void onRequestPermissionsResult(String[] permissions, int[] grantResults, boolean z7) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        r rVar = this._waiting;
        Boolean bool = Boolean.FALSE;
        v vVar = (v) rVar;
        vVar.getClass();
        vVar.c(null, bool);
        InterfaceC0789w interfaceC0789w = (InterfaceC0789w) getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (interfaceC0789w == null) {
            m0 m0Var = new m0();
            C0953e c0953e = F.f7011a;
            interfaceC0789w = (InterfaceC0789w) setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0239e(kotlin.coroutines.e.c(m0Var, n.f7850a.f7135m)));
        }
        AbstractC0792z.l(interfaceC0789w, null, new c(permissions, grantResults, this, z7, null), 3);
    }

    public final void recordRationaleState(boolean z7) {
        getRequestPermissionService().setShouldShowRequestPermissionRationaleBeforeRequest(z7);
    }

    public final void resetWaitingState() {
        r rVar = this._waiting;
        Boolean bool = Boolean.FALSE;
        v vVar = (v) rVar;
        vVar.getClass();
        vVar.c(null, bool);
    }

    public final boolean shouldRequestPermission() {
        v vVar = (v) this._waiting;
        vVar.getClass();
        Object obj = v.f7420m.get(vVar);
        if (obj == r6.s.f7582a) {
            obj = null;
        }
        if (((Boolean) obj).booleanValue()) {
            return false;
        }
        r rVar = this._waiting;
        Boolean bool = Boolean.TRUE;
        v vVar2 = (v) rVar;
        vVar2.getClass();
        vVar2.c(null, bool);
        return true;
    }
}
