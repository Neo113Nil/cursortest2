package com.crrepa.band.my.home.guidance.info;

import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGuidanceSetStepLenghtBinding;
import com.crrepa.band.my.health.widgets.ScaleView;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.user.provider.UserStepLengthProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class GuidanceSetStepLengthActivity extends BaseVBActivity<ActivityGuidanceSetStepLenghtBinding> {
    private void initOnclickListener() {
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).ivBack.setVisibility(isTaskRoot() ? 8 : 0);
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetStepLengthActivity.this.lambda$initOnclickListener$0(view);
            }
        });
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetStepLengthActivity.this.lambda$initOnclickListener$1(view);
            }
        });
    }

    private void initScaleView() {
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).scale.setMinIndex(UserStepLengthProvider.getMinStepLength());
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).scale.setMaxIndex(UserStepLengthProvider.getMaxStepLength());
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).scale.setTextFormat("%.0f");
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).scale.setOnScaleChangeListener(new ScaleView.b() { // from class: com.crrepa.band.my.home.guidance.info.m
            @Override // com.crrepa.band.my.health.widgets.ScaleView.b
            public final void OnChange(double d8) {
                GuidanceSetStepLengthActivity.this.lambda$initScaleView$2(d8);
            }
        });
    }

    private void initTopView() {
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).includeTop.pb.setProgress(100);
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).includeTop.tvProgress.setText("5/5");
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).includeTop.tvTips.setText(R.string.guidance_tips_continue);
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).includeTop.tvSkip.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$1(View view) {
        com.crrepa.band.my.home.guidance.a.getInstance().firstStartPermissionActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScaleView$2(double d8) {
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).tvValue.setText(String.valueOf((int) d8));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.crrepa.band.my.home.guidance.b.setGuidanceState(5);
        initTopView();
        initOnclickListener();
        initScaleView();
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
        int userStepLength = UserStepLengthProvider.getUserStepLength();
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).scale.setNowIndex(userStepLength);
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).tvValue.setText(String.valueOf(userStepLength));
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        sb.append(getString(BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.length_unit_cm : R.string.length_unit_in));
        sb.append(" )");
        ((ActivityGuidanceSetStepLenghtBinding) this.binding).tvUnit.setText(sb.toString());
    }
}
