package com.crrepa.band.my.model.db.greendao;

import com.crrepa.band.my.device.ai.chat.model.AIChatRecordEntity;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.crrepa.band.my.model.db.Alarm;
import com.crrepa.band.my.model.db.BandConfig;
import com.crrepa.band.my.model.db.BandFunction;
import com.crrepa.band.my.model.db.BandLanguage;
import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.model.db.BloodPressure;
import com.crrepa.band.my.model.db.Contact;
import com.crrepa.band.my.model.db.CricketGame;
import com.crrepa.band.my.model.db.CricketTeamModel;
import com.crrepa.band.my.model.db.DeviceScanRecord;
import com.crrepa.band.my.model.db.DownloadWatchFace;
import com.crrepa.band.my.model.db.DrinkWater;
import com.crrepa.band.my.model.db.ECard;
import com.crrepa.band.my.model.db.ECardConfig;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.GoalsSetting;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.HandWashing;
import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.HeartRateWarning;
import com.crrepa.band.my.model.db.Hrv;
import com.crrepa.band.my.model.db.Language;
import com.crrepa.band.my.model.db.LocationCity;
import com.crrepa.band.my.model.db.MessagePush;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.OnceHeartRate;
import com.crrepa.band.my.model.db.OnceTemp;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.PhysiologicalPeriod;
import com.crrepa.band.my.model.db.PhysiologicalRemind;
import com.crrepa.band.my.model.db.PillReminder;
import com.crrepa.band.my.model.db.QuickContartConfig;
import com.crrepa.band.my.model.db.Recover;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.SleepNap;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.Stress;
import com.crrepa.band.my.model.db.SupportWatchFace;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.TodayQuote;
import com.crrepa.band.my.model.db.UserInfo;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.Weather;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.db.WorldClock;
import java.util.Map;
import org.greenrobot.greendao.c;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.a;

