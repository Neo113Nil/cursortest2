package com.crrepa.band.my.health.hrv;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentHrvDetailBinding;
import com.crrepa.band.my.health.base.d;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.crrepa.band.my.model.db.Hrv;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BandHrvDetailFragment extends BaseVBFragment<FragmentHrvDetailBinding> implements u2.a {
    private final s2.a presenter = new s2.a();

    private void initView() {
        ((FragmentHrvDetailBinding) this.binding).includeLastStatistics.tvDataType.setText(R.string.hrv_title);
        ((FragmentHrvDetailBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPart.setTextColor(ContextCompat.getColor(getContext(), R.color.color_hrv));
        ((FragmentHrvDetailBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPartUnit.setText(R.string.millisecond);
        ((FragmentHrvDetailBinding) this.binding).includeLastStatistics.includeBandData.tvDateSecondPart.setVisibility(8);
        ((FragmentHrvDetailBinding) this.binding).includeLastStatistics.includeBandData.tvDateSecondPartUnit.setVisibility(8);
        ((FragmentHrvDetailBinding) this.binding).includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_times_hrv);
    }

    public static BandHrvDetailFragment newInstance(long j8) {
        BandHrvDetailFragment bandHrvDetailFragment = new BandHrvDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bandHrvDetailFragment.setArguments(bundle);
        return bandHrvDetailFragment;
    }

    private void showMeasureButtonVisible(boolean z7) {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandHrvStatisticsActivity) {
            ((BandHrvStatisticsActivity) activity).showMeasureButton(z7);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    public void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
    }

    @Override // u2.a
    public void measureComplete() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandHrvStatisticsActivity) {
            ((BandHrvStatisticsActivity) activity).measureComplete();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        showMeasureButtonVisible(!z7);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initView();
        showMeasureButtonVisible(true);
        ((FragmentHrvDetailBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        this.presenter.getHrvDetail(getArguments().getLong("statistics_id"));
    }

    @Override // u2.a
    public void renderHistoryHrv(int i8, List<Float> list, Date[] dateArr) {
        ((FragmentHrvDetailBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        ((FragmentHrvDetailBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(i8);
        int color = ContextCompat.getColor(getContext(), R.color.color_hrv);
        ((FragmentHrvDetailBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new f5.a(list));
        ((FragmentHrvDetailBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMarkerView((MarkerView) new MeasureDateMarkerView(getContext(), dateArr, j.getSyncTimeFormat(getContext()), color));
        ((FragmentHrvDetailBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, list);
    }

    @Override // u2.a
    public void renderHrv(Hrv hrv) {
        String valueOf;
        Date date;
        if (hrv == null) {
            date = new Date();
            valueOf = getContext().getString(R.string.data_blank);
        } else {
            Date date2 = hrv.getDate();
            valueOf = String.valueOf(hrv.getHrv());
            date = date2;
        }
        d.setBandDataStatisticsDate(getContext(), ((FragmentHrvDetailBinding) this.binding).includeLastStatistics.tvSyncDate, date);
        ((FragmentHrvDetailBinding) this.binding).includeLastStatistics.includeBandData.tvDateFirstPart.setText(valueOf);
    }
}
