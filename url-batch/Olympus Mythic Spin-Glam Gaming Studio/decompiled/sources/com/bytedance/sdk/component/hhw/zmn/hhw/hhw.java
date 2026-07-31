package com.bytedance.sdk.component.hhw.zmn.hhw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public class hhw implements btk {
    private Context zmn;

    public hhw(Context context) {
        this.zmn = context;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.hhw.btk
    public List<fb> zmn() {
        LinkedList linkedList = new LinkedList();
        Cursor zmn = com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(this.zmn, "trackurl", null, null, null, null, null, null);
        if (zmn != null) {
            while (zmn.moveToNext()) {
                try {
                    try {
                        String string = zmn.getString(zmn.getColumnIndex("id"));
                        String string2 = zmn.getString(zmn.getColumnIndex("url"));
                        boolean z = zmn.getInt(zmn.getColumnIndex("replaceholder")) > 0;
                        int i = zmn.getInt(zmn.getColumnIndex("retry"));
                        int i2 = zmn.getInt(zmn.getColumnIndex("url_type"));
                        String string3 = zmn.getString(zmn.getColumnIndex(CreativeInfo.c));
                        String string4 = zmn.getString(zmn.getColumnIndex("error_code"));
                        String string5 = zmn.getString(zmn.getColumnIndex("error_msg"));
                        fb fbVar = new fb(string, string2, z, i2, string3);
                        fbVar.zmn(i);
                        if (!TextUtils.isEmpty(string4)) {
                            fbVar.zmn(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            fbVar.fs(string5);
                        }
                        linkedList.add(fbVar);
                    } catch (Throwable unused) {
                    }
                } finally {
                    zmn.close();
                }
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.hhw.btk
    public fb zmn(String str) {
        Cursor zmn = com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(this.zmn, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (zmn != null && zmn.moveToFirst()) {
            try {
                String string = zmn.getString(zmn.getColumnIndex("id"));
                String string2 = zmn.getString(zmn.getColumnIndex("url"));
                boolean z = zmn.getInt(zmn.getColumnIndex("replaceholder")) > 0;
                int i = zmn.getInt(zmn.getColumnIndex("retry"));
                int i2 = zmn.getInt(zmn.getColumnIndex("url_type"));
                String string3 = zmn.getString(zmn.getColumnIndex(CreativeInfo.c));
                String string4 = zmn.getString(zmn.getColumnIndex("error_code"));
                String string5 = zmn.getString(zmn.getColumnIndex("error_msg"));
                fb fbVar = new fb(string, string2, z, i2, string3);
                fbVar.zmn(i);
                if (!TextUtils.isEmpty(string4)) {
                    fbVar.zmn(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    fbVar.fs(string5);
                }
                return fbVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    zmn.close();
                    zmn = null;
                } finally {
                    zmn.close();
                }
            }
        }
        if (zmn != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.hhw.btk
    public void zmn(fb fbVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fbVar.zmn());
        contentValues.put("url", fbVar.fs());
        contentValues.put("replaceholder", Integer.valueOf(fbVar.zn() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fbVar.fb()));
        contentValues.put("url_type", Integer.valueOf(fbVar.btk()));
        contentValues.put(CreativeInfo.c, fbVar.hhw());
        contentValues.put("error_code", fbVar.nps());
        contentValues.put("error_msg", fbVar.bvs());
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(this.zmn, "trackurl", contentValues);
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.hhw.btk
    public void fs(fb fbVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fbVar.zmn());
        contentValues.put("url", fbVar.fs());
        contentValues.put("replaceholder", Integer.valueOf(fbVar.zn() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fbVar.fb()));
        contentValues.put("error_code", fbVar.nps());
        contentValues.put("error_msg", fbVar.bvs());
        contentValues.put("url_type", Integer.valueOf(fbVar.btk()));
        contentValues.put(CreativeInfo.c, fbVar.hhw());
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(this.zmn, "trackurl", contentValues, "id=?", new String[]{fbVar.zmn()});
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.hhw.btk
    public void zn(fb fbVar) {
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(this.zmn, "trackurl", "id=?", new String[]{fbVar.zmn()});
    }

    public static String fs() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }
}
