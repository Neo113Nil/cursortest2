package com.crrepa.band.my.device.customkey.adapter;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.customkey.model.ActionInfo;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class ActionAdapter extends BaseQuickAdapter<ActionInfo, BaseViewHolder> {
    public ActionAdapter() {
        super(R.layout.item_action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, ActionInfo actionInfo) {
        if (actionInfo.getIcon() == 0) {
            baseViewHolder.setGone(R.id.iv_icon, true);
        } else {
            baseViewHolder.setVisible(R.id.iv_icon, true);
            baseViewHolder.setImageResource(R.id.iv_icon, actionInfo.getIcon());
        }
        f.d("ActionInfo: " + actionInfo);
        baseViewHolder.setText(R.id.tv_title, actionInfo.getDescribe());
        if (actionInfo.isHasGoal()) {
            baseViewHolder.setVisible(R.id.iv_selected, true);
            baseViewHolder.setImageResource(R.id.iv_selected, R$drawable.ic_continue_click);
        } else {
            baseViewHolder.setVisible(R.id.iv_selected, actionInfo.isSelected());
            baseViewHolder.setImageResource(R.id.iv_selected, R$drawable.ic_list_selected);
        }
    }
}
