package com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zmn extends zn {
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn fb;
    protected List<String> zmn;
    private final Context zn;

    public byte fb() {
        return (byte) 0;
    }

    public byte zn() {
        return (byte) 2;
    }

    public zmn(Context context, com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
        super(context);
        this.zmn = new ArrayList();
        this.zn = context;
        this.fb = zmnVar;
        if (zmnVar == null) {
            this.fb = com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn.zn();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r0 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int zmn() {
        Cursor cursor = null;
        int i = 0;
        try {
            cursor = com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), fs(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                i = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        return i;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zn
    public String fs() {
        com.bytedance.sdk.component.hhw.zmn.zmn.btk zn = com.bytedance.sdk.component.hhw.zmn.nps.hhw().zn();
        if (zn != null) {
            return zn.fs();
        }
        return null;
    }

    public List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn(int i, String str) {
        String str2;
        String[] strArr;
        byte b;
        String str3;
        Cursor zmn;
        long zmn2 = com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn(i, btk());
        fs();
        if (zmn2 <= 0) {
            zmn2 = 1;
        } else if (zmn2 > 100) {
            zmn2 = 100;
        }
        String str4 = str + " DESC limit " + zmn2;
        ArrayList arrayList = new ArrayList();
        this.zmn.clear();
        long cyb = com.bytedance.sdk.component.hhw.zmn.nps.hhw().cyb();
        if (cyb > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - cyb)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.hhw.zmn.zn.zmn.fb() && fb() == 3) {
            b = 3;
            str3 = "id";
            zmn = com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), fs(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            b = 3;
            str3 = "id";
            zmn = com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), fs(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = zmn;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.hhw.zmn.btk cn = com.bytedance.sdk.component.hhw.zmn.nps.hhw().cn();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.hhw.zmn.zn.zmn.fb() && fb() == b) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = cn.zmn(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.zmn.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(string2);
                            com.bytedance.sdk.component.hhw.zmn.fb.zmn.zmn zmnVar = new com.bytedance.sdk.component.hhw.zmn.fb.zmn.zmn(string, jsonObjectInit);
                            zmnVar.fs(fb());
                            zmnVar.zn(zn());
                            if (com.bytedance.sdk.component.hhw.zmn.zn.zmn.fb() && fb() == b) {
                                zmnVar.zmn(i3);
                            }
                            com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn(jsonObjectInit, zmnVar);
                            arrayList.add(zmnVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.zmn.isEmpty()) {
                        zmn(this.zmn);
                        this.zmn.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        fs();
        arrayList.size();
        return arrayList;
    }

    public List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn(String str) {
        com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar = this.fb;
        if (zmnVar == null) {
            return new ArrayList();
        }
        return zmn(zmnVar.fs(), str);
    }

    protected void zmn(List<String> list) {
        fs();
        list.size();
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), "DELETE FROM " + fs() + " WHERE " + zmn("id", list, 1000, true));
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.yo(), list.size());
        zn(list);
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
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), fs(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            fs();
        }
    }

    public boolean zmn(int i) {
        if (this.fb == null) {
            return false;
        }
        int zmn = zmn();
        int zmn2 = this.fb.zmn();
        fs();
        return (com.bytedance.sdk.component.hhw.zmn.zn.zmn.zn() && (i == 1 || i == 2)) ? zmn > 0 : zmn >= zmn2;
    }

    public static String fs(String str) {
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
