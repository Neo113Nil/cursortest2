package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.crrepa.band.my.model.db.DrinkWater;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class DrinkWaterDao extends a {
    public static final String TABLENAME = "DRINK_WATER";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Enable = new f(1, Boolean.class, "enable", false, "ENABLE");
        public static final f StartHour = new f(2, Integer.class, "startHour", false, "START_HOUR");
        public static final f StartMinute = new f(3, Integer.class, "startMinute", false, "START_MINUTE");
        public static final f Count = new f(4, Integer.class, "count", false, "COUNT");
        public static final f Period = new f(5, Integer.class, TypedValues.CycleType.S_WAVE_PERIOD, false, "PERIOD");
    }

    public DrinkWaterDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"DRINK_WATER\" (\"_id\" INTEGER PRIMARY KEY ,\"ENABLE\" INTEGER,\"START_HOUR\" INTEGER,\"START_MINUTE\" INTEGER,\"COUNT\" INTEGER,\"PERIOD\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"DRINK_WATER\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public DrinkWaterDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(DrinkWater drinkWater) {
        if (drinkWater != null) {
            return drinkWater.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(DrinkWater drinkWater) {
        return drinkWater.getId() != null;
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
    public final Long updateKeyAfterInsert(DrinkWater drinkWater, long j8) {
        drinkWater.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, DrinkWater drinkWater) {
        cVar.clearBindings();
        Long id = drinkWater.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Boolean enable = drinkWater.getEnable();
        if (enable != null) {
            cVar.bindLong(2, enable.booleanValue() ? 1L : 0L);
        }
        if (drinkWater.getStartHour() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        if (drinkWater.getStartMinute() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (drinkWater.getCount() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (drinkWater.getPeriod() != null) {
            cVar.bindLong(6, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public DrinkWater readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        if (cursor.isNull(i9)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i8 + 2;
        Integer valueOf3 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        Integer valueOf4 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 4;
        int i13 = i8 + 5;
        return new DrinkWater(valueOf2, valueOf, valueOf3, valueOf4, cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, DrinkWater drinkWater, int i8) {
        Boolean valueOf;
        drinkWater.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        if (cursor.isNull(i9)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        drinkWater.setEnable(valueOf);
        int i10 = i8 + 2;
        drinkWater.setStartHour(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        drinkWater.setStartMinute(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        drinkWater.setCount(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        drinkWater.setPeriod(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, DrinkWater drinkWater) {
        sQLiteStatement.clearBindings();
        Long id = drinkWater.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Boolean enable = drinkWater.getEnable();
        if (enable != null) {
            sQLiteStatement.bindLong(2, enable.booleanValue() ? 1L : 0L);
        }
        if (drinkWater.getStartHour() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        if (drinkWater.getStartMinute() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (drinkWater.getCount() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (drinkWater.getPeriod() != null) {
            sQLiteStatement.bindLong(6, r6.intValue());
        }
    }
}
