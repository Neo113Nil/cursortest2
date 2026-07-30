package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.db.proxy.WeightDaoProxy;
import com.crrepa.band.my.model.user.provider.UserHeightProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class p extends b {
    private CrpLineChart weightLineChart;

    public p(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        initView();
    }

    private void initChart() {
        CrpLineChart crpLineChart = (CrpLineChart) this.holder.getView(R.id.weight_line_chart);
        this.weightLineChart = crpLineChart;
        crpLineChart.init(7);
        this.weightLineChart.setXAxisLineColor(R.color.color_weight);
        this.weightLineChart.setXAxisLineWidth(1);
        this.weightLineChart.setXAxisTextColor(R.color.black);
    }

    private void initView() {
        this.holder.setText(R.id.tv_data_type, this.context.getString(R.string.weight));
        String str = this.context.getString(R.string.weight_bmi_title) + " : ";
        this.holder.setText(R.id.tv_today_data_description, str + this.context.getString(R.string.data_blank));
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_weight));
        this.holder.setText(R.id.tv_date_first_part_unit, BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.weight_kg : R.string.weight_lb);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        setSyncTime(new Date());
        initChart();
    }

    private void setWeightChartData(List<Weight> list) {
        if (list == null) {
            setWeightDataUI(false);
            return;
        }
        setWeightDataUI(true);
        Drawable drawable = ContextCompat.getDrawable(this.context, R.drawable.fade_weight_chart);
        int color = ContextCompat.getColor(this.context, R.color.color_weight);
        int color2 = ContextCompat.getColor(this.context, R.color.white);
        List<Float> weightNumList = new WeightDaoProxy().getWeightNumList(list, false);
        this.weightLineChart.setXAxisValueFormatter(new f5.d(weightNumList, -1));
        this.weightLineChart.setWeightData(weightNumList, color, 1.8f, drawable, color2);
    }

    private void setWeightData(Weight weight) {
        String str = this.context.getString(R.string.weight_bmi_title) + " : ";
        if (weight != null) {
            setSyncTime(weight.getDate());
            this.holder.setText(R.id.tv_date_first_part, com.moyoung.dafit.module.common.utils.n.formatWeight(UserWeightProvider.getCurrentWeight(weight), 1));
            this.holder.setText(R.id.tv_today_data_description, str + com.moyoung.dafit.module.common.utils.n.formatWeight(UserWeightProvider.getCurrentWeightByUnitSystem(0, weight) / Math.pow((UserHeightProvider.getUserHeight(0) * 1.0f) / 100.0f, 2.0d), 1));
        } else {
            this.holder.setText(R.id.tv_date_first_part, this.context.getString(R.string.data_blank));
            this.holder.setText(R.id.tv_today_data_description, str + this.context.getString(R.string.data_blank));
        }
        List<Weight> limitWeightList = new WeightDaoProxy().getLimitWeightList(7, new Date());
        float[] maxMinWeightNum = new WeightDaoProxy().getMaxMinWeightNum(limitWeightList);
        com.orhanobut.logger.f.d("weight ==> card - max : " + maxMinWeightNum[0] + " / min : " + maxMinWeightNum[1]);
        this.weightLineChart.setMaxValue(maxMinWeightNum[0]);
        this.weightLineChart.setMinValue(maxMinWeightNum[1]);
        setWeightChartData(limitWeightList);
    }

    private void setWeightDataUI(boolean z7) {
        this.holder.setGone(R.id.include_no_data, z7);
        this.holder.setGone(R.id.weight_line_chart, !z7);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setWeightData(new WeightDaoProxy().getLastestWeight(new Date()));
    }
}
