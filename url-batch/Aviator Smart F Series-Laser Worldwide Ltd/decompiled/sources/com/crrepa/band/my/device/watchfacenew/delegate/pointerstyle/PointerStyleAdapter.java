package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.ClockPointerBean;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.File;

/* loaded from: classes2.dex */
public class PointerStyleAdapter extends BaseQuickAdapter<ClockPointerBean, BaseViewHolder> {
    private int checkedHandId;

    class a implements a0 {
        final /* synthetic */ RoundedImageView val$ivPointer;
        final /* synthetic */ File val$pointerFile;

        a(File file, RoundedImageView roundedImageView) {
            this.val$pointerFile = file;
            this.val$ivPointer = roundedImageView;
        }

        @Override // com.squareup.picasso.a0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            this.val$ivPointer.setImageResource(R.drawable.shape_black_oval_bg);
        }

        @Override // com.squareup.picasso.a0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            Log.d("WatchFacePointerStyle", "onBitmapLoaded");
            com.moyoung.dafit.module.common.utils.g.saveBitmap(bitmap, this.val$pointerFile);
            Picasso.get().load(this.val$pointerFile).into(this.val$ivPointer);
        }

        @Override // com.squareup.picasso.a0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    public PointerStyleAdapter() {
        super(R.layout.item_new_watch_face_clock_pointer);
        this.checkedHandId = 0;
    }

    private void initItemLayout(BaseViewHolder baseViewHolder) {
        Log.i("WatchFaceImgAdapter", "initItemLayout");
        final RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_pointer);
        roundedImageView.setColorFilter(-16777216, PorterDuff.Mode.DST_OVER);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            roundedImageView.setOval(true);
            return;
        }
        roundedImageView.setOval(false);
        final View view = baseViewHolder.getView(R.id.root);
        view.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.g
            @Override // java.lang.Runnable
            public final void run() {
                PointerStyleAdapter.lambda$initItemLayout$0(view, roundedImageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initItemLayout$0(View view, RoundedImageView roundedImageView) {
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        float measuredHeight = view.getMeasuredHeight() / screenHeight;
        roundedImageView.setCornerRadius(com.crrepa.band.my.device.watchfacenew.delegate.img.i.getCornerRadius() * measuredHeight);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (measuredHeight * screenWidth);
        view.setLayoutParams(layoutParams);
    }

    private static void renderPointerPreview(ClockPointerBean clockPointerBean, RoundedImageView roundedImageView) {
        File pointerFile = ClockPointerBean.getPointerFile(clockPointerBean.preview);
        if (!pointerFile.exists()) {
            Picasso.get().load(clockPointerBean.preview).into(new a(pointerFile, roundedImageView));
        } else {
            Picasso.get().load(pointerFile).into(roundedImageView);
            Log.d("WatchFacePointerStyle", "getPointerFile");
        }
    }

    public ClockPointerBean getCheckedPointerBean() {
        for (ClockPointerBean clockPointerBean : getData()) {
            if (clockPointerBean.id == this.checkedHandId) {
                return clockPointerBean;
            }
        }
        return null;
    }

    public File getCheckedPointerPreviewFile() {
        ClockPointerBean checkedPointerBean = getCheckedPointerBean();
        if (checkedPointerBean == null) {
            return null;
        }
        File pointerFile = ClockPointerBean.getPointerFile(checkedPointerBean.preview);
        if (pointerFile.exists()) {
            return pointerFile;
        }
        return null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setCheckedHandId(int i8) {
        this.checkedHandId = i8;
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, ClockPointerBean clockPointerBean) {
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_none);
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_pointer);
        if (clockPointerBean.isNonePointer) {
            textView.setVisibility(0);
            roundedImageView.setImageResource(R.drawable.shape_black_oval_bg);
        } else {
            textView.setVisibility(8);
            renderPointerPreview(clockPointerBean, roundedImageView);
        }
        int color = ContextCompat.getColor(roundedImageView.getContext(), R.color.assist_4);
        if (clockPointerBean.id == this.checkedHandId) {
            color = ContextCompat.getColor(roundedImageView.getContext(), R.color.main);
        }
        roundedImageView.setBorderColor(color);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i8) {
        initItemLayout(baseViewHolder);
        super.onBindViewHolder((PointerStyleAdapter) baseViewHolder, i8);
    }
}
