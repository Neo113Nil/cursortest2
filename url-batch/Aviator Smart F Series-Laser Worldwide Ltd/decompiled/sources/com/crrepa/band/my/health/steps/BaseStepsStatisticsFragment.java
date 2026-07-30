package com.crrepa.band.my.health.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentStepStatisticsBinding;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.j;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import com.orhanobut.logger.f;
import g5.d;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class BaseStepsStatisticsFragment extends BaseFragement implements j {
    private static final int DELAY_DISPLAY_TIME = 3;
    private FragmentStepStatisticsBinding binding;
    private int defaultSteps;
    private Disposable displaySubscribe;
    private int totalSteps;
    private int lastSelectedBarIndex = -1;
    private d chartHelper = new d();
    private com.crrepa.band.my.health.steps.presenter.b presenter = getPresenter();

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
            BaseStepsStatisticsFragment.this.redisplayTotalSteps();
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            f.d("onDragChange: left = " + i8 + ",right = " + i9);
            BaseStepsStatisticsFragment.this.binding.stepHandleView.updatePosition(i8, i9);
            BaseStepsStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
            BaseStepsStatisticsFragment.this.cancelRedisplayTotalSteps();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            BaseStepsStatisticsFragment baseStepsStatisticsFragment = BaseStepsStatisticsFragment.this;
            baseStepsStatisticsFragment.setSteps(baseStepsStatisticsFragment.totalSteps);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRedisplayTotalSteps() {
        Disposable disposable = this.displaySubscribe;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public static BaseStepsStatisticsFragment getInstance(BaseStepsStatisticsFragment baseStepsStatisticsFragment, Date date) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        baseStepsStatisticsFragment.setArguments(bundle);
        return baseStepsStatisticsFragment;
    }

    private void initChart() {
        this.chartHelper.initChart(this.binding.stepsStatisticsChart, getChartBarCount(), getBarMaxValue(), getChartValueFormatter());
        this.chartHelper.setXAxisStyle(this.binding.stepsStatisticsChart, R.color.color_chart_bar, R.color.white);
        this.binding.stepsStatisticsChart.setAnimate();
    }

    private void initHandleView() {
        this.binding.stepHandleView.setHandleView(R$drawable.handle_step);
        this.binding.stepHandleView.setHandleLine(R$drawable.line_handle_step);
        this.binding.stepHandleView.setOnHandleDrawChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redisplayTotalSteps() {
        if (isRedisplaySteps()) {
            this.displaySubscribe = Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSteps(int i8) {
        FragmentStepStatisticsBinding fragmentStepStatisticsBinding = this.binding;
        if (fragmentStepStatisticsBinding != null) {
            fragmentStepStatisticsBinding.tvSteps.setText(String.valueOf(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        int x7;
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = this.binding.stepsStatisticsChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        if (highlightByTouchPoint == null || (x7 = (int) highlightByTouchPoint.getX()) == this.lastSelectedBarIndex) {
            return;
        }
        this.binding.stepsStatisticsChart.highlightValue(highlightByTouchPoint);
        setSteps(this.chartHelper.getActiveSteps(highlightByTouchPoint.getY(), this.defaultSteps));
        if (!isRedisplaySteps()) {
            updateSelectedDate(x7);
        }
        this.lastSelectedBarIndex = x7;
    }

    private void updateSelectedDate(int i8) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(getDate());
        calendar.set(getCalendarOffsetField(), i8 + 1);
        renderDate(calendar.getTime());
    }

    protected abstract int getBarMaxValue();

    protected abstract int getCalendarOffsetField();

    protected abstract int getChartBarCount();

    protected abstract g getChartValueFormatter();

    protected Date getDate() {
        return (Date) getArguments().getSerializable("statistics_date");
    }

    protected abstract com.crrepa.band.my.health.steps.presenter.b getPresenter();

    @Override // com.crrepa.band.my.health.widgets.j
    public void hideStatisticsChart() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.binding.llStatisticsData.getLayoutParams();
        layoutParams.removeRule(14);
        layoutParams.addRule(13);
        this.binding.stepsStatisticsChart.setVisibility(4);
        this.binding.stepHandleView.setVisibility(4);
    }

    protected abstract boolean isRedisplaySteps();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentStepStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.destroy();
        cancelRedisplayTotalSteps();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initChart();
        initHandleView();
        this.presenter.getStepsDetail(getDate());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // com.crrepa.band.my.health.widgets.j
    public void renderDate(Date date) {
        this.binding.tvDate.setText(m.format(date, getString(R.string.statistics_date_format)));
    }

    @Override // com.crrepa.band.my.health.widgets.j
    public void renderStepsChartMaxValue(float f8) {
        this.binding.stepsStatisticsChart.setMaxValue(f8);
    }

    @Override // com.crrepa.band.my.health.widgets.j
    public void renderStepsList(List<Float> list, int i8) {
        this.defaultSteps = i8;
        this.chartHelper.setChartData(this.binding.stepsStatisticsChart, list, R.color.color_chart_bar, R.color.white);
    }

    @Override // com.crrepa.band.my.health.widgets.j
    public void renderTotalSteps(int i8) {
        this.totalSteps = i8;
        setSteps(i8);
    }
}
