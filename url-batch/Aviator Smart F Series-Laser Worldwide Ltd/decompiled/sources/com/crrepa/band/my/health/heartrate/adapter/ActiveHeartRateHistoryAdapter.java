package com.crrepa.band.my.health.heartrate.adapter;

import android.content.Context;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class ActiveHeartRateHistoryAdapter extends BaseQuickAdapter<ActiveHeartRate, BaseViewHolder> {
    private Context context;

    public ActiveHeartRateHistoryAdapter(Context context, @Nullable List<ActiveHeartRate> list) {
        super(R.layout.item_histoey_heart_rate, list);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, ActiveHeartRate activeHeartRate) {
        baseViewHolder.setText(R.id.tv_average_heart_rate, String.valueOf(activeHeartRate.getAverage()));
        Date startDate = activeHeartRate.getStartDate();
        Date endDate = activeHeartRate.getEndDate();
        String string = this.context.getString(R.string.month_day_unit_format);
        String string2 = this.context.getString(R.string.hour_minute_format_12);
        String string3 = this.context.getString(R.string.hour_minute_format);
        String string4 = this.context.getString(R.string.time_connection);
        String format = m.format(startDate, string);
        String str = m.format(startDate, string2) + string4 + m.format(endDate, string3);
        baseViewHolder.setText(R.id.tv_item_measure_date, format);
        baseViewHolder.setText(R.id.tv_item_measure_time, str);
    }
}
