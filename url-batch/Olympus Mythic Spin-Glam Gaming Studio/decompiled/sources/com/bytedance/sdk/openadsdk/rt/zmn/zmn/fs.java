package com.bytedance.sdk.openadsdk.rt.zmn.zmn;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.mobilefuse.sdk.device.UserAgentInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public class fs {
    private static volatile fs zmn;
    private final WeakReference<ConcurrentHashMap<String, nqi>> fs = new WeakReference<>(new ConcurrentHashMap());

    private fs() {
    }

    public static fs zmn() {
        if (zmn == null) {
            synchronized (fs.class) {
                try {
                    if (zmn == null) {
                        zmn = new fs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String zmn(String str) {
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar;
        int columnIndex;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", new String[]{"material"}, "material_key=?", new String[]{str}, null, null, null));
            try {
                if (zmnVar.moveToFirst() && (columnIndex = zmnVar.getColumnIndex("material")) != -1) {
                    String string = zmnVar.getString(columnIndex);
                    zmnVar.close();
                    return string;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            zmnVar = null;
        }
        zmnVar.close();
        return null;
    }

    public void zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar) {
        int i;
        boolean z;
        if (zmnVar == null || TextUtils.isEmpty(zmnVar.nps())) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", zmnVar.btk());
            contentValues.put("main_title", zmnVar.fb());
            contentValues.put("material_key", zmnVar.nps());
            contentValues.put("time", zmnVar.hhw());
            contentValues.put("item_index", Integer.valueOf(zmnVar.fs()));
            contentValues.put("sdk_version", zmnVar.zmn());
            com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", contentValues);
            String zn = zmnVar.zn();
            if (TextUtils.isEmpty(zn)) {
                return;
            }
            com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar2 = null;
            try {
                com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{zmnVar.nps()}, null, null, null));
                try {
                    if (zmnVar3.moveToFirst()) {
                        int columnIndex = zmnVar3.getColumnIndex("count");
                        if (columnIndex != -1) {
                            i = zmnVar3.getInt(columnIndex);
                            z = true;
                        } else {
                            z = true;
                            i = 0;
                        }
                    } else {
                        i = 0;
                        z = false;
                    }
                    zmnVar3.close();
                    if (z) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("count", Integer.valueOf(i + 1));
                        com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", contentValues2, "material_key=?", new String[]{zmnVar.nps()});
                    } else {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("material_key", zmnVar.nps());
                        contentValues3.put("material", zn);
                        contentValues3.put("sdk_version", zmnVar.zmn());
                        contentValues3.put("count", (Integer) 0);
                        com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", contentValues3);
                    }
                } catch (Throwable th) {
                    th = th;
                    zmnVar2 = zmnVar3;
                    if (zmnVar2 != null) {
                        zmnVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable unused) {
        }
    }

    public void fs(com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar) {
        int columnIndex;
        if (zmnVar == null || TextUtils.isEmpty(zmnVar.nps())) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", zmnVar.btk());
            contentValues.put("main_title", zmnVar.fb());
            contentValues.put("material_key", zmnVar.nps());
            contentValues.put("time", zmnVar.hhw());
            contentValues.put("item_index", Integer.valueOf(zmnVar.fs()));
            contentValues.put("sdk_version", zmnVar.zmn());
            com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", contentValues);
            String zn = zmnVar.zn();
            if (TextUtils.isEmpty(zn)) {
                return;
            }
            com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar2 = null;
            try {
                com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{zmnVar.nps()}, null, null, null));
                try {
                    int i = (!zmnVar3.moveToFirst() || (columnIndex = zmnVar3.getColumnIndex("count")) == -1) ? 0 : zmnVar3.getInt(columnIndex);
                    zmnVar3.close();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("material_key", zmnVar.nps());
                    contentValues2.put("material", zn);
                    contentValues2.put("sdk_version", zmnVar.zmn());
                    contentValues2.put("count", Integer.valueOf(i + 1));
                    com.bytedance.sdk.openadsdk.core.nps.fs.fs(kgc.zmn(), "iab_history_material", contentValues2);
                } catch (Throwable th) {
                    th = th;
                    zmnVar2 = zmnVar3;
                    if (zmnVar2 != null) {
                        zmnVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r9 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<com.bytedance.sdk.openadsdk.rt.zmn.zmn> fs() {
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar;
        ArrayList arrayList = new ArrayList();
        try {
            zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", null, null, null, null, null, "time DESC"));
            try {
                if (zmnVar.moveToFirst()) {
                    do {
                        int columnIndex = zmnVar.getColumnIndex("_id");
                        int columnIndex2 = zmnVar.getColumnIndex("url");
                        int columnIndex3 = zmnVar.getColumnIndex("main_title");
                        int columnIndex4 = zmnVar.getColumnIndex("material_key");
                        int columnIndex5 = zmnVar.getColumnIndex("time");
                        int columnIndex6 = zmnVar.getColumnIndex("item_index");
                        if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1 && columnIndex5 != -1) {
                            zmnVar.getString(columnIndex);
                            com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.rt.zmn.zmn();
                            zmnVar2.fs(zmnVar.getInt(columnIndex6));
                            zmnVar2.zmn(columnIndex);
                            zmnVar2.fs(zmnVar.getString(columnIndex4));
                            zmnVar2.btk(zmnVar.getString(columnIndex2));
                            zmnVar2.fb(zmnVar.getString(columnIndex3));
                            zmnVar2.zn(zmnVar.getString(columnIndex5));
                            arrayList.add(zmnVar2);
                        }
                    } while (zmnVar.moveToNext());
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            zmnVar = null;
        }
        zmnVar.close();
        return arrayList;
    }

    public void zn() {
        try {
            com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", null, null);
            com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", null, null);
            ConcurrentHashMap<String, nqi> concurrentHashMap = this.fs.get();
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void fb() {
        try {
            ArrayList arrayList = new ArrayList();
            int nps = nps();
            if (nps > 1000) {
                arrayList.addAll(zmn(nps - 1000));
            }
            for (String str : zmn(System.currentTimeMillis() - UserAgentInfo.USER_AGENT_MAX_VALIDITY_TIME_MILLIS)) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.utils.fs.btk()) {
                zn(arrayList);
            } else {
                fs(arrayList);
            }
            zmn(arrayList);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r1 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<String> zmn(long j) {
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar;
        ArrayList arrayList = new ArrayList();
        try {
            zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", new String[]{"_id"}, "time < ?", new String[]{String.valueOf(j)}, null, null, "time ASC"));
            try {
                if (zmnVar.moveToFirst()) {
                    do {
                        arrayList.add(zmnVar.getString(0));
                    } while (zmnVar.moveToNext());
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            zmnVar = null;
        }
        zmnVar.close();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int nps() {
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar;
        try {
            zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", new String[]{"COUNT(*)"}, null, null, null, null, null));
            try {
                if (zmnVar.moveToFirst()) {
                    int i = zmnVar.getInt(0);
                    zmnVar.close();
                    return i;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            zmnVar = null;
        }
        zmnVar.close();
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r1 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<String> zmn(int i) {
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar;
        ArrayList arrayList = new ArrayList();
        try {
            zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", new String[]{"_id"}, null, null, null, null, "time ASC"));
            try {
                if (zmnVar.moveToFirst()) {
                    int i2 = 0;
                    while (i2 < i) {
                        arrayList.add(zmnVar.getString(0));
                        i2++;
                        if (!zmnVar.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            zmnVar = null;
        }
        zmnVar.close();
        return arrayList;
    }

    private void zmn(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", "_id IN (" + TextUtils.join(StringUtils.COMMA, Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]));
        } catch (Throwable unused) {
        }
    }

    private void fs(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(StringUtils.COMMA, Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
            ArrayList<String> arrayList = new ArrayList();
            if (zmnVar.moveToFirst()) {
                do {
                    arrayList.add(zmnVar.getString(0));
                } while (zmnVar.moveToNext());
            }
            zmnVar.close();
            for (String str : arrayList) {
                int fs = fs(str);
                if (fs > 0) {
                    zmn(str, fs - 1);
                }
                if (fs <= 0) {
                    zn(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void zn(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(StringUtils.COMMA, Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
            ArrayList<String> arrayList = new ArrayList();
            if (zmnVar.moveToFirst()) {
                do {
                    arrayList.add(zmnVar.getString(0));
                } while (zmnVar.moveToNext());
            }
            zmnVar.close();
            for (String str : arrayList) {
                int fs = fs(str) - 1;
                if (fs > 0) {
                    zmn(str, fs);
                } else {
                    zn(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int fs(String str) {
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar;
        try {
            zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{str}, null, null, null));
            try {
                if (zmnVar.moveToFirst()) {
                    int i = zmnVar.getInt(0);
                    zmnVar.close();
                    return i;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            zmnVar = null;
        }
        zmnVar.close();
        return 0;
    }

    private void zmn(String str, int i) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("count", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", contentValues, "material_key=?", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    private void zn(String str) {
        try {
            com.bytedance.sdk.openadsdk.core.nps.fs.zmn(kgc.zmn(), "iab_history_material", "material_key=?", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public static String btk() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS iab_history (_id INTEGER PRIMARY KEY AUTOINCREMENT,url TEXT,main_title TEXT,material_key TEXT,time TEXT,item_index INTEGER,sdk_version TEXT)").toString();
    }

    public static String hhw() {
        return "CREATE TABLE IF NOT EXISTS iab_history_material (material_key TEXT PRIMARY KEY,material TEXT,sdk_version TEXT,count INTEGER DEFAULT 0)";
    }
}
