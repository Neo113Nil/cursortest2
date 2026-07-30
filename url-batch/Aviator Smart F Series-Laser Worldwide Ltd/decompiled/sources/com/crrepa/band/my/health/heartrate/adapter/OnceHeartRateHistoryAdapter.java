package com.crrepa.band.my.health.heartrate.adapter;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.b;
import com.crrepa.band.my.model.db.OnceHeartRate;
import java.util.List;

/* loaded from: classes2.dex */
public class OnceHeartRateHistoryAdapter extends BaseQuickAdapter<OnceHeartRate, BaseViewHolder> {
    private Context context;

    public OnceHeartRateHistoryAdapter(Context context, @Nullable List<OnceHeartRate> list) {
        super(R.layout.item_history_blood_pressure, list);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, OnceHeartRate onceHeartRate) {
        baseViewHolder.setText(R.id.tv_item_data_unit, R.string.heart_rate_unit);
        int color = ContextCompat.getColor(this.context, R.color.color_heart_rate);
        int intValue = onceHeartRate.getHeartRate().intValue();
        baseViewHolder.setTextColor(R.id.tv_item_measure_data, color);
        baseViewHolder.setText(R.id.tv_item_measure_data, String.valueOf(intValue));
        b.setMeasureDate(this.context, baseViewHolder, onceHeartRate.getDate());
    }
}
