package com.crrepa.band.my.health.bodytemperature;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentOnceTempStatisticsBinding;
import com.crrepa.band.my.health.base.BaseStatisticsFragment;
import com.crrepa.band.my.health.base.d;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.db.OnceTemp;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.dafit.module.common.utils.n;
import com.orhanobut.logger.f;
import java.util.Date;
import java.util.List;
import l2.c;
import m3.i;

/* loaded from: classes2.dex */
public class BandOnceTempStatistticsFragment extends BaseStatisticsFragment implements m2.a {
    private FragmentOnceTempStatisticsBinding binding;
    private com.crrepa.band.my.health.bodytemperature.presenter.a presenter = new com.crrepa.band.my.health.bodytemperature.presenter.a();
    private i segmentBarProxy = new i();
    private boolean fahrenheit = BandTempSystemProvider.isFahrenheit();

    private void getTempStatisticsData() {
        this.presenter.getOnceTemp(getArguments().getLong("statistics_id"));
    }

    private void initView() {
        this.binding.includeLastStatistics.tvDataType.setText(R.string.lower_case_temperature);
        this.binding.includeLastStatistics.includeBandData.tvDateFirstPart.setTextColor(ContextCompat.getColor(getContext(), R.color.color_temperature));
        setTempUnit();
        this.binding.includeLastStatistics.includeBandData.tvDateSecondPart.setVisibility(8);
        this.binding.includeLastStatistics.includeBandData.tvDateSecondPartUnit.setVisibility(8);
        this.binding.includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_times_temperature);
        this.segmentBarProxy.createBarView(this.binding.includeTempSegment.tempSegmentedbar, l2.b.getTempSegmentValues(), this.segmentBarProxy.getTempSegmentColors(getContext()));
        this.binding.includeAboutTemperature.tvNormalTemperature.setText(c.getNormalTemperatureText(getContext(), this.fahrenheit));
        this.binding.includeAboutTemperature.tvFeverGrade.setText(c.getFeverGradeText(getContext(), this.fahrenheit));
    }

    public static BandOnceTempStatistticsFragment newInstance(long j8) {
        BandOnceTempStatistticsFragment bandOnceTempStatistticsFragment = new BandOnceTempStatistticsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bandOnceTempStatistticsFragment.setArguments(bundle);
        return bandOnceTempStatistticsFragment;
    }

    private void setTempUnit() {
        if (this.fahrenheit) {
            this.binding.includeLastStatistics.includeBandData.tvDateFirstPartUnit.setText(R.string.fahrenheit_unit);
        } else {
            this.binding.includeLastStatistics.includeBandData.tvDateFirstPartUnit.setText(R.string.celsius_unit);
        }
    }

    private void showMeasureButtonVisible(boolean z7) {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandOnceTempStatisticsActivity) {
            ((BandOnceTempStatisticsActivity) activity).showMeasureButton(z7);
        }
    }

    @Override // m2.a
    public void measureComplete() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandOnceTempStatisticsActivity) {
            ((BandOnceTempStatisticsActivity) activity).measureComplete();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentOnceTempStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        return this.binding.getRoot();
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
        f.d("onHiddenChanged: " + z7);
        showMeasureButtonVisible(z7 ^ true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        setActivityMenuVisible(true);
        initView();
        getTempStatisticsData();
        showMeasureButtonVisible(true);
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

    @Override // m2.a
    public void renderLast7TimesOnceTemp(List<Float> list, Date[] dateArr) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Float> fotmatTempList = c.fotmatTempList(list, this.fahrenheit);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(c.getMaxTemp(this.fahrenheit));
        int color = ContextCompat.getColor(getContext(), R.color.color_temperature);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new f5.c(fotmatTempList));
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineWidth(2);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineColor(R.color.color_temperature);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, fotmatTempList);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMarkerView((MarkerView) new MeasureDateMarkerView(getContext(), dateArr, j.getSyncTimeFormat(getContext()), color));
    }

    @Override // m2.a
    public void renderOnceTemp(OnceTemp onceTemp) {
        float f8;
        Date date = new Date();
        if (onceTemp != null) {
            date = onceTemp.getDate();
            f8 = onceTemp.getTemp().floatValue();
        } else {
            f8 = 0.0f;
        }
        d.setBandDataStatisticsDate(getContext(), this.binding.includeLastStatistics.tvSyncDate, date);
        String string = getContext().getString(R.string.data_blank);
        if (0.0f < f8) {
            if (this.fahrenheit) {
                f8 = c.celsius2Fahrenheit(f8);
            }
            string = n.formatTemp(f8);
            this.segmentBarProxy.setSlider(this.binding.includeTempSegment.tempSegmentedbar, f8);
        }
        this.binding.includeLastStatistics.includeBandData.tvDateFirstPart.setText(string);
    }
}
