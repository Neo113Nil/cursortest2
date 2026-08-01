package com.bytedance.sdk.component.sUS.pvs.pvs.pvs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: MyDBCallback.java */
/* loaded from: classes.dex */
public class NB implements com.bytedance.sdk.component.sUS.pvs.pvs.NB {
    public static final NB pvs = new NB();
    private volatile SQLiteDatabase icD;

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.NB
    public String Jd() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.NB
    public String NB() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.NB
    public String icD() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.NB
    public String pvs() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.NB
    public String sUS() {
        return null;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.NB
    public String vG() {
        return null;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.NB
    public SQLiteDatabase pvs(Context context) {
        if (this.icD == null) {
            synchronized (this) {
                if (this.icD == null) {
                    this.icD = new Jd(context).getWritableDatabase();
                }
            }
        }
        return this.icD;
    }
}
