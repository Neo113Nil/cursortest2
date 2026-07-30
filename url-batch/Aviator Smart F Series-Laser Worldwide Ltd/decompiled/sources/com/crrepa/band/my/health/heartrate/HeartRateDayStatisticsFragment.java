package com.crrepa.band.my.health.heartrate;

import android.graphics.drawable.Drawable;
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
import com.crrepa.band.my.health.heartrate.presenter.f;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.e;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.highlight.d;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.m;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class HeartRateDayStatisticsFragment extends BaseFragement implements e {
    private static final int DAY_MINUTES = 1440;
    private static final int DELAY_DISPLAY_TIME = 3;
    private int averageHr;
    private FragmentHeartRateDayStatisticsBinding binding;
    private Disposable displaySubscribe;
    private Date statisticsDate;
    private int lastSelectedIndex = -1;
    private int intervalMinutes = 5;
    private boolean isContinueHeartRate = false;
    private f presenter = new f();

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
            HeartRateDayStatisticsFragment.this.redisplayAverageHr();
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            HeartRateDayStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            HeartRateDayStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
            HeartRateDayStatisticsFragment.this.cancelRedisplayAverageHr();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            HeartRateDayStatisticsFragment heartRateDayStatisticsFragment = HeartRateDayStatisticsFragment.this;
            heartRateDayStatisticsFragment.setAverageHr(heartRateDayStatisticsFragment.averageHr);
            HeartRateDayStatisticsFragment heartRateDayStatisticsFragment2 = HeartRateDayStatisticsFragment.this;
            heartRateDayStatisticsFragment2.renderStatisticsDate(heartRateDayStatisticsFragment2.statisticsDate);
            HeartRateDayStatisticsFragment.this.setHeartRateType(R.string.training_average_hr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRedisplayAverageHr() {
        Disposable disposable = this.displaySubscribe;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private void initView() {
        this.binding.tvUnit.setText(R.string.heart_rate_unit);
        this.binding.rlHeartRateChart.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color_heart_rate));
    }

    public static HeartRateDayStatisticsFragment newInstance(Date date) {
        HeartRateDayStatisticsFragment heartRateDayStatisticsFragment = new HeartRateDayStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        heartRateDayStatisticsFragment.setArguments(bundle);
        return heartRateDayStatisticsFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redisplayAverageHr() {
        this.displaySubscribe = Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageHr(int i8) {
        FragmentHeartRateDayStatisticsBinding fragmentHeartRateDayStatisticsBinding = this.binding;
        if (fragmentHeartRateDayStatisticsBinding != null) {
            fragmentHeartRateDayStatisticsBinding.tvAverageHr.setText(String.valueOf(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateType(int i8) {
        String string = getString(i8, "");
        FragmentHeartRateDayStatisticsBinding fragmentHeartRateDayStatisticsBinding = this.binding;
        if (fragmentHeartRateDayStatisticsBinding != null) {
            fragmentHeartRateDayStatisticsBinding.tvHrType.setText(string);
        }
    }

    private void setStatisticsDate(Date date, int i8) {
        String format = m.format(date, getString(i8));
        FragmentHeartRateDayStatisticsBinding fragmentHeartRateDayStatisticsBinding = this.binding;
        if (fragmentHeartRateDayStatisticsBinding != null) {
            fragmentHeartRateDayStatisticsBinding.tvStatisticsDate.setText(format);
        }
    }

    private void showHandleView() {
        this.binding.hrHandleView.setHandleView(R$drawable.handle_hr);
        this.binding.hrHandleView.setHandleLine(R$drawable.line_handle_heart_rate);
        this.binding.hrHandleView.setOnHandleDrawChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void showScrollHighlight(int i8, int i9) {
        d highlightByTouchPoint = this.binding.heartRateChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        int x7 = (int) highlightByTouchPoint.getX();
        if (x7 == this.lastSelectedIndex) {
            return;
        }
        int y7 = (int) highlightByTouchPoint.getY();
        setAverageHr(y7);
        updateSelectedTime(x7);
        if (this.isContinueHeartRate && y7 == 0) {
            v4.f fVar = (v4.f) ((k) this.binding.heartRateChart.getData()).getDataSets().get(0);
            x7++;
            if (x7 < fVar.getEntryCount()) {
                setAverageHr((int) fVar.getEntryForIndex(x7).getY());
                updateSelectedTime(x7);
            }
        }
        if (this.isContinueHeartRate) {
            return;
        }
        this.lastSelectedIndex = x7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHandleViewPosition(int i8, int i9) {
        this.binding.hrHandleView.updatePosition(i8, i9);
    }

    private void updateSelectedTime(int i8) {
        com.orhanobut.logger.f.d("index: " + i8);
        Calendar calendar = com.moyoung.dafit.module.common.utils.k.getCalendar();
        calendar.setTime(this.statisticsDate);
        calendar.set(11, 0);
        calendar.set(12, i8 * this.intervalMinutes);
        setStatisticsDate(calendar.getTime(), R.string.hour_minute_format_12);
        setHeartRateType(R.string.training_hr);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentHeartRateDayStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        cancelRedisplayAverageHr();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initView();
        this.presenter.getHeartRateStatisticsData((Date) getArguments().getSerializable("statistics_date"));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.crrepa.band.my.health.widgets.e
    public void renderAverageHr(int i8) {
        this.averageHr = i8;
        setAverageHr(i8);
    }

    @Override // com.crrepa.band.my.health.widgets.e
    public void renderHeartRtaeList(List<Float> list, Date date) {
        this.isContinueHeartRate = list.size() == DAY_MINUTES;
        showHandleView();
        this.binding.dayAxisTimeView.setVisibility(0);
        this.binding.dayAxisTimeView.setTextColor(R.color.white);
        this.intervalMinutes = DAY_MINUTES / list.size();
        this.binding.heartRateChart.setVisibility(0);
        this.binding.heartRateChart.init(list.size());
        this.binding.heartRateChart.setXAxisLineColor(R.color.white);
        this.binding.heartRateChart.setXAxisLineWidth(1);
        this.binding.heartRateChart.setXAxisTextColor(R.color.white);
        this.binding.heartRateChart.hideXAxisLabels();
        this.binding.heartRateChart.setAnimate();
        this.binding.heartRateChart.setMaxValue(210.0f);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.fade_training_statistics_heart_rate_chart);
        int color = ContextCompat.getColor(getContext(), R.color.white);
        list.add(0, Float.valueOf(0.0f));
        this.binding.heartRateChart.setData(list, drawable, color, 1.8f);
    }

    @Override // com.crrepa.band.my.health.widgets.e
    public void renderStatisticsDate(Date date) {
        this.statisticsDate = date;
        this.binding.llStatisticsDate.setVisibility(0);
        setStatisticsDate(date, R.string.year_month_day_format);
        setHeartRateType(R.string.training_average_hr);
    }
}
