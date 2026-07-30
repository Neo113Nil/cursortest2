package org.greenrobot.greendao.query;

import java.util.Date;

/* loaded from: classes5.dex */
public class g extends org.greenrobot.greendao.query.a {
    private final b queryData;

    private static final class b extends org.greenrobot.greendao.query.b {
        private b(org.greenrobot.greendao.a aVar, String str, String[] strArr) {
            super(aVar, str, strArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.greendao.query.b
        public g createQuery() {
            return new g(this, this.dao, this.sql, (String[]) this.initialValues.clone());
        }
    }

    static <T2> g create(org.greenrobot.greendao.a aVar, String str, Object[] objArr) {
        return (g) new b(aVar, str, org.greenrobot.greendao.query.a.toStringArray(objArr)).forCurrentThread();
    }

    public void executeDeleteWithoutDetachingEntities() {
        checkThread();
        org.greenrobot.greendao.database.a database = this.dao.getDatabase();
        if (database.isDbLockedByCurrentThread()) {
            this.dao.getDatabase().execSQL(this.sql, this.parameters);
            return;
        }
        database.beginTransaction();
        try {
            this.dao.getDatabase().execSQL(this.sql, this.parameters);
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    public g forCurrentThread() {
        return (g) this.queryData.forCurrentThread(this);
    }

    private g(b bVar, org.greenrobot.greendao.a aVar, String str, String[] strArr) {
        super(aVar, str, strArr);
        this.queryData = bVar;
    }

    @Override // org.greenrobot.greendao.query.a
    public g setParameter(int i8, Object obj) {
        return (g) super.setParameter(i8, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    public g setParameter(int i8, Date date) {
        return (g) super.setParameter(i8, date);
    }

    @Override // org.greenrobot.greendao.query.a
    public g setParameter(int i8, Boolean bool) {
        return (g) super.setParameter(i8, bool);
    }
}
