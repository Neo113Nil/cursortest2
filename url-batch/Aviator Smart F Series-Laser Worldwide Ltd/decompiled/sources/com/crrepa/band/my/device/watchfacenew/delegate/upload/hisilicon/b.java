package com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.CountDownTimer;
import android.util.Log;
import androidx.annotation.Nullable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.b;
import com.crrepa.band.my.device.watchfacenew.photo.model.event.NewCustomWatchFaceMsgUpdateEvent;
import com.crrepa.ble.conn.bean.CRPWatchFaceScreenInfo;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.listener.CRPPhotoWatchFaceTransListener;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import z1.j;

/* loaded from: classes2.dex */
public class b implements com.moyoung.dafit.module.common.baseui.f {
    private static final int WATCH_FACE_TRANS_TIMEOUT = 20000;
    private com.crrepa.band.my.device.watchfacenew.delegate.upload.c view;
    CountDownTimer timer = new a(20000, 20000);
    public CRPPhotoWatchFaceTransListener imgTransListener = new C0192b();
    public CRPFileTransListener thumbTransListener = new c();

    class a extends CountDownTimer {
        a(long j8, long j9) {
            super(j8, j9);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Log.d("相册表盘", "timer.onFinish");
            b.this.view.renderTransError(-1, null);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j8) {
        }
    }

    /* renamed from: com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.b$b, reason: collision with other inner class name */
    class C0192b implements CRPPhotoWatchFaceTransListener {
        C0192b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$2(int i8, List list, Integer num) {
            b.this.view.renderTransError(i8, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTransCompleted$1(Integer num) {
            b.this.view.renderTransCompleted();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTransProgressChanged$0(int i8, Integer num) {
            b.this.view.renderTransProgressChanged(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceTransListener
        @SuppressLint({"CheckResult"})
        public void onError(final int i8, final List<String> list) {
            Log.d("相册表盘", "onError: " + list.toString());
            if (b.this.view != null) {
                Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.e
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.C0192b.this.lambda$onError$2(i8, list, (Integer) obj);
                    }
                });
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceTransListener
        @SuppressLint({"CheckResult"})
        public void onTransCompleted() {
            Log.d("相册表盘", "onTransCompleted: ");
            b.this.timer.cancel();
            if (b.this.view != null) {
                Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.d
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.C0192b.this.lambda$onTransCompleted$1((Integer) obj);
                    }
                });
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceTransListener
        @SuppressLint({"CheckResult"})
        public void onTransProgressChanged(final int i8) {
            b.this.timer.cancel();
            Log.d("相册表盘", "onTransProgressChanged: " + i8);
            if (b.this.view != null) {
                Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.c
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.C0192b.this.lambda$onTransProgressChanged$0(i8, (Integer) obj);
                    }
                });
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceTransListener
        public void onTransProgressStarting() {
            Log.d("相册表盘", "onTransProgressStarting");
            b.this.timer.start();
        }
    }

    class c implements CRPFileTransListener {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$3(int i8, Integer num) {
            b.this.view.renderTransError(i8, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTransCompleted$2(Integer num) {
            b.this.view.renderThumbTransCompleted();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTransProgressChanged$1(int i8, Integer num) {
            b.this.view.renderTransProgressChanged(i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTransProgressStarting$0(Integer num) {
            Log.d("相册表盘缩略图", "onTransProgressStarting: ");
            b.this.view.renderTransProgressStarting();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        @SuppressLint({"CheckResult"})
        public void onError(final int i8) {
            Log.d("相册表盘缩略图", "onError: " + i8);
            if (b.this.view != null) {
                Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.i
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.c.this.lambda$onError$3(i8, (Integer) obj);
                    }
                });
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        @SuppressLint({"CheckResult"})
        public void onTransCompleted() {
            Log.d("相册表盘缩略图", "onTransCompleted: ");
            if (b.this.view != null) {
                Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.f
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.c.this.lambda$onTransCompleted$2((Integer) obj);
                    }
                });
            }
            org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        @SuppressLint({"CheckResult"})
        public void onTransProgressChanged(final int i8) {
            Log.d("相册表盘缩略图", "onTransProgressChanged: " + i8);
            if (b.this.view != null) {
                Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.g
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.c.this.lambda$onTransProgressChanged$1(i8, (Integer) obj);
                    }
                });
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        @SuppressLint({"CheckResult"})
        public void onTransProgressStarting() {
            Log.d("相册表盘缩略图", "onTransProgressStarting");
            if (b.this.view != null) {
                Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.h
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.c.this.lambda$onTransProgressStarting$0((Integer) obj);
                    }
                });
            }
        }
    }

    private boolean checkWatchFaceInfo(List<File> list) {
        if (x0.isEmpty(list)) {
            Log.d("sendPhotoWatchFace", "fileList is empty");
            return false;
        }
        Log.d("sendPhotoWatchFace", list.toString());
        Iterator<File> it = list.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += it.next().length();
        }
        if (j8 / 1024 < m.getPhotoWatchFaceAvailableSize()) {
            return true;
        }
        this.view.renderLowStorage();
        return false;
    }

    @Nullable
    private static Bitmap getThumbBitmap(Bitmap bitmap, boolean z7) {
        CRPWatchFaceScreenInfo cRPWatchFaceScreenInfo = j.getCRPWatchFaceScreenInfo();
        Bitmap roundBitmap = com.moyoung.dafit.module.common.utils.g.getRoundBitmap(bitmap, cRPWatchFaceScreenInfo.getThumbWidth(), cRPWatchFaceScreenInfo.getThumbHeight(), cRPWatchFaceScreenInfo.getThumbCornerRadius());
        if (roundBitmap != null) {
            return com.crrepa.band.my.device.watchfacenew.photo.utils.c.getThumbBitmapWithLabel(roundBitmap, z7);
        }
        Log.d("sendPhotoWatchFace", "thumbBitmap = null");
        return roundBitmap;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public /* bridge */ /* synthetic */ void pause() {
        com.moyoung.dafit.module.common.baseui.e.a(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public /* bridge */ /* synthetic */ void resume() {
        com.moyoung.dafit.module.common.baseui.e.b(this);
    }

    public void sendNewCustomWatchFace(List<File> list, int i8, boolean z7) {
        if (checkWatchFaceInfo(list)) {
            if (i8 < 0) {
                i8 = 0;
            }
            i4.getInstance().sendHisiliconPhotoWatchFace(list, getThumbBitmap(BitmapFactory.decodeFile(list.get(i8).getPath()), z7), this.imgTransListener);
            this.view.renderTransProgressStarting();
        }
    }

    public void sendPhotoWatchFaceOrder(List<String> list) {
        if (x0.isEmpty(list)) {
            list.add(m.NEW_CUSTOM_WATCH_FACE_PRESET_IMG);
        }
        i4.getInstance().sendHisiliconPhotoWatchFaceOrder(list);
    }

    public void sendWatchFaceIndex(int i8) {
        i4.getInstance().sendHisiliconFixedPhotoWatchFace(i8, null, null);
    }

    public void sendWatchFaceIndexAndThumb(int i8, Bitmap bitmap, boolean z7) {
        i4.getInstance().sendHisiliconFixedPhotoWatchFace(i8, getThumbBitmap(bitmap, z7), this.thumbTransListener);
        this.view.renderTransProgressStarting();
    }

    public void setView(com.crrepa.band.my.device.watchfacenew.delegate.upload.c cVar) {
        this.view = cVar;
    }
}
