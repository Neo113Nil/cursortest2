package com.bykv.vk.openvk.zmn.zmn.zmn.zn;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class zn implements Serializable {
    private boolean bvs;
    private int cn;
    private int cyb;
    private int doe;
    public String fs;
    private fs hhw;
    private boolean iqz;
    private boolean iv;
    private long kgc;
    private int kjb;
    private boolean kw;
    private fs nps;
    private String olo;
    private int phc;
    private String rt;
    private String zg;
    public int zn;
    private int rc = 204800;
    private int klz = 0;
    private int mw = 0;
    protected float zmn = -1.0f;
    public final HashMap<String, Object> fb = new HashMap<>();
    private int nqi = 10000;
    private int uqh = 10000;
    private int bjh = 10000;
    private int rp = 0;
    public int btk = 1;
    private JSONObject zak = new JSONObject();

    public zn(String str, fs fsVar, fs fsVar2, int i, int i2) {
        this.phc = 0;
        this.doe = 0;
        this.zg = str;
        this.hhw = fsVar;
        this.nps = fsVar2;
        this.phc = i;
        this.doe = i2;
    }

    public void zmn(int i) {
        this.kjb = i;
    }

    public boolean zmn() {
        int i = this.kjb;
        return i == 1 || i == 2;
    }

    public boolean fs() {
        return this.kjb == 2;
    }

    public JSONObject zn() {
        return this.zak;
    }

    public int fb() {
        return this.zak.optInt("pitaya_cache_size", 0);
    }

    public String btk() {
        return this.zg;
    }

    public void zmn(String str) {
        this.zg = str;
    }

    public int hhw() {
        if (rt()) {
            return this.nps.cn();
        }
        fs fsVar = this.hhw;
        if (fsVar != null) {
            return fsVar.cn();
        }
        return 0;
    }

    public boolean nps() {
        return this.iqz;
    }

    public void fs(String str) {
        this.rt = str;
    }

    public int zg() {
        return this.cn;
    }

    public void fs(int i) {
        this.cn = i;
    }

    public int bvs() {
        return this.cyb;
    }

    public void zn(int i) {
        this.cyb = i;
    }

    public void zn(String str) {
        this.olo = str;
    }

    public long iv() {
        return this.kgc;
    }

    public void zmn(long j) {
        this.kgc = j;
    }

    public boolean rc() {
        return this.kw;
    }

    public void zmn(boolean z) {
        this.kw = z;
    }

    public long klz() {
        if (rt()) {
            return this.nps.btk();
        }
        fs fsVar = this.hhw;
        if (fsVar != null) {
            return fsVar.btk();
        }
        return 0L;
    }

    public boolean mw() {
        if (rt()) {
            return this.nps.phc();
        }
        fs fsVar = this.hhw;
        if (fsVar != null) {
            return fsVar.phc();
        }
        return true;
    }

    public void fb(String str) {
        this.fs = str;
    }

    public void fb(int i) {
        this.zn = i;
    }

    public boolean rt() {
        fs fsVar;
        if (this.doe == 1 && (fsVar = this.nps) != null && !TextUtils.isEmpty(fsVar.rc())) {
            if (com.bykv.vk.openvk.zmn.zmn.zmn.zn.btk() == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.phc == 1) {
                return true;
            }
        }
        return false;
    }

    public float cn() {
        float f = this.zmn;
        if (f != -1.0f) {
            return f;
        }
        if (rt()) {
            return this.nps.zg();
        }
        fs fsVar = this.hhw;
        if (fsVar != null) {
            return fsVar.zg();
        }
        return -1.0f;
    }

    public String cyb() {
        if (rt()) {
            return this.nps.rc();
        }
        fs fsVar = this.hhw;
        if (fsVar != null) {
            return fsVar.rc();
        }
        return null;
    }

    public String olo() {
        if (rt()) {
            return this.nps.rt();
        }
        fs fsVar = this.hhw;
        if (fsVar != null) {
            return fsVar.rt();
        }
        return null;
    }

    public int kgc() {
        return this.phc;
    }

    public synchronized void zmn(String str, Object obj) {
        this.fb.put(str, obj);
    }

    public synchronized Object btk(String str) {
        return this.fb.get(str);
    }

    public int kw() {
        return this.nqi;
    }

    public void btk(int i) {
        this.nqi = i;
    }

    public int iqz() {
        return this.uqh;
    }

    public void hhw(int i) {
        this.uqh = i;
    }

    public int phc() {
        return this.bjh;
    }

    public void nps(int i) {
        this.bjh = i;
    }

    public int doe() {
        return this.rp;
    }

    public void zg(int i) {
        this.rp = i;
    }

    public fs nqi() {
        return this.hhw;
    }

    public fs uqh() {
        return this.nps;
    }

    public void fs(boolean z) {
        this.bvs = z;
    }

    public boolean bjh() {
        return this.bvs;
    }

    public void zn(boolean z) {
        this.iv = z;
    }

    public boolean rp() {
        return this.iv;
    }
}
