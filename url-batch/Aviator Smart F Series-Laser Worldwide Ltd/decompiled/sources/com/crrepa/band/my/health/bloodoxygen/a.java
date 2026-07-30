package com.crrepa.band.my.health.bloodoxygen;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.health.bloodoxygen.model.BandTimingBloodOxygenChangeEvent;
import com.crrepa.band.my.home.health.viewholder.b;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a extends b {
    private TimingBloodOxygenDaoProxy daoProxy;
    private CrpLineChart todayBloodOxygenChart;

    public a(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.daoProxy = new TimingBloodOxygenDaoProxy();
        initView();
        initLineChart();
    }

    private void initLineChart() {
        CrpLineChart crpLineChart = (CrpLineChart) this.holder.getView(R.id.heart_rate_line_chart);
        this.todayBloodOxygenChart = crpLineChart;
        crpLineChart.init(1);
        this.todayBloodOxygenChart.setXAxisLineColor(R.color.color_blood_oxygen);
        this.todayBloodOxygenChart.setXAxisLineWidth(1);
        this.todayBloodOxygenChart.setXAxisTextColor(R.color.black);
        this.todayBloodOxygenChart.hideXAxisLabels();
        this.todayBloodOxygenChart.setMaxValue(210.0f);
    }

    private void initView() {
        this.holder.setImageResource(R.id.iv_data_type, R$drawable.ic_home_o2);
        this.holder.setText(R.id.tv_data_type, R.string.continuous_blood_oxygen);
        this.holder.setText(R.id.tv_today_data_description, R.string.average_blood_oxygen);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_blood_oxygen));
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.percent_unit);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
    }

    private void setBloodOxygen(TimingBloodOxygen timingBloodOxygen) {
        float f8;
        Date date = new Date();
        if (timingBloodOxygen != null) {
            date = timingBloodOxygen.getDate();
            f8 = timingBloodOxygen.getAverage();
        } else {
            f8 = 0.0f;
        }
        setSyncTime(date);
        String string = this.context.getString(R.string.data_blank);
        if (0.0f < f8) {
            string = n.formatTemp(f8);
        }
        this.holder.setText(R.id.tv_date_first_part, string);
        setBloodOxygenChart(timingBloodOxygen);
    }

    private void setBloodOxygenChart(TimingBloodOxygen timingBloodOxygen) {
        if (timingBloodOxygen == null || TextUtils.isEmpty(timingBloodOxygen.getBloodOxygen())) {
            setChartVisibility(false);
            return;
        }
        setChartVisibility(true);
        this.todayBloodOxygenChart.setData(s.json2List(timingBloodOxygen.getBloodOxygen(), Float[].class), ContextCompat.getDrawable(this.context, R.drawable.fade_blood_oxygen_chart), ContextCompat.getColor(this.context, R.color.color_blood_oxygen), 1.8f);
    }

    private void setChartVisibility(boolean z7) {
        this.holder.setGone(R.id.include_no_data, z7);
        this.holder.setGone(R.id.heart_rate_line_chart, !z7);
        this.holder.setGone(R.id.day_axis_time_view, !z7);
    }

    private void setTodayBloodOxygen() {
        setBloodOxygen(this.daoProxy.get(new Date()));
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setTodayBloodOxygen();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandTimingBloodOxygenChangeEvent(BandTimingBloodOxygenChangeEvent bandTimingBloodOxygenChangeEvent) {
        setBloodOxygen(bandTimingBloodOxygenChangeEvent.getBloodOxygen());
    }
}
