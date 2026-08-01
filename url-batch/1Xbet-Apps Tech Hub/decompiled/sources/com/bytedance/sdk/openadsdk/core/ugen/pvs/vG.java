package com.bytedance.sdk.openadsdk.core.ugen.pvs;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: UGenTmplDbHelper.java */
/* loaded from: classes2.dex */
public class vG {
    private static volatile vG icD = null;
    public static int pvs = 20;
    private final Object vG = new Object();
    private final LruCache<String, pvs> Jd = new LruCache<String, pvs>(pvs) { // from class: com.bytedance.sdk.openadsdk.core.ugen.pvs.vG.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, pvs pvsVar) {
            return 1;
        }
    };

    public static String Jd() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static String vG() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    private vG() {
    }

    public static vG pvs() {
        if (icD == null) {
            synchronized (vG.class) {
                if (icD == null) {
                    icD = new vG();
                }
            }
        }
        return icD;
    }

    pvs pvs(String str, String str2) {
        pvs pvsVar;
        pvs pvs2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.vG) {
            pvsVar = this.Jd.get(str);
        }
        if (pvsVar != null) {
            if (TextUtils.equals(str2, pvsVar.icD())) {
                return pvsVar;
            }
            icD(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.vG vGVar = new com.bytedance.sdk.openadsdk.multipro.aidl.vG(com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (vGVar.moveToFirst()) {
                do {
                    int columnIndex = vGVar.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                    int columnIndex2 = vGVar.getColumnIndex("md5");
                    int columnIndex3 = vGVar.getColumnIndex(ImagesContract.URL);
                    int columnIndex4 = vGVar.getColumnIndex("data");
                    int columnIndex5 = vGVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = vGVar.getColumnIndex("rit");
                        String string = vGVar.getString(columnIndex);
                        String string2 = vGVar.getString(columnIndex2);
                        String string3 = vGVar.getString(columnIndex3);
                        String string4 = vGVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        pvs2 = new pvs().pvs(string).icD(string2).Jd(string4).vG(string3).NB(columnIndex6 != -1 ? vGVar.getString(columnIndex6) : null).pvs(Long.valueOf(vGVar.getLong(columnIndex5)));
                        synchronized (this.vG) {
                            this.Jd.put(string, pvs2);
                        }
                    }
                    return null;
                } while (vGVar.moveToNext());
                return pvs2;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    void pvs(pvs pvsVar) {
        if (pvsVar == null || TextUtils.isEmpty(pvsVar.pvs())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.vG vGVar = new com.bytedance.sdk.openadsdk.multipro.aidl.vG(com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs(), "ugen_template", null, "id=?", new String[]{pvsVar.pvs()}, null, null, null));
        boolean z = vGVar.getCount() > 0;
        try {
            vGVar.close();
        } catch (Throwable unused) {
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, pvsVar.pvs());
        contentValues.put("md5", pvsVar.icD());
        contentValues.put(ImagesContract.URL, pvsVar.vG());
        contentValues.put("data", pvsVar.NB());
        contentValues.put("rit", pvsVar.sUS());
        contentValues.put("update_time", pvsVar.Jd());
        if (z) {
            com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs(), "ugen_template", contentValues, "id=?", new String[]{pvsVar.pvs()});
        } else {
            com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs(), "ugen_template", contentValues);
        }
        synchronized (this.vG) {
            this.Jd.put(pvsVar.pvs(), pvsVar);
        }
    }

    List<pvs> icD() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.vG vGVar = new com.bytedance.sdk.openadsdk.multipro.aidl.vG(com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs(), "ugen_template", null, null, null, null, null, null));
        try {
            if (vGVar.moveToFirst()) {
                do {
                    int columnIndex = vGVar.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                    int columnIndex2 = vGVar.getColumnIndex("md5");
                    int columnIndex3 = vGVar.getColumnIndex(ImagesContract.URL);
                    int columnIndex4 = vGVar.getColumnIndex("data");
                    int columnIndex5 = vGVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = vGVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? vGVar.getString(columnIndex6) : null;
                        String string2 = vGVar.getString(columnIndex);
                        String string3 = vGVar.getString(columnIndex2);
                        String string4 = vGVar.getString(columnIndex3);
                        pvs pvs2 = new pvs().pvs(string2).icD(string3).vG(string4).Jd(vGVar.getString(columnIndex4)).NB(string).pvs(Long.valueOf(vGVar.getLong(columnIndex5)));
                        arrayList.add(pvs2);
                        synchronized (this.vG) {
                            this.Jd.put(string2, pvs2);
                        }
                    }
                } while (vGVar.moveToNext());
            }
        } finally {
            try {
                return arrayList;
            } finally {
            }
        }
        return arrayList;
    }

    Set<pvs> pvs(String str) {
        pvs pvsVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.vG vGVar = new com.bytedance.sdk.openadsdk.multipro.aidl.vG(com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (vGVar.moveToFirst()) {
                do {
                    int columnIndex = vGVar.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                    if (columnIndex != -1) {
                        String string = vGVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.vG) {
                                pvsVar = this.Jd.get(string);
                            }
                            if (pvsVar != null) {
                                hashSet.add(pvsVar);
                            } else {
                                pvs pvsVar2 = new pvs();
                                int columnIndex2 = vGVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = vGVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        pvsVar2.Jd(string2);
                                        pvsVar2.pvs(string);
                                        pvsVar2.NB(str);
                                        int columnIndex3 = vGVar.getColumnIndex("md5");
                                        int columnIndex4 = vGVar.getColumnIndex(ImagesContract.URL);
                                        int columnIndex5 = vGVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            pvsVar2.icD(vGVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            pvsVar2.vG(vGVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            pvsVar2.pvs(Long.valueOf(vGVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(pvsVar2);
                                        synchronized (this.vG) {
                                            this.Jd.put(string, pvsVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (vGVar.moveToNext());
            }
        } finally {
            try {
                return hashSet;
            } finally {
            }
        }
        return hashSet;
    }

    void pvs(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                icD(str);
                com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }

    private void icD(String str) {
        if (!TextUtils.isEmpty(str) && this.Jd.size() > 0) {
            synchronized (this.vG) {
                this.Jd.remove(str);
            }
        }
    }
}
