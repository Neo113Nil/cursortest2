package com.moyoung.dafit.module.common.baseui;

import androidx.annotation.StringRes;
import androidx.viewbinding.ViewBinding;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.moyoung.dafit.module.common.utils.c0;

/* loaded from: classes4.dex */
public abstract class BaseRequestPermissionVBActivity<VB extends ViewBinding> extends BaseVBActivity<VB> {
    private MaterialDialog materialDialog;
    protected boolean requestDenied = false;
    protected boolean requestPermissionCompleted = true;

    public interface a {
        void a();
    }

    private boolean isDialogShowing() {
        MaterialDialog materialDialog = this.materialDialog;
        return materialDialog != null && materialDialog.isShowing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNeverAskDialog$4(MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        c0.jumpAppDetailsSetting(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNeverAskDialog$5(boolean z7, MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        if (z7) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showRationaleDialog$0(a aVar, MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showRationaleDialog$1(boolean z7, MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        if (z7) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showRationaleDialog$2(q7.a aVar, MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        aVar.proceed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.materialDialog != null) {
            com.orhanobut.logger.f.d("cancelDialog");
            this.materialDialog.dismiss();
        }
    }

    protected void showNeverAskDialog(@StringRes int i8, @StringRes int i9, @StringRes int i10) {
        showNeverAskDialog(i8, i9, i10, true);
    }

    protected void showRationaleDialog(@StringRes int i8, @StringRes int i9, @StringRes int i10, final boolean z7, final a aVar) {
        if (isDialogShowing()) {
            return;
        }
        MaterialDialog build = new MaterialDialog.e(this).content(i8).positiveText(i9).negativeText(i10).onPositive(new MaterialDialog.l(aVar) { // from class: com.moyoung.dafit.module.common.baseui.o
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                BaseRequestPermissionVBActivity.lambda$showRationaleDialog$0(null, materialDialog, dialogAction);
            }
        }).onNegative(new MaterialDialog.l() { // from class: com.moyoung.dafit.module.common.baseui.p
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                BaseRequestPermissionVBActivity.this.lambda$showRationaleDialog$1(z7, materialDialog, dialogAction);
            }
        }).cancelable(true).build();
        this.materialDialog = build;
        build.show();
    }

    protected void showNeverAskDialog(@StringRes int i8, @StringRes int i9, @StringRes int i10, final boolean z7) {
        if (isDialogShowing()) {
            return;
        }
        MaterialDialog build = new MaterialDialog.e(this).content(i8).positiveText(i9).negativeText(i10).onPositive(new MaterialDialog.l() { // from class: com.moyoung.dafit.module.common.baseui.m
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                BaseRequestPermissionVBActivity.this.lambda$showNeverAskDialog$4(materialDialog, dialogAction);
            }
        }).onNegative(new MaterialDialog.l() { // from class: com.moyoung.dafit.module.common.baseui.n
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                BaseRequestPermissionVBActivity.this.lambda$showNeverAskDialog$5(z7, materialDialog, dialogAction);
            }
        }).cancelable(false).build();
        this.materialDialog = build;
        build.show();
    }

    protected void showRationaleDialog(@StringRes int i8, @StringRes int i9, @StringRes int i10, final q7.a aVar) {
        if (isDialogShowing()) {
            return;
        }
        MaterialDialog build = new MaterialDialog.e(this).content(i8).positiveText(i9).negativeText(i10).onPositive(new MaterialDialog.l() { // from class: com.moyoung.dafit.module.common.baseui.k
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                BaseRequestPermissionVBActivity.lambda$showRationaleDialog$2(q7.a.this, materialDialog, dialogAction);
            }
        }).onNegative(new MaterialDialog.l() { // from class: com.moyoung.dafit.module.common.baseui.l
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                materialDialog.dismiss();
            }
        }).cancelable(false).build();
        this.materialDialog = build;
        build.show();
    }
}
