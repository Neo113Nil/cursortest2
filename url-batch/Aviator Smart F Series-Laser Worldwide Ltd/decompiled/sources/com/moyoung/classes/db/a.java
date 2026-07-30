package com.moyoung.classes.db;

import android.content.Context;

/* loaded from: classes4.dex */
public class a {
    private static final String DB_NAME = "classes-db";

    public synchronized void setup(Context context) {
        c.getInstance().setDaoSession(new e(new b(context, DB_NAME).getWritableDatabase()).newSession());
    }
}
