package com.crrepa.band.my.device.watchface.adapter;

import android.graphics.PorterDuff;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceBean;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public class StoreWatchFaceSimilarAdapter extends BaseQuickAdapter<StoreWatchFaceBean, BaseViewHolder> {
    private final boolean circleScreen;
    private final BaseBandModel connectBand;
    private final boolean roundedRectangleScreen;

    public StoreWatchFaceSimilarAdapter() {
        super(R.layout.item_store_watch_face_similar);
        this.connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        this.circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        this.roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
    }

    private void setImgRound(RoundedImageView roundedImageView) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OVER;
        roundedImageView.setColorFilter(-16777216, mode);
        roundedImageView.setBorderWidth(R.dimen.watch_face_box_width);
        roundedImageView.setBorderColor(-16777216);
        if (this.circleScreen) {
            roundedImageView.setOval(true);
        } else if (this.roundedRectangleScreen) {
            roundedImageView.setCornerRadius(this.connectBand.getRoundedRadius());
        } else {
            roundedImageView.setBorderCornerRadius(this.connectBand.getRoundedRadius());
        }
        roundedImageView.setColorFilter(-16777216, mode);
    }

    private void showWatchFacePreview(String str, RoundedImageView roundedImageView) {
        setImgRound(roundedImageView);
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand instanceof CustomizeBandModel) {
            ((CustomizeBandModel) connectBand).loadWatchFaceStorePreview(roundedImageView, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, StoreWatchFaceBean storeWatchFaceBean) {
        showWatchFacePreview(storeWatchFaceBean.getPreview(), (RoundedImageView) baseViewHolder.getView(R.id.iv_watch_face));
    }
}
