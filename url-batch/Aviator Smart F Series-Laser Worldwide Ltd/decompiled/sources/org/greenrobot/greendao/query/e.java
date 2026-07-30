package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.util.Date;
import org.greenrobot.greendao.DaoException;

/* loaded from: classes5.dex */
public class e extends org.greenrobot.greendao.query.a {
    private final b queryData;

    private static final class b extends org.greenrobot.greendao.query.b {
        private b(org.greenrobot.greendao.a aVar, String str, String[] strArr) {
            super(aVar, str, strArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.greendao.query.b
        public e createQuery() {
            return new e(this, this.dao, this.sql, (String[]) this.initialValues.clone());
        }
    }

    static <T2> e create(org.greenrobot.greendao.a aVar, String str, Object[] objArr) {
        return (e) new b(aVar, str, org.greenrobot.greendao.query.a.toStringArray(objArr)).forCurrentThread();
    }

    public long count() {
        checkThread();
        Cursor rawQuery = this.dao.getDatabase().rawQuery(this.sql, this.parameters);
        try {
            if (!rawQuery.moveToNext()) {
                throw new DaoException("No result for count");
            }
            if (!rawQuery.isLast()) {
                throw new DaoException("Unexpected row count: " + rawQuery.getCount());
            }
            if (rawQuery.getColumnCount() == 1) {
                return rawQuery.getLong(0);
            }
            throw new DaoException("Unexpected column count: " + rawQuery.getColumnCount());
        } finally {
            rawQuery.close();
        }
    }

    public e forCurrentThread() {
        return (e) this.queryData.forCurrentThread(this);
    }

    private e(b bVar, org.greenrobot.greendao.a aVar, String str, String[] strArr) {
        super(aVar, str, strArr);
        this.queryData = bVar;
    }

    @Override // org.greenrobot.greendao.query.a
    public e setParameter(int i8, Object obj) {
        return (e) super.setParameter(i8, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    public e setParameter(int i8, Date date) {
        return (e) super.setParameter(i8, date);
    }

    @Override // org.greenrobot.greendao.query.a
    public e setParameter(int i8, Boolean bool) {
        return (e) super.setParameter(i8, bool);
    }
}
