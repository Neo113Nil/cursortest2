package com.bykv.vk.openvk.zmn.zmn.fs.zn;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.zmn.zmn.fs.zn.zn;
import com.bykv.vk.openvk.zmn.zmn.zmn.zmn;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.component.utils.phc;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fb implements zn.btk, zn.fb, zn.fs, zn.hhw, zn.nps, zn.zmn, zn.InterfaceC0100zn, com.bykv.vk.openvk.zmn.zmn.zmn.zmn, kjb.zmn {
    private static final SparseIntArray zmn = new SparseIntArray();
    private SurfaceTexture btk;
    private kjb cyb;
    private volatile boolean fkt;
    private SurfaceHolder hhw;
    private boolean jy;
    private boolean kjb;
    private boolean klz;
    private boolean mw;
    private boolean nqi;
    private ArrayList<Runnable> uqh;
    private volatile boolean vlj;
    private final boolean fs = false;
    private final List<WeakReference<zmn.InterfaceC0103zmn>> zn = new CopyOnWriteArrayList();
    private final zmn fb = new zmn();
    private int nps = 0;
    private int zg = 3;
    private boolean bvs = false;
    private volatile zn iv = null;
    private boolean rc = false;
    private volatile int rt = 201;
    private long cn = -1;
    private boolean olo = false;
    private long kgc = 0;
    private long kw = Long.MIN_VALUE;
    private long iqz = 0;
    private long phc = 0;
    private long doe = 0;
    private int bjh = 0;
    private String rp = "0";
    private com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn zak = null;
    private boolean am = false;
    private CountDownLatch yj = new CountDownLatch(1);
    private volatile int so = 200;
    private AtomicBoolean ev = new AtomicBoolean(false);
    private Surface tf = null;
    private long hgd = 0;
    private long nu = 0;
    private boolean ww = false;
    private final Runnable oub = new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.1
        @Override // java.lang.Runnable
        public void run() {
            if (fb.this.iv == null) {
                return;
            }
            long kgc = fb.this.kgc();
            if (kgc > 0 && fb.this.hhw() && fb.this.kw != Long.MIN_VALUE) {
                try {
                    if (fb.this.kw == kgc) {
                        if (!fb.this.olo && fb.this.iqz >= 400) {
                            fb.this.fs(701, 800);
                            fb.this.olo = true;
                        }
                        fb.this.iqz += fb.this.so;
                    } else {
                        if (fb.this.olo) {
                            fb.this.kgc += fb.this.iqz;
                            fb.this.fs(702, 800);
                            long unused = fb.this.kgc;
                            int unused2 = fb.this.nps;
                        }
                        fb.this.iqz = 0L;
                        fb.this.olo = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (fb.this.olo() > 0) {
                if (fb.this.kw != kgc) {
                    if (com.bykv.vk.openvk.zmn.zmn.zmn.zn.fb()) {
                        long unused3 = fb.this.kw;
                    }
                    fb fbVar = fb.this;
                    fbVar.zmn(kgc, fbVar.olo());
                }
                fb.this.kw = kgc;
            }
            if (!fb.this.fs()) {
                if (fb.this.cyb != null) {
                    fb.this.cyb.postDelayed(this, fb.this.so);
                }
            } else {
                fb fbVar2 = fb.this;
                fbVar2.zmn(fbVar2.olo(), fb.this.olo());
            }
        }
    };

    private boolean zmn(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public fb() {
        zmn("SSMediaPlayerWrapper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(long j, long j2) {
        if (!this.vlj) {
            kjb();
        }
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zmn(this, j, j2);
            }
        }
    }

    private void zmn(String str) {
        this.bjh = 0;
        this.cyb = com.bytedance.sdk.component.zg.zmn.zmn.zmn().zmn(this, "csj_".concat(String.valueOf(str)));
        this.ww = true;
        doe();
    }

    private void phc() {
        this.kgc = 0L;
        this.nps = 0;
        this.iqz = 0L;
        this.olo = false;
        this.kw = Long.MIN_VALUE;
    }

    public void zmn(final boolean z) {
        if (zg()) {
            return;
        }
        this.kjb = z;
        if (this.iv != null) {
            this.iv.zmn(z);
            return;
        }
        kjb kjbVar = this.cyb;
        if (kjbVar != null) {
            kjbVar.post(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.9
                @Override // java.lang.Runnable
                public void run() {
                    if (fb.this.iv != null) {
                        fb.this.iv.zmn(z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doe() {
        kjb kjbVar = this.cyb;
        if (kjbVar != null) {
            kjbVar.post(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.10
                @Override // java.lang.Runnable
                public void run() {
                    if (fb.this.iv == null) {
                        try {
                            fb.this.iv = new fs();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (fb.this.iv == null) {
                            return;
                        }
                        zn unused = fb.this.iv;
                        fb.this.rp = "0";
                        fb.this.iv.zmn((zn.btk) fb.this);
                        fb.this.iv.zmn((zn.fs) fb.this);
                        fb.this.iv.zmn((zn.InterfaceC0100zn) fb.this);
                        fb.this.iv.zmn((zn.zmn) fb.this);
                        fb.this.iv.zmn((zn.hhw) fb.this);
                        fb.this.iv.zmn((zn.fb) fb.this);
                        fb.this.iv.zmn((zn.nps) fb.this);
                        try {
                            fb.this.iv.zn(false);
                        } catch (Throwable unused2) {
                        }
                        fb.this.rc = false;
                    }
                }
            });
        }
    }

    public void bvs() {
        if (zg() || this.iv == null) {
            return;
        }
        this.ev.set(true);
        if (this.rt != 206) {
            phc();
            this.fkt = false;
            this.fb.zmn(true);
            fs(0L);
            kjb kjbVar = this.cyb;
            if (kjbVar != null) {
                kjbVar.removeCallbacks(this.oub);
                this.cyb.postDelayed(this.oub, this.so);
            }
        }
        this.yj.countDown();
    }

    public void zmn(boolean z, long j, boolean z2) {
        if (zg()) {
            return;
        }
        doe();
        this.am = z2;
        this.ev.set(true);
        this.fkt = false;
        fs(z2);
        if (z) {
            this.cn = j;
            nqi();
        } else {
            fs(j);
        }
        kjb kjbVar = this.cyb;
        if (kjbVar != null) {
            kjbVar.removeCallbacks(this.oub);
            this.cyb.postDelayed(this.oub, this.so);
        }
        this.yj.countDown();
    }

    private void fs(long j) {
        this.fb.zmn(j);
        if (this.kjb) {
            fs(this.fb);
        } else if (fs(this.zak)) {
            fs(this.fb);
        } else {
            zmn(this.fb);
        }
    }

    private boolean fs(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        return znVar != null && znVar.nps();
    }

    public void iv() {
        if (zg() || this.cyb == null) {
            return;
        }
        this.ev.set(true);
        this.cyb.post(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.11
            @Override // java.lang.Runnable
            public void run() {
                if (!fb.this.nps() || fb.this.iv == null) {
                    return;
                }
                try {
                    fb.this.iv.hhw();
                    for (WeakReference weakReference : fb.this.zn) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((zmn.InterfaceC0103zmn) weakReference.get()).btk(fb.this);
                        }
                    }
                    fb.this.rt = 206;
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
    }

    public void rc() {
        kjb kjbVar;
        if (zg() || (kjbVar = this.cyb) == null) {
            return;
        }
        kjbVar.removeMessages(100);
        this.fkt = true;
        if (!this.ww) {
            if (this.nqi || fs(this.zak)) {
                kjb kjbVar2 = this.cyb;
                if (kjbVar2 != null) {
                    kjbVar2.sendEmptyMessage(101);
                    return;
                }
                return;
            }
            zmn(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.12
                @Override // java.lang.Runnable
                public void run() {
                    if (fb.this.cyb != null) {
                        fb.this.cyb.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        if (this.bvs || fs(this.zak)) {
            kjb kjbVar3 = this.cyb;
            if (kjbVar3 != null) {
                kjbVar3.sendEmptyMessage(101);
                return;
            }
            return;
        }
        zmn(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.13
            @Override // java.lang.Runnable
            public void run() {
                if (fb.this.cyb != null) {
                    fb.this.cyb.sendEmptyMessage(101);
                }
            }
        });
    }

    public void klz() {
        if (zg()) {
            return;
        }
        this.mw = true;
        so();
        kjb kjbVar = this.cyb;
        if (kjbVar != null) {
            try {
                kjbVar.removeCallbacksAndMessages(null);
                if (this.iv != null) {
                    this.cyb.sendEmptyMessage(103);
                }
                bjh();
            } catch (Throwable unused) {
                bjh();
            }
        }
    }

    private void nqi() {
        fs(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.14
            @Override // java.lang.Runnable
            public void run() {
                if (fb.this.cyb != null) {
                    fb.this.cyb.sendEmptyMessage(104);
                }
            }
        });
    }

    public void zmn(final long j) {
        if (zg()) {
            return;
        }
        if (this.rt == 207 || this.rt == 206 || this.rt == 209) {
            fs(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.2
                @Override // java.lang.Runnable
                public void run() {
                    if (fb.this.cyb != null) {
                        fb.this.cyb.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
    public boolean zmn() {
        return this.bvs;
    }

    public void zmn(final SurfaceTexture surfaceTexture) {
        if (zg()) {
            return;
        }
        this.btk = surfaceTexture;
        zmn(true);
        fs(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.3
            @Override // java.lang.Runnable
            public void run() {
                fb.this.doe();
                if (fb.this.cyb != null) {
                    fb.this.cyb.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void zmn(final SurfaceHolder surfaceHolder) {
        if (zg()) {
            return;
        }
        this.hhw = surfaceHolder;
        zmn(true);
        fs(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.4
            @Override // java.lang.Runnable
            public void run() {
                fb.this.doe();
                if (fb.this.cyb != null) {
                    fb.this.cyb.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void zmn(final com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        if (zg()) {
            return;
        }
        this.zak = znVar;
        if (znVar != null) {
            this.ww = this.ww && !znVar.nps();
        }
        fs(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.5
            @Override // java.lang.Runnable
            public void run() {
                fb.this.doe();
                if (fb.this.cyb != null) {
                    fb.this.cyb.obtainMessage(107, znVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
    public boolean hhw() {
        kjb kjbVar;
        return (this.rt == 206 || ((kjbVar = this.cyb) != null && kjbVar.hasMessages(100))) && !this.fkt;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
    public boolean zn() {
        return mw() || hhw() || nps();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
    public boolean nps() {
        kjb kjbVar;
        return ((this.rt != 207 && !this.fkt) || (kjbVar = this.cyb) == null || kjbVar.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
    public boolean zg() {
        return this.mw;
    }

    public boolean mw() {
        return this.rt == 205;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
    public boolean fs() {
        return this.rt == 209;
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        int i = this.rt;
        int i2 = message.what;
        if (this.iv != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.rt == 205 || this.rt == 207 || this.rt == 209) {
                            this.iv.hhw();
                            this.doe = SystemClock.elapsedRealtime();
                            this.rt = 206;
                            if (this.cn > 0) {
                                this.iv.zmn(this.cn, this.zg);
                                this.cn = -1L;
                            }
                            if (this.zak != null) {
                                fs(this.am);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.olo) {
                            this.kgc += this.iqz;
                        }
                        this.olo = false;
                        this.iqz = 0L;
                        this.kw = Long.MIN_VALUE;
                        if (this.rt == 206 || this.rt == 207 || this.rt == 209) {
                            this.iv.zg();
                            this.rt = 207;
                            this.fkt = false;
                            for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().fb(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.iv.mw();
                        this.rt = 201;
                        return;
                    case 103:
                        try {
                            uqh();
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<zmn.InterfaceC0103zmn> weakReference2 : this.zn) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().zn(this);
                            }
                        }
                        this.rt = 203;
                        return;
                    case 104:
                        if (this.rt == 202 || this.rt == 208) {
                            this.iv.bvs();
                            return;
                        }
                        break;
                    case 105:
                        if (this.rt == 205 || this.rt == 206 || this.rt == 208 || this.rt == 207 || this.rt == 209) {
                            this.iv.nps();
                            this.rt = 208;
                            return;
                        }
                        break;
                    case 106:
                        if (this.rt == 206 || this.rt == 207 || this.rt == 209) {
                            this.iv.zmn(((Long) message.obj).longValue(), this.zg);
                            return;
                        }
                        break;
                    case 107:
                        phc();
                        if (this.rt == 201 || this.rt == 203) {
                            com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar = (com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn) message.obj;
                            if (TextUtils.isEmpty(znVar.btk())) {
                                znVar.zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs());
                            }
                            if (znVar.bjh()) {
                                this.iv.zmn(znVar.cyb());
                                znVar.cyb();
                            } else {
                                File file = new File(znVar.btk(), znVar.olo());
                                if (file.exists()) {
                                    zmn(znVar, file);
                                } else {
                                    zn(znVar);
                                }
                            }
                            this.rt = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.iv.zmn((SurfaceHolder) message.obj);
                        this.iv.fs(true);
                        this.yj.await(1L, TimeUnit.SECONDS);
                        yj();
                        return;
                    case 111:
                        this.tf = new Surface((SurfaceTexture) message.obj);
                        this.iv.zmn(this.tf);
                        this.iv.fs(true);
                        this.yj.await(1L, TimeUnit.SECONDS);
                        yj();
                        return;
                }
                this.rt = 200;
                if (this.rc) {
                    return;
                }
                com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar = new com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(308, i2);
                zmnVar.zmn(i + StringUtils.COMMA + i2);
                for (WeakReference<zmn.InterfaceC0103zmn> weakReference3 : this.zn) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().zmn(this, zmnVar);
                    }
                }
                this.rc = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, File file) {
        if (znVar.zmn()) {
            fs(znVar, file);
        } else {
            zmn(file);
        }
    }

    private void zmn(File file) {
        file.getAbsolutePath();
        try {
            if (phc.zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn())) {
                this.iv.zmn(file.getAbsolutePath());
            } else {
                fs(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    private void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, File file) {
        try {
            String zmn2 = com.bykv.vk.openvk.zmn.zmn.zmn.nps.zmn.zmn(file);
            if (znVar.olo().equals(zmn2)) {
                zmn(file);
                return;
            }
            JSONObject zn = znVar.zn();
            boolean fs = znVar.fs();
            if (zn != null) {
                zn.put("file_hash", znVar.olo());
                zn.put("file_real_hash", zmn2);
                zn.put("is_change_play_type", fs ? 1 : 0);
                zn.put("error_real_code", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                zn.put("error_real_msg", "md5_not_match");
            }
            if (fs) {
                boolean delete = file.delete();
                if (zn != null) {
                    zn.put("delete_cache_file", delete ? 1 : 0);
                }
                if (delete) {
                    zn(znVar);
                    return;
                }
            }
            zmn(file);
        } catch (Throwable unused) {
        }
    }

    private void zn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) throws Throwable {
        znVar.cyb();
        this.iv.zmn(znVar);
        znVar.cyb();
    }

    private void fs(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.iv.zmn(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void uqh() {
        if (this.iv == null) {
            return;
        }
        try {
            this.iv.mw();
        } catch (Throwable unused) {
        }
        this.iv.zmn((zn.fs) null);
        this.iv.zmn((zn.nps) null);
        this.iv.zmn((zn.zmn) null);
        this.iv.zmn((zn.fb) null);
        this.iv.zmn((zn.InterfaceC0100zn) null);
        this.iv.zmn((zn.btk) null);
        this.iv.zmn((zn.hhw) null);
        try {
            this.iv.klz();
        } catch (Throwable unused2) {
        }
    }

    private void bjh() {
        kjb kjbVar = this.cyb;
        if (kjbVar == null || kjbVar.getLooper() == null) {
            return;
        }
        try {
            this.cyb.post(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.6
                @Override // java.lang.Runnable
                public void run() {
                    if (fb.this.cyb == null || fb.this.cyb.getLooper() == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.component.zg.zmn.zmn.zmn().zmn(fb.this.cyb);
                        fb.this.cyb = null;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn.zmn
    public void zmn(zn znVar, int i) {
        if (this.iv != znVar) {
            return;
        }
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().fs(this, i);
            }
        }
    }

    private void rp() {
        SparseIntArray sparseIntArray = zmn;
        sparseIntArray.put(this.bjh, sparseIntArray.get(this.bjh) + 1);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn.fs
    public void zmn(zn znVar) {
        this.rt = 209;
        zmn.delete(this.bjh);
        kjb kjbVar = this.cyb;
        if (kjbVar != null) {
            kjbVar.removeCallbacks(this.oub);
        }
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zmn(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn.InterfaceC0100zn
    public boolean zmn(zn znVar, int i, int i2) {
        rp();
        this.rt = 200;
        kjb kjbVar = this.cyb;
        if (kjbVar != null) {
            kjbVar.removeCallbacks(this.oub);
        }
        if (zmn(i, i2)) {
            bjh();
        }
        if (!this.ev.get()) {
            return true;
        }
        this.ev.set(false);
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar = new com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(i, i2);
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zmn(this, zmnVar);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn.fb
    public boolean fs(zn znVar, int i, int i2) {
        if (this.iv != znVar) {
            return false;
        }
        if (i2 == -1004) {
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar = new com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(i, i2);
            for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().zmn(this, zmnVar);
                }
            }
        }
        fs(i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(int i, int i2) {
        if (i == 701) {
            this.hgd = SystemClock.elapsedRealtime();
            this.nps++;
            for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().zmn(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i == 702) {
            if (this.hgd > 0) {
                this.nu += SystemClock.elapsedRealtime() - this.hgd;
                this.hgd = 0L;
            }
            for (WeakReference<zmn.InterfaceC0103zmn> weakReference2 : this.zn) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().zmn((com.bykv.vk.openvk.zmn.zmn.zmn.zmn) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.ww && i == 3) {
            yj();
            kjb();
            fs(this.am);
        } else if (i == 805) {
            this.jy = true;
        }
    }

    public boolean rt() {
        return this.jy;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn.btk
    public void fs(zn znVar) {
        if (zg()) {
            return;
        }
        this.rt = 205;
        try {
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar2 = this.zak;
            if (znVar2 != null) {
                float cn = znVar2.cn();
                if (cn > 0.0f) {
                    com.bykv.vk.openvk.zmn.zmn.zmn.fs fsVar = new com.bykv.vk.openvk.zmn.zmn.zmn.fs();
                    fsVar.zmn(cn);
                    this.iv.zmn(fsVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.cyb != null) {
            if (this.fkt) {
                zak();
            } else {
                kjb kjbVar = this.cyb;
                kjbVar.sendMessage(kjbVar.obtainMessage(100, -1, -1));
            }
        }
        zmn.delete(this.bjh);
        boolean z = this.ww;
        boolean z2 = this.nqi;
        if (!z && !z2) {
            kjb();
            this.nqi = true;
        }
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().fs(this);
            }
        }
    }

    private void kjb() {
        this.vlj = true;
        this.bvs = true;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.doe;
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zmn(this, elapsedRealtime);
            }
        }
    }

    private void zak() {
        kjb kjbVar = this.cyb;
        if (kjbVar != null) {
            kjbVar.post(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        fb.this.iv.zg();
                        fb.this.rt = 207;
                        fb.this.fkt = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn.hhw
    public void zn(zn znVar) {
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zmn((com.bykv.vk.openvk.zmn.zmn.zmn.zmn) this, true);
            }
        }
    }

    private void zmn(Runnable runnable) {
        try {
            if (this.uqh == null) {
                this.uqh = new ArrayList<>();
            }
            this.uqh.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void am() {
        if (this.klz) {
            return;
        }
        this.klz = true;
        Iterator it = new ArrayList(this.uqh).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.uqh.clear();
        this.klz = false;
    }

    private void yj() {
        ArrayList<Runnable> arrayList = this.uqh;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        am();
    }

    private void so() {
        ArrayList<Runnable> arrayList = this.uqh;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.uqh.clear();
    }

    private void fs(Runnable runnable) {
        if (runnable == null || zg()) {
            return;
        }
        if (!this.mw) {
            runnable.run();
        } else {
            zmn(runnable);
        }
    }

    public void fs(final boolean z) {
        kjb kjbVar;
        if (zg() || (kjbVar = this.cyb) == null) {
            return;
        }
        kjbVar.post(new Runnable() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zn.fb.8
            @Override // java.lang.Runnable
            public void run() {
                if (fb.this.zg() || fb.this.iv == null) {
                    return;
                }
                try {
                    fb.this.am = z;
                    fb.this.iv.fb(z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public long cn() {
        if (this.olo) {
            long j = this.iqz;
            if (j > 0) {
                return this.kgc + j;
            }
        }
        return this.kgc;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
    public int fb() {
        if (this.iv == null || zg()) {
            return 0;
        }
        return this.iv.rt();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
    public int btk() {
        if (this.iv == null || zg()) {
            return 0;
        }
        return this.iv.cn();
    }

    public int cyb() {
        return this.nps;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn.nps
    public void zmn(zn znVar, int i, int i2, int i3, int i4) {
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zmn((com.bykv.vk.openvk.zmn.zmn.zmn.zmn) this, i, i2);
            }
        }
    }

    public long olo() {
        long j = this.phc;
        if (j != 0) {
            return j;
        }
        if (this.rt == 206 || this.rt == 207) {
            try {
                this.phc = this.iv.rc();
            } catch (Throwable unused) {
            }
        }
        return this.phc;
    }

    public long kgc() {
        if (zg()) {
            return 0L;
        }
        if (this.rt == 206 || this.rt == 207) {
            try {
                return this.iv.iv();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public void zmn(zmn.InterfaceC0103zmn interfaceC0103zmn) {
        if (interfaceC0103zmn == null) {
            return;
        }
        for (WeakReference<zmn.InterfaceC0103zmn> weakReference : this.zn) {
            if (weakReference != null && weakReference.get() == interfaceC0103zmn) {
                return;
            }
        }
        this.zn.add(new WeakReference<>(interfaceC0103zmn));
    }

    public void zmn(int i) {
        if (zg()) {
            return;
        }
        this.so = i;
    }

    public SurfaceHolder kw() {
        return this.hhw;
    }

    public SurfaceTexture iqz() {
        return this.btk;
    }

    public void fs(int i) {
        this.zg = i;
    }

    public boolean zmn(float f) {
        PlaybackParams playbackParams;
        if (f <= 0.0f) {
            return false;
        }
        try {
            if (this.iv == null || !zn()) {
                return false;
            }
            try {
                playbackParams = this.iv.btk();
            } catch (Throwable th) {
                iqz.zn("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParams = null;
            }
            if ((playbackParams != null ? playbackParams.getSpeed() : 0.0f) == f) {
                return true;
            }
            com.bykv.vk.openvk.zmn.zmn.zmn.fs fsVar = new com.bykv.vk.openvk.zmn.zmn.zmn.fs();
            fsVar.zmn(f);
            this.iv.zmn(fsVar);
            return true;
        } catch (Throwable th2) {
            iqz.zmn("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }

    class zmn implements Runnable {
        private long fs;
        private boolean zn;

        zmn() {
        }

        public void zmn(boolean z) {
            this.zn = z;
        }

        public void zmn(long j) {
            this.fs = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fb.this.iv != null) {
                try {
                    if (!this.zn) {
                        long iv = fb.this.iv.iv();
                        fb.this.cn = Math.max(this.fs, iv);
                    }
                    long unused = fb.this.cn;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (fb.this.cyb != null) {
                fb.this.cyb.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }
}
