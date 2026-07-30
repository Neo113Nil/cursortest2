package com.crrepa.band.my.ble.band.cmd;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.crrepa.band.my.device.ai.chat.model.HisiliconErrorCode;
import com.crrepa.band.my.device.watchfacenew.photo.b;
import com.crrepa.band.my.device.worldclock.model.WorldClockConvert;
import com.crrepa.band.my.model.BandPeriodTimeModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandDisplayLanguageProvider;
import com.crrepa.band.my.model.band.provider.BandMessageLengthProvider;
import com.crrepa.band.my.model.band.provider.BandMusicPlayerProvider;
import com.crrepa.band.my.model.band.provider.BandPhysiologcalPeriodProvider;
import com.crrepa.band.my.model.band.provider.BandStorageProvider;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.MessagePush;
import com.crrepa.band.my.model.db.WorldClock;
import com.crrepa.band.my.model.db.proxy.BandMessageDaoProxy;
import com.crrepa.band.my.model.db.proxy.QuickContartConfigDaoProxy;
import com.crrepa.band.my.model.db.proxy.WorldClockDaoProxy;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.band.my.model.user.provider.UserHeightProvider;
import com.crrepa.band.my.model.user.provider.UserStepLengthProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.ble.conn.CRPBleConnection;
import com.crrepa.ble.conn.bean.CRPAlarmInfo;
import com.crrepa.ble.conn.bean.CRPCalendarEventInfo;
import com.crrepa.ble.conn.bean.CRPConnectKitMessage;
import com.crrepa.ble.conn.bean.CRPContactInfo;
import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.bean.CRPDailyGoalsInfo;
import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPElectronicCardInfo;
import com.crrepa.ble.conn.bean.CRPFunctionInfo;
import com.crrepa.ble.conn.bean.CRPFutureWeatherInfo;
import com.crrepa.ble.conn.bean.CRPHandWashingPeriodInfo;
import com.crrepa.ble.conn.bean.CRPHealthSuggestionInfo;
import com.crrepa.ble.conn.bean.CRPHisiliconEpoInfo;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPLocalNavigationInfo;
import com.crrepa.ble.conn.bean.CRPMessageInfo;
import com.crrepa.ble.conn.bean.CRPMuslimLocationInfo;
import com.crrepa.ble.conn.bean.CRPMuslimPrayerCalculationInfo;
import com.crrepa.ble.conn.bean.CRPMuslimTasbihSettingInfo;
import com.crrepa.ble.conn.bean.CRPNewDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import com.crrepa.ble.conn.bean.CRPPillReminderInfo;
import com.crrepa.ble.conn.bean.CRPQuickResponsesDetailInfo;
import com.crrepa.ble.conn.bean.CRPStockInfo;
import com.crrepa.ble.conn.bean.CRPStockPriceInfo;
import com.crrepa.ble.conn.bean.CRPTodayWeatherInfo;
import com.crrepa.ble.conn.bean.CRPTrainingDayInfo;
import com.crrepa.ble.conn.bean.CRPUserInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceBackgroundInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWaterIntakeInfo;
import com.crrepa.ble.conn.bean.CRPWorldClockInfo;
import com.crrepa.ble.conn.callback.CRPAlarmCallback;
import com.crrepa.ble.conn.callback.CRPAvailableStorageCallback;
import com.crrepa.ble.conn.callback.CRPBluetrumWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPBtAddressCallback;
import com.crrepa.ble.conn.callback.CRPContactCountCallback;
import com.crrepa.ble.conn.callback.CRPContactNumberSymbolCallback;
import com.crrepa.ble.conn.callback.CRPDailyGoalsCallback;
import com.crrepa.ble.conn.callback.CRPDeviceBondStateCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDfuAddressCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDfuStatusCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDisplayWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPDeviceFunctionCallback;
import com.crrepa.ble.conn.callback.CRPDeviceInfoCallback;
import com.crrepa.ble.conn.callback.CRPDevicePeriodTimeCallback;
import com.crrepa.ble.conn.callback.CRPDevicePhysiologcalPeriodCallback;
import com.crrepa.ble.conn.callback.CRPDeviceQuickViewCallback;
import com.crrepa.ble.conn.callback.CRPDeviceSedentaryReminderCallback;
import com.crrepa.ble.conn.callback.CRPDeviceSupportWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPDeviceTestModeCallback;
import com.crrepa.ble.conn.callback.CRPDeviceTimeSystemCallback;
import com.crrepa.ble.conn.callback.CRPDeviceWatchFaceLayoutCallback;
import com.crrepa.ble.conn.callback.CRPElectronicCardCallback;
import com.crrepa.ble.conn.callback.CRPJieliWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPMessageListCallback;
import com.crrepa.ble.conn.callback.CRPMuslimTasbihSettingCallback;
import com.crrepa.ble.conn.callback.CRPPillReminderCallback;
import com.crrepa.ble.conn.callback.CRPRemoveBondCallback;
import com.crrepa.ble.conn.callback.CRPSosStateCallback;
import com.crrepa.ble.conn.callback.CRPTapToWakeCallback;
import com.crrepa.ble.conn.callback.CRPTrainingDayGoalsCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceScreenCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceTimeStyleCallback;
import com.crrepa.ble.conn.listener.CRPA2DPConnectStateListener;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.conn.listener.CRPCalendarEventListener;
import com.crrepa.ble.conn.listener.CRPContactListener;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.listener.CRPGalleryTransListener;
import com.crrepa.ble.conn.listener.CRPPhotoWatchFaceTransListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.crrepa.ble.conn.type.CRPEpoType;
import com.crrepa.ble.conn.type.CRPMuslimPrayerNotifcationType;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPProtocolVersion;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class i4 {
    private com.crrepa.band.my.ble.band.cmd.listener.b batteryListener;
    private CRPBleConnection bleConnection;
    private final h1.a callback;
    private com.crrepa.band.my.device.ecard.a eCardCountCallback;
    private com.crrepa.band.my.ble.band.cmd.callback.e firmwareVersionCallback;
    private com.crrepa.band.my.ble.band.cmd.callback.q heartRateTimingMeasureCallback;
    private com.crrepa.band.my.ble.band.cmd.callback.i languageCallback;
    private com.crrepa.band.my.ble.band.cmd.callback.k newFirmwareVersionCallback;
    private com.crrepa.band.my.ble.band.cmd.callback.m physiologcalPeriodCallback;
    private String previousSongName;
    private com.crrepa.band.my.device.switchui.b supportFunctionCallback;
    private com.crrepa.band.my.health.bodytemperature.b tempTimingMeasureStateCallback;

    class a implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPElectronicCardInfo val$info;

        a(CRPElectronicCardInfo cRPElectronicCardInfo) {
            this.val$info = cRPElectronicCardInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendElectronicCard(this.val$info);
        }
    }

    class a0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ File val$file;
        final /* synthetic */ CRPHisiliconEpoInfo val$info;
        final /* synthetic */ CRPFileTransListener val$listener;
        final /* synthetic */ CRPEpoType val$type;

        a0(CRPEpoType cRPEpoType, File file, CRPHisiliconEpoInfo cRPHisiliconEpoInfo, CRPFileTransListener cRPFileTransListener) {
            this.val$type = cRPEpoType;
            this.val$file = file;
            this.val$info = cRPHisiliconEpoInfo;
            this.val$listener = cRPFileTransListener;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            if (this.val$type == CRPEpoType.HISILICON_GPS) {
                i4.this.bleConnection.sendHisiliconEpoFile(this.val$file, this.val$info, this.val$listener);
            } else {
                i4.this.bleConnection.sendEpoFile(this.val$file, this.val$type, this.val$listener);
            }
        }
    }

    class a1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        a1() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryA2DPState();
        }
    }

    class a2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDevicePeriodTimeCallback val$callback;

        a2(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback) {
            this.val$callback = cRPDevicePeriodTimeCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryDoNotDistrubTime(this.val$callback);
        }
    }

    class a3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPHandWashingPeriodInfo val$info;

        a3(CRPHandWashingPeriodInfo cRPHandWashingPeriodInfo) {
            this.val$info = cRPHandWashingPeriodInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendHandWashingReminder(this.val$info);
        }
    }

    class a4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        a4() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTimingBloodOxygenMeasureState();
        }
    }

    class b implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$id;

        b(int i8) {
            this.val$id = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.deleteElectronicCard(this.val$id);
        }
    }

    class b0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        b0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTimingStressState();
        }
    }

    class b1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPTodayWeatherInfo val$weatherInfo;

        b1(CRPTodayWeatherInfo cRPTodayWeatherInfo) {
            this.val$weatherInfo = cRPTodayWeatherInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendTodayWeather(this.val$weatherInfo);
        }
    }

    class b2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ BandPeriodTimeModel val$periodTimeModel;

        b2(BandPeriodTimeModel bandPeriodTimeModel) {
            this.val$periodTimeModel = bandPeriodTimeModel;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendQuickViewTime(this.val$periodTimeModel.convertCRPPeriodTimeInfo());
        }
    }

    class b3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ String val$city;

        b3(String str) {
            this.val$city = str;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendLocalCity(this.val$city);
        }
    }

    class b4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        b4(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            if (this.val$enable) {
                i4.this.bleConnection.enableTimingMeasureBloodOxygen(6);
            } else {
                i4.this.bleConnection.disableTimingMeasureBloodOxygen();
            }
        }
    }

    class c implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPElectronicCardCallback val$callback;
        final /* synthetic */ int val$id;

        c(int i8, CRPElectronicCardCallback cRPElectronicCardCallback) {
            this.val$id = i8;
            this.val$callback = cRPElectronicCardCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryElectronicCard(this.val$id, this.val$callback);
        }
    }

    class c0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        c0(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            if (this.val$enable) {
                i4.this.bleConnection.enableTimingStress();
            } else {
                i4.this.bleConnection.disableTimingStress();
            }
        }
    }

    class c1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPFutureWeatherInfo val$weatherInfo;

        c1(CRPFutureWeatherInfo cRPFutureWeatherInfo) {
            this.val$weatherInfo = cRPFutureWeatherInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendFutureWeather(this.val$weatherInfo);
        }
    }

    class c2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDevicePeriodTimeCallback val$callback;

        c2(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback) {
            this.val$callback = cRPDevicePeriodTimeCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryQuickViewTime(this.val$callback);
        }
    }

    class c3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        c3() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTimingMeasureTempState(i4.this.tempTimingMeasureStateCallback);
        }
    }

    class c4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPPillReminderInfo val$info;

        c4(CRPPillReminderInfo cRPPillReminderInfo) {
            this.val$info = cRPPillReminderInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendPillReminder(this.val$info);
        }
    }

    class d implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ List val$list;

        d(List list) {
            this.val$list = list;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendElectronicCardList(this.val$list);
        }
    }

    class d0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        d0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.querySupportCustomTrainingList();
        }
    }

    class d1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPAlarmCallback val$callback;

        d1(CRPAlarmCallback cRPAlarmCallback) {
            this.val$callback = cRPAlarmCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryAllAlarm(this.val$callback);
        }
    }

    class d2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        d2() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTimingMeasureHeartRate(i4.this.heartRateTimingMeasureCallback);
        }
    }

    class d3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ com.crrepa.band.my.ble.band.cmd.callback.f val$callback;

        d3(com.crrepa.band.my.ble.band.cmd.callback.f fVar) {
            this.val$callback = fVar;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryGoalStep(this.val$callback);
        }
    }

    class d4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$id;

        d4(int i8) {
            this.val$id = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.deletePillReminder(this.val$id);
        }
    }

    class e implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPCalendarEventListener val$listener;

        e(CRPCalendarEventListener cRPCalendarEventListener) {
            this.val$listener = cRPCalendarEventListener;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.setCalendarEventListener(this.val$listener);
        }
    }

    class e0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        e0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.querySupportCustomFeatureList();
        }
    }

    class e1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPAlarmInfo val$info;

        e1(CRPAlarmInfo cRPAlarmInfo) {
            this.val$info = cRPAlarmInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendAlarm(this.val$info);
        }
    }

    class e2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPWatchFaceBackgroundInfo val$info;
        final /* synthetic */ CRPFileTransListener val$listener;

        e2(CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo, CRPFileTransListener cRPFileTransListener) {
            this.val$info = cRPWatchFaceBackgroundInfo;
            this.val$listener = cRPFileTransListener;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendWatchFaceBackground(this.val$info, this.val$listener);
        }
    }

    class e3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        e3(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            if (this.val$enable) {
                i4.this.bleConnection.enableTimingMeasureTemp();
            } else {
                i4.this.bleConnection.disableTimingMeasureTemp();
            }
        }
    }

    class e4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        e4() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.clearPillReminder();
        }
    }

    class f implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$id;

        f(int i8) {
            this.val$id = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryCalendarEvent(this.val$id);
        }
    }

    class f0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        f0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.querySupportCustomGameList();
        }
    }

    class f1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPAlarmCallback val$callback;

        f1(CRPAlarmCallback cRPAlarmCallback) {
            this.val$callback = cRPAlarmCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryAllNewAlarm(this.val$callback);
        }
    }

    class f2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPWatchFaceLayoutInfo val$info;

        f2(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
            this.val$info = cRPWatchFaceLayoutInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendWatchFaceLayout(this.val$info);
        }
    }

    class f3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        f3() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendBoundVibration();
        }
    }

    class f4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPPillReminderCallback val$callback;

        f4(CRPPillReminderCallback cRPPillReminderCallback) {
            this.val$callback = cRPPillReminderCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryPillReminder(this.val$callback);
        }
    }

    class g implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPCalendarEventInfo val$info;

        g(CRPCalendarEventInfo cRPCalendarEventInfo) {
            this.val$info = cRPCalendarEventInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendCalendarEvent(this.val$info);
        }
    }

    class g0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$type;
        final /* synthetic */ String val$version;

        g0(String str, int i8) {
            this.val$version = str;
            this.val$type = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.checkFirmwareVersion(i4.this.newFirmwareVersionCallback, this.val$version, this.val$type);
        }
    }

    class g1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPAlarmInfo val$info;

        g1(CRPAlarmInfo cRPAlarmInfo) {
            this.val$info = cRPAlarmInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendNewAlarm(this.val$info);
        }
    }

    class g2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceWatchFaceLayoutCallback val$callback;

        g2(CRPDeviceWatchFaceLayoutCallback cRPDeviceWatchFaceLayoutCallback) {
            this.val$callback = cRPDeviceWatchFaceLayoutCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryWatchFaceLayout(this.val$callback);
        }
    }

    class g3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$system;

        g3(int i8) {
            this.val$system = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendTempUnit((byte) this.val$system);
        }
    }

    class g4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        g4(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendTapToWakeState(this.val$enable);
        }
    }

    class h implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$id;

        h(int i8) {
            this.val$id = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.deleteCalendarEvent(this.val$id);
        }
    }

    class h0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPCustomKeyInfo val$info;

        h0(CRPCustomKeyInfo cRPCustomKeyInfo) {
            this.val$info = cRPCustomKeyInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendCustomKey(this.val$info);
        }
    }

    class h1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$alarmId;

        h1(int i8) {
            this.val$alarmId = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.deleteNewAlarm(this.val$alarmId);
        }
    }

    class h2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        h2() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendUserInfo(new CRPUserInfo(Math.round(UserWeightProvider.getUserWeightKg()), UserHeightProvider.getUserHeightCm(), UserGenderProvider.getUsetGender() == 0 ? 1 : 0, UserAgeProvider.getUserAge()));
        }
    }

    class h3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        h3() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTempUnit();
        }
    }

    class h4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPTapToWakeCallback val$callback;

        h4(CRPTapToWakeCallback cRPTapToWakeCallback) {
            this.val$callback = cRPTapToWakeCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTapToWakeState(this.val$callback);
        }
    }

    class i implements com.crrepa.band.my.ble.band.cmd.j4 {
        i() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.querySupportCalendarEvent();
        }
    }

    class i0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte val$id;

        i0(byte b8) {
            this.val$id = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryWorldClock(this.val$id);
        }
    }

    class i1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceFunctionCallback val$callback;

        i1(CRPDeviceFunctionCallback cRPDeviceFunctionCallback) {
            this.val$callback = cRPDeviceFunctionCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryDisplayDeviceFunction(this.val$callback);
        }
    }

    class i2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceDfuStatusCallback val$callback;

        i2(CRPDeviceDfuStatusCallback cRPDeviceDfuStatusCallback) {
            this.val$callback = cRPDeviceDfuStatusCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryDeviceDfuStatus(this.val$callback);
        }
    }

    class i3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte val$state;

        i3(byte b8) {
            this.val$state = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.setMusicPlayerState(this.val$state);
        }
    }

    /* renamed from: com.crrepa.band.my.ble.band.cmd.i4$i4, reason: collision with other inner class name */
    class C0152i4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPContactNumberSymbolCallback val$callback;

        C0152i4(CRPContactNumberSymbolCallback cRPContactNumberSymbolCallback) {
            this.val$callback = cRPContactNumberSymbolCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryContactNumberSymbol(this.val$callback);
        }
    }

    class j implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$isReminder;
        final /* synthetic */ int val$time;

        j(boolean z7, int i8) {
            this.val$isReminder = z7;
            this.val$time = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendCalendarEventReminderTime(this.val$isReminder, this.val$time);
        }
    }

    class j0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        j0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.querySupportWorldClock();
        }
    }

    class j1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceFunctionCallback val$callback;

        j1(CRPDeviceFunctionCallback cRPDeviceFunctionCallback) {
            this.val$callback = cRPDeviceFunctionCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryDeviceSupportFunction(this.val$callback);
        }
    }

    class j2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte val$stepLength;

        j2(byte b8) {
            this.val$stepLength = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendStepLength(this.val$stepLength);
        }
    }

    class j3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ String val$name;

        j3(String str) {
            this.val$name = str;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendSongTitle(this.val$name);
        }
    }

    class j4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        j4() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryElectronicCardCount(i4.this.eCardCountCallback);
        }
    }

    class k implements com.crrepa.band.my.ble.band.cmd.j4 {
        k() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            if (i4.this.bleConnection == null) {
                com.orhanobut.logger.f.w("queryBandFirmwareVersion: bleConnection is null", new Object[0]);
            } else {
                i4.this.firmwareVersionCallback.startTimer();
                i4.this.bleConnection.queryFrimwareVersion(i4.this.firmwareVersionCallback);
            }
        }
    }

    class k0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPWorldClockInfo val$info;

        k0(CRPWorldClockInfo cRPWorldClockInfo) {
            this.val$info = cRPWorldClockInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendWorldClock(this.val$info);
        }
    }

    class k1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPFunctionInfo val$functionInfo;

        k1(CRPFunctionInfo cRPFunctionInfo) {
            this.val$functionInfo = cRPFunctionInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendDislpayDeviceFunction(this.val$functionInfo);
        }
    }

    class k2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceSupportWatchFaceCallback val$callback;

        k2(CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback) {
            this.val$callback = cRPDeviceSupportWatchFaceCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.querySupportWatchFace(this.val$callback);
        }
    }

    class k3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ String val$lyrics;

        k3(String str) {
            this.val$lyrics = str;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendLyrics(this.val$lyrics);
        }
    }

    class k4 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceTimeSystemCallback val$callback;

        k4(CRPDeviceTimeSystemCallback cRPDeviceTimeSystemCallback) {
            this.val$callback = cRPDeviceTimeSystemCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTimeSystem(this.val$callback);
        }
    }

    class l implements com.crrepa.band.my.ble.band.cmd.j4 {
        l() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryCalendarEventReminderTime();
        }
    }

    class l0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte val$id;

        l0(byte b8) {
            this.val$id = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.deleteWorldClock(this.val$id);
        }
    }

    class l1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPA2DPConnectStateListener.A2DPConnectState val$state;

        l1(CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState) {
            this.val$state = a2DPConnectState;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendA2DPState(this.val$state);
        }
    }

    class l2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPWatchFaceInfo val$info;
        final /* synthetic */ CRPWatchFaceTransListener val$listener;
        final /* synthetic */ int val$timeout;

        l2(CRPWatchFaceInfo cRPWatchFaceInfo, CRPWatchFaceTransListener cRPWatchFaceTransListener, int i8) {
            this.val$info = cRPWatchFaceInfo;
            this.val$listener = cRPWatchFaceTransListener;
            this.val$timeout = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendWatchFace(this.val$info, this.val$listener, this.val$timeout);
        }
    }

    class l3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPBtAddressCallback val$callback;

        l3(CRPBtAddressCallback cRPBtAddressCallback) {
            this.val$callback = cRPBtAddressCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryBtAddress(this.val$callback);
        }
    }

    private static class l4 {
        private static final i4 INSTANCE = new i4(null);

        private l4() {
        }
    }

    class m implements com.crrepa.band.my.ble.band.cmd.j4 {
        m() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.clearCalendarEvent();
        }
    }

    class m0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte[] val$id;

        m0(byte[] bArr) {
            this.val$id = bArr;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.resetWorldClockList(this.val$id);
        }
    }

    class m1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        m1(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendOtherMessageState(this.val$enable);
        }
    }

    class m2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPWatchFaceDeleteCallback val$callback;
        final /* synthetic */ int val$id;

        m2(int i8, CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback) {
            this.val$id = i8;
            this.val$callback = cRPWatchFaceDeleteCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.deleteWatchFace(this.val$id, this.val$callback);
        }
    }

    class m3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        m3() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.checkSupportQuickContact(new com.crrepa.band.my.device.contact.a());
        }
    }

    class n implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPAvailableStorageCallback val$callback;

        n(CRPAvailableStorageCallback cRPAvailableStorageCallback) {
            this.val$callback = cRPAvailableStorageCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryAvailableStorage(this.val$callback);
        }
    }

    class n0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceTestModeCallback val$callback;

        n0(CRPDeviceTestModeCallback cRPDeviceTestModeCallback) {
            this.val$callback = cRPDeviceTestModeCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTestModeState(this.val$callback);
        }
    }

    class n1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPMessageInfo val$messageInfo;

        n1(CRPMessageInfo cRPMessageInfo) {
            this.val$messageInfo = cRPMessageInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendMessage(this.val$messageInfo);
        }
    }

    class n2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPWatchFaceDeleteCallback val$callback;
        final /* synthetic */ int[] val$idArray;

        n2(int[] iArr, CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback) {
            this.val$idArray = iArr;
            this.val$callback = cRPWatchFaceDeleteCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.deleteJieliWatchFace(this.val$idArray, this.val$callback);
        }
    }

    class n3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPContactCountCallback val$callback;

        n3(CRPContactCountCallback cRPContactCountCallback) {
            this.val$callback = cRPContactCountCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryContactCount(this.val$callback);
        }
    }

    class o implements com.crrepa.band.my.ble.band.cmd.j4 {
        o() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryQuickResponsesCount();
        }
    }

    class o0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        o0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendUserMode();
        }
    }

    class o1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        o1() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendCall0ffHook();
        }
    }

    class o2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceDfuAddressCallback val$callback;

        o2(CRPDeviceDfuAddressCallback cRPDeviceDfuAddressCallback) {
            this.val$callback = cRPDeviceDfuAddressCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryHsDfuAddress(this.val$callback);
        }
    }

    class o3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte val$system;

        o3(byte b8) {
            this.val$system = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendMetricSystem(this.val$system);
        }
    }

    class p implements com.crrepa.band.my.ble.band.cmd.j4 {
        p() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.enableQuickResponses();
        }
    }

    class p0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPBluetrumWatchFaceCallback val$callback;

        p0(CRPBluetrumWatchFaceCallback cRPBluetrumWatchFaceCallback) {
            this.val$callback = cRPBluetrumWatchFaceCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryBluetrumWatchFaceInfo(this.val$callback);
        }
    }

    class p1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceDisplayWatchFaceCallback val$callback;

        p1(CRPDeviceDisplayWatchFaceCallback cRPDeviceDisplayWatchFaceCallback) {
            this.val$callback = cRPDeviceDisplayWatchFaceCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryDisplayWatchFace(this.val$callback);
        }
    }

    class p2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        p2() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.enableHsDfu();
        }
    }

    class p3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        p3() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.clearContact();
        }
    }

    class q implements com.crrepa.band.my.ble.band.cmd.j4 {
        q() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.disableQuickResponses();
        }
    }

    class q0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$id;
        final /* synthetic */ boolean val$isMultiple;

        q0(int i8, boolean z7) {
            this.val$id = i8;
            this.val$isMultiple = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendJieliWatchFaceId(this.val$id, this.val$isMultiple);
        }
    }

    class q1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$index;

        q1(int i8) {
            this.val$index = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendDisplayWatchFace((byte) this.val$index);
        }
    }

    class q2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPPhysiologcalPeriodInfo val$finalInfo;

        q2(CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo) {
            this.val$finalInfo = cRPPhysiologcalPeriodInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendPhysiologcalPeriod(this.val$finalInfo);
        }
    }

    class q3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$id;

        q3(int i8) {
            this.val$id = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.deleteContact(this.val$id);
        }
    }

    class r implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte val$id;

        r(byte b8) {
            this.val$id = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryQuickResponses(this.val$id);
        }
    }

    class r0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        r0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            if (i4.this.bleConnection != null) {
                i4.this.bleConnection.queryDeviceBattery();
            }
        }
    }

    class r1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        r1() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendGsensorCalibration();
        }
    }

    class r2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDevicePhysiologcalPeriodCallback val$callback;

        r2(CRPDevicePhysiologcalPeriodCallback cRPDevicePhysiologcalPeriodCallback) {
            this.val$callback = cRPDevicePhysiologcalPeriodCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryPhysiologcalPeriod(this.val$callback);
        }
    }

    class r3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPContactInfo val$info;

        r3(CRPContactInfo cRPContactInfo) {
            this.val$info = cRPContactInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendContact(this.val$info);
        }
    }

    class s implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPQuickResponsesDetailInfo val$info;

        s(CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo) {
            this.val$info = cRPQuickResponsesDetailInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendQuickResponses(this.val$info);
        }
    }

    class s0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        s0(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.enableSos(this.val$enable);
        }
    }

    class s1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        s1() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.enterCameraView();
        }
    }

    class s2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$steps;

        s2(int i8) {
            this.val$steps = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendGoalSteps(this.val$steps);
        }
    }

    class s3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ Bitmap val$bitmap;
        final /* synthetic */ int val$id;
        final /* synthetic */ CRPFileTransListener val$listener;
        final /* synthetic */ int val$timeout;

        s3(int i8, Bitmap bitmap, int i9, CRPFileTransListener cRPFileTransListener) {
            this.val$id = i8;
            this.val$bitmap = bitmap;
            this.val$timeout = i9;
            this.val$listener = cRPFileTransListener;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendContactAvatar(this.val$id, this.val$bitmap, this.val$timeout, this.val$listener);
        }
    }

    class t implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDailyGoalsCallback val$callback;

        t(CRPDailyGoalsCallback cRPDailyGoalsCallback) {
            this.val$callback = cRPDailyGoalsCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryDailyGoals(this.val$callback);
        }
    }

    class t0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPSosStateCallback val$callback;

        t0(CRPSosStateCallback cRPSosStateCallback) {
            this.val$callback = cRPSosStateCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.querySosState(this.val$callback);
        }
    }

    class t1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        t1() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.exitCameraView();
        }
    }

    class t2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        t2() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.startFindPhone();
        }
    }

    class t3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        t3() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.reset();
        }
    }

    class u implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPTrainingDayGoalsCallback val$callback;

        u(CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback) {
            this.val$callback = cRPTrainingDayGoalsCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryTrainingDay(this.val$callback);
            i4.this.bleConnection.queryTrainingDayGoals(this.val$callback);
        }
    }

    class u0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        u0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.subscribeDeviceBattery();
        }
    }

    class u1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$isGoodix;
        final /* synthetic */ CRPBleFirmwareUpgradeListener val$listener;

        u1(boolean z7, CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
            this.val$isGoodix = z7;
            this.val$listener = cRPBleFirmwareUpgradeListener;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.startFirmwareUpgrade(this.val$isGoodix, this.val$listener);
        }
    }

    class u2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        u2() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.stopFindPhone();
        }
    }

    class u3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$volume;

        u3(int i8) {
            this.val$volume = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendCurrentVolume(this.val$volume);
        }
    }

    class v implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPRemoveBondCallback val$callback;

        v(CRPRemoveBondCallback cRPRemoveBondCallback) {
            this.val$callback = cRPRemoveBondCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.removeBond(this.val$callback);
        }
    }

    class v0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        v0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.findDevice();
        }
    }

    class v1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        v1() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.abortFirmwareUpgrade();
        }
    }

    class v2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        v2() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryMaxHeartRate(new com.crrepa.band.my.ble.band.cmd.callback.h());
        }
    }

    class v3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$volume;

        v3(int i8) {
            this.val$volume = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendMaxVolume(this.val$volume);
        }
    }

    class w implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDailyGoalsInfo val$info;

        w(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
            this.val$info = cRPDailyGoalsInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendTrainingDayGoals(this.val$info);
        }
    }

    class w0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        w0(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendSedentaryReminder(this.val$enable);
        }
    }

    class w1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        w1() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.syncTime();
            i4.this.bleConnection.sendCurrentTimezone();
        }
    }

    class w2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;
        final /* synthetic */ byte val$hr;

        w2(byte b8, boolean z7) {
            this.val$hr = b8;
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.setMaxHeartRate(this.val$hr, this.val$enable);
        }
    }

    class w3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        w3(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendBatterySaving(this.val$enable);
        }
    }

    class x implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDailyGoalsInfo val$info;

        x(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
            this.val$info = cRPDailyGoalsInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendDailyGoals(this.val$info);
        }
    }

    class x0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceSedentaryReminderCallback val$callback;

        x0(CRPDeviceSedentaryReminderCallback cRPDeviceSedentaryReminderCallback) {
            this.val$callback = cRPDeviceSedentaryReminderCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.querySedentaryReminder(this.val$callback);
        }
    }

    class x1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        x1() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.languageCallback.setQueryLanguage(true);
            i4.this.bleConnection.queryDeviceLanguage(i4.this.languageCallback);
        }
    }

    class x2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        x2() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryDisplayTime(new com.crrepa.band.my.ble.band.cmd.callback.d());
        }
    }

    class x3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        x3() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryBatterySaving();
        }
    }

    class y implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPTrainingDayInfo val$info;

        y(CRPTrainingDayInfo cRPTrainingDayInfo) {
            this.val$info = cRPTrainingDayInfo;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendTrainingDays(this.val$info);
        }
    }

    class y0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ boolean val$enable;

        y0(boolean z7) {
            this.val$enable = z7;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendQuickView(this.val$enable);
        }
    }

    class y1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte val$language;

        y1(byte b8) {
            this.val$language = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            byte b8 = 1;
            if (i4.this.isV1() && this.val$language == 1) {
                b8 = 0;
            }
            com.orhanobut.logger.f.d("version: " + ((int) b8));
            com.orhanobut.logger.f.d("language: " + ((int) this.val$language));
            i4.this.bleConnection.sendDeviceVersion(b8);
            i4.this.bleConnection.sendDeviceLanguage(this.val$language);
            i4.this.sendUnitSystem((byte) BandUnitSystemProvider.getUnitSystem());
        }
    }

    class y2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ int val$time;

        y2(int i8) {
            this.val$time = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendDisplayTime(this.val$time);
        }
    }

    class y3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        y3() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.closeMusicControl();
        }
    }

    class z implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPMessageListCallback val$callback;

        z(CRPMessageListCallback cRPMessageListCallback) {
            this.val$callback = cRPMessageListCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryMessageList(this.val$callback);
        }
    }

    class z0 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ CRPDeviceQuickViewCallback val$callback;

        z0(CRPDeviceQuickViewCallback cRPDeviceQuickViewCallback) {
            this.val$callback = cRPDeviceQuickViewCallback;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryQuickView(this.val$callback);
        }
    }

    class z1 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ BandPeriodTimeModel val$periodTimeModel;

        z1(BandPeriodTimeModel bandPeriodTimeModel) {
            this.val$periodTimeModel = bandPeriodTimeModel;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendDoNotDistrubTime(this.val$periodTimeModel.convertCRPPeriodTimeInfo());
        }
    }

    class z2 implements com.crrepa.band.my.ble.band.cmd.j4 {
        z2() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.queryHandWashingReminderPeriod(new com.crrepa.band.my.ble.band.cmd.callback.g());
        }
    }

    class z3 implements com.crrepa.band.my.ble.band.cmd.j4 {
        final /* synthetic */ byte val$timeSystem;

        z3(byte b8) {
            this.val$timeSystem = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            i4.this.bleConnection.sendTimeSystem(this.val$timeSystem);
        }
    }

    /* synthetic */ i4(a1 a1Var) {
        this();
    }

    public static i4 getInstance() {
        return l4.INSTANCE;
    }

    private void initPlayerState(Context context) {
        if (BandMusicPlayerProvider.getMusicPlayerState() && com.crrepa.band.my.ble.band.utils.c.getInstance(context).isMusicActive()) {
            return;
        }
        closeMusicControl();
        setPlayerState((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isV1() {
        return this.bleConnection.getProtocolVersion() == CRPProtocolVersion.V1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$abortAIFetch$36() {
        this.bleConnection.abortAiAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$abortChat$35() {
        this.bleConnection.abortChat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$abortInstallApp$93() {
        this.bleConnection.abortInstallApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$abortSendLocalPhoto$89() {
        this.bleConnection.abortSendGallery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$abortSendLocalVideo$84() {
        this.bleConnection.abortSendLocalVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addWaterIntake$72(CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        this.bleConnection.addWaterIntake(cRPWaterIntakeInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelSendConnectKitFile$129() {
        this.bleConnection.abortSendConnectKitFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearLocalPhoto$90() {
        this.bleConnection.clearGallery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearStock$8() {
        this.bleConnection.clearStock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBond$2(byte[] bArr, CRPDeviceBondStateCallback cRPDeviceBondStateCallback) {
        this.bleConnection.createBond(bArr, cRPDeviceBondStateCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBond$3(byte[] bArr, boolean z7, int i8, CRPDeviceBondStateCallback cRPDeviceBondStateCallback) {
        this.bleConnection.createBond(bArr, z7, i8, cRPDeviceBondStateCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteLocalPhoto$88(List list) {
        this.bleConnection.deleteGalleryPhoto(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteLocalVideo$85(String str) {
        this.bleConnection.deleteLocalVideo(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteMusic$80(int i8) {
        this.bleConnection.deleteMusic(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteStock$10(byte b8) {
        this.bleConnection.deleteStock(b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteWaterIntake$74(CRPWaterIntakeInfo.WaterIntakeType waterIntakeType, int i8) {
        this.bleConnection.deleteWaterIntake(waterIntakeType, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$installApp$92(File file, CRPAppTransListener cRPAppTransListener) {
        this.bleConnection.installApp(file, cRPAppTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pingApp$125(CRPConnectKitMessage cRPConnectKitMessage) {
        this.bleConnection.pingApp(cRPConnectKitMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryAIFetchAgent$13() {
        this.bleConnection.querySupportAiAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryAISupportFeature$12() {
        this.bleConnection.querySupportAi(new com.crrepa.band.my.device.ai.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryAIWatchFaceLayout$47() {
        this.bleConnection.queryAiWatchFaceLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryAppAvailableSize$95() {
        this.bleConnection.queryAppAvailableSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryAppStoreInfo$96() {
        this.bleConnection.queryAppStoreInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryConnectKitAvailableStorage$126() {
        this.bleConnection.queryConnectKitAvailableStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryDeviceInfo$117(CRPDeviceInfoCallback cRPDeviceInfoCallback) {
        this.bleConnection.queryDeviceInfo(cRPDeviceInfoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryDrinkWaterGoals$66() {
        this.bleConnection.queryDrinkWaterGoals();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryDrinkWaterReminder$0() {
        this.bleConnection.queryDrinkWaterReminderPeriod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryHisiliconPhotoWatchFaceDisplayMode$107() {
        this.bleConnection.queryPhotoWatchFaceDisplayMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryHisiliconPhotoWatchFaceInfo$105() {
        this.bleConnection.queryPhotoWatchFaceInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryHisiliconWatchFaceElementInfo$112() {
        this.bleConnection.queryWatchFaceElementInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryHisiliconWatchFaceLayout$114(CRPWatchFaceType cRPWatchFaceType) {
        this.bleConnection.queryWatchFaceLayout(cRPWatchFaceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryHisiliconWatchFaceScreenInfo$103(CRPWatchFaceScreenCallback cRPWatchFaceScreenCallback) {
        this.bleConnection.queryWatchFaceScreenInfo(cRPWatchFaceScreenCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryHisiliconWatchFaceTimeStyle$108(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyleCallback cRPWatchFaceTimeStyleCallback) {
        this.bleConnection.queryWatchFaceTimeStyle(cRPWatchFaceType, cRPWatchFaceTimeStyleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryJieliAIPhotoWatchFace$49() {
        this.bleConnection.queryAiPhotoWatchFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryJieliPhotoWatchFace$119() {
        this.bleConnection.queryJieliPhotoWatchFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryJieliPhotoWatchFaceLayout$118() {
        this.bleConnection.queryJieliPhotoWatchFaceLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryJieliWatchFaceInfo$52(CRPJieliWatchFaceCallback cRPJieliWatchFaceCallback) {
        this.bleConnection.queryJieliWatchFaceInfo(cRPJieliWatchFaceCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryLocalPhotoInfo$86() {
        this.bleConnection.queryGalleryInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryLocalVideoInfo$82() {
        this.bleConnection.queryLocalVideoInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMessageLength$76() {
        this.bleConnection.queryMessageLength(new com.crrepa.band.my.ble.band.cmd.callback.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMusicAvailableSize$81() {
        this.bleConnection.queryMusicAvailableSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMusicName$79(int i8) {
        this.bleConnection.queryMusicName(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMusicSavedCount$78() {
        this.bleConnection.queryMusicSavedCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMuslimPrayerCalculationType$56() {
        this.bleConnection.queryMuslimPrayerCalculationType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMuslimPrayerCompensation$122(i1.b bVar) {
        this.bleConnection.queryMuslimPrayerCompensation(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMuslimPrayerNotification$55() {
        this.bleConnection.queryMuslimPrayerNotification();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMuslimSavedName$57() {
        this.bleConnection.queryMuslimSavedName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMuslimSavedPrayers$54() {
        this.bleConnection.queryMuslimSavedPrayers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryMuslimTasbihSetting$53(CRPMuslimTasbihSettingCallback cRPMuslimTasbihSettingCallback) {
        this.bleConnection.queryMuslimTasbihSetting(cRPMuslimTasbihSettingCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryNewDrinkWaterReminderPeriod$64() {
        this.bleConnection.queryNewDrinkWaterReminderPeriod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryPhotoWatchFaceAvailableSize$104() {
        this.bleConnection.queryPhotoWatchFaceAvailableSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$querySupportAppInfo$91() {
        this.bleConnection.querySupportAppInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$querySupportNavigation$133() {
        this.bleConnection.querySupportLocalNavigation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$querySupportStock$7() {
        this.bleConnection.querySupportStock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryTodayWaterIntake$68() {
        this.bleConnection.queryTodayWaterIntake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryTodayWaterIntakeHistory$70() {
        this.bleConnection.queryTodayWaterIntakeHistory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryVideoWatchFaceAvailableSize$97() {
        this.bleConnection.queryVideoWatchFaceAvailableSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryVideoWatchFaceDisplayMode$98() {
        this.bleConnection.queryVideoWatchFaceDisplayMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryVideoWatchFaceInfo$100() {
        this.bleConnection.queryVideoWatchFaceInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetHisiliconWatchFace$116(CRPWatchFaceType cRPWatchFaceType) {
        this.bleConnection.resetHisiliconWatchFace(cRPWatchFaceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetStockList$11(byte[] bArr) {
        this.bleConnection.resetStockList(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIFetchQuestion$20(byte b8, String str) {
        this.bleConnection.sendAiAgentQuestion(b8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIFetchResponse$22(byte b8, String str) {
        this.bleConnection.sendAiAgentResponse(b8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIFetchResponse$24(byte b8, String str, int i8, boolean z7) {
        this.bleConnection.sendAiAgentResponse(b8, str, i8, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIHealthAnalysis$37(CRPHealthSuggestionInfo cRPHealthSuggestionInfo) {
        this.bleConnection.sendHealthAnalysis(cRPHealthSuggestionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIWatchFace$46(CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendAiWatchFace(cRPWatchFaceBackgroundInfo, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIWatchFaceActivateRecording$40() {
        this.bleConnection.sendAiWatchFaceActivateRecording();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIWatchFaceDescribe$41(String str) {
        this.bleConnection.sendAiWatchFaceDescribe(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIWatchFaceError$39(CRPChatErrorCode cRPChatErrorCode) {
        this.bleConnection.sendAiWatchFaceError(cRPChatErrorCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIWatchFaceLayout$48(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        this.bleConnection.sendAiWatchFaceLayout(cRPWatchFaceLayoutInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAIWatchFacePreview$42(CRPWatchFaceLayoutInfo.CompressionType compressionType, Bitmap bitmap, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendAiWatchFacePreview(compressionType, bitmap, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendBondState$4(boolean z7) {
        this.bleConnection.sendBondState(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallContactName$5(String str) {
        int maxNameLength = new QuickContartConfigDaoProxy().getMaxNameLength();
        com.orhanobut.logger.f.d("sendCallContactName: " + str + ", length: " + maxNameLength);
        this.bleConnection.sendCallContactName(str, maxNameLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendChatActivateRecording$17() {
        this.bleConnection.sendChatActivateRecording();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendChatError$14(CRPChatErrorCode cRPChatErrorCode) {
        this.bleConnection.sendChatError(cRPChatErrorCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendChatQuestion$19(String str) {
        this.bleConnection.sendChatQuestion(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendChatResponse$21(String str) {
        this.bleConnection.sendChatResponse(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendChatResponse$23(String str, int i8, boolean z7) {
        this.bleConnection.sendChatResponse(str, i8, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendConnectKitFile$128(CRPConnectKitMessage cRPConnectKitMessage, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendConnectKitFile(cRPConnectKitMessage, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendConnectKitMessage$127(CRPConnectKitMessage cRPConnectKitMessage) {
        this.bleConnection.sendConnectKitMessage(cRPConnectKitMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCurrentBarometer$124(int i8) {
        this.bleConnection.sendCurrentBarometer(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendDrinkWaterGoals$67(int i8) {
        this.bleConnection.sendDrinkWaterGoals(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendDrinkWaterReminder$1(CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo) {
        this.bleConnection.sendDrinkWaterReminder(cRPDrinkWaterPeriodInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendFetchActivateRecording$18() {
        this.bleConnection.sendAiAgentActivateRecording();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendFetchError$15(CRPChatErrorCode cRPChatErrorCode) {
        this.bleConnection.sendAiAgentError(cRPChatErrorCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHealthSuggestion$38(CRPHealthSuggestionInfo cRPHealthSuggestionInfo) {
        this.bleConnection.sendHealthReport(cRPHealthSuggestionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconAIWatchFace$44(CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendHisiliconAiWatchFace(cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconAIWatchFacePreview$43(Bitmap bitmap, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendHisiliconAiWatchFacePreview(bitmap, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconChatError$16(String str) {
        this.bleConnection.sendHisiliconChatResponse(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconChatQuestion$25(String str) {
        this.bleConnection.sendHisiliconChatQuestion(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconChatResponse$26(String str) {
        this.bleConnection.sendHisiliconChatResponse(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconFixedPhotoWatchFace$111(int i8, Bitmap bitmap, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendFixedPhotoWatchFace(i8, bitmap, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconPhotoWatchFace$115(List list, Bitmap bitmap, CRPPhotoWatchFaceTransListener cRPPhotoWatchFaceTransListener) {
        this.bleConnection.sendPhotoWatchFace(list, bitmap, cRPPhotoWatchFaceTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconPhotoWatchFaceDisplayMode$109(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode) {
        this.bleConnection.sendPhotoWatchFaceDisplayMode(cRPPhotoWatchFaceDisplayMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconPhotoWatchFaceOrder$106(List list) {
        this.bleConnection.sendPhotoWatchFaceOrder(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconWatchFaceLayout$113(CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo) {
        this.bleConnection.sendWatchFaceLayout(cRPHisiliconWatchFaceLayoutInfo);
        z1.j.saveNewWatchFaceLayoutInfo(cRPHisiliconWatchFaceLayoutInfo);
        queryHisiliconWatchFaceLayout(cRPHisiliconWatchFaceLayoutInfo.getWatchFaceType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHisiliconWatchFaceTimeStyle$110(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
        this.bleConnection.sendWatchFaceTimeStyle(cRPWatchFaceType, cRPWatchFaceTimeStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendJieliAIWatchFace$51(CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendAiPhotoWatchFace(cRPPhotoWatchFaceInfo, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendJieliAIWatchFaceLayout$50(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        this.bleConnection.sendAiPhotoWatchFaceLayout(cRPJieliWatchFaceLayoutInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendJieliPhotoWatchFace$121(CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendJieliPhotoWatchFace(cRPPhotoWatchFaceInfo, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendJieliPhotoWatchFaceLayout$120(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        this.bleConnection.sendJieliPhotoWatchFaceLayout(cRPJieliWatchFaceLayoutInfo);
        com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveJieliWatchFaceLayoutInfo(cRPJieliWatchFaceLayoutInfo.getWatchFaceType(), cRPJieliWatchFaceLayoutInfo);
        queryJieliPhotoWatchFaceLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendLocalLocation$75(double d8, double d9) {
        this.bleConnection.sendLocalLocation(d8, d9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendLocalNavigationInfo$132(CRPLocalNavigationInfo cRPLocalNavigationInfo) {
        this.bleConnection.sendLocalNavigationInfo(cRPLocalNavigationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendLocalPhoto$87(List list, CRPGalleryTransListener cRPGalleryTransListener) {
        this.bleConnection.sendGallery(list, cRPGalleryTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendLocalVideo$83(File file, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendLocalVideo(file, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMuslimLocation$63(CRPMuslimLocationInfo cRPMuslimLocationInfo) {
        this.bleConnection.sendMuslimLocation(cRPMuslimLocationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMuslimNameState$62(boolean z7, List list) {
        this.bleConnection.sendMuslimNameState(z7, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMuslimPrayerCalculationType$61(CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo) {
        this.bleConnection.sendMuslimPrayerCalculationType(cRPMuslimPrayerCalculationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMuslimPrayerCompensation$123(byte[] bArr) {
        this.bleConnection.sendMuslimPrayerCompensation(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMuslimPrayerNotification$60(boolean z7, Map map) {
        this.bleConnection.sendMuslimPrayerNotification(z7, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMuslimPrayersState$59(boolean z7, List list) {
        this.bleConnection.sendMuslimPrayersState(z7, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMuslimTasbihSetting$58(CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo) {
        this.bleConnection.sendMuslimTasbihSetting(cRPMuslimTasbihSettingInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendNewDrinkWaterReminder$65(CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo) {
        this.bleConnection.sendNewDrinkWaterReminder(cRPNewDrinkWaterPeriodInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendOfflineVoiceCertification$77(byte[] bArr) {
        this.bleConnection.sendOfflineVoiceCertification(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPlayChatResponseComplete$29() {
        this.bleConnection.sendPlayChatResponseComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPlayChatResponseError$30() {
        this.bleConnection.sendPlayChatResponseError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPlayFetchResponseComplete$33() {
        this.bleConnection.sendPlayAiAgentResponseComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPlayFetchResponseError$34() {
        this.bleConnection.sendPlayAiAgentResponseError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendStock$9(CRPStockInfo cRPStockInfo, CRPStockPriceInfo cRPStockPriceInfo) {
        this.bleConnection.sendStock(cRPStockInfo);
        this.bleConnection.sendStockPrice(cRPStockPriceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendTodayWaterIntake$69(int i8) {
        this.bleConnection.sendTodayWaterIntake(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendTodayWaterIntakeHistory$71(List list) {
        this.bleConnection.sendTodayWaterIntakeHistory(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendVideoWatchFace$101(File file, Bitmap bitmap, Bitmap bitmap2, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendVideoWatchFace(file, bitmap, bitmap2, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendVideoWatchFaceDisplayMode$99(CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode) {
        this.bleConnection.sendVideoWatchFaceDisplayMode(cRPVideoWatchFaceDisplayMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendVideoWatchFaceThumbnail$102(String str, Bitmap bitmap, CRPFileTransListener cRPFileTransListener) {
        this.bleConnection.sendVideoWatchFaceThumbnail(str, bitmap, cRPFileTransListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendWorldClockList$6() {
        List<WorldClock> all = new WorldClockDaoProxy().getAll();
        for (int i8 = 0; i8 < all.size(); i8++) {
            sendWorldClock(WorldClockConvert.convertCRPWorldClock(all.get(i8)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHisiliconAIWatchFace$45(Bitmap bitmap, Bitmap bitmap2) {
        this.bleConnection.setHisiliconAiWatchFace(bitmap, bitmap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startNavigation$130(boolean z7) {
        this.bleConnection.startLocalNavigation(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPlayChatResponse$27() {
        this.bleConnection.startPlayChatResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPlayFetchResponse$31() {
        this.bleConnection.startPlayAiAgentResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopNavigation$131(boolean z7) {
        this.bleConnection.stopLocalNavigation(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopPlayChatResponse$28() {
        this.bleConnection.stopPlayChatResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopPlayFetchResponse$32() {
        this.bleConnection.stopPlayAiAgentResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uninstallApp$94(String str) {
        this.bleConnection.uninstallApp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWaterIntake$73(CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        this.bleConnection.updateWaterIntake(cRPWaterIntakeInfo);
    }

    private void queryAvailableStorage() {
        if (BandStorageProvider.hasAvailableStorage()) {
            return;
        }
        queryAvailableStorage(new com.crrepa.band.my.ble.band.cmd.callback.a());
    }

    private void queryGoalsSetting() {
        queryGoalSteps(new com.crrepa.band.my.ble.band.cmd.callback.f());
        queryDailyGoals(new com.crrepa.band.my.ble.band.cmd.callback.c());
    }

    private void queryQuickContactConfig() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new m3());
    }

    private boolean queryTimingBloodOxygenState() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new a4());
    }

    private boolean queryTimingTempState() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new c3());
    }

    private void sendLocalOtherMessageState() {
        MessagePush messagePush = new BandMessageDaoProxy().get();
        sendOtherMessageState((messagePush == null || messagePush.getOthersEnable() == null) ? false : messagePush.getOthersEnable().booleanValue());
    }

    private void sendVolume(Context context) {
        com.crrepa.band.my.ble.band.utils.c cVar = com.crrepa.band.my.ble.band.utils.c.getInstance(context);
        int maxVolume = cVar.getMaxVolume();
        int currentVolume = cVar.getCurrentVolume();
        sendMaxVolume(maxVolume);
        sendCurrentVolume(currentVolume);
    }

    public void abortAIFetch() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.p
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$abortAIFetch$36();
            }
        });
    }

    public void abortChat() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.r2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$abortChat$35();
            }
        });
    }

    public void abortInstallApp() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.e2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$abortInstallApp$93();
            }
        });
    }

    public void abortSendLocalPhoto() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.m
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$abortSendLocalPhoto$89();
            }
        });
    }

    public void abortSendLocalVideo() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.m2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$abortSendLocalVideo$84();
            }
        });
    }

    public boolean abortUpgrade() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new v1());
    }

    public void abortWatchFace() {
        this.bleConnection.abortWatchFace();
    }

    public void abortWatchFaceBackground() {
        this.bleConnection.abortWatchFaceBackground();
    }

    public void addWaterIntake(final CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.z2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$addWaterIntake$72(cRPWaterIntakeInfo);
            }
        });
    }

    public void cancelSendConnectKitFile() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.k2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$cancelSendConnectKitFile$129();
            }
        });
    }

    public void cancelTimer() {
        this.firmwareVersionCallback.cancelTimer();
        this.batteryListener.cancelTimer();
    }

    public boolean checkFirmwareVersion(String str, int i8) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return com.crrepa.band.my.ble.band.cmd.a.execute(new g0(str, i8));
    }

    public boolean clearCalendarEvent() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new m());
    }

    public boolean clearContact() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new p3());
    }

    public void clearLocalPhoto() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.e3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$clearLocalPhoto$90();
            }
        });
    }

    public boolean clearPillReminder() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new e4());
    }

    public void clearStock() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.x3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$clearStock$8();
            }
        });
    }

    public boolean closeMusicControl() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new y3());
    }

    public boolean createBond(final byte[] bArr, final CRPDeviceBondStateCallback cRPDeviceBondStateCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.a4
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$createBond$2(bArr, cRPDeviceBondStateCallback);
            }
        });
    }

    public boolean deleteCalendarEvent(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new h(i8));
    }

    public boolean deleteContact(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new q3(i8));
    }

    public boolean deleteDownloadWatchFace(int i8, CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback) {
        com.orhanobut.logger.f.d("deleteDownloadWatchFace: " + i8);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new m2(i8, cRPWatchFaceDeleteCallback));
    }

    public boolean deleteECard(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new b(i8));
    }

    public boolean deleteJieliDownloadWatchFace(int[] iArr, CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback) {
        if (iArr == null || iArr.length < 1) {
            return false;
        }
        com.orhanobut.logger.f.d("deleteJieliDownloadWatchFace: " + Arrays.toString(iArr));
        return com.crrepa.band.my.ble.band.cmd.a.execute(new n2(iArr, cRPWatchFaceDeleteCallback));
    }

    public void deleteLocalPhoto(final List<String> list) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.f0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$deleteLocalPhoto$88(list);
            }
        });
    }

    public void deleteLocalVideo(final String str) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.g3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$deleteLocalVideo$85(str);
            }
        });
    }

    public void deleteMusic(final int i8) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.s1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$deleteMusic$80(i8);
            }
        });
    }

    public boolean deleteNewAlarm(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new h1(i8));
    }

    public boolean deletePillReminder(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new d4(i8));
    }

    public void deleteStock(final byte b8) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.w1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$deleteStock$10(b8);
            }
        });
    }

    public void deleteWaterIntake(final CRPWaterIntakeInfo.WaterIntakeType waterIntakeType, final int i8) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.m3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$deleteWaterIntake$74(waterIntakeType, i8);
            }
        });
    }

    public boolean deleteWorldClock(byte b8) {
        com.orhanobut.logger.f.d("deleteWorldClock: " + ((int) b8));
        return com.crrepa.band.my.ble.band.cmd.a.execute(new l0(b8));
    }

    public boolean disableQuickResponses() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new q());
    }

    public boolean enableHsDfu() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new p2());
    }

    public boolean enableQuickResponses() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new p());
    }

    public boolean enableSos(boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new s0(z7));
    }

    public boolean enableTimingBloodOxygen(boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new b4(z7));
    }

    public boolean enterCameraView() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new s1());
    }

    public boolean exitCameraView() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new t1());
    }

    public boolean findBand() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new v0());
    }

    public void init(Context context) {
        if (this.bleConnection == null) {
            return;
        }
        sendUserInfo();
        queryBtAddress(new com.crrepa.band.my.ble.band.cmd.callback.b());
        queryTestModeState(new com.crrepa.band.my.ble.band.cmd.callback.p());
        sendBandTimeSystem((byte) BandTimeSystemProvider.getTimeSystem(context));
        queryWatchFaceLayout(new com.crrepa.band.my.ble.band.cmd.callback.s());
        queryMessageLength();
        queryTimingHeartRateState();
        queryTimingTempState();
        queryTimingBloodOxygenState();
        queryBandLanguage();
        queryBandSupportFunction(this.supportFunctionCallback);
        queryPhysiologcalPeriod(this.physiologcalPeriodCallback);
        sendLocalOtherMessageState();
        queryHeartRateWarning();
        queryDisplayTime();
        queryHandWashing();
        queryTempSystem();
        queryQuickContactConfig();
        subscribeBandBattery();
        sendVolume(context);
        queryGoalsSetting();
        queryBatterySaving();
        initPlayerState(context);
        sendWeatherInfo(context);
        queryPillReminder(new com.crrepa.band.my.device.pillreminder.d());
        queryTapToWakeState(new com.crrepa.band.my.ble.band.cmd.callback.o());
        queryA2DPConnectState();
        queryECardCount();
        querySupportCalendarEvent();
        queryNotificationList(new com.crrepa.band.my.ble.band.cmd.callback.l());
        queryAvailableStorage();
        querySupportWorldClock();
        querySupportCustomTrainingList();
        querySupportCustomGameList();
        querySupportCustomFeatureList();
        querySupportStock();
        queryMusicAvailableSize();
        queryMusicSavedCount();
        queryLocalVideoInfo();
        queryLocalPhotoInfo();
        queryAppAvailableSize();
        querySupportAppInfo();
        queryAISupportFeature();
        queryAIFetchAgent();
        new com.crrepa.band.my.device.cricket.notify.c().sendTodayGameReminder();
        com.crrepa.band.my.device.muslim.utils.b.getInstance().querySyncMuslimData(context, this.callback);
        com.crrepa.band.my.health.water.util.a.getInstance().querySupportDrinkWater();
        querySosState(new com.crrepa.band.my.ble.band.cmd.callback.n());
        queryHisiliconWatchFaceScreenInfo(new b.a());
        queryPhotoWatchFaceAvailableSize();
        queryVideoWatchFaceAvailableSize();
        querySupportNavigation();
    }

    public void installApp(final File file, final CRPAppTransListener cRPAppTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.e0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$installApp$92(file, cRPAppTransListener);
            }
        });
    }

    public void pingApp(final CRPConnectKitMessage cRPConnectKitMessage) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.u2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$pingApp$125(cRPConnectKitMessage);
            }
        });
    }

    public boolean queryA2DPConnectState() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new a1());
    }

    public void queryAIFetchAgent() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.r
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryAIFetchAgent$13();
            }
        });
    }

    public void queryAISupportFeature() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.n3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryAISupportFeature$12();
            }
        });
    }

    public void queryAIWatchFaceLayout() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.b3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryAIWatchFaceLayout$47();
            }
        });
    }

    public boolean queryAllAlarm(CRPAlarmCallback cRPAlarmCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new d1(cRPAlarmCallback));
    }

    public boolean queryAllNewAlarm(CRPAlarmCallback cRPAlarmCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new f1(cRPAlarmCallback));
    }

    public void queryAppAvailableSize() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.l1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryAppAvailableSize$95();
            }
        });
    }

    public void queryAppStoreInfo() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.o
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryAppStoreInfo$96();
            }
        });
    }

    public boolean queryBandBattery() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new r0());
    }

    public boolean queryBandDfuStatus(CRPDeviceDfuStatusCallback cRPDeviceDfuStatusCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new i2(cRPDeviceDfuStatusCallback));
    }

    public boolean queryBandDisplayFunction(CRPDeviceFunctionCallback cRPDeviceFunctionCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new i1(cRPDeviceFunctionCallback));
    }

    public boolean queryBandFirmwareVersion() {
        if (this.firmwareVersionCallback.isQueryFirmwareVersion()) {
            return com.crrepa.band.my.ble.band.cmd.a.execute(new k());
        }
        com.orhanobut.logger.f.e("BandFirmwareVersionCallback not callback", new Object[0]);
        return false;
    }

    public boolean queryBandLanguage() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new x1());
    }

    public boolean queryBandSupportFunction(CRPDeviceFunctionCallback cRPDeviceFunctionCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j1(cRPDeviceFunctionCallback));
    }

    public boolean queryBandSupportWatchFace(CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback) {
        com.orhanobut.logger.f.d("queryBandSupportWatchFace");
        return com.crrepa.band.my.ble.band.cmd.a.execute(new k2(cRPDeviceSupportWatchFaceCallback));
    }

    public boolean queryBandTimeSystem(CRPDeviceTimeSystemCallback cRPDeviceTimeSystemCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new k4(cRPDeviceTimeSystemCallback));
    }

    public boolean queryBandWatchFaceIndex(CRPDeviceDisplayWatchFaceCallback cRPDeviceDisplayWatchFaceCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new p1(cRPDeviceDisplayWatchFaceCallback));
    }

    public boolean queryBatterySaving() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new x3());
    }

    public boolean queryBluetrumWatchFaceInfo(CRPBluetrumWatchFaceCallback cRPBluetrumWatchFaceCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new p0(cRPBluetrumWatchFaceCallback));
    }

    public boolean queryBtAddress(CRPBtAddressCallback cRPBtAddressCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new l3(cRPBtAddressCallback));
    }

    public boolean queryCalendarEvent(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new f(i8));
    }

    public boolean queryCalendarEventReminderTime() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new l());
    }

    public void queryConnectKitAvailableStorage() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.r0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryConnectKitAvailableStorage$126();
            }
        });
    }

    public boolean queryContactCount(CRPContactCountCallback cRPContactCountCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new n3(cRPContactCountCallback));
    }

    public boolean queryContactNumberSymbol(CRPContactNumberSymbolCallback cRPContactNumberSymbolCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new C0152i4(cRPContactNumberSymbolCallback));
    }

    public boolean queryDailyGoals(CRPDailyGoalsCallback cRPDailyGoalsCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new t(cRPDailyGoalsCallback));
    }

    public void queryDeviceInfo(final CRPDeviceInfoCallback cRPDeviceInfoCallback) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.a0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryDeviceInfo$117(cRPDeviceInfoCallback);
            }
        });
    }

    public void queryDisplayTime() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new x2());
    }

    public boolean queryDoNotDistrubTime(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new a2(cRPDevicePeriodTimeCallback));
    }

    public void queryDrinkWaterGoals() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.l2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryDrinkWaterGoals$66();
            }
        });
    }

    public void queryDrinkWaterReminder() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.e1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryDrinkWaterReminder$0();
            }
        });
    }

    public boolean queryECard(int i8, CRPElectronicCardCallback cRPElectronicCardCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new c(i8, cRPElectronicCardCallback));
    }

    public boolean queryECardCount() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j4());
    }

    public boolean queryGoalSteps(com.crrepa.band.my.ble.band.cmd.callback.f fVar) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new d3(fVar));
    }

    public void queryHandWashing() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new z2());
    }

    public void queryHeartRateWarning() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new v2());
    }

    public void queryHisiliconPhotoWatchFaceDisplayMode() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.p1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryHisiliconPhotoWatchFaceDisplayMode$107();
            }
        });
    }

    public void queryHisiliconPhotoWatchFaceInfo() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.a3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryHisiliconPhotoWatchFaceInfo$105();
            }
        });
    }

    public void queryHisiliconWatchFaceElementInfo() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.k
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryHisiliconWatchFaceElementInfo$112();
            }
        });
    }

    public void queryHisiliconWatchFaceLayout(final CRPWatchFaceType cRPWatchFaceType) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.z3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryHisiliconWatchFaceLayout$114(cRPWatchFaceType);
            }
        });
    }

    public void queryHisiliconWatchFaceScreenInfo(final CRPWatchFaceScreenCallback cRPWatchFaceScreenCallback) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.e
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryHisiliconWatchFaceScreenInfo$103(cRPWatchFaceScreenCallback);
            }
        });
    }

    public void queryHisiliconWatchFaceTimeStyle(final CRPWatchFaceType cRPWatchFaceType, final CRPWatchFaceTimeStyleCallback cRPWatchFaceTimeStyleCallback) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.r1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryHisiliconWatchFaceTimeStyle$108(cRPWatchFaceType, cRPWatchFaceTimeStyleCallback);
            }
        });
    }

    public boolean queryHsDfuAddress(CRPDeviceDfuAddressCallback cRPDeviceDfuAddressCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new o2(cRPDeviceDfuAddressCallback));
    }

    public void queryJieliAIPhotoWatchFace() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.t2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryJieliAIPhotoWatchFace$49();
            }
        });
    }

    public void queryJieliPhotoWatchFace() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.l0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryJieliPhotoWatchFace$119();
            }
        });
    }

    public void queryJieliPhotoWatchFaceLayout() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.h2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryJieliPhotoWatchFaceLayout$118();
            }
        });
    }

    public boolean queryJieliWatchFaceInfo(final CRPJieliWatchFaceCallback cRPJieliWatchFaceCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.a1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryJieliWatchFaceInfo$52(cRPJieliWatchFaceCallback);
            }
        });
    }

    public void queryLocalPhotoInfo() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.y1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryLocalPhotoInfo$86();
            }
        });
    }

    public void queryLocalVideoInfo() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.c0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryLocalVideoInfo$82();
            }
        });
    }

    public void queryMessageLength() {
        if (BandMessageLengthProvider.hasMessageLength()) {
            return;
        }
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.k3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMessageLength$76();
            }
        });
    }

    public void queryMusicAvailableSize() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.w3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMusicAvailableSize$81();
            }
        });
    }

    public void queryMusicName(final int i8) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.b2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMusicName$79(i8);
            }
        });
    }

    public void queryMusicSavedCount() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.c3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMusicSavedCount$78();
            }
        });
    }

    public void queryMuslimPrayerCalculationType() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.o0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMuslimPrayerCalculationType$56();
            }
        });
    }

    public void queryMuslimPrayerCompensation(final i1.b bVar) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.u
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMuslimPrayerCompensation$122(bVar);
            }
        });
    }

    public void queryMuslimPrayerNotification() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.v2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMuslimPrayerNotification$55();
            }
        });
    }

    public void queryMuslimSavedName() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.b1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMuslimSavedName$57();
            }
        });
    }

    public void queryMuslimSavedPrayers() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.v0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMuslimSavedPrayers$54();
            }
        });
    }

    public void queryMuslimTasbihSetting(final CRPMuslimTasbihSettingCallback cRPMuslimTasbihSettingCallback) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.q0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryMuslimTasbihSetting$53(cRPMuslimTasbihSettingCallback);
            }
        });
    }

    public void queryNewDrinkWaterReminderPeriod() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.m0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryNewDrinkWaterReminderPeriod$64();
            }
        });
    }

    public boolean queryNotificationList(CRPMessageListCallback cRPMessageListCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new z(cRPMessageListCallback));
    }

    public void queryPhotoWatchFaceAvailableSize() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.z
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryPhotoWatchFaceAvailableSize$104();
            }
        });
    }

    public boolean queryPhysiologcalPeriod(CRPDevicePhysiologcalPeriodCallback cRPDevicePhysiologcalPeriodCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new r2(cRPDevicePhysiologcalPeriodCallback));
    }

    public boolean queryPillReminder(CRPPillReminderCallback cRPPillReminderCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new f4(cRPPillReminderCallback));
    }

    public boolean queryQuickResponses(byte b8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new r(b8));
    }

    public boolean queryQuickResponsesCount() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new o());
    }

    public boolean queryQuickView(CRPDeviceQuickViewCallback cRPDeviceQuickViewCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new z0(cRPDeviceQuickViewCallback));
    }

    public boolean queryQuickViewTime(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new c2(cRPDevicePeriodTimeCallback));
    }

    public boolean queryReminderToMove(CRPDeviceSedentaryReminderCallback cRPDeviceSedentaryReminderCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new x0(cRPDeviceSedentaryReminderCallback));
    }

    public boolean querySosState(CRPSosStateCallback cRPSosStateCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new t0(cRPSosStateCallback));
    }

    public void querySupportAppInfo() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.i
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$querySupportAppInfo$91();
            }
        });
    }

    public boolean querySupportCalendarEvent() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new i());
    }

    public boolean querySupportCustomFeatureList() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new e0());
    }

    public boolean querySupportCustomGameList() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new f0());
    }

    public boolean querySupportCustomTrainingList() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new d0());
    }

    public void querySupportNavigation() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.i2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$querySupportNavigation$133();
            }
        });
    }

    public void querySupportStock() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.z0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$querySupportStock$7();
            }
        });
    }

    public boolean querySupportWorldClock() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j0());
    }

    public boolean queryTapToWakeState(CRPTapToWakeCallback cRPTapToWakeCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new h4(cRPTapToWakeCallback));
    }

    public boolean queryTempSystem() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new h3());
    }

    public boolean queryTestModeState(CRPDeviceTestModeCallback cRPDeviceTestModeCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new n0(cRPDeviceTestModeCallback));
    }

    public boolean queryTimingHeartRateState() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new d2());
    }

    public boolean queryTimingStressState() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new b0());
    }

    public void queryTodayWaterIntake() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.h0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryTodayWaterIntake$68();
            }
        });
    }

    public void queryTodayWaterIntakeHistory() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.p3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryTodayWaterIntakeHistory$70();
            }
        });
    }

    public boolean queryTrainingDayGoals(CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new u(cRPTrainingDayGoalsCallback));
    }

    public void queryVideoWatchFaceAvailableSize() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.i0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryVideoWatchFaceAvailableSize$97();
            }
        });
    }

    public void queryVideoWatchFaceDisplayMode() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.b4
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryVideoWatchFaceDisplayMode$98();
            }
        });
    }

    public void queryVideoWatchFaceInfo() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.n2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$queryVideoWatchFaceInfo$100();
            }
        });
    }

    public boolean queryWatchFaceLayout(CRPDeviceWatchFaceLayoutCallback cRPDeviceWatchFaceLayoutCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new g2(cRPDeviceWatchFaceLayoutCallback));
    }

    public boolean queryWorldClock(byte b8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new i0(b8));
    }

    public void removeBond(CRPRemoveBondCallback cRPRemoveBondCallback) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new v(cRPRemoveBondCallback));
    }

    public void reset() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new t3());
    }

    public void resetHisiliconWatchFace(final CRPWatchFaceType cRPWatchFaceType) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.g0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$resetHisiliconWatchFace$116(cRPWatchFaceType);
            }
        });
    }

    public void resetStockList(final byte[] bArr) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.e4
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$resetStockList$11(bArr);
            }
        });
    }

    public void resetSubscribe() {
        this.firmwareVersionCallback.setQueryFirmwareVersion(true);
        this.batteryListener.setSubscribeBattery(true);
    }

    public boolean resetWorldClockList(byte[] bArr) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new m0(bArr));
    }

    public boolean sendA2DPConnectState(CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new l1(a2DPConnectState));
    }

    public void sendAIFetchQuestion(final byte b8, final String str) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.g1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIFetchQuestion$20(b8, str);
            }
        });
    }

    public void sendAIFetchResponse(final byte b8, String str) {
        final String replace = str.replace("#", "").replace("*", "");
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.f3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIFetchResponse$22(b8, replace);
            }
        });
    }

    public void sendAIHealthAnalysis(final CRPHealthSuggestionInfo cRPHealthSuggestionInfo) {
        Log.d("sendAIHealthAnalysis", "info: " + cRPHealthSuggestionInfo);
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.t0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIHealthAnalysis$37(cRPHealthSuggestionInfo);
            }
        });
    }

    public void sendAIWatchFace(final CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.w0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIWatchFace$46(cRPWatchFaceBackgroundInfo, cRPFileTransListener);
            }
        });
    }

    public void sendAIWatchFaceActivateRecording() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.r3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIWatchFaceActivateRecording$40();
            }
        });
    }

    public void sendAIWatchFaceDescribe(final String str) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.f4
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIWatchFaceDescribe$41(str);
            }
        });
    }

    public void sendAIWatchFaceError(final CRPChatErrorCode cRPChatErrorCode) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.d4
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIWatchFaceError$39(cRPChatErrorCode);
            }
        });
    }

    public void sendAIWatchFaceLayout(final CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.d0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIWatchFaceLayout$48(cRPWatchFaceLayoutInfo);
            }
        });
    }

    public void sendAIWatchFacePreview(final CRPWatchFaceLayoutInfo.CompressionType compressionType, final Bitmap bitmap, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.z1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIWatchFacePreview$42(compressionType, bitmap, cRPFileTransListener);
            }
        });
    }

    public boolean sendAlarm(CRPAlarmInfo cRPAlarmInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new e1(cRPAlarmInfo));
    }

    public boolean sendBandDisplayLanguage(byte b8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new y1(b8));
    }

    public boolean sendBandFunction(CRPFunctionInfo cRPFunctionInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new k1(cRPFunctionInfo));
    }

    public void sendBandLanguage() {
        if (this.bleConnection == null) {
            return;
        }
        sendBandDisplayLanguage(BandDisplayLanguageProvider.getDisplayLanguage());
    }

    public boolean sendBandTimeSystem(byte b8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new z3(b8));
    }

    public boolean sendBandWatchFaceBackground(CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo, CRPFileTransListener cRPFileTransListener) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new e2(cRPWatchFaceBackgroundInfo, cRPFileTransListener));
    }

    public boolean sendBandWatchFaceIndex(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new q1(i8));
    }

    public boolean sendBatterySaving(boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new w3(z7));
    }

    public boolean sendBondState(final boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.u3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendBondState$4(z7);
            }
        });
    }

    public boolean sendBoundVibration() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new f3());
    }

    public boolean sendCalendarEvent(CRPCalendarEventInfo cRPCalendarEventInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new g(cRPCalendarEventInfo));
    }

    public boolean sendCalendarEventReminderTime(boolean z7, int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j(z7, i8));
    }

    public boolean sendCallContactName(final String str) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.j2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendCallContactName$5(str);
            }
        });
    }

    public boolean sendCallOffHook() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new o1());
    }

    public void sendChatActivateRecording() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.y0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendChatActivateRecording$17();
            }
        });
    }

    public void sendChatError(final CRPChatErrorCode cRPChatErrorCode) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.j
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendChatError$14(cRPChatErrorCode);
            }
        });
    }

    public void sendChatQuestion(final String str) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.w
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendChatQuestion$19(str);
            }
        });
    }

    public void sendChatResponse(String str) {
        final String replace = str.replace("#", "").replace("*", "");
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.d1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendChatResponse$21(replace);
            }
        });
    }

    public void sendConnectKitFile(final CRPConnectKitMessage cRPConnectKitMessage, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.x1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendConnectKitFile$128(cRPConnectKitMessage, cRPFileTransListener);
            }
        });
    }

    public void sendConnectKitMessage(final CRPConnectKitMessage cRPConnectKitMessage) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.j1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendConnectKitMessage$127(cRPConnectKitMessage);
            }
        });
    }

    public boolean sendContact(CRPContactInfo cRPContactInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new r3(cRPContactInfo));
    }

    public boolean sendContactAvatar(int i8, Bitmap bitmap, int i9, CRPFileTransListener cRPFileTransListener) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new s3(i8, bitmap, i9, cRPFileTransListener));
    }

    public void sendCurrentBarometer(final int i8) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.g2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendCurrentBarometer$124(i8);
            }
        });
    }

    public boolean sendCurrentTime() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new w1());
    }

    public void sendCurrentVolume(int i8) {
        com.orhanobut.logger.f.d("Current Volume: " + i8);
        com.crrepa.band.my.ble.band.cmd.a.execute(new u3(i8));
    }

    public boolean sendCustomKey(CRPCustomKeyInfo cRPCustomKeyInfo) {
        com.orhanobut.logger.f.d("sendCustomKey: " + cRPCustomKeyInfo);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new h0(cRPCustomKeyInfo));
    }

    public boolean sendDailyGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new x(cRPDailyGoalsInfo));
    }

    public void sendDisplayTime(int i8) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new y2(i8));
    }

    public boolean sendDoNotDistrubTime(BandPeriodTimeModel bandPeriodTimeModel) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new z1(bandPeriodTimeModel));
    }

    public void sendDrinkWaterGoals(final int i8) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.t1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendDrinkWaterGoals$67(i8);
            }
        });
    }

    public void sendDrinkWaterReminder(final CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.x0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendDrinkWaterReminder$1(cRPDrinkWaterPeriodInfo);
            }
        });
    }

    public boolean sendECard(CRPElectronicCardInfo cRPElectronicCardInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new a(cRPElectronicCardInfo));
    }

    public boolean sendECardList(List<Integer> list) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new d(list));
    }

    public boolean sendEpoFile(File file, CRPEpoType cRPEpoType, CRPHisiliconEpoInfo cRPHisiliconEpoInfo, CRPFileTransListener cRPFileTransListener) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new a0(cRPEpoType, file, cRPHisiliconEpoInfo, cRPFileTransListener));
    }

    public void sendFetchActivateRecording() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.y
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendFetchActivateRecording$18();
            }
        });
    }

    public void sendFetchError(final CRPChatErrorCode cRPChatErrorCode) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.j0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendFetchError$15(cRPChatErrorCode);
            }
        });
    }

    public boolean sendFutureWeather(CRPFutureWeatherInfo cRPFutureWeatherInfo) {
        com.orhanobut.logger.f.d("sendFutureWeatherInfo: " + com.moyoung.dafit.module.common.utils.s.bean2Json(cRPFutureWeatherInfo));
        return com.crrepa.band.my.ble.band.cmd.a.execute(new c1(cRPFutureWeatherInfo));
    }

    public boolean sendGSensorCalibration() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new r1());
    }

    public boolean sendGoalSteps(int i8) {
        com.orhanobut.logger.f.d("sendGoalSteps: " + i8);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new s2(i8));
    }

    public void sendHandWashingReminder(CRPHandWashingPeriodInfo cRPHandWashingPeriodInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new a3(cRPHandWashingPeriodInfo));
    }

    public void sendHealthSuggestion(final CRPHealthSuggestionInfo cRPHealthSuggestionInfo) {
        Log.d("sendHealthSuggestion", "info: " + cRPHealthSuggestionInfo);
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.t
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHealthSuggestion$38(cRPHealthSuggestionInfo);
            }
        });
    }

    public void sendHeartRateWarning(byte b8, boolean z7) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new w2(b8, z7));
    }

    public void sendHisiliconAIWatchFace(final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.f1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconAIWatchFace$44(cRPFileTransListener);
            }
        });
    }

    public void sendHisiliconAIWatchFacePreview(final Bitmap bitmap, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.n
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconAIWatchFacePreview$43(bitmap, cRPFileTransListener);
            }
        });
    }

    public void sendHisiliconChatError(HisiliconErrorCode hisiliconErrorCode) {
        final String errorStr = HisiliconErrorCode.getErrorStr(hisiliconErrorCode);
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.n1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconChatError$16(errorStr);
            }
        });
    }

    public void sendHisiliconChatQuestion(final String str) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.b0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconChatQuestion$25(str);
            }
        });
    }

    public void sendHisiliconChatResponse(String str) {
        final String replace = str.replace("#", "").replace("*", "");
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.o2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconChatResponse$26(replace);
            }
        });
    }

    public void sendHisiliconFixedPhotoWatchFace(final int i8, final Bitmap bitmap, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.d2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconFixedPhotoWatchFace$111(i8, bitmap, cRPFileTransListener);
            }
        });
    }

    public void sendHisiliconPhotoWatchFace(final List<File> list, final Bitmap bitmap, final CRPPhotoWatchFaceTransListener cRPPhotoWatchFaceTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.l
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconPhotoWatchFace$115(list, bitmap, cRPPhotoWatchFaceTransListener);
            }
        });
    }

    public void sendHisiliconPhotoWatchFaceDisplayMode(final CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.s2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconPhotoWatchFaceDisplayMode$109(cRPPhotoWatchFaceDisplayMode);
            }
        });
    }

    public void sendHisiliconPhotoWatchFaceOrder(final List<String> list) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.d3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconPhotoWatchFaceOrder$106(list);
            }
        });
    }

    public void sendHisiliconWatchFaceLayout(final CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.u0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconWatchFaceLayout$113(cRPHisiliconWatchFaceLayoutInfo);
            }
        });
    }

    public void sendHisiliconWatchFaceTimeStyle(final CRPWatchFaceType cRPWatchFaceType, final CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.n0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendHisiliconWatchFaceTimeStyle$110(cRPWatchFaceType, cRPWatchFaceTimeStyle);
            }
        });
    }

    public void sendJieliAIWatchFace(final CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.h3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendJieliAIWatchFace$51(cRPPhotoWatchFaceInfo, cRPFileTransListener);
            }
        });
    }

    public void sendJieliAIWatchFaceLayout(final CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.h1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendJieliAIWatchFaceLayout$50(cRPJieliWatchFaceLayoutInfo);
            }
        });
    }

    public void sendJieliPhotoWatchFace(final CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.x
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendJieliPhotoWatchFace$121(cRPPhotoWatchFaceInfo, cRPFileTransListener);
            }
        });
    }

    public void sendJieliPhotoWatchFaceLayout(final CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.h
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendJieliPhotoWatchFaceLayout$120(cRPJieliWatchFaceLayoutInfo);
            }
        });
    }

    public boolean sendLocalCity(String str) {
        com.orhanobut.logger.f.d("sendLocalCity: " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return com.crrepa.band.my.ble.band.cmd.a.execute(new b3(str));
    }

    public boolean sendLocalLocation(final double d8, final double d9) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.p0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendLocalLocation$75(d8, d9);
            }
        });
    }

    public void sendLocalNavigationInfo(final CRPLocalNavigationInfo cRPLocalNavigationInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.s0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendLocalNavigationInfo$132(cRPLocalNavigationInfo);
            }
        });
    }

    public void sendLocalPhoto(final List<File> list, final CRPGalleryTransListener cRPGalleryTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.v
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendLocalPhoto$87(list, cRPGalleryTransListener);
            }
        });
    }

    public void sendLocalVideo(final File file, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.i3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendLocalVideo$83(file, cRPFileTransListener);
            }
        });
    }

    public boolean sendLyrics(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        com.orhanobut.logger.f.d("lyrics: " + str);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new k3(str));
    }

    public void sendMaxVolume(int i8) {
        com.orhanobut.logger.f.d("Max Volume: " + i8);
        com.crrepa.band.my.ble.band.cmd.a.execute(new v3(i8));
    }

    public boolean sendMessage(String str, int i8) {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || TextUtils.isEmpty(str) || this.bleConnection == null) {
            return false;
        }
        int firmwareVersionCode = connectBand.getFirmwareVersionCode();
        boolean isHsMcu = connectBand.isHsMcu();
        boolean isRectangleScreen = connectBand.isRectangleScreen();
        CRPMessageInfo cRPMessageInfo = new CRPMessageInfo();
        cRPMessageInfo.setMessage(str);
        cRPMessageInfo.setType(i8);
        cRPMessageInfo.setVersionCode(firmwareVersionCode);
        cRPMessageInfo.setHs(isHsMcu);
        cRPMessageInfo.setSmallScreen(isRectangleScreen);
        cRPMessageInfo.setMaxByteLength(BandMessageLengthProvider.getMessageLength());
        com.orhanobut.logger.f.d("sendMessage: " + cRPMessageInfo);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new n1(cRPMessageInfo));
    }

    public void sendMuslimLocation(final CRPMuslimLocationInfo cRPMuslimLocationInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.q2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendMuslimLocation$63(cRPMuslimLocationInfo);
            }
        });
    }

    public void sendMuslimNameState(final boolean z7, final List<Integer> list) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.p2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendMuslimNameState$62(z7, list);
            }
        });
    }

    public void sendMuslimPrayerCalculationType(final CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.v3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendMuslimPrayerCalculationType$61(cRPMuslimPrayerCalculationInfo);
            }
        });
    }

    public void sendMuslimPrayerCompensation(final byte[] bArr) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.i1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendMuslimPrayerCompensation$123(bArr);
            }
        });
    }

    public void sendMuslimPrayerNotification(final boolean z7, final Map<CRPMuslimPrayerNotifcationType, Boolean> map) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.g4
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendMuslimPrayerNotification$60(z7, map);
            }
        });
    }

    public void sendMuslimPrayersState(final boolean z7, final List<Integer> list) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.q1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendMuslimPrayersState$59(z7, list);
            }
        });
    }

    public void sendMuslimTasbihSetting(final CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.k0
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendMuslimTasbihSetting$58(cRPMuslimTasbihSettingInfo);
            }
        });
    }

    public boolean sendNewAlarm(CRPAlarmInfo cRPAlarmInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new g1(cRPAlarmInfo));
    }

    public void sendNewDrinkWaterReminder(final CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.l3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendNewDrinkWaterReminder$65(cRPNewDrinkWaterPeriodInfo);
            }
        });
    }

    public boolean sendNewWatchFace(CRPWatchFaceInfo cRPWatchFaceInfo, CRPWatchFaceTransListener cRPWatchFaceTransListener, int i8) {
        com.orhanobut.logger.f.d("sendNewWatchFace: " + cRPWatchFaceInfo);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new l2(cRPWatchFaceInfo, cRPWatchFaceTransListener, i8));
    }

    public boolean sendOfflineVoiceCertification(final byte[] bArr) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.t3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendOfflineVoiceCertification$77(bArr);
            }
        });
    }

    public boolean sendOtherMessageState(boolean z7) {
        com.orhanobut.logger.f.d("sendOtherMessageState: " + z7);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new m1(z7));
    }

    public boolean sendPhysiologcalPeriod(CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli() && !BandPhysiologcalPeriodProvider.isAcrossYears()) {
            cRPPhysiologcalPeriodInfo = BandPhysiologcalPeriodProvider.getNewMenstrualDate(cRPPhysiologcalPeriodInfo);
        }
        com.orhanobut.logger.f.d("sendPhysiologcalPeriod: " + cRPPhysiologcalPeriodInfo);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new q2(cRPPhysiologcalPeriodInfo));
    }

    public boolean sendPillReminder(CRPPillReminderInfo cRPPillReminderInfo) {
        if (cRPPillReminderInfo == null) {
            return false;
        }
        return com.crrepa.band.my.ble.band.cmd.a.execute(new c4(cRPPillReminderInfo));
    }

    public void sendPlayChatResponseComplete() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.s
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendPlayChatResponseComplete$29();
            }
        });
    }

    public void sendPlayChatResponseError() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.q3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendPlayChatResponseError$30();
            }
        });
    }

    public void sendPlayFetchResponseComplete() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.g
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendPlayFetchResponseComplete$33();
            }
        });
    }

    public void sendPlayFetchResponseError() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.o1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendPlayFetchResponseError$34();
            }
        });
    }

    public boolean sendQuickResponses(CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new s(cRPQuickResponsesDetailInfo));
    }

    public boolean sendQuickView(boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new y0(z7));
    }

    public boolean sendQuickViewTime(BandPeriodTimeModel bandPeriodTimeModel) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new b2(bandPeriodTimeModel));
    }

    public boolean sendReminderToMove(boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new w0(z7));
    }

    public boolean sendSongName(String str) {
        if (TextUtils.isEmpty(str) || str.contains(this.previousSongName) || TextUtils.equals(str, com.crrepa.band.my.ble.band.utils.a.getInstance().getName())) {
            return true;
        }
        com.orhanobut.logger.f.d("song name: " + str);
        this.previousSongName = str;
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j3(str));
    }

    public boolean sendStepLength() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || !connectBand.hasUnitSystem()) {
            return false;
        }
        byte userStepLengthCm = (byte) UserStepLengthProvider.getUserStepLengthCm();
        com.orhanobut.logger.f.d("stepLength: " + ((int) userStepLengthCm));
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j2(userStepLengthCm));
    }

    public void sendStock(final CRPStockInfo cRPStockInfo, final CRPStockPriceInfo cRPStockPriceInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.m1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendStock$9(cRPStockInfo, cRPStockPriceInfo);
            }
        });
    }

    public boolean sendTapToWakeState(boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new g4(z7));
    }

    public boolean sendTempSystem(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new g3(i8));
    }

    public boolean sendTempTimerMeasure(boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new e3(z7));
    }

    public boolean sendTimingStressState(boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new c0(z7));
    }

    public void sendTodayWaterIntake(final int i8) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.c4
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendTodayWaterIntake$69(i8);
            }
        });
    }

    public void sendTodayWaterIntakeHistory(final List<CRPWaterIntakeInfo> list) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.w2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendTodayWaterIntakeHistory$71(list);
            }
        });
    }

    public boolean sendTodayWeather(CRPTodayWeatherInfo cRPTodayWeatherInfo) {
        com.orhanobut.logger.f.d("sendTodayWeatherInfo: " + com.moyoung.dafit.module.common.utils.s.bean2Json(cRPTodayWeatherInfo));
        return com.crrepa.band.my.ble.band.cmd.a.execute(new b1(cRPTodayWeatherInfo));
    }

    public boolean sendTrainingDayGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new w(cRPDailyGoalsInfo));
    }

    public boolean sendTrainingDays(CRPTrainingDayInfo cRPTrainingDayInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new y(cRPTrainingDayInfo));
    }

    public boolean sendUnitSystem(byte b8) {
        com.orhanobut.logger.f.d("sendUnitSystem: " + ((int) b8));
        org.greenrobot.eventbus.c.getDefault().post(new l0.g(b8));
        return com.crrepa.band.my.ble.band.cmd.a.execute(new o3(b8));
    }

    public boolean sendUserInfo() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new h2());
    }

    public boolean sendUserMode() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new o0());
    }

    public void sendVideoWatchFace(final File file, final Bitmap bitmap, final Bitmap bitmap2, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.k1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendVideoWatchFace$101(file, bitmap, bitmap2, cRPFileTransListener);
            }
        });
    }

    public void sendVideoWatchFaceDisplayMode(final CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.q
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendVideoWatchFaceDisplayMode$99(cRPVideoWatchFaceDisplayMode);
            }
        });
    }

    public void sendVideoWatchFaceThumbnail(final String str, final Bitmap bitmap, final CRPFileTransListener cRPFileTransListener) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.s3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendVideoWatchFaceThumbnail$102(str, bitmap, cRPFileTransListener);
            }
        });
    }

    public boolean sendWatchFaceId(int i8, boolean z7) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new q0(i8, z7));
    }

    public boolean sendWatchFaceLayout(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new f2(cRPWatchFaceLayoutInfo));
    }

    public void sendWeatherInfo(Context context) {
        new com.crrepa.band.my.device.weather.b().sendWeatherInfo(context);
    }

    public boolean sendWorldClock(CRPWorldClockInfo cRPWorldClockInfo) {
        com.orhanobut.logger.f.d("sendWorldClock: " + cRPWorldClockInfo);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new k0(cRPWorldClockInfo));
    }

    public boolean sendWorldClockList() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.h4
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendWorldClockList$6();
            }
        });
    }

    public void setBleConnection(Context context, CRPBleConnection cRPBleConnection) {
        this.bleConnection = cRPBleConnection;
        if (cRPBleConnection != null) {
            cRPBleConnection.setCameraOperationListener(new com.crrepa.band.my.ble.band.cmd.listener.f(context));
            this.bleConnection.setPhoneOperationListener(new com.crrepa.band.my.ble.band.cmd.listener.r(context));
            this.bleConnection.setWeatherChangeListener(new com.crrepa.band.my.device.weather.a(context));
            this.bleConnection.setFindPhoneListener(new com.crrepa.band.my.ble.band.cmd.listener.q());
            this.bleConnection.setDeviceBatteryListener(this.batteryListener);
            this.bleConnection.setBatterySavingListener(new com.crrepa.band.my.ble.band.cmd.listener.c());
            this.bleConnection.setA2DPConnectStateListener(new com.crrepa.band.my.ble.band.cmd.listener.a());
            this.bleConnection.setCalendarEventListener(new com.crrepa.band.my.device.calendar.a());
            this.bleConnection.setQuickResponsesListener(new com.crrepa.band.my.ble.band.cmd.listener.l());
            this.bleConnection.setCustomKeyListener(new com.crrepa.band.my.ble.band.cmd.listener.g());
            this.bleConnection.setStockListener(new com.crrepa.band.my.device.stock.a());
            this.bleConnection.setChatListener(new com.crrepa.band.my.device.ai.chat.p(context));
            this.bleConnection.setHisiliconChatListener(new com.crrepa.band.my.device.ai.chat.p(context));
            this.bleConnection.setAiWatchFaceListener(new com.crrepa.band.my.device.ai.picture.c0(context));
            this.bleConnection.setHisiliconAIWatchFaceListener(new com.crrepa.band.my.device.ai.picture.c0(context));
            this.bleConnection.setAiAgentListener(new u0.i());
            this.bleConnection.setHealthAnalysisListener(new t0.f());
            this.bleConnection.setWorldClockListener(new com.crrepa.band.my.ble.band.cmd.listener.o());
            this.bleConnection.setMuslimNameListener(new i1.a());
            this.bleConnection.setMuslimPrayerSettingListener(new i1.c());
            this.bleConnection.setDrinkWaterListener(new d3.a());
            this.bleConnection.setOfflineVoiceListener(new com.crrepa.band.my.ble.band.cmd.listener.k());
            this.bleConnection.setMusicChangeListener(new com.crrepa.band.my.device.localmusic.a());
            this.bleConnection.setLocalVideoChangeListener(new com.crrepa.band.my.device.localvideo.a());
            this.bleConnection.setGalleryChangeListener(new com.crrepa.band.my.device.localphoto.a());
            this.bleConnection.setAppChangeListener(new com.crrepa.band.my.device.appmarket.t());
            this.bleConnection.setVideoWatchFaceListener(new com.crrepa.band.my.device.watchfacenew.video.b());
            this.bleConnection.setPhotoWatchFaceListener(new com.crrepa.band.my.device.watchfacenew.photo.b());
            this.bleConnection.setBarometerCalibrationListener(new com.crrepa.band.my.device.altitude.c());
            this.bleConnection.setConnectKitListener(new com.crrepa.band.my.ble.band.cmd.listener.p());
        }
    }

    public boolean setCalendarEventListener(CRPCalendarEventListener cRPCalendarEventListener) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new e(cRPCalendarEventListener));
    }

    public void setCallNumberListener() {
        this.bleConnection.setCallNumberListener(new com.crrepa.band.my.ble.band.cmd.listener.e());
    }

    public void setContactListener(CRPContactListener cRPContactListener) {
        CRPBleConnection cRPBleConnection = this.bleConnection;
        if (cRPBleConnection != null) {
            cRPBleConnection.setContactListener(cRPContactListener);
        }
    }

    public void setHisiliconAIWatchFace(final Bitmap bitmap, final Bitmap bitmap2) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.f2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$setHisiliconAIWatchFace$45(bitmap, bitmap2);
            }
        });
    }

    public boolean setPlayerState(byte b8) {
        com.orhanobut.logger.f.d("setPlayerState: " + ((int) b8));
        return com.crrepa.band.my.ble.band.cmd.a.execute(new i3(b8));
    }

    public boolean startFindPhone() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new t2());
    }

    public void startNavigation(final boolean z7) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.x2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$startNavigation$130(z7);
            }
        });
    }

    public void startPlayChatResponse() {
        stopPlayChatResponse();
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.c1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$startPlayChatResponse$27();
            }
        });
    }

    public void startPlayFetchResponse() {
        stopPlayChatResponse();
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.u1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$startPlayFetchResponse$31();
            }
        });
    }

    public boolean startUpgrade(boolean z7, CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new u1(z7, cRPBleFirmwareUpgradeListener));
    }

    public boolean stopFindPhone() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new u2());
    }

    public void stopNavigation(final boolean z7) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.y2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$stopNavigation$131(z7);
            }
        });
    }

    public void stopPlayChatResponse() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.y3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$stopPlayChatResponse$28();
            }
        });
    }

    public void stopPlayFetchResponse() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.c2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$stopPlayFetchResponse$32();
            }
        });
    }

    public boolean subscribeBandBattery() {
        if (!this.batteryListener.isSubscribeBattery()) {
            com.orhanobut.logger.f.e("band battery not subscribed", new Object[0]);
            return false;
        }
        com.orhanobut.logger.f.d("subscribeBandBattery");
        this.batteryListener.startTimer();
        return com.crrepa.band.my.ble.band.cmd.a.execute(new u0());
    }

    public void uninstallApp(final String str) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.j3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$uninstallApp$94(str);
            }
        });
    }

    public void updateWaterIntake(final CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.f
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$updateWaterIntake$73(cRPWaterIntakeInfo);
            }
        });
    }

    private i4() {
        this.firmwareVersionCallback = new com.crrepa.band.my.ble.band.cmd.callback.e();
        this.newFirmwareVersionCallback = new com.crrepa.band.my.ble.band.cmd.callback.k();
        this.heartRateTimingMeasureCallback = new com.crrepa.band.my.ble.band.cmd.callback.q();
        this.tempTimingMeasureStateCallback = new com.crrepa.band.my.health.bodytemperature.b();
        this.languageCallback = new com.crrepa.band.my.ble.band.cmd.callback.i();
        this.supportFunctionCallback = new com.crrepa.band.my.device.switchui.b();
        this.physiologcalPeriodCallback = new com.crrepa.band.my.ble.band.cmd.callback.m();
        this.eCardCountCallback = new com.crrepa.band.my.device.ecard.a();
        this.callback = new h1.a();
        this.batteryListener = new com.crrepa.band.my.ble.band.cmd.listener.b();
        this.previousSongName = "-/-/";
    }

    public boolean createBond(final byte[] bArr, final boolean z7, final int i8, final CRPDeviceBondStateCallback cRPDeviceBondStateCallback) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.o3
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$createBond$3(bArr, z7, i8, cRPDeviceBondStateCallback);
            }
        });
    }

    public boolean queryAvailableStorage(CRPAvailableStorageCallback cRPAvailableStorageCallback) {
        com.orhanobut.logger.f.d("queryAvailableStorage");
        return com.crrepa.band.my.ble.band.cmd.a.execute(new n(cRPAvailableStorageCallback));
    }

    public void sendAIFetchResponse(final byte b8, String str, final int i8, final boolean z7) {
        final String replace = str.replace("#", "").replace("*", "");
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.a2
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendAIFetchResponse$24(b8, replace, i8, z7);
            }
        });
    }

    public void sendChatResponse(String str, final int i8, final boolean z7) {
        final String replace = str.replace("#", "").replace("*", "");
        com.crrepa.band.my.ble.band.cmd.a.execute(new com.crrepa.band.my.ble.band.cmd.j4() { // from class: com.crrepa.band.my.ble.band.cmd.v1
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                i4.this.lambda$sendChatResponse$23(replace, i8, z7);
            }
        });
    }
}
