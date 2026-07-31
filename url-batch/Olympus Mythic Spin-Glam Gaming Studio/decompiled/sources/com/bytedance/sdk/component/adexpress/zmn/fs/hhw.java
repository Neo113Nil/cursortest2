package com.bytedance.sdk.component.adexpress.zmn.fs;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class hhw {
    private static volatile hhw fs = null;
    public static int zmn = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.zmn.zn.zn> btk;
    private final Object fb = new Object();
    private AtomicBoolean hhw = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.zmn.zn.fs> nps = new LruCache<String, com.bytedance.sdk.component.adexpress.zmn.zn.fs>(zmn) { // from class: com.bytedance.sdk.component.adexpress.zmn.fs.hhw.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.zmn.zn.fs fsVar) {
            return 1;
        }
    };
    private Set<String> zn = Collections.synchronizedSet(new HashSet());

    public static void zmn(int i) {
        zmn = i;
    }

    public static hhw zmn() {
        if (fs == null) {
            synchronized (hhw.class) {
                try {
                    if (fs == null) {
                        fs = new hhw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    private hhw() {
    }

    com.bytedance.sdk.component.adexpress.zmn.zn.fs zmn(String str) {
        com.bytedance.sdk.component.adexpress.zmn.zn.fs fsVar;
        com.bytedance.sdk.component.adexpress.zmn.zn.fs zmn2;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs() == null) {
            return null;
        }
        synchronized (this.fb) {
            fsVar = this.nps.get(String.valueOf(str));
        }
        if (fsVar != null) {
            return fsVar;
        }
        Cursor zmn3 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs().zmn("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (zmn3 != null) {
            try {
                if (zmn3.moveToFirst()) {
                    do {
                        String string = zmn3.getString(zmn3.getColumnIndex("rit"));
                        String string2 = zmn3.getString(zmn3.getColumnIndex("id"));
                        String string3 = zmn3.getString(zmn3.getColumnIndex("md5"));
                        String string4 = zmn3.getString(zmn3.getColumnIndex("url"));
                        String string5 = zmn3.getString(zmn3.getColumnIndex("data"));
                        String string6 = zmn3.getString(zmn3.getColumnIndex("version"));
                        zmn2 = new com.bytedance.sdk.component.adexpress.zmn.zn.fs().zmn(string).fs(string2).zn(string3).fb(string4).btk(string5).hhw(string6).zmn(Long.valueOf(zmn3.getLong(zmn3.getColumnIndex("update_time"))));
                        synchronized (this.fb) {
                            this.nps.put(string2, zmn2);
                        }
                        this.zn.add(string2);
                    } while (zmn3.moveToNext());
                    zmn3.close();
                    return zmn2;
                }
            } catch (Throwable unused) {
            }
            zmn3.close();
        }
        return null;
    }

    Set<String> fs(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs() != null) {
            HashSet hashSet = new HashSet();
            Cursor zmn2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs().zmn("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (zmn2 != null) {
                try {
                    try {
                        if (zmn2.moveToFirst()) {
                            do {
                                hashSet.add(zmn2.getString(zmn2.getColumnIndex("id")));
                            } while (zmn2.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e) {
                        Log.e("TmplDbHelper", "", e);
                    }
                } finally {
                    zmn2.close();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<com.bytedance.sdk.component.adexpress.zmn.zn.fs> fs() {
        if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs() == null) {
            return null;
        }
        boolean z = this.hhw.get();
        this.hhw.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor zmn2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs().zmn("template_diff_new", null, null, null, null, null, null);
        if (zmn2 != null) {
            while (zmn2.moveToNext()) {
                try {
                    String string = zmn2.getString(zmn2.getColumnIndex("rit"));
                    String string2 = zmn2.getString(zmn2.getColumnIndex("id"));
                    String string3 = zmn2.getString(zmn2.getColumnIndex("md5"));
                    String string4 = zmn2.getString(zmn2.getColumnIndex("url"));
                    String string5 = zmn2.getString(zmn2.getColumnIndex("data"));
                    String string6 = zmn2.getString(zmn2.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.zmn.zn.fs().zmn(string).fs(string2).zn(string3).fb(string4).btk(string5).hhw(string6).zmn(Long.valueOf(zmn2.getLong(zmn2.getColumnIndex("update_time")))));
                    synchronized (this.fb) {
                        this.nps.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.zn.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().hhw() != null) {
                        if (this.btk == null) {
                            this.btk = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.btk.contains(string2)) {
                            this.btk.put(string2, new com.bytedance.sdk.component.adexpress.zmn.zn.zn(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            zmn2.close();
        }
        return arrayList;
    }

    void zmn(com.bytedance.sdk.component.adexpress.zmn.zn.fs fsVar, boolean z) {
        if (fsVar == null || com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs() == null || TextUtils.isEmpty(fsVar.fs())) {
            return;
        }
        Cursor zmn2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs().zmn("template_diff_new", null, "id=?", new String[]{fsVar.fs()}, null, null, null);
        boolean z2 = zmn2 != null && zmn2.getCount() > 0;
        if (zmn2 != null) {
            try {
                r2 = zmn2.moveToFirst() ? zmn2.getString(zmn2.getColumnIndex("rit")) : null;
                zmn2.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", fsVar.zmn());
        contentValues.put("id", fsVar.fs());
        contentValues.put("md5", fsVar.zn());
        contentValues.put("url", fsVar.fb());
        contentValues.put("data", fsVar.btk());
        contentValues.put("version", fsVar.hhw());
        contentValues.put("update_time", fsVar.nps());
        if (z2) {
            com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs().zmn("template_diff_new", contentValues, "id=?", new String[]{fsVar.fs()});
        } else {
            com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs().zmn("template_diff_new", contentValues);
        }
        synchronized (this.fb) {
            this.nps.put(fsVar.fs(), fsVar);
        }
        this.zn.add(fsVar.fs());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().hhw() == null) {
                return;
            }
            if (this.btk == null) {
                this.btk = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.zmn.zn.zn znVar = new com.bytedance.sdk.component.adexpress.zmn.zn.zn(fsVar.zmn(), fsVar.fs(), fsVar.zn());
            this.btk.put(fsVar.fs(), znVar);
            if (r2 != null) {
                com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().hhw();
                znVar.fs();
            }
            com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().hhw();
            fsVar.zmn();
        } catch (Throwable unused2) {
        }
    }

    void zmn(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                fb(strArr[i]);
                com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().fs().zmn("template_diff_new", "id=?", new String[]{strArr[i]});
                zn(strArr[i]);
            }
        }
    }

    void zn(String str) {
        com.bytedance.sdk.component.adexpress.zmn.zn.zn znVar;
        try {
            if (this.btk == null || this.btk.isEmpty() || (znVar = this.btk.get(str)) == null) {
                return;
            }
            if (!TextUtils.isEmpty(znVar.zmn()) && com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().hhw() != null) {
                com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().hhw();
            }
            this.btk.remove(str);
        } catch (Throwable unused) {
        }
    }

    private void fb(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.zmn.zn.fs> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.nps) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.fb) {
            this.nps.remove(str);
        }
    }

    public static String zn() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }
}
