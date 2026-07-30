package com.crrepa.band.my.ble.greendao.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.crrepa.band.my.model.db.greendao.ActiveHeartRateDao;
import com.crrepa.band.my.model.db.greendao.AlarmDao;
import com.crrepa.band.my.model.db.greendao.BandConfigDao;
import com.crrepa.band.my.model.db.greendao.BandFunctionDao;
import com.crrepa.band.my.model.db.greendao.BandLanguageDao;
import com.crrepa.band.my.model.db.greendao.BloodOxygenDao;
import com.crrepa.band.my.model.db.greendao.BloodPressureDao;
import com.crrepa.band.my.model.db.greendao.ContactDao;
import com.crrepa.band.my.model.db.greendao.CricketGameDao;
import com.crrepa.band.my.model.db.greendao.CricketTeamModelDao;
import com.crrepa.band.my.model.db.greendao.DaoMaster;
import com.crrepa.band.my.model.db.greendao.DeviceScanRecordDao;
import com.crrepa.band.my.model.db.greendao.DownloadWatchFaceDao;
import com.crrepa.band.my.model.db.greendao.DrinkWaterDao;
import com.crrepa.band.my.model.db.greendao.ECardConfigDao;
import com.crrepa.band.my.model.db.greendao.ECardDao;
import com.crrepa.band.my.model.db.greendao.EcgDao;
import com.crrepa.band.my.model.db.greendao.GoalsSettingDao;
import com.crrepa.band.my.model.db.greendao.GpsTrainingDao;
import com.crrepa.band.my.model.db.greendao.HandWashingDao;
import com.crrepa.band.my.model.db.greendao.HeartRateDao;
import com.crrepa.band.my.model.db.greendao.HeartRateWarningDao;
import com.crrepa.band.my.model.db.greendao.HrvDao;
import com.crrepa.band.my.model.db.greendao.LanguageDao;
import com.crrepa.band.my.model.db.greendao.LocationCityDao;
import com.crrepa.band.my.model.db.greendao.MessagePushDao;
import com.crrepa.band.my.model.db.greendao.MovementHeartRateDao;
import com.crrepa.band.my.model.db.greendao.OnceHeartRateDao;
import com.crrepa.band.my.model.db.greendao.OnceTempDao;
import com.crrepa.band.my.model.db.greendao.PhysiologicalPeriodDao;
import com.crrepa.band.my.model.db.greendao.PhysiologicalRemindDao;
import com.crrepa.band.my.model.db.greendao.PillReminderDao;
import com.crrepa.band.my.model.db.greendao.QuickContartConfigDao;
import com.crrepa.band.my.model.db.greendao.RecoverDao;
import com.crrepa.band.my.model.db.greendao.SleepDao;
import com.crrepa.band.my.model.db.greendao.StepDao;
import com.crrepa.band.my.model.db.greendao.StressDao;
import com.crrepa.band.my.model.db.greendao.SupportWatchFaceDao;
import com.crrepa.band.my.model.db.greendao.TimingBloodOxygenDao;
import com.crrepa.band.my.model.db.greendao.TimingStressDao;
import com.crrepa.band.my.model.db.greendao.TimingTempDao;
import com.crrepa.band.my.model.db.greendao.TodayQuoteDao;
import com.crrepa.band.my.model.db.greendao.UserInfoDao;
import com.crrepa.band.my.model.db.greendao.WatchFaceDao;
import com.crrepa.band.my.model.db.greendao.WeatherDao;
import com.crrepa.band.my.model.db.greendao.WeightDao;
import com.crrepa.band.my.model.db.greendao.WorldClockDao;
import com.orhanobut.logger.f;
import y4.a;

/* loaded from: classes2.dex */
public class b extends DaoMaster.OpenHelper {

    class a implements a.InterfaceC0408a {
        a() {
        }

        @Override // y4.a.InterfaceC0408a
        public void onCreateAllTables(org.greenrobot.greendao.database.a aVar, boolean z7) {
            DaoMaster.createAllTables(aVar, z7);
        }

        @Override // y4.a.InterfaceC0408a
        public void onDropAllTables(org.greenrobot.greendao.database.a aVar, boolean z7) {
            DaoMaster.dropAllTables(aVar, z7);
        }
    }

    public b(Context context, String str) {
        super(context, str);
    }

    @Override // org.greenrobot.greendao.database.b, android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        f.e("db onUpgrade: " + i8 + "--->" + i9, new Object[0]);
        super.onUpgrade(sQLiteDatabase, i8, i9);
        y4.a.migrate(sQLiteDatabase, new a(), (Class<? extends org.greenrobot.greendao.a>[]) new Class[]{StepDao.class, SleepDao.class, ActiveHeartRateDao.class, BloodPressureDao.class, BloodOxygenDao.class, AlarmDao.class, MessagePushDao.class, BandConfigDao.class, HeartRateDao.class, MovementHeartRateDao.class, OnceHeartRateDao.class, GpsTrainingDao.class, BandFunctionDao.class, BandFunctionDao.class, EcgDao.class, LanguageDao.class, LocationCityDao.class, PhysiologicalPeriodDao.class, PhysiologicalRemindDao.class, SupportWatchFaceDao.class, WatchFaceDao.class, UserInfoDao.class, PillReminderDao.class, BandLanguageDao.class, ContactDao.class, DrinkWaterDao.class, HandWashingDao.class, HeartRateWarningDao.class, OnceTempDao.class, QuickContartConfigDao.class, TimingBloodOxygenDao.class, TimingTempDao.class, WeatherDao.class, ECardDao.class, ECardConfigDao.class, HrvDao.class, DownloadWatchFaceDao.class, StressDao.class, GoalsSettingDao.class, CricketGameDao.class, CricketTeamModelDao.class, RecoverDao.class, TimingStressDao.class, TodayQuoteDao.class, WeightDao.class, WorldClockDao.class, DeviceScanRecordDao.class});
    }
}
