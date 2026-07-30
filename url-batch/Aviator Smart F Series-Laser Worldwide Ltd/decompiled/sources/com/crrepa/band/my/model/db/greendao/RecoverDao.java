package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Recover;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class RecoverDao extends a {
    public static final String TABLENAME = "RECOVER";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Name = new f(1, String.class, "name", false, "NAME");
        public static final f Address = new f(2, String.class, "address", false, "ADDRESS");
        public static final f FirmwareVersion = new f(3, String.class, "firmwareVersion", false, "FIRMWARE_VERSION");
        public static final f Mcu = new f(4, Integer.class, "mcu", false, "MCU");
    }

    public RecoverDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"RECOVER\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"ADDRESS\" TEXT,\"FIRMWARE_VERSION\" TEXT,\"MCU\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"RECOVER\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public RecoverDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Recover recover) {
        if (recover != null) {
            return recover.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Recover recover) {
        return recover.getId() != null;
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
    public final Long updateKeyAfterInsert(Recover recover, long j8) {
        recover.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Recover recover) {
        cVar.clearBindings();
        Long id = recover.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String name = recover.getName();
        if (name != null) {
            cVar.bindString(2, name);
        }
        String address = recover.getAddress();
        if (address != null) {
            cVar.bindString(3, address);
        }
        String firmwareVersion = recover.getFirmwareVersion();
        if (firmwareVersion != null) {
            cVar.bindString(4, firmwareVersion);
        }
        if (recover.getMcu() != null) {
            cVar.bindLong(5, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public Recover readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i8 + 2;
        String string2 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        int i12 = i8 + 4;
        return new Recover(valueOf, string, string2, cursor.isNull(i11) ? null : cursor.getString(i11), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Recover recover, int i8) {
        recover.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        recover.setName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        recover.setAddress(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        recover.setFirmwareVersion(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i8 + 4;
        recover.setMcu(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Recover recover) {
        sQLiteStatement.clearBindings();
        Long id = recover.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String name = recover.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String address = recover.getAddress();
        if (address != null) {
            sQLiteStatement.bindString(3, address);
        }
        String firmwareVersion = recover.getFirmwareVersion();
        if (firmwareVersion != null) {
            sQLiteStatement.bindString(4, firmwareVersion);
        }
        if (recover.getMcu() != null) {
            sQLiteStatement.bindLong(5, r6.intValue());
        }
    }
}
