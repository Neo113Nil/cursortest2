package com.crrepa.band.my.home;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.home.device.BandSettingFragment;
import com.crrepa.band.my.home.device.model.BandPairStateChangeEvent;
import com.crrepa.band.my.home.device.model.BandPairingCodeChangeEvent;
import com.crrepa.band.my.home.health.BandTodayDataFragment;
import com.crrepa.band.my.home.profile.UserSettingFragment;
import com.crrepa.band.my.home.training.HomeTrainingFragment;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.db.proxy.RecoverDaoProxy;
import com.crrepa.band.my.profile.appupgrade.b;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements f {
    private static final long WEATHER_PERIOD = 1800000;
    private b view;
    private boolean showBluetoothEnableMessage = true;
    private long lastSendWeatherTime = 0;
    private com.crrepa.band.my.profile.appupgrade.b appUpdateManager = com.crrepa.band.my.profile.appupgrade.b.getInstance();
    private C0204a newAppVersionListener = new C0204a(this);

    /* renamed from: com.crrepa.band.my.home.a$a, reason: collision with other inner class name */
    static class C0204a implements b.d {
        private WeakReference<a> weakReference;

        public C0204a(a aVar) {
            this.weakReference = new WeakReference<>(aVar);
        }

        @Override // com.crrepa.band.my.profile.appupgrade.b.d
        public void onNewVersion(boolean z7, String str, String str2) {
            a aVar = this.weakReference.get();
            if (aVar != null) {
                aVar.view.renderNewAppDialog(z7, str, str2);
            }
        }
    }

    public a() {
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.appUpdateManager.setNewVersionListener(this.newAppVersionListener);
    }

    private void checkBluetoothState() {
        if (!this.showBluetoothEnableMessage || TextUtils.isEmpty(BandInfoManager.getAddress()) || com.crrepa.band.my.ble.band.a.getBleClient().isBluetoothEnable()) {
            return;
        }
        this.view.renderEnableBluetoothDialog();
        this.showBluetoothEnableMessage = false;
    }

    private int getBandConnectState() {
        if (!com.crrepa.band.my.ble.band.a.getBleClient().isBluetoothEnable()) {
            return 10;
        }
        com.crrepa.band.my.ble.band.connect.f fVar = com.crrepa.band.my.ble.band.connect.f.getInstance();
        if (fVar.isConnecting()) {
            return 1;
        }
        return fVar.isConnected() ? 2 : 0;
    }

    private int[] getTabImageResources() {
        return new int[]{R.drawable.selector_tab_data, R.drawable.selector_tab_training, R.drawable.selector_tab_device, R.drawable.selector_tab_user};
    }

    private void sendWeather() {
        if (WEATHER_PERIOD < System.currentTimeMillis() - this.lastSendWeatherTime) {
            if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
                i4.getInstance().sendWeatherInfo(d.get());
            }
            this.lastSendWeatherTime = System.currentTimeMillis();
        }
    }

    public void checkAppNewVersion() {
        this.appUpdateManager.checkAppVersion(d.get());
    }

    public void checkBandFirmwareVersion() {
        if (new RecoverDaoProxy().hasRecoverBand()) {
            this.view.renderFirmwareRestoreDialog();
        } else {
            i4.getInstance().checkFirmwareVersion(BandInfoManager.getFirmwareVersion(), 0);
        }
    }

    public void checkNetworkConnected(Context context) {
        if (a0.isNetworkConnected(context)) {
            return;
        }
        this.view.renderNetworkUnavailable();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.view = null;
    }

    public List<Fragment> getContentFragments() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BandTodayDataFragment.getInstance());
        arrayList.add(HomeTrainingFragment.getInstance());
        arrayList.add(BandSettingFragment.getInstance());
        arrayList.add(UserSettingFragment.getInstance());
        return arrayList;
    }

    public void getTabLayout() {
        this.view.renderTabLayout(getTabImageResources());
    }

    public void getViewPagerFragment() {
        this.view.renderViewPager(getContentFragments());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBondCodeChangeEvent(BandPairingCodeChangeEvent bandPairingCodeChangeEvent) {
        int state = bandPairingCodeChangeEvent.getState();
        if (state == 0 || state == 1) {
            this.view.renderPairingCodeResult(bandPairingCodeChangeEvent.getName(), bandPairingCodeChangeEvent.isSuccess());
        } else {
            if (state != 2) {
                return;
            }
            this.view.renderPairingCodeDialog(bandPairingCodeChangeEvent.getCode());
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onUserBondStateChangeEvent(BandPairStateChangeEvent bandPairStateChangeEvent) {
        int state = bandPairStateChangeEvent.getState();
        if (state == 0 || state == 1) {
            this.view.dismissUserBondingDialog();
        } else {
            if (state != 2) {
                return;
            }
            this.view.renderUserBondingDialog();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void queryBandInfo() {
        i4.getInstance().queryBandBattery();
        org.greenrobot.eventbus.c.getDefault().post(new m0.a(getBandConnectState()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            sendWeather();
        } else {
            com.crrepa.band.my.ble.band.connect.a.startConnectService();
        }
        checkBluetoothState();
    }

    public void setView(b bVar) {
        this.view = bVar;
    }

    public void showNotification(Context context) {
        if (TextUtils.isEmpty(BandInfoManager.getAddress()) || com.crrepa.band.my.ble.band.a.getBleClient().isBluetoothEnable()) {
            return;
        }
        m1.a.showBluetoothDisableNotification(context);
    }
}
