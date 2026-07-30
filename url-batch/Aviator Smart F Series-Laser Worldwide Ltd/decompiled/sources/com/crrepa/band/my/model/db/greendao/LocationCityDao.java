package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.LocationCity;
import com.google.android.gms.maps.model.FeatureType;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import d2.c;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class LocationCityDao extends a {
    public static final String TABLENAME = "LOCATION_CITY";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f City = new f(1, String.class, "city", false, "CITY");
        public static final f Country = new f(2, String.class, "country", false, FeatureType.COUNTRY);
        public static final f Latitude = new f(3, Double.class, c.XML_TAG_LATITUDE, false, "LATITUDE");
        public static final f Longitude = new f(4, Double.class, c.XML_TAG_LONGITUDE, false, "LONGITUDE");
        public static final f Woeid = new f(5, Integer.class, "woeid", false, "WOEID");
        public static final f Type = new f(6, Integer.class, "type", false, "TYPE");
    }

    public LocationCityDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"LOCATION_CITY\" (\"_id\" INTEGER PRIMARY KEY ,\"CITY\" TEXT,\"COUNTRY\" TEXT,\"LATITUDE\" REAL,\"LONGITUDE\" REAL,\"WOEID\" INTEGER,\"TYPE\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"LOCATION_CITY\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public LocationCityDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(LocationCity locationCity) {
        if (locationCity != null) {
            return locationCity.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(LocationCity locationCity) {
        return locationCity.getId() != null;
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
    public final Long updateKeyAfterInsert(LocationCity locationCity, long j8) {
        locationCity.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.c cVar, LocationCity locationCity) {
        cVar.clearBindings();
        Long id = locationCity.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String city = locationCity.getCity();
        if (city != null) {
            cVar.bindString(2, city);
        }
        String country = locationCity.getCountry();
        if (country != null) {
            cVar.bindString(3, country);
        }
        Double latitude = locationCity.getLatitude();
        if (latitude != null) {
            cVar.bindDouble(4, latitude.doubleValue());
        }
        Double longitude = locationCity.getLongitude();
        if (longitude != null) {
            cVar.bindDouble(5, longitude.doubleValue());
        }
        if (locationCity.getWoeid() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (locationCity.getType() != null) {
            cVar.bindLong(7, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public LocationCity readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i8 + 2;
        String string2 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        Double valueOf2 = cursor.isNull(i11) ? null : Double.valueOf(cursor.getDouble(i11));
        int i12 = i8 + 4;
        Double valueOf3 = cursor.isNull(i12) ? null : Double.valueOf(cursor.getDouble(i12));
        int i13 = i8 + 5;
        int i14 = i8 + 6;
        return new LocationCity(valueOf, string, string2, valueOf2, valueOf3, cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)), cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, LocationCity locationCity, int i8) {
        locationCity.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        locationCity.setCity(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        locationCity.setCountry(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        locationCity.setLatitude(cursor.isNull(i11) ? null : Double.valueOf(cursor.getDouble(i11)));
        int i12 = i8 + 4;
        locationCity.setLongitude(cursor.isNull(i12) ? null : Double.valueOf(cursor.getDouble(i12)));
        int i13 = i8 + 5;
        locationCity.setWoeid(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        locationCity.setType(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, LocationCity locationCity) {
        sQLiteStatement.clearBindings();
        Long id = locationCity.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String city = locationCity.getCity();
        if (city != null) {
            sQLiteStatement.bindString(2, city);
        }
        String country = locationCity.getCountry();
        if (country != null) {
            sQLiteStatement.bindString(3, country);
        }
        Double latitude = locationCity.getLatitude();
        if (latitude != null) {
            sQLiteStatement.bindDouble(4, latitude.doubleValue());
        }
        Double longitude = locationCity.getLongitude();
        if (longitude != null) {
            sQLiteStatement.bindDouble(5, longitude.doubleValue());
        }
        if (locationCity.getWoeid() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (locationCity.getType() != null) {
            sQLiteStatement.bindLong(7, r6.intValue());
        }
    }
}
