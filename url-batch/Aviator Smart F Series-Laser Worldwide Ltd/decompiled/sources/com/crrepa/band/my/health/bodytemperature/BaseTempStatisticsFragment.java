package com.crrepa.band.my.health.bodytemperature;

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
import com.crrepa.band.my.health.bodytemperature.presenter.d;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.n;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import com.orhanobut.logger.f;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import l2.c;

/* loaded from: classes2.dex */
public abstract class BaseTempStatisticsFragment extends BaseFragement implements n {
    private FragmentHeartRateStatisticsBinding binding;
    private g5.b chartHelper = new g5.b();
    private int lastSelectedBarIndex = -1;
    private boolean fahrenheit = BandTempSystemProvider.isFahrenheit();
    private d presenter = getStatisticsPresenter();

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            BaseTempStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            BaseTempStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
        }
    }

    public static BaseTempStatisticsFragment getInstance(BaseTempStatisticsFragment baseTempStatisticsFragment, Date date) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        baseTempStatisticsFragment.setArguments(bundle);
        return baseTempStatisticsFragment;
    }

    private void getStatisticsData() {
        this.presenter.getStatisticsData(getDate());
    }

    private void initHandleView() {
        this.binding.hrHandleView.setHandleView(R$drawable.handle_temperature);
        this.binding.hrHandleView.setHandleLine(R$drawable.line_handle_temperature);
        this.binding.hrHandleView.setOnHandleDrawChangeListener(new a());
    }

    private void setBackgroundColor() {
        this.binding.rlHeartRateStatistics.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color_temperature));
    }

    private void setHighlightValue(com.github.mikephil.charting.highlight.d dVar) {
        this.binding.heartRateBarChart.highlightValue(dVar);
    }

    private void setTemperatureUnit() {
        if (this.fahrenheit) {
            this.binding.tvUnit.setText(R.string.fahrenheit_unit);
        } else {
            this.binding.tvUnit.setText(R.string.celsius_unit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        int x7;
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = this.binding.heartRateBarChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        if (highlightByTouchPoint == null || (x7 = (int) highlightByTouchPoint.getX()) == this.lastSelectedBarIndex) {
            return;
        }
        setHighlightValue(highlightByTouchPoint);
        float y7 = highlightByTouchPoint.getY();
        f.d("x: " + x7 + ",y: " + y7);
        renderAverageTemp(y7);
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

    protected abstract int getCalendarOffsetField();

    protected abstract int getChartBarCount();

    protected abstract g getChartValueFormatter();

    protected Date getDate() {
        return (Date) getArguments().getSerializable("statistics_date");
    }

    protected abstract d getStatisticsPresenter();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentHeartRateStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        setBackgroundColor();
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
        setTemperatureUnit();
        initHandleView();
        getStatisticsData();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.crrepa.band.my.health.widgets.n
    public void renderAverageTemp(float f8) {
        String string = getContext().getString(R.string.data_blank);
        if (0.0f < f8) {
            if (this.fahrenheit) {
                f8 = c.celsius2Fahrenheit(f8);
            }
            string = com.moyoung.dafit.module.common.utils.n.formatTemp(f8);
        }
        this.binding.tvAverageHr.setText(string);
    }

    @Override // com.crrepa.band.my.health.widgets.n
    public void renderAverageTempChart(List<Float> list) {
        this.chartHelper.initChart(this.binding.heartRateBarChart, getChartBarCount(), getBarMaxValue(), getChartValueFormatter());
        this.chartHelper.setXAxisStyle(this.binding.heartRateBarChart, R.color.color_chart_bar, R.color.white);
        this.chartHelper.setChartData(this.binding.heartRateBarChart, list, R.color.color_chart_bar, R.color.white);
        this.binding.heartRateBarChart.setAnimate();
    }

    @Override // com.crrepa.band.my.health.widgets.n
    public void renderDate(Date date) {
        this.binding.tvStatisticsDate.setText(m.format(date, getString(R.string.year_month_day_format)));
        this.binding.tvAverageHr.setText(getString(R.string.chart_average_temperature));
    }
}
