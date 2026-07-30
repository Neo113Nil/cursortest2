package com.crrepa.band.my.health.pressure.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.b;
import com.crrepa.band.my.model.db.Stress;
import java.util.List;

/* loaded from: classes2.dex */
public class StressHistoryAdapter extends BaseQuickAdapter<Stress, BaseViewHolder> {
    public StressHistoryAdapter(@Nullable List<Stress> list) {
        super(R.layout.item_history_blood_pressure, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, Stress stress) {
        baseViewHolder.setText(R.id.tv_item_measure_data, stress.getStress().toString());
        baseViewHolder.setTextColor(R.id.tv_item_measure_data, ContextCompat.getColor(getContext(), R.color.color_stress));
        baseViewHolder.setGone(R.id.tv_item_data_unit, true);
        b.setMeasureDate(getContext(), baseViewHolder, stress.getDate());
    }
}
