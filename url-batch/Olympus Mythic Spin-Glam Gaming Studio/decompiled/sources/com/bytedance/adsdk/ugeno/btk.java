package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.fb.iv;
import com.bytedance.adsdk.ugeno.fb.zg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class btk {
    private static volatile btk zmn;
    private com.bytedance.adsdk.ugeno.zn.zmn btk;
    private zmn fb;
    private List<com.bytedance.adsdk.ugeno.core.fs> fs;
    private com.bytedance.adsdk.ugeno.core.fs.fb hhw;
    private com.bytedance.adsdk.ugeno.core.zmn.zmn nps;
    private com.bytedance.adsdk.ugeno.core.zn zn;

    public static btk zmn() {
        if (zmn == null) {
            synchronized (btk.class) {
                try {
                    if (zmn == null) {
                        zmn = new btk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private btk() {
    }

    public void zmn(Context context, com.bytedance.adsdk.ugeno.core.zn znVar, zmn zmnVar) {
        this.zn = znVar;
        this.fb = zmnVar;
        hhw();
    }

    public zmn fs() {
        return this.fb;
    }

    private void hhw() {
        ArrayList arrayList = new ArrayList();
        this.fs = arrayList;
        com.bytedance.adsdk.ugeno.core.zn znVar = this.zn;
        if (znVar != null) {
            arrayList.addAll(znVar.zmn());
        }
        com.bytedance.adsdk.ugeno.core.fb.zmn(this.fs);
    }

    public void zmn(com.bytedance.adsdk.ugeno.zn.zmn zmnVar) {
        this.btk = zmnVar;
    }

    public com.bytedance.adsdk.ugeno.zn.zmn zn() {
        return this.btk;
    }

    public void zmn(zg zgVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.fb.zmn().zmn());
        if (zgVar != null) {
            arrayList.addAll(zgVar.zmn());
        }
        iv.zmn(arrayList);
    }

    public void zmn(com.bytedance.adsdk.ugeno.fb.zn znVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.fb.btk().zmn());
        if (znVar != null) {
            arrayList.addAll(znVar.zmn());
        }
        com.bytedance.adsdk.ugeno.fb.fb.zmn(arrayList);
    }

    public com.bytedance.adsdk.ugeno.core.fs.fb fb() {
        return this.hhw;
    }

    public com.bytedance.adsdk.ugeno.core.zmn.zmn btk() {
        return this.nps;
    }
}
