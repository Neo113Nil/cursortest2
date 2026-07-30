package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Water;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class WaterDao extends a {
    public static final String TABLENAME = "WATER";

    public static class Properties {
        public static final f Date;
        public static final f GoalMl;
        public static final f GoalOz;
        public static final f Grade;
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f IntakeMl;
        public static final f IntakeOz;
        public static final f IsGoal;
        public static final f Percentage;
        public static final f SportTime;
        public static final f TotalIntakeMl;
        public static final f TotalIntakeOz;
        public static final f Type;
        public static final f WaterId;
        public static final f Weight;

        static {
            Class cls = Integer.TYPE;
            WaterId = new f(1, cls, "waterId", false, "WATER_ID");
            Type = new f(2, cls, "type", false, "TYPE");
            Date = new f(3, Date.class, "date", false, "DATE");
            IntakeMl = new f(4, Integer.class, "intakeMl", false, "INTAKE_ML");
            IntakeOz = new f(5, Integer.class, "intakeOz", false, "INTAKE_OZ");
            IsGoal = new f(6, Boolean.TYPE, "isGoal", false, "IS_GOAL");
            GoalMl = new f(7, Integer.class, "goalMl", false, "GOAL_ML");
            GoalOz = new f(8, Integer.class, "goalOz", false, "GOAL_OZ");
            TotalIntakeMl = new f(9, Integer.class, "totalIntakeMl", false, "TOTAL_INTAKE_ML");
            TotalIntakeOz = new f(10, Integer.class, "totalIntakeOz", false, "TOTAL_INTAKE_OZ");
            SportTime = new f(11, Float.class, "sportTime", false, "SPORT_TIME");
            Weight = new f(12, Float.class, "weight", false, WeightDao.TABLENAME);
            Percentage = new f(13, Integer.class, "percentage", false, "PERCENTAGE");
            Grade = new f(14, Integer.class, "grade", false, "GRADE");
        }
    }

    public WaterDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"WATER\" (\"_id\" INTEGER PRIMARY KEY ,\"WATER_ID\" INTEGER NOT NULL ,\"TYPE\" INTEGER NOT NULL ,\"DATE\" INTEGER,\"INTAKE_ML\" INTEGER,\"INTAKE_OZ\" INTEGER,\"IS_GOAL\" INTEGER NOT NULL ,\"GOAL_ML\" INTEGER,\"GOAL_OZ\" INTEGER,\"TOTAL_INTAKE_ML\" INTEGER,\"TOTAL_INTAKE_OZ\" INTEGER,\"SPORT_TIME\" REAL,\"WEIGHT\" REAL,\"PERCENTAGE\" INTEGER,\"GRADE\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"WATER\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public WaterDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Water water) {
        if (water != null) {
            return water.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Water water) {
        return water.getId() != null;
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
    public final Long updateKeyAfterInsert(Water water, long j8) {
        water.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Water water) {
        cVar.clearBindings();
        Long id = water.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        cVar.bindLong(2, water.getWaterId());
        cVar.bindLong(3, water.getType());
        Date date = water.getDate();
        if (date != null) {
            cVar.bindLong(4, date.getTime());
        }
        if (water.getIntakeMl() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (water.getIntakeOz() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        cVar.bindLong(7, water.getIsGoal() ? 1L : 0L);
        if (water.getGoalMl() != null) {
            cVar.bindLong(8, r0.intValue());
        }
        if (water.getGoalOz() != null) {
            cVar.bindLong(9, r0.intValue());
        }
        if (water.getTotalIntakeMl() != null) {
            cVar.bindLong(10, r0.intValue());
        }
        if (water.getTotalIntakeOz() != null) {
            cVar.bindLong(11, r0.intValue());
        }
        if (water.getSportTime() != null) {
            cVar.bindDouble(12, r0.floatValue());
        }
        if (water.getWeight() != null) {
            cVar.bindDouble(13, r0.floatValue());
        }
        if (water.getPercentage() != null) {
            cVar.bindLong(14, r0.intValue());
        }
        if (water.getGrade() != null) {
            cVar.bindLong(15, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public Water readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = cursor.getInt(i8 + 1);
        int i10 = cursor.getInt(i8 + 2);
        int i11 = i8 + 3;
        Date date = cursor.isNull(i11) ? null : new Date(cursor.getLong(i11));
        int i12 = i8 + 4;
        int i13 = i8 + 5;
        int i14 = i8 + 7;
        int i15 = i8 + 8;
        int i16 = i8 + 9;
        int i17 = i8 + 10;
        int i18 = i8 + 11;
        int i19 = i8 + 12;
        int i20 = i8 + 13;
        int i21 = i8 + 14;
        return new Water(valueOf, i9, i10, date, cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)), cursor.getShort(i8 + 6) != 0, cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)), cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)), cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)), cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)), cursor.isNull(i18) ? null : Float.valueOf(cursor.getFloat(i18)), cursor.isNull(i19) ? null : Float.valueOf(cursor.getFloat(i19)), cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)), cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Water water, int i8) {
        water.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        water.setWaterId(cursor.getInt(i8 + 1));
        water.setType(cursor.getInt(i8 + 2));
        int i9 = i8 + 3;
        water.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 4;
        water.setIntakeMl(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 5;
        water.setIntakeOz(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        water.setIsGoal(cursor.getShort(i8 + 6) != 0);
        int i12 = i8 + 7;
        water.setGoalMl(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 8;
        water.setGoalOz(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 9;
        water.setTotalIntakeMl(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 10;
        water.setTotalIntakeOz(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i8 + 11;
        water.setSportTime(cursor.isNull(i16) ? null : Float.valueOf(cursor.getFloat(i16)));
        int i17 = i8 + 12;
        water.setWeight(cursor.isNull(i17) ? null : Float.valueOf(cursor.getFloat(i17)));
        int i18 = i8 + 13;
        water.setPercentage(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i8 + 14;
        water.setGrade(cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Water water) {
        sQLiteStatement.clearBindings();
        Long id = water.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        sQLiteStatement.bindLong(2, water.getWaterId());
        sQLiteStatement.bindLong(3, water.getType());
        Date date = water.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(4, date.getTime());
        }
        if (water.getIntakeMl() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (water.getIntakeOz() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        sQLiteStatement.bindLong(7, water.getIsGoal() ? 1L : 0L);
        if (water.getGoalMl() != null) {
            sQLiteStatement.bindLong(8, r0.intValue());
        }
        if (water.getGoalOz() != null) {
            sQLiteStatement.bindLong(9, r0.intValue());
        }
        if (water.getTotalIntakeMl() != null) {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (water.getTotalIntakeOz() != null) {
            sQLiteStatement.bindLong(11, r0.intValue());
        }
        if (water.getSportTime() != null) {
            sQLiteStatement.bindDouble(12, r0.floatValue());
        }
        if (water.getWeight() != null) {
            sQLiteStatement.bindDouble(13, r0.floatValue());
        }
        if (water.getPercentage() != null) {
            sQLiteStatement.bindLong(14, r0.intValue());
        }
        if (water.getGrade() != null) {
            sQLiteStatement.bindLong(15, r6.intValue());
        }
    }
}
