package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.OnceTemp;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class OnceTempDao extends a {
    public static final String TABLENAME = "ONCE_TEMP";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f Temp = new f(2, Float.class, "temp", false, "TEMP");
    }

    public OnceTempDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"ONCE_TEMP\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"TEMP\" REAL);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"ONCE_TEMP\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public OnceTempDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(OnceTemp onceTemp) {
        if (onceTemp != null) {
            return onceTemp.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(OnceTemp onceTemp) {
        return onceTemp.getId() != null;
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
    public final Long updateKeyAfterInsert(OnceTemp onceTemp, long j8) {
        onceTemp.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, OnceTemp onceTemp) {
        cVar.clearBindings();
        Long id = onceTemp.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = onceTemp.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        if (onceTemp.getTemp() != null) {
            cVar.bindDouble(3, r6.floatValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public OnceTemp readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        return new OnceTemp(valueOf, cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)), cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, OnceTemp onceTemp, int i8) {
        onceTemp.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        onceTemp.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        onceTemp.setTemp(cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, OnceTemp onceTemp) {
        sQLiteStatement.clearBindings();
        Long id = onceTemp.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = onceTemp.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        if (onceTemp.getTemp() != null) {
            sQLiteStatement.bindDouble(3, r6.floatValue());
        }
    }
}
