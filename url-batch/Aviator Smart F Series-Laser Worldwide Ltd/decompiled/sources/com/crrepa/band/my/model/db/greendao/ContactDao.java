package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Contact;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class ContactDao extends a {
    public static final String TABLENAME = "CONTACT";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Name = new f(1, String.class, "name", false, "NAME");
        public static final f Number = new f(2, String.class, "number", false, "NUMBER");
        public static final f Avatar = new f(3, String.class, "avatar", false, "AVATAR");
    }

    public ContactDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"CONTACT\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"NUMBER\" TEXT,\"AVATAR\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"CONTACT\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public ContactDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Contact contact) {
        if (contact != null) {
            return contact.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Contact contact) {
        return contact.getId() != null;
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
    public final Long updateKeyAfterInsert(Contact contact, long j8) {
        contact.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Contact contact) {
        cVar.clearBindings();
        Long id = contact.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String name = contact.getName();
        if (name != null) {
            cVar.bindString(2, name);
        }
        String number = contact.getNumber();
        if (number != null) {
            cVar.bindString(3, number);
        }
        String avatar = contact.getAvatar();
        if (avatar != null) {
            cVar.bindString(4, avatar);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Contact readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = i8 + 3;
        return new Contact(valueOf, cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Contact contact, int i8) {
        contact.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        contact.setName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i8 + 2;
        contact.setNumber(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i8 + 3;
        contact.setAvatar(cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Contact contact) {
        sQLiteStatement.clearBindings();
        Long id = contact.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String name = contact.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String number = contact.getNumber();
        if (number != null) {
            sQLiteStatement.bindString(3, number);
        }
        String avatar = contact.getAvatar();
        if (avatar != null) {
            sQLiteStatement.bindString(4, avatar);
        }
    }
}
