package com.bytedance.sdk.openadsdk.core.mw.zmn;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.openadsdk.core.kgc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public class zn {
    private static volatile zn fs = null;
    public static int zmn = 20;
    private final Object zn = new Object();
    private final LruCache<String, zmn> fb = new LruCache<String, zmn>(zmn) { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.zn.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, zmn zmnVar) {
            return 1;
        }
    };

    private zn() {
    }

    public static zn zmn() {
        if (fs == null) {
            synchronized (zn.class) {
                try {
                    if (fs == null) {
                        fs = new zn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    zmn zmn(String str, String str2) {
        zmn zmnVar;
        zmn zmn2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.zn) {
            zmnVar = this.fb.get(str);
        }
        if (zmnVar != null) {
            if (TextUtils.equals(str2, zmnVar.fs())) {
                return zmnVar;
            }
            fs(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(kgc.zmn(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (zmnVar2.moveToFirst()) {
                do {
                    int columnIndex = zmnVar2.getColumnIndex("id");
                    int columnIndex2 = zmnVar2.getColumnIndex("md5");
                    int columnIndex3 = zmnVar2.getColumnIndex("url");
                    int columnIndex4 = zmnVar2.getColumnIndex("data");
                    int columnIndex5 = zmnVar2.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = zmnVar2.getColumnIndex("rit");
                        String string = zmnVar2.getString(columnIndex);
                        String string2 = zmnVar2.getString(columnIndex2);
                        String string3 = zmnVar2.getString(columnIndex3);
                        String string4 = zmnVar2.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        zmn2 = new zmn().zmn(string).fs(string2).fb(string4).zn(string3).btk(columnIndex6 != -1 ? zmnVar2.getString(columnIndex6) : null).zmn(Long.valueOf(zmnVar2.getLong(columnIndex5)));
                        synchronized (this.zn) {
                            this.fb.put(string, zmn2);
                        }
                    }
                    return null;
                } while (zmnVar2.moveToNext());
                return zmn2;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    void zmn(zmn zmnVar) {
        if (zmnVar == null || TextUtils.isEmpty(zmnVar.zmn())) {
            return;
        }
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(kgc.zmn(), "ugen_template", null, "id=?", new String[]{zmnVar.zmn()}, null, null, null));
        boolean z = zmnVar2.getCount() > 0;
        try {
            zmnVar2.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", zmnVar.zmn());
            contentValues.put("md5", zmnVar.fs());
            contentValues.put("url", zmnVar.zn());
            contentValues.put("data", zmnVar.btk());
            contentValues.put("rit", zmnVar.hhw());
            contentValues.put("update_time", zmnVar.fb());
            if (z) {
                com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(kgc.zmn(), "ugen_template", contentValues, "id=?", new String[]{zmnVar.zmn()});
            } else {
                com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(kgc.zmn(), "ugen_template", contentValues);
            }
            synchronized (this.zn) {
                this.fb.put(zmnVar.zmn(), zmnVar);
            }
        } catch (Throwable unused) {
        }
    }

    List<zmn> fs() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(kgc.zmn(), "ugen_template", null, null, null, null, null, null));
        try {
            if (zmnVar.moveToFirst()) {
                do {
                    int columnIndex = zmnVar.getColumnIndex("id");
                    int columnIndex2 = zmnVar.getColumnIndex("md5");
                    int columnIndex3 = zmnVar.getColumnIndex("url");
                    int columnIndex4 = zmnVar.getColumnIndex("data");
                    int columnIndex5 = zmnVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = zmnVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? zmnVar.getString(columnIndex6) : null;
                        String string2 = zmnVar.getString(columnIndex);
                        String string3 = zmnVar.getString(columnIndex2);
                        String string4 = zmnVar.getString(columnIndex3);
                        zmn zmn2 = new zmn().zmn(string2).fs(string3).zn(string4).fb(zmnVar.getString(columnIndex4)).btk(string).zmn(Long.valueOf(zmnVar.getLong(columnIndex5)));
                        arrayList.add(zmn2);
                        synchronized (this.zn) {
                            this.fb.put(string2, zmn2);
                        }
                    }
                } while (zmnVar.moveToNext());
            }
        } finally {
            try {
                return arrayList;
            } finally {
            }
        }
        return arrayList;
    }

    Set<zmn> zmn(String str) {
        zmn zmnVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.kw.zmn.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(kgc.zmn(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (zmnVar2.moveToFirst()) {
                do {
                    int columnIndex = zmnVar2.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = zmnVar2.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.zn) {
                                zmnVar = this.fb.get(string);
                            }
                            if (zmnVar != null) {
                                hashSet.add(zmnVar);
                            } else {
                                zmn zmnVar3 = new zmn();
                                int columnIndex2 = zmnVar2.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = zmnVar2.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        zmnVar3.fb(string2);
                                        zmnVar3.zmn(string);
                                        zmnVar3.btk(str);
                                        int columnIndex3 = zmnVar2.getColumnIndex("md5");
                                        int columnIndex4 = zmnVar2.getColumnIndex("url");
                                        int columnIndex5 = zmnVar2.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            zmnVar3.fs(zmnVar2.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            zmnVar3.zn(zmnVar2.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            zmnVar3.zmn(Long.valueOf(zmnVar2.getLong(columnIndex5)));
                                        }
                                        hashSet.add(zmnVar3);
                                        synchronized (this.zn) {
                                            this.fb.put(string, zmnVar3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (zmnVar2.moveToNext());
            }
        } finally {
            try {
                return hashSet;
            } finally {
            }
        }
        return hashSet;
    }

    void zmn(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                fs(str);
                com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(kgc.zmn(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }

    private void fs(String str) {
        if (!TextUtils.isEmpty(str) && this.fb.size() > 0) {
            synchronized (this.zn) {
                this.fb.remove(str);
            }
        }
    }

    public static String zn() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }

    public static String fb() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }
}
