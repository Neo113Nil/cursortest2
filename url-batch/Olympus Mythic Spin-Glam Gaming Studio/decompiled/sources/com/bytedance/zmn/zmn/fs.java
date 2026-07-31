package com.bytedance.zmn.zmn;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.zmn.zn;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes14.dex */
public class fs implements Handler.Callback, com.bytedance.zmn.fb {
    private volatile Handler btk;
    private volatile zn fb;
    private final zn.btk fs;
    private volatile Handler hhw;
    private final Context zmn;
    private final ConcurrentHashMap<Class<? extends com.bytedance.zmn.zmn>, nps<? extends com.bytedance.zmn.zmn>> zn = new ConcurrentHashMap<>();
    private volatile boolean nps = false;

    public fs(Context context, zn.btk btkVar) {
        this.zmn = context;
        this.fs = btkVar;
        btkVar.fs(true);
        btkVar.toString();
        for (Map.Entry<Class<? extends com.bytedance.zmn.zmn>, com.bytedance.zmn.fs<? extends com.bytedance.zmn.zmn>> entry : btkVar.btk().entrySet()) {
            Class<? extends com.bytedance.zmn.zmn> key = entry.getKey();
            this.zn.put(key, new nps<>(this, entry.getValue()));
            Objects.toString(key);
        }
        new HandlerThread("AppLogS") { // from class: com.bytedance.zmn.zmn.fs.1
            @Override // android.os.HandlerThread
            protected void onLooperPrepared() {
                fs.this.hhw = new Handler(getLooper(), fs.this);
                fs.this.fb();
            }
        }.start();
        new HandlerThread("AppLogU") { // from class: com.bytedance.zmn.zmn.fs.2
            @Override // android.os.HandlerThread
            protected void onLooperPrepared() {
                fs.this.btk = new Handler(getLooper(), fs.this);
                fs.this.fb();
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        if (this.btk == null || this.hhw == null) {
            return;
        }
        for (nps<? extends com.bytedance.zmn.zmn> npsVar : this.zn.values()) {
            try {
                npsVar.zmn(zmn());
                zmn((nps) npsVar, false);
                com.bytedance.zmn.zmn.zmn.zmn fb = npsVar.fb();
                if (fb != null) {
                    fb.zmn(this.btk.getLooper(), npsVar);
                }
            } catch (Exception unused) {
            }
        }
        this.nps = true;
    }

    @Override // com.bytedance.zmn.fb
    public boolean zmn(com.bytedance.zmn.zmn zmnVar) {
        nps<? extends com.bytedance.zmn.zmn> npsVar;
        if (zmnVar == null || !com.bytedance.zmn.zmn.zmn.zmn || (npsVar = this.zn.get(zmnVar.getClass())) == null) {
            return false;
        }
        if (!this.nps) {
            zmnVar.toString();
            fs(zmnVar);
            return true;
        }
        if (this.fs.bvs()) {
            fs(zmnVar);
        } else {
            this.hhw.sendMessage(this.hhw.obtainMessage(1000, zmnVar));
        }
        com.bytedance.zmn.zmn.zmn.zmn fb = npsVar.fb();
        if (fb != null) {
            fb.zmn(1);
        }
        return true;
    }

    private void fs(final com.bytedance.zmn.zmn zmnVar) {
        zn.fb fs = this.fs.fs();
        ExecutorService zmn2 = fs != null ? fs.zmn() : null;
        if (zmn2 == null) {
            zmn2 = com.bytedance.zmn.zmn.fs.zmn.fs();
        }
        Objects.toString(zmnVar);
        zmn2.execute(new zmn(zmnVar.nps()) { // from class: com.bytedance.zmn.zmn.fs.3
            @Override // com.bytedance.zmn.zmn.fs.zmn
            public void zmn() {
                fs.this.zmn((com.bytedance.zmn.zmn<?>) zmnVar, true);
            }
        });
    }

    public zn zmn() {
        if (this.fb == null) {
            synchronized (this) {
                try {
                    if (this.fb == null) {
                        this.fb = new zn(this.zmn, this, this.fs);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.fb;
    }

    public ConcurrentHashMap<Class<? extends com.bytedance.zmn.zmn>, nps<? extends com.bytedance.zmn.zmn>> fs() {
        return this.zn;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (!com.bytedance.zmn.zmn.zmn.zmn) {
            return true;
        }
        try {
            switch (message.what) {
                case 1000:
                    Object obj = message.obj;
                    if (obj instanceof com.bytedance.zmn.zmn) {
                        zmn((com.bytedance.zmn.zmn<?>) obj, false);
                        break;
                    } else {
                        obj.getClass();
                        break;
                    }
                case 1001:
                    zn((nps) message.obj);
                    break;
                case 1002:
                    nps npsVar = (nps) message.obj;
                    if (this.fs.iv()) {
                        npsVar.hhw(zmn());
                        break;
                    } else {
                        npsVar.zmn(zmn(), this.fs.zg());
                        break;
                    }
                case 1003:
                    ((nps) message.obj).fb(zmn());
                    break;
                case 1004:
                    ((nps) message.obj).btk(zmn());
                    break;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.zmn.zmn<?> zmnVar, boolean z) {
        Objects.toString(zmnVar);
        nps<? extends com.bytedance.zmn.zmn> npsVar = this.zn.get(zmnVar.getClass());
        if (npsVar == null) {
            return;
        }
        int zmn2 = npsVar.zmn((nps<? extends com.bytedance.zmn.zmn>) zmnVar);
        if ((zmn2 & 4) == 4 && this.fs.zmn()) {
            zmnVar.toString();
            npsVar.fs(zmn());
        }
        if (z || (zmn2 & 2) == 2) {
            if (this.hhw != null) {
                this.hhw.removeMessages(1001, npsVar);
            }
            zmnVar.toString();
            zn(npsVar);
        } else if (this.hhw != null && !this.hhw.hasMessages(1001, npsVar)) {
            this.hhw.sendMessageDelayed(this.hhw.obtainMessage(1001, npsVar), npsVar.rc());
            npsVar.rc();
        }
        com.bytedance.zmn.zmn.zmn.zmn fb = npsVar.fb();
        if (fb != null) {
            fb.zmn();
        }
    }

    private void zn(nps npsVar) {
        if (npsVar.zn() == 0) {
            Objects.toString(npsVar.zmn());
            return;
        }
        boolean zmn2 = npsVar.zmn(this.fs, zmn());
        Objects.toString(npsVar.zmn());
        if (this.btk != null) {
            if (zmn2) {
                boolean z = true;
                boolean z2 = (this.btk.hasMessages(1002, npsVar) || npsVar.bvs()) ? false : true;
                boolean z3 = !this.fs.bvs();
                if (z2 || !npsVar.iv()) {
                    z = z2;
                } else {
                    Objects.toString(npsVar.zmn());
                    z3 = true;
                }
                if (z) {
                    zmn(npsVar, z3);
                    return;
                }
                return;
            }
            npsVar.fs(zmn());
        }
    }

    public void zmn(nps npsVar, boolean z, boolean z2, boolean z3) {
        if (z2 && !z) {
            Objects.toString(npsVar.zmn());
            return;
        }
        if (z2 && z3) {
            Objects.toString(npsVar.zmn());
        } else if (this.btk.hasMessages(1002, npsVar)) {
            return;
        }
        zmn(npsVar, z2 && z);
    }

    private void zmn(nps npsVar, boolean z) {
        long btk = z ? 0L : npsVar.btk();
        this.btk.removeMessages(1002, npsVar);
        this.btk.sendMessageDelayed(this.btk.obtainMessage(1002, npsVar), btk);
        Objects.toString(npsVar.zmn());
    }

    public zn.btk zn() {
        return this.fs;
    }

    public void zmn(nps npsVar) {
        if (this.btk.hasMessages(1003, npsVar)) {
            return;
        }
        this.btk.sendMessageDelayed(this.btk.obtainMessage(1003, npsVar), this.fs.nps());
    }

    public void fs(nps npsVar) {
        if (this.btk.hasMessages(1004, npsVar)) {
            return;
        }
        this.btk.sendMessageDelayed(this.btk.obtainMessage(1004, npsVar), this.fs.nps());
    }

    private static abstract class zmn implements Comparable<zmn>, Runnable {
        private final int zmn;

        protected abstract void zmn();

        public zmn(int i) {
            this.zmn = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zmn();
        }

        @Override // java.lang.Comparable
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public int compareTo(zmn zmnVar) {
            return zmnVar.zmn - this.zmn;
        }
    }
}
