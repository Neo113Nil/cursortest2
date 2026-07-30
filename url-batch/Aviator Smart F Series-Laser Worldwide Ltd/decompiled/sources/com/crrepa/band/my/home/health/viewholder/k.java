package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.bodytemperature.model.BandTimingTempChangeEvent;
import com.crrepa.band.my.health.bodytemperature.model.TemperatureUnitChangeEvent;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.proxy.TimingTempDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class k extends b {
    private TimingTempDaoProxy timingTempDaoProxy;
    private CrpLineChart todayTempChart;

    public k(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.timingTempDaoProxy = new TimingTempDaoProxy();
        initView();
    }

    private void initView() {
        this.holder.setText(R.id.tv_data_type, R.string.continuous_temperature);
        this.holder.setText(R.id.tv_today_data_description, R.string.average_temperature);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_temperature));
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        this.todayTempChart = (CrpLineChart) this.holder.getView(R.id.temp_line_chart);
    }

    private void setTemp(TimingTemp timingTemp) {
        float f8;
        Date date = new Date();
        if (timingTemp != null) {
            date = timingTemp.getDate();
            f8 = timingTemp.getAverage().floatValue();
        } else {
            f8 = 0.0f;
        }
        setSyncTime(date);
        boolean isFahrenheit = BandTempSystemProvider.isFahrenheit();
        setTempChart(timingTemp, isFahrenheit);
        this.holder.setText(R.id.tv_date_first_part_unit, isFahrenheit ? R.string.fahrenheit_unit : R.string.celsius_unit);
        String string = this.context.getString(R.string.data_blank);
        if (0.0f < f8) {
            if (isFahrenheit) {
                f8 = l2.c.celsius2Fahrenheit(f8);
            }
            string = com.moyoung.dafit.module.common.utils.n.formatTemp(f8);
        }
        this.holder.setText(R.id.tv_date_first_part, string);
    }

    private void setTempChart(TimingTemp timingTemp, boolean z7) {
        if (timingTemp == null) {
            setTempChartVisibility(false);
            return;
        }
        List<Float> fotmatTempList = l2.c.fotmatTempList(s.json2List(timingTemp.getTempStr(), Float[].class), z7);
        setTempChartVisibility(true);
        this.todayTempChart.init(1);
        this.todayTempChart.setXAxisLineColor(R.color.color_temperature);
        this.todayTempChart.setXAxisLineWidth(1);
        this.todayTempChart.setXAxisTextColor(R.color.black);
        this.todayTempChart.hideXAxisLabels();
        this.todayTempChart.setMaxValue(l2.c.getMaxTemp(z7));
        this.todayTempChart.setData(fotmatTempList, ContextCompat.getDrawable(this.context, R.drawable.fade_temp_chart), ContextCompat.getColor(this.context, R.color.color_temperature), 1.8f);
    }

    private void setTempChartVisibility(boolean z7) {
        this.holder.setGone(R.id.include_no_data, z7);
        this.holder.setGone(R.id.temp_line_chart, !z7);
        this.holder.setGone(R.id.day_axis_time_view, !z7);
    }

    private void setTodayTemp() {
        setTemp(this.timingTempDaoProxy.get(new Date()));
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setTodayTemp();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onTemperatureUnitChangeEvent(TemperatureUnitChangeEvent temperatureUnitChangeEvent) {
        setTodayTemp();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onTimingTempChangeEvent(BandTimingTempChangeEvent bandTimingTempChangeEvent) {
        setTemp(bandTimingTempChangeEvent.getTimingTemp());
    }
}
