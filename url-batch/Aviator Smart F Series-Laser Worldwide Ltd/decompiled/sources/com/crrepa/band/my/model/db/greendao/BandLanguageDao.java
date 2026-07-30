package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.BandLanguage;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class BandLanguageDao extends a {
    public static final String TABLENAME = "BAND_LANGUAGE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f BandName = new f(1, String.class, "bandName", false, "BAND_NAME");
        public static final f Languages = new f(2, String.class, "languages", false, "LANGUAGES");
    }

    public BandLanguageDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"BAND_LANGUAGE\" (\"_id\" INTEGER PRIMARY KEY ,\"BAND_NAME\" TEXT,\"LANGUAGES\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"BAND_LANGUAGE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public BandLanguageDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(BandLanguage bandLanguage) {
        if (bandLanguage != null) {
            return bandLanguage.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(BandLanguage bandLanguage) {
        return bandLanguage.getId() != null;
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
    public final Long updateKeyAfterInsert(BandLanguage bandLanguage, long j8) {
        bandLanguage.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, BandLanguage bandLanguage) {
        cVar.clearBindings();
        Long id = bandLanguage.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String bandName = bandLanguage.getBandName();
        if (bandName != null) {
            cVar.bindString(2, bandName);
        }
        String languages = bandLanguage.getLanguages();
        if (languages != null) {
            cVar.bindString(3, languages);
        }
    }

    @Override // org.greenrobot.greendao.a
    public BandLanguage readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        return new BandLanguage(valueOf, cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, BandLanguage bandLanguage, int i8) {
        bandLanguage.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        bandLanguage.setBandName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        bandLanguage.setLanguages(cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, BandLanguage bandLanguage) {
        sQLiteStatement.clearBindings();
        Long id = bandLanguage.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String bandName = bandLanguage.getBandName();
        if (bandName != null) {
            sQLiteStatement.bindString(2, bandName);
        }
        String languages = bandLanguage.getLanguages();
        if (languages != null) {
            sQLiteStatement.bindString(3, languages);
        }
    }
}
