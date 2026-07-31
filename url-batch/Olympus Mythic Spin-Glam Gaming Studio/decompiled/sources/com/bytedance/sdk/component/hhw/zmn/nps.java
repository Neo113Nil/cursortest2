package com.bytedance.sdk.component.hhw.zmn;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class nps {
    private static volatile com.bytedance.sdk.component.hhw.zmn.btk.zmn bvs;
    private static nps klz;
    private volatile com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn btk;
    private volatile com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn fb;
    private volatile com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn fs;
    private volatile com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn hhw;
    private volatile com.bytedance.sdk.component.hhw.zmn.fs.zn iv;
    private final AtomicBoolean mw = new AtomicBoolean(false);
    private volatile com.bytedance.sdk.component.hhw.zmn.zmn.btk nps;
    private volatile Map<Integer, com.bytedance.sdk.component.hhw.zmn.fs.zn> rc;
    private long rt;
    private volatile btk zg;
    private volatile Context zmn;
    private volatile com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zn;

    public boolean zmn() {
        return this.mw.get();
    }

    public void zmn(boolean z) {
        this.mw.set(z);
    }

    public Map<Integer, com.bytedance.sdk.component.hhw.zmn.fs.zn> fs() {
        return this.rc;
    }

    public com.bytedance.sdk.component.hhw.zmn.zmn.btk zn() {
        return this.nps;
    }

    public static com.bytedance.sdk.component.hhw.zmn.btk.zmn fb() {
        if (bvs == null) {
            synchronized (nps.class) {
                try {
                    if (bvs == null) {
                        bvs = new com.bytedance.sdk.component.hhw.zmn.btk.fs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bvs;
    }

    public void zmn(com.bytedance.sdk.component.hhw.zmn.zmn.btk btkVar) {
        this.nps = btkVar;
    }

    public Context btk() {
        return this.zmn;
    }

    public void zmn(Context context) {
        this.zmn = context;
    }

    private nps() {
    }

    public static synchronized nps hhw() {
        nps npsVar;
        synchronized (nps.class) {
            try {
                if (klz == null) {
                    klz = new nps();
                }
                npsVar = klz;
            } catch (Throwable th) {
                throw th;
            }
        }
        return npsVar;
    }

    public void zmn(com.bytedance.sdk.component.hhw.zmn.fs.zn znVar) {
        this.iv = znVar;
    }

    public com.bytedance.sdk.component.hhw.zmn.fs.zn nps() {
        return this.iv;
    }

    public void zg() {
        com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.fs();
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn bvs() {
        return this.hhw;
    }

    public void zmn(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
        this.hhw = zmnVar;
    }

    public void iv() {
        com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.zn();
    }

    public void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        zmnVar.zmn(System.currentTimeMillis());
        com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.zmn(zmnVar, zmnVar.fb());
    }

    public void zmn(String str, boolean z) {
        com.bytedance.sdk.component.hhw.zmn.hhw.zmn.zmn().zmn(str, z);
    }

    public void zmn(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.hhw.zmn.hhw.zmn.zmn().zmn(str, list, z, map, i, str2);
    }

    public void fs(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
        this.fs = zmnVar;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn rc() {
        return this.fs;
    }

    public void zn(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
        this.zn = zmnVar;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn klz() {
        return this.zn;
    }

    public void fb(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
        this.fb = zmnVar;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn mw() {
        return this.fb;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn rt() {
        return this.btk;
    }

    public void btk(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
        this.btk = zmnVar;
    }

    public void zmn(btk btkVar) {
        this.zg = btkVar;
    }

    public btk cn() {
        return this.zg;
    }

    public void zmn(long j) {
        this.rt = j;
    }

    public long cyb() {
        return this.rt * 86400000;
    }
}
