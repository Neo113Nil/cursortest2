package com.crrepa.band.my.model.db.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import org.greenrobot.greendao.b;
import org.greenrobot.greendao.database.a;
import org.greenrobot.greendao.database.g;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* loaded from: classes2.dex */
public class DaoMaster extends b {
    public static final int SCHEMA_VERSION = 304;

    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String str) {
            super(context, str);
        }

        @Override // org.greenrobot.greendao.database.b
        public void onUpgrade(a aVar, int i8, int i9) {
            Log.i("greenDAO", "Upgrading schema from version " + i8 + " to " + i9 + " by dropping all tables");
            DaoMaster.dropAllTables(aVar, true);
            onCreate(aVar);
        }

        public DevOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
        }
    }

    public static abstract class OpenHelper extends org.greenrobot.greendao.database.b {
        public OpenHelper(Context context, String str) {
            super(context, str, 304);
        }

        @Override // org.greenrobot.greendao.database.b
        public void onCreate(a aVar) {
            Log.i("greenDAO", "Creating tables for schema version 304");
            DaoMaster.createAllTables(aVar, false);
        }

        public OpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory, 304);
        }
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
        this(new g(sQLiteDatabase));
    }

    public static void createAllTables(a aVar, boolean z7) {
        AIChatRecordEntityDao.createTable(aVar, z7);
        ActiveHeartRateDao.createTable(aVar, z7);
        AlarmDao.createTable(aVar, z7);
        BandConfigDao.createTable(aVar, z7);
        BandFunctionDao.createTable(aVar, z7);
        BandLanguageDao.createTable(aVar, z7);
        BloodOxygenDao.createTable(aVar, z7);
        BloodPressureDao.createTable(aVar, z7);
        ContactDao.createTable(aVar, z7);
        CricketGameDao.createTable(aVar, z7);
        CricketTeamModelDao.createTable(aVar, z7);
        DeviceScanRecordDao.createTable(aVar, z7);
        DownloadWatchFaceDao.createTable(aVar, z7);
        DrinkWaterDao.createTable(aVar, z7);
        ECardDao.createTable(aVar, z7);
        ECardConfigDao.createTable(aVar, z7);
        EcgDao.createTable(aVar, z7);
        GoalsSettingDao.createTable(aVar, z7);
        GpsTrainingDao.createTable(aVar, z7);
        HandWashingDao.createTable(aVar, z7);
        HeartRateDao.createTable(aVar, z7);
        HeartRateWarningDao.createTable(aVar, z7);
        HrvDao.createTable(aVar, z7);
        LanguageDao.createTable(aVar, z7);
        LocationCityDao.createTable(aVar, z7);
        MessagePushDao.createTable(aVar, z7);
        MovementHeartRateDao.createTable(aVar, z7);
        OnceHeartRateDao.createTable(aVar, z7);
        OnceTempDao.createTable(aVar, z7);
        PerformanceInsightsDao.createTable(aVar, z7);
        PhysiologicalPeriodDao.createTable(aVar, z7);
        PhysiologicalRemindDao.createTable(aVar, z7);
        PillReminderDao.createTable(aVar, z7);
        QuickContartConfigDao.createTable(aVar, z7);
        RecoverDao.createTable(aVar, z7);
        SleepDao.createTable(aVar, z7);
        SleepNapDao.createTable(aVar, z7);
        StepDao.createTable(aVar, z7);
        StressDao.createTable(aVar, z7);
        SupportWatchFaceDao.createTable(aVar, z7);
        TimingBloodOxygenDao.createTable(aVar, z7);
        TimingStressDao.createTable(aVar, z7);
        TimingTempDao.createTable(aVar, z7);
        TodayQuoteDao.createTable(aVar, z7);
        UserInfoDao.createTable(aVar, z7);
        WatchFaceDao.createTable(aVar, z7);
        WaterDao.createTable(aVar, z7);
        WeatherDao.createTable(aVar, z7);
        WeightDao.createTable(aVar, z7);
        WorldClockDao.createTable(aVar, z7);
    }

    public static void dropAllTables(a aVar, boolean z7) {
        AIChatRecordEntityDao.dropTable(aVar, z7);
        ActiveHeartRateDao.dropTable(aVar, z7);
        AlarmDao.dropTable(aVar, z7);
        BandConfigDao.dropTable(aVar, z7);
        BandFunctionDao.dropTable(aVar, z7);
        BandLanguageDao.dropTable(aVar, z7);
        BloodOxygenDao.dropTable(aVar, z7);
        BloodPressureDao.dropTable(aVar, z7);
        ContactDao.dropTable(aVar, z7);
        CricketGameDao.dropTable(aVar, z7);
        CricketTeamModelDao.dropTable(aVar, z7);
        DeviceScanRecordDao.dropTable(aVar, z7);
        DownloadWatchFaceDao.dropTable(aVar, z7);
        DrinkWaterDao.dropTable(aVar, z7);
        ECardDao.dropTable(aVar, z7);
        ECardConfigDao.dropTable(aVar, z7);
        EcgDao.dropTable(aVar, z7);
        GoalsSettingDao.dropTable(aVar, z7);
        GpsTrainingDao.dropTable(aVar, z7);
        HandWashingDao.dropTable(aVar, z7);
        HeartRateDao.dropTable(aVar, z7);
        HeartRateWarningDao.dropTable(aVar, z7);
        HrvDao.dropTable(aVar, z7);
        LanguageDao.dropTable(aVar, z7);
        LocationCityDao.dropTable(aVar, z7);
        MessagePushDao.dropTable(aVar, z7);
        MovementHeartRateDao.dropTable(aVar, z7);
        OnceHeartRateDao.dropTable(aVar, z7);
        OnceTempDao.dropTable(aVar, z7);
        PerformanceInsightsDao.dropTable(aVar, z7);
        PhysiologicalPeriodDao.dropTable(aVar, z7);
        PhysiologicalRemindDao.dropTable(aVar, z7);
        PillReminderDao.dropTable(aVar, z7);
        QuickContartConfigDao.dropTable(aVar, z7);
        RecoverDao.dropTable(aVar, z7);
        SleepDao.dropTable(aVar, z7);
        SleepNapDao.dropTable(aVar, z7);
        StepDao.dropTable(aVar, z7);
        StressDao.dropTable(aVar, z7);
        SupportWatchFaceDao.dropTable(aVar, z7);
        TimingBloodOxygenDao.dropTable(aVar, z7);
        TimingStressDao.dropTable(aVar, z7);
        TimingTempDao.dropTable(aVar, z7);
        TodayQuoteDao.dropTable(aVar, z7);
        UserInfoDao.dropTable(aVar, z7);
        WatchFaceDao.dropTable(aVar, z7);
        WaterDao.dropTable(aVar, z7);
        WeatherDao.dropTable(aVar, z7);
        WeightDao.dropTable(aVar, z7);
        WorldClockDao.dropTable(aVar, z7);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoMaster(new DevOpenHelper(context, str).getWritableDb()).newSession();
    }

    public DaoMaster(a aVar) {
        super(aVar, 304);
        registerDaoClass(AIChatRecordEntityDao.class);
        registerDaoClass(ActiveHeartRateDao.class);
        registerDaoClass(AlarmDao.class);
        registerDaoClass(BandConfigDao.class);
        registerDaoClass(BandFunctionDao.class);
        registerDaoClass(BandLanguageDao.class);
        registerDaoClass(BloodOxygenDao.class);
        registerDaoClass(BloodPressureDao.class);
        registerDaoClass(ContactDao.class);
        registerDaoClass(CricketGameDao.class);
        registerDaoClass(CricketTeamModelDao.class);
        registerDaoClass(DeviceScanRecordDao.class);
        registerDaoClass(DownloadWatchFaceDao.class);
        registerDaoClass(DrinkWaterDao.class);
        registerDaoClass(ECardDao.class);
        registerDaoClass(ECardConfigDao.class);
        registerDaoClass(EcgDao.class);
        registerDaoClass(GoalsSettingDao.class);
        registerDaoClass(GpsTrainingDao.class);
        registerDaoClass(HandWashingDao.class);
        registerDaoClass(HeartRateDao.class);
        registerDaoClass(HeartRateWarningDao.class);
        registerDaoClass(HrvDao.class);
        registerDaoClass(LanguageDao.class);
        registerDaoClass(LocationCityDao.class);
        registerDaoClass(MessagePushDao.class);
        registerDaoClass(MovementHeartRateDao.class);
        registerDaoClass(OnceHeartRateDao.class);
        registerDaoClass(OnceTempDao.class);
        registerDaoClass(PerformanceInsightsDao.class);
        registerDaoClass(PhysiologicalPeriodDao.class);
        registerDaoClass(PhysiologicalRemindDao.class);
        registerDaoClass(PillReminderDao.class);
        registerDaoClass(QuickContartConfigDao.class);
        registerDaoClass(RecoverDao.class);
        registerDaoClass(SleepDao.class);
        registerDaoClass(SleepNapDao.class);
        registerDaoClass(StepDao.class);
        registerDaoClass(StressDao.class);
        registerDaoClass(SupportWatchFaceDao.class);
        registerDaoClass(TimingBloodOxygenDao.class);
        registerDaoClass(TimingStressDao.class);
        registerDaoClass(TimingTempDao.class);
        registerDaoClass(TodayQuoteDao.class);
        registerDaoClass(UserInfoDao.class);
        registerDaoClass(WatchFaceDao.class);
        registerDaoClass(WaterDao.class);
        registerDaoClass(WeatherDao.class);
        registerDaoClass(WeightDao.class);
        registerDaoClass(WorldClockDao.class);
    }

    @Override // org.greenrobot.greendao.b
    public DaoSession newSession() {
        return new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.b
    public DaoSession newSession(IdentityScopeType identityScopeType) {
        return new DaoSession(this.db, identityScopeType, this.daoConfigMap);
    }
}
