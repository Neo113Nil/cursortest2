package com.crrepa.h;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import com.crrepa.a1.g;
import com.crrepa.b1.i;
import com.crrepa.ble.conn.CRPBleConnection;
import com.crrepa.ble.conn.bean.CRPAlarmInfo;
import com.crrepa.ble.conn.bean.CRPBreathingTrainingInfo;
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
import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;
import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import com.crrepa.ble.conn.bean.CRPPillReminderInfo;
import com.crrepa.ble.conn.bean.CRPQuickResponsesDetailInfo;
import com.crrepa.ble.conn.bean.CRPSedentaryReminderPeriodInfo;
import com.crrepa.ble.conn.bean.CRPSosInfo;
import com.crrepa.ble.conn.bean.CRPStockInfo;
import com.crrepa.ble.conn.bean.CRPStockPriceInfo;
import com.crrepa.ble.conn.bean.CRPTodayWeatherInfo;
import com.crrepa.ble.conn.bean.CRPTrainingDayInfo;
import com.crrepa.ble.conn.bean.CRPUserInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceBackgroundInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceDetailsRequestInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceStoreRequestInfo;
import com.crrepa.ble.conn.bean.CRPWaterIntakeInfo;
import com.crrepa.ble.conn.bean.CRPWhatsappReceiveMessageInfo;
import com.crrepa.ble.conn.bean.CRPWhatsappStateInfo;
import com.crrepa.ble.conn.bean.CRPWorldClockInfo;
import com.crrepa.ble.conn.callback.CRPAiCallback;
import com.crrepa.ble.conn.callback.CRPAlarmCallback;
import com.crrepa.ble.conn.callback.CRPAvailableStorageCallback;
import com.crrepa.ble.conn.callback.CRPBluetrumWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPBtAddressCallback;
import com.crrepa.ble.conn.callback.CRPConnectivityCheckCallback;
import com.crrepa.ble.conn.callback.CRPContactConfigCallback;
import com.crrepa.ble.conn.callback.CRPContactCountCallback;
import com.crrepa.ble.conn.callback.CRPContactNumberSymbolCallback;
import com.crrepa.ble.conn.callback.CRPDailyGoalsCallback;
import com.crrepa.ble.conn.callback.CRPDeviceBondStateCallback;
import com.crrepa.ble.conn.callback.CRPDeviceBreathingLightCallback;
import com.crrepa.ble.conn.callback.CRPDeviceBrightnessCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDfuAddressCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDfuStatusCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDfuTypeCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDisplayTimeCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDisplayWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDominantHandCallback;
import com.crrepa.ble.conn.callback.CRPDeviceFirmwareVersionCallback;
import com.crrepa.ble.conn.callback.CRPDeviceFunctionCallback;
import com.crrepa.ble.conn.callback.CRPDeviceGoalStepCallback;
import com.crrepa.ble.conn.callback.CRPDeviceHandWashingPeriodCallback;
import com.crrepa.ble.conn.callback.CRPDeviceInfoCallback;
import com.crrepa.ble.conn.callback.CRPDeviceLanguageCallback;
import com.crrepa.ble.conn.callback.CRPDeviceMaxHeartRateCallback;
import com.crrepa.ble.conn.callback.CRPDeviceMetricSystemCallback;
import com.crrepa.ble.conn.callback.CRPDeviceNameCallback;
import com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback;
import com.crrepa.ble.conn.callback.CRPDeviceOtherMessageCallback;
import com.crrepa.ble.conn.callback.CRPDevicePeriodTimeCallback;
import com.crrepa.ble.conn.callback.CRPDevicePhysiologcalPeriodCallback;
import com.crrepa.ble.conn.callback.CRPDeviceQuickViewCallback;
import com.crrepa.ble.conn.callback.CRPDeviceSedentaryReminderCallback;
import com.crrepa.ble.conn.callback.CRPDeviceSedentaryReminderPeriodCallback;
import com.crrepa.ble.conn.callback.CRPDeviceSupportWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPDeviceTestModeCallback;
import com.crrepa.ble.conn.callback.CRPDeviceTimeSystemCallback;
import com.crrepa.ble.conn.callback.CRPDeviceTimingMeasureHeartRateCallback;
import com.crrepa.ble.conn.callback.CRPDeviceUIVersionCodeCallback;
import com.crrepa.ble.conn.callback.CRPDeviceVersionCallback;
import com.crrepa.ble.conn.callback.CRPDeviceWatchFaceLayoutCallback;
import com.crrepa.ble.conn.callback.CRPDeviceWatchFaceListCallback;
import com.crrepa.ble.conn.callback.CRPElectronicCardCallback;
import com.crrepa.ble.conn.callback.CRPElectronicCardCountCallback;
import com.crrepa.ble.conn.callback.CRPFlashNotificationCallback;
import com.crrepa.ble.conn.callback.CRPJieliWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPMessageLengthCallback;
import com.crrepa.ble.conn.callback.CRPMessageListCallback;
import com.crrepa.ble.conn.callback.CRPMtuChangeCallback;
import com.crrepa.ble.conn.callback.CRPMuslimPrayerCompensationCallback;
import com.crrepa.ble.conn.callback.CRPMuslimTasbihSettingCallback;
import com.crrepa.ble.conn.callback.CRPPillReminderCallback;
import com.crrepa.ble.conn.callback.CRPRemoveBondCallback;
import com.crrepa.ble.conn.callback.CRPSleepTimeCallback;
import com.crrepa.ble.conn.callback.CRPSosStateCallback;
import com.crrepa.ble.conn.callback.CRPTapToWakeCallback;
import com.crrepa.ble.conn.callback.CRPTimingTempStateCallback;
import com.crrepa.ble.conn.callback.CRPTrainingDayGoalsCallback;
import com.crrepa.ble.conn.callback.CRPVibrationStrengthCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceDetailsCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceScreenCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceStoreCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceStoreTagCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceTimeStyleCallback;
import com.crrepa.ble.conn.listener.CRPA2DPConnectStateListener;
import com.crrepa.ble.conn.listener.CRPAiAgentListener;
import com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener;
import com.crrepa.ble.conn.listener.CRPAppChangeListener;
import com.crrepa.ble.conn.listener.CRPBarometerCalibrationListener;
import com.crrepa.ble.conn.listener.CRPBatterySavingChangeListener;
import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.conn.listener.CRPBleECGChangeListener;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.conn.listener.CRPBloodOxygenChangeListener;
import com.crrepa.ble.conn.listener.CRPBloodPressureChangeListener;
import com.crrepa.ble.conn.listener.CRPBreathRateChangeListener;
import com.crrepa.ble.conn.listener.CRPCalendarEventListener;
import com.crrepa.ble.conn.listener.CRPCallNumberListener;
import com.crrepa.ble.conn.listener.CRPCaloriesCategoryChangeListener;
import com.crrepa.ble.conn.listener.CRPCameraOperationListener;
import com.crrepa.ble.conn.listener.CRPChatChangeListener;
import com.crrepa.ble.conn.listener.CRPConnectKitListener;
import com.crrepa.ble.conn.listener.CRPContactListener;
import com.crrepa.ble.conn.listener.CRPCustomKeyChangeListener;
import com.crrepa.ble.conn.listener.CRPDeviceBatteryListener;
import com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener;
import com.crrepa.ble.conn.listener.CRPDeviceRssiListener;
import com.crrepa.ble.conn.listener.CRPDistanceCategoryChangeListener;
import com.crrepa.ble.conn.listener.CRPEmojiChangeListener;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.listener.CRPFindPhoneListener;
import com.crrepa.ble.conn.listener.CRPGalleryChangeListener;
import com.crrepa.ble.conn.listener.CRPGalleryTransListener;
import com.crrepa.ble.conn.listener.CRPGomoreListener;
import com.crrepa.ble.conn.listener.CRPGpsChangeListener;
import com.crrepa.ble.conn.listener.CRPHealthAnalysisListener;
import com.crrepa.ble.conn.listener.CRPHeartRateChangeListener;
import com.crrepa.ble.conn.listener.CRPHrvChangeListener;
import com.crrepa.ble.conn.listener.CRPLocalNavigationListener;
import com.crrepa.ble.conn.listener.CRPLocalVideoChangeListener;
import com.crrepa.ble.conn.listener.CRPMovementStateListener;
import com.crrepa.ble.conn.listener.CRPMusicChangeListener;
import com.crrepa.ble.conn.listener.CRPMuslimNameListener;
import com.crrepa.ble.conn.listener.CRPMuslimPrayerSettingListener;
import com.crrepa.ble.conn.listener.CRPNewHrvChangeListener;
import com.crrepa.ble.conn.listener.CRPOfflineVoiceListener;
import com.crrepa.ble.conn.listener.CRPPhoneOperationListener;
import com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener;
import com.crrepa.ble.conn.listener.CRPPhotoWatchFaceTransListener;
import com.crrepa.ble.conn.listener.CRPQuickResponsesChangeListener;
import com.crrepa.ble.conn.listener.CRPScreenOffClockListener;
import com.crrepa.ble.conn.listener.CRPSleepActionChangeListener;
import com.crrepa.ble.conn.listener.CRPSleepChangeListener;
import com.crrepa.ble.conn.listener.CRPSosChangeListener;
import com.crrepa.ble.conn.listener.CRPStepChangeListener;
import com.crrepa.ble.conn.listener.CRPStepsCategoryChangeListener;
import com.crrepa.ble.conn.listener.CRPStockChangeListener;
import com.crrepa.ble.conn.listener.CRPStressListener;
import com.crrepa.ble.conn.listener.CRPTempChangeListener;
import com.crrepa.ble.conn.listener.CRPTrainingChangeListener;
import com.crrepa.ble.conn.listener.CRPVideoWatchFaceChangeListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.conn.listener.CRPWeatherChangeListener;
import com.crrepa.ble.conn.listener.CRPWhatsappListener;
import com.crrepa.ble.conn.listener.CRPWorldClockListener;
import com.crrepa.ble.conn.type.CRPBloodOxygenTimeType;
import com.crrepa.ble.conn.type.CRPCategoryHistoryDay;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.crrepa.ble.conn.type.CRPEcgMeasureType;
import com.crrepa.ble.conn.type.CRPEpoType;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import com.crrepa.ble.conn.type.CRPHistoryDynamicRateType;
import com.crrepa.ble.conn.type.CRPMcuPlatform;
import com.crrepa.ble.conn.type.CRPMuslimPrayerNotifcationType;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPProtocolVersion;
import com.crrepa.ble.conn.type.CRPStressDate;
import com.crrepa.ble.conn.type.CRPTempTimeType;
import com.crrepa.ble.conn.type.CRPVibrationStrength;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener;
import com.crrepa.ble.trans.music.CRPMusicTrainsInitiator;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.a0;
import com.crrepa.f.a1;
import com.crrepa.f.a2;
import com.crrepa.f.b0;
import com.crrepa.f.b1;
import com.crrepa.f.b2;
import com.crrepa.f.c0;
import com.crrepa.f.c1;
import com.crrepa.f.c2;
import com.crrepa.f.d0;
import com.crrepa.f.d1;
import com.crrepa.f.d2;
import com.crrepa.f.e0;
import com.crrepa.f.e1;
import com.crrepa.f.e2;
import com.crrepa.f.f0;
import com.crrepa.f.f1;
import com.crrepa.f.f2;
import com.crrepa.f.g0;
import com.crrepa.f.g1;
import com.crrepa.f.g2;
import com.crrepa.f.h;
import com.crrepa.f.h0;
import com.crrepa.f.h1;
import com.crrepa.f.h2;
import com.crrepa.f.i;
import com.crrepa.f.i1;
import com.crrepa.f.i2;
import com.crrepa.f.j;
import com.crrepa.f.j0;
import com.crrepa.f.j1;
import com.crrepa.f.j2;
import com.crrepa.f.k;
import com.crrepa.f.k0;
import com.crrepa.f.k1;
import com.crrepa.f.k2;
import com.crrepa.f.l;
import com.crrepa.f.l0;
import com.crrepa.f.l1;
import com.crrepa.f.l2;
import com.crrepa.f.m;
import com.crrepa.f.m0;
import com.crrepa.f.n;
import com.crrepa.f.n0;
import com.crrepa.f.n1;
import com.crrepa.f.o;
import com.crrepa.f.o0;
import com.crrepa.f.o1;
import com.crrepa.f.p;
import com.crrepa.f.p0;
import com.crrepa.f.p1;
import com.crrepa.f.q;
import com.crrepa.f.q0;
import com.crrepa.f.q1;
import com.crrepa.f.r;
import com.crrepa.f.r0;
import com.crrepa.f.r1;
import com.crrepa.f.s;
import com.crrepa.f.s0;
import com.crrepa.f.s1;
import com.crrepa.f.t;
import com.crrepa.f.t0;
import com.crrepa.f.t1;
import com.crrepa.f.u;
import com.crrepa.f.u0;
import com.crrepa.f.u1;
import com.crrepa.f.v;
import com.crrepa.f.v0;
import com.crrepa.f.v1;
import com.crrepa.f.w;
import com.crrepa.f.w0;
import com.crrepa.f.w1;
import com.crrepa.f.x;
import com.crrepa.f.x0;
import com.crrepa.f.x1;
import com.crrepa.f.y;
import com.crrepa.f.y0;
import com.crrepa.f.y1;
import com.crrepa.f.z;
import com.crrepa.f.z0;
import com.crrepa.f.z1;
import com.crrepa.m.e;
import com.crrepa.m.f;
import com.google.android.exoplayer2.ExoPlayer;
import h4.i0;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a implements CRPBleConnection {

    /* renamed from: a, reason: collision with root package name */
    private d f12934a;

    /* renamed from: b, reason: collision with root package name */
    private final f f12935b = f.e();

    /* renamed from: c, reason: collision with root package name */
    private e f12936c;

    /* renamed from: d, reason: collision with root package name */
    private com.crrepa.m.a f12937d;

    /* renamed from: com.crrepa.h.a$a, reason: collision with other inner class name */
    class RunnableC0220a implements Runnable {
        RunnableC0220a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f12936c.d();
        }
    }

    private void b(int i8) {
        a(j1.b(i8));
    }

    private void c(int i8) {
        a(j0.a(i8));
    }

    private void d(boolean z7) {
        a(j0.b(z7));
    }

    private void e(boolean z7) {
        a(n0.a(z7));
    }

    private void f(boolean z7) {
        a(t1.a(z7));
    }

    private void g(boolean z7) {
        a(g1.b(z7));
    }

    private void h(boolean z7) {
        a(t1.c(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortAiAgent() {
        this.f12935b.d();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortChat() {
        this.f12935b.d();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortFirmwareUpgrade() {
        com.crrepa.w0.c.c().a();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortInstallApp() {
        com.crrepa.r0.a.b().a();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortSendConnectKitFile() {
        com.crrepa.s.a.b().a();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortSendGallery() {
        com.crrepa.q0.d.c().a();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortSendLocalVideo() {
        com.crrepa.s0.d.a().a((byte) 15).abort();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortSendMusic() {
        CRPMusicTrainsInitiator.getInstance().abort();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortWatchFace() {
        g.a();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void abortWatchFaceBackground() {
        com.crrepa.l0.b b8 = com.crrepa.o.a.c().b();
        if (b8 != null) {
            b8.a();
        }
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void addWaterIntake(CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        a(q.a(cRPWaterIntakeInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void checkFirmwareVersion(CRPDeviceNewFirmwareVersionCallback cRPDeviceNewFirmwareVersionCallback, String str, int i8) {
        FirmwareUpgradePresenter.getInstance().checkFirmwareVersion(str, i8, cRPDeviceNewFirmwareVersionCallback);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void checkSupportQuickContact(CRPContactConfigCallback cRPContactConfigCallback) {
        this.f12937d.a(cRPContactConfigCallback);
        a(v.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void clearCalendarEvent() {
        a(r1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void clearContact() {
        a(v.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void clearGallery() {
        i0.a(1);
        a(w.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void clearPillReminder() {
        a(r.a(255));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void clearStock() {
        a(com.crrepa.f.i0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void close() {
        com.crrepa.m.b.b(com.crrepa.l.a.b().a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void closeMusicControl() {
        this.f12935b.c(b1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    @SuppressLint({"MissingPermission"})
    public boolean connect() {
        BluetoothGatt a8 = com.crrepa.l.a.b().a();
        if (a8 == null) {
            return false;
        }
        return a8.connect();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void connectivityCheck(boolean z7, byte[] bArr, CRPConnectivityCheckCallback cRPConnectivityCheckCallback) {
        this.f12937d.a(cRPConnectivityCheckCallback);
        this.f12935b.c(r0.a(z7, bArr));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void createBond(byte[] bArr, CRPDeviceBondStateCallback cRPDeviceBondStateCallback) {
        this.f12937d.a(cRPDeviceBondStateCallback);
        this.f12935b.c(r0.a(bArr));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteAllNewAlarm() {
        a(t.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteCalendarEvent(int i8) {
        a(r1.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteContact(int i8) {
        a(v.b((byte) i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteContactAvatar(int i8) {
        a(v.a((byte) i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteElectronicCard(int i8) {
        a(y.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteGalleryPhoto(List<String> list) {
        i0.a(0);
        a(w.a(list));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteJieliWatchFace(int[] iArr, CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback) {
        this.f12937d.a(cRPWatchFaceDeleteCallback);
        this.f12935b.c(q0.a(iArr));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteLocalVideo(String str) {
        a(a0.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteMusic(int i8) {
        a(e2.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteNewAlarm(int i8) {
        a(t.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deletePhotoWatchFace(String str) {
        a(q0.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deletePillReminder(int i8) {
        a(r.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteStock(byte b8) {
        a(com.crrepa.f.i0.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteWatchFace(int i8, CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback) {
        this.f12937d.a(cRPWatchFaceDeleteCallback);
        this.f12935b.c(q0.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteWaterIntake(CRPWaterIntakeInfo.WaterIntakeType waterIntakeType, int i8) {
        a(q.a(waterIntakeType, i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void deleteWorldClock(byte b8) {
        a(y0.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableContinueBloodOxygen() {
        d(false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableContinueBloodPressure() {
        e(false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableContinueTemp() {
        f(false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableHrvMeasure() {
        b(0);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableQuickResponses() {
        a(z.a(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableScreenOffClock() {
        a(e0.a(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableTimingBreathRate() {
        a(z0.a(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableTimingMeasureBloodOxygen() {
        c(0);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableTimingMeasureHeartRate() {
        a(g1.a(-1));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableTimingMeasureTemp() {
        h(false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void disableTimingStress() {
        a(n1.b(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableContinueBloodOxygen() {
        d(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableContinueBloodPressure() {
        e(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableContinueTemp() {
        f(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableHrvMeasure(int i8) {
        b(i8);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableHsDfu() {
        a(com.crrepa.f.g.a(99, new byte[]{1}));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableQuickResponses() {
        a(z.a(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableScreenOffClock() {
        a(e0.a(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableSos(boolean z7) {
        a(e1.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableTimingBreathRate() {
        a(z0.a(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableTimingMeasureBloodOxygen(int i8) {
        c(i8);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableTimingMeasureHeartRate(int i8) {
        if (i8 <= 0) {
            return;
        }
        a(g1.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableTimingMeasureTemp() {
        h(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enableTimingStress() {
        a(n1.b(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void enterCameraView() {
        a(u1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void exitCameraView() {
        a(u1.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void findDevice() {
        a(com.crrepa.f.g.a(97, null));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public CRPProtocolVersion getProtocolVersion() {
        return com.crrepa.l.a.b().e();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void installApp(File file, CRPAppTransListener cRPAppTransListener) {
        com.crrepa.r0.a.b().a(cRPAppTransListener, file);
        com.crrepa.n.a.a().a(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public boolean isNewECGMeasurementVersion() {
        return com.crrepa.q.a.a();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void pingApp(CRPConnectKitMessage cRPConnectKitMessage) {
        com.crrepa.s.b.a(cRPConnectKitMessage);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryA2DPState() {
        a(p.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryAiPhotoWatchFace() {
        a(l.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryAiWatchFaceLayout() {
        a(l.d());
        a(l.b());
        a(l.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryAllAlarm(CRPAlarmCallback cRPAlarmCallback) {
        this.f12937d.a(cRPAlarmCallback);
        a(t.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryAllNewAlarm(CRPAlarmCallback cRPAlarmCallback) {
        this.f12937d.a(cRPAlarmCallback);
        a(t.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryAppAvailableSize() {
        a(e2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryAppStoreInfo() {
        a(g2.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryAvailableStorage(CRPAvailableStorageCallback cRPAvailableStorageCallback) {
        this.f12937d.a(cRPAvailableStorageCallback);
        this.f12935b.c(com.crrepa.f.a.a());
        this.f12935b.c(com.crrepa.f.a.b());
        this.f12935b.c(e2.h());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryBatterySaving() {
        a(f0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryBluetrumWatchFaceInfo(CRPBluetrumWatchFaceCallback cRPBluetrumWatchFaceCallback) {
        this.f12937d.a(cRPBluetrumWatchFaceCallback);
        this.f12935b.c(q0.h());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryBreathingLight(CRPDeviceBreathingLightCallback cRPDeviceBreathingLightCallback) {
        this.f12937d.a(cRPDeviceBreathingLightCallback);
        a(c1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryBrightness(CRPDeviceBrightnessCallback cRPDeviceBrightnessCallback) {
        this.f12937d.a(cRPDeviceBrightnessCallback);
        a(i1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryBtAddress(CRPBtAddressCallback cRPBtAddressCallback) {
        this.f12937d.a(cRPBtAddressCallback);
        a(l1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryCalendarEvent(int i8) {
        a(r1.b(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryCalendarEventReminderTime() {
        a(r1.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryCaloriesCategory(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
        a(x1.a(cRPCategoryHistoryDay));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryConnectKitAvailableStorage() {
        this.f12935b.b(com.crrepa.s.b.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryContactCount(CRPContactCountCallback cRPContactCountCallback) {
        this.f12937d.a(cRPContactCountCallback);
        a(v.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryContactNumberSymbol(CRPContactNumberSymbolCallback cRPContactNumberSymbolCallback) {
        this.f12937d.a(cRPContactNumberSymbolCallback);
        a(v.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryContinueBloodOxygenState() {
        a(j0.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryContinueBloodPressureState() {
        a(n0.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryContinueTempState() {
        a(t1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDailyGoals(CRPDailyGoalsCallback cRPDailyGoalsCallback) {
        this.f12937d.a(cRPDailyGoalsCallback);
        a(d2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDeviceBattery() {
        this.f12936c.c();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDeviceDfuStatus(CRPDeviceDfuStatusCallback cRPDeviceDfuStatusCallback) {
        com.crrepa.e.c.a().a(cRPDeviceDfuStatusCallback);
        a(com.crrepa.f.a.c());
        d4.a.a(new RunnableC0220a(), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDeviceInfo(CRPDeviceInfoCallback cRPDeviceInfoCallback) {
        this.f12937d.a(cRPDeviceInfoCallback);
        a(g2.e());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDeviceLanguage(CRPDeviceLanguageCallback cRPDeviceLanguageCallback) {
        this.f12937d.a(cRPDeviceLanguageCallback);
        a(p1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDeviceSupportFunction(CRPDeviceFunctionCallback cRPDeviceFunctionCallback) {
        this.f12937d.a(cRPDeviceFunctionCallback);
        a(g0.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDeviceVersion(CRPDeviceVersionCallback cRPDeviceVersionCallback) {
        this.f12937d.a(cRPDeviceVersionCallback);
        a(j2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDfuType(CRPDeviceDfuTypeCallback cRPDeviceDfuTypeCallback) {
        com.crrepa.e.c.a().a(cRPDeviceDfuTypeCallback);
        a(com.crrepa.f.a.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDisplayDeviceFunction(CRPDeviceFunctionCallback cRPDeviceFunctionCallback) {
        this.f12937d.a(cRPDeviceFunctionCallback);
        a(g0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDisplayTime(CRPDeviceDisplayTimeCallback cRPDeviceDisplayTimeCallback) {
        this.f12937d.a(cRPDeviceDisplayTimeCallback);
        a(com.crrepa.f.e.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDisplayWatchFace(CRPDeviceDisplayWatchFaceCallback cRPDeviceDisplayWatchFaceCallback) {
        this.f12937d.a(cRPDeviceDisplayWatchFaceCallback);
        a(q0.f());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDistanceCategory(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
        a(x1.b(cRPCategoryHistoryDay));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDoNotDistrubTime(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback) {
        this.f12937d.a(cRPDevicePeriodTimeCallback);
        a(i.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDominantHand(CRPDeviceDominantHandCallback cRPDeviceDominantHandCallback) {
        this.f12937d.a(cRPDeviceDominantHandCallback);
        a(m.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDrinkWaterGoals() {
        a(q.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryDrinkWaterReminderPeriod() {
        a(q.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryElectronicCard(int i8, CRPElectronicCardCallback cRPElectronicCardCallback) {
        this.f12937d.a(cRPElectronicCardCallback);
        a(y.b(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryElectronicCardCount(CRPElectronicCardCountCallback cRPElectronicCardCountCallback) {
        this.f12937d.a(cRPElectronicCardCountCallback);
        a(y.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryFlashNotification(CRPFlashNotificationCallback cRPFlashNotificationCallback) {
        this.f12937d.a(cRPFlashNotificationCallback);
        a(s.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryFrimwareVersion(CRPDeviceFirmwareVersionCallback cRPDeviceFirmwareVersionCallback) {
        com.crrepa.e.e.a().a(cRPDeviceFirmwareVersionCallback);
        this.f12936c.e();
        a(com.crrepa.f.a.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryGalleryInfo() {
        a(e2.b());
        a(w.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryGoalStep(CRPDeviceGoalStepCallback cRPDeviceGoalStepCallback) {
        this.f12937d.a(cRPDeviceGoalStepCallback);
        a(o0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryGomoreEUID() {
        a(s0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryGpsDetail(int i8) {
        a(w0.a(i8, 0));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHandWashingReminderPeriod(CRPDeviceHandWashingPeriodCallback cRPDeviceHandWashingPeriodCallback) {
        this.f12937d.a(cRPDeviceHandWashingPeriodCallback);
        a(a1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryBloodOxygen() {
        a(j0.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryBloodPressure() {
        a(n0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryBreathRate() {
        a(z0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryGps() {
        a(w0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryHeartRate() {
        a(g1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryNapSleep(CRPHistoryDay cRPHistoryDay) {
        if (CRPHistoryDay.THE_DAY_BEFORE_YESTERDAY.getValue() < cRPHistoryDay.getValue()) {
            return;
        }
        a(x0.a(cRPHistoryDay));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryNewHrv() {
        a(com.crrepa.f.b.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryRemSleep(CRPHistoryDay cRPHistoryDay) {
        a(true, cRPHistoryDay);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistorySleep(CRPHistoryDay cRPHistoryDay) {
        a(false, cRPHistoryDay);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryStep(CRPHistoryDay cRPHistoryDay) {
        byte value = cRPHistoryDay.getValue();
        a(h1.a(value));
        a(h1.b(value));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryStress() {
        a(n1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryTimingHeartRate(CRPHistoryDay cRPHistoryDay) {
        if (cRPHistoryDay == CRPHistoryDay.YESTERDAY) {
            a(g1.d((byte) 4));
        }
        a(g1.a(cRPHistoryDay.getValue(), (byte) 0));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHistoryTraining() {
        a(c2.c());
        a(c2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHrv(int i8, int i9) {
        a(j1.a(i8, i9));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHrvMeasureCount(int i8) {
        a(j1.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHrvMeasureInterval() {
        a(j1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryHsDfuAddress(CRPDeviceDfuAddressCallback cRPDeviceDfuAddressCallback) {
        this.f12937d.a(cRPDeviceDfuAddressCallback);
        a(com.crrepa.f.g.a(99, new byte[]{0}));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryJieliPhotoWatchFace() {
        a(q0.j());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryJieliPhotoWatchFaceLayout() {
        a(q0.k());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryJieliWatchFaceInfo(CRPJieliWatchFaceCallback cRPJieliWatchFaceCallback) {
        this.f12937d.a(cRPJieliWatchFaceCallback);
        this.f12935b.c(q0.o());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryLast24HourBloodOxygen() {
        a(j0.c(0));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryLast24HourBloodPressure() {
        a(n0.a(0));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryLast24HourTemp() {
        a(t1.a(0));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryLastDynamicRate(CRPHistoryDynamicRateType cRPHistoryDynamicRateType) {
        a(g1.b(cRPHistoryDynamicRateType.getValue()));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryLastMeasureECGData() {
        a(2);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryLocalVideoInfo() {
        a(e2.c());
        a(a0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMaxHeartRate(CRPDeviceMaxHeartRateCallback cRPDeviceMaxHeartRateCallback) {
        this.f12937d.a(cRPDeviceMaxHeartRateCallback);
        a(d1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMessageLength(CRPMessageLengthCallback cRPMessageLengthCallback) {
        this.f12937d.a(cRPMessageLengthCallback);
        a(g4.a.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMessageList(CRPMessageListCallback cRPMessageListCallback) {
        this.f12937d.a(cRPMessageListCallback);
        a(y1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMetricSystem(CRPDeviceMetricSystemCallback cRPDeviceMetricSystemCallback) {
        this.f12937d.a(cRPDeviceMetricSystemCallback);
        a(b2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMovementHeartRate() {
        a(g1.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMusicAvailableSize() {
        a(e2.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMusicName(int i8) {
        a(e2.b(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMusicSavedCount() {
        a(e2.e());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMuslimPrayerCalculationType() {
        a(k2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMuslimPrayerCompensation(CRPMuslimPrayerCompensationCallback cRPMuslimPrayerCompensationCallback) {
        this.f12937d.a(cRPMuslimPrayerCompensationCallback);
        a(k2.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMuslimPrayerNotification() {
        a(k2.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMuslimSavedName() {
        a(k2.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMuslimSavedPrayers() {
        a(k2.e());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryMuslimTasbihSetting(CRPMuslimTasbihSettingCallback cRPMuslimTasbihSettingCallback) {
        this.f12937d.a(cRPMuslimTasbihSettingCallback);
        a(k2.f());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryNewDrinkWaterReminderPeriod() {
        a(q.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryOtherMessageState(CRPDeviceOtherMessageCallback cRPDeviceOtherMessageCallback) {
        this.f12937d.a(cRPDeviceOtherMessageCallback);
        a(com.crrepa.f.f.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryPerformanceInsights() {
        a(j.a((byte) 0));
        a(j.a((byte) 1));
        a(j.a((byte) 2));
        a(j.a((byte) 3));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryPhotoWatchFaceAvailableSize() {
        a(e2.f());
        a(q0.m());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryPhotoWatchFaceDisplayMode() {
        a(q0.q());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryPhotoWatchFaceInfo() {
        a(q0.p());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryPhysiologcalPeriod(CRPDevicePhysiologcalPeriodCallback cRPDevicePhysiologcalPeriodCallback) {
        this.f12937d.a(cRPDevicePhysiologcalPeriodCallback);
        a(n.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryPillReminder(CRPPillReminderCallback cRPPillReminderCallback) {
        this.f12937d.a(cRPPillReminderCallback);
        a(r.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryQuickResponses(byte b8) {
        a(z.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryQuickResponsesCount() {
        a(z.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryQuickView(CRPDeviceQuickViewCallback cRPDeviceQuickViewCallback) {
        this.f12937d.a(cRPDeviceQuickViewCallback);
        a(d0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryQuickViewTime(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback) {
        this.f12937d.a(cRPDevicePeriodTimeCallback);
        a(h0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySavedGomoreKey() {
        a(s0.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryScreenOffClockState() {
        a(e0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryScreenOffClockTime() {
        a(e0.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySedentaryReminder(CRPDeviceSedentaryReminderCallback cRPDeviceSedentaryReminderCallback) {
        this.f12937d.a(cRPDeviceSedentaryReminderCallback);
        a(p0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySedentaryReminderPeriod(CRPDeviceSedentaryReminderPeriodCallback cRPDeviceSedentaryReminderPeriodCallback) {
        this.f12937d.a(cRPDeviceSedentaryReminderPeriodCallback);
        a(l0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySifliWatchFaceStore(int i8, String str, int i9, int i10, int i11, CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback) {
        new com.crrepa.f1.c(cRPWatchFaceStoreCallback).a(i8, str, i9, i10, i11);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySleepAction(int i8) {
        a(t0.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySleepTime(CRPSleepTimeCallback cRPSleepTimeCallback) {
        this.f12937d.a(cRPSleepTimeCallback);
        a(x0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySosState(CRPSosStateCallback cRPSosStateCallback) {
        this.f12937d.a(cRPSosStateCallback);
        a(e1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryStepsCategory(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
        a(x1.c(cRPCategoryHistoryDay));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportAi(CRPAiCallback cRPAiCallback) {
        com.crrepa.e.a.a().a(cRPAiCallback);
        a(k.a());
        a(k.b());
        a(l.e());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportAiAgent() {
        a(com.crrepa.f.d.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportAppInfo() {
        a(x.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportCalendarEvent() {
        a(r1.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportCustomFeatureList() {
        a(a2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportCustomGameList() {
        a(a2.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportCustomTrainingList() {
        a(a2.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportDeviceRename(CRPDeviceNameCallback cRPDeviceNameCallback) {
        this.f12937d.a(cRPDeviceNameCallback);
        a(g2.f());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportEmojiCount() {
        a(o.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportEmojiList() {
        a(o.a((byte) 0));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportGomore() {
        a(s0.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportLocalNavigation() {
        a(v1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportNewHrv() {
        a(com.crrepa.f.b.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportStock() {
        a(com.crrepa.f.i0.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportStress() {
        a(n1.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportWatchFace(CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback) {
        this.f12937d.a(cRPDeviceSupportWatchFaceCallback);
        a(q0.e());
        a(q0.d());
        a(q0.b());
        a(q0.c());
        a(q0.i());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void querySupportWorldClock() {
        a(y0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTapToWakeState(CRPTapToWakeCallback cRPTapToWakeCallback) {
        this.f12937d.a(cRPTapToWakeCallback);
        a(q1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTempUnit() {
        a(w1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTestModeState(CRPDeviceTestModeCallback cRPDeviceTestModeCallback) {
        this.f12937d.a(cRPDeviceTestModeCallback);
        a(com.crrepa.f.a.f());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimeSystem(CRPDeviceTimeSystemCallback cRPDeviceTimeSystemCallback) {
        this.f12937d.a(cRPDeviceTimeSystemCallback);
        a(z1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingBloodOxygen(CRPBloodOxygenTimeType cRPBloodOxygenTimeType) {
        a(j0.b(cRPBloodOxygenTimeType.getValue()));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingBloodOxygenMeasureState() {
        a(j0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingBreathRate(CRPHistoryDay cRPHistoryDay) {
        a(z0.a(cRPHistoryDay));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingBreathRateState() {
        a(z0.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingMeasureHeartRate(CRPDeviceTimingMeasureHeartRateCallback cRPDeviceTimingMeasureHeartRateCallback) {
        this.f12937d.a(cRPDeviceTimingMeasureHeartRateCallback);
        a(g1.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingMeasureTemp(CRPTempTimeType cRPTempTimeType) {
        a(t1.a(cRPTempTimeType));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingMeasureTempState(CRPTimingTempStateCallback cRPTimingTempStateCallback) {
        this.f12937d.a(cRPTimingTempStateCallback);
        a(t1.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingStress(CRPStressDate cRPStressDate) {
        a(n1.a(cRPStressDate.getValue()));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTimingStressState() {
        a(n1.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTodayHeartRate(int i8) {
        byte[] c8;
        if (i8 == 1) {
            c8 = g1.d((byte) 0);
            queryHistoryTimingHeartRate(CRPHistoryDay.TODAY);
        } else {
            c8 = i8 == 2 ? g1.c((byte) 0) : null;
        }
        a(c8);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTodayWaterIntake() {
        a(q.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTodayWaterIntakeHistory() {
        a(q.e());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTraining(int i8) {
        a(c2.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTrainingDay(CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback) {
        this.f12937d.a(cRPTrainingDayGoalsCallback);
        a(d2.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTrainingDayGoals(CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback) {
        this.f12937d.a(cRPTrainingDayGoalsCallback);
        a(d2.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryTrainingRealtimeData() {
        a(c2.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryUIVersionCode(CRPDeviceUIVersionCodeCallback cRPDeviceUIVersionCodeCallback) {
        this.f12937d.a(cRPDeviceUIVersionCodeCallback);
        a(com.crrepa.f.a.g());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryVibrationStrength(CRPVibrationStrengthCallback cRPVibrationStrengthCallback) {
        this.f12937d.a(cRPVibrationStrengthCallback);
        a(m0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryVideoWatchFaceAvailableSize() {
        a(e2.g());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryVideoWatchFaceDisplayMode() {
        a(q0.r());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryVideoWatchFaceInfo() {
        a(q0.s());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceDetail(CRPWatchFaceDetailsRequestInfo cRPWatchFaceDetailsRequestInfo, CRPWatchFaceDetailsCallback cRPWatchFaceDetailsCallback) {
        new com.crrepa.f1.a().a(cRPWatchFaceDetailsRequestInfo, cRPWatchFaceDetailsCallback);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceElementInfo() {
        a(q0.t());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceLayout(CRPDeviceWatchFaceLayoutCallback cRPDeviceWatchFaceLayoutCallback) {
        this.f12937d.a(cRPDeviceWatchFaceLayoutCallback);
        a(l2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceList(CRPDeviceWatchFaceListCallback cRPDeviceWatchFaceListCallback) {
        this.f12937d.a(cRPDeviceWatchFaceListCallback);
        a(q0.g());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceOfID(int i8, CRPWatchFaceDetailsCallback cRPWatchFaceDetailsCallback) {
        new com.crrepa.f1.b(cRPWatchFaceDetailsCallback).a(i8);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceScreenInfo(CRPWatchFaceScreenCallback cRPWatchFaceScreenCallback) {
        this.f12937d.a(cRPWatchFaceScreenCallback);
        a(q0.u());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceStore(List<Integer> list, String str, int i8, int i9, CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback) {
        new com.crrepa.f1.c(cRPWatchFaceStoreCallback).a(list, str, i8, i9);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceStoreList(CRPWatchFaceStoreRequestInfo cRPWatchFaceStoreRequestInfo, int i8, CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback) {
        new com.crrepa.f1.a().a(cRPWatchFaceStoreRequestInfo, i8, cRPWatchFaceStoreCallback);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceStoreTagList(CRPWatchFaceStoreRequestInfo cRPWatchFaceStoreRequestInfo, CRPWatchFaceStoreTagCallback cRPWatchFaceStoreTagCallback) {
        new com.crrepa.f1.a().a(cRPWatchFaceStoreRequestInfo, cRPWatchFaceStoreTagCallback);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceTimeStyle(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyleCallback cRPWatchFaceTimeStyleCallback) {
        this.f12937d.a(cRPWatchFaceTimeStyleCallback);
        a(q0.b(cRPWatchFaceType));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWhatsappConfig() {
        a(u0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWorldClock(byte b8) {
        a(y0.b(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    @SuppressLint({"MissingPermission"})
    public void readDeviceRssi() {
        BluetoothGatt a8 = com.crrepa.l.a.b().a();
        if (a8 != null) {
            a8.readRemoteRssi();
        }
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void removeBond(CRPRemoveBondCallback cRPRemoveBondCallback) {
        this.f12935b.a(cRPRemoveBondCallback);
        this.f12935b.c(o1.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void reset() {
        this.f12935b.c(g2.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void resetHisiliconWatchFace(CRPWatchFaceType cRPWatchFaceType) {
        a(q0.c(cRPWatchFaceType));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void resetStockList(byte[] bArr) {
        a(com.crrepa.f.i0.a(bArr));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void resetWorldClockList(byte[] bArr) {
        a(y0.a(bArr));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendA2DPState(CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState) {
        a(p.a(a2DPConnectState));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiAgentActivateRecording() {
        a(com.crrepa.f.d.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiAgentError(CRPChatErrorCode cRPChatErrorCode) {
        a(com.crrepa.f.d.a(cRPChatErrorCode));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiAgentQuestion(byte b8, String str) {
        a(com.crrepa.f.d.a(b8, str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiAgentResponse(byte b8, String str) {
        com.crrepa.f.d.a(this.f12935b, b8, str);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiPhotoWatchFace(CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.e1.a p8 = com.crrepa.e1.a.p();
        p8.a(cRPFileTransListener);
        p8.a(cRPPhotoWatchFaceInfo, true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiPhotoWatchFaceLayout(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        a(l.a(cRPJieliWatchFaceLayoutInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiWatchFace(CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.o0.a.a().abort();
        g.c();
        com.crrepa.o.a.c().a((com.crrepa.l0.b) null);
        com.crrepa.l0.b a8 = com.crrepa.c1.g.a(cRPWatchFaceBackgroundInfo.getType(), false);
        a8.a(cRPWatchFaceBackgroundInfo.getBitmap(), cRPWatchFaceBackgroundInfo.getThumBitmap());
        a8.c(false);
        a8.j(cRPWatchFaceBackgroundInfo.getTimeout());
        a8.a(cRPFileTransListener);
        a8.l();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiWatchFaceActivateRecording() {
        this.f12935b.c(l.f());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiWatchFaceDescribe(String str) {
        this.f12935b.c(l.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiWatchFaceError(CRPChatErrorCode cRPChatErrorCode) {
        this.f12935b.c(l.a(cRPChatErrorCode));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiWatchFaceLayout(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        a(l.a(cRPWatchFaceLayoutInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiWatchFacePreview(CRPWatchFaceLayoutInfo.CompressionType compressionType, Bitmap bitmap, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.o0.a.a().abort();
        BleLog.d("sendAiWatchFacePreview bitmap: " + bitmap.getWidth() + "x" + bitmap.getHeight());
        g.c();
        com.crrepa.o.a.c().a((com.crrepa.l0.b) null);
        com.crrepa.l0.b a8 = com.crrepa.c1.g.a(compressionType, true);
        a8.a(bitmap);
        a8.c(false);
        a8.j(30);
        a8.a(cRPFileTransListener);
        a8.l();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAlarm(CRPAlarmInfo cRPAlarmInfo) {
        if (cRPAlarmInfo != null) {
            a(t.b(cRPAlarmInfo));
        }
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendBatterySaving(boolean z7) {
        a(f0.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendBondState(boolean z7) {
        this.f12935b.c(r0.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendBoundVibration() {
        a(v0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendBreathingLight(boolean z7) {
        a(c1.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendBrightness(int i8) {
        a(i1.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendCalendarEvent(CRPCalendarEventInfo cRPCalendarEventInfo) {
        a(r1.a(cRPCalendarEventInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendCalendarEventReminderTime(boolean z7, int i8) {
        a(r1.a(z7, i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendCall0ffHook() {
        this.f12935b.c(g4.a.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendCallContactName(String str, int i8) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(g4.a.a(str, i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendChatActivateRecording() {
        this.f12935b.c(k.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendChatError(CRPChatErrorCode cRPChatErrorCode) {
        this.f12935b.c(k.a(cRPChatErrorCode));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendChatQuestion(String str) {
        this.f12935b.c(k.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendChatResponse(String str) {
        k.a(this.f12935b, str);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendConnectKitFile(CRPConnectKitMessage cRPConnectKitMessage, CRPFileTransListener cRPFileTransListener) {
        BleLog.d("sendConnectKitFile: " + cRPConnectKitMessage);
        com.crrepa.s.a.b().a(cRPConnectKitMessage, cRPFileTransListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendConnectKitMessage(CRPConnectKitMessage cRPConnectKitMessage) {
        com.crrepa.s.b.b(cRPConnectKitMessage);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendContact(CRPContactInfo cRPContactInfo) {
        a(v.a(cRPContactInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendContactAvatar(int i8, Bitmap bitmap, int i9, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.o0.a.a().abort();
        g.c();
        com.crrepa.n0.a aVar = (com.crrepa.n0.a) com.crrepa.b1.i.a(i.b.AVATAR);
        aVar.a((byte) i8, bitmap);
        aVar.j(i9);
        aVar.a(cRPFileTransListener);
        aVar.l();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendCurrentBarometer(int i8) {
        a(b0.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendCurrentTimezone() {
        a(z1.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendCurrentVolume(int i8) {
        this.f12935b.g(i2.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendCustomKey(CRPCustomKeyInfo cRPCustomKeyInfo) {
        a(a2.a(cRPCustomKeyInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDailyGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        a(d2.a(cRPDailyGoalsInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDeviceLanguage(byte b8) {
        a(p1.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDeviceVersion(byte b8) {
        a(j2.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDislpayDeviceFunction(CRPFunctionInfo cRPFunctionInfo) {
        if (cRPFunctionInfo == null) {
            return;
        }
        a(g0.a(cRPFunctionInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDisplayTime(int i8) {
        a(com.crrepa.f.e.a((byte) i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDisplayWatchFace(byte b8) {
        a(q0.b(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDoNotDistrubTime(CRPPeriodTimeInfo cRPPeriodTimeInfo) {
        if (cRPPeriodTimeInfo == null) {
            return;
        }
        a(com.crrepa.f.i.a(cRPPeriodTimeInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDominantHand(byte b8) {
        a(m.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDrinkWaterGoals(int i8) {
        a(q.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendDrinkWaterReminder(CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo) {
        a(q.a(cRPDrinkWaterPeriodInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendECGHeartRate(int i8) {
        a(u.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendElectronicCard(CRPElectronicCardInfo cRPElectronicCardInfo) {
        a(y.a(cRPElectronicCardInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendElectronicCardList(List<Integer> list) {
        a(y.a(list));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendEpoFile(File file, CRPEpoType cRPEpoType, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.o0.a a8 = com.crrepa.o0.a.a();
        a8.a(cRPFileTransListener);
        a8.a(cRPEpoType, file);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendFixedPhotoWatchFace(int i8, Bitmap bitmap, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.q0.f fVar = new com.crrepa.q0.f();
        fVar.a(cRPFileTransListener);
        fVar.a(bitmap, i8);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendFlashNotification(Boolean bool) {
        a(s.a(bool));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendFutureWeather(CRPFutureWeatherInfo cRPFutureWeatherInfo) {
        if (cRPFutureWeatherInfo != null) {
            a(com.crrepa.f.c.a(cRPFutureWeatherInfo));
        }
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendGallery(List<File> list, CRPGalleryTransListener cRPGalleryTransListener) {
        com.crrepa.q0.d.c().a(list, cRPGalleryTransListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendGoalSteps(int i8) {
        a(o0.a(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendGomoreKey(String str) {
        a(s0.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendGsensorCalibration() {
        a(k0.a());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendHandWashingReminder(CRPHandWashingPeriodInfo cRPHandWashingPeriodInfo) {
        a(a1.a(cRPHandWashingPeriodInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendHealthAnalysis(CRPHealthSuggestionInfo cRPHealthSuggestionInfo) {
        Map<Integer, String> suggestionMap;
        if (cRPHealthSuggestionInfo == null) {
            return;
        }
        int code = cRPHealthSuggestionInfo.getCode();
        if (code == 1 && (suggestionMap = cRPHealthSuggestionInfo.getSuggestionMap()) != null && !suggestionMap.isEmpty()) {
            for (Map.Entry<Integer, String> entry : suggestionMap.entrySet()) {
                h.a(this.f12935b, entry.getKey().byteValue(), entry.getValue());
            }
        }
        this.f12935b.c(h.a(code));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendHealthReport(CRPHealthSuggestionInfo cRPHealthSuggestionInfo) {
        Map<Integer, String> suggestionMap;
        if (cRPHealthSuggestionInfo == null) {
            return;
        }
        int code = cRPHealthSuggestionInfo.getCode();
        if (code == 1 && (suggestionMap = cRPHealthSuggestionInfo.getSuggestionMap()) != null && !suggestionMap.isEmpty()) {
            for (Map.Entry<Integer, String> entry : suggestionMap.entrySet()) {
                h.b(this.f12935b, entry.getKey().byteValue(), entry.getValue());
            }
        }
        this.f12935b.c(h.b(code));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendHisiliconAiWatchFace(CRPFileTransListener cRPFileTransListener) {
        com.crrepa.q0.a c8 = com.crrepa.q0.a.c();
        c8.a(cRPFileTransListener);
        c8.g();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendHisiliconAiWatchFacePreview(Bitmap bitmap, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.q0.a c8 = com.crrepa.q0.a.c();
        c8.a(cRPFileTransListener);
        c8.a(bitmap);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendHisiliconChatQuestion(String str) {
        this.f12935b.b(com.crrepa.r.b.b(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendHisiliconChatResponse(String str) {
        this.f12935b.b(com.crrepa.r.b.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendHisiliconEpoFile(File file, CRPHisiliconEpoInfo cRPHisiliconEpoInfo, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.q0.c cVar = new com.crrepa.q0.c();
        cVar.a(cRPFileTransListener);
        cVar.a(cRPHisiliconEpoInfo, file);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendJieliPhotoWatchFace(CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.e1.a p8 = com.crrepa.e1.a.p();
        p8.a(cRPFileTransListener);
        p8.a(cRPPhotoWatchFaceInfo, false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendJieliPhotoWatchFaceLayout(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        a(q0.a(cRPJieliWatchFaceLayoutInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendJieliWatchFaceId(int i8, boolean z7) {
        a(q0.a(i8, z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendLocalCity(String str) {
        a(s1.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendLocalLocation(double d8, double d9) {
        a(w0.a(d8, d9));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendLocalNavigationInfo(CRPLocalNavigationInfo cRPLocalNavigationInfo) {
        com.crrepa.t.a.a().a(cRPLocalNavigationInfo);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendLocalVideo(File file, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.s0.c a8 = com.crrepa.s0.d.a().a((byte) 15);
        a8.a(cRPFileTransListener);
        a8.a(file);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendLyrics(String str) {
        this.f12935b.c(b1.a((byte) 1, str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMaxVolume(int i8) {
        this.f12935b.c(i2.b(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMessage(CRPMessageInfo cRPMessageInfo) {
        this.f12935b.c(g4.a.a(cRPMessageInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMetricSystem(byte b8) {
        a(b2.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMusic(CRPMcuPlatform cRPMcuPlatform, String str, File file, String str2, CRPFileTransListener cRPFileTransListener) {
        CRPMusicTrainsInitiator.getInstance().start(cRPMcuPlatform, str, file, str2, cRPFileTransListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMuslimLocation(CRPMuslimLocationInfo cRPMuslimLocationInfo) {
        a(k2.a(cRPMuslimLocationInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMuslimNameState(boolean z7, List<Integer> list) {
        a(k2.a(z7, list));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMuslimPrayerCalculationType(CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo) {
        a(k2.a(cRPMuslimPrayerCalculationInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMuslimPrayerCompensation(byte[] bArr) {
        a(k2.a(bArr));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMuslimPrayerNotification(boolean z7, Map<CRPMuslimPrayerNotifcationType, Boolean> map) {
        a(k2.a(z7, map));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMuslimPrayersState(boolean z7, List<Integer> list) {
        a(k2.b(z7, list));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendMuslimTasbihSetting(CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo) {
        a(k2.a(cRPMuslimTasbihSettingInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendNewAlarm(CRPAlarmInfo cRPAlarmInfo) {
        if (cRPAlarmInfo != null) {
            a(t.a(cRPAlarmInfo));
        }
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendNewDeviceName(String str) {
        a(g2.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendNewDrinkWaterReminder(CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo) {
        a(q.a(cRPNewDrinkWaterPeriodInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendOfflineVoiceCertification(byte[] bArr) {
        this.f12935b.f(bArr);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendOtherMessageState(boolean z7) {
        a(com.crrepa.f.f.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPhotoWatchFace(List<File> list, Bitmap bitmap, CRPPhotoWatchFaceTransListener cRPPhotoWatchFaceTransListener) {
        new com.crrepa.q0.g().a(list, bitmap, cRPPhotoWatchFaceTransListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPhotoWatchFaceDisplayMode(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode) {
        a(q0.a(cRPPhotoWatchFaceDisplayMode));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPhotoWatchFaceOrder(List<String> list) {
        a(q0.a(list));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPhysiologcalPeriod(CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo) {
        a(n.a(cRPPhysiologcalPeriodInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPillReminder(CRPPillReminderInfo cRPPillReminderInfo) {
        a(r.a(cRPPillReminderInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPlayAiAgentResponseComplete() {
        a(com.crrepa.f.d.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPlayAiAgentResponseError() {
        a(com.crrepa.f.d.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPlayChatResponseComplete() {
        this.f12935b.c(k.e());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendPlayChatResponseError() {
        this.f12935b.c(k.f());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendQuickResponses(CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo) {
        a(z.a(cRPQuickResponsesDetailInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendQuickView(boolean z7) {
        a(d0.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendQuickViewTime(CRPPeriodTimeInfo cRPPeriodTimeInfo) {
        if (cRPPeriodTimeInfo == null) {
            return;
        }
        a(h0.a(cRPPeriodTimeInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendSedentaryReminder(boolean z7) {
        a(p0.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendSedentaryReminderPeriod(CRPSedentaryReminderPeriodInfo cRPSedentaryReminderPeriodInfo) {
        a(l0.a(cRPSedentaryReminderPeriodInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendSleepTime(byte b8, byte b9) {
        a(x0.a(b8, b9));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendSongTitle(String str) {
        this.f12935b.c(b1.a((byte) 0, str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendSosPresetInfo(CRPSosInfo cRPSosInfo) {
        a(e1.a(cRPSosInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendStepLength(byte b8) {
        a(k1.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendStock(CRPStockInfo cRPStockInfo) {
        a(com.crrepa.f.i0.a(cRPStockInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendStockPrice(CRPStockPriceInfo cRPStockPriceInfo) {
        a(com.crrepa.f.i0.a(cRPStockPriceInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendTapToWakeState(boolean z7) {
        a(q1.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendTempUnit(byte b8) {
        a(w1.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendTimeSystem(byte b8) {
        a(z1.a((int) b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendTodayWaterIntake(int i8) {
        a(q.b(i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendTodayWaterIntakeHistory(List<CRPWaterIntakeInfo> list) {
        a(q.a(list));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendTodayWeather(CRPTodayWeatherInfo cRPTodayWeatherInfo) {
        if (cRPTodayWeatherInfo == null || TextUtils.isEmpty(cRPTodayWeatherInfo.getCity())) {
            return;
        }
        a(com.crrepa.f.c.b(cRPTodayWeatherInfo));
        a(com.crrepa.f.c.a(cRPTodayWeatherInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendTrainingDayGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        a(d2.b(cRPDailyGoalsInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendTrainingDays(CRPTrainingDayInfo cRPTrainingDayInfo) {
        a(d2.a(cRPTrainingDayInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendUserInfo(CRPUserInfo cRPUserInfo) {
        a(f2.a(cRPUserInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendUserMode() {
        a(g2.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendVibrationStrength(CRPVibrationStrength cRPVibrationStrength) {
        a(m0.a(cRPVibrationStrength));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendVideoWatchFace(File file, Bitmap bitmap, Bitmap bitmap2, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.q0.i a8 = com.crrepa.q0.i.a();
        a8.a(cRPFileTransListener);
        a8.a(file, bitmap, bitmap2);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendVideoWatchFaceDisplayMode(CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode) {
        a(q0.a(cRPVideoWatchFaceDisplayMode));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendVideoWatchFaceThumbnail(String str, Bitmap bitmap, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.q0.i a8 = com.crrepa.q0.i.a();
        a8.a(cRPFileTransListener);
        a8.a(str, bitmap);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWatchFace(CRPWatchFaceInfo cRPWatchFaceInfo, CRPWatchFaceTransListener cRPWatchFaceTransListener, int i8) {
        com.crrepa.o0.a.a().abort();
        com.crrepa.o.a.c().a((com.crrepa.l0.b) null);
        g.a(cRPWatchFaceInfo, cRPWatchFaceTransListener, i8);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWatchFaceBackground(CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo, CRPFileTransListener cRPFileTransListener) {
        com.crrepa.o0.a.a().abort();
        g.c();
        com.crrepa.l0.b a8 = com.crrepa.b1.i.a(com.crrepa.b1.i.a(cRPWatchFaceBackgroundInfo.getType()));
        a8.a(cRPWatchFaceBackgroundInfo.getBitmap(), cRPWatchFaceBackgroundInfo.getThumBitmap());
        a8.c(false);
        a8.j(cRPWatchFaceBackgroundInfo.getTimeout());
        a8.a(cRPFileTransListener);
        a8.l();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWatchFaceLayout(CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo) {
        a(q0.a(cRPHisiliconWatchFaceLayoutInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWatchFaceTimeStyle(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
        a(q0.a(cRPWatchFaceType, cRPWatchFaceTimeStyle));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWhatsappContacts(List<String> list) {
        this.f12935b.c(u0.a(list));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWhatsappMessage(CRPWhatsappReceiveMessageInfo cRPWhatsappReceiveMessageInfo) {
        this.f12935b.c(u0.a(cRPWhatsappReceiveMessageInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWhatsappState(CRPWhatsappStateInfo cRPWhatsappStateInfo) {
        this.f12935b.c(u0.a(cRPWhatsappStateInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWorldClock(CRPWorldClockInfo cRPWorldClockInfo) {
        a(y0.a(cRPWorldClockInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setA2DPConnectStateListener(CRPA2DPConnectStateListener cRPA2DPConnectStateListener) {
        this.f12937d.a(cRPA2DPConnectStateListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setAiAgentListener(CRPAiAgentListener cRPAiAgentListener) {
        this.f12937d.a(cRPAiAgentListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setAiWatchFaceListener(CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener) {
        this.f12937d.a(cRPAiWatchFaceChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setAppChangeListener(CRPAppChangeListener cRPAppChangeListener) {
        com.crrepa.n.a.a().a(cRPAppChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setBarometerCalibrationListener(CRPBarometerCalibrationListener cRPBarometerCalibrationListener) {
        this.f12937d.a(cRPBarometerCalibrationListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setBatterySavingListener(CRPBatterySavingChangeListener cRPBatterySavingChangeListener) {
        this.f12937d.a(cRPBatterySavingChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setBloodOxygenChangeListener(CRPBloodOxygenChangeListener cRPBloodOxygenChangeListener) {
        this.f12937d.a(cRPBloodOxygenChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setBloodPressureChangeListener(CRPBloodPressureChangeListener cRPBloodPressureChangeListener) {
        this.f12937d.a(cRPBloodPressureChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setBreathRateListener(CRPBreathRateChangeListener cRPBreathRateChangeListener) {
        this.f12937d.a(cRPBreathRateChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setCalendarEventListener(CRPCalendarEventListener cRPCalendarEventListener) {
        this.f12937d.a(cRPCalendarEventListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setCallNumberListener(CRPCallNumberListener cRPCallNumberListener) {
        this.f12937d.a(cRPCallNumberListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setCaloriesCategoryListener(CRPCaloriesCategoryChangeListener cRPCaloriesCategoryChangeListener) {
        this.f12937d.a(cRPCaloriesCategoryChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setCameraOperationListener(CRPCameraOperationListener cRPCameraOperationListener) {
        this.f12937d.a(cRPCameraOperationListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setChatListener(CRPChatChangeListener cRPChatChangeListener) {
        this.f12937d.a(cRPChatChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setConnectKitListener(CRPConnectKitListener cRPConnectKitListener) {
        com.crrepa.s.c.a().a(cRPConnectKitListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setConnectionStateListener(CRPBleConnectionStateListener cRPBleConnectionStateListener) {
        this.f12934a.a(cRPBleConnectionStateListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setContactListener(CRPContactListener cRPContactListener) {
        this.f12937d.a(cRPContactListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setCustomKeyListener(CRPCustomKeyChangeListener cRPCustomKeyChangeListener) {
        this.f12937d.a(cRPCustomKeyChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setDeviceBatteryListener(CRPDeviceBatteryListener cRPDeviceBatteryListener) {
        com.crrepa.n.b.a().a(cRPDeviceBatteryListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setDeviceRssiListener(CRPDeviceRssiListener cRPDeviceRssiListener) {
        this.f12934a.a(cRPDeviceRssiListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setDistanceCategoryListener(CRPDistanceCategoryChangeListener cRPDistanceCategoryChangeListener) {
        this.f12937d.a(cRPDistanceCategoryChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setDrinkWaterListener(CRPDeviceDrinkWaterListener cRPDeviceDrinkWaterListener) {
        this.f12937d.a(cRPDeviceDrinkWaterListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setECGChangeListener(CRPBleECGChangeListener cRPBleECGChangeListener, CRPEcgMeasureType cRPEcgMeasureType) {
        this.f12937d.a(cRPBleECGChangeListener, cRPEcgMeasureType);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setEmojiChangeListener(CRPEmojiChangeListener cRPEmojiChangeListener) {
        this.f12937d.a(cRPEmojiChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setFindPhoneListener(CRPFindPhoneListener cRPFindPhoneListener) {
        this.f12937d.a(cRPFindPhoneListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setGalleryChangeListener(CRPGalleryChangeListener cRPGalleryChangeListener) {
        this.f12937d.a(cRPGalleryChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setGomoreListener(CRPGomoreListener cRPGomoreListener) {
        this.f12937d.a(cRPGomoreListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setGpsChangeListener(CRPGpsChangeListener cRPGpsChangeListener) {
        this.f12937d.a(cRPGpsChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setHealthAnalysisListener(CRPHealthAnalysisListener cRPHealthAnalysisListener) {
        this.f12937d.a(cRPHealthAnalysisListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setHeartRateChangeListener(CRPHeartRateChangeListener cRPHeartRateChangeListener) {
        this.f12937d.a(cRPHeartRateChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setHisiliconAIWatchFaceListener(CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener) {
        com.crrepa.n.d.a().a(cRPAiWatchFaceChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setHisiliconAiWatchFace(Bitmap bitmap, Bitmap bitmap2) {
        com.crrepa.q0.a.c().a(bitmap, bitmap2);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setHisiliconChatListener(CRPChatChangeListener cRPChatChangeListener) {
        com.crrepa.n.d.a().a(cRPChatChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setHrvChangeListener(CRPHrvChangeListener cRPHrvChangeListener) {
        this.f12937d.a(cRPHrvChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setLocalNavigationListener(CRPLocalNavigationListener cRPLocalNavigationListener) {
        this.f12937d.a(cRPLocalNavigationListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setLocalVideoChangeListener(CRPLocalVideoChangeListener cRPLocalVideoChangeListener) {
        this.f12937d.a(cRPLocalVideoChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setMaxHeartRate(byte b8, boolean z7) {
        a(d1.a(b8, z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setMovementState(byte b8) {
        this.f12935b.c(g1.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setMovementStateListener(CRPMovementStateListener cRPMovementStateListener) {
        this.f12937d.a(cRPMovementStateListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setMtu(CRPMtuChangeCallback cRPMtuChangeCallback, @IntRange(from = 23, to = 517) int i8) {
        this.f12934a.a(cRPMtuChangeCallback);
        com.crrepa.p.c.d().a(new com.crrepa.p.a(5, com.crrepa.g1.c.b(i8)));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setMusicChangeListener(CRPMusicChangeListener cRPMusicChangeListener) {
        this.f12937d.a(cRPMusicChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setMusicPlayerState(byte b8) {
        this.f12935b.c(h2.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setMuslimNameListener(CRPMuslimNameListener cRPMuslimNameListener) {
        this.f12937d.a(cRPMuslimNameListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setMuslimPrayerSettingListener(CRPMuslimPrayerSettingListener cRPMuslimPrayerSettingListener) {
        this.f12937d.a(cRPMuslimPrayerSettingListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setNewHrvListener(CRPNewHrvChangeListener cRPNewHrvChangeListener) {
        this.f12937d.a(cRPNewHrvChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setOfflineVoiceListener(CRPOfflineVoiceListener cRPOfflineVoiceListener) {
        this.f12937d.a(cRPOfflineVoiceListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setPhoneOperationListener(CRPPhoneOperationListener cRPPhoneOperationListener) {
        this.f12937d.a(cRPPhoneOperationListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setPhotoWatchFaceListener(CRPPhotoWatchFaceChangeListener cRPPhotoWatchFaceChangeListener) {
        this.f12937d.a(cRPPhotoWatchFaceChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setQuickResponsesListener(CRPQuickResponsesChangeListener cRPQuickResponsesChangeListener) {
        this.f12937d.a(cRPQuickResponsesChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setScreenOffClockListener(CRPScreenOffClockListener cRPScreenOffClockListener) {
        this.f12937d.a(cRPScreenOffClockListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setScreenOffClockTime(CRPPeriodTimeInfo cRPPeriodTimeInfo) {
        a(e0.a(cRPPeriodTimeInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setSleepActionChangeListener(CRPSleepActionChangeListener cRPSleepActionChangeListener) {
        this.f12937d.a(cRPSleepActionChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setSleepChangeListener(CRPSleepChangeListener cRPSleepChangeListener) {
        this.f12937d.a(cRPSleepChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setSosChangeListener(CRPSosChangeListener cRPSosChangeListener) {
        this.f12937d.a(cRPSosChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setStepChangeListener(CRPStepChangeListener cRPStepChangeListener) {
        this.f12937d.a(cRPStepChangeListener);
        this.f12936c.a(cRPStepChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setStepsCategoryListener(CRPStepsCategoryChangeListener cRPStepsCategoryChangeListener) {
        this.f12937d.a(cRPStepsCategoryChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setStockListener(CRPStockChangeListener cRPStockChangeListener) {
        this.f12937d.a(cRPStockChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setStressListener(CRPStressListener cRPStressListener) {
        this.f12937d.a(cRPStressListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setTempChangeListener(CRPTempChangeListener cRPTempChangeListener) {
        this.f12937d.a(cRPTempChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setTrainingListener(CRPTrainingChangeListener cRPTrainingChangeListener) {
        this.f12937d.a(cRPTrainingChangeListener);
        com.crrepa.n.e.a().f();
        com.crrepa.n.e.a().a(cRPTrainingChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setVideoWatchFaceListener(CRPVideoWatchFaceChangeListener cRPVideoWatchFaceChangeListener) {
        this.f12937d.a(cRPVideoWatchFaceChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setWeatherChangeListener(CRPWeatherChangeListener cRPWeatherChangeListener) {
        this.f12937d.a(cRPWeatherChangeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setWhatsappListener(CRPWhatsappListener cRPWhatsappListener) {
        this.f12937d.a(cRPWhatsappListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void setWorldClockListener(CRPWorldClockListener cRPWorldClockListener) {
        this.f12937d.a(cRPWorldClockListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void shutDown() {
        a(g2.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startBreathingTraining(CRPBreathingTrainingInfo cRPBreathingTrainingInfo) {
        a(f1.a(cRPBreathingTrainingInfo));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startECGMeasure() {
        a(1);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startFindPhone() {
        a(c0.a(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startFirmwareUpgrade(boolean z7, CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        com.crrepa.w0.c.c().a(z7, cRPBleFirmwareUpgradeListener);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startLocalNavigation(boolean z7) {
        this.f12935b.c(v1.a(z7));
        com.crrepa.t.a.a().d();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeasureBloodOxygen() {
        c(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeasureBloodPressure() {
        a(n0.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeasureDynamicRate() {
        a(g1.a(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeasureHrv() {
        a(j1.a(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeasureNewHrv() {
        a(com.crrepa.f.b.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeasureOnceHeartRate() {
        g(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeasureStress() {
        a(n1.a(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeasureTemp() {
        b(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMeatureBreathRate() {
        a(z0.b(true));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startMovement(byte b8) {
        this.f12935b.c(g1.a(b8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startPlayAiAgentResponse() {
        a(com.crrepa.f.d.e());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void startPlayChatResponse() {
        this.f12935b.c(k.g());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopECGMeasure() {
        a(0);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopFindPhone() {
        a(c0.a(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopLocalNavigation(boolean z7) {
        this.f12935b.c(v1.b(z7));
        com.crrepa.t.a.a().e();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeasureBloodOxygen() {
        c(false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeasureBloodPressure() {
        a(n0.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeasureDynamicRtae() {
        a(g1.a(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeasureHrv() {
        a(j1.a(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeasureNewHrv() {
        a(com.crrepa.f.b.c());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeasureOnceHeartRate() {
        g(false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeasureStress() {
        a(n1.a(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeasureTemp() {
        b(false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopMeatureBreathRate() {
        a(z0.b(false));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopPlayAiAgentResponse() {
        a(com.crrepa.f.d.f());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void stopPlayChatResponse() {
        this.f12935b.c(k.h());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void subscribeDeviceBattery() {
        com.crrepa.p.c.d().a(new com.crrepa.p.a(4, new byte[]{32}));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void syncRemSleep() {
        a(true);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void syncSleep() {
        a(false);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void syncStep() {
        this.f12936c.g();
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void syncTime() {
        this.f12935b.c(z1.b());
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void uninstallApp(String str) {
        com.crrepa.n.a.a().a(false);
        this.f12935b.c(x.a(str));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void updateWaterIntake(CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        a(q.b(cRPWaterIntakeInfo));
    }

    private void a(int i8) {
        a(u.b(i8));
    }

    private void b(boolean z7) {
        a(t1.b(z7));
    }

    private void c(boolean z7) {
        a(j0.a(z7));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void createBond(byte[] bArr, boolean z7, int i8, CRPDeviceBondStateCallback cRPDeviceBondStateCallback) {
        this.f12937d.a(cRPDeviceBondStateCallback);
        this.f12935b.c(r0.a(bArr, z7, i8));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void queryWatchFaceLayout(CRPWatchFaceType cRPWatchFaceType) {
        a(q0.a(cRPWatchFaceType));
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendAiAgentResponse(byte b8, String str, int i8, boolean z7) {
        com.crrepa.f.d.a(this.f12935b, b8, str, (byte) i8, z7);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendChatResponse(String str, int i8, boolean z7) {
        k.a(this.f12935b, str, (byte) i8, z7);
    }

    @Override // com.crrepa.ble.conn.CRPBleConnection
    public void sendWatchFaceLayout(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        if (cRPWatchFaceLayoutInfo == null) {
            return;
        }
        a(l2.a(cRPWatchFaceLayoutInfo));
    }

    protected void a(d dVar) {
        this.f12934a = dVar;
        this.f12936c = dVar.b();
        this.f12937d = this.f12934a.a();
        com.crrepa.p.c.d().a(this.f12936c);
    }

    private void a(boolean z7) {
        this.f12937d.b(z7);
        a(x0.b());
        a(x0.b(CRPHistoryDay.TODAY.getValue()));
    }

    private void a(boolean z7, CRPHistoryDay cRPHistoryDay) {
        this.f12937d.a(z7);
        byte value = cRPHistoryDay.getValue();
        a(x0.a(value));
        a(x0.b(value));
    }

    private void a(byte[] bArr) {
        this.f12935b.a(bArr);
    }
}
