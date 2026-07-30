package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Hrv;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class HrvDao extends a {
    public static final String TABLENAME = "HRV";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f Hrv = new f(2, Integer.class, "hrv", false, HrvDao.TABLENAME);
    }

    public HrvDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"HRV\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"HRV\" INTEGER NOT NULL );");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"HRV\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public HrvDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Hrv hrv) {
        if (hrv != null) {
            return hrv.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Hrv hrv) {
        return hrv.getId() != null;
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
    public final Long updateKeyAfterInsert(Hrv hrv, long j8) {
        hrv.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Hrv hrv) {
        cVar.clearBindings();
        Long id = hrv.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = hrv.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        cVar.bindLong(3, hrv.getHrv().intValue());
    }

    @Override // org.greenrobot.greendao.a
    public Hrv readEntity(Cursor cursor, int i8) {
        int i9 = i8 + 1;
        return new Hrv(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)), cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)), Integer.valueOf(cursor.getInt(i8 + 2)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Hrv hrv, int i8) {
        hrv.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        hrv.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        hrv.setHrv(Integer.valueOf(cursor.getInt(i8 + 2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Hrv hrv) {
        sQLiteStatement.clearBindings();
        Long id = hrv.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = hrv.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        sQLiteStatement.bindLong(3, hrv.getHrv().intValue());
    }
}
