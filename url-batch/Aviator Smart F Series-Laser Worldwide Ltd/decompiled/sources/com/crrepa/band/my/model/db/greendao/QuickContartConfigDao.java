package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.arthenica.ffmpegkit.x;
import com.crrepa.band.my.model.db.QuickContartConfig;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class QuickContartConfigDao extends a {
    public static final String TABLENAME = "QUICK_CONTART_CONFIG";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Name = new f(1, String.class, "name", false, "NAME");
        public static final f Supported = new f(2, Boolean.class, "supported", false, "SUPPORTED");
        public static final f Count = new f(3, Integer.class, "count", false, "COUNT");
        public static final f Width = new f(4, Integer.class, x.KEY_WIDTH, false, "WIDTH");
        public static final f Height = new f(5, Integer.class, x.KEY_HEIGHT, false, "HEIGHT");
        public static final f MaxNameLength = new f(6, Integer.class, "maxNameLength", false, "MAX_NAME_LENGTH");
    }

    public QuickContartConfigDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"QUICK_CONTART_CONFIG\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"SUPPORTED\" INTEGER,\"COUNT\" INTEGER,\"WIDTH\" INTEGER,\"HEIGHT\" INTEGER,\"MAX_NAME_LENGTH\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"QUICK_CONTART_CONFIG\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public QuickContartConfigDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(QuickContartConfig quickContartConfig) {
        if (quickContartConfig != null) {
            return quickContartConfig.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(QuickContartConfig quickContartConfig) {
        return quickContartConfig.getId() != null;
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
    public final Long updateKeyAfterInsert(QuickContartConfig quickContartConfig, long j8) {
        quickContartConfig.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, QuickContartConfig quickContartConfig) {
        cVar.clearBindings();
        Long id = quickContartConfig.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String name = quickContartConfig.getName();
        if (name != null) {
            cVar.bindString(2, name);
        }
        Boolean supported = quickContartConfig.getSupported();
        if (supported != null) {
            cVar.bindLong(3, supported.booleanValue() ? 1L : 0L);
        }
        if (quickContartConfig.getCount() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (quickContartConfig.getWidth() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (quickContartConfig.getHeight() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (quickContartConfig.getMaxNameLength() != null) {
            cVar.bindLong(7, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public QuickContartConfig readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i8 + 2;
        if (cursor.isNull(i10)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        int i11 = i8 + 3;
        Integer valueOf3 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 4;
        Integer valueOf4 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        int i14 = i8 + 6;
        return new QuickContartConfig(valueOf2, string, valueOf, valueOf3, valueOf4, cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)), cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, QuickContartConfig quickContartConfig, int i8) {
        Boolean valueOf;
        quickContartConfig.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        quickContartConfig.setName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        if (cursor.isNull(i10)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        quickContartConfig.setSupported(valueOf);
        int i11 = i8 + 3;
        quickContartConfig.setCount(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        quickContartConfig.setWidth(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        quickContartConfig.setHeight(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        quickContartConfig.setMaxNameLength(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, QuickContartConfig quickContartConfig) {
        sQLiteStatement.clearBindings();
        Long id = quickContartConfig.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String name = quickContartConfig.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        Boolean supported = quickContartConfig.getSupported();
        if (supported != null) {
            sQLiteStatement.bindLong(3, supported.booleanValue() ? 1L : 0L);
        }
        if (quickContartConfig.getCount() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (quickContartConfig.getWidth() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (quickContartConfig.getHeight() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (quickContartConfig.getMaxNameLength() != null) {
            sQLiteStatement.bindLong(7, r6.intValue());
        }
    }
}
