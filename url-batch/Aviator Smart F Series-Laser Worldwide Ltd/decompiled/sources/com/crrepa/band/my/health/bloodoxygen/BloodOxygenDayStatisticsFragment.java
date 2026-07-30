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
import com.crrepa.band.my.databinding.FragmentHeartRateDayStatisticsBinding;
import com.crrepa.band.my.health.bloodoxygen.presenter.f;
import com.crrepa.band.my.health.widgets.HandleView;
import com.github.mikephil.charting.highlight.d;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import h2.c;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class BloodOxygenDayStatisticsFragment extends BaseFragement implements c {
    private static final int DAY_MINUTES = 1440;
    private static final int DELAY_DISPLAY_TIME = 3;
    private int averageBo;
    private FragmentHeartRateDayStatisticsBinding binding;
    private Disposable displaySubscribe;
    private Date statisticsDate;
    private int lastSelectedIndex = -1;
    private int intervalMinutes = 5;
    private f presenter = new f();

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
            BloodOxygenDayStatisticsFragment.this.redisplayAverageBo();
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            BloodOxygenDayStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            BloodOxygenDayStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
            BloodOxygenDayStatisticsFragment.this.cancelRedisplayAverageBo();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            BloodOxygenDayStatisticsFragment bloodOxygenDayStatisticsFragment = BloodOxygenDayStatisticsFragment.this;
            bloodOxygenDayStatisticsFragment.setAverageBo(bloodOxygenDayStatisticsFragment.averageBo);
            BloodOxygenDayStatisticsFragment bloodOxygenDayStatisticsFragment2 = BloodOxygenDayStatisticsFragment.this;
            bloodOxygenDayStatisticsFragment2.renderStatisticsDate(bloodOxygenDayStatisticsFragment2.statisticsDate);
            BloodOxygenDayStatisticsFragment.this.setBloodOxygenType(R.string.average_blood_oxygen);
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

    public static BloodOxygenDayStatisticsFragment newInstance(Date date) {
        BloodOxygenDayStatisticsFragment bloodOxygenDayStatisticsFragment = new BloodOxygenDayStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        bloodOxygenDayStatisticsFragment.setArguments(bundle);
        return bloodOxygenDayStatisticsFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redisplayAverageBo() {
        this.displaySubscribe = Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageBo(int i8) {
        FragmentHeartRateDayStatisticsBinding fragmentHeartRateDayStatisticsBinding = this.binding;
        if (fragmentHeartRateDayStatisticsBinding != null) {
            fragmentHeartRateDayStatisticsBinding.tvAverageHr.setText(i8 + getString(R.string.percent_unit));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBloodOxygenType(int i8) {
        if (this.binding != null) {
            this.binding.tvHrType.setText(", " + getString(i8).toLowerCase());
        }
    }

    private void setStatisticsDate(Date date, int i8) {
        String format = m.format(date, getString(i8));
        FragmentHeartRateDayStatisticsBinding fragmentHeartRateDayStatisticsBinding = this.binding;
        if (fragmentHeartRateDayStatisticsBinding != null) {
            fragmentHeartRateDayStatisticsBinding.tvStatisticsDate.setText(format);
        }
    }

    private void showDayAxisTimeView() {
        this.binding.dayAxisTimeView.setVisibility(0);
        this.binding.dayAxisTimeView.setTextColor(R.color.white);
    }

    private void showHandleView() {
        this.binding.hrHandleView.setHandleView(R$drawable.handle_bo);
        this.binding.hrHandleView.setHandleLine(R$drawable.line_handle_bo);
        this.binding.hrHandleView.setOnHandleDrawChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        d highlightByTouchPoint = this.binding.heartRateChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        int x7 = (int) highlightByTouchPoint.getX();
        if (x7 == this.lastSelectedIndex) {
            return;
        }
        setAverageBo((int) highlightByTouchPoint.getY());
        updateSelectedDate(x7);
        this.lastSelectedIndex = x7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHandleViewPosition(int i8, int i9) {
        this.binding.hrHandleView.updatePosition(i8, i9);
    }

    private void updateSelectedDate(int i8) {
        com.orhanobut.logger.f.d("index: " + i8);
        com.orhanobut.logger.f.d("intervalMinutes: " + this.intervalMinutes);
        Calendar calendar = k.getCalendar();
        calendar.setTime(this.statisticsDate);
        calendar.set(11, 0);
        calendar.set(12, i8 * this.intervalMinutes);
        setStatisticsDate(calendar.getTime(), R.string.hour_minute_format_12);
        setBloodOxygenType(R.string.blood_oxygen);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentHeartRateDayStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        this.binding.rlHeartRateChart.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.color_blood_oxygen));
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

    @Override // h2.c
    public void renderAverageBloodOxygen(int i8) {
        this.averageBo = i8;
        setAverageBo(i8);
    }

    @Override // h2.c
    public void renderBloodOxygenList(List<Float> list, Date date) {
        showHandleView();
        showDayAxisTimeView();
        this.intervalMinutes = DAY_MINUTES / list.size();
        this.binding.heartRateChart.setVisibility(0);
        this.binding.heartRateChart.init(list.size());
        this.binding.heartRateChart.setXAxisLineColor(R.color.white);
        this.binding.heartRateChart.setXAxisLineWidth(1);
        this.binding.heartRateChart.setXAxisTextColor(R.color.white);
        this.binding.heartRateChart.hideXAxisLabels();
        this.binding.heartRateChart.setAnimate();
        this.binding.heartRateChart.setMaxValue(100.0f);
        this.binding.heartRateChart.setData(list, ContextCompat.getDrawable(requireContext(), R.drawable.fade_training_statistics_heart_rate_chart), ContextCompat.getColor(requireContext(), R.color.white), 1.8f);
        this.binding.heartRateChart.fitScreen();
    }

    @Override // h2.c
    public void renderStatisticsDate(Date date) {
        this.statisticsDate = date;
        this.binding.llStatisticsDate.setVisibility(0);
        setStatisticsDate(date, R.string.year_month_day_format);
        setBloodOxygenType(R.string.average_blood_oxygen);
    }
}
