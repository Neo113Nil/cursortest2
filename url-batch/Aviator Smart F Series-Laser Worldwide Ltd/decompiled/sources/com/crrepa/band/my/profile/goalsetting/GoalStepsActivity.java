package com.crrepa.band.my.profile.goalsetting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGoalStepsBinding;
import com.crrepa.band.my.databinding.BandDataAppbarBinding;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.List;

/* loaded from: classes2.dex */
public class GoalStepsActivity extends BaseActivity implements a {
    private ActivityGoalStepsBinding binding;
    private c presenter = new c();

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) GoalStepsActivity.class);
    }

    private void initWheelPicker() {
        this.binding.wpGoalSteps.setCyclic(true);
        this.binding.wpGoalSteps.setAtmospheric(true);
        this.binding.wpGoalSteps.setCurtain(true);
        this.binding.wpGoalSteps.setItemTextColor(ContextCompat.getColor(this, R.color.dark_grey));
        this.binding.wpGoalSteps.setSelectedItemTextColor(ContextCompat.getColor(this, R.color.black));
        this.binding.wpGoalSteps.setItemTextSize(o.dp2px(this, 18.0f));
        this.binding.wpGoalSteps.setItemSpace(5);
        this.binding.wpGoalSteps.setIndicatorColor(ContextCompat.getColor(this, R.color.grey));
        this.binding.wpGoalSteps.setIndicator(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        onBackPressedSupport();
    }

    private void saveGoalSteps() {
        this.presenter.saveUserGoalSteps(this, ((Integer) this.binding.wpGoalSteps.getData().get(this.binding.wpGoalSteps.getCurrentItemPosition())).intValue());
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(this.binding.titleBar.appbar);
        BandDataAppbarBinding bandDataAppbarBinding = this.binding.titleBar;
        bVar.addTitleScrollEvent(bandDataAppbarBinding.tvTitle, bandDataAppbarBinding.tvExpandedTitle);
        setSupportActionBar(this.binding.titleBar.toolbar);
    }

    private void setTitle() {
        this.binding.titleBar.tvTitle.setText(R.string.goal_step_setting);
        this.binding.titleBar.tvExpandedTitle.setText(R.string.goal_step_setting);
        this.binding.titleBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityGoalStepsBinding inflate = ActivityGoalStepsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar();
        setTitle();
        initWheelPicker();
        this.presenter.getRecommendSteps();
        this.presenter.getGoalStepsList();
        this.binding.titleBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.goalsetting.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalStepsActivity.this.lambda$onCreate$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        saveGoalSteps();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "目标设置");
    }

    @Override // com.crrepa.band.my.profile.goalsetting.a
    public void renderGoalStepData(List list, int i8) {
        this.binding.wpGoalSteps.setData(list);
        this.binding.wpGoalSteps.setSelectedItemPosition(i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.a
    public void renderRecommendSteps(int i8) {
        this.binding.tvGoalStepHint.setText(String.format(getString(R.string.goal_step_hint), Integer.valueOf(i8)));
    }
}
