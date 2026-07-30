package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.arthenica.ffmpegkit.x;
import com.crrepa.band.my.model.db.WatchFace;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class WatchFaceDao extends a {
    public static final String TABLENAME = "WATCH_FACE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f BroadcastName = new f(1, String.class, "broadcastName", false, "BROADCAST_NAME");
        public static final f Index = new f(2, Integer.class, "index", false, "INDEX");
        public static final f TimePosition = new f(3, Integer.class, "timePosition", false, "TIME_POSITION");
        public static final f TimeTopContent = new f(4, Integer.class, "timeTopContent", false, "TIME_TOP_CONTENT");
        public static final f TimeBottomComtent = new f(5, Integer.class, "timeBottomComtent", false, "TIME_BOTTOM_COMTENT");
        public static final f TextColor = new f(6, Integer.class, "textColor", false, "TEXT_COLOR");
        public static final f Md5 = new f(7, String.class, "md5", false, "MD5");
        public static final f Height = new f(8, Integer.class, x.KEY_HEIGHT, false, "HEIGHT");
        public static final f Width = new f(9, Integer.class, x.KEY_WIDTH, false, "WIDTH");
        public static final f ThumHeight = new f(10, Integer.class, "thumHeight", false, "THUM_HEIGHT");
        public static final f ThumWidth = new f(11, Integer.class, "thumWidth", false, "THUM_WIDTH");
        public static final f CompressionType = new f(12, Integer.class, "compressionType", false, "COMPRESSION_TYPE");
        public static final f Type = new f(13, Integer.class, "type", false, "TYPE");
    }

    public WatchFaceDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"WATCH_FACE\" (\"_id\" INTEGER PRIMARY KEY ,\"BROADCAST_NAME\" TEXT,\"INDEX\" INTEGER,\"TIME_POSITION\" INTEGER,\"TIME_TOP_CONTENT\" INTEGER,\"TIME_BOTTOM_COMTENT\" INTEGER,\"TEXT_COLOR\" INTEGER,\"MD5\" TEXT,\"HEIGHT\" INTEGER,\"WIDTH\" INTEGER,\"THUM_HEIGHT\" INTEGER,\"THUM_WIDTH\" INTEGER,\"COMPRESSION_TYPE\" INTEGER,\"TYPE\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"WATCH_FACE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public WatchFaceDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(WatchFace watchFace) {
        if (watchFace != null) {
            return watchFace.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(WatchFace watchFace) {
        return watchFace.getId() != null;
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
    public final Long updateKeyAfterInsert(WatchFace watchFace, long j8) {
        watchFace.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, WatchFace watchFace) {
        cVar.clearBindings();
        Long id = watchFace.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String broadcastName = watchFace.getBroadcastName();
        if (broadcastName != null) {
            cVar.bindString(2, broadcastName);
        }
        if (watchFace.getIndex() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        if (watchFace.getTimePosition() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (watchFace.getTimeTopContent() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (watchFace.getTimeBottomComtent() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (watchFace.getTextColor() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        String md5 = watchFace.getMd5();
        if (md5 != null) {
            cVar.bindString(8, md5);
        }
        if (watchFace.getHeight() != null) {
            cVar.bindLong(9, r0.intValue());
        }
        if (watchFace.getWidth() != null) {
            cVar.bindLong(10, r0.intValue());
        }
        if (watchFace.getThumHeight() != null) {
            cVar.bindLong(11, r0.intValue());
        }
        if (watchFace.getThumWidth() != null) {
            cVar.bindLong(12, r0.intValue());
        }
        if (watchFace.getCompressionType() != null) {
            cVar.bindLong(13, r0.intValue());
        }
        if (watchFace.getType() != null) {
            cVar.bindLong(14, r6.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public WatchFace readEntity(Cursor cursor, int i8) {
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = i8 + 3;
        int i12 = i8 + 4;
        int i13 = i8 + 5;
        int i14 = i8 + 6;
        int i15 = i8 + 7;
        int i16 = i8 + 8;
        int i17 = i8 + 9;
        int i18 = i8 + 10;
        int i19 = i8 + 11;
        int i20 = i8 + 12;
        int i21 = i8 + 13;
        return new WatchFace(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)), cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)), cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)), cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)), cursor.isNull(i15) ? null : cursor.getString(i15), cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)), cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)), cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)), cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)), cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)), cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, WatchFace watchFace, int i8) {
        watchFace.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        watchFace.setBroadcastName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        watchFace.setIndex(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        watchFace.setTimePosition(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        watchFace.setTimeTopContent(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        watchFace.setTimeBottomComtent(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        watchFace.setTextColor(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 7;
        watchFace.setMd5(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i8 + 8;
        watchFace.setHeight(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i8 + 9;
        watchFace.setWidth(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i8 + 10;
        watchFace.setThumHeight(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i8 + 11;
        watchFace.setThumWidth(cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)));
        int i20 = i8 + 12;
        watchFace.setCompressionType(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i8 + 13;
        watchFace.setType(cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, WatchFace watchFace) {
        sQLiteStatement.clearBindings();
        Long id = watchFace.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String broadcastName = watchFace.getBroadcastName();
        if (broadcastName != null) {
            sQLiteStatement.bindString(2, broadcastName);
        }
        if (watchFace.getIndex() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        if (watchFace.getTimePosition() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (watchFace.getTimeTopContent() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (watchFace.getTimeBottomComtent() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (watchFace.getTextColor() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        String md5 = watchFace.getMd5();
        if (md5 != null) {
            sQLiteStatement.bindString(8, md5);
        }
        if (watchFace.getHeight() != null) {
            sQLiteStatement.bindLong(9, r0.intValue());
        }
        if (watchFace.getWidth() != null) {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (watchFace.getThumHeight() != null) {
            sQLiteStatement.bindLong(11, r0.intValue());
        }
        if (watchFace.getThumWidth() != null) {
            sQLiteStatement.bindLong(12, r0.intValue());
        }
        if (watchFace.getCompressionType() != null) {
            sQLiteStatement.bindLong(13, r0.intValue());
        }
        if (watchFace.getType() != null) {
            sQLiteStatement.bindLong(14, r6.intValue());
        }
    }
}
