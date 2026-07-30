package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.PhysiologicalPeriod;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class PhysiologicalPeriodDao extends a {
    public static final String TABLENAME = "PHYSIOLOGICAL_PERIOD";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f PhysiologicalPeriod = new f(1, Integer.class, "physiologicalPeriod", false, PhysiologicalPeriodDao.TABLENAME);
        public static final f MenstrualPeriod = new f(2, Integer.class, "menstrualPeriod", false, "MENSTRUAL_PERIOD");
        public static final f LastMenstrualDate = new f(3, Date.class, "lastMenstrualDate", false, "LAST_MENSTRUAL_DATE");
    }

    public PhysiologicalPeriodDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"PHYSIOLOGICAL_PERIOD\" (\"_id\" INTEGER PRIMARY KEY ,\"PHYSIOLOGICAL_PERIOD\" INTEGER,\"MENSTRUAL_PERIOD\" INTEGER,\"LAST_MENSTRUAL_DATE\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"PHYSIOLOGICAL_PERIOD\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public PhysiologicalPeriodDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(PhysiologicalPeriod physiologicalPeriod) {
        if (physiologicalPeriod != null) {
            return physiologicalPeriod.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PhysiologicalPeriod physiologicalPeriod) {
        return physiologicalPeriod.getId() != null;
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
    public final Long updateKeyAfterInsert(PhysiologicalPeriod physiologicalPeriod, long j8) {
        physiologicalPeriod.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, PhysiologicalPeriod physiologicalPeriod) {
        cVar.clearBindings();
        Long id = physiologicalPeriod.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (physiologicalPeriod.getPhysiologicalPeriod() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        if (physiologicalPeriod.getMenstrualPeriod() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        Date lastMenstrualDate = physiologicalPeriod.getLastMenstrualDate();
        if (lastMenstrualDate != null) {
            cVar.bindLong(4, lastMenstrualDate.getTime());
        }
    }

    @Override // org.greenrobot.greendao.a
    public PhysiologicalPeriod readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = i8 + 3;
        return new PhysiologicalPeriod(valueOf, cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)), cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)), cursor.isNull(i11) ? null : new Date(cursor.getLong(i11)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PhysiologicalPeriod physiologicalPeriod, int i8) {
        physiologicalPeriod.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        physiologicalPeriod.setPhysiologicalPeriod(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        physiologicalPeriod.setMenstrualPeriod(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        physiologicalPeriod.setLastMenstrualDate(cursor.isNull(i11) ? null : new Date(cursor.getLong(i11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PhysiologicalPeriod physiologicalPeriod) {
        sQLiteStatement.clearBindings();
        Long id = physiologicalPeriod.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (physiologicalPeriod.getPhysiologicalPeriod() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        if (physiologicalPeriod.getMenstrualPeriod() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        Date lastMenstrualDate = physiologicalPeriod.getLastMenstrualDate();
        if (lastMenstrualDate != null) {
            sQLiteStatement.bindLong(4, lastMenstrualDate.getTime());
        }
    }
}
