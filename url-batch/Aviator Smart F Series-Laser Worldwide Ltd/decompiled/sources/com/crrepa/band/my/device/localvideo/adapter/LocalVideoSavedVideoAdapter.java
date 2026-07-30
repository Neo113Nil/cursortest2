package com.crrepa.band.my.device.localvideo.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.utils.a;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.l0;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;
import java.io.File;

/* loaded from: classes2.dex */
public class LocalVideoSavedVideoAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    private final boolean circleScreen;

    public LocalVideoSavedVideoAdapter() {
        super(R.layout.item_local_video_saved_video);
        this.circleScreen = a.getInstance().isCircleScreen();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, String str) {
        baseViewHolder.setText(R.id.tv_title, d.get().getString(R.string.device_video_watch_face_video_title) + (getData().indexOf(str) + 1));
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_cover);
        if (this.circleScreen) {
            roundedImageView.setOval(true);
        }
        File file = new File(g0.getMovieFilePath(d.get(), str));
        if (!file.exists()) {
            roundedImageView.setImageResource(R$drawable.img_local_video_empty);
            baseViewHolder.setText(R.id.tv_msg, "");
            return;
        }
        baseViewHolder.setText(R.id.tv_msg, m.format(file.lastModified(), "yyyy/MM/dd HH:mm") + "  " + l0.getStorageSize(file.length()));
        String substring = str.substring(0, str.lastIndexOf("."));
        Picasso.get().load(new File(g0.getPicturesFilePath(d.get(), substring + ".png"))).placeholder(R$drawable.img_local_video_empty).into(roundedImageView);
    }
}
