package com.crrepa.band.my.training.gomoresport.exercisecapacity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityExerciseCapacityMainBinding;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import com.crrepa.band.my.training.gomoresport.GomoreSportCalendarActivity;
import com.crrepa.band.my.training.gomoresport.GomoreSportTipsDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public class ExerciseCapacityMainActivity extends BaseVBActivity<ActivityExerciseCapacityMainBinding> {
    private Date selectDate;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        GomoreSportCalendarActivity.start(this, this.selectDate, 0, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        GomoreSportTipsDialog gomoreSportTipsDialog = new GomoreSportTipsDialog(this);
        gomoreSportTipsDialog.showData(R.string.fitness_age, R.string.fitness_age_desc);
        gomoreSportTipsDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        GomoreSportTipsDialog gomoreSportTipsDialog = new GomoreSportTipsDialog(this);
        gomoreSportTipsDialog.showData(R.string.fitness_level, R.string.fitness_level_desc);
        gomoreSportTipsDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        ExerciseCapacityStatisticsActivity.start(this, this.selectDate, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$5(View view) {
        ExerciseCapacityStatisticsActivity.start(this, this.selectDate, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$6(View view) {
        ExerciseCapacityStatisticsActivity.start(this, this.selectDate, 2);
    }

    public static void start(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) ExerciseCapacityMainActivity.class);
        intent.putExtra("selected_date", date);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.physicalt_bg_2_nav));
        ((ActivityExerciseCapacityMainBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityMainActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityExerciseCapacityMainBinding) this.binding).ivCalendar.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityMainActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityExerciseCapacityMainBinding) this.binding).tvFitnessAgeTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityMainActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityExerciseCapacityMainBinding) this.binding).tvFitnessLevelTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityMainActivity.this.lambda$initBinding$3(view);
            }
        });
        ((ActivityExerciseCapacityMainBinding) this.binding).rlVo2Max.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityMainActivity.this.lambda$initBinding$4(view);
            }
        });
        ((ActivityExerciseCapacityMainBinding) this.binding).rlLactateThresholdHr.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityMainActivity.this.lambda$initBinding$5(view);
            }
        });
        ((ActivityExerciseCapacityMainBinding) this.binding).rlLactateThresholdPace.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityMainActivity.this.lambda$initBinding$6(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        this.selectDate = (Date) getIntent().getSerializableExtra("selected_date");
        PerformanceInsights queryInsight = PerformanceInsightsDaoProxy.getInstance().queryInsight(this.selectDate);
        ((ActivityExerciseCapacityMainBinding) this.binding).rlFitnessAge.setVisibility(8);
        ((ActivityExerciseCapacityMainBinding) this.binding).rlFitnessLevel.setVisibility(8);
        ((ActivityExerciseCapacityMainBinding) this.binding).tvVo2max.setVisibility(8);
        ((ActivityExerciseCapacityMainBinding) this.binding).tvVo2maxUnit.setVisibility(8);
        ((ActivityExerciseCapacityMainBinding) this.binding).tvLactateThresholdHr.setVisibility(8);
        ((ActivityExerciseCapacityMainBinding) this.binding).tvLactateThresholdHrUnit.setVisibility(8);
        ((ActivityExerciseCapacityMainBinding) this.binding).tvLactateThresholdPace.setVisibility(8);
        if (queryInsight != null) {
            Log.d("ExerciseMain", "performanceInsights: " + queryInsight);
            Integer age = queryInsight.getAge();
            if (age != null && age.intValue() != 0) {
                ((ActivityExerciseCapacityMainBinding) this.binding).rlFitnessAge.setVisibility(0);
                ((ActivityExerciseCapacityMainBinding) this.binding).tvFitnessAge.setText(String.valueOf(age));
            }
            Integer ageEvaluationCoefficient = queryInsight.getAgeEvaluationCoefficient();
            if (ageEvaluationCoefficient != null && ageEvaluationCoefficient.intValue() != 0) {
                ((ActivityExerciseCapacityMainBinding) this.binding).rlFitnessLevel.setVisibility(0);
                ((ActivityExerciseCapacityMainBinding) this.binding).tvFitnessLevel.setText(a.getExerciseStatus(ageEvaluationCoefficient));
            }
            Float maxOxygenIntake = queryInsight.getMaxOxygenIntake();
            if (maxOxygenIntake != null && maxOxygenIntake.floatValue() != 0.0f) {
                ((ActivityExerciseCapacityMainBinding) this.binding).tvVo2max.setVisibility(0);
                ((ActivityExerciseCapacityMainBinding) this.binding).tvVo2maxUnit.setVisibility(0);
                ((ActivityExerciseCapacityMainBinding) this.binding).tvVo2max.setText(com.moyoung.dafit.module.common.utils.n.format(maxOxygenIntake.floatValue(), com.moyoung.dafit.module.common.utils.n.ONE_DECIMAL_PATTERN));
            }
            Integer lactateHeartRate = queryInsight.getLactateHeartRate();
            if (lactateHeartRate != null && lactateHeartRate.intValue() != 0) {
                ((ActivityExerciseCapacityMainBinding) this.binding).tvLactateThresholdHr.setVisibility(0);
                ((ActivityExerciseCapacityMainBinding) this.binding).tvLactateThresholdHrUnit.setVisibility(0);
                ((ActivityExerciseCapacityMainBinding) this.binding).tvLactateThresholdHr.setText(String.valueOf(lactateHeartRate));
            }
            Float lactateSpeed = queryInsight.getLactateSpeed();
            Log.d("getLactateSpeed", "getLactateSpeed=" + lactateSpeed);
            if (lactateSpeed == null || lactateSpeed.floatValue() == 0.0f) {
                return;
            }
            ((ActivityExerciseCapacityMainBinding) this.binding).tvLactateThresholdPace.setVisibility(0);
            ((ActivityExerciseCapacityMainBinding) this.binding).tvLactateThresholdPace.setText(com.crrepa.band.my.training.gomoresport.e.secondSpeedToPace(lactateSpeed.floatValue()));
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
