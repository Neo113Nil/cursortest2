package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.CricketTeamModel;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class CricketTeamModelDao extends a {
    public static final String TABLENAME = "CRICKET_TEAM_MODEL";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Icon = new f(1, Integer.class, "icon", false, "ICON");
        public static final f Name = new f(2, String.class, "name", false, "NAME");
        public static final f Selected = new f(3, Boolean.class, "selected", false, "SELECTED");
    }

    public CricketTeamModelDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"CRICKET_TEAM_MODEL\" (\"_id\" INTEGER PRIMARY KEY ,\"ICON\" INTEGER,\"NAME\" TEXT,\"SELECTED\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"CRICKET_TEAM_MODEL\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public CricketTeamModelDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(CricketTeamModel cricketTeamModel) {
        if (cricketTeamModel != null) {
            return cricketTeamModel.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(CricketTeamModel cricketTeamModel) {
        return cricketTeamModel.getId() != null;
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
    public final Long updateKeyAfterInsert(CricketTeamModel cricketTeamModel, long j8) {
        cricketTeamModel.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, CricketTeamModel cricketTeamModel) {
        cVar.clearBindings();
        Long id = cricketTeamModel.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (cricketTeamModel.getIcon() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        String name = cricketTeamModel.getName();
        if (name != null) {
            cVar.bindString(3, name);
        }
        Boolean selected = cricketTeamModel.getSelected();
        if (selected != null) {
            cVar.bindLong(4, selected.booleanValue() ? 1L : 0L);
        }
    }

    @Override // org.greenrobot.greendao.a
    public CricketTeamModel readEntity(Cursor cursor, int i8) {
        Boolean bool = null;
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        String string = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i8 + 3;
        if (!cursor.isNull(i11)) {
            bool = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        return new CricketTeamModel(valueOf, valueOf2, string, bool);
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, CricketTeamModel cricketTeamModel, int i8) {
        Boolean bool = null;
        cricketTeamModel.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        cricketTeamModel.setIcon(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        cricketTeamModel.setName(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        if (!cursor.isNull(i11)) {
            bool = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        cricketTeamModel.setSelected(bool);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, CricketTeamModel cricketTeamModel) {
        sQLiteStatement.clearBindings();
        Long id = cricketTeamModel.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (cricketTeamModel.getIcon() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        String name = cricketTeamModel.getName();
        if (name != null) {
            sQLiteStatement.bindString(3, name);
        }
        Boolean selected = cricketTeamModel.getSelected();
        if (selected != null) {
            sQLiteStatement.bindLong(4, selected.booleanValue() ? 1L : 0L);
        }
    }
}
