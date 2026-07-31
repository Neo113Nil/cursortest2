package com.bytedance.sdk.openadsdk.fb;

/* loaded from: classes15.dex */
public class cn {
    public static String zmn() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String fs() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }
}
