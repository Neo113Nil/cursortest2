package com.crrepa.band.my.device.watchfacenew.delegate.img;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.watchfacenew.delegate.img.l;
import com.crrepa.band.my.model.band.provider.BandPresetWatchFaceProvider;
import com.moyoung.dafit.module.common.utils.x0;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class l implements com.moyoung.dafit.module.common.baseui.f {
    private final com.crrepa.band.my.device.watchfacenew.delegate.img.a view;

    class a implements a0 {
        final /* synthetic */ String val$defaultPresetImgPath;

        a(String str) {
            this.val$defaultPresetImgPath = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBitmapFailed$1(String str) {
            l.this.view.renderPreviewImg(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBitmapLoaded$0(String str) {
            l.this.view.renderPreviewImg(str);
        }

        @Override // com.squareup.picasso.a0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            i.saveCustomWatchFaceImgByPath(BitmapFactory.decodeResource(com.moyoung.dafit.module.common.utils.d.get().getResources(), R$drawable.img_watchface_dress_default), this.val$defaultPresetImgPath);
            Observable<Long> observeOn = Observable.timer(500L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            final String str = this.val$defaultPresetImgPath;
            observeOn.doOnComplete(new Action() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.img.k
                @Override // io.reactivex.functions.Action
                public final void run() {
                    l.a.this.lambda$onBitmapFailed$1(str);
                }
            }).subscribe();
        }

        @Override // com.squareup.picasso.a0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            i.saveCustomWatchFaceImgByPath(bitmap, this.val$defaultPresetImgPath);
            Observable<Long> observeOn = Observable.timer(500L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            final String str = this.val$defaultPresetImgPath;
            observeOn.doOnComplete(new Action() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.img.j
                @Override // io.reactivex.functions.Action
                public final void run() {
                    l.a.this.lambda$onBitmapLoaded$0(str);
                }
            }).subscribe();
        }

        @Override // com.squareup.picasso.a0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    public l(com.crrepa.band.my.device.watchfacenew.delegate.img.a aVar) {
        this.view = aVar;
    }

    private void downloadPresetImgAndShow(String str, String str2) {
        if (!x0.isEmpty(str)) {
            Picasso.get().load(str).into(new a(str2));
        } else {
            Log.d("downloadPresetImg", "presetImgUrl is null");
            this.view.renderPreviewImg(null);
        }
    }

    private static List<String> getDressImgPathList() {
        ArrayList arrayList = new ArrayList();
        List<String> dressPhotoNameList = m.getDressPhotoNameList();
        if (x0.isNotEmpty(dressPhotoNameList)) {
            Iterator<String> it = dressPhotoNameList.iterator();
            while (it.hasNext()) {
                arrayList.add(i.getCustomWatchFaceImgPath(it.next()));
            }
        }
        return arrayList;
    }

    private static List<String> getGalleryImgPathList() {
        ArrayList arrayList = new ArrayList();
        List<String> galleryPhotoNameList = m.getGalleryPhotoNameList();
        if (!x0.isNotEmpty(galleryPhotoNameList)) {
            Log.d("getGalleryImgPathList", "imgNameList is null");
            int i8 = 0;
            while (true) {
                int[] iArr = BandPresetWatchFaceProvider.DEFAULT_WATCH_FACE_LIST;
                if (i8 >= iArr.length) {
                    break;
                }
                String customWatchFaceImgPath = i.getCustomWatchFaceImgPath(String.valueOf(i8));
                i.saveCustomWatchFaceImgByPath(BitmapFactory.decodeResource(com.moyoung.dafit.module.common.utils.d.get().getResources(), iArr[i8]), customWatchFaceImgPath);
                arrayList.add(customWatchFaceImgPath);
                i8++;
            }
        } else {
            for (String str : galleryPhotoNameList) {
                Log.d("getGalleryImgPathList", str);
                arrayList.add(i.getCustomWatchFaceImgPath(str));
            }
        }
        return arrayList;
    }

    private void showWatchFaceImg(List<String> list, String str, int i8) {
        this.view.renderCroppedImgList(list, i8);
        if (i8 >= 0) {
            this.view.renderPreviewImg(list.get(i8));
            return;
        }
        String presetImgPath = i.getPresetImgPath();
        if (new File(presetImgPath).exists()) {
            this.view.renderPreviewImg(presetImgPath);
        } else {
            downloadPresetImgAndShow(str, presetImgPath);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public /* bridge */ /* synthetic */ void pause() {
        com.moyoung.dafit.module.common.baseui.e.a(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public /* bridge */ /* synthetic */ void resume() {
        com.moyoung.dafit.module.common.baseui.e.b(this);
    }

    public void showDressWatchFaceImg(String str) {
        List<String> dressImgPathList = getDressImgPathList();
        showWatchFaceImg(dressImgPathList, str, x0.isNotEmpty(dressImgPathList) ? m.getSentToBandSelectedIndex() : -1);
    }

    public void showGalleryWatchFaceImg(String str) {
        Log.d("showGalleryWatchFaceImg", str);
        showWatchFaceImg(getGalleryImgPathList(), str, x0.isNotEmpty(m.getGalleryPhotoNameList()) ? m.getSentToBandSelectedIndex() : -1);
    }
}
