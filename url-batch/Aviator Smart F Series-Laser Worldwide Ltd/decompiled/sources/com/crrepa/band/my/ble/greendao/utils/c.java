package com.crrepa.band.my.ble.greendao.utils;

import com.crrepa.band.my.model.db.greendao.DaoSession;

/* loaded from: classes2.dex */
public class c {
    private static c daoSessionProvider;
    private DaoSession daoSession;

    private c() {
    }

    public static c getInstance() {
        if (daoSessionProvider == null) {
            synchronized (c.class) {
                try {
                    if (daoSessionProvider == null) {
                        daoSessionProvider = new c();
                    }
                } finally {
                }
            }
        }
        return daoSessionProvider;
    }

    public DaoSession getDaoSession() {
        return this.daoSession;
    }

    public void setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
    }
}
