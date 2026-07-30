package com.moyoung.dafit.module.common.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.moyoung.dafit.module.common.R$id;
import com.moyoung.dafit.module.common.R$layout;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes4.dex */
public class AvatarView extends RelativeLayout {
    RoundedImageView ivAvatar;
    TextView tvAvatar;

    public AvatarView(Context context) {
        this(context, null);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
    }

    public void setAvatar(String str) {
        this.tvAvatar.setVisibility(0);
        this.ivAvatar.setVisibility(8);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.tvAvatar.setText(str.substring(0, 1));
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        View inflate = LayoutInflater.from(context).inflate(R$layout.view_contact_avatar, (ViewGroup) this, false);
        this.tvAvatar = (TextView) inflate.findViewById(R$id.tv_avatar);
        this.ivAvatar = (RoundedImageView) inflate.findViewById(R$id.iv_avatar);
    }

    public void setAvatar(Bitmap bitmap) {
        this.ivAvatar.setVisibility(0);
        this.tvAvatar.setVisibility(8);
        this.ivAvatar.setImageBitmap(bitmap);
    }
}
