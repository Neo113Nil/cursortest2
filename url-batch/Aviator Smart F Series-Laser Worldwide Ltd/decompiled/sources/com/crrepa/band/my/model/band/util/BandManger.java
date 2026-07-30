package com.crrepa.band.my.model.band.util;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.bt.BtBluetoothDeviceManager;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.ble.band.connect.f;
import com.crrepa.band.my.device.ai.AIForegroundService;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.band.my.device.customkey.util.b;
import com.crrepa.band.my.device.localmusic.i;
import com.crrepa.band.my.device.localphoto.l;
import com.crrepa.band.my.device.localvideo.m;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e;
import com.crrepa.band.my.device.watchfacenew.video.v;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandA2DPProvider;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BandBatterySavingProvider;
import com.crrepa.band.my.model.band.provider.BandBondProvider;
import com.crrepa.band.my.model.band.provider.BandCalendarEventProvider;
import com.crrepa.band.my.model.band.provider.BandDisplayLanguageProvider;
import com.crrepa.band.my.model.band.provider.BandDisplayTimeProvider;
import com.crrepa.band.my.model.band.provider.BandDisplayWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.BandFirstConnectProvider;
import com.crrepa.band.my.model.band.provider.BandHrvProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BandLastBindBandProvider;
import com.crrepa.band.my.model.band.provider.BandMessageLengthProvider;
import com.crrepa.band.my.model.band.provider.BandNotificationListProvider;
import com.crrepa.band.my.model.band.provider.BandPhysiologcalPeriodProvider;
import com.crrepa.band.my.model.band.provider.BandPillReminderProvider;
import com.crrepa.band.my.model.band.provider.BandQuickResponseProvider;
import com.crrepa.band.my.model.band.provider.BandSosProvider;
import com.crrepa.band.my.model.band.provider.BandStorageProvider;
import com.crrepa.band.my.model.band.provider.BandStressProvider;
import com.crrepa.band.my.model.band.provider.BandTapToWakeProvider;
import com.crrepa.band.my.model.band.provider.BandTimingBloodOxygenProvider;
import com.crrepa.band.my.model.band.provider.BandTimingHeartRateProvider;
import com.crrepa.band.my.model.band.provider.BandTimingTempProvider;
import com.crrepa.band.my.model.band.provider.BtBluetoothProvider;
import com.crrepa.band.my.model.band.provider.SleepNapProvider;
import com.crrepa.band.my.model.band.provider.watchface.JieliWatchFaceProvider;
import com.crrepa.band.my.model.band.util.BandManger;
import com.crrepa.band.my.model.db.proxy.BandAlarmDaoProxy;
import com.crrepa.band.my.model.db.proxy.DownloadWatchFaceDaoProxy;
import com.crrepa.band.my.model.db.proxy.DrinkWaterDaoProxy;
import com.crrepa.band.my.model.db.proxy.ECardConfigDaoProxy;
import com.crrepa.band.my.model.db.proxy.ECardDaoProxy;
import com.crrepa.band.my.model.db.proxy.HandWashingDaoProxy;
import com.crrepa.band.my.model.db.proxy.HeartRateWarningDaoProxy;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import com.crrepa.band.my.model.db.proxy.QuickContartConfigDaoProxy;
import com.crrepa.band.my.model.db.proxy.SleepNapDaoProxy;
import com.crrepa.band.my.model.db.proxy.SupportWatchFaceDaoProxy;
import com.crrepa.band.my.model.user.provider.UserGoalsSettingProvider;
import com.crrepa.ble.conn.callback.CRPRemoveBondCallback;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import l0.d;
import org.greenrobot.eventbus.c;
import z1.j;

/* loaded from: classes2.dex */
public class BandManger {

    /* renamed from: com.crrepa.band.my.model.band.util.BandManger$1, reason: invalid class name */
    class AnonymousClass1 implements CRPRemoveBondCallback {
        final /* synthetic */ BluetoothDevice val$device;
        final /* synthetic */ boolean val$dualMode;

        AnonymousClass1(BluetoothDevice bluetoothDevice, boolean z7) {
            this.val$device = bluetoothDevice;
            this.val$dualMode = z7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onSuccess$0(BluetoothDevice bluetoothDevice, boolean z7, Long l8) {
            BtBluetoothDeviceManager.getInstance().removeBond(bluetoothDevice, z7);
        }

        @Override // com.crrepa.ble.conn.callback.CRPRemoveBondCallback
        public void onFail() {
        }

        @Override // com.crrepa.ble.conn.callback.CRPRemoveBondCallback
        public void onSuccess() {
            Observable<Long> timer = Observable.timer(500L, TimeUnit.MILLISECONDS);
            final BluetoothDevice bluetoothDevice = this.val$device;
            final boolean z7 = this.val$dualMode;
            timer.subscribe(new Consumer() { // from class: com.crrepa.band.my.model.band.util.a
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BandManger.AnonymousClass1.lambda$onSuccess$0(bluetoothDevice, z7, (Long) obj);
                }
            });
        }
    }

