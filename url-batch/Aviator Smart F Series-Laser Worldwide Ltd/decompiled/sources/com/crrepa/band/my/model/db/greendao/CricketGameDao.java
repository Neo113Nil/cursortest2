package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.CricketGame;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class CricketGameDao extends a {
    public static final String TABLENAME = "CRICKET_GAME";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f GameId = new f(1, Integer.class, "gameId", false, "GAME_ID");
        public static final f Title = new f(2, String.class, "title", false, "TITLE");
        public static final f StartTimestamp = new f(3, Long.class, "startTimestamp", false, "START_TIMESTAMP");
        public static final f EndTimestamp = new f(4, Long.class, "endTimestamp", false, "END_TIMESTAMP");
        public static final f Teams = new f(5, String.class, "teams", false, "LONG_STRING");
        public static final f Reserved = new f(6, Boolean.class, "reserved", false, "RESERVED");
        public static final f TodayReminder = new f(7, Boolean.class, "todayReminder", false, "TODAY_REMINDER");
        public static final f GameStartReminder = new f(8, Boolean.class, "gameStartReminder", false, "GAME_START_REMINDER");
        public static final f GameEndReminder = new f(9, Boolean.class, "gameEndReminder", false, "GAME_END_REMINDER");
    }

    public CricketGameDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"CRICKET_GAME\" (\"_id\" INTEGER PRIMARY KEY ,\"GAME_ID\" INTEGER,\"TITLE\" TEXT,\"START_TIMESTAMP\" INTEGER,\"END_TIMESTAMP\" INTEGER,\"LONG_STRING\" TEXT,\"RESERVED\" INTEGER,\"TODAY_REMINDER\" INTEGER,\"GAME_START_REMINDER\" INTEGER,\"GAME_END_REMINDER\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"CRICKET_GAME\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public CricketGameDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(CricketGame cricketGame) {
        if (cricketGame != null) {
            return cricketGame.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(CricketGame cricketGame) {
        return cricketGame.getId() != null;
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
    public final Long updateKeyAfterInsert(CricketGame cricketGame, long j8) {
        cricketGame.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, CricketGame cricketGame) {
        cVar.clearBindings();
        Long id = cricketGame.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (cricketGame.getGameId() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        String title = cricketGame.getTitle();
        if (title != null) {
            cVar.bindString(3, title);
        }
        Long startTimestamp = cricketGame.getStartTimestamp();
        if (startTimestamp != null) {
            cVar.bindLong(4, startTimestamp.longValue());
        }
        Long endTimestamp = cricketGame.getEndTimestamp();
        if (endTimestamp != null) {
            cVar.bindLong(5, endTimestamp.longValue());
        }
        String teams = cricketGame.getTeams();
        if (teams != null) {
            cVar.bindString(6, teams);
        }
        Boolean reserved = cricketGame.getReserved();
        if (reserved != null) {
            cVar.bindLong(7, reserved.booleanValue() ? 1L : 0L);
        }
        Boolean todayReminder = cricketGame.getTodayReminder();
        if (todayReminder != null) {
            cVar.bindLong(8, todayReminder.booleanValue() ? 1L : 0L);
        }
        Boolean gameStartReminder = cricketGame.getGameStartReminder();
        if (gameStartReminder != null) {
            cVar.bindLong(9, gameStartReminder.booleanValue() ? 1L : 0L);
        }
        Boolean gameEndReminder = cricketGame.getGameEndReminder();
        if (gameEndReminder != null) {
            cVar.bindLong(10, gameEndReminder.booleanValue() ? 1L : 0L);
        }
    }

    @Override // org.greenrobot.greendao.a
    public CricketGame readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Long valueOf5 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf6 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        String string = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        Long valueOf7 = cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11));
        int i12 = i8 + 4;
        Long valueOf8 = cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12));
        int i13 = i8 + 5;
        String string2 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i8 + 6;
        if (cursor.isNull(i14)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i14) != 0);
        }
        int i15 = i8 + 7;
        if (cursor.isNull(i15)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        int i16 = i8 + 8;
        if (cursor.isNull(i16)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        int i17 = i8 + 9;
        if (cursor.isNull(i17)) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(cursor.getShort(i17) != 0);
        }
        return new CricketGame(valueOf5, valueOf6, string, valueOf7, valueOf8, string2, valueOf, valueOf2, valueOf3, valueOf4);
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, CricketGame cricketGame, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean bool = null;
        cricketGame.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        cricketGame.setGameId(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        cricketGame.setTitle(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        cricketGame.setStartTimestamp(cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11)));
        int i12 = i8 + 4;
        cricketGame.setEndTimestamp(cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
        int i13 = i8 + 5;
        cricketGame.setTeams(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i8 + 6;
        if (cursor.isNull(i14)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i14) != 0);
        }
        cricketGame.setReserved(valueOf);
        int i15 = i8 + 7;
        if (cursor.isNull(i15)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        cricketGame.setTodayReminder(valueOf2);
        int i16 = i8 + 8;
        if (cursor.isNull(i16)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        cricketGame.setGameStartReminder(valueOf3);
        int i17 = i8 + 9;
        if (!cursor.isNull(i17)) {
            bool = Boolean.valueOf(cursor.getShort(i17) != 0);
        }
        cricketGame.setGameEndReminder(bool);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, CricketGame cricketGame) {
        sQLiteStatement.clearBindings();
        Long id = cricketGame.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (cricketGame.getGameId() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        String title = cricketGame.getTitle();
        if (title != null) {
            sQLiteStatement.bindString(3, title);
        }
        Long startTimestamp = cricketGame.getStartTimestamp();
        if (startTimestamp != null) {
            sQLiteStatement.bindLong(4, startTimestamp.longValue());
        }
        Long endTimestamp = cricketGame.getEndTimestamp();
        if (endTimestamp != null) {
            sQLiteStatement.bindLong(5, endTimestamp.longValue());
        }
        String teams = cricketGame.getTeams();
        if (teams != null) {
            sQLiteStatement.bindString(6, teams);
        }
        Boolean reserved = cricketGame.getReserved();
        if (reserved != null) {
            sQLiteStatement.bindLong(7, reserved.booleanValue() ? 1L : 0L);
        }
        Boolean todayReminder = cricketGame.getTodayReminder();
        if (todayReminder != null) {
            sQLiteStatement.bindLong(8, todayReminder.booleanValue() ? 1L : 0L);
        }
        Boolean gameStartReminder = cricketGame.getGameStartReminder();
        if (gameStartReminder != null) {
            sQLiteStatement.bindLong(9, gameStartReminder.booleanValue() ? 1L : 0L);
        }
        Boolean gameEndReminder = cricketGame.getGameEndReminder();
        if (gameEndReminder != null) {
            sQLiteStatement.bindLong(10, gameEndReminder.booleanValue() ? 1L : 0L);
        }
    }
}
