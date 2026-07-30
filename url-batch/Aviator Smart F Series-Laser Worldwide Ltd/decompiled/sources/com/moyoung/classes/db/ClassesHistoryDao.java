package com.moyoung.classes.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.liulishuo.filedownloader.model.FileDownloadModel;

/* loaded from: classes4.dex */
public class ClassesHistoryDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "CLASSES_HISTORY";

    public static class Properties {
        public static final org.greenrobot.greendao.f ClassesId;
        public static final org.greenrobot.greendao.f ClassesJson;
        public static final org.greenrobot.greendao.f ClassesTitle;
        public static final org.greenrobot.greendao.f ClassesType;
        public static final org.greenrobot.greendao.f Id = new org.greenrobot.greendao.f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final org.greenrobot.greendao.f SpentKcal;
        public static final org.greenrobot.greendao.f SpentTime;
        public static final org.greenrobot.greendao.f StartTimestamp;

        static {
            Class cls = Integer.TYPE;
            ClassesId = new org.greenrobot.greendao.f(1, cls, "classesId", false, "CLASSES_ID");
            ClassesType = new org.greenrobot.greendao.f(2, cls, "classesType", false, "CLASSES_TYPE");
            ClassesTitle = new org.greenrobot.greendao.f(3, String.class, "classesTitle", false, "CLASSES_TITLE");
            SpentKcal = new org.greenrobot.greendao.f(4, cls, "spentKcal", false, "SPENT_KCAL");
            SpentTime = new org.greenrobot.greendao.f(5, cls, "spentTime", false, "SPENT_TIME");
            StartTimestamp = new org.greenrobot.greendao.f(6, Long.TYPE, "startTimestamp", false, "START_TIMESTAMP");
            ClassesJson = new org.greenrobot.greendao.f(7, String.class, "classesJson", false, "CLASSES_JSON");
        }
    }

    public ClassesHistoryDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"CLASSES_HISTORY\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"CLASSES_ID\" INTEGER NOT NULL ,\"CLASSES_TYPE\" INTEGER NOT NULL ,\"CLASSES_TITLE\" TEXT,\"SPENT_KCAL\" INTEGER NOT NULL ,\"SPENT_TIME\" INTEGER NOT NULL ,\"START_TIMESTAMP\" INTEGER NOT NULL ,\"CLASSES_JSON\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"CLASSES_HISTORY\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public ClassesHistoryDao(org.greenrobot.greendao.internal.a aVar, f fVar) {
        super(aVar, fVar);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(ClassesHistory classesHistory) {
        if (classesHistory != null) {
            return classesHistory.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ClassesHistory classesHistory) {
        return classesHistory.getId() != null;
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
    public final Long updateKeyAfterInsert(ClassesHistory classesHistory, long j8) {
        classesHistory.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.c cVar, ClassesHistory classesHistory) {
        cVar.clearBindings();
        Long id = classesHistory.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        cVar.bindLong(2, classesHistory.getClassesId());
        cVar.bindLong(3, classesHistory.getClassesType());
        String classesTitle = classesHistory.getClassesTitle();
        if (classesTitle != null) {
            cVar.bindString(4, classesTitle);
        }
        cVar.bindLong(5, classesHistory.getSpentKcal());
        cVar.bindLong(6, classesHistory.getSpentTime());
        cVar.bindLong(7, classesHistory.getStartTimestamp());
        String classesJson = classesHistory.getClassesJson();
        if (classesJson != null) {
            cVar.bindString(8, classesJson);
        }
    }

    @Override // org.greenrobot.greendao.a
    public ClassesHistory readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = cursor.getInt(i8 + 1);
        int i10 = cursor.getInt(i8 + 2);
        int i11 = i8 + 3;
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = cursor.getInt(i8 + 4);
        int i13 = cursor.getInt(i8 + 5);
        long j8 = cursor.getLong(i8 + 6);
        int i14 = i8 + 7;
        return new ClassesHistory(valueOf, i9, i10, string, i12, i13, j8, cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ClassesHistory classesHistory, int i8) {
        classesHistory.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        classesHistory.setClassesId(cursor.getInt(i8 + 1));
        classesHistory.setClassesType(cursor.getInt(i8 + 2));
        int i9 = i8 + 3;
        classesHistory.setClassesTitle(cursor.isNull(i9) ? null : cursor.getString(i9));
        classesHistory.setSpentKcal(cursor.getInt(i8 + 4));
        classesHistory.setSpentTime(cursor.getInt(i8 + 5));
        classesHistory.setStartTimestamp(cursor.getLong(i8 + 6));
        int i10 = i8 + 7;
        classesHistory.setClassesJson(cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ClassesHistory classesHistory) {
        sQLiteStatement.clearBindings();
        Long id = classesHistory.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        sQLiteStatement.bindLong(2, classesHistory.getClassesId());
        sQLiteStatement.bindLong(3, classesHistory.getClassesType());
        String classesTitle = classesHistory.getClassesTitle();
        if (classesTitle != null) {
            sQLiteStatement.bindString(4, classesTitle);
        }
        sQLiteStatement.bindLong(5, classesHistory.getSpentKcal());
        sQLiteStatement.bindLong(6, classesHistory.getSpentTime());
        sQLiteStatement.bindLong(7, classesHistory.getStartTimestamp());
        String classesJson = classesHistory.getClassesJson();
        if (classesJson != null) {
            sQLiteStatement.bindString(8, classesJson);
        }
    }
}
