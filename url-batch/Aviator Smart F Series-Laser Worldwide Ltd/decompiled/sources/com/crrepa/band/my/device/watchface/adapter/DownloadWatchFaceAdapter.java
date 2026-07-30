package com.crrepa.band.my.device.watchface.adapter;

import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import cn.hutool.core.text.l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.DownloadWatchFaceModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.crrepa.band.my.model.db.DownloadWatchFace;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes2.dex */
public class DownloadWatchFaceAdapter extends BaseQuickAdapter<DownloadWatchFaceModel, BaseViewHolder> {
    private final boolean circleScreen;
    private final BaseBandModel connectBand;
    private final boolean roundedRectangleScreen;
    private final BaseWatchFaceProvider watchFaceProvider;

    public DownloadWatchFaceAdapter() {
        super(R.layout.item_download_watch_face);
        this.connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        this.circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        this.roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
        this.watchFaceProvider = new DefaultWatchFaceProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNewWatchFace$0(ImageView imageView, int i8, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setDownloadWatchFace(imageView, str);
        this.watchFaceProvider.saveWatchFacePreview(i8, str);
    }

    private void loadNewWatchFace(DownloadWatchFace downloadWatchFace, final ImageView imageView) {
        String url = downloadWatchFace.getUrl();
        final int intValue = downloadWatchFace.getWatchFaceId().intValue();
        if (TextUtils.isEmpty(url)) {
            this.watchFaceProvider.getWatchFacePreview(intValue).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchface.adapter.a
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DownloadWatchFaceAdapter.this.lambda$loadNewWatchFace$0(imageView, intValue, (String) obj);
                }
            }, new Consumer() { // from class: com.crrepa.band.my.device.watchface.adapter.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ((Throwable) obj).printStackTrace();
                }
            });
        } else {
            setDownloadWatchFace(imageView, url);
        }
    }

    private void setDownloadWatchFace(ImageView imageView, String str) {
        BaseBandModel baseBandModel = this.connectBand;
        if (baseBandModel instanceof CustomizeBandModel) {
            ((CustomizeBandModel) baseBandModel).loadWatchFaceStorePreview(imageView, str);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i8, @NonNull List list) {
        onBindViewHolder((BaseViewHolder) viewHolder, i8, (List<Object>) list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, DownloadWatchFaceModel downloadWatchFaceModel) {
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_watch_face);
        if (this.circleScreen) {
            roundedImageView.setOval(true);
        } else if (this.roundedRectangleScreen) {
            roundedImageView.setCornerRadius(this.connectBand.getRoundedRadius());
        } else {
            roundedImageView.setBorderCornerRadius(this.connectBand.getRoundedRadius());
        }
        loadNewWatchFace(downloadWatchFaceModel.getWatchFace(), roundedImageView);
        baseViewHolder.setText(R.id.tv_watch_face_name, d.get().getString(R.string.download_watchface) + l.SPACE + (getItemPosition(downloadWatchFaceModel) + 1));
        ((CheckBox) baseViewHolder.getView(R.id.cb_delete_watch_face)).setChecked(downloadWatchFaceModel.isChecked());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i8, @NonNull List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder((DownloadWatchFaceAdapter) baseViewHolder, i8, list);
        } else {
            ((CheckBox) baseViewHolder.getView(R.id.cb_delete_watch_face)).setChecked(getItem(i8).isChecked());
        }
    }
}
