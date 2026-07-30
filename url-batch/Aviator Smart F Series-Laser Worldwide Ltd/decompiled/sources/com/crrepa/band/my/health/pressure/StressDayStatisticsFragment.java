package com.crrepa.band.my.health.pressure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentStressDayStatisticsBinding;
import com.crrepa.band.my.health.pressure.presenter.d;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.k;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.m;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class StressDayStatisticsFragment extends BaseFragement implements k {
    private static final int DAY_MINUTES = 1440;
    private static final int DELAY_DISPLAY_TIME = 3;
    private int averageStress;
    private FragmentStressDayStatisticsBinding binding;
    private Disposable displaySubscribe;
    private Date statisticsDate;
    private int lastSelectedIndex = -1;
    private int intervalMinutes = 5;
    private l3.a chartHelper = new l3.a();
    private d presenter = new d();

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
            StressDayStatisticsFragment.this.redisplayAverageBo();
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            StressDayStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            StressDayStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
            StressDayStatisticsFragment.this.cancelRedisplayAverageBo();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            StressDayStatisticsFragment stressDayStatisticsFragment = StressDayStatisticsFragment.this;
            stressDayStatisticsFragment.setAverageStress(stressDayStatisticsFragment.averageStress);
            StressDayStatisticsFragment stressDayStatisticsFragment2 = StressDayStatisticsFragment.this;
            stressDayStatisticsFragment2.renderStatisticsDate(stressDayStatisticsFragment2.statisticsDate);
            StressDayStatisticsFragment.this.setStressType(R.string.stress_average);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRedisplayAverageBo() {
        Disposable disposable = this.displaySubscribe;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public static StressDayStatisticsFragment newInstance(Date date) {
        StressDayStatisticsFragment stressDayStatisticsFragment = new StressDayStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        stressDayStatisticsFragment.setArguments(bundle);
        return stressDayStatisticsFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redisplayAverageBo() {
        this.displaySubscribe = Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageStress(int i8) {
        FragmentStressDayStatisticsBinding fragmentStressDayStatisticsBinding = this.binding;
        if (fragmentStressDayStatisticsBinding != null) {
            if (i8 <= 0) {
                fragmentStressDayStatisticsBinding.tvAverageStress.setText(R.string.data_blank);
            } else {
                fragmentStressDayStatisticsBinding.tvAverageStress.setText(String.valueOf(i8));
            }
        }
    }

    private void setHighlightValue(com.github.mikephil.charting.highlight.d dVar) {
        this.binding.stressChart.highlightValue(dVar);
    }

    private void setStatisticsDate(Date date, int i8) {
        String format = m.format(date, getString(i8));
        FragmentStressDayStatisticsBinding fragmentStressDayStatisticsBinding = this.binding;
        if (fragmentStressDayStatisticsBinding != null) {
            fragmentStressDayStatisticsBinding.tvStatisticsDate.setText(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStressType(int i8) {
        if (this.binding != null) {
            this.binding.tvStressType.setText(", " + getString(i8).toLowerCase());
        }
    }

    private void showHandleView() {
        this.binding.stressHandleView.setHandleView(R$drawable.handle_stress);
        this.binding.stressHandleView.setHandleLine(R$drawable.line_handle_stress);
        this.binding.stressHandleView.setOnHandleDrawChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = this.binding.stressChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        int x7 = (int) highlightByTouchPoint.getX();
        if (x7 == this.lastSelectedIndex) {
            return;
        }
        setHighlightValue(highlightByTouchPoint);
        setAverageStress(this.chartHelper.getStress((int) highlightByTouchPoint.getY()));
        updateSelectedDate(x7);
        this.lastSelectedIndex = x7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHandleViewPosition(int i8, int i9) {
        this.binding.stressHandleView.updatePosition(i8, i9);
    }

    private void updateSelectedDate(int i8) {
        f.d("index: " + i8);
        f.d("intervalMinutes: " + this.intervalMinutes);
        Calendar calendar = com.moyoung.dafit.module.common.utils.k.getCalendar();
        calendar.setTime(this.statisticsDate);
        calendar.set(11, 0);
        calendar.set(12, (i8 + 1) * this.intervalMinutes);
        setStatisticsDate(calendar.getTime(), R.string.hour_minute_format_12);
        setStressType(R.string.stress);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentStressDayStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        cancelRedisplayAverageBo();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        this.presenter.getStatisticsData((Date) getArguments().getSerializable("statistics_date"));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.crrepa.band.my.health.widgets.k
    public void renderAverageStress(int i8) {
        this.averageStress = i8;
        setAverageStress(i8);
    }

    @Override // com.crrepa.band.my.health.widgets.k
    public void renderStatisticsDate(Date date) {
        this.statisticsDate = date;
        this.binding.llStatisticsDate.setVisibility(0);
        setStatisticsDate(date, R.string.year_month_day_format);
        setStressType(R.string.stress_average);
    }

    @Override // com.crrepa.band.my.health.widgets.k
    public void renderStressList(List<Float> list, Date date) {
        showHandleView();
        this.binding.stressChart.setVisibility(0);
        this.binding.dayAxisTimeView.setVisibility(0);
        this.binding.dayAxisTimeView.setTextColor(R.color.white);
        this.intervalMinutes = DAY_MINUTES / list.size();
        this.chartHelper.initChart(this.binding.stressChart, 48, 110, null);
        this.chartHelper.setXAxisStyle(this.binding.stressChart, R.color.color_chart_bar, R.color.white);
        this.chartHelper.setChartData(this.binding.stressChart, list, R.color.color_chart_bar, R.color.white);
        this.binding.stressChart.setAnimate();
    }
}
