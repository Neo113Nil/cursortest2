package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.PillReminder;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class PillReminderDao extends a {
    public static final String TABLENAME = "PILL_REMINDER";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Name = new f(1, String.class, "name", false, "NAME");
        public static final f Index = new f(2, Integer.class, "index", false, "INDEX");
        public static final f Enable = new f(3, Boolean.class, "enable", false, "ENABLE");
        public static final f Times = new f(4, Integer.class, "times", false, "TIMES");
        public static final f Repeat = new f(5, Integer.class, "repeat", false, "REPEAT");
        public static final f ReminderTime = new f(6, String.class, "reminderTime", false, "REMINDER_TIME");
        public static final f Date = new f(7, Date.class, "date", false, "DATE");
    }

    public PillReminderDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"PILL_REMINDER\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"INDEX\" INTEGER,\"ENABLE\" INTEGER,\"TIMES\" INTEGER,\"REPEAT\" INTEGER,\"REMINDER_TIME\" TEXT,\"DATE\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"PILL_REMINDER\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public PillReminderDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(PillReminder pillReminder) {
        if (pillReminder != null) {
            return pillReminder.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PillReminder pillReminder) {
        return pillReminder.getId() != null;
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
    public final Long updateKeyAfterInsert(PillReminder pillReminder, long j8) {
        pillReminder.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, PillReminder pillReminder) {
        cVar.clearBindings();
        Long id = pillReminder.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String name = pillReminder.getName();
        if (name != null) {
            cVar.bindString(2, name);
        }
        if (pillReminder.getIndex() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        Boolean enable = pillReminder.getEnable();
        if (enable != null) {
            cVar.bindLong(4, enable.booleanValue() ? 1L : 0L);
        }
        if (pillReminder.getTimes() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (pillReminder.getRepeat() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        String reminderTime = pillReminder.getReminderTime();
        if (reminderTime != null) {
            cVar.bindString(7, reminderTime);
        }
        Date date = pillReminder.getDate();
        if (date != null) {
            cVar.bindLong(8, date.getTime());
        }
    }

    @Override // org.greenrobot.greendao.a
    public PillReminder readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i8 + 2;
        Integer valueOf3 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        if (cursor.isNull(i11)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        int i12 = i8 + 4;
        Integer valueOf4 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        Integer valueOf5 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 6;
        int i15 = i8 + 7;
        return new PillReminder(valueOf2, string, valueOf3, valueOf, valueOf4, valueOf5, cursor.isNull(i14) ? null : cursor.getString(i14), cursor.isNull(i15) ? null : new Date(cursor.getLong(i15)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PillReminder pillReminder, int i8) {
        Boolean valueOf;
        pillReminder.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        pillReminder.setName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        pillReminder.setIndex(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        if (cursor.isNull(i11)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        pillReminder.setEnable(valueOf);
        int i12 = i8 + 4;
        pillReminder.setTimes(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        pillReminder.setRepeat(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        pillReminder.setReminderTime(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i8 + 7;
        pillReminder.setDate(cursor.isNull(i15) ? null : new Date(cursor.getLong(i15)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PillReminder pillReminder) {
        sQLiteStatement.clearBindings();
        Long id = pillReminder.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String name = pillReminder.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        if (pillReminder.getIndex() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        Boolean enable = pillReminder.getEnable();
        if (enable != null) {
            sQLiteStatement.bindLong(4, enable.booleanValue() ? 1L : 0L);
        }
        if (pillReminder.getTimes() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (pillReminder.getRepeat() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        String reminderTime = pillReminder.getReminderTime();
        if (reminderTime != null) {
            sQLiteStatement.bindString(7, reminderTime);
        }
        Date date = pillReminder.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(8, date.getTime());
        }
    }
}
