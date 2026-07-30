package com.crrepa.band.my.profile.userinfo;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.UserInfoModel;

/* loaded from: classes2.dex */
public class UserInfoAdapter extends BaseQuickAdapter<UserInfoModel, BaseViewHolder> {
    public UserInfoAdapter() {
        super(R.layout.item_user_info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, UserInfoModel userInfoModel) {
        baseViewHolder.setText(R.id.tv_user_info_type, userInfoModel.getName());
        baseViewHolder.setText(R.id.tv_user_info_content, userInfoModel.getContent());
    }
}
