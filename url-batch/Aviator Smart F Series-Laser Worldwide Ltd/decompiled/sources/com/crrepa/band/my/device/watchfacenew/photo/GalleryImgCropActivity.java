package com.crrepa.band.my.device.watchfacenew.photo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityNewCustomWatchFaceImgCropBinding;
import com.crrepa.band.my.device.watchfacenew.photo.model.ImgSelectedBean;
import com.crrepa.band.my.device.watchfacenew.photo.utils.CropBitmapTool;
import com.crrepa.band.my.device.watchfacenew.photo.widgets.CropImageView;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.q;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class GalleryImgCropActivity extends BaseVBActivity<ActivityNewCustomWatchFaceImgCropBinding> {
    private final com.crrepa.band.my.device.watchfacenew.photo.utils.b imgCollector = com.crrepa.band.my.device.watchfacenew.photo.utils.b.get();
    private final GalleryImgCropAdapter imgCropAdapter = new GalleryImgCropAdapter();

    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            GalleryImgCropActivity.this.cropAllPhoto();
        }
    }

    class b implements CropImageView.d {
        b() {
        }

        @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.CropImageView.d
        public void onBitmapSaveError(File file) {
            GalleryImgCropActivity.this.getPageLoadingUI().hide();
            r0.showShort(R.string.retry);
        }

        @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.CropImageView.d
        public void onBitmapSaveSuccess(File file) {
            GalleryImgCropActivity.this.imgCollector.getAddedImgList().get(GalleryImgCropActivity.this.imgCropAdapter.getCheckedIndex()).croppedPath = file.getAbsolutePath();
        }
    }

    class c implements CropImageView.c {
        c() {
        }

        @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.CropImageView.c
        public void OnBitmapMatrixChange(Matrix matrix) {
            ImgSelectedBean item = GalleryImgCropActivity.this.imgCropAdapter.getItem(GalleryImgCropActivity.this.imgCropAdapter.getCheckedIndex());
            if (item != null && item.matrix == null) {
                item.matrix = new Matrix();
            }
            if (item != null) {
                item.matrix.set(matrix);
            }
            ((ActivityNewCustomWatchFaceImgCropBinding) ((BaseVBActivity) GalleryImgCropActivity.this).binding).cvCropImage.saveBitmapToFile(CropBitmapTool.getCropCacheFolder(), GalleryImgCropActivity.this.imgCropAdapter.getCheckedIndex(), com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth(), com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight(), false);
        }

        @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.CropImageView.c
        public void OnInitBitmap() {
            ImgSelectedBean item = GalleryImgCropActivity.this.imgCropAdapter.getItem(GalleryImgCropActivity.this.imgCropAdapter.getCheckedIndex());
            if (item == null || item.matrix == null) {
                return;
            }
            ((ActivityNewCustomWatchFaceImgCropBinding) ((BaseVBActivity) GalleryImgCropActivity.this).binding).cvCropImage.getImageMatrix().reset();
            ((ActivityNewCustomWatchFaceImgCropBinding) ((BaseVBActivity) GalleryImgCropActivity.this).binding).cvCropImage.setImageMatrix(item.matrix);
        }
    }

    class d implements CropBitmapTool.c {
        d() {
        }

        @Override // com.crrepa.band.my.device.watchfacenew.photo.utils.CropBitmapTool.c
        public void onBitmapCropSaveError(File file) {
        }

        @Override // com.crrepa.band.my.device.watchfacenew.photo.utils.CropBitmapTool.c
        public void onBitmapCropSaveSuccess(File file) {
            ImgSelectedBean imgSelectedBean = new ImgSelectedBean();
            imgSelectedBean.path = file.getAbsolutePath();
            GalleryImgCropActivity.this.imgCollector.getCroppedImgList().add(imgSelectedBean);
            if (GalleryImgCropActivity.this.imgCollector.getCroppedImgList().size() == GalleryImgCropActivity.this.imgCollector.getAddedImgList().size()) {
                GalleryImgCropActivity.this.getPageLoadingUI().hide();
                ((ActivityNewCustomWatchFaceImgCropBinding) ((BaseVBActivity) GalleryImgCropActivity.this).binding).tvCompletion.setClickable(true);
                GalleryImgCropActivity.this.startActivity(new Intent(GalleryImgCropActivity.this, (Class<?>) NewCustomWatchFaceActivity.class));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cropAllPhoto() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        CropBitmapTool cropBitmapTool = new CropBitmapTool();
        cropBitmapTool.setOnBitmapSaveCompleteListener(new d());
        cropBitmapTool.initData(((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.getWidth(), ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.getHeight(), ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.getFocusWidth(), ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.getFocusHeight(), com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen() ? CropBitmapTool.Style.CIRCLE : CropBitmapTool.Style.RECTANGLE);
        ArrayList<ImgSelectedBean> addedImgList = this.imgCollector.getAddedImgList();
        int i8 = 0;
        while (i8 < addedImgList.size()) {
            if (!cropBitmapTool.isSaving) {
                if (addedImgList.get(i8).croppedPath == null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = calculateInSampleSize(options, displayMetrics.widthPixels, displayMetrics.heightPixels);
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile = BitmapFactory.decodeFile(addedImgList.get(i8).path, options);
                    Matrix matrix = addedImgList.get(i8).matrix;
                    if (matrix == null) {
                        matrix = new Matrix();
                    }
                    Matrix matrix2 = matrix;
                    matrix2.postRotate(com.moyoung.dafit.module.common.utils.g.readPictureDegree(r2));
                    cropBitmapTool.saveBitmapToFile(this, i8, Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix2, true), CropBitmapTool.getCropCacheFolder(), com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth(), com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight(), false, com.crrepa.band.my.device.watchfacenew.delegate.img.i.getCornerRadius());
                } else {
                    ImgSelectedBean imgSelectedBean = new ImgSelectedBean();
                    imgSelectedBean.path = addedImgList.get(i8).croppedPath;
                    this.imgCollector.getCroppedImgList().add(imgSelectedBean);
                    if (this.imgCollector.getCroppedImgList().size() == this.imgCollector.getAddedImgList().size()) {
                        runOnUiThread(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.photo.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                GalleryImgCropActivity.this.lambda$cropAllPhoto$4();
                            }
                        });
                        return;
                    }
                }
                i8++;
            }
        }
    }

    private void deleteSelectedFileList() {
        HandlerThread handlerThread = new HandlerThread("BackgroundThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.photo.d
            @Override // java.lang.Runnable
            public final void run() {
                GalleryImgCropActivity.lambda$deleteSelectedFileList$5();
            }
        });
        handlerThread.quitSafely();
    }

    private void initCropView() {
        boolean isCircleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        Log.d("isCircleScreen: ", "circleScreen=" + isCircleScreen);
        if (isCircleScreen) {
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.setFocusStyle(CropImageView.Style.CIRCLE);
        } else {
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.setFocusStyle(CropImageView.Style.RECTANGLE);
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.setFocusWidth(com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth() * 3);
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.setFocusHeight(com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight() * 3);
        }
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.setOnBitmapSaveCompleteListener(new b());
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage.setOnBitmapMatrixListener(new c());
    }

    @SuppressLint({"NonConstantResourceId", "NotifyDataSetChanged"})
    private void initSelectPhotoList() {
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).rcvPreview.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).rcvPreview.setAdapter(this.imgCropAdapter);
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).rcvPreview.addItemDecoration(new SpacesItemDecoration(o.dp2px(this, 6.0f)));
        this.imgCropAdapter.setNewData(this.imgCollector.getAddedImgList());
        this.imgCropAdapter.setOnItemChildClickListener(new OnItemChildClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.photo.c
            @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                GalleryImgCropActivity.this.lambda$initSelectPhotoList$3(baseQuickAdapter, view, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cropAllPhoto$4() {
        getPageLoadingUI().hide();
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setClickable(true);
        startActivity(new Intent(this, (Class<?>) NewCustomWatchFaceActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteSelectedFileList$5() {
        q.deleteAllFiles(new File(com.crrepa.band.my.device.watchfacenew.delegate.img.i.getGalleryWatchFaceTempDir()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        getPageLoadingUI().show();
        if (com.crrepa.band.my.device.watchfacenew.photo.utils.a.checkDoubleClick(R.id.tv_completion, 1000)) {
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setClickable(false);
            new a().start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        if (com.crrepa.band.my.device.watchfacenew.photo.utils.a.checkDoubleClick(view.getId(), 500)) {
            int checkedIndex = this.imgCropAdapter.getCheckedIndex();
            int size = this.imgCropAdapter.getData().size();
            if (size == 1) {
                return;
            }
            if (checkedIndex == size - 1) {
                this.imgCropAdapter.setCheckedIndex(0);
            } else {
                this.imgCropAdapter.setCheckedIndex(checkedIndex + 1);
            }
            ImgSelectedBean item = this.imgCropAdapter.getItem(this.imgCropAdapter.getCheckedIndex());
            if (item != null) {
                showCropPhoto(item.path);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSelectPhotoList$3(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        int checkedIndex = this.imgCropAdapter.getCheckedIndex();
        int size = this.imgCropAdapter.getData().size();
        int id = view.getId();
        if (id != R.id.iv_close) {
            if (id == R.id.iv_photo && i8 != checkedIndex) {
                this.imgCropAdapter.setCheckedIndex(i8);
                ImgSelectedBean item = this.imgCropAdapter.getItem(i8);
                if (item != null) {
                    showCropPhoto(item.path);
                }
                if (checkedIndex < size - 2) {
                    ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvNext.setText(R.string.next);
                    return;
                }
                return;
            }
            return;
        }
        if (i8 == size - 1) {
            if (i8 == 0) {
                finish();
                return;
            }
            this.imgCropAdapter.setCheckedIndex(checkedIndex - 1);
        }
        if (checkedIndex > i8) {
            this.imgCropAdapter.setCheckedIndex(checkedIndex - 1);
        }
        this.imgCropAdapter.getData().remove(i8);
        ImgSelectedBean item2 = this.imgCropAdapter.getItem(this.imgCropAdapter.getCheckedIndex());
        if (item2 != null) {
            showCropPhoto(item2.path);
            this.imgCropAdapter.notifyDataSetChanged();
        }
        renderFreeSpace();
        renderNextBtn();
    }

    private void renderFreeSpace() {
        int calculateFreeSpace = this.imgCollector.getCalculateFreeSpace() - (this.imgCropAdapter.getData().size() * 110);
        if (calculateFreeSpace < 0) {
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setFocusable(false);
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setClickable(false);
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setEnabled(false);
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvSpace.setTextColor(ContextCompat.getColor(this, R.color.assist_15));
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvSpace.setText(getString(R.string.device_custom_watch_face_no_memory_tips));
            return;
        }
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setFocusable(true);
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setClickable(true);
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setEnabled(true);
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvSpace.setTextColor(ContextCompat.getColor(this, R.color.crop_free_space_textcolor));
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvSpace.setText(String.format(getString(R.string.device_custom_watch_face_residue_space), calculateFreeSpace + "kb"));
    }

    private void renderNextBtn() {
        if (this.imgCropAdapter.getData().size() > 1) {
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvNext.setVisibility(0);
        } else {
            ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvNext.setVisibility(8);
        }
    }

    private void showCropPhoto(String str) {
        Picasso.get().load(new File(str)).into(((ActivityNewCustomWatchFaceImgCropBinding) this.binding).cvCropImage);
    }

    public int calculateInSampleSize(BitmapFactory.Options options, int i8, int i9) {
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        if (i11 > i9 || i10 > i8) {
            return i10 > i11 ? i10 / i8 : i11 / i9;
        }
        return 1;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColor(this, ContextCompat.getColor(this, R.color.color_dialog_add_water_intake), 0);
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.photo.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryImgCropActivity.this.lambda$initBinding$0(view);
            }
        });
        initCropView();
        showCropPhoto(this.imgCollector.getAddedImgList().get(0).path);
        initSelectPhotoList();
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvCompletion.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.photo.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryImgCropActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityNewCustomWatchFaceImgCropBinding) this.binding).tvNext.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.photo.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryImgCropActivity.this.lambda$initBinding$2(view);
            }
        });
        renderFreeSpace();
        renderNextBtn();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        deleteSelectedFileList();
        super.onDestroy();
    }
}
