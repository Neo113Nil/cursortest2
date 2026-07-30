package com.crrepa.band.my;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.multidex.MultiDex;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.model.user.provider.UserInfoHelper;
import com.crrepa.ble.util.BleLog;
import com.moyoung.dafit.module.common.network.NetworkChangeReceiver;
import com.moyoung.dafit.module.common.utils.f;
import com.moyoung.dafit.module.common.utils.v;

/* loaded from: classes2.dex */
public class App extends Application {
    private NetworkChangeReceiver networkChangeReceiver;

    private void connectDevice() {
        if (f.isAppStarted(this)) {
            com.orhanobut.logger.f.d("App already started!");
        } else if (31 <= Build.VERSION.SDK_INT) {
            com.crrepa.band.my.ble.band.connect.f.getInstance().establishConnection();
        } else {
            com.crrepa.band.my.ble.band.connect.a.startConnectService();
        }
    }

    private void regiNetworkChangeReceiver() {
        this.networkChangeReceiver = new NetworkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.networkChangeReceiver, intentFilter);
    }

    private void setupBandConfig() {
        new com.crrepa.band.my.ble.band.config.d().setup(this);
    }

    private void setupDao() {
        new com.crrepa.band.my.ble.greendao.utils.a().setup(getApplicationContext());
        new UserInfoHelper().setDefaultUserInfo();
        new com.moyoung.classes.db.a().setup(getApplicationContext());
    }

    private void setupLogger() {
        new v().setup();
    }

    private void setupPicasso() {
        new com.moyoung.dafit.module.common.imageload.d().setup(getApplicationContext());
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        com.moyoung.dafit.module.common.utils.d.setContext(this);
        setupLogger();
        regiNetworkChangeReceiver();
        setupDao();
        setupBandConfig();
        setupPicasso();
        registerActivityLifecycleCallbacks(com.moyoung.dafit.module.common.baseui.a.getInstance());
        connectDevice();
        if (AIProvider.isSupportAIGPT() || AIProvider.isSupportAIWatchFace()) {
            com.crrepa.band.my.device.ai.helper.d.initAIAgent();
        }
        BleLog.isPrint = false;
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        NetworkChangeReceiver networkChangeReceiver = this.networkChangeReceiver;
        if (networkChangeReceiver != null) {
            unregisterReceiver(networkChangeReceiver);
        }
    }
}
