package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.steps.model.BandStepChangeEvent;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.crrepa.band.my.profile.goalsetting.model.UserGoalStepsChengeEvent;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class i extends b {
    private TextView activityCalorieView;
    private TextView activityDistanceView;
    private TextView activityStepView;
    private TextView activityTimeView;
    private g5.d chartHelper;
    private CrpBarChart stepsDetailChart;

    public i(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.chartHelper = new g5.d();
        this.activityStepView = (TextView) this.holder.getView(R.id.tv_date_first_part);
        this.activityDistanceView = (TextView) this.holder.getView(R.id.tv_activity_distance);
        this.activityCalorieView = (TextView) this.holder.getView(R.id.tv_activity_calorie);
        this.activityTimeView = (TextView) this.holder.getView(R.id.tv_activity_time);
        this.stepsDetailChart = (CrpBarChart) this.holder.getView(R.id.today_steps_detail_chart);
        initView();
        initChart();
    }

    private Step getTodaySteps() {
        return StepsDaoProxy.getInstance().getTodayStep();
    }

    private void initChart() {
        this.chartHelper.initChart(this.stepsDetailChart, 48, 220, new k3.a());
        this.chartHelper.setXAxisStyle(this.stepsDetailChart, R.color.color_step, R.color.color_step);
    }

    private void initView() {
        this.holder.setText(R.id.tv_data_type, R.string.steps);
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.step);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_step));
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
    }

    private void setStepsDetailChart(List<Float> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        float f8 = 200.0f;
        for (Float f9 : list) {
            arrayList.add(f9);
            if (f8 < f9.floatValue()) {
                f8 = f9.floatValue();
            }
        }
        float f10 = f8 / 10.0f;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList.set(i8, Float.valueOf(((Float) arrayList.get(i8)).floatValue() + f10));
        }
        this.stepsDetailChart.setVisibility(0);
        this.stepsDetailChart.setMaxValue(f8 + f10);
        this.chartHelper.setChartData(this.stepsDetailChart, arrayList, R.color.color_step, R.color.color_step);
    }

    private void updateGoalSteps(int i8) {
        this.holder.setText(R.id.tv_today_data_description, this.context.getString(R.string.goal_step, Integer.valueOf(i8)));
    }

    private void updateSteps(Step step) {
        setSyncTime(new Date());
        com.crrepa.band.my.health.steps.b.bindView(this.context, step, this.activityStepView, this.activityDistanceView, this.activityCalorieView, this.activityTimeView);
        if (step != null) {
            setStepsDetailChart(s.json2List(step.getStepsCategory(), Float[].class));
        }
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        updateGoalSteps(GoalsSettingDaoProxy.getInstance().getTodayGoalSteps());
        updateSteps(getTodaySteps());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandBoundStateChangeEvent(l0.d dVar) {
        if (dVar.isBound()) {
            Step todaySteps = getTodaySteps();
            if (todaySteps != null) {
                com.orhanobut.logger.f.d("---onBandBoundStateChangeEvent----");
                todaySteps.setStepsCategory(null);
            }
            this.stepsDetailChart.setVisibility(8);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandStepChanged(BandStepChangeEvent bandStepChangeEvent) {
        updateSteps(bandStepChangeEvent.getStep());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandUnitSystemChangeEvent(l0.g gVar) {
        com.crrepa.band.my.health.steps.b.bindView(this.context, getTodaySteps(), this.activityStepView, this.activityDistanceView, this.activityCalorieView, this.activityTimeView);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onStepsCategoryChangeEvent(l0.f fVar) {
        setStepsDetailChart(fVar.getList());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onUserGoalStepsChangeEvent(UserGoalStepsChengeEvent userGoalStepsChengeEvent) {
        updateGoalSteps(userGoalStepsChengeEvent.getGoalSteps());
    }
}
