package com.bytedance.sdk.component.nps.fs;

import android.text.TextUtils;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rc;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public abstract class zn {
    String btk;
    protected com.bytedance.sdk.openadsdk.kgc.fb bvs;
    private List<String> fs;
    int hhw;
    protected rc zn;
    protected String fb = null;
    protected final Map<String, String> nps = new HashMap();
    protected String zg = null;
    private String zmn = null;
    private long rc = 30000;
    protected boolean iv = false;

    public abstract com.bytedance.sdk.component.nps.fs zmn();

    public abstract void zmn(com.bytedance.sdk.component.nps.zmn.zmn zmnVar);

    public void zmn(com.bytedance.sdk.openadsdk.kgc.fb fbVar) {
        this.bvs = fbVar;
    }

    public void zmn(List<String> list) {
        this.fs = list;
    }

    public void zmn(long j, TimeUnit timeUnit) {
        this.rc = timeUnit.toMillis(j);
    }

    protected void zmn(klz.zmn zmnVar) {
        if (com.bytedance.sdk.component.nps.zmn.hhw()) {
            List<String> list = this.fs;
            if (list != null && !list.isEmpty()) {
                zmnVar.zmn(this.fs);
            }
            zmnVar.zmn(this.rc);
        }
    }

    protected void zmn(String str) {
        this.zmn = str;
    }

    public String zn() {
        return this.zmn;
    }

    public void fs(String str) {
        this.btk = str;
    }

    public void zmn(int i) {
        this.hhw = i;
    }

    public zn(rc rcVar) {
        this.zn = rcVar;
        try {
            fb(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void zn(String str) {
        this.zg = str;
    }

    public void fs(String str, String str2) {
        this.nps.put(str, str2);
    }

    public void fb(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.nps.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void fb(String str) {
        this.fb = str;
    }

    public String fb() {
        return this.fb;
    }

    public void fs() {
        rc rcVar;
        if (this.fb == null || (rcVar = this.zn) == null) {
            return;
        }
        com.bytedance.sdk.component.fs.zmn.fb fs = rcVar.fs();
        synchronized (fs) {
            try {
                for (com.bytedance.sdk.component.fs.zmn.fs fsVar : fs.zn()) {
                    if (this.fb.equals(fsVar.zmn().zn())) {
                        fsVar.zn();
                    }
                }
                for (com.bytedance.sdk.component.fs.zmn.fs fsVar2 : fs.fb()) {
                    if (this.fb.equals(fsVar2.zmn().zn())) {
                        fsVar2.zn();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.bytedance.sdk.component.nps.fs btk() {
        com.bytedance.sdk.component.nps.fs fsVar;
        nps();
        try {
            fsVar = zmn();
        } catch (Throwable unused) {
            fsVar = null;
        }
        if (fsVar != null) {
            try {
            } catch (Throwable unused2) {
                bvs();
                return fsVar;
            }
            if (fsVar.hhw()) {
                zg();
                return fsVar;
            }
        }
        bvs();
        return fsVar;
    }

    public final void fs(final com.bytedance.sdk.component.nps.zmn.zmn zmnVar) {
        nps();
        zmn(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.component.nps.fs.zn.1
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                if (fsVar != null && fsVar.hhw()) {
                    zn.this.zg();
                } else {
                    zn.this.bvs();
                }
                com.bytedance.sdk.component.nps.zmn.zmn zmnVar2 = zmnVar;
                if (zmnVar2 != null) {
                    zmnVar2.zmn(znVar, fsVar);
                }
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(zn znVar, IOException iOException) {
                zn.this.bvs();
                com.bytedance.sdk.component.nps.zmn.zmn zmnVar2 = zmnVar;
                if (zmnVar2 != null) {
                    zmnVar2.zmn(znVar, iOException);
                }
            }
        });
    }

    protected void fs(klz.zmn zmnVar) {
        if (zmnVar != null && this.nps.size() > 0) {
            for (Map.Entry<String, String> entry : this.nps.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    zmnVar.fs(key, value);
                }
            }
        }
    }

    public String hhw() {
        return this.zg;
    }

    protected void nps() {
        if (this.bvs == null) {
            return;
        }
        try {
            rc rcVar = this.zn;
            if (rcVar == null || rcVar.zmn() == null) {
                return;
            }
            this.zn.zmn().zmn(this.bvs);
        } catch (Throwable unused) {
        }
    }

    protected void zg() {
        if (this.bvs == null) {
            return;
        }
        try {
            rc rcVar = this.zn;
            if (rcVar == null || rcVar.zmn() == null) {
                return;
            }
            this.zn.zmn().fs(this.bvs);
        } catch (Throwable unused) {
        }
    }

    protected void bvs() {
        if (this.bvs == null) {
            return;
        }
        try {
            rc rcVar = this.zn;
            if (rcVar == null || rcVar.zmn() == null) {
                return;
            }
            this.zn.zmn().zn(this.bvs);
        } catch (Throwable unused) {
        }
    }
}
