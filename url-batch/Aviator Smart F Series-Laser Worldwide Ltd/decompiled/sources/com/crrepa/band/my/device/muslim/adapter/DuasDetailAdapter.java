package com.crrepa.band.my.device.muslim.adapter;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.muslim.model.Duas;

/* loaded from: classes2.dex */
public class DuasDetailAdapter extends BaseQuickAdapter<Duas, BaseViewHolder> {
    public DuasDetailAdapter() {
        super(R.layout.item_duas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, Duas duas) {
        if (duas.isFavorite()) {
            baseViewHolder.setImageResource(R.id.iv_collect, R$drawable.ic_collect_linear);
        } else {
            baseViewHolder.setImageResource(R.id.iv_collect, R$drawable.ic_collect_planarity);
        }
        baseViewHolder.setText(R.id.tv_duas, duas.getDetails());
        baseViewHolder.setText(R.id.tv_index, String.valueOf(duas.getIndex()));
    }
}
