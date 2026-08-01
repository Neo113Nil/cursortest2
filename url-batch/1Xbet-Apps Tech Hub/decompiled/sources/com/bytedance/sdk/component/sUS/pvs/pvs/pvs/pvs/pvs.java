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

/* compiled from: AdEventRepoImpl.java */
/* loaded from: classes.dex */
public class pvs extends vG {
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Jd;
    protected List<String> pvs;
    private final Context vG;

    public byte Jd() {
        return (byte) 0;
    }

    public byte vG() {
        return (byte) 2;
    }

    public pvs(Context context, com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        super(context);
        this.pvs = new ArrayList();
        this.vG = context;
        this.Jd = pvsVar;
        if (pvsVar == null) {
            this.Jd = com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs.vG();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r0 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int pvs() {
        Cursor cursor = null;
        int i = 0;
        try {
            cursor = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), icD(), new String[]{"count(1)"}, null, null, null, null, null);
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

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.vG
    public String icD() {
        com.bytedance.sdk.component.sUS.pvs.pvs.NB Jd = so.yiw().Jd();
        if (Jd != null) {
            return Jd.icD();
        }
        return null;
    }

    public List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs(int i, String str) {
        String str2;
        String[] strArr;
        String str3;
        String str4;
        Cursor pvs;
        long pvs2 = com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs(i, NB());
        icD();
        if (pvs2 <= 0) {
            pvs2 = 1;
        } else if (pvs2 > 100) {
            pvs2 = 100;
        }
        String str5 = str + " DESC limit " + pvs2;
        ArrayList arrayList = new ArrayList();
        this.pvs.clear();
        long vA = so.yiw().vA();
        if (vA > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - vA)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.sUS.pvs.vG.pvs.Jd() && Jd() == 3) {
            Context NB = NB();
            String icD = icD();
            String[] strArr2 = {FacebookMediationAdapter.KEY_ID, "value", "encrypt", "channel"};
            str3 = FacebookMediationAdapter.KEY_ID;
            str4 = "value";
            pvs = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB, icD, strArr2, str2, strArr, null, null, str5);
        } else {
            str3 = FacebookMediationAdapter.KEY_ID;
            str4 = "value";
            pvs = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), icD(), new String[]{str3, str4, "encrypt"}, str2, strArr, null, null, str5);
        }
        Cursor cursor = pvs;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.sUS.pvs.NB mnm = so.yiw().mnm();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex(str4));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.sUS.pvs.vG.pvs.Jd() && Jd() == 3) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = mnm.pvs(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.pvs.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs pvsVar = new com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs(string, jSONObject);
                            pvsVar.pvs(Jd());
                            pvsVar.icD(vG());
                            if (com.bytedance.sdk.component.sUS.pvs.vG.pvs.Jd() && Jd() == 3) {
                                pvsVar.pvs(i3);
                            }
                            com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs(jSONObject, pvsVar);
                            arrayList.add(pvsVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.pvs.isEmpty()) {
                            pvs(this.pvs);
                            this.pvs.clear();
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.pvs.isEmpty()) {
                            pvs(this.pvs);
                            this.pvs.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
                throw th3;
            }
        }
        icD();
        arrayList.size();
        return arrayList;
    }

    public List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs(String str) {
        com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar = this.Jd;
        if (pvsVar == null) {
            return new ArrayList();
        }
        return pvs(pvsVar.icD(), str);
    }

    protected void pvs(List<String> list) {
        icD();
        list.size();
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), "DELETE FROM " + icD() + " WHERE " + pvs(FacebookMediationAdapter.KEY_ID, list, 1000, true));
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.thO(), list.size());
        vG(list);
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
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), icD(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            icD();
        }
    }

    public boolean pvs(int i) {
        if (this.Jd == null) {
            return false;
        }
        int pvs = pvs();
        int pvs2 = this.Jd.pvs();
        icD();
        return (com.bytedance.sdk.component.sUS.pvs.vG.pvs.vG() && (i == 1 || i == 2)) ? pvs > 0 : pvs >= pvs2;
    }

    public static String icD(String str) {
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
