package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.DeviceScanRecord;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class DeviceScanRecordDao extends a {
    public static final String TABLENAME = "DEVICE_SCAN_RECORD";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Address = new f(1, String.class, "address", false, "ADDRESS");
        public static final f Name = new f(2, String.class, "name", false, "NAME");
        public static final f ScanRecordBytes = new f(3, String.class, "scanRecordBytes", false, "SCAN_RECORD_BYTES");
    }

    public DeviceScanRecordDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"DEVICE_SCAN_RECORD\" (\"_id\" INTEGER PRIMARY KEY ,\"ADDRESS\" TEXT,\"NAME\" TEXT,\"SCAN_RECORD_BYTES\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"DEVICE_SCAN_RECORD\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public DeviceScanRecordDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(DeviceScanRecord deviceScanRecord) {
        if (deviceScanRecord != null) {
            return deviceScanRecord.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(DeviceScanRecord deviceScanRecord) {
        return deviceScanRecord.getId() != null;
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
    public final Long updateKeyAfterInsert(DeviceScanRecord deviceScanRecord, long j8) {
        deviceScanRecord.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, DeviceScanRecord deviceScanRecord) {
        cVar.clearBindings();
        Long id = deviceScanRecord.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String address = deviceScanRecord.getAddress();
        if (address != null) {
            cVar.bindString(2, address);
        }
        String name = deviceScanRecord.getName();
        if (name != null) {
            cVar.bindString(3, name);
        }
        String scanRecordBytes = deviceScanRecord.getScanRecordBytes();
        if (scanRecordBytes != null) {
            cVar.bindString(4, scanRecordBytes);
        }
    }

    @Override // org.greenrobot.greendao.a
    public DeviceScanRecord readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = i8 + 3;
        return new DeviceScanRecord(valueOf, cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, DeviceScanRecord deviceScanRecord, int i8) {
        deviceScanRecord.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        deviceScanRecord.setAddress(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        deviceScanRecord.setName(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        deviceScanRecord.setScanRecordBytes(cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, DeviceScanRecord deviceScanRecord) {
        sQLiteStatement.clearBindings();
        Long id = deviceScanRecord.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String address = deviceScanRecord.getAddress();
        if (address != null) {
            sQLiteStatement.bindString(2, address);
        }
        String name = deviceScanRecord.getName();
        if (name != null) {
            sQLiteStatement.bindString(3, name);
        }
        String scanRecordBytes = deviceScanRecord.getScanRecordBytes();
        if (scanRecordBytes != null) {
            sQLiteStatement.bindString(4, scanRecordBytes);
        }
    }
}
