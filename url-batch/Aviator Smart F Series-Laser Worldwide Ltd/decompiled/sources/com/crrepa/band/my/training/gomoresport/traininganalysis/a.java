package com.crrepa.band.my.training.gomoresport.traininganalysis;

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
    private final TextView tvExerciseStatus;
    private final TextView tvExerciseStatusTitle;

    public a(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.isViewHolderBound = false;
        this.tvExerciseStatus = (TextView) this.holder.getView(R.id.tv_execute_status);
        this.tvExerciseStatusTitle = (TextView) this.holder.getView(R.id.tv_execute_status_title);
    }

    private void showData() {
        showData(PerformanceInsightsDaoProxy.getInstance().queryInsight(new Date()));
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        Log.d("TrainingAnalysisHolder", "bindViewHolder");
        if (this.isViewHolderBound) {
            Log.d("TrainingAnalysisHolder", "isViewHolderBound");
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
        if (performanceInsights != null && performanceInsights.getTrainingLoadLevel() != null) {
            this.tvExerciseStatus.setText(com.crrepa.band.my.training.gomoresport.e.getTrainingStatus(performanceInsights.getTrainingLoadLevel()));
            setSyncTime(performanceInsights.getUpdateDate());
            return;
        }
        setSyncTime(new Date());
    }
}