/* loaded from: classes2.dex */
public class DaoSession extends c {
    private final AIChatRecordEntityDao aIChatRecordEntityDao;
    private final a aIChatRecordEntityDaoConfig;
    private final ActiveHeartRateDao activeHeartRateDao;
    private final a activeHeartRateDaoConfig;
    private final AlarmDao alarmDao;
    private final a alarmDaoConfig;
    private final BandConfigDao bandConfigDao;
    private final a bandConfigDaoConfig;
    private final BandFunctionDao bandFunctionDao;
    private final a bandFunctionDaoConfig;
    private final BandLanguageDao bandLanguageDao;
    private final a bandLanguageDaoConfig;
    private final BloodOxygenDao bloodOxygenDao;
    private final a bloodOxygenDaoConfig;
    private final BloodPressureDao bloodPressureDao;
    private final a bloodPressureDaoConfig;
    private final ContactDao contactDao;
    private final a contactDaoConfig;
    private final CricketGameDao cricketGameDao;
    private final a cricketGameDaoConfig;
    private final CricketTeamModelDao cricketTeamModelDao;
    private final a cricketTeamModelDaoConfig;
    private final DeviceScanRecordDao deviceScanRecordDao;
    private final a deviceScanRecordDaoConfig;
    private final DownloadWatchFaceDao downloadWatchFaceDao;
    private final a downloadWatchFaceDaoConfig;
    private final DrinkWaterDao drinkWaterDao;
    private final a drinkWaterDaoConfig;
    private final ECardConfigDao eCardConfigDao;
    private final a eCardConfigDaoConfig;
    private final ECardDao eCardDao;
    private final a eCardDaoConfig;
    private final EcgDao ecgDao;
    private final a ecgDaoConfig;
    private final GoalsSettingDao goalsSettingDao;
    private final a goalsSettingDaoConfig;
    private final GpsTrainingDao gpsTrainingDao;
    private final a gpsTrainingDaoConfig;
    private final HandWashingDao handWashingDao;
    private final a handWashingDaoConfig;
    private final HeartRateDao heartRateDao;
    private final a heartRateDaoConfig;
    private final HeartRateWarningDao heartRateWarningDao;
    private final a heartRateWarningDaoConfig;
    private final HrvDao hrvDao;
    private final a hrvDaoConfig;
    private final LanguageDao languageDao;
    private final a languageDaoConfig;
    private final LocationCityDao locationCityDao;
    private final a locationCityDaoConfig;
    private final MessagePushDao messagePushDao;
    private final a messagePushDaoConfig;
    private final MovementHeartRateDao movementHeartRateDao;
    private final a movementHeartRateDaoConfig;
    private final OnceHeartRateDao onceHeartRateDao;
    private final a onceHeartRateDaoConfig;
    private final OnceTempDao onceTempDao;
    private final a onceTempDaoConfig;
    private final PerformanceInsightsDao performanceInsightsDao;
    private final a performanceInsightsDaoConfig;
    private final PhysiologicalPeriodDao physiologicalPeriodDao;
    private final a physiologicalPeriodDaoConfig;
    private final PhysiologicalRemindDao physiologicalRemindDao;
    private final a physiologicalRemindDaoConfig;
    private final PillReminderDao pillReminderDao;
    private final a pillReminderDaoConfig;
    private final QuickContartConfigDao quickContartConfigDao;
    private final a quickContartConfigDaoConfig;
    private final RecoverDao recoverDao;
    private final a recoverDaoConfig;
    private final SleepDao sleepDao;
    private final a sleepDaoConfig;
    private final SleepNapDao sleepNapDao;
    private final a sleepNapDaoConfig;
    private final StepDao stepDao;
    private final a stepDaoConfig;
    private final StressDao stressDao;
    private final a stressDaoConfig;
    private final SupportWatchFaceDao supportWatchFaceDao;
    private final a supportWatchFaceDaoConfig;
    private final TimingBloodOxygenDao timingBloodOxygenDao;
    private final a timingBloodOxygenDaoConfig;
    private final TimingStressDao timingStressDao;
    private final a timingStressDaoConfig;
    private final TimingTempDao timingTempDao;
    private final a timingTempDaoConfig;
    private final TodayQuoteDao todayQuoteDao;
    private final a todayQuoteDaoConfig;
    private final UserInfoDao userInfoDao;
    private final a userInfoDaoConfig;
    private final WatchFaceDao watchFaceDao;
    private final a watchFaceDaoConfig;
    private final WaterDao waterDao;
    private final a waterDaoConfig;
    private final WeatherDao weatherDao;
    private final a weatherDaoConfig;
    private final WeightDao weightDao;
    private final a weightDaoConfig;
    private final WorldClockDao worldClockDao;
    private final a worldClockDaoConfig;

