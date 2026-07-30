package com.crrepa.band.my.health.bloodpressure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentBloodPressureMeasureBinding;
import com.crrepa.band.my.health.base.BaseStatisticsFragment;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BandBloodPressureStatisticsFragment extends BaseStatisticsFragment implements k2.a {
    private static final float MAX_BLOOD_PRESSURE_BAR_VALUE = 200.0f;
    private FragmentBloodPressureMeasureBinding binding;
    private i2.a presenter = new i2.a();

    private String formatBloodPressure(Float f8) {
        return f8.intValue() == 0 ? "" : String.valueOf(f8.intValue());
    }

    private void getBloodPressure() {
        this.presenter.getBloodPressure(getArguments().getLong("statistics_id"));
    }

    private void initLast7TimesBloodPressureTrendChart() {
        this.binding.last7TimesBloodPressureTrendChart.setup(7);
        this.binding.last7TimesBloodPressureTrendChart.setMaxValue(200.0f);
        this.binding.last7TimesBloodPressureTrendChart.setXAxisValueFormatter(null);
    }

    private void initView() {
        int color = ContextCompat.getColor(getContext(), R.color.color_blood_pressure);
        this.binding.includeAboutBo.tvAboutBo.setText(R.string.about_bp);
        this.binding.includeAboutBo.llAboutBo.setBackgroundResource(R.drawable.shape_blood_pressure_bg);
        this.binding.includeAboutBo.tvLearnBo.setTextColor(color);
        this.binding.includeAboutBo.tvLearnBo.setText(R.string.find_blood_pressure);
        this.binding.includeAboutBo.tvBoConent.setTextColor(color);
        this.binding.includeAboutBo.tvBoConent.setText(R.string.blood_pressure_description);
        this.binding.includeAboutBo.tvBoSecondContent.setVisibility(8);
    }

    public static BandBloodPressureStatisticsFragment newInstance(long j8) {
        BandBloodPressureStatisticsFragment bandBloodPressureStatisticsFragment = new BandBloodPressureStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bandBloodPressureStatisticsFragment.setArguments(bundle);
        return bandBloodPressureStatisticsFragment;
    }

    private void setBloodPressureMeasureValue(List<Float> list, List<Float> list2) {
        this.binding.tvDbpFirstDay.setText(formatBloodPressure(Float.valueOf(list.get(0).floatValue() + list2.get(0).floatValue())));
        this.binding.tvDbpSecondDay.setText(formatBloodPressure(Float.valueOf(list.get(1).floatValue() + list2.get(1).floatValue())));
        this.binding.tvDbpThirdDay.setText(formatBloodPressure(Float.valueOf(list.get(2).floatValue() + list2.get(2).floatValue())));
        this.binding.tvDbpFourthDay.setText(formatBloodPressure(Float.valueOf(list.get(3).floatValue() + list2.get(3).floatValue())));
        this.binding.tvDbpFifthDay.setText(formatBloodPressure(Float.valueOf(list.get(4).floatValue() + list2.get(4).floatValue())));
        this.binding.tvDbpSixthDay.setText(formatBloodPressure(Float.valueOf(list.get(5).floatValue() + list2.get(5).floatValue())));
        this.binding.tvDbpSeventhDay.setText(formatBloodPressure(Float.valueOf(list.get(6).floatValue() + list2.get(6).floatValue())));
        this.binding.tvSbpFirstDay.setText(formatBloodPressure(list2.get(0)));
        this.binding.tvSbpSecondDay.setText(formatBloodPressure(list2.get(1)));
        this.binding.tvSbpThirdDay.setText(formatBloodPressure(list2.get(2)));
        this.binding.tvSbpFourthDay.setText(formatBloodPressure(list2.get(3)));
        this.binding.tvSbpFifthDay.setText(formatBloodPressure(list2.get(4)));
        this.binding.tvSbpSixthDay.setText(formatBloodPressure(list2.get(5)));
        this.binding.tvSbpSeventhDay.setText(formatBloodPressure(list2.get(6)));
    }

    private void showMeasureButtonVisible(boolean z7) {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandBpStatisticsActivity) {
            ((BandBpStatisticsActivity) activity).showMeasureButton(z7);
        }
    }

    @Override // k2.a
    public void measureComplete() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandBpStatisticsActivity) {
            ((BandBpStatisticsActivity) activity).measureComplete();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FragmentBloodPressureMeasureBinding inflate = FragmentBloodPressureMeasureBinding.inflate(layoutInflater, viewGroup, false);
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
        initLast7TimesBloodPressureTrendChart();
        getBloodPressure();
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

    @Override // k2.a
    public void renderBloodPressure(int i8, int i9) {
        this.binding.includeDataView.tvSbp.setText(String.valueOf(i8));
        this.binding.includeDataView.tvDbp.setText(String.valueOf(i9));
        this.binding.includeDataView.bloodPressureDisplayView.setBp(i8, i9);
    }

    @Override // k2.a
    public void renderLast7TimesBloodPressure(List<Float> list, List<Float> list2, Date[] dateArr) {
        this.binding.last7TimesBloodPressureTrendChart.setVisibility(0);
        int color = ContextCompat.getColor(getContext(), R.color.color_systolic_pressure_bar_bg);
        int[] iArr = {color, ContextCompat.getColor(getContext(), R.color.color_diastolic_pressure_bar_bg)};
        this.binding.last7TimesBloodPressureTrendChart.setXAxisLineWidth(1);
        this.binding.last7TimesBloodPressureTrendChart.setXAxisLineColor(R.color.color_systolic_pressure_bar_bg);
        this.binding.last7TimesBloodPressureTrendChart.setData(false, iArr, color, 0.4f, list2, list);
        setBloodPressureMeasureValue(list, list2);
        this.binding.last7TimesBloodPressureTrendChart.setMarkerView((MarkerView) new MeasureDateMarkerView(getContext(), dateArr, j.getSyncTimeFormat(getContext()), color));
    }

    @Override // k2.a
    public void renderStatisticsDate(Date date) {
        this.binding.includeDataView.tvStatisticsDate.setText(m.format(date, j.getSyncTimeFormat(getContext())));
    }
}
