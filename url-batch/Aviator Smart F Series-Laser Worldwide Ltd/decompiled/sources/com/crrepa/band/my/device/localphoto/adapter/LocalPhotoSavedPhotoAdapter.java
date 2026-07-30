package com.crrepa.band.my.device.localphoto.adapter;

import android.annotation.SuppressLint;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.localphoto.model.LocalPhotoSavedBean;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.o;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class LocalPhotoSavedPhotoAdapter extends BaseQuickAdapter<LocalPhotoSavedBean, BaseViewHolder> {
    private static final int RESIZE = o.dp2px(d.get(), 118.0f);
    private boolean isEditMode;

    public LocalPhotoSavedPhotoAdapter() {
        super(R.layout.item_local_photo_saved_photo);
        this.isEditMode = false;
    }

    public List<LocalPhotoSavedBean> getCheckedPhotoBeanList() {
        ArrayList arrayList = new ArrayList();
        for (LocalPhotoSavedBean localPhotoSavedBean : getData()) {
            if (localPhotoSavedBean.isChecked()) {
                arrayList.add(localPhotoSavedBean);
            }
        }
        return arrayList;
    }

    public List<String> getCheckedPhotoNameList() {
        ArrayList arrayList = new ArrayList();
        for (LocalPhotoSavedBean localPhotoSavedBean : getCheckedPhotoBeanList()) {
            if (localPhotoSavedBean.isChecked()) {
                arrayList.add(localPhotoSavedBean.fileName);
            }
        }
        return arrayList;
    }

    public boolean isAllSelected() {
        Iterator<LocalPhotoSavedBean> it = getData().iterator();
        while (it.hasNext()) {
            if (!it.next().isChecked()) {
                return false;
            }
        }
        return true;
    }

    public boolean isEditMode() {
        return this.isEditMode;
    }

    public void removeDeletedItemList() {
        for (LocalPhotoSavedBean localPhotoSavedBean : getCheckedPhotoBeanList()) {
            if (localPhotoSavedBean.isPhotoFileExist()) {
                localPhotoSavedBean.file.delete();
            }
            getData().remove(localPhotoSavedBean);
            notifyItemRemoved(getData().indexOf(localPhotoSavedBean));
        }
    }

    public void selectAll() {
        List<LocalPhotoSavedBean> data = getData();
        int i8 = 0;
        while (i8 < data.size()) {
            int i9 = i8 + 1;
            data.get(i8).checkedIndex = i9;
            notifyItemChanged(i8);
            i8 = i9;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setEditMode(boolean z7) {
        this.isEditMode = z7;
        Iterator<LocalPhotoSavedBean> it = getData().iterator();
        while (it.hasNext()) {
            it.next().resetCheckIndex();
        }
        notifyDataSetChanged();
    }

    public void unSelectAll() {
        List<LocalPhotoSavedBean> data = getData();
        for (int i8 = 0; i8 < data.size(); i8++) {
            data.get(i8).resetCheckIndex();
            notifyItemChanged(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, LocalPhotoSavedBean localPhotoSavedBean) {
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_photo);
        CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.cb_check);
        if (localPhotoSavedBean.isPhotoFileExist()) {
            v load = Picasso.get().load(localPhotoSavedBean.file);
            int i8 = RESIZE;
            load.resize(i8, i8).centerCrop().into(imageView);
        } else {
            imageView.setImageResource(R$drawable.img_local_photo_empty);
        }
        if (!this.isEditMode) {
            checkBox.setVisibility(8);
        } else {
            checkBox.setVisibility(0);
            checkBox.setChecked(localPhotoSavedBean.isChecked());
        }
    }
}
