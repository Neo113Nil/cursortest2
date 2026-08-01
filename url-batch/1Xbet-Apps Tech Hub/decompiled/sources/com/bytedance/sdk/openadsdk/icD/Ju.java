package com.bytedance.sdk.openadsdk.icD;

/* compiled from: StatsBatchEventRepertoryImpl.java */
/* loaded from: classes2.dex */
public class Ju {
    public static String icD() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }

    public static String pvs() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
