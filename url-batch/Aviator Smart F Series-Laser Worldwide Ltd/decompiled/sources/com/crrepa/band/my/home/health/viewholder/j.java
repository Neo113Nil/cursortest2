package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.pressure.model.BandTimingStressChangeEvent;
import com.crrepa.band.my.health.widgets.DayAxisTimeView;
import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.proxy.TimingStressDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class j extends b {
    private l3.a chartHelper;
    private CrpBarChart stressBarChart;

    public j(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.chartHelper = new l3.a();
        this.holder.setText(R.id.tv_data_type, R.string.stress);
        this.holder.setText(R.id.tv_today_data_description, R.string.stress_average);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_stress));
        this.holder.setGone(R.id.tv_date_first_part_unit, true);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        this.stressBarChart = (CrpBarChart) this.holder.getView(R.id.stress_bar_chart);
        ((DayAxisTimeView) this.holder.getView(R.id.day_axis_time_view)).setTextColor(R.color.color_stress);
    }

    private void setChartVisibility(boolean z7) {
        this.holder.setGone(R.id.include_no_data, z7);
        this.holder.setGone(R.id.day_axis_time_view, !z7);
        this.holder.setGone(R.id.stress_bar_chart, !z7);
    }

    private void setStressChart(TimingStress timingStress) {
        if (timingStress == null) {
            setChartVisibility(false);
            return;
        }
        List json2List = s.json2List(timingStress.getStress(), Integer[].class);
        if (json2List == null) {
            setChartVisibility(false);
            return;
        }
        setChartVisibility(true);
        ArrayList arrayList = new ArrayList();
        Iterator it = json2List.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((Integer) it.next()).intValue()));
        }
        this.chartHelper.initChart(this.stressBarChart, 48, 110, null);
        this.chartHelper.setXAxisStyle(this.stressBarChart, R.color.color_stress, R.color.color_stress);
        this.chartHelper.setChartData(this.stressBarChart, arrayList, R.color.color_stress, R.color.color_stress);
    }

    private void setTimingStress(TimingStress timingStress) {
        float f8;
        Date date = new Date();
        if (timingStress != null) {
            date = timingStress.getDate();
            f8 = timingStress.getAverage().intValue();
        } else {
            f8 = 0.0f;
        }
        setSyncTime(date);
        String string = this.context.getString(R.string.data_blank);
        if (0.0f < f8) {
            string = com.moyoung.dafit.module.common.utils.n.format(f8, "0");
        }
        this.holder.setText(R.id.tv_date_first_part, string);
        setStressChart(timingStress);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setTimingStress(new TimingStressDaoProxy().get(new Date()));
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandTimingStressChangeEvent(BandTimingStressChangeEvent bandTimingStressChangeEvent) {
        setTimingStress(bandTimingStressChangeEvent.getTimingStress());
    }
}
