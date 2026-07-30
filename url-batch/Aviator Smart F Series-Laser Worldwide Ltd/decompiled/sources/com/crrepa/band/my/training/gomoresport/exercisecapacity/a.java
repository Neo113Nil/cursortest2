package com.crrepa.band.my.training.gomoresport.exercisecapacity;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public class a extends com.crrepa.band.my.home.health.viewholder.b {
    private boolean isViewHolderBound;
    private final TextView tvFitnessLevel;
    private final TextView tvFitnessLevelTitle;
    private final TextView tvSyncTime;

    public a(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.isViewHolderBound = false;
        this.tvFitnessLevel = (TextView) this.holder.getView(R.id.tv_fitness_level);
        this.tvFitnessLevelTitle = (TextView) this.holder.getView(R.id.tv_fitness_level_title);
        this.tvSyncTime = (TextView) this.holder.getView(R.id.tv_sync_time);
    }

    public static String getExerciseStatus(Integer num) {
        Log.d("ExerciseCapacityHolder", "getExerciseStatus: " + num);
        return com.moyoung.dafit.module.common.utils.d.get().getString(num.intValue() == 1 ? R.string.fitness_level_poor : num.intValue() == 2 ? R.string.fitness_level_fair : num.intValue() == 3 ? R.string.fitness_level_good : num.intValue() == 4 ? R.string.fitness_level_excellent : num.intValue() == 5 ? R.string.fitness_level_superior : R.string.fitness_level_very_poor);
    }

    private void showData() {
        showData(PerformanceInsightsDaoProxy.getInstance().queryInsight(new Date()));
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        Log.d("ExerciseCapacityHolder", "bindViewHolder");
        if (this.isViewHolderBound) {
            Log.d("ExerciseCapacityHolder", "isViewHolderBound");
        } else {
            this.isViewHolderBound = true;
            showData();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(PerformanceInsights performanceInsights) {
        showData(performanceInsights);
    }

    private void showData(PerformanceInsights performanceInsights) {
        if (performanceInsights != null && performanceInsights.getAgeEvaluationCoefficient() != null && performanceInsights.getAgeEvaluationCoefficient().intValue() != 0) {
            this.holder.getView(R.id.ll_value).setVisibility(0);
            this.tvFitnessLevel.setVisibility(0);
            this.tvFitnessLevelTitle.setVisibility(0);
            this.tvFitnessLevel.setText(getExerciseStatus(performanceInsights.getAgeEvaluationCoefficient()));
            setSyncTime(performanceInsights.getUpdateDate());
            return;
        }
        this.holder.getView(R.id.ll_value).setVisibility(8);
        this.tvFitnessLevel.setVisibility(8);
        this.tvFitnessLevelTitle.setVisibility(8);
        this.tvSyncTime.setText(R.string.exercise_capacity_tips);
    }
}
