package com.bytedance.sdk.openadsdk.icD;

/* compiled from: StatsEventRepertoryImpl.java */
/* loaded from: classes2.dex */
public class IP {
    public static String icD() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }

    public static String pvs() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }
}