    public DaoSession(org.greenrobot.greendao.database.a aVar, IdentityScopeType identityScopeType, Map<Class<? extends org.greenrobot.greendao.a>, a> map) {
        super(aVar);
        a clone = map.get(AIChatRecordEntityDao.class).clone();
        this.aIChatRecordEntityDaoConfig = clone;
        clone.initIdentityScope(identityScopeType);
        a clone2 = map.get(ActiveHeartRateDao.class).clone();
        this.activeHeartRateDaoConfig = clone2;
        clone2.initIdentityScope(identityScopeType);
        a clone3 = map.get(AlarmDao.class).clone();
        this.alarmDaoConfig = clone3;
        clone3.initIdentityScope(identityScopeType);
        a clone4 = map.get(BandConfigDao.class).clone();
        this.bandConfigDaoConfig = clone4;
        clone4.initIdentityScope(identityScopeType);
        a clone5 = map.get(BandFunctionDao.class).clone();
        this.bandFunctionDaoConfig = clone5;
        clone5.initIdentityScope(identityScopeType);
        a clone6 = map.get(BandLanguageDao.class).clone();
        this.bandLanguageDaoConfig = clone6;
        clone6.initIdentityScope(identityScopeType);
        a clone7 = map.get(BloodOxygenDao.class).clone();
        this.bloodOxygenDaoConfig = clone7;
        clone7.initIdentityScope(identityScopeType);
        a clone8 = map.get(BloodPressureDao.class).clone();
        this.bloodPressureDaoConfig = clone8;
        clone8.initIdentityScope(identityScopeType);
        a clone9 = map.get(ContactDao.class).clone();
        this.contactDaoConfig = clone9;
        clone9.initIdentityScope(identityScopeType);
        a clone10 = map.get(CricketGameDao.class).clone();
        this.cricketGameDaoConfig = clone10;
        clone10.initIdentityScope(identityScopeType);
        a clone11 = map.get(CricketTeamModelDao.class).clone();
        this.cricketTeamModelDaoConfig = clone11;
        clone11.initIdentityScope(identityScopeType);
        a clone12 = map.get(DeviceScanRecordDao.class).clone();
        this.deviceScanRecordDaoConfig = clone12;
        clone12.initIdentityScope(identityScopeType);
        a clone13 = map.get(DownloadWatchFaceDao.class).clone();
        this.downloadWatchFaceDaoConfig = clone13;
        clone13.initIdentityScope(identityScopeType);
        a clone14 = map.get(DrinkWaterDao.class).clone();
        this.drinkWaterDaoConfig = clone14;
        clone14.initIdentityScope(identityScopeType);
        a clone15 = map.get(ECardDao.class).clone();
        this.eCardDaoConfig = clone15;
        clone15.initIdentityScope(identityScopeType);
        a clone16 = map.get(ECardConfigDao.class).clone();
        this.eCardConfigDaoConfig = clone16;
        clone16.initIdentityScope(identityScopeType);
        a clone17 = map.get(EcgDao.class).clone();
        this.ecgDaoConfig = clone17;
        clone17.initIdentityScope(identityScopeType);
        a clone18 = map.get(GoalsSettingDao.class).clone();
        this.goalsSettingDaoConfig = clone18;
        clone18.initIdentityScope(identityScopeType);
        a clone19 = map.get(GpsTrainingDao.class).clone();
        this.gpsTrainingDaoConfig = clone19;
        clone19.initIdentityScope(identityScopeType);
        a clone20 = map.get(HandWashingDao.class).clone();
        this.handWashingDaoConfig = clone20;
        clone20.initIdentityScope(identityScopeType);
        a clone21 = map.get(HeartRateDao.class).clone();
        this.heartRateDaoConfig = clone21;
        clone21.initIdentityScope(identityScopeType);
        a clone22 = map.get(HeartRateWarningDao.class).clone();
        this.heartRateWarningDaoConfig = clone22;
        clone22.initIdentityScope(identityScopeType);
        a clone23 = map.get(HrvDao.class).clone();
        this.hrvDaoConfig = clone23;
        clone23.initIdentityScope(identityScopeType);
        a clone24 = map.get(LanguageDao.class).clone();
        this.languageDaoConfig = clone24;
        clone24.initIdentityScope(identityScopeType);
        a clone25 = map.get(LocationCityDao.class).clone();
        this.locationCityDaoConfig = clone25;
        clone25.initIdentityScope(identityScopeType);
        a clone26 = map.get(MessagePushDao.class).clone();
        this.messagePushDaoConfig = clone26;
        clone26.initIdentityScope(identityScopeType);
        a clone27 = map.get(MovementHeartRateDao.class).clone();
        this.movementHeartRateDaoConfig = clone27;
        clone27.initIdentityScope(identityScopeType);
        a clone28 = map.get(OnceHeartRateDao.class).clone();
        this.onceHeartRateDaoConfig = clone28;
        clone28.initIdentityScope(identityScopeType);
        a clone29 = map.get(OnceTempDao.class).clone();
        this.onceTempDaoConfig = clone29;
        clone29.initIdentityScope(identityScopeType);
        a clone30 = map.get(PerformanceInsightsDao.class).clone();
        this.performanceInsightsDaoConfig = clone30;
        clone30.initIdentityScope(identityScopeType);
        a clone31 = map.get(PhysiologicalPeriodDao.class).clone();
        this.physiologicalPeriodDaoConfig = clone31;
        clone31.initIdentityScope(identityScopeType);
        a clone32 = map.get(PhysiologicalRemindDao.class).clone();
        this.physiologicalRemindDaoConfig = clone32;
        clone32.initIdentityScope(identityScopeType);
        a clone33 = map.get(PillReminderDao.class).clone();
        this.pillReminderDaoConfig = clone33;
        clone33.initIdentityScope(identityScopeType);
        a clone34 = map.get(QuickContartConfigDao.class).clone();
        this.quickContartConfigDaoConfig = clone34;
        clone34.initIdentityScope(identityScopeType);
        a clone35 = map.get(RecoverDao.class).clone();
        this.recoverDaoConfig = clone35;
        clone35.initIdentityScope(identityScopeType);
        a clone36 = map.get(SleepDao.class).clone();
        this.sleepDaoConfig = clone36;
        clone36.initIdentityScope(identityScopeType);
        a clone37 = map.get(SleepNapDao.class).clone();
        this.sleepNapDaoConfig = clone37;
        clone37.initIdentityScope(identityScopeType);
        a clone38 = map.get(StepDao.class).clone();
        this.stepDaoConfig = clone38;
        clone38.initIdentityScope(identityScopeType);
        a clone39 = map.get(StressDao.class).clone();
        this.stressDaoConfig = clone39;
        clone39.initIdentityScope(identityScopeType);
        a clone40 = map.get(SupportWatchFaceDao.class).clone();
        this.supportWatchFaceDaoConfig = clone40;
        clone40.initIdentityScope(identityScopeType);
        a clone41 = map.get(TimingBloodOxygenDao.class).clone();
        this.timingBloodOxygenDaoConfig = clone41;
        clone41.initIdentityScope(identityScopeType);
        a clone42 = map.get(TimingStressDao.class).clone();
        this.timingStressDaoConfig = clone42;
        clone42.initIdentityScope(identityScopeType);
        a clone43 = map.get(TimingTempDao.class).clone();
        this.timingTempDaoConfig = clone43;
        clone43.initIdentityScope(identityScopeType);
        a clone44 = map.get(TodayQuoteDao.class).clone();
        this.todayQuoteDaoConfig = clone44;
        clone44.initIdentityScope(identityScopeType);
        a clone45 = map.get(UserInfoDao.class).clone();
        this.userInfoDaoConfig = clone45;
        clone45.initIdentityScope(identityScopeType);
        a clone46 = map.get(WatchFaceDao.class).clone();
        this.watchFaceDaoConfig = clone46;
        clone46.initIdentityScope(identityScopeType);
        a clone47 = map.get(WaterDao.class).clone();
        this.waterDaoConfig = clone47;
        clone47.initIdentityScope(identityScopeType);
        a clone48 = map.get(WeatherDao.class).clone();
        this.weatherDaoConfig = clone48;
        clone48.initIdentityScope(identityScopeType);
        a clone49 = map.get(WeightDao.class).clone();
        this.weightDaoConfig = clone49;
        clone49.initIdentityScope(identityScopeType);
        a clone50 = map.get(WorldClockDao.class).clone();
        this.worldClockDaoConfig = clone50;
        clone50.initIdentityScope(identityScopeType);
        AIChatRecordEntityDao aIChatRecordEntityDao = new AIChatRecordEntityDao(clone, this);
        this.aIChatRecordEntityDao = aIChatRecordEntityDao;
        ActiveHeartRateDao activeHeartRateDao = new ActiveHeartRateDao(clone2, this);
        this.activeHeartRateDao = activeHeartRateDao;
        AlarmDao alarmDao = new AlarmDao(clone3, this);
        this.alarmDao = alarmDao;
        BandConfigDao bandConfigDao = new BandConfigDao(clone4, this);
        this.bandConfigDao = bandConfigDao;
        BandFunctionDao bandFunctionDao = new BandFunctionDao(clone5, this);
        this.bandFunctionDao = bandFunctionDao;
        BandLanguageDao bandLanguageDao = new BandLanguageDao(clone6, this);
        this.bandLanguageDao = bandLanguageDao;
        BloodOxygenDao bloodOxygenDao = new BloodOxygenDao(clone7, this);
        this.bloodOxygenDao = bloodOxygenDao;
        BloodPressureDao bloodPressureDao = new BloodPressureDao(clone8, this);
        this.bloodPressureDao = bloodPressureDao;
        ContactDao contactDao = new ContactDao(clone9, this);
        this.contactDao = contactDao;
        CricketGameDao cricketGameDao = new CricketGameDao(clone10, this);
        this.cricketGameDao = cricketGameDao;
        CricketTeamModelDao cricketTeamModelDao = new CricketTeamModelDao(clone11, this);
        this.cricketTeamModelDao = cricketTeamModelDao;
        DeviceScanRecordDao deviceScanRecordDao = new DeviceScanRecordDao(clone12, this);
        this.deviceScanRecordDao = deviceScanRecordDao;
        DownloadWatchFaceDao downloadWatchFaceDao = new DownloadWatchFaceDao(clone13, this);
        this.downloadWatchFaceDao = downloadWatchFaceDao;
        DrinkWaterDao drinkWaterDao = new DrinkWaterDao(clone14, this);
        this.drinkWaterDao = drinkWaterDao;
        ECardDao eCardDao = new ECardDao(clone15, this);
        this.eCardDao = eCardDao;
        ECardConfigDao eCardConfigDao = new ECardConfigDao(clone16, this);
        this.eCardConfigDao = eCardConfigDao;
        EcgDao ecgDao = new EcgDao(clone17, this);
        this.ecgDao = ecgDao;
        GoalsSettingDao goalsSettingDao = new GoalsSettingDao(clone18, this);
        this.goalsSettingDao = goalsSettingDao;
        GpsTrainingDao gpsTrainingDao = new GpsTrainingDao(clone19, this);
        this.gpsTrainingDao = gpsTrainingDao;
        HandWashingDao handWashingDao = new HandWashingDao(clone20, this);
        this.handWashingDao = handWashingDao;
        HeartRateDao heartRateDao = new HeartRateDao(clone21, this);
        this.heartRateDao = heartRateDao;
        HeartRateWarningDao heartRateWarningDao = new HeartRateWarningDao(clone22, this);
        this.heartRateWarningDao = heartRateWarningDao;
        HrvDao hrvDao = new HrvDao(clone23, this);
        this.hrvDao = hrvDao;
        LanguageDao languageDao = new LanguageDao(clone24, this);
        this.languageDao = languageDao;
        LocationCityDao locationCityDao = new LocationCityDao(clone25, this);
        this.locationCityDao = locationCityDao;
        MessagePushDao messagePushDao = new MessagePushDao(clone26, this);
        this.messagePushDao = messagePushDao;
        MovementHeartRateDao movementHeartRateDao = new MovementHeartRateDao(clone27, this);
        this.movementHeartRateDao = movementHeartRateDao;
        OnceHeartRateDao onceHeartRateDao = new OnceHeartRateDao(clone28, this);
        this.onceHeartRateDao = onceHeartRateDao;
        OnceTempDao onceTempDao = new OnceTempDao(clone29, this);
        this.onceTempDao = onceTempDao;
        PerformanceInsightsDao performanceInsightsDao = new PerformanceInsightsDao(clone30, this);
        this.performanceInsightsDao = performanceInsightsDao;
        PhysiologicalPeriodDao physiologicalPeriodDao = new PhysiologicalPeriodDao(clone31, this);
        this.physiologicalPeriodDao = physiologicalPeriodDao;
        PhysiologicalRemindDao physiologicalRemindDao = new PhysiologicalRemindDao(clone32, this);
        this.physiologicalRemindDao = physiologicalRemindDao;
        PillReminderDao pillReminderDao = new PillReminderDao(clone33, this);
        this.pillReminderDao = pillReminderDao;
        QuickContartConfigDao quickContartConfigDao = new QuickContartConfigDao(clone34, this);
        this.quickContartConfigDao = quickContartConfigDao;
        RecoverDao recoverDao = new RecoverDao(clone35, this);
        this.recoverDao = recoverDao;
        SleepDao sleepDao = new SleepDao(clone36, this);
        this.sleepDao = sleepDao;
        SleepNapDao sleepNapDao = new SleepNapDao(clone37, this);
        this.sleepNapDao = sleepNapDao;
        StepDao stepDao = new StepDao(clone38, this);
        this.stepDao = stepDao;
        StressDao stressDao = new StressDao(clone39, this);
        this.stressDao = stressDao;
        SupportWatchFaceDao supportWatchFaceDao = new SupportWatchFaceDao(clone40, this);
        this.supportWatchFaceDao = supportWatchFaceDao;
        TimingBloodOxygenDao timingBloodOxygenDao = new TimingBloodOxygenDao(clone41, this);
        this.timingBloodOxygenDao = timingBloodOxygenDao;
        TimingStressDao timingStressDao = new TimingStressDao(clone42, this);
        this.timingStressDao = timingStressDao;
        TimingTempDao timingTempDao = new TimingTempDao(clone43, this);
        this.timingTempDao = timingTempDao;
        TodayQuoteDao todayQuoteDao = new TodayQuoteDao(clone44, this);
        this.todayQuoteDao = todayQuoteDao;
        UserInfoDao userInfoDao = new UserInfoDao(clone45, this);
        this.userInfoDao = userInfoDao;
        WatchFaceDao watchFaceDao = new WatchFaceDao(clone46, this);
        this.watchFaceDao = watchFaceDao;
        WaterDao waterDao = new WaterDao(clone47, this);
        this.waterDao = waterDao;
        WeatherDao weatherDao = new WeatherDao(clone48, this);
        this.weatherDao = weatherDao;
        WeightDao weightDao = new WeightDao(clone49, this);
        this.weightDao = weightDao;
        WorldClockDao worldClockDao = new WorldClockDao(clone50, this);
        this.worldClockDao = worldClockDao;
        registerDao(AIChatRecordEntity.class, aIChatRecordEntityDao);
        registerDao(ActiveHeartRate.class, activeHeartRateDao);
        registerDao(Alarm.class, alarmDao);
        registerDao(BandConfig.class, bandConfigDao);
        registerDao(BandFunction.class, bandFunctionDao);
        registerDao(BandLanguage.class, bandLanguageDao);
        registerDao(BloodOxygen.class, bloodOxygenDao);
        registerDao(BloodPressure.class, bloodPressureDao);
        registerDao(Contact.class, contactDao);
        registerDao(CricketGame.class, cricketGameDao);
        registerDao(CricketTeamModel.class, cricketTeamModelDao);
        registerDao(DeviceScanRecord.class, deviceScanRecordDao);
        registerDao(DownloadWatchFace.class, downloadWatchFaceDao);
        registerDao(DrinkWater.class, drinkWaterDao);
        registerDao(ECard.class, eCardDao);
        registerDao(ECardConfig.class, eCardConfigDao);
        registerDao(Ecg.class, ecgDao);
        registerDao(GoalsSetting.class, goalsSettingDao);
        registerDao(GpsTraining.class, gpsTrainingDao);
        registerDao(HandWashing.class, handWashingDao);
        registerDao(HeartRate.class, heartRateDao);
        registerDao(HeartRateWarning.class, heartRateWarningDao);
        registerDao(Hrv.class, hrvDao);
        registerDao(Language.class, languageDao);
        registerDao(LocationCity.class, locationCityDao);
        registerDao(MessagePush.class, messagePushDao);
        registerDao(MovementHeartRate.class, movementHeartRateDao);
        registerDao(OnceHeartRate.class, onceHeartRateDao);
        registerDao(OnceTemp.class, onceTempDao);
        registerDao(PerformanceInsights.class, performanceInsightsDao);
        registerDao(PhysiologicalPeriod.class, physiologicalPeriodDao);
        registerDao(PhysiologicalRemind.class, physiologicalRemindDao);
        registerDao(PillReminder.class, pillReminderDao);
        registerDao(QuickContartConfig.class, quickContartConfigDao);
        registerDao(Recover.class, recoverDao);
        registerDao(Sleep.class, sleepDao);
        registerDao(SleepNap.class, sleepNapDao);
        registerDao(Step.class, stepDao);
        registerDao(Stress.class, stressDao);
        registerDao(SupportWatchFace.class, supportWatchFaceDao);
        registerDao(TimingBloodOxygen.class, timingBloodOxygenDao);
        registerDao(TimingStress.class, timingStressDao);
        registerDao(TimingTemp.class, timingTempDao);
        registerDao(TodayQuote.class, todayQuoteDao);
        registerDao(UserInfo.class, userInfoDao);
        registerDao(WatchFace.class, watchFaceDao);
        registerDao(Water.class, waterDao);
        registerDao(Weather.class, weatherDao);
        registerDao(Weight.class, weightDao);
        registerDao(WorldClock.class, worldClockDao);
    }

