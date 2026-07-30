package com.crrepa.band.my.health.hrv;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.health.hrv.model.BandHrvChangeEvent;
import com.crrepa.band.my.model.db.Hrv;
import com.crrepa.band.my.model.db.proxy.HrvDaoProxy;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import m3.g;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class b extends com.crrepa.band.my.home.health.viewholder.b {
    private g chartFormatter;

    public b(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.holder.setImageResource(R.id.iv_data_type, R$drawable.ic_home_hrv);
        this.holder.setText(R.id.tv_data_type, R.string.hrv_title);
        this.holder.setText(R.id.tv_today_data_description, R.string.hrv);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_heart_rate));
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.millisecond);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        g gVar = new g(context, (CrpLineChart) this.holder.getView(R.id.heart_rate_line_chart));
        this.chartFormatter = gVar;
        gVar.init();
    }

    private void setHrvChart(int[] iArr, int i8) {
        this.chartFormatter.setMaxValue(i8);
        this.chartFormatter.setChartData(iArr);
    }

    private void showTodayHrv() {
        List<Hrv> todatHrv = new HrvDaoProxy().getTodatHrv();
        Date date = new Date();
        String string = this.context.getString(R.string.data_blank);
        if (todatHrv == null || todatHrv.isEmpty()) {
            this.holder.setVisible(R.id.include_no_data, true);
            this.holder.setGone(R.id.heart_rate_line_chart, false);
            this.holder.setGone(R.id.day_axis_time_view, true);
        } else {
            this.holder.setGone(R.id.include_no_data, true);
            this.holder.setVisible(R.id.heart_rate_line_chart, true);
            this.holder.setGone(R.id.day_axis_time_view, true);
            int[] iArr = new int[24];
            int[] iArr2 = new int[24];
            Calendar calendar = k.getCalendar();
            int i8 = 0;
            int i9 = 0;
            for (Hrv hrv : todatHrv) {
                Integer hrv2 = hrv.getHrv();
                if (hrv2 != null) {
                    i8 += hrv2.intValue();
                    if (i9 < hrv2.intValue()) {
                        i9 = hrv2.intValue();
                    }
                    calendar.setTime(hrv.getDate());
                    int i10 = calendar.get(11);
                    iArr[i10] = iArr[i10] + hrv2.intValue();
                    iArr2[i10] = iArr2[i10] + 1;
                }
            }
            String valueOf = String.valueOf(i8 / todatHrv.size());
            for (int i11 = 0; i11 < 24; i11++) {
                int i12 = iArr2[i11];
                if (i12 > 0) {
                    iArr[i11] = iArr[i11] / i12;
                }
            }
            setHrvChart(iArr, i9);
            string = valueOf;
        }
        setSyncTime(date);
        this.holder.setText(R.id.tv_date_first_part, string);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        showTodayHrv();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandHrvChangeEvent(BandHrvChangeEvent bandHrvChangeEvent) {
        showTodayHrv();
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b
    protected void updateTimeSystem() {
        super.updateTimeSystem();
    }
}
