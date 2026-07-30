package com.crrepa.band.my.device.localphoto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityLocalPhotoSelectedBinding;
import com.crrepa.band.my.device.localphoto.PhotoUploadingDialog;
import com.crrepa.band.my.device.localphoto.adapter.LocalPhotoSelectedAdapter;
import com.crrepa.band.my.device.localphoto.model.LocalImageModel;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.lib.photopicker.PhotoPickHelper;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class LocalPhotoSelectedActivity extends BaseVBActivity<ActivityLocalPhotoSelectedBinding> {
    private final LocalPhotoSelectedAdapter photoSelectedAdapter = new LocalPhotoSelectedAdapter();
    private final CompositeDisposable disposableList = new CompositeDisposable();

    class a implements com.moyoung.lib.photopicker.i {
        a() {
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onCanceled(String str) {
            LocalPhotoSelectedActivity.this.finish();
        }

        @Override // com.moyoung.lib.photopicker.i
        public /* bridge */ /* synthetic */ void onPicked(Uri uri) {
            com.moyoung.lib.photopicker.h.b(this, uri);
        }

        @Override // com.moyoung.lib.photopicker.i
        public void unSupportGalleryMultiplePick() {
            r0.showLong(R.string.common_select_photo_long_press_enter_multiple_pick_tips);
            s0.logEvent("不支持图片多选的手机机型", "un_support_multiple_pick_mobile_phone_model", com.moyoung.dafit.module.common.utils.b.getSystemModel());
            LocalPhotoSelectedActivity.this.finish();
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onPicked(List<Uri> list, boolean z7) {
            LocalPhotoSelectedActivity.this.loadSelectedPhotoList(list);
        }
    }

    class b implements PhotoUploadingDialog.a {
        b() {
        }

        @Override // com.crrepa.band.my.device.localphoto.PhotoUploadingDialog.a
        public void onCanceled() {
        }

        @Override // com.crrepa.band.my.device.localphoto.PhotoUploadingDialog.a
        public void onCompleted() {
            LocalPhotoSelectedActivity.this.finish();
        }

        @Override // com.crrepa.band.my.device.localphoto.PhotoUploadingDialog.a
        public void onFailed() {
            LocalPhotoSelectedActivity.this.finish();
        }
    }

    private void deleteSelectedFileList() {
        HandlerThread handlerThread = new HandlerThread("BackgroundThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new Runnable() { // from class: com.crrepa.band.my.device.localphoto.r
            @Override // java.lang.Runnable
            public final void run() {
                LocalPhotoSelectedActivity.lambda$deleteSelectedFileList$4();
            }
        });
        handlerThread.quitSafely();
    }

    private static long getFreeSize(List<File> list) {
        Iterator<File> it = list.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += it.next().length();
        }
        return l.getAvailableSize() - (j8 / 1024);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void initSelectedPhotoRv() {
        ((ActivityLocalPhotoSelectedBinding) this.binding).rvPhoto.setLayoutManager(new GridLayoutManager((Context) this, 3, 1, false));
        ((ActivityLocalPhotoSelectedBinding) this.binding).rvPhoto.setAdapter(this.photoSelectedAdapter);
        this.photoSelectedAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.localphoto.m
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                LocalPhotoSelectedActivity.this.lambda$initSelectedPhotoRv$3(baseQuickAdapter, view, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteSelectedFileList$4() {
        com.moyoung.dafit.module.common.utils.q.deleteAllFiles(new File(LocalImageModel.getLocalPhotoTemporaryDir()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        showUploadDialog(this.photoSelectedAdapter.getCheckedItemList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSelectedPhotoRv$3(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        File file = (File) baseQuickAdapter.getData().get(i8);
        if (this.photoSelectedAdapter.isSavedPhoto(file)) {
            return;
        }
        List<File> checkedItemList = this.photoSelectedAdapter.getCheckedItemList();
        if (checkedItemList.contains(file)) {
            checkedItemList.remove(file);
        } else {
            checkedItemList.add(file);
        }
        RecyclerView recyclerView = ((ActivityLocalPhotoSelectedBinding) this.binding).rvPhoto;
        final LocalPhotoSelectedAdapter localPhotoSelectedAdapter = this.photoSelectedAdapter;
        Objects.requireNonNull(localPhotoSelectedAdapter);
        recyclerView.post(new Runnable() { // from class: com.crrepa.band.my.device.localphoto.p
            @Override // java.lang.Runnable
            public final void run() {
                LocalPhotoSelectedAdapter.this.notifyDataSetChanged();
            }
        });
        renderCheckedCount(checkedItemList.size());
        renderAvailableStorage(checkedItemList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSelectedPhotoList$2(List list) {
        Log.d("loadSelectedPhotoList", "photoFileList=" + list);
        renderSelectedPhotoList(list);
        getPageLoadingUI().hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSelectedPhotoList(List<Uri> list) {
        Log.d("loadSelectedPhotoList", "selectedPhotoList=" + list);
        getPageLoadingUI().show();
        this.disposableList.add(LocalImageModel.queryAndCreatePhotoFileList(list).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.localphoto.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LocalPhotoSelectedActivity.this.lambda$loadSelectedPhotoList$2((List) obj);
            }
        }));
    }

    private void pickMultipleImg() {
        PhotoPickHelper.pickMultipleImg(this, 100 - l.getPhotoSavedCount(), new a());
    }

    private void renderAvailableStorage(List<File> list) {
        long freeSize = getFreeSize(list);
        if (freeSize <= 0) {
            ((ActivityLocalPhotoSelectedBinding) this.binding).tvCommit.setEnabled(false);
            ((ActivityLocalPhotoSelectedBinding) this.binding).tvSpace.setTextColor(ContextCompat.getColor(this, R.color.assist_15));
            ((ActivityLocalPhotoSelectedBinding) this.binding).tvSpace.setText(getString(R.string.device_custom_watch_face_no_memory_tips));
        } else {
            ((ActivityLocalPhotoSelectedBinding) this.binding).tvCommit.setEnabled(true);
            ((ActivityLocalPhotoSelectedBinding) this.binding).tvSpace.setTextColor(ContextCompat.getColor(this, R.color.crop_free_space_textcolor));
            ((ActivityLocalPhotoSelectedBinding) this.binding).tvSpace.setText(getString(R.string.device_custom_watch_face_residue_space, freeSize + "kb"));
        }
        if (x0.isEmpty(list)) {
            ((ActivityLocalPhotoSelectedBinding) this.binding).tvCommit.setEnabled(false);
        }
    }

    private void renderCheckedCount(int i8) {
        ((ActivityLocalPhotoSelectedBinding) this.binding).tvCommit.setText(getString(R.string.done) + "(" + i8 + ")");
    }

    private void renderSelectedPhotoList(List<File> list) {
        if (x0.isEmpty(list)) {
            finish();
            return;
        }
        this.photoSelectedAdapter.initCheckedPhotoList(list);
        this.photoSelectedAdapter.setNewData(list);
        List<File> checkedItemList = this.photoSelectedAdapter.getCheckedItemList();
        renderCheckedCount(checkedItemList.size());
        renderAvailableStorage(checkedItemList);
    }

    private void showUploadDialog(List<File> list) {
        PhotoUploadingDialog photoUploadingDialog = new PhotoUploadingDialog(this);
        photoUploadingDialog.hideCancelTv();
        photoUploadingDialog.show();
        photoUploadingDialog.uploadFile(list);
        photoUploadingDialog.setListener(new b());
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, (Class<?>) LocalPhotoSelectedActivity.class));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        initSelectedPhotoRv();
        ((ActivityLocalPhotoSelectedBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localphoto.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalPhotoSelectedActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityLocalPhotoSelectedBinding) this.binding).tvCommit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localphoto.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalPhotoSelectedActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @SuppressLint({"NewApi"})
    protected void loadData() {
        super.loadData();
        pickMultipleImg();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        deleteSelectedFileList();
        this.disposableList.clear();
        super.onDestroy();
    }
}
