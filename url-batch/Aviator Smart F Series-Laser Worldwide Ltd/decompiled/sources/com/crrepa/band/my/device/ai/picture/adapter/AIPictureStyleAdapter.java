package com.crrepa.band.my.device.ai.picture.adapter;

import android.content.Context;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.picture.model.AIPictureStyleBean;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;
import java.util.List;

/* loaded from: classes2.dex */
public class AIPictureStyleAdapter extends BaseQuickAdapter<AIPictureStyleBean, BaseViewHolder> {
    private final Context context;
    private int selectedPosition;

    public AIPictureStyleAdapter(Context context) {
        super(R.layout.item_ai_picture_style);
        this.selectedPosition = -1;
        this.context = context;
    }

    public AIPictureStyleBean getPictureStyle() {
        return getData().size() == 0 ? new AIPictureStyleBean("", "", "") : this.selectedPosition < 0 ? new AIPictureStyleBean("", "", "") : getData().get(this.selectedPosition);
    }

    public String getStyleName(AIPictureStyleBean aIPictureStyleBean) {
        if (AIProvider.getProviderType() != 0) {
            return aIPictureStyleBean.getName();
        }
        String style = aIPictureStyleBean.getStyle();
        int i8 = "205".equals(style) ? R.string.ai_picture_style_205 : "106".equals(style) ? R.string.ai_picture_style_106 : "105".equals(style) ? R.string.ai_picture_style_105 : m.NEW_CUSTOM_WATCH_FACE_PRESET_IMG.equals(style) ? R.string.ai_picture_style_101 : "303".equals(style) ? R.string.ai_picture_style_303 : "302".equals(style) ? R.string.ai_picture_style_302 : "305".equals(style) ? R.string.ai_picture_style_305 : "306".equals(style) ? R.string.ai_picture_style_306 : -1;
        return i8 == -1 ? "" : this.context.getResources().getString(i8);
    }

    public void setSelectedPosition(int i8) {
        if (this.selectedPosition != i8) {
            this.selectedPosition = i8;
            AIProvider.saveSelectedPictureStyleCode(getData().get(i8).getStyle());
        } else {
            this.selectedPosition = -1;
            AIProvider.saveSelectedPictureStyleCode("");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, AIPictureStyleBean aIPictureStyleBean) {
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_title);
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_style);
        textView.setText(getStyleName(aIPictureStyleBean));
        Picasso.get().load(aIPictureStyleBean.getUrl()).into(roundedImageView);
        if (this.selectedPosition < 0 || aIPictureStyleBean != getData().get(this.selectedPosition)) {
            roundedImageView.setBorderColor(this.context.getResources().getColor(R.color.translucent));
            textView.setTextColor(this.context.getResources().getColor(R.color.assist_11_33));
        } else {
            roundedImageView.setBorderColor(this.context.getResources().getColor(R.color.main));
            textView.setTextColor(this.context.getResources().getColor(R.color.main));
        }
    }

    public void setSelectedPosition() {
        String selectedPictureStyleCode = AIProvider.getSelectedPictureStyleCode();
        if (x0.isEmpty(selectedPictureStyleCode)) {
            return;
        }
        List<AIPictureStyleBean> data = getData();
        for (int i8 = 0; i8 < data.size(); i8++) {
            if (data.get(i8).getStyle().equals(selectedPictureStyleCode)) {
                this.selectedPosition = i8;
                return;
            }
        }
    }
}
