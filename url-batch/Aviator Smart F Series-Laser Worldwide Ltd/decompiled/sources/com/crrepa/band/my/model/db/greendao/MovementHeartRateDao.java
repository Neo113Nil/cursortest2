package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.google.android.gms.fitness.data.Field;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class MovementHeartRateDao extends a {
    public static final String TABLENAME = "MOVEMENT_HEART_RATE";

    public static class Properties {
        public static final f StartTime = new f(0, Long.class, "startTime", true, FileDownloadModel.ID);
        public static final f EndTime = new f(1, Long.class, "endTime", false, "END_TIME");
        public static final f TrainingSeconds = new f(2, Integer.class, "trainingSeconds", false, "TRAINING_SECONDS");
        public static final f ValidTimes = new f(3, Integer.class, "validTimes", false, "VALID_TIMES");
        public static final f Type = new f(4, Integer.class, "type", false, "TYPE");
        public static final f Interval = new f(5, Integer.class, "interval", false, "INTERVAL");
        public static final f HeartRates = new f(6, String.class, "heartRates", false, "HEART_RATES");
        public static final f MinHeartRate = new f(7, Integer.class, "minHeartRate", false, "MIN_HEART_RATE");
        public static final f MaxHeartRate = new f(8, Integer.class, "maxHeartRate", false, "MAX_HEART_RATE");
        public static final f Average = new f(9, Integer.class, "average", false, "AVERAGE");
        public static final f LightCount = new f(10, Integer.class, "lightCount", false, "LIGHT_COUNT");
        public static final f WightCount = new f(11, Integer.class, "wightCount", false, "WIGHT_COUNT");
        public static final f AerobicCount = new f(12, Integer.class, "aerobicCount", false, "AEROBIC_COUNT");
        public static final f AnaerobicCount = new f(13, Integer.class, "anaerobicCount", false, "ANAEROBIC_COUNT");
        public static final f MaxCount = new f(14, Integer.class, "maxCount", false, "MAX_COUNT");
        public static final f Steps = new f(15, Integer.class, "steps", false, "STEPS");
        public static final f Distance = new f(16, Float.class, "distance", false, "DISTANCE");
        public static final f Calories = new f(17, Float.class, Field.NUTRIENT_CALORIES, false, "CALORIES");
        public static final f Speed = new f(18, Float.class, "speed", false, "SPEED");
        public static final f Pace = new f(19, Float.class, "pace", false, "PACE");
        public static final f Repeated = new f(20, Boolean.class, "repeated", false, "REPEATED");
        public static final f AltitudeListJson = new f(21, String.class, "altitudeListJson", false, "ALTITUDE_LIST_JSON");
        public static final f TrainingAdvancedInfoJson = new f(22, String.class, "trainingAdvancedInfoJson", false, "TRAINING_ADVANCED_INFO_JSON");
        public static final f StepsArray = new f(23, String.class, "stepsArray", false, "STEPS_ARRAY");
        public static final f DistanceArray = new f(24, String.class, "distanceArray", false, "DISTANCE_ARRAY");
    }

    public MovementHeartRateDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"MOVEMENT_HEART_RATE\" (\"_id\" INTEGER PRIMARY KEY ,\"END_TIME\" INTEGER,\"TRAINING_SECONDS\" INTEGER,\"VALID_TIMES\" INTEGER,\"TYPE\" INTEGER,\"INTERVAL\" INTEGER,\"HEART_RATES\" TEXT,\"MIN_HEART_RATE\" INTEGER,\"MAX_HEART_RATE\" INTEGER,\"AVERAGE\" INTEGER,\"LIGHT_COUNT\" INTEGER,\"WIGHT_COUNT\" INTEGER,\"AEROBIC_COUNT\" INTEGER,\"ANAEROBIC_COUNT\" INTEGER,\"MAX_COUNT\" INTEGER,\"STEPS\" INTEGER,\"DISTANCE\" REAL,\"CALORIES\" REAL,\"SPEED\" REAL,\"PACE\" REAL,\"REPEATED\" INTEGER,\"ALTITUDE_LIST_JSON\" TEXT,\"TRAINING_ADVANCED_INFO_JSON\" TEXT,\"STEPS_ARRAY\" TEXT,\"DISTANCE_ARRAY\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"MOVEMENT_HEART_RATE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public MovementHeartRateDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(MovementHeartRate movementHeartRate) {
        if (movementHeartRate != null) {
            return movementHeartRate.getStartTime();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(MovementHeartRate movementHeartRate) {
        return movementHeartRate.getStartTime() != null;
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
    public final Long updateKeyAfterInsert(MovementHeartRate movementHeartRate, long j8) {
        movementHeartRate.setStartTime(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, MovementHeartRate movementHeartRate) {
        cVar.clearBindings();
        Long startTime = movementHeartRate.getStartTime();
        if (startTime != null) {
            cVar.bindLong(1, startTime.longValue());
        }
        Long endTime = movementHeartRate.getEndTime();
        if (endTime != null) {
            cVar.bindLong(2, endTime.longValue());
        }
        if (movementHeartRate.getTrainingSeconds() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        if (movementHeartRate.getValidTimes() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (movementHeartRate.getType() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (movementHeartRate.getInterval() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        String heartRates = movementHeartRate.getHeartRates();
        if (heartRates != null) {
            cVar.bindString(7, heartRates);
        }
        if (movementHeartRate.getMinHeartRate() != null) {
            cVar.bindLong(8, r0.intValue());
        }
        if (movementHeartRate.getMaxHeartRate() != null) {
            cVar.bindLong(9, r0.intValue());
        }
        if (movementHeartRate.getAverage() != null) {
            cVar.bindLong(10, r0.intValue());
        }
        if (movementHeartRate.getLightCount() != null) {
            cVar.bindLong(11, r0.intValue());
        }
        if (movementHeartRate.getWightCount() != null) {
            cVar.bindLong(12, r0.intValue());
        }
        if (movementHeartRate.getAerobicCount() != null) {
            cVar.bindLong(13, r0.intValue());
        }
        if (movementHeartRate.getAnaerobicCount() != null) {
            cVar.bindLong(14, r0.intValue());
        }
        if (movementHeartRate.getMaxCount() != null) {
            cVar.bindLong(15, r0.intValue());
        }
        if (movementHeartRate.getSteps() != null) {
            cVar.bindLong(16, r0.intValue());
        }
        if (movementHeartRate.getDistance() != null) {
            cVar.bindDouble(17, r0.floatValue());
        }
        if (movementHeartRate.getCalories() != null) {
            cVar.bindDouble(18, r0.floatValue());
        }
        if (movementHeartRate.getSpeed() != null) {
            cVar.bindDouble(19, r0.floatValue());
        }
        if (movementHeartRate.getPace() != null) {
            cVar.bindDouble(20, r0.floatValue());
        }
        Boolean repeated = movementHeartRate.getRepeated();
        if (repeated != null) {
            cVar.bindLong(21, repeated.booleanValue() ? 1L : 0L);
        }
        String altitudeListJson = movementHeartRate.getAltitudeListJson();
        if (altitudeListJson != null) {
            cVar.bindString(22, altitudeListJson);
        }
        String trainingAdvancedInfoJson = movementHeartRate.getTrainingAdvancedInfoJson();
        if (trainingAdvancedInfoJson != null) {
            cVar.bindString(23, trainingAdvancedInfoJson);
        }
        String stepsArray = movementHeartRate.getStepsArray();
        if (stepsArray != null) {
            cVar.bindString(24, stepsArray);
        }
        String distanceArray = movementHeartRate.getDistanceArray();
        if (distanceArray != null) {
            cVar.bindString(25, distanceArray);
        }
    }

    @Override // org.greenrobot.greendao.a
    public MovementHeartRate readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Long valueOf3 = cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9));
        int i10 = i8 + 2;
        Integer valueOf4 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        Integer valueOf5 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 4;
        Integer valueOf6 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        Integer valueOf7 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 6;
        String string = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i8 + 7;
        Integer valueOf8 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i8 + 8;
        Integer valueOf9 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i8 + 9;
        Integer valueOf10 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i8 + 10;
        Integer valueOf11 = cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18));
        int i19 = i8 + 11;
        Integer valueOf12 = cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19));
        int i20 = i8 + 12;
        Integer valueOf13 = cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20));
        int i21 = i8 + 13;
        Integer valueOf14 = cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21));
        int i22 = i8 + 14;
        Integer valueOf15 = cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22));
        int i23 = i8 + 15;
        Integer valueOf16 = cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23));
        int i24 = i8 + 16;
        Float valueOf17 = cursor.isNull(i24) ? null : Float.valueOf(cursor.getFloat(i24));
        int i25 = i8 + 17;
        Float valueOf18 = cursor.isNull(i25) ? null : Float.valueOf(cursor.getFloat(i25));
        int i26 = i8 + 18;
        Float valueOf19 = cursor.isNull(i26) ? null : Float.valueOf(cursor.getFloat(i26));
        int i27 = i8 + 19;
        Float valueOf20 = cursor.isNull(i27) ? null : Float.valueOf(cursor.getFloat(i27));
        int i28 = i8 + 20;
        if (cursor.isNull(i28)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i28) != 0);
        }
        int i29 = i8 + 21;
        String string2 = cursor.isNull(i29) ? null : cursor.getString(i29);
        int i30 = i8 + 22;
        String string3 = cursor.isNull(i30) ? null : cursor.getString(i30);
        int i31 = i8 + 23;
        String string4 = cursor.isNull(i31) ? null : cursor.getString(i31);
        int i32 = i8 + 24;
        return new MovementHeartRate(valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, string, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf, string2, string3, string4, cursor.isNull(i32) ? null : cursor.getString(i32));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, MovementHeartRate movementHeartRate, int i8) {
        Boolean valueOf;
        movementHeartRate.setStartTime(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        movementHeartRate.setEndTime(cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9)));
        int i10 = i8 + 2;
        movementHeartRate.setTrainingSeconds(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        movementHeartRate.setValidTimes(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        movementHeartRate.setType(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        movementHeartRate.setInterval(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        movementHeartRate.setHeartRates(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i8 + 7;
        movementHeartRate.setMinHeartRate(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i8 + 8;
        movementHeartRate.setMaxHeartRate(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i8 + 9;
        movementHeartRate.setAverage(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i8 + 10;
        movementHeartRate.setLightCount(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i8 + 11;
        movementHeartRate.setWightCount(cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)));
        int i20 = i8 + 12;
        movementHeartRate.setAerobicCount(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i8 + 13;
        movementHeartRate.setAnaerobicCount(cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
        int i22 = i8 + 14;
        movementHeartRate.setMaxCount(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
        int i23 = i8 + 15;
        movementHeartRate.setSteps(cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23)));
        int i24 = i8 + 16;
        movementHeartRate.setDistance(cursor.isNull(i24) ? null : Float.valueOf(cursor.getFloat(i24)));
        int i25 = i8 + 17;
        movementHeartRate.setCalories(cursor.isNull(i25) ? null : Float.valueOf(cursor.getFloat(i25)));
        int i26 = i8 + 18;
        movementHeartRate.setSpeed(cursor.isNull(i26) ? null : Float.valueOf(cursor.getFloat(i26)));
        int i27 = i8 + 19;
        movementHeartRate.setPace(cursor.isNull(i27) ? null : Float.valueOf(cursor.getFloat(i27)));
        int i28 = i8 + 20;
        if (cursor.isNull(i28)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i28) != 0);
        }
        movementHeartRate.setRepeated(valueOf);
        int i29 = i8 + 21;
        movementHeartRate.setAltitudeListJson(cursor.isNull(i29) ? null : cursor.getString(i29));
        int i30 = i8 + 22;
        movementHeartRate.setTrainingAdvancedInfoJson(cursor.isNull(i30) ? null : cursor.getString(i30));
        int i31 = i8 + 23;
        movementHeartRate.setStepsArray(cursor.isNull(i31) ? null : cursor.getString(i31));
        int i32 = i8 + 24;
        movementHeartRate.setDistanceArray(cursor.isNull(i32) ? null : cursor.getString(i32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, MovementHeartRate movementHeartRate) {
        sQLiteStatement.clearBindings();
        Long startTime = movementHeartRate.getStartTime();
        if (startTime != null) {
            sQLiteStatement.bindLong(1, startTime.longValue());
        }
        Long endTime = movementHeartRate.getEndTime();
        if (endTime != null) {
            sQLiteStatement.bindLong(2, endTime.longValue());
        }
        if (movementHeartRate.getTrainingSeconds() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        if (movementHeartRate.getValidTimes() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (movementHeartRate.getType() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (movementHeartRate.getInterval() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        String heartRates = movementHeartRate.getHeartRates();
        if (heartRates != null) {
            sQLiteStatement.bindString(7, heartRates);
        }
        if (movementHeartRate.getMinHeartRate() != null) {
            sQLiteStatement.bindLong(8, r0.intValue());
        }
        if (movementHeartRate.getMaxHeartRate() != null) {
            sQLiteStatement.bindLong(9, r0.intValue());
        }
        if (movementHeartRate.getAverage() != null) {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (movementHeartRate.getLightCount() != null) {
            sQLiteStatement.bindLong(11, r0.intValue());
        }
        if (movementHeartRate.getWightCount() != null) {
            sQLiteStatement.bindLong(12, r0.intValue());
        }
        if (movementHeartRate.getAerobicCount() != null) {
            sQLiteStatement.bindLong(13, r0.intValue());
        }
        if (movementHeartRate.getAnaerobicCount() != null) {
            sQLiteStatement.bindLong(14, r0.intValue());
        }
        if (movementHeartRate.getMaxCount() != null) {
            sQLiteStatement.bindLong(15, r0.intValue());
        }
        if (movementHeartRate.getSteps() != null) {
            sQLiteStatement.bindLong(16, r0.intValue());
        }
        if (movementHeartRate.getDistance() != null) {
            sQLiteStatement.bindDouble(17, r0.floatValue());
        }
        if (movementHeartRate.getCalories() != null) {
            sQLiteStatement.bindDouble(18, r0.floatValue());
        }
        if (movementHeartRate.getSpeed() != null) {
            sQLiteStatement.bindDouble(19, r0.floatValue());
        }
        if (movementHeartRate.getPace() != null) {
            sQLiteStatement.bindDouble(20, r0.floatValue());
        }
        Boolean repeated = movementHeartRate.getRepeated();
        if (repeated != null) {
            sQLiteStatement.bindLong(21, repeated.booleanValue() ? 1L : 0L);
        }
        String altitudeListJson = movementHeartRate.getAltitudeListJson();
        if (altitudeListJson != null) {
            sQLiteStatement.bindString(22, altitudeListJson);
        }
        String trainingAdvancedInfoJson = movementHeartRate.getTrainingAdvancedInfoJson();
        if (trainingAdvancedInfoJson != null) {
            sQLiteStatement.bindString(23, trainingAdvancedInfoJson);
        }
        String stepsArray = movementHeartRate.getStepsArray();
        if (stepsArray != null) {
            sQLiteStatement.bindString(24, stepsArray);
        }
        String distanceArray = movementHeartRate.getDistanceArray();
        if (distanceArray != null) {
            sQLiteStatement.bindString(25, distanceArray);
        }
    }
}
