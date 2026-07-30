package com.crrepa.band.my.device.ai.picture.adapter;

import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.ai.picture.model.AIPictureHistoryBean;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;
import java.io.File;

/* loaded from: classes2.dex */
public class AIPictureHistoryAdapter extends BaseQuickAdapter<AIPictureHistoryBean, BaseViewHolder> {
    public AIPictureHistoryAdapter() {
        super(R.layout.item_ai_picture_history);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, AIPictureHistoryBean aIPictureHistoryBean) {
        ((TextView) baseViewHolder.getView(R.id.tv_description)).setText(aIPictureHistoryBean.getDescription());
        Picasso.get().load(new File(aIPictureHistoryBean.getPictureFilePath())).into((RoundedImageView) baseViewHolder.getView(R.id.iv_picture));
    }
}
