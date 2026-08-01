package com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DBInsertMemRepo.java */
/* loaded from: classes.dex */
public abstract class vG {
    private final Context pvs;
    protected final List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> icD = new ArrayList();
    private boolean vG = false;
    private final Runnable Jd = new Runnable() { // from class: com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.vG.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (vG.this) {
                if (vG.this.icD.isEmpty()) {
                    vG.this.vG = false;
                    return;
                }
                ArrayList arrayList = new ArrayList(vG.this.icD);
                vG.this.icD.clear();
                vG.this.vG = false;
                vG.this.Jd(arrayList);
            }
        }
    };

    public abstract String icD();

    public vG(Context context) {
        this.pvs = context;
    }

    private void pvs() {
        if (this.vG) {
            return;
        }
        com.bytedance.sdk.component.sUS.pvs.yiw.pvs.pvs().postDelayed(this.Jd, com.bytedance.sdk.component.sUS.pvs.yiw.pvs.icD());
        this.vG = true;
    }

    protected void vG(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            Iterator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> it = this.icD.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.sUS.pvs.Jd.pvs next = it.next();
                if (next != null) {
                    String vG = next.vG();
                    if (!TextUtils.isEmpty(vG) && list.contains(vG)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            icD();
            th.getMessage();
        }
    }

    public synchronized void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        if (pvsVar.yiw() != null && !TextUtils.isEmpty(pvsVar.vG())) {
            this.icD.add(pvsVar);
            pvs();
        }
    }

    public Context NB() {
        return this.pvs;
    }

    public void Jd(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        com.bytedance.sdk.component.sUS.pvs.pvs.pvs.vG.pvs(NB(), icD(), list);
    }
}
