package com.crrepa.band.my.training.gomoresport.traininganalysis;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityTrainingAnalysisMainBinding;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import com.crrepa.band.my.training.gomoresport.GomoreSportCalendarActivity;
import com.crrepa.band.my.training.gomoresport.GomoreSportTipsDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public class TrainingAnalysisMainActivity extends BaseVBActivity<ActivityTrainingAnalysisMainBinding> {
    private Date selectDate;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        GomoreSportCalendarActivity.start(this, this.selectDate, 1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        GomoreSportTipsDialog gomoreSportTipsDialog = new GomoreSportTipsDialog(this);
        gomoreSportTipsDialog.showData(R.string.training_acwr_title, R.string.training_load_desc);
        gomoreSportTipsDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        GomoreSportTipsDialog gomoreSportTipsDialog = new GomoreSportTipsDialog(this);
        gomoreSportTipsDialog.showData(R.string.training_status_title, R.string.training_acwr_content);
        gomoreSportTipsDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        TrainingAnalysisStatisticsActivity.start(this, this.selectDate);
    }

    public static void start(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) TrainingAnalysisMainActivity.class);
        intent.putExtra("selected_date", date);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.analysis_bg_2_nav));
        ((ActivityTrainingAnalysisMainBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingAnalysisMainActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityTrainingAnalysisMainBinding) this.binding).ivCalendar.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingAnalysisMainActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityTrainingAnalysisMainBinding) this.binding).tvAcwrTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingAnalysisMainActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingStatusTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingAnalysisMainActivity.this.lambda$initBinding$3(view);
            }
        });
        ((ActivityTrainingAnalysisMainBinding) this.binding).rlTrainingLoad.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingAnalysisMainActivity.this.lambda$initBinding$4(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        this.selectDate = (Date) getIntent().getSerializableExtra("selected_date");
        PerformanceInsights queryInsight = PerformanceInsightsDaoProxy.getInstance().queryInsight(this.selectDate);
        ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingLoad.setVisibility(8);
        ((ActivityTrainingAnalysisMainBinding) this.binding).rlAcwr.setVisibility(8);
        ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingLoadShortTerm.setText(HttpClient.ENDFLAG);
        ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingLoadLongTerm.setText(HttpClient.ENDFLAG);
        ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingAcwr.setText(HttpClient.ENDFLAG);
        ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingStatus.setText(getString(R.string.training_status_none));
        if (queryInsight != null) {
            Log.d("AnalysisMain", "performanceInsights: " + queryInsight);
            Integer currentLoad = queryInsight.getCurrentLoad();
            if (currentLoad != null && currentLoad.intValue() != 0) {
                ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingLoad.setVisibility(0);
                ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingLoad.setText(String.valueOf(currentLoad));
            }
            Integer shortTermLoad = queryInsight.getShortTermLoad();
            Integer longTermLoad = queryInsight.getLongTermLoad();
            Float trainingLoadFactor = queryInsight.getTrainingLoadFactor();
            if ((shortTermLoad != null && shortTermLoad.intValue() != 0) || ((longTermLoad != null && longTermLoad.intValue() != 0) || (trainingLoadFactor != null && trainingLoadFactor.floatValue() != 0.0f))) {
                ((ActivityTrainingAnalysisMainBinding) this.binding).rlAcwr.setVisibility(0);
                if (shortTermLoad != null && shortTermLoad.intValue() != 0) {
                    ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingLoadShortTerm.setText(String.valueOf(shortTermLoad));
                }
                if (longTermLoad != null && longTermLoad.intValue() != 0) {
                    ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingLoadLongTerm.setText(String.valueOf(longTermLoad));
                }
                if (trainingLoadFactor != null && trainingLoadFactor.floatValue() != 0.0f) {
                    ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingAcwr.setText(String.valueOf(trainingLoadFactor));
                }
            }
            Integer trainingLoadLevel = queryInsight.getTrainingLoadLevel();
            if (trainingLoadLevel != null) {
                ((ActivityTrainingAnalysisMainBinding) this.binding).tvTrainingStatus.setText(com.crrepa.band.my.training.gomoresport.e.getTrainingStatus(trainingLoadLevel));
            }
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
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
