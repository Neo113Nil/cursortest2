package com.bytedance.sdk.openadsdk.core.cn.zmn;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fb;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.core.cn.fs.btk;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.hhw;
import com.bytedance.sdk.openadsdk.core.widget.iqz;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.bytedance.sdk.openadsdk.fb.nps;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public abstract class zmn implements zn, kjb.zmn, com.bytedance.sdk.openadsdk.core.cn.fs.zmn {
    protected boolean am;
    protected final ViewGroup bjh;
    protected SurfaceTexture btk;
    protected boolean cyb;
    protected SurfaceHolder fb;
    private long hgd;
    protected com.bytedance.sdk.openadsdk.core.cn.fb.zn hhw;
    protected zn.zmn kjb;
    protected btk nps;
    protected fs nqi;
    protected boolean phc;

    @NonNull
    protected final Context rc;
    protected WeakReference<zn.fs> rp;
    protected long so;
    protected long tf;
    protected boolean uqh;
    protected hhw zak;

    @NonNull
    protected final nqi zg;
    protected String zmn = "TTAD.VideoController";
    protected final int fs = 100;
    protected final kjb zn = new kjb(Looper.getMainLooper(), this);
    protected long bvs = 0;
    protected long iv = 0;
    protected final List<Runnable> klz = new ArrayList();
    protected boolean mw = false;
    protected boolean rt = false;
    protected boolean cn = true;
    protected boolean olo = false;
    protected boolean kgc = false;
    protected boolean kw = false;
    protected AtomicBoolean iqz = new AtomicBoolean(false);
    protected boolean doe = true;
    protected AtomicInteger yj = new AtomicInteger(0);
    protected boolean ev = false;
    protected Runnable fkt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.zmn.zmn.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z = zmn.this.mw;
            zmn.this.iqz();
        }
    };
    private long nu = 0;
    private boolean ww = true;
    private int oub = 1;
    private final AtomicBoolean jy = new AtomicBoolean(false);

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean cn() {
        return true;
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
    }

    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view, boolean z) {
    }

    public void zmn(zn.fb fbVar) {
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        return false;
    }

    public long olo() {
        return this.so;
    }

    public zmn(Context context, @NonNull nqi nqiVar, ViewGroup viewGroup) {
        this.zg = nqiVar;
        this.rc = context;
        this.bjh = viewGroup;
        this.zmn += hashCode();
    }

    protected void kgc() {
        if (this.hhw == null) {
            return;
        }
        if (cyb()) {
            SurfaceTexture surfaceTexture = this.btk;
            if (surfaceTexture == null || surfaceTexture == this.hhw.iqz()) {
                return;
            }
            this.hhw.zmn(this.btk);
            return;
        }
        SurfaceHolder surfaceHolder = this.fb;
        if (surfaceHolder == null || surfaceHolder == this.hhw.kw()) {
            return;
        }
        this.hhw.zmn(this.fb);
    }

    private boolean cyb() {
        btk btkVar = this.nps;
        if (btkVar != null) {
            return btkVar.mw() instanceof fb;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public long hhw() {
        return this.bvs;
    }

    public void fs(long j) {
        this.bvs = j;
        this.iv = Math.max(this.iv, j);
    }

    protected void zmn(Runnable runnable) {
        if (this.nps.doe() && this.mw) {
            runnable.run();
        } else {
            fs(runnable);
        }
    }

    protected void fs(Runnable runnable) {
        this.klz.add(runnable);
    }

    protected void kw() {
        if (this.klz.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.klz).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.klz.clear();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, SurfaceHolder surfaceHolder) {
        this.mw = true;
        this.fb = surfaceHolder;
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar == null) {
            return;
        }
        znVar.zmn(surfaceHolder);
        kw();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, SurfaceHolder surfaceHolder) {
        this.mw = false;
        this.fb = null;
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.zmn(false);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, SurfaceTexture surfaceTexture) {
        this.mw = true;
        this.btk = surfaceTexture;
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.zmn(surfaceTexture);
            this.hhw.zmn(this.mw);
        }
        kw();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, SurfaceTexture surfaceTexture) {
        this.mw = false;
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.zmn(false);
        }
        this.btk = null;
        kw();
    }

    protected void iqz() {
        this.zn.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.zmn.zmn.2
            @Override // java.lang.Runnable
            public void run() {
                zmn zmnVar = zmn.this;
                if (zmnVar.hhw != null) {
                    boolean z = zmnVar.mw;
                    zmn.this.hhw.iv();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public com.bykv.vk.openvk.zmn.zmn.zmn.zmn rc() {
        return this.hhw;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    /* renamed from: phc, reason: merged with bridge method [inline-methods] */
    public final btk klz() {
        return this.nps;
    }

    public boolean doe() {
        return this.cn;
    }

    public void zmn(boolean z) {
        this.cn = z;
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.fb(z);
        }
    }

    public void zn(long j) {
        this.nu = j;
    }

    public boolean nqi() {
        return this.olo;
    }

    public void fb(long j) {
        this.tf = j;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public final long nps() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar == null) {
            return 0L;
        }
        return znVar.cn();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public final int zg() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar == null) {
            return 0;
        }
        return znVar.cyb();
    }

    public boolean uqh() {
        return this.cyb;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public final void zmn(final boolean z, String str) {
        this.cyb = z;
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.fs(z);
            com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.nps, z, str);
        }
        if (this.zak != null) {
            if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
                this.zak.zmn(z);
            } else {
                this.zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.zmn.zmn.3
                    @Override // java.lang.Runnable
                    public void run() {
                        zmn.this.zak.zmn(z);
                    }
                });
            }
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public final long bvs() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar == null) {
            return 0L;
        }
        return znVar.olo();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean mw() {
        return this.rt;
    }

    public final void fs(boolean z) {
        this.rt = z;
    }

    protected void zn(boolean z) {
        this.kw = z;
    }

    public boolean bjh() {
        return this.ww;
    }

    public final void fb(boolean z) {
        this.ww = z;
    }

    public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        fs fsVar = (fs) znVar;
        this.nqi = fsVar;
        this.cyb = fsVar.rc();
        znVar.fb(String.valueOf(this.zg.qvo()));
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public final boolean rt() {
        return this.uqh;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public final int iv() {
        return com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(this.iv, this.tf);
    }

    public void btk(boolean z) {
        this.doe = z;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public final void fs(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view) {
        fs(fsVar, view, false, false);
    }

    public final void fs(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view, boolean z, boolean z2) {
        zn(!this.kw);
        Context context = this.rc;
        if (context != null && (context instanceof Activity)) {
            if (this.kw) {
                zmn(z ? 8 : 0);
                btk btkVar = this.nps;
                if (btkVar != null) {
                    btkVar.zmn(this.bjh);
                    this.nps.zn(false);
                }
            } else {
                zmn(1);
                btk btkVar2 = this.nps;
                if (btkVar2 != null) {
                    btkVar2.fs(this.bjh);
                    this.nps.zn(false);
                }
            }
            WeakReference<zn.fs> weakReference = this.rp;
            zn.fs fsVar2 = weakReference != null ? weakReference.get() : null;
            if (fsVar2 != null) {
                fsVar2.zmn(this.kw);
            }
        }
    }

    public final void zmn(zn.fs fsVar) {
        this.rp = new WeakReference<>(fsVar);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public final void btk(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view) {
        zmn(fsVar, view, false);
    }

    public final boolean rp() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        return znVar == null || znVar.fs();
    }

    public final boolean kjb() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        return znVar != null && znVar.hhw();
    }

    public final void zmn(int i) {
        Context context = this.rc;
        if (context == null) {
            return;
        }
        boolean z = i == 0 || i == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
            if (!z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public final void zn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view) {
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.bvs();
        }
        zmn(true, 3);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public final void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view, boolean z, boolean z2) {
        if (this.cn) {
            fs();
        }
        if (z && !this.cn && !rp()) {
            this.nps.fs(!kjb(), false);
            this.nps.zmn(z2, true, false);
        }
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null && znVar.hhw()) {
            this.nps.hhw();
            this.nps.btk();
        } else {
            this.nps.hhw();
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public final void fb(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view) {
        if (this.kw) {
            zn(false);
            btk btkVar = this.nps;
            if (btkVar != null) {
                btkVar.fs(this.bjh);
            }
            zmn(1);
            return;
        }
        zmn(true, 3);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public final void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, int i, boolean z) {
        if (this.rc == null) {
            return;
        }
        long j = (long) (((i * r0) * 1.0f) / 100.0f);
        if (this.tf > 0) {
            this.hgd = (int) j;
        } else {
            this.hgd = 0L;
        }
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zmn(this.hgd);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public final void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, int i) {
        if (this.hhw == null) {
            return;
        }
        zmn(this.hgd, zn(i));
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public final void fs(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, int i) {
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.hhw();
        }
    }

    private void zmn(long j, boolean z) {
        if (this.hhw == null) {
            return;
        }
        if (z) {
            fkt();
        }
        this.hhw.zmn(j);
    }

    private boolean zn(int i) {
        return this.nps.fs(i);
    }

    private void fkt() {
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.fb(0);
            this.nps.zmn(false, false);
            this.nps.zn(false);
            this.nps.btk();
            this.nps.nps();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zmn(nps npsVar) {
        boolean z = false;
        if (this.iqz.compareAndSet(false, true)) {
            this.ev = true;
            hhw hhwVar = this.zak;
            if (hhwVar != null) {
                hhwVar.zmn(bvs(), uqh());
            }
            cn.zmn zmnVar = new cn.zmn();
            zmnVar.zmn(bjh());
            zmnVar.fb(bvs());
            com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
            if (znVar != null && znVar.rt()) {
                z = true;
            }
            zmnVar.fs(z);
            com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(kgc.zmn(), this.nps, zmnVar, npsVar);
        }
    }

    protected final void zak() {
        this.ev = true;
        cn.zmn zmnVar = new cn.zmn();
        zmnVar.fs(hhw());
        zmnVar.fb(bvs() / so());
        zmnVar.zn(nps());
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.fs(klz(), zmnVar);
    }

    protected final void am() {
        this.ev = true;
        cn.zmn zmnVar = new cn.zmn();
        zmnVar.fs(hhw());
        zmnVar.fb(bvs() / so());
        zmnVar.zn(nps());
        zmnVar.zmn(olo());
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.nps, zmnVar);
    }

    protected final void fs(nps npsVar) {
        this.ev = true;
        cn.zmn zmnVar = new cn.zmn();
        zmnVar.fs(hhw());
        zmnVar.fb(bvs() / so());
        zmnVar.zn(nps());
        zmnVar.fb(zg());
        zmnVar.zmn(olo());
        zmnVar.zn(this.am);
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.fs(this.nps, zmnVar, npsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar) {
        this.ev = true;
        cn.zmn zmnVar2 = new cn.zmn();
        zmnVar2.zn(nps());
        zmnVar2.fb(bvs() / so());
        zmnVar2.fs(hhw());
        zmnVar2.zmn(zmnVar);
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zn(klz(), zmnVar2);
    }

    protected final void yj() {
        this.ev = true;
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.zg, this.nps, this.nqi);
    }

    public int so() {
        return this.oub;
    }

    public void fs(int i) {
        this.oub = i;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public final void zmn(zn.zmn zmnVar) {
        this.kjb = zmnVar;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.cn.zmn.zmn$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[iqz.zmn.values().length];
            zmn = iArr;
            try {
                iArr[iqz.zmn.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[iqz.zmn.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[iqz.zmn.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.zmn
    public final void zmn(iqz.zmn zmnVar, String str) {
        int i = AnonymousClass4.zmn[zmnVar.ordinal()];
        if (i == 1) {
            fs();
            return;
        }
        if (i == 2) {
            fb();
        } else {
            if (i != 3) {
                return;
            }
            zn();
            this.olo = false;
            this.kgc = true;
        }
    }

    public final long ev() {
        return hhw() + nps();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public final void fs() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.rc();
        }
        if (this.phc || !this.iqz.get()) {
            return;
        }
        am();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(long j) {
        this.so = j;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean zmn(float f) {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.zmn(f);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void tf() {
        com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn(this.zg.sl(), true, this.zg), 5, this.zg.ji());
    }

    public final void btk(long j) {
        this.bvs = j;
        this.iv = Math.max(this.iv, j);
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zmn();
        }
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.zmn(true, this.bvs, this.cyb);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zmn(long j, long j2) {
        if (!this.jy.get() && com.bytedance.sdk.openadsdk.hhw.zmn.zmn().zn() && (j * 1.0d) / j2 > 0.3d) {
            this.jy.set(true);
            if (this.zg != null) {
                com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("videoPercent30", this.zg);
            }
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(SurfaceTexture surfaceTexture) {
        this.am = true;
        this.yj.incrementAndGet();
    }
}
