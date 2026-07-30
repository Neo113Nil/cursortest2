package com.crrepa.m;

import android.bluetooth.BluetoothGattCharacteristic;
import android.text.TextUtils;
import com.baidu.ar.marker.MarkerErrorCode;
import com.crrepa.ble.conn.bean.CRPBloodOxygenInfo;
import com.crrepa.ble.conn.bean.CRPBloodPressureInfo;
import com.crrepa.ble.conn.bean.CRPCaloriesCategoryInfo;
import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.bean.CRPDeviceInfo;
import com.crrepa.ble.conn.bean.CRPDistanceCategoryInfo;
import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPFunctionInfo;
import com.crrepa.ble.conn.bean.CRPGalleryInfo;
import com.crrepa.ble.conn.bean.CRPGpsPathInfo;
import com.crrepa.ble.conn.bean.CRPHandWashingPeriodInfo;
import com.crrepa.ble.conn.bean.CRPHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBloodOxygenInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBloodPressureInfo;
import com.crrepa.ble.conn.bean.CRPHistoryHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPHrvInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPLocalNavigationIconInfo;
import com.crrepa.ble.conn.bean.CRPLocalVideoInfo;
import com.crrepa.ble.conn.bean.CRPMovementHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPMuslimPrayerCalculationInfo;
import com.crrepa.ble.conn.bean.CRPMuslimTasbihSettingInfo;
import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.crrepa.ble.conn.bean.CRPNewDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPPerformanceInsightsInfo;
import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import com.crrepa.ble.conn.bean.CRPSedentaryReminderPeriodInfo;
import com.crrepa.ble.conn.bean.CRPSleepActionInfo;
import com.crrepa.ble.conn.bean.CRPSleepInfo;
import com.crrepa.ble.conn.bean.CRPStepsCategoryInfo;
import com.crrepa.ble.conn.bean.CRPSupportWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPTempInfo;
import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import com.crrepa.ble.conn.bean.CRPTrainingInfo;
import com.crrepa.ble.conn.bean.CRPTrainingRealtimeInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWaterIntakeInfo;
import com.crrepa.ble.conn.bean.CRPWhatsappConfigInfo;
import com.crrepa.ble.conn.bean.CRPWhatsappSendMessageInfo;
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
import com.crrepa.ble.conn.callback.CRPDeviceDisplayTimeCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDisplayWatchFaceCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDominantHandCallback;
import com.crrepa.ble.conn.callback.CRPDeviceFunctionCallback;
import com.crrepa.ble.conn.callback.CRPDeviceGoalStepCallback;
import com.crrepa.ble.conn.callback.CRPDeviceHandWashingPeriodCallback;
import com.crrepa.ble.conn.callback.CRPDeviceInfoCallback;
import com.crrepa.ble.conn.callback.CRPDeviceLanguageCallback;
import com.crrepa.ble.conn.callback.CRPDeviceMaxHeartRateCallback;
import com.crrepa.ble.conn.callback.CRPDeviceMetricSystemCallback;
import com.crrepa.ble.conn.callback.CRPDeviceNameCallback;
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
import com.crrepa.ble.conn.callback.CRPMuslimPrayerCompensationCallback;
import com.crrepa.ble.conn.callback.CRPMuslimTasbihSettingCallback;
import com.crrepa.ble.conn.callback.CRPPillReminderCallback;
import com.crrepa.ble.conn.callback.CRPSleepTimeCallback;
import com.crrepa.ble.conn.callback.CRPSosStateCallback;
import com.crrepa.ble.conn.callback.CRPTapToWakeCallback;
import com.crrepa.ble.conn.callback.CRPTimingTempStateCallback;
import com.crrepa.ble.conn.callback.CRPTrainingDayGoalsCallback;
import com.crrepa.ble.conn.callback.CRPVibrationStrengthCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceDeleteCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceScreenCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceTimeStyleCallback;
import com.crrepa.ble.conn.listener.CRPA2DPConnectStateListener;
import com.crrepa.ble.conn.listener.CRPAiAgentListener;
import com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener;
import com.crrepa.ble.conn.listener.CRPBarometerCalibrationListener;
import com.crrepa.ble.conn.listener.CRPBatterySavingChangeListener;
import com.crrepa.ble.conn.listener.CRPBleECGChangeListener;
import com.crrepa.ble.conn.listener.CRPBloodOxygenChangeListener;
import com.crrepa.ble.conn.listener.CRPBloodPressureChangeListener;
import com.crrepa.ble.conn.listener.CRPBreathRateChangeListener;
import com.crrepa.ble.conn.listener.CRPCalendarEventListener;
import com.crrepa.ble.conn.listener.CRPCallNumberListener;
import com.crrepa.ble.conn.listener.CRPCaloriesCategoryChangeListener;
import com.crrepa.ble.conn.listener.CRPCameraOperationListener;
import com.crrepa.ble.conn.listener.CRPChatChangeListener;
import com.crrepa.ble.conn.listener.CRPContactListener;
import com.crrepa.ble.conn.listener.CRPCustomKeyChangeListener;
import com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener;
import com.crrepa.ble.conn.listener.CRPDistanceCategoryChangeListener;
import com.crrepa.ble.conn.listener.CRPEmojiChangeListener;
import com.crrepa.ble.conn.listener.CRPFindPhoneListener;
import com.crrepa.ble.conn.listener.CRPGalleryChangeListener;
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
import com.crrepa.ble.conn.listener.CRPWeatherChangeListener;
import com.crrepa.ble.conn.listener.CRPWhatsappListener;
import com.crrepa.ble.conn.listener.CRPWorldClockListener;
import com.crrepa.ble.conn.type.CRPBleRecordingType;
import com.crrepa.ble.conn.type.CRPCustomKeyGameType;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.crrepa.ble.conn.type.CRPEcgMeasureType;
import com.crrepa.ble.conn.type.CRPEpoType;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import com.crrepa.ble.conn.type.CRPTempTimeType;
import com.crrepa.ble.conn.type.CRPVibrationStrength;
import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.crrepa.ble.trans.tp.CRPTpTransInitiator;
import com.crrepa.ble.trans.ui.CRPUiTransInitiator;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.b2;
import com.crrepa.f.j2;
import com.crrepa.f.z1;
import h4.a0;
import h4.b0;
import h4.c0;
import h4.d0;
import h4.e0;
import h4.f0;
import h4.g0;
import h4.h;
import h4.h0;
import h4.i;
import h4.i0;
import h4.j;
import h4.j0;
import h4.k;
import h4.k0;
import h4.l;
import h4.l0;
import h4.m;
import h4.m0;
import h4.n0;
import h4.o;
import h4.o0;
import h4.p;
import h4.p0;
import h4.q;
import h4.q0;
import h4.r;
import h4.r0;
import h4.s;
import h4.s0;
import h4.t;
import h4.t0;
import h4.u;
import h4.u0;
import h4.v;
import h4.v0;
import h4.w;
import h4.x;
import h4.y;
import h4.z;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends c {

    /* renamed from: r1, reason: collision with root package name */
    private static final int f13268r1 = 5;

    /* renamed from: s1, reason: collision with root package name */
    private static final int f13269s1 = 4;
    private CRPContactListener A;
    private CRPDeviceMaxHeartRateCallback A0;
    private CRPSosChangeListener B;
    private CRPTimingTempStateCallback B0;
    private CRPBatterySavingChangeListener C;
    private CRPDeviceDisplayTimeCallback C0;
    private CRPHrvChangeListener D;
    private CRPDeviceHandWashingPeriodCallback D0;
    private CRPCallNumberListener E;
    private CRPDeviceBrightnessCallback E0;
    private CRPTrainingChangeListener F;
    private CRPBtAddressCallback F0;
    private CRPA2DPConnectStateListener G;
    private CRPContactConfigCallback G0;
    private CRPStressListener H;
    private CRPDeviceBondStateCallback H0;
    private CRPNewHrvChangeListener I;
    private CRPContactCountCallback I0;
    private CRPCalendarEventListener J;
    private CRPDeviceWatchFaceListCallback J0;
    private CRPGpsChangeListener K;
    private CRPPillReminderCallback K0;
    private CRPBreathRateChangeListener L;
    private CRPTapToWakeCallback L0;
    private CRPQuickResponsesChangeListener M;
    private CRPDailyGoalsCallback M0;
    private CRPCustomKeyChangeListener N;
    private CRPTrainingDayGoalsCallback N0;
    private CRPWorldClockListener O;
    private CRPElectronicCardCountCallback O0;
    private CRPStockChangeListener P;
    private CRPElectronicCardCallback P0;
    private CRPChatChangeListener Q;
    private CRPMessageListCallback Q0;
    private CRPAiWatchFaceChangeListener R;
    private CRPContactNumberSymbolCallback R0;
    private CRPCaloriesCategoryChangeListener S;
    private CRPAvailableStorageCallback S0;
    private CRPDistanceCategoryChangeListener T;
    private CRPWatchFaceDeleteCallback T0;
    private CRPOfflineVoiceListener U;
    private CRPVibrationStrengthCallback U0;
    private CRPGomoreListener V;
    private CRPSleepTimeCallback V0;
    private CRPMusicChangeListener W;
    private CRPDeviceUIVersionCodeCallback W0;
    private CRPVideoWatchFaceChangeListener X;
    private CRPDeviceTestModeCallback X0;
    private CRPPhotoWatchFaceChangeListener Y;
    private CRPJieliWatchFaceCallback Y0;
    private CRPScreenOffClockListener Z;
    private CRPBluetrumWatchFaceCallback Z0;

    /* renamed from: a0, reason: collision with root package name */
    private CRPLocalVideoChangeListener f13271a0;

    /* renamed from: a1, reason: collision with root package name */
    private CRPMuslimTasbihSettingCallback f13272a1;

    /* renamed from: b0, reason: collision with root package name */
    private CRPGalleryChangeListener f13274b0;

    /* renamed from: b1, reason: collision with root package name */
    private CRPMuslimPrayerSettingListener f13275b1;

    /* renamed from: c0, reason: collision with root package name */
    private CRPBarometerCalibrationListener f13277c0;

    /* renamed from: c1, reason: collision with root package name */
    private CRPMuslimNameListener f13278c1;

    /* renamed from: d0, reason: collision with root package name */
    private CRPLocalNavigationListener f13280d0;

    /* renamed from: d1, reason: collision with root package name */
    private CRPConnectivityCheckCallback f13281d1;

    /* renamed from: e0, reason: collision with root package name */
    private CRPWhatsappListener f13283e0;

    /* renamed from: e1, reason: collision with root package name */
    private CRPEmojiChangeListener f13284e1;

    /* renamed from: f0, reason: collision with root package name */
    private CRPAlarmCallback f13286f0;

    /* renamed from: f1, reason: collision with root package name */
    private CRPSosStateCallback f13287f1;

    /* renamed from: g0, reason: collision with root package name */
    private CRPDeviceDominantHandCallback f13289g0;

    /* renamed from: g1, reason: collision with root package name */
    private CRPMessageLengthCallback f13290g1;

    /* renamed from: h0, reason: collision with root package name */
    private CRPDeviceGoalStepCallback f13292h0;

    /* renamed from: h1, reason: collision with root package name */
    private CRPFlashNotificationCallback f13293h1;

    /* renamed from: i, reason: collision with root package name */
    private com.crrepa.k.a f13294i;

    /* renamed from: i0, reason: collision with root package name */
    private CRPDeviceLanguageCallback f13295i0;

    /* renamed from: i1, reason: collision with root package name */
    private CRPWatchFaceScreenCallback f13296i1;

    /* renamed from: j0, reason: collision with root package name */
    private CRPDeviceMetricSystemCallback f13298j0;

    /* renamed from: j1, reason: collision with root package name */
    private CRPDeviceInfoCallback f13299j1;

    /* renamed from: k0, reason: collision with root package name */
    private CRPDeviceOtherMessageCallback f13301k0;

    /* renamed from: k1, reason: collision with root package name */
    private CRPWatchFaceTimeStyleCallback f13302k1;

    /* renamed from: l0, reason: collision with root package name */
    private CRPDeviceQuickViewCallback f13304l0;

    /* renamed from: l1, reason: collision with root package name */
    private CRPDeviceNameCallback f13305l1;

    /* renamed from: m, reason: collision with root package name */
    private CRPStepChangeListener f13306m;

    /* renamed from: m0, reason: collision with root package name */
    private CRPDeviceSedentaryReminderCallback f13307m0;

    /* renamed from: m1, reason: collision with root package name */
    private CRPMuslimPrayerCompensationCallback f13308m1;

    /* renamed from: n, reason: collision with root package name */
    private CRPSleepChangeListener f13309n;

    /* renamed from: n0, reason: collision with root package name */
    private CRPDeviceTimeSystemCallback f13310n0;

    /* renamed from: n1, reason: collision with root package name */
    private CRPAiAgentListener f13311n1;

    /* renamed from: o, reason: collision with root package name */
    private CRPHeartRateChangeListener f13312o;

    /* renamed from: o0, reason: collision with root package name */
    private CRPDeviceDisplayWatchFaceCallback f13313o0;

    /* renamed from: o1, reason: collision with root package name */
    private CRPHealthAnalysisListener f13314o1;

    /* renamed from: p, reason: collision with root package name */
    private CRPBloodPressureChangeListener f13315p;

    /* renamed from: p0, reason: collision with root package name */
    private CRPDeviceVersionCallback f13316p0;

    /* renamed from: q, reason: collision with root package name */
    private CRPBloodOxygenChangeListener f13318q;

    /* renamed from: q0, reason: collision with root package name */
    private CRPDeviceFunctionCallback f13319q0;

    /* renamed from: r, reason: collision with root package name */
    private CRPPhoneOperationListener f13321r;

    /* renamed from: r0, reason: collision with root package name */
    private CRPDevicePeriodTimeCallback f13322r0;

    /* renamed from: s, reason: collision with root package name */
    private CRPCameraOperationListener f13323s;

    /* renamed from: s0, reason: collision with root package name */
    private CRPDeviceTimingMeasureHeartRateCallback f13324s0;

    /* renamed from: t, reason: collision with root package name */
    private CRPWeatherChangeListener f13325t;

    /* renamed from: t0, reason: collision with root package name */
    private CRPDeviceBreathingLightCallback f13326t0;

    /* renamed from: u, reason: collision with root package name */
    private CRPFindPhoneListener f13327u;

    /* renamed from: u0, reason: collision with root package name */
    private CRPDeviceWatchFaceLayoutCallback f13328u0;

    /* renamed from: v, reason: collision with root package name */
    private CRPBleECGChangeListener f13329v;

    /* renamed from: v0, reason: collision with root package name */
    private CRPDeviceSedentaryReminderPeriodCallback f13330v0;

    /* renamed from: w, reason: collision with root package name */
    private CRPStepsCategoryChangeListener f13331w;

    /* renamed from: w0, reason: collision with root package name */
    private CRPDeviceSupportWatchFaceCallback f13332w0;

    /* renamed from: x, reason: collision with root package name */
    private CRPSleepActionChangeListener f13333x;

    /* renamed from: x0, reason: collision with root package name */
    private CRPDeviceDfuAddressCallback f13334x0;

    /* renamed from: y, reason: collision with root package name */
    private CRPMovementStateListener f13335y;

    /* renamed from: y0, reason: collision with root package name */
    private CRPDevicePhysiologcalPeriodCallback f13336y0;

    /* renamed from: z, reason: collision with root package name */
    private CRPTempChangeListener f13337z;

    /* renamed from: z0, reason: collision with root package name */
    private CRPDeviceDrinkWaterListener f13338z0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f13270a = true;

    /* renamed from: b, reason: collision with root package name */
    private int f13273b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f13276c = 0;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f13279d = null;

    /* renamed from: e, reason: collision with root package name */
    private o0 f13282e = new o0();

    /* renamed from: f, reason: collision with root package name */
    private f0 f13285f = new f0();

    /* renamed from: g, reason: collision with root package name */
    private s f13288g = new s();

    /* renamed from: h, reason: collision with root package name */
    private y f13291h = new y();

    /* renamed from: j, reason: collision with root package name */
    private j0 f13297j = new j0();

    /* renamed from: k, reason: collision with root package name */
    private k f13300k = new k();

    /* renamed from: l, reason: collision with root package name */
    private m f13303l = new m();

    /* renamed from: p1, reason: collision with root package name */
    private boolean f13317p1 = false;

    /* renamed from: q1, reason: collision with root package name */
    private boolean f13320q1 = false;

    private void A(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 2 || bArr[0] != 14) {
            return;
        }
        c();
    }

    private void A0(byte[] bArr) {
        if (bArr.length < 2) {
        }
        switch (bArr[1]) {
            case 0:
                CRPMuslimTasbihSettingInfo c8 = h4.a.c(bArr);
                CRPMuslimTasbihSettingCallback cRPMuslimTasbihSettingCallback = this.f13272a1;
                if (cRPMuslimTasbihSettingCallback != null && c8 != null) {
                    cRPMuslimTasbihSettingCallback.onTasbihSetting(c8);
                    break;
                }
                break;
            case 1:
                CRPMuslimPrayerSettingListener cRPMuslimPrayerSettingListener = this.f13275b1;
                if (cRPMuslimPrayerSettingListener != null) {
                    cRPMuslimPrayerSettingListener.updateLocation();
                    break;
                }
                break;
            case 2:
                CRPMuslimNameListener cRPMuslimNameListener = this.f13278c1;
                if (cRPMuslimNameListener != null) {
                    byte b8 = bArr[2];
                    if (b8 == 0) {
                        cRPMuslimNameListener.onNameStateChange(bArr[3] == 0, h4.a.a(bArr, 4));
                        break;
                    } else if (b8 == 2) {
                        cRPMuslimNameListener.onSavedNameChange(h4.a.a(bArr, 3));
                        break;
                    }
                }
                break;
            case 3:
                CRPMuslimPrayerSettingListener cRPMuslimPrayerSettingListener2 = this.f13275b1;
                if (cRPMuslimPrayerSettingListener2 != null) {
                    byte b9 = bArr[2];
                    if (b9 == 0) {
                        cRPMuslimPrayerSettingListener2.onPrayersStateChange(bArr[3] == 0, h4.a.c(bArr, 4));
                        break;
                    } else if (b9 == 2) {
                        cRPMuslimPrayerSettingListener2.onSavedPrayersChange(h4.a.c(bArr, 3));
                        break;
                    }
                }
                break;
            case 4:
                CRPMuslimPrayerSettingListener cRPMuslimPrayerSettingListener3 = this.f13275b1;
                if (cRPMuslimPrayerSettingListener3 != null) {
                    byte b10 = bArr[2];
                    if (b10 == 0 || b10 == 2) {
                        cRPMuslimPrayerSettingListener3.onNotificationChange(bArr[3] == 1, h4.a.b(bArr, 4));
                        break;
                    }
                }
                break;
            case 5:
                CRPMuslimPrayerCalculationInfo a8 = h4.a.a(bArr);
                CRPMuslimPrayerSettingListener cRPMuslimPrayerSettingListener4 = this.f13275b1;
                if (cRPMuslimPrayerSettingListener4 != null && a8 != null) {
                    cRPMuslimPrayerSettingListener4.onPrayerCalculationTypeChange(a8);
                    break;
                }
                break;
            case 6:
                if (bArr[2] == 1 && this.f13308m1 != null) {
                    this.f13308m1.onCompensationArray(h4.a.b(bArr));
                    break;
                }
                break;
        }
    }

    private void A1(byte[] bArr) {
        CRPWorldClockListener cRPWorldClockListener = this.O;
        if (cRPWorldClockListener == null || bArr.length < 3) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            cRPWorldClockListener.onSupportWorldClock(r0.a(bArr));
        } else {
            if (b8 != 1) {
                return;
            }
            cRPWorldClockListener.onWorldClock(r0.b(bArr));
        }
    }

    private void B(byte[] bArr) {
        byte[] bArr2;
        CRPHealthAnalysisListener cRPHealthAnalysisListener;
        if (bArr.length < 2) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            com.crrepa.e.a.a().b(bArr);
            return;
        }
        if (b8 == 2) {
            CRPChatChangeListener cRPChatChangeListener = this.Q;
            if (cRPChatChangeListener == null) {
                return;
            }
            byte b9 = bArr[2];
            if (b9 == 4) {
                CRPBleRecordingType cRPBleRecordingType = CRPBleRecordingType.JIELI;
                if (3 < bArr.length) {
                    cRPBleRecordingType = CRPBleRecordingType.getInstance(bArr[3]);
                }
                this.Q.onStopRecording(cRPBleRecordingType);
                return;
            }
            if (b9 == 6) {
                cRPChatChangeListener.onAskQuestion();
                return;
            }
            if (b9 == 14) {
                if (3 < bArr.length) {
                    cRPChatChangeListener.onModelChanged(bArr[3]);
                    return;
                }
                return;
            }
            if (b9 == 8) {
                cRPChatChangeListener.onPlayResponse();
                return;
            }
            if (b9 == 9) {
                cRPChatChangeListener.onPauseResponse();
                return;
            }
            if (b9 == -1) {
                com.crrepa.e.a.a().a(bArr);
                return;
            }
            if (b9 == 0) {
                cRPChatChangeListener.onCancel();
                return;
            }
            if (b9 == 1) {
                cRPChatChangeListener.onActivateRecording();
                return;
            }
            if (b9 != 2) {
                return;
            }
            BleLog.d("chat msg bytes: " + com.crrepa.g1.c.c(bArr));
            int length = bArr.length - 3;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 3, bArr3, 0, length);
            this.Q.onStartRecording(bArr3);
            return;
        }
        if (b8 == 4) {
            CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener = this.R;
            if (cRPAiWatchFaceChangeListener == null) {
                return;
            }
            byte b10 = bArr[2];
            if (b10 == 0) {
                cRPAiWatchFaceChangeListener.onCancel();
                return;
            }
            if (b10 == 1) {
                cRPAiWatchFaceChangeListener.onActivateRecording();
                return;
            }
            if (b10 == 2) {
                BleLog.d("chat msg bytes: " + com.crrepa.g1.c.c(bArr));
                int length2 = bArr.length - 3;
                byte[] bArr4 = new byte[length2];
                System.arraycopy(bArr, 3, bArr4, 0, length2);
                this.R.onStartRecording(bArr4);
                return;
            }
            if (b10 == 4) {
                CRPBleRecordingType cRPBleRecordingType2 = CRPBleRecordingType.JIELI;
                if (3 < bArr.length) {
                    cRPBleRecordingType2 = CRPBleRecordingType.getInstance(bArr[3]);
                }
                this.R.onStopRecording(cRPBleRecordingType2);
                return;
            }
            if (b10 == 6) {
                this.R.onRequestPreview(h4.d.d(bArr));
                return;
            }
            if (b10 == 18) {
                h4.d.a(bArr);
                return;
            }
            if (b10 == 8) {
                cRPAiWatchFaceChangeListener.onConfirmPreview();
                return;
            }
            if (b10 == 9 || b10 == 14) {
                if (3 < bArr.length) {
                    int length3 = bArr.length - 3;
                    byte[] bArr5 = new byte[length3];
                    System.arraycopy(bArr, 3, bArr5, 0, length3);
                    k0(bArr5);
                    return;
                }
                return;
            }
            if (b10 == 15) {
                this.R.onWatchFaceLayout(h4.d.e(bArr));
                return;
            } else if (b10 == 20) {
                cRPAiWatchFaceChangeListener.onPhotoWatchFaceLayout(h4.d.c(bArr));
                return;
            } else {
                if (b10 != 21) {
                    return;
                }
                cRPAiWatchFaceChangeListener.onPhotoWatchFace(h4.d.b(bArr));
                return;
            }
        }
        if (b8 != 6) {
            if (b8 == 8 && (cRPHealthAnalysisListener = this.f13314o1) != null) {
                byte b11 = bArr[2];
                if (b11 == 1) {
                    cRPHealthAnalysisListener.onCancelHealthAnalysis();
                    return;
                }
                if (b11 == 2) {
                    cRPHealthAnalysisListener.onRequestHealthAnalysis();
                    return;
                } else if (b11 == 3) {
                    cRPHealthAnalysisListener.onCancelHealthReport();
                    return;
                } else {
                    if (b11 != 4) {
                        return;
                    }
                    cRPHealthAnalysisListener.onRequestHealthReport();
                    return;
                }
            }
            return;
        }
        CRPAiAgentListener cRPAiAgentListener = this.f13311n1;
        if (cRPAiAgentListener == null) {
            return;
        }
        byte b12 = bArr[2];
        if (b12 == -1) {
            if (4 < bArr.length) {
                int length4 = bArr.length - 4;
                bArr2 = new byte[length4];
                System.arraycopy(bArr, 4, bArr2, 0, length4);
            } else {
                bArr2 = null;
            }
            this.f13311n1.onSupportAiAgent(bArr2);
            return;
        }
        if (b12 == 0) {
            cRPAiAgentListener.onCancel();
            return;
        }
        if (b12 == 1) {
            cRPAiAgentListener.onActivateRecording(bArr[3]);
            return;
        }
        if (b12 == 2) {
            BleLog.d("agent msg bytes: " + com.crrepa.g1.c.c(bArr));
            int length5 = bArr.length - 3;
            byte[] bArr6 = new byte[length5];
            System.arraycopy(bArr, 3, bArr6, 0, length5);
            this.f13311n1.onStartRecording(bArr6);
            return;
        }
        if (b12 == 4) {
            CRPBleRecordingType cRPBleRecordingType3 = CRPBleRecordingType.JIELI;
            if (3 < bArr.length) {
                cRPBleRecordingType3 = CRPBleRecordingType.getInstance(bArr[3]);
            }
            this.f13311n1.onStopRecording(cRPBleRecordingType3);
            return;
        }
        if (b12 == 6) {
            cRPAiAgentListener.onAskQuestion();
        } else if (b12 == 8) {
            cRPAiAgentListener.onPlayResponse();
        } else {
            if (b12 != 9) {
                return;
            }
            cRPAiAgentListener.onPauseResponse();
        }
    }

    private void B0(byte[] bArr) {
        CRPHistoryDay cRPHistoryDay;
        List<CRPNapSleepInfo> list;
        if (this.f13309n == null) {
            return;
        }
        int i8 = 2;
        if (bArr[1] == 0) {
            cRPHistoryDay = CRPHistoryDay.TODAY;
        } else {
            cRPHistoryDay = CRPHistoryDay.getInstance(bArr[2]);
            i8 = 3;
        }
        if (cRPHistoryDay == null) {
            return;
        }
        int length = bArr.length - i8;
        if (length > 0) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i8, bArr2, 0, length);
            list = b0.b(bArr2);
        } else {
            list = null;
        }
        this.f13309n.onHistoryNapSleepChange(cRPHistoryDay, list);
    }

    private boolean B1(byte[] bArr) {
        if (this.f13270a) {
            if (bArr[0] != -2 || bArr[1] != -22) {
                BleLog.d("cmd format error!");
                return false;
            }
            int a8 = a(bArr[2], bArr[3]);
            this.f13273b = a8;
            this.f13279d = new byte[a8];
            this.f13270a = false;
            this.f13276c = 0;
        }
        int i8 = this.f13273b - this.f13276c;
        BleLog.i("notReceiveLength: " + i8);
        if (i8 > 0 && bArr.length <= i8) {
            System.arraycopy(bArr, 0, this.f13279d, this.f13276c, bArr.length);
            int length = this.f13276c + bArr.length;
            this.f13276c = length;
            if (length >= this.f13273b) {
                this.f13270a = true;
            }
        }
        BleLog.i("packetEnded: " + this.f13270a);
        return this.f13270a;
    }

    private void C(byte[] bArr) {
        List<Integer> b8;
        if (this.f13318q == null || (b8 = this.f13300k.b(bArr)) == null) {
            return;
        }
        this.f13318q.onContinueBloodOxygen(this.f13300k.a(b8));
        this.f13318q.onContinueBloodOxygen(this.f13300k.b(b8));
    }

    private void C0(byte[] bArr) {
        if (this.f13286f0 != null) {
            this.f13286f0.onNewAlarmList(h4.e.b(bArr));
        }
    }

    private void D(byte[] bArr) {
        List<CRPBloodPressureInfo.BpBean> b8;
        if (this.f13315p == null || (b8 = this.f13303l.b(bArr)) == null) {
            return;
        }
        this.f13315p.onContinueBloodPressure(this.f13303l.a(b8));
        this.f13315p.onContinueBloodPressure(this.f13303l.b(b8));
    }

    private void D0(byte[] bArr) {
        CRPSleepTimeCallback cRPSleepTimeCallback;
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 1) {
            CRPVibrationStrengthCallback cRPVibrationStrengthCallback = this.U0;
            if (cRPVibrationStrengthCallback != null) {
                cRPVibrationStrengthCallback.onVibrationStrength(CRPVibrationStrength.getInstance(bArr[1]));
                return;
            }
            return;
        }
        if (b8 == 3 && (cRPSleepTimeCallback = this.V0) != null && 3 <= bArr.length) {
            cRPSleepTimeCallback.onSleepTime(bArr[1], bArr[2]);
        }
    }

    private void E(byte[] bArr) {
        CRPTempChangeListener cRPTempChangeListener;
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        if (bArr.length == 1) {
            CRPBloodOxygenChangeListener cRPBloodOxygenChangeListener = this.f13318q;
            if (cRPBloodOxygenChangeListener != null) {
                cRPBloodOxygenChangeListener.onTimingMeasure(bArr[0]);
                return;
            }
            return;
        }
        if (bArr.length == 2) {
            boolean z7 = bArr[1] == 1;
            byte b8 = bArr[0];
            if (b8 == 1) {
                CRPBloodPressureChangeListener cRPBloodPressureChangeListener = this.f13315p;
                if (cRPBloodPressureChangeListener != null) {
                    cRPBloodPressureChangeListener.onContinueState(z7);
                    return;
                }
                return;
            }
            if (b8 != 2) {
                if (b8 == 3 && (cRPTempChangeListener = this.f13337z) != null) {
                    cRPTempChangeListener.onContinueState(z7);
                    return;
                }
                return;
            }
            CRPBloodOxygenChangeListener cRPBloodOxygenChangeListener2 = this.f13318q;
            if (cRPBloodOxygenChangeListener2 != null) {
                cRPBloodOxygenChangeListener2.onContinueState(z7);
            }
        }
    }

    private void E0(byte[] bArr) {
        CRPHeartRateInfo a8;
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        byte b8 = bArr[0];
        CRPHistoryDay cRPHistoryDay = CRPHistoryDay.getInstance(bArr[1]);
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        if (b8 == 0) {
            CRPStepChangeListener cRPStepChangeListener = this.f13306m;
            if (cRPStepChangeListener != null) {
                cRPStepChangeListener.onHistoryStepChange(cRPHistoryDay, d0.a(bArr2));
                return;
            }
            return;
        }
        if (b8 == 1) {
            if (this.f13309n != null) {
                a(b0.a(bArr2), cRPHistoryDay);
            }
        } else {
            if (b8 != 2 || this.f13312o == null || (a8 = this.f13282e.a(cRPHistoryDay, bArr2)) == null) {
                return;
            }
            this.f13312o.on24HourMeasureResult(a8);
        }
    }

    private void F(byte[] bArr) {
        List<Float> b8;
        if (this.f13337z == null || (b8 = this.f13297j.b(bArr)) == null) {
            return;
        }
        this.f13337z.onContinueTemp(this.f13297j.a(b8));
        this.f13337z.onContinueTemp(this.f13297j.b(b8));
    }

    private void F0(byte[] bArr) {
        CRPNewHrvChangeListener cRPNewHrvChangeListener = this.I;
        if (cRPNewHrvChangeListener == null || bArr.length < 3) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            cRPNewHrvChangeListener.onHrv(com.crrepa.g1.c.a(bArr[2]));
        } else if (b8 == 2) {
            cRPNewHrvChangeListener.onHistoryHrv(h4.c.a(bArr));
        } else {
            if (b8 != 4) {
                return;
            }
            cRPNewHrvChangeListener.onSupportHrv(bArr[2] > 0);
        }
    }

    private void G(byte[] bArr) {
        if (this.N != null) {
            if (bArr.length < 6) {
                return;
            }
            CRPCustomKeyInfo cRPCustomKeyInfo = new CRPCustomKeyInfo(CRPCustomKeyType.getInstance(bArr[1]), bArr[2]);
            cRPCustomKeyInfo.setGoalType(bArr[3]);
            cRPCustomKeyInfo.setGoalValue(cRPCustomKeyInfo.getKeyType() == CRPCustomKeyType.KEY_STOPWATCH ? (bArr[4] * 60) + bArr[5] : com.crrepa.g1.c.b(bArr[5], bArr[4]));
            ArrayList arrayList = new ArrayList();
            for (int i8 = 6; i8 < bArr.length; i8++) {
                arrayList.add(CRPCustomKeyType.getInstance(bArr[i8]));
            }
            this.N.onSupportFeatureList(cRPCustomKeyInfo, arrayList);
        }
    }

    private void G0(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        switch (bArr[0]) {
            case 8:
                x(bArr);
                break;
            case 12:
                a1(bArr);
                break;
            case 16:
                J(bArr);
                break;
            case 17:
                i1(bArr);
                break;
            case 18:
                U(bArr);
                break;
            case 20:
                t0(bArr);
                break;
            case 21:
                C0(bArr);
                break;
            case 22:
                F0(bArr);
                break;
            case 25:
                T0(bArr);
                break;
            case 26:
                t(bArr);
                break;
            case 27:
                I(bArr);
                break;
            case 28:
                G(bArr);
                break;
            case 29:
                H(bArr);
                break;
            case 30:
                h1(bArr);
                break;
        }
    }

    private void H(byte[] bArr) {
        if (this.N == null || bArr.length < 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < bArr.length; i8++) {
            arrayList.add(CRPCustomKeyGameType.getInstance(bArr[i8]));
        }
        this.N.onSupportGameList(arrayList);
    }

    private void H0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            A1(bArr);
            return;
        }
        if (b8 == 1) {
            A0(bArr);
            return;
        }
        if (b8 == 2) {
            B(bArr);
            return;
        }
        if (b8 == 4) {
            R(bArr);
            return;
        }
        if (b8 == 16) {
            p(bArr);
            return;
        }
        if (b8 == 17) {
            n0(bArr);
            return;
        }
        switch (b8) {
            case 8:
                e1(bArr);
                break;
            case 9:
                K0(bArr);
                break;
            case 10:
                X(bArr);
                break;
            case 11:
                s0(bArr);
                break;
            case 12:
                X0(bArr);
                break;
            case 13:
                o0(bArr);
                break;
            case 14:
                Z(bArr);
                break;
            default:
                switch (b8) {
                    case 22:
                        V(bArr);
                        break;
                    case 23:
                        x1(bArr);
                        break;
                    case 24:
                        P0(bArr);
                        break;
                }
        }
    }

    private void I(byte[] bArr) {
        if (this.N == null || bArr.length < 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < bArr.length; i8++) {
            arrayList.add(Integer.valueOf(bArr[i8]));
        }
        this.N.onSupportTrainingList(arrayList);
    }

    private void I0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            b0(bArr);
        } else {
            if (b8 != 1) {
                return;
            }
            B0(bArr);
        }
    }

    private void J(byte[] bArr) {
        CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback;
        byte b8 = bArr[1];
        if (b8 == 0) {
            CRPDailyGoalsCallback cRPDailyGoalsCallback = this.M0;
            if (cRPDailyGoalsCallback != null) {
                cRPDailyGoalsCallback.onDailyGoals(u.a(bArr));
                return;
            }
            return;
        }
        if (b8 != 1) {
            if (b8 == 2 && (cRPTrainingDayGoalsCallback = this.N0) != null) {
                cRPTrainingDayGoalsCallback.onTrainingDays(u.b(bArr));
                return;
            }
            return;
        }
        CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback2 = this.N0;
        if (cRPTrainingDayGoalsCallback2 != null) {
            cRPTrainingDayGoalsCallback2.onTrainingDayGoals(u.a(bArr));
        }
    }

    private void J0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        byte b8 = bArr[0];
        if (b8 == 0) {
            CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback = this.f13332w0;
            if (cRPDeviceSupportWatchFaceCallback != null) {
                cRPDeviceSupportWatchFaceCallback.onSifliSupportWatchFace(p0.h(bArr2));
                return;
            }
            return;
        }
        if (b8 == 2) {
            com.crrepa.a1.f b9 = com.crrepa.a1.g.b();
            if (b9 == null || 2 > bArr.length) {
                return;
            }
            b9.a(bArr[1] == 0);
            return;
        }
        if (b8 == 5) {
            CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback = this.T0;
            if (cRPWatchFaceDeleteCallback == null || 2 > bArr.length) {
                return;
            }
            if (bArr[1] == 0) {
                cRPWatchFaceDeleteCallback.onComplete();
                return;
            } else {
                cRPWatchFaceDeleteCallback.onError();
                return;
            }
        }
        if (b8 == 7) {
            CRPBluetrumWatchFaceCallback cRPBluetrumWatchFaceCallback = this.Z0;
            if (cRPBluetrumWatchFaceCallback != null) {
                cRPBluetrumWatchFaceCallback.onWatchFaceInfo(p0.a(bArr2));
                return;
            }
            return;
        }
        if (b8 == 16) {
            CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback2 = this.f13332w0;
            if (cRPDeviceSupportWatchFaceCallback2 != null) {
                cRPDeviceSupportWatchFaceCallback2.onJieliSupportWatchFace(p0.e(bArr2));
                return;
            }
            return;
        }
        if (b8 == 18) {
            CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback3 = this.f13332w0;
            if (cRPDeviceSupportWatchFaceCallback3 != null) {
                cRPDeviceSupportWatchFaceCallback3.onJieliDownloadWatchFaceList(p0.b(bArr2));
                return;
            }
            return;
        }
        if (b8 == 26) {
            CRPPhotoWatchFaceChangeListener cRPPhotoWatchFaceChangeListener = this.Y;
            if (cRPPhotoWatchFaceChangeListener != null) {
                cRPPhotoWatchFaceChangeListener.onDisplayMode(p0.g(bArr2));
                return;
            }
            return;
        }
        if (b8 == 38) {
            m0(bArr2);
            return;
        }
        if (b8 == 20) {
            CRPWatchFaceScreenCallback cRPWatchFaceScreenCallback = this.f13296i1;
            if (cRPWatchFaceScreenCallback != null) {
                cRPWatchFaceScreenCallback.onScreenInfo(p0.n(bArr2));
                return;
            }
            return;
        }
        if (b8 == 21) {
            CRPPhotoWatchFaceChangeListener cRPPhotoWatchFaceChangeListener2 = this.Y;
            if (cRPPhotoWatchFaceChangeListener2 != null) {
                cRPPhotoWatchFaceChangeListener2.onSavedWatchFace(p0.f(bArr2));
                return;
            }
            return;
        }
        if (b8 == 28) {
            if (this.X != null) {
                this.X.onSavedWatchFace(!com.crrepa.g1.c.h(bArr2) ? new String(bArr2, StandardCharsets.UTF_8) : "");
                return;
            }
            return;
        }
        if (b8 == 29) {
            CRPPhotoWatchFaceChangeListener cRPPhotoWatchFaceChangeListener3 = this.Y;
            if (cRPPhotoWatchFaceChangeListener3 != null) {
                cRPPhotoWatchFaceChangeListener3.onWatchFaceElementInfo(p0.k(bArr2));
                return;
            }
            return;
        }
        if (b8 == 31) {
            CRPPhotoWatchFaceChangeListener cRPPhotoWatchFaceChangeListener4 = this.Y;
            if (cRPPhotoWatchFaceChangeListener4 != null) {
                cRPPhotoWatchFaceChangeListener4.onWatchFaceLayout(p0.d(bArr2));
                return;
            }
            return;
        }
        if (b8 == 32) {
            CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback4 = this.f13332w0;
            if (cRPDeviceSupportWatchFaceCallback4 != null) {
                cRPDeviceSupportWatchFaceCallback4.onHisiliconSupportWatchFace(p0.c(bArr2));
                return;
            }
            return;
        }
        if (b8 == 34) {
            CRPVideoWatchFaceChangeListener cRPVideoWatchFaceChangeListener = this.X;
            if (cRPVideoWatchFaceChangeListener != null) {
                cRPVideoWatchFaceChangeListener.onDisplayMode(p0.j(bArr2));
                return;
            }
            return;
        }
        if (b8 == 35 && this.f13302k1 != null && 2 <= length) {
            this.f13302k1.onTimeStyle(CRPWatchFaceType.getInstance(bArr2[0]), CRPWatchFaceTimeStyle.getInstance(bArr2[1]));
        }
    }

    private void K(byte[] bArr) {
        byte a8 = j2.a(bArr);
        CRPDeviceVersionCallback cRPDeviceVersionCallback = this.f13316p0;
        if (cRPDeviceVersionCallback != null) {
            cRPDeviceVersionCallback.onDeviceVersion(a8);
        }
    }

    private void K0(byte[] bArr) {
        if (this.U == null || com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        this.U.onAuthorizationResult(bArr[1] == 0);
    }

    private void L(byte[] bArr) {
        int i8 = 0;
        if (1 == bArr.length && bArr[0] > 0) {
            i8 = 1;
        }
        com.crrepa.e.c.a().a(i8);
        if (2 == bArr.length) {
            com.crrepa.e.c.a().b(bArr[1]);
        }
    }

    private void L0(byte[] bArr) {
        int h8 = this.f13282e.h(bArr);
        CRPHeartRateChangeListener cRPHeartRateChangeListener = this.f13312o;
        if (cRPHeartRateChangeListener != null) {
            cRPHeartRateChangeListener.onOnceMeasureComplete(h8);
        }
    }

    private void M(byte[] bArr) {
        CRPDeviceTestModeCallback cRPDeviceTestModeCallback;
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        byte b8 = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        String str = new String(bArr2);
        if (b8 == 0) {
            com.crrepa.e.g.a().a(str);
            return;
        }
        if (b8 == 1) {
            com.crrepa.e.e.a().a(str);
            return;
        }
        if (b8 == 2) {
            L(bArr2);
            return;
        }
        if (b8 == 4) {
            com.crrepa.g0.b.b().a(str);
            CRPDeviceUIVersionCodeCallback cRPDeviceUIVersionCodeCallback = this.W0;
            if (cRPDeviceUIVersionCodeCallback != null) {
                cRPDeviceUIVersionCodeCallback.onUIVersionCode(str);
                return;
            }
            return;
        }
        if (b8 != 8) {
            if (b8 == 9 && (cRPDeviceTestModeCallback = this.X0) != null) {
                cRPDeviceTestModeCallback.onTestMode(bArr2[0] == 1);
                return;
            }
            return;
        }
        CRPAvailableStorageCallback cRPAvailableStorageCallback = this.S0;
        if (cRPAvailableStorageCallback != null) {
            cRPAvailableStorageCallback.onAvailableSize(i.a(bArr2));
        }
    }

    private void M0(byte[] bArr) {
        CRPHeartRateChangeListener cRPHeartRateChangeListener;
        List<CRPHistoryBloodOxygenInfo> c8;
        CRPBloodOxygenChangeListener cRPBloodOxygenChangeListener;
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            List<CRPHistoryHeartRateInfo> f8 = this.f13282e.f(bArr);
            if (f8 == null || (cRPHeartRateChangeListener = this.f13312o) == null) {
                return;
            }
            cRPHeartRateChangeListener.onHistoryHeartRate(f8);
            return;
        }
        if (b8 != 1) {
            if (b8 != 2 || (c8 = this.f13300k.c(bArr)) == null || (cRPBloodOxygenChangeListener = this.f13318q) == null) {
                return;
            }
            cRPBloodOxygenChangeListener.onHistoryBloodOxygen(c8);
            return;
        }
        List<CRPHistoryBloodPressureInfo> c9 = this.f13303l.c(bArr);
        if (c9 == null || this.f13303l == null) {
            return;
        }
        this.f13315p.onHistoryBloodPressure(c9);
    }

    private void N(byte[] bArr) {
        CRPDeviceDisplayTimeCallback cRPDeviceDisplayTimeCallback;
        if (com.crrepa.g1.c.h(bArr) || (cRPDeviceDisplayTimeCallback = this.C0) == null) {
            return;
        }
        cRPDeviceDisplayTimeCallback.onSupportAlwayOn(1 < bArr.length && bArr[1] == 1);
        this.C0.onDisplayTime(com.crrepa.g1.c.a(bArr[0]));
    }

    private void N0(byte[] bArr) {
        boolean a8 = com.crrepa.f.f.a(bArr);
        CRPDeviceOtherMessageCallback cRPDeviceOtherMessageCallback = this.f13301k0;
        if (cRPDeviceOtherMessageCallback != null) {
            cRPDeviceOtherMessageCallback.onOtherMessage(a8);
        }
    }

    private void O(byte[] bArr) {
        int l8 = p0.l(bArr);
        CRPDeviceDisplayWatchFaceCallback cRPDeviceDisplayWatchFaceCallback = this.f13313o0;
        if (cRPDeviceDisplayWatchFaceCallback != null) {
            cRPDeviceDisplayWatchFaceCallback.onDisplayWatchFace(l8);
        }
    }

    private void O0(byte[] bArr) {
        CRPDeviceBondStateCallback cRPDeviceBondStateCallback;
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 2 || bArr[0] != 4 || com.crrepa.g1.c.a(bArr[1]) != 255 || (cRPDeviceBondStateCallback = this.H0) == null) {
            return;
        }
        cRPDeviceBondStateCallback.onBondState(2);
    }

    private void P(byte[] bArr) {
        CRPDistanceCategoryChangeListener cRPDistanceCategoryChangeListener;
        CRPDistanceCategoryInfo b8 = this.f13291h.b(bArr);
        if (b8 == null || (cRPDistanceCategoryChangeListener = this.T) == null) {
            return;
        }
        cRPDistanceCategoryChangeListener.onDistanceCategoryChange(b8);
    }

    private void P0(byte[] bArr) {
        CRPPerformanceInsightsInfo a8;
        CRPTrainingChangeListener cRPTrainingChangeListener;
        if (com.crrepa.g1.c.h(bArr) || (a8 = h4.f.a(bArr)) == null || (cRPTrainingChangeListener = this.F) == null) {
            return;
        }
        cRPTrainingChangeListener.onPerformanceInsightsChange(a8);
    }

    private void Q(byte[] bArr) {
        if (this.f13289g0 != null) {
            this.f13289g0.onDominantHand(com.crrepa.f.m.a(bArr));
        }
    }

    private void Q0(byte[] bArr) {
        CRPDevicePhysiologcalPeriodCallback cRPDevicePhysiologcalPeriodCallback;
        CRPPhysiologcalPeriodInfo a8 = j.a(bArr);
        if (a8 == null || (cRPDevicePhysiologcalPeriodCallback = this.f13336y0) == null) {
            return;
        }
        cRPDevicePhysiologcalPeriodCallback.onPhysiologcalPeriod(a8);
    }

    private void R(byte[] bArr) {
        CRPDeviceDrinkWaterListener cRPDeviceDrinkWaterListener;
        CRPWaterIntakeInfo g8;
        if (bArr.length < 2 || (cRPDeviceDrinkWaterListener = this.f13338z0) == null) {
            return;
        }
        switch (bArr[1]) {
            case 0:
                int e8 = a0.e(bArr);
                if (e8 >= 0) {
                    this.f13338z0.onDrinkWaterGoals(e8);
                    return;
                }
                return;
            case 1:
                int c8 = a0.c(bArr);
                if (c8 >= 0) {
                    this.f13338z0.onTodayWaterIntake(c8);
                    return;
                }
                return;
            case 2:
                g8 = a0.g(bArr);
                if (g8 == null) {
                    return;
                }
                break;
            case 3:
                g8 = a0.d(bArr);
                if (g8 == null) {
                    return;
                }
                break;
            case 4:
                if (bArr.length < 5 || bArr[2] != 1) {
                    return;
                }
                this.f13338z0.onDeleteWaterIntake(CRPWaterIntakeInfo.WaterIntakeType.getInstance(bArr[3]), bArr[4]);
                return;
            case 5:
                if (bArr.length < 3) {
                    return;
                }
                if (bArr[2] == 1) {
                    cRPDeviceDrinkWaterListener.requestWaterIntakeHistory();
                    return;
                }
                List<CRPWaterIntakeInfo> f8 = a0.f(bArr);
                if (f8 != null) {
                    this.f13338z0.onTodayWaterIntakeHistoryChange(f8);
                    return;
                }
                return;
            case 6:
                CRPNewDrinkWaterPeriodInfo b8 = a0.b(bArr);
                if (b8 != null) {
                    this.f13338z0.onNewDrinkWaterPeriod(b8);
                    return;
                }
                return;
            default:
                return;
        }
        this.f13338z0.onWaterIntakeChange(g8);
    }

    private void R0(byte[] bArr) {
        if (this.K0 == null || com.crrepa.g1.c.h(bArr)) {
            return;
        }
        this.K0.onPillReminder(bArr[0], l.b(bArr));
    }

    private void S(byte[] bArr) {
        com.crrepa.k.a aVar;
        if (this.f13329v == null || (aVar = this.f13294i) == null) {
            return;
        }
        this.f13329v.onECGChange(aVar.a(bArr));
    }

    private void S0(byte[] bArr) {
        CRPContactNumberSymbolCallback cRPContactNumberSymbolCallback;
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == -18) {
            CRPContactCountCallback cRPContactCountCallback = this.I0;
            if (cRPContactCountCallback != null) {
                cRPContactCountCallback.onContactCount(bArr[1]);
                return;
            }
            return;
        }
        if (b8 == -2) {
            CRPContactListener cRPContactListener = this.A;
            if (cRPContactListener != null) {
                byte b9 = bArr[1];
                if (bArr[2] == 0) {
                    cRPContactListener.onSavedSuccess(b9);
                    return;
                } else {
                    cRPContactListener.onSavedFail(b9);
                    return;
                }
            }
            return;
        }
        if (b8 == 0) {
            if (this.G0 != null) {
                this.G0.onContactConfig(p.a(bArr));
            }
        } else if (b8 == 5 && (cRPContactNumberSymbolCallback = this.R0) != null) {
            cRPContactNumberSymbolCallback.onSupportSymbol(bArr[1] > 0);
        }
    }

    private void T(byte[] bArr) {
        if (this.f13329v == null || this.f13294i == null || com.crrepa.g1.c.h(bArr)) {
            return;
        }
        int c8 = this.f13294i.c(bArr);
        if (com.crrepa.q.a.a()) {
            if (c8 == 0) {
                this.f13329v.onCancel();
                return;
            }
            if (c8 == 1) {
                this.f13329v.onTransCpmplete(this.f13294i.b(bArr));
                return;
            } else if (c8 == 2) {
                this.f13329v.onFail();
                return;
            } else if (c8 != 3) {
                return;
            }
        }
        this.f13329v.onMeasureComplete();
    }

    private void T0(byte[] bArr) {
        CRPQuickResponsesChangeListener cRPQuickResponsesChangeListener = this.M;
        if (cRPQuickResponsesChangeListener == null) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            cRPQuickResponsesChangeListener.onQuickResponsesCount(r.b(bArr));
        } else if (b8 == 2) {
            cRPQuickResponsesChangeListener.onQuickResponsesDetail(r.a(bArr));
        } else {
            if (b8 != 4) {
                return;
            }
            cRPQuickResponsesChangeListener.onSendSms(r.c(bArr));
        }
    }

    private void U(byte[] bArr) {
        CRPElectronicCardCallback cRPElectronicCardCallback;
        if (bArr.length < 3) {
            return;
        }
        byte b8 = bArr[2];
        if (b8 != 2) {
            if (b8 == 3 && (cRPElectronicCardCallback = this.P0) != null) {
                cRPElectronicCardCallback.onElectronicCard(c0.a(bArr));
                return;
            }
            return;
        }
        CRPElectronicCardCountCallback cRPElectronicCardCountCallback = this.O0;
        if (cRPElectronicCardCountCallback != null) {
            cRPElectronicCardCountCallback.onElectronicCardCount(c0.b(bArr));
        }
    }

    private void U0(byte[] bArr) {
        boolean a8 = com.crrepa.f.d0.a(bArr);
        CRPDeviceQuickViewCallback cRPDeviceQuickViewCallback = this.f13304l0;
        if (cRPDeviceQuickViewCallback != null) {
            cRPDeviceQuickViewCallback.onQuickView(a8);
        }
    }

    private void V(byte[] bArr) {
        List<Integer> b8;
        CRPEmojiChangeListener cRPEmojiChangeListener;
        if (bArr.length < 3) {
            return;
        }
        byte b9 = bArr[1];
        if (b9 != 0) {
            if (b9 != 1 || (b8 = e0.b(bArr)) == null || (cRPEmojiChangeListener = this.f13284e1) == null) {
                return;
            }
            cRPEmojiChangeListener.onSupportEmojiList(b8);
            return;
        }
        int a8 = e0.a(bArr);
        CRPEmojiChangeListener cRPEmojiChangeListener2 = this.f13284e1;
        if (cRPEmojiChangeListener2 != null) {
            cRPEmojiChangeListener2.onSupportCount(a8);
        }
    }

    private void V0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        int a8 = com.crrepa.g1.c.a(bArr[1]);
        int b8 = 4 <= bArr.length ? com.crrepa.g1.c.b(bArr[3], bArr[2]) : 1024;
        if (1024 == b8) {
            a(a8);
            return;
        }
        CRPHrvChangeListener cRPHrvChangeListener = this.D;
        if (cRPHrvChangeListener != null) {
            cRPHrvChangeListener.onRealRri(b8, a8);
        }
    }

    private void W(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        com.crrepa.s0.d.a().a(bArr[0] > 0);
    }

    private void W0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 1) {
            c(bArr);
            return;
        }
        if (b8 == 2) {
            e(bArr);
        } else if (b8 == 3) {
            d(bArr);
        } else {
            if (b8 != 4) {
                return;
            }
            b(bArr);
        }
    }

    private void X(byte[] bArr) {
        if (this.f13293h1 == null || com.crrepa.g1.c.h(bArr) || bArr.length < 3) {
            return;
        }
        this.f13293h1.onFlashNotificationState(bArr[2] > 0);
    }

    private void X0(byte[] bArr) {
        CRPPeriodTimeInfo a8;
        if (this.Z == null || com.crrepa.g1.c.h(bArr) || bArr.length < 3) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            this.Z.onScreenOffClockState(bArr[2] > 0);
        } else if (b8 == 2 && (a8 = x.a(bArr)) != null) {
            this.Z.onPeriodTime(a8);
        }
    }

    private void Y(byte[] bArr) {
        com.crrepa.p0.a.a().transFileIndex(new com.crrepa.y0.a(bArr));
    }

    private void Y0(byte[] bArr) {
        CRPSedentaryReminderPeriodInfo a8 = v.a(bArr);
        CRPDeviceSedentaryReminderPeriodCallback cRPDeviceSedentaryReminderPeriodCallback = this.f13330v0;
        if (cRPDeviceSedentaryReminderPeriodCallback == null || a8 == null) {
            return;
        }
        cRPDeviceSedentaryReminderPeriodCallback.onSedentaryReminderPeriod(a8);
    }

    private void Z(byte[] bArr) {
        CRPGalleryInfo a8;
        if (this.f13274b0 == null || com.crrepa.g1.c.h(bArr) || bArr.length < 3) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            a8 = i0.a(bArr);
        } else if (b8 == 1) {
            a8 = i0.b(bArr);
        } else {
            if (b8 == 4) {
                this.f13274b0.onResult(i0.a(), bArr[2] == 0);
                return;
            }
            a8 = null;
        }
        if (a8 != null) {
            this.f13274b0.onGalleryInfo(a8);
        }
    }

    private void Z0(byte[] bArr) {
        boolean a8 = com.crrepa.f.p0.a(bArr);
        CRPDeviceSedentaryReminderCallback cRPDeviceSedentaryReminderCallback = this.f13307m0;
        if (cRPDeviceSedentaryReminderCallback != null) {
            cRPDeviceSedentaryReminderCallback.onSedentaryReminder(a8);
        }
    }

    private int a(byte b8, byte b9) {
        return b8 == 16 ? b9 : com.crrepa.g1.c.b((byte) (b8 & 1), b9);
    }

    private void a0(byte[] bArr) {
        int a8 = com.crrepa.f.o0.a(bArr);
        CRPDeviceGoalStepCallback cRPDeviceGoalStepCallback = this.f13292h0;
        if (cRPDeviceGoalStepCallback != null) {
            cRPDeviceGoalStepCallback.onGoalStep(a8);
        }
    }

    private void a1(byte[] bArr) {
        CRPCustomKeyChangeListener cRPCustomKeyChangeListener = this.N;
        if (cRPCustomKeyChangeListener == null || bArr.length < 6) {
            return;
        }
        cRPCustomKeyChangeListener.onSendResult(bArr[5] > 0);
    }

    private void b0(byte[] bArr) {
        CRPGomoreListener cRPGomoreListener = this.V;
        if (cRPGomoreListener == null || bArr.length < 3) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            cRPGomoreListener.onSupportGomore(bArr[2] > 0);
            return;
        }
        if (b8 == 1) {
            cRPGomoreListener.onSavedKey(bArr[2] > 0);
            return;
        }
        if (b8 != 2) {
            if (b8 != 3) {
                return;
            }
            cRPGomoreListener.onWriteKeyResult(bArr[2] > 0);
        } else {
            int length = bArr.length - 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 2, bArr2, 0, length);
            this.V.onEUID(com.crrepa.g1.c.b(bArr2));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b1(byte[] bArr) {
        com.crrepa.l0.b b8;
        com.crrepa.a1.f b9;
        com.crrepa.l0.g a8;
        boolean z7 = true;
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        com.crrepa.y0.a aVar = null;
        switch (bArr[0]) {
            case 1:
                aVar = new com.crrepa.y0.a(bArr2, true);
                z7 = false;
                b8 = com.crrepa.o.a.c().b();
                if (b8 != null) {
                    if (z7) {
                        b8.b();
                    } else if (aVar != null) {
                        b8.a(aVar);
                    }
                }
                b9 = com.crrepa.a1.g.b();
                if (b9 != null) {
                    if (z7) {
                        b9.cancel();
                    } else if (aVar != null) {
                        b9.transFileIndex(aVar);
                    }
                }
                a8 = com.crrepa.o.a.c().a();
                if (a8 != null) {
                    if (!z7) {
                        if (aVar != null) {
                            a8.transFileIndex(aVar);
                            break;
                        }
                    } else {
                        a8.cancel();
                        break;
                    }
                }
                break;
            case 2:
                aVar = new com.crrepa.y0.a(bArr2, true);
                aVar.a(true);
                z7 = false;
                b8 = com.crrepa.o.a.c().b();
                if (b8 != null) {
                }
                b9 = com.crrepa.a1.g.b();
                if (b9 != null) {
                }
                a8 = com.crrepa.o.a.c().a();
                if (a8 != null) {
                }
                break;
            case 3:
            case 4:
            case 11:
            default:
                z7 = false;
                b8 = com.crrepa.o.a.c().b();
                if (b8 != null) {
                }
                b9 = com.crrepa.a1.g.b();
                if (b9 != null) {
                }
                a8 = com.crrepa.o.a.c().a();
                if (a8 != null) {
                }
                break;
            case 5:
                b8 = com.crrepa.o.a.c().b();
                if (b8 != null) {
                }
                b9 = com.crrepa.a1.g.b();
                if (b9 != null) {
                }
                a8 = com.crrepa.o.a.c().a();
                if (a8 != null) {
                }
                break;
            case 6:
                CRPAvailableStorageCallback cRPAvailableStorageCallback = this.S0;
                if (cRPAvailableStorageCallback != null) {
                    cRPAvailableStorageCallback.onAvailableSize(i.b(bArr2));
                    break;
                }
                break;
            case 7:
                w0(bArr2);
                break;
            case 8:
                y0(bArr2);
                break;
            case 9:
                x0(bArr2);
                break;
            case 10:
                v0(bArr2);
                break;
            case 12:
                q0(bArr2);
                z7 = false;
                b8 = com.crrepa.o.a.c().b();
                if (b8 != null) {
                }
                b9 = com.crrepa.a1.g.b();
                if (b9 != null) {
                }
                a8 = com.crrepa.o.a.c().a();
                if (a8 != null) {
                }
                break;
            case 13:
                p0(bArr2);
                z7 = false;
                b8 = com.crrepa.o.a.c().b();
                if (b8 != null) {
                }
                b9 = com.crrepa.a1.g.b();
                if (b9 != null) {
                }
                a8 = com.crrepa.o.a.c().a();
                if (a8 != null) {
                }
                break;
            case 14:
                W(bArr2);
                z7 = false;
                b8 = com.crrepa.o.a.c().b();
                if (b8 != null) {
                }
                b9 = com.crrepa.a1.g.b();
                if (b9 != null) {
                }
                a8 = com.crrepa.o.a.c().a();
                if (a8 != null) {
                }
                break;
        }
    }

    private void c() {
        CRPCameraOperationListener cRPCameraOperationListener = this.f13323s;
        if (cRPCameraOperationListener != null) {
            cRPCameraOperationListener.onExitCamera();
        }
    }

    private void c0(byte[] bArr) {
        CRPGpsChangeListener cRPGpsChangeListener;
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 1) {
            return;
        }
        int length = bArr.length;
        int i8 = length - 1;
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 1, bArr2, 0, i8);
        byte b8 = bArr[0];
        BleLog.d("type: " + ((int) b8));
        if (b8 == 8) {
            CRPGpsChangeListener cRPGpsChangeListener2 = this.K;
            if (cRPGpsChangeListener2 != null) {
                cRPGpsChangeListener2.onUpdateHisiliconEpoChange(k0.b(bArr2));
                return;
            }
            return;
        }
        if (b8 == 0) {
            if (this.K != null) {
                this.K.onHistoryGpsPathChange(k0.c(bArr2));
                return;
            }
            return;
        }
        if (b8 == 1) {
            CRPGpsPathInfo a8 = k0.a(bArr2);
            CRPGpsChangeListener cRPGpsChangeListener3 = this.K;
            if (cRPGpsChangeListener3 == null || a8 == null) {
                return;
            }
            cRPGpsChangeListener3.onGpsPathChange(a8);
            return;
        }
        if (b8 == 2) {
            CRPGpsChangeListener cRPGpsChangeListener4 = this.K;
            if (cRPGpsChangeListener4 != null) {
                cRPGpsChangeListener4.onLocationChanged(k0.d(bArr2));
                return;
            }
            return;
        }
        if (b8 != 3) {
            if (b8 == 4 && (cRPGpsChangeListener = this.K) != null) {
                cRPGpsChangeListener.onUpdateGpsLocationChange();
                return;
            }
            return;
        }
        if (i8 == 1) {
            CRPGpsChangeListener cRPGpsChangeListener5 = this.K;
            if (cRPGpsChangeListener5 != null) {
                cRPGpsChangeListener5.onUpdateEpoChange(CRPEpoType.getInstance(bArr2[0]));
                return;
            }
            return;
        }
        int i9 = length - 2;
        byte[] bArr3 = new byte[i9];
        System.arraycopy(bArr2, 1, bArr3, 0, i9);
        com.crrepa.o0.a.a().transFileIndex(new com.crrepa.y0.a(bArr3));
    }

    private void c1(byte[] bArr) {
        com.crrepa.o.b.a().c();
        CRPSleepInfo a8 = b0.a(bArr, false);
        if (this.f13309n != null) {
            if (this.f13317p1 && a8.getRemTime() <= 0) {
                a8 = t.a(a8);
            }
            Date date = new Date();
            if (b0.a(date)) {
                date = b0.a(date, 1);
            }
            a8.setDate(date);
            this.f13309n.onSleepChange(a8);
        }
    }

    private void d() {
        CRPWeatherChangeListener cRPWeatherChangeListener = this.f13325t;
        if (cRPWeatherChangeListener != null) {
            cRPWeatherChangeListener.onUpdateWeather();
        }
    }

    private void d0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        if (bArr.length == 2 && bArr[1] == 1) {
            if (this.f13335y != null) {
                int a8 = com.crrepa.g1.c.a(bArr[0]);
                if (a8 == 255) {
                    this.f13335y.onStartFailed();
                    return;
                } else {
                    this.f13335y.onMeasuring(a8);
                    return;
                }
            }
            return;
        }
        if (2 <= bArr.length) {
            a(this.f13282e.h(bArr));
            return;
        }
        if (bArr.length != 1 || this.f13335y == null) {
            return;
        }
        int a9 = com.crrepa.g1.c.a(bArr[0]);
        if (com.crrepa.g1.c.a((byte) -3) <= a9) {
            this.f13335y.onMeasureState(a9);
        } else {
            this.f13335y.onStartSuccess(a9);
        }
    }

    private void d1(byte[] bArr) {
        CRPSleepActionInfo a8 = z.a(bArr);
        CRPSleepActionChangeListener cRPSleepActionChangeListener = this.f13333x;
        if (cRPSleepActionChangeListener == null || a8 == null) {
            return;
        }
        cRPSleepActionChangeListener.onSleepActionChange(a8);
    }

    private void e() {
        int i8;
        CRPHeartRateInfo i9;
        byte[] bArr = this.f13279d;
        if (bArr == null || bArr.length < 5) {
            return;
        }
        byte b8 = bArr[4];
        int length = bArr.length - 5;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 5, bArr2, 0, length);
        BleLog.i("cmd: " + ((int) b8));
        if (b8 == -121) {
            W0(bArr2);
            return;
        }
        if (b8 == -120) {
            u(bArr2);
            return;
        }
        switch (b8) {
            case -127:
                i8 = 1;
                break;
            case -126:
                i8 = 2;
                break;
            case -125:
                Y0(bArr2);
                return;
            case -124:
                j1(bArr2);
                return;
            case -123:
                Q0(bArr2);
                return;
            default:
                switch (b8) {
                    case -116:
                        w1(bArr2);
                        break;
                    case -115:
                        N(bArr2);
                        break;
                    case -114:
                        E(bArr2);
                        break;
                    case -113:
                        v(bArr2);
                        break;
                    default:
                        if (b8 == -95) {
                            f();
                            break;
                        } else if (b8 == -9) {
                            r(bArr2);
                            break;
                        } else if (b8 == 33) {
                            l(bArr2);
                            break;
                        } else if (b8 == 83) {
                            A(bArr2);
                            break;
                        } else if (b8 == 87) {
                            p1(bArr2);
                            break;
                        } else if (b8 == 96) {
                            Y(bArr2);
                            break;
                        } else if (b8 == 116) {
                            t1(bArr2);
                            break;
                        } else if (b8 == 119) {
                            O0(bArr2);
                            break;
                        } else if (b8 == 89) {
                            g1(bArr2);
                            break;
                        } else if (b8 == 90) {
                            M(bArr2);
                            break;
                        } else if (b8 == 92) {
                            z(bArr2);
                            break;
                        } else if (b8 == 93) {
                            P(bArr2);
                            break;
                        } else {
                            switch (b8) {
                                case 36:
                                    Q(bArr2);
                                    break;
                                case 37:
                                    n(bArr2);
                                    break;
                                case 38:
                                    a0(bArr2);
                                    break;
                                case 39:
                                    m1(bArr2);
                                    break;
                                case 40:
                                    U0(bArr2);
                                    break;
                                case 41:
                                    O(bArr2);
                                    break;
                                case 42:
                                    r0(bArr2);
                                    break;
                                case 43:
                                    o(bArr2);
                                    break;
                                case 44:
                                    N0(bArr2);
                                    break;
                                case 45:
                                    Z0(bArr2);
                                    break;
                                case 46:
                                    K(bArr2);
                                    break;
                                case 47:
                                    e0(bArr2);
                                    break;
                                default:
                                    switch (b8) {
                                        case 57:
                                            u1(bArr2);
                                            break;
                                        case 58:
                                            d1(bArr2);
                                            break;
                                        case 59:
                                            l1(bArr2);
                                            break;
                                        case 60:
                                            n1(bArr2);
                                            break;
                                        case 61:
                                            D(bArr2);
                                            break;
                                        case 62:
                                            C(bArr2);
                                            break;
                                        case 63:
                                            F(bArr2);
                                            break;
                                        default:
                                            switch (b8) {
                                                case 98:
                                                    a(bArr2);
                                                    break;
                                                case 99:
                                                    if (4 >= length) {
                                                        r1(bArr2);
                                                        break;
                                                    } else {
                                                        j0(bArr2);
                                                        break;
                                                    }
                                                case 100:
                                                    d();
                                                    break;
                                                case 101:
                                                    y(bArr2);
                                                    break;
                                                case 102:
                                                    g();
                                                    break;
                                                case 103:
                                                    z0(bArr2);
                                                    break;
                                                case 104:
                                                    d0(bArr2);
                                                    break;
                                                case 105:
                                                    this.f13303l.a(bArr2, this.f13315p);
                                                    break;
                                                default:
                                                    switch (b8) {
                                                        case 107:
                                                            s(bArr2);
                                                            break;
                                                        case 108:
                                                            q1(bArr2);
                                                            break;
                                                        case 109:
                                                            L0(bArr2);
                                                            break;
                                                        case 110:
                                                            break;
                                                        case 111:
                                                            T(bArr2);
                                                            break;
                                                        default:
                                                            switch (b8) {
                                                                case -92:
                                                                    q(bArr2);
                                                                    break;
                                                                case -91:
                                                                    i0(bArr2);
                                                                    break;
                                                                case -90:
                                                                    v1(bArr2);
                                                                    break;
                                                                default:
                                                                    switch (b8) {
                                                                        case MarkerErrorCode.ERROR_NEED_RESET /* -86 */:
                                                                            R0(bArr2);
                                                                            break;
                                                                        case -85:
                                                                            M0(bArr2);
                                                                            break;
                                                                        case -84:
                                                                            k1(bArr2);
                                                                            break;
                                                                        default:
                                                                            switch (b8) {
                                                                                case -78:
                                                                                    o1(bArr2);
                                                                                    break;
                                                                                case -77:
                                                                                    c0(bArr2);
                                                                                    break;
                                                                                case -76:
                                                                                    J0(bArr2);
                                                                                    break;
                                                                                default:
                                                                                    switch (b8) {
                                                                                        case -74:
                                                                                            E0(bArr2);
                                                                                            break;
                                                                                        case -73:
                                                                                            b1(bArr2);
                                                                                            break;
                                                                                        case -72:
                                                                                            D0(bArr2);
                                                                                            break;
                                                                                        case -71:
                                                                                            G0(bArr2);
                                                                                            break;
                                                                                        case -70:
                                                                                            l0(bArr2);
                                                                                            break;
                                                                                        case -69:
                                                                                            H0(bArr2);
                                                                                            break;
                                                                                        case -68:
                                                                                            I0(bArr2);
                                                                                            break;
                                                                                        case -67:
                                                                                            f0(bArr2);
                                                                                            break;
                                                                                        default:
                                                                                            switch (b8) {
                                                                                                case -15:
                                                                                                    w(bArr2);
                                                                                                    break;
                                                                                                case -14:
                                                                                                    S0(bArr2);
                                                                                                    break;
                                                                                                case -13:
                                                                                                    break;
                                                                                                case -12:
                                                                                                    j(bArr2);
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (b8) {
                                                                                                        case 50:
                                                                                                            c1(bArr2);
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            h0(bArr2);
                                                                                                            break;
                                                                                                        case 52:
                                                                                                            k(bArr2);
                                                                                                            break;
                                                                                                        case 53:
                                                                                                            i9 = this.f13282e.i(bArr2);
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            List<Integer> d8 = this.f13282e.d(bArr2);
                                                                                                            if (d8 != null) {
                                                                                                                a(this.f13282e.a(d8));
                                                                                                                i9 = this.f13282e.b(d8);
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 55:
                                                                                                            u0(bArr2);
                                                                                                            break;
                                                                                                        default:
                                                                                                            BleLog.i("default cmd: " + ((int) b8));
                                                                                                            break;
                                                                                                    }
                                                                                                    a(i9);
                                                                                                    break;
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                    k0(bArr2);
                                                    break;
                                            }
                                    }
                            }
                        }
                        break;
                }
                return;
        }
        a(bArr2, i8);
    }

    private void e0(byte[] bArr) {
        if (this.f13324s0 != null) {
            this.f13324s0.onTimingMeasure(this.f13282e.g(bArr));
        }
    }

    private void e1(byte[] bArr) {
        if (this.f13287f1 == null || com.crrepa.g1.c.h(bArr) || bArr.length < 3) {
            return;
        }
        this.f13287f1.onSosState(bArr[2] > 0);
    }

    private void f() {
        CRPSosChangeListener cRPSosChangeListener = this.B;
        if (cRPSosChangeListener != null) {
            cRPSosChangeListener.onSos();
        }
    }

    private void f0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        com.crrepa.n.a a8 = com.crrepa.n.a.a();
        byte b8 = bArr[0];
        if (b8 == 0) {
            a8.d(bArr);
        } else if (b8 == 1) {
            a8.a(bArr);
        } else {
            if (b8 != 2) {
                return;
            }
            a8.c(bArr);
        }
    }

    private void f1(byte[] bArr) {
        if (this.f13306m != null) {
            this.f13306m.onStepChange(d0.b(bArr));
        }
    }

    private void g() {
        CRPCameraOperationListener cRPCameraOperationListener = this.f13323s;
        if (cRPCameraOperationListener != null) {
            cRPCameraOperationListener.onTakePhoto();
        }
    }

    private void g0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        com.crrepa.n.d.a().b(bArr);
    }

    private void g1(byte[] bArr) {
        CRPStepsCategoryChangeListener cRPStepsCategoryChangeListener;
        CRPStepsCategoryInfo b8 = this.f13285f.b(bArr);
        if (b8 == null || (cRPStepsCategoryChangeListener = this.f13331w) == null) {
            return;
        }
        cRPStepsCategoryChangeListener.onStepsCategoryChange(b8);
    }

    private void h(byte[] bArr) {
        float[] d8;
        if (this.f13337z == null || (d8 = this.f13297j.d(bArr)) == null) {
            return;
        }
        List<Float> arrayList = new ArrayList<>();
        int i8 = 0;
        for (float f8 : d8) {
            arrayList.add(Float.valueOf(f8));
        }
        CRPTempTimeType a8 = this.f13297j.a((int) bArr[0]);
        if (CRPTempTimeType.TODAY == a8) {
            arrayList = this.f13297j.a(arrayList, 30);
        } else {
            i8 = -1;
        }
        this.f13337z.onContinueTemp(new CRPTempInfo(a8, com.crrepa.g1.e.a(i8), arrayList));
    }

    private void h0(byte[] bArr) {
        CRPStepChangeListener cRPStepChangeListener;
        com.crrepa.o.b.a().c();
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        byte b8 = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        if (b8 <= 2 && (cRPStepChangeListener = this.f13306m) != null) {
            cRPStepChangeListener.onHistoryStepChange(CRPHistoryDay.getInstance(b8), d0.b(bArr2));
            return;
        }
        if (this.f13309n != null) {
            CRPSleepInfo a8 = b0.a(bArr2, true);
            if (this.f13320q1 && a8.getRemTime() <= 0) {
                a8 = t.a(a8);
            }
            a(a8, CRPHistoryDay.getInstance((byte) (b8 - 2)));
        }
    }

    private void h1(byte[] bArr) {
        if (this.P == null || com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            this.P.onSupportStockCount(bArr[2]);
        } else {
            if (b8 != 1) {
                return;
            }
            this.P.onUpdateStockChange();
        }
    }

    private void i(byte[] bArr) {
        if (this.B0 == null || com.crrepa.g1.c.h(bArr)) {
            return;
        }
        this.B0.onTimingState(this.f13297j.e(bArr));
    }

    private void i0(byte[] bArr) {
        CRPHrvInfo a8;
        if (this.D == null || com.crrepa.g1.c.h(bArr)) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 1) {
            this.D.onMeasureInterval(bArr[1]);
            return;
        }
        if (b8 != 2) {
            if (b8 == 3 && (a8 = q0.a(bArr)) != null) {
                this.D.onHrvChange(a8);
                return;
            }
            return;
        }
        byte b9 = bArr[1];
        int b10 = com.crrepa.g1.c.b(bArr[3], bArr[2]);
        BleLog.d("hrv count: " + b10);
        if (4 >= bArr.length) {
            this.D.onMeasureCount(b9, b10);
            return;
        }
        int length = bArr.length - 4;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 4, bArr2, 0, length);
        CRPHrvInfo a9 = q0.a(bArr2);
        if (a9 != null) {
            this.D.onMeasureResult(b9, b10, a9);
        }
    }

    private void i1(byte[] bArr) {
        CRPStressListener cRPStressListener = this.H;
        if (cRPStressListener == null) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            cRPStressListener.onStressChange(bArr[2]);
            return;
        }
        if (b8 == 1) {
            cRPStressListener.onTimingStressStateChange(bArr[2] > 0);
            return;
        }
        if (b8 == 2) {
            cRPStressListener.onHistoryStressChange(h0.a(bArr));
        } else if (b8 == 3) {
            cRPStressListener.onTimingStressChange(h0.b(bArr));
        } else {
            if (b8 != 4) {
                return;
            }
            cRPStressListener.onSupportStress(bArr[2] > 0);
        }
    }

    private void j(byte[] bArr) {
        CRPA2DPConnectStateListener cRPA2DPConnectStateListener;
        if (com.crrepa.g1.c.h(bArr) || (cRPA2DPConnectStateListener = this.G) == null) {
            return;
        }
        cRPA2DPConnectStateListener.onConnectState(CRPA2DPConnectStateListener.A2DPConnectState.getInstance(bArr[0]));
    }

    private void j0(byte[] bArr) {
        String b8 = h4.b.b(bArr);
        if (this.f13334x0 == null || TextUtils.isEmpty(b8)) {
            return;
        }
        this.f13334x0.onAddress(b8);
    }

    private void j1(byte[] bArr) {
        CRPSupportWatchFaceInfo i8 = p0.i(bArr);
        CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback = this.f13332w0;
        if (cRPDeviceSupportWatchFaceCallback == null || i8 == null) {
            return;
        }
        cRPDeviceSupportWatchFaceCallback.onSupportWatchFace(i8);
    }

    private void k(byte[] bArr) {
        CRPHeartRateInfo e8 = this.f13282e.e(bArr);
        if (this.f13312o == null || e8 == null) {
            return;
        }
        this.f13312o.onMeasureComplete(this.f13282e.c(bArr), e8);
    }

    private void k0(byte[] bArr) {
        com.crrepa.l0.b b8 = com.crrepa.o.a.c().b();
        if (b8 != null) {
            b8.a(new com.crrepa.y0.a(bArr));
        }
    }

    private void k1(byte[] bArr) {
        CRPTapToWakeCallback cRPTapToWakeCallback;
        if (com.crrepa.g1.c.h(bArr) || (cRPTapToWakeCallback = this.L0) == null) {
            return;
        }
        cRPTapToWakeCallback.onWakeState(bArr[0] == 1);
    }

    private void l(byte[] bArr) {
        if (this.f13286f0 != null) {
            this.f13286f0.onAlarmList(h4.e.a(bArr));
        }
    }

    private void l0(byte[] bArr) {
        CRPDeviceInfo a8;
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            if (this.f13299j1 == null || (a8 = w.a(bArr)) == null) {
                return;
            }
            this.f13299j1.onDeviceInfo(a8);
            return;
        }
        if (b8 == 1) {
            if (3 <= bArr.length) {
                com.crrepa.f0.a.a().a(com.crrepa.g1.c.b(bArr[2], bArr[1]));
                return;
            }
            return;
        }
        if (b8 == 2) {
            if (this.Y0 == null || 3 > bArr.length) {
                return;
            }
            this.Y0.onWatchFaceInfo(new CRPJieliWatchFaceInfo(bArr[1], bArr[2]));
            return;
        }
        if (b8 != 3) {
            if (b8 != 4) {
                return;
            }
            com.crrepa.n.a.a().b(bArr);
        } else {
            CRPDeviceNameCallback cRPDeviceNameCallback = this.f13305l1;
            if (cRPDeviceNameCallback == null || 3 > bArr.length) {
                return;
            }
            cRPDeviceNameCallback.onSupportDeviceNameLength(bArr[2]);
        }
    }

    private void l1(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        byte b8 = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        if (b8 == 0) {
            g(bArr2);
            return;
        }
        if (b8 == 1) {
            f(bArr2);
        } else if (b8 == 3) {
            i(bArr2);
        } else {
            if (b8 != 4) {
                return;
            }
            h(bArr2);
        }
    }

    private void m(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        com.crrepa.n.b.a().a(com.crrepa.g1.c.a(bArr[0]));
    }

    private void m0(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || this.Y == null) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            s0.e(bArr);
            return;
        }
        if (b8 == 1) {
            this.Y.onJieliWatchFaceConfig(s0.b(bArr));
            return;
        }
        if (b8 == 2) {
            this.Y.onAvailableSize(2, s0.a(bArr));
            f e8 = f.e();
            e8.a(com.crrepa.f.q0.l());
            e8.a(com.crrepa.f.q0.n());
            return;
        }
        if (b8 == 4) {
            this.Y.onJieliWatchFaceLayout(s0.c(bArr));
        } else {
            if (b8 != 5) {
                return;
            }
            this.Y.onJieliPhotoWatchFace(s0.d(bArr));
        }
    }

    private void m1(byte[] bArr) {
        int a8 = z1.a(bArr);
        CRPDeviceTimeSystemCallback cRPDeviceTimeSystemCallback = this.f13310n0;
        if (cRPDeviceTimeSystemCallback != null) {
            cRPDeviceTimeSystemCallback.onTimeSystem(a8);
        }
    }

    private void n(byte[] bArr) {
        CRPFunctionInfo a8 = g0.a(bArr);
        CRPDeviceFunctionCallback cRPDeviceFunctionCallback = this.f13319q0;
        if (cRPDeviceFunctionCallback != null) {
            cRPDeviceFunctionCallback.onFunctionChenge(a8);
        }
    }

    private void n0(byte[] bArr) {
        if (this.f13280d0 == null || com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 1) {
            int length = bArr.length - 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 2, bArr2, 0, length);
            this.f13280d0.onNavigationIconConfig((CRPLocalNavigationIconInfo) com.crrepa.g1.k.a(new String(bArr2, StandardCharsets.UTF_8), CRPLocalNavigationIconInfo.class));
            return;
        }
        if (b8 == 4) {
            this.f13280d0.onStopNavigation();
        } else {
            if (b8 != 5) {
                return;
            }
            this.f13280d0.onSupportedLocalNavigation();
        }
    }

    private void n1(byte[] bArr) {
        CRPBloodOxygenInfo d8;
        if (com.crrepa.g1.c.h(bArr) || this.f13318q == null || (d8 = this.f13300k.d(bArr)) == null) {
            return;
        }
        this.f13318q.onContinueBloodOxygen(d8);
    }

    private void o(byte[] bArr) {
        int a8 = t0.a(bArr);
        int[] b8 = t0.b(bArr);
        CRPDeviceLanguageCallback cRPDeviceLanguageCallback = this.f13295i0;
        if (cRPDeviceLanguageCallback != null) {
            cRPDeviceLanguageCallback.onDeviceLanguage(a8, b8);
        }
    }

    private void o0(byte[] bArr) {
        CRPLocalVideoInfo a8;
        if (this.f13271a0 == null || com.crrepa.g1.c.h(bArr) || bArr.length < 3 || (a8 = u0.a(bArr)) == null) {
            return;
        }
        this.f13271a0.onLocalVideoInfo(a8);
    }

    private void o1(byte[] bArr) {
        CRPTrainingChangeListener cRPTrainingChangeListener;
        if (com.crrepa.g1.c.h(bArr) || (cRPTrainingChangeListener = this.F) == null) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 1) {
            cRPTrainingChangeListener.onHistoryTrainingChange(l0.a(bArr));
            return;
        }
        if (b8 == 3) {
            l0.d(bArr);
            return;
        }
        if (b8 == 8) {
            List<Integer> g8 = l0.g(bArr);
            if (g8 != null) {
                com.crrepa.n.e.a().c(g8);
                return;
            }
            return;
        }
        if (b8 == 10) {
            List<Integer> e8 = l0.e(bArr);
            if (e8 != null) {
                com.crrepa.n.e.a().b(e8);
                return;
            }
            return;
        }
        if (b8 == 15) {
            List<Integer> c8 = l0.c(bArr);
            if (c8 != null) {
                com.crrepa.n.e.a().a(c8);
                return;
            }
            return;
        }
        if (b8 == 17) {
            CRPTrainingAdvancedInfo b9 = l0.b(bArr);
            if (b9 != null) {
                com.crrepa.n.e.a().a(b9);
                return;
            }
            return;
        }
        if (b8 != 5) {
            if (b8 != 6) {
                return;
            }
            com.crrepa.n.e.a().a(bArr);
        } else {
            CRPTrainingInfo f8 = l0.f(bArr);
            if (f8 != null) {
                com.crrepa.n.e.a().a(f8);
            }
        }
    }

    private void p(byte[] bArr) {
        CRPBarometerCalibrationListener cRPBarometerCalibrationListener = this.f13277c0;
        if (cRPBarometerCalibrationListener != null) {
            cRPBarometerCalibrationListener.onUpdateBarometer();
        }
    }

    private void p0(byte[] bArr) {
        CRPLocalVideoChangeListener cRPLocalVideoChangeListener;
        if (com.crrepa.g1.c.h(bArr) || (cRPLocalVideoChangeListener = this.f13271a0) == null) {
            return;
        }
        cRPLocalVideoChangeListener.onLocalVideoDeleted(bArr[0] == 0);
    }

    private void p1(byte[] bArr) {
        if (this.F == null || com.crrepa.g1.c.h(bArr) || bArr.length < 18) {
            return;
        }
        CRPTrainingRealtimeInfo cRPTrainingRealtimeInfo = new CRPTrainingRealtimeInfo();
        cRPTrainingRealtimeInfo.setState(bArr[0]);
        cRPTrainingRealtimeInfo.setHeartrate(bArr[1]);
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 2, bArr2, 0, 4);
        cRPTrainingRealtimeInfo.setSteps((int) com.crrepa.g1.c.f(bArr2));
        System.arraycopy(bArr, 6, bArr2, 0, 4);
        cRPTrainingRealtimeInfo.setTrainingTime((int) com.crrepa.g1.c.f(bArr2));
        cRPTrainingRealtimeInfo.setDistance(com.crrepa.g1.c.b(bArr[11], bArr[10]));
        cRPTrainingRealtimeInfo.setCalories(com.crrepa.g1.c.b(bArr[13], bArr[12]));
        System.arraycopy(bArr, 14, bArr2, 0, 4);
        cRPTrainingRealtimeInfo.setStartTime(z1.a(com.crrepa.g1.c.f(bArr2) * 1000));
        this.F.onRealtimeTrainingChange(cRPTrainingRealtimeInfo);
    }

    private void q(byte[] bArr) {
        if (this.C == null || com.crrepa.g1.c.h(bArr)) {
            return;
        }
        this.C.onBatterSaving(bArr[0] == 1);
    }

    private void q0(byte[] bArr) {
        CRPLocalVideoInfo b8 = u0.b(bArr);
        CRPLocalVideoChangeListener cRPLocalVideoChangeListener = this.f13271a0;
        if (cRPLocalVideoChangeListener == null || b8 == null) {
            return;
        }
        cRPLocalVideoChangeListener.onLocalVideoInfo(b8);
    }

    private void q1(byte[] bArr) {
        com.crrepa.y0.a aVar = new com.crrepa.y0.a(bArr);
        if (CRPUiTransInitiator.getInstance().isStarted()) {
            CRPUiTransInitiator.getInstance().transFileIndex(aVar);
        }
        if (CRPTpTransInitiator.getInstance().isStarted()) {
            CRPTpTransInitiator.getInstance().transFileIndex(aVar);
        }
    }

    private void r(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            com.crrepa.m0.c.a().a(bArr[1] > 0);
        } else {
            if (b8 != 1) {
                return;
            }
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 1, bArr2, 0, length);
            com.crrepa.m0.c.a().transFileIndex(new com.crrepa.y0.a(bArr2));
        }
    }

    private void r0(byte[] bArr) {
        int a8 = b2.a(bArr);
        CRPDeviceMetricSystemCallback cRPDeviceMetricSystemCallback = this.f13298j0;
        if (cRPDeviceMetricSystemCallback != null) {
            cRPDeviceMetricSystemCallback.onMetricSystem(a8);
        }
    }

    private void r1(byte[] bArr) {
        com.crrepa.y0.b.a().transFileIndex(new com.crrepa.y0.a(bArr));
    }

    private void s(byte[] bArr) {
        if (this.f13318q == null || com.crrepa.g1.c.h(bArr)) {
            return;
        }
        this.f13318q.onBloodOxygen(com.crrepa.g1.c.a(bArr[0]));
    }

    private void s0(byte[] bArr) {
        if (this.f13290g1 == null || bArr.length < 3) {
            return;
        }
        this.f13290g1.onMessageLength(com.crrepa.g1.c.b(bArr[2], bArr[1]));
    }

    private void s1(byte[] bArr) {
        CRPOfflineVoiceListener cRPOfflineVoiceListener = this.U;
        if (cRPOfflineVoiceListener != null) {
            cRPOfflineVoiceListener.onCertification(bArr);
        }
    }

    private void t(byte[] bArr) {
        CRPBreathRateChangeListener cRPBreathRateChangeListener = this.L;
        if (cRPBreathRateChangeListener == null) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            cRPBreathRateChangeListener.onBreathRate(bArr[2]);
            return;
        }
        if (b8 == 1) {
            cRPBreathRateChangeListener.onTimingBreathRateState(bArr[2] == 0);
        } else if (b8 == 2) {
            cRPBreathRateChangeListener.onHistoryBreathRate(o.a(bArr));
        } else {
            if (b8 != 3) {
                return;
            }
            cRPBreathRateChangeListener.onTimingBreathRate(o.b(bArr));
        }
    }

    private void t0(byte[] bArr) {
        if (this.Q0 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 3; i8 < bArr.length; i8++) {
            arrayList.add(Integer.valueOf(com.crrepa.g1.c.a(bArr[i8])));
        }
        this.Q0.onMessageList(arrayList);
    }

    private void t1(byte[] bArr) {
        com.crrepa.a1.f b8 = com.crrepa.a1.g.b();
        if (b8 != null) {
            b8.transFileIndex(new com.crrepa.y0.a(bArr));
        }
    }

    private void u(byte[] bArr) {
        if (this.f13326t0 == null || com.crrepa.g1.c.h(bArr)) {
            return;
        }
        this.f13326t0.onBreathingLight(bArr[0] == 1);
    }

    private void u0(byte[] bArr) {
        List<CRPMovementHeartRateInfo> a8 = v0.a(bArr);
        CRPHeartRateChangeListener cRPHeartRateChangeListener = this.f13312o;
        if (cRPHeartRateChangeListener != null) {
            cRPHeartRateChangeListener.onMovementMeasureResult(a8);
        }
    }

    private void u1(byte[] bArr) {
        CRPWatchFaceLayoutInfo a8 = n0.a(bArr);
        CRPDeviceWatchFaceLayoutCallback cRPDeviceWatchFaceLayoutCallback = this.f13328u0;
        if (cRPDeviceWatchFaceLayoutCallback == null || a8 == null) {
            return;
        }
        cRPDeviceWatchFaceLayoutCallback.onWatchFaceLayoutChange(a8);
    }

    private void v(byte[] bArr) {
        CRPDeviceBrightnessCallback cRPDeviceBrightnessCallback;
        if (bArr == null || bArr.length < 2 || (cRPDeviceBrightnessCallback = this.E0) == null) {
            return;
        }
        cRPDeviceBrightnessCallback.onBrightness(bArr[0], bArr[1]);
    }

    private void v0(byte[] bArr) {
        if (bArr.length < 5) {
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 1, bArr2, 0, 4);
        int f8 = (int) com.crrepa.g1.c.f(bArr2);
        if (20 < f8) {
            f8 -= 20;
        }
        int b8 = 11 <= bArr.length ? com.crrepa.g1.c.b(bArr[10], bArr[9]) : 0;
        byte b9 = bArr[0];
        if (b9 == 3) {
            CRPAvailableStorageCallback cRPAvailableStorageCallback = this.S0;
            if (cRPAvailableStorageCallback != null) {
                cRPAvailableStorageCallback.onAvailableSize(f8);
                return;
            }
            return;
        }
        if (b9 == 15) {
            u0.a(f8);
            return;
        }
        if (b9 == 17) {
            i0.a(f8, b8);
            return;
        }
        if (b9 == 7) {
            CRPMusicChangeListener cRPMusicChangeListener = this.W;
            if (cRPMusicChangeListener != null) {
                cRPMusicChangeListener.onAvailableSize(f8);
                return;
            }
            return;
        }
        if (b9 == 8) {
            com.crrepa.c0.e.a().a(f8);
            return;
        }
        switch (b9) {
            case 10:
                com.crrepa.n.a.a().a(f8);
                break;
            case 11:
                CRPPhotoWatchFaceChangeListener cRPPhotoWatchFaceChangeListener = this.Y;
                if (cRPPhotoWatchFaceChangeListener != null) {
                    cRPPhotoWatchFaceChangeListener.onAvailableSize(1, f8);
                    break;
                }
                break;
            case 12:
                CRPVideoWatchFaceChangeListener cRPVideoWatchFaceChangeListener = this.X;
                if (cRPVideoWatchFaceChangeListener != null) {
                    cRPVideoWatchFaceChangeListener.onAvailableSize(f8);
                    break;
                }
                break;
        }
    }

    private void v1(byte[] bArr) {
        if (this.J0 == null || com.crrepa.g1.c.h(bArr) || bArr[0] != 1) {
            return;
        }
        this.J0.onWatchFaceList(p0.m(bArr));
    }

    private void w(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || this.F0 == null) {
            return;
        }
        this.F0.onAddress(h4.b.a(bArr));
    }

    private void w0(byte[] bArr) {
        if (this.W == null || 6 > bArr.length) {
            return;
        }
        int b8 = com.crrepa.g1.c.b(bArr[1], bArr[0]);
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 2, bArr2, 0, 4);
        this.W.onMusicSavedCount(b8, com.crrepa.g1.c.f(bArr2) * 1000);
    }

    private void w1(byte[] bArr) {
        CRPWeatherChangeListener cRPWeatherChangeListener;
        if (com.crrepa.g1.c.h(bArr) || (cRPWeatherChangeListener = this.f13325t) == null) {
            return;
        }
        cRPWeatherChangeListener.onTempUnitChange(bArr[0]);
    }

    private void x(byte[] bArr) {
        CRPCalendarEventListener cRPCalendarEventListener = this.J;
        if (cRPCalendarEventListener == null || bArr.length < 3) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 1) {
            cRPCalendarEventListener.onEvent(q.a(bArr));
        } else if (b8 == 3) {
            cRPCalendarEventListener.onSupportEvent(bArr[2], q.b(bArr));
        } else {
            if (b8 != 5) {
                return;
            }
            cRPCalendarEventListener.onEventReminderTime(bArr[2] > 0, 3 < bArr.length ? bArr[3] : (byte) 0);
        }
    }

    private void x0(byte[] bArr) {
        if (this.W == null || 3 > bArr.length) {
            return;
        }
        this.W.onMusicDeleted(com.crrepa.g1.c.b(bArr[2], bArr[1]), bArr[0] == 0);
    }

    private void x1(byte[] bArr) {
        if (this.f13283e0 == null || com.crrepa.g1.c.h(bArr) || bArr.length < 2) {
            return;
        }
        switch (bArr[1]) {
            case 1:
                y1(bArr);
                break;
            case 2:
                this.f13283e0.onSubscribeMessage(bArr[2] == 1);
                break;
            case 3:
                z1(bArr);
                break;
            case 5:
                this.f13283e0.onActivateRecording();
                break;
            case 6:
                int length = bArr.length - 2;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 2, bArr2, 0, length);
                this.f13283e0.onStartRecording(bArr2);
                break;
            case 7:
                CRPBleRecordingType cRPBleRecordingType = CRPBleRecordingType.JIELI;
                if (2 < bArr.length) {
                    cRPBleRecordingType = CRPBleRecordingType.getInstance(bArr[2]);
                }
                this.f13283e0.onStopRecording(cRPBleRecordingType);
                break;
            case 8:
                this.f13283e0.onCancel();
                break;
        }
    }

    private void y(byte[] bArr) {
        if (this.E != null) {
            String str = new String(bArr, StandardCharsets.UTF_8);
            BleLog.d("number: " + str);
            this.E.onCallNumber(str);
        }
    }

    private void y0(byte[] bArr) {
        if (this.W == null || 3 >= bArr.length) {
            return;
        }
        int b8 = com.crrepa.g1.c.b(bArr[1], bArr[0]);
        int length = bArr.length - 3;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 3, bArr2, 0, length);
        this.W.onMusicName(b8, new String(bArr2, StandardCharsets.UTF_8));
    }

    private void y1(byte[] bArr) {
        CRPWhatsappConfigInfo cRPWhatsappConfigInfo = new CRPWhatsappConfigInfo(bArr[2] > 0);
        if (3 < bArr.length) {
            cRPWhatsappConfigInfo.setContactCount(bArr[3]);
        }
        if (5 < bArr.length) {
            cRPWhatsappConfigInfo.setReceiveMsgLength(com.crrepa.g1.c.b(bArr[4], bArr[5]));
        }
        if (7 < bArr.length) {
            cRPWhatsappConfigInfo.setSendMsgLength(com.crrepa.g1.c.b(bArr[6], bArr[7]));
        }
        this.f13283e0.onConfig(cRPWhatsappConfigInfo);
    }

    private void z(byte[] bArr) {
        CRPCaloriesCategoryChangeListener cRPCaloriesCategoryChangeListener;
        CRPCaloriesCategoryInfo b8 = this.f13288g.b(bArr);
        if (b8 == null || (cRPCaloriesCategoryChangeListener = this.S) == null) {
            return;
        }
        cRPCaloriesCategoryChangeListener.onCaloriesCategoryChange(b8);
    }

    private void z0(byte[] bArr) {
        CRPPhoneOperationListener cRPPhoneOperationListener;
        if (com.crrepa.g1.c.h(bArr) || (cRPPhoneOperationListener = this.f13321r) == null) {
            return;
        }
        cRPPhoneOperationListener.onOperationChange(bArr[0]);
    }

    private void z1(byte[] bArr) {
        if (this.f13283e0 == null || bArr.length < 4) {
            return;
        }
        byte b8 = bArr[2];
        byte b9 = bArr[3];
        int length = (bArr.length - 4) - b9;
        String str = "";
        String str2 = 4 < bArr.length ? new String(bArr, 4, b9, StandardCharsets.UTF_8) : "";
        int i8 = b9 + 4;
        if (i8 < bArr.length) {
            if (b8 == 1) {
                str = new String(bArr, i8, length, StandardCharsets.UTF_8);
            } else if (b8 == 2) {
                byte[] bArr2 = new byte[4];
                StringBuilder sb = new StringBuilder();
                for (int i9 = b9 + 5; i9 < bArr.length; i9 += 4) {
                    System.arraycopy(bArr, i9, bArr2, 0, 4);
                    sb.append(new String(Character.toChars((int) com.crrepa.g1.c.f(bArr2))));
                }
                str = sb.toString();
            }
        }
        this.f13283e0.onSendMessage(new CRPWhatsappSendMessageInfo(b8, str2, str));
    }

    public void b(boolean z7) {
        this.f13317p1 = z7;
    }

    private void a(int i8) {
        CRPHeartRateChangeListener cRPHeartRateChangeListener = this.f13312o;
        if (cRPHeartRateChangeListener != null) {
            cRPHeartRateChangeListener.onMeasuring(i8);
        }
    }

    private void b(byte[] bArr) {
        if (bArr.length < 2) {
            return;
        }
        CRPDeviceBondStateCallback cRPDeviceBondStateCallback = this.H0;
        if (cRPDeviceBondStateCallback != null) {
            cRPDeviceBondStateCallback.onBondState(bArr[1]);
        }
        CRPConnectivityCheckCallback cRPConnectivityCheckCallback = this.f13281d1;
        if (cRPConnectivityCheckCallback != null) {
            cRPConnectivityCheckCallback.onConnectivityCheck(bArr[1]);
        }
    }

    private void c(byte[] bArr) {
        CRPDrinkWaterPeriodInfo a8 = a0.a(bArr);
        CRPDeviceDrinkWaterListener cRPDeviceDrinkWaterListener = this.f13338z0;
        if (cRPDeviceDrinkWaterListener == null || a8 == null) {
            return;
        }
        cRPDeviceDrinkWaterListener.onDrinkWaterPeriod(a8);
    }

    private void d(byte[] bArr) {
        CRPHandWashingPeriodInfo a8 = m0.a(bArr);
        CRPDeviceHandWashingPeriodCallback cRPDeviceHandWashingPeriodCallback = this.D0;
        if (cRPDeviceHandWashingPeriodCallback == null || a8 == null) {
            return;
        }
        cRPDeviceHandWashingPeriodCallback.onHandWashingPeriod(a8);
    }

    private void e(byte[] bArr) {
        CRPDeviceMaxHeartRateCallback cRPDeviceMaxHeartRateCallback = this.A0;
        if (cRPDeviceMaxHeartRateCallback == null || bArr.length < 3) {
            return;
        }
        cRPDeviceMaxHeartRateCallback.onHeartRate(bArr[2] & 255, bArr[1] == 1);
    }

    private void f(byte[] bArr) {
        if (this.f13337z == null || com.crrepa.g1.c.h(bArr)) {
            return;
        }
        this.f13337z.onMeasureState(bArr[0] == 1);
    }

    private void g(byte[] bArr) {
        if (this.f13337z != null) {
            this.f13337z.onMeasureTemp(this.f13297j.c(bArr));
        }
    }

    private void a(int i8, CRPPeriodTimeInfo cRPPeriodTimeInfo) {
        CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback = this.f13322r0;
        if (cRPDevicePeriodTimeCallback != null) {
            cRPDevicePeriodTimeCallback.onPeriodTime(i8, cRPPeriodTimeInfo);
        }
    }

    public synchronized void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        try {
            String lowerCase = bluetoothGattCharacteristic.getUuid().toString().toLowerCase();
            byte[] value = bluetoothGattCharacteristic.getValue();
            BleLog.i("onCharacteristicChanged: " + lowerCase);
            BleLog.i("onCharacteristicChanged: " + com.crrepa.g1.c.c(value));
            if (value == null) {
                return;
            }
            if (lowerCase.contains(a4.a.f29e)) {
                f1(value);
            } else if (lowerCase.contains(a4.a.f57l)) {
                V0(value);
            } else {
                if (!lowerCase.contains(a4.a.f68o) && !lowerCase.contains(a4.a.f71p)) {
                    if (lowerCase.contains(a4.a.f41h)) {
                        m(value);
                    } else if (lowerCase.contains(a4.a.f83t)) {
                        s1(value);
                    } else if (lowerCase.contains(a4.a.f74q)) {
                        g0(value);
                    } else if (B1(value)) {
                        e();
                    }
                }
                S(value);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(CRPHeartRateInfo cRPHeartRateInfo) {
        CRPHeartRateChangeListener cRPHeartRateChangeListener = this.f13312o;
        if (cRPHeartRateChangeListener == null || cRPHeartRateInfo == null) {
            return;
        }
        cRPHeartRateChangeListener.on24HourMeasureResult(cRPHeartRateInfo);
    }

    private void a(CRPSleepInfo cRPSleepInfo, CRPHistoryDay cRPHistoryDay) {
        if (cRPSleepInfo == null || cRPHistoryDay == null) {
            return;
        }
        int i8 = -cRPHistoryDay.getValue();
        Date date = new Date();
        if (b0.a(date)) {
            i8++;
        }
        cRPSleepInfo.setDate(b0.a(date, i8));
        this.f13309n.onHistorySleepChange(cRPHistoryDay, cRPSleepInfo);
    }

    public void a(CRPAlarmCallback cRPAlarmCallback) {
        this.f13286f0 = cRPAlarmCallback;
    }

    public void a(CRPAvailableStorageCallback cRPAvailableStorageCallback) {
        this.S0 = cRPAvailableStorageCallback;
    }

    public void a(CRPBluetrumWatchFaceCallback cRPBluetrumWatchFaceCallback) {
        this.Z0 = cRPBluetrumWatchFaceCallback;
    }

    public void a(CRPBtAddressCallback cRPBtAddressCallback) {
        this.F0 = cRPBtAddressCallback;
    }

    public void a(CRPConnectivityCheckCallback cRPConnectivityCheckCallback) {
        this.f13281d1 = cRPConnectivityCheckCallback;
    }

    public void a(CRPContactConfigCallback cRPContactConfigCallback) {
        this.G0 = cRPContactConfigCallback;
    }

    public void a(CRPContactCountCallback cRPContactCountCallback) {
        this.I0 = cRPContactCountCallback;
    }

    public void a(CRPContactNumberSymbolCallback cRPContactNumberSymbolCallback) {
        this.R0 = cRPContactNumberSymbolCallback;
    }

    public void a(CRPDailyGoalsCallback cRPDailyGoalsCallback) {
        this.M0 = cRPDailyGoalsCallback;
    }

    public void a(CRPDeviceBondStateCallback cRPDeviceBondStateCallback) {
        this.H0 = cRPDeviceBondStateCallback;
    }

    public void a(CRPDeviceBreathingLightCallback cRPDeviceBreathingLightCallback) {
        this.f13326t0 = cRPDeviceBreathingLightCallback;
    }

    public void a(CRPDeviceBrightnessCallback cRPDeviceBrightnessCallback) {
        this.E0 = cRPDeviceBrightnessCallback;
    }

    public void a(CRPDeviceDfuAddressCallback cRPDeviceDfuAddressCallback) {
        this.f13334x0 = cRPDeviceDfuAddressCallback;
    }

    public void a(CRPDeviceDisplayTimeCallback cRPDeviceDisplayTimeCallback) {
        this.C0 = cRPDeviceDisplayTimeCallback;
    }

    public void a(CRPDeviceDisplayWatchFaceCallback cRPDeviceDisplayWatchFaceCallback) {
        this.f13313o0 = cRPDeviceDisplayWatchFaceCallback;
    }

    public void a(CRPDeviceDominantHandCallback cRPDeviceDominantHandCallback) {
        this.f13289g0 = cRPDeviceDominantHandCallback;
    }

    public void a(CRPDeviceFunctionCallback cRPDeviceFunctionCallback) {
        this.f13319q0 = cRPDeviceFunctionCallback;
    }

    public void a(CRPDeviceGoalStepCallback cRPDeviceGoalStepCallback) {
        this.f13292h0 = cRPDeviceGoalStepCallback;
    }

    public void a(CRPDeviceHandWashingPeriodCallback cRPDeviceHandWashingPeriodCallback) {
        this.D0 = cRPDeviceHandWashingPeriodCallback;
    }

    public void a(CRPDeviceInfoCallback cRPDeviceInfoCallback) {
        this.f13299j1 = cRPDeviceInfoCallback;
    }

    public void a(CRPDeviceLanguageCallback cRPDeviceLanguageCallback) {
        this.f13295i0 = cRPDeviceLanguageCallback;
    }

    public void a(CRPDeviceMaxHeartRateCallback cRPDeviceMaxHeartRateCallback) {
        this.A0 = cRPDeviceMaxHeartRateCallback;
    }

    public void a(CRPDeviceMetricSystemCallback cRPDeviceMetricSystemCallback) {
        this.f13298j0 = cRPDeviceMetricSystemCallback;
    }

    public void a(CRPDeviceNameCallback cRPDeviceNameCallback) {
        this.f13305l1 = cRPDeviceNameCallback;
    }

    public void a(CRPDeviceOtherMessageCallback cRPDeviceOtherMessageCallback) {
        this.f13301k0 = cRPDeviceOtherMessageCallback;
    }

    public void a(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback) {
        this.f13322r0 = cRPDevicePeriodTimeCallback;
    }

    public void a(CRPDevicePhysiologcalPeriodCallback cRPDevicePhysiologcalPeriodCallback) {
        this.f13336y0 = cRPDevicePhysiologcalPeriodCallback;
    }

    public void a(CRPDeviceQuickViewCallback cRPDeviceQuickViewCallback) {
        this.f13304l0 = cRPDeviceQuickViewCallback;
    }

    public void a(CRPDeviceSedentaryReminderCallback cRPDeviceSedentaryReminderCallback) {
        this.f13307m0 = cRPDeviceSedentaryReminderCallback;
    }

    public void a(CRPDeviceSedentaryReminderPeriodCallback cRPDeviceSedentaryReminderPeriodCallback) {
        this.f13330v0 = cRPDeviceSedentaryReminderPeriodCallback;
    }

    public void a(CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback) {
        this.f13332w0 = cRPDeviceSupportWatchFaceCallback;
    }

    public void a(CRPDeviceTestModeCallback cRPDeviceTestModeCallback) {
        this.X0 = cRPDeviceTestModeCallback;
    }

    public void a(CRPDeviceTimeSystemCallback cRPDeviceTimeSystemCallback) {
        this.f13310n0 = cRPDeviceTimeSystemCallback;
    }

    public void a(CRPDeviceTimingMeasureHeartRateCallback cRPDeviceTimingMeasureHeartRateCallback) {
        this.f13324s0 = cRPDeviceTimingMeasureHeartRateCallback;
    }

    public void a(CRPDeviceUIVersionCodeCallback cRPDeviceUIVersionCodeCallback) {
        this.W0 = cRPDeviceUIVersionCodeCallback;
    }

    public void a(CRPDeviceVersionCallback cRPDeviceVersionCallback) {
        this.f13316p0 = cRPDeviceVersionCallback;
    }

    public void a(CRPDeviceWatchFaceLayoutCallback cRPDeviceWatchFaceLayoutCallback) {
        this.f13328u0 = cRPDeviceWatchFaceLayoutCallback;
    }

    public void a(CRPDeviceWatchFaceListCallback cRPDeviceWatchFaceListCallback) {
        this.J0 = cRPDeviceWatchFaceListCallback;
    }

    public void a(CRPElectronicCardCallback cRPElectronicCardCallback) {
        this.P0 = cRPElectronicCardCallback;
    }

    public void a(CRPElectronicCardCountCallback cRPElectronicCardCountCallback) {
        this.O0 = cRPElectronicCardCountCallback;
    }

    public void a(CRPFlashNotificationCallback cRPFlashNotificationCallback) {
        this.f13293h1 = cRPFlashNotificationCallback;
    }

    public void a(CRPJieliWatchFaceCallback cRPJieliWatchFaceCallback) {
        this.Y0 = cRPJieliWatchFaceCallback;
    }

    public void a(CRPMessageLengthCallback cRPMessageLengthCallback) {
        this.f13290g1 = cRPMessageLengthCallback;
    }

    public void a(CRPMessageListCallback cRPMessageListCallback) {
        this.Q0 = cRPMessageListCallback;
    }

    public void a(CRPMuslimPrayerCompensationCallback cRPMuslimPrayerCompensationCallback) {
        this.f13308m1 = cRPMuslimPrayerCompensationCallback;
    }

    public void a(CRPMuslimTasbihSettingCallback cRPMuslimTasbihSettingCallback) {
        this.f13272a1 = cRPMuslimTasbihSettingCallback;
    }

    public void a(CRPPillReminderCallback cRPPillReminderCallback) {
        this.K0 = cRPPillReminderCallback;
    }

    public void a(CRPSleepTimeCallback cRPSleepTimeCallback) {
        this.V0 = cRPSleepTimeCallback;
    }

    public void a(CRPSosStateCallback cRPSosStateCallback) {
        this.f13287f1 = cRPSosStateCallback;
    }

    public void a(CRPTapToWakeCallback cRPTapToWakeCallback) {
        this.L0 = cRPTapToWakeCallback;
    }

    public void a(CRPTimingTempStateCallback cRPTimingTempStateCallback) {
        this.B0 = cRPTimingTempStateCallback;
    }

    public void a(CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback) {
        this.N0 = cRPTrainingDayGoalsCallback;
    }

    public void a(CRPVibrationStrengthCallback cRPVibrationStrengthCallback) {
        this.U0 = cRPVibrationStrengthCallback;
    }

    public void a(CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback) {
        this.T0 = cRPWatchFaceDeleteCallback;
    }

    public void a(CRPWatchFaceScreenCallback cRPWatchFaceScreenCallback) {
        this.f13296i1 = cRPWatchFaceScreenCallback;
    }

    public void a(CRPWatchFaceTimeStyleCallback cRPWatchFaceTimeStyleCallback) {
        this.f13302k1 = cRPWatchFaceTimeStyleCallback;
    }

    public void a(CRPA2DPConnectStateListener cRPA2DPConnectStateListener) {
        this.G = cRPA2DPConnectStateListener;
    }

    public void a(CRPAiAgentListener cRPAiAgentListener) {
        this.f13311n1 = cRPAiAgentListener;
    }

    public void a(CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener) {
        this.R = cRPAiWatchFaceChangeListener;
    }

    public void a(CRPBarometerCalibrationListener cRPBarometerCalibrationListener) {
        this.f13277c0 = cRPBarometerCalibrationListener;
    }

    public void a(CRPBatterySavingChangeListener cRPBatterySavingChangeListener) {
        this.C = cRPBatterySavingChangeListener;
    }

    public void a(CRPBleECGChangeListener cRPBleECGChangeListener, CRPEcgMeasureType cRPEcgMeasureType) {
        this.f13329v = cRPBleECGChangeListener;
        this.f13294i = new com.crrepa.k.b().a(cRPEcgMeasureType);
    }

    public void a(CRPBloodOxygenChangeListener cRPBloodOxygenChangeListener) {
        this.f13318q = cRPBloodOxygenChangeListener;
    }

    public void a(CRPBloodPressureChangeListener cRPBloodPressureChangeListener) {
        this.f13315p = cRPBloodPressureChangeListener;
    }

    public void a(CRPBreathRateChangeListener cRPBreathRateChangeListener) {
        this.L = cRPBreathRateChangeListener;
    }

    public void a(CRPCalendarEventListener cRPCalendarEventListener) {
        this.J = cRPCalendarEventListener;
    }

    public void a(CRPCallNumberListener cRPCallNumberListener) {
        this.E = cRPCallNumberListener;
    }

    public void a(CRPCaloriesCategoryChangeListener cRPCaloriesCategoryChangeListener) {
        this.S = cRPCaloriesCategoryChangeListener;
    }

    public void a(CRPCameraOperationListener cRPCameraOperationListener) {
        this.f13323s = cRPCameraOperationListener;
    }

    public void a(CRPChatChangeListener cRPChatChangeListener) {
        this.Q = cRPChatChangeListener;
    }

    public void a(CRPContactListener cRPContactListener) {
        this.A = cRPContactListener;
    }

    public void a(CRPCustomKeyChangeListener cRPCustomKeyChangeListener) {
        this.N = cRPCustomKeyChangeListener;
    }

    public void a(CRPDeviceDrinkWaterListener cRPDeviceDrinkWaterListener) {
        this.f13338z0 = cRPDeviceDrinkWaterListener;
    }

    public void a(CRPDistanceCategoryChangeListener cRPDistanceCategoryChangeListener) {
        this.T = cRPDistanceCategoryChangeListener;
    }

    public void a(CRPEmojiChangeListener cRPEmojiChangeListener) {
        this.f13284e1 = cRPEmojiChangeListener;
    }

    public void a(CRPFindPhoneListener cRPFindPhoneListener) {
        this.f13327u = cRPFindPhoneListener;
    }

    public void a(CRPGalleryChangeListener cRPGalleryChangeListener) {
        this.f13274b0 = cRPGalleryChangeListener;
    }

    public void a(CRPGomoreListener cRPGomoreListener) {
        this.V = cRPGomoreListener;
    }

    public void a(CRPGpsChangeListener cRPGpsChangeListener) {
        this.K = cRPGpsChangeListener;
    }

    public void a(CRPHealthAnalysisListener cRPHealthAnalysisListener) {
        this.f13314o1 = cRPHealthAnalysisListener;
    }

    public void a(CRPHeartRateChangeListener cRPHeartRateChangeListener) {
        this.f13312o = cRPHeartRateChangeListener;
    }

    public void a(CRPHrvChangeListener cRPHrvChangeListener) {
        this.D = cRPHrvChangeListener;
    }

    public void a(CRPLocalNavigationListener cRPLocalNavigationListener) {
        this.f13280d0 = cRPLocalNavigationListener;
    }

    public void a(CRPLocalVideoChangeListener cRPLocalVideoChangeListener) {
        this.f13271a0 = cRPLocalVideoChangeListener;
    }

    public void a(CRPMovementStateListener cRPMovementStateListener) {
        this.f13335y = cRPMovementStateListener;
    }

    public void a(CRPMusicChangeListener cRPMusicChangeListener) {
        this.W = cRPMusicChangeListener;
    }

    public void a(CRPMuslimNameListener cRPMuslimNameListener) {
        this.f13278c1 = cRPMuslimNameListener;
    }

    public void a(CRPMuslimPrayerSettingListener cRPMuslimPrayerSettingListener) {
        this.f13275b1 = cRPMuslimPrayerSettingListener;
    }

    public void a(CRPNewHrvChangeListener cRPNewHrvChangeListener) {
        this.I = cRPNewHrvChangeListener;
    }

    public void a(CRPOfflineVoiceListener cRPOfflineVoiceListener) {
        this.U = cRPOfflineVoiceListener;
    }

    public void a(CRPPhoneOperationListener cRPPhoneOperationListener) {
        this.f13321r = cRPPhoneOperationListener;
    }

    public void a(CRPPhotoWatchFaceChangeListener cRPPhotoWatchFaceChangeListener) {
        this.Y = cRPPhotoWatchFaceChangeListener;
    }

    public void a(CRPQuickResponsesChangeListener cRPQuickResponsesChangeListener) {
        this.M = cRPQuickResponsesChangeListener;
    }

    public void a(CRPScreenOffClockListener cRPScreenOffClockListener) {
        this.Z = cRPScreenOffClockListener;
    }

    public void a(CRPSleepActionChangeListener cRPSleepActionChangeListener) {
        this.f13333x = cRPSleepActionChangeListener;
    }

    public void a(CRPSleepChangeListener cRPSleepChangeListener) {
        this.f13309n = cRPSleepChangeListener;
    }

    public void a(CRPSosChangeListener cRPSosChangeListener) {
        this.B = cRPSosChangeListener;
    }

    public void a(CRPStepChangeListener cRPStepChangeListener) {
        this.f13306m = cRPStepChangeListener;
    }

    public void a(CRPStepsCategoryChangeListener cRPStepsCategoryChangeListener) {
        this.f13331w = cRPStepsCategoryChangeListener;
    }

    public void a(CRPStockChangeListener cRPStockChangeListener) {
        this.P = cRPStockChangeListener;
    }

    public void a(CRPStressListener cRPStressListener) {
        this.H = cRPStressListener;
    }

    public void a(CRPTempChangeListener cRPTempChangeListener) {
        this.f13337z = cRPTempChangeListener;
    }

    public void a(CRPTrainingChangeListener cRPTrainingChangeListener) {
        this.F = cRPTrainingChangeListener;
    }

    public void a(CRPVideoWatchFaceChangeListener cRPVideoWatchFaceChangeListener) {
        this.X = cRPVideoWatchFaceChangeListener;
    }

    public void a(CRPWeatherChangeListener cRPWeatherChangeListener) {
        this.f13325t = cRPWeatherChangeListener;
    }

    public void a(CRPWhatsappListener cRPWhatsappListener) {
        this.f13283e0 = cRPWhatsappListener;
    }

    public void a(CRPWorldClockListener cRPWorldClockListener) {
        this.O = cRPWorldClockListener;
    }

    public void a(boolean z7) {
        this.f13320q1 = z7;
    }

    private void a(byte[] bArr) {
        if (this.f13327u == null) {
            return;
        }
        if (com.crrepa.g1.c.h(bArr) || bArr[0] == 0) {
            this.f13327u.onFindPhone();
        } else {
            this.f13327u.onFindPhoneComplete();
        }
    }

    private void a(byte[] bArr, int i8) {
        a(i8, h.a(bArr));
    }
}
