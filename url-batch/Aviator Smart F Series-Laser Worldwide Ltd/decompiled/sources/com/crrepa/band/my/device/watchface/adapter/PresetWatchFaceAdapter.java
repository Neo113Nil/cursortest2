package com.crrepa.band.my.device.watchface.adapter;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import cn.hutool.core.text.l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.PresetWatchFaceModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.orhanobut.logger.f;
import java.util.List;

/* loaded from: classes2.dex */
public class PresetWatchFaceAdapter extends BaseQuickAdapter<PresetWatchFaceModel, BaseViewHolder> {
    private final boolean circleScreen;
    private final BaseBandModel connectBand;
    private final boolean roundedRectangleScreen;

    public PresetWatchFaceAdapter() {
        super(R.layout.item_preset_watch_face);
        this.connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        this.circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        this.roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
        addChildClickViewIds(R.id.btn_watch_face_edit, R.id.iv_add_album);
    }

    private void setDefaultOrPresetWatchFace(BaseViewHolder baseViewHolder, String str) {
        baseViewHolder.setGone(R.id.btn_watch_face_edit, true);
        baseViewHolder.setVisible(R.id.tv_watch_face_name, true);
        baseViewHolder.setText(R.id.tv_watch_face_name, str);
    }

    private void setFaceGalleryOrAiWatchFace(BaseViewHolder baseViewHolder, String str) {
        baseViewHolder.setGone(R.id.tv_watch_face_name, true);
        baseViewHolder.setVisible(R.id.btn_watch_face_edit, true);
        baseViewHolder.setText(R.id.btn_watch_face_edit, str);
    }

    private void showWatchFace(PresetWatchFaceModel presetWatchFaceModel, RoundedImageView roundedImageView) {
        int customizeWatchFaceIndex;
        if (presetWatchFaceModel.getType() != 1 || (customizeWatchFaceIndex = this.connectBand.getCustomizeWatchFaceIndex()) < 0) {
            presetWatchFaceModel.getRequestCreator().centerCrop().into(roundedImageView);
        } else {
            ((CustomizeBandModel) this.connectBand).loadBandWatchFace(customizeWatchFaceIndex, roundedImageView);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i8, @NonNull List list) {
        onBindViewHolder((BaseViewHolder) viewHolder, i8, (List<Object>) list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, PresetWatchFaceModel presetWatchFaceModel) {
        baseViewHolder.setGone(R.id.iv_add_album, presetWatchFaceModel.hasWatchFace());
        int type = presetWatchFaceModel.getType();
        if (type == 1) {
            setDefaultOrPresetWatchFace(baseViewHolder, getContext().getString(R.string.watch_face_default));
        } else if (type == 2) {
            setDefaultOrPresetWatchFace(baseViewHolder, getContext().getString(R.string.watch_face_preset) + l.SPACE + getItemPosition(presetWatchFaceModel));
        } else if (type != 4) {
            baseViewHolder.setImageResource(R.id.iv_add_album, R$drawable.ic_watchface_add);
            setFaceGalleryOrAiWatchFace(baseViewHolder, getContext().getString(R.string.watch_face_customize));
        } else {
            baseViewHolder.setImageResource(R.id.iv_add_album, R$drawable.ic_watchface_ai);
            setFaceGalleryOrAiWatchFace(baseViewHolder, getContext().getString(R.string.ai_wear_watch_face));
        }
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_preset_watch_face);
        roundedImageView.setBorderWidth(R.dimen.watch_face_border_width);
        roundedImageView.setSecondBorderWidth(R.dimen.watch_face_box_width);
        roundedImageView.setBorderColor(-16777216);
        if (presetWatchFaceModel.isChecked()) {
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
        showWatchFace(presetWatchFaceModel, roundedImageView);
        roundedImageView.setColorFilter(-16777216, PorterDuff.Mode.DST_OVER);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i8, @NonNull List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder((PresetWatchFaceAdapter) baseViewHolder, i8, list);
            return;
        }
        f.d("onBindViewHolder: " + list.get(0).toString());
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.iv_preset_watch_face);
        PresetWatchFaceModel presetWatchFaceModel = getData().get(i8);
        if (presetWatchFaceModel.isChecked()) {
            roundedImageView.setSecondBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.color_watch_face_border_h));
        } else {
            roundedImageView.setSecondBorderColor(-16777216);
        }
        baseViewHolder.setGone(R.id.iv_add_album, presetWatchFaceModel.hasWatchFace());
        Bitmap bitmap = presetWatchFaceModel.getBitmap();
        if (bitmap != null) {
            roundedImageView.setImageBitmap(bitmap);
        }
    }
}
