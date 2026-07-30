package com.crrepa.band.my.device.appmarket.openharmony;

import android.webkit.WebViewClient;
import com.crrepa.band.my.ble.band.utils.a;
import com.crrepa.band.my.databinding.ActivityAppStoreBinding;
import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.band.my.device.appmarket.openharmony.bean.OpenWearPlayLoadInfo;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.OpenWearPlayJSBridge;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;
import com.crrepa.ble.conn.bean.CRPAppStoreInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceScreenInfo;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;
import z1.j;

/* loaded from: classes2.dex */
public class AppStoreActivity extends BaseVBActivity<ActivityAppStoreBinding> {
    private static final String BASE_OPENWEARPLAY_TEST_URL = "http://183.233.197.205:8096/watch/app";
    private static final String BASE_OPENWEARPLAY_URL = "https://www.openwearplay.com/watch/app";

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAppList() {
        String address = a.getInstance().getAddress();
        OpenWearPlayLoadInfo openWearPlayLoadInfo = new OpenWearPlayLoadInfo();
        CRPAppStoreInfo appStoreInfo = AppMarketProvider.getAppStoreInfo();
        if (appStoreInfo != null) {
            openWearPlayLoadInfo.setChipModel(appStoreInfo.getChipModel());
            openWearPlayLoadInfo.setOsVersion(appStoreInfo.getOsVersion());
            openWearPlayLoadInfo.setSdkVersion(appStoreInfo.getSdkVersion());
            openWearPlayLoadInfo.setChipPlatform(appStoreInfo.getChipPlatform());
            openWearPlayLoadInfo.setOs(appStoreInfo.getOs());
        }
        CRPWatchFaceScreenInfo cRPWatchFaceScreenInfo = j.getCRPWatchFaceScreenInfo();
        int height = cRPWatchFaceScreenInfo.getHeight();
        openWearPlayLoadInfo.setResolution(cRPWatchFaceScreenInfo.getWidth() + "*" + height);
        openWearPlayLoadInfo.setDeviceSn(address);
        openWearPlayLoadInfo.setConsumerIdentity(address);
        String str = "localStorage.setItem('watch_app_store_params', '" + s.bean2Json(openWearPlayLoadInfo) + "');";
        f.d(str);
        ((ActivityAppStoreBinding) this.binding).webview.evaluateJavascript(str, null);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        DWebView.setWebContentsDebuggingEnabled(true);
        VB vb = this.binding;
        ((ActivityAppStoreBinding) vb).webview.addJavascriptObject(new OpenWearPlayJSBridge(((ActivityAppStoreBinding) vb).webview), null);
        ((ActivityAppStoreBinding) this.binding).webview.setWebViewClient(new WebViewClient());
        ((ActivityAppStoreBinding) this.binding).webview.setDWebViewListener(new DWebView.DWebViewListener() { // from class: com.crrepa.band.my.device.appmarket.openharmony.AppStoreActivity.1
            @Override // com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView.DWebViewListener
            public void onPageFinished() {
                f.d("dWebView callHandler:updateAppInstallStatus");
                AppStoreActivity.this.loadAppList();
            }
        });
        ((ActivityAppStoreBinding) this.binding).webview.loadUrl(BASE_OPENWEARPLAY_URL);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }
}
