package com.crrepa.band.my.device.muslim.adapter;

import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.model.PrayerCompensationModel;

/* loaded from: classes2.dex */
public class PrayerCompensationAdapter extends BaseQuickAdapter<PrayerCompensationModel, BaseViewHolder> {
    public PrayerCompensationAdapter() {
        super(R.layout.item_prayer_compensation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, PrayerCompensationModel prayerCompensationModel) {
        baseViewHolder.setText(R.id.tv_title, prayerCompensationModel.getTimeName());
        baseViewHolder.setText(R.id.tv_value, prayerCompensationModel.getPrayerCompensation() + l.SPACE + (Math.abs(prayerCompensationModel.getPrayerCompensation()) != 1 ? getContext().getString(R.string.muslim_prayer_compensation_minutes) : getContext().getString(R.string.muslim_prayer_compensation_minute)));
    }
}
