package com.crrepa.band.my.health.bloodoxygen.adapter;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.b;
import com.crrepa.band.my.model.db.BloodOxygen;
import java.util.List;

/* loaded from: classes2.dex */
public class BloodOxygenHistoryAdapter extends BaseQuickAdapter<BloodOxygen, BaseViewHolder> {
    private Context context;

    public BloodOxygenHistoryAdapter(Context context, @Nullable List<BloodOxygen> list) {
        super(R.layout.item_history_blood_pressure, list);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, BloodOxygen bloodOxygen) {
        baseViewHolder.setText(R.id.tv_item_data_unit, R.string.percent_unit);
        int color = ContextCompat.getColor(this.context, R.color.color_blood_oxygen);
        int intValue = bloodOxygen.getBloodOxygen().intValue();
        baseViewHolder.setTextColor(R.id.tv_item_measure_data, color);
        baseViewHolder.setText(R.id.tv_item_measure_data, String.valueOf(intValue));
        b.setMeasureDate(this.context, baseViewHolder, bloodOxygen.getDate());
    }
}
