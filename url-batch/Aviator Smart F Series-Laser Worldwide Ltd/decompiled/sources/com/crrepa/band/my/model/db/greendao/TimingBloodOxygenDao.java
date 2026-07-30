package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class TimingBloodOxygenDao extends a {
    public static final String TABLENAME = "TIMING_BLOOD_OXYGEN";

    public static class Properties {
        public static final f Average;
        public static final f Max;
        public static final f Min;
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f BloodOxygen = new f(2, String.class, "bloodOxygen", false, BloodOxygenDao.TABLENAME);

        static {
            Class cls = Integer.TYPE;
            Average = new f(3, cls, "average", false, "AVERAGE");
            Min = new f(4, cls, "min", false, "MIN");
            Max = new f(5, cls, "max", false, "MAX");
        }
    }

    public TimingBloodOxygenDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"TIMING_BLOOD_OXYGEN\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"BLOOD_OXYGEN\" TEXT,\"AVERAGE\" INTEGER NOT NULL ,\"MIN\" INTEGER NOT NULL ,\"MAX\" INTEGER NOT NULL );");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"TIMING_BLOOD_OXYGEN\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public TimingBloodOxygenDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(TimingBloodOxygen timingBloodOxygen) {
        if (timingBloodOxygen != null) {
            return timingBloodOxygen.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(TimingBloodOxygen timingBloodOxygen) {
        return timingBloodOxygen.getId() != null;
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
    public final Long updateKeyAfterInsert(TimingBloodOxygen timingBloodOxygen, long j8) {
        timingBloodOxygen.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, TimingBloodOxygen timingBloodOxygen) {
        cVar.clearBindings();
        Long id = timingBloodOxygen.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = timingBloodOxygen.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        String bloodOxygen = timingBloodOxygen.getBloodOxygen();
        if (bloodOxygen != null) {
            cVar.bindString(3, bloodOxygen);
        }
        cVar.bindLong(4, timingBloodOxygen.getAverage());
        cVar.bindLong(5, timingBloodOxygen.getMin());
        cVar.bindLong(6, timingBloodOxygen.getMax());
    }

    @Override // org.greenrobot.greendao.a
    public TimingBloodOxygen readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Date date = cursor.isNull(i9) ? null : new Date(cursor.getLong(i9));
        int i10 = i8 + 2;
        return new TimingBloodOxygen(valueOf, date, cursor.isNull(i10) ? null : cursor.getString(i10), cursor.getInt(i8 + 3), cursor.getInt(i8 + 4), cursor.getInt(i8 + 5));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, TimingBloodOxygen timingBloodOxygen, int i8) {
        timingBloodOxygen.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        timingBloodOxygen.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        timingBloodOxygen.setBloodOxygen(cursor.isNull(i10) ? null : cursor.getString(i10));
        timingBloodOxygen.setAverage(cursor.getInt(i8 + 3));
        timingBloodOxygen.setMin(cursor.getInt(i8 + 4));
        timingBloodOxygen.setMax(cursor.getInt(i8 + 5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, TimingBloodOxygen timingBloodOxygen) {
        sQLiteStatement.clearBindings();
        Long id = timingBloodOxygen.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = timingBloodOxygen.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        String bloodOxygen = timingBloodOxygen.getBloodOxygen();
        if (bloodOxygen != null) {
            sQLiteStatement.bindString(3, bloodOxygen);
        }
        sQLiteStatement.bindLong(4, timingBloodOxygen.getAverage());
        sQLiteStatement.bindLong(5, timingBloodOxygen.getMin());
        sQLiteStatement.bindLong(6, timingBloodOxygen.getMax());
    }
}
