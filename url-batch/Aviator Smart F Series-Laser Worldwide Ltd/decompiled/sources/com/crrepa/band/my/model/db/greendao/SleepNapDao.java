package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.SleepNap;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class SleepNapDao extends a {
    public static final String TABLENAME = "SLEEP_NAP";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f NapListJson = new f(1, String.class, "napListJson", false, "NAP_LIST_JSON");
        public static final f Date = new f(2, Date.class, "date", false, "DATE");
    }

    public SleepNapDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"SLEEP_NAP\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"NAP_LIST_JSON\" TEXT,\"DATE\" INTEGER NOT NULL );");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"SLEEP_NAP\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public SleepNapDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(SleepNap sleepNap) {
        if (sleepNap != null) {
            return sleepNap.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(SleepNap sleepNap) {
        return sleepNap.getId() != null;
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
    public final Long updateKeyAfterInsert(SleepNap sleepNap, long j8) {
        sleepNap.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, SleepNap sleepNap) {
        cVar.clearBindings();
        Long id = sleepNap.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String napListJson = sleepNap.getNapListJson();
        if (napListJson != null) {
            cVar.bindString(2, napListJson);
        }
        cVar.bindLong(3, sleepNap.getDate().getTime());
    }

    @Override // org.greenrobot.greendao.a
    public SleepNap readEntity(Cursor cursor, int i8) {
        int i9 = i8 + 1;
        return new SleepNap(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)), cursor.isNull(i9) ? null : cursor.getString(i9), new Date(cursor.getLong(i8 + 2)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, SleepNap sleepNap, int i8) {
        sleepNap.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        sleepNap.setNapListJson(cursor.isNull(i9) ? null : cursor.getString(i9));
        sleepNap.setDate(new Date(cursor.getLong(i8 + 2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, SleepNap sleepNap) {
        sQLiteStatement.clearBindings();
        Long id = sleepNap.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String napListJson = sleepNap.getNapListJson();
        if (napListJson != null) {
            sQLiteStatement.bindString(2, napListJson);
        }
        sQLiteStatement.bindLong(3, sleepNap.getDate().getTime());
    }
}
