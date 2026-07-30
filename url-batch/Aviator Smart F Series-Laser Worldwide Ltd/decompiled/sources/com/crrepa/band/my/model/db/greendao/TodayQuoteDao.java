package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.TodayQuote;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class TodayQuoteDao extends a {
    public static final String TABLENAME = "TODAY_QUOTE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f Queue = new f(2, String.class, "queue", false, "QUEUE");
    }

    public TodayQuoteDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"TODAY_QUOTE\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"QUEUE\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"TODAY_QUOTE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public TodayQuoteDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(TodayQuote todayQuote) {
        if (todayQuote != null) {
            return todayQuote.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(TodayQuote todayQuote) {
        return todayQuote.getId() != null;
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
    public final Long updateKeyAfterInsert(TodayQuote todayQuote, long j8) {
        todayQuote.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, TodayQuote todayQuote) {
        cVar.clearBindings();
        Long id = todayQuote.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = todayQuote.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        String queue = todayQuote.getQueue();
        if (queue != null) {
            cVar.bindString(3, queue);
        }
    }

    @Override // org.greenrobot.greendao.a
    public TodayQuote readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        return new TodayQuote(valueOf, cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)), cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, TodayQuote todayQuote, int i8) {
        todayQuote.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        todayQuote.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        todayQuote.setQueue(cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, TodayQuote todayQuote) {
        sQLiteStatement.clearBindings();
        Long id = todayQuote.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = todayQuote.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        String queue = todayQuote.getQueue();
        if (queue != null) {
            sQLiteStatement.bindString(3, queue);
        }
    }
}
