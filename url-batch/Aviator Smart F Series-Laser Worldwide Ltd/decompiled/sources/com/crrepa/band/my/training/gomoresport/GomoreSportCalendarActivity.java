package com.crrepa.band.my.training.gomoresport;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.crrepa.band.my.training.gomoresport.exercisecapacity.ExerciseCapacityMainActivity;
import com.crrepa.band.my.training.gomoresport.exercisecapacity.ExerciseCapacityStatisticsActivity;
import com.crrepa.band.my.training.gomoresport.traininganalysis.TrainingAnalysisMainActivity;
import com.crrepa.band.my.training.gomoresport.traininganalysis.TrainingAnalysisStatisticsActivity;
import com.crrepa.band.my.training.gomoresport.trainingrecovery.TrainingRecoveryMainActivity;
import java.util.Date;

/* loaded from: classes3.dex */
public class GomoreSportCalendarActivity extends BaseCalendarHistoryActivity {
    public static final int MODE_TYPE_EXERCISE_CAPACITY = 0;
    public static final int MODE_TYPE_TRAINING_ANALYSIS = 1;
    public static final int MODE_TYPE_TRAINING_RECOVERY = 2;
    private d gomoreSportCalendarPresenter;
    private int modeType;

    public static void start(Context context, Date date, int i8, int i9) {
        Intent callingIntent = BaseCalendarHistoryActivity.getCallingIntent(context, GomoreSportCalendarActivity.class, date);
        callingIntent.putExtra("modeType", i8);
        callingIntent.putExtra("dataType", i9);
        context.startActivity(callingIntent);
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    protected int getActionBarBackground() {
        int i8 = this.modeType;
        return i8 == 0 ? R.color.physicalt_main_6_date : i8 == 1 ? R.color.analysis_bg_2_nav : R.color.recovery_bg_2_nav;
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        int intExtra = getIntent().getIntExtra("modeType", 0);
        this.modeType = intExtra;
        this.gomoreSportCalendarPresenter.setTrainingAnalysis(intExtra);
        super.onCreate(bundle);
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    protected void onDateClicked(Date date) {
        int intExtra = getIntent().getIntExtra("dataType", -1);
        int i8 = this.modeType;
        if (i8 == 0) {
            if (intExtra == -1) {
                ExerciseCapacityMainActivity.start(this, date);
            } else {
                ExerciseCapacityStatisticsActivity.start(this, date, intExtra);
            }
        } else if (i8 != 1) {
            TrainingRecoveryMainActivity.start(this, date);
        } else if (intExtra == -1) {
            TrainingAnalysisMainActivity.start(this, date);
        } else {
            TrainingAnalysisStatisticsActivity.start(this, date);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    public d getPresenter() {
        d dVar = new d();
        this.gomoreSportCalendarPresenter = dVar;
        return dVar;
    }
}
