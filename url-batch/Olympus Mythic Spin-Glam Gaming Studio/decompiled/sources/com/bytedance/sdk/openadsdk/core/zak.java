package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class zak {
    public static ConcurrentHashMap<Integer, zak> zmn = new ConcurrentHashMap<>();
    private int btk;
    private int fb;
    private String hhw;
    private String fs = "";
    private String zn = "";

    public String zmn() {
        return this.hhw;
    }

    public String fs() {
        return this.fs;
    }

    public String zn() {
        return this.zn;
    }

    public int fb() {
        return this.fb;
    }

    public void zmn(int i) {
        this.fb = i;
    }

    public int btk() {
        return this.btk;
    }

    public void fs(int i) {
        this.btk = i;
    }

    private void hhw() {
        this.fs = "";
        this.zn = "";
        this.fb = 0;
        this.btk = 0;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar != null) {
            String wbj = nqiVar.wbj();
            if (!TextUtils.isEmpty(wbj)) {
                this.hhw = wbj;
            }
            String pl = nqiVar.pl();
            if (TextUtils.isEmpty(pl) && nqiVar.ch()) {
                pl = nqiVar.bm().bvs();
            }
            if (!TextUtils.isEmpty(pl)) {
                String[] split = pl.split("/");
                if (split.length >= 3) {
                    this.fs = split[2];
                }
            }
            if (nqiVar.pw() == null || TextUtils.isEmpty(nqiVar.pw().zn())) {
                return;
            }
            this.zn = nqiVar.pw().zn();
        }
    }

    public static void fs(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar == null || TextUtils.isEmpty(nqiVar.ze())) {
            return;
        }
        int qvo = nqiVar.qvo();
        Integer valueOf = Integer.valueOf(qvo);
        if (qvo == 0) {
            return;
        }
        if (zmn == null) {
            zmn = new ConcurrentHashMap<>();
        }
        zak zakVar = zmn.containsKey(valueOf) ? zmn.get(valueOf) : null;
        if (zakVar == null) {
            zakVar = new zak();
        }
        String wbj = nqiVar.wbj();
        if (TextUtils.isEmpty(wbj) || !wbj.equals(zakVar.zmn())) {
            zakVar.hhw();
            zakVar.zmn(nqiVar);
            zmn.put(valueOf, zakVar);
        }
    }

    public static void zn(int i) {
        zak zakVar;
        if (i == 0) {
            return;
        }
        if (zmn == null) {
            zmn = new ConcurrentHashMap<>();
        }
        if (!zmn.containsKey(Integer.valueOf(i)) || (zakVar = zmn.get(Integer.valueOf(i))) == null) {
            return;
        }
        zakVar.fs(1);
    }

    public static void zn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        zak zakVar;
        if (nqiVar == null) {
            return;
        }
        int qvo = nqiVar.qvo();
        Integer valueOf = Integer.valueOf(qvo);
        if (qvo == 0) {
            return;
        }
        if (zmn == null) {
            zmn = new ConcurrentHashMap<>();
        }
        if (!zmn.containsKey(valueOf) || (zakVar = zmn.get(valueOf)) == null) {
            return;
        }
        zakVar.zmn(1);
    }
}
