package org.greenrobot.greendao;

import android.database.Cursor;
import java.util.List;

/* loaded from: classes5.dex */
public final class e {
    private final a dao;

    public e(a aVar) {
        this.dao = aVar;
    }

    public org.greenrobot.greendao.internal.e getStatements() {
        return this.dao.getStatements();
    }

    public List<Object> loadAllAndCloseCursor(Cursor cursor) {
        return this.dao.loadAllAndCloseCursor(cursor);
    }

    public Object loadCurrent(Cursor cursor, int i8, boolean z7) {
        return this.dao.loadCurrent(cursor, i8, z7);
    }

    public Object loadUniqueAndCloseCursor(Cursor cursor) {
        return this.dao.loadUniqueAndCloseCursor(cursor);
    }

    public static <T2> org.greenrobot.greendao.internal.e getStatements(a aVar) {
        return aVar.getStatements();
    }
}
