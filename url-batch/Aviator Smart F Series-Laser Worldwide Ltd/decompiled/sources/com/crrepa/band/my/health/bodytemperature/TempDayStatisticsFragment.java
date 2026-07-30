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
import com.crrepa.band.my.databinding.FragmentTempDayStatisticsBinding;
import com.crrepa.band.my.health.bodytemperature.presenter.f;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.m;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.github.mikephil.charting.highlight.d;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l2.c;

/* loaded from: classes2.dex */
public class TempDayStatisticsFragment extends BaseFragement implements m {
    private static final int DAY_MINUTES = 1440;
    private static final int DELAY_DISPLAY_TIME = 3;
    private float averageTemp;
    private FragmentTempDayStatisticsBinding binding;
    private Disposable displaySubscribe;
    private Date statisticsDate;
    private int lastSelectedIndex = -1;
    private int intervalMinutes = 30;
    private f presenter = new f();
    private boolean fahrenheit = BandTempSystemProvider.isFahrenheit();

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
            TempDayStatisticsFragment.this.redisplayAverageTemp();
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            TempDayStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            TempDayStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
            TempDayStatisticsFragment.this.cancelRedisplayAverageTemp();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            TempDayStatisticsFragment tempDayStatisticsFragment = TempDayStatisticsFragment.this;
            tempDayStatisticsFragment.setAverageTemp(tempDayStatisticsFragment.averageTemp);
            TempDayStatisticsFragment tempDayStatisticsFragment2 = TempDayStatisticsFragment.this;
            tempDayStatisticsFragment2.renderStatisticsDate(tempDayStatisticsFragment2.statisticsDate);
            TempDayStatisticsFragment.this.setTempType(R.string.chart_average_temperature);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRedisplayAverageTemp() {
        Disposable disposable = this.displaySubscribe;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    private void getDayStatisticsData() {
        this.presenter.getDayStatisticsData(getStatisticsDate());
    }

    private Date getStatisticsDate() {
        return (Date) getArguments().getSerializable("statistics_date");
    }

    public static TempDayStatisticsFragment newInstance(Date date) {
        TempDayStatisticsFragment tempDayStatisticsFragment = new TempDayStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        tempDayStatisticsFragment.setArguments(bundle);
        return tempDayStatisticsFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redisplayAverageTemp() {
        this.displaySubscribe = Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageTemp(float f8) {
        String string = getContext().getString(R.string.data_blank);
        if (0.0f < f8) {
            if (this.fahrenheit) {
                f8 = c.celsius2Fahrenheit(f8);
            }
            string = n.formatTemp(f8);
        }
        this.binding.tvAverageTemp.setText(string);
    }

    private void setStatisticsDate(Date date, int i8) {
        this.binding.tvStatisticsDate.setText(com.moyoung.dafit.module.common.utils.m.format(date, getString(i8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempType(int i8) {
        this.binding.tvTempType.setText(i8);
    }

    private void setTemperatureUnit() {
        if (this.fahrenheit) {
            this.binding.tvTemperatureUnit.setText(R.string.fahrenheit_unit);
        } else {
            this.binding.tvTemperatureUnit.setText(R.string.celsius_unit);
        }
    }

    private void showDayAxisTimeView() {
        this.binding.dayAxisTimeView.setVisibility(0);
        this.binding.dayAxisTimeView.setTextColor(R.color.white);
    }

    private void showHandleView() {
        this.binding.hrHandleView.setHandleView(R$drawable.handle_temperature);
        this.binding.hrHandleView.setHandleLine(R$drawable.line_handle_temperature);
        this.binding.hrHandleView.setOnHandleDrawChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        d highlightByTouchPoint = this.binding.tempLineChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        int x7 = (int) highlightByTouchPoint.getX();
        if (x7 == this.lastSelectedIndex) {
            return;
        }
        setAverageTemp(highlightByTouchPoint.getY());
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
        setTempType(R.string.chart_temperature);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentTempDayStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        cancelRedisplayAverageTemp();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        setTemperatureUnit();
        getDayStatisticsData();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.crrepa.band.my.health.widgets.m
    public void renderAverageTemp(float f8) {
        this.averageTemp = f8;
        setAverageTemp(f8);
    }

    @Override // com.crrepa.band.my.health.widgets.m
    public void renderStatisticsDate(Date date) {
        this.statisticsDate = date;
        this.binding.llStatisticsDate.setVisibility(0);
        setStatisticsDate(date, R.string.year_month_day_format);
    }

    @Override // com.crrepa.band.my.health.widgets.m
    public void renderTempList(List<Float> list, Date date) {
        showHandleView();
        showDayAxisTimeView();
        this.intervalMinutes = DAY_MINUTES / list.size();
        this.binding.tempLineChart.setVisibility(0);
        this.binding.tempLineChart.init(list.size());
        this.binding.tempLineChart.setXAxisLineColor(R.color.white);
        this.binding.tempLineChart.setXAxisLineWidth(1);
        this.binding.tempLineChart.setXAxisTextColor(R.color.white);
        this.binding.tempLineChart.hideXAxisLabels();
        this.binding.tempLineChart.setAnimate();
        this.binding.tempLineChart.setMaxValue(50.0f);
        this.binding.tempLineChart.setData(list, ContextCompat.getDrawable(getContext(), R.drawable.fade_training_statistics_heart_rate_chart), ContextCompat.getColor(getContext(), R.color.white), 1.8f);
    }
}
