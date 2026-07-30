package com.crrepa.band.my.health.bloodoxygen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentBloodOxygenMeasureBinding;
import com.crrepa.band.my.health.base.BaseStatisticsFragment;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.widgets.b;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.instructions.c;
import com.moyoung.instructions.utils.InstructionsType;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BandBloodOxygenStatisticsFragment extends BaseStatisticsFragment implements b {
    private static final float MAX_BLOOD_OXYGEN_VALUE = 110.0f;
    private FragmentBloodOxygenMeasureBinding binding;
    private com.crrepa.band.my.health.bloodoxygen.presenter.a presenter = new com.crrepa.band.my.health.bloodoxygen.presenter.a();

    private void getBloodOxygen() {
        this.presenter.getBloodOxygenStatisticsData(getArguments().getLong("statistics_id"));
    }

    private void initView() {
        this.binding.includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_times_blood_oxygen_trend);
        this.binding.boDisplayView.setBottomTextColor(R.color.white);
        this.binding.boDisplayView.setBottomText(getResources().getStringArray(R.array.bo_percent_array));
    }

    public static BandBloodOxygenStatisticsFragment newInstance(long j8) {
        BandBloodOxygenStatisticsFragment bandBloodOxygenStatisticsFragment = new BandBloodOxygenStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bandBloodOxygenStatisticsFragment.setArguments(bundle);
        return bandBloodOxygenStatisticsFragment;
    }

    private void showMeasureButtonVisible(boolean z7) {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandBoStatisticsActivity) {
            ((BandBoStatisticsActivity) activity).showMeasureButton(z7);
        }
    }

    @Override // com.crrepa.band.my.health.widgets.b
    public void measureComplete() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandBoStatisticsActivity) {
            ((BandBoStatisticsActivity) activity).measureComplete();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentBloodOxygenMeasureBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        this.binding.includeAboutBo.ivHelp.setVisibility(0);
        c.hook(InstructionsType.BLOOD_OXYGEN, this.binding.includeAboutBo.ivHelp);
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
        showMeasureButtonVisible(!z7);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initView();
        setActivityMenuVisible(true);
        getBloodOxygen();
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

    @Override // com.crrepa.band.my.health.widgets.b
    public void renderBo(int i8) {
        this.binding.boDisplayView.setBo(i8);
        String string = getString(R.string.percent_unit);
        this.binding.tvBo.setText(i8 + string);
    }

    @Override // com.crrepa.band.my.health.widgets.b
    public void renderDate(Date date) {
        this.binding.tvStatisticsDate.setText(m.format(date, getString(R.string.statistics_date_format)));
    }

    @Override // com.crrepa.band.my.health.widgets.b
    public void renderLast7TimesBloodOxygen(List<Float> list, Date[] dateArr) {
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(MAX_BLOOD_OXYGEN_VALUE);
        int color = ContextCompat.getColor(getContext(), R.color.color_blood_oxygen_bar_bg);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new f5.b(list));
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineColor(R.color.color_blood_oxygen_bar_bg);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineWidth(1);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, list);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMarkerView((MarkerView) new MeasureDateMarkerView(getContext(), dateArr, j.getSyncTimeFormat(getContext()), color));
    }
}
