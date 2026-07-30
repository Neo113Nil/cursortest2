package com.crrepa.band.my.device.setting.quickresponse;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityQuickResponseSettingBinding;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.model.band.provider.BandQuickResponseProvider;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.instructions.utils.InstructionsType;
import java.util.List;

/* loaded from: classes2.dex */
public class QuickResponseSettingActivity extends BaseRequestPermissionActivity<ActivityQuickResponseSettingBinding> implements h {
    private final g presenter = new g();
    private final ResponseMessageAdapter responseMessageAdapter = new ResponseMessageAdapter();
    private boolean requestSmsPermission = false;

    class a implements MaterialDialog.l {
        a() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            QuickResponseSettingActivity.this.requestSmsPermission = true;
            if (q7.b.hasSelfPermissions(QuickResponseSettingActivity.this, "android.permission.SEND_SMS")) {
                return;
            }
            QuickResponseSettingActivity.this.showSendMsgPermissionDialog();
        }
    }

    class b implements PermissionDescriptionDialog.b {
        b() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("短信", true);
            f.needSendSmsPermissionSuccessWithPermissionCheck(QuickResponseSettingActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("短信", false);
            QuickResponseSettingActivity quickResponseSettingActivity = QuickResponseSettingActivity.this;
            r0.showLong(quickResponseSettingActivity, quickResponseSettingActivity.getString(R.string.permission_sms_rationale));
            ((ActivityQuickResponseSettingBinding) ((BaseVBActivity) QuickResponseSettingActivity.this).binding).sbtnQuickResponse.setCheckedNoEvent(false);
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) QuickResponseSettingActivity.class);
    }

    private boolean hasNullMessage() {
        List<String> data = this.responseMessageAdapter.getData();
        for (int i8 = 0; i8 < data.size(); i8++) {
            if (data.get(i8).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSmsPermissions() {
        return q7.b.hasSelfPermissions(this, "android.permission.SEND_SMS");
    }

    private void initResponseList() {
        ((ActivityQuickResponseSettingBinding) this.binding).rcvResponseList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityQuickResponseSettingBinding) this.binding).rcvResponseList.setAdapter(this.responseMessageAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(CompoundButton compoundButton, boolean z7) {
        if (z7) {
            showSmsPermissionsDialog();
        } else {
            renderQuickResponseState(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        this.responseMessageAdapter.setNewData(BandQuickResponseProvider.getDefaultResponseMessageList(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSmsPermissionsDialog$3(MaterialDialog materialDialog, DialogAction dialogAction) {
        showSmsChargesDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSmsPermissionsDialog$4(MaterialDialog materialDialog, DialogAction dialogAction) {
        renderQuickResponseState(false);
    }

    private void setTitle() {
        ((ActivityQuickResponseSettingBinding) this.binding).includedTitle.tvTitle.setText(getString(R.string.call_rejection_setting));
        ((ActivityQuickResponseSettingBinding) this.binding).includedTitle.ivBack.setImageResource(R.drawable.selector_title_back);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSendMsgPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_message).setTitle(R.string.permission_sms_title).setContent(R.string.permission_sms_content).setOnClickListener(new b()).build(this).show();
    }

    private void showSmsChargesDialog() {
        new MaterialDialog.e(this).content(R.string.call_rejection_sms_expenses_note).positiveText(R.string.i_kow).onPositive(new a()).show();
    }

    private void showSmsPermissionsDialog() {
        if (hasSmsPermissions()) {
            renderQuickResponseState(true);
        } else {
            new MaterialDialog.e(this).content(R.string.call_rejection_sms_permission_desc).positiveText(R.string.open_now).negativeText(R.string.not_yet).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.setting.quickresponse.b
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    QuickResponseSettingActivity.this.lambda$showSmsPermissionsDialog$3(materialDialog, dialogAction);
                }
            }).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.setting.quickresponse.c
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    QuickResponseSettingActivity.this.lambda$showSmsPermissionsDialog$4(materialDialog, dialogAction);
                }
            }).show();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        setTitle();
        initResponseList();
        ((ActivityQuickResponseSettingBinding) this.binding).sbtnQuickResponse.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.quickresponse.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                QuickResponseSettingActivity.this.lambda$initBinding$0(compoundButton, z7);
            }
        });
        this.presenter.getQuickResponseSetting(this);
        com.moyoung.instructions.c.hook(InstructionsType.QUICK_REPLY, findViewById(R.id.tv_quick_response_setting_desc));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityQuickResponseSettingBinding) this.binding).includedTitle.ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.quickresponse.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickResponseSettingActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityQuickResponseSettingBinding) this.binding).btnResetResponseList.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.quickresponse.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickResponseSettingActivity.this.lambda$initOnClickListener$2(view);
            }
        });
    }

    @SuppressLint({"InlinedApi"})
    void needSendSmsPermissionSuccess() {
        com.crrepa.band.my.home.guidance.c.systemPermission("短信", true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        boolean isChecked = ((ActivityQuickResponseSettingBinding) this.binding).sbtnQuickResponse.isChecked();
        if (isChecked && hasNullMessage()) {
            r0.showLong(this, getString(R.string.sms_can_not_empty));
            return;
        }
        this.presenter.saveResponseMessage(isChecked, this.responseMessageAdapter.getData());
        super.onBackPressedSupport();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        f.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        if (this.requestSmsPermission) {
            renderQuickResponseState(hasSmsPermissions());
        }
    }

    @Override // com.crrepa.band.my.device.setting.quickresponse.h
    public void renderDefaultResponseList(List<String> list) {
        this.responseMessageAdapter.setNewData(list);
    }

    @Override // com.crrepa.band.my.device.setting.quickresponse.h
    public void renderQuickResponseState(boolean z7) {
        ((ActivityQuickResponseSettingBinding) this.binding).sbtnQuickResponse.setCheckedNoEvent(z7);
        ((ActivityQuickResponseSettingBinding) this.binding).cardResponseList.setVisibility(z7 ? 0 : 8);
    }

    @Override // com.crrepa.band.my.device.setting.quickresponse.h
    public void renderResponseMessage(String str) {
        com.orhanobut.logger.f.d("renderResponseMessage: " + str);
        this.responseMessageAdapter.addData((ResponseMessageAdapter) str);
    }

    void showDeniedForSendMsg() {
        com.crrepa.band.my.home.guidance.c.systemPermission("短信", false);
        r0.showLong(this, getString(R.string.permission_sms_rationale));
        ((ActivityQuickResponseSettingBinding) this.binding).sbtnQuickResponse.setCheckedNoEvent(false);
    }

    void showNeverAskForSendMsg() {
        c0.jumpAppDetailsSetting(this);
    }
}
