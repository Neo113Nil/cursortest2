package com.bytedance.sdk.openadsdk.icD;

/* compiled from: HighPriorityEventRepertoryImpl.java */
/* loaded from: classes2.dex */
public class Mxy extends Jd {
    public static String Jd() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }

    public static String vG() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
