package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Sleep;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class SleepDao extends a {
    public static final String TABLENAME = "SLEEP";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Deep = new f(1, Integer.class, "deep", false, "DEEP");
        public static final f Shallow = new f(2, Integer.class, "shallow", false, "SHALLOW");
        public static final f Sober = new f(3, Integer.class, "sober", false, "SOBER");
        public static final f Rem = new f(4, Integer.class, "rem", false, "REM");
        public static final f Detail = new f(5, String.class, "detail", false, "DETAIL");
        public static final f Completion = new f(6, Float.class, "completion", false, "COMPLETION");
        public static final f Date = new f(7, Date.class, "date", false, "DATE");
    }

    public SleepDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"SLEEP\" (\"_id\" INTEGER PRIMARY KEY ,\"DEEP\" INTEGER,\"SHALLOW\" INTEGER,\"SOBER\" INTEGER,\"REM\" INTEGER,\"DETAIL\" TEXT,\"COMPLETION\" REAL,\"DATE\" INTEGER NOT NULL );");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"SLEEP\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public SleepDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Sleep sleep) {
        if (sleep != null) {
            return sleep.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Sleep sleep) {
        return sleep.getId() != null;
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
    public final Long updateKeyAfterInsert(Sleep sleep, long j8) {
        sleep.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Sleep sleep) {
        cVar.clearBindings();
        Long id = sleep.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (sleep.getDeep() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        if (sleep.getShallow() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        if (sleep.getSober() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (sleep.getRem() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        String detail = sleep.getDetail();
        if (detail != null) {
            cVar.bindString(6, detail);
        }
        if (sleep.getCompletion() != null) {
            cVar.bindDouble(7, r0.floatValue());
        }
        cVar.bindLong(8, sleep.getDate().getTime());
    }

    @Override // org.greenrobot.greendao.a
    public Sleep readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        Integer valueOf3 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        Integer valueOf4 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 4;
        Integer valueOf5 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        String string = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i8 + 6;
        return new Sleep(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, string, cursor.isNull(i14) ? null : Float.valueOf(cursor.getFloat(i14)), new Date(cursor.getLong(i8 + 7)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Sleep sleep, int i8) {
        sleep.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        sleep.setDeep(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        sleep.setShallow(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        sleep.setSober(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        sleep.setRem(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        sleep.setDetail(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i8 + 6;
        sleep.setCompletion(cursor.isNull(i14) ? null : Float.valueOf(cursor.getFloat(i14)));
        sleep.setDate(new Date(cursor.getLong(i8 + 7)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Sleep sleep) {
        sQLiteStatement.clearBindings();
        Long id = sleep.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (sleep.getDeep() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        if (sleep.getShallow() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        if (sleep.getSober() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (sleep.getRem() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        String detail = sleep.getDetail();
        if (detail != null) {
            sQLiteStatement.bindString(6, detail);
        }
        if (sleep.getCompletion() != null) {
            sQLiteStatement.bindDouble(7, r0.floatValue());
        }
        sQLiteStatement.bindLong(8, sleep.getDate().getTime());
    }
}
