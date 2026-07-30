package com.crrepa.band.my.health.heartrate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.heartrate.model.Band24HoursHeartRateChangeEvent;
import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.proxy.HeartRateDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class b extends com.crrepa.band.my.home.health.viewholder.b {
    private HeartRateDaoProxy heartRateDaoProxy;
    private CrpLineChart lineChart;

    public b(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.heartRateDaoProxy = new HeartRateDaoProxy();
        initView();
        initLineChart();
    }

    private void initLineChart() {
        CrpLineChart crpLineChart = (CrpLineChart) this.holder.getView(R.id.heart_rate_line_chart);
        this.lineChart = crpLineChart;
        crpLineChart.init(1);
        this.lineChart.setXAxisLineColor(R.color.color_heart_rate);
        this.lineChart.setXAxisLineWidth(1);
        this.lineChart.setXAxisTextColor(R.color.black);
        this.lineChart.hideXAxisLabels();
        this.lineChart.setMaxValue(210.0f);
    }

    private void initView() {
        this.holder.setText(R.id.tv_data_type, this.context.getString(R.string.continuous_heart_rate));
        this.holder.setText(R.id.tv_today_data_description, R.string.average_heart_rate);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_heart_rate));
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.heart_rate_unit);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
    }

    private void setHeartRate(HeartRate heartRate) {
        Date date = new Date();
        String string = this.context.getString(R.string.data_blank);
        if (heartRate != null) {
            date = heartRate.getDate();
            string = String.valueOf(heartRate.getAverage());
        }
        setSyncTime(date);
        this.holder.setText(R.id.tv_date_first_part, string);
        setHeartRateChart(heartRate);
    }

    private void setHeartRateChart(HeartRate heartRate) {
        if (heartRate == null || TextUtils.isEmpty(heartRate.getHeartRate())) {
            setHeartRateChartVisibility(false);
            return;
        }
        setHeartRateChartVisibility(true);
        List<Float> json2List = s.json2List(heartRate.getHeartRate(), Float[].class);
        Drawable drawable = ContextCompat.getDrawable(this.context, R.drawable.fade_heart_rate_chart);
        int color = ContextCompat.getColor(this.context, R.color.color_heart_rate);
        json2List.add(0, Float.valueOf(0.0f));
        this.lineChart.setData(json2List, drawable, color, 1.8f);
    }

    private void setHeartRateChartVisibility(boolean z7) {
        this.holder.setGone(R.id.include_no_data, z7);
        this.holder.setGone(R.id.heart_rate_line_chart, !z7);
        this.holder.setGone(R.id.day_axis_time_view, !z7);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setHeartRate(this.heartRateDaoProxy.getHeartRate(new Date()));
    }

    @l(threadMode = ThreadMode.MAIN)
    public void on24HoursHeartRateChangeEvent(Band24HoursHeartRateChangeEvent band24HoursHeartRateChangeEvent) {
        setHeartRate(band24HoursHeartRateChangeEvent.getHeartRate());
    }
}
