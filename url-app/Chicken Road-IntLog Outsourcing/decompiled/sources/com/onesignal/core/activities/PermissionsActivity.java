package com.onesignal.core.activities;

import B.d;
import B0.o;
import D4.AbstractC0024y;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.l;
import androidx.lifecycle.M;
import com.onesignal.core.R;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import e5.g;
import f4.InterfaceC0428e;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.t;
import l4.EnumC1260a;
import u.AbstractC1463d;

/* loaded from: classes.dex */
public final class PermissionsActivity extends l {
    private final InterfaceC0428e viewModel$delegate = new d(t.a(PermissionsViewModel.class), new PermissionsActivity$special$$inlined$viewModels$default$2(this), new PermissionsActivity$special$$inlined$viewModels$default$1(this), new PermissionsActivity$special$$inlined$viewModels$default$3(null, this));

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivity() {
        finish();
        overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermissionsViewModel getViewModel() {
        return (PermissionsViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleBundleParams(Bundle bundle, InterfaceC1218d interfaceC1218d) {
        PermissionsActivity$handleBundleParams$1 permissionsActivity$handleBundleParams$1;
        Object obj;
        int i2;
        String string;
        PermissionsActivity permissionsActivity;
        if (interfaceC1218d instanceof PermissionsActivity$handleBundleParams$1) {
            permissionsActivity$handleBundleParams$1 = (PermissionsActivity$handleBundleParams$1) interfaceC1218d;
            int i3 = permissionsActivity$handleBundleParams$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                permissionsActivity$handleBundleParams$1.label = i3 - Integer.MIN_VALUE;
                obj = permissionsActivity$handleBundleParams$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = permissionsActivity$handleBundleParams$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    if (bundle != null) {
                        reregisterCallbackHandlers(bundle);
                        String string2 = bundle.getString(PermissionsViewModel.INTENT_EXTRA_PERMISSION_TYPE);
                        string = bundle.getString(PermissionsViewModel.INTENT_EXTRA_ANDROID_PERMISSION_STRING);
                        PermissionsViewModel viewModel = getViewModel();
                        permissionsActivity$handleBundleParams$1.L$0 = this;
                        permissionsActivity$handleBundleParams$1.L$1 = string;
                        permissionsActivity$handleBundleParams$1.label = 1;
                        obj = viewModel.initialize(this, string2, string, permissionsActivity$handleBundleParams$1);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        permissionsActivity = this;
                    }
                    return v.f5689a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                string = (String) permissionsActivity$handleBundleParams$1.L$1;
                permissionsActivity = (PermissionsActivity) permissionsActivity$handleBundleParams$1.L$0;
                g.y(obj);
                if (((Boolean) obj).booleanValue()) {
                    permissionsActivity.finishActivity();
                } else if (string != null) {
                    permissionsActivity.requestPermission(string);
                }
                return v.f5689a;
            }
        }
        permissionsActivity$handleBundleParams$1 = new PermissionsActivity$handleBundleParams$1(this, interfaceC1218d);
        obj = permissionsActivity$handleBundleParams$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = permissionsActivity$handleBundleParams$1.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return v.f5689a;
    }

    private final void requestPermission(String str) {
        if (getViewModel().shouldRequestPermission()) {
            getViewModel().recordRationaleState(AbstractC1463d.c(this, str));
            AbstractC1463d.b(this, new String[]{str}, 2);
        }
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        i.b(bundle);
        String string = bundle.getString(PermissionsViewModel.INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(o.i("Could not find callback class for PermissionActivity: ", string));
        }
    }

    @Override // androidx.activity.l, u.AbstractActivityC1467h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            finishActivity();
        } else {
            AbstractC0024y.n(M.f(this), null, 0, new PermissionsActivity$onCreate$1(this, null), 3);
            AbstractC0024y.n(M.f(this), null, 0, new PermissionsActivity$onCreate$2(this, null), 3);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AlertDialogPrepromptForAndroidSettings.INSTANCE.dismissCurrentDialog();
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onNewIntent(Intent intent) {
        i.e(intent, "intent");
        super.onNewIntent(intent);
        AbstractC0024y.n(M.f(this), null, 0, new PermissionsActivity$onNewIntent$1(this, intent, null), 3);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        getViewModel().resetWaitingState();
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        i.e(permissions, "permissions");
        i.e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        if (i2 == 2) {
            getViewModel().onRequestPermissionsResult(permissions, grantResults, permissions.length != 0 ? AbstractC1463d.c(this, permissions[0]) : false);
        }
    }
}
