package com.crrepa.band.my.training.gomoresport.trainingrecovery;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityTrainingRecoveryMainBinding;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import com.crrepa.band.my.training.gomoresport.GomoreSportCalendarActivity;
import com.crrepa.band.my.training.gomoresport.GomoreSportTipsDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.n;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes3.dex */
public class TrainingRecoveryMainActivity extends BaseVBActivity<ActivityTrainingRecoveryMainBinding> {
    private Date selectDate;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        GomoreSportCalendarActivity.start(this, this.selectDate, 2, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        GomoreSportTipsDialog gomoreSportTipsDialog = new GomoreSportTipsDialog(this);
        gomoreSportTipsDialog.showData(R.string.training_recovery_time, R.string.training_recovery_desc);
        gomoreSportTipsDialog.show();
    }

    public static void start(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) TrainingRecoveryMainActivity.class);
        intent.putExtra("selected_date", date);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.recovery_bg_2_nav));
        ((ActivityTrainingRecoveryMainBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.trainingrecovery.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingRecoveryMainActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityTrainingRecoveryMainBinding) this.binding).ivCalendar.setVisibility(8);
        ((ActivityTrainingRecoveryMainBinding) this.binding).ivCalendar.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.trainingrecovery.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingRecoveryMainActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityTrainingRecoveryMainBinding) this.binding).tvTrainingRecoveryLevelTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.trainingrecovery.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingRecoveryMainActivity.this.lambda$initBinding$2(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        String str;
        String str2;
        super.loadData();
        this.selectDate = (Date) getIntent().getSerializableExtra("selected_date");
        PerformanceInsights queryInsight = PerformanceInsightsDaoProxy.getInstance().queryInsight(this.selectDate);
        if (queryInsight != null) {
            Log.d("RecoveryMain", "performanceInsights: " + queryInsight);
            str = a.getRecoveryPercentage(queryInsight);
            long surplusRecoveryTime = a.getSurplusRecoveryTime(queryInsight);
            str2 = n.format(surplusRecoveryTime / 3600, n.TWO_INTEGERS_PATTERN) + ":" + n.format((surplusRecoveryTime % 3600) / 60, n.TWO_INTEGERS_PATTERN) + ":" + n.format(surplusRecoveryTime % 60, n.TWO_INTEGERS_PATTERN);
        } else {
            str = "100";
            str2 = "00:00:00";
        }
        ((ActivityTrainingRecoveryMainBinding) this.binding).tvRecoveryPercent.setText(str);
        ((ActivityTrainingRecoveryMainBinding) this.binding).tvRecoveryTime.setText(str2);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(PerformanceInsights performanceInsights) {
        Date date = this.selectDate;
        if (date == null || i3.a.isSameDay(date, new Date())) {
            loadData();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        loadData();
    }
}
