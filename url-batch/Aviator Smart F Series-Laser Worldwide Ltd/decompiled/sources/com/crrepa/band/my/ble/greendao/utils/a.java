package com.crrepa.band.my.ble.greendao.utils;

import android.content.Context;
import com.crrepa.band.my.model.db.greendao.DaoMaster;

/* loaded from: classes2.dex */
public class a {
    private static final String DB_NAME = "crrepa-db";

    public synchronized void setup(Context context) {
        c.getInstance().setDaoSession(new DaoMaster(new b(context, DB_NAME).getWritableDatabase()).newSession());
    }
}
