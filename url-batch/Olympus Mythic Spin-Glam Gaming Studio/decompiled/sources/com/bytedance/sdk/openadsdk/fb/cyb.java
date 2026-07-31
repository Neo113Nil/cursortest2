package com.bytedance.sdk.openadsdk.fb;

/* loaded from: classes6.dex */
public class cyb {
    public static String zmn() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }

    public static String fs() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }
}
