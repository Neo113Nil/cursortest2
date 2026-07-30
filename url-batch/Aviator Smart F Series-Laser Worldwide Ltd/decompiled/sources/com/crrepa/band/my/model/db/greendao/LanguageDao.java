package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Language;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class LanguageDao extends a {
    public static final String TABLENAME = "LANGUAGE";

    public static class Properties {
        public static final f Code = new f(0, String.class, "code", false, "CODE");
        public static final f LanguageText = new f(1, String.class, "languageText", false, "LANGUAGE_TEXT");
        public static final f Cmd = new f(2, Long.class, "cmd", true, FileDownloadModel.ID);
    }

    public LanguageDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"LANGUAGE\" (\"CODE\" TEXT,\"LANGUAGE_TEXT\" TEXT,\"_id\" INTEGER PRIMARY KEY );");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"LANGUAGE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public LanguageDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Language language) {
        if (language != null) {
            return language.getCmd();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Language language) {
        return language.getCmd() != null;
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i8) {
        int i9 = i8 + 2;
        if (cursor.isNull(i9)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i9));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Language language, long j8) {
        language.setCmd(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Language language) {
        cVar.clearBindings();
        String code = language.getCode();
        if (code != null) {
            cVar.bindString(1, code);
        }
        String languageText = language.getLanguageText();
        if (languageText != null) {
            cVar.bindString(2, languageText);
        }
        Long cmd = language.getCmd();
        if (cmd != null) {
            cVar.bindLong(3, cmd.longValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public Language readEntity(Cursor cursor, int i8) {
        String string = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        return new Language(string, cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : Long.valueOf(cursor.getLong(i10)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Language language, int i8) {
        language.setCode(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i8 + 1;
        language.setLanguageText(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        language.setCmd(cursor.isNull(i10) ? null : Long.valueOf(cursor.getLong(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Language language) {
        sQLiteStatement.clearBindings();
        String code = language.getCode();
        if (code != null) {
            sQLiteStatement.bindString(1, code);
        }
        String languageText = language.getLanguageText();
        if (languageText != null) {
            sQLiteStatement.bindString(2, languageText);
        }
        Long cmd = language.getCmd();
        if (cmd != null) {
            sQLiteStatement.bindLong(3, cmd.longValue());
        }
    }
}
