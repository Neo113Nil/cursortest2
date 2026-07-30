package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.TimingStress;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class TimingStressDao extends a {
    public static final String TABLENAME = "TIMING_STRESS";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f Stress = new f(2, String.class, "stress", false, StressDao.TABLENAME);
        public static final f Average = new f(3, Integer.class, "average", false, "AVERAGE");
        public static final f Min = new f(4, Integer.class, "min", false, "MIN");
        public static final f Max = new f(5, Integer.class, "max", false, "MAX");
    }

    public TimingStressDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"TIMING_STRESS\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"STRESS\" TEXT,\"AVERAGE\" INTEGER,\"MIN\" INTEGER,\"MAX\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"TIMING_STRESS\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public TimingStressDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(TimingStress timingStress) {
        if (timingStress != null) {
            return timingStress.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(TimingStress timingStress) {
        return timingStress.getId() != null;
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
    public final Long updateKeyAfterInsert(TimingStress timingStress, long j8) {
        timingStress.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, TimingStress timingStress) {
        cVar.clearBindings();
        Long id = timingStress.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = timingStress.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        String stress = timingStress.getStress();
        if (stress != null) {
            cVar.bindString(3, stress);
        }
        if (timingStress.getAverage() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (timingStress.getMin() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (timingStress.getMax() != null) {
            cVar.bindLong(6, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public TimingStress readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Date date = cursor.isNull(i9) ? null : new Date(cursor.getLong(i9));
        int i10 = i8 + 2;
        String string = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        Integer valueOf2 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 4;
        int i13 = i8 + 5;
        return new TimingStress(valueOf, date, string, valueOf2, cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, TimingStress timingStress, int i8) {
        timingStress.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        timingStress.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        timingStress.setStress(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        timingStress.setAverage(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        timingStress.setMin(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        timingStress.setMax(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, TimingStress timingStress) {
        sQLiteStatement.clearBindings();
        Long id = timingStress.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = timingStress.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        String stress = timingStress.getStress();
        if (stress != null) {
            sQLiteStatement.bindString(3, stress);
        }
        if (timingStress.getAverage() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (timingStress.getMin() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (timingStress.getMax() != null) {
            sQLiteStatement.bindLong(6, r6.intValue());
        }
    }
}