    public void clear() {
        this.aIChatRecordEntityDaoConfig.clearIdentityScope();
        this.activeHeartRateDaoConfig.clearIdentityScope();
        this.alarmDaoConfig.clearIdentityScope();
        this.bandConfigDaoConfig.clearIdentityScope();
        this.bandFunctionDaoConfig.clearIdentityScope();
        this.bandLanguageDaoConfig.clearIdentityScope();
        this.bloodOxygenDaoConfig.clearIdentityScope();
        this.bloodPressureDaoConfig.clearIdentityScope();
        this.contactDaoConfig.clearIdentityScope();
        this.cricketGameDaoConfig.clearIdentityScope();
        this.cricketTeamModelDaoConfig.clearIdentityScope();
        this.deviceScanRecordDaoConfig.clearIdentityScope();
        this.downloadWatchFaceDaoConfig.clearIdentityScope();
        this.drinkWaterDaoConfig.clearIdentityScope();
        this.eCardDaoConfig.clearIdentityScope();
        this.eCardConfigDaoConfig.clearIdentityScope();
        this.ecgDaoConfig.clearIdentityScope();
        this.goalsSettingDaoConfig.clearIdentityScope();
        this.gpsTrainingDaoConfig.clearIdentityScope();
        this.handWashingDaoConfig.clearIdentityScope();
        this.heartRateDaoConfig.clearIdentityScope();
        this.heartRateWarningDaoConfig.clearIdentityScope();
        this.hrvDaoConfig.clearIdentityScope();
        this.languageDaoConfig.clearIdentityScope();
        this.locationCityDaoConfig.clearIdentityScope();
        this.messagePushDaoConfig.clearIdentityScope();
        this.movementHeartRateDaoConfig.clearIdentityScope();
        this.onceHeartRateDaoConfig.clearIdentityScope();
        this.onceTempDaoConfig.clearIdentityScope();
        this.performanceInsightsDaoConfig.clearIdentityScope();
        this.physiologicalPeriodDaoConfig.clearIdentityScope();
        this.physiologicalRemindDaoConfig.clearIdentityScope();
        this.pillReminderDaoConfig.clearIdentityScope();
        this.quickContartConfigDaoConfig.clearIdentityScope();
        this.recoverDaoConfig.clearIdentityScope();
        this.sleepDaoConfig.clearIdentityScope();
        this.sleepNapDaoConfig.clearIdentityScope();
        this.stepDaoConfig.clearIdentityScope();
        this.stressDaoConfig.clearIdentityScope();
        this.supportWatchFaceDaoConfig.clearIdentityScope();
        this.timingBloodOxygenDaoConfig.clearIdentityScope();
        this.timingStressDaoConfig.clearIdentityScope();
        this.timingTempDaoConfig.clearIdentityScope();
        this.todayQuoteDaoConfig.clearIdentityScope();
        this.userInfoDaoConfig.clearIdentityScope();
        this.watchFaceDaoConfig.clearIdentityScope();
        this.waterDaoConfig.clearIdentityScope();
        this.weatherDaoConfig.clearIdentityScope();
        this.weightDaoConfig.clearIdentityScope();
        this.worldClockDaoConfig.clearIdentityScope();
    }

