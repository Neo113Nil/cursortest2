package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.GoalsSetting;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class GoalsSettingDao extends a {
    public static final String TABLENAME = "GOALS_SETTING";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f DailySteps = new f(1, Integer.class, "dailySteps", false, "DAILY_STEPS");
        public static final f DailyCalories = new f(2, Integer.class, "dailyCalories", false, "DAILY_CALORIES");
        public static final f DailyMinutes = new f(3, Integer.class, "dailyMinutes", false, "DAILY_MINUTES");
        public static final f TrainingDayEnable = new f(4, Boolean.class, "trainingDayEnable", false, "TRAINING_DAY_ENABLE");
        public static final f TrainingSteps = new f(5, Integer.class, "trainingSteps", false, "TRAINING_STEPS");
        public static final f TrainingCalories = new f(6, Integer.class, "trainingCalories", false, "TRAINING_CALORIES");
        public static final f TrainingMinutes = new f(7, Integer.class, "trainingMinutes", false, "TRAINING_MINUTES");
        public static final f TrainingDays = new f(8, Integer.class, "trainingDays", false, "TRAINING_DAYS");
    }

    public GoalsSettingDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"GOALS_SETTING\" (\"_id\" INTEGER PRIMARY KEY ,\"DAILY_STEPS\" INTEGER,\"DAILY_CALORIES\" INTEGER,\"DAILY_MINUTES\" INTEGER,\"TRAINING_DAY_ENABLE\" INTEGER,\"TRAINING_STEPS\" INTEGER,\"TRAINING_CALORIES\" INTEGER,\"TRAINING_MINUTES\" INTEGER,\"TRAINING_DAYS\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"GOALS_SETTING\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public GoalsSettingDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(GoalsSetting goalsSetting) {
        if (goalsSetting != null) {
            return goalsSetting.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(GoalsSetting goalsSetting) {
        return goalsSetting.getId() != null;
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
    public final Long updateKeyAfterInsert(GoalsSetting goalsSetting, long j8) {
        goalsSetting.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, GoalsSetting goalsSetting) {
        cVar.clearBindings();
        Long id = goalsSetting.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (goalsSetting.getDailySteps() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        if (goalsSetting.getDailyCalories() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        if (goalsSetting.getDailyMinutes() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        Boolean trainingDayEnable = goalsSetting.getTrainingDayEnable();
        if (trainingDayEnable != null) {
            cVar.bindLong(5, trainingDayEnable.booleanValue() ? 1L : 0L);
        }
        if (goalsSetting.getTrainingSteps() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (goalsSetting.getTrainingCalories() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        if (goalsSetting.getTrainingMinutes() != null) {
            cVar.bindLong(8, r0.intValue());
        }
        if (goalsSetting.getTrainingDays() != null) {
            cVar.bindLong(9, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public GoalsSetting readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf3 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        Integer valueOf4 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        Integer valueOf5 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 4;
        if (cursor.isNull(i12)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        int i13 = i8 + 5;
        Integer valueOf6 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 6;
        Integer valueOf7 = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i8 + 7;
        int i16 = i8 + 8;
        return new GoalsSetting(valueOf2, valueOf3, valueOf4, valueOf5, valueOf, valueOf6, valueOf7, cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)), cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, GoalsSetting goalsSetting, int i8) {
        Boolean valueOf;
        goalsSetting.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        goalsSetting.setDailySteps(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        goalsSetting.setDailyCalories(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        goalsSetting.setDailyMinutes(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        if (cursor.isNull(i12)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        goalsSetting.setTrainingDayEnable(valueOf);
        int i13 = i8 + 5;
        goalsSetting.setTrainingSteps(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        goalsSetting.setTrainingCalories(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 7;
        goalsSetting.setTrainingMinutes(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i8 + 8;
        goalsSetting.setTrainingDays(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, GoalsSetting goalsSetting) {
        sQLiteStatement.clearBindings();
        Long id = goalsSetting.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (goalsSetting.getDailySteps() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        if (goalsSetting.getDailyCalories() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        if (goalsSetting.getDailyMinutes() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        Boolean trainingDayEnable = goalsSetting.getTrainingDayEnable();
        if (trainingDayEnable != null) {
            sQLiteStatement.bindLong(5, trainingDayEnable.booleanValue() ? 1L : 0L);
        }
        if (goalsSetting.getTrainingSteps() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (goalsSetting.getTrainingCalories() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        if (goalsSetting.getTrainingMinutes() != null) {
            sQLiteStatement.bindLong(8, r0.intValue());
        }
        if (goalsSetting.getTrainingDays() != null) {
            sQLiteStatement.bindLong(9, r6.intValue());
        }
    }
}
