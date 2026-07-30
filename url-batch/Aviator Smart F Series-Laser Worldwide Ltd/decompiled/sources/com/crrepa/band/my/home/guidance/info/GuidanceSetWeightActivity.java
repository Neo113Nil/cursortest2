package com.crrepa.band.my.home.guidance.info;

import android.content.Intent;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGuidanceSetWeightBinding;
import com.crrepa.band.my.health.widgets.ScaleView;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class GuidanceSetWeightActivity extends BaseVBActivity<ActivityGuidanceSetWeightBinding> {
    private void initOnclickListener() {
        ((ActivityGuidanceSetWeightBinding) this.binding).ivBack.setVisibility(isTaskRoot() ? 8 : 0);
        ((ActivityGuidanceSetWeightBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetWeightActivity.this.lambda$initOnclickListener$1(view);
            }
        });
        ((ActivityGuidanceSetWeightBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetWeightActivity.this.lambda$initOnclickListener$2(view);
            }
        });
    }

    private void initScaleView() {
        ((ActivityGuidanceSetWeightBinding) this.binding).scale.setMinIndex(UserWeightProvider.getCurrentMinWeight());
        ((ActivityGuidanceSetWeightBinding) this.binding).scale.setMaxIndex(UserWeightProvider.getCurrentMaxWeight());
        ((ActivityGuidanceSetWeightBinding) this.binding).scale.setOnScaleChangeListener(new ScaleView.b() { // from class: com.crrepa.band.my.home.guidance.info.s
            @Override // com.crrepa.band.my.health.widgets.ScaleView.b
            public final void OnChange(double d8) {
                GuidanceSetWeightActivity.this.lambda$initScaleView$3(d8);
            }
        });
    }

    private void initTopView() {
        ((ActivityGuidanceSetWeightBinding) this.binding).includeTop.pb.setProgress(80);
        ((ActivityGuidanceSetWeightBinding) this.binding).includeTop.tvProgress.setText("4/5");
        ((ActivityGuidanceSetWeightBinding) this.binding).includeTop.tvTips.setText(R.string.guidance_tips_keep_it_up);
        ((ActivityGuidanceSetWeightBinding) this.binding).includeTop.tvSkip.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetWeightActivity.this.lambda$initTopView$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$1(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$2(View view) {
        UserWeightProvider.setUserWeight(BandUnitSystemProvider.getUnitSystem(), ((float) ((ActivityGuidanceSetWeightBinding) this.binding).scale.getCurrentIndex()) - ((ActivityGuidanceSetWeightBinding) this.binding).scale.getMinIndex());
        startActivity(new Intent(this, (Class<?>) GuidanceSetStepLengthActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScaleView$3(double d8) {
        ((ActivityGuidanceSetWeightBinding) this.binding).tvValue.setText(com.moyoung.dafit.module.common.utils.n.formatWeight(d8, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTopView$0(View view) {
        s0.logEvent("用户点击跳过首次引导个人信息页面", "step_type", "体重");
        com.crrepa.band.my.home.guidance.a.getInstance().firstStartPermissionActivity(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.crrepa.band.my.home.guidance.b.setGuidanceState(4);
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
        float userWeight = UserWeightProvider.getUserWeight();
        ((ActivityGuidanceSetWeightBinding) this.binding).scale.setNowIndex(userWeight);
        ((ActivityGuidanceSetWeightBinding) this.binding).tvValue.setText(com.moyoung.dafit.module.common.utils.n.formatWeight(userWeight, 1));
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        sb.append(getString(BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.weight_unit_kg : R.string.weight_unit_lb));
        sb.append(" )");
        ((ActivityGuidanceSetWeightBinding) this.binding).tvUnit.setText(sb.toString());
    }
}
