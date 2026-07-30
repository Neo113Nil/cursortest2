package com.crrepa.band.my.home.device.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.ble.band.model.BluetoothStateChangeEvent;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.band.my.device.appmarket.model.event.SupportAppInfoEvent;
import com.crrepa.band.my.device.calendar.model.BandCalendarEventChangeEvent;
import com.crrepa.band.my.device.contact.model.BandQuickContartChangeEvent;
import com.crrepa.band.my.device.customkey.model.BandCustomKeyFeatureSupportChangeEvent;
import com.crrepa.band.my.device.ecard.model.BandECardCountEvent;
import com.crrepa.band.my.device.localmusic.i;
import com.crrepa.band.my.device.localmusic.model.event.MusicSavedCountChangedEvent;
import com.crrepa.band.my.device.localphoto.l;
import com.crrepa.band.my.device.localvideo.m;
import com.crrepa.band.my.device.muslim.model.BandMuslimSupportEvent;
import com.crrepa.band.my.device.ota.model.BandFirmwareVersionEvent;
import com.crrepa.band.my.device.ota.model.BandNewFirmwareVersionEvent;
import com.crrepa.band.my.device.ota.model.BandUpgradeCompleteEvent;
import com.crrepa.band.my.device.pillreminder.model.BandPillReminderChangeEvent;
import com.crrepa.band.my.device.watchfacenew.photo.model.event.NewCustomWatchFaceMsgUpdateEvent;
import com.crrepa.band.my.device.worldclock.model.BandWorldClockSupportChangeEvent;
import com.crrepa.band.my.home.device.model.SupportStockCountEvent;
import com.crrepa.band.my.model.BandFirmwareModel;
import com.crrepa.band.my.model.BandSettingItemModel;
import com.crrepa.band.my.model.ExtendMenuModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BandCalendarEventProvider;
import com.crrepa.band.my.model.band.provider.BandExtendProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BandPillReminderProvider;
import com.crrepa.band.my.model.band.util.BandManger;
import com.crrepa.band.my.model.db.QuickContartConfig;
import com.crrepa.band.my.model.db.proxy.ECardConfigDaoProxy;
import com.crrepa.band.my.model.db.proxy.QuickContartConfigDaoProxy;
import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.s0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class d implements com.moyoung.dafit.module.common.baseui.f {
    private o3.a bandSettingView;
    private final CompositeDisposable disposables = new CompositeDisposable();
    public boolean hasNewVersion;

    public d() {
        org.greenrobot.eventbus.c.getDefault().register(this);
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

    private boolean hasECard() {
        return new ECardConfigDaoProxy().get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName()) != null;
    }

    private boolean hasQuickContart() {
        QuickContartConfig quickContartConfig = new QuickContartConfigDaoProxy().get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (quickContartConfig == null) {
            return false;
        }
        return quickContartConfig.getSupported().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAdView$0(ObservableEmitter observableEmitter) {
        List<ExtendMenuModel> extendList = BandExtendProvider.getExtendList();
        if (extendList != null) {
            for (ExtendMenuModel extendMenuModel : extendList) {
                if (extendMenuModel.getType() == 4) {
                    observableEmitter.onNext(extendMenuModel);
                    observableEmitter.onComplete();
                    return;
                }
            }
        }
        observableEmitter.onError(new Throwable("no ad"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAdView$1(ExtendMenuModel extendMenuModel) {
        this.bandSettingView.renderAdView(BandExtendProvider.getExtendIcon(extendMenuModel.getIcon()), extendMenuModel.getContent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAdView$2(Throwable th) {
        th.printStackTrace();
        this.bandSettingView.hideAdView();
    }

    private void showBandBaseInfo() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        o3.a aVar = this.bandSettingView;
        if (aVar == null || connectBand == null) {
            return;
        }
        aVar.renderBandInfoView();
        this.bandSettingView.renderBandName(connectBand.getBandName());
        this.bandSettingView.renderBandAddress(connectBand.getAddress());
        this.bandSettingView.renderBandScreenshot(connectBand);
        updateBandConnectState();
    }

    private void showBandBattery(int i8) {
        o3.a aVar = this.bandSettingView;
        if (aVar != null) {
            aVar.renderBandBattery(i8);
        }
    }

    private void showBandConnectState(int i8) {
        o3.a aVar = this.bandSettingView;
        if (aVar != null) {
            aVar.renderBandConnectState(i8);
        }
        int bandBattery = BandBatteryProvider.getBandBattery();
        if (bandBattery > 0) {
            showBandBattery(bandBattery);
        }
    }

    private void showNotBoundBand() {
        o3.a aVar = this.bandSettingView;
        if (aVar != null) {
            aVar.renderNotBandView();
        }
    }

    private void showWatchFaceList() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand != null && connectBand.hasWatchFace()) {
            Log.d("watchFaceListView", "renderWatchFaceList");
            this.bandSettingView.renderWatchFaceList();
            return;
        }
        Log.d("watchFaceListView", "hideWatchFaceList");
        if (connectBand == null) {
            Log.d("watchFaceListView", "boundBand == null");
        } else {
            Log.d("watchFaceListView", "without WatchFace");
        }
        this.bandSettingView.hideWatchFaceList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.bandSettingView = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.disposables.clear();
    }

    public void findDevice() {
        i4.getInstance().findBand();
        s0.logEvent("查找手表");
    }

    public void getAdView() {
        this.disposables.add(Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.home.device.presenter.a
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                d.lambda$getAdView$0(observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.home.device.presenter.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                d.this.lambda$getAdView$1((ExtendMenuModel) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.home.device.presenter.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                d.this.lambda$getAdView$2((Throwable) obj);
            }
        }));
    }

    public void getHeadView() {
        if (TextUtils.isEmpty(BandInfoManager.getAddress())) {
            showNotBoundBand();
        } else {
            showBandBaseInfo();
        }
    }

    public void getSettingList() {
        if (this.bandSettingView == null) {
            return;
        }
        showWatchFaceList();
        ArrayList arrayList = new ArrayList();
        if (AIProvider.isSupportAIGPT()) {
            BandSettingItemModel bandSettingItemModel = new BandSettingItemModel();
            bandSettingItemModel.setType(BandSettingItemModel.SettingType.AI_CHAT);
            bandSettingItemModel.setName(R.string.ai_assistant_title);
            bandSettingItemModel.setIcon(R$drawable.ic_device_ai);
            arrayList.add(bandSettingItemModel);
        }
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand != null && AppMarketProvider.isSupport()) {
            BandSettingItemModel bandSettingItemModel2 = new BandSettingItemModel();
            bandSettingItemModel2.setType(BandSettingItemModel.SettingType.APP_MARKET);
            bandSettingItemModel2.setName(R.string.device_app_market_title);
            bandSettingItemModel2.setIcon(R$drawable.ic_app_market_market);
            arrayList.add(bandSettingItemModel2);
        }
        BandSettingItemModel bandSettingItemModel3 = new BandSettingItemModel();
        bandSettingItemModel3.setType(BandSettingItemModel.SettingType.NOTIFICATION);
        bandSettingItemModel3.setName(R.string.notification);
        bandSettingItemModel3.setIcon(R$drawable.ic_device_messages);
        arrayList.add(bandSettingItemModel3);
        if (connectBand != null && l.isSupport()) {
            BandSettingItemModel bandSettingItemModel4 = new BandSettingItemModel();
            bandSettingItemModel4.setType(BandSettingItemModel.SettingType.LOCAL_PHOTO);
            bandSettingItemModel4.setName(R.string.device_local_photo_title);
            bandSettingItemModel4.setIcon(R$drawable.ic_device_local_photo);
            arrayList.add(bandSettingItemModel4);
        }
        if (connectBand != null && m.isSupport()) {
            BandSettingItemModel bandSettingItemModel5 = new BandSettingItemModel();
            bandSettingItemModel5.setType(BandSettingItemModel.SettingType.LOCAL_VIDEO);
            bandSettingItemModel5.setName(R.string.device_local_video_title);
            bandSettingItemModel5.setIcon(R$drawable.ic_device_localvideo);
            arrayList.add(bandSettingItemModel5);
        }
        if (connectBand != null && i.isSupport()) {
            BandSettingItemModel bandSettingItemModel6 = new BandSettingItemModel();
            bandSettingItemModel6.setType(BandSettingItemModel.SettingType.LOCAL_MUSIC);
            bandSettingItemModel6.setName(R.string.device_local_music_title);
            bandSettingItemModel6.setIcon(R$drawable.ic_device_music);
            arrayList.add(bandSettingItemModel6);
        }
        if (connectBand != null) {
            BandSettingItemModel bandSettingItemModel7 = new BandSettingItemModel();
            bandSettingItemModel7.setType(BandSettingItemModel.SettingType.FIND_DEVICE);
            bandSettingItemModel7.setName(R.string.find_band);
            bandSettingItemModel7.setIcon(R$drawable.ic_device_search);
            arrayList.add(bandSettingItemModel7);
        }
        BandSettingItemModel bandSettingItemModel8 = new BandSettingItemModel();
        bandSettingItemModel8.setType(BandSettingItemModel.SettingType.ALARM_CLOCK);
        bandSettingItemModel8.setName(R.string.daily_alarm_clock);
        bandSettingItemModel8.setIcon(R$drawable.ic_device_alarm);
        arrayList.add(bandSettingItemModel8);
        if (com.crrepa.band.my.device.muslim.utils.c.isSupportMuslim()) {
            BandSettingItemModel bandSettingItemModel9 = new BandSettingItemModel();
            bandSettingItemModel9.setType(BandSettingItemModel.SettingType.MUSLIM_PRAY);
            bandSettingItemModel9.setName(R.string.muslim_title);
            bandSettingItemModel9.setIcon(R$drawable.ic_device_musilm);
            arrayList.add(bandSettingItemModel9);
        }
        if (com.crrepa.band.my.device.worldclock.a.isSupportWorldClock()) {
            BandSettingItemModel bandSettingItemModel10 = new BandSettingItemModel();
            bandSettingItemModel10.setType(BandSettingItemModel.SettingType.WORLD_CLOCK);
            bandSettingItemModel10.setName(R.string.world_clock_title);
            bandSettingItemModel10.setIcon(R$drawable.ic_device_world_clock);
            arrayList.add(bandSettingItemModel10);
        }
        if (connectBand != null && com.crrepa.band.my.device.stock.c.isSupportStock()) {
            BandSettingItemModel bandSettingItemModel11 = new BandSettingItemModel();
            bandSettingItemModel11.setType(BandSettingItemModel.SettingType.STOCK_SETTING);
            bandSettingItemModel11.setName(R.string.stock_title);
            bandSettingItemModel11.setIcon(R$drawable.ic_device_stock);
            arrayList.add(bandSettingItemModel11);
        }
        if (BandPillReminderProvider.hasPillReminder()) {
            BandSettingItemModel bandSettingItemModel12 = new BandSettingItemModel();
            bandSettingItemModel12.setType(BandSettingItemModel.SettingType.PILL_REMINDER);
            bandSettingItemModel12.setName(R.string.pill_reminder);
            bandSettingItemModel12.setIcon(R$drawable.ic_device_pill);
            arrayList.add(bandSettingItemModel12);
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasCamera()) {
            BandSettingItemModel bandSettingItemModel13 = new BandSettingItemModel();
            bandSettingItemModel13.setType(BandSettingItemModel.SettingType.CAMERA_CONTROL);
            bandSettingItemModel13.setName(R.string.camera_control);
            bandSettingItemModel13.setIcon(R$drawable.ic_device_shutter);
            arrayList.add(bandSettingItemModel13);
        }
        if (com.crrepa.band.my.device.customkey.util.b.isSupportCustomKey()) {
            BandSettingItemModel bandSettingItemModel14 = new BandSettingItemModel();
            bandSettingItemModel14.setType(BandSettingItemModel.SettingType.CUSTOM_KEY);
            bandSettingItemModel14.setName(R.string.action_button_title);
            bandSettingItemModel14.setIcon(R$drawable.ic_device_button);
            arrayList.add(bandSettingItemModel14);
        }
        if (hasECard()) {
            BandSettingItemModel bandSettingItemModel15 = new BandSettingItemModel();
            bandSettingItemModel15.setType(BandSettingItemModel.SettingType.E_CARD);
            bandSettingItemModel15.setName(R.string.e_card);
            bandSettingItemModel15.setIcon(R$drawable.ic_device_ecard);
            arrayList.add(bandSettingItemModel15);
        }
        if (hasQuickContart()) {
            BandSettingItemModel bandSettingItemModel16 = new BandSettingItemModel();
            bandSettingItemModel16.setType(BandSettingItemModel.SettingType.QUICK_CONTART);
            bandSettingItemModel16.setName(R.string.quick_contact);
            bandSettingItemModel16.setIcon(R$drawable.ic_contact_shortcut);
            arrayList.add(bandSettingItemModel16);
        }
        if (connectBand != null && connectBand.hasCustomFunction()) {
            BandSettingItemModel bandSettingItemModel17 = new BandSettingItemModel();
            bandSettingItemModel17.setType(BandSettingItemModel.SettingType.FUNCTION_LIST);
            bandSettingItemModel17.setName(R.string.function_switch);
            bandSettingItemModel17.setIcon(R$drawable.ic_device_function);
            arrayList.add(bandSettingItemModel17);
        }
        BandSettingItemModel bandSettingItemModel18 = new BandSettingItemModel();
        bandSettingItemModel18.setType(BandSettingItemModel.SettingType.OTHER_SETTINGS);
        bandSettingItemModel18.setName(R.string.other_settings);
        bandSettingItemModel18.setIcon(R$drawable.ic_device_otherset);
        arrayList.add(bandSettingItemModel18);
        BandSettingItemModel bandSettingItemModel19 = new BandSettingItemModel();
        bandSettingItemModel19.setType(BandSettingItemModel.SettingType.FIRMWARE_UPGRADE);
        bandSettingItemModel19.setName(R.string.firmware_upgrade);
        bandSettingItemModel19.setIcon(R$drawable.ic_device_update);
        bandSettingItemModel19.setNewVersion(this.hasNewVersion);
        arrayList.add(bandSettingItemModel19);
        if (BandCalendarEventProvider.isSupportCalendarEvent()) {
            BandSettingItemModel bandSettingItemModel20 = new BandSettingItemModel();
            bandSettingItemModel20.setType(BandSettingItemModel.SettingType.CALENDAR_EVENT);
            bandSettingItemModel20.setName(R.string.calendar_event);
            bandSettingItemModel20.setIcon(R$drawable.ic_device_calendar);
            arrayList.add(bandSettingItemModel20);
        }
        this.bandSettingView.renderBandSettingList(arrayList);
        getAdView();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandBatteryChangeEvent(l0.b bVar) {
        showBandBattery(bVar.getBattery());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandBoundStateChangeEvent(l0.d dVar) {
        if (dVar.isRefresh()) {
            this.bandSettingView.resetWatchFaceList();
        }
        if (dVar.isBound()) {
            showBandBaseInfo();
        } else {
            showNotBoundBand();
        }
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandCalendarEventChangeEvent(BandCalendarEventChangeEvent bandCalendarEventChangeEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        showBandConnectState(aVar.getState());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandCustomKeyFeatureSupportChangeEvent(BandCustomKeyFeatureSupportChangeEvent bandCustomKeyFeatureSupportChangeEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandECardCoundEvent(BandECardCountEvent bandECardCountEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandFirmwareVersionEvent(BandFirmwareVersionEvent bandFirmwareVersionEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandMuslimSupportEvent(BandMuslimSupportEvent bandMuslimSupportEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandNewFirmwareVersionEvent(BandNewFirmwareVersionEvent bandNewFirmwareVersionEvent) {
        CRPFirmwareVersionInfo versionInfo = bandNewFirmwareVersionEvent.getVersionInfo();
        BandFirmwareModel bandFirmwareModel = versionInfo != null ? r0.a.toBandFirmwareModel(versionInfo) : null;
        if (bandFirmwareModel != null && bandFirmwareModel.getType() == 0) {
            this.hasNewVersion = true;
        }
        o3.a aVar = this.bandSettingView;
        if (aVar != null) {
            aVar.renderNewFirmwareVersion(bandFirmwareModel);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandPillReminderChangeEvent(BandPillReminderChangeEvent bandPillReminderChangeEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandQuickContartChangeEvent(BandQuickContartChangeEvent bandQuickContartChangeEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandWorldClockSupportChangeEvent(BandWorldClockSupportChangeEvent bandWorldClockSupportChangeEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBluetoothStateChangeEvent(BluetoothStateChangeEvent bluetoothStateChangeEvent) {
        if (bluetoothStateChangeEvent.isEnable()) {
            return;
        }
        showBandConnectState(R.string.bluetooth_disable);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBnadUpgradeCompleteEvent(BandUpgradeCompleteEvent bandUpgradeCompleteEvent) {
        o3.a aVar = this.bandSettingView;
        if (aVar != null) {
            aVar.renderBandUpgradeComplete();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(NewCustomWatchFaceMsgUpdateEvent newCustomWatchFaceMsgUpdateEvent) {
        showWatchFaceList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onSupportAiEvent(com.crrepa.band.my.device.ai.b bVar) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onSupportLocalMusicEvent(MusicSavedCountChangedEvent musicSavedCountChangedEvent) {
        getSettingList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onSupportStockCountEvent(SupportStockCountEvent supportStockCountEvent) {
        getSettingList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void removeBand(Context context) {
        BandManger.removeBand(context);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        updateBandConnectState();
    }

    public void setView(o3.a aVar) {
        this.bandSettingView = aVar;
    }

    public void startForcedUpgrade(Context context) {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            this.bandSettingView.renderBandDisconnectedHint();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            this.bandSettingView.renderLowBatteryHint();
        } else if (a0.isNetworkConnected(context)) {
            this.bandSettingView.startUpgradeActivity();
        } else {
            this.bandSettingView.renderNetErrorHint();
        }
    }

    public void updateBandConnectState() {
        showBandConnectState(getBandConnectState());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(SupportAppInfoEvent supportAppInfoEvent) {
        getSettingList();
    }
}
