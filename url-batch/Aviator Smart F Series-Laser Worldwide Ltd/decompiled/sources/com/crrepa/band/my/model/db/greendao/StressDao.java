package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Stress;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class StressDao extends a {
    public static final String TABLENAME = "STRESS";

    public static class Properties {
        public static final f Id = new f(0, Integer.class, "id", true, "ID");
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f Stress = new f(2, Integer.class, "stress", false, StressDao.TABLENAME);
    }

    public StressDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"STRESS\" (\"ID\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER,\"STRESS\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"STRESS\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public StressDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Integer getKey(Stress stress) {
        if (stress != null) {
            return stress.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Stress stress) {
        return stress.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public Integer readKey(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final Integer updateKeyAfterInsert(Stress stress, long j8) {
        return stress.getId();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Stress stress) {
        cVar.clearBindings();
        if (stress.getId() != null) {
            cVar.bindLong(1, r0.intValue());
        }
        Date date = stress.getDate();
        if (date != null) {
            cVar.bindLong(2, date.getTime());
        }
        if (stress.getStress() != null) {
            cVar.bindLong(3, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public Stress readEntity(Cursor cursor, int i8) {
        Integer valueOf = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        return new Stress(valueOf, cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)), cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Stress stress, int i8) {
        stress.setId(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i8 + 1;
        stress.setDate(cursor.isNull(i9) ? null : new Date(cursor.getLong(i9)));
        int i10 = i8 + 2;
        stress.setStress(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Stress stress) {
        sQLiteStatement.clearBindings();
        if (stress.getId() != null) {
            sQLiteStatement.bindLong(1, r0.intValue());
        }
        Date date = stress.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(2, date.getTime());
        }
        if (stress.getStress() != null) {
            sQLiteStatement.bindLong(3, r6.intValue());
        }
    }
}
