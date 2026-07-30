package com.crrepa.ble.conn;

import android.graphics.Bitmap;
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
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface CRPBleConnection {
    void abortAiAgent();

    void abortChat();

    void abortFirmwareUpgrade();

    void abortInstallApp();

    void abortSendConnectKitFile();

    void abortSendGallery();

    void abortSendLocalVideo();

    void abortSendMusic();

    void abortWatchFace();

    void abortWatchFaceBackground();

    void addWaterIntake(CRPWaterIntakeInfo cRPWaterIntakeInfo);

    void checkFirmwareVersion(CRPDeviceNewFirmwareVersionCallback cRPDeviceNewFirmwareVersionCallback, String str, int i8);

    void checkSupportQuickContact(CRPContactConfigCallback cRPContactConfigCallback);

    void clearCalendarEvent();

    void clearContact();

    void clearGallery();

    void clearPillReminder();

    void clearStock();

    void close();

    void closeMusicControl();

    boolean connect();

    void connectivityCheck(boolean z7, byte[] bArr, CRPConnectivityCheckCallback cRPConnectivityCheckCallback);

    void createBond(byte[] bArr, CRPDeviceBondStateCallback cRPDeviceBondStateCallback);

    void createBond(byte[] bArr, boolean z7, int i8, CRPDeviceBondStateCallback cRPDeviceBondStateCallback);

    void deleteAllNewAlarm();

    void deleteCalendarEvent(int i8);

    void deleteContact(int i8);

    void deleteContactAvatar(int i8);

    void deleteElectronicCard(int i8);

    void deleteGalleryPhoto(List<String> list);

    void deleteJieliWatchFace(int[] iArr, CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback);

    void deleteLocalVideo(String str);

    void deleteMusic(int i8);

    void deleteNewAlarm(int i8);

    void deletePhotoWatchFace(String str);

    void deletePillReminder(int i8);

    void deleteStock(byte b8);

    void deleteWatchFace(int i8, CRPWatchFaceDeleteCallback cRPWatchFaceDeleteCallback);

    void deleteWaterIntake(CRPWaterIntakeInfo.WaterIntakeType waterIntakeType, int i8);

    void deleteWorldClock(byte b8);

    void disableContinueBloodOxygen();

    void disableContinueBloodPressure();

    void disableContinueTemp();

    void disableHrvMeasure();

    void disableQuickResponses();

    void disableScreenOffClock();

    void disableTimingBreathRate();

    void disableTimingMeasureBloodOxygen();

    void disableTimingMeasureHeartRate();

    void disableTimingMeasureTemp();

    void disableTimingStress();

    void enableContinueBloodOxygen();

    void enableContinueBloodPressure();

    void enableContinueTemp();

    void enableHrvMeasure(int i8);

    void enableHsDfu();

    void enableQuickResponses();

    void enableScreenOffClock();

    void enableSos(boolean z7);

    void enableTimingBreathRate();

    void enableTimingMeasureBloodOxygen(int i8);

    void enableTimingMeasureHeartRate(int i8);

    void enableTimingMeasureTemp();

    void enableTimingStress();

    void enterCameraView();

    void exitCameraView();

    void findDevice();

    CRPProtocolVersion getProtocolVersion();

    void installApp(File file, CRPAppTransListener cRPAppTransListener);

    boolean isNewECGMeasurementVersion();

    void pingApp(CRPConnectKitMessage cRPConnectKitMessage);

    void queryA2DPState();

    void queryAiPhotoWatchFace();

    void queryAiWatchFaceLayout();

    void queryAllAlarm(CRPAlarmCallback cRPAlarmCallback);

    void queryAllNewAlarm(CRPAlarmCallback cRPAlarmCallback);

    void queryAppAvailableSize();

    void queryAppStoreInfo();

    void queryAvailableStorage(CRPAvailableStorageCallback cRPAvailableStorageCallback);

    void queryBatterySaving();

    void queryBluetrumWatchFaceInfo(CRPBluetrumWatchFaceCallback cRPBluetrumWatchFaceCallback);

    void queryBreathingLight(CRPDeviceBreathingLightCallback cRPDeviceBreathingLightCallback);

    void queryBrightness(CRPDeviceBrightnessCallback cRPDeviceBrightnessCallback);

    void queryBtAddress(CRPBtAddressCallback cRPBtAddressCallback);

    void queryCalendarEvent(int i8);

    void queryCalendarEventReminderTime();

    void queryCaloriesCategory(CRPCategoryHistoryDay cRPCategoryHistoryDay);

    void queryConnectKitAvailableStorage();

    void queryContactCount(CRPContactCountCallback cRPContactCountCallback);

    void queryContactNumberSymbol(CRPContactNumberSymbolCallback cRPContactNumberSymbolCallback);

    void queryContinueBloodOxygenState();

    void queryContinueBloodPressureState();

    void queryContinueTempState();

    void queryDailyGoals(CRPDailyGoalsCallback cRPDailyGoalsCallback);

    void queryDeviceBattery();

    void queryDeviceDfuStatus(CRPDeviceDfuStatusCallback cRPDeviceDfuStatusCallback);

    void queryDeviceInfo(CRPDeviceInfoCallback cRPDeviceInfoCallback);

    void queryDeviceLanguage(CRPDeviceLanguageCallback cRPDeviceLanguageCallback);

    void queryDeviceSupportFunction(CRPDeviceFunctionCallback cRPDeviceFunctionCallback);

    void queryDeviceVersion(CRPDeviceVersionCallback cRPDeviceVersionCallback);

    void queryDfuType(CRPDeviceDfuTypeCallback cRPDeviceDfuTypeCallback);

    void queryDisplayDeviceFunction(CRPDeviceFunctionCallback cRPDeviceFunctionCallback);

    void queryDisplayTime(CRPDeviceDisplayTimeCallback cRPDeviceDisplayTimeCallback);

    void queryDisplayWatchFace(CRPDeviceDisplayWatchFaceCallback cRPDeviceDisplayWatchFaceCallback);

    void queryDistanceCategory(CRPCategoryHistoryDay cRPCategoryHistoryDay);

    void queryDoNotDistrubTime(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback);

    void queryDominantHand(CRPDeviceDominantHandCallback cRPDeviceDominantHandCallback);

    void queryDrinkWaterGoals();

    void queryDrinkWaterReminderPeriod();

    void queryElectronicCard(int i8, CRPElectronicCardCallback cRPElectronicCardCallback);

    void queryElectronicCardCount(CRPElectronicCardCountCallback cRPElectronicCardCountCallback);

    void queryFlashNotification(CRPFlashNotificationCallback cRPFlashNotificationCallback);

    void queryFrimwareVersion(CRPDeviceFirmwareVersionCallback cRPDeviceFirmwareVersionCallback);

    void queryGalleryInfo();

    void queryGoalStep(CRPDeviceGoalStepCallback cRPDeviceGoalStepCallback);

    void queryGomoreEUID();

    void queryGpsDetail(int i8);

    void queryHandWashingReminderPeriod(CRPDeviceHandWashingPeriodCallback cRPDeviceHandWashingPeriodCallback);

    void queryHistoryBloodOxygen();

    void queryHistoryBloodPressure();

    void queryHistoryBreathRate();

    void queryHistoryGps();

    void queryHistoryHeartRate();

    void queryHistoryNapSleep(CRPHistoryDay cRPHistoryDay);

    void queryHistoryNewHrv();

    void queryHistoryRemSleep(CRPHistoryDay cRPHistoryDay);

    void queryHistorySleep(CRPHistoryDay cRPHistoryDay);

    void queryHistoryStep(CRPHistoryDay cRPHistoryDay);

    void queryHistoryStress();

    void queryHistoryTimingHeartRate(CRPHistoryDay cRPHistoryDay);

    void queryHistoryTraining();

    void queryHrv(int i8, int i9);

    void queryHrvMeasureCount(int i8);

    void queryHrvMeasureInterval();

    void queryHsDfuAddress(CRPDeviceDfuAddressCallback cRPDeviceDfuAddressCallback);

    void queryJieliPhotoWatchFace();

    void queryJieliPhotoWatchFaceLayout();

    void queryJieliWatchFaceInfo(CRPJieliWatchFaceCallback cRPJieliWatchFaceCallback);

    void queryLast24HourBloodOxygen();

    void queryLast24HourBloodPressure();

    void queryLast24HourTemp();

    void queryLastDynamicRate(CRPHistoryDynamicRateType cRPHistoryDynamicRateType);

    void queryLastMeasureECGData();

    void queryLocalVideoInfo();

    void queryMaxHeartRate(CRPDeviceMaxHeartRateCallback cRPDeviceMaxHeartRateCallback);

    void queryMessageLength(CRPMessageLengthCallback cRPMessageLengthCallback);

    void queryMessageList(CRPMessageListCallback cRPMessageListCallback);

    void queryMetricSystem(CRPDeviceMetricSystemCallback cRPDeviceMetricSystemCallback);

    void queryMovementHeartRate();

    void queryMusicAvailableSize();

    void queryMusicName(int i8);

    void queryMusicSavedCount();

    void queryMuslimPrayerCalculationType();

    void queryMuslimPrayerCompensation(CRPMuslimPrayerCompensationCallback cRPMuslimPrayerCompensationCallback);

    void queryMuslimPrayerNotification();

    void queryMuslimSavedName();

    void queryMuslimSavedPrayers();

    void queryMuslimTasbihSetting(CRPMuslimTasbihSettingCallback cRPMuslimTasbihSettingCallback);

    void queryNewDrinkWaterReminderPeriod();

    void queryOtherMessageState(CRPDeviceOtherMessageCallback cRPDeviceOtherMessageCallback);

    void queryPerformanceInsights();

    void queryPhotoWatchFaceAvailableSize();

    void queryPhotoWatchFaceDisplayMode();

    void queryPhotoWatchFaceInfo();

    void queryPhysiologcalPeriod(CRPDevicePhysiologcalPeriodCallback cRPDevicePhysiologcalPeriodCallback);

    void queryPillReminder(CRPPillReminderCallback cRPPillReminderCallback);

    void queryQuickResponses(byte b8);

    void queryQuickResponsesCount();

    void queryQuickView(CRPDeviceQuickViewCallback cRPDeviceQuickViewCallback);

    void queryQuickViewTime(CRPDevicePeriodTimeCallback cRPDevicePeriodTimeCallback);

    void querySavedGomoreKey();

    void queryScreenOffClockState();

    void queryScreenOffClockTime();

    void querySedentaryReminder(CRPDeviceSedentaryReminderCallback cRPDeviceSedentaryReminderCallback);

    void querySedentaryReminderPeriod(CRPDeviceSedentaryReminderPeriodCallback cRPDeviceSedentaryReminderPeriodCallback);

    void querySifliWatchFaceStore(int i8, String str, int i9, int i10, int i11, CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback);

    void querySleepAction(int i8);

    void querySleepTime(CRPSleepTimeCallback cRPSleepTimeCallback);

    void querySosState(CRPSosStateCallback cRPSosStateCallback);

    void queryStepsCategory(CRPCategoryHistoryDay cRPCategoryHistoryDay);

    void querySupportAi(CRPAiCallback cRPAiCallback);

    void querySupportAiAgent();

    void querySupportAppInfo();

    void querySupportCalendarEvent();

    void querySupportCustomFeatureList();

    void querySupportCustomGameList();

    void querySupportCustomTrainingList();

    void querySupportDeviceRename(CRPDeviceNameCallback cRPDeviceNameCallback);

    void querySupportEmojiCount();

    void querySupportEmojiList();

    void querySupportGomore();

    void querySupportLocalNavigation();

    void querySupportNewHrv();

    void querySupportStock();

    void querySupportStress();

    void querySupportWatchFace(CRPDeviceSupportWatchFaceCallback cRPDeviceSupportWatchFaceCallback);

    void querySupportWorldClock();

    void queryTapToWakeState(CRPTapToWakeCallback cRPTapToWakeCallback);

    void queryTempUnit();

    void queryTestModeState(CRPDeviceTestModeCallback cRPDeviceTestModeCallback);

    void queryTimeSystem(CRPDeviceTimeSystemCallback cRPDeviceTimeSystemCallback);

    void queryTimingBloodOxygen(CRPBloodOxygenTimeType cRPBloodOxygenTimeType);

    void queryTimingBloodOxygenMeasureState();

    void queryTimingBreathRate(CRPHistoryDay cRPHistoryDay);

    void queryTimingBreathRateState();

    void queryTimingMeasureHeartRate(CRPDeviceTimingMeasureHeartRateCallback cRPDeviceTimingMeasureHeartRateCallback);

    void queryTimingMeasureTemp(CRPTempTimeType cRPTempTimeType);

    void queryTimingMeasureTempState(CRPTimingTempStateCallback cRPTimingTempStateCallback);

    void queryTimingStress(CRPStressDate cRPStressDate);

    void queryTimingStressState();

    void queryTodayHeartRate(int i8);

    void queryTodayWaterIntake();

    void queryTodayWaterIntakeHistory();

    void queryTraining(int i8);

    void queryTrainingDay(CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback);

    void queryTrainingDayGoals(CRPTrainingDayGoalsCallback cRPTrainingDayGoalsCallback);

    void queryTrainingRealtimeData();

    void queryUIVersionCode(CRPDeviceUIVersionCodeCallback cRPDeviceUIVersionCodeCallback);

    void queryVibrationStrength(CRPVibrationStrengthCallback cRPVibrationStrengthCallback);

    void queryVideoWatchFaceAvailableSize();

    void queryVideoWatchFaceDisplayMode();

    void queryVideoWatchFaceInfo();

    void queryWatchFaceDetail(CRPWatchFaceDetailsRequestInfo cRPWatchFaceDetailsRequestInfo, CRPWatchFaceDetailsCallback cRPWatchFaceDetailsCallback);

    void queryWatchFaceElementInfo();

    void queryWatchFaceLayout(CRPDeviceWatchFaceLayoutCallback cRPDeviceWatchFaceLayoutCallback);

    void queryWatchFaceLayout(CRPWatchFaceType cRPWatchFaceType);

    void queryWatchFaceList(CRPDeviceWatchFaceListCallback cRPDeviceWatchFaceListCallback);

    void queryWatchFaceOfID(int i8, CRPWatchFaceDetailsCallback cRPWatchFaceDetailsCallback);

    void queryWatchFaceScreenInfo(CRPWatchFaceScreenCallback cRPWatchFaceScreenCallback);

    void queryWatchFaceStore(List<Integer> list, String str, int i8, int i9, CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback);

    void queryWatchFaceStoreList(CRPWatchFaceStoreRequestInfo cRPWatchFaceStoreRequestInfo, int i8, CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback);

    void queryWatchFaceStoreTagList(CRPWatchFaceStoreRequestInfo cRPWatchFaceStoreRequestInfo, CRPWatchFaceStoreTagCallback cRPWatchFaceStoreTagCallback);

    void queryWatchFaceTimeStyle(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyleCallback cRPWatchFaceTimeStyleCallback);

    void queryWhatsappConfig();

    void queryWorldClock(byte b8);

    void readDeviceRssi();

    void removeBond(CRPRemoveBondCallback cRPRemoveBondCallback);

    void reset();

    void resetHisiliconWatchFace(CRPWatchFaceType cRPWatchFaceType);

    void resetStockList(byte[] bArr);

    void resetWorldClockList(byte[] bArr);

    void sendA2DPState(CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState);

    void sendAiAgentActivateRecording();

    void sendAiAgentError(CRPChatErrorCode cRPChatErrorCode);

    void sendAiAgentQuestion(byte b8, String str);

    void sendAiAgentResponse(byte b8, String str);

    void sendAiAgentResponse(byte b8, String str, int i8, boolean z7);

    void sendAiPhotoWatchFace(CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, CRPFileTransListener cRPFileTransListener);

    void sendAiPhotoWatchFaceLayout(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo);

    void sendAiWatchFace(CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo, CRPFileTransListener cRPFileTransListener);

    void sendAiWatchFaceActivateRecording();

    void sendAiWatchFaceDescribe(String str);

    void sendAiWatchFaceError(CRPChatErrorCode cRPChatErrorCode);

    void sendAiWatchFaceLayout(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo);

    void sendAiWatchFacePreview(CRPWatchFaceLayoutInfo.CompressionType compressionType, Bitmap bitmap, CRPFileTransListener cRPFileTransListener);

    void sendAlarm(CRPAlarmInfo cRPAlarmInfo);

    void sendBatterySaving(boolean z7);

    void sendBondState(boolean z7);

    void sendBoundVibration();

    void sendBreathingLight(boolean z7);

    void sendBrightness(int i8);

    void sendCalendarEvent(CRPCalendarEventInfo cRPCalendarEventInfo);

    void sendCalendarEventReminderTime(boolean z7, int i8);

    void sendCall0ffHook();

    void sendCallContactName(String str, int i8);

    void sendChatActivateRecording();

    void sendChatError(CRPChatErrorCode cRPChatErrorCode);

    void sendChatQuestion(String str);

    void sendChatResponse(String str);

    void sendChatResponse(String str, int i8, boolean z7);

    void sendConnectKitFile(CRPConnectKitMessage cRPConnectKitMessage, CRPFileTransListener cRPFileTransListener);

    void sendConnectKitMessage(CRPConnectKitMessage cRPConnectKitMessage);

    void sendContact(CRPContactInfo cRPContactInfo);

    void sendContactAvatar(int i8, Bitmap bitmap, int i9, CRPFileTransListener cRPFileTransListener);

    void sendCurrentBarometer(int i8);

    void sendCurrentTimezone();

    void sendCurrentVolume(int i8);

    void sendCustomKey(CRPCustomKeyInfo cRPCustomKeyInfo);

    void sendDailyGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo);

    void sendDeviceLanguage(byte b8);

    void sendDeviceVersion(byte b8);

    void sendDislpayDeviceFunction(CRPFunctionInfo cRPFunctionInfo);

    void sendDisplayTime(int i8);

    void sendDisplayWatchFace(byte b8);

    void sendDoNotDistrubTime(CRPPeriodTimeInfo cRPPeriodTimeInfo);

    void sendDominantHand(byte b8);

    void sendDrinkWaterGoals(int i8);

    void sendDrinkWaterReminder(CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo);

    void sendECGHeartRate(int i8);

    void sendElectronicCard(CRPElectronicCardInfo cRPElectronicCardInfo);

    void sendElectronicCardList(List<Integer> list);

    void sendEpoFile(File file, CRPEpoType cRPEpoType, CRPFileTransListener cRPFileTransListener);

    void sendFixedPhotoWatchFace(int i8, Bitmap bitmap, CRPFileTransListener cRPFileTransListener);

    void sendFlashNotification(Boolean bool);

    void sendFutureWeather(CRPFutureWeatherInfo cRPFutureWeatherInfo);

    void sendGallery(List<File> list, CRPGalleryTransListener cRPGalleryTransListener);

    void sendGoalSteps(int i8);

    void sendGomoreKey(String str);

    void sendGsensorCalibration();

    void sendHandWashingReminder(CRPHandWashingPeriodInfo cRPHandWashingPeriodInfo);

    void sendHealthAnalysis(CRPHealthSuggestionInfo cRPHealthSuggestionInfo);

    void sendHealthReport(CRPHealthSuggestionInfo cRPHealthSuggestionInfo);

    void sendHisiliconAiWatchFace(CRPFileTransListener cRPFileTransListener);

    void sendHisiliconAiWatchFacePreview(Bitmap bitmap, CRPFileTransListener cRPFileTransListener);

    void sendHisiliconChatQuestion(String str);

    void sendHisiliconChatResponse(String str);

    void sendHisiliconEpoFile(File file, CRPHisiliconEpoInfo cRPHisiliconEpoInfo, CRPFileTransListener cRPFileTransListener);

    void sendJieliPhotoWatchFace(CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, CRPFileTransListener cRPFileTransListener);

    void sendJieliPhotoWatchFaceLayout(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo);

    void sendJieliWatchFaceId(int i8, boolean z7);

    void sendLocalCity(String str);

    void sendLocalLocation(double d8, double d9);

    void sendLocalNavigationInfo(CRPLocalNavigationInfo cRPLocalNavigationInfo);

    void sendLocalVideo(File file, CRPFileTransListener cRPFileTransListener);

    void sendLyrics(String str);

    void sendMaxVolume(int i8);

    void sendMessage(CRPMessageInfo cRPMessageInfo);

    void sendMetricSystem(byte b8);

    void sendMusic(CRPMcuPlatform cRPMcuPlatform, String str, File file, String str2, CRPFileTransListener cRPFileTransListener);

    void sendMuslimLocation(CRPMuslimLocationInfo cRPMuslimLocationInfo);

    void sendMuslimNameState(boolean z7, List<Integer> list);

    void sendMuslimPrayerCalculationType(CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo);

    void sendMuslimPrayerCompensation(byte[] bArr);

    void sendMuslimPrayerNotification(boolean z7, Map<CRPMuslimPrayerNotifcationType, Boolean> map);

    void sendMuslimPrayersState(boolean z7, List<Integer> list);

    void sendMuslimTasbihSetting(CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo);

    void sendNewAlarm(CRPAlarmInfo cRPAlarmInfo);

    void sendNewDeviceName(String str);

    void sendNewDrinkWaterReminder(CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo);

    void sendOfflineVoiceCertification(byte[] bArr);

    void sendOtherMessageState(boolean z7);

    void sendPhotoWatchFace(List<File> list, Bitmap bitmap, CRPPhotoWatchFaceTransListener cRPPhotoWatchFaceTransListener);

    void sendPhotoWatchFaceDisplayMode(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode);

    void sendPhotoWatchFaceOrder(List<String> list);

    void sendPhysiologcalPeriod(CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo);

    void sendPillReminder(CRPPillReminderInfo cRPPillReminderInfo);

    void sendPlayAiAgentResponseComplete();

    void sendPlayAiAgentResponseError();

    void sendPlayChatResponseComplete();

    void sendPlayChatResponseError();

    void sendQuickResponses(CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo);

    void sendQuickView(boolean z7);

    void sendQuickViewTime(CRPPeriodTimeInfo cRPPeriodTimeInfo);

    void sendSedentaryReminder(boolean z7);

    void sendSedentaryReminderPeriod(CRPSedentaryReminderPeriodInfo cRPSedentaryReminderPeriodInfo);

    void sendSleepTime(byte b8, byte b9);

    void sendSongTitle(String str);

    void sendSosPresetInfo(CRPSosInfo cRPSosInfo);

    void sendStepLength(byte b8);

    void sendStock(CRPStockInfo cRPStockInfo);

    void sendStockPrice(CRPStockPriceInfo cRPStockPriceInfo);

    void sendTapToWakeState(boolean z7);

    void sendTempUnit(byte b8);

    void sendTimeSystem(byte b8);

    void sendTodayWaterIntake(int i8);

    void sendTodayWaterIntakeHistory(List<CRPWaterIntakeInfo> list);

    void sendTodayWeather(CRPTodayWeatherInfo cRPTodayWeatherInfo);

    void sendTrainingDayGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo);

    void sendTrainingDays(CRPTrainingDayInfo cRPTrainingDayInfo);

    void sendUserInfo(CRPUserInfo cRPUserInfo);

    void sendUserMode();

    void sendVibrationStrength(CRPVibrationStrength cRPVibrationStrength);

    void sendVideoWatchFace(File file, Bitmap bitmap, Bitmap bitmap2, CRPFileTransListener cRPFileTransListener);

    void sendVideoWatchFaceDisplayMode(CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode);

    void sendVideoWatchFaceThumbnail(String str, Bitmap bitmap, CRPFileTransListener cRPFileTransListener);

    void sendWatchFace(CRPWatchFaceInfo cRPWatchFaceInfo, CRPWatchFaceTransListener cRPWatchFaceTransListener, int i8);

    void sendWatchFaceBackground(CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo, CRPFileTransListener cRPFileTransListener);

    void sendWatchFaceLayout(CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo);

    void sendWatchFaceLayout(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo);

    void sendWatchFaceTimeStyle(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle);

    void sendWhatsappContacts(List<String> list);

    void sendWhatsappMessage(CRPWhatsappReceiveMessageInfo cRPWhatsappReceiveMessageInfo);

    void sendWhatsappState(CRPWhatsappStateInfo cRPWhatsappStateInfo);

    void sendWorldClock(CRPWorldClockInfo cRPWorldClockInfo);

    void setA2DPConnectStateListener(CRPA2DPConnectStateListener cRPA2DPConnectStateListener);

    void setAiAgentListener(CRPAiAgentListener cRPAiAgentListener);

    void setAiWatchFaceListener(CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener);

    void setAppChangeListener(CRPAppChangeListener cRPAppChangeListener);

    void setBarometerCalibrationListener(CRPBarometerCalibrationListener cRPBarometerCalibrationListener);

    void setBatterySavingListener(CRPBatterySavingChangeListener cRPBatterySavingChangeListener);

    void setBloodOxygenChangeListener(CRPBloodOxygenChangeListener cRPBloodOxygenChangeListener);

    void setBloodPressureChangeListener(CRPBloodPressureChangeListener cRPBloodPressureChangeListener);

    void setBreathRateListener(CRPBreathRateChangeListener cRPBreathRateChangeListener);

    void setCalendarEventListener(CRPCalendarEventListener cRPCalendarEventListener);

    void setCallNumberListener(CRPCallNumberListener cRPCallNumberListener);

    void setCaloriesCategoryListener(CRPCaloriesCategoryChangeListener cRPCaloriesCategoryChangeListener);

    void setCameraOperationListener(CRPCameraOperationListener cRPCameraOperationListener);

    void setChatListener(CRPChatChangeListener cRPChatChangeListener);

    void setConnectKitListener(CRPConnectKitListener cRPConnectKitListener);

    void setConnectionStateListener(CRPBleConnectionStateListener cRPBleConnectionStateListener);

    void setContactListener(CRPContactListener cRPContactListener);

    void setCustomKeyListener(CRPCustomKeyChangeListener cRPCustomKeyChangeListener);

    void setDeviceBatteryListener(CRPDeviceBatteryListener cRPDeviceBatteryListener);

    void setDeviceRssiListener(CRPDeviceRssiListener cRPDeviceRssiListener);

    void setDistanceCategoryListener(CRPDistanceCategoryChangeListener cRPDistanceCategoryChangeListener);

    void setDrinkWaterListener(CRPDeviceDrinkWaterListener cRPDeviceDrinkWaterListener);

    void setECGChangeListener(CRPBleECGChangeListener cRPBleECGChangeListener, CRPEcgMeasureType cRPEcgMeasureType);

    void setEmojiChangeListener(CRPEmojiChangeListener cRPEmojiChangeListener);

    void setFindPhoneListener(CRPFindPhoneListener cRPFindPhoneListener);

    void setGalleryChangeListener(CRPGalleryChangeListener cRPGalleryChangeListener);

    void setGomoreListener(CRPGomoreListener cRPGomoreListener);

    void setGpsChangeListener(CRPGpsChangeListener cRPGpsChangeListener);

    void setHealthAnalysisListener(CRPHealthAnalysisListener cRPHealthAnalysisListener);

    void setHeartRateChangeListener(CRPHeartRateChangeListener cRPHeartRateChangeListener);

    void setHisiliconAIWatchFaceListener(CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener);

    void setHisiliconAiWatchFace(Bitmap bitmap, Bitmap bitmap2);

    void setHisiliconChatListener(CRPChatChangeListener cRPChatChangeListener);

    void setHrvChangeListener(CRPHrvChangeListener cRPHrvChangeListener);

    void setLocalNavigationListener(CRPLocalNavigationListener cRPLocalNavigationListener);

    void setLocalVideoChangeListener(CRPLocalVideoChangeListener cRPLocalVideoChangeListener);

    void setMaxHeartRate(byte b8, boolean z7);

    void setMovementState(byte b8);

    void setMovementStateListener(CRPMovementStateListener cRPMovementStateListener);

    void setMtu(CRPMtuChangeCallback cRPMtuChangeCallback, int i8);

    void setMusicChangeListener(CRPMusicChangeListener cRPMusicChangeListener);

    void setMusicPlayerState(byte b8);

    void setMuslimNameListener(CRPMuslimNameListener cRPMuslimNameListener);

    void setMuslimPrayerSettingListener(CRPMuslimPrayerSettingListener cRPMuslimPrayerSettingListener);

    void setNewHrvListener(CRPNewHrvChangeListener cRPNewHrvChangeListener);

    void setOfflineVoiceListener(CRPOfflineVoiceListener cRPOfflineVoiceListener);

    void setPhoneOperationListener(CRPPhoneOperationListener cRPPhoneOperationListener);

    void setPhotoWatchFaceListener(CRPPhotoWatchFaceChangeListener cRPPhotoWatchFaceChangeListener);

    void setQuickResponsesListener(CRPQuickResponsesChangeListener cRPQuickResponsesChangeListener);

    void setScreenOffClockListener(CRPScreenOffClockListener cRPScreenOffClockListener);

    void setScreenOffClockTime(CRPPeriodTimeInfo cRPPeriodTimeInfo);

    void setSleepActionChangeListener(CRPSleepActionChangeListener cRPSleepActionChangeListener);

    void setSleepChangeListener(CRPSleepChangeListener cRPSleepChangeListener);

    void setSosChangeListener(CRPSosChangeListener cRPSosChangeListener);

    void setStepChangeListener(CRPStepChangeListener cRPStepChangeListener);

    void setStepsCategoryListener(CRPStepsCategoryChangeListener cRPStepsCategoryChangeListener);

    void setStockListener(CRPStockChangeListener cRPStockChangeListener);

    void setStressListener(CRPStressListener cRPStressListener);

    void setTempChangeListener(CRPTempChangeListener cRPTempChangeListener);

    void setTrainingListener(CRPTrainingChangeListener cRPTrainingChangeListener);

    void setVideoWatchFaceListener(CRPVideoWatchFaceChangeListener cRPVideoWatchFaceChangeListener);

    void setWeatherChangeListener(CRPWeatherChangeListener cRPWeatherChangeListener);

    void setWhatsappListener(CRPWhatsappListener cRPWhatsappListener);

    void setWorldClockListener(CRPWorldClockListener cRPWorldClockListener);

    void shutDown();

    void startBreathingTraining(CRPBreathingTrainingInfo cRPBreathingTrainingInfo);

    void startECGMeasure();

    void startFindPhone();

    void startFirmwareUpgrade(boolean z7, CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener);

    void startLocalNavigation(boolean z7);

    void startMeasureBloodOxygen();

    void startMeasureBloodPressure();

    void startMeasureDynamicRate();

    void startMeasureHrv();

    void startMeasureNewHrv();

    void startMeasureOnceHeartRate();

    void startMeasureStress();

    void startMeasureTemp();

    void startMeatureBreathRate();

    void startMovement(byte b8);

    void startPlayAiAgentResponse();

    void startPlayChatResponse();

    void stopECGMeasure();

    void stopFindPhone();

    void stopLocalNavigation(boolean z7);

    void stopMeasureBloodOxygen();

    void stopMeasureBloodPressure();

    void stopMeasureDynamicRtae();

    void stopMeasureHrv();

    void stopMeasureNewHrv();

    void stopMeasureOnceHeartRate();

    void stopMeasureStress();

    void stopMeasureTemp();

    void stopMeatureBreathRate();

    void stopPlayAiAgentResponse();

    void stopPlayChatResponse();

    void subscribeDeviceBattery();

    void syncRemSleep();

    void syncSleep();

    void syncStep();

    void syncTime();

    void uninstallApp(String str);

    void updateWaterIntake(CRPWaterIntakeInfo cRPWaterIntakeInfo);
}
