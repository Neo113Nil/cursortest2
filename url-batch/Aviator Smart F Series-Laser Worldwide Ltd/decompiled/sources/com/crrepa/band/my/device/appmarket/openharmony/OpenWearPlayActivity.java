package com.crrepa.band.my.device.appmarket.openharmony;

import android.content.Context;
import android.content.Intent;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.WebActivity;
import com.crrepa.band.my.device.appmarket.openharmony.bean.OpenWearPlayLoadInfo;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class OpenWearPlayActivity extends WebActivity {
    private static final String BASE_OPENWEARPLAY_TEST_URL = "http://183.233.197.205:8096/watch/app";
    private static final String BASE_OPENWEARPLAY_URL = "https://www.openwearplay.com/watch/app";

    public static Intent getCallingIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) OpenWearPlayActivity.class);
        intent.putExtra("title", context.getString(R.string.device_app_market_title));
        intent.putExtra("url", BASE_OPENWEARPLAY_TEST_URL);
        intent.putExtra("SHOW_TITLE_BAR", false);
        return intent;
    }

    private void loadAppList() {
        OpenWearPlayLoadInfo openWearPlayLoadInfo = new OpenWearPlayLoadInfo();
        openWearPlayLoadInfo.setChipModel("3321");
        openWearPlayLoadInfo.setOsVersion("5.0.1");
        openWearPlayLoadInfo.setSdkVersion("13");
        openWearPlayLoadInfo.setResolution("466*466");
        String str = "localStorage.setItem('watch_app_store_params', '" + s.bean2Json(openWearPlayLoadInfo) + "');";
        f.d(l.SPACE + str);
        this.agentWeb.getWebCreator().getWebView().evaluateJavascript(str, null);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
    }

    @Override // com.crrepa.band.my.WebActivity
    protected void onPageLoaded() {
        super.onPageLoaded();
        loadAppList();
    }
}
