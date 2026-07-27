package com.onesignal.core.internal.permissions;

import B0.o;
import D4.AbstractC0024y;
import D4.E;
import D4.InterfaceC0022w;
import D4.n0;
import G0.C0051a;
import G4.s;
import G4.t;
import G4.u;
import G4.w;
import K4.d;
import a.AbstractC0169a;
import android.app.Activity;
import androidx.lifecycle.C0235e;
import androidx.lifecycle.T;
import com.onesignal.OneSignal;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.permissions.impl.RequestPermissionService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.InterfaceC0428e;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class PermissionsViewModel extends T {
    public static final Companion Companion = new Companion(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private final s _shouldFinish;
    private final s _waiting;
    private String androidPermissionString;
    private String permissionRequestType;
    private final u shouldFinish;
    private final u waiting;
    private final InterfaceC0428e requestPermissionService$delegate = AbstractC0169a.A(PermissionsViewModel$requestPermissionService$2.INSTANCE);
    private final InterfaceC0428e preferenceService$delegate = AbstractC0169a.A(PermissionsViewModel$preferenceService$2.INSTANCE);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public PermissionsViewModel() {
        Boolean bool = Boolean.FALSE;
        w wVar = new w(bool);
        this._shouldFinish = wVar;
        this.shouldFinish = new t(wVar);
        w wVar2 = new w(bool);
        this._waiting = wVar2;
        this.waiting = new t(wVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeCallback(boolean z, boolean z5) {
        v vVar;
        String str = this.permissionRequestType;
        if (str != null) {
            IRequestPermissionService.PermissionCallback callback = getRequestPermissionService().getCallback(str);
            if (callback == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: ".concat(str));
            }
            if (z) {
                callback.onAccept();
            } else {
                callback.onReject(z5);
            }
            vVar = v.f5689a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            Logging.error$default("PermissionsViewModel: Cannot resolve callback because permissionRequestType is null. Ending permission flow.", null, 2, null);
            s sVar = this._shouldFinish;
            Boolean bool = Boolean.TRUE;
            w wVar = (w) sVar;
            wVar.getClass();
            wVar.c(null, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPreferencesService getPreferenceService() {
        return (IPreferencesService) this.preferenceService$delegate.getValue();
    }

    private final RequestPermissionService getRequestPermissionService() {
        return (RequestPermissionService) this.requestPermissionService$delegate.getValue();
    }

    public static /* synthetic */ void onRequestPermissionsResult$default(PermissionsViewModel permissionsViewModel, String[] strArr, int[] iArr, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        permissionsViewModel.onRequestPermissionsResult(strArr, iArr, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowSettings(String str, boolean z) {
        if (!getRequestPermissionService().getFallbackToSettings()) {
            return false;
        }
        if (getRequestPermissionService().getShouldShowRequestPermissionRationaleBeforeRequest() && !z) {
            getPreferenceService().saveBool("OneSignal", o.i(PreferenceOneSignalKeys.PREFS_OS_USER_RESOLVED_PERMISSION_PREFIX, str), Boolean.TRUE);
            return false;
        }
        Boolean bool = getPreferenceService().getBool("OneSignal", o.i(PreferenceOneSignalKeys.PREFS_OS_USER_RESOLVED_PERMISSION_PREFIX, str), Boolean.FALSE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String getPermissionRequestType() {
        return this.permissionRequestType;
    }

    public final u getShouldFinish() {
        return this.shouldFinish;
    }

    public final u getWaiting() {
        return this.waiting;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialize(Activity activity, String str, String str2, InterfaceC1218d interfaceC1218d) {
        PermissionsViewModel$initialize$1 permissionsViewModel$initialize$1;
        Object obj;
        int i2;
        PermissionsViewModel permissionsViewModel;
        if (interfaceC1218d instanceof PermissionsViewModel$initialize$1) {
            permissionsViewModel$initialize$1 = (PermissionsViewModel$initialize$1) interfaceC1218d;
            int i3 = permissionsViewModel$initialize$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                permissionsViewModel$initialize$1.label = i3 - Integer.MIN_VALUE;
                obj = permissionsViewModel$initialize$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = permissionsViewModel$initialize$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    permissionsViewModel$initialize$1.L$0 = this;
                    permissionsViewModel$initialize$1.L$1 = str;
                    permissionsViewModel$initialize$1.L$2 = str2;
                    permissionsViewModel$initialize$1.label = 1;
                    obj = OneSignal.initWithContext(activity, permissionsViewModel$initialize$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    permissionsViewModel = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) permissionsViewModel$initialize$1.L$2;
                    str = (String) permissionsViewModel$initialize$1.L$1;
                    permissionsViewModel = (PermissionsViewModel) permissionsViewModel$initialize$1.L$0;
                    g.y(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    s sVar = permissionsViewModel._shouldFinish;
                    Boolean bool = Boolean.TRUE;
                    w wVar = (w) sVar;
                    wVar.getClass();
                    wVar.c(null, bool);
                    return Boolean.FALSE;
                }
                if (str != null && str2 != null) {
                    permissionsViewModel.permissionRequestType = str;
                    permissionsViewModel.androidPermissionString = str2;
                    return Boolean.TRUE;
                }
                s sVar2 = permissionsViewModel._shouldFinish;
                Boolean bool2 = Boolean.TRUE;
                w wVar2 = (w) sVar2;
                wVar2.getClass();
                wVar2.c(null, bool2);
                return Boolean.FALSE;
            }
        }
        permissionsViewModel$initialize$1 = new PermissionsViewModel$initialize$1(this, interfaceC1218d);
        obj = permissionsViewModel$initialize$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = permissionsViewModel$initialize$1.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // androidx.lifecycle.T
    public void onCleared() {
    }

    public final void onRequestPermissionsResult(String[] permissions, int[] grantResults, boolean z) {
        i.e(permissions, "permissions");
        i.e(grantResults, "grantResults");
        s sVar = this._waiting;
        Boolean bool = Boolean.FALSE;
        w wVar = (w) sVar;
        wVar.getClass();
        wVar.c(null, bool);
        InterfaceC0022w interfaceC0022w = (InterfaceC0022w) getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (interfaceC0022w == null) {
            n0 c2 = AbstractC0024y.c();
            d dVar = E.f459a;
            interfaceC0022w = (InterfaceC0022w) setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0235e(AbstractC1341c.A(c2, I4.o.f1316a.f660f)));
        }
        AbstractC0024y.n(interfaceC0022w, null, 0, new PermissionsViewModel$onRequestPermissionsResult$1(permissions, grantResults, this, z, null), 3);
    }

    public final void recordRationaleState(boolean z) {
        getRequestPermissionService().setShouldShowRequestPermissionRationaleBeforeRequest(z);
    }

    public final void resetWaitingState() {
        s sVar = this._waiting;
        Boolean bool = Boolean.FALSE;
        w wVar = (w) sVar;
        wVar.getClass();
        wVar.c(null, bool);
    }

    public final boolean shouldRequestPermission() {
        w wVar = (w) this._waiting;
        wVar.getClass();
        C0051a c0051a = H4.t.f1201a;
        Object obj = w.f1114e.get(wVar);
        if (obj == c0051a) {
            obj = null;
        }
        if (((Boolean) obj).booleanValue()) {
            return false;
        }
        s sVar = this._waiting;
        Boolean bool = Boolean.TRUE;
        w wVar2 = (w) sVar;
        wVar2.getClass();
        wVar2.c(null, bool);
        return true;
    }
}
