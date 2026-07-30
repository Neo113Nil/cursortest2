package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.crrepa.band.my.model.db.SupportWatchFace;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class SupportWatchFaceDao extends a {
    public static final String TABLENAME = "SUPPORT_WATCH_FACE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f BroadcastName = new f(1, String.class, "broadcastName", false, "BROADCAST_NAME");
        public static final f Tpls = new f(2, String.class, BaseWatchFaceProvider.TPLS, false, "TPLS");
        public static final f WatchFaceId = new f(3, Integer.class, "watchFaceId", false, "WATCH_FACE_ID");
        public static final f PreviewUrl = new f(4, String.class, "previewUrl", false, "PREVIEW_URL");
    }

    public SupportWatchFaceDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"SUPPORT_WATCH_FACE\" (\"_id\" INTEGER PRIMARY KEY ,\"BROADCAST_NAME\" TEXT,\"TPLS\" TEXT,\"WATCH_FACE_ID\" INTEGER,\"PREVIEW_URL\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"SUPPORT_WATCH_FACE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public SupportWatchFaceDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(SupportWatchFace supportWatchFace) {
        if (supportWatchFace != null) {
            return supportWatchFace.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(SupportWatchFace supportWatchFace) {
        return supportWatchFace.getId() != null;
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
    public final Long updateKeyAfterInsert(SupportWatchFace supportWatchFace, long j8) {
        supportWatchFace.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, SupportWatchFace supportWatchFace) {
        cVar.clearBindings();
        Long id = supportWatchFace.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String broadcastName = supportWatchFace.getBroadcastName();
        if (broadcastName != null) {
            cVar.bindString(2, broadcastName);
        }
        String tpls = supportWatchFace.getTpls();
        if (tpls != null) {
            cVar.bindString(3, tpls);
        }
        if (supportWatchFace.getWatchFaceId() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        String previewUrl = supportWatchFace.getPreviewUrl();
        if (previewUrl != null) {
            cVar.bindString(5, previewUrl);
        }
    }

    @Override // org.greenrobot.greendao.a
    public SupportWatchFace readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i8 + 2;
        String string2 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        int i12 = i8 + 4;
        return new SupportWatchFace(valueOf, string, string2, cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)), cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, SupportWatchFace supportWatchFace, int i8) {
        supportWatchFace.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        supportWatchFace.setBroadcastName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        supportWatchFace.setTpls(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        supportWatchFace.setWatchFaceId(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 4;
        supportWatchFace.setPreviewUrl(cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, SupportWatchFace supportWatchFace) {
        sQLiteStatement.clearBindings();
        Long id = supportWatchFace.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String broadcastName = supportWatchFace.getBroadcastName();
        if (broadcastName != null) {
            sQLiteStatement.bindString(2, broadcastName);
        }
        String tpls = supportWatchFace.getTpls();
        if (tpls != null) {
            sQLiteStatement.bindString(3, tpls);
        }
        if (supportWatchFace.getWatchFaceId() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        String previewUrl = supportWatchFace.getPreviewUrl();
        if (previewUrl != null) {
            sQLiteStatement.bindString(5, previewUrl);
        }
    }
}
