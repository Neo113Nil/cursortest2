package com.crrepa.band.my.health.base.editpage;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class EditInfoAdapter extends BaseQuickAdapter<i, BaseViewHolder> {
    public EditInfoAdapter() {
        super(R.layout.item_edit_info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, i iVar) {
        baseViewHolder.setText(R.id.tv_edit_title, iVar.getTitle());
        baseViewHolder.setText(R.id.tv_edit_data_text, iVar.getDataText());
        baseViewHolder.setTextColor(R.id.tv_edit_data_text, iVar.getDataColor());
    }
}