    public AIChatRecordEntityDao getAIChatRecordEntityDao() {
        return this.aIChatRecordEntityDao;
    }

    public ActiveHeartRateDao getActiveHeartRateDao() {
        return this.activeHeartRateDao;
    }

    public AlarmDao getAlarmDao() {
        return this.alarmDao;
    }

    public BandConfigDao getBandConfigDao() {
        return this.bandConfigDao;
    }

    public BandFunctionDao getBandFunctionDao() {
        return this.bandFunctionDao;
    }

    public BandLanguageDao getBandLanguageDao() {
        return this.bandLanguageDao;
    }

    public BloodOxygenDao getBloodOxygenDao() {
        return this.bloodOxygenDao;
    }

    public BloodPressureDao getBloodPressureDao() {
        return this.bloodPressureDao;
    }

    public ContactDao getContactDao() {
        return this.contactDao;
    }

    public CricketGameDao getCricketGameDao() {
        return this.cricketGameDao;
    }

    public CricketTeamModelDao getCricketTeamModelDao() {
        return this.cricketTeamModelDao;
    }

    public DeviceScanRecordDao getDeviceScanRecordDao() {
        return this.deviceScanRecordDao;
    }

    public DownloadWatchFaceDao getDownloadWatchFaceDao() {
        return this.downloadWatchFaceDao;
    }

