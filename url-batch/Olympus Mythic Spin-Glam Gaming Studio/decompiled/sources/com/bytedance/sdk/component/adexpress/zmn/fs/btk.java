package com.bytedance.sdk.component.adexpress.zmn.fs;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.zmn.zn.zmn;
import com.bytedance.sdk.component.utils.phc;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class btk extends zn {
    private static volatile btk fs;
    private static File zmn;
    private AtomicBoolean zn = new AtomicBoolean(true);
    private AtomicBoolean fb = new AtomicBoolean(false);
    private boolean btk = false;
    private AtomicBoolean hhw = new AtomicBoolean(false);
    private AtomicInteger nps = new AtomicInteger(0);
    private AtomicLong zg = new AtomicLong();

    public static btk fs() {
        if (fs == null) {
            synchronized (btk.class) {
                try {
                    if (fs == null) {
                        fs = new btk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    private btk() {
        bvs();
    }

    public void zn() {
        bvs();
    }

    private void bvs() {
        com.bytedance.sdk.component.adexpress.fb.fb.fs(new com.bytedance.sdk.component.zg.fs.zn("init") { // from class: com.bytedance.sdk.component.adexpress.zmn.fs.btk.1
            @Override // java.lang.Runnable
            public void run() {
                zg.zmn();
                btk.this.zn.set(false);
                btk.this.fb();
                btk.this.nps();
                if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() == null || !phc.zmn(com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().fs()) || com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().fb();
            }
        }, 10);
    }

    public void fb() {
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn fs2 = zg.fs();
        if (fs2 == null || !fs2.zg()) {
            return;
        }
        boolean zmn2 = zmn(fs2);
        if (!zmn2) {
            zg.fb();
        }
        this.btk = zmn2;
    }

    public boolean zmn(com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar) {
        if (zmnVar == null) {
            return false;
        }
        return zmn(zmnVar.zmn()) || zmn(zmnVar.btk()) || zmn(zmnVar.hhw());
    }

    public boolean btk() {
        return this.btk;
    }

    public com.bytedance.sdk.component.adexpress.zmn.zn.zmn hhw() {
        return zg.fs();
    }

    @Override // com.bytedance.sdk.component.adexpress.zmn.fs.zn
    public File zmn() {
        return zg();
    }

    public void nps() {
        zmn(false);
    }

    public void zmn(boolean z) {
        List<zmn.C0126zmn> list;
        boolean z2;
        if (this.zn.get()) {
            return;
        }
        try {
            if (this.fb.get()) {
                if (z) {
                    this.nps.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.fb.set(true);
            com.bytedance.sdk.component.adexpress.zmn.zn.zmn btk = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().btk();
            com.bytedance.sdk.component.adexpress.zmn.zn.zmn fs2 = zg.fs();
            if (btk != null && btk.zg()) {
                if (!zg.fs(btk)) {
                    this.fb.set(false);
                    this.zg.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null) {
                    com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().zn().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.zmn.fs.btk.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.btk.btk.zmn().fs();
                        }
                    });
                }
                zg.zmn(btk);
                boolean zmn2 = (btk.btk() == null || TextUtils.isEmpty(btk.btk().zmn())) ? false : zmn(btk.btk().zmn());
                if (btk.zmn().size() != 0) {
                    list = zmn(btk, fs2);
                    z2 = list != null;
                } else {
                    list = null;
                    z2 = zmn2;
                }
                if (!zmn2) {
                    List<zmn.C0126zmn> fs3 = fs(btk, fs2);
                    if (list == null || fs3 == null) {
                        list = fs3;
                    } else {
                        list.addAll(fs3);
                    }
                    if (fs3 == null) {
                        z3 = false;
                    }
                    if (fs3 == null) {
                        this.fb.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && zmn(btk)) {
                    zg.zmn(btk);
                    zg.zn();
                    fs(list);
                }
                fb();
                this.fb.set(false);
                this.zg.set(System.currentTimeMillis());
                iv();
                return;
            }
            this.fb.set(false);
            zmn(109);
        } catch (Throwable unused) {
        }
    }

    private void iv() {
        if (this.nps.getAndSet(0) <= 0 || System.currentTimeMillis() - this.zg.get() <= 600000) {
            return;
        }
        nps();
    }

    public static File zg() {
        File file;
        if (zmn == null) {
            try {
                File zmn2 = fb.zmn();
                Context fs2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().fs();
                if (fs2 != null) {
                    file = com.bytedance.sdk.component.utils.nps.zmn(fs2, "tt_tmpl_pkg");
                } else {
                    file = new File(zmn2, "tt_tmpl_pkg");
                }
                File file2 = new File(file, "template");
                file2.mkdirs();
                zmn = file2;
            } catch (Throwable unused) {
            }
        }
        return zmn;
    }
}
