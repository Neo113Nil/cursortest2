package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class ActiveHeartRateDao extends a {
    public static final String TABLENAME = "DYNAMIC_RATE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Average = new f(1, Integer.class, "average", false, "AVERAGE");
        public static final f Data = new f(2, String.class, "data", false, "DATA");
        public static final f StartDate = new f(3, Date.class, "startDate", false, "START_DATE");
        public static final f EndDate = new f(4, Date.class, "endDate", false, "END_DATE");
        public static final f MinHeartRate = new f(5, Integer.class, "minHeartRate", false, "MIN_HEART_RATE");
        public static final f MaxHeartRate = new f(6, Integer.class, "maxHeartRate", false, "MAX_HEART_RATE");
        public static final f LightCount = new f(7, Integer.class, "lightCount", false, "LIGHT_COUNT");
        public static final f WightCount = new f(8, Integer.class, "wightCount", false, "WIGHT_COUNT");
        public static final f AerobicCount = new f(9, Integer.class, "aerobicCount", false, "AEROBIC_COUNT");
        public static final f AnaerobicCount = new f(10, Integer.class, "anaerobicCount", false, "ANAEROBIC_COUNT");
        public static final f MaxCount = new f(11, Integer.class, "maxCount", false, "MAX_COUNT");
    }

    public ActiveHeartRateDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"DYNAMIC_RATE\" (\"_id\" INTEGER PRIMARY KEY ,\"AVERAGE\" INTEGER,\"DATA\" TEXT,\"START_DATE\" INTEGER,\"END_DATE\" INTEGER,\"MIN_HEART_RATE\" INTEGER,\"MAX_HEART_RATE\" INTEGER,\"LIGHT_COUNT\" INTEGER,\"WIGHT_COUNT\" INTEGER,\"AEROBIC_COUNT\" INTEGER,\"ANAEROBIC_COUNT\" INTEGER,\"MAX_COUNT\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"DYNAMIC_RATE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public ActiveHeartRateDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(ActiveHeartRate activeHeartRate) {
        if (activeHeartRate != null) {
            return activeHeartRate.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ActiveHeartRate activeHeartRate) {
        return activeHeartRate.getId() != null;
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
    public final Long updateKeyAfterInsert(ActiveHeartRate activeHeartRate, long j8) {
        activeHeartRate.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, ActiveHeartRate activeHeartRate) {
        cVar.clearBindings();
        Long id = activeHeartRate.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (activeHeartRate.getAverage() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        String data = activeHeartRate.getData();
        if (data != null) {
            cVar.bindString(3, data);
        }
        Date startDate = activeHeartRate.getStartDate();
        if (startDate != null) {
            cVar.bindLong(4, startDate.getTime());
        }
        Date endDate = activeHeartRate.getEndDate();
        if (endDate != null) {
            cVar.bindLong(5, endDate.getTime());
        }
        if (activeHeartRate.getMinHeartRate() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (activeHeartRate.getMaxHeartRate() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        if (activeHeartRate.getLightCount() != null) {
            cVar.bindLong(8, r0.intValue());
        }
        if (activeHeartRate.getWightCount() != null) {
            cVar.bindLong(9, r0.intValue());
        }
        if (activeHeartRate.getAerobicCount() != null) {
            cVar.bindLong(10, r0.intValue());
        }
        if (activeHeartRate.getAnaerobicCount() != null) {
            cVar.bindLong(11, r0.intValue());
        }
        if (activeHeartRate.getMaxCount() != null) {
            cVar.bindLong(12, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public ActiveHeartRate readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        String string = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        Date date = cursor.isNull(i11) ? null : new Date(cursor.getLong(i11));
        int i12 = i8 + 4;
        int i13 = i8 + 5;
        int i14 = i8 + 6;
        int i15 = i8 + 7;
        int i16 = i8 + 8;
        int i17 = i8 + 9;
        int i18 = i8 + 10;
        int i19 = i8 + 11;
        return new ActiveHeartRate(valueOf, valueOf2, string, date, cursor.isNull(i12) ? null : new Date(cursor.getLong(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)), cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)), cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)), cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)), cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)), cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)), cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ActiveHeartRate activeHeartRate, int i8) {
        activeHeartRate.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        activeHeartRate.setAverage(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        activeHeartRate.setData(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        activeHeartRate.setStartDate(cursor.isNull(i11) ? null : new Date(cursor.getLong(i11)));
        int i12 = i8 + 4;
        activeHeartRate.setEndDate(cursor.isNull(i12) ? null : new Date(cursor.getLong(i12)));
        int i13 = i8 + 5;
        activeHeartRate.setMinHeartRate(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        activeHeartRate.setMaxHeartRate(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 7;
        activeHeartRate.setLightCount(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i8 + 8;
        activeHeartRate.setWightCount(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i8 + 9;
        activeHeartRate.setAerobicCount(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i8 + 10;
        activeHeartRate.setAnaerobicCount(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i8 + 11;
        activeHeartRate.setMaxCount(cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ActiveHeartRate activeHeartRate) {
        sQLiteStatement.clearBindings();
        Long id = activeHeartRate.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (activeHeartRate.getAverage() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        String data = activeHeartRate.getData();
        if (data != null) {
            sQLiteStatement.bindString(3, data);
        }
        Date startDate = activeHeartRate.getStartDate();
        if (startDate != null) {
            sQLiteStatement.bindLong(4, startDate.getTime());
        }
        Date endDate = activeHeartRate.getEndDate();
        if (endDate != null) {
            sQLiteStatement.bindLong(5, endDate.getTime());
        }
        if (activeHeartRate.getMinHeartRate() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (activeHeartRate.getMaxHeartRate() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        if (activeHeartRate.getLightCount() != null) {
            sQLiteStatement.bindLong(8, r0.intValue());
        }
        if (activeHeartRate.getWightCount() != null) {
            sQLiteStatement.bindLong(9, r0.intValue());
        }
        if (activeHeartRate.getAerobicCount() != null) {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (activeHeartRate.getAnaerobicCount() != null) {
            sQLiteStatement.bindLong(11, r0.intValue());
        }
        if (activeHeartRate.getMaxCount() != null) {
            sQLiteStatement.bindLong(12, r6.intValue());
        }
    }
}
