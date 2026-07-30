package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.DownloadWatchFace;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class DownloadWatchFaceDao extends a {
    public static final String TABLENAME = "DOWNLOAD_WATCH_FACE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f WatchFaceId = new f(1, Long.class, "watchFaceId", false, "WATCH_FACE_ID");
        public static final f Url = new f(2, String.class, "url", false, "URL");
    }

    public DownloadWatchFaceDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"DOWNLOAD_WATCH_FACE\" (\"_id\" INTEGER PRIMARY KEY ,\"WATCH_FACE_ID\" INTEGER,\"URL\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"DOWNLOAD_WATCH_FACE\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public DownloadWatchFaceDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(DownloadWatchFace downloadWatchFace) {
        if (downloadWatchFace != null) {
            return downloadWatchFace.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(DownloadWatchFace downloadWatchFace) {
        return downloadWatchFace.getId() != null;
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
    public final Long updateKeyAfterInsert(DownloadWatchFace downloadWatchFace, long j8) {
        downloadWatchFace.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, DownloadWatchFace downloadWatchFace) {
        cVar.clearBindings();
        Long id = downloadWatchFace.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        Long watchFaceId = downloadWatchFace.getWatchFaceId();
        if (watchFaceId != null) {
            cVar.bindLong(2, watchFaceId.longValue());
        }
        String url = downloadWatchFace.getUrl();
        if (url != null) {
            cVar.bindString(3, url);
        }
    }

    @Override // org.greenrobot.greendao.a
    public DownloadWatchFace readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        return new DownloadWatchFace(valueOf, cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9)), cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, DownloadWatchFace downloadWatchFace, int i8) {
        downloadWatchFace.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        downloadWatchFace.setWatchFaceId(cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9)));
        int i10 = i8 + 2;
        downloadWatchFace.setUrl(cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, DownloadWatchFace downloadWatchFace) {
        sQLiteStatement.clearBindings();
        Long id = downloadWatchFace.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long watchFaceId = downloadWatchFace.getWatchFaceId();
        if (watchFaceId != null) {
            sQLiteStatement.bindLong(2, watchFaceId.longValue());
        }
        String url = downloadWatchFace.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(3, url);
        }
    }
}
