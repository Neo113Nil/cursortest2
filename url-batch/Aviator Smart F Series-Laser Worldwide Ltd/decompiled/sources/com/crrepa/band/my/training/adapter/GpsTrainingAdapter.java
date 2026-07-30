package com.crrepa.band.my.training.adapter;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsTrainingModel;

/* loaded from: classes3.dex */
public class GpsTrainingAdapter extends BaseQuickAdapter<GpsTrainingModel, BaseViewHolder> {
    public GpsTrainingAdapter() {
        super(R.layout.item_gps_training_list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, GpsTrainingModel gpsTrainingModel) {
        baseViewHolder.setImageResource(R.id.iv_gps_training_icon, gpsTrainingModel.getIcon());
        baseViewHolder.setText(R.id.tv_gps_training_name, gpsTrainingModel.getName());
    }
}
