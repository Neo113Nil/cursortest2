package com.crrepa.band.my.health.heartrate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentActiveHeartRateStatisticsBinding;
import com.crrepa.band.my.health.base.BaseStatisticsFragment;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.training.utils.p;
import com.github.mikephil.charting.highlight.d;
import com.moyoung.dafit.module.common.utils.k;
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
public class BandActiveHeartRateStatisticsFragment extends BaseStatisticsFragment implements com.crrepa.band.my.health.widgets.a {
    private static final int DELAY_DISPLAY_TIME = 3;
    private FragmentActiveHeartRateStatisticsBinding binding;
    private Disposable displaySubscribe;
    private Date startTrainingDate;
    private int trainingAverageHr;
    private final com.crrepa.band.my.health.heartrate.presenter.b presenter = new com.crrepa.band.my.health.heartrate.presenter.b();
    private int lastSelectedIndex = -1;

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
            BandActiveHeartRateStatisticsFragment.this.redisplayTotalSleep();
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            BandActiveHeartRateStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            BandActiveHeartRateStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
            BandActiveHeartRateStatisticsFragment.this.cancelRedisplayTotalSteps();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            BandActiveHeartRateStatisticsFragment bandActiveHeartRateStatisticsFragment = BandActiveHeartRateStatisticsFragment.this;
            bandActiveHeartRateStatisticsFragment.setTrainingAverageHr(String.valueOf(bandActiveHeartRateStatisticsFragment.trainingAverageHr));
            BandActiveHeartRateStatisticsFragment.this.setHeartRateType(R.string.training_average_hr);
            BandActiveHeartRateStatisticsFragment bandActiveHeartRateStatisticsFragment2 = BandActiveHeartRateStatisticsFragment.this;
            bandActiveHeartRateStatisticsFragment2.renderTrainingDate(bandActiveHeartRateStatisticsFragment2.startTrainingDate);
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

    private String formatTrainingTime(Date date, int i8) {
        return m.format(date, getString(i8));
    }

    private void getActiveHeartRateStatisticsData() {
        this.presenter.getActiveHeartRateStatisticsData(getArguments().getLong("statistics_id"));
    }

    private void initHandleView() {
        this.binding.includeHeartRateDayStatistics.hrHandleView.setHandleLine(R$drawable.line_handle_training);
        this.binding.includeHeartRateDayStatistics.hrHandleView.setHandleView(R$drawable.handle_training);
        this.binding.includeHeartRateDayStatistics.hrHandleView.setOnHandleDrawChangeListener(new a());
    }

    private void initView() {
        int color = ContextCompat.getColor(getContext(), R.color.color_training);
        this.binding.includeHrAnalysis.includeHrAnalysisDescription.tvFindHeartRate.setTextColor(color);
        this.binding.includeHrAnalysis.includeHrAnalysisDescription.tvRestingDescription.setTextColor(color);
        this.binding.includeHrAnalysis.includeHrAnalysisDescription.tvActiveDescription.setTextColor(color);
        this.binding.includeHrAnalysis.includeHrAnalysisDescription.heartRateDescription.setBackgroundResource(R.drawable.shape_training_heart_rate_bg);
        setHeartRateType(R.string.training_average_hr);
    }

    public static BandActiveHeartRateStatisticsFragment newInstance(long j8) {
        BandActiveHeartRateStatisticsFragment bandActiveHeartRateStatisticsFragment = new BandActiveHeartRateStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bandActiveHeartRateStatisticsFragment.setArguments(bundle);
        return bandActiveHeartRateStatisticsFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redisplayTotalSleep() {
        this.displaySubscribe = Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateType(int i8) {
        this.binding.includeHeartRateDayStatistics.tvHrType.setText(getString(i8, getString(p.getTrainingHeartRateText())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrainingAverageHr(String str) {
        this.binding.includeHeartRateDayStatistics.tvAverageHr.setText(str);
    }

    private void setTrainingTime(String str) {
        this.binding.includeHeartRateDayStatistics.tvStatisticsDate.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        int x7;
        d highlightByTouchPoint = this.binding.includeHeartRateDayStatistics.heartRateChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        if (highlightByTouchPoint == null || (x7 = (int) highlightByTouchPoint.getX()) == this.lastSelectedIndex) {
            return;
        }
        setTrainingAverageHr(String.valueOf((int) highlightByTouchPoint.getY()));
        updateSelectedDate(x7);
        this.lastSelectedIndex = x7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHandleViewPosition(int i8, int i9) {
        this.binding.includeHeartRateDayStatistics.hrHandleView.updatePosition(i8, i9);
    }

    private void updateSelectedDate(int i8) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(this.startTrainingDate);
        calendar.add(12, i8);
        setTrainingTime(formatTrainingTime(calendar.getTime(), R.string.hour_minute_format_12));
        setHeartRateType(R.string.training_hr);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentActiveHeartRateStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.destroy();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        setActivityMenuVisible(true);
        initView();
        initHandleView();
        getActiveHeartRateStatisticsData();
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

    @Override // com.crrepa.band.my.health.widgets.a
    public void renderAverageHeartRate(int i8) {
        this.trainingAverageHr = i8;
        setTrainingAverageHr(String.valueOf(i8));
    }

    @Override // com.crrepa.band.my.health.widgets.a
    public void renderHeartRateAnalysis(int... iArr) {
        this.binding.includeHrAnalysis.heartRateRangeAnalysis.setHeartRateRangeData(60, iArr);
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        q2.a.setAnalysisTime(getContext(), this.binding.includeHrAnalysis.tvTotalMeasureTime, i8);
    }

    @Override // com.crrepa.band.my.health.widgets.a
    public void renderHeartRateList(List<Float> list, Date date) {
        this.binding.includeHeartRateDayStatistics.heartRateChart.setVisibility(0);
        this.binding.includeHeartRateDayStatistics.heartRateChart.init(list.size());
        this.binding.includeHeartRateDayStatistics.heartRateChart.setXAxisLineColor(R.color.white);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setXAxisLineWidth(1);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setXAxisTextColor(R.color.white);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setXAxisValueFormatter(new k3.b(getContext(), date, 60, list.size()));
        this.binding.includeHeartRateDayStatistics.heartRateChart.setAnimate();
        this.binding.includeHeartRateDayStatistics.heartRateChart.setMaxValue(210.0f);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setData(list, ContextCompat.getDrawable(getContext(), R.drawable.fade_training_statistics_heart_rate_chart), ContextCompat.getColor(getContext(), R.color.white), 1.8f);
    }

    @Override // com.crrepa.band.my.health.widgets.a
    public void renderTrainingDate(Date date) {
        this.startTrainingDate = date;
        this.binding.includeHeartRateDayStatistics.llData.setVisibility(0);
        setTrainingTime(m.format(date, j.getSyncTimeFormat(getContext())));
    }
}
