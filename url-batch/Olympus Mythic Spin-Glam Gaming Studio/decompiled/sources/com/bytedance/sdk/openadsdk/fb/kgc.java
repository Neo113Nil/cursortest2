package com.bytedance.sdk.openadsdk.fb;

/* loaded from: classes9.dex */
public class kgc extends fb {
    public static String zn() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)").toString();
    }
}
