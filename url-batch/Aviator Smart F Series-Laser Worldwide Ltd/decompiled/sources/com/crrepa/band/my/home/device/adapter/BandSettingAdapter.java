package com.crrepa.band.my.home.device.adapter;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.BandSettingItemModel;

/* loaded from: classes2.dex */
public class BandSettingAdapter extends BaseQuickAdapter<BandSettingItemModel, BaseViewHolder> {
    public BandSettingAdapter() {
        super(R.layout.item_band_setting);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, BandSettingItemModel bandSettingItemModel) {
        baseViewHolder.setText(R.id.tv_setting_name, bandSettingItemModel.getName());
        baseViewHolder.setImageResource(R.id.iv_setting_icon, bandSettingItemModel.getIcon());
        baseViewHolder.setVisible(R.id.iv_badge, bandSettingItemModel.isNewVersion());
    }
}
