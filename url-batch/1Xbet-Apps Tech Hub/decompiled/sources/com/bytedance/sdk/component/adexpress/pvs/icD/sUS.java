package com.bytedance.sdk.component.adexpress.pvs.icD;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.Ju;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TmplDbHelper.java */
/* loaded from: classes.dex */
public class sUS {
    private static volatile sUS icD = null;
    public static int pvs = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.pvs.vG.vG> NB;
    private final Object Jd = new Object();
    private AtomicBoolean sUS = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.pvs.vG.icD> yiw = new LruCache<String, com.bytedance.sdk.component.adexpress.pvs.vG.icD>(pvs) { // from class: com.bytedance.sdk.component.adexpress.pvs.icD.sUS.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.pvs.vG.icD icd) {
            return 1;
        }
    };
    private Set<String> vG = Collections.synchronizedSet(new HashSet());

    public static String vG() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public static void pvs(int i) {
        pvs = i;
    }

    public static sUS pvs() {
        if (icD == null) {
            synchronized (sUS.class) {
                if (icD == null) {
                    icD = new sUS();
                }
            }
        }
        return icD;
    }

    private sUS() {
    }

    com.bytedance.sdk.component.adexpress.pvs.vG.icD pvs(String str) {
        com.bytedance.sdk.component.adexpress.pvs.vG.icD icd;
        com.bytedance.sdk.component.adexpress.pvs.vG.icD pvs2;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD() == null) {
            return null;
        }
        synchronized (this.Jd) {
            icd = this.yiw.get(String.valueOf(str));
        }
        if (icd != null) {
            return icd;
        }
        Cursor pvs3 = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD().pvs("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (pvs3 != null) {
            try {
                if (pvs3.moveToFirst()) {
                    do {
                        String string = pvs3.getString(pvs3.getColumnIndex("rit"));
                        String string2 = pvs3.getString(pvs3.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                        String string3 = pvs3.getString(pvs3.getColumnIndex("md5"));
                        String string4 = pvs3.getString(pvs3.getColumnIndex(ImagesContract.URL));
                        String string5 = pvs3.getString(pvs3.getColumnIndex("data"));
                        pvs2 = new com.bytedance.sdk.component.adexpress.pvs.vG.icD().pvs(string).icD(string2).vG(string3).Jd(string4).NB(string5).sUS(pvs3.getString(pvs3.getColumnIndex("version"))).pvs(Long.valueOf(pvs3.getLong(pvs3.getColumnIndex("update_time"))));
                        synchronized (this.Jd) {
                            this.yiw.put(string2, pvs2);
                        }
                        this.vG.add(string2);
                    } while (pvs3.moveToNext());
                    return pvs2;
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return null;
    }

    Set<String> icD(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD() != null) {
            HashSet hashSet = new HashSet();
            Cursor pvs2 = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD().pvs("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            try {
                if (pvs2 != null) {
                    try {
                        if (pvs2.moveToFirst()) {
                            do {
                                hashSet.add(pvs2.getString(pvs2.getColumnIndex(FacebookMediationAdapter.KEY_ID)));
                            } while (pvs2.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e) {
                        Log.e("TmplDbHelper", "", e);
                    }
                }
            } finally {
                pvs2.close();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
    
        if (r3 == null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    List<com.bytedance.sdk.component.adexpress.pvs.vG.icD> icD() {
        if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD() == null) {
            return null;
        }
        boolean z = this.sUS.get();
        this.sUS.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor pvs2 = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD().pvs("template_diff_new", null, null, null, null, null, null);
        if (pvs2 != null) {
            while (pvs2.moveToNext()) {
                try {
                    String string = pvs2.getString(pvs2.getColumnIndex("rit"));
                    String string2 = pvs2.getString(pvs2.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                    String string3 = pvs2.getString(pvs2.getColumnIndex("md5"));
                    String string4 = pvs2.getString(pvs2.getColumnIndex(ImagesContract.URL));
                    String string5 = pvs2.getString(pvs2.getColumnIndex("data"));
                    String string6 = pvs2.getString(pvs2.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.pvs.vG.icD().pvs(string).icD(string2).vG(string3).Jd(string4).NB(string5).sUS(string6).pvs(Long.valueOf(pvs2.getLong(pvs2.getColumnIndex("update_time")))));
                    synchronized (this.Jd) {
                        this.yiw.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.vG.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().sUS() != null) {
                        if (this.NB == null) {
                            this.NB = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.NB.contains(string2)) {
                            this.NB.put(string2, new com.bytedance.sdk.component.adexpress.pvs.vG.vG(string, string2, string3));
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Ju.pvs("TmplDbHelper", "getTemplate error", th);
                    } finally {
                        if (pvs2 != null) {
                            pvs2.close();
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    void pvs(com.bytedance.sdk.component.adexpress.pvs.vG.icD icd, boolean z) {
        if (icd == null || com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD() == null || TextUtils.isEmpty(icd.icD())) {
            return;
        }
        Cursor pvs2 = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD().pvs("template_diff_new", null, "id=?", new String[]{icd.icD()}, null, null, null);
        boolean z2 = pvs2 != null && pvs2.getCount() > 0;
        if (pvs2 != null) {
            try {
                r3 = pvs2.moveToFirst() ? pvs2.getString(pvs2.getColumnIndex("rit")) : null;
                pvs2.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", icd.pvs());
        contentValues.put(FacebookMediationAdapter.KEY_ID, icd.icD());
        contentValues.put("md5", icd.vG());
        contentValues.put(ImagesContract.URL, icd.Jd());
        contentValues.put("data", icd.NB());
        contentValues.put("version", icd.sUS());
        contentValues.put("update_time", icd.yiw());
        if (z2) {
            com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD().pvs("template_diff_new", contentValues, "id=?", new String[]{icd.icD()});
        } else {
            com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD().pvs("template_diff_new", contentValues);
        }
        synchronized (this.Jd) {
            this.yiw.put(icd.icD(), icd);
        }
        this.vG.add(icd.icD());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().sUS() == null) {
                return;
            }
            if (this.NB == null) {
                this.NB = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.pvs.vG.vG vGVar = new com.bytedance.sdk.component.adexpress.pvs.vG.vG(icd.pvs(), icd.icD(), icd.vG());
            this.NB.put(icd.icD(), vGVar);
            if (r3 != null) {
                com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().sUS();
                vGVar.icD();
            }
            com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().sUS();
            icd.pvs();
        } catch (Throwable unused2) {
        }
    }

    void pvs(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                Jd(strArr[i]);
                com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().icD().pvs("template_diff_new", "id=?", new String[]{strArr[i]});
                vG(strArr[i]);
            }
        }
    }

    void vG(String str) {
        com.bytedance.sdk.component.adexpress.pvs.vG.vG vGVar;
        try {
            if (this.NB == null || this.NB.isEmpty() || (vGVar = this.NB.get(str)) == null) {
                return;
            }
            if (!TextUtils.isEmpty(vGVar.pvs()) && com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().sUS() != null) {
                com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().sUS();
            }
            this.NB.remove(str);
        } catch (Throwable unused) {
        }
    }

    private void Jd(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.pvs.vG.icD> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.yiw) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.Jd) {
            this.yiw.remove(str);
        }
    }
}
