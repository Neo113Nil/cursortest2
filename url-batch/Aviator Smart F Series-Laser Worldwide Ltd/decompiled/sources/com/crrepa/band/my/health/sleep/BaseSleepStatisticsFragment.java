package com.crrepa.band.my.health.sleep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentSleepWeekStatisticsBinding;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.i;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseSleepStatisticsFragment extends BaseFragement implements i {
    private FragmentSleepWeekStatisticsBinding binding;
    private int lastSelectedBarIndex = -1;
    private com.crrepa.band.my.health.sleep.presenter.b sleepStatisticsPresenter = getPresenter();

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            BaseSleepStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            BaseSleepStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
        }
    }

    public static BaseSleepStatisticsFragment getInstance(BaseSleepStatisticsFragment baseSleepStatisticsFragment, Date date) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        baseSleepStatisticsFragment.setArguments(bundle);
        return baseSleepStatisticsFragment;
    }

    private void getStatisticsData() {
        this.sleepStatisticsPresenter.getSleepStatisticsData(getDate());
    }

    private void initChart() {
        this.binding.sleepStatisticsChart.setup(getChartBarCount());
        this.binding.sleepStatisticsChart.setMaxValue(720.0f);
        this.binding.sleepStatisticsChart.setXAxisValueFormatter(getChartValueFormatter());
        this.binding.sleepStatisticsChart.setAnimate();
    }

    private void initHandleView() {
        this.binding.sleepHandleView.setHandleView(R$drawable.handle_sleep);
        this.binding.sleepHandleView.setHandleLine(R$drawable.line_handle_sleep);
        this.binding.sleepHandleView.setOnHandleDrawChangeListener(new a());
    }

    private void setHighlightValue(com.github.mikephil.charting.highlight.d dVar) {
        this.binding.sleepStatisticsChart.highlightValue(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        int x7;
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = this.binding.sleepStatisticsChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        if (highlightByTouchPoint == null || (x7 = (int) highlightByTouchPoint.getX()) == this.lastSelectedBarIndex) {
            return;
        }
        setHighlightValue(highlightByTouchPoint);
        renderSleepTime((int) highlightByTouchPoint.getY());
        updateSelectedDate(x7);
        this.lastSelectedBarIndex = x7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHandleViewPosition(int i8, int i9) {
        this.binding.sleepHandleView.updatePosition(i8, i9);
    }

    private void updateSelectedDate(int i8) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(getDate());
        calendar.set(getCalendarOffsetField(), i8 + 1);
        renderDate(calendar.getTime());
    }

    protected abstract int getCalendarOffsetField();

    protected abstract int getChartBarCount();

    protected abstract g getChartValueFormatter();

    protected Date getDate() {
        return (Date) getArguments().getSerializable("statistics_date");
    }

    protected abstract com.crrepa.band.my.health.sleep.presenter.b getPresenter();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentSleepWeekStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.sleepStatisticsPresenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.sleepStatisticsPresenter.destroy();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initChart();
        initHandleView();
        getStatisticsData();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.sleepStatisticsPresenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.sleepStatisticsPresenter.resume();
    }

    @Override // com.crrepa.band.my.health.widgets.i
    public void renderDate(Date date) {
        this.binding.tvDate.setText(m.format(date, getString(R.string.statistics_date_format)));
    }

    @Override // com.crrepa.band.my.health.widgets.i
    public void renderSleepTime(int i8) {
        FragmentSleepWeekStatisticsBinding fragmentSleepWeekStatisticsBinding = this.binding;
        e.bindTotalSleepTimeView(i8, fragmentSleepWeekStatisticsBinding.tvSleepTimeHour, fragmentSleepWeekStatisticsBinding.tvSleepTimeMinute);
    }

    @Override // com.crrepa.band.my.health.widgets.i
    public void renderSleepTimeChart(List<Float> list, List<Float> list2, List<Float> list3) {
        int[] iArr = {ContextCompat.getColor(getContext(), R.color.color_restful), ContextCompat.getColor(getContext(), R.color.color_light), ContextCompat.getColor(getContext(), R.color.color_rem)};
        int color = ContextCompat.getColor(getContext(), R.color.color_sleep_chart_highlight);
        this.binding.sleepStatisticsChart.setHighLightAlpha(40);
        this.binding.sleepStatisticsChart.setData(false, iArr, color, 0.6f, list, list2, list3);
    }
}
