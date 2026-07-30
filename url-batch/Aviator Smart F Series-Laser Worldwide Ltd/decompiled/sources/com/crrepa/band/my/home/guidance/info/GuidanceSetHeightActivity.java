package com.crrepa.band.my.home.guidance.info;

import android.content.Intent;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGuidanceSetHeightBinding;
import com.crrepa.band.my.health.widgets.VerticalScaleView;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.user.provider.UserHeightProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class GuidanceSetHeightActivity extends BaseVBActivity<ActivityGuidanceSetHeightBinding> {
    private void initOnclickListener() {
        ((ActivityGuidanceSetHeightBinding) this.binding).ivBack.setVisibility(isTaskRoot() ? 8 : 0);
        ((ActivityGuidanceSetHeightBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetHeightActivity.this.lambda$initOnclickListener$1(view);
            }
        });
        ((ActivityGuidanceSetHeightBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetHeightActivity.this.lambda$initOnclickListener$2(view);
            }
        });
    }

    private void initScaleView() {
        ((ActivityGuidanceSetHeightBinding) this.binding).scale.setMinIndex(UserHeightProvider.getMinStepLength());
        ((ActivityGuidanceSetHeightBinding) this.binding).scale.setMaxIndex(UserHeightProvider.getMaxStepLength());
        ((ActivityGuidanceSetHeightBinding) this.binding).scale.setTextFormat("%.0f");
        ((ActivityGuidanceSetHeightBinding) this.binding).scale.setOnScaleChangeListener(new VerticalScaleView.b() { // from class: com.crrepa.band.my.home.guidance.info.k
            @Override // com.crrepa.band.my.health.widgets.VerticalScaleView.b
            public final void OnChange(double d8) {
                GuidanceSetHeightActivity.this.lambda$initScaleView$3(d8);
            }
        });
    }

    private void initTopView() {
        ((ActivityGuidanceSetHeightBinding) this.binding).includeTop.pb.setProgress(60);
        ((ActivityGuidanceSetHeightBinding) this.binding).includeTop.tvProgress.setText("3/5");
        ((ActivityGuidanceSetHeightBinding) this.binding).includeTop.tvTips.setText(R.string.guidance_tips_great);
        ((ActivityGuidanceSetHeightBinding) this.binding).includeTop.tvSkip.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetHeightActivity.this.lambda$initTopView$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$1(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$2(View view) {
        UserHeightProvider.setUserHeight(BandUnitSystemProvider.getUnitSystem(), (int) (((float) ((ActivityGuidanceSetHeightBinding) this.binding).scale.getCurrentIndex()) - ((ActivityGuidanceSetHeightBinding) this.binding).scale.getMinIndex()));
        startActivity(new Intent(this, (Class<?>) GuidanceSetWeightActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScaleView$3(double d8) {
        ((ActivityGuidanceSetHeightBinding) this.binding).tvValue.setText(String.valueOf((int) d8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTopView$0(View view) {
        s0.logEvent("用户点击跳过首次引导个人信息页面", "step_type", "身高");
        com.crrepa.band.my.home.guidance.a.getInstance().firstStartPermissionActivity(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.crrepa.band.my.home.guidance.b.setGuidanceState(3);
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
        int userHeight = UserHeightProvider.getUserHeight();
        ((ActivityGuidanceSetHeightBinding) this.binding).scale.setNowIndex(userHeight);
        ((ActivityGuidanceSetHeightBinding) this.binding).tvValue.setText(String.valueOf(userHeight));
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        sb.append(getString(BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.length_unit_cm : R.string.length_unit_in));
        sb.append(" )");
        ((ActivityGuidanceSetHeightBinding) this.binding).tvUnit.setText(sb.toString());
    }
}
