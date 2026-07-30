package com.crrepa.band.my.home.guidance.privacy;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogRemindAgreePrivacyPolicyBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class RemindAgreeDialog extends BaseVBDialog<DialogRemindAgreePrivacyPolicyBinding> {
    private a onDisagreeListener;

    public interface a {
    }

    public RemindAgreeDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        logPrivacyPolicyEvent("不同意");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        logPrivacyPolicyEvent("同意");
        com.crrepa.band.my.home.guidance.b.agreePrivacyPolicy();
        com.crrepa.band.my.home.guidance.a.getInstance().startGuidanceActivity(getContext());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ((DialogRemindAgreePrivacyPolicyBinding) this.binding).btnDisagree.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemindAgreeDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogRemindAgreePrivacyPolicyBinding) this.binding).btnAgree.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemindAgreeDialog.this.lambda$initBinding$1(view);
            }
        });
        setShowBottomWithAnim();
        b.initPrivacyTextView(((DialogRemindAgreePrivacyPolicyBinding) this.binding).tvContent, getContext().getString(R.string.guidance_remind_dialog_content, getContext().getString(R.string.app_name)), getContext().getString(R.string.guidance_remind_dialog_privacy_policy), getContext().getString(R.string.guidance_remind_dialog_terms_of_service));
    }

    public void logPrivacyPolicyEvent(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("result", str);
        bundle.putString("trigger_scene", "弹窗");
        s0.logEvent("点击_隐私政策与服务条款", bundle);
    }

    public void setOnDisagreeListener(a aVar) {
    }
}
