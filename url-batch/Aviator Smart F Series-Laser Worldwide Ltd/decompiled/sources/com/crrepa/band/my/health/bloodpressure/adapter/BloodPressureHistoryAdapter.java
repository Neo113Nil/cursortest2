package com.crrepa.band.my.health.bloodpressure.adapter;

import android.content.Context;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.b;
import com.crrepa.band.my.model.db.BloodPressure;
import java.util.List;

/* loaded from: classes2.dex */
public class BloodPressureHistoryAdapter extends BaseQuickAdapter<BloodPressure, BaseViewHolder> {
    private Context context;

    public BloodPressureHistoryAdapter(Context context, @Nullable List<BloodPressure> list) {
        super(R.layout.item_history_blood_pressure, list);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, BloodPressure bloodPressure) {
        int intValue = bloodPressure.getDbp().intValue();
        baseViewHolder.setText(R.id.tv_item_measure_data, String.format(this.context.getString(R.string.blood_pressure_data), Integer.valueOf(bloodPressure.getSbp().intValue()), Integer.valueOf(intValue)));
        b.setMeasureDate(this.context, baseViewHolder, bloodPressure.getDate());
    }
}