    private BandManger() {
    }

    public static void addBand(BaseBandModel baseBandModel) {
        BtBluetoothDeviceManager.getInstance().close();
        String broadcastName = baseBandModel.getBroadcastName();
        BandInfoManager.saveBand(broadcastName, baseBandModel.getAddress());
        BandInfoManager.saveFirmwareType(baseBandModel.getBandFirmwareType());
        BandInfoManager.saveFunction(baseBandModel.getFunction());
        BandInfoManager.saveMcuPlatform(baseBandModel.getMcuPlatform());
        BandInfoManager.saveMcuChipId(baseBandModel.getMcuChipId());
        BandLastBindBandProvider.saveName(broadcastName);
        c.getDefault().post(new d(true));
        BandFirstConnectProvider.saveFirstConnected(true);
        com.crrepa.band.my.device.pushmessage.notify.c.getInstance().updateBandFunction(baseBandModel.getFunction());
        com.crrepa.band.my.training.utils.a.delete();
        SleepNapProvider.delete();
        SleepNapDaoProxy.get().deleteTodaySleepNap();
    }

    private static void deleteBondInfo(String str) {
        String address = BtBluetoothProvider.getAddress();
        boolean z7 = false;
        if (TextUtils.isEmpty(address)) {
            com.crrepa.band.my.ble.band.connect.a.disconnect(false);
            return;
        }
        BluetoothDevice bluetoothDevice = com.crrepa.band.my.ble.band.a.getBleClient().getBleDevice(address).getBluetoothDevice();
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isBluetrum() || (TextUtils.equals(str, address) && !com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon())) {
            z7 = true;
        }
        if (f.getInstance().isConnected()) {
            i4.getInstance().removeBond(new AnonymousClass1(bluetoothDevice, z7));
        }
        BtBluetoothProvider.delete();
    }

    public static void removeBand(Context context) {
        com.crrepa.band.my.ble.band.connect.a.stopConnectService();
        AIForegroundService.stop(context);
        deleteBondInfo(BandInfoManager.getAddress());
        BandInfoManager.removeBand();
        com.crrepa.band.my.ble.band.utils.a.getInstance().updateConnectBand(null);
        BandTimingHeartRateProvider.delete();
        BandTimingTempProvider.delete();
        BandTimingBloodOxygenProvider.saveSupportTimingBloodOxygen(false);
        BandPhysiologcalPeriodProvider.delete();
        BandBatterySavingProvider.saveSupportBatterySaving(false);
        BandBatterySavingProvider.saveBatterySaving(false);
        BandPillReminderProvider.delete();
        BandTapToWakeProvider.delete();
        BandA2DPProvider.delete();
        BandDisplayLanguageProvider.delete();
        BandCalendarEventProvider.delete();
        BandHrvProvider.delete();
        BandStressProvider.delete();
        BandNotificationListProvider.delete();
        BandStorageProvider.delete();
        BandQuickResponseProvider.delete();
        JieliWatchFaceProvider.delete();
        b.delete();
        BandBatteryProvider.reset();
        com.crrepa.band.my.device.worldclock.a.delete();
        com.crrepa.band.my.device.muslim.utils.c.delete();
        com.crrepa.band.my.device.stock.c.delete();
        AIProvider.delete();
        com.crrepa.band.my.training.gomoresport.f.delete();
        BandSosProvider.delete();
        BandDisplayWatchFaceProvider.delete();
        BandMessageLengthProvider.delete();
        UserGoalsSettingProvider.delete();
        i.delete();
        m.delete();
        l.delete();
        AppMarketProvider.delete();
        v.delete();
        y1.c.delete();
        j.delete();
        com.crrepa.band.my.device.watchfacenew.delegate.img.m.delete();
        com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.delete();
        e.delete();
        com.crrepa.band.my.training.utils.a.delete();
        i4.getInstance().resetSubscribe();
        new SupportWatchFaceDaoProxy().deleteAll();
        new DrinkWaterDaoProxy().deleteAll();
        new HeartRateWarningDaoProxy().deleteAll();
        new HandWashingDaoProxy().deleteAll();
        new QuickContartConfigDaoProxy().deleteAll();
        new ECardConfigDaoProxy().deleteAll();
        new ECardDaoProxy().deleteAll();
        new DownloadWatchFaceDaoProxy().deleteAll();
        new BandAlarmDaoProxy().deleteAll();
        PerformanceInsightsDaoProxy.getInstance().deleteAll();
        BandDisplayTimeProvider.saveDisplayTime(0);
        new com.crrepa.band.my.ble.band.config.d().setup(context);
        BandBondProvider.delete();
        AIPictureModel.deleteAllPictureHistory();
        c.getDefault().post(new d(false));
    }
}
