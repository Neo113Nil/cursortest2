package com.crrepa.band.my.device.watchfacenew.delegate.img;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
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
public class WatchFaceImgAdapter extends BaseQuickAdapter<ImgSelectedBean, BaseViewHolder> {
    public int checkedIndex;
    public Boolean isEditingState;

    public WatchFaceImgAdapter() {
        super(R.layout.item_gallery_watch_face);
        this.isEditingState = Boolean.FALSE;
        this.checkedIndex = -1;
        addChildClickViewIds(R.id.iv_close, R.id.iv_photo);
    }

    private void initItemLayout(BaseViewHolder baseViewHolder) {
        Log.i("WatchFaceImgAdapter", "initItemLayout");
        final RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_photo);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            roundedImageView.setOval(true);
            return;
        }
        roundedImageView.setOval(false);
        final RelativeLayout relativeLayout = (RelativeLayout) baseViewHolder.getView(R.id.root);
        relativeLayout.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.img.b
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceImgAdapter.lambda$initItemLayout$0(relativeLayout, roundedImageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initItemLayout$0(RelativeLayout relativeLayout, RoundedImageView roundedImageView) {
        int screenWidth = i.getScreenWidth();
        int screenHeight = i.getScreenHeight();
        float measuredHeight = relativeLayout.getMeasuredHeight() / screenHeight;
        roundedImageView.setCornerRadius(i.getCornerRadius() * measuredHeight);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = (int) (measuredHeight * screenWidth);
        relativeLayout.setLayoutParams(layoutParams);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void enableDelete(Boolean bool) {
        this.isEditingState = bool;
        notifyDataSetChanged();
    }

    public void onMove(int i8, int i9) {
        ImgSelectedBean imgSelectedBean = getData().get(i8);
        getData().remove(i8);
        getData().add(i9, imgSelectedBean);
        notifyItemMoved(i8, i9);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setCheckedIndex(int i8) {
        this.checkedIndex = i8;
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, ImgSelectedBean imgSelectedBean) {
        baseViewHolder.setVisible(R.id.iv_close, this.isEditingState.booleanValue());
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_photo);
        Picasso.get().load(new File(imgSelectedBean.path)).into(roundedImageView);
        if (getItemPosition(imgSelectedBean) == this.checkedIndex) {
            roundedImageView.setBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.color_watch_face_border_h));
        } else {
            roundedImageView.setBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.translucent));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public ImgSelectedBean getItem(int i8) {
        if (i8 < 0 || i8 >= getData().size()) {
            return null;
        }
        return getData().get(i8);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i8) {
        initItemLayout(baseViewHolder);
        super.onBindViewHolder((WatchFaceImgAdapter) baseViewHolder, i8);
    }
}
