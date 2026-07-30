package com.moyoung.classes.db;

/* loaded from: classes4.dex */
public class c {
    private static c daoSessionProvider;
    private f daoSession;

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

    public f getDaoSession() {
        return this.daoSession;
    }

    public void setDaoSession(f fVar) {
        this.daoSession = fVar;
    }
}
