package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.HeartRate;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class HeartRateDao extends a {
    public static final String TABLENAME = "HEART_RATE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f HeartRate = new f(2, String.class, "heartRate", false, HeartRateDao.TABLENAME);
        public static final f MinHeartRate = new f(3, Integer.class, "minHeartRate", false, "MIN_HEART_RATE");
        public static final f MaxHeartRate = new f(4, Integer.class, "maxHeartRate", false, "MAX_HEART_RATE");
        public static final f Average = new f(5, Integer.class, "average", false, "AVERAGE");
        public static final f LightCount = new f(6, Integer.class, "lightCount", false, "LIGHT_COUNT");
        public static final f WightCount = new f(7, Integer.class, "wightCount", false, "WIGHT_COUNT");
        public static final f AerobicCount = new f(8, Integer.class, "aerobicCount", false, "AEROBIC_COUNT");
        public static final f AnaerobicCount = new f(9, Integer.class, "anaerobicCount", false, "ANAEROBIC_COUNT");
        public static final f MaxCount = new f(10, Integer.class, "maxCount", false, "MAX_COUNT");
    }

    public HeartRateDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"HEART_RATE\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"HEART_RATE\" TEXT,\"MIN_HEART_RATE\" INTEGER,\"MAX_HEART_RATE\" INTEGER,\"AVERAGE\" INTEGER,\"LIGHT_COUNT\" INTEGER,\"WIGHT_COUNT\" INTEGER,\"AEROBIC_COUNT\" INTEGER,\"ANAEROBIC_COUNT\" INTEGER,\"MAX_COUNT\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"HEART_RATE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public HeartRateDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(HeartRate heartRate) {
        if (heartRate != null) {
            return heartRate.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(HeartRate heartRate) {
        return heartRate.getId() != null;
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
    public final Long updateKeyAfterInsert(HeartRate heartRate, long j8) {
        heartRate.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, HeartRate heartRate) {
        cVar.clearBindings();
        Long id = heartRate.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = heartRate.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        String heartRate2 = heartRate.getHeartRate();
        if (heartRate2 != null) {
            cVar.bindString(3, heartRate2);
        }
        if (heartRate.getMinHeartRate() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (heartRate.getMaxHeartRate() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (heartRate.getAverage() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (heartRate.getLightCount() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        if (heartRate.getWightCount() != null) {
            cVar.bindLong(8, r0.intValue());
        }
        if (heartRate.getAerobicCount() != null) {
            cVar.bindLong(9, r0.intValue());
        }
        if (heartRate.getAnaerobicCount() != null) {
            cVar.bindLong(10, r0.intValue());
        }
        if (heartRate.getMaxCount() != null) {
            cVar.bindLong(11, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public HeartRate readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Date date = cursor.isNull(i9) ? null : new Date(cursor.getLong(i9));
        int i10 = i8 + 2;
        String string = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        Integer valueOf2 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 4;
        Integer valueOf3 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        Integer valueOf4 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 6;
        Integer valueOf5 = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i8 + 7;
        Integer valueOf6 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i8 + 8;
        Integer valueOf7 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i8 + 9;
        int i18 = i8 + 10;
        return new HeartRate(valueOf, date, string, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)), cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, HeartRate heartRate, int i8) {
        heartRate.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        heartRate.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        heartRate.setHeartRate(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        heartRate.setMinHeartRate(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        heartRate.setMaxHeartRate(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        heartRate.setAverage(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        heartRate.setLightCount(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 7;
        heartRate.setWightCount(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i8 + 8;
        heartRate.setAerobicCount(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i8 + 9;
        heartRate.setAnaerobicCount(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i8 + 10;
        heartRate.setMaxCount(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, HeartRate heartRate) {
        sQLiteStatement.clearBindings();
        Long id = heartRate.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = heartRate.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        String heartRate2 = heartRate.getHeartRate();
        if (heartRate2 != null) {
            sQLiteStatement.bindString(3, heartRate2);
        }
        if (heartRate.getMinHeartRate() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (heartRate.getMaxHeartRate() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (heartRate.getAverage() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (heartRate.getLightCount() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        if (heartRate.getWightCount() != null) {
            sQLiteStatement.bindLong(8, r0.intValue());
        }
        if (heartRate.getAerobicCount() != null) {
            sQLiteStatement.bindLong(9, r0.intValue());
        }
        if (heartRate.getAnaerobicCount() != null) {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (heartRate.getMaxCount() != null) {
            sQLiteStatement.bindLong(11, r6.intValue());
        }
    }
}
