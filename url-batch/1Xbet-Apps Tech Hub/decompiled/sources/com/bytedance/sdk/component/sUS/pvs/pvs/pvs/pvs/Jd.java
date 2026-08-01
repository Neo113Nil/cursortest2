package com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs;

import android.content.Context;
import com.bytedance.sdk.component.sUS.pvs.so;

/* compiled from: HighPriorityAdEventRepoImpl.java */
/* loaded from: classes.dex */
public class Jd extends pvs {
    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.pvs
    public byte Jd() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.pvs
    public byte vG() {
        return (byte) 1;
    }

    public Jd(Context context, com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        super(context, pvsVar);
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.pvs, com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.vG
    public String icD() {
        com.bytedance.sdk.component.sUS.pvs.pvs.NB Jd = so.yiw().Jd();
        if (Jd != null) {
            return Jd.pvs();
        }
        return null;
    }

    public static String vG(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
