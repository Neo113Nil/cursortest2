package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Alarm;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class AlarmDao extends a {
    public static final String TABLENAME = "ALARM";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Hour = new f(1, Integer.class, "hour", false, "HOUR");
        public static final f Minute = new f(2, Integer.class, "minute", false, "MINUTE");
        public static final f RepeatMode = new f(3, String.class, "repeatMode", false, "REPEAT_MODE");
        public static final f Repeat = new f(4, Integer.class, "repeat", false, "REPEAT");
        public static final f SwitchOn = new f(5, Boolean.class, "switchOn", false, "SWITCH_ON");
        public static final f Alarm_id = new f(6, Integer.TYPE, "alarm_id", false, "ALARM_ID");
    }

    public AlarmDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"ALARM\" (\"_id\" INTEGER PRIMARY KEY ,\"HOUR\" INTEGER,\"MINUTE\" INTEGER,\"REPEAT_MODE\" TEXT,\"REPEAT\" INTEGER,\"SWITCH_ON\" INTEGER,\"ALARM_ID\" INTEGER NOT NULL );");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"ALARM\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public AlarmDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Alarm alarm) {
        if (alarm != null) {
            return alarm.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Alarm alarm) {
        return alarm.getId() != null;
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
    public final Long updateKeyAfterInsert(Alarm alarm, long j8) {
        alarm.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Alarm alarm) {
        cVar.clearBindings();
        Long id = alarm.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (alarm.getHour() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        if (alarm.getMinute() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        String repeatMode = alarm.getRepeatMode();
        if (repeatMode != null) {
            cVar.bindString(4, repeatMode);
        }
        if (alarm.getRepeat() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        Boolean switchOn = alarm.getSwitchOn();
        if (switchOn != null) {
            cVar.bindLong(6, switchOn.booleanValue() ? 1L : 0L);
        }
        cVar.bindLong(7, alarm.getAlarm_id());
    }

    @Override // org.greenrobot.greendao.a
    public Alarm readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf3 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        Integer valueOf4 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i8 + 4;
        Integer valueOf5 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        if (cursor.isNull(i13)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        return new Alarm(valueOf2, valueOf3, valueOf4, string, valueOf5, valueOf, cursor.getInt(i8 + 6));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Alarm alarm, int i8) {
        Boolean bool = null;
        alarm.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        alarm.setHour(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        alarm.setMinute(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        alarm.setRepeatMode(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i8 + 4;
        alarm.setRepeat(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        if (!cursor.isNull(i13)) {
            bool = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        alarm.setSwitchOn(bool);
        alarm.setAlarm_id(cursor.getInt(i8 + 6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Alarm alarm) {
        sQLiteStatement.clearBindings();
        Long id = alarm.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (alarm.getHour() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        if (alarm.getMinute() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        String repeatMode = alarm.getRepeatMode();
        if (repeatMode != null) {
            sQLiteStatement.bindString(4, repeatMode);
        }
        if (alarm.getRepeat() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        Boolean switchOn = alarm.getSwitchOn();
        if (switchOn != null) {
            sQLiteStatement.bindLong(6, switchOn.booleanValue() ? 1L : 0L);
        }
        sQLiteStatement.bindLong(7, alarm.getAlarm_id());
    }
}
