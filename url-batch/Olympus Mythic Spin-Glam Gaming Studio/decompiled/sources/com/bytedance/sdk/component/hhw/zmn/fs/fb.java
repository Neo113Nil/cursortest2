package com.bytedance.sdk.component.hhw.zmn.fs;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.hhw.zmn.btk;
import com.bytedance.sdk.component.hhw.zmn.nps;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public class fb {
    private volatile com.bytedance.sdk.component.hhw.zmn.fs.fs.zn bvs;
    private volatile Handler iv;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.hhw.zmn.fb.zmn> klz;
    private final Comparator<com.bytedance.sdk.component.hhw.zmn.fb.zmn> rc;
    public static final fb zmn = new fb();
    public static final com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn fb = new com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn();
    public static final AtomicLong btk = new AtomicLong(0);
    public static final AtomicLong hhw = new AtomicLong(0);
    public static final long nps = System.currentTimeMillis();
    public static long zg = 0;
    public volatile boolean fs = false;
    public volatile boolean zn = false;

    public PriorityBlockingQueue<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn() {
        return this.klz;
    }

    private fb() {
        Comparator<com.bytedance.sdk.component.hhw.zmn.fb.zmn> comparator = new Comparator<com.bytedance.sdk.component.hhw.zmn.fb.zmn>() { // from class: com.bytedance.sdk.component.hhw.zmn.fs.fb.1
            @Override // java.util.Comparator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar2) {
                return fb.this.zmn(zmnVar, zmnVar2);
            }
        };
        this.rc = comparator;
        this.klz = new PriorityBlockingQueue<>(8, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar2) {
        long j;
        long j2;
        long j3;
        long j4;
        if (zmnVar == null) {
            return zmnVar2 == null ? 0 : -1;
        }
        if (zmnVar2 == null) {
            return 1;
        }
        if (zmnVar.btk() == zmnVar2.btk()) {
            if (zmnVar.zmn() != null) {
                j = zmnVar.zmn().zmn();
                j2 = zmnVar.zmn().fs();
            } else {
                j = 0;
                j2 = 0;
            }
            if (zmnVar2.zmn() != null) {
                j4 = zmnVar2.zmn().zmn();
                j3 = zmnVar2.zmn().fs();
            } else {
                j3 = 0;
                j4 = 0;
            }
            if (j == 0 || j4 == 0) {
                return 0;
            }
            long j5 = j - j4;
            if (Math.abs(j5) > 2147483647L) {
                return 0;
            }
            if (j5 != 0) {
                return (int) j5;
            }
            if (j2 == 0 || j3 == 0) {
                return 0;
            }
            return (int) (j2 - j3);
        }
        return zmnVar.btk() - zmnVar2.btk();
    }

    public void fs() {
        fb();
        btk();
    }

    public void zmn(Handler handler) {
        this.iv = handler;
    }

    public void zn() {
        if (this.bvs == null || !this.bvs.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.bvs != null && this.bvs.isAlive()) {
                    if (this.iv != null) {
                        this.iv.removeCallbacksAndMessages(null);
                    }
                    this.bvs.zmn(false);
                    this.bvs.quitSafely();
                    this.bvs = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean fb() {
        try {
            if (this.bvs != null || com.bytedance.sdk.component.hhw.zmn.fs.fs()) {
                return false;
            }
            synchronized (this) {
                if (this.bvs != null) {
                    return false;
                }
                this.bvs = new com.bytedance.sdk.component.hhw.zmn.fs.fs.zn(this.klz);
                this.bvs.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, int i) {
        fb();
        btk cn = nps.hhw().cn();
        com.bytedance.sdk.component.hhw.zmn.fs.fs.zn znVar = this.bvs;
        if (znVar != null) {
            zmn(cn, zmnVar);
            znVar.zmn(zmnVar, zmnVar.btk() == 4);
        }
    }

    private void zmn(final btk btkVar, com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar) {
        if (btkVar != null) {
            try {
                if (btkVar.nps()) {
                    final long fs = (zmnVar == null || zmnVar.zmn() == null) ? 0L : zmnVar.zmn().fs();
                    if (fs == 1) {
                        zg = System.currentTimeMillis();
                    }
                    AtomicLong ve = fb.ve();
                    com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(ve, 1);
                    if (ve.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor fb2 = btkVar.fb();
                            if (fb2 == null) {
                                fb2 = btkVar.btk();
                            }
                            if (fb2 != null) {
                                fb2.execute(new com.bytedance.sdk.component.hhw.zmn.btk.btk(CrashEvent.e) { // from class: com.bytedance.sdk.component.hhw.zmn.fs.fb.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        fb.this.zmn(btkVar, fs);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        zmn(btkVar, fs);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(btk btkVar, long j) {
        com.bytedance.sdk.component.hhw.zmn.fs.fs.zn znVar = this.bvs;
        if (btkVar == null || znVar == null) {
            return;
        }
        com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn zmnVar = fb;
        znVar.zmn(btkVar.zmn(zmnVar.fs(j)), true);
        zmnVar.dgt();
    }

    public void btk() {
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(fb.fkt(), 1);
        final com.bytedance.sdk.component.hhw.zmn.fs.fs.zn znVar = this.bvs;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (znVar != null) {
                znVar.zn(2);
                return;
            }
            return;
        }
        btk cn = nps.hhw().cn();
        if (cn != null) {
            Executor fb2 = cn.fb();
            if (fb2 == null) {
                fb2 = cn.btk();
            }
            if (fb2 != null) {
                fb2.execute(new com.bytedance.sdk.component.hhw.zmn.btk.btk("flush") { // from class: com.bytedance.sdk.component.hhw.zmn.fs.fb.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.hhw.zmn.fs.fs.zn znVar2 = znVar;
                        if (znVar2 != null) {
                            znVar2.zn(2);
                        }
                    }
                });
            }
        }
    }
}
