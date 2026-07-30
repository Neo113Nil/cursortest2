package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.GpsTraining;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class GpsTrainingDao extends a {
    public static final String TABLENAME = "GPS_RUN";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f StartDate = new f(1, Date.class, "startDate", false, "START_DATE");
        public static final f EndDate = new f(2, Date.class, "endDate", false, "END_DATE");
        public static final f Distance = new f(3, Integer.class, "distance", false, "DISTANCE");
        public static final f Calorie = new f(4, Float.class, "calorie", false, "CALORIE");
        public static final f Step = new f(5, Integer.class, "step", false, "STEP");
        public static final f HeartRate = new f(6, Integer.class, "heartRate", false, HeartRateDao.TABLENAME);
        public static final f FilePath = new f(7, String.class, "filePath", false, "FILE_PATH");
        public static final f Encrypt = new f(8, Boolean.class, "encrypt", false, "ENCRYPT");
        public static final f Type = new f(9, Integer.class, "type", false, "TYPE");
        public static final f TrainingType = new f(10, Integer.class, "trainingType", false, "TRAINING_TYPE");
        public static final f Elevation = new f(11, Float.class, "elevation", false, "ELEVATION");
        public static final f TrainingSeconds = new f(12, Integer.class, "trainingSeconds", false, "TRAINING_SECONDS");
        public static final f AverageStepFrequency = new f(13, Integer.class, "averageStepFrequency", false, "AVERAGE_STEP_FREQUENCY");
        public static final f StepFrequencyList = new f(14, String.class, "stepFrequencyList", false, "STEP_FREQUENCY_LIST");
        public static final f AverageStepLength = new f(15, Float.class, "averageStepLength", false, "AVERAGE_STEP_LENGTH");
        public static final f StepLengthList = new f(16, String.class, "stepLengthList", false, "STEP_LENGTH_LIST");
        public static final f TwoSecondsAltitudeList = new f(17, String.class, "twoSecondsAltitudeList", false, "TWO_SECONDS_ALTITUDE_LIST");
        public static final f RealTimePaceList = new f(18, String.class, "realTimePaceList", false, "REAL_TIME_PACE_LIST");
        public static final f OneKmPaceList = new f(19, String.class, "oneKmPaceList", false, "ONE_KM_PACE_LIST");
        public static final f OneMilePaceList = new f(20, String.class, "oneMilePaceList", false, "ONE_MILE_PACE_LIST");
        public static final f HrList = new f(21, String.class, "hrList", false, "HR_LIST");
        public static final f MinHr = new f(22, Integer.class, "minHr", false, "MIN_HR");
        public static final f MaxHr = new f(23, Integer.class, "maxHr", false, "MAX_HR");
        public static final f LightSeconds = new f(24, Integer.class, "lightSeconds", false, "LIGHT_SECONDS");
        public static final f WeightSeconds = new f(25, Integer.class, "weightSeconds", false, "WEIGHT_SECONDS");
        public static final f AerobicSeconds = new f(26, Integer.class, "aerobicSeconds", false, "AEROBIC_SECONDS");
        public static final f AnaerobicSeconds = new f(27, Integer.class, "anaerobicSeconds", false, "ANAEROBIC_SECONDS");
        public static final f MaxSeconds = new f(28, Integer.class, "maxSeconds", false, "MAX_SECONDS");
        public static final f Interval = new f(29, Integer.class, "interval", false, "INTERVAL");
        public static final f NowTemperature = new f(30, Integer.class, "nowTemperature", false, "NOW_TEMPERATURE");
        public static final f NowTemperatureUnit = new f(31, Integer.class, "nowTemperatureUnit", false, "NOW_TEMPERATURE_UNIT");
        public static final f WeatherCode = new f(32, Integer.class, "weatherCode", false, "WEATHER_CODE");
        public static final f AltitudeListJson = new f(33, String.class, "altitudeListJson", false, "ALTITUDE_LIST_JSON");
        public static final f TrainingAdvancedInfoJson = new f(34, String.class, "trainingAdvancedInfoJson", false, "TRAINING_ADVANCED_INFO_JSON");
    }

    public GpsTrainingDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"GPS_RUN\" (\"_id\" INTEGER PRIMARY KEY ,\"START_DATE\" INTEGER,\"END_DATE\" INTEGER,\"DISTANCE\" INTEGER,\"CALORIE\" REAL,\"STEP\" INTEGER,\"HEART_RATE\" INTEGER,\"FILE_PATH\" TEXT,\"ENCRYPT\" INTEGER,\"TYPE\" INTEGER,\"TRAINING_TYPE\" INTEGER,\"ELEVATION\" REAL,\"TRAINING_SECONDS\" INTEGER,\"AVERAGE_STEP_FREQUENCY\" INTEGER,\"STEP_FREQUENCY_LIST\" TEXT,\"AVERAGE_STEP_LENGTH\" REAL,\"STEP_LENGTH_LIST\" TEXT,\"TWO_SECONDS_ALTITUDE_LIST\" TEXT,\"REAL_TIME_PACE_LIST\" TEXT,\"ONE_KM_PACE_LIST\" TEXT,\"ONE_MILE_PACE_LIST\" TEXT,\"HR_LIST\" TEXT,\"MIN_HR\" INTEGER,\"MAX_HR\" INTEGER,\"LIGHT_SECONDS\" INTEGER,\"WEIGHT_SECONDS\" INTEGER,\"AEROBIC_SECONDS\" INTEGER,\"ANAEROBIC_SECONDS\" INTEGER,\"MAX_SECONDS\" INTEGER,\"INTERVAL\" INTEGER,\"NOW_TEMPERATURE\" INTEGER,\"NOW_TEMPERATURE_UNIT\" INTEGER,\"WEATHER_CODE\" INTEGER,\"ALTITUDE_LIST_JSON\" TEXT,\"TRAINING_ADVANCED_INFO_JSON\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"GPS_RUN\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public GpsTrainingDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(GpsTraining gpsTraining) {
        if (gpsTraining != null) {
            return gpsTraining.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(GpsTraining gpsTraining) {
        return gpsTraining.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(GpsTraining gpsTraining, long j8) {
        gpsTraining.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, GpsTraining gpsTraining) {
        cVar.clearBindings();
        Long id = gpsTraining.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date startDate = gpsTraining.getStartDate();
        if (startDate != null) {
            cVar.bindLong(2, startDate.getTime());
        }
        Date endDate = gpsTraining.getEndDate();
        if (endDate != null) {
            cVar.bindLong(3, endDate.getTime());
        }
        if (gpsTraining.getDistance() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (gpsTraining.getCalorie() != null) {
            cVar.bindDouble(5, r0.floatValue());
        }
        if (gpsTraining.getStep() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (gpsTraining.getHeartRate() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        String filePath = gpsTraining.getFilePath();
        if (filePath != null) {
            cVar.bindString(8, filePath);
        }
        Boolean encrypt = gpsTraining.getEncrypt();
        if (encrypt != null) {
            cVar.bindLong(9, encrypt.booleanValue() ? 1L : 0L);
        }
        if (gpsTraining.getType() != null) {
            cVar.bindLong(10, r0.intValue());
        }
        if (gpsTraining.getTrainingType() != null) {
            cVar.bindLong(11, r0.intValue());
        }
        if (gpsTraining.getElevation() != null) {
            cVar.bindDouble(12, r0.floatValue());
        }
        if (gpsTraining.getTrainingSeconds() != null) {
            cVar.bindLong(13, r0.intValue());
        }
        if (gpsTraining.getAverageStepFrequency() != null) {
            cVar.bindLong(14, r0.intValue());
        }
        String stepFrequencyList = gpsTraining.getStepFrequencyList();
        if (stepFrequencyList != null) {
            cVar.bindString(15, stepFrequencyList);
        }
        if (gpsTraining.getAverageStepLength() != null) {
            cVar.bindDouble(16, r0.floatValue());
        }
        String stepLengthList = gpsTraining.getStepLengthList();
        if (stepLengthList != null) {
            cVar.bindString(17, stepLengthList);
        }
        String twoSecondsAltitudeList = gpsTraining.getTwoSecondsAltitudeList();
        if (twoSecondsAltitudeList != null) {
            cVar.bindString(18, twoSecondsAltitudeList);
        }
        String realTimePaceList = gpsTraining.getRealTimePaceList();
        if (realTimePaceList != null) {
            cVar.bindString(19, realTimePaceList);
        }
        String oneKmPaceList = gpsTraining.getOneKmPaceList();
        if (oneKmPaceList != null) {
            cVar.bindString(20, oneKmPaceList);
        }
        String oneMilePaceList = gpsTraining.getOneMilePaceList();
        if (oneMilePaceList != null) {
            cVar.bindString(21, oneMilePaceList);
        }
        String hrList = gpsTraining.getHrList();
        if (hrList != null) {
            cVar.bindString(22, hrList);
        }
        if (gpsTraining.getMinHr() != null) {
            cVar.bindLong(23, r0.intValue());
        }
        if (gpsTraining.getMaxHr() != null) {
            cVar.bindLong(24, r0.intValue());
        }
        if (gpsTraining.getLightSeconds() != null) {
            cVar.bindLong(25, r0.intValue());
        }
        if (gpsTraining.getWeightSeconds() != null) {
            cVar.bindLong(26, r0.intValue());
        }
        if (gpsTraining.getAerobicSeconds() != null) {
            cVar.bindLong(27, r0.intValue());
        }
        if (gpsTraining.getAnaerobicSeconds() != null) {
            cVar.bindLong(28, r0.intValue());
        }
        if (gpsTraining.getMaxSeconds() != null) {
            cVar.bindLong(29, r0.intValue());
        }
        if (gpsTraining.getInterval() != null) {
            cVar.bindLong(30, r0.intValue());
        }
        if (gpsTraining.getNowTemperature() != null) {
            cVar.bindLong(31, r0.intValue());
        }
        if (gpsTraining.getNowTemperatureUnit() != null) {
            cVar.bindLong(32, r0.intValue());
        }
        if (gpsTraining.getWeatherCode() != null) {
            cVar.bindLong(33, r0.intValue());
        }
        String altitudeListJson = gpsTraining.getAltitudeListJson();
        if (altitudeListJson != null) {
            cVar.bindString(34, altitudeListJson);
        }
        String trainingAdvancedInfoJson = gpsTraining.getTrainingAdvancedInfoJson();
        if (trainingAdvancedInfoJson != null) {
            cVar.bindString(35, trainingAdvancedInfoJson);
        }
    }

    @Override // org.greenrobot.greendao.a
    public GpsTraining readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Date date = cursor.isNull(i9) ? null : new Date(cursor.getLong(i9));
        int i10 = i8 + 2;
        Date date2 = cursor.isNull(i10) ? null : new Date(cursor.getLong(i10));
        int i11 = i8 + 3;
        Integer valueOf3 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 4;
        Float valueOf4 = cursor.isNull(i12) ? null : Float.valueOf(cursor.getFloat(i12));
        int i13 = i8 + 5;
        Integer valueOf5 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 6;
        Integer valueOf6 = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i8 + 7;
        String string = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i8 + 8;
        if (cursor.isNull(i16)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        int i17 = i8 + 9;
        Integer valueOf7 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i8 + 10;
        Integer valueOf8 = cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18));
        int i19 = i8 + 11;
        Float valueOf9 = cursor.isNull(i19) ? null : Float.valueOf(cursor.getFloat(i19));
        int i20 = i8 + 12;
        Integer valueOf10 = cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20));
        int i21 = i8 + 13;
        Integer valueOf11 = cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21));
        int i22 = i8 + 14;
        String string2 = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i8 + 15;
        Float valueOf12 = cursor.isNull(i23) ? null : Float.valueOf(cursor.getFloat(i23));
        int i24 = i8 + 16;
        String string3 = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = i8 + 17;
        String string4 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i8 + 18;
        String string5 = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i8 + 19;
        String string6 = cursor.isNull(i27) ? null : cursor.getString(i27);
        int i28 = i8 + 20;
        String string7 = cursor.isNull(i28) ? null : cursor.getString(i28);
        int i29 = i8 + 21;
        String string8 = cursor.isNull(i29) ? null : cursor.getString(i29);
        int i30 = i8 + 22;
        Integer valueOf13 = cursor.isNull(i30) ? null : Integer.valueOf(cursor.getInt(i30));
        int i31 = i8 + 23;
        Integer valueOf14 = cursor.isNull(i31) ? null : Integer.valueOf(cursor.getInt(i31));
        int i32 = i8 + 24;
        Integer valueOf15 = cursor.isNull(i32) ? null : Integer.valueOf(cursor.getInt(i32));
        int i33 = i8 + 25;
        Integer valueOf16 = cursor.isNull(i33) ? null : Integer.valueOf(cursor.getInt(i33));
        int i34 = i8 + 26;
        Integer valueOf17 = cursor.isNull(i34) ? null : Integer.valueOf(cursor.getInt(i34));
        int i35 = i8 + 27;
        Integer valueOf18 = cursor.isNull(i35) ? null : Integer.valueOf(cursor.getInt(i35));
        int i36 = i8 + 28;
        Integer valueOf19 = cursor.isNull(i36) ? null : Integer.valueOf(cursor.getInt(i36));
        int i37 = i8 + 29;
        Integer valueOf20 = cursor.isNull(i37) ? null : Integer.valueOf(cursor.getInt(i37));
        int i38 = i8 + 30;
        Integer valueOf21 = cursor.isNull(i38) ? null : Integer.valueOf(cursor.getInt(i38));
        int i39 = i8 + 31;
        Integer valueOf22 = cursor.isNull(i39) ? null : Integer.valueOf(cursor.getInt(i39));
        int i40 = i8 + 32;
        Integer valueOf23 = cursor.isNull(i40) ? null : Integer.valueOf(cursor.getInt(i40));
        int i41 = i8 + 33;
        String string9 = cursor.isNull(i41) ? null : cursor.getString(i41);
        int i42 = i8 + 34;
        return new GpsTraining(valueOf2, date, date2, valueOf3, valueOf4, valueOf5, valueOf6, string, valueOf, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, string2, valueOf12, string3, string4, string5, string6, string7, string8, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, string9, cursor.isNull(i42) ? null : cursor.getString(i42));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, GpsTraining gpsTraining, int i8) {
        Boolean valueOf;
        gpsTraining.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        gpsTraining.setStartDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        gpsTraining.setEndDate(cursor.isNull(i10) ? null : new Date(cursor.getLong(i10)));
        int i11 = i8 + 3;
        gpsTraining.setDistance(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        gpsTraining.setCalorie(cursor.isNull(i12) ? null : Float.valueOf(cursor.getFloat(i12)));
        int i13 = i8 + 5;
        gpsTraining.setStep(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        gpsTraining.setHeartRate(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 7;
        gpsTraining.setFilePath(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i8 + 8;
        if (cursor.isNull(i16)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        gpsTraining.setEncrypt(valueOf);
        int i17 = i8 + 9;
        gpsTraining.setType(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i8 + 10;
        gpsTraining.setTrainingType(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i8 + 11;
        gpsTraining.setElevation(cursor.isNull(i19) ? null : Float.valueOf(cursor.getFloat(i19)));
        int i20 = i8 + 12;
        gpsTraining.setTrainingSeconds(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i8 + 13;
        gpsTraining.setAverageStepFrequency(cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
        int i22 = i8 + 14;
        gpsTraining.setStepFrequencyList(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i8 + 15;
        gpsTraining.setAverageStepLength(cursor.isNull(i23) ? null : Float.valueOf(cursor.getFloat(i23)));
        int i24 = i8 + 16;
        gpsTraining.setStepLengthList(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i8 + 17;
        gpsTraining.setTwoSecondsAltitudeList(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i8 + 18;
        gpsTraining.setRealTimePaceList(cursor.isNull(i26) ? null : cursor.getString(i26));
        int i27 = i8 + 19;
        gpsTraining.setOneKmPaceList(cursor.isNull(i27) ? null : cursor.getString(i27));
        int i28 = i8 + 20;
        gpsTraining.setOneMilePaceList(cursor.isNull(i28) ? null : cursor.getString(i28));
        int i29 = i8 + 21;
        gpsTraining.setHrList(cursor.isNull(i29) ? null : cursor.getString(i29));
        int i30 = i8 + 22;
        gpsTraining.setMinHr(cursor.isNull(i30) ? null : Integer.valueOf(cursor.getInt(i30)));
        int i31 = i8 + 23;
        gpsTraining.setMaxHr(cursor.isNull(i31) ? null : Integer.valueOf(cursor.getInt(i31)));
        int i32 = i8 + 24;
        gpsTraining.setLightSeconds(cursor.isNull(i32) ? null : Integer.valueOf(cursor.getInt(i32)));
        int i33 = i8 + 25;
        gpsTraining.setWeightSeconds(cursor.isNull(i33) ? null : Integer.valueOf(cursor.getInt(i33)));
        int i34 = i8 + 26;
        gpsTraining.setAerobicSeconds(cursor.isNull(i34) ? null : Integer.valueOf(cursor.getInt(i34)));
        int i35 = i8 + 27;
        gpsTraining.setAnaerobicSeconds(cursor.isNull(i35) ? null : Integer.valueOf(cursor.getInt(i35)));
        int i36 = i8 + 28;
        gpsTraining.setMaxSeconds(cursor.isNull(i36) ? null : Integer.valueOf(cursor.getInt(i36)));
        int i37 = i8 + 29;
        gpsTraining.setInterval(cursor.isNull(i37) ? null : Integer.valueOf(cursor.getInt(i37)));
        int i38 = i8 + 30;
        gpsTraining.setNowTemperature(cursor.isNull(i38) ? null : Integer.valueOf(cursor.getInt(i38)));
        int i39 = i8 + 31;
        gpsTraining.setNowTemperatureUnit(cursor.isNull(i39) ? null : Integer.valueOf(cursor.getInt(i39)));
        int i40 = i8 + 32;
        gpsTraining.setWeatherCode(cursor.isNull(i40) ? null : Integer.valueOf(cursor.getInt(i40)));
        int i41 = i8 + 33;
        gpsTraining.setAltitudeListJson(cursor.isNull(i41) ? null : cursor.getString(i41));
        int i42 = i8 + 34;
        gpsTraining.setTrainingAdvancedInfoJson(cursor.isNull(i42) ? null : cursor.getString(i42));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, GpsTraining gpsTraining) {
        sQLiteStatement.clearBindings();
        Long id = gpsTraining.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date startDate = gpsTraining.getStartDate();
        if (startDate != null) {
            sQLiteStatement.bindLong(2, startDate.getTime());
        }
        Date endDate = gpsTraining.getEndDate();
        if (endDate != null) {
            sQLiteStatement.bindLong(3, endDate.getTime());
        }
        if (gpsTraining.getDistance() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (gpsTraining.getCalorie() != null) {
            sQLiteStatement.bindDouble(5, r0.floatValue());
        }
        if (gpsTraining.getStep() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (gpsTraining.getHeartRate() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        String filePath = gpsTraining.getFilePath();
        if (filePath != null) {
            sQLiteStatement.bindString(8, filePath);
        }
        Boolean encrypt = gpsTraining.getEncrypt();
        if (encrypt != null) {
            sQLiteStatement.bindLong(9, encrypt.booleanValue() ? 1L : 0L);
        }
        if (gpsTraining.getType() != null) {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (gpsTraining.getTrainingType() != null) {
            sQLiteStatement.bindLong(11, r0.intValue());
        }
        if (gpsTraining.getElevation() != null) {
            sQLiteStatement.bindDouble(12, r0.floatValue());
        }
        if (gpsTraining.getTrainingSeconds() != null) {
            sQLiteStatement.bindLong(13, r0.intValue());
        }
        if (gpsTraining.getAverageStepFrequency() != null) {
            sQLiteStatement.bindLong(14, r0.intValue());
        }
        String stepFrequencyList = gpsTraining.getStepFrequencyList();
        if (stepFrequencyList != null) {
            sQLiteStatement.bindString(15, stepFrequencyList);
        }
        if (gpsTraining.getAverageStepLength() != null) {
            sQLiteStatement.bindDouble(16, r0.floatValue());
        }
        String stepLengthList = gpsTraining.getStepLengthList();
        if (stepLengthList != null) {
            sQLiteStatement.bindString(17, stepLengthList);
        }
        String twoSecondsAltitudeList = gpsTraining.getTwoSecondsAltitudeList();
        if (twoSecondsAltitudeList != null) {
            sQLiteStatement.bindString(18, twoSecondsAltitudeList);
        }
        String realTimePaceList = gpsTraining.getRealTimePaceList();
        if (realTimePaceList != null) {
            sQLiteStatement.bindString(19, realTimePaceList);
        }
        String oneKmPaceList = gpsTraining.getOneKmPaceList();
        if (oneKmPaceList != null) {
            sQLiteStatement.bindString(20, oneKmPaceList);
        }
        String oneMilePaceList = gpsTraining.getOneMilePaceList();
        if (oneMilePaceList != null) {
            sQLiteStatement.bindString(21, oneMilePaceList);
        }
        String hrList = gpsTraining.getHrList();
        if (hrList != null) {
            sQLiteStatement.bindString(22, hrList);
        }
        if (gpsTraining.getMinHr() != null) {
            sQLiteStatement.bindLong(23, r0.intValue());
        }
        if (gpsTraining.getMaxHr() != null) {
            sQLiteStatement.bindLong(24, r0.intValue());
        }
        if (gpsTraining.getLightSeconds() != null) {
            sQLiteStatement.bindLong(25, r0.intValue());
        }
        if (gpsTraining.getWeightSeconds() != null) {
            sQLiteStatement.bindLong(26, r0.intValue());
        }
        if (gpsTraining.getAerobicSeconds() != null) {
            sQLiteStatement.bindLong(27, r0.intValue());
        }
        if (gpsTraining.getAnaerobicSeconds() != null) {
            sQLiteStatement.bindLong(28, r0.intValue());
        }
        if (gpsTraining.getMaxSeconds() != null) {
            sQLiteStatement.bindLong(29, r0.intValue());
        }
        if (gpsTraining.getInterval() != null) {
            sQLiteStatement.bindLong(30, r0.intValue());
        }
        if (gpsTraining.getNowTemperature() != null) {
            sQLiteStatement.bindLong(31, r0.intValue());
        }
        if (gpsTraining.getNowTemperatureUnit() != null) {
            sQLiteStatement.bindLong(32, r0.intValue());
        }
        if (gpsTraining.getWeatherCode() != null) {
            sQLiteStatement.bindLong(33, r0.intValue());
        }
        String altitudeListJson = gpsTraining.getAltitudeListJson();
        if (altitudeListJson != null) {
            sQLiteStatement.bindString(34, altitudeListJson);
        }
        String trainingAdvancedInfoJson = gpsTraining.getTrainingAdvancedInfoJson();
        if (trainingAdvancedInfoJson != null) {
            sQLiteStatement.bindString(35, trainingAdvancedInfoJson);
        }
    }
}
