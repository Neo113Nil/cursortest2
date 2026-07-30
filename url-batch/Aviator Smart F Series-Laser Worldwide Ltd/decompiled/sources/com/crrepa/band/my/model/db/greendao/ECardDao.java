package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.ECard;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class ECardDao extends a {
    public static final String TABLENAME = "ECARD";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Index = new f(1, Integer.class, "index", false, "INDEX");
        public static final f Title = new f(2, String.class, "title", false, "TITLE");
        public static final f Url = new f(3, String.class, "url", false, "URL");
    }

    public ECardDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"ECARD\" (\"_id\" INTEGER PRIMARY KEY ,\"INDEX\" INTEGER,\"TITLE\" TEXT,\"URL\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"ECARD\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public ECardDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(ECard eCard) {
        if (eCard != null) {
            return eCard.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ECard eCard) {
        return eCard.getId() != null;
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
    public final Long updateKeyAfterInsert(ECard eCard, long j8) {
        eCard.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, ECard eCard) {
        cVar.clearBindings();
        Long id = eCard.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (eCard.getIndex() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        String title = eCard.getTitle();
        if (title != null) {
            cVar.bindString(3, title);
        }
        String url = eCard.getUrl();
        if (url != null) {
            cVar.bindString(4, url);
        }
    }

    @Override // org.greenrobot.greendao.a
    public ECard readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = i8 + 3;
        return new ECard(valueOf, cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)), cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ECard eCard, int i8) {
        eCard.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        eCard.setIndex(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        eCard.setTitle(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        eCard.setUrl(cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ECard eCard) {
        sQLiteStatement.clearBindings();
        Long id = eCard.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (eCard.getIndex() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        String title = eCard.getTitle();
        if (title != null) {
            sQLiteStatement.bindString(3, title);
        }
        String url = eCard.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(4, url);
        }
    }
}
