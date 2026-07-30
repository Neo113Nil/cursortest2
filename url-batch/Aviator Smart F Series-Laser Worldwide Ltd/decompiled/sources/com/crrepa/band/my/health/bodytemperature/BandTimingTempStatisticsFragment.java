package com.crrepa.band.my.health.bodytemperature;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentTimingTempStatisticsBinding;
import com.crrepa.band.my.health.base.d;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.n;
import java.util.Date;
import java.util.List;
import m2.c;
import m3.k;

/* loaded from: classes2.dex */
public class BandTimingTempStatisticsFragment extends BaseVBFragment<FragmentTimingTempStatisticsBinding> implements c {
    private final com.crrepa.band.my.health.bodytemperature.presenter.c presenter = new com.crrepa.band.my.health.bodytemperature.presenter.c();
    private boolean fahrenheit = BandTempSystemProvider.isFahrenheit();

    private void initView() {
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLastStatistics.tvDataType.setText(R.string.average_temperature);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPart.setTextColor(ContextCompat.getColor(getContext(), R.color.color_temperature));
        int i8 = this.fahrenheit ? R.string.fahrenheit_unit : R.string.celsius_unit;
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPartUnit.setText(i8);
        ((FragmentTimingTempStatisticsBinding) this.binding).tvHighestTemperatureUnit.setText(i8);
        ((FragmentTimingTempStatisticsBinding) this.binding).tvLowestTemperatureUnit.setText(i8);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateSecondPart.setVisibility(8);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateSecondPartUnit.setVisibility(8);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_days_average_temperature);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeAboutTemperature.tvNormalTemperature.setText(l2.c.getNormalTemperatureText(getContext(), this.fahrenheit));
        ((FragmentTimingTempStatisticsBinding) this.binding).includeAboutTemperature.tvFeverGrade.setText(l2.c.getFeverGradeText(getContext(), this.fahrenheit));
    }

    public static BandTimingTempStatisticsFragment newInstance(Date date) {
        BandTimingTempStatisticsFragment bandTimingTempStatisticsFragment = new BandTimingTempStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        bandTimingTempStatisticsFragment.setArguments(bundle);
        return bandTimingTempStatisticsFragment;
    }

    private void setMeasureTime() {
        String formatPeriodTime = m3.a.formatPeriodTime(getContext(), 0, 0);
        String formatPeriodTime2 = m3.a.formatPeriodTime(getContext(), 24, 0);
        ((FragmentTimingTempStatisticsBinding) this.binding).tvStartMeasureTime.setText(formatPeriodTime);
        ((FragmentTimingTempStatisticsBinding) this.binding).tvStopMeasureTime.setText(formatPeriodTime2);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    public void initBinding() {
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
        this.presenter.getTimerTemp((Date) getArguments().getSerializable("statistics_date"));
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

    @Override // m2.c
    public void renderLast7DaysAverageTemp(List<Float> list, Date[] dateArr) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Float> fotmatTempList = l2.c.fotmatTempList(list, this.fahrenheit);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(l2.c.getMaxTemp(this.fahrenheit));
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new f5.a(fotmatTempList));
        int color = ContextCompat.getColor(getContext(), R.color.color_temperature);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, fotmatTempList);
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMarkerView((MarkerView) new MeasureDateMarkerView(getContext(), dateArr, getString(R.string.year_month_day_format), color));
    }

    @Override // m2.c
    public void renderStatisticsDate(Date date) {
        d.setBandDataStatisticsDate(getContext(), ((FragmentTimingTempStatisticsBinding) this.binding).includeLastStatistics.tvSyncDate, date);
    }

    @Override // m2.c
    public void renderTemp(float f8, float f9, float f10) {
        if (f8 <= 0.0f) {
            return;
        }
        if (this.fahrenheit) {
            f8 = l2.c.celsius2Fahrenheit(f8);
            f9 = l2.c.celsius2Fahrenheit(f9);
            f10 = l2.c.celsius2Fahrenheit(f10);
        }
        ((FragmentTimingTempStatisticsBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPart.setText(n.formatTemp(f8));
        ((FragmentTimingTempStatisticsBinding) this.binding).tvLowestTemperature.setText(n.formatTemp(f9));
        ((FragmentTimingTempStatisticsBinding) this.binding).tvHighestTemperature.setText(n.formatTemp(f10));
    }

    @Override // m2.c
    public void renderTodayTempList(List<Float> list) {
        List<Float> fotmatTempList = l2.c.fotmatTempList(list, this.fahrenheit);
        k kVar = new k(getContext(), ((FragmentTimingTempStatisticsBinding) this.binding).tempChart);
        kVar.initChart(this.fahrenheit);
        kVar.setData(fotmatTempList, this.fahrenheit);
        kVar.setMarkerView(30, 1440 / fotmatTempList.size());
    }
}
