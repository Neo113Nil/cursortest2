package com.crrepa.band.my.health.bloodoxygen;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentTimingBloodOxygenStatisticsBinding;
import com.crrepa.band.my.health.base.d;
import com.crrepa.band.my.health.bloodoxygen.presenter.b;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.n;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BandTimerBloodOxygenStatisticsFragment extends BaseVBFragment<FragmentTimingBloodOxygenStatisticsBinding> implements h2.a {
    private final b presenter = new b();

    private void initView() {
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLastStatistics.tvDataType.setText(R.string.average_blood_oxygen);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPart.setTextColor(ContextCompat.getColor(getContext(), R.color.color_blood_oxygen));
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPartUnit.setText(R.string.percent_unit);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateSecondPart.setVisibility(8);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateSecondPartUnit.setVisibility(8);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_days_average_bo);
    }

    public static BandTimerBloodOxygenStatisticsFragment newInstance(Date date) {
        BandTimerBloodOxygenStatisticsFragment bandTimerBloodOxygenStatisticsFragment = new BandTimerBloodOxygenStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        bandTimerBloodOxygenStatisticsFragment.setArguments(bundle);
        return bandTimerBloodOxygenStatisticsFragment;
    }

    private void setMeasureTime() {
        String formatPeriodTime = m3.a.formatPeriodTime(getContext(), 0, 0);
        String formatPeriodTime2 = m3.a.formatPeriodTime(getContext(), 24, 0);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).tvStartMeasureTime.setText(formatPeriodTime);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).tvStopMeasureTime.setText(formatPeriodTime2);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    public void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.destroy();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initView();
        setMeasureTime();
        this.presenter.getBloodOxygen((Date) getArguments().getSerializable("statistics_date"));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // h2.a
    public void renderBloodOxygen(int i8, int i9, int i10) {
        if (i8 <= 0) {
            return;
        }
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPart.setText(n.formatTemp(i8));
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeBloodOxygenExtremes.tvMinBo.setText(n.formatTemp(i9));
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeBloodOxygenExtremes.tvMaxBo.setText(n.formatTemp(i10));
    }

    @Override // h2.a
    public void renderLast7DaysAverageBo(List<Float> list, Date[] dateArr) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(100.0f);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMinValue(80.0f);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new f5.a(list));
        int color = ContextCompat.getColor(getContext(), R.color.color_blood_oxygen);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, list);
        ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMarkerView((MarkerView) new MeasureDateMarkerView(getContext(), dateArr, getString(R.string.year_month_day_format), color));
    }

    @Override // h2.a
    public void renderStatisticsDate(Date date) {
        d.setBandDataStatisticsDate(getContext(), ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).includeLastStatistics.tvSyncDate, date);
    }

    @Override // h2.a
    public void renderTodayBoList(List<Float> list) {
        m3.b bVar = new m3.b(getContext(), ((FragmentTimingBloodOxygenStatisticsBinding) this.binding).bloodOxygenChart);
        bVar.initChart();
        bVar.setChartData(list);
        int size = 1440 / list.size();
        bVar.setMarkerView(size, size);
    }
}