    public DrinkWaterDao getDrinkWaterDao() {
        return this.drinkWaterDao;
    }

    public ECardConfigDao getECardConfigDao() {
        return this.eCardConfigDao;
    }

    public ECardDao getECardDao() {
        return this.eCardDao;
    }

    public EcgDao getEcgDao() {
        return this.ecgDao;
    }

    public GoalsSettingDao getGoalsSettingDao() {
        return this.goalsSettingDao;
    }

    public GpsTrainingDao getGpsTrainingDao() {
        return this.gpsTrainingDao;
    }

    public HandWashingDao getHandWashingDao() {
        return this.handWashingDao;
    }

    public HeartRateDao getHeartRateDao() {
        return this.heartRateDao;
    }

    public HeartRateWarningDao getHeartRateWarningDao() {
        return this.heartRateWarningDao;
    }

    public HrvDao getHrvDao() {
        return this.hrvDao;
    }

    public LanguageDao getLanguageDao() {
        return this.languageDao;
    }

    public LocationCityDao getLocationCityDao() {
        return this.locationCityDao;
    }

    public MessagePushDao getMessagePushDao() {
        return this.messagePushDao;
    }

    public MovementHeartRateDao getMovementHeartRateDao() {
        return this.movementHeartRateDao;
    }

    public OnceHeartRateDao getOnceHeartRateDao() {
        return this.onceHeartRateDao;
    }

