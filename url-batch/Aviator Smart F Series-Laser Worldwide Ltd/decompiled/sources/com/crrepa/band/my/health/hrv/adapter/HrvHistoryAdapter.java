package com.crrepa.band.my.health.hrv.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.b;
import com.crrepa.band.my.model.db.Hrv;
import java.util.List;

/* loaded from: classes2.dex */
public class HrvHistoryAdapter extends BaseQuickAdapter<Hrv, BaseViewHolder> {
    public HrvHistoryAdapter(@Nullable List<Hrv> list) {
        super(R.layout.item_history_blood_pressure, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, Hrv hrv) {
        baseViewHolder.setText(R.id.tv_item_measure_data, hrv.getHrv().toString());
        baseViewHolder.setText(R.id.tv_item_data_unit, R.string.millisecond);
        baseViewHolder.setTextColor(R.id.tv_item_measure_data, ContextCompat.getColor(getContext(), R.color.color_hrv));
        b.setMeasureDate(getContext(), baseViewHolder, hrv.getDate());
    }
}
