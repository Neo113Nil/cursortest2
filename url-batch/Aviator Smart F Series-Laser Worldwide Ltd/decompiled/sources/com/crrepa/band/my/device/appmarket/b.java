package com.crrepa.band.my.device.appmarket;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.appmarket.model.AppMarketAppDetailResp;
import com.crrepa.band.my.device.appmarket.model.AppMarketModel;
import com.crrepa.band.my.device.appmarket.model.event.AppUninstallFailEvent;
import com.crrepa.band.my.device.appmarket.model.event.AppUninstallSuccessEvent;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BtBluetoothProvider;
import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class b implements com.moyoung.dafit.module.common.baseui.f {
    private static final int BAIDU_MAP_APP_ID = 31;
    private long appFileSize;
    private String appFileUrl;
    private int appID;
    private int appVersionID;
    private String appVersionName;
    private String packageName;
    private u view;
    private final CompositeDisposable disposableList = new CompositeDisposable();
    private final AppMarketModel appMarketModel = new AppMarketModel();
    boolean canUpdateApp = false;

    private static class a implements CRPAppTransListener {
        private final WeakReference<b> weakReference;

        public a(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        private void showInstallFailed() {
            b bVar = this.weakReference.get();
            if (bVar == null || bVar.view == null) {
                return;
            }
            bVar.view.renderInstallFailed();
            if (bVar.canUpdateApp) {
                bVar.view.initUpdateUI();
            } else {
                bVar.view.initInstallUI();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            Log.d("AppTrans-onError", "code: " + i8);
            showInstallFailed();
        }

        @Override // com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener
        public void onInstallFail(int i8) {
            Log.d("AppTrans-onInstallFail", "code: " + i8);
            showInstallFailed();
        }

        @Override // com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener
        public void onInstallSuccess() {
            Log.d("AppTrans", "onInstallSuccess");
            b bVar = this.weakReference.get();
            if (bVar == null || bVar.view == null) {
                return;
            }
            bVar.view.renderInstallSucceed();
            i4.getInstance().querySupportAppInfo();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            Log.d("AppTrans", "onTransCompleted");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            Log.d("AppTrans", "onTransProgressChanged-" + i8);
            b bVar = this.weakReference.get();
            if (bVar == null || bVar.view == null) {
                return;
            }
            bVar.view.renderInstallingUI(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            Log.d("AppTrans", "onTransProgressStarting");
            b bVar = this.weakReference.get();
            if (bVar == null || bVar.view == null) {
                return;
            }
            bVar.view.renderInstallingUI(0);
        }
    }

    /* renamed from: com.crrepa.band.my.device.appmarket.b$b, reason: collision with other inner class name */
    private static class C0162b extends com.liulishuo.filedownloader.k {
        private final WeakReference<b> weakReference;

        public C0162b(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
            if (bVar == null || bVar.view == null) {
                return;
            }
            bVar.view.resetDownloadingUI();
        }

        @Override // com.liulishuo.filedownloader.k
        protected void completed(com.liulishuo.filedownloader.a aVar) {
            Log.d("DownloadListener", "completed");
            b bVar = this.weakReference.get();
            if (bVar == null || bVar.view == null) {
                return;
            }
            bVar.view.renderDownloadingUI(100);
            bVar.installApp(aVar.getPath());
        }

        @Override // com.liulishuo.filedownloader.k
        protected void error(com.liulishuo.filedownloader.a aVar, Throwable th) {
            Log.d("DownloadListener", "e: " + th.getMessage());
            b bVar = this.weakReference.get();
            if (bVar == null || bVar.view == null) {
                return;
            }
            bVar.view.renderNetError();
            if (bVar.canUpdateApp) {
                bVar.view.initUpdateUI();
            } else {
                bVar.view.initInstallUI();
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
            b bVar = this.weakReference.get();
            if (bVar == null || bVar.view == null) {
                return;
            }
            int i10 = (i8 * 100) / i9;
            bVar.view.renderDownloadingUI(i10 >= 0 ? i10 : 100);
        }

        @Override // com.liulishuo.filedownloader.k
        protected void warn(com.liulishuo.filedownloader.a aVar) {
        }
    }

    public b(u uVar) {
        this.view = uVar;
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private void dealOperationBtnStatus(AppMarketAppDetailResp.Data data) {
        this.view.hideOperationBtn();
        AppMarketAppDetailResp.AppBean appBean = data.app;
        AppMarketAppDetailResp.VersionBean versionBean = data.version;
        if (appBean == null || versionBean == null) {
            return;
        }
        List<CRPAppInfo> installedAppList = AppMarketProvider.getInstalledAppList();
        if (isUpdateApp(installedAppList, versionBean)) {
            this.canUpdateApp = true;
            this.view.initUpdateUI();
        } else if (isInstalledApp(installedAppList, versionBean)) {
            this.view.initInstalledUI();
        } else {
            this.view.initInstallUI();
        }
    }

    @NonNull
    public static File getBinFile(String str) {
        return new File(g0.getDownloadFilePath(com.moyoung.dafit.module.common.utils.d.get(), g0.getFileNameFromUrl(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void installApp(String str) {
        String address = BtBluetoothProvider.getAddress();
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected() || TextUtils.isEmpty(address)) {
            this.view.renderBandDisconnected();
            return;
        }
        int i8 = this.appID;
        if (i8 == 31) {
            this.appMarketModel.reportAppInstallationEvent(i8, this.appVersionID, this.appVersionName);
        }
        this.view.resetInstallingUI();
        i4.getInstance().installApp(renameBinFileByPackageName(str, this.packageName), new a(this));
    }

    private boolean isInstalledApp(List<CRPAppInfo> list, AppMarketAppDetailResp.VersionBean versionBean) {
        if (x0.isEmpty(list)) {
            return false;
        }
        Iterator<CRPAppInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getPackageName().equals(versionBean.bundle_name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isUpdateApp(List<CRPAppInfo> list, AppMarketAppDetailResp.VersionBean versionBean) {
        if (x0.isEmpty(list)) {
            return false;
        }
        for (CRPAppInfo cRPAppInfo : list) {
            if (cRPAppInfo.getPackageName().equals(versionBean.bundle_name)) {
                String str = versionBean.version_name;
                Log.d("isUpdateApp", str + ",appFromWatch.getVersion=" + cRPAppInfo.getVersion());
                if (!str.equals(cRPAppInfo.getVersion())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestAppDetail$0(AppMarketAppDetailResp.Data data) {
        if (data == null) {
            this.view.renderNetError();
            return;
        }
        dealOperationBtnStatus(data);
        this.view.renderAppDetail(data, this.canUpdateApp);
        AppMarketAppDetailResp.VersionBean versionBean = data.version;
        if (versionBean != null) {
            this.appFileUrl = versionBean.bin;
            this.appFileSize = versionBean.bin_size;
            this.packageName = versionBean.bundle_name;
            this.appID = versionBean.app_id;
            this.appVersionID = versionBean.id;
            this.appVersionName = versionBean.version_name;
        }
    }

    public static File renameBinFileByPackageName(String str, String str2) {
        File file = new File(str);
        File file2 = new File(file.getParent() + File.separator + str2 + g0.getFileSuffixFromPath(str));
        file.renameTo(file2);
        return file2;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        i4.getInstance().abortInstallApp();
        this.view = null;
        this.disposableList.clear();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void downloadBinFile() {
        if (TextUtils.isEmpty(this.appFileUrl)) {
            this.view.renderNetError();
            return;
        }
        if (this.appFileSize >= AppMarketProvider.getAvailableSize()) {
            this.view.renderLowStorage();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            this.view.renderLowPower();
            return;
        }
        File binFile = getBinFile(this.appFileUrl);
        if (binFile.exists()) {
            installApp(binFile.getPath());
            return;
        }
        if (a0.isDisconnected()) {
            this.view.renderNetError();
            return;
        }
        String address = BtBluetoothProvider.getAddress();
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected() || TextUtils.isEmpty(address)) {
            this.view.renderBandDisconnected();
            return;
        }
        Log.d("binUrl: ", this.appFileUrl);
        com.liulishuo.filedownloader.s fileDownloader = com.moyoung.dafit.module.common.imageload.b.getInstance().getFileDownloader();
        C0162b c0162b = new C0162b(this);
        fileDownloader.create(this.appFileUrl).setPath(binFile.getPath()).setCallbackProgressMinInterval(50).setListener(c0162b).setAutoRetryTimes(5).asInQueueTask().enqueue();
        if (fileDownloader.start(c0162b, true)) {
            return;
        }
        this.view.renderNetError();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(m0.a aVar) {
        if (aVar.getState() == 0) {
            this.view.renderBandDisconnected();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void queryAppAvailableSize() {
        i4.getInstance().queryAppAvailableSize();
    }

    public void requestAppDetail(int i8) {
        this.disposableList.add(this.appMarketModel.requestAppDetail(i8).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.appmarket.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                b.this.lambda$requestAppDetail$0((AppMarketAppDetailResp.Data) obj);
            }
        }));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void uninstallApp() {
        if (TextUtils.isEmpty(this.packageName)) {
            this.view.renderNetError();
        } else {
            this.view.renderUninstallingUI();
            i4.getInstance().uninstallApp(this.packageName);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(AppUninstallFailEvent appUninstallFailEvent) {
        this.view.renderUninstallFailed();
        if (this.canUpdateApp) {
            this.view.initUpdateUI();
        } else {
            this.view.initInstalledUI();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(AppUninstallSuccessEvent appUninstallSuccessEvent) {
        this.view.renderUninstallSucceed();
        this.view.initInstallUI();
    }
}
