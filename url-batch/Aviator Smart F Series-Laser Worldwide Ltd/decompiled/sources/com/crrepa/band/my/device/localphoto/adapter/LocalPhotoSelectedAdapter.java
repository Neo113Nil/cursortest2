package com.crrepa.band.my.device.localphoto.adapter;

import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.localphoto.l;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.x0;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.v;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class LocalPhotoSelectedAdapter extends BaseQuickAdapter<File, BaseViewHolder> {
    private static final int RESIZE = o.dp2px(d.get(), 118.0f);
    private static final int UNCHECK_INDEX = -1;
    private final List<File> checkedItemList;
    private final List<String> savedPhotoNameList;

    public LocalPhotoSelectedAdapter() {
        super(R.layout.item_local_photo_selected);
        this.savedPhotoNameList = l.getCRPLocalPhotoInfo().getPhotoList();
        this.checkedItemList = new ArrayList();
    }

    private int getCheckedItemIndex(File file) {
        if (x0.isEmpty(this.checkedItemList)) {
            return -1;
        }
        for (int i8 = 0; i8 < this.checkedItemList.size(); i8++) {
            if (this.checkedItemList.get(i8).equals(file)) {
                return i8;
            }
        }
        return -1;
    }

    private void renderItemCheckStatus(File file, CheckBox checkBox) {
        if (isSavedPhoto(file)) {
            checkBox.setText("");
            checkBox.setBackgroundResource(R$drawable.ic_device_local_unable);
            return;
        }
        checkBox.setBackgroundResource(R.drawable.selector_watch_face_photo_select);
        int checkedItemIndex = getCheckedItemIndex(file);
        if (checkedItemIndex == -1) {
            checkBox.setChecked(false);
            checkBox.setText("");
        } else {
            checkBox.setChecked(true);
            checkBox.setText(String.valueOf(checkedItemIndex + 1));
        }
    }

    public List<File> getCheckedItemList() {
        return this.checkedItemList;
    }

    public void initCheckedPhotoList(List<File> list) {
        for (File file : list) {
            if (!isSavedPhoto(file)) {
                this.checkedItemList.add(file);
            }
        }
    }

    public boolean isSavedPhoto(File file) {
        if (x0.isEmpty(this.savedPhotoNameList)) {
            return false;
        }
        return this.savedPhotoNameList.contains(file.getName().split("\\.")[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, File file) {
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_photo);
        CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.cb_check);
        v load = Picasso.get().load(file);
        int i8 = RESIZE;
        load.resize(i8, i8).centerCrop().into(imageView);
        renderItemCheckStatus(file, checkBox);
    }
}
