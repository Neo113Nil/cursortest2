package com.crrepa.band.my.health.heartrate;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.bloodoxygen.model.BandHeartRateResultEvent;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.crrepa.band.my.model.db.proxy.ActiveHeartRateDaoProxy;
import com.crrepa.band.my.training.utils.p;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a extends com.crrepa.band.my.home.health.viewholder.b {
    public a(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        initView();
    }

    private void initView() {
        this.holder.setText(R.id.tv_data_type, p.getTrainingHeartRateText());
        this.holder.setText(R.id.tv_today_data_description, R.string.average_heart_rate);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_heart_rate));
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.heart_rate_unit);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        this.holder.getView(R.id.sleep_degree_view).setVisibility(8);
        this.holder.getView(R.id.ll_three_section_statistics_data).setVisibility(8);
    }

    private void setActiveHeartRateData(ActiveHeartRate activeHeartRate) {
        Date date = new Date();
        String string = this.context.getString(R.string.data_blank);
        if (activeHeartRate != null) {
            date = activeHeartRate.getStartDate();
            string = String.valueOf(activeHeartRate.getAverage());
            setHeartRateList(s.json2List(activeHeartRate.getData(), Float[].class), date);
        }
        setSyncTime(date);
        setAverageHeartRate(string);
    }

    private void setAverageHeartRate(String str) {
        this.holder.setText(R.id.tv_date_first_part, str);
    }

    private void setHeartRateList(List<Float> list, Date date) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CrpLineChart crpLineChart = (CrpLineChart) this.holder.getView(R.id.heart_rate_chart);
        crpLineChart.setVisibility(0);
        crpLineChart.init(list.size());
        crpLineChart.setXAxisLineColor(R.color.color_heart_rate);
        crpLineChart.setXAxisLineWidth(1);
        crpLineChart.setXAxisTextColor(R.color.black);
        crpLineChart.setXAxisValueFormatter(new k3.b(this.context, date, 60, list.size()));
        crpLineChart.setMaxValue(210.0f);
        crpLineChart.setData(list, ContextCompat.getDrawable(this.context, R.drawable.fade_training_heart_rate_chart), ContextCompat.getColor(this.context, R.color.color_training), 1.8f);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setActiveHeartRateData(new ActiveHeartRateDaoProxy().getLastTimeHeartRate());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onHeartRateResultEvent(BandHeartRateResultEvent bandHeartRateResultEvent) {
        setActiveHeartRateData(bandHeartRateResultEvent.getActiveHeartRate());
    }
}
