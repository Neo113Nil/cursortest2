package com.crrepa.band.my.device.ai.chat;

import android.widget.ImageView;
import com.artillery.ctc.base.LargeModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.squareup.picasso.Picasso;
import java.util.Objects;

/* loaded from: classes2.dex */
public class AILargeModeAdapter extends BaseQuickAdapter<LargeModel, BaseViewHolder> {
    private final String selectedLargeModelType;

    public AILargeModeAdapter() {
        super(R.layout.item_ai_large_mode);
        this.selectedLargeModelType = AIProvider.getSelectedLargeModelType();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, LargeModel largeModel) {
        baseViewHolder.setVisible(R.id.iv_selected, Objects.equals(largeModel.type, this.selectedLargeModelType));
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_big_icon);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R.id.iv_icon);
        if ("kimi".equals(largeModel.type)) {
            imageView.setImageResource(R$drawable.ic_device_ai_kimi);
            imageView.setVisibility(0);
            imageView2.setVisibility(4);
        } else {
            baseViewHolder.setText(R.id.tv_name, largeModel.name);
            Picasso.get().load(largeModel.icon).into(imageView2);
            imageView.setVisibility(4);
            imageView2.setVisibility(0);
        }
    }
}
