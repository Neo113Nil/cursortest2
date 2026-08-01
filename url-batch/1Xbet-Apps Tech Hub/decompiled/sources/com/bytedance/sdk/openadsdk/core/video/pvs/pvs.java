package com.bytedance.sdk.openadsdk.core.video.pvs;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NB;
import com.bytedance.sdk.openadsdk.core.widget.NB;
import com.bytedance.sdk.openadsdk.core.yiw.sUS;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.pvs.Jd;
import com.bytedance.sdk.openadsdk.icD.yiw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BaseController.java */
/* loaded from: classes2.dex */
public abstract class pvs implements vG, dyT.pvs, com.bytedance.sdk.openadsdk.core.video.nativevideo.pvs {
    protected sUS CvL;
    protected long Gp;
    protected SurfaceTexture Jd;
    protected com.bytedance.sdk.openadsdk.core.video.vG.vG NB;
    protected icD OT;
    protected final Context Wyp;
    protected final ViewGroup ZhG;
    protected boolean bNS;
    protected vG.pvs dX;
    protected WeakReference<vG.icD> dyT;
    private long gA;
    protected boolean ny;
    protected NB sUS;
    protected boolean uc;
    protected SurfaceHolder vG;
    protected final cR yiw;
    protected String pvs = "TTAD.VideoController";
    protected final dyT icD = new dyT(Looper.getMainLooper(), this);
    protected long so = 0;
    protected long Mxy = 0;
    protected final List<Runnable> qh = new ArrayList();
    protected boolean kj = false;
    protected boolean Ju = false;
    protected boolean IP = true;
    protected boolean mnm = false;
    protected boolean vA = false;
    protected boolean cR = false;
    protected AtomicBoolean zM = new AtomicBoolean(false);
    protected boolean rCZ = true;
    protected Runnable ae = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.pvs.pvs.1
        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[2];
            Boolean.valueOf(pvs.this.kj);
            pvs.this.rCZ();
        }
    };
    private long jlb = 0;
    private boolean dx = true;
    private int Pj = 1;

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
    }

    public void pvs(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view, boolean z) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(vG.Jd jd) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean vA() {
        return true;
    }

    public pvs(Context context, cR cRVar, ViewGroup viewGroup) {
        this.yiw = cRVar;
        this.Wyp = context;
        this.ZhG = viewGroup;
        this.pvs += hashCode();
    }

    protected void zM() {
        if (this.NB == null) {
            return;
        }
        if (cR()) {
            SurfaceTexture surfaceTexture = this.Jd;
            if (surfaceTexture == null || surfaceTexture == this.NB.zM()) {
                return;
            }
            this.NB.pvs(this.Jd);
            return;
        }
        SurfaceHolder surfaceHolder = this.vG;
        if (surfaceHolder == null || surfaceHolder == this.NB.cR()) {
            return;
        }
        this.NB.pvs(this.vG);
    }

    private boolean cR() {
        NB nb = this.sUS;
        if (nb != null) {
            return nb.Ju() instanceof SSRenderTextureView;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public long NB() {
        return this.so;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(long j) {
        this.so = j;
        this.Mxy = Math.max(this.Mxy, j);
    }

    protected void pvs(Runnable runnable) {
        if (this.sUS.OT() && this.kj) {
            runnable.run();
        } else {
            icD(runnable);
        }
    }

    protected void icD(Runnable runnable) {
        this.qh.add(runnable);
    }

    protected void uc() {
        if (this.qh.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.qh).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.qh.clear();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public void pvs(com.bykv.vk.openvk.component.video.api.Jd.icD icd, SurfaceHolder surfaceHolder) {
        this.kj = true;
        this.vG = surfaceHolder;
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar == null) {
            return;
        }
        vGVar.pvs(surfaceHolder);
        uc();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public void icD(com.bykv.vk.openvk.component.video.api.Jd.icD icd, SurfaceHolder surfaceHolder) {
        this.kj = false;
        this.vG = null;
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar != null) {
            vGVar.pvs(false);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public void pvs(com.bykv.vk.openvk.component.video.api.Jd.icD icd, SurfaceTexture surfaceTexture) {
        this.kj = true;
        this.Jd = surfaceTexture;
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar != null) {
            vGVar.pvs(surfaceTexture);
            this.NB.pvs(this.kj);
        }
        uc();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public void icD(com.bykv.vk.openvk.component.video.api.Jd.icD icd, SurfaceTexture surfaceTexture) {
        this.kj = false;
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar != null) {
            vGVar.pvs(false);
        }
        this.Jd = null;
        uc();
    }

    protected void rCZ() {
        this.icD.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.pvs.pvs.2
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.NB != null) {
                    Object[] objArr = new Object[2];
                    Boolean.valueOf(pvs.this.kj);
                    pvs.this.NB.Wyp();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public com.bykv.vk.openvk.component.video.api.pvs kj() {
        return this.NB;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    /* renamed from: OT, reason: merged with bridge method [inline-methods] */
    public final NB Ju() {
        return this.sUS;
    }

    public boolean ny() {
        return this.IP;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(boolean z) {
        this.IP = z;
        NB nb = this.sUS;
        if (nb != null) {
            nb.Jd(z);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void icD(long j) {
        this.jlb = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean qh() {
        return this.mnm;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void vG(long j) {
        this.Gp = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final long sUS() {
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar == null) {
            return 0L;
        }
        return vGVar.IP();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final int yiw() {
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar == null) {
            return 0;
        }
        return vGVar.bNS();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean IP() {
        return this.bNS;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final void icD(final boolean z) {
        this.bNS = z;
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar != null) {
            vGVar.icD(z);
        }
        if (this.CvL != null) {
            if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
                this.CvL.pvs(z);
            } else {
                this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.pvs.pvs.3
                    @Override // java.lang.Runnable
                    public void run() {
                        pvs.this.CvL.pvs(z);
                    }
                });
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final long so() {
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar == null) {
            return 0L;
        }
        return vGVar.mnm();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean bNS() {
        return this.Ju;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final void vG(boolean z) {
        this.Ju = z;
    }

    protected void sUS(boolean z) {
        this.cR = z;
    }

    public boolean ZhG() {
        return this.dx;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final void Jd(boolean z) {
        this.dx = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void icD(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        icD icd = (icD) vGVar;
        this.OT = icd;
        this.bNS = icd.so();
        vGVar.Jd(String.valueOf(this.yiw.yTz()));
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final boolean mnm() {
        return this.ny;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final int Wyp() {
        return com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(this.Mxy, this.Gp);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void NB(boolean z) {
        this.rCZ = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public final void icD(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view) {
        icD(icd, view, false, false);
    }

    public final void icD(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view, boolean z, boolean z2) {
        sUS(!this.cR);
        Context context = this.Wyp;
        if (context != null && (context instanceof Activity)) {
            if (this.cR) {
                pvs(z ? 8 : 0);
                NB nb = this.sUS;
                if (nb != null) {
                    nb.pvs(this.ZhG);
                    this.sUS.vG(false);
                }
            } else {
                pvs(1);
                NB nb2 = this.sUS;
                if (nb2 != null) {
                    nb2.icD(this.ZhG);
                    this.sUS.vG(false);
                }
            }
            WeakReference<vG.icD> weakReference = this.dyT;
            vG.icD icd2 = weakReference != null ? weakReference.get() : null;
            if (icd2 != null) {
                icd2.pvs(this.cR);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final void pvs(vG.icD icd) {
        this.dyT = new WeakReference<>(icd);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public final void NB(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view) {
        pvs(icd, view, false);
    }

    public final boolean dyT() {
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        return vGVar == null || vGVar.icD();
    }

    public final boolean dX() {
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        return vGVar != null && vGVar.sUS();
    }

    public final void pvs(int i) {
        Context context = this.Wyp;
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

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public final void vG(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view) {
        NB nb = this.sUS;
        if (nb != null) {
            nb.Mxy();
        }
        pvs(true, 3);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public final void pvs(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view, boolean z, boolean z2) {
        if (this.IP) {
            pvs();
        }
        if (z && !this.IP && !dyT()) {
            this.sUS.icD(!dX(), false);
            this.sUS.pvs(z2, true, false);
        }
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar != null && vGVar.sUS()) {
            this.sUS.sUS();
            this.sUS.NB();
        } else {
            this.sUS.sUS();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public final void Jd(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view) {
        if (this.cR) {
            sUS(false);
            NB nb = this.sUS;
            if (nb != null) {
                nb.icD(this.ZhG);
            }
            pvs(1);
            return;
        }
        pvs(true, 3);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public final void pvs(com.bykv.vk.openvk.component.video.api.Jd.icD icd, int i, boolean z) {
        if (this.Wyp == null) {
            return;
        }
        long kj = (long) (((i * this.Gp) * 1.0f) / uc.kj(r5, "tt_video_progress_max"));
        if (this.Gp > 0) {
            this.gA = (int) kj;
        } else {
            this.gA = 0L;
        }
        NB nb = this.sUS;
        if (nb != null) {
            nb.pvs(this.gA);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public final void pvs(com.bykv.vk.openvk.component.video.api.Jd.icD icd, int i) {
        if (this.NB == null) {
            return;
        }
        pvs(this.gA, vG(i));
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public final void icD(com.bykv.vk.openvk.component.video.api.Jd.icD icd, int i) {
        NB nb = this.sUS;
        if (nb != null) {
            nb.sUS();
        }
    }

    private void pvs(long j, boolean z) {
        if (this.NB == null) {
            return;
        }
        if (z) {
            dx();
        }
        this.NB.pvs(j);
    }

    private boolean vG(int i) {
        return this.sUS.icD(i);
    }

    private void dx() {
        NB nb = this.sUS;
        if (nb != null) {
            nb.Jd(0);
            this.sUS.pvs(false, false);
            this.sUS.vG(false);
            this.sUS.NB();
            this.sUS.yiw();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void pvs(yiw yiwVar) {
        if (this.zM.compareAndSet(false, true)) {
            sUS sus = this.CvL;
            if (sus != null) {
                sus.pvs(so(), IP());
            }
            bNS.pvs pvsVar = new bNS.pvs();
            pvsVar.pvs(ZhG());
            pvsVar.vG(so());
            com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(mnm.pvs(), this.sUS, pvsVar, yiwVar);
        }
    }

    protected final void CvL() {
        bNS.pvs pvsVar = new bNS.pvs();
        pvsVar.pvs(NB());
        pvsVar.vG(so() / gA());
        pvsVar.icD(sUS());
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.icD(Ju(), pvsVar);
    }

    protected final void Gp() {
        bNS.pvs pvsVar = new bNS.pvs();
        pvsVar.pvs(NB());
        pvsVar.vG(so() / gA());
        pvsVar.icD(sUS());
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(this.sUS, pvsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void icD(yiw yiwVar) {
        bNS.pvs pvsVar = new bNS.pvs();
        pvsVar.pvs(NB());
        pvsVar.vG(so() / gA());
        pvsVar.icD(sUS());
        pvsVar.Jd(yiw());
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.icD(this.sUS, pvsVar, yiwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void pvs(com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar) {
        bNS.pvs pvsVar2 = new bNS.pvs();
        pvsVar2.icD(sUS());
        pvsVar2.vG(so() / gA());
        pvsVar2.pvs(NB());
        pvsVar2.pvs(pvsVar);
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.vG(Ju(), pvsVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ae() {
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(this.yiw, this.sUS, this.OT);
    }

    public int gA() {
        return this.Pj;
    }

    public void icD(int i) {
        this.Pj = i;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final void pvs(vG.pvs pvsVar) {
        this.dX = pvsVar;
    }

    /* compiled from: BaseController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.pvs.pvs$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[NB.pvs.values().length];
            pvs = iArr;
            try {
                iArr[NB.pvs.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[NB.pvs.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pvs[NB.pvs.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.pvs
    public final void pvs(NB.pvs pvsVar, String str) {
        int i = AnonymousClass4.pvs[pvsVar.ordinal()];
        if (i == 1) {
            pvs();
            return;
        }
        if (i == 2) {
            vG();
        } else {
            if (i != 3) {
                return;
            }
            icD();
            this.mnm = false;
            this.vA = true;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final long Mxy() {
        return NB() + sUS();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public final void pvs() {
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar != null) {
            vGVar.qh();
        }
        if (this.uc || !this.zM.get()) {
            return;
        }
        Gp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void jlb() {
        Jd.pvs(com.bytedance.sdk.openadsdk.mnm.pvs.pvs(this.yiw.thO(), true, this.yiw), 5, this.yiw.neB());
    }

    public final void Jd(long j) {
        this.so = j;
        this.Mxy = Math.max(this.Mxy, j);
        com.bytedance.sdk.openadsdk.core.video.nativevideo.NB nb = this.sUS;
        if (nb != null) {
            nb.pvs();
        }
        com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
        if (vGVar != null) {
            vGVar.pvs(true, this.so, this.bNS);
        }
    }
}
