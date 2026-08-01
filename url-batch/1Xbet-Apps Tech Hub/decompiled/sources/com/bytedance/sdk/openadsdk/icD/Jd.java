package com.bytedance.sdk.openadsdk.icD;

/* compiled from: AdEventRepertoryImpl.java */
/* loaded from: classes2.dex */
public class Jd {
    public static String icD() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }

    public static String pvs() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)";
    }
}
