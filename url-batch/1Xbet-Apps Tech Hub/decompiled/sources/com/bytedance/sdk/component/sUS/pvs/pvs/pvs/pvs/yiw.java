package com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.so;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: StatsLogEventRepoImpl.java */
/* loaded from: classes.dex */
public class yiw extends vG {
    protected List<String> pvs;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs vG;

    public byte pvs() {
        return (byte) 1;
    }

    public byte vG() {
        return (byte) 2;
    }

    public yiw(Context context, com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        super(context);
        this.pvs = new ArrayList();
        this.vG = pvsVar;
        if (pvsVar == null) {
            this.vG = com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs.vG();
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.vG
    public String icD() {
        return so.yiw().Jd().Jd();
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
    public int Jd() {
        Cursor cursor;
        int i = 0;
        try {
            cursor = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), icD(), new String[]{"count(1)"}, null, null, null, null, null);
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

    public List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs(int i, String str) {
        long pvs = com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs(i, NB());
        if (pvs <= 0) {
            pvs = 1;
        } else if (pvs > 100) {
            pvs = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.pvs.clear();
        Cursor pvs2 = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), icD(), new String[]{FacebookMediationAdapter.KEY_ID, "value", "encrypt"}, null, null, null, null, str + " DESC limit " + pvs);
        if (pvs2 != null) {
            while (pvs2.moveToNext()) {
                try {
                    try {
                        String string = pvs2.getString(pvs2.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                        String string2 = pvs2.getString(pvs2.getColumnIndex("value"));
                        if (pvs2.getInt(pvs2.getColumnIndex("encrypt")) == 1) {
                            string2 = so.yiw().mnm().pvs(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.pvs.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs pvsVar = new com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs(string, new JSONObject(string2));
                            pvsVar.icD(vG());
                            pvsVar.pvs(pvs());
                            arrayList.add(pvsVar);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    if (pvs2 != null) {
                        try {
                            pvs2.close();
                            if (!this.pvs.isEmpty()) {
                                pvs(this.pvs);
                                this.pvs.clear();
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            if (pvs2 != null) {
                try {
                    pvs2.close();
                    if (!this.pvs.isEmpty()) {
                        pvs(this.pvs);
                        this.pvs.clear();
                    }
                } catch (Exception unused3) {
                }
            }
        }
        return arrayList;
    }

    protected void pvs(List<String> list) {
        icD();
        list.size();
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), "DELETE FROM " + icD() + " WHERE " + pvs(FacebookMediationAdapter.KEY_ID, list, 1000, true));
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.thO(), list.size());
        vG(list);
    }

    public List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> icD(String str) {
        com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar = this.vG;
        if (pvsVar == null) {
            return new ArrayList();
        }
        return pvs(pvsVar.icD(), str);
    }

    public void icD(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar : list) {
            linkedList.add(pvsVar.vG());
            com.bytedance.sdk.component.sUS.pvs.vG.pvs.Wyp(pvsVar);
        }
        icD();
        linkedList.size();
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), "DELETE FROM " + icD() + " WHERE " + pvs(FacebookMediationAdapter.KEY_ID, linkedList, 1000, true));
        vG(linkedList);
    }

    public void pvs(int i, long j) {
        icD(i, j);
    }

    private void icD(int i, long j) {
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), icD(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    public boolean pvs(int i) {
        return this.vG != null && Jd() >= this.vG.pvs();
    }

    public static String vG(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    private static String pvs(String str, List<?> list, int i, boolean z) {
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
            String pvs = pvs(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str).append(str2).append("('").append(pvs).append("')");
        }
        return pvs(sb.toString(), str + str2 + "('')");
    }

    private static String pvs(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
