package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.crrepa.band.my.model.db.BandConfig;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class BandConfigDao extends a {
    public static final String TABLENAME = "BAND_CONFIG";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f BandId = new f(1, Integer.class, "bandId", false, "BAND_ID");
        public static final f BroadcastName = new f(2, String.class, "broadcastName", false, "BROADCAST_NAME");
        public static final f FirmwareType = new f(3, String.class, "firmwareType", false, "FIRMWARE_TYPE");
        public static final f Icon = new f(4, String.class, "icon", false, "ICON");
        public static final f Screens = new f(5, String.class, "screens", false, "SCREENS");
        public static final f ScreensConfig = new f(6, String.class, "screensConfig", false, "SCREENS_CONFIG");
        public static final f Pid = new f(7, Integer.class, MapBundleKey.MapObjKey.OBJ_SS_ARROW_PANOID, false, "PID");
        public static final f DyHeart = new f(8, Boolean.class, "dyHeart", false, "DY_HEART");
        public static final f AllDayHeart = new f(9, Boolean.class, "allDayHeart", false, "ALL_DAY_HEART");
        public static final f OnceHeart = new f(10, Boolean.class, "onceHeart", false, "ONCE_HEART");
        public static final f SportsMode = new f(11, Integer.class, "sportsMode", false, "SPORTS_MODE");
        public static final f Bp = new f(12, Boolean.class, "bp", false, "BP");
        public static final f Bo = new f(13, Boolean.class, "bo", false, "BO");
        public static final f ScreenSwitch = new f(14, Boolean.class, "screenSwitch", false, "SCREEN_SWITCH");
        public static final f Function = new f(15, Boolean.class, "function", false, "FUNCTION");
        public static final f Guide = new f(16, Boolean.class, "guide", false, "GUIDE");
        public static final f Weather = new f(17, Boolean.class, "weather", false, WeatherDao.TABLENAME);
        public static final f Enable = new f(18, Boolean.class, "enable", false, "ENABLE");
        public static final f UpdateTime = new f(19, Long.class, "updateTime", false, "UPDATE_TIME");
        public static final f Lcm = new f(20, Integer.class, "lcm", false, "LCM");
        public static final f Ecg = new f(21, Integer.class, "ecg", false, EcgDao.TABLENAME);
        public static final f Languages = new f(22, String.class, "languages", false, "LANGUAGES");
        public static final f Mcu = new f(23, Integer.class, "mcu", false, "MCU");
        public static final f WatchFaceStore = new f(24, Boolean.class, "watchFaceStore", false, "WATCH_FACE_STORE");
        public static final f ExtendMenu = new f(25, String.class, "extendMenu", false, "EXTEND_MENU");
        public static final f McuPlatform = new f(26, String.class, "mcuPlatform", false, "MCU_PLATFORM");
        public static final f Shape = new f(27, Integer.class, "shape", false, "SHAPE");
        public static final f FaceNumber = new f(28, Integer.class, "faceNumber", false, "FACE_NUMBER");
    }

    public BandConfigDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"BAND_CONFIG\" (\"_id\" INTEGER PRIMARY KEY ,\"BAND_ID\" INTEGER,\"BROADCAST_NAME\" TEXT,\"FIRMWARE_TYPE\" TEXT,\"ICON\" TEXT,\"SCREENS\" TEXT,\"SCREENS_CONFIG\" TEXT,\"PID\" INTEGER,\"DY_HEART\" INTEGER,\"ALL_DAY_HEART\" INTEGER,\"ONCE_HEART\" INTEGER,\"SPORTS_MODE\" INTEGER,\"BP\" INTEGER,\"BO\" INTEGER,\"SCREEN_SWITCH\" INTEGER,\"FUNCTION\" INTEGER,\"GUIDE\" INTEGER,\"WEATHER\" INTEGER,\"ENABLE\" INTEGER,\"UPDATE_TIME\" INTEGER,\"LCM\" INTEGER,\"ECG\" INTEGER,\"LANGUAGES\" TEXT,\"MCU\" INTEGER,\"WATCH_FACE_STORE\" INTEGER,\"EXTEND_MENU\" TEXT,\"MCU_PLATFORM\" TEXT,\"SHAPE\" INTEGER,\"FACE_NUMBER\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"BAND_CONFIG\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public BandConfigDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(BandConfig bandConfig) {
        if (bandConfig != null) {
            return bandConfig.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(BandConfig bandConfig) {
        return bandConfig.getId() != null;
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
    public final Long updateKeyAfterInsert(BandConfig bandConfig, long j8) {
        bandConfig.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, BandConfig bandConfig) {
        cVar.clearBindings();
        Long id = bandConfig.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (bandConfig.getBandId() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        String broadcastName = bandConfig.getBroadcastName();
        if (broadcastName != null) {
            cVar.bindString(3, broadcastName);
        }
        String firmwareType = bandConfig.getFirmwareType();
        if (firmwareType != null) {
            cVar.bindString(4, firmwareType);
        }
        String icon = bandConfig.getIcon();
        if (icon != null) {
            cVar.bindString(5, icon);
        }
        String screens = bandConfig.getScreens();
        if (screens != null) {
            cVar.bindString(6, screens);
        }
        String screensConfig = bandConfig.getScreensConfig();
        if (screensConfig != null) {
            cVar.bindString(7, screensConfig);
        }
        if (bandConfig.getPid() != null) {
            cVar.bindLong(8, r0.intValue());
        }
        Boolean dyHeart = bandConfig.getDyHeart();
        if (dyHeart != null) {
            cVar.bindLong(9, dyHeart.booleanValue() ? 1L : 0L);
        }
        Boolean allDayHeart = bandConfig.getAllDayHeart();
        if (allDayHeart != null) {
            cVar.bindLong(10, allDayHeart.booleanValue() ? 1L : 0L);
        }
        Boolean onceHeart = bandConfig.getOnceHeart();
        if (onceHeart != null) {
            cVar.bindLong(11, onceHeart.booleanValue() ? 1L : 0L);
        }
        if (bandConfig.getSportsMode() != null) {
            cVar.bindLong(12, r0.intValue());
        }
        Boolean bp = bandConfig.getBp();
        if (bp != null) {
            cVar.bindLong(13, bp.booleanValue() ? 1L : 0L);
        }
        Boolean bo = bandConfig.getBo();
        if (bo != null) {
            cVar.bindLong(14, bo.booleanValue() ? 1L : 0L);
        }
        Boolean screenSwitch = bandConfig.getScreenSwitch();
        if (screenSwitch != null) {
            cVar.bindLong(15, screenSwitch.booleanValue() ? 1L : 0L);
        }
        Boolean function = bandConfig.getFunction();
        if (function != null) {
            cVar.bindLong(16, function.booleanValue() ? 1L : 0L);
        }
        Boolean guide = bandConfig.getGuide();
        if (guide != null) {
            cVar.bindLong(17, guide.booleanValue() ? 1L : 0L);
        }
        Boolean weather = bandConfig.getWeather();
        if (weather != null) {
            cVar.bindLong(18, weather.booleanValue() ? 1L : 0L);
        }
        Boolean enable = bandConfig.getEnable();
        if (enable != null) {
            cVar.bindLong(19, enable.booleanValue() ? 1L : 0L);
        }
        Long updateTime = bandConfig.getUpdateTime();
        if (updateTime != null) {
            cVar.bindLong(20, updateTime.longValue());
        }
        if (bandConfig.getLcm() != null) {
            cVar.bindLong(21, r0.intValue());
        }
        if (bandConfig.getEcg() != null) {
            cVar.bindLong(22, r0.intValue());
        }
        String languages = bandConfig.getLanguages();
        if (languages != null) {
            cVar.bindString(23, languages);
        }
        if (bandConfig.getMcu() != null) {
            cVar.bindLong(24, r0.intValue());
        }
        Boolean watchFaceStore = bandConfig.getWatchFaceStore();
        if (watchFaceStore != null) {
            cVar.bindLong(25, watchFaceStore.booleanValue() ? 1L : 0L);
        }
        String extendMenu = bandConfig.getExtendMenu();
        if (extendMenu != null) {
            cVar.bindString(26, extendMenu);
        }
        String mcuPlatform = bandConfig.getMcuPlatform();
        if (mcuPlatform != null) {
            cVar.bindString(27, mcuPlatform);
        }
        if (bandConfig.getShape() != null) {
            cVar.bindLong(28, r0.intValue());
        }
        if (bandConfig.getFaceNumber() != null) {
            cVar.bindLong(29, r10.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public BandConfig readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        Boolean valueOf6;
        Boolean valueOf7;
        Boolean valueOf8;
        Boolean valueOf9;
        Boolean valueOf10;
        Boolean valueOf11;
        Long valueOf12 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf13 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        String string = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        String string2 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i8 + 4;
        String string3 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i8 + 5;
        String string4 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i8 + 6;
        String string5 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i8 + 7;
        Integer valueOf14 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i8 + 8;
        if (cursor.isNull(i16)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        int i17 = i8 + 9;
        if (cursor.isNull(i17)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i17) != 0);
        }
        int i18 = i8 + 10;
        if (cursor.isNull(i18)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i18) != 0);
        }
        int i19 = i8 + 11;
        Integer valueOf15 = cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19));
        int i20 = i8 + 12;
        if (cursor.isNull(i20)) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(cursor.getShort(i20) != 0);
        }
        int i21 = i8 + 13;
        if (cursor.isNull(i21)) {
            valueOf5 = null;
        } else {
            valueOf5 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        int i22 = i8 + 14;
        if (cursor.isNull(i22)) {
            valueOf6 = null;
        } else {
            valueOf6 = Boolean.valueOf(cursor.getShort(i22) != 0);
        }
        int i23 = i8 + 15;
        if (cursor.isNull(i23)) {
            valueOf7 = null;
        } else {
            valueOf7 = Boolean.valueOf(cursor.getShort(i23) != 0);
        }
        int i24 = i8 + 16;
        if (cursor.isNull(i24)) {
            valueOf8 = null;
        } else {
            valueOf8 = Boolean.valueOf(cursor.getShort(i24) != 0);
        }
        int i25 = i8 + 17;
        if (cursor.isNull(i25)) {
            valueOf9 = null;
        } else {
            valueOf9 = Boolean.valueOf(cursor.getShort(i25) != 0);
        }
        int i26 = i8 + 18;
        if (cursor.isNull(i26)) {
            valueOf10 = null;
        } else {
            valueOf10 = Boolean.valueOf(cursor.getShort(i26) != 0);
        }
        int i27 = i8 + 19;
        Long valueOf16 = cursor.isNull(i27) ? null : Long.valueOf(cursor.getLong(i27));
        int i28 = i8 + 20;
        Integer valueOf17 = cursor.isNull(i28) ? null : Integer.valueOf(cursor.getInt(i28));
        int i29 = i8 + 21;
        Integer valueOf18 = cursor.isNull(i29) ? null : Integer.valueOf(cursor.getInt(i29));
        int i30 = i8 + 22;
        String string6 = cursor.isNull(i30) ? null : cursor.getString(i30);
        int i31 = i8 + 23;
        Integer valueOf19 = cursor.isNull(i31) ? null : Integer.valueOf(cursor.getInt(i31));
        int i32 = i8 + 24;
        if (cursor.isNull(i32)) {
            valueOf11 = null;
        } else {
            valueOf11 = Boolean.valueOf(cursor.getShort(i32) != 0);
        }
        int i33 = i8 + 25;
        String string7 = cursor.isNull(i33) ? null : cursor.getString(i33);
        int i34 = i8 + 26;
        String string8 = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i8 + 27;
        Integer valueOf20 = cursor.isNull(i35) ? null : Integer.valueOf(cursor.getInt(i35));
        int i36 = i8 + 28;
        return new BandConfig(valueOf12, valueOf13, string, string2, string3, string4, string5, valueOf14, valueOf, valueOf2, valueOf3, valueOf15, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf16, valueOf17, valueOf18, string6, valueOf19, valueOf11, string7, string8, valueOf20, cursor.isNull(i36) ? null : Integer.valueOf(cursor.getInt(i36)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, BandConfig bandConfig, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        Boolean valueOf6;
        Boolean valueOf7;
        Boolean valueOf8;
        Boolean valueOf9;
        Boolean valueOf10;
        Boolean valueOf11;
        bandConfig.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        bandConfig.setBandId(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        bandConfig.setBroadcastName(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        bandConfig.setFirmwareType(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i8 + 4;
        bandConfig.setIcon(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i8 + 5;
        bandConfig.setScreens(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i8 + 6;
        bandConfig.setScreensConfig(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i8 + 7;
        bandConfig.setPid(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i8 + 8;
        if (cursor.isNull(i16)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        bandConfig.setDyHeart(valueOf);
        int i17 = i8 + 9;
        if (cursor.isNull(i17)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i17) != 0);
        }
        bandConfig.setAllDayHeart(valueOf2);
        int i18 = i8 + 10;
        if (cursor.isNull(i18)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i18) != 0);
        }
        bandConfig.setOnceHeart(valueOf3);
        int i19 = i8 + 11;
        bandConfig.setSportsMode(cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)));
        int i20 = i8 + 12;
        if (cursor.isNull(i20)) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(cursor.getShort(i20) != 0);
        }
        bandConfig.setBp(valueOf4);
        int i21 = i8 + 13;
        if (cursor.isNull(i21)) {
            valueOf5 = null;
        } else {
            valueOf5 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        bandConfig.setBo(valueOf5);
        int i22 = i8 + 14;
        if (cursor.isNull(i22)) {
            valueOf6 = null;
        } else {
            valueOf6 = Boolean.valueOf(cursor.getShort(i22) != 0);
        }
        bandConfig.setScreenSwitch(valueOf6);
        int i23 = i8 + 15;
        if (cursor.isNull(i23)) {
            valueOf7 = null;
        } else {
            valueOf7 = Boolean.valueOf(cursor.getShort(i23) != 0);
        }
        bandConfig.setFunction(valueOf7);
        int i24 = i8 + 16;
        if (cursor.isNull(i24)) {
            valueOf8 = null;
        } else {
            valueOf8 = Boolean.valueOf(cursor.getShort(i24) != 0);
        }
        bandConfig.setGuide(valueOf8);
        int i25 = i8 + 17;
        if (cursor.isNull(i25)) {
            valueOf9 = null;
        } else {
            valueOf9 = Boolean.valueOf(cursor.getShort(i25) != 0);
        }
        bandConfig.setWeather(valueOf9);
        int i26 = i8 + 18;
        if (cursor.isNull(i26)) {
            valueOf10 = null;
        } else {
            valueOf10 = Boolean.valueOf(cursor.getShort(i26) != 0);
        }
        bandConfig.setEnable(valueOf10);
        int i27 = i8 + 19;
        bandConfig.setUpdateTime(cursor.isNull(i27) ? null : Long.valueOf(cursor.getLong(i27)));
        int i28 = i8 + 20;
        bandConfig.setLcm(cursor.isNull(i28) ? null : Integer.valueOf(cursor.getInt(i28)));
        int i29 = i8 + 21;
        bandConfig.setEcg(cursor.isNull(i29) ? null : Integer.valueOf(cursor.getInt(i29)));
        int i30 = i8 + 22;
        bandConfig.setLanguages(cursor.isNull(i30) ? null : cursor.getString(i30));
        int i31 = i8 + 23;
        bandConfig.setMcu(cursor.isNull(i31) ? null : Integer.valueOf(cursor.getInt(i31)));
        int i32 = i8 + 24;
        if (cursor.isNull(i32)) {
            valueOf11 = null;
        } else {
            valueOf11 = Boolean.valueOf(cursor.getShort(i32) != 0);
        }
        bandConfig.setWatchFaceStore(valueOf11);
        int i33 = i8 + 25;
        bandConfig.setExtendMenu(cursor.isNull(i33) ? null : cursor.getString(i33));
        int i34 = i8 + 26;
        bandConfig.setMcuPlatform(cursor.isNull(i34) ? null : cursor.getString(i34));
        int i35 = i8 + 27;
        bandConfig.setShape(cursor.isNull(i35) ? null : Integer.valueOf(cursor.getInt(i35)));
        int i36 = i8 + 28;
        bandConfig.setFaceNumber(cursor.isNull(i36) ? null : Integer.valueOf(cursor.getInt(i36)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, BandConfig bandConfig) {
        sQLiteStatement.clearBindings();
        Long id = bandConfig.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (bandConfig.getBandId() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        String broadcastName = bandConfig.getBroadcastName();
        if (broadcastName != null) {
            sQLiteStatement.bindString(3, broadcastName);
        }
        String firmwareType = bandConfig.getFirmwareType();
        if (firmwareType != null) {
            sQLiteStatement.bindString(4, firmwareType);
        }
        String icon = bandConfig.getIcon();
        if (icon != null) {
            sQLiteStatement.bindString(5, icon);
        }
        String screens = bandConfig.getScreens();
        if (screens != null) {
            sQLiteStatement.bindString(6, screens);
        }
        String screensConfig = bandConfig.getScreensConfig();
        if (screensConfig != null) {
            sQLiteStatement.bindString(7, screensConfig);
        }
        if (bandConfig.getPid() != null) {
            sQLiteStatement.bindLong(8, r0.intValue());
        }
        Boolean dyHeart = bandConfig.getDyHeart();
        if (dyHeart != null) {
            sQLiteStatement.bindLong(9, dyHeart.booleanValue() ? 1L : 0L);
        }
        Boolean allDayHeart = bandConfig.getAllDayHeart();
        if (allDayHeart != null) {
            sQLiteStatement.bindLong(10, allDayHeart.booleanValue() ? 1L : 0L);
        }
        Boolean onceHeart = bandConfig.getOnceHeart();
        if (onceHeart != null) {
            sQLiteStatement.bindLong(11, onceHeart.booleanValue() ? 1L : 0L);
        }
        if (bandConfig.getSportsMode() != null) {
            sQLiteStatement.bindLong(12, r0.intValue());
        }
        Boolean bp = bandConfig.getBp();
        if (bp != null) {
            sQLiteStatement.bindLong(13, bp.booleanValue() ? 1L : 0L);
        }
        Boolean bo = bandConfig.getBo();
        if (bo != null) {
            sQLiteStatement.bindLong(14, bo.booleanValue() ? 1L : 0L);
        }
        Boolean screenSwitch = bandConfig.getScreenSwitch();
        if (screenSwitch != null) {
            sQLiteStatement.bindLong(15, screenSwitch.booleanValue() ? 1L : 0L);
        }
        Boolean function = bandConfig.getFunction();
        if (function != null) {
            sQLiteStatement.bindLong(16, function.booleanValue() ? 1L : 0L);
        }
        Boolean guide = bandConfig.getGuide();
        if (guide != null) {
            sQLiteStatement.bindLong(17, guide.booleanValue() ? 1L : 0L);
        }
        Boolean weather = bandConfig.getWeather();
        if (weather != null) {
            sQLiteStatement.bindLong(18, weather.booleanValue() ? 1L : 0L);
        }
        Boolean enable = bandConfig.getEnable();
        if (enable != null) {
            sQLiteStatement.bindLong(19, enable.booleanValue() ? 1L : 0L);
        }
        Long updateTime = bandConfig.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(20, updateTime.longValue());
        }
        if (bandConfig.getLcm() != null) {
            sQLiteStatement.bindLong(21, r0.intValue());
        }
        if (bandConfig.getEcg() != null) {
            sQLiteStatement.bindLong(22, r0.intValue());
        }
        String languages = bandConfig.getLanguages();
        if (languages != null) {
            sQLiteStatement.bindString(23, languages);
        }
        if (bandConfig.getMcu() != null) {
            sQLiteStatement.bindLong(24, r0.intValue());
        }
        Boolean watchFaceStore = bandConfig.getWatchFaceStore();
        if (watchFaceStore != null) {
            sQLiteStatement.bindLong(25, watchFaceStore.booleanValue() ? 1L : 0L);
        }
        String extendMenu = bandConfig.getExtendMenu();
        if (extendMenu != null) {
            sQLiteStatement.bindString(26, extendMenu);
        }
        String mcuPlatform = bandConfig.getMcuPlatform();
        if (mcuPlatform != null) {
            sQLiteStatement.bindString(27, mcuPlatform);
        }
        if (bandConfig.getShape() != null) {
            sQLiteStatement.bindLong(28, r0.intValue());
        }
        if (bandConfig.getFaceNumber() != null) {
            sQLiteStatement.bindLong(29, r10.intValue());
        }
    }
}