    public OnceTempDao getOnceTempDao() {
        return this.onceTempDao;
    }

    public PerformanceInsightsDao getPerformanceInsightsDao() {
        return this.performanceInsightsDao;
    }

    public PhysiologicalPeriodDao getPhysiologicalPeriodDao() {
        return this.physiologicalPeriodDao;
    }

    public PhysiologicalRemindDao getPhysiologicalRemindDao() {
        return this.physiologicalRemindDao;
    }

    public PillReminderDao getPillReminderDao() {
        return this.pillReminderDao;
    }

    public QuickContartConfigDao getQuickContartConfigDao() {
        return this.quickContartConfigDao;
    }

    public RecoverDao getRecoverDao() {
        return this.recoverDao;
    }

    public SleepDao getSleepDao() {
        return this.sleepDao;
    }

    public SleepNapDao getSleepNapDao() {
        return this.sleepNapDao;
    }

    public StepDao getStepDao() {
        return this.stepDao;
    }

    public StressDao getStressDao() {
        return this.stressDao;
    }

    public SupportWatchFaceDao getSupportWatchFaceDao() {
        return this.supportWatchFaceDao;
    }

    public TimingBloodOxygenDao getTimingBloodOxygenDao() {
        return this.timingBloodOxygenDao;
    }

    public TimingStressDao getTimingStressDao() {
        return this.timingStressDao;
    }

    public TimingTempDao getTimingTempDao() {
        return this.timingTempDao;
    }

    public TodayQuoteDao getTodayQuoteDao() {
        return this.todayQuoteDao;
    }

    public UserInfoDao getUserInfoDao() {
        return this.userInfoDao;
    }

    public WatchFaceDao getWatchFaceDao() {
        return this.watchFaceDao;
    }

    public WaterDao getWaterDao() {
        return this.waterDao;
    }

    public WeatherDao getWeatherDao() {
        return this.weatherDao;
    }

    public WeightDao getWeightDao() {
        return this.weightDao;
    }

    public WorldClockDao getWorldClockDao() {
        return this.worldClockDao;
    }
}
