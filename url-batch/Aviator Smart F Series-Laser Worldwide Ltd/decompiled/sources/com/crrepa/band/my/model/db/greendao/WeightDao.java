package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Weight;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class WeightDao extends a {
    public static final String TABLENAME = "WEIGHT";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f IsShowWeight = new f(2, Boolean.TYPE, "isShowWeight", false, "IS_SHOW_WEIGHT");
        public static final f WeightKg = new f(3, Float.class, "weightKg", false, "WEIGHT_KG");
        public static final f WeightLb = new f(4, Float.class, "weightLb", false, "WEIGHT_LB");
    }

    public WeightDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"WEIGHT\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"IS_SHOW_WEIGHT\" INTEGER NOT NULL ,\"WEIGHT_KG\" REAL,\"WEIGHT_LB\" REAL);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"WEIGHT\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public WeightDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Weight weight) {
        if (weight != null) {
            return weight.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Weight weight) {
        return weight.getId() != null;
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
    public final Long updateKeyAfterInsert(Weight weight, long j8) {
        weight.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Weight weight) {
        cVar.clearBindings();
        Long id = weight.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Date date = weight.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        cVar.bindLong(3, weight.getIsShowWeight() ? 1L : 0L);
        if (weight.getWeightKg() != null) {
            cVar.bindDouble(4, r0.floatValue());
        }
        if (weight.getWeightLb() != null) {
            cVar.bindDouble(5, r6.floatValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public Weight readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Date date = cursor.isNull(i9) ? null : new Date(cursor.getLong(i9));
        boolean z7 = cursor.getShort(i8 + 2) != 0;
        int i10 = i8 + 3;
        int i11 = i8 + 4;
        return new Weight(valueOf, date, z7, cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)), cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Weight weight, int i8) {
        weight.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        weight.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        weight.setIsShowWeight(cursor.getShort(i8 + 2) != 0);
        int i10 = i8 + 3;
        weight.setWeightKg(cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)));
        int i11 = i8 + 4;
        weight.setWeightLb(cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Weight weight) {
        sQLiteStatement.clearBindings();
        Long id = weight.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Date date = weight.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        sQLiteStatement.bindLong(3, weight.getIsShowWeight() ? 1L : 0L);
        if (weight.getWeightKg() != null) {
            sQLiteStatement.bindDouble(4, r0.floatValue());
        }
        if (weight.getWeightLb() != null) {
            sQLiteStatement.bindDouble(5, r6.floatValue());
        }
    }
}
