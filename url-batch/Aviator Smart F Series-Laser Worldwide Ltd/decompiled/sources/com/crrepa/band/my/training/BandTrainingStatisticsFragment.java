package com.crrepa.band.my.training;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentTrainingStatisticsBinding;
import com.crrepa.band.my.databinding.IncludeTrainingPathOneDistancePaceBinding;
import com.crrepa.band.my.databinding.IncludeTrainingPathRealTimePaceBinding;
import com.crrepa.band.my.databinding.IncludeTrainingPathStepsBinding;
import com.crrepa.band.my.health.base.BaseStatisticsFragment;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.model.GpsLocation;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.adapter.OneDistancePaceAdapter;
import com.crrepa.band.my.training.gomoresport.GomoreSportTipsDialog;
import com.crrepa.band.my.training.gomoresport.path.BandTrainingGomoreDataAdapter;
import com.crrepa.band.my.training.map.BaseMapTrainingActivity;
import com.crrepa.band.my.training.map.view.p;
import com.crrepa.band.my.training.presenter.BandTrainingStatisticsPresenter;
import com.crrepa.band.my.training.widgets.TrainingEffectProgressView;
import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class BandTrainingStatisticsFragment extends BaseStatisticsFragment implements x3.a {
    private static final int DELAY_DISPLAY_TIME = 3;
    private FragmentTrainingStatisticsBinding binding;
    private Disposable displaySubscribe;
    private BandTrainingGomoreDataAdapter gomoreDataAdapter;
    private int hrInterval;
    private Date startTrainingDate;
    private int trainingAverageHr;
    private String trainingName;
    private final BandTrainingStatisticsPresenter presenter = new BandTrainingStatisticsPresenter();
    private int lastSelectedIndex = -1;

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
            BandTrainingStatisticsFragment.this.redisplayTrainingData();
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            BandTrainingStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            BandTrainingStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
            BandTrainingStatisticsFragment.this.cancelRedisplayAverageHr();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            BandTrainingStatisticsFragment bandTrainingStatisticsFragment = BandTrainingStatisticsFragment.this;
            bandTrainingStatisticsFragment.setTrainingAverageHr(String.valueOf(bandTrainingStatisticsFragment.trainingAverageHr));
            BandTrainingStatisticsFragment bandTrainingStatisticsFragment2 = BandTrainingStatisticsFragment.this;
            bandTrainingStatisticsFragment2.renderTrainingDate(bandTrainingStatisticsFragment2.startTrainingDate);
            BandTrainingStatisticsFragment bandTrainingStatisticsFragment3 = BandTrainingStatisticsFragment.this;
            bandTrainingStatisticsFragment3.renderTrainingName(bandTrainingStatisticsFragment3.trainingName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRedisplayAverageHr() {
        Disposable disposable = this.displaySubscribe;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    private void getTrainingStatisticsData() {
        this.presenter.getTrainingStatisticsData(requireContext(), getArguments().getLong("statistics_id"), getArguments().getInt("measure_data_type"));
    }

    private void initElevationChart(CrpLineChart crpLineChart) {
        crpLineChart.init(0);
        crpLineChart.hideXAxisLabels();
        crpLineChart.setLeftAxis(3);
        crpLineChart.getAxisLeft().setDrawZeroLine(false);
        crpLineChart.getAxisLeft().setDrawGridLines(true);
        crpLineChart.getAxisLeft().setGridLineWidth(1.0f);
        crpLineChart.getAxisLeft().setGridColor(ContextCompat.getColor(requireContext(), R.color.color_gps_training_33));
        crpLineChart.getAxisLeft().setTextColor(ContextCompat.getColor(requireContext(), R.color.dark_grey));
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisLineColor(R.color.color_gps_training);
    }

    private void initGomoreDataRv() {
        this.binding.includeGomoreSportDetail.rvGomoreSport.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        BandTrainingGomoreDataAdapter bandTrainingGomoreDataAdapter = new BandTrainingGomoreDataAdapter(requireActivity());
        this.gomoreDataAdapter = bandTrainingGomoreDataAdapter;
        this.binding.includeGomoreSportDetail.rvGomoreSport.setAdapter(bandTrainingGomoreDataAdapter);
    }

    private void initHandleView() {
        this.binding.includeHeartRateDayStatistics.hrHandleView.setHandleLine(R$drawable.line_handle_training);
        this.binding.includeHeartRateDayStatistics.hrHandleView.setHandleView(R$drawable.handle_training);
        this.binding.includeHeartRateDayStatistics.hrHandleView.setOnHandleDrawChangeListener(new a());
    }

    private void initRealTimePaceChart(CrpLineChart crpLineChart) {
        crpLineChart.init(0);
        crpLineChart.hideXAxisLabels();
        crpLineChart.setLeftAxis(3);
        crpLineChart.getAxisLeft().setDrawZeroLine(false);
        crpLineChart.getAxisLeft().setDrawGridLines(true);
        crpLineChart.getAxisLeft().setGridLineWidth(1.0f);
        crpLineChart.getAxisLeft().setGridColor(ContextCompat.getColor(requireContext(), R.color.main_33));
        crpLineChart.getAxisLeft().setTextColor(ContextCompat.getColor(requireContext(), R.color.dark_grey));
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisLineColor(R.color.main);
        crpLineChart.getAxisLeft().setValueFormatter(new com.crrepa.band.my.training.widgets.a());
    }

    private void initStepsInfoChart(CrpLineChart crpLineChart) {
        crpLineChart.init(5);
        crpLineChart.hideXAxisLabels();
        crpLineChart.setLeftAxis();
        crpLineChart.getAxisLeft().setDrawZeroLine(false);
        crpLineChart.getAxisLeft().setDrawGridLines(true);
        crpLineChart.getAxisLeft().setGridLineWidth(1.0f);
        crpLineChart.getAxisLeft().setGridColor(ContextCompat.getColor(requireContext(), R.color.assist_11_33_33));
        crpLineChart.getAxisLeft().setTextColor(ContextCompat.getColor(requireContext(), R.color.assist_11_33));
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisLineColor(R.color.assist_11_33);
    }

    private void initView() {
        this.binding.tvDataType.setText(R.string.total_run_time);
        int color = ContextCompat.getColor(getContext(), R.color.color_training);
        this.binding.includeBandData.tvDateFirstPart.setTextColor(color);
        this.binding.includeBandData.tvDateFirstPartUnit.setVisibility(8);
        this.binding.includeBandData.tvDateSecondPart.setVisibility(8);
        this.binding.includeBandData.tvDateSecondPartUnit.setVisibility(8);
        this.binding.includeHeartRateAnalysis.includeHrAnalysisDescription.tvFindHeartRate.setTextColor(color);
        this.binding.includeHeartRateAnalysis.includeHrAnalysisDescription.tvRestingDescription.setTextColor(color);
        this.binding.includeHeartRateAnalysis.includeHrAnalysisDescription.tvActiveDescription.setTextColor(color);
        this.binding.includeHeartRateAnalysis.includeHrAnalysisDescription.heartRateDescription.setBackgroundResource(R.drawable.shape_training_heart_rate_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreEnergySource$4(View view) {
        showGomoreTipsDialog(R.string.training_energy_source, R.string.training_desc_energy_source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreRecoveryTime$5(View view) {
        showGomoreTipsDialog(R.string.training_recovery_time, R.string.training_recovery_desc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreRunningPose$1(View view) {
        showGomoreTipsDialog(R.string.training_running_form, R.string.training_desc_stance_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreSwimmingPose$2(View view) {
        showGomoreTipsDialog(R.string.swim_stroke_recognition, R.string.swim_stroke_recognition_desc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderGomoreTrainingEffect$3(View view) {
        showGomoreTipsDialog(R.string.training_effect, R.string.training_desc_training_effect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTrainingPath$0(List list) {
        com.orhanobut.logger.f.d("onMapLoaded");
        this.binding.mapView.drawTrainingPath(list);
    }

    public static BandTrainingStatisticsFragment newInstance(long j8, int i8) {
        BandTrainingStatisticsFragment bandTrainingStatisticsFragment = new BandTrainingStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bundle.putInt("measure_data_type", i8);
        bandTrainingStatisticsFragment.setArguments(bundle);
        return bandTrainingStatisticsFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redisplayTrainingData() {
        this.displaySubscribe = Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrainingAverageHr(String str) {
        FragmentTrainingStatisticsBinding fragmentTrainingStatisticsBinding;
        if (TextUtils.isEmpty(str) || (fragmentTrainingStatisticsBinding = this.binding) == null) {
            return;
        }
        fragmentTrainingStatisticsBinding.includeHeartRateDayStatistics.tvAverageHr.setText(str);
    }

    private void setTrainingHr(String str) {
        this.binding.includeHeartRateDayStatistics.tvHrType.setText(str);
    }

    private void setTrainingTime(String str) {
        this.binding.includeHeartRateDayStatistics.tvStatisticsDate.setText(str);
    }

    private void showGomoreTipsDialog(@StringRes int i8, @StringRes int i9) {
        GomoreSportTipsDialog gomoreSportTipsDialog = new GomoreSportTipsDialog(requireActivity());
        gomoreSportTipsDialog.showData(i8, i9);
        gomoreSportTipsDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = this.binding.includeHeartRateDayStatistics.heartRateChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        int x7 = (int) highlightByTouchPoint.getX();
        if (x7 == this.lastSelectedIndex) {
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
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.startTrainingDate);
        calendar.add(13, i8 * this.hrInterval);
        setTrainingTime(com.moyoung.dafit.module.common.utils.m.format(calendar.getTime(), com.crrepa.band.my.health.base.j.getTrainingHeartRateTimeFormat(getContext(), this.hrInterval)));
        setTrainingHr(getString(R.string.training_hr, this.trainingName));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.binding.mapView.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentTrainingStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        this.binding.mapView.setMapType(com.crrepa.band.my.training.utils.h.getMapType(getContext()));
        FragmentTrainingStatisticsBinding fragmentTrainingStatisticsBinding = this.binding;
        fragmentTrainingStatisticsBinding.mapView.setScrollView(fragmentTrainingStatisticsBinding.scrollWheelTraining);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding.mapView.onDestroy();
        this.presenter.destroy();
        cancelRedisplayAverageHr();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        if (z7) {
            return;
        }
        renderTrainingName(this.trainingName);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        setActivityMenuVisible(true);
        initGomoreDataRv();
        initView();
        initHandleView();
        getTrainingStatisticsData();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.binding.mapView.onLowMemory();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.binding.mapView.onPause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.binding.mapView.onResume();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FragmentTrainingStatisticsBinding fragmentTrainingStatisticsBinding = this.binding;
        if (fragmentTrainingStatisticsBinding != null) {
            fragmentTrainingStatisticsBinding.mapView.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.binding.mapView.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.binding.mapView.onStop();
    }

    @Override // x3.a
    public void renderAverageHeartRate(int i8) {
        if (i8 <= 0) {
            this.binding.includeHeartRateDayStatistics.rlHeartRateChart.setVisibility(8);
            this.binding.includeBasketballHeartRateStatistics.llBasketballAverageHeartRate.setVisibility(8);
            this.binding.includeRunHeartRateStatistics.llRunAverageHeartRate.setVisibility(8);
            this.binding.includeHeartRateAnalysis.llHeartRateAnalysis.setVisibility(8);
            return;
        }
        this.trainingAverageHr = i8;
        String valueOf = String.valueOf(i8);
        this.binding.includeRunHeartRateStatistics.tvRunAverageHeartRate.setText(valueOf);
        this.binding.includeBasketballHeartRateStatistics.tvBasketballAverageHeartRate.setText(valueOf);
        setTrainingAverageHr(valueOf);
    }

    @Override // x3.a
    public void renderBallStatisticsView() {
        this.binding.includeBasketballHeartRateStatistics.rlBasketballHeartRateStatisticsView.setVisibility(0);
    }

    @Override // x3.a
    public void renderCalories(float f8) {
        com.crrepa.band.my.health.base.d.setBandMeasureFloatData(getContext(), this.binding.includeRunHeartRateStatistics.tvRunCalorie, f8);
        com.crrepa.band.my.health.base.d.setBandMeasureFloatData(getContext(), this.binding.includeBasketballHeartRateStatistics.tvBasketballCalorie, f8);
    }

    @Override // x3.a
    public void renderDistance(int i8) {
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        this.binding.includeRunHeartRateStatistics.tvRunDistanceUnit.setText(com.crrepa.band.my.health.base.a.getActionDistanceUnit(i8, unitSystem));
        this.binding.includeRunHeartRateStatistics.tvRunDistance.setText(com.crrepa.band.my.health.base.a.getActionDistance(i8, unitSystem));
    }

    @Override // x3.a
    public void renderElevationChart(Date date, Date date2, List<Float> list, String str, String str2, String str3, String str4, String str5) {
        this.binding.includeElevation.llElevationChart.setVisibility(0);
        CrpLineChart crpLineChart = this.binding.includeElevation.chartElevation;
        initElevationChart(crpLineChart);
        int intValue = ((Float) Collections.max(list)).intValue();
        if (intValue % 10 != 0) {
            intValue = ((intValue / 10) * 10) + 10;
        }
        int intValue2 = ((Float) Collections.min(list)).intValue();
        if (intValue2 % 10 != 0) {
            intValue2 = ((intValue2 / 10) * 10) - 10;
        }
        if (intValue == intValue2) {
            intValue2 -= 10;
        }
        crpLineChart.setMaxValue(intValue);
        crpLineChart.setMinValue(intValue2);
        crpLineChart.setData(list, ContextCompat.getDrawable(requireContext(), R.drawable.fade_elevation_chart), ContextCompat.getColor(requireContext(), R.color.color_gps_training), 2.0f);
        this.binding.includeElevation.tvLowestElevation.setText(str2);
        this.binding.includeElevation.tvAverageElevation.setText(str);
        this.binding.includeElevation.tvHighestElevation.setText(str3);
        this.binding.includeElevation.tvGainCumulative.setText(str4);
        this.binding.includeElevation.tvLossCumulative.setText(str5);
        this.binding.includeElevation.tvStartTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(requireContext(), date));
        this.binding.includeElevation.tvEndTime.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(requireContext(), date2));
    }

    @Override // x3.a
    public void renderGomoreDetailData(List<com.crrepa.band.my.training.gomoresport.path.a> list) {
        this.binding.includeRunHeartRateStatistics.llRunHeartRateStatisticsView.setVisibility(8);
        this.binding.includeBasketballHeartRateStatistics.rlBasketballHeartRateStatisticsView.setVisibility(8);
        this.binding.includeGomoreSportDetail.llGomoreSportStatisticsView.setVisibility(0);
        this.gomoreDataAdapter.setNewData(list);
    }

    @Override // x3.a
    public void renderGomoreEnergySource(int i8, int i9) {
        this.binding.includeEnergySource.llGomoreSportEnergySource.setVisibility(0);
        this.binding.includeEnergySource.tvEnergyFat.setText(String.valueOf(i8));
        this.binding.includeEnergySource.tvEnergyCarb.setText(String.valueOf(i9));
        this.binding.includeEnergySource.tvEnergySourceTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandTrainingStatisticsFragment.this.lambda$renderGomoreEnergySource$4(view);
            }
        });
    }

    @Override // x3.a
    public void renderGomoreRecoveryTime(int i8) {
        this.binding.includeRecoveryTime.rlGomoreSportRecoveryTime.setVisibility(0);
        this.binding.includeRecoveryTime.tvRecoveryTime.setText(com.moyoung.dafit.module.common.utils.n.format(i8 / 3600, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN) + ":" + com.moyoung.dafit.module.common.utils.n.format((i8 % 3600) / 60, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN) + ":" + com.moyoung.dafit.module.common.utils.n.format(i8 % 60, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN));
        this.binding.includeRecoveryTime.tvRecoveryTimeTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandTrainingStatisticsFragment.this.lambda$renderGomoreRecoveryTime$5(view);
            }
        });
    }

    @Override // x3.a
    public void renderGomoreRunningPose(CRPTrainingAdvancedInfo.RunningInfo runningInfo) {
        this.binding.includeRunningPose.llGomoreSportRunningPose.setVisibility(0);
        float averageTouchDownTime = runningInfo.getAverageTouchDownTime();
        String str = HttpClient.ENDFLAG;
        this.binding.includeRunningPose.tvAvgStanceTime.setText(averageTouchDownTime > 0.0f ? String.valueOf((int) averageTouchDownTime) : HttpClient.ENDFLAG);
        if (runningInfo.getAverageBalance() > 0.0f) {
            String format = String.format(Locale.getDefault(), "%.2f", Double.valueOf(Math.floor(r0 * 100.0f) / 100.0d));
            this.binding.includeRunningPose.tvAvgStanceBalanceLeft.setText(format);
            this.binding.includeRunningPose.tvAvgStanceBalanceRight.setText((100.0f - Float.parseFloat(format)) + "");
        }
        float averageShakeAmplitude = runningInfo.getAverageShakeAmplitude();
        this.binding.includeRunningPose.tvAvgVerticalOscillation.setText(averageShakeAmplitude > 0.0f ? String.valueOf((int) averageShakeAmplitude) : HttpClient.ENDFLAG);
        float averagePower = runningInfo.getAveragePower();
        if (averagePower > 0.0f) {
            str = String.valueOf((int) averagePower);
        }
        this.binding.includeRunningPose.tvAvgRunPower.setText(str);
        this.binding.includeRunningPose.tvRunningPoseTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandTrainingStatisticsFragment.this.lambda$renderGomoreRunningPose$1(view);
            }
        });
    }

    @Override // x3.a
    public void renderGomoreSwimmingPose(CRPTrainingAdvancedInfo.SwimmingInfo swimmingInfo) {
        this.binding.includeSwimmingPose.llGomoreSportSwimmingPose.setVisibility(0);
        this.binding.includeSwimmingPose.tvSwimStyleFrontCrawl.setText(String.valueOf(swimmingInfo.getFreeSwimming()));
        this.binding.includeSwimmingPose.tvSwimStyleBreaststroke.setText(String.valueOf(swimmingInfo.getFrogSwimming()));
        this.binding.includeSwimmingPose.tvSwimStyleBackstroke.setText(String.valueOf(swimmingInfo.getBackstroke()));
        this.binding.includeSwimmingPose.tvSwimStyleSwimStyleButterfly.setText(String.valueOf(swimmingInfo.getButterflySwimming()));
        int mainSwimmingPose = swimmingInfo.getMainSwimmingPose();
        this.binding.includeSwimmingPose.tvSwimType.setText(mainSwimmingPose != 2 ? mainSwimmingPose != 3 ? mainSwimmingPose != 4 ? mainSwimmingPose != 5 ? R.string.swim_style_front_crawl : R.string.swim_style_mix : R.string.swim_style_butterfly : R.string.swim_style_backstroke : R.string.swim_style_breaststroke);
        this.binding.includeSwimmingPose.tvSwimmingPoseTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandTrainingStatisticsFragment.this.lambda$renderGomoreSwimmingPose$2(view);
            }
        });
    }

    @Override // x3.a
    public void renderGomoreTrainingEffect(float f8, String str, float f9, String str2) {
        this.binding.includeTrainingEffect.llGomoreSportTrainingEffect.setVisibility(0);
        this.binding.includeTrainingEffect.tvAerobic.setText(String.valueOf(f8));
        this.binding.includeTrainingEffect.tvAerobicLevel.setText(str);
        this.binding.includeTrainingEffect.tvAnaerobic.setText(String.valueOf(f9));
        this.binding.includeTrainingEffect.tvAnaerobicLevel.setText(str2);
        TrainingEffectProgressView trainingEffectProgressView = this.binding.includeTrainingEffect.chartAerobic;
        trainingEffectProgressView.setProgress((int) (f8 * 10.0f));
        trainingEffectProgressView.setMax(60);
        trainingEffectProgressView.setProgressColor(getResources().getColor(R.color.training_main_2_btn));
        trainingEffectProgressView.setBackgroundColor(getResources().getColor(R.color.assist_4));
        TrainingEffectProgressView trainingEffectProgressView2 = this.binding.includeTrainingEffect.chartAnaerobic;
        trainingEffectProgressView2.setProgress((int) (f9 * 10.0f));
        trainingEffectProgressView2.setMax(60);
        trainingEffectProgressView2.setProgressColor(getResources().getColor(R.color.training_main_2_btn));
        trainingEffectProgressView2.setBackgroundColor(getResources().getColor(R.color.assist_4));
        this.binding.includeTrainingEffect.tvTrainingEffectTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandTrainingStatisticsFragment.this.lambda$renderGomoreTrainingEffect$3(view);
            }
        });
    }

    @Override // x3.a
    public void renderGomoreVo2max(String str) {
        this.binding.includeVo2max.rlGomoreSportVo2max.setVisibility(0);
        this.binding.includeVo2max.tvVo2max.setText(str);
    }

    @Override // x3.a
    public void renderHeartRateChart(List<Float> list, Date date, int i8) {
        this.hrInterval = i8;
        this.binding.includeHeartRateDayStatistics.heartRateChart.setVisibility(0);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setMaxXLabelCount(2);
        this.binding.includeHeartRateDayStatistics.heartRateChart.init(list.size());
        this.binding.includeHeartRateDayStatistics.heartRateChart.setXAxisLineColor(R.color.white);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setXAxisLineWidth(1);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setXAxisTextColor(R.color.white);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setXAxisValueFormatter(new k3.b(requireContext(), date, i8, list.size()));
        this.binding.includeHeartRateDayStatistics.heartRateChart.setExtraLeftOffset(26.0f);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setExtraRightOffset(26.0f);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setAnimate();
        this.binding.includeHeartRateDayStatistics.heartRateChart.setMaxValue(210.0f);
        this.binding.includeHeartRateDayStatistics.heartRateChart.setData(list, ContextCompat.getDrawable(requireContext(), R.drawable.fade_training_statistics_heart_rate_chart), ContextCompat.getColor(requireContext(), R.color.white), 1.8f);
    }

    @Override // x3.a
    public void renderMetricSystem(boolean z7) {
        String string = getString(R.string.distance_unit_miles);
        if (z7) {
            string = getString(R.string.distance_unit_km);
        }
        this.binding.includeRunHeartRateStatistics.tvSpeedUnit.setText(String.format(getString(R.string.speed_unit), string));
    }

    @Override // x3.a
    public void renderOneDistancePaceChart(List<Float> list, String str, String str2) {
        this.binding.includeOneDistancePace.llOneDistancePaceChart.setVisibility(0);
        this.binding.includeOneDistancePace.rvPace.setLayoutManager(new LinearLayoutManager(requireContext()));
        OneDistancePaceAdapter oneDistancePaceAdapter = new OneDistancePaceAdapter(requireContext(), list);
        this.binding.includeOneDistancePace.rvPace.setAdapter(oneDistancePaceAdapter);
        oneDistancePaceAdapter.setNewData(OneDistancePaceAdapter.createOneDistancePaceList(list));
        IncludeTrainingPathOneDistancePaceBinding includeTrainingPathOneDistancePaceBinding = this.binding.includeOneDistancePace;
        TextView textView = includeTrainingPathOneDistancePaceBinding.tvLowestPace;
        TextView textView2 = includeTrainingPathOneDistancePaceBinding.tvFastestPace;
        textView.setText(str);
        textView2.setText(str2);
        IncludeTrainingPathOneDistancePaceBinding includeTrainingPathOneDistancePaceBinding2 = this.binding.includeOneDistancePace;
        TextView textView3 = includeTrainingPathOneDistancePaceBinding2.tvTitle;
        TextView textView4 = includeTrainingPathOneDistancePaceBinding2.tvDistanceUnit;
        if (BandUnitSystemProvider.isImperialSystem()) {
            textView3.setText(getString(R.string.gps_result_per_mile_speed_title));
            textView4.setText(getString(R.string.distance_unit_miles));
        } else {
            textView3.setText(getString(R.string.gps_result_per_kilometer_speed_title));
            textView4.setText(getString(R.string.distance_unit_km));
        }
    }

    @Override // x3.a
    public void renderPace(int i8) {
        if (i8 > 0) {
            this.binding.includeRunHeartRateStatistics.tvRunPace.setText(com.crrepa.band.my.training.utils.e.formatPace(i8));
        } else {
            this.binding.includeRunHeartRateStatistics.tvRunPace.setText(BaseMapTrainingActivity.DEFAULT_PACE);
        }
    }

    @Override // x3.a
    public void renderRealTimePaceChart(Date date, Date date2, List<Float> list, String str, String str2) {
        this.binding.includeRealTimePace.llRealTimePaceChart.setVisibility(0);
        CrpLineChart crpLineChart = this.binding.includeRealTimePace.chartRealTimePace;
        initRealTimePaceChart(crpLineChart);
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.set(i8, Float.valueOf(list.get(i8).floatValue() / 10.0f));
        }
        crpLineChart.setMaxValue(((Float) Collections.max(list)).floatValue());
        crpLineChart.setData(list, ContextCompat.getDrawable(requireContext(), R.drawable.fade_real_time_pace_chart), ContextCompat.getColor(requireContext(), R.color.main), 2.0f);
        IncludeTrainingPathRealTimePaceBinding includeTrainingPathRealTimePaceBinding = this.binding.includeRealTimePace;
        TextView textView = includeTrainingPathRealTimePaceBinding.tvAveragePace;
        TextView textView2 = includeTrainingPathRealTimePaceBinding.tvFastestPace;
        TextView textView3 = includeTrainingPathRealTimePaceBinding.tvStartTime;
        TextView textView4 = includeTrainingPathRealTimePaceBinding.tvEndTime;
        textView.setText(str);
        textView2.setText(str2);
        textView3.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(requireContext(), date));
        textView4.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(requireContext(), date2));
    }

    @Override // x3.a
    public void renderRefreshData() {
        getTrainingStatisticsData();
    }

    @Override // x3.a
    public void renderRunStatisticsView() {
        this.binding.includeRunHeartRateStatistics.llRunHeartRateStatisticsView.setVisibility(0);
    }

    @Override // x3.a
    public void renderSpeed(float f8) {
        com.crrepa.band.my.health.base.d.setBandMeasureFloatData(getContext(), this.binding.includeRunHeartRateStatistics.tvRunSpeed, f8);
    }

    @Override // x3.a
    public void renderSteps(int i8) {
        if (i8 > 0) {
            this.binding.includeBasketballHeartRateStatistics.llBasketballSteps.setVisibility(0);
            com.crrepa.band.my.health.base.d.setBandMeasureData(getContext(), this.binding.includeBasketballHeartRateStatistics.tvBasketballSteps, i8);
            this.binding.includeRunHeartRateStatistics.llRunSteps.setVisibility(0);
            com.crrepa.band.my.health.base.d.setBandMeasureData(getContext(), this.binding.includeRunHeartRateStatistics.tvRunSteps, i8);
        }
    }

    @Override // x3.a
    public void renderStepsInfoChart(Date date, Date date2, float f8, float f9, List<Float> list, float f10, float f11, List<Float> list2) {
        this.binding.includeStepsChart.llStepChart.setVisibility(0);
        this.binding.includeStepsChart.tvTitle.setText(getString(R.string.gps_training_stride_frequency_title));
        CrpLineChart crpLineChart = this.binding.includeStepsChart.chartSteps;
        initStepsInfoChart(crpLineChart);
        TextView textView = this.binding.includeStepsChart.tvAvgStrideTitle;
        textView.setText(getString(R.string.gps_training_stride_frequency_max_subtitle));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        TextView textView2 = this.binding.includeStepsChart.tvAvgStride;
        if (f11 <= 0.0f) {
            textView2.setText(R.string.data_blank);
        } else {
            textView2.setText(com.moyoung.dafit.module.common.utils.n.format(f11, com.moyoung.dafit.module.common.utils.n.TWO_DECIMAL_PATTERN));
        }
        this.binding.includeStepsChart.tvAvgRateTitle.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        TextView textView3 = this.binding.includeStepsChart.tvAvgRate;
        if (f10 <= 0.0f) {
            textView3.setText(R.string.data_blank);
        } else {
            textView3.setText(String.valueOf(f10));
        }
        IncludeTrainingPathStepsBinding includeTrainingPathStepsBinding = this.binding.includeStepsChart;
        TextView textView4 = includeTrainingPathStepsBinding.tvStartTime;
        TextView textView5 = includeTrainingPathStepsBinding.tvEndTime;
        textView4.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(requireContext(), date));
        textView5.setText(com.crrepa.band.my.training.utils.q.getTrainingTime(requireContext(), date2));
        crpLineChart.getAxisLeft().setAxisMaximum(f11 + (0.1f * f11));
        crpLineChart.setData(list2, ContextCompat.getColor(requireContext(), R.color.color_gps_training), 2.0f);
        this.binding.includeStepsChart.tvAvgStrideTips.setVisibility(8);
    }

    @Override // x3.a
    public void renderTrainingDate(Date date) {
        FragmentTrainingStatisticsBinding fragmentTrainingStatisticsBinding = this.binding;
        if (fragmentTrainingStatisticsBinding == null) {
            return;
        }
        this.startTrainingDate = date;
        fragmentTrainingStatisticsBinding.includeHeartRateDayStatistics.llStatisticsDate.setVisibility(0);
        String format = com.moyoung.dafit.module.common.utils.m.format(date, com.crrepa.band.my.health.base.j.getSyncTimeFormat(getContext()));
        this.binding.tvSyncDate.setText(format);
        setTrainingTime(format);
    }

    @Override // x3.a
    public void renderTrainingHeartRateAnalysis(int i8, int... iArr) {
        this.binding.includeHeartRateAnalysis.heartRateRangeAnalysis.setHeartRateRangeData(i8, iArr);
    }

    @Override // x3.a
    public void renderTrainingName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.trainingName = str;
        setActivityTitle(str);
        setTrainingHr(getString(R.string.training_average_hr, ""));
    }

    @Override // x3.a
    public void renderTrainingPath(final List<GpsLocation> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.binding.mapView.setVisibility(0);
        this.binding.mapView.setOnMapLoadedListener(new p.b() { // from class: com.crrepa.band.my.training.f
            @Override // com.crrepa.band.my.training.map.view.p.b
            public final void onMapLoaded() {
                BandTrainingStatisticsFragment.this.lambda$renderTrainingPath$0(list);
            }
        });
        this.binding.mapView.init(false);
    }

    @Override // x3.a
    public void renderTrainingTotalTime(int i8) {
        this.binding.includeBandData.tvDateFirstPart.setText(q2.a.getTrainingTime(getContext(), i8));
    }
}
