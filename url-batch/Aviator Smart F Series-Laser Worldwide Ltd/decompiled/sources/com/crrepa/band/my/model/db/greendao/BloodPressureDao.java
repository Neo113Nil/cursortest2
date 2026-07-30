package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.BloodPressure;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class BloodPressureDao extends a {
    public static final String TABLENAME = "BLOOD_PRESSURE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f Hr = new f(2, Integer.class, "hr", false, "HR");
        public static final f Sbp = new f(3, Integer.class, "sbp", false, "SBP");
        public static final f Dbp = new f(4, Integer.class, "dbp", false, "DBP");
    }

    public BloodPressureDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"BLOOD_PRESSURE\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"HR\" INTEGER,\"SBP\" INTEGER,\"DBP\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"BLOOD_PRESSURE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public BloodPressureDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(BloodPressure bloodPressure) {
        if (bloodPressure != null) {
            return bloodPressure.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(BloodPressure bloodPressure) {
        return bloodPressure.getId() != null;
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
    public final Long updateKeyAfterInsert(BloodPressure bloodPressure, long j8) {
        bloodPressure.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, BloodPressure bloodPressure) {
        cVar.clearBindings();
        Long id = bloodPressure.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = bloodPressure.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        if (bloodPressure.getHr() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        if (bloodPressure.getSbp() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (bloodPressure.getDbp() != null) {
            cVar.bindLong(5, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public BloodPressure readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Date date = cursor.isNull(i9) ? null : new Date(cursor.getLong(i9));
        int i10 = i8 + 2;
        Integer valueOf2 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        int i12 = i8 + 4;
        return new BloodPressure(valueOf, date, valueOf2, cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, BloodPressure bloodPressure, int i8) {
        bloodPressure.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        bloodPressure.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        bloodPressure.setHr(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        bloodPressure.setSbp(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        bloodPressure.setDbp(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, BloodPressure bloodPressure) {
        sQLiteStatement.clearBindings();
        Long id = bloodPressure.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = bloodPressure.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        if (bloodPressure.getHr() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        if (bloodPressure.getSbp() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (bloodPressure.getDbp() != null) {
            sQLiteStatement.bindLong(5, r6.intValue());
        }
    }
}
