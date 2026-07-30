package com.crrepa.band.my.device.customkey.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.customkey.model.FeatureInfo;

/* loaded from: classes2.dex */
public class TrainingCategoryAdapter extends BaseQuickAdapter<FeatureInfo, BaseViewHolder> {
    public TrainingCategoryAdapter() {
        super(R.layout.item_trianing_category);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, FeatureInfo featureInfo) {
        baseViewHolder.setImageResource(R.id.iv_icon, featureInfo.getIcon());
        baseViewHolder.setText(R.id.tv_title, featureInfo.getName());
    }
}
