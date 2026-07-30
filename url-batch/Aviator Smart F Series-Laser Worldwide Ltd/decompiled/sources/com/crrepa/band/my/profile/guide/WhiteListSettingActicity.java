package com.crrepa.band.my.profile.guide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.WebActivity;
import com.crrepa.band.my.databinding.ActivityWhitelistSettingBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class WhiteListSettingActicity extends BaseVBActivity<ActivityWhitelistSettingBinding> {
    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) WhiteListSettingActicity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        startActivity(WebActivity.getCallingIntent(this, getString(R.string.background_run_guide), String.format("https://api.moyoung.com/instruction?app_name=%s&tag=img", getString(R.string.app_name))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        showCompleteDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCompleteDialog$3(MaterialDialog materialDialog, DialogAction dialogAction) {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    private void showCompleteDialog() {
        new MaterialDialog.e(this).title(R.string.whitelist_setting_complete_hint).negativeText(R.string.cancel).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.profile.guide.a
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                materialDialog.dismiss();
            }
        }).positiveText(R.string.btn_continue).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.profile.guide.b
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                WhiteListSettingActicity.this.lambda$showCompleteDialog$3(materialDialog, dialogAction);
            }
        }).show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ((ActivityWhitelistSettingBinding) this.binding).btnWhitelistToset.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.guide.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WhiteListSettingActicity.this.lambda$onCreate$0(view);
            }
        });
        ((ActivityWhitelistSettingBinding) this.binding).btnWhitelistDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.guide.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WhiteListSettingActicity.this.lambda$onCreate$1(view);
            }
        });
    }
}
