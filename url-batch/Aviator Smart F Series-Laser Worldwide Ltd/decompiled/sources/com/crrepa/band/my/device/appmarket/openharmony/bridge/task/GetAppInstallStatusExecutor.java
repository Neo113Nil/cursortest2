package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import androidx.annotation.NonNull;
import com.crrepa.band.my.device.appmarket.openharmony.OpenWearPlayJSInterface;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.CompletionHandler;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.OnReturnValue;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetAppInstallStatusService;
import com.google.gson.JsonObject;

/* loaded from: classes2.dex */
public class GetAppInstallStatusExecutor extends AbstractGrabAbstractExecutor {
    GetAppInstallStatusExecutor(@NonNull DWebView dWebView) {
        super(dWebView);
    }

    @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.task.IGrabExecutor
    public void senMessageToNative(JsonObject jsonObject, CompletionHandler<String> completionHandler) {
        com.orhanobut.logger.f.d("GetAppInstallStatusExecutor::senMessageToNative--->optParam:" + jsonObject);
        String appInstallStatus = new GetAppInstallStatusService().getAppInstallStatus(jsonObject);
        com.orhanobut.logger.f.i("updateAppInstallStatus-->" + appInstallStatus, new Object[0]);
        getWebView().callHandler(OpenWearPlayJSInterface.UPDATE_APP_INSTALL_STATUS, new Object[]{appInstallStatus}, new OnReturnValue<String>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.task.GetAppInstallStatusExecutor.1
            @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.OnReturnValue
            public void onValue(String str) {
                com.orhanobut.logger.f.i("CallJavascriptActivity::onClick---->onValue:" + str, new Object[0]);
            }
        });
    }
}
