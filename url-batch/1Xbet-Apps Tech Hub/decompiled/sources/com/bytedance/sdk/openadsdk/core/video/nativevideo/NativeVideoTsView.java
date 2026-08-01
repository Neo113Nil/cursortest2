package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.Gp;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.vA;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.vG;
import com.bytedance.sdk.openadsdk.core.yiw.sUS;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class NativeVideoTsView extends PAGFrameLayout implements vG.pvs, dyT.pvs, vG.pvs {
    private boolean CvL;
    private long Gp;
    boolean IP;
    protected boolean Jd;
    protected int Ju;
    protected ImageView Mxy;
    public boolean NB;
    private final Runnable OhP;
    private boolean Pj;
    private final AtomicBoolean SE;
    protected ImageView Wyp;
    private boolean ZhG;
    private final boolean ae;
    public icD bNS;
    private boolean cR;
    private final String cRf;
    private boolean dX;
    private long dx;
    private boolean dyT;
    private final Handler gA;
    private vG.InterfaceC0016vG gSd;
    protected com.bykv.vk.openvk.component.video.api.Jd.vG icD;
    private boolean jhZ;
    private boolean jlb;
    protected String kj;
    private final Context mnm;
    private String ny;
    private final AtomicBoolean od;
    protected final cR pvs;
    private ViewTreeObserver.OnGlobalLayoutListener qD;
    protected boolean qh;
    private View sP;
    public yiw sUS;
    protected ImageView so;
    private String uc;
    private ViewGroup vA;
    protected FrameLayout vG;
    private final ViewTreeObserver.OnScrollChangedListener yWX;
    protected RelativeLayout yiw;
    private boolean zM;
    private static final Integer rCZ = 0;
    private static final Integer OT = 1;

    public interface icD {
        void pvs(boolean z, long j, long j2, long j3, boolean z2);
    }

    public interface pvs {
        void pvs(View view, int i);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
    public void icD(long j, int i) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
    public void pvs() {
        Object[] objArr = new Object[2];
    }

    public void setAdCreativeClickListener(pvs pvsVar) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar != null) {
            ((vG) vGVar).pvs(pvsVar);
        }
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.video.nativevideo.icD icd) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar != null) {
            ((vG) vGVar).pvs(icd);
        }
    }

    public void setControllerStatusCallBack(icD icd) {
        this.bNS = icd;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
    public void pvs(long j, int i) {
        vG.InterfaceC0016vG interfaceC0016vG = this.gSd;
        if (interfaceC0016vG != null) {
            interfaceC0016vG.j_();
        }
    }

    private void Jd() {
        pvs(0L, 0);
        this.gSd = null;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
    public void pvs(long j, long j2) {
        vG.InterfaceC0016vG interfaceC0016vG = this.gSd;
        if (interfaceC0016vG != null) {
            interfaceC0016vG.pvs(j, j2);
        }
    }

    public NativeVideoTsView(Context context, cR cRVar, boolean z, yiw yiwVar) {
        this(context, cRVar, z, "embeded_ad", false, false, yiwVar);
    }

    public NativeVideoTsView(Context context, cR cRVar, String str, boolean z, boolean z2, yiw yiwVar) {
        this(context, cRVar, false, str, z, z2, yiwVar);
    }

    public NativeVideoTsView(Context context, cR cRVar, yiw yiwVar) {
        this(context, cRVar, false, yiwVar);
    }

    public NativeVideoTsView(Context context, cR cRVar, boolean z, String str, boolean z2, boolean z3, yiw yiwVar) {
        super(context);
        this.cR = true;
        this.Jd = true;
        this.zM = false;
        this.NB = false;
        this.ZhG = true;
        this.dyT = false;
        this.dX = true;
        this.qh = true;
        this.kj = "embeded_ad";
        this.Ju = 50;
        this.CvL = true;
        this.ae = false;
        this.gA = new dyT(Ju.icD().getLooper(), this);
        this.Pj = false;
        this.cRf = Build.MODEL;
        this.IP = false;
        this.od = new AtomicBoolean(false);
        this.OhP = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeVideoTsView nativeVideoTsView = NativeVideoTsView.this;
                nativeVideoTsView.pvs(nativeVideoTsView.jlb, NativeVideoTsView.rCZ.intValue());
            }
        };
        this.jhZ = true;
        this.SE = new AtomicBoolean(false);
        this.yWX = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeVideoTsView.this.vA();
            }
        };
        try {
            if (cRVar.CSZ()) {
                this.ny = CacheDirFactory.getICacheDir(0).icD();
            }
        } catch (Throwable unused) {
        }
        if (yiwVar != null) {
            this.sUS = yiwVar;
        }
        this.kj = str;
        this.mnm = context;
        this.pvs = cRVar;
        this.zM = z;
        setContentDescription("NativeVideoTsView");
        this.dyT = z2;
        this.dX = z3;
        icD();
        NB();
    }

    protected void icD() {
        cR cRVar = this.pvs;
        if (cRVar == null) {
            return;
        }
        int yTz = cRVar.yTz();
        int icD2 = mnm.Jd().icD(yTz);
        int vG = com.bytedance.sdk.component.utils.mnm.vG(mnm.pvs());
        if (icD2 == 1) {
            this.cR = jlb.Jd(vG);
        } else if (icD2 == 2) {
            this.cR = jlb.NB(vG) || jlb.Jd(vG) || jlb.sUS(vG);
        } else if (icD2 == 3) {
            this.cR = false;
        } else if (icD2 == 4) {
            this.IP = true;
        } else if (icD2 == 5) {
            this.cR = jlb.Jd(vG) || jlb.sUS(vG);
        }
        if (!this.zM) {
            if (!this.NB || !vA.icD(this.kj)) {
                this.Jd = mnm.Jd().vG(String.valueOf(yTz));
            }
        } else {
            this.Jd = false;
        }
        if ("open_ad".equals(this.kj)) {
            this.cR = true;
            this.Jd = true;
        }
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar != null) {
            vGVar.Jd(this.cR);
        }
        this.NB = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        icD icd;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar;
        if (!this.zM && (icd = this.bNS) != null && (vGVar = this.icD) != null) {
            icd.pvs(vGVar.bNS(), this.icD.so(), this.icD.Mxy(), this.icD.NB(), this.cR);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private View pvs(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.vA = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.vG = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.sP = view;
        return frameLayout;
    }

    private RelativeLayout icD(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        pAGRelativeLayout.setVisibility(8);
        PAGImageView pAGImageView = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        pAGImageView.setLayoutParams(layoutParams);
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.so = pAGImageView;
        PAGImageView pAGImageView2 = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        pAGImageView2.setLayoutParams(layoutParams2);
        pAGImageView2.setVisibility(8);
        pAGImageView2.setBackground(uc.vG(context, "tt_new_play_video"));
        this.Wyp = pAGImageView2;
        pAGRelativeLayout.addView(pAGImageView);
        pAGRelativeLayout.addView(pAGImageView2);
        return pAGRelativeLayout;
    }

    private void NB() {
        addView(pvs(this.mnm));
        cR();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                NativeVideoTsView.this.vA();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                NativeVideoTsView.this.vA();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vA() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.gA;
        if (handler == null || elapsedRealtime - this.dx <= 500) {
            return;
        }
        this.dx = elapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar != null) {
            ((vG) vGVar).pvs(pAGNativeAd);
        }
    }

    public void yiw() {
        View view;
        if (this.mnm == null || (view = this.sP) == null || view.getParent() == null || this.pvs == null || this.yiw != null) {
            return;
        }
        ViewParent parent = this.sP.getParent();
        RelativeLayout icD2 = icD(this.mnm);
        if (parent != null && (parent instanceof ViewGroup)) {
            pvs(icD2, (ViewGroup) parent, this.sP);
        }
        this.yiw = icD2;
        if (this.qh) {
            Pj.pvs((View) this.Wyp, 0);
        }
        if (this.pvs.od() != null && this.pvs.od().Wyp() != null) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.pvs.od().Wyp(), this.pvs.od().vG(), this.pvs.od().icD(), this.so, this.pvs);
        }
        ImageView imageView = this.Wyp;
        if (imageView != null) {
            imageView.setClickable(true);
            this.Wyp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    NativeVideoTsView.this.vG();
                }
            });
        }
    }

    private void pvs(View view, ViewGroup viewGroup, View view2) {
        int indexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    private void cR() {
        this.icD = new vG(this.mnm, this.vG, this.pvs, this.kj, !jlb(), this.dyT, this.dX, this.sUS);
        zM();
        if (this.qD == null) {
            this.qD = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (NativeVideoTsView.this.vA == null || NativeVideoTsView.this.vA.getViewTreeObserver() == null || NativeVideoTsView.this.icD == null) {
                        return;
                    }
                    ((vG) NativeVideoTsView.this.icD).pvs(NativeVideoTsView.this.vA.getWidth(), NativeVideoTsView.this.vA.getHeight());
                    NativeVideoTsView.this.vA.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    NativeVideoTsView.this.qD = null;
                }
            };
            this.vA.getViewTreeObserver().addOnGlobalLayoutListener(this.qD);
        }
    }

    public void setVideoAdLoadListener(vG.Jd jd) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar != null) {
            vGVar.pvs(jd);
        }
    }

    public boolean pvs(long j, boolean z, boolean z2) {
        boolean z3 = false;
        this.vA.setVisibility(0);
        this.Gp = j;
        if (!jlb()) {
            return true;
        }
        this.icD.pvs(false);
        cR cRVar = this.pvs;
        if (cRVar != null && cRVar.od() != null) {
            com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(this.pvs.LHy()).vG(), this.pvs);
            pvs2.icD(this.pvs.neB());
            pvs2.pvs(this.vA.getWidth());
            pvs2.icD(this.vA.getHeight());
            pvs2.vG(this.pvs.HWd());
            pvs2.pvs(j);
            pvs2.pvs(Mxy());
            pvs(pvs2);
            if (z2) {
                this.icD.icD(pvs2);
                return true;
            }
            z3 = this.icD.pvs(pvs2);
        }
        if (((j > 0 && !z && !z2) || (j > 0 && z)) && this.icD != null) {
            bNS.pvs pvsVar = new bNS.pvs();
            pvsVar.pvs(this.icD.NB());
            pvsVar.vG(this.icD.so());
            pvsVar.icD(this.icD.sUS());
            com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.icD(this.icD.Ju(), pvsVar);
        }
        return z3;
    }

    private void zM() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar == null) {
            return;
        }
        vGVar.Jd(this.cR);
        ((vG) this.icD).pvs((vG.pvs) this);
        this.icD.pvs(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        uc();
        getViewTreeObserver().addOnScrollChangedListener(this.yWX);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        uc();
    }

    private void uc() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar == null) {
            cR();
        } else if ((vGVar instanceof vG) && !jlb()) {
            ((vG) this.icD).cR();
        }
        if (this.icD == null || !this.od.get()) {
            return;
        }
        this.od.set(false);
        icD();
        if (so()) {
            Pj.pvs((View) this.yiw, 8);
            ImageView imageView = this.Mxy;
            if (imageView != null) {
                Pj.pvs((View) imageView, 8);
            }
            cR cRVar = this.pvs;
            if (cRVar != null && cRVar.od() != null) {
                com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(this.pvs.LHy()).vG(), this.pvs);
                pvs2.icD(this.pvs.neB());
                pvs2.pvs(this.vA.getWidth());
                pvs2.icD(this.vA.getHeight());
                pvs2.vG(this.pvs.HWd());
                pvs2.pvs(0L);
                pvs2.pvs(Mxy());
                pvs(pvs2);
                this.icD.pvs(pvs2);
                this.icD.vG(false);
                return;
            }
            com.bytedance.sdk.component.utils.Ju.pvs("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            return;
        }
        if (this.icD.bNS()) {
            this.icD.bNS();
            icD(true);
        } else {
            yiw();
            Pj.pvs((View) this.yiw, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rCZ();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.yWX);
        }
        ViewGroup viewGroup = this.vA;
        if (viewGroup == null || this.qD == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.qD);
            this.qD = null;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        rCZ();
    }

    private void rCZ() {
        this.bNS = null;
        if ((this.icD instanceof vG) && !jlb()) {
            ((vG) this.icD).dx();
        }
        Wyp();
        pvs(false);
        OT();
    }

    private void OT() {
        if (!this.od.get()) {
            this.od.set(true);
            com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
            if (vGVar != null) {
                vGVar.pvs(true, 3);
            }
        }
        this.SE.set(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            OT();
        }
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        if (message.what == 1) {
            ny();
        }
    }

    private void ny() {
        this.jlb = qh();
        ae.pvs(this.OhP);
    }

    private boolean ZhG() {
        cR cRVar = this.pvs;
        if (cRVar == null) {
            return false;
        }
        return cRVar.VR();
    }

    private boolean dyT() {
        if (jlb() || !ZhG()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void dX() {
        if (jlb() || !ZhG()) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_isfromvideodetailpage", Boolean.FALSE);
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_is_from_detail_page", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(boolean z, int i) {
        if (this.pvs == null || this.icD == null) {
            return;
        }
        boolean dyT = dyT();
        dX();
        if (dyT && this.icD.bNS()) {
            this.icD.bNS();
            icD(true);
            Jd();
            return;
        }
        if (z && this.ZhG && !this.icD.bNS() && !this.icD.qh()) {
            if (this.icD.kj() != null && this.icD.kj().yiw()) {
                if (this.cR || i == 1) {
                    com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
                    if (vGVar != null) {
                        setIsQuiet(vGVar.IP());
                    }
                    if ("ALP-AL00".equals(this.cRf)) {
                        this.icD.icD();
                    } else {
                        if (!so.icD().bNS()) {
                            dyT = true;
                        }
                        ((vG) this.icD).so(dyT);
                    }
                    pvs(false);
                    vG.InterfaceC0016vG interfaceC0016vG = this.gSd;
                    if (interfaceC0016vG != null) {
                        interfaceC0016vG.i_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.cR && this.icD.kj() == null) {
                if (!this.od.get()) {
                    this.od.set(true);
                }
                this.SE.set(false);
                uc();
                return;
            }
            return;
        }
        if (this.icD.kj() == null || !this.icD.kj().sUS()) {
            return;
        }
        this.icD.pvs();
        pvs(true);
        vG.InterfaceC0016vG interfaceC0016vG2 = this.gSd;
        if (interfaceC0016vG2 != null) {
            interfaceC0016vG2.h_();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar2;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar3;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar4;
        if (!"open_ad".equals(this.kj)) {
            this.ZhG = z;
            super.onWindowFocusChanged(z);
            Gp();
            if (dyT() && (vGVar4 = this.icD) != null && vGVar4.bNS()) {
                dX();
                Pj.pvs((View) this.yiw, 8);
                icD(true);
                Jd();
                return;
            }
            icD();
            if (jlb() || !so() || (vGVar2 = this.icD) == null || vGVar2.qh()) {
                if (so()) {
                    return;
                }
                if (!z && (vGVar = this.icD) != null && vGVar.kj() != null && this.icD.kj().sUS()) {
                    CvL();
                    pvs(false, rCZ.intValue());
                    return;
                } else {
                    if (z) {
                        this.gA.obtainMessage(1).sendToTarget();
                        return;
                    }
                    return;
                }
            }
            if (this.gA != null) {
                if (z && (vGVar3 = this.icD) != null && !vGVar3.bNS()) {
                    this.gA.obtainMessage(1).sendToTarget();
                    return;
                } else {
                    CvL();
                    pvs(false, rCZ.intValue());
                    return;
                }
            }
            return;
        }
        CvL();
    }

    private void CvL() {
        this.gA.removeMessages(1);
        Ju.vG().removeCallbacks(this.OhP);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar;
        cR cRVar;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar2;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar3;
        super.onWindowVisibilityChanged(i);
        Gp();
        if (this.jhZ) {
            this.jhZ = i == 0;
        }
        if (dyT() && (vGVar3 = this.icD) != null && vGVar3.bNS()) {
            dX();
            Pj.pvs((View) this.yiw, 8);
            icD(true);
            Jd();
            return;
        }
        icD();
        if (jlb() || !so() || (vGVar = this.icD) == null || vGVar.qh() || (cRVar = this.pvs) == null) {
            return;
        }
        if (this.CvL && cRVar.od() != null) {
            this.pvs.od();
            com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(this.pvs.LHy()).vG(), this.pvs);
            pvs2.icD(this.pvs.neB());
            pvs2.pvs(this.vA.getWidth());
            pvs2.icD(this.vA.getHeight());
            pvs2.vG(this.pvs.HWd());
            pvs2.pvs(this.Gp);
            pvs2.pvs(Mxy());
            pvs(pvs2);
            this.icD.pvs(pvs2);
            this.CvL = false;
            Pj.pvs((View) this.yiw, 8);
        } else {
            com.bytedance.sdk.component.utils.Ju.pvs("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
        }
        if (i != 0 || this.gA == null || (vGVar2 = this.icD) == null || vGVar2.bNS()) {
            return;
        }
        this.gA.obtainMessage(1).sendToTarget();
    }

    private void Gp() {
        boolean z = false;
        if (this.icD == null || jlb() || (ZhG() && !com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_is_update_flag", false))) {
            return;
        }
        long so = this.icD.so() + this.icD.sUS();
        long so2 = this.icD.so();
        long j = 0;
        if (ZhG()) {
            z = com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_native_video_complete", false);
            j = com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            so = com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_total_play_duration", this.icD.so() + this.icD.sUS());
            so2 = com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_duration", this.icD.so());
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.icD.vG(z);
            this.icD.pvs(j);
            this.icD.icD(so);
            this.icD.vG(so2);
        }
        com.bytedance.sdk.component.utils.Ju.pvs("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + z + ",position=" + j + ",totalPlayDuration=" + so + ",duration=" + so2);
    }

    public com.bykv.vk.openvk.component.video.api.Jd.vG getNativeVideoController() {
        return this.icD;
    }

    public boolean so() {
        return this.cR;
    }

    public void setIsAutoPlay(boolean z) {
        if (this.Pj) {
            return;
        }
        int icD2 = mnm.Jd().icD(this.pvs.yTz());
        if (z && icD2 != 4 && (!com.bytedance.sdk.component.utils.mnm.NB(this.mnm) ? !(!com.bytedance.sdk.component.utils.mnm.sUS(this.mnm) ? com.bytedance.sdk.component.utils.mnm.Jd(this.mnm) : ae() || gA()) : !ae())) {
            z = false;
        }
        this.cR = z;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar != null) {
            vGVar.Jd(z);
        }
        if (!this.cR) {
            yiw();
            RelativeLayout relativeLayout = this.yiw;
            if (relativeLayout != null) {
                Pj.pvs((View) relativeLayout, 0);
                cR cRVar = this.pvs;
                if (cRVar != null && cRVar.od() != null) {
                    com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.pvs.od().Wyp(), this.pvs.od().vG(), this.pvs.od().icD(), this.so, this.pvs);
                }
            }
        } else {
            Pj.pvs((View) this.yiw, 8);
        }
        this.Pj = true;
    }

    private boolean ae() {
        return 2 == mnm.Jd().icD(this.pvs.yTz());
    }

    private boolean gA() {
        return 5 == mnm.Jd().icD(this.pvs.yTz());
    }

    public boolean Mxy() {
        return this.Jd;
    }

    public void setIsQuiet(boolean z) {
        this.Jd = z;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar != null) {
            vGVar.icD(z);
        }
    }

    private boolean jlb() {
        return this.zM;
    }

    public void setVideoAdInteractionListener(vG.InterfaceC0016vG interfaceC0016vG) {
        this.gSd = interfaceC0016vG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.pvs
    public void sUS() {
        vG.InterfaceC0016vG interfaceC0016vG = this.gSd;
        if (interfaceC0016vG != null) {
            interfaceC0016vG.e_();
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.qh = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.pvs
    public void pvs(int i) {
        icD();
    }

    protected void vG() {
        if (kj()) {
            return;
        }
        IP();
    }

    protected void pvs(boolean z) {
        if (this.Mxy == null) {
            this.Mxy = new ImageView(getContext());
            if (so.icD().mnm() != null) {
                this.Mxy.setImageBitmap(so.icD().mnm());
            } else {
                this.Mxy.setImageResource(uc.Jd(mnm.pvs(), "tt_new_play_video"));
            }
            this.Mxy.setScaleType(ImageView.ScaleType.FIT_XY);
            int icD2 = Pj.icD(getContext(), this.Ju);
            int icD3 = Pj.icD(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(icD2, icD2);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = icD3;
            layoutParams.bottomMargin = icD3;
            this.vA.addView(this.Mxy, layoutParams);
            this.Mxy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NativeVideoTsView.this.IP();
                }
            });
        }
        if (z) {
            this.Mxy.setVisibility(0);
        } else {
            this.Mxy.setVisibility(8);
        }
    }

    public void icD(boolean z) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar != null) {
            vGVar.vG(z);
            com.bykv.vk.openvk.component.video.api.Jd.icD Ju = this.icD.Ju();
            if (Ju != null) {
                Ju.icD();
                View vG = Ju.vG();
                if (vG != null) {
                    if (vG.getParent() != null) {
                        ((ViewGroup) vG.getParent()).removeView(vG);
                    }
                    vG.setVisibility(0);
                    addView(vG);
                    Ju.pvs(this.pvs, new WeakReference<>(this.mnm), false);
                }
            }
        }
    }

    public void Wyp() {
        com.bykv.vk.openvk.component.video.api.Jd.icD Ju;
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar == null || (Ju = vGVar.Ju()) == null) {
            return;
        }
        Ju.pvs();
        View vG = Ju.vG();
        if (vG != null) {
            vG.setVisibility(8);
            if (vG.getParent() != null) {
                ((ViewGroup) vG.getParent()).removeView(vG);
            }
        }
    }

    private void dx() {
        Pj.NB(this.Mxy);
        Pj.NB(this.yiw);
    }

    public void setVideoCacheUrl(String str) {
        this.uc = str;
    }

    boolean qh() {
        return Gp.pvs(this, 50, vA.icD(this.kj) ? 1 : 5);
    }

    public boolean kj() {
        boolean z = false;
        if (com.bytedance.sdk.component.utils.mnm.vG(mnm.pvs()) == 0) {
            return false;
        }
        if (this.icD.kj() != null && this.icD.kj().sUS()) {
            pvs(false, rCZ.intValue());
            Handler handler = this.gA;
            z = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z;
    }

    public void Ju() {
        if (getNativeVideoController() == null || !(getNativeVideoController() instanceof vG)) {
            return;
        }
        vG vGVar = (vG) getNativeVideoController();
        vGVar.pvs(vGVar.Ju(), this);
    }

    public void IP() {
        if (com.bytedance.sdk.component.utils.mnm.vG(mnm.pvs()) != 0 && qh()) {
            if (this.icD.kj() != null && this.icD.kj().yiw()) {
                pvs(true, OT.intValue());
                icD();
                Handler handler = this.gA;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
                return;
            }
            if (so() || this.SE.get()) {
                return;
            }
            this.SE.set(true);
            dx();
            cR cRVar = this.pvs;
            if (cRVar != null && cRVar.od() != null) {
                dx();
                this.pvs.od();
                com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(this.pvs.LHy()).vG(), this.pvs);
                pvs2.icD(this.pvs.neB());
                pvs2.pvs(this.vA.getWidth());
                pvs2.icD(this.vA.getHeight());
                pvs2.vG(this.pvs.HWd());
                pvs2.pvs(this.Gp);
                pvs2.pvs(Mxy());
                pvs2.pvs(CacheDirFactory.getICacheDir(this.pvs.LHy()).vG());
                pvs(pvs2);
                this.icD.pvs(pvs2);
            }
            Handler handler2 = this.gA;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            pvs(false);
        }
    }

    public double getCurrentPlayTime() {
        return this.icD != null ? (r0.NB() * 1.0d) / 1000.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public void bNS() {
        cR cRVar = this.pvs;
        if (cRVar == null || cRVar.ig() == null) {
            return;
        }
        this.pvs.ig().bNS();
        this.pvs.ig().pvs().NB(this.Gp);
    }

    public sUS pvs(List<Pair<View, FriendlyObstructionPurpose>> list) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.icD;
        if (vGVar instanceof vG) {
            return ((vG) vGVar).pvs(this, list);
        }
        return null;
    }

    private void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        try {
            if (this.pvs.CSZ()) {
                vGVar.pvs(this.ny);
            }
        } catch (Throwable unused) {
        }
    }
}
