package com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class zn {
    private static int zn = 20;
    private boolean btk;
    private boolean zg;
    private final Context zmn;
    protected final List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> fs = new ArrayList();
    private final List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> fb = new ArrayList();
    private boolean hhw = false;
    private volatile boolean nps = false;
    private final Runnable bvs = new Runnable() { // from class: com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zn.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (zn.this) {
                try {
                    zn.this.nps = false;
                    if (zn.this.fs.isEmpty()) {
                        zn.this.hhw = false;
                        return;
                    }
                    if (zn.this.btk) {
                        int size = zn.this.fs.size();
                        for (int i = 0; i < size; i++) {
                            zn.this.fb.add(zn.this.fs.get(i));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(zn.this.fs);
                    }
                    zn.this.fs.clear();
                    zn.this.hhw = false;
                    if (arrayList != null) {
                        zn.this.fb(arrayList);
                        return;
                    }
                    zn znVar = zn.this;
                    znVar.fb(znVar.fb);
                    zn.this.fb.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public abstract String fs();

    protected long hhw() {
        return 10000L;
    }

    public zn(Context context) {
        this.zg = true;
        this.zmn = context;
        try {
            com.bytedance.sdk.component.hhw.zmn.btk cn = com.bytedance.sdk.component.hhw.zmn.nps.hhw().cn();
            if (cn != null) {
                this.zg = cn.mw();
                this.btk = cn.rt();
                zn = cn.cn();
            }
            iqz.zmn("DBInsertMemRepo", "enableOpt:" + this.zg + ",BATCH_SIZE:" + zn, Boolean.valueOf(this.btk));
        } catch (Throwable unused) {
        }
    }

    private void zmn() {
        if (!this.hhw) {
            com.bytedance.sdk.component.hhw.zmn.nps.zmn.zmn().postDelayed(this.bvs, this.btk ? hhw() : com.bytedance.sdk.component.hhw.zmn.nps.zmn.fs());
            this.hhw = true;
        }
        if (this.zg && this.fs.size() >= zn && !this.nps) {
            com.bytedance.sdk.component.hhw.zmn.nps.zmn.zmn().removeCallbacks(this.bvs);
            com.bytedance.sdk.component.hhw.zmn.nps.zmn.zmn().post(this.bvs);
            this.hhw = true;
            this.nps = true;
        }
    }

    protected synchronized void zn(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.hhw.zmn.fb.zmn> it = this.fs.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.hhw.zmn.fb.zmn next = it.next();
                        if (next != null) {
                            String zn2 = next.zn();
                            if (!TextUtils.isEmpty(zn2) && list.contains(zn2)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    fs();
                    th.getMessage();
                }
            }
        }
    }

    public synchronized void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar) {
        if (zmnVar.hhw() != null && !TextUtils.isEmpty(zmnVar.zn())) {
            this.fs.add(zmnVar);
            zmn();
        }
    }

    public Context btk() {
        return this.zmn;
    }

    public void fb(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zn.zmn(btk(), fs(), list);
    }
}
