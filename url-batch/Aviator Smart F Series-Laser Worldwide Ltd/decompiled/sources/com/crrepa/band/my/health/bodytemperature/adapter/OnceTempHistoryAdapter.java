package com.crrepa.band.my.health.bodytemperature.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.b;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.db.OnceTemp;
import com.moyoung.dafit.module.common.utils.n;
import java.util.List;
import l2.c;

/* loaded from: classes2.dex */
public class OnceTempHistoryAdapter extends BaseQuickAdapter<OnceTemp, BaseViewHolder> {
    private Context context;

    public OnceTempHistoryAdapter(Context context, @Nullable List<OnceTemp> list) {
        super(R.layout.item_history_blood_pressure, list);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, OnceTemp onceTemp) {
        float floatValue = onceTemp.getTemp().floatValue();
        if (BandTempSystemProvider.isFahrenheit()) {
            baseViewHolder.setText(R.id.tv_item_data_unit, R.string.fahrenheit_unit);
            floatValue = c.celsius2Fahrenheit(floatValue);
        } else {
            baseViewHolder.setText(R.id.tv_item_data_unit, R.string.celsius_unit);
        }
        baseViewHolder.setText(R.id.tv_item_measure_data, n.formatTemp(floatValue));
        baseViewHolder.setTextColor(R.id.tv_item_measure_data, ContextCompat.getColor(this.context, R.color.color_temperature));
        b.setMeasureDate(this.context, baseViewHolder, onceTemp.getDate());
    }
}
