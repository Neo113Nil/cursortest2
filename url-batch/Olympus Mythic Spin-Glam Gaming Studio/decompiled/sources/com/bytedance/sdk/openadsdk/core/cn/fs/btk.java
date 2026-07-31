package com.bytedance.sdk.openadsdk.core.cn.fs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.cn.fs.hhw;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.core.widget.iqz;
import com.bytedance.sdk.openadsdk.core.widget.kw;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.bytedance.sdk.openadsdk.core.zn.zmn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public class btk implements com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs<nqi>, com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zmn, kjb.zmn, iqz.fs, kw.zmn, zmn.InterfaceC0185zmn {
    com.bytedance.sdk.openadsdk.core.zn.zmn am;
    zmn bjh;
    ImageView btk;
    View bvs;
    int cn;
    int cyb;
    nqi doe;
    private hhw.zmn ev;
    com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs fb;
    private final String fkt;
    protected final int fs;
    View hhw;
    int iqz;
    View iv;
    boolean kgc;
    com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn kjb;
    View klz;
    boolean kw;
    TextView mw;
    View nps;
    Context nqi;
    int olo;
    int phc;
    ImageView rc;
    boolean rp;
    int rt;
    boolean so;
    private long tf;
    iqz uqh;
    com.bytedance.sdk.openadsdk.core.zn.zmn yj;
    com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn zak;
    ImageView zg;
    protected final int zmn;
    ViewGroup zn;

    public void btk() {
    }

    public void fs(@Nullable ViewGroup viewGroup) {
    }

    public void fs(boolean z) {
    }

    public boolean fs(int i) {
        return false;
    }

    public void hhw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.iqz.fs
    public boolean iv() {
        return false;
    }

    public void zmn(int i) {
    }

    public void zmn(long j) {
    }

    public void zmn(long j, long j2) {
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.kw.zmn
    public void zmn(View view, boolean z) {
    }

    public void zmn(@Nullable ViewGroup viewGroup) {
    }

    public void zmn(String str) {
    }

    public void zn(boolean z) {
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void zmn(nqi nqiVar, WeakReference weakReference, boolean z) {
        zmn2(nqiVar, (WeakReference<Context>) weakReference, z);
    }

    public btk(Context context, ViewGroup viewGroup, boolean z, int i, nqi nqiVar, com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar, boolean z2) {
        this.zmn = 228;
        this.fs = 160;
        this.kgc = true;
        this.rp = true;
        this.so = true;
        this.fkt = Build.MODEL;
        if (this instanceof fb) {
            return;
        }
        this.nqi = kgc.zmn().getApplicationContext();
        fb(z2);
        this.zn = viewGroup;
        this.kgc = z;
        this.phc = i;
        this.zak = znVar;
        this.doe = nqiVar;
        fb(8);
        zmn(context, this.zn);
        fb();
        klz();
    }

    public btk(Context context, ViewGroup viewGroup, boolean z, int i, nqi nqiVar, com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar) {
        this(context, viewGroup, z, i, nqiVar, znVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void klz() {
        String str;
        int i;
        String str2;
        int i2;
        com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar;
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar;
        String str3 = this.rp ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.doe.bv()) {
            str2 = "rewarded_video";
            i2 = 7;
        } else if (this.doe.ul()) {
            str2 = "fullscreen_interstitial_ad";
            i2 = 5;
        } else if (this.doe.ulq()) {
            str2 = "banner_ad";
            i2 = 2;
        } else {
            str = str3;
            i = 1;
            if (this.doe.va() == 4) {
                this.kjb = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.nqi, str);
            }
            com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.core.zn.zmn(this.nqi, this.doe, str, i);
            this.am = zmnVar2;
            zmnVar2.zmn(this);
            this.am.fs(true);
            if (!this.rp) {
                this.am.zmn(true);
            } else {
                this.am.zmn(false);
                this.am.zn(true);
            }
            this.am.zmn(this.zak);
            this.am.btk(true);
            this.am.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.btk.1
                @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
                public void zmn(View view, int i3) {
                    if (btk.this.ev != null) {
                        btk.this.ev.zmn(view, i3);
                    }
                }
            });
            znVar = this.kjb;
            if (znVar != null && (zmnVar = this.am) != null) {
                zmnVar.zmn(znVar);
            }
            if (bjh()) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.core.zn.zmn(this.nqi, this.doe, str, i) { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.btk.2
                @Override // com.bytedance.sdk.openadsdk.core.zn.zmn
                public boolean fs() {
                    iqz iqzVar = btk.this.uqh;
                    boolean zmn = iqzVar != null ? iqzVar.zmn() : false;
                    btk.this.btk.getVisibility();
                    return zmn || btk.this.btk.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.zn.zmn
                public boolean zn() {
                    View view = btk.this.iv;
                    if (view != null && view.getVisibility() == 0) {
                        return true;
                    }
                    View view2 = btk.this.klz;
                    return view2 != null && view2.getVisibility() == 0;
                }
            };
            this.yj = zmnVar3;
            zmnVar3.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.btk.3
                @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
                public void zmn(View view, int i3) {
                    if (btk.this.ev != null) {
                        btk.this.ev.zmn(view, i3);
                    }
                }
            });
            this.yj.fs(true);
            this.yj.zmn(this.rp);
            this.yj.zmn(this.zak);
            this.yj.btk(true);
            com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar2 = this.kjb;
            if (znVar2 != null) {
                this.yj.zmn(znVar2);
            }
            this.yj.zmn(this);
            return;
        }
        str = str2;
        i = i2;
        if (this.doe.va() == 4) {
        }
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar22 = new com.bytedance.sdk.openadsdk.core.zn.zmn(this.nqi, this.doe, str, i);
        this.am = zmnVar22;
        zmnVar22.zmn(this);
        this.am.fs(true);
        if (!this.rp) {
        }
        this.am.zmn(this.zak);
        this.am.btk(true);
        this.am.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.btk.1
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i3) {
                if (btk.this.ev != null) {
                    btk.this.ev.zmn(view, i3);
                }
            }
        });
        znVar = this.kjb;
        if (znVar != null) {
            zmnVar.zmn(znVar);
        }
        if (bjh()) {
        }
    }

    private boolean bjh() {
        return nqi.btk(this.doe) && (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.doe.skn()) ? this.doe.ouf() == null : this.doe.rsi() == null) && this.doe.mpi() == 1;
    }

    public void zmn(hhw.zmn zmnVar) {
        this.ev = zmnVar;
    }

    public void zmn(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = this.am;
        if (zmnVar != null) {
            zmnVar.zmn(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar2 = this.yj;
        if (zmnVar2 != null) {
            zmnVar2.zmn(pAGNativeAd);
        }
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs mw() {
        return this.fb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fb] */
    void zmn(Context context, View view) {
        com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zn znVar;
        System.currentTimeMillis();
        nqi nqiVar = this.doe;
        if ((nqiVar == null || ((!nqiVar.ymf() && !this.doe.ulq()) || rc.fs().ouf())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar2 = this.zak;
        if (znVar2 != null && znVar2.cn()) {
            znVar = new com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fb(this.nqi);
        } else {
            znVar = new com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zn(this.nqi);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(znVar, 0, layoutParams);
        }
        jy.zmn((View) znVar, 8);
        this.fb = znVar;
        this.btk = (ImageView) view.findViewById(olo.gt);
        this.hhw = view.findViewById(olo.sl);
        this.nps = view.findViewById(olo.pf);
        this.zg = (ImageView) view.findViewById(olo.db);
        this.bvs = view.findViewById(olo.ao);
        System.currentTimeMillis();
    }

    void zmn(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.bvs) == null || view2.getParent() == null || this.iv != null) {
            return;
        }
        this.iv = this.bvs;
        this.rc = (ImageView) view.findViewById(olo.hz);
        this.klz = view.findViewById(olo.vgx);
        this.mw = (TextView) view.findViewById(olo.cud);
    }

    void rt() {
        if (this.bjh == null || this.uqh != null) {
            return;
        }
        System.currentTimeMillis();
        iqz iqzVar = new iqz();
        this.uqh = iqzVar;
        iqzVar.zmn(this.nqi, this.zn);
        this.uqh.zmn(this.bjh, this);
        System.currentTimeMillis();
    }

    public boolean zmn(int i, com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar, boolean z) {
        iqz iqzVar = this.uqh;
        return iqzVar == null || iqzVar.zmn(i, fsVar, z);
    }

    public void cn() {
        iqz iqzVar = this.uqh;
        if (iqzVar != null) {
            iqzVar.zmn(false);
        }
    }

    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn zmnVar) {
        if (zmnVar instanceof zmn) {
            this.bjh = (zmn) zmnVar;
            rt();
        }
    }

    boolean cyb() {
        return this.bjh != null;
    }

    void fb() {
        this.fb.zmn(this);
        this.btk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.btk.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/btk$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_btk$4_onClick_fff6ab03eec0da1a669731321560c09e(view);
            }

            public void safedk_btk$4_onClick_fff6ab03eec0da1a669731321560c09e(View p0) {
                if (btk.this.cyb()) {
                    TextView textView = btk.this.mw;
                    if (textView == null || textView.getVisibility() != 0) {
                        btk btkVar = btk.this;
                        btkVar.bjh.zmn(btkVar, p0);
                    }
                }
            }
        });
    }

    public void zn(int i) {
        jy.zmn((View) this.zn, 0);
        com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.setVisibility(i);
        }
    }

    public void fb(boolean z) {
        this.rp = z;
        if (z) {
            com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = this.am;
            if (zmnVar != null) {
                zmnVar.zmn(true);
            }
            com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar2 = this.yj;
            if (zmnVar2 != null) {
                zmnVar2.zmn(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar3 = this.am;
        if (zmnVar3 != null) {
            zmnVar3.zmn(false);
        }
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar4 = this.yj;
        if (zmnVar4 != null) {
            zmnVar4.zmn(false);
        }
    }

    public void zmn(int i, int i2) {
        if (i == -1) {
            i = jy.zn(this.nqi);
        }
        if (i <= 0) {
            return;
        }
        this.rt = i;
        if (phc() || iv() || (this.phc & 8) == 8) {
            this.cn = i2;
        } else {
            this.cn = btk(i);
        }
        fs(this.rt, this.cn);
    }

    public void fs(boolean z, boolean z2) {
        ImageView imageView = this.btk;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(this.nqi, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(this.nqi, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void fs(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.zn.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.zn.setLayoutParams(layoutParams);
    }

    private int btk(int i) {
        if (this.cyb <= 0 || this.olo <= 0) {
            return 0;
        }
        int fs = jy.fs(this.nqi, 228.0f);
        int fs2 = jy.fs(this.nqi, 160.0f);
        int i2 = (int) (this.olo * ((i * 1.0f) / this.cyb));
        return i2 > fs ? fs : i2 < fs2 ? fs2 : i2;
    }

    public void zn(int i, int i2) {
        this.cyb = i;
        this.olo = i2;
    }

    public void zn(@Nullable ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.zn.getParent() == null) {
            viewGroup.addView(this.zn);
        }
        fb(0);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs
    public View zn() {
        return this.zn;
    }

    public void nps() {
        nqi nqiVar;
        jy.hhw(this.hhw);
        jy.hhw(this.nps);
        if (this.zg != null && (nqiVar = this.doe) != null && nqiVar.mrt() != null && this.doe.mrt().iv() != null) {
            jy.hhw(this.zg);
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.doe.mrt().iv(), this.doe.mrt().zn(), this.doe.mrt().fs(), this.zg, this.doe);
        }
        if (this.btk.getVisibility() == 0) {
            jy.zmn((View) this.btk, 8);
        }
    }

    public void olo() {
        jy.hhw(this.hhw);
        jy.hhw(this.nps);
        if (this.btk.getVisibility() == 0) {
            jy.zmn((View) this.btk, 8);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs
    public void zmn() {
        zmn(false, this.kgc);
        kw();
    }

    @TargetApi(14)
    public void kgc() {
        jy.zmn((View) this.zn, 0);
        com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs fsVar = this.fb;
        if (fsVar != null) {
            jy.zmn(fsVar.getView(), 0);
        }
    }

    void kw() {
        try {
            jy.zmn(this.iv, 8);
            jy.zmn((View) this.rc, 8);
            jy.zmn(this.klz, 8);
            jy.zmn((View) this.mw, 8);
        } catch (Exception unused) {
        }
    }

    public void iqz() {
        ImageView imageView = this.rc;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
    }

    private void hhw(int i) {
        jy.zmn(this.klz, i);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs
    public void zmn(boolean z) {
        this.so = z;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: zmn, reason: avoid collision after fix types in other method */
    public void zmn2(nqi nqiVar, WeakReference<Context> weakReference, boolean z) {
        nqi nqiVar2;
        if (nqiVar == null) {
            return;
        }
        zmn(false, this.kgc);
        zmn(this.zn, kgc.zmn());
        View view = this.iv;
        if (view != null) {
            jy.zmn(view, 0);
        }
        ImageView imageView = this.rc;
        if (imageView != null) {
            jy.zmn((View) imageView, 0);
        }
        jy.zmn(this.klz, 0);
        if (this.rc != null && (nqiVar2 = this.doe) != null && nqiVar2.mrt() != null && this.doe.mrt().iv() != null) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.doe.mrt().iv(), this.doe.mrt().zn(), this.doe.mrt().fs(), this.rc, nqiVar);
        }
        jy.zmn((View) this.mw, 0);
        String gt = nqiVar.gt();
        if (TextUtils.isEmpty(gt)) {
            int va = nqiVar.va();
            if (va != 2 && va != 3) {
                if (va == 4) {
                    gt = doe.zmn(this.nqi, "tt_video_download_apk");
                } else if (va == 5) {
                    gt = doe.zmn(this.nqi, "tt_video_dial_phone");
                } else if (va != 8) {
                    gt = doe.zmn(this.nqi, "tt_video_mobile_go_detail");
                }
            }
            gt = doe.zmn(this.nqi, "tt_video_mobile_go_detail");
        }
        TextView textView = this.mw;
        if (textView != null) {
            textView.setText(gt);
            this.mw.setOnClickListener(this.am);
            this.mw.setOnTouchListener(this.am);
        }
        if (this.so) {
            return;
        }
        hhw(4);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs
    public void fs() {
        jy.btk(this.hhw);
        jy.btk(this.nps);
        ImageView imageView = this.zg;
        if (imageView != null) {
            jy.btk(imageView);
        }
    }

    public void zg() {
        jy.btk(this.hhw);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zmn
    public void zmn(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.fb.getHolder()) {
            return;
        }
        this.kw = true;
        if (cyb()) {
            this.bjh.zmn(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zmn
    public void zmn(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.fb.getHolder()) {
            return;
        }
        cyb();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zmn
    public void fs(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.fb.getHolder()) {
            return;
        }
        this.kw = false;
        if (cyb()) {
            this.bjh.fs(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zmn
    public void zmn(SurfaceTexture surfaceTexture, int i, int i2) {
        this.kw = true;
        if (cyb()) {
            this.bjh.zmn(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zmn
    public boolean zmn(SurfaceTexture surfaceTexture) {
        this.kw = false;
        if (!cyb()) {
            return true;
        }
        this.bjh.fs(this, surfaceTexture);
        return true;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.zmn
    public void fs(SurfaceTexture surfaceTexture) {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.zak;
        if (znVar != null) {
            znVar.zmn(surfaceTexture);
        }
    }

    public void bvs() {
        fb(8);
        if (uqh()) {
            this.fb.setVisibility(8);
        }
        ImageView imageView = this.zg;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        fb(8);
        jy.zmn(this.iv, 8);
        jy.zmn((View) this.rc, 8);
        jy.zmn(this.klz, 8);
        iqz iqzVar = this.uqh;
        if (iqzVar != null) {
            iqzVar.zmn(true);
        }
    }

    public boolean phc() {
        return this.kgc;
    }

    public void zmn(boolean z, boolean z2, boolean z3) {
        jy.zmn((View) this.btk, (!z || this.hhw.getVisibility() == 0) ? 8 : 0);
    }

    public void zmn(boolean z, boolean z2) {
        jy.zmn((View) this.btk, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.iqz.fs
    public void rc() {
        zmn(true, false);
    }

    public boolean doe() {
        return this.kw;
    }

    public void fb(int i) {
        this.iqz = i;
        jy.zmn((View) this.zn, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.kw.zmn
    public boolean nqi() {
        iqz iqzVar = this.uqh;
        return iqzVar != null && iqzVar.zmn();
    }

    boolean uqh() {
        return (this.phc & 4) != 4 || this.kgc;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs
    public void zmn(Drawable drawable) {
        ViewGroup viewGroup = this.zn;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zmn.InterfaceC0185zmn
    public long getVideoProgress() {
        if (this.tf <= 0) {
            nqi nqiVar = this.doe;
            if (nqiVar != null && nqiVar.mrt() != null) {
                this.tf = (long) (this.doe.mrt().hhw() * 1000.0d);
            }
            com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.zak;
            if (znVar != null) {
                this.tf = znVar.bvs();
            }
        }
        return this.tf;
    }
}
