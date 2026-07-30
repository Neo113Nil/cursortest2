package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.TimingTemp;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class TimingTempDao extends a {
    public static final String TABLENAME = "TIMING_TEMP";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f TempStr = new f(2, String.class, "tempStr", false, "TEMP_STR");
        public static final f Average = new f(3, Float.class, "average", false, "AVERAGE");
        public static final f Max = new f(4, Float.class, "max", false, "MAX");
        public static final f Min = new f(5, Float.class, "min", false, "MIN");
    }

    public TimingTempDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"TIMING_TEMP\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"TEMP_STR\" TEXT,\"AVERAGE\" REAL,\"MAX\" REAL,\"MIN\" REAL);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"TIMING_TEMP\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public TimingTempDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(TimingTemp timingTemp) {
        if (timingTemp != null) {
            return timingTemp.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(TimingTemp timingTemp) {
        return timingTemp.getId() != null;
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
    public final Long updateKeyAfterInsert(TimingTemp timingTemp, long j8) {
        timingTemp.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, TimingTemp timingTemp) {
        cVar.clearBindings();
        Long id = timingTemp.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = timingTemp.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        String tempStr = timingTemp.getTempStr();
        if (tempStr != null) {
            cVar.bindString(3, tempStr);
        }
        if (timingTemp.getAverage() != null) {
            cVar.bindDouble(4, r0.floatValue());
        }
        if (timingTemp.getMax() != null) {
            cVar.bindDouble(5, r0.floatValue());
        }
        if (timingTemp.getMin() != null) {
            cVar.bindDouble(6, r6.floatValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public TimingTemp readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Date date = cursor.isNull(i9) ? null : new Date(cursor.getLong(i9));
        int i10 = i8 + 2;
        String string = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        Float valueOf2 = cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11));
        int i12 = i8 + 4;
        int i13 = i8 + 5;
        return new TimingTemp(valueOf, date, string, valueOf2, cursor.isNull(i12) ? null : Float.valueOf(cursor.getFloat(i12)), cursor.isNull(i13) ? null : Float.valueOf(cursor.getFloat(i13)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, TimingTemp timingTemp, int i8) {
        timingTemp.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        timingTemp.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        timingTemp.setTempStr(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        timingTemp.setAverage(cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11)));
        int i12 = i8 + 4;
        timingTemp.setMax(cursor.isNull(i12) ? null : Float.valueOf(cursor.getFloat(i12)));
        int i13 = i8 + 5;
        timingTemp.setMin(cursor.isNull(i13) ? null : Float.valueOf(cursor.getFloat(i13)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, TimingTemp timingTemp) {
        sQLiteStatement.clearBindings();
        Long id = timingTemp.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = timingTemp.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        String tempStr = timingTemp.getTempStr();
        if (tempStr != null) {
            sQLiteStatement.bindString(3, tempStr);
        }
        if (timingTemp.getAverage() != null) {
            sQLiteStatement.bindDouble(4, r0.floatValue());
        }
        if (timingTemp.getMax() != null) {
            sQLiteStatement.bindDouble(5, r0.floatValue());
        }
        if (timingTemp.getMin() != null) {
            sQLiteStatement.bindDouble(6, r6.floatValue());
        }
    }
}
