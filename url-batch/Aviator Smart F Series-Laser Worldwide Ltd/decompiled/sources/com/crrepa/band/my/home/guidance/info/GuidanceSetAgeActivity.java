package com.crrepa.band.my.home.guidance.info;

import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGuidanceSetAgeBinding;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelDatePicker;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class GuidanceSetAgeActivity extends BaseVBActivity<ActivityGuidanceSetAgeBinding> {
    private void initOnclickListener() {
        ((ActivityGuidanceSetAgeBinding) this.binding).ivBack.setVisibility(isTaskRoot() ? 8 : 0);
        ((ActivityGuidanceSetAgeBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetAgeActivity.this.lambda$initOnclickListener$1(view);
            }
        });
        ((ActivityGuidanceSetAgeBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetAgeActivity.this.lambda$initOnclickListener$2(view);
            }
        });
    }

    private void initTopView() {
        ((ActivityGuidanceSetAgeBinding) this.binding).includeTop.pb.setProgress(40);
        ((ActivityGuidanceSetAgeBinding) this.binding).includeTop.tvProgress.setText("2/5");
        ((ActivityGuidanceSetAgeBinding) this.binding).includeTop.tvTips.setText(R.string.guidance_tips_continue);
        ((ActivityGuidanceSetAgeBinding) this.binding).includeTop.tvSkip.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.info.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuidanceSetAgeActivity.this.lambda$initTopView$0(view);
            }
        });
    }

    private void initWheelPicker() {
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setAtmospheric(true);
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setCurved(true);
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setCyclic(false);
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setItemTextColor(ContextCompat.getColor(this, R.color.assist_10));
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setItemTextSize(com.moyoung.dafit.module.common.utils.o.dp2px(this, 16.0f));
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setSelectedItemTextColor(ContextCompat.getColor(this, R.color.assist_14));
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setIndicator(false);
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setOnDateSelectedListener(new WheelDatePicker.a() { // from class: com.crrepa.band.my.home.guidance.info.b
            @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelDatePicker.a
            public final void onDateSelected(WheelDatePicker wheelDatePicker, Date date) {
                GuidanceSetAgeActivity.this.lambda$initWheelPicker$3(wheelDatePicker, date);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$1(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnclickListener$2(View view) {
        UserAgeProvider.saveBirthday(((ActivityGuidanceSetAgeBinding) this.binding).wpDate.getCurrentDate());
        startActivity(new Intent(this, (Class<?>) GuidanceSetHeightActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTopView$0(View view) {
        s0.logEvent("用户点击跳过首次引导个人信息页面", "step_type", "年龄");
        com.crrepa.band.my.home.guidance.a.getInstance().firstStartPermissionActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWheelPicker$3(WheelDatePicker wheelDatePicker, Date date) {
        if (System.currentTimeMillis() < date.getTime()) {
            showSelectedDate(new Date());
        }
    }

    private void showSelectedDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i8 = calendar.get(1);
        int i9 = calendar.get(2) + 1;
        int i10 = calendar.get(5);
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setSelectedYear(i8);
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setSelectedMonth(i9);
        ((ActivityGuidanceSetAgeBinding) this.binding).wpDate.setSelectedDay(i10);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.crrepa.band.my.home.guidance.b.setGuidanceState(2);
        initTopView();
        initOnclickListener();
        initWheelPicker();
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
        showSelectedDate(UserAgeProvider.getBirthday());
    }
}
