package com.onesignal.core.internal.permissions;

import android.app.Activity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.onesignal.OneSignal;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.permissions.impl.RequestPermissionService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.debug.internal.logging.Logging;
import io.opentelemetry.semconv.JvmAttributes;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PermissionsViewModel.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 62\u00020\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0002J*\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u001fH\u0014J+\u0010)\u001a\u00020\u001f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u0005¢\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020\u001fJ\u0006\u00103\u001a\u00020\u0005J\u0018\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u00067"}, d2 = {"Lcom/onesignal/core/internal/permissions/PermissionsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_shouldFinish", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_waiting", "androidPermissionString", "", "<set-?>", "permissionRequestType", "getPermissionRequestType", "()Ljava/lang/String;", "preferenceService", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "getPreferenceService", "()Lcom/onesignal/core/internal/preferences/IPreferencesService;", "preferenceService$delegate", "Lkotlin/Lazy;", "requestPermissionService", "Lcom/onesignal/core/internal/permissions/impl/RequestPermissionService;", "getRequestPermissionService", "()Lcom/onesignal/core/internal/permissions/impl/RequestPermissionService;", "requestPermissionService$delegate", "shouldFinish", "Lkotlinx/coroutines/flow/StateFlow;", "getShouldFinish", "()Lkotlinx/coroutines/flow/StateFlow;", JvmAttributes.JvmThreadStateValues.WAITING, "getWaiting", "executeCallback", "", "granted", "showSettings", "initialize", "activity", "Landroid/app/Activity;", "permissionType", "androidPermission", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "shouldShowRationaleAfter", "([Ljava/lang/String;[IZ)V", "recordRationaleState", "shouldShowRationale", "resetWaitingState", "shouldRequestPermission", "shouldShowSettings", "permission", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionsViewModel extends ViewModel {
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private final MutableStateFlow<Boolean> _shouldFinish;
    private final MutableStateFlow<Boolean> _waiting;
    private String androidPermissionString;
    private String permissionRequestType;
    private final StateFlow<Boolean> shouldFinish;
    private final StateFlow<Boolean> waiting;

    /* renamed from: requestPermissionService$delegate, reason: from kotlin metadata */
    private final Lazy requestPermissionService = LazyKt.lazy(new Function0<RequestPermissionService>() { // from class: com.onesignal.core.internal.permissions.PermissionsViewModel$requestPermissionService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RequestPermissionService invoke() {
            return (RequestPermissionService) OneSignal.INSTANCE.getServices().getService(RequestPermissionService.class);
        }
    });

    /* renamed from: preferenceService$delegate, reason: from kotlin metadata */
    private final Lazy preferenceService = LazyKt.lazy(new Function0<IPreferencesService>() { // from class: com.onesignal.core.internal.permissions.PermissionsViewModel$preferenceService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final IPreferencesService invoke() {
            return (IPreferencesService) OneSignal.INSTANCE.getServices().getService(IPreferencesService.class);
        }
    });

    public PermissionsViewModel() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._shouldFinish = MutableStateFlow;
        this.shouldFinish = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._waiting = MutableStateFlow2;
        this.waiting = FlowKt.asStateFlow(MutableStateFlow2);
    }

    private final RequestPermissionService getRequestPermissionService() {
        return (RequestPermissionService) this.requestPermissionService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPreferencesService getPreferenceService() {
        return (IPreferencesService) this.preferenceService.getValue();
    }

    public final StateFlow<Boolean> getShouldFinish() {
        return this.shouldFinish;
    }

    public final StateFlow<Boolean> getWaiting() {
        return this.waiting;
    }

    public final String getPermissionRequestType() {
        return this.permissionRequestType;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialize(Activity activity, String str, String str2, Continuation<? super Boolean> continuation) {
        PermissionsViewModel$initialize$1 permissionsViewModel$initialize$1;
        Object obj;
        int i;
        PermissionsViewModel permissionsViewModel;
        if (continuation instanceof PermissionsViewModel$initialize$1) {
            permissionsViewModel$initialize$1 = (PermissionsViewModel$initialize$1) continuation;
            if ((permissionsViewModel$initialize$1.label & Integer.MIN_VALUE) != 0) {
                permissionsViewModel$initialize$1.label -= Integer.MIN_VALUE;
                obj = permissionsViewModel$initialize$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = permissionsViewModel$initialize$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    permissionsViewModel$initialize$1.L$0 = this;
                    permissionsViewModel$initialize$1.L$1 = str;
                    permissionsViewModel$initialize$1.L$2 = str2;
                    permissionsViewModel$initialize$1.label = 1;
                    obj = OneSignal.initWithContext(activity, permissionsViewModel$initialize$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    permissionsViewModel = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) permissionsViewModel$initialize$1.L$2;
                    str = (String) permissionsViewModel$initialize$1.L$1;
                    permissionsViewModel = (PermissionsViewModel) permissionsViewModel$initialize$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    permissionsViewModel._shouldFinish.setValue(Boxing.boxBoolean(true));
                    return Boxing.boxBoolean(false);
                }
                if (str == null || str2 == null) {
                    permissionsViewModel._shouldFinish.setValue(Boxing.boxBoolean(true));
                    return Boxing.boxBoolean(false);
                }
                permissionsViewModel.permissionRequestType = str;
                permissionsViewModel.androidPermissionString = str2;
                return Boxing.boxBoolean(true);
            }
        }
        permissionsViewModel$initialize$1 = new PermissionsViewModel$initialize$1(this, continuation);
        obj = permissionsViewModel$initialize$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = permissionsViewModel$initialize$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final boolean shouldRequestPermission() {
        if (this._waiting.getValue().booleanValue()) {
            return false;
        }
        this._waiting.setValue(true);
        return true;
    }

    public final void resetWaitingState() {
        this._waiting.setValue(false);
    }

    public final void recordRationaleState(boolean shouldShowRationale) {
        getRequestPermissionService().setShouldShowRequestPermissionRationaleBeforeRequest(shouldShowRationale);
    }

    public static /* synthetic */ void onRequestPermissionsResult$default(PermissionsViewModel permissionsViewModel, String[] strArr, int[] iArr, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        permissionsViewModel.onRequestPermissionsResult(strArr, iArr, z);
    }

    public final void onRequestPermissionsResult(String[] permissions, int[] grantResults, boolean shouldShowRationaleAfter) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this._waiting.setValue(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PermissionsViewModel$onRequestPermissionsResult$1(permissions, grantResults, this, shouldShowRationaleAfter, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeCallback(boolean granted, boolean showSettings) {
        Unit unit;
        String str = this.permissionRequestType;
        if (str != null) {
            IRequestPermissionService.PermissionCallback callback = getRequestPermissionService().getCallback(str);
            if (callback != null) {
                if (granted) {
                    callback.onAccept();
                } else {
                    callback.onReject(showSettings);
                }
                unit = Unit.INSTANCE;
            } else {
                throw new RuntimeException("Missing handler for permissionRequestType: " + str);
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            Logging.error$default("PermissionsViewModel: Cannot resolve callback because permissionRequestType is null. Ending permission flow.", null, 2, null);
            this._shouldFinish.setValue(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowSettings(String permission, boolean shouldShowRationaleAfter) {
        if (!getRequestPermissionService().getFallbackToSettings()) {
            return false;
        }
        String str = PreferenceOneSignalKeys.PREFS_OS_USER_RESOLVED_PERMISSION_PREFIX + permission;
        boolean shouldShowRequestPermissionRationaleBeforeRequest = getRequestPermissionService().getShouldShowRequestPermissionRationaleBeforeRequest();
        if (shouldShowRequestPermissionRationaleBeforeRequest && !shouldShowRationaleAfter) {
            getPreferenceService().saveBool("OneSignal", str, true);
            return false;
        }
        Boolean bool = getPreferenceService().getBool("OneSignal", PreferenceOneSignalKeys.PREFS_OS_PROMPTED_PERMISSION_PREFIX + permission, false);
        if (!(bool != null ? bool.booleanValue() : false) || shouldShowRequestPermissionRationaleBeforeRequest || shouldShowRationaleAfter) {
            Boolean bool2 = getPreferenceService().getBool("OneSignal", str, false);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return false;
        }
        getPreferenceService().saveBool("OneSignal", str, true);
        return true;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
    }
}
