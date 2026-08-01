package com.bytedance.sdk.component.sUS.pvs.sUS;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedList;
import java.util.List;

/* compiled from: TrackRetryRepertoryImpl.java */
/* loaded from: classes.dex */
public class sUS implements NB {
    private Context pvs;

    public static String icD() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    public sUS(Context context) {
        this.pvs = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (r1 != null) goto L19;
     */
    @Override // com.bytedance.sdk.component.sUS.pvs.sUS.NB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Jd> pvs() {
        LinkedList linkedList = new LinkedList();
        Cursor pvs = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(this.pvs, "trackurl", null, null, null, null, null, null);
        if (pvs != null) {
            while (pvs.moveToNext()) {
                try {
                    String string = pvs.getString(pvs.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                    String string2 = pvs.getString(pvs.getColumnIndex(ImagesContract.URL));
                    boolean z = pvs.getInt(pvs.getColumnIndex("replaceholder")) > 0;
                    int i = pvs.getInt(pvs.getColumnIndex("retry"));
                    int i2 = pvs.getInt(pvs.getColumnIndex("url_type"));
                    String string3 = pvs.getString(pvs.getColumnIndex("ad_id"));
                    String string4 = pvs.getString(pvs.getColumnIndex("error_code"));
                    String string5 = pvs.getString(pvs.getColumnIndex("error_msg"));
                    Jd jd = new Jd(string, string2, z, i2, string3);
                    jd.pvs(i);
                    if (!TextUtils.isEmpty(string4)) {
                        jd.pvs(string4);
                    }
                    if (!TextUtils.isEmpty(string5)) {
                        jd.icD(string5);
                    }
                    linkedList.add(jd);
                } catch (Throwable unused) {
                    if (pvs != null) {
                        try {
                            pvs.close();
                            pvs = null;
                        } finally {
                            if (pvs != null) {
                                pvs.close();
                            }
                        }
                    }
                }
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS.NB
    public Jd pvs(String str) {
        Cursor pvs = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(this.pvs, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (pvs != null && pvs.moveToFirst()) {
            try {
                String string = pvs.getString(pvs.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                String string2 = pvs.getString(pvs.getColumnIndex(ImagesContract.URL));
                boolean z = pvs.getInt(pvs.getColumnIndex("replaceholder")) > 0;
                int i = pvs.getInt(pvs.getColumnIndex("retry"));
                int i2 = pvs.getInt(pvs.getColumnIndex("url_type"));
                String string3 = pvs.getString(pvs.getColumnIndex("ad_id"));
                String string4 = pvs.getString(pvs.getColumnIndex("error_code"));
                String string5 = pvs.getString(pvs.getColumnIndex("error_msg"));
                Jd jd = new Jd(string, string2, z, i2, string3);
                jd.pvs(i);
                if (!TextUtils.isEmpty(string4)) {
                    jd.pvs(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    jd.icD(string5);
                }
                return jd;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    pvs.close();
                    pvs = null;
                } finally {
                    pvs.close();
                }
            }
        }
        if (pvs != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS.NB
    public void pvs(Jd jd) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, jd.pvs());
        contentValues.put(ImagesContract.URL, jd.icD());
        contentValues.put("replaceholder", Integer.valueOf(jd.vG() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(jd.Jd()));
        contentValues.put("url_type", Integer.valueOf(jd.NB()));
        contentValues.put("ad_id", jd.sUS());
        contentValues.put("error_code", jd.yiw());
        contentValues.put("error_msg", jd.Mxy());
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(this.pvs, "trackurl", contentValues);
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS.NB
    public void icD(Jd jd) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, jd.pvs());
        contentValues.put(ImagesContract.URL, jd.icD());
        contentValues.put("replaceholder", Integer.valueOf(jd.vG() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(jd.Jd()));
        contentValues.put("error_code", jd.yiw());
        contentValues.put("error_msg", jd.Mxy());
        contentValues.put("url_type", Integer.valueOf(jd.NB()));
        contentValues.put("ad_id", jd.sUS());
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(this.pvs, "trackurl", contentValues, "id=?", new String[]{jd.pvs()});
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS.NB
    public void vG(Jd jd) {
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(this.pvs, "trackurl", "id=?", new String[]{jd.pvs()});
    }
}
