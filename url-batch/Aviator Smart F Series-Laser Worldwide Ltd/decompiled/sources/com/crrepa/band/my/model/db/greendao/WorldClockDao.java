package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.WorldClock;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import d2.c;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class WorldClockDao extends a {
    public static final String TABLENAME = "WORLD_CLOCK";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f ClockId = new f(1, Integer.class, "clockId", false, "CLOCK_ID");
        public static final f TimeZone = new f(2, Integer.class, "timeZone", false, "TIME_ZONE");
        public static final f Longitude = new f(3, Double.class, c.XML_TAG_LONGITUDE, false, "LONGITUDE");
        public static final f Latitude = new f(4, Double.class, c.XML_TAG_LATITUDE, false, "LATITUDE");
        public static final f JetLag = new f(5, Integer.class, "jetLag", false, "JET_LAG");
        public static final f CityKey = new f(6, String.class, "cityKey", false, "CITY_KEY");
        public static final f TimeZoneIdentifier = new f(7, String.class, c.XML_TAG_IDENTIFIER, false, "TIME_ZONE_IDENTIFIER");
    }

    public WorldClockDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"WORLD_CLOCK\" (\"_id\" INTEGER PRIMARY KEY ,\"CLOCK_ID\" INTEGER,\"TIME_ZONE\" INTEGER,\"LONGITUDE\" REAL,\"LATITUDE\" REAL,\"JET_LAG\" INTEGER,\"CITY_KEY\" TEXT,\"TIME_ZONE_IDENTIFIER\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"WORLD_CLOCK\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public WorldClockDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(WorldClock worldClock) {
        if (worldClock != null) {
            return worldClock.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(WorldClock worldClock) {
        return worldClock.getId() != null;
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
    public final Long updateKeyAfterInsert(WorldClock worldClock, long j8) {
        worldClock.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.c cVar, WorldClock worldClock) {
        cVar.clearBindings();
        Long id = worldClock.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (worldClock.getClockId() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        if (worldClock.getTimeZone() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        Double longitude = worldClock.getLongitude();
        if (longitude != null) {
            cVar.bindDouble(4, longitude.doubleValue());
        }
        Double latitude = worldClock.getLatitude();
        if (latitude != null) {
            cVar.bindDouble(5, latitude.doubleValue());
        }
        if (worldClock.getJetLag() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        String cityKey = worldClock.getCityKey();
        if (cityKey != null) {
            cVar.bindString(7, cityKey);
        }
        String timeZoneIdentifier = worldClock.getTimeZoneIdentifier();
        if (timeZoneIdentifier != null) {
            cVar.bindString(8, timeZoneIdentifier);
        }
    }

    @Override // org.greenrobot.greendao.a
    public WorldClock readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        Integer valueOf3 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        Double valueOf4 = cursor.isNull(i11) ? null : Double.valueOf(cursor.getDouble(i11));
        int i12 = i8 + 4;
        Double valueOf5 = cursor.isNull(i12) ? null : Double.valueOf(cursor.getDouble(i12));
        int i13 = i8 + 5;
        Integer valueOf6 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 6;
        int i15 = i8 + 7;
        return new WorldClock(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, cursor.isNull(i14) ? null : cursor.getString(i14), cursor.isNull(i15) ? null : cursor.getString(i15));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, WorldClock worldClock, int i8) {
        worldClock.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        worldClock.setClockId(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        worldClock.setTimeZone(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        worldClock.setLongitude(cursor.isNull(i11) ? null : Double.valueOf(cursor.getDouble(i11)));
        int i12 = i8 + 4;
        worldClock.setLatitude(cursor.isNull(i12) ? null : Double.valueOf(cursor.getDouble(i12)));
        int i13 = i8 + 5;
        worldClock.setJetLag(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        worldClock.setCityKey(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i8 + 7;
        worldClock.setTimeZoneIdentifier(cursor.isNull(i15) ? null : cursor.getString(i15));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, WorldClock worldClock) {
        sQLiteStatement.clearBindings();
        Long id = worldClock.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (worldClock.getClockId() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        if (worldClock.getTimeZone() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        Double longitude = worldClock.getLongitude();
        if (longitude != null) {
            sQLiteStatement.bindDouble(4, longitude.doubleValue());
        }
        Double latitude = worldClock.getLatitude();
        if (latitude != null) {
            sQLiteStatement.bindDouble(5, latitude.doubleValue());
        }
        if (worldClock.getJetLag() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        String cityKey = worldClock.getCityKey();
        if (cityKey != null) {
            sQLiteStatement.bindString(7, cityKey);
        }
        String timeZoneIdentifier = worldClock.getTimeZoneIdentifier();
        if (timeZoneIdentifier != null) {
            sQLiteStatement.bindString(8, timeZoneIdentifier);
        }
    }
}
