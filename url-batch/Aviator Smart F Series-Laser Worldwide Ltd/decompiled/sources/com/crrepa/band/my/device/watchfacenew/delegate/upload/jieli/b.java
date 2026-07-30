package com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.CountDownTimer;
import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.picture.c1;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.ClockPointerBean;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.PointerDownloader;
import com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.b;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceConfigInfo;
import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceInfo;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.g;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements f {
    private static final int WATCH_FACE_TRANS_TIMEOUT = 60000;
    private com.crrepa.band.my.device.watchfacenew.delegate.upload.c view;
    CountDownTimer timer = new CountDownTimerC0193b(60000, 60000);
    public CRPFileTransListener imgTransListener = new c();

    class a implements PointerDownloader.Listener {
        final /* synthetic */ List val$pointerConfigList;
        final /* synthetic */ CRPPhotoWatchFaceInfo val$watchFaceInfo;
        final /* synthetic */ CRPWatchFaceType val$watchFaceType;

        a(List list, CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, CRPWatchFaceType cRPWatchFaceType) {
            this.val$pointerConfigList = list;
            this.val$watchFaceInfo = cRPPhotoWatchFaceInfo;
            this.val$watchFaceType = cRPWatchFaceType;
        }

        @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.PointerDownloader.Listener
        public void onFailed() {
            b.this.view.renderPointerDownloadFailed();
        }

        @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.PointerDownloader.Listener
        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (ClockPointerBean.PointerConfig pointerConfig : this.val$pointerConfigList) {
                CRPPhotoWatchFaceInfo.Pointer pointer = new CRPPhotoWatchFaceInfo.Pointer();
                pointer.setX(pointerConfig.pointer_x);
                pointer.setY(pointerConfig.pointer_y);
                pointer.setWidth(pointerConfig.pointer_w);
                pointer.setHeight(pointerConfig.pointer_h);
                pointer.setFile(ClockPointerBean.getPointerFile(pointerConfig.pointer_file));
                if (CmcdHeadersFactory.STREAMING_FORMAT_HLS.equals(pointerConfig.pointer_type)) {
                    pointer.setType(CRPPhotoWatchFaceInfo.PointerType.HOUR);
                }
                if ("m".equals(pointerConfig.pointer_type)) {
                    pointer.setType(CRPPhotoWatchFaceInfo.PointerType.MINUTE);
                }
                if ("s".equals(pointerConfig.pointer_type)) {
                    pointer.setType(CRPPhotoWatchFaceInfo.PointerType.SECOND);
                }
                if ("b".equals(pointerConfig.pointer_type)) {
                    pointer.setType(CRPPhotoWatchFaceInfo.PointerType.SCALE);
                }
                arrayList.add(pointer);
            }
            this.val$watchFaceInfo.setPointerList(arrayList);
            if (this.val$watchFaceType == CRPWatchFaceType.AI_WATCH_FACE) {
                i4.getInstance().sendJieliAIWatchFace(this.val$watchFaceInfo, b.this.imgTransListener);
            } else {
                i4.getInstance().sendJieliPhotoWatchFace(this.val$watchFaceInfo, b.this.imgTransListener);
            }
            Log.d("sendWatchFaceWithPointe", "watchFaceInfo: " + this.val$watchFaceInfo);
        }
    }

    /* renamed from: com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.b$b, reason: collision with other inner class name */
    class CountDownTimerC0193b extends CountDownTimer {
        CountDownTimerC0193b(long j8, long j9) {
            super(j8, j9);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Log.d("相册表盘", "timer.onFinish");
            if (b.this.view != null) {
                b.this.view.renderTransError(-1, null);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j8) {
        }
    }

    class c implements CRPFileTransListener {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$2(int i8, Integer num) {
            b.this.view.renderTransError(i8, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTransCompleted$1(Integer num) {
            b.this.view.renderTransCompleted();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTransProgressChanged$0(int i8, Integer num) {
            b.this.view.renderTransProgressChanged(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        @SuppressLint({"CheckResult"})
        public void onError(final int i8) {
            Log.d("相册表盘", "onError: " + i8);
            if (b.this.view != null) {
                Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.c
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.c.this.lambda$onError$2(i8, (Integer) obj);
                    }
                });
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        @SuppressLint({"CheckResult"})
        public void onTransCompleted() {
            Log.d("相册表盘", "onTransCompleted: ");
            b.this.timer.cancel();
            if (b.this.view != null) {
                Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.d
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.c.this.lambda$onTransCompleted$1((Integer) obj);
                    }
                });
            } else {
                Log.d("相册表盘", "onTransCompleted: view == null");
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        @SuppressLint({"CheckResult"})
        public void onTransProgressChanged(final int i8) {
            b.this.timer.cancel();
            Log.d("相册表盘", "onTransProgressChanged: " + i8);
            if (b.this.view != null) {
                Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.e
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        b.c.this.lambda$onTransProgressChanged$0(i8, (Integer) obj);
                    }
                });
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            Log.d("相册表盘", "onTransProgressStarting");
            b.this.timer.start();
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

    @NonNull
    public static String getAI707ImgPath() {
        return c1.get707AIImgDir() + File.separator + "0.png";
    }

    private void sendWatchFaceWithPointer(ClockPointerBean clockPointerBean, CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, CRPWatchFaceType cRPWatchFaceType) {
        List<ClockPointerBean.PointerConfig> list = clockPointerBean.pointer_content;
        new PointerDownloader(list, new a(list, cRPPhotoWatchFaceInfo, cRPWatchFaceType));
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

    public void sendAIWatchFace(Bitmap bitmap, ClockPointerBean clockPointerBean) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            bitmap = g.getCirleBitmap(bitmap);
        }
        File file = new File(getAI707ImgPath());
        g.saveBitmap(bitmap, file);
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        CRPJieliWatchFaceConfigInfo jieliWatchFaceConfigInfo = com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceConfigInfo();
        sendPhotoWatchFace(arrayList, g.getRoundBitmap(bitmap, jieliWatchFaceConfigInfo.getThumbWidth(), jieliWatchFaceConfigInfo.getThumbHeight(), jieliWatchFaceConfigInfo.getThumbCornerRadius()), clockPointerBean, CRPWatchFaceType.AI_WATCH_FACE);
    }

    public void sendPhotoWatchFace(List<File> list, Bitmap bitmap, ClockPointerBean clockPointerBean, CRPWatchFaceType cRPWatchFaceType) {
        if (checkWatchFaceInfo(list)) {
            CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo = new CRPPhotoWatchFaceInfo();
            cRPPhotoWatchFaceInfo.setPhotoList(list);
            cRPPhotoWatchFaceInfo.setThumBitmap(bitmap);
            if (clockPointerBean == null || clockPointerBean.isNonePointer) {
                if (cRPWatchFaceType == CRPWatchFaceType.AI_WATCH_FACE) {
                    i4.getInstance().sendJieliAIWatchFace(cRPPhotoWatchFaceInfo, this.imgTransListener);
                } else {
                    i4.getInstance().sendJieliPhotoWatchFace(cRPPhotoWatchFaceInfo, this.imgTransListener);
                }
                Log.d("sendPhotoWatchFace", "watchFaceInfo: " + cRPPhotoWatchFaceInfo);
            } else {
                cRPPhotoWatchFaceInfo.setId(clockPointerBean.id);
                cRPPhotoWatchFaceInfo.setX(clockPointerBean.rotate_x);
                cRPPhotoWatchFaceInfo.setY(clockPointerBean.rotate_y);
                sendWatchFaceWithPointer(clockPointerBean, cRPPhotoWatchFaceInfo, cRPWatchFaceType);
            }
            this.view.renderTransProgressStarting();
        }
    }

    public void setView(com.crrepa.band.my.device.watchfacenew.delegate.upload.c cVar) {
        this.view = cVar;
    }
}
