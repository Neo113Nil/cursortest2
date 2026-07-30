package com.crrepa.band.my.device.watchfacenew.photo;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.photo.model.ImgSelectedBean;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;
import java.io.File;

/* loaded from: classes2.dex */
public class GalleryImgCropAdapter extends BaseQuickAdapter<ImgSelectedBean, BaseViewHolder> {
    private int checkedIndex;

    public GalleryImgCropAdapter() {
        super(R.layout.item_new_custom_watch_face_crop);
        this.checkedIndex = 0;
        addChildClickViewIds(R.id.iv_close, R.id.iv_photo);
    }

    public int getCheckedIndex() {
        return this.checkedIndex;
    }

    public void setCheckedIndex(int i8) {
        this.checkedIndex = i8;
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, ImgSelectedBean imgSelectedBean) {
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_photo);
        Picasso.get().load(new File(imgSelectedBean.path)).resize(120, 120).centerCrop().into(roundedImageView);
        roundedImageView.setBorderWidth(3.0f);
        roundedImageView.setSecondBorderWidth(3.0f);
        roundedImageView.setBorderColor(0);
        if (getItemPosition(imgSelectedBean) == this.checkedIndex) {
            roundedImageView.setSecondBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.color_watch_face_border_h));
        } else {
            roundedImageView.setSecondBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.translucent));
        }
    }
}
