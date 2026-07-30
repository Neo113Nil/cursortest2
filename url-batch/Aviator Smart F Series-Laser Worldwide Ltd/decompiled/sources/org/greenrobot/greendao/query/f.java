package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.util.Date;

/* loaded from: classes5.dex */
public class f extends c {
    private final b queryData;

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
        public f createQuery() {
            return new f(this, this.dao, this.sql, (String[]) this.initialValues.clone(), this.limitPosition, this.offsetPosition);
        }
    }

    static <T2> f create(org.greenrobot.greendao.a aVar, String str, Object[] objArr, int i8, int i9) {
        return (f) new b(aVar, str, org.greenrobot.greendao.query.a.toStringArray(objArr), i8, i9).forCurrentThread();
    }

    public static <T2> f internalCreate(org.greenrobot.greendao.a aVar, String str, Object[] objArr) {
        return create(aVar, str, objArr, -1, -1);
    }

    public f forCurrentThread() {
        return (f) this.queryData.forCurrentThread(this);
    }

    public Cursor query() {
        checkThread();
        return this.dao.getDatabase().rawQuery(this.sql, this.parameters);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void setLimit(int i8) {
        super.setLimit(i8);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void setOffset(int i8) {
        super.setOffset(i8);
    }

    private f(b bVar, org.greenrobot.greendao.a aVar, String str, String[] strArr, int i8, int i9) {
        super(aVar, str, strArr, i8, i9);
        this.queryData = bVar;
    }

    @Override // org.greenrobot.greendao.query.c, org.greenrobot.greendao.query.a
    public f setParameter(int i8, Object obj) {
        return (f) super.setParameter(i8, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    public f setParameter(int i8, Date date) {
        return (f) super.setParameter(i8, date);
    }

    @Override // org.greenrobot.greendao.query.a
    public f setParameter(int i8, Boolean bool) {
        return (f) super.setParameter(i8, bool);
    }
}
