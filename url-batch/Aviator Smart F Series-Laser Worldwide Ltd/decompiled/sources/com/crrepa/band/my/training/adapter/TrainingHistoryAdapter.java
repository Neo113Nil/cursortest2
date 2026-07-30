package com.crrepa.band.my.training.adapter;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.net.TrainingRecordsEntity;
import com.crrepa.band.my.training.utils.e;
import com.crrepa.band.my.training.utils.q;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.x0;
import m3.d;

/* loaded from: classes3.dex */
public class TrainingHistoryAdapter extends BaseQuickAdapter<TrainingRecordsEntity, BaseViewHolder> {
    private final GpsTrainingDaoProxy gpsTrainingDaoProxy;

    public TrainingHistoryAdapter() {
        super(R.layout.item_training_history_info);
        this.gpsTrainingDaoProxy = new GpsTrainingDaoProxy();
    }

    private static boolean isFromPhone(Integer num) {
        return (num == null || num.intValue() == 241) ? false : true;
    }

    private void renderDistance(@NonNull BaseViewHolder baseViewHolder, int i8) {
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        int actionDistanceUnit = com.crrepa.band.my.health.base.a.getActionDistanceUnit(i8, unitSystem);
        String actionDistance = com.crrepa.band.my.health.base.a.getActionDistance(i8, unitSystem);
        baseViewHolder.setVisible(R.id.tv_training_distance, true);
        baseViewHolder.setText(R.id.tv_training_distance, actionDistance + getContext().getString(actionDistanceUnit));
    }

    private void renderHrAndKcal(@NonNull BaseViewHolder baseViewHolder, TrainingRecordsEntity trainingRecordsEntity) {
        Integer avgHr = trainingRecordsEntity.getAvgHr();
        if (avgHr == null || avgHr.intValue() <= 0) {
            baseViewHolder.setGone(R.id.tv_training_hr, true);
        } else {
            baseViewHolder.setVisible(R.id.tv_training_hr, true);
            baseViewHolder.setText(R.id.tv_training_hr, avgHr + getContext().getString(R.string.heart_rate_unit));
        }
        Float calories = trainingRecordsEntity.getCalories();
        if (calories == null || calories.floatValue() <= 0.0f) {
            baseViewHolder.setGone(R.id.tv_training_calories, true);
            return;
        }
        baseViewHolder.setVisible(R.id.tv_training_calories, true);
        baseViewHolder.setText(R.id.tv_training_calories, n.format(calories.floatValue()) + getContext().getString(R.string.calorie_unit));
    }

    private void renderTrainingDate(@NonNull BaseViewHolder baseViewHolder, TrainingRecordsEntity trainingRecordsEntity) {
        String format = m.format(trainingRecordsEntity.getStartDate(), getContext().getString(R.string.yyyy_mm_dd_format));
        String formatPeriodTime = m3.a.formatPeriodTime(getContext(), trainingRecordsEntity.getStartDate());
        baseViewHolder.setText(R.id.tv_training_date, format);
        baseViewHolder.setText(R.id.tv_training_time, formatPeriodTime);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void renderTrainingNameAndIcon(BaseViewHolder baseViewHolder, TrainingRecordsEntity trainingRecordsEntity) {
        boolean z7;
        Drawable trainingIcon;
        int intValue = trainingRecordsEntity.getTrainingType().intValue();
        Integer type = trainingRecordsEntity.getType();
        String trainingName = q.getTrainingName(getContext(), intValue);
        if (trainingRecordsEntity.isGomoreSportData()) {
            String gomoreTrainingName = q.getGomoreTrainingName(intValue);
            if (x0.isNotEmpty(gomoreTrainingName)) {
                trainingName = gomoreTrainingName;
                z7 = true;
                TextView textView = (TextView) baseViewHolder.getView(R.id.tv_training_name);
                LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R.id.ll_gomore_title);
                linearLayout.setVisibility(8);
                textView.setVisibility(8);
                if (x0.isNotEmpty(trainingName)) {
                    if (z7) {
                        linearLayout.setVisibility(0);
                        ((TextView) baseViewHolder.getView(R.id.tv_gomore_title)).setText(trainingName);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(trainingName);
                    }
                }
                if (!isFromPhone(type) && intValue == GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING.getValue()) {
                    baseViewHolder.setImageDrawable(R.id.iv_training, getContext().getResources().getDrawable(R$drawable.ic_training_gps_indoor_running));
                    return;
                }
                if (!isFromPhone(type) && intValue == GpsTrainingModel.GpsTrainingType.INDOOR_WALKING.getValue()) {
                    baseViewHolder.setImageDrawable(R.id.iv_training, getContext().getResources().getDrawable(R$drawable.ic_training_gps_indoor_walking));
                    return;
                }
                trainingIcon = q.getTrainingIcon(getContext(), intValue);
                if (trainingIcon == null) {
                    baseViewHolder.setImageDrawable(R.id.iv_training, trainingIcon);
                    return;
                }
                return;
            }
        }
        z7 = false;
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_training_name);
        LinearLayout linearLayout2 = (LinearLayout) baseViewHolder.getView(R.id.ll_gomore_title);
        linearLayout2.setVisibility(8);
        textView2.setVisibility(8);
        if (x0.isNotEmpty(trainingName)) {
        }
        if (!isFromPhone(type)) {
        }
        if (!isFromPhone(type)) {
        }
        trainingIcon = q.getTrainingIcon(getContext(), intValue);
        if (trainingIcon == null) {
        }
    }

    private void renderTrainingSourceIcon(BaseViewHolder baseViewHolder, TrainingRecordsEntity trainingRecordsEntity) {
        if (!isFromPhone(trainingRecordsEntity.getType())) {
            baseViewHolder.setImageResource(R.id.iv_data_origin, R$drawable.ic_gps_watch);
            return;
        }
        Integer avgHr = trainingRecordsEntity.getAvgHr();
        if (avgHr == null || avgHr.intValue() <= 0) {
            baseViewHolder.setImageResource(R.id.iv_data_origin, R$drawable.ic_gps_phone);
        } else {
            baseViewHolder.setImageResource(R.id.iv_data_origin, R$drawable.ic_gps_connect);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, TrainingRecordsEntity trainingRecordsEntity) {
        GpsTraining gpsTraining;
        int intValue = trainingRecordsEntity.getDistance() == null ? 0 : trainingRecordsEntity.getDistance().intValue();
        if (intValue == 0 && e.isGpsCycling(trainingRecordsEntity.getTrainingType().intValue()) && (gpsTraining = this.gpsTrainingDaoProxy.get(trainingRecordsEntity.getStartDate())) != null) {
            intValue = gpsTraining.getDistance() != null ? gpsTraining.getDistance().intValue() : 0;
        }
        renderTrainingNameAndIcon(baseViewHolder, trainingRecordsEntity);
        renderTrainingSourceIcon(baseViewHolder, trainingRecordsEntity);
        renderTrainingDate(baseViewHolder, trainingRecordsEntity);
        renderHrAndKcal(baseViewHolder, trainingRecordsEntity);
        String formatRunTime = d.formatRunTime(trainingRecordsEntity.getTrainingSeconds().intValue());
        if (intValue > 0) {
            renderDistance(baseViewHolder, intValue);
        } else {
            baseViewHolder.setGone(R.id.tv_training_distance, true);
        }
        baseViewHolder.setVisible(R.id.tv_training_duration, true);
        baseViewHolder.setText(R.id.tv_training_duration, formatRunTime);
    }
}
