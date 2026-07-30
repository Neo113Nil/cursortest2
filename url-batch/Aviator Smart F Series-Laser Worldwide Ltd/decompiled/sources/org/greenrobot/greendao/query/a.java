package org.greenrobot.greendao.query;

import java.util.Date;
import org.greenrobot.greendao.DaoException;

/* loaded from: classes5.dex */
abstract class a {
    protected final org.greenrobot.greendao.a dao;
    protected final org.greenrobot.greendao.e daoAccess;
    protected final Thread ownerThread = Thread.currentThread();
    protected final String[] parameters;
    protected final String sql;

    protected a(org.greenrobot.greendao.a aVar, String str, String[] strArr) {
        this.dao = aVar;
        this.daoAccess = new org.greenrobot.greendao.e(aVar);
        this.sql = str;
        this.parameters = strArr;
    }

    protected static String[] toStringArray(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            Object obj = objArr[i8];
            if (obj != null) {
                strArr[i8] = obj.toString();
            } else {
                strArr[i8] = null;
            }
        }
        return strArr;
    }

    protected void checkThread() {
        if (Thread.currentThread() != this.ownerThread) {
            throw new DaoException("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        }
    }

    public a setParameter(int i8, Object obj) {
        checkThread();
        if (obj != null) {
            this.parameters[i8] = obj.toString();
        } else {
            this.parameters[i8] = null;
        }
        return this;
    }

    public a setParameter(int i8, Date date) {
        return setParameter(i8, date != null ? Long.valueOf(date.getTime()) : null);
    }

    public a setParameter(int i8, Boolean bool) {
        return setParameter(i8, bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null);
    }
}
