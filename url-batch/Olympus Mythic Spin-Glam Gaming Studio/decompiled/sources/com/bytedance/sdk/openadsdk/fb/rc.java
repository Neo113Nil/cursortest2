package com.bytedance.sdk.openadsdk.fb;

/* loaded from: classes13.dex */
public class rc extends fb {
    public static String zn() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String fb() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }
}
