package com.crrepa.band.my.device.watchface.adapter;

import android.graphics.PorterDuff;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceBean;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public class StoreWatchFaceListAdapter extends BaseQuickAdapter<StoreWatchFaceBean, BaseViewHolder> implements LoadMoreModule {
    private final boolean circleScreen;
    private final BaseBandModel connectBand;
    private final boolean roundedRectangleScreen;

    public StoreWatchFaceListAdapter() {
        super(R.layout.item_store_watch_face_list);
        this.connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        this.circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        this.roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
    }

    private void setImgRound(RoundedImageView roundedImageView) {
        if (roundedImageView == null) {
            return;
        }
        roundedImageView.setColorFilter(-16777216, PorterDuff.Mode.DST_OVER);
        roundedImageView.setBorderWidth(R.dimen.watch_face_box_width);
        roundedImageView.setBorderColor(-16777216);
        if (this.circleScreen) {
            roundedImageView.setOval(true);
        } else if (this.roundedRectangleScreen) {
            roundedImageView.setCornerRadius(this.connectBand.getRoundedRadius());
        } else {
            roundedImageView.setBorderCornerRadius(this.connectBand.getRoundedRadius());
        }
    }

    private void showWatchFacePreview(String str, RoundedImageView roundedImageView) {
        setImgRound(roundedImageView);
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand instanceof CustomizeBandModel) {
            ((CustomizeBandModel) connectBand).loadWatchFaceStorePreview(roundedImageView, str);
        }
    }

    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    @NonNull
    public BaseLoadMoreModule addLoadMoreModule(@NonNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return new BaseLoadMoreModule(baseQuickAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, StoreWatchFaceBean storeWatchFaceBean) {
        baseViewHolder.setText(R.id.tv_name, storeWatchFaceBean.getName());
        showWatchFacePreview(storeWatchFaceBean.getPreview(), (RoundedImageView) baseViewHolder.getView(R.id.iv_watch_face));
    }
}
