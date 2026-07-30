package com.crrepa.band.my.device.muslim.adapter;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.muslim.model.AllahName;

/* loaded from: classes2.dex */
public class AllahNameAdapter extends BaseQuickAdapter<AllahName, BaseViewHolder> {
    public AllahNameAdapter() {
        super(R.layout.item_allah_name);
        addChildClickViewIds(R.id.iv_collect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, AllahName allahName) {
        if (allahName.isFavorite()) {
            baseViewHolder.setImageResource(R.id.iv_collect, R$drawable.ic_collect_planarity);
        } else {
            baseViewHolder.setImageResource(R.id.iv_collect, R$drawable.ic_collect_linear);
        }
        baseViewHolder.setText(R.id.tv_name_left, allahName.getEnName());
        baseViewHolder.setText(R.id.tv_name_right, allahName.getArName());
        baseViewHolder.setText(R.id.tv_index, String.valueOf(allahName.getIndex()));
    }
}
