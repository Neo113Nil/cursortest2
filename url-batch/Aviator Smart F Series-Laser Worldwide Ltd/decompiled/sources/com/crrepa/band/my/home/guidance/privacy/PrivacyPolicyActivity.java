package com.crrepa.band.my.home.guidance.privacy;

import android.os.Bundle;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityPrivacyPolicyBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class PrivacyPolicyActivity extends BaseVBActivity<ActivityPrivacyPolicyBinding> {
    private void initView() {
        b.initPrivacyTextView(((ActivityPrivacyPolicyBinding) this.binding).tvDescription, getString(R.string.guidance_privacy_policy_content, getString(R.string.app_name)), getString(R.string.guidance_privacy_policy), getString(R.string.guidance_terms_of_service));
        ((ActivityPrivacyPolicyBinding) this.binding).tvAgree.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyPolicyActivity.this.lambda$initView$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        logPrivacyPolicyEvent("同意");
        com.crrepa.band.my.home.guidance.b.agreePrivacyPolicy();
        com.crrepa.band.my.home.guidance.a.getInstance().startGuidanceActivity(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setTranslucent(this, 0);
        k0.setLightMode(this);
        initView();
    }

    public void logPrivacyPolicyEvent(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("result", str);
        bundle.putString("trigger_scene", "引导页");
        s0.logEvent("点击_隐私政策与服务条款", bundle);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isTaskRoot()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "用户同意隐私条款页面");
    }
}
