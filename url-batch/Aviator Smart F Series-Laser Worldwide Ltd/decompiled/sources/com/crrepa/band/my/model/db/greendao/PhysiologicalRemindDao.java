package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.PhysiologicalRemind;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class PhysiologicalRemindDao extends a {
    public static final String TABLENAME = "PHYSIOLOGICAL_REMIND";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Enable = new f(1, Boolean.class, "enable", false, "ENABLE");
        public static final f Menstrual = new f(2, Boolean.class, "menstrual", false, "MENSTRUAL");
        public static final f Ovulation = new f(3, Boolean.class, "ovulation", false, "OVULATION");
        public static final f OvulationDay = new f(4, Boolean.class, "ovulationDay", false, "OVULATION_DAY");
        public static final f OvulationEnd = new f(5, Boolean.class, "ovulationEnd", false, "OVULATION_END");
        public static final f Hour = new f(6, Integer.class, "hour", false, "HOUR");
        public static final f Minute = new f(7, Integer.class, "minute", false, "MINUTE");
    }

    public PhysiologicalRemindDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"PHYSIOLOGICAL_REMIND\" (\"_id\" INTEGER PRIMARY KEY ,\"ENABLE\" INTEGER,\"MENSTRUAL\" INTEGER,\"OVULATION\" INTEGER,\"OVULATION_DAY\" INTEGER,\"OVULATION_END\" INTEGER,\"HOUR\" INTEGER,\"MINUTE\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"PHYSIOLOGICAL_REMIND\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public PhysiologicalRemindDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(PhysiologicalRemind physiologicalRemind) {
        if (physiologicalRemind != null) {
            return physiologicalRemind.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PhysiologicalRemind physiologicalRemind) {
        return physiologicalRemind.getId() != null;
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
    public final Long updateKeyAfterInsert(PhysiologicalRemind physiologicalRemind, long j8) {
        physiologicalRemind.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, PhysiologicalRemind physiologicalRemind) {
        cVar.clearBindings();
        Long id = physiologicalRemind.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Boolean enable = physiologicalRemind.getEnable();
        if (enable != null) {
            cVar.bindLong(2, enable.booleanValue() ? 1L : 0L);
        }
        Boolean menstrual = physiologicalRemind.getMenstrual();
        if (menstrual != null) {
            cVar.bindLong(3, menstrual.booleanValue() ? 1L : 0L);
        }
        Boolean ovulation = physiologicalRemind.getOvulation();
        if (ovulation != null) {
            cVar.bindLong(4, ovulation.booleanValue() ? 1L : 0L);
        }
        Boolean ovulationDay = physiologicalRemind.getOvulationDay();
        if (ovulationDay != null) {
            cVar.bindLong(5, ovulationDay.booleanValue() ? 1L : 0L);
        }
        Boolean ovulationEnd = physiologicalRemind.getOvulationEnd();
        if (ovulationEnd != null) {
            cVar.bindLong(6, ovulationEnd.booleanValue() ? 1L : 0L);
        }
        if (physiologicalRemind.getHour() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        if (physiologicalRemind.getMinute() != null) {
            cVar.bindLong(8, r9.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public PhysiologicalRemind readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        Long valueOf6 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        if (cursor.isNull(i9)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i8 + 2;
        if (cursor.isNull(i10)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        int i11 = i8 + 3;
        if (cursor.isNull(i11)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        int i12 = i8 + 4;
        if (cursor.isNull(i12)) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        int i13 = i8 + 5;
        if (cursor.isNull(i13)) {
            valueOf5 = null;
        } else {
            valueOf5 = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        int i14 = i8 + 6;
        int i15 = i8 + 7;
        return new PhysiologicalRemind(valueOf6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)), cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PhysiologicalRemind physiologicalRemind, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        physiologicalRemind.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        if (cursor.isNull(i9)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        physiologicalRemind.setEnable(valueOf);
        int i10 = i8 + 2;
        if (cursor.isNull(i10)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        physiologicalRemind.setMenstrual(valueOf2);
        int i11 = i8 + 3;
        if (cursor.isNull(i11)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        physiologicalRemind.setOvulation(valueOf3);
        int i12 = i8 + 4;
        if (cursor.isNull(i12)) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        physiologicalRemind.setOvulationDay(valueOf4);
        int i13 = i8 + 5;
        if (cursor.isNull(i13)) {
            valueOf5 = null;
        } else {
            valueOf5 = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        physiologicalRemind.setOvulationEnd(valueOf5);
        int i14 = i8 + 6;
        physiologicalRemind.setHour(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 7;
        physiologicalRemind.setMinute(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PhysiologicalRemind physiologicalRemind) {
        sQLiteStatement.clearBindings();
        Long id = physiologicalRemind.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Boolean enable = physiologicalRemind.getEnable();
        if (enable != null) {
            sQLiteStatement.bindLong(2, enable.booleanValue() ? 1L : 0L);
        }
        Boolean menstrual = physiologicalRemind.getMenstrual();
        if (menstrual != null) {
            sQLiteStatement.bindLong(3, menstrual.booleanValue() ? 1L : 0L);
        }
        Boolean ovulation = physiologicalRemind.getOvulation();
        if (ovulation != null) {
            sQLiteStatement.bindLong(4, ovulation.booleanValue() ? 1L : 0L);
        }
        Boolean ovulationDay = physiologicalRemind.getOvulationDay();
        if (ovulationDay != null) {
            sQLiteStatement.bindLong(5, ovulationDay.booleanValue() ? 1L : 0L);
        }
        Boolean ovulationEnd = physiologicalRemind.getOvulationEnd();
        if (ovulationEnd != null) {
            sQLiteStatement.bindLong(6, ovulationEnd.booleanValue() ? 1L : 0L);
        }
        if (physiologicalRemind.getHour() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        if (physiologicalRemind.getMinute() != null) {
            sQLiteStatement.bindLong(8, r9.intValue());
        }
    }
}
