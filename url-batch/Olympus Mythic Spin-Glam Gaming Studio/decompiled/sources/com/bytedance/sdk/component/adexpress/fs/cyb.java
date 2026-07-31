package com.bytedance.sdk.component.adexpress.fs;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.fs.iv;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class cyb implements iv {
    private ScheduledFuture<?> btk;
    private mw fb;
    private com.bytedance.sdk.component.adexpress.btk.zmn fs;
    private AtomicBoolean hhw = new AtomicBoolean(false);
    private Context zmn;
    private zg zn;

    public cyb(Context context, mw mwVar, com.bytedance.sdk.component.adexpress.btk.zmn zmnVar, zg zgVar) {
        this.zmn = context;
        this.fb = mwVar;
        this.zn = zgVar;
        this.fs = zmnVar;
        zmnVar.zmn(this.zn);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv
    public boolean zmn(final iv.zmn zmnVar) {
        int hhw = this.fb.hhw();
        if (hhw < 0) {
            zmn(zmnVar, 107, "time is ".concat(String.valueOf(hhw)));
        } else {
            this.btk = com.bytedance.sdk.component.adexpress.fb.fb.zmn(new zmn(1, zmnVar), hhw, TimeUnit.MILLISECONDS);
            this.fs.zmn(new nps() { // from class: com.bytedance.sdk.component.adexpress.fs.cyb.1
                @Override // com.bytedance.sdk.component.adexpress.fs.nps
                public void zmn(View view, rt rtVar) {
                    cn fs;
                    cyb.this.zn();
                    if (zmnVar.zn() || (fs = zmnVar.fs()) == null) {
                        return;
                    }
                    fs.zmn(cyb.this.fs, rtVar);
                    zmnVar.zmn(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.fs.nps
                public void zmn(int i, String str) {
                    cyb.this.zmn(zmnVar, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv
    public void zmn() {
        this.fs.zg();
        zn();
    }

    public com.bytedance.sdk.component.adexpress.btk.zmn fs() {
        return this.fs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn() {
        try {
            ScheduledFuture<?> scheduledFuture = this.btk;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.btk.cancel(false);
            this.btk = null;
        } catch (Throwable unused) {
        }
    }

    private class zmn implements Runnable {
        iv.zmn zmn;
        private int zn;

        public zmn(int i, iv.zmn zmnVar) {
            this.zn = i;
            this.zmn = zmnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.zn == 1) {
                cyb.this.fs.zmn(true);
                cyb.this.zmn(this.zmn, 107, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(iv.zmn zmnVar, int i, String str) {
        cn fs;
        if (zmnVar.zn() || this.hhw.get()) {
            return;
        }
        zn();
        this.fb.btk().zmn(i, str);
        if (zmnVar.fs(this)) {
            zmnVar.zmn(this);
        } else {
            if (zmnVar.zn() || (fs = zmnVar.fs()) == null) {
                return;
            }
            zmnVar.zmn(true);
            fs.a_(i);
        }
        this.hhw.getAndSet(true);
    }
}
