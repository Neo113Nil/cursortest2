package org.greenrobot.greendao.query;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.DaoException;
import rx.schedulers.Schedulers;

/* loaded from: classes5.dex */
public class j extends c {
    private final b queryData;
    private volatile org.greenrobot.greendao.rx.c rxTxIo;
    private volatile org.greenrobot.greendao.rx.c rxTxPlain;

    private static final class b extends org.greenrobot.greendao.query.b {
        private final int limitPosition;
        private final int offsetPosition;

        b(org.greenrobot.greendao.a aVar, String str, String[] strArr, int i8, int i9) {
            super(aVar, str, strArr);
            this.limitPosition = i8;
            this.offsetPosition = i9;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.greendao.query.b
        public j createQuery() {
            return new j(this, this.dao, this.sql, (String[]) this.initialValues.clone(), this.limitPosition, this.offsetPosition);
        }
    }

    static <T2> j create(org.greenrobot.greendao.a aVar, String str, Object[] objArr, int i8, int i9) {
        return (j) new b(aVar, str, org.greenrobot.greendao.query.a.toStringArray(objArr), i8, i9).forCurrentThread();
    }

    public static <T2> j internalCreate(org.greenrobot.greendao.a aVar, String str, Object[] objArr) {
        return create(aVar, str, objArr, -1, -1);
    }

    public org.greenrobot.greendao.rx.c __InternalRx() {
        if (this.rxTxIo == null) {
            this.rxTxIo = new org.greenrobot.greendao.rx.c(this, Schedulers.io());
        }
        return this.rxTxIo;
    }

    public org.greenrobot.greendao.rx.c __internalRxPlain() {
        if (this.rxTxPlain == null) {
            this.rxTxPlain = new org.greenrobot.greendao.rx.c(this);
        }
        return this.rxTxPlain;
    }

    public j forCurrentThread() {
        return (j) this.queryData.forCurrentThread(this);
    }

    public List<Object> list() {
        checkThread();
        return this.daoAccess.loadAllAndCloseCursor(this.dao.getDatabase().rawQuery(this.sql, this.parameters));
    }

    public d listIterator() {
        return listLazyUncached().listIteratorAutoClose();
    }

    public i listLazy() {
        checkThread();
        return new i(this.daoAccess, this.dao.getDatabase().rawQuery(this.sql, this.parameters), true);
    }

    public i listLazyUncached() {
        checkThread();
        return new i(this.daoAccess, this.dao.getDatabase().rawQuery(this.sql, this.parameters), false);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void setLimit(int i8) {
        super.setLimit(i8);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void setOffset(int i8) {
        super.setOffset(i8);
    }

    public Object unique() {
        checkThread();
        return this.daoAccess.loadUniqueAndCloseCursor(this.dao.getDatabase().rawQuery(this.sql, this.parameters));
    }

    public Object uniqueOrThrow() {
        Object unique = unique();
        if (unique != null) {
            return unique;
        }
        throw new DaoException("No entity found for query");
    }

    private j(b bVar, org.greenrobot.greendao.a aVar, String str, String[] strArr, int i8, int i9) {
        super(aVar, str, strArr, i8, i9);
        this.queryData = bVar;
    }

    @Override // org.greenrobot.greendao.query.c, org.greenrobot.greendao.query.a
    public j setParameter(int i8, Object obj) {
        return (j) super.setParameter(i8, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    public j setParameter(int i8, Date date) {
        return (j) super.setParameter(i8, date);
    }

    @Override // org.greenrobot.greendao.query.a
    public j setParameter(int i8, Boolean bool) {
        return (j) super.setParameter(i8, bool);
    }
}
