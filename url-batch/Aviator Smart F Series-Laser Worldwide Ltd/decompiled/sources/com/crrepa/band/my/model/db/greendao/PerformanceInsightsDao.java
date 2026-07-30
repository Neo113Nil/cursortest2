package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.PerformanceInsights;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class PerformanceInsightsDao extends a {
    public static final String TABLENAME = "PERFORMANCE_INSIGHTS";

    public static class Properties {
        public static final f Date = new f(0, Date.class, "date", true, "DATE");
        public static final f UpdateDate = new f(1, Date.class, "updateDate", false, "UPDATE_DATE");
        public static final f MaxOxygenIntake = new f(2, Float.class, "maxOxygenIntake", false, "MAX_OXYGEN_INTAKE");
        public static final f LactateSpeed = new f(3, Float.class, "lactateSpeed", false, "LACTATE_SPEED");
        public static final f LactateHeartRate = new f(4, Integer.class, "lactateHeartRate", false, "LACTATE_HEART_RATE");
        public static final f Age = new f(5, Integer.class, "age", false, "AGE");
        public static final f AgeEvaluationCoefficient = new f(6, Integer.class, "ageEvaluationCoefficient", false, "AGE_EVALUATION_COEFFICIENT");
        public static final f CurrentLoad = new f(7, Integer.class, "currentLoad", false, "CURRENT_LOAD");
        public static final f ShortTermLoad = new f(8, Integer.class, "shortTermLoad", false, "SHORT_TERM_LOAD");
        public static final f LongTermLoad = new f(9, Integer.class, "longTermLoad", false, "LONG_TERM_LOAD");
        public static final f TrainingLoadLevel = new f(10, Integer.class, "trainingLoadLevel", false, "TRAINING_LOAD_LEVEL");
        public static final f TrainingLoadFactor = new f(11, Float.class, "trainingLoadFactor", false, "TRAINING_LOAD_FACTOR");
        public static final f RecoveryTime = new f(12, Integer.class, "recoveryTime", false, "RECOVERY_TIME");
        public static final f TrainingEndTime = new f(13, Integer.class, "trainingEndTime", false, "TRAINING_END_TIME");
        public static final f CarbohydrateConsumptionPercentage = new f(14, Integer.class, "carbohydrateConsumptionPercentage", false, "CARBOHYDRATE_CONSUMPTION_PERCENTAGE");
        public static final f FatConsumptionPercentage = new f(15, Integer.class, "fatConsumptionPercentage", false, "FAT_CONSUMPTION_PERCENTAGE");
        public static final f MetabolicCoefficient = new f(16, Integer.class, "metabolicCoefficient", false, "METABOLIC_COEFFICIENT");
    }

    public PerformanceInsightsDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"PERFORMANCE_INSIGHTS\" (\"DATE\" INTEGER PRIMARY KEY ,\"UPDATE_DATE\" INTEGER,\"MAX_OXYGEN_INTAKE\" REAL,\"LACTATE_SPEED\" REAL,\"LACTATE_HEART_RATE\" INTEGER,\"AGE\" INTEGER,\"AGE_EVALUATION_COEFFICIENT\" INTEGER,\"CURRENT_LOAD\" INTEGER,\"SHORT_TERM_LOAD\" INTEGER,\"LONG_TERM_LOAD\" INTEGER,\"TRAINING_LOAD_LEVEL\" INTEGER,\"TRAINING_LOAD_FACTOR\" REAL,\"RECOVERY_TIME\" INTEGER,\"TRAINING_END_TIME\" INTEGER,\"CARBOHYDRATE_CONSUMPTION_PERCENTAGE\" INTEGER,\"FAT_CONSUMPTION_PERCENTAGE\" INTEGER,\"METABOLIC_COEFFICIENT\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"PERFORMANCE_INSIGHTS\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public PerformanceInsightsDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Date getKey(PerformanceInsights performanceInsights) {
        if (performanceInsights != null) {
            return performanceInsights.getDate();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PerformanceInsights performanceInsights) {
        return performanceInsights.getDate() != null;
    }

    @Override // org.greenrobot.greendao.a
    public Date readKey(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return new Date(cursor.getLong(i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final Date updateKeyAfterInsert(PerformanceInsights performanceInsights, long j8) {
        return performanceInsights.getDate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, PerformanceInsights performanceInsights) {
        cVar.clearBindings();
        Date date = performanceInsights.getDate();
        if (date != null) {
            cVar.bindLong(1, date.getTime());
        }
        Date updateDate = performanceInsights.getUpdateDate();
        if (updateDate != null) {
            cVar.bindLong(2, updateDate.getTime());
        }
        if (performanceInsights.getMaxOxygenIntake() != null) {
            cVar.bindDouble(3, r0.floatValue());
        }
        if (performanceInsights.getLactateSpeed() != null) {
            cVar.bindDouble(4, r0.floatValue());
        }
        if (performanceInsights.getLactateHeartRate() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (performanceInsights.getAge() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (performanceInsights.getAgeEvaluationCoefficient() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        if (performanceInsights.getCurrentLoad() != null) {
            cVar.bindLong(8, r0.intValue());
        }
        if (performanceInsights.getShortTermLoad() != null) {
            cVar.bindLong(9, r0.intValue());
        }
        if (performanceInsights.getLongTermLoad() != null) {
            cVar.bindLong(10, r0.intValue());
        }
        if (performanceInsights.getTrainingLoadLevel() != null) {
            cVar.bindLong(11, r0.intValue());
        }
        if (performanceInsights.getTrainingLoadFactor() != null) {
            cVar.bindDouble(12, r0.floatValue());
        }
        if (performanceInsights.getRecoveryTime() != null) {
            cVar.bindLong(13, r0.intValue());
        }
        if (performanceInsights.getTrainingEndTime() != null) {
            cVar.bindLong(14, r0.intValue());
        }
        if (performanceInsights.getCarbohydrateConsumptionPercentage() != null) {
            cVar.bindLong(15, r0.intValue());
        }
        if (performanceInsights.getFatConsumptionPercentage() != null) {
            cVar.bindLong(16, r0.intValue());
        }
        if (performanceInsights.getMetabolicCoefficient() != null) {
            cVar.bindLong(17, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public PerformanceInsights readEntity(Cursor cursor, int i8) {
        Date date = cursor.isNull(i8) ? null : new Date(cursor.getLong(i8));
        int i9 = i8 + 1;
        Date date2 = cursor.isNull(i9) ? null : new Date(cursor.getLong(i9));
        int i10 = i8 + 2;
        Float valueOf = cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10));
        int i11 = i8 + 3;
        Float valueOf2 = cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11));
        int i12 = i8 + 4;
        Integer valueOf3 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        Integer valueOf4 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 6;
        Integer valueOf5 = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i8 + 7;
        Integer valueOf6 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i8 + 8;
        Integer valueOf7 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i8 + 9;
        Integer valueOf8 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i8 + 10;
        Integer valueOf9 = cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18));
        int i19 = i8 + 11;
        Float valueOf10 = cursor.isNull(i19) ? null : Float.valueOf(cursor.getFloat(i19));
        int i20 = i8 + 12;
        Integer valueOf11 = cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20));
        int i21 = i8 + 13;
        Integer valueOf12 = cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21));
        int i22 = i8 + 14;
        Integer valueOf13 = cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22));
        int i23 = i8 + 15;
        Integer valueOf14 = cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23));
        int i24 = i8 + 16;
        return new PerformanceInsights(date, date2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PerformanceInsights performanceInsights, int i8) {
        performanceInsights.setDate(cursor.isNull(i8) ? null : new Date(cursor.getLong(i8)));
        int i9 = i8 + 1;
        performanceInsights.setUpdateDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        performanceInsights.setMaxOxygenIntake(cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)));
        int i11 = i8 + 3;
        performanceInsights.setLactateSpeed(cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11)));
        int i12 = i8 + 4;
        performanceInsights.setLactateHeartRate(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        performanceInsights.setAge(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        performanceInsights.setAgeEvaluationCoefficient(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 7;
        performanceInsights.setCurrentLoad(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i8 + 8;
        performanceInsights.setShortTermLoad(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i8 + 9;
        performanceInsights.setLongTermLoad(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i8 + 10;
        performanceInsights.setTrainingLoadLevel(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i8 + 11;
        performanceInsights.setTrainingLoadFactor(cursor.isNull(i19) ? null : Float.valueOf(cursor.getFloat(i19)));
        int i20 = i8 + 12;
        performanceInsights.setRecoveryTime(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i8 + 13;
        performanceInsights.setTrainingEndTime(cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
        int i22 = i8 + 14;
        performanceInsights.setCarbohydrateConsumptionPercentage(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
        int i23 = i8 + 15;
        performanceInsights.setFatConsumptionPercentage(cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23)));
        int i24 = i8 + 16;
        performanceInsights.setMetabolicCoefficient(cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PerformanceInsights performanceInsights) {
        sQLiteStatement.clearBindings();
        Date date = performanceInsights.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(1, date.getTime());
        }
        Date updateDate = performanceInsights.getUpdateDate();
        if (updateDate != null) {
            sQLiteStatement.bindLong(2, updateDate.getTime());
        }
        if (performanceInsights.getMaxOxygenIntake() != null) {
            sQLiteStatement.bindDouble(3, r0.floatValue());
        }
        if (performanceInsights.getLactateSpeed() != null) {
            sQLiteStatement.bindDouble(4, r0.floatValue());
        }
        if (performanceInsights.getLactateHeartRate() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (performanceInsights.getAge() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (performanceInsights.getAgeEvaluationCoefficient() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        if (performanceInsights.getCurrentLoad() != null) {
            sQLiteStatement.bindLong(8, r0.intValue());
        }
        if (performanceInsights.getShortTermLoad() != null) {
            sQLiteStatement.bindLong(9, r0.intValue());
        }
        if (performanceInsights.getLongTermLoad() != null) {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (performanceInsights.getTrainingLoadLevel() != null) {
            sQLiteStatement.bindLong(11, r0.intValue());
        }
        if (performanceInsights.getTrainingLoadFactor() != null) {
            sQLiteStatement.bindDouble(12, r0.floatValue());
        }
        if (performanceInsights.getRecoveryTime() != null) {
            sQLiteStatement.bindLong(13, r0.intValue());
        }
        if (performanceInsights.getTrainingEndTime() != null) {
            sQLiteStatement.bindLong(14, r0.intValue());
        }
        if (performanceInsights.getCarbohydrateConsumptionPercentage() != null) {
            sQLiteStatement.bindLong(15, r0.intValue());
        }
        if (performanceInsights.getFatConsumptionPercentage() != null) {
            sQLiteStatement.bindLong(16, r0.intValue());
        }
        if (performanceInsights.getMetabolicCoefficient() != null) {
            sQLiteStatement.bindLong(17, r6.intValue());
        }
    }
}
