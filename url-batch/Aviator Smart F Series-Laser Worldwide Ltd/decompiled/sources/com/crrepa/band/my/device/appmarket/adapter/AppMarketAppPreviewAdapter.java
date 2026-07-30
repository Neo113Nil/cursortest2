package com.crrepa.band.my.device.appmarket.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.o;
import com.squareup.picasso.Picasso;

/* loaded from: classes2.dex */
public class AppMarketAppPreviewAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public AppMarketAppPreviewAdapter() {
        super(R.layout.item_app_market_app_preview);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, String str) {
        Picasso.get().load(str).resize(o.dp2px(getContext(), 115.0f), o.dp2px(getContext(), 186.0f)).centerCrop().placeholder(R.drawable.shape_net_img_placeholder).into((ImageView) baseViewHolder.getView(R.id.iv_preview));
    }
}
