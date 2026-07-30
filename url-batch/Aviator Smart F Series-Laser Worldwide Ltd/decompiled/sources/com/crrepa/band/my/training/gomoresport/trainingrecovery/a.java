package com.crrepa.band.my.training.gomoresport.trainingrecovery;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes3.dex */
public class a extends com.crrepa.band.my.home.health.viewholder.b {
    private boolean isViewHolderBound;
    private final TextView tvRecoveryPercent;

    public a(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.isViewHolderBound = false;
        this.tvRecoveryPercent = (TextView) this.holder.getView(R.id.tv_recovery_percent);
    }

    public static String getRecoveryPercentage(PerformanceInsights performanceInsights) {
        if (performanceInsights == null || performanceInsights.getRecoveryTime().intValue() == 0) {
            return "100";
        }
        long intValue = performanceInsights.getRecoveryTime().intValue();
        long surplusRecoveryTime = getSurplusRecoveryTime(performanceInsights);
        float f8 = 100.0f - ((surplusRecoveryTime / intValue) * 100.0f);
        Log.d("getRecoveryPercentage", "percentage: " + f8 + "，recoveryTime=" + intValue + "，surplusRecoveryTime=" + surplusRecoveryTime);
        return String.valueOf((int) f8);
    }

    public static long getSurplusRecoveryTime(PerformanceInsights performanceInsights) {
        if (performanceInsights != null && performanceInsights.getRecoveryTime().intValue() != 0) {
            long intValue = performanceInsights.getTrainingEndTime().intValue();
            long intValue2 = performanceInsights.getRecoveryTime().intValue();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j8 = (intValue + intValue2) - currentTimeMillis;
            r0 = j8 >= 0 ? j8 : 0L;
            Log.d("getSurplusRecoveryTime", "surplusRecoveryTime: " + r0 + "，trainingEndTime=" + intValue + "， recoveryTime=" + intValue2 + ", currentTime=" + currentTimeMillis);
        }
        return r0;
    }

    private void showData() {
        showData(PerformanceInsightsDaoProxy.getInstance().queryInsight(new Date()));
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        Log.d("TrainingRecoveryHolder", "bindViewHolder");
        if (this.isViewHolderBound) {
            Log.d("TrainingRecoveryHolder", "isViewHolderBound");
        } else {
            this.isViewHolderBound = true;
            showData();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(PerformanceInsights performanceInsights) {
        showData(performanceInsights);
    }

    private void showData(PerformanceInsights performanceInsights) {
        if (performanceInsights != null) {
            this.tvRecoveryPercent.setText(getRecoveryPercentage(performanceInsights));
            setSyncTime(performanceInsights.getUpdateDate());
        } else {
            setSyncTime(new Date());
            this.tvRecoveryPercent.setText("100");
        }
    }
}
