package com.crrepa.band.my.health.steps.presenter;

import com.crrepa.band.my.health.steps.BaseStepsStatisticsFragment;
import com.crrepa.band.my.health.steps.StepsDayStatisticsFragement;
import com.crrepa.band.my.health.steps.StepsMonthStatisticsFragment;
import com.crrepa.band.my.health.steps.StepsWeekStatisticsFragment;
import com.crrepa.band.my.health.steps.model.LastWeekActivityStandardModel;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.moyoung.dafit.module.common.utils.h;
import com.moyoung.dafit.module.common.utils.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import l0.g;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements com.moyoung.dafit.module.common.baseui.f {
    private static final int MIN_EFFETIVE_ACTIVITY = 10;
    private Step todayStep;
    private c3.a view;
    private StepsDaoProxy stepsDaoProxy = StepsDaoProxy.getInstance();
    private boolean isToday = true;

    public a() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private float getActiveTime(int i8, Integer num) {
        float activeTime = h.getActiveTime(i8, num);
        if (activeTime < 10.0f) {
            return 0.0f;
        }
        return activeTime;
    }

    private float[] getWeekActiveTime(List<Step> list) {
        float[] fArr = new float[7];
        for (Step step : list) {
            if (step != null) {
                fArr[m.getDayOfWeek(step.getDate()) - 1] = getActiveTime(step.getSteps().intValue(), step.getTime());
            }
        }
        return fArr;
    }

    private void showLast7DayActivityStandard(List<Step> list, Date date) {
        float[] fArr = new float[7];
        for (Step step : list) {
            if (step != null) {
                int daySpace = m.getDaySpace(step.getDate(), date);
                if (daySpace < 0 || daySpace >= 7) {
                    break;
                }
                fArr[6 - daySpace] = b3.c.getCompletion(step).floatValue();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 7; i8++) {
            arrayList.add(new LastWeekActivityStandardModel(fArr[i8]));
        }
        this.view.renderLast7DayActivityStandard(arrayList, date);
    }

    private void showLast7DayStepData(Date date) {
        showLast7DayActivityStandard(this.stepsDaoProxy.getPartStep(date, 7), date);
    }

    private void showSameAgeGroupStep(Step step) {
        int intValue = (step == null || step.getSteps() == null) ? 0 : step.getSteps().intValue();
        this.view.renderSameAgeGroupChart(b3.b.getHighLightValue(intValue), b3.b.getSameAgeGroupPercent(intValue));
    }

    private void showThisWeekEffetiveActivity(Date date) {
        float[] weekActiveTime = getWeekActiveTime(this.stepsDaoProxy.getWeekStepList(date));
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (float f8 : weekActiveTime) {
            i8 = (int) (i8 + f8);
            arrayList.add(Float.valueOf(f8));
        }
        this.view.renderThisWeekEffetiveActivity(i8);
        this.view.renderThisWeekEffetiveActivityChart(arrayList);
    }

    private void showTodayEffetiveActivity(Step step) {
        this.view.renderTodayEffetiveActivity((int) ((step == null || step.getSteps() == null) ? 0.0f : getActiveTime(step.getSteps().intValue(), step.getTime())));
    }

    private void showTodayGomoreData(PerformanceInsights performanceInsights) {
        if (performanceInsights == null) {
            this.view.renderTodayGomoreData(null, null, null);
        } else {
            this.view.renderTodayGomoreData(performanceInsights.getFatConsumptionPercentage(), performanceInsights.getCarbohydrateConsumptionPercentage(), performanceInsights.getMetabolicCoefficient());
        }
    }

    private void showTodayStep(Step step) {
        this.view.renderTodaySteps(step);
    }

    private void showTodayStepStatistics(Date date) {
        Step step = this.stepsDaoProxy.getStep(date);
        this.todayStep = step;
        showTodayStep(step);
        showTodayEffetiveActivity(this.todayStep);
        showSameAgeGroupStep(this.todayStep);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.view = null;
    }

    public void getStatisticsFragment(Date date) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseStepsStatisticsFragment.getInstance(new StepsDayStatisticsFragement(), date));
        arrayList.add(BaseStepsStatisticsFragment.getInstance(new StepsWeekStatisticsFragment(), date));
        arrayList.add(BaseStepsStatisticsFragment.getInstance(new StepsMonthStatisticsFragment(), date));
        this.view.renderStatisticsFragment(arrayList);
    }

    public void getStepsDetail(Date date) {
        this.isToday = i3.a.isSameDay(date, new Date());
        showTodayStepStatistics(date);
        showTodayGomoreData(PerformanceInsightsDaoProxy.getInstance().queryInsight(date));
        showThisWeekEffetiveActivity(date);
        showLast7DayStepData(date);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandUnitSystemChangeEvent(g gVar) {
        showTodayStep(this.todayStep);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(PerformanceInsights performanceInsights) {
        if (this.isToday) {
            showTodayGomoreData(performanceInsights);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(c3.a aVar) {
        this.view = aVar;
    }
}
