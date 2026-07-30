package com.crrepa.band.my.health.bloodoxygen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentHeartRateStatisticsBinding;
import com.crrepa.band.my.health.bloodoxygen.presenter.d;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.c;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import com.orhanobut.logger.f;
import g5.b;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseBloodOxygenStatisticsFragment extends BaseFragement implements c {
    public static final int MAX_BLOOD_OXYGEN_VALUE = 100;
    private FragmentHeartRateStatisticsBinding binding;
    private b chartHelper = new b();
    private int lastSelectedBarIndex = -1;
    private d presenter = getBloodOxygenStatisticsPresenter();

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            BaseBloodOxygenStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            BaseBloodOxygenStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
        }
    }

    public static BaseBloodOxygenStatisticsFragment getInstance(BaseBloodOxygenStatisticsFragment baseBloodOxygenStatisticsFragment, Date date) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        baseBloodOxygenStatisticsFragment.setArguments(bundle);
        return baseBloodOxygenStatisticsFragment;
    }

    private void initHandleView() {
        this.binding.hrHandleView.setHandleView(R$drawable.handle_bo);
        this.binding.hrHandleView.setHandleLine(R$drawable.line_handle_bo);
        this.binding.hrHandleView.setOnHandleDrawChangeListener(new a());
    }

    private void setHighlightValue(com.github.mikephil.charting.highlight.d dVar) {
        this.binding.heartRateBarChart.highlightValue(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        int x7;
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = this.binding.heartRateBarChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        if (highlightByTouchPoint == null || (x7 = (int) highlightByTouchPoint.getX()) == this.lastSelectedBarIndex) {
            return;
        }
        setHighlightValue(highlightByTouchPoint);
        int y7 = (int) highlightByTouchPoint.getY();
        f.d("x: " + x7 + ",y: " + y7);
        renderAverageBloodOxygen(y7);
        updateSelectedDate(x7);
        this.lastSelectedBarIndex = x7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHandleViewPosition(int i8, int i9) {
        this.binding.hrHandleView.updatePosition(i8, i9);
    }

    private void updateSelectedDate(int i8) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(getDate());
        calendar.set(getCalendarOffsetField(), i8 + 1);
        renderDate(calendar.getTime());
    }

    protected abstract int getBarMaxValue();

    protected abstract d getBloodOxygenStatisticsPresenter();

    protected abstract int getCalendarOffsetField();

    protected abstract int getChartBarCount();

    protected abstract g getChartValueFormatter();

    protected Date getDate() {
        return (Date) getArguments().getSerializable("statistics_date");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentHeartRateStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        this.binding.rlHeartRateStatistics.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color_blood_oxygen));
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        this.binding.tvHrType.setText(", " + getString(R.string.average_blood_oxygen).toLowerCase());
        initHandleView();
        this.presenter.getStatisticsData(getDate());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.crrepa.band.my.health.widgets.c
    public void renderAverageBloodOxygen(int i8) {
        if (i8 <= 0) {
            this.binding.tvAverageHr.setText(R.string.data_blank);
            return;
        }
        this.binding.tvAverageHr.setText(i8 + getString(R.string.percent_unit));
    }

    @Override // com.crrepa.band.my.health.widgets.c
    public void renderAverageBloodOxygenChart(List<Float> list) {
        this.chartHelper.initChart(this.binding.heartRateBarChart, getChartBarCount(), getBarMaxValue(), getChartValueFormatter());
        this.chartHelper.setXAxisStyle(this.binding.heartRateBarChart, R.color.color_chart_bar, R.color.white);
        this.chartHelper.setChartData(this.binding.heartRateBarChart, list, R.color.color_chart_bar, R.color.white);
        this.binding.heartRateBarChart.setAnimate();
    }

    @Override // com.crrepa.band.my.health.widgets.c
    public void renderDate(Date date) {
        this.binding.tvStatisticsDate.setText(m.format(date, getString(R.string.year_month_day_format)));
    }
}
