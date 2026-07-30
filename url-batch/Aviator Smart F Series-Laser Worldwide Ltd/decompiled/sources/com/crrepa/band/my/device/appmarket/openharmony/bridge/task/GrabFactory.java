package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import com.crrepa.band.my.device.appmarket.openharmony.bridge.enm.CallNativeMethodEnum;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class GrabFactory {
    private final Map<String, AbstractGrabAbstractExecutor> factory;

    public GrabFactory(DWebView dWebView) {
        HashMap hashMap = new HashMap();
        this.factory = hashMap;
        hashMap.put(CallNativeMethodEnum.DOWNLOAD_APP.value(), new DownloadAppExecutor(dWebView));
        hashMap.put(CallNativeMethodEnum.GET_APP_INSTALL_STATUS.value(), new GetAppInstallStatusExecutor(dWebView));
        hashMap.put(CallNativeMethodEnum.INSTALL_APP.value(), new InstallAppExecutor(dWebView));
        hashMap.put(CallNativeMethodEnum.UNINSTALL_APP.value(), new UninstallAppExecutor(dWebView));
    }

    public IGrabExecutor getExecutor(String str) {
        return this.factory.get(str);
    }
}
