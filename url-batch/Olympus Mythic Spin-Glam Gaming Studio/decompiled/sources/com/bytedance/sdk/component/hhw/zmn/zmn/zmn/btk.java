package com.bytedance.sdk.component.hhw.zmn.zmn.zmn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes6.dex */
public class btk implements com.bytedance.sdk.component.hhw.zmn.zmn.btk {
    public static final btk zmn = new btk();
    private volatile SQLiteDatabase fs;

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.btk
    public String hhw() {
        return null;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.btk
    public String zn() {
        return null;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.btk
    public SQLiteDatabase zmn(Context context) {
        if (this.fs == null) {
            synchronized (this) {
                try {
                    if (this.fs == null) {
                        this.fs = new fb(context).getWritableDatabase();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.btk
    public String zmn() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.btk
    public String fs() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.btk
    public String fb() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.btk
    public String btk() {
        return "logstatsbatch";
    }
}
