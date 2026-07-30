package com.crrepa.band.my.device.watchface.adapter;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.WatchFaceSvgModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import w1.i;

/* loaded from: classes2.dex */
public class RecommendWatchFaceAdapter extends BaseQuickAdapter<WatchFaceSvgModel, BaseViewHolder> {
    private final boolean circleScreen;
    private final BaseBandModel connectBand;
    private final boolean roundedRectangleScreen;
    private float watchFaceRatio;

    class a implements Runnable {
        final /* synthetic */ RoundedImageView val$watchFacePreview;

        a(RoundedImageView roundedImageView) {
            this.val$watchFacePreview = roundedImageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            int measuredHeight = (int) (this.val$watchFacePreview.getMeasuredHeight() * RecommendWatchFaceAdapter.this.watchFaceRatio);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.val$watchFacePreview.getLayoutParams();
            layoutParams.width = measuredHeight;
            this.val$watchFacePreview.setLayoutParams(layoutParams);
        }
    }

    public RecommendWatchFaceAdapter(float f8) {
        super(R.layout.item_preset_watch_face);
        this.connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        this.circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        this.roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
        this.watchFaceRatio = f8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, WatchFaceSvgModel watchFaceSvgModel) {
        baseViewHolder.setGone(R.id.iv_add_album, true);
        baseViewHolder.setGone(R.id.tv_watch_face_name, true);
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_preset_watch_face);
        roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundedImageView.setBorderWidth(R.dimen.watch_face_border_width);
        roundedImageView.setSecondBorderWidth(R.dimen.watch_face_box_width);
        roundedImageView.setBorderColor(-16777216);
        roundedImageView.setImageBitmap(i.getSvgBitmap(watchFaceSvgModel));
        if (watchFaceSvgModel.isChecked()) {
            roundedImageView.setSecondBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.color_watch_face_border_h));
        } else {
            roundedImageView.setSecondBorderColor(-16777216);
        }
        if (this.circleScreen) {
            roundedImageView.setOval(true);
        } else if (this.roundedRectangleScreen) {
            roundedImageView.setCornerRadius(this.connectBand.getRoundedRadius());
        } else {
            roundedImageView.setBorderCornerRadius(this.connectBand.getRoundedRadius());
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull BaseViewHolder baseViewHolder) {
        super.onViewAttachedToWindow((RecommendWatchFaceAdapter) baseViewHolder);
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_preset_watch_face);
        roundedImageView.post(new a(roundedImageView));
    }
}
