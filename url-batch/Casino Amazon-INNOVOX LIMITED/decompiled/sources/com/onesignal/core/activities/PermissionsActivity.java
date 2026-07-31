package com.onesignal.core.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.R;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: PermissionsActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\nH\u0014J+\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\u0012\u0010 \u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Lcom/onesignal/core/activities/PermissionsActivity;", "Landroidx/activity/ComponentActivity;", "()V", "viewModel", "Lcom/onesignal/core/internal/permissions/PermissionsViewModel;", "getViewModel", "()Lcom/onesignal/core/internal/permissions/PermissionsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "finishActivity", "", "handleBundleParams", "extras", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "savedInstanceState", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestPermission", "androidPermissionString", "reregisterCallbackHandlers", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionsActivity extends ComponentActivity {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public PermissionsActivity() {
        final PermissionsActivity permissionsActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PermissionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.onesignal.core.activities.PermissionsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.onesignal.core.activities.PermissionsActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.onesignal.core.activities.PermissionsActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = permissionsActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermissionsViewModel getViewModel() {
        return (PermissionsViewModel) this.viewModel.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getExtras() == null) {
            finishActivity();
            return;
        }
        PermissionsActivity permissionsActivity = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(permissionsActivity), null, null, new PermissionsActivity$onCreate$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(permissionsActivity), null, null, new PermissionsActivity$onCreate$2(this, null), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PermissionsActivity$onNewIntent$1(this, intent, null), 3, null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        getViewModel().resetWaitingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivity() {
        finish();
        overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleBundleParams(Bundle bundle, Continuation<? super Unit> continuation) {
        PermissionsActivity$handleBundleParams$1 permissionsActivity$handleBundleParams$1;
        Object obj;
        int i;
        String string;
        PermissionsActivity permissionsActivity;
        if (continuation instanceof PermissionsActivity$handleBundleParams$1) {
            permissionsActivity$handleBundleParams$1 = (PermissionsActivity$handleBundleParams$1) continuation;
            if ((permissionsActivity$handleBundleParams$1.label & Integer.MIN_VALUE) != 0) {
                permissionsActivity$handleBundleParams$1.label -= Integer.MIN_VALUE;
                obj = permissionsActivity$handleBundleParams$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = permissionsActivity$handleBundleParams$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (bundle != null) {
                        reregisterCallbackHandlers(bundle);
                        String string2 = bundle.getString(PermissionsViewModel.INTENT_EXTRA_PERMISSION_TYPE);
                        string = bundle.getString(PermissionsViewModel.INTENT_EXTRA_ANDROID_PERMISSION_STRING);
                        permissionsActivity$handleBundleParams$1.L$0 = this;
                        permissionsActivity$handleBundleParams$1.L$1 = string;
                        permissionsActivity$handleBundleParams$1.label = 1;
                        obj = getViewModel().initialize(this, string2, string, permissionsActivity$handleBundleParams$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        permissionsActivity = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                string = (String) permissionsActivity$handleBundleParams$1.L$1;
                permissionsActivity = (PermissionsActivity) permissionsActivity$handleBundleParams$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    permissionsActivity.finishActivity();
                } else if (string != null) {
                    permissionsActivity.requestPermission(string);
                }
                return Unit.INSTANCE;
            }
        }
        permissionsActivity$handleBundleParams$1 = new PermissionsActivity$handleBundleParams$1(this, continuation);
        obj = permissionsActivity$handleBundleParams$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = permissionsActivity$handleBundleParams$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    private final void reregisterCallbackHandlers(Bundle extras) {
        Intrinsics.checkNotNull(extras);
        String string = extras.getString(PermissionsViewModel.INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    private final void requestPermission(String androidPermissionString) {
        if (getViewModel().shouldRequestPermission()) {
            PermissionsActivity permissionsActivity = this;
            getViewModel().recordRationaleState(ActivityCompat.shouldShowRequestPermissionRationale(permissionsActivity, androidPermissionString));
            ActivityCompat.requestPermissions(permissionsActivity, new String[]{androidPermissionString}, 2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 2) {
            getViewModel().onRequestPermissionsResult(permissions, grantResults, permissions.length == 0 ? false : ActivityCompat.shouldShowRequestPermissionRationale(this, permissions[0]));
        }
    }
}
