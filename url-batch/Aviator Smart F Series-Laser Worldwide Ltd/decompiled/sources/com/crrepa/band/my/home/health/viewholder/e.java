package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.training.utils.q;
import com.moyoung.dafit.module.common.utils.TrainingTypeUtils;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class e extends b {
    private int movementType;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$moyoung$dafit$module$common$utils$TrainingTypeUtils$TrainingType;

        static {
            int[] iArr = new int[TrainingTypeUtils.TrainingType.values().length];
            $SwitchMap$com$moyoung$dafit$module$common$utils$TrainingTypeUtils$TrainingType = iArr;
            try {
                iArr[TrainingTypeUtils.TrainingType.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public e(Context context, BaseViewHolder baseViewHolder, int i8) {
        super(context, baseViewHolder);
        this.movementType = i8;
        initView(i8);
    }

    private void initView(int i8) {
        setHeartRateType(i8);
        this.holder.setText(R.id.tv_today_data_description, R.string.total_run_time);
        int color = ContextCompat.getColor(this.context, R.color.color_training);
        this.holder.setTextColor(R.id.tv_date_first_part, color);
        this.holder.setGone(R.id.tv_date_first_part_unit, true);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        this.holder.setImageResource(R.id.iv_second_section, R$drawable.ic_sport_kcal);
        this.holder.setText(R.id.tv_second_section, R.string.total_calorie);
        this.holder.setImageResource(R.id.iv_third_section, R$drawable.ic_sport_hr);
        this.holder.setText(R.id.tv_third_section, R.string.average_heart_rate);
        this.holder.setTextColor(R.id.tv_first_section_data, color);
        this.holder.setTextColor(R.id.tv_second_section_data, color);
        this.holder.setTextColor(R.id.tv_third_section_data, color);
        this.holder.setText(R.id.tv_second_section_data_unit, R.string.calorie_unit);
        this.holder.setText(R.id.tv_third_section_data_unit, R.string.heart_rate_unit);
    }

    private void setActionDistance(int i8) {
        this.holder.setImageResource(R.id.iv_first_section, R$drawable.ic_sport_km);
        this.holder.setText(R.id.tv_first_section, R.string.total_distance);
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        this.holder.setText(R.id.tv_first_section_data_unit, com.crrepa.band.my.health.base.a.getActionDistanceUnit(i8, unitSystem));
        this.holder.setText(R.id.tv_first_section_data, com.crrepa.band.my.health.base.a.getActionDistance(i8, unitSystem));
    }

    private void setActionSteps(int i8) {
        boolean z7 = i8 > 0;
        this.holder.setVisible(R.id.ll_first_section, z7);
        this.holder.setVisible(R.id.ll_first_section_data, z7);
        if (z7) {
            this.holder.setImageResource(R.id.iv_first_section, R$drawable.ic_sport_steps);
            this.holder.setText(R.id.tv_first_section, R.string.total_steps);
            this.holder.setText(R.id.tv_first_section_data, String.valueOf(i8));
            this.holder.setText(R.id.tv_first_section_data_unit, R.string.step);
        }
    }

    private void setAverageHeartRate(int i8) {
        boolean z7 = i8 > 0;
        this.holder.setVisible(R.id.ll_third_section, z7);
        this.holder.setVisible(R.id.ll_third_section_data, z7);
        if (z7) {
            this.holder.setText(R.id.tv_third_section_data, String.valueOf(i8));
        }
    }

    private void setHeartRateList(List<Float> list, Date date, int i8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CrpLineChart crpLineChart = (CrpLineChart) this.holder.getView(R.id.heart_rate_chart);
        crpLineChart.setVisibility(0);
        crpLineChart.init(7);
        crpLineChart.setXAxisLineColor(R.color.color_heart_rate);
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisTextColor(R.color.black);
        crpLineChart.setXAxisValueFormatter(new k3.b(this.context, date, i8, list.size()));
        if (7 < list.size()) {
            crpLineChart.getXAxis().setLabelCount(7, true);
        }
        crpLineChart.setExtraLeftOffset(20.0f);
        crpLineChart.setExtraRightOffset(20.0f);
        crpLineChart.setMaxValue(210.0f);
        crpLineChart.setData(list, ContextCompat.getDrawable(this.context, R.drawable.fade_training_heart_rate_chart), ContextCompat.getColor(this.context, R.color.color_training), 1.8f);
    }

    private void setHeartRateType(int i8) {
        int trainingType = TrainingTypeUtils.toTrainingType(i8);
        String trainingName = q.getTrainingName(this.context, trainingType);
        if (!TextUtils.isEmpty(trainingName)) {
            this.holder.setText(R.id.tv_data_type, trainingName);
        }
        Drawable homeTrainingIcon = q.getHomeTrainingIcon(this.context, trainingType);
        if (homeTrainingIcon != null) {
            this.holder.setImageDrawable(R.id.iv_training_type, homeTrainingIcon);
        }
    }

    private void setLastTimeMovementHeartRate() {
        setMovementHeartRate(new MovementHeartRateDaoProxy().getTodayLastMovementHeartRate(TrainingTypeUtils.toTrainingType(this.movementType)));
    }

    private void setMovementHeartRate(MovementHeartRate movementHeartRate) {
        int i8;
        int i9;
        int i10;
        Date date = new Date();
        if (movementHeartRate != null) {
            date = new Date(movementHeartRate.getStartTime().longValue());
            Integer steps = movementHeartRate.getSteps();
            i9 = steps != null ? steps.intValue() : 0;
            Float distance = movementHeartRate.getDistance();
            r1 = distance != null ? distance.intValue() : 0;
            Float calories = movementHeartRate.getCalories();
            r2 = calories != null ? calories.floatValue() : 0.0f;
            i10 = q2.a.getHeartRateAnalysisData(movementHeartRate.getAverage());
            List<Float> json2List = s.json2List(movementHeartRate.getHeartRates(), Float[].class);
            int intValue = movementHeartRate.getTrainingSeconds().intValue();
            setHeartRateList(json2List, date, movementHeartRate.getInterval().intValue());
            i8 = r1;
            r1 = intValue;
        } else {
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        setSyncTime(date);
        ((TextView) this.holder.getView(R.id.tv_date_first_part)).setText(q2.a.getTrainingTime(this.context, r1));
        if (a.$SwitchMap$com$moyoung$dafit$module$common$utils$TrainingTypeUtils$TrainingType[TrainingTypeUtils.getTrainingType(this.movementType).ordinal()] != 1) {
            setActionSteps(i9);
        } else {
            setActionDistance(i8);
        }
        this.holder.setText(R.id.tv_second_section_data, String.valueOf(r2));
        setAverageHeartRate(i10);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setLastTimeMovementHeartRate();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandUnitSystemChangeEvent(l0.g gVar) {
        setLastTimeMovementHeartRate();
    }
}
