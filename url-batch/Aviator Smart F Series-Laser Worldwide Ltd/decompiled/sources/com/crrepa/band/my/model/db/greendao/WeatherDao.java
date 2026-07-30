package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Weather;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class WeatherDao extends a {
    public static final String TABLENAME = "WEATHER";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f City = new f(1, String.class, "city", false, "CITY");
        public static final f Date = new f(2, Date.class, "date", false, "DATE");
        public static final f Weather = new f(3, String.class, "weather", false, WeatherDao.TABLENAME);
        public static final f Forecast = new f(4, Boolean.class, "forecast", false, "FORECAST");
    }

    public WeatherDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"WEATHER\" (\"_id\" INTEGER PRIMARY KEY ,\"CITY\" TEXT,\"DATE\" INTEGER,\"WEATHER\" TEXT,\"FORECAST\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"WEATHER\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public WeatherDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Weather weather) {
        if (weather != null) {
            return weather.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Weather weather) {
        return weather.getId() != null;
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
    public final Long updateKeyAfterInsert(Weather weather, long j8) {
        weather.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Weather weather) {
        cVar.clearBindings();
        Long id = weather.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String city = weather.getCity();
        if (city != null) {
            cVar.bindString(2, city);
        }
        Date date = weather.getDate();
        if (date != null) {
            cVar.bindLong(3, date.getTime());
        }
        String weather2 = weather.getWeather();
        if (weather2 != null) {
            cVar.bindString(4, weather2);
        }
        Boolean forecast = weather.getForecast();
        if (forecast != null) {
            cVar.bindLong(5, forecast.booleanValue() ? 1L : 0L);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Weather readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i8 + 2;
        Date date = cursor.isNull(i10) ? null : new Date(cursor.getLong(i10));
        int i11 = i8 + 3;
        String string2 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i8 + 4;
        if (cursor.isNull(i12)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        return new Weather(valueOf2, string, date, string2, valueOf);
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Weather weather, int i8) {
        Boolean bool = null;
        weather.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        weather.setCity(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        weather.setDate(cursor.isNull(i10) ? null : new Date(cursor.getLong(i10)));
        int i11 = i8 + 3;
        weather.setWeather(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i8 + 4;
        if (!cursor.isNull(i12)) {
            bool = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        weather.setForecast(bool);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Weather weather) {
        sQLiteStatement.clearBindings();
        Long id = weather.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String city = weather.getCity();
        if (city != null) {
            sQLiteStatement.bindString(2, city);
        }
        Date date = weather.getDate();
        if (date != null) {
            sQLiteStatement.bindLong(3, date.getTime());
        }
        String weather2 = weather.getWeather();
        if (weather2 != null) {
            sQLiteStatement.bindString(4, weather2);
        }
        Boolean forecast = weather.getForecast();
        if (forecast != null) {
            sQLiteStatement.bindLong(5, forecast.booleanValue() ? 1L : 0L);
        }
    }
}
