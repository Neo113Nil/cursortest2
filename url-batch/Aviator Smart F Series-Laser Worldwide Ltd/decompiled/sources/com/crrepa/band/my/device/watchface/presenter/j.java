package com.crrepa.band.my.device.watchface.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceDetailBean;
import com.crrepa.band.my.device.watchface.model.WatchFaceDownloadCompleteEvent;
import com.crrepa.band.my.model.band.provider.BandDisplayLanguageProvider;
import com.crrepa.band.my.model.band.provider.BandDisplayWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.crrepa.band.my.model.db.DownloadWatchFace;
import com.crrepa.band.my.model.db.proxy.DownloadWatchFaceDaoProxy;
import com.crrepa.band.my.model.db.proxy.LanguageDaoProxy;
import com.crrepa.ble.conn.bean.CRPWatchFaceInfo;
import com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.scan.bean.CRPScanRecordInfo;
import com.liulishuo.filedownloader.s;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.s0;
import com.my.lib.data.ErrorCode;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class j implements com.moyoung.dafit.module.common.baseui.f {
    private static final int WATCH_FACE_TRANS_TIMEOUT = 30;
    private List<DownloadWatchFace> deleteWatchFaceList;
    private x1.e view;
    private String watchFaceDownloadLink;
    private File watchFaceFile;
    private final n watchFaceDownloadListener = new n(this);
    private final o watchFaceTransListener = new o(this);
    private final m watchFaceDeleteCallback = new m(this);
    private final BaseWatchFaceProvider watchFaceProvider = new DefaultWatchFaceProvider();
    private final boolean isMultipleWatchFace = com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace();
    private boolean transStarted = false;
    private boolean transCompleted = false;
    private int previousPercent = 0;
    private final w1.b transTimeManager = new w1.b();
    private boolean transTimeout = false;
    private int uploadWatchFaceId = 0;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            j.this.view.renderUploadFail();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            j.this.view.renderUploadTimeout();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform;

        static {
            int[] iArr = new int[CRPScanRecordInfo.McuPlatform.values().length];
            $SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform = iArr;
            try {
                iArr[CRPScanRecordInfo.McuPlatform.PLATFORM_SIFLI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform[CRPScanRecordInfo.McuPlatform.PLATFORM_JIELI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform[CRPScanRecordInfo.McuPlatform.PLATFORM_HISILICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(StoreWatchFaceDetailBean storeWatchFaceDetailBean) {
            j.this.view.showWatchFaceDetail(storeWatchFaceDetailBean);
        }
    }

    class e implements Consumer {
        e() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            j.this.view.renderNetError();
        }
    }

    class f implements Consumer {
        f() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            j.this.view.renderDownloadReported();
        }
    }

    class g implements Consumer {
        g() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            j.this.view.renderDownloadReported();
        }
    }

    class h implements Consumer {
        h() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            j.this.view.hindWatchFaceUploadButton();
        }
    }

    class i implements Consumer {
        i() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            j.this.view.showWatchFaceUploadContent();
        }
    }

    /* renamed from: com.crrepa.band.my.device.watchface.presenter.j$j, reason: collision with other inner class name */
    class C0191j implements Consumer {
        C0191j() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            j.this.view.renderWatchFaceUploadHint(str);
        }
    }

    class k implements Consumer {
        k() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            j.this.view.renderWatchFaceUploadPercent(num.intValue());
        }
    }

    class l implements Consumer {
        l() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            j.this.sendDisplayWatchFace();
            j.this.view.hindWatchFaceUploadContent();
            j.this.view.renderUploadComplete();
        }
    }

    static class m implements CRPWatchFaceDeleteCallback {
        private WeakReference<j> weakReference;

        public m(j jVar) {
            this.weakReference = new WeakReference<>(jVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback
        public void onComplete() {
            j jVar = this.weakReference.get();
            if (jVar != null) {
                jVar.deleteDownloadWatchFace();
            }
        }

        @Override // com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback
        public void onError() {
            j jVar = this.weakReference.get();
            if (jVar != null) {
                jVar.showUploadFail();
            }
        }
    }

    private static class n extends com.liulishuo.filedownloader.k {
        private WeakReference<j> weakReference;

        public n(j jVar) {
            this.weakReference = new WeakReference<>(jVar);
        }

        @Override // com.liulishuo.filedownloader.k
        protected void completed(com.liulishuo.filedownloader.a aVar) {
            j jVar = this.weakReference.get();
            if (jVar != null) {
                jVar.startUploadWatchFace(new File(aVar.getPath()));
            }
        }

        @Override // com.liulishuo.filedownloader.k
        protected void error(com.liulishuo.filedownloader.a aVar, Throwable th) {
            com.orhanobut.logger.f.e("WatchFaceDownloadListener: " + th.toString(), new Object[0]);
            j jVar = this.weakReference.get();
            if (jVar != null) {
                jVar.showUploadFail();
                jVar.logTransportNetErrorEvent();
            }
        }

        @Override // com.liulishuo.filedownloader.k
        protected void paused(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void pending(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void progress(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void warn(com.liulishuo.filedownloader.a aVar) {
        }
    }

    private static class o implements CRPWatchFaceTransListener {
        private WeakReference<j> weakReference;

        public o(j jVar) {
            this.weakReference = new WeakReference<>(jVar);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            com.orhanobut.logger.f.d("onError: " + i8);
            j jVar = this.weakReference.get();
            if (jVar != null) {
                jVar.showUploadTimeout();
                jVar.logTransportCRPErrorEvent(i8);
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPWatchFaceTransListener
        public void onInstallStateChange(boolean z7) {
            com.orhanobut.logger.f.d("onInstallStateChange: " + z7);
            j jVar = this.weakReference.get();
            if (!z7 || jVar == null) {
                return;
            }
            jVar.showUploadComplete();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            j jVar = this.weakReference.get();
            if (jVar == null || com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli()) {
                return;
            }
            jVar.showUploadComplete();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            j jVar = this.weakReference.get();
            if (jVar != null) {
                jVar.showUploadPercent(i8);
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
        }
    }

    public j() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteDownloadWatchFace() {
        List<DownloadWatchFace> list = this.deleteWatchFaceList;
        if (list == null || list.isEmpty()) {
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().getDownloadWatchFaceCount() == 1) {
                this.watchFaceProvider.deleteAllDownlaodWatchFace();
            }
            sendWatchFace();
            return;
        }
        int i8 = c.$SwitchMap$com$crrepa$ble$scan$bean$CRPScanRecordInfo$McuPlatform[com.crrepa.band.my.ble.band.utils.a.getInstance().getMcuPlatform().ordinal()];
        if (i8 == 1) {
            int intValue = this.deleteWatchFaceList.remove(0).getWatchFaceId().intValue();
            if (i4.getInstance().deleteDownloadWatchFace(intValue, this.watchFaceDeleteCallback)) {
                this.watchFaceProvider.deleteDownloadWatchFace(intValue);
                return;
            }
        } else if (i8 == 2 || i8 == 3) {
            int[] iArr = new int[this.deleteWatchFaceList.size()];
            for (int i9 = 0; i9 < this.deleteWatchFaceList.size(); i9++) {
                iArr[i9] = this.deleteWatchFaceList.get(i9).getWatchFaceId().intValue();
            }
            if (i4.getInstance().deleteJieliDownloadWatchFace(iArr, this.watchFaceDeleteCallback)) {
                this.watchFaceProvider.deleteDownloadWatchFace(iArr);
                this.deleteWatchFaceList.clear();
                return;
            }
        }
        showUploadFail();
        logTransportCRPErrorEvent(6);
    }

    private void downloadWatchFace(String str, String str2) {
        if (!a0.isNetworkConnected(com.moyoung.dafit.module.common.utils.d.get())) {
            showUploadFail();
            logTransportNetErrorEvent();
            return;
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        com.orhanobut.logger.f.d("url: " + str);
        s fileDownloader = com.moyoung.dafit.module.common.imageload.b.getInstance().getFileDownloader();
        fileDownloader.create(str).setPath(file.getPath()).setListener(this.watchFaceDownloadListener).setAutoRetryTimes(5).setCallbackProgressTimes(0).asInQueueTask().enqueue();
        if (fileDownloader.start(this.watchFaceDownloadListener, true)) {
            return;
        }
        com.orhanobut.logger.f.e("downloadWatchFace", new Object[0]);
        showUploadFail();
        logTransportNetErrorEvent();
    }

    private File getWatchFaceFile(String str, int i8) {
        String str2 = i8 + str.substring(str.lastIndexOf("."));
        com.orhanobut.logger.f.d("WatchFace File Name: " + str2);
        File file = new File(com.crrepa.band.my.a.getWatchFacePath());
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    private String getWatchTypeCode() {
        return com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli() ? "200" : com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli() ? "300" : com.crrepa.band.my.ble.band.utils.a.getInstance().isBluetrum() ? "400" : "100";
    }

    @SuppressLint({"CheckResult"})
    private void hindUploadButton() {
        if (this.view != null) {
            Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isDownloadedWatchFace$0(int i8, ObservableEmitter observableEmitter) {
        boolean z7;
        List<DownloadWatchFace> all = new DownloadWatchFaceDaoProxy().getAll();
        if (all != null && !all.isEmpty()) {
            Iterator<DownloadWatchFace> it = all.iterator();
            while (it.hasNext()) {
                if (it.next().getWatchFaceId().longValue() == i8) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        observableEmitter.onNext(Boolean.valueOf(z7));
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isDownloadedWatchFace$1(Boolean bool) {
        this.view.renderIsDownloadedWatchFace(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logTransportCRPErrorEvent(int i8) {
        logTransportEvent(getWatchTypeCode() + i8);
    }

    private void logTransportEvent(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("transportWatchFaceStateCode", str);
        bundle.putString("watchFaceId", String.valueOf(this.uploadWatchFaceId));
        bundle.putString("watchFaceDownloadLink", this.watchFaceDownloadLink);
        s0.logEvent("表盘传输状态码", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logTransportNetErrorEvent() {
        logTransportEvent(getWatchTypeCode() + ErrorCode.PARAMETER_ERROR);
    }

    private void logTransportSuccessEvent() {
        logTransportEvent("0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendDisplayWatchFace() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isNewWatchFace() && this.uploadWatchFaceId > 0) {
            i4.getInstance().sendWatchFaceId(this.uploadWatchFaceId, com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace());
        }
        int downloadWatchFaceIndex = this.watchFaceProvider.getDownloadWatchFaceIndex(this.isMultipleWatchFace);
        com.orhanobut.logger.f.d("sendDisplayWatchFace: " + downloadWatchFaceIndex);
        if (downloadWatchFaceIndex > 0) {
            i4.getInstance().sendBandWatchFaceIndex(downloadWatchFaceIndex);
            BandDisplayWatchFaceProvider.setDisplayWatchFaceIndex(downloadWatchFaceIndex);
        }
    }

    private void sendWatchFace() {
        if (this.watchFaceFile == null) {
            showUploadFail();
            return;
        }
        CRPWatchFaceInfo.WacthFaceType wacthFaceType = CRPWatchFaceInfo.WacthFaceType.DEFAULT;
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        if (aVar.isSifli()) {
            wacthFaceType = CRPWatchFaceInfo.WacthFaceType.SIFLI;
        } else if (aVar.isJieli() || aVar.isBluetrum()) {
            wacthFaceType = CRPWatchFaceInfo.WacthFaceType.JIELI;
        } else if (aVar.isHisilicon()) {
            wacthFaceType = CRPWatchFaceInfo.WacthFaceType.HISILICON;
        }
        i4.getInstance().sendNewWatchFace(new CRPWatchFaceInfo(this.watchFaceFile, wacthFaceType), this.watchFaceTransListener, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showUploadComplete() {
        com.orhanobut.logger.f.e("showUploadComplete", new Object[0]);
        logTransportSuccessEvent();
        this.transCompleted = true;
        if (this.view != null) {
            Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new l());
        }
    }

    @SuppressLint({"CheckResult"})
    private void showUploadContent() {
        if (this.view != null) {
            Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showUploadFail() {
        com.orhanobut.logger.f.e("showUploadFail", new Object[0]);
        this.transCompleted = true;
        if (this.view != null) {
            Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showUploadPercent(int i8) {
        if (this.view == null) {
            return;
        }
        if (!this.transTimeManager.isTimeout() || this.transTimeout) {
            if (i8 == this.previousPercent) {
                return;
            }
            this.previousPercent = i8;
            Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new k());
            return;
        }
        com.orhanobut.logger.f.d("onTransProgressChanged timeout");
        this.transTimeout = true;
        i4.getInstance().abortWatchFace();
        i4.getInstance().checkFirmwareVersion(BandInfoManager.getFirmwareVersion(), 0);
    }

    @SuppressLint({"CheckResult"})
    private void showUploadState(String str) {
        if (this.view != null) {
            Observable.just(str).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0191j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showUploadTimeout() {
        com.orhanobut.logger.f.e("showUploadTimeout", new Object[0]);
        this.transCompleted = true;
        if (!this.isMultipleWatchFace) {
            this.watchFaceProvider.deleteAllDownlaodWatchFace();
        }
        org.greenrobot.eventbus.c.getDefault().post(new WatchFaceDownloadCompleteEvent());
        if (this.view != null) {
            Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startUploadWatchFace(File file) {
        this.watchFaceFile = file;
        this.transStarted = true;
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli() || com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace()) {
            List<DownloadWatchFace> all = new DownloadWatchFaceDaoProxy().getAll();
            int downloadWatchFaceCount = com.crrepa.band.my.ble.band.utils.a.getInstance().getDownloadWatchFaceCount();
            com.orhanobut.logger.f.v("maxWatchFaceCount: " + downloadWatchFaceCount, new Object[0]);
            if (downloadWatchFaceCount > 0 && all != null && downloadWatchFaceCount <= all.size()) {
                this.deleteWatchFaceList = all.subList(0, (all.size() - downloadWatchFaceCount) + 1);
                deleteDownloadWatchFace();
                return;
            }
        }
        sendWatchFace();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @SuppressLint({"CheckResult"})
    public void isDownloadedWatchFace(final int i8) {
        Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.watchface.presenter.h
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                j.lambda$isDownloadedWatchFace$0(i8, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchface.presenter.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                j.this.lambda$isDownloadedWatchFace$1((Boolean) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandDfuStateChangeEvent(l0.e eVar) {
        if (eVar.getState() != 0 || !this.transStarted || this.transCompleted || this.transTimeout) {
            return;
        }
        com.orhanobut.logger.f.e("onBandDfuStateChangeEvent", new Object[0]);
        showUploadFail();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @SuppressLint({"CheckResult"})
    public void pushDownloads(int i8) {
        this.watchFaceProvider.pushDownloadsV3(i8, BandInfoManager.getFirmwareVersion()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new f(), new g());
    }

    @SuppressLint({"CheckResult"})
    public void requestWatchFaceDetailBeanV3(Context context, int i8) {
        isDownloadedWatchFace(i8);
        if (!a0.isNetworkConnected(context)) {
            this.view.renderNetError();
            return;
        }
        this.watchFaceProvider.getStoreWatchFaceDetailV3(i8, new LanguageDaoProxy().getLanguageCode(BandDisplayLanguageProvider.getDisplayLanguage()), BandInfoManager.getFirmwareVersion(), "").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(), new e());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveWatchFaceInfo(int i8, String str) {
        com.orhanobut.logger.f.d("saveWatchFaceInfo: " + i8);
        if (!this.isMultipleWatchFace) {
            this.watchFaceProvider.deleteAllDownlaodWatchFace();
        }
        this.watchFaceProvider.saveWatchFacePreview(i8, str);
        org.greenrobot.eventbus.c.getDefault().post(new WatchFaceDownloadCompleteEvent());
    }

    public void setView(x1.e eVar) {
        this.view = eVar;
    }

    public void uploadWatchFace(Context context, String str, int i8) {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            com.orhanobut.logger.f.e("band disconnected", new Object[0]);
            showUploadFail();
        }
        if (TextUtils.isEmpty(str)) {
            com.orhanobut.logger.f.e("url is null!", new Object[0]);
            showUploadFail();
            return;
        }
        hindUploadButton();
        showUploadContent();
        showUploadState(context.getString(R.string.watch_face_downloading));
        this.uploadWatchFaceId = i8;
        this.watchFaceDownloadLink = str;
        s0.logEvent("点击表盘下载按钮");
        File watchFaceFile = getWatchFaceFile(str, i8);
        if (watchFaceFile.exists()) {
            startUploadWatchFace(watchFaceFile);
        } else {
            downloadWatchFace(str, watchFaceFile.getPath());
        }
    }
}
