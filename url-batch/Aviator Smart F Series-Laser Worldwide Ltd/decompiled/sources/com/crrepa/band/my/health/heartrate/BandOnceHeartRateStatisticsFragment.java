package com.crrepa.band.my.health.heartrate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentOnceHeartRateMeasureBinding;
import com.crrepa.band.my.health.base.BaseStatisticsFragment;
import com.crrepa.band.my.health.base.d;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.heartrate.presenter.c;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.crrepa.band.my.model.db.OnceHeartRate;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.instructions.utils.InstructionsType;
import java.util.Date;
import java.util.List;
import m3.i;

/* loaded from: classes2.dex */
public class BandOnceHeartRateStatisticsFragment extends BaseStatisticsFragment implements r2.b {
    private static final float MAX_HEART_RATE_BAR_VALUE = 210.0f;
    private FragmentOnceHeartRateMeasureBinding binding;
    private c presenter = new c();
    private i segmentBarProxy = new i();

    private void getHeartRateStatisticsData() {
        this.presenter.getOnceHeartRateData(getArguments().getLong("statistics_id"));
    }

    private void initHeartRateSegementView() {
        this.segmentBarProxy.createBarView(this.binding.includeOnceHeartRateStatistics.includeHrSegment.heartRateSliderBar, q2.b.getHeartRateSegmentValues(UserAgeProvider.getUserAge()), q2.b.getHeartRateSegmentColors(getContext()));
        setHeartRateSegmentValue(-1);
    }

    private void initLast7TimesHeartRateTrendChart() {
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(210.0f);
    }

    private void initView() {
        this.binding.includeOnceHeartRateStatistics.includeLastStatistics.tvDataType.setText(R.string.lower_case_heart_rate);
        this.binding.includeOnceHeartRateStatistics.includeLastStatistics.includeBandData.tvDateFirstPart.setTextColor(ContextCompat.getColor(getContext(), R.color.color_heart_rate));
        this.binding.includeOnceHeartRateStatistics.includeLastStatistics.includeBandData.tvDateFirstPartUnit.setText(R.string.heart_rate_unit);
        this.binding.includeOnceHeartRateStatistics.includeLastStatistics.includeBandData.tvDateSecondPart.setVisibility(8);
        this.binding.includeOnceHeartRateStatistics.includeLastStatistics.includeBandData.tvDateSecondPartUnit.setVisibility(8);
        this.binding.includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_times_heart_rate_trend);
        ImageView imageView = (ImageView) getView().findViewById(R.id.iv_help);
        imageView.setVisibility(0);
        com.moyoung.instructions.c.hook(InstructionsType.HEART_RATE, imageView);
    }

    public static BandOnceHeartRateStatisticsFragment newInstance(long j8) {
        BandOnceHeartRateStatisticsFragment bandOnceHeartRateStatisticsFragment = new BandOnceHeartRateStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bandOnceHeartRateStatisticsFragment.setArguments(bundle);
        return bandOnceHeartRateStatisticsFragment;
    }

    private void setHeartRateSegmentValue(int i8) {
        this.segmentBarProxy.setSlider(this.binding.includeOnceHeartRateStatistics.includeHrSegment.heartRateSliderBar, i8);
    }

    private void showMeasureButtonVisible(boolean z7) {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandOnceHeartRateStatisticsActivity) {
            ((BandOnceHeartRateStatisticsActivity) activity).showMeasureButton(z7);
        }
    }

    @Override // r2.b
    public void measureComplete() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandOnceHeartRateStatisticsActivity) {
            ((BandOnceHeartRateStatisticsActivity) activity).measureComplete();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FragmentOnceHeartRateMeasureBinding inflate = FragmentOnceHeartRateMeasureBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        NestedScrollView root = inflate.getRoot();
        this.presenter.setView(this);
        return root;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.destroy();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        showMeasureButtonVisible(!z7);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initView();
        setActivityMenuVisible(true);
        initHeartRateSegementView();
        initLast7TimesHeartRateTrendChart();
        getHeartRateStatisticsData();
        showMeasureButtonVisible(true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.presenter.resume();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // r2.b
    public void renderLast7TimesOnceHeartRate(List<Float> list, Date[] dateArr) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        int color = ContextCompat.getColor(getContext(), R.color.color_once_hr_bar);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new f5.a(list));
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineWidth(1);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineColor(R.color.color_once_hr_bar);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, list);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMarkerView((MarkerView) new MeasureDateMarkerView(getContext(), dateArr, j.getSyncTimeFormat(getContext()), color));
    }

    @Override // r2.b
    public void renderOnceHeartRate(OnceHeartRate onceHeartRate) {
        int intValue;
        String valueOf;
        Date date;
        if (onceHeartRate == null) {
            date = new Date();
            valueOf = getContext().getString(R.string.data_blank);
            intValue = -1;
        } else {
            Date date2 = onceHeartRate.getDate();
            intValue = onceHeartRate.getHeartRate().intValue();
            valueOf = String.valueOf(intValue);
            date = date2;
        }
        d.setBandDataStatisticsDate(getContext(), this.binding.includeOnceHeartRateStatistics.includeLastStatistics.tvSyncDate, date);
        this.binding.includeOnceHeartRateStatistics.includeLastStatistics.includeBandData.tvDateFirstPart.setText(valueOf);
        setHeartRateSegmentValue(intValue);
    }
}
