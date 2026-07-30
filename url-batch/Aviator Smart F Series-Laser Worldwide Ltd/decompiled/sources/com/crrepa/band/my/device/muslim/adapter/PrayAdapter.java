package com.crrepa.band.my.device.muslim.adapter;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.muslim.model.MuslimPray;

/* loaded from: classes2.dex */
public class PrayAdapter extends BaseQuickAdapter<MuslimPray, BaseViewHolder> {
    public PrayAdapter() {
        super(R.layout.item_muslim_pray);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, MuslimPray muslimPray) {
        baseViewHolder.setImageResource(R.id.iv_reminder, muslimPray.isRemind() ? R$drawable.ic_muslim_remind : R$drawable.ic_muslim_not_remind);
        baseViewHolder.setText(R.id.tv_pray_name, muslimPray.getName());
        baseViewHolder.setText(R.id.tv_pray_time, muslimPray.getTime());
        if (muslimPray.isCurrent()) {
            baseViewHolder.setBackgroundResource(R.id.rl_item_muslim_pray, R.drawable.shape_muslim_current_pray_bg);
        } else {
            baseViewHolder.setBackgroundColor(R.id.rl_item_muslim_pray, ContextCompat.getColor(getContext(), R.color.white));
        }
    }
}
