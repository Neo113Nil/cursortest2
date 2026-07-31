package com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn;

import android.content.Context;

/* loaded from: classes15.dex */
public class fb extends zmn {
    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zmn
    public byte fb() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zmn
    public byte zn() {
        return (byte) 1;
    }

    public fb(Context context, com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
        super(context, zmnVar);
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zmn, com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zn
    public String fs() {
        com.bytedance.sdk.component.hhw.zmn.zmn.btk zn = com.bytedance.sdk.component.hhw.zmn.nps.hhw().zn();
        if (zn != null) {
            return zn.zmn();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zn
    protected long hhw() {
        return com.bytedance.sdk.component.hhw.zmn.nps.zmn.fs();
    }

    public static String zn(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
