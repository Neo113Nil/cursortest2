package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.HeartRateWarning;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class HeartRateWarningDao extends a {
    public static final String TABLENAME = "HEART_RATE_WARNING";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Enable = new f(1, Boolean.class, "enable", false, "ENABLE");
        public static final f Hr = new f(2, Integer.class, "hr", false, "HR");
    }

    public HeartRateWarningDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"HEART_RATE_WARNING\" (\"_id\" INTEGER PRIMARY KEY ,\"ENABLE\" INTEGER,\"HR\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"HEART_RATE_WARNING\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public HeartRateWarningDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(HeartRateWarning heartRateWarning) {
        if (heartRateWarning != null) {
            return heartRateWarning.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(HeartRateWarning heartRateWarning) {
        return heartRateWarning.getId() != null;
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
    public final Long updateKeyAfterInsert(HeartRateWarning heartRateWarning, long j8) {
        heartRateWarning.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, HeartRateWarning heartRateWarning) {
        cVar.clearBindings();
        Long id = heartRateWarning.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Boolean enable = heartRateWarning.getEnable();
        if (enable != null) {
            cVar.bindLong(2, enable.booleanValue() ? 1L : 0L);
        }
        if (heartRateWarning.getHr() != null) {
            cVar.bindLong(3, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public HeartRateWarning readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        if (cursor.isNull(i9)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i8 + 2;
        return new HeartRateWarning(valueOf2, valueOf, cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, HeartRateWarning heartRateWarning, int i8) {
        Boolean valueOf;
        heartRateWarning.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        if (cursor.isNull(i9)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        heartRateWarning.setEnable(valueOf);
        int i10 = i8 + 2;
        heartRateWarning.setHr(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, HeartRateWarning heartRateWarning) {
        sQLiteStatement.clearBindings();
        Long id = heartRateWarning.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Boolean enable = heartRateWarning.getEnable();
        if (enable != null) {
            sQLiteStatement.bindLong(2, enable.booleanValue() ? 1L : 0L);
        }
        if (heartRateWarning.getHr() != null) {
            sQLiteStatement.bindLong(3, r6.intValue());
        }
    }
}
