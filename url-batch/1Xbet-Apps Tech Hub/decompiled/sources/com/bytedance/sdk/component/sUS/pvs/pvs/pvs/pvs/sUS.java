package com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs;

import android.content.Context;
import com.bytedance.sdk.component.sUS.pvs.so;

/* compiled from: StatsBatchLogEventRepoImpl.java */
/* loaded from: classes.dex */
public class sUS extends yiw {
    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.yiw
    public byte pvs() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.yiw
    public byte vG() {
        return (byte) 3;
    }

    public sUS(Context context, com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        super(context, pvsVar);
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.yiw, com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.vG
    public String icD() {
        return so.yiw().Jd().NB();
    }

    public static String pvs(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
