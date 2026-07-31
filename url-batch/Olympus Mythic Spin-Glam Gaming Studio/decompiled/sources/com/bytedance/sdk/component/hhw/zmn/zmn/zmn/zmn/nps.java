package com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public class nps extends zn {
    protected List<String> zmn;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zn;

    public byte zmn() {
        return (byte) 1;
    }

    public byte zn() {
        return (byte) 2;
    }

    public nps(Context context, com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
        super(context);
        this.zmn = new ArrayList();
        this.zn = zmnVar;
        if (zmnVar == null) {
            this.zn = com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn.zn();
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zn
    protected long hhw() {
        return com.bytedance.sdk.component.hhw.zmn.nps.zmn.fs();
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zn
    public String fs() {
        return com.bytedance.sdk.component.hhw.zmn.nps.hhw().zn().fb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int fb() {
        Cursor cursor;
        int i = 0;
        try {
            cursor = com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), fs(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursor != null) {
                try {
                    cursor.moveToFirst();
                    i = cursor.getInt(0);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        return i;
    }

    public List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn(int i, String str) {
        long zmn = com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn(i, btk());
        if (zmn <= 0) {
            zmn = 1;
        } else if (zmn > 100) {
            zmn = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.zmn.clear();
        Cursor zmn2 = com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), fs(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + zmn);
        if (zmn2 != null) {
            while (zmn2.moveToNext()) {
                try {
                    try {
                        String string = zmn2.getString(zmn2.getColumnIndex("id"));
                        String string2 = zmn2.getString(zmn2.getColumnIndex("value"));
                        if (zmn2.getInt(zmn2.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.hhw.zmn.nps.hhw().cn().zmn(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.zmn.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.hhw.zmn.fb.zmn.zmn zmnVar = new com.bytedance.sdk.component.hhw.zmn.fb.zmn.zmn(string, PangleNetworkBridge.jsonObjectInit(string2));
                            zmnVar.zn(zn());
                            zmnVar.fs(zmn());
                            arrayList.add(zmnVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        zmn2.close();
                        if (!this.zmn.isEmpty()) {
                            zmn(this.zmn);
                            this.zmn.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    protected void zmn(List<String> list) {
        fs();
        list.size();
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), "DELETE FROM " + fs() + " WHERE " + zmn("id", list, 1000, true));
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.yo(), list.size());
        zn(list);
    }

    public List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> fs(String str) {
        com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar = this.zn;
        if (zmnVar == null) {
            return new ArrayList();
        }
        return zmn(zmnVar.fs(), str);
    }

    public void fs(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar : list) {
            linkedList.add(zmnVar.zn());
            com.bytedance.sdk.component.hhw.zmn.zn.zmn.iv(zmnVar);
        }
        fs();
        linkedList.size();
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), "DELETE FROM " + fs() + " WHERE " + zmn("id", linkedList, 1000, true));
        zn(linkedList);
    }

    public void zmn(int i, long j) {
        fs(i, j);
    }

    private void fs(int i, long j) {
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), fs(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    public boolean zmn(int i) {
        return this.zn != null && fb() >= this.zn.zmn();
    }

    public static String zn(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    private static String zmn(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String zmn = zmn(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(zmn);
            sb.append("')");
        }
        return zmn(sb.toString(), str + str2 + "('')");
    }

    private static String zmn(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
