package com.crrepa.band.my.device.watchfacenew.delegate.img;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.LayoutNewCustomWatchFaceImgBinding;
import com.crrepa.band.my.device.watchface.DressWatchFaceCameraActivity;
import com.crrepa.band.my.device.watchfacenew.photo.GalleryImgCropActivity;
import com.crrepa.band.my.device.watchfacenew.photo.model.ImgSelectedBean;
import com.crrepa.band.my.device.watchfacenew.photo.utils.PhotoWatchFaceItemTouchHelperCallback;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.moyoung.lib.photopicker.PhotoPickHelper;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class h implements com.crrepa.band.my.device.watchfacenew.delegate.img.a {
    private final LayoutNewCustomWatchFaceImgBinding binding;
    private final Fragment fragment;
    private final boolean isFromGallery;
    private final RoundedImageView ivPreview;
    private final int maxImgSize = m.getPhotoWatchFaceMaxCount();
    private final com.crrepa.band.my.device.watchfacenew.photo.utils.b imgCollector = com.crrepa.band.my.device.watchfacenew.photo.utils.b.get();
    private final l imgPresenter = new l(this);
    private final WatchFaceImgAdapter imgAdapter = new WatchFaceImgAdapter();

    class a implements com.moyoung.lib.photopicker.i {
        a() {
        }

        @Override // com.moyoung.lib.photopicker.i
        public /* bridge */ /* synthetic */ void onCanceled(String str) {
            com.moyoung.lib.photopicker.h.a(this, str);
        }

        @Override // com.moyoung.lib.photopicker.i
        public /* bridge */ /* synthetic */ void onPicked(Uri uri) {
            com.moyoung.lib.photopicker.h.b(this, uri);
        }

        @Override // com.moyoung.lib.photopicker.i
        public void unSupportGalleryMultiplePick() {
            r0.showLong(R.string.common_select_photo_long_press_enter_multiple_pick_tips);
            h.logUnSupportMultiplePickModelEvent();
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onPicked(List<Uri> list, boolean z7) {
            h.this.addAddedImageItem(list);
            h.this.fragment.startActivity(new Intent(h.this.fragment.requireContext(), (Class<?>) GalleryImgCropActivity.class));
        }
    }

    public h(Fragment fragment, LayoutNewCustomWatchFaceImgBinding layoutNewCustomWatchFaceImgBinding, RoundedImageView roundedImageView, boolean z7) {
        this.fragment = fragment;
        this.binding = layoutNewCustomWatchFaceImgBinding;
        this.ivPreview = roundedImageView;
        this.isFromGallery = z7;
        initListener();
        initImgRv();
        initAddImgBtn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddedImageItem(List<Uri> list) {
        this.imgCollector.addAddedPhotoItem(list);
    }

    private boolean checkRecommendedListChanged() {
        if (this.imgAdapter.getData().size() < 5) {
            return true;
        }
        if (this.imgAdapter.getData().size() == 5) {
            for (int i8 = 0; i8 < 5; i8++) {
                ImgSelectedBean item = this.imgAdapter.getItem(i8);
                if (item != null) {
                    String name = new File(item.path).getName();
                    if (!name.substring(0, name.lastIndexOf(".")).equals(i8 + "")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void createDressImg() {
        this.fragment.startActivityForResult(DressWatchFaceCameraActivity.getCallingIntent(this.fragment.requireContext()), 102);
    }

    private void deletePhoto(int i8) {
        WatchFaceImgAdapter watchFaceImgAdapter = this.imgAdapter;
        if (watchFaceImgAdapter.checkedIndex < 0) {
            watchFaceImgAdapter.getData().remove(i8);
        } else {
            if (i8 == 0 && watchFaceImgAdapter.getData().size() == 1) {
                renderPreviewImg(i.getPresetImgPath());
                this.imgAdapter.checkedIndex = -1;
            }
            WatchFaceImgAdapter watchFaceImgAdapter2 = this.imgAdapter;
            if (i8 <= watchFaceImgAdapter2.checkedIndex) {
                watchFaceImgAdapter2.setCheckedIndex(0);
            }
            this.imgAdapter.getData().remove(i8);
            WatchFaceImgAdapter watchFaceImgAdapter3 = this.imgAdapter;
            if (watchFaceImgAdapter3.checkedIndex >= 0 && !watchFaceImgAdapter3.getData().isEmpty()) {
                renderPreviewImg(this.imgAdapter.getData().get(this.imgAdapter.checkedIndex).path);
            }
        }
        renderAndUpdateAddedImgCount();
        this.imgAdapter.notifyItemRemoved(i8);
        if (this.imgAdapter.getData().isEmpty()) {
            this.binding.tvFaceEdit.performClick();
        }
    }

    private int getAddedImgListSize() {
        if (x0.isEmpty(this.imgAdapter.getData())) {
            return 0;
        }
        return this.imgAdapter.getData().size();
    }

    private List<String> getImgPathList() {
        ArrayList arrayList = new ArrayList();
        List<ImgSelectedBean> data = this.imgAdapter.getData();
        if (!x0.isEmpty(data) && this.imgAdapter.checkedIndex >= 0) {
            for (ImgSelectedBean imgSelectedBean : data) {
                arrayList.add(imgSelectedBean.path);
                Log.d("getImgPathList", "getPhotoNames: " + imgSelectedBean.path);
            }
        }
        return arrayList;
    }

    private void initAddImgBtn() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            this.binding.ivAddImg.setVisibility(8);
        } else {
            this.binding.rlAddImg.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.img.e
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.lambda$initAddImgBtn$3();
                }
            });
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables", "NonConstantResourceId"})
    private void initImgRv() {
        this.binding.rcvPresetList.setLayoutManager(new LinearLayoutManager(com.moyoung.dafit.module.common.utils.d.get(), 0, false));
        this.binding.rcvPresetList.addItemDecoration(new SpacesItemDecoration(o.dp2px(com.moyoung.dafit.module.common.utils.d.get(), 5.0f)));
        this.binding.rcvPresetList.setAdapter(this.imgAdapter);
        new ItemTouchHelper(new PhotoWatchFaceItemTouchHelperCallback(this.imgAdapter)).attachToRecyclerView(this.binding.rcvPresetList);
        this.imgAdapter.setOnItemChildClickListener(new OnItemChildClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.img.f
            @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                h.this.lambda$initImgRv$1(baseQuickAdapter, view, i8);
            }
        });
    }

    private void initListener() {
        this.binding.rlAddImg.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.img.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.this.lambda$initListener$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAddImgBtn$3() {
        int screenWidth = i.getScreenWidth();
        int screenHeight = i.getScreenHeight();
        int cornerRadius = i.getCornerRadius();
        float measuredHeight = this.binding.rlAddImg.getMeasuredHeight() / screenHeight;
        ViewGroup.LayoutParams layoutParams = this.binding.rlAddImg.getLayoutParams();
        layoutParams.width = (int) (screenWidth * measuredHeight);
        layoutParams.height = this.binding.rlAddImg.getMeasuredHeight();
        this.binding.rlAddImg.setLayoutParams(layoutParams);
        this.binding.ivAddImg.setImageDrawable(new ColorDrawable(-16777216));
        this.binding.ivAddImg.setOval(false);
        this.binding.ivAddImg.setCornerRadius(measuredHeight * cornerRadius);
        ViewGroup.LayoutParams layoutParams2 = this.binding.ivAddImg.getLayoutParams();
        layoutParams2.height = this.binding.rlAddImg.getMeasuredHeight();
        this.binding.ivAddImg.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initImgRv$1(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            deletePhoto(i8);
        } else {
            if (id != R.id.iv_photo) {
                return;
            }
            ImgSelectedBean item = this.imgAdapter.getItem(i8);
            if (item != null) {
                renderPreviewImg(item.path);
            }
            this.imgAdapter.setCheckedIndex(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        if (this.isFromGallery) {
            pickMultipleImg();
        } else {
            createDressImg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderPreviewImg$0(String str) {
        if (new File(str).exists()) {
            Picasso.get().load(new File(str)).into(this.ivPreview);
        } else {
            this.ivPreview.setImageResource(R$drawable.img_watchface_dress_default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logUnSupportMultiplePickModelEvent() {
        s0.logEvent("不支持图片多选的手机机型", "un_support_multiple_pick_mobile_phone_model", com.moyoung.dafit.module.common.utils.b.getSystemModel());
    }

    private void pickMultipleImg() {
        setCalculateFreeSpace();
        PhotoPickHelper.pickMultipleImg(this.fragment, this.maxImgSize - getAddedImgListSize(), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderAddImg() {
        if (this.imgAdapter.getData().size() >= this.maxImgSize || isEditingState()) {
            this.binding.rlAddImg.setVisibility(8);
        } else {
            this.binding.rlAddImg.setVisibility(0);
        }
    }

    @SuppressLint({"SetTextI18n"})
    private void renderAndUpdateAddedImgCount() {
        String string = this.isFromGallery ? com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_photo_watch_face_title) : com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_custom_style_watch_face_title);
        if (this.imgAdapter.getData().isEmpty()) {
            this.binding.tvWatchFaceNum.setText(string + " (0/" + this.maxImgSize + ")");
            this.binding.tvFaceEdit.setVisibility(8);
        } else {
            this.binding.tvWatchFaceNum.setText(String.format(string + " (%d/" + this.maxImgSize + ")", Integer.valueOf(getAddedImgListSize())));
            this.binding.tvFaceEdit.setVisibility(0);
        }
        this.binding.rlAddImg.postDelayed(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.img.d
            @Override // java.lang.Runnable
            public final void run() {
                h.this.renderAddImg();
            }
        }, 100L);
    }

    private void setCalculateFreeSpace() {
        this.imgCollector.setCalculateFreeSpace(m.getPhotoWatchFaceAvailableSize() - (getAddedImgListSize() * 110));
        this.imgCollector.clear();
    }

    private void showDressImg(String str) {
        this.binding.tvTips.setText(R.string.device_custom_watch_face_hint);
        this.imgPresenter.showDressWatchFaceImg(str);
    }

    private void showGalleryImg(String str) {
        this.binding.tvTips.setText(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_custom_watch_face_tips, String.valueOf(this.maxImgSize)));
        this.imgPresenter.showGalleryWatchFaceImg(str);
    }

    public void destroy() {
        this.imgCollector.clear();
    }

    public String getCheckedImgPath() {
        WatchFaceImgAdapter watchFaceImgAdapter = this.imgAdapter;
        if (watchFaceImgAdapter.checkedIndex < 0 || x0.isEmpty(watchFaceImgAdapter.getData())) {
            return null;
        }
        WatchFaceImgAdapter watchFaceImgAdapter2 = this.imgAdapter;
        ImgSelectedBean item = watchFaceImgAdapter2.getItem(watchFaceImgAdapter2.checkedIndex);
        if (item == null) {
            return null;
        }
        return item.path;
    }

    public int getCheckedIndex() {
        return this.imgAdapter.checkedIndex;
    }

    public List<File> getImgFileList() {
        ArrayList arrayList = new ArrayList();
        List<String> imgPathList = getImgPathList();
        if (x0.isEmpty(imgPathList)) {
            return arrayList;
        }
        Iterator<String> it = imgPathList.iterator();
        while (it.hasNext()) {
            arrayList.add(new File(it.next()));
        }
        return arrayList;
    }

    public List<String> getImgNameSuffixlessList() {
        ArrayList arrayList = new ArrayList();
        List<String> imgPathList = getImgPathList();
        if (x0.isEmpty(imgPathList)) {
            return arrayList;
        }
        Iterator<String> it = imgPathList.iterator();
        while (it.hasNext()) {
            arrayList.add(g0.getFileNameSuffixlessFromPath(new File(it.next()).getAbsolutePath()));
        }
        return arrayList;
    }

    public boolean isEditingState() {
        return this.imgAdapter.isEditingState.booleanValue();
    }

    public boolean isNotEditingState() {
        return !this.imgAdapter.isEditingState.booleanValue();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.img.a
    public void renderCroppedImgList(List<String> list, int i8) {
        for (String str : list) {
            ImgSelectedBean imgSelectedBean = new ImgSelectedBean();
            imgSelectedBean.path = str;
            this.imgAdapter.addData((WatchFaceImgAdapter) imgSelectedBean);
        }
        if (i8 >= 0) {
            this.imgAdapter.setCheckedIndex(i8);
        }
        renderAndUpdateAddedImgCount();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void renderDressAddedImgList(String str) {
        ImgSelectedBean imgSelectedBean = new ImgSelectedBean();
        imgSelectedBean.path = str;
        Log.d("imagePath", str);
        this.imgAdapter.addData(0, (int) imgSelectedBean);
        this.imgAdapter.notifyDataSetChanged();
        WatchFaceImgAdapter watchFaceImgAdapter = this.imgAdapter;
        watchFaceImgAdapter.checkedIndex = Math.max(watchFaceImgAdapter.checkedIndex, 0);
        String checkedImgPath = getCheckedImgPath();
        if (x0.isNotEmpty(checkedImgPath)) {
            renderPreviewImg(checkedImgPath);
        }
        renderAndUpdateAddedImgCount();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void renderGalleryAddedImgList() {
        if (x0.isNotEmpty(this.imgCollector.getCroppedImgList())) {
            this.imgAdapter.addData(0, (Collection) this.imgCollector.getCroppedImgList());
            this.imgAdapter.notifyDataSetChanged();
            WatchFaceImgAdapter watchFaceImgAdapter = this.imgAdapter;
            watchFaceImgAdapter.checkedIndex = Math.max(watchFaceImgAdapter.checkedIndex, 0);
            String checkedImgPath = getCheckedImgPath();
            if (x0.isNotEmpty(checkedImgPath)) {
                renderPreviewImg(checkedImgPath);
            }
            this.imgCollector.getCroppedImgList().clear();
        }
        renderAndUpdateAddedImgCount();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.img.a
    public void renderPreviewImg(@NonNull final String str) {
        this.ivPreview.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.img.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.lambda$renderPreviewImg$0(str);
            }
        });
    }

    public void saveSentToBandImgNameList() {
        List<String> imgNameSuffixlessList = getImgNameSuffixlessList();
        if (this.isFromGallery) {
            m.saveGalleryPhotoNameList(imgNameSuffixlessList);
        } else {
            m.saveDressPhotoNameList(imgNameSuffixlessList);
        }
        m.saveSentToBandPhotoNameList(imgNameSuffixlessList);
        m.saveSentToBandIsGallery(this.isFromGallery);
    }

    public void showWatchFaceImg(String str) {
        if (this.isFromGallery) {
            showGalleryImg(str);
        } else {
            showDressImg(str);
        }
    }

    public void updateEditStateUI() {
        ImgSelectedBean item;
        if (!isEditingState()) {
            this.imgAdapter.enableDelete(Boolean.TRUE);
            renderAddImg();
            this.binding.tvFaceEdit.setText(R.string.done);
            this.binding.tvFaceEdit.setVisibility(0);
            return;
        }
        this.imgAdapter.enableDelete(Boolean.FALSE);
        renderAddImg();
        this.binding.tvFaceEdit.setText(R.string.edit);
        this.binding.tvFaceEdit.setVisibility(this.imgAdapter.getData().isEmpty() ? 8 : 0);
        if (this.imgAdapter.checkedIndex == -1 && checkRecommendedListChanged()) {
            this.imgAdapter.checkedIndex = 0;
        }
        WatchFaceImgAdapter watchFaceImgAdapter = this.imgAdapter;
        int i8 = watchFaceImgAdapter.checkedIndex;
        if (i8 <= -1 || (item = watchFaceImgAdapter.getItem(i8)) == null) {
            return;
        }
        renderPreviewImg(item.path);
    }
}
