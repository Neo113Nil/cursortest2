package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Step;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class StepDao extends a {
    public static final String TABLENAME = "SPORT";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Steps = new f(1, Integer.class, "steps", false, "STEPS");
        public static final f Calory = new f(2, Float.class, "calory", false, "CALORY");
        public static final f Distance = new f(3, Float.class, "distance", false, "DISTANCE");
        public static final f Time = new f(4, Integer.class, "time", false, "TIME");
        public static final f Compliance = new f(5, Boolean.class, "compliance", false, "COMPLIANCE");
        public static final f Completion = new f(6, Float.class, "completion", false, "COMPLETION");
        public static final f Date = new f(7, Date.class, "date", false, "DATE");
        public static final f StepsCategory = new f(8, String.class, "stepsCategory", false, "STEPS_CATEGORY");
        public static final f TimeInterval = new f(9, Integer.TYPE, "timeInterval", false, "TIME_INTERVAL");
    }

    public StepDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"SPORT\" (\"_id\" INTEGER PRIMARY KEY ,\"STEPS\" INTEGER,\"CALORY\" REAL,\"DISTANCE\" REAL,\"TIME\" INTEGER,\"COMPLIANCE\" INTEGER,\"COMPLETION\" REAL,\"DATE\" INTEGER NOT NULL ,\"STEPS_CATEGORY\" TEXT,\"TIME_INTERVAL\" INTEGER NOT NULL );");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"SPORT\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public StepDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Step step) {
        if (step != null) {
            return step.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Step step) {
        return step.getId() != null;
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
    public final Long updateKeyAfterInsert(Step step, long j8) {
        step.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Step step) {
        cVar.clearBindings();
        Long id = step.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (step.getSteps() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        if (step.getCalory() != null) {
            cVar.bindDouble(3, r0.floatValue());
        }
        if (step.getDistance() != null) {
            cVar.bindDouble(4, r0.floatValue());
        }
        if (step.getTime() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        Boolean compliance = step.getCompliance();
        if (compliance != null) {
            cVar.bindLong(6, compliance.booleanValue() ? 1L : 0L);
        }
        if (step.getCompletion() != null) {
            cVar.bindDouble(7, r0.floatValue());
        }
        cVar.bindLong(8, step.getDate().getTime());
        String stepsCategory = step.getStepsCategory();
        if (stepsCategory != null) {
            cVar.bindString(9, stepsCategory);
        }
        cVar.bindLong(10, step.getTimeInterval());
    }

    @Override // org.greenrobot.greendao.a
    public Step readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf3 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        Float valueOf4 = cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10));
        int i11 = i8 + 3;
        Float valueOf5 = cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11));
        int i12 = i8 + 4;
        Integer valueOf6 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        if (cursor.isNull(i13)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        int i14 = i8 + 6;
        int i15 = i8 + 8;
        return new Step(valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf, cursor.isNull(i14) ? null : Float.valueOf(cursor.getFloat(i14)), new Date(cursor.getLong(i8 + 7)), cursor.isNull(i15) ? null : cursor.getString(i15), cursor.getInt(i8 + 9));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Step step, int i8) {
        Boolean valueOf;
        step.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        step.setSteps(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        step.setCalory(cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)));
        int i11 = i8 + 3;
        step.setDistance(cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11)));
        int i12 = i8 + 4;
        step.setTime(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        if (cursor.isNull(i13)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        step.setCompliance(valueOf);
        int i14 = i8 + 6;
        step.setCompletion(cursor.isNull(i14) ? null : Float.valueOf(cursor.getFloat(i14)));
        step.setDate(new Date(cursor.getLong(i8 + 7)));
        int i15 = i8 + 8;
        step.setStepsCategory(cursor.isNull(i15) ? null : cursor.getString(i15));
        step.setTimeInterval(cursor.getInt(i8 + 9));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Step step) {
        sQLiteStatement.clearBindings();
        Long id = step.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (step.getSteps() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        if (step.getCalory() != null) {
            sQLiteStatement.bindDouble(3, r0.floatValue());
        }
        if (step.getDistance() != null) {
            sQLiteStatement.bindDouble(4, r0.floatValue());
        }
        if (step.getTime() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        Boolean compliance = step.getCompliance();
        if (compliance != null) {
            sQLiteStatement.bindLong(6, compliance.booleanValue() ? 1L : 0L);
        }
        if (step.getCompletion() != null) {
            sQLiteStatement.bindDouble(7, r0.floatValue());
        }
        sQLiteStatement.bindLong(8, step.getDate().getTime());
        String stepsCategory = step.getStepsCategory();
        if (stepsCategory != null) {
            sQLiteStatement.bindString(9, stepsCategory);
        }
        sQLiteStatement.bindLong(10, step.getTimeInterval());
    }
}
