package com.crrepa.band.my.device.muslim.adapter;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.model.MuslimFunction;

/* loaded from: classes2.dex */
public class FunctionAdapter extends BaseQuickAdapter<MuslimFunction, BaseViewHolder> {
    public FunctionAdapter() {
        super(R.layout.item_muslim_function);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, MuslimFunction muslimFunction) {
        baseViewHolder.setImageResource(R.id.iv_function, muslimFunction.getIcon());
        baseViewHolder.setText(R.id.tv_function_name, muslimFunction.getName());
    }
}
