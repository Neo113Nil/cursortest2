package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.ECardConfig;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class ECardConfigDao extends a {
    public static final String TABLENAME = "ECARD_CONFIG";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Name = new f(1, String.class, "name", false, "NAME");
        public static final f Count = new f(2, Integer.class, "count", false, "COUNT");
        public static final f UrlLimit = new f(3, Integer.class, "urlLimit", false, "URL_LIMIT");
        public static final f SavedIdList = new f(4, String.class, "savedIdList", false, "SAVED_ID_LIST");
    }

    public ECardConfigDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"ECARD_CONFIG\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"COUNT\" INTEGER,\"URL_LIMIT\" INTEGER,\"SAVED_ID_LIST\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"ECARD_CONFIG\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public ECardConfigDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(ECardConfig eCardConfig) {
        if (eCardConfig != null) {
            return eCardConfig.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ECardConfig eCardConfig) {
        return eCardConfig.getId() != null;
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
    public final Long updateKeyAfterInsert(ECardConfig eCardConfig, long j8) {
        eCardConfig.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, ECardConfig eCardConfig) {
        cVar.clearBindings();
        Long id = eCardConfig.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String name = eCardConfig.getName();
        if (name != null) {
            cVar.bindString(2, name);
        }
        if (eCardConfig.getCount() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        if (eCardConfig.getUrlLimit() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        String savedIdList = eCardConfig.getSavedIdList();
        if (savedIdList != null) {
            cVar.bindString(5, savedIdList);
        }
    }

    @Override // org.greenrobot.greendao.a
    public ECardConfig readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i8 + 2;
        Integer valueOf2 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        int i12 = i8 + 4;
        return new ECardConfig(valueOf, string, valueOf2, cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)), cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ECardConfig eCardConfig, int i8) {
        eCardConfig.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        eCardConfig.setName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        eCardConfig.setCount(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        eCardConfig.setUrlLimit(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        eCardConfig.setSavedIdList(cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ECardConfig eCardConfig) {
        sQLiteStatement.clearBindings();
        Long id = eCardConfig.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String name = eCardConfig.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        if (eCardConfig.getCount() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        if (eCardConfig.getUrlLimit() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        String savedIdList = eCardConfig.getSavedIdList();
        if (savedIdList != null) {
            sQLiteStatement.bindString(5, savedIdList);
        }
    }
}
