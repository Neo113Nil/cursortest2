package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import io.reactivex.internal.observers.BlockingBaseObserver;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class InstallAppService {
    private static final String TAG = "tagWatchConnectApp";
    private InstallAppListener installAppListener;
    private boolean isTransCompleted = true;
    private final CRPAppTransListener appTransListener = new CRPAppTransListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.InstallAppService.1
        private void showInstallFailed() {
            InstallAppService.this.onInstallAppResult(3, "install app failed.");
            InstallAppService.this.isTransCompleted = true;
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            Log.d(InstallAppService.TAG, "code: " + i8);
            showInstallFailed();
        }

        @Override // com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener
        public void onInstallFail(int i8) {
            Log.d(InstallAppService.TAG, "code: " + i8);
            showInstallFailed();
        }

        @Override // com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener
        public void onInstallSuccess() {
            Log.d(InstallAppService.TAG, "onInstallSuccess");
            InstallAppService.this.isTransCompleted = true;
            i4.getInstance().querySupportAppInfo();
            Observable.timer(3L, TimeUnit.SECONDS).subscribe(new BlockingBaseObserver<Long>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.InstallAppService.1.1
                @Override // io.reactivex.Observer
                public void onError(Throwable th) {
                    th.printStackTrace();
                }

                @Override // io.reactivex.Observer
                public void onNext(Long l8) {
                    InstallAppService.this.onInstallAppResult(0, "install app success.");
                }
            });
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            Log.d(InstallAppService.TAG, "onTransCompleted");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            Log.d(InstallAppService.TAG, "onTransProgressChanged-" + i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            InstallAppService.this.isTransCompleted = false;
            Log.d(InstallAppService.TAG, "onTransProgressStarting");
        }
    };

    public interface InstallAppListener {
        void onInstallAppResult(int i8, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$installApp$0(JsonObject jsonObject) {
        String asString = jsonObject.get("url").getAsString();
        jsonObject.get("appName").getAsString();
        String asString2 = jsonObject.get("fileName").getAsString();
        if (asString.isEmpty() || asString2.isEmpty()) {
            Log.e(TAG, "InstallAppService::installApp, url/fileName is not set!!!");
            onInstallAppResult(1, "url/fileName is not set!!!");
            return;
        }
        Log.i(TAG, "InstallAppService::installApp, url:" + asString);
        String format = String.format("%s/%s", com.moyoung.dafit.module.common.utils.d.get().getCacheDir(), asString2);
        Log.i(TAG, "InstallAppService::installApp, save file path:" + format);
        File file = new File(format);
        if (!file.exists()) {
            Log.e(TAG, "InstallAppService::installApp, app install file is not exist!!!");
            onInstallAppResult(2, "app install file is not exist!!!");
        } else if (AppMarketProvider.getAvailableSize() * 1024 >= file.length()) {
            i4.getInstance().installApp(file, this.appTransListener);
        } else {
            Log.e(TAG, "InstallAppService::installApp, available size is not enough!!!");
            onInstallAppResult(4, "available size is not enough!!!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onInstallAppResult(int i8, String str) {
        InstallAppListener installAppListener = this.installAppListener;
        if (installAppListener != null) {
            installAppListener.onInstallAppResult(i8, str);
        }
    }

    public void installApp(final JsonObject jsonObject, InstallAppListener installAppListener) {
        this.installAppListener = installAppListener;
        Log.i(TAG, "InstallAppService::installApp in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.g
            @Override // java.lang.Runnable
            public final void run() {
                InstallAppService.this.lambda$installApp$0(jsonObject);
            }
        }).start();
        Log.i(TAG, "InstallAppService::installApp out");
    }

    public boolean isTransCompleted() {
        return this.isTransCompleted;
    }
}
