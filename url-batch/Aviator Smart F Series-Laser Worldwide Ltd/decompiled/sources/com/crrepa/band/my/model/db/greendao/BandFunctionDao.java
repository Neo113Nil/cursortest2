package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.BandFunction;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class BandFunctionDao extends a {
    public static final String TABLENAME = "BAND_FUNCTION";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Name = new f(1, String.class, "name", false, "NAME");
        public static final f Functions = new f(2, String.class, "functions", false, "FUNCTIONS");
        public static final f SupportFunctions = new f(3, String.class, "supportFunctions", false, "SUPPORT_FUNCTIONS");
    }

    public BandFunctionDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"BAND_FUNCTION\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"FUNCTIONS\" TEXT,\"SUPPORT_FUNCTIONS\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"BAND_FUNCTION\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public BandFunctionDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(BandFunction bandFunction) {
        if (bandFunction != null) {
            return bandFunction.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(BandFunction bandFunction) {
        return bandFunction.getId() != null;
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
    public final Long updateKeyAfterInsert(BandFunction bandFunction, long j8) {
        bandFunction.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, BandFunction bandFunction) {
        cVar.clearBindings();
        Long id = bandFunction.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String name = bandFunction.getName();
        if (name != null) {
            cVar.bindString(2, name);
        }
        String functions = bandFunction.getFunctions();
        if (functions != null) {
            cVar.bindString(3, functions);
        }
        String supportFunctions = bandFunction.getSupportFunctions();
        if (supportFunctions != null) {
            cVar.bindString(4, supportFunctions);
        }
    }

    @Override // org.greenrobot.greendao.a
    public BandFunction readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = i8 + 3;
        return new BandFunction(valueOf, cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, BandFunction bandFunction, int i8) {
        bandFunction.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        bandFunction.setName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        bandFunction.setFunctions(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        bandFunction.setSupportFunctions(cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, BandFunction bandFunction) {
        sQLiteStatement.clearBindings();
        Long id = bandFunction.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String name = bandFunction.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String functions = bandFunction.getFunctions();
        if (functions != null) {
            sQLiteStatement.bindString(3, functions);
        }
        String supportFunctions = bandFunction.getSupportFunctions();
        if (supportFunctions != null) {
            sQLiteStatement.bindString(4, supportFunctions);
        }
    }
}
