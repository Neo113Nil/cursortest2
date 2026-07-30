package com.crrepa.band.my.ble.watchconnect.manager;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.ble.conn.bean.CRPAppStoreInfo;
import com.openharmony.watch.aidl.Device;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class e {
    private static final String KEY_WATCH_AVAILABLE_KBYTES = "watch_available_kbytes";
    private final RemoteCallbackList<com.openharmony.watch.aidl.f> callbackList = new RemoteCallbackList<>();
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    private static class a {
        private static final e INSTANCE = new e();

        private a() {
        }
    }

    public static int getAvailableKbytes() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(KEY_WATCH_AVAILABLE_KBYTES, 0);
    }

    public static e getInstance() {
        return a.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateDeviceStatus$0() {
        try {
            Device bondedDevices = getInstance().getBondedDevices();
            com.orhanobut.logger.f.d("DeviceInfoManager::updateDeviceStatus device" + bondedDevices);
            sendDeviceStatusToApp(bondedDevices);
        } catch (Exception e8) {
            com.orhanobut.logger.f.d("DeviceInfoManager::updateDeviceStatus error: " + e8);
        }
    }

    public static void queryAvailableKbytes() {
        com.orhanobut.logger.f.d("DeviceInfoManager::queryAvailableKbytes");
        i4.getInstance().queryConnectKitAvailableStorage();
    }

    public static void saveAvailableKbytes(int i8) {
        com.orhanobut.logger.f.d("DeviceInfoManager::saveAvailableKbytes::" + i8);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(KEY_WATCH_AVAILABLE_KBYTES, i8);
    }

    private void sendDeviceStatusToApp(Device device) {
        try {
            int beginBroadcast = this.callbackList.beginBroadcast();
            for (int i8 = 0; i8 < beginBroadcast; i8++) {
                try {
                    com.orhanobut.logger.f.d("DeviceInfoManager::sendDeviceStatusToApp device" + device);
                    this.callbackList.getBroadcastItem(i8).onDeviceConnectStateChange(device);
                } catch (RemoteException e8) {
                    e8.printStackTrace();
                }
            }
        } finally {
            this.callbackList.finishBroadcast();
        }
    }

    public Device getBondedDevices() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() == null) {
            return null;
        }
        String bandName = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getBandName();
        String bandName2 = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getBandName();
        String address = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getAddress();
        CRPAppStoreInfo appStoreInfo = AppMarketProvider.getAppStoreInfo();
        return new Device(bandName, bandName2, address, 0, "openharmony", appStoreInfo != null ? appStoreInfo.getOsVersion() : "", com.crrepa.band.my.ble.band.a.getBleClient().isBluetoothEnable() && com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected(), 0, 0, 0, 0);
    }

    public boolean isCurrentDevice(Device device) {
        return (device == null || getBondedDevices() == null || !getBondedDevices().getUuid().equals(device.getUuid())) ? false : true;
    }

    public boolean notCurrentDevice(Device device) {
        return !isCurrentDevice(device);
    }

    public void register(com.openharmony.watch.aidl.f fVar) {
        this.callbackList.register(fVar);
    }

    public void unregister(com.openharmony.watch.aidl.f fVar) {
        this.callbackList.unregister(fVar);
    }

    public void updateDeviceStatus() {
        this.executor.execute(new Runnable() { // from class: com.crrepa.band.my.ble.watchconnect.manager.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.lambda$updateDeviceStatus$0();
            }
        });
    }
}
