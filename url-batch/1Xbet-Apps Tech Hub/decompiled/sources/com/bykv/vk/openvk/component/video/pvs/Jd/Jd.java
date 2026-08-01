package com.bykv.vk.openvk.component.video.pvs.Jd;

import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.component.video.api.pvs;
import com.bykv.vk.openvk.component.video.pvs.Jd.vG;
import com.bytedance.sdk.component.so.Mxy;
import com.bytedance.sdk.component.utils.dyT;
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

/* compiled from: SSMediaPlayerWrapper.java */
/* loaded from: classes.dex */
public class Jd implements com.bykv.vk.openvk.component.video.api.pvs, vG.Jd, vG.NB, vG.icD, vG.pvs, vG.sUS, vG.InterfaceC0019vG, vG.yiw, dyT.pvs {
    private static final SparseIntArray ZhG = new SparseIntArray();
    private int Jd;
    private dyT Ju;
    private boolean Mxy;
    private boolean Wyp;
    private boolean dyT;
    private SurfaceHolder icD;
    private SurfaceTexture pvs;
    private ArrayList<Runnable> rCZ;
    private volatile boolean sP;
    private boolean uc;
    private int vG = 0;
    private boolean NB = false;
    private volatile vG sUS = null;
    private final boolean yiw = false;
    private boolean so = false;
    private volatile int qh = 201;
    private long kj = -1;
    private boolean IP = false;
    private long bNS = 0;
    private long mnm = Long.MIN_VALUE;
    private long vA = 0;
    private long cR = 0;
    private long zM = 0;
    private int OT = 0;
    private String ny = "0";
    private final List<WeakReference<pvs.InterfaceC0018pvs>> dX = new CopyOnWriteArrayList();
    private com.bykv.vk.openvk.component.video.api.vG.vG CvL = null;
    private boolean Gp = false;
    private CountDownLatch ae = new CountDownLatch(1);
    private volatile int gA = 200;
    private AtomicBoolean jlb = new AtomicBoolean(false);
    private Surface dx = null;
    private final Runnable Pj = new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.1
        @Override // java.lang.Runnable
        public void run() {
            if (Jd.this.sUS == null) {
                return;
            }
            long vA = Jd.this.vA();
            if (vA > 0 && Jd.this.sUS() && Jd.this.mnm != Long.MIN_VALUE) {
                try {
                    if (Jd.this.mnm == vA) {
                        if (!Jd.this.IP && Jd.this.vA >= 400) {
                            Jd.this.icD(TypedValues.TransitionType.TYPE_FROM, 800);
                            Jd.this.IP = true;
                        }
                        Jd.this.vA += Jd.this.gA;
                    } else {
                        if (Jd.this.IP) {
                            Jd.this.bNS += Jd.this.vA;
                            Jd.this.icD(TypedValues.TransitionType.TYPE_TO, 800);
                            Object[] objArr = new Object[4];
                            Long.valueOf(Jd.this.bNS);
                            Integer.valueOf(Jd.this.vG);
                        }
                        Jd.this.vA = 0L;
                        Jd.this.IP = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (Jd.this.mnm() > 0) {
                if (Jd.this.mnm != vA) {
                    if (com.bykv.vk.openvk.component.video.api.vG.NB()) {
                        Object[] objArr2 = new Object[4];
                        Long.valueOf(Jd.this.mnm);
                        Long.valueOf(vA);
                    }
                    Jd jd = Jd.this;
                    jd.pvs(vA, jd.mnm());
                }
                Jd.this.mnm = vA;
            }
            if (!Jd.this.icD()) {
                if (Jd.this.Ju != null) {
                    Jd.this.Ju.postDelayed(this, Jd.this.gA);
                }
            } else {
                Jd jd2 = Jd.this;
                jd2.pvs(jd2.mnm(), Jd.this.mnm());
            }
        }
    };
    private final pvs cRf = new pvs();
    private long gSd = 0;
    private long qD = 0;
    private boolean od = false;

    private boolean pvs(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(long j, long j2) {
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pvs(this, j, j2);
            }
        }
    }

    public Jd() {
        pvs("SSMediaPlayerWrapper");
    }

    private void pvs(String str) {
        this.OT = 0;
        this.Ju = com.bytedance.sdk.component.so.pvs.pvs.pvs().pvs(this, Mxy.THREAD_NAME_PRE.concat(String.valueOf(str)));
        this.od = true;
        rCZ();
    }

    private void uc() {
        this.bNS = 0L;
        this.vG = 0;
        this.vA = 0L;
        this.IP = false;
        this.mnm = Long.MIN_VALUE;
    }

    public void pvs(final boolean z) {
        if (so()) {
            return;
        }
        this.dyT = z;
        if (this.sUS != null) {
            this.sUS.pvs(z);
            return;
        }
        dyT dyt = this.Ju;
        if (dyt != null) {
            dyt.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.9
                @Override // java.lang.Runnable
                public void run() {
                    if (Jd.this.sUS != null) {
                        Jd.this.sUS.pvs(z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rCZ() {
        dyT dyt = this.Ju;
        if (dyt != null) {
            dyt.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.10
                @Override // java.lang.Runnable
                public void run() {
                    if (Jd.this.sUS == null) {
                        try {
                            Jd.this.sUS = new icD();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (Jd.this.sUS == null) {
                            return;
                        }
                        vG unused = Jd.this.sUS;
                        Jd.this.ny = "0";
                        Jd.this.sUS.pvs((vG.NB) Jd.this);
                        Jd.this.sUS.pvs((vG.icD) Jd.this);
                        Jd.this.sUS.pvs((vG.InterfaceC0019vG) Jd.this);
                        Jd.this.sUS.pvs((vG.pvs) Jd.this);
                        Jd.this.sUS.pvs((vG.sUS) Jd.this);
                        Jd.this.sUS.pvs((vG.Jd) Jd.this);
                        Jd.this.sUS.pvs((vG.yiw) Jd.this);
                        try {
                            Jd.this.sUS.vG(false);
                        } catch (Throwable unused2) {
                        }
                        Jd.this.so = false;
                    }
                }
            });
        }
    }

    public void Mxy() {
        if (so() || this.sUS == null) {
            return;
        }
        this.jlb.set(true);
        if (this.qh != 206) {
            uc();
            this.sP = false;
            this.cRf.pvs(true);
            icD(0L);
            dyT dyt = this.Ju;
            if (dyt != null) {
                dyt.removeCallbacks(this.Pj);
                this.Ju.postDelayed(this.Pj, this.gA);
            }
        }
        this.ae.countDown();
    }

    public void pvs(boolean z, long j, boolean z2) {
        if (so()) {
            return;
        }
        rCZ();
        this.Gp = z2;
        this.jlb.set(true);
        this.sP = false;
        icD(z2);
        if (z) {
            this.kj = j;
            OT();
        } else {
            icD(j);
        }
        dyT dyt = this.Ju;
        if (dyt != null) {
            dyt.removeCallbacks(this.Pj);
            this.Ju.postDelayed(this.Pj, this.gA);
        }
        this.ae.countDown();
    }

    private void icD(long j) {
        this.cRf.pvs(j);
        if (this.dyT) {
            icD(this.cRf);
        } else if (icD(this.CvL)) {
            icD(this.cRf);
        } else {
            pvs(this.cRf);
        }
    }

    private boolean icD(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        return vGVar != null && vGVar.Jd();
    }

    public void Wyp() {
        if (so() || this.Ju == null) {
            return;
        }
        this.jlb.set(true);
        this.Ju.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.11
            @Override // java.lang.Runnable
            public void run() {
                if (!Jd.this.yiw() || Jd.this.sUS == null) {
                    return;
                }
                try {
                    Jd.this.sUS.NB();
                    for (WeakReference weakReference : Jd.this.dX) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((pvs.InterfaceC0018pvs) weakReference.get()).NB(Jd.this);
                        }
                    }
                    Jd.this.qh = 206;
                } catch (Throwable th) {
                    Object[] objArr = new Object[2];
                    th.getMessage();
                }
            }
        });
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    class pvs implements Runnable {
        private long icD;
        private boolean vG;

        pvs() {
        }

        public void pvs(boolean z) {
            this.vG = z;
        }

        public void pvs(long j) {
            this.icD = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Jd.this.sUS != null) {
                try {
                    if (!this.vG) {
                        long Mxy = Jd.this.sUS.Mxy();
                        Jd.this.kj = Math.max(this.icD, Mxy);
                    }
                    long unused = Jd.this.kj;
                } catch (Throwable th) {
                    new StringBuilder("[video] MediaPlayerProxy#start  error: getCurrentPosition :").append(th);
                }
            }
            if (Jd.this.Ju != null) {
                Jd.this.Ju.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }

    public void qh() {
        dyT dyt;
        if (so() || (dyt = this.Ju) == null) {
            return;
        }
        dyt.removeMessages(100);
        this.sP = true;
        if (!this.od) {
            if (this.uc || icD(this.CvL)) {
                dyT dyt2 = this.Ju;
                if (dyt2 != null) {
                    dyt2.sendEmptyMessage(101);
                    return;
                }
                return;
            }
            pvs(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.12
                @Override // java.lang.Runnable
                public void run() {
                    if (Jd.this.Ju != null) {
                        Jd.this.Ju.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        if (this.NB || icD(this.CvL)) {
            dyT dyt3 = this.Ju;
            if (dyt3 != null) {
                dyt3.sendEmptyMessage(101);
                return;
            }
            return;
        }
        pvs(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.13
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.Ju != null) {
                    Jd.this.Ju.sendEmptyMessage(101);
                }
            }
        });
    }

    public void kj() {
        if (so()) {
            return;
        }
        this.Wyp = true;
        gA();
        dyT dyt = this.Ju;
        if (dyt != null) {
            try {
                dyt.removeCallbacksAndMessages(null);
                if (this.sUS != null) {
                    this.Ju.sendEmptyMessage(103);
                }
                ZhG();
            } catch (Throwable unused) {
                ZhG();
            }
        }
    }

    private void OT() {
        icD(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.14
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.Ju != null) {
                    Jd.this.Ju.sendEmptyMessage(104);
                }
            }
        });
    }

    public void pvs(final long j) {
        if (so()) {
            return;
        }
        if (this.qh == 207 || this.qh == 206 || this.qh == 209) {
            icD(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.2
                @Override // java.lang.Runnable
                public void run() {
                    if (Jd.this.Ju != null) {
                        Jd.this.Ju.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs
    public boolean pvs() {
        return this.NB;
    }

    public void pvs(final SurfaceTexture surfaceTexture) {
        if (so()) {
            return;
        }
        this.pvs = surfaceTexture;
        pvs(true);
        icD(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.3
            @Override // java.lang.Runnable
            public void run() {
                Jd.this.rCZ();
                if (Jd.this.Ju != null) {
                    Jd.this.Ju.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void pvs(final SurfaceHolder surfaceHolder) {
        if (so()) {
            return;
        }
        this.icD = surfaceHolder;
        pvs(true);
        icD(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.4
            @Override // java.lang.Runnable
            public void run() {
                Jd.this.rCZ();
                if (Jd.this.Ju != null) {
                    Jd.this.Ju.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void pvs(final com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        if (so()) {
            return;
        }
        this.CvL = vGVar;
        if (vGVar != null) {
            this.od = this.od && !vGVar.Jd();
        }
        icD(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.5
            @Override // java.lang.Runnable
            public void run() {
                Jd.this.rCZ();
                if (Jd.this.Ju != null) {
                    Jd.this.Ju.obtainMessage(107, vGVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs
    public boolean sUS() {
        dyT dyt;
        return (this.qh == 206 || ((dyt = this.Ju) != null && dyt.hasMessages(100))) && !this.sP;
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs
    public boolean vG() {
        return Ju() || sUS() || yiw();
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs
    public boolean yiw() {
        dyT dyt;
        return ((this.qh != 207 && !this.sP) || (dyt = this.Ju) == null || dyt.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs
    public boolean so() {
        return this.Wyp;
    }

    public boolean Ju() {
        return this.qh == 205;
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs
    public boolean icD() {
        return this.qh == 209;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(Message message) {
        Message message2;
        Message message3 = message;
        int i = this.qh;
        int i2 = message3.what;
        if (this.sUS != null) {
            switch (message3.what) {
                case 100:
                    message3 = null;
                    if (this.qh == 205 || this.qh == 207 || this.qh == 209) {
                        this.sUS.NB();
                        this.zM = SystemClock.elapsedRealtime();
                        this.qh = 206;
                        if (this.kj > 0) {
                            this.sUS.pvs(this.kj, this.Jd);
                            this.kj = -1L;
                        }
                        if (this.CvL != null) {
                            icD(this.Gp);
                        }
                        message2 = message3;
                        break;
                    }
                    message2 = 1;
                    break;
                case 101:
                    if (this.IP) {
                        this.bNS += this.vA;
                    }
                    this.IP = false;
                    this.vA = 0L;
                    this.mnm = Long.MIN_VALUE;
                    if (this.qh == 206 || this.qh == 207 || this.qh == 209) {
                        this.sUS.yiw();
                        this.qh = 207;
                        message3 = null;
                        this.sP = false;
                        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
                            if (weakReference != null && weakReference.get() != null) {
                                weakReference.get().Jd(this);
                            }
                        }
                        message2 = message3;
                        break;
                    }
                    message2 = 1;
                    break;
                case 102:
                    this.sUS.kj();
                    this.qh = 201;
                    break;
                case 103:
                    try {
                        ny();
                    } catch (Throwable unused) {
                    }
                    for (WeakReference<pvs.InterfaceC0018pvs> weakReference2 : this.dX) {
                        if (weakReference2 != null && weakReference2.get() != null) {
                            weakReference2.get().vG(this);
                        }
                    }
                    this.qh = 203;
                    break;
                case 104:
                    if (this.qh == 202 || this.qh == 208) {
                        this.sUS.so();
                        break;
                    }
                    message2 = 1;
                    break;
                case 105:
                    if (this.qh == 205 || this.qh == 206 || this.qh == 208 || this.qh == 207 || this.qh == 209) {
                        this.sUS.sUS();
                        this.qh = 208;
                        break;
                    }
                    message2 = 1;
                    break;
                case 106:
                    if (this.qh == 206 || this.qh == 207 || this.qh == 209) {
                        this.sUS.pvs(((Long) message3.obj).longValue(), this.Jd);
                        break;
                    }
                    message2 = 1;
                    break;
                case 107:
                    uc();
                    if (this.qh == 201 || this.qh == 203) {
                        com.bykv.vk.openvk.component.video.api.vG.vG vGVar = (com.bykv.vk.openvk.component.video.api.vG.vG) message3.obj;
                        if (TextUtils.isEmpty(vGVar.icD())) {
                            vGVar.pvs(com.bykv.vk.openvk.component.video.api.vG.icD());
                        }
                        File file = new File(vGVar.icD(), vGVar.IP());
                        if (file.exists()) {
                            file.getAbsolutePath();
                            if (com.bykv.vk.openvk.component.video.api.vG.vG()) {
                                icD(file.getAbsolutePath());
                            } else {
                                this.sUS.pvs(file.getAbsolutePath());
                            }
                        } else {
                            vGVar.Ju();
                            int i3 = vGVar.icD;
                            this.sUS.pvs(vGVar);
                            vGVar.Ju();
                        }
                        this.qh = 202;
                        break;
                    }
                    message2 = 1;
                    break;
                case 110:
                    this.sUS.pvs((SurfaceHolder) message3.obj);
                    this.sUS.icD(true);
                    this.ae.await(1L, TimeUnit.SECONDS);
                    ae();
                    break;
                case 111:
                    this.dx = new Surface((SurfaceTexture) message3.obj);
                    this.sUS.pvs(this.dx);
                    this.sUS.icD(true);
                    this.ae.await(1L, TimeUnit.SECONDS);
                    ae();
                    break;
            }
            if (message2 == null) {
                this.qh = 200;
                if (this.so) {
                    return;
                }
                com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar = new com.bykv.vk.openvk.component.video.api.vG.pvs(308, i2);
                pvsVar.pvs(i + "," + i2);
                for (WeakReference<pvs.InterfaceC0018pvs> weakReference3 : this.dX) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().pvs(this, pvsVar);
                    }
                }
                this.so = true;
                return;
            }
            return;
        }
        message3 = null;
        message2 = message3;
        if (message2 == null) {
        }
    }

    private void icD(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.sUS.pvs(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void ny() {
        if (this.sUS == null) {
            return;
        }
        try {
            this.sUS.kj();
        } catch (Throwable unused) {
        }
        this.sUS.pvs((vG.icD) null);
        this.sUS.pvs((vG.yiw) null);
        this.sUS.pvs((vG.pvs) null);
        this.sUS.pvs((vG.Jd) null);
        this.sUS.pvs((vG.InterfaceC0019vG) null);
        this.sUS.pvs((vG.NB) null);
        this.sUS.pvs((vG.sUS) null);
        try {
            this.sUS.qh();
        } catch (Throwable unused2) {
        }
    }

    private void ZhG() {
        dyT dyt = this.Ju;
        if (dyt == null || dyt.getLooper() == null) {
            return;
        }
        this.Ju.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.6
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.Ju == null || Jd.this.Ju.getLooper() == null) {
                    return;
                }
                try {
                    com.bytedance.sdk.component.so.pvs.pvs.pvs().pvs(Jd.this.Ju);
                    Jd.this.Ju = null;
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG.pvs
    public void pvs(vG vGVar, int i) {
        if (this.sUS != vGVar) {
            return;
        }
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().icD(this, i);
            }
        }
    }

    private void dyT() {
        SparseIntArray sparseIntArray = ZhG;
        Integer valueOf = Integer.valueOf(sparseIntArray.get(this.OT));
        if (valueOf == null) {
            sparseIntArray.put(this.OT, 1);
        } else {
            sparseIntArray.put(this.OT, valueOf.intValue() + 1);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG.icD
    public void pvs(vG vGVar) {
        this.qh = 209;
        ZhG.delete(this.OT);
        dyT dyt = this.Ju;
        if (dyt != null) {
            dyt.removeCallbacks(this.Pj);
        }
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pvs(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG.InterfaceC0019vG
    public boolean pvs(vG vGVar, int i, int i2) {
        dyT();
        this.qh = 200;
        dyT dyt = this.Ju;
        if (dyt != null) {
            dyt.removeCallbacks(this.Pj);
        }
        if (pvs(i, i2)) {
            ZhG();
        }
        if (!this.jlb.get()) {
            return true;
        }
        this.jlb.set(false);
        com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar = new com.bykv.vk.openvk.component.video.api.vG.pvs(i, i2);
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pvs(this, pvsVar);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG.Jd
    public boolean icD(vG vGVar, int i, int i2) {
        if (this.sUS != vGVar) {
            return false;
        }
        if (i2 == -1004) {
            com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar = new com.bykv.vk.openvk.component.video.api.vG.pvs(i, i2);
            for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().pvs(this, pvsVar);
                }
            }
        }
        icD(i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(int i, int i2) {
        if (i == 701) {
            this.gSd = SystemClock.elapsedRealtime();
            this.vG++;
            for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().pvs(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            Object[] objArr = new Object[2];
            Integer.valueOf(this.vG);
            return;
        }
        if (i == 702) {
            if (this.gSd > 0) {
                this.qD += SystemClock.elapsedRealtime() - this.gSd;
                this.gSd = 0L;
            }
            for (WeakReference<pvs.InterfaceC0018pvs> weakReference2 : this.dX) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().pvs((com.bykv.vk.openvk.component.video.api.pvs) this, Integer.MAX_VALUE);
                }
            }
            Object[] objArr2 = new Object[4];
            Integer.valueOf(this.vG);
            Long.valueOf(this.qD);
            return;
        }
        if (this.od && i == 3) {
            ae();
            dX();
            icD(this.Gp);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG.NB
    public void icD(vG vGVar) {
        if (so()) {
            return;
        }
        this.qh = 205;
        try {
            com.bykv.vk.openvk.component.video.api.vG.vG vGVar2 = this.CvL;
            if (vGVar2 != null) {
                float kj = vGVar2.kj();
                if (kj > 0.0f) {
                    com.bykv.vk.openvk.component.video.api.icD icd = new com.bykv.vk.openvk.component.video.api.icD();
                    icd.pvs(kj);
                    this.sUS.pvs(icd);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.Ju != null) {
            if (this.sP) {
                CvL();
            } else {
                dyT dyt = this.Ju;
                dyt.sendMessage(dyt.obtainMessage(100, -1, -1));
            }
        }
        ZhG.delete(this.OT);
        boolean z = this.od;
        boolean z2 = this.uc;
        if (!z && !z2) {
            dX();
            this.uc = true;
        }
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().icD(this);
            }
        }
    }

    private void dX() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zM;
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pvs(this, elapsedRealtime);
            }
        }
        this.NB = true;
    }

    private void CvL() {
        dyT dyt = this.Ju;
        if (dyt != null) {
            dyt.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Jd.this.sUS.yiw();
                        Jd.this.qh = 207;
                        Jd.this.sP = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG.sUS
    public void vG(vG vGVar) {
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pvs((com.bykv.vk.openvk.component.video.api.pvs) this, true);
            }
        }
    }

    private void pvs(Runnable runnable) {
        try {
            if (this.rCZ == null) {
                this.rCZ = new ArrayList<>();
            }
            this.rCZ.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void Gp() {
        if (this.Mxy) {
            return;
        }
        this.Mxy = true;
        Iterator it = new ArrayList(this.rCZ).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.rCZ.clear();
        this.Mxy = false;
    }

    private void ae() {
        ArrayList<Runnable> arrayList = this.rCZ;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Gp();
    }

    private void gA() {
        ArrayList<Runnable> arrayList = this.rCZ;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.rCZ.clear();
    }

    private void icD(Runnable runnable) {
        if (runnable == null || so()) {
            return;
        }
        if (!this.Wyp) {
            runnable.run();
        } else {
            pvs(runnable);
        }
    }

    public void icD(final boolean z) {
        dyT dyt;
        if (so() || (dyt = this.Ju) == null) {
            return;
        }
        dyt.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.Jd.Jd.8
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.so() || Jd.this.sUS == null) {
                    return;
                }
                try {
                    Jd.this.Gp = z;
                    Jd.this.sUS.Jd(z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public long IP() {
        if (this.IP) {
            long j = this.vA;
            if (j > 0) {
                return this.bNS + j;
            }
        }
        return this.bNS;
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs
    public int Jd() {
        if (this.sUS == null || so()) {
            return 0;
        }
        return this.sUS.Ju();
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs
    public int NB() {
        if (this.sUS == null || so()) {
            return 0;
        }
        return this.sUS.IP();
    }

    public int bNS() {
        return this.vG;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG.yiw
    public void pvs(vG vGVar, int i, int i2, int i3, int i4) {
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pvs((com.bykv.vk.openvk.component.video.api.pvs) this, i, i2);
            }
        }
    }

    public long mnm() {
        long j = this.cR;
        if (j != 0) {
            return j;
        }
        if (this.qh == 206 || this.qh == 207) {
            try {
                this.cR = this.sUS.Wyp();
            } catch (Throwable unused) {
            }
        }
        return this.cR;
    }

    public long vA() {
        if (so()) {
            return 0L;
        }
        if (this.qh == 206 || this.qh == 207) {
            try {
                return this.sUS.Mxy();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public void pvs(pvs.InterfaceC0018pvs interfaceC0018pvs) {
        if (interfaceC0018pvs == null) {
            return;
        }
        for (WeakReference<pvs.InterfaceC0018pvs> weakReference : this.dX) {
            if (weakReference != null && weakReference.get() == interfaceC0018pvs) {
                return;
            }
        }
        this.dX.add(new WeakReference<>(interfaceC0018pvs));
    }

    public void pvs(int i) {
        if (so()) {
            return;
        }
        this.gA = i;
    }

    public SurfaceHolder cR() {
        return this.icD;
    }

    public SurfaceTexture zM() {
        return this.pvs;
    }

    public void icD(int i) {
        this.Jd = i;
    }
}
