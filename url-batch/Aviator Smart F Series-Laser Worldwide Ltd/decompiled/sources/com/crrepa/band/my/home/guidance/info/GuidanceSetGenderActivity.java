package com.crrepa.band.my.home.guidance.info;

import android.content.Intent;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGuidanceSetGenderBinding;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class GuidanceSetGenderActivity extends BaseVBActivity<ActivityGuidanceSetGenderBinding> {
    private void initOnclickListener() {
        ((ActivityGuidanceSetGenderBinding) this.binding).llMale.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetGenderActivity.this.lambda$initOnclickListener$1(view);
            }
        });
        ((ActivityGuidanceSetGenderBinding) this.binding).llFemale.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetGenderActivity.this.lambda$initOnclickListener$2(view);
            }
        });
        ((ActivityGuidanceSetGenderBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetGenderActivity.this.lambda$initOnclickListener$3(view);
            }
        });
    }

    private void initTopView() {
        ((ActivityGuidanceSetGenderBinding) this.binding).includeTop.pb.setProgress(20);
        ((ActivityGuidanceSetGenderBinding) this.binding).includeTop.tvProgress.setText("1/5");
        ((ActivityGuidanceSetGenderBinding) this.binding).includeTop.tvTips.setText(R.string.guidance_tips_great_start);
        ((ActivityGuidanceSetGenderBinding) this.binding).includeTop.tvSkip.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetGenderActivity.this.lambda$initTopView$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$1(View view) {
        ((ActivityGuidanceSetGenderBinding) this.binding).llMale.setSelected(true);
        ((ActivityGuidanceSetGenderBinding) this.binding).llFemale.setSelected(false);
        ((ActivityGuidanceSetGenderBinding) this.binding).tvMale.setSelected(true);
        ((ActivityGuidanceSetGenderBinding) this.binding).tvFemale.setSelected(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$2(View view) {
        ((ActivityGuidanceSetGenderBinding) this.binding).llMale.setSelected(false);
        ((ActivityGuidanceSetGenderBinding) this.binding).llFemale.setSelected(true);
        ((ActivityGuidanceSetGenderBinding) this.binding).tvMale.setSelected(false);
        ((ActivityGuidanceSetGenderBinding) this.binding).tvFemale.setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$3(View view) {
        if (((ActivityGuidanceSetGenderBinding) this.binding).llMale.isSelected()) {
            UserGenderProvider.setUserGender(1);
        } else if (((ActivityGuidanceSetGenderBinding) this.binding).llFemale.isSelected()) {
            UserGenderProvider.setUserGender(0);
        }
        startActivity(new Intent(this, (Class<?>) GuidanceSetAgeActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTopView$0(View view) {
        s0.logEvent("用户点击跳过首次引导个人信息页面", "step_type", "性别");
        com.crrepa.band.my.home.guidance.a.getInstance().firstStartPermissionActivity(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.crrepa.band.my.home.guidance.b.setGuidanceState(1);
        initTopView();
        initOnclickListener();
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
        boolean z7 = UserGenderProvider.getUsetGender() == 1;
        ((ActivityGuidanceSetGenderBinding) this.binding).llMale.setSelected(z7);
        ((ActivityGuidanceSetGenderBinding) this.binding).llFemale.setSelected(!z7);
        ((ActivityGuidanceSetGenderBinding) this.binding).tvMale.setSelected(z7);
        ((ActivityGuidanceSetGenderBinding) this.binding).tvFemale.setSelected(!z7);
    }
}
