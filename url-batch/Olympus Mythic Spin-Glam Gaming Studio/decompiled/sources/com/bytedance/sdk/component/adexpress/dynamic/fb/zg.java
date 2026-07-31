package com.bytedance.sdk.component.adexpress.dynamic.fb;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class zg {
    private float btk;
    private btk bvs;
    private Map<String, String> cn = new HashMap();
    private Map<Integer, String> cyb = new HashMap();
    private float fb;
    private float fs;
    private float hhw;
    private List<zg> iv;
    private List<List<zg>> klz;
    private String mw;
    private float nps;
    private zg rc;
    private boolean rt;
    private float zg;
    private String zmn;
    private float zn;

    public String zmn() {
        return this.mw;
    }

    public void zmn(String str) {
        this.mw = str;
    }

    public Map<Integer, String> fs() {
        return this.cyb;
    }

    public void zmn(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    this.cyb.put(Integer.valueOf(optJSONObject.optInt("id")), optJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String zn() {
        return this.zmn;
    }

    public void fs(String str) {
        this.zmn = str;
    }

    public float fb() {
        return this.fb;
    }

    public void zmn(float f) {
        this.fb = f;
    }

    public float btk() {
        return this.btk;
    }

    public void fs(float f) {
        this.btk = f;
    }

    public float hhw() {
        return this.fs;
    }

    public void zn(float f) {
        this.fs = f;
    }

    public float nps() {
        return this.zn;
    }

    public void fb(float f) {
        this.zn = f;
    }

    public float zg() {
        return this.hhw;
    }

    public void btk(float f) {
        this.hhw = f;
    }

    public float bvs() {
        return this.nps;
    }

    public void hhw(float f) {
        this.nps = f;
    }

    public void nps(float f) {
        this.zg = f;
    }

    public btk iv() {
        return this.bvs;
    }

    public void zmn(btk btkVar) {
        this.bvs = btkVar;
    }

    public List<zg> rc() {
        return this.iv;
    }

    public void zmn(List<zg> list) {
        this.iv = list;
    }

    public void zmn(zg zgVar) {
        this.rc = zgVar;
    }

    public zg klz() {
        return this.rc;
    }

    public int mw() {
        hhw btk = this.bvs.btk();
        return btk.uqd() + btk.kra();
    }

    public int rt() {
        hhw btk = this.bvs.btk();
        return btk.cud() + btk.gn();
    }

    public float cn() {
        hhw btk = this.bvs.btk();
        return mw() + btk.cn() + btk.cyb() + (btk.klz() * 2.0f);
    }

    public float cyb() {
        hhw btk = this.bvs.btk();
        return rt() + btk.olo() + btk.rt() + (btk.klz() * 2.0f);
    }

    public void fs(List<List<zg>> list) {
        this.klz = list;
    }

    public List<List<zg>> olo() {
        return this.klz;
    }

    public boolean kgc() {
        List<zg> list = this.iv;
        return list == null || list.size() <= 0;
    }

    public boolean kw() {
        return this.rt;
    }

    public void zmn(boolean z) {
        this.rt = z;
    }

    public Map<String, String> iqz() {
        return this.cn;
    }

    public void zmn(String str, String str2) {
        this.cn.put(str, str2);
    }

    public void phc() {
        List<List<zg>> list = this.klz;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<zg> list2 : this.klz) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.klz = arrayList;
    }

    public boolean doe() {
        return TextUtils.equals(this.bvs.btk().zak(), "flex");
    }

    public String nqi() {
        return this.bvs.btk().nqi();
    }

    public void zn(String str) {
        this.bvs.btk().hhw(str);
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.zmn + "', x=" + this.fs + ", y=" + this.zn + ", width=" + this.hhw + ", height=" + this.nps + ", remainWidth=" + this.zg + ", rootBrick=" + this.bvs + ", childrenBrickUnits=" + this.iv + '}';
    }

    public boolean uqh() {
        return this.bvs.btk().ax() < 0 || this.bvs.btk().obg() < 0 || this.bvs.btk().mpi() < 0 || this.bvs.btk().skn() < 0;
    }

    public String zmn(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.bvs.fs());
        sb.append(":");
        sb.append(this.zmn);
        if (this.bvs.btk() != null) {
            sb.append(":");
            sb.append(this.bvs.btk().mrt());
        }
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
