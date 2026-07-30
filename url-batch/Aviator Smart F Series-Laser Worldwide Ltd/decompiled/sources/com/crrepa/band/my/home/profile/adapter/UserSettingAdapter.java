package com.crrepa.band.my.home.profile.adapter;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.UserSettingModel;

/* loaded from: classes2.dex */
public class UserSettingAdapter extends BaseQuickAdapter<UserSettingModel, BaseViewHolder> {
    public UserSettingAdapter() {
        super(R.layout.item_user_setting);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, UserSettingModel userSettingModel) {
        baseViewHolder.setText(R.id.tv_setting_name, userSettingModel.getName());
        userSettingModel.getIcon().into((ImageView) baseViewHolder.getView(R.id.iv_setting_icon));
        String hintText = userSettingModel.getHintText();
        boolean isEmpty = TextUtils.isEmpty(hintText);
        if (!isEmpty) {
            baseViewHolder.setText(R.id.tv_setting_hint, hintText);
        }
        baseViewHolder.setGone(R.id.tv_setting_hint, isEmpty);
        String content = userSettingModel.getContent();
        boolean isEmpty2 = TextUtils.isEmpty(content);
        if (!isEmpty2) {
            baseViewHolder.setText(R.id.tv_setting_content, content);
        }
        baseViewHolder.setGone(R.id.tv_setting_content, isEmpty2);
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_unread_news);
        if (userSettingModel.getUnreadNews() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(String.valueOf(userSettingModel.getUnreadNews()));
        }
    }
}
