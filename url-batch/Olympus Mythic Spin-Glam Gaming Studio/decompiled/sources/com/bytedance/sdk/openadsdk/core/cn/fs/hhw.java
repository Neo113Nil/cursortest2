package com.bytedance.sdk.openadsdk.core.cn.fs;

import android.annotation.SuppressLint;
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
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.cn.fs.zn;
import com.bytedance.sdk.openadsdk.core.hgd;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.bytedance.sdk.openadsdk.fb.nps;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class hhw extends com.bytedance.sdk.openadsdk.core.hhw.zn implements zn.zmn, kjb.zmn, zn.zmn {
    private static final Integer doe = 0;
    private static final Integer nqi = 1;
    private long am;
    private boolean bjh;
    public boolean btk;
    protected ImageView bvs;
    protected boolean cn;
    public fs cyb;
    private final ViewTreeObserver.OnScrollChangedListener dgt;
    private boolean ev;
    protected boolean fb;
    private boolean fkt;
    protected zn fs;
    private final String hgd;
    public nps hhw;
    private boolean iqz;
    protected ImageView iv;
    private final AtomicBoolean jy;
    private ViewGroup kgc;
    private boolean kjb;
    protected String klz;
    private boolean kw;
    protected int mw;
    protected RelativeLayout nps;
    private View nu;
    private final Context olo;
    private ViewTreeObserver.OnGlobalLayoutListener oub;
    private String phc;
    protected boolean rc;
    private boolean rp;
    boolean rt;
    private final Handler so;
    private long tf;
    private String uqh;
    private final Runnable vlj;
    private zn.InterfaceC0102zn ww;
    private final boolean yj;
    private final AtomicBoolean yof;
    private boolean zak;
    protected ImageView zg;
    protected final nqi zmn;
    protected FrameLayout zn;

    public interface fs {
        void zmn(boolean z, long j, long j2, long j3, boolean z2);
    }

    public interface zmn {
        void zmn(View view, int i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
    public void fs(long j, int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
    public void zmn() {
    }

    public void setAdCreativeClickListener(zmn zmnVar) {
        zn znVar = this.fs;
        if (znVar != null) {
            znVar.zmn(zmnVar);
        }
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.cn.fs.fs fsVar) {
        zn znVar = this.fs;
        if (znVar != null) {
            znVar.zmn(fsVar);
        }
    }

    public void setControllerStatusCallBack(fs fsVar) {
        this.cyb = fsVar;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
    public void zmn(long j, int i) {
        zn.InterfaceC0102zn interfaceC0102zn = this.ww;
        if (interfaceC0102zn != null) {
            interfaceC0102zn.j_();
        }
    }

    private void fb() {
        zmn(0L, 0);
        this.ww = null;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
    public void zmn(long j, long j2) {
        zn.InterfaceC0102zn interfaceC0102zn = this.ww;
        if (interfaceC0102zn != null) {
            interfaceC0102zn.zmn(j, j2);
        }
    }

    public hhw(@NonNull Context context, @NonNull nqi nqiVar, boolean z, nps npsVar) {
        this(context, nqiVar, z, "embeded_ad", false, false, npsVar);
    }

    public hhw(@NonNull Context context, @NonNull nqi nqiVar, String str, boolean z, boolean z2, nps npsVar) {
        this(context, nqiVar, false, str, z, z2, npsVar);
    }

    public hhw(@NonNull Context context, @NonNull nqi nqiVar, nps npsVar) {
        this(context, nqiVar, false, npsVar);
    }

    public hhw(@NonNull Context context, @NonNull nqi nqiVar, boolean z, String str, boolean z2, boolean z3, nps npsVar) {
        super(context);
        this.kw = true;
        this.fb = true;
        this.iqz = false;
        this.btk = false;
        this.bjh = true;
        this.rp = false;
        this.kjb = true;
        this.rc = true;
        this.klz = "embeded_ad";
        this.mw = 50;
        this.zak = true;
        this.yj = false;
        this.so = new kjb(cn.fs().getLooper(), this);
        this.fkt = false;
        this.hgd = Build.MODEL;
        this.rt = false;
        this.cn = true;
        this.jy = new AtomicBoolean(false);
        this.vlj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.hhw.4
            @Override // java.lang.Runnable
            public void run() {
                hhw hhwVar = hhw.this;
                hhwVar.zmn(hhwVar.ev, hhw.doe.intValue());
            }
        };
        this.yof = new AtomicBoolean(false);
        this.dgt = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.hhw.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                hhw.this.kgc();
            }
        };
        try {
            if (nqiVar.av()) {
                this.uqh = CacheDirFactory.getICacheDir(0).fs();
            }
        } catch (Throwable unused) {
        }
        if (npsVar != null) {
            this.hhw = npsVar;
        }
        this.klz = str;
        this.olo = context;
        this.zmn = nqiVar;
        this.iqz = z;
        setContentDescription("NativeVideoTsView");
        this.rp = z2;
        this.kjb = z3;
        fs();
        btk();
    }

    protected void fs() {
        nqi nqiVar = this.zmn;
        if (nqiVar == null) {
            return;
        }
        int qvo = nqiVar.qvo();
        int fs2 = kgc.fb().fs(qvo);
        int zn = com.bytedance.sdk.component.utils.kgc.zn(kgc.zmn());
        if (fs2 == 1) {
            this.kw = oub.fb(zn);
        } else if (fs2 == 2) {
            this.kw = oub.btk(zn) || oub.fb(zn) || oub.hhw(zn);
        } else if (fs2 == 3) {
            this.kw = false;
        } else if (fs2 == 4) {
            this.rt = true;
        } else if (fs2 == 5) {
            this.kw = oub.fb(zn) || oub.hhw(zn);
        }
        if (!this.iqz) {
            if (!this.btk || !com.bytedance.sdk.openadsdk.core.iv.kjb.fs(this.klz)) {
                this.fb = kgc.fb().zn(String.valueOf(qvo));
            }
        } else {
            this.fb = false;
        }
        if ("open_ad".equals(this.klz)) {
            this.kw = true;
            this.fb = true;
        }
        if (com.bytedance.sdk.openadsdk.core.iv.kjb.fs(this.klz)) {
            this.fb = true;
        }
        zn znVar = this.fs;
        if (znVar != null) {
            znVar.fb(this.kw);
        }
        this.btk = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fs fsVar;
        zn znVar;
        if (!this.iqz && (fsVar = this.cyb) != null && (znVar = this.fs) != null) {
            fsVar.zmn(znVar.mw(), this.fs.bvs(), this.fs.ev(), this.fs.hhw(), this.kw);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private View zmn(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.kgc = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.zn = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.nu = view;
        return frameLayout;
    }

    private RelativeLayout fs(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar = new com.bytedance.sdk.openadsdk.core.hhw.nps(context);
        npsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        npsVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        fbVar.setLayoutParams(layoutParams);
        fbVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.zg = fbVar;
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        fbVar2.setLayoutParams(layoutParams2);
        fbVar2.setVisibility(8);
        fbVar2.setBackground(doe.zn(context, "tt_new_play_video"));
        this.iv = fbVar2;
        npsVar.addView(fbVar);
        npsVar.addView(fbVar2);
        return npsVar;
    }

    private void btk() {
        addView(zmn(this.olo));
        kw();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.hhw.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                hhw.this.kgc();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                hhw.this.kgc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgc() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.so;
        if (handler == null || elapsedRealtime - this.tf <= 500) {
            return;
        }
        this.tf = elapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        zn znVar = this.fs;
        if (znVar != null) {
            znVar.zmn(pAGNativeAd);
        }
    }

    public void nps() {
        View view;
        if (this.olo == null || (view = this.nu) == null || view.getParent() == null || this.zmn == null || this.nps != null) {
            return;
        }
        ViewParent parent = this.nu.getParent();
        RelativeLayout fs2 = fs(this.olo);
        if (parent != null && (parent instanceof ViewGroup)) {
            zmn(fs2, (ViewGroup) parent, this.nu);
        }
        this.nps = fs2;
        if (this.rc) {
            jy.zmn((View) this.iv, 0);
        }
        if (this.zmn.mrt() != null && this.zmn.mrt().iv() != null) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.zmn.mrt().iv(), this.zmn.mrt().zn(), this.zmn.mrt().fs(), this.zg, this.zmn);
        }
        ImageView imageView = this.iv;
        if (imageView != null) {
            imageView.setClickable(true);
            this.iv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.hhw.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/hhw$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_hhw$2_onClick_cbdc0bb188879262aebcc7f045ace1be(view2);
                }

                public void safedk_hhw$2_onClick_cbdc0bb188879262aebcc7f045ace1be(View p0) {
                    hhw.this.zn();
                }
            });
        }
    }

    private void zmn(View view, ViewGroup viewGroup, View view2) {
        int indexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    private void kw() {
        this.fs = new zn(this.olo, this.zn, this.zmn, this.klz, !ev(), this.rp, this.kjb, this.hhw);
        iqz();
        if (this.oub == null) {
            this.oub = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.hhw.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    hhw hhwVar;
                    zn znVar;
                    if (hhw.this.kgc == null || hhw.this.kgc.getViewTreeObserver() == null || (znVar = (hhwVar = hhw.this).fs) == null) {
                        return;
                    }
                    znVar.zmn(hhwVar.kgc.getWidth(), hhw.this.kgc.getHeight());
                    hhw.this.kgc.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    hhw.this.oub = null;
                }
            };
            this.kgc.getViewTreeObserver().addOnGlobalLayoutListener(this.oub);
        }
    }

    public void setVideoAdLoadListener(zn.fb fbVar) {
        zn znVar = this.fs;
        if (znVar != null) {
            znVar.zmn(fbVar);
        }
    }

    public boolean zmn(long j, boolean z, boolean z2) {
        boolean z3 = false;
        this.kgc.setVisibility(0);
        this.am = j;
        if (!ev()) {
            return true;
        }
        this.fs.zmn(false);
        nqi nqiVar = this.zmn;
        if (nqiVar != null && nqiVar.mrt() != null) {
            com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn2 = nqi.zmn(CacheDirFactory.getICacheDir(this.zmn.hqs()).zn(), this.zmn);
            zmn2.fs(this.zmn.ji());
            zmn2.fs(this.kgc.getWidth());
            zmn2.zn(this.kgc.getHeight());
            zmn2.zn(this.zmn.ze());
            zmn2.zmn(j);
            zmn2.zmn(bvs());
            zmn(zmn2);
            if (z2) {
                this.fs.fs(zmn2);
                return true;
            }
            z3 = this.fs.zmn(zmn2);
        }
        if (((j > 0 && !z && !z2) || (j > 0 && z)) && this.fs != null) {
            cn.zmn zmnVar = new cn.zmn();
            zmnVar.fs(this.fs.hhw());
            zmnVar.fb(this.fs.bvs());
            zmnVar.zn(this.fs.nps());
            com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.fs(this.fs.klz(), zmnVar);
        }
        return z3;
    }

    private void iqz() {
        zn znVar = this.fs;
        if (znVar == null) {
            return;
        }
        znVar.fb(this.kw);
        this.fs.zmn((zn.zmn) this);
        this.fs.zmn((zn.zmn) this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        phc();
        if (this.cn) {
            getViewTreeObserver().addOnScrollChangedListener(this.dgt);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        phc();
    }

    private void phc() {
        zn znVar = this.fs;
        if (znVar == null) {
            kw();
        } else if (znVar != null && !ev()) {
            this.fs.cyb();
        }
        if (this.fs == null || !this.jy.get()) {
            return;
        }
        this.jy.set(false);
        fs();
        if (zg()) {
            jy.zmn((View) this.nps, 8);
            ImageView imageView = this.bvs;
            if (imageView != null) {
                jy.zmn((View) imageView, 8);
            }
            nqi nqiVar = this.zmn;
            if (nqiVar == null || nqiVar.mrt() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn2 = nqi.zmn(CacheDirFactory.getICacheDir(this.zmn.hqs()).zn(), this.zmn);
            zmn2.fs(this.zmn.ji());
            zmn2.fs(this.kgc.getWidth());
            zmn2.zn(this.kgc.getHeight());
            zmn2.zn(this.zmn.ze());
            zmn2.zmn(0L);
            zmn2.zmn(bvs());
            zmn(zmn2);
            this.fs.zmn(zmn2);
            this.fs.fs(false);
            return;
        }
        if (this.fs.mw()) {
            this.fs.mw();
            fs(true);
        } else {
            nps();
            jy.zmn((View) this.nps, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        doe();
        if (this.cn) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.dgt);
            }
            ViewGroup viewGroup = this.kgc;
            if (viewGroup == null || this.oub == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.oub);
                this.oub = null;
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        doe();
    }

    private void doe() {
        this.cyb = null;
        if (this.fs != null && !ev()) {
            this.fs.fkt();
        }
        rc();
        zmn(false);
        nqi();
    }

    private void nqi() {
        if (!this.jy.get()) {
            this.jy.set(true);
            zn znVar = this.fs;
            if (znVar != null) {
                znVar.zmn(true, 3);
            }
        }
        this.yof.set(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            nqi();
        }
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        if (message.what == 1) {
            uqh();
        }
    }

    private void uqh() {
        this.ev = klz();
        nu.zmn(this.vlj);
    }

    private boolean bjh() {
        nqi nqiVar = this.zmn;
        if (nqiVar == null) {
            return false;
        }
        return nqiVar.ybo();
    }

    private boolean rp() {
        if (ev() || !bjh()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void kjb() {
        if (ev() || !bjh()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(boolean z, int i) {
        if (this.zmn == null || this.fs == null) {
            return;
        }
        boolean rp = rp();
        kjb();
        if (rp && this.fs.mw()) {
            this.fs.mw();
            fs(true);
            fb();
            return;
        }
        if (z && this.bjh && !this.fs.mw() && !this.fs.nqi()) {
            if (this.fs.rc() != null && this.fs.rc().nps()) {
                if (this.kw || i == 1) {
                    zn znVar = this.fs;
                    if (znVar != null) {
                        zmn(znVar.uqh(), "changeVideoStatus");
                    }
                    if ("ALP-AL00".equals(this.hgd)) {
                        this.fs.zn();
                    } else {
                        if (!iv.fs().rt()) {
                            rp = true;
                        }
                        this.fs.nps(rp);
                    }
                    zmn(false);
                    zn.InterfaceC0102zn interfaceC0102zn = this.ww;
                    if (interfaceC0102zn != null) {
                        interfaceC0102zn.i_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.kw && this.fs.rc() == null) {
                if (!this.jy.get()) {
                    this.jy.set(true);
                }
                this.yof.set(false);
                phc();
                return;
            }
            return;
        }
        if (this.fs.rc() == null || !this.fs.rc().hhw()) {
            return;
        }
        this.fs.fs();
        zmn(true);
        zn.InterfaceC0102zn interfaceC0102zn2 = this.ww;
        if (interfaceC0102zn2 != null) {
            interfaceC0102zn2.h_();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        zn znVar;
        zn znVar2;
        zn znVar3;
        zn znVar4;
        if (!"open_ad".equals(this.klz)) {
            this.bjh = z;
            super.onWindowFocusChanged(z);
            com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(this.zmn, z);
            am();
            if (this.cn) {
                if (rp() && (znVar4 = this.fs) != null && znVar4.mw()) {
                    kjb();
                    jy.zmn((View) this.nps, 8);
                    fs(true);
                    fb();
                    return;
                }
                fs();
                if (ev() || !zg() || (znVar2 = this.fs) == null || znVar2.nqi()) {
                    if (zg()) {
                        return;
                    }
                    if (!z && (znVar = this.fs) != null && znVar.rc() != null && this.fs.rc().hhw()) {
                        zak();
                        zmn(false, doe.intValue());
                        return;
                    } else {
                        if (z) {
                            this.so.obtainMessage(1).sendToTarget();
                            return;
                        }
                        return;
                    }
                }
                if (this.so != null) {
                    if (z && (znVar3 = this.fs) != null && !znVar3.mw()) {
                        this.so.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        zak();
                        zmn(false, doe.intValue());
                        return;
                    }
                }
                return;
            }
            return;
        }
        zak();
    }

    private void zak() {
        this.so.removeMessages(1);
        com.bytedance.sdk.openadsdk.core.cn.zn().removeCallbacks(this.vlj);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        zn znVar;
        nqi nqiVar;
        zn znVar2;
        zn znVar3;
        super.onWindowVisibilityChanged(i);
        am();
        if (rp() && (znVar3 = this.fs) != null && znVar3.mw()) {
            kjb();
            jy.zmn((View) this.nps, 8);
            fs(true);
            fb();
            return;
        }
        fs();
        if (ev() || !zg() || (znVar = this.fs) == null || znVar.nqi() || (nqiVar = this.zmn) == null) {
            return;
        }
        if (this.zak && nqiVar.mrt() != null) {
            this.zmn.mrt();
            com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn2 = nqi.zmn(CacheDirFactory.getICacheDir(this.zmn.hqs()).zn(), this.zmn);
            zmn2.fs(this.zmn.ji());
            zmn2.fs(this.kgc.getWidth());
            zmn2.zn(this.kgc.getHeight());
            zmn2.zn(this.zmn.ze());
            zmn2.zmn(this.am);
            zmn2.zmn(bvs());
            zmn(zmn2);
            this.fs.zmn(zmn2);
            this.zak = false;
            jy.zmn((View) this.nps, 8);
        }
        if (i != 0 || !this.cn || this.so == null || (znVar2 = this.fs) == null || znVar2.mw()) {
            return;
        }
        this.so.obtainMessage(1).sendToTarget();
    }

    private void am() {
        if (this.fs == null || ev()) {
            return;
        }
        if ((!bjh() || com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_is_update_flag", false)) && bjh()) {
            long bvs = this.fs.bvs();
            long nps = this.fs.nps() + bvs;
            boolean zmn2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_native_video_complete", false);
            long zmn3 = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long zmn4 = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_total_play_duration", nps);
            long zmn5 = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_duration", bvs);
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.fs.fs(zmn2);
            this.fs.fs(zmn3);
            this.fs.zn(zmn4);
            this.fs.fb(zmn5);
        }
    }

    public zn getNativeVideoController() {
        return this.fs;
    }

    public boolean zg() {
        return this.kw;
    }

    public void setIsAutoPlay(boolean z) {
        if (this.fkt) {
            return;
        }
        int fs2 = kgc.fb().fs(this.zmn.qvo());
        if (z && fs2 != 4 && (!com.bytedance.sdk.component.utils.kgc.btk(this.olo) ? !(!com.bytedance.sdk.component.utils.kgc.hhw(this.olo) ? com.bytedance.sdk.component.utils.kgc.fb(this.olo) : yj() || so()) : !yj())) {
            z = false;
        }
        this.kw = z;
        zn znVar = this.fs;
        if (znVar != null) {
            znVar.fb(z);
        }
        if (!this.kw) {
            nps();
            RelativeLayout relativeLayout = this.nps;
            if (relativeLayout != null) {
                jy.zmn((View) relativeLayout, 0);
                nqi nqiVar = this.zmn;
                if (nqiVar != null && nqiVar.mrt() != null) {
                    com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.zmn.mrt().iv(), this.zmn.mrt().zn(), this.zmn.mrt().fs(), this.zg, this.zmn);
                }
            }
        } else {
            jy.zmn((View) this.nps, 8);
        }
        this.fkt = true;
    }

    private boolean yj() {
        return 2 == kgc.fb().fs(this.zmn.qvo());
    }

    private boolean so() {
        return 5 == kgc.fb().fs(this.zmn.qvo());
    }

    public boolean bvs() {
        return this.fb;
    }

    public void zmn(boolean z, String str) {
        if (com.bytedance.sdk.openadsdk.core.iv.kjb.fs(this.klz)) {
            z = true;
        }
        this.fb = z;
        zn znVar = this.fs;
        if (znVar != null) {
            znVar.zmn(z, str);
        }
    }

    private boolean ev() {
        return this.iqz;
    }

    public void setVideoAdInteractionListener(zn.InterfaceC0102zn interfaceC0102zn) {
        this.ww = interfaceC0102zn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.zn.zmn
    public void hhw() {
        zn.InterfaceC0102zn interfaceC0102zn = this.ww;
        if (interfaceC0102zn != null) {
            interfaceC0102zn.g_();
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.rc = z;
    }

    public void setNeedSelfManagerVideo(boolean z) {
        this.cn = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.zn.zmn
    public void zmn(int i) {
        fs();
    }

    protected void zn() {
        if (mw()) {
            return;
        }
        cn();
    }

    protected void zmn(boolean z) {
        if (this.bvs == null) {
            ImageView imageView = new ImageView(getContext());
            this.bvs = imageView;
            imageView.setImageResource(doe.fb(kgc.zmn(), "tt_new_play_video"));
            this.bvs.setScaleType(ImageView.ScaleType.FIT_XY);
            int fs2 = jy.fs(getContext(), this.mw);
            int fs3 = jy.fs(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fs2, fs2);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = fs3;
            layoutParams.bottomMargin = fs3;
            this.kgc.addView(this.bvs, layoutParams);
            this.bvs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.hhw.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/hhw$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_hhw$5_onClick_23d711d6d34620c6bffae8c2d1882434(view);
                }

                public void safedk_hhw$5_onClick_23d711d6d34620c6bffae8c2d1882434(View p0) {
                    hhw.this.cn();
                }
            });
        }
        if (z) {
            this.bvs.setVisibility(0);
        } else {
            this.bvs.setVisibility(8);
        }
    }

    public void fs(boolean z) {
        zn znVar = this.fs;
        if (znVar != null) {
            znVar.fs(z);
            btk klz = this.fs.klz();
            if (klz != null) {
                klz.fs();
                View zn = klz.zn();
                if (zn != null) {
                    if (zn.getParent() != null) {
                        ((ViewGroup) zn.getParent()).removeView(zn);
                    }
                    zn.setVisibility(0);
                    addView(zn);
                    klz.zmn((btk) this.zmn, new WeakReference<>(this.olo), false);
                }
            }
        }
    }

    public void iv() {
        zn znVar = this.fs;
        if (znVar != null) {
            btk klz = znVar.klz();
            if (klz != null) {
                klz.zmn();
            }
            tf();
        }
    }

    public void rc() {
        btk klz;
        zn znVar = this.fs;
        if (znVar == null || (klz = znVar.klz()) == null) {
            return;
        }
        klz.zmn();
        View zn = klz.zn();
        if (zn != null) {
            zn.setVisibility(8);
            if (zn.getParent() != null) {
                ((ViewGroup) zn.getParent()).removeView(zn);
            }
        }
    }

    private void tf() {
        jy.btk(this.bvs);
        jy.btk(this.nps);
    }

    public void setVideoCacheUrl(String str) {
        this.phc = str;
    }

    boolean klz() {
        return hgd.zmn(this, 50, com.bytedance.sdk.openadsdk.core.iv.kjb.fs(this.klz) ? 1 : 5, false);
    }

    public boolean mw() {
        boolean z = false;
        if (com.bytedance.sdk.component.utils.kgc.zn(kgc.zmn()) == 0) {
            return false;
        }
        if (this.fs.rc() != null && this.fs.rc().hhw()) {
            zmn(false, doe.intValue());
            Handler handler = this.so;
            z = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z;
    }

    public void rt() {
        if (getNativeVideoController() == null || getNativeVideoController() == null) {
            return;
        }
        zn nativeVideoController = getNativeVideoController();
        nativeVideoController.zmn(nativeVideoController.klz(), this);
    }

    public void cn() {
        if (com.bytedance.sdk.component.utils.kgc.zn(kgc.zmn()) != 0 && klz()) {
            if (this.fs.rc() != null) {
                if (this.fs.rc().nps()) {
                    zmn(true, nqi.intValue());
                    fs();
                    Handler handler = this.so;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.fs.rc().fs() && !this.cn) {
                    iv();
                    if (this.fs != null) {
                        this.fs.nu();
                        return;
                    }
                    return;
                }
            }
            if (zg() || this.yof.get()) {
                return;
            }
            this.yof.set(true);
            tf();
            nqi nqiVar = this.zmn;
            if (nqiVar != null && nqiVar.mrt() != null) {
                tf();
                this.zmn.mrt();
                com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn2 = nqi.zmn(CacheDirFactory.getICacheDir(this.zmn.hqs()).zn(), this.zmn);
                zmn2.fs(this.zmn.ji());
                zmn2.fs(this.kgc.getWidth());
                zmn2.zn(this.kgc.getHeight());
                zmn2.zn(this.zmn.ze());
                zmn2.zmn(this.am);
                zmn2.zmn(bvs());
                zmn2.zmn(CacheDirFactory.getICacheDir(this.zmn.hqs()).zn());
                zmn(zmn2);
                this.fs.zmn(zmn2);
            }
            Handler handler2 = this.so;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            zmn(false);
        }
    }

    public double getCurrentPlayTime() {
        if (this.fs != null) {
            return (r0.hhw() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public void cyb() {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn2;
        nqi nqiVar = this.zmn;
        if (nqiVar == null || (exj = nqiVar.exj()) == null || (zmn2 = exj.zmn()) == null) {
            return;
        }
        zmn2.btk(this.am);
    }

    public com.bytedance.sdk.openadsdk.core.rt.hhw zmn(List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (this.fs != null) {
            return this.fs.zmn(this, list);
        }
        return null;
    }

    private void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        try {
            if (this.zmn.av()) {
                znVar.zmn(this.uqh);
            }
        } catch (Throwable unused) {
        }
    }
}
