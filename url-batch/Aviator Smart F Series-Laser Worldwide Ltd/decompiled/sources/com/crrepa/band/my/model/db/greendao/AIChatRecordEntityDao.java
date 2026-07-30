package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import androidx.core.app.NotificationCompat;
import com.crrepa.band.my.device.ai.chat.model.AIChatRecordEntity;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class AIChatRecordEntityDao extends a {
    public static final String TABLENAME = "AICHAT_RECORD_ENTITY";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f TimeMillis = new f(1, Long.TYPE, "timeMillis", false, "TIME_MILLIS");
        public static final f Role = new f(2, Integer.TYPE, "role", false, "ROLE");
        public static final f Msg = new f(3, String.class, NotificationCompat.CATEGORY_MESSAGE, false, "MSG");
        public static final f MsgType = new f(4, String.class, "msgType", false, "MSG_TYPE");
        public static final f TtsFilePath = new f(5, String.class, "ttsFilePath", false, "TTS_FILE_PATH");
    }

    public AIChatRecordEntityDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"AICHAT_RECORD_ENTITY\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TIME_MILLIS\" INTEGER NOT NULL ,\"ROLE\" INTEGER NOT NULL ,\"MSG\" TEXT,\"MSG_TYPE\" TEXT,\"TTS_FILE_PATH\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"AICHAT_RECORD_ENTITY\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public AIChatRecordEntityDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(AIChatRecordEntity aIChatRecordEntity) {
        if (aIChatRecordEntity != null) {
            return aIChatRecordEntity.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(AIChatRecordEntity aIChatRecordEntity) {
        return aIChatRecordEntity.getId() != null;
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
    public final Long updateKeyAfterInsert(AIChatRecordEntity aIChatRecordEntity, long j8) {
        aIChatRecordEntity.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, AIChatRecordEntity aIChatRecordEntity) {
        cVar.clearBindings();
        Long id = aIChatRecordEntity.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        cVar.bindLong(2, aIChatRecordEntity.getTimeMillis());
        cVar.bindLong(3, aIChatRecordEntity.getRole());
        String msg = aIChatRecordEntity.getMsg();
        if (msg != null) {
            cVar.bindString(4, msg);
        }
        String msgType = aIChatRecordEntity.getMsgType();
        if (msgType != null) {
            cVar.bindString(5, msgType);
        }
        String ttsFilePath = aIChatRecordEntity.getTtsFilePath();
        if (ttsFilePath != null) {
            cVar.bindString(6, ttsFilePath);
        }
    }

    @Override // org.greenrobot.greendao.a
    public AIChatRecordEntity readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        long j8 = cursor.getLong(i8 + 1);
        int i9 = cursor.getInt(i8 + 2);
        int i10 = i8 + 3;
        String string = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 4;
        int i12 = i8 + 5;
        return new AIChatRecordEntity(valueOf, j8, i9, string, cursor.isNull(i11) ? null : cursor.getString(i11), cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, AIChatRecordEntity aIChatRecordEntity, int i8) {
        aIChatRecordEntity.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        aIChatRecordEntity.setTimeMillis(cursor.getLong(i8 + 1));
        aIChatRecordEntity.setRole(cursor.getInt(i8 + 2));
        int i9 = i8 + 3;
        aIChatRecordEntity.setMsg(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 4;
        aIChatRecordEntity.setMsgType(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 5;
        aIChatRecordEntity.setTtsFilePath(cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, AIChatRecordEntity aIChatRecordEntity) {
        sQLiteStatement.clearBindings();
        Long id = aIChatRecordEntity.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        sQLiteStatement.bindLong(2, aIChatRecordEntity.getTimeMillis());
        sQLiteStatement.bindLong(3, aIChatRecordEntity.getRole());
        String msg = aIChatRecordEntity.getMsg();
        if (msg != null) {
            sQLiteStatement.bindString(4, msg);
        }
        String msgType = aIChatRecordEntity.getMsgType();
        if (msgType != null) {
            sQLiteStatement.bindString(5, msgType);
        }
        String ttsFilePath = aIChatRecordEntity.getTtsFilePath();
        if (ttsFilePath != null) {
            sQLiteStatement.bindString(6, ttsFilePath);
        }
    }
}
