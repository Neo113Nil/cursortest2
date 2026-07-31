package com.bytedance.sdk.openadsdk.core.cn.fs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.iqz;
import com.bytedance.sdk.openadsdk.core.widget.kw;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes13.dex */
public class fb extends btk {
    private float ax;
    private boolean bxw;
    private int cd;
    private SeekBar cud;
    private View dgt;
    private ColorStateList es;
    private TextView ev;
    private View fkt;
    private TextView gn;
    private TextView hgd;
    private float hsp;
    private final Rect hwg;

    /* renamed from: io, reason: collision with root package name */
    private ColorStateList f3740io;
    private View jy;
    private ImageView kra;
    private float lbc;
    private final Rect lt;
    private boolean mhu;
    private float mpi;
    private final kjb na;
    private final int nkt;
    private float nlz;
    private TextView nu;
    private final Rect obg;
    private final kw oep;
    private ImageView oub;
    private int rje;
    private ColorStateList skn;
    private final View.OnTouchListener tdm;
    private int tet;
    private ImageView tf;
    private TextView uqd;
    private final Rect utx;
    private final Rect uw;
    private int ve;
    private ImageView vlj;
    private TextView ww;
    private int xrr;
    private int yo;
    private TextView yof;
    private final int zi;

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk, com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void zmn(nqi nqiVar, WeakReference weakReference, boolean z) {
        zmn(nqiVar, (WeakReference<Context>) weakReference, z);
    }

    public fb(Context context, ViewGroup viewGroup, boolean z, int i, nqi nqiVar, com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar, boolean z2) {
        super(context, viewGroup, z, i, nqiVar, znVar, z2);
        this.na = new kjb(this);
        this.mhu = false;
        this.bxw = false;
        this.tet = 0;
        this.yo = 0;
        this.xrr = 0;
        this.ve = 0;
        this.cd = 0;
        this.lt = new Rect();
        this.hwg = new Rect();
        this.rje = 0;
        this.tdm = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.fb.7
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/fb$7;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                return safedk_fb$7_onTouch_95abe7d13c821d42b5ef1716394d3518(view, motionEvent);
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean safedk_fb$7_onTouch_95abe7d13c821d42b5ef1716394d3518(View p0, MotionEvent p1) {
                int actionMasked = p1.getActionMasked();
                if (actionMasked == 2) {
                    p0.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    p0.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.obg = new Rect();
        this.utx = new Rect();
        this.uw = new Rect();
        this.nqi = kgc.zmn().getApplicationContext();
        fb(z2);
        this.zn = viewGroup;
        this.kgc = z;
        kw kwVar = new kw(this);
        this.oep = kwVar;
        kwVar.zmn(this.kgc);
        DisplayMetrics displayMetrics = this.nqi.getResources().getDisplayMetrics();
        this.zi = displayMetrics.widthPixels;
        this.nkt = displayMetrics.heightPixels;
        this.phc = i;
        this.zak = znVar;
        this.doe = nqiVar;
        fb(8);
        zmn(context, this.zn);
        fb();
        klz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    protected void zmn(Context context, View view) {
        super.zmn(context, view);
        this.ev = (TextView) view.findViewById(olo.ol);
        this.tf = (ImageView) view.findViewById(olo.qr);
        this.fkt = view.findViewById(olo.my);
        this.oub = (ImageView) view.findViewById(olo.ze);
        this.hgd = (TextView) view.findViewById(olo.pw);
        this.nu = (TextView) view.findViewById(olo.zq);
        this.ww = (TextView) view.findViewById(olo.ltf);
        this.jy = view.findViewById(olo.wd);
        this.vlj = (ImageView) view.findViewById(olo.ji);
        TextView textView = (TextView) view.findViewById(olo.kh);
        this.yof = textView;
        textView.setText(doe.zmn(context, "tt_video_retry_des_txt"));
        this.cud = (SeekBar) view.findViewById(olo.hr);
        this.gn = (TextView) view.findViewById(olo.br);
        this.uqd = (TextView) view.findViewById(olo.fw);
        this.dgt = view.findViewById(olo.mf);
        this.kra = (ImageView) view.findViewById(olo.ri);
        this.bvs = view.findViewById(olo.ao);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    @SuppressLint({"ClickableViewAccessibility"})
    protected void fb() {
        super.fb();
        this.oep.zmn(this.zn);
        jy.zmn((View) this.tf, (this.kgc || (this.phc & 1) == 1) ? 8 : 0);
        this.tf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.fb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/fb$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fb$1_onClick_23fc0666266be98d27b5d4d73961fb5d(view);
            }

            public void safedk_fb$1_onClick_23fc0666266be98d27b5d4d73961fb5d(View p0) {
                if (fb.this.cyb()) {
                    fb fbVar = fb.this;
                    fbVar.bjh.zn(fbVar, p0);
                }
            }
        });
        jy.zmn((View) this.ev, (!this.kgc || (this.phc & 2) == 2) ? 0 : 8);
        this.ev.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.fb.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/fb$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fb$2_onClick_4778d56845e7ef5a9aaa4b1670cf860a(view);
            }

            public void safedk_fb$2_onClick_4778d56845e7ef5a9aaa4b1670cf860a(View p0) {
                if (fb.this.cyb()) {
                    fb fbVar = fb.this;
                    fbVar.bjh.fb(fbVar, p0);
                }
            }
        });
        this.oub.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.fb.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/fb$3;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fb$3_onClick_bd7518b8c2c81c0134a8562245f21866(view);
            }

            public void safedk_fb$3_onClick_bd7518b8c2c81c0134a8562245f21866(View p0) {
                if (fb.this.cyb()) {
                    fb fbVar = fb.this;
                    fbVar.bjh.btk(fbVar, p0);
                }
            }
        });
        this.vlj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.fb.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/fb$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fb$4_onClick_27f4e4f33673b6b850335b6d6b316ba5(view);
            }

            public void safedk_fb$4_onClick_27f4e4f33673b6b850335b6d6b316ba5(View p0) {
                fb.this.fs(false, true);
                fb.this.zg();
                fb.this.nps();
                fb.this.cyb();
            }
        });
        this.kra.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.fb.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cn/fs/fb$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fb$5_onClick_27454d5711eb1e7bc3da85681bc5e0ef(view);
            }

            public void safedk_fb$5_onClick_27454d5711eb1e7bc3da85681bc5e0ef(View p0) {
                if (fb.this.cyb()) {
                    fb fbVar = fb.this;
                    fbVar.bjh.fs(fbVar, p0);
                }
            }
        });
        this.cud.setThumbOffset(0);
        this.cud.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.fb.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!fb.this.mhu && fb.this.nqi != null) {
                    seekBar.setThumb(rc.zmn(kgc.zmn(), "tt_seek_thumb_normal"));
                }
                if (fb.this.cyb()) {
                    seekBar.setThumbOffset(0);
                    fb fbVar = fb.this;
                    fbVar.bjh.zmn(fbVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!fb.this.mhu && fb.this.nqi != null) {
                    seekBar.setThumb(rc.zmn(kgc.zmn(), "tt_seek_thumb_press"));
                }
                if (fb.this.cyb()) {
                    seekBar.setThumbOffset(0);
                    fb fbVar = fb.this;
                    fbVar.bjh.fs(fbVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (fb.this.cyb()) {
                    fb fbVar = fb.this;
                    fbVar.bjh.zmn(fbVar, i, z);
                }
            }
        });
        this.cud.setOnTouchListener(this.tdm);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void btk() {
        this.na.removeMessages(1);
        this.na.sendMessageDelayed(this.na.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void hhw() {
        this.na.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void fs(boolean z) {
        int i = iv() ? this.nkt : this.rt;
        int i2 = iv() ? this.zi : this.cn;
        if (this.olo <= 0 || this.cyb <= 0 || i <= 0) {
            return;
        }
        if (!phc() && !iv() && (this.phc & 8) != 8) {
            i2 = jy.fs(this.nqi, 228.0f);
        }
        int i3 = this.cyb;
        int i4 = this.olo;
        int i5 = (int) (i4 * ((i * 1.0f) / i3));
        if (i5 > i2) {
            i = (int) (i3 * ((i2 * 1.0f) / i4));
        } else {
            i2 = i5;
        }
        if (!z && !iv()) {
            i = this.rt;
            i2 = this.cn;
        }
        this.fb.zmn(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zmn(String str) {
        TextView textView = this.hgd;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.nu;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zmn(int i) {
        View view = this.dgt;
        if (view == null || view.getVisibility() != 0) {
            this.cud.setProgress(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zmn(long j, long j2) {
        this.gn.setText(com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(j2));
        this.uqd.setText(com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(j));
        this.cud.setProgress(com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(j, j2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void nps() {
        nqi nqiVar;
        jy.hhw(this.hhw);
        jy.hhw(this.nps);
        jy.btk(this.jy);
        if (this.zg != null && (nqiVar = this.doe) != null && nqiVar.mrt() != null && this.doe.mrt().iv() != null) {
            jy.hhw(this.zg);
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.doe.mrt().iv(), this.doe.mrt().zn(), this.doe.mrt().fs(), this.zg, this.doe);
        }
        if (this.btk.getVisibility() == 0) {
            jy.zmn((View) this.btk, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk, com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs
    public void zmn() {
        zmn(false, this.kgc);
        kw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zmn(long j) {
        this.uqd.setText(com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(j));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    @SuppressLint({"ClickableViewAccessibility"})
    public void zmn(nqi nqiVar, WeakReference<Context> weakReference, boolean z) {
        String zmn;
        nqi nqiVar2;
        if (nqiVar == null) {
            return;
        }
        zmn(this.zn, kgc.zmn());
        zmn(false, this.kgc);
        jy.zmn(this.iv, 0);
        jy.zmn((View) this.rc, 0);
        jy.zmn(this.klz, 0);
        if (this.rc != null && (nqiVar2 = this.doe) != null && nqiVar2.mrt() != null && this.doe.mrt().iv() != null) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.doe.mrt().iv(), this.doe.mrt().zn(), this.doe.mrt().fs(), this.rc, this.doe);
        }
        jy.zmn((View) this.mw, 0);
        int va = nqiVar.va();
        if (va == 4) {
            zmn = doe.zmn(this.nqi, "tt_video_download_apk");
        } else if (va == 5) {
            zmn = doe.zmn(this.nqi, "tt_video_dial_phone");
        } else {
            zmn = doe.zmn(this.nqi, "tt_video_mobile_go_detail");
        }
        TextView textView = this.mw;
        if (textView != null) {
            textView.setText(zmn);
            this.mw.setOnClickListener(this.am);
            this.mw.setOnTouchListener(this.am);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zg() {
        jy.btk(this.hhw);
        jy.btk(this.jy);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void bvs() {
        this.cud.setProgress(0);
        this.cud.setSecondaryProgress(0);
        this.gn.setText(doe.zmn(this.nqi, "tt_00_00"));
        this.uqd.setText(doe.zmn(this.nqi, "tt_00_00"));
        fb(8);
        if (uqh()) {
            this.fb.setVisibility(8);
        }
        ImageView imageView = this.zg;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        fb(8);
        jy.zmn(this.dgt, 8);
        jy.zmn(this.iv, 8);
        jy.zmn((View) this.rc, 8);
        jy.zmn(this.klz, 8);
        iqz iqzVar = this.uqh;
        if (iqzVar != null) {
            iqzVar.zmn(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk, com.bytedance.sdk.openadsdk.core.widget.iqz.fs
    public boolean iv() {
        return this.mhu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zmn(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null && (this.zn.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.mhu = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.zn.getLayoutParams();
            this.yo = marginLayoutParams.leftMargin;
            this.tet = marginLayoutParams.topMargin;
            this.xrr = marginLayoutParams.width;
            this.ve = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.zn.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.cd = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.lt.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                jy.zmn(viewGroup, 0, 0, 0, 0);
            }
            fs(true);
            this.kra.setImageDrawable(doe.zn(this.nqi, "tt_shrink_video"));
            this.cud.setThumb(rc.zmn(this.nqi, "tt_seek_thumb_fullscreen_selector"));
            this.cud.setThumbOffset(0);
            com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn((View) this.zn, false);
            btk(this.mhu);
            jy.zmn(this.fkt, 8);
            if (!this.kgc) {
                jy.zmn((View) this.tf, 8);
                jy.zmn((View) this.ev, 8);
            } else if ((this.phc & 1) == 1) {
                jy.zmn((View) this.tf, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void fs(@Nullable ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = this.zn) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.mhu = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.zn.getLayoutParams();
        marginLayoutParams.width = this.xrr;
        marginLayoutParams.height = this.ve;
        marginLayoutParams.leftMargin = this.yo;
        marginLayoutParams.topMargin = this.tet;
        this.zn.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.cd);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.lt;
            jy.zmn(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        fs(true);
        this.kra.setImageDrawable(doe.zn(this.nqi, "tt_enlarge_video"));
        this.cud.setThumb(rc.zmn(this.nqi, "tt_seek_thumb_normal"));
        this.cud.setThumbOffset(0);
        com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn((View) this.zn, true);
        btk(this.mhu);
        jy.zmn(this.fkt, 8);
        if ((this.phc & 2) == 2) {
            jy.zmn((View) this.ev, 0);
        }
    }

    private void btk(boolean z) {
        if (z) {
            bjh();
        } else {
            rp();
        }
    }

    private void bjh() {
        DisplayMetrics displayMetrics = this.nqi.getResources().getDisplayMetrics();
        TextView textView = this.uqd;
        if (textView != null) {
            this.mpi = textView.getTextSize();
            this.uqd.setTextSize(2, 14.0f);
            ColorStateList textColors = this.uqd.getTextColors();
            this.skn = textColors;
            if (textColors != null) {
                this.uqd.setTextColor(-1);
            }
            this.ax = this.uqd.getAlpha();
            this.uqd.setAlpha(0.85f);
            this.uqd.setShadowLayer(0.0f, jy.fs(this.nqi, 0.5f), jy.fs(this.nqi, 0.5f), doe.nps(this.nqi, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.uqd.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.obg.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                jy.zmn(this.uqd, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.obg.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.obg.bottom);
            }
        }
        TextView textView2 = this.gn;
        if (textView2 != null) {
            this.nlz = textView2.getTextSize();
            this.gn.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.gn.getTextColors();
            this.es = textColors2;
            if (textColors2 != null) {
                this.gn.setTextColor(-1);
            }
            this.hsp = this.gn.getAlpha();
            this.gn.setAlpha(0.85f);
            this.gn.setShadowLayer(0.0f, jy.fs(this.nqi, 0.5f), jy.fs(this.nqi, 0.5f), doe.nps(this.nqi, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.gn.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.utx.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.gn;
                int applyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.utx;
                jy.zmn(textView3, applyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.kra;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.uw.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.kra;
                Rect rect2 = this.uw;
                jy.zmn(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.uw.bottom);
            }
        }
        ImageView imageView3 = this.kra;
        if (imageView3 != null) {
            imageView3.setImageDrawable(doe.zn(this.nqi, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.nu;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.f3740io = textColors3;
            if (textColors3 != null) {
                this.nu.setTextColor(-1);
            }
            this.lbc = this.nu.getAlpha();
            this.nu.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.nu.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.hwg.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.nu;
                int applyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.utx;
                jy.zmn(textView5, applyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.fkt;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.rje = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.fkt.setLayoutParams(layoutParams5);
            this.fkt.setBackgroundResource(doe.fb(this.nqi, "tt_shadow_fullscreen_top"));
        }
        fs(false, true);
    }

    private void rp() {
        TextView textView = this.uqd;
        if (textView != null) {
            textView.setTextSize(0, this.mpi);
            ColorStateList colorStateList = this.skn;
            if (colorStateList != null) {
                this.uqd.setTextColor(colorStateList);
            }
            this.uqd.setAlpha(this.ax);
            this.uqd.setShadowLayer(jy.fs(this.nqi, 1.0f), 0.0f, 0.0f, doe.nps(this.nqi, "tt_72000000"));
            TextView textView2 = this.uqd;
            Rect rect = this.obg;
            jy.zmn(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.gn;
        if (textView3 != null) {
            textView3.setTextSize(0, this.nlz);
            ColorStateList colorStateList2 = this.es;
            if (colorStateList2 != null) {
                this.gn.setTextColor(colorStateList2);
            }
            this.gn.setAlpha(this.hsp);
            this.gn.setShadowLayer(jy.fs(this.nqi, 1.0f), 0.0f, 0.0f, doe.nps(this.nqi, "tt_72000000"));
            TextView textView4 = this.gn;
            Rect rect2 = this.utx;
            jy.zmn(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.kra;
        if (imageView != null) {
            Rect rect3 = this.uw;
            jy.zmn(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.kra;
        if (imageView2 != null) {
            imageView2.setImageDrawable(doe.zn(this.nqi, "tt_enlarge_video"));
        }
        TextView textView5 = this.nu;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.f3740io;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.nu.setAlpha(this.lbc);
            TextView textView6 = this.nu;
            Rect rect4 = this.utx;
            jy.zmn(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.fkt;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.rje;
            this.fkt.setLayoutParams(layoutParams);
            this.fkt.setBackground(rc.zmn(this.nqi, "tt_video_black_desc_gradient"));
        }
        fs(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk, com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        if (message.what != 1) {
            return;
        }
        rc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zmn(boolean z, boolean z2, boolean z3) {
        jy.zmn(this.dgt, 0);
        if (this.mhu) {
            jy.zmn(this.fkt, 0);
            jy.zmn((View) this.nu, 0);
        } else if (z3) {
            jy.zmn(this.fkt, 8);
        }
        jy.zmn((View) this.btk, (!z || this.hhw.getVisibility() == 0) ? 8 : 0);
        if (!this.kgc && !this.mhu) {
            if ((this.phc & 1) != 1 && !z3) {
                jy.zmn((View) this.tf, 0);
            }
            jy.zmn((View) this.ev, z3 ? 8 : 0);
        }
        jy.zmn((View) this.gn, 0);
        jy.zmn((View) this.uqd, 0);
        jy.zmn((View) this.cud, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zmn(boolean z, boolean z2) {
        jy.zmn(this.dgt, 8);
        jy.zmn(this.fkt, 8);
        jy.zmn((View) this.btk, 8);
        if (!this.kgc && !this.mhu) {
            jy.zmn((View) this.tf, 8);
            if ((this.phc & 2) != 2) {
                jy.zmn((View) this.ev, 8);
            }
        } else if ((this.phc & 1) == 1) {
            jy.zmn((View) this.tf, 8);
        }
        if (z2) {
            jy.zmn((View) this.tf, 8);
            jy.zmn((View) this.ev, 8);
        }
        zn(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk, com.bytedance.sdk.openadsdk.core.widget.iqz.fs
    public void rc() {
        zmn(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public boolean fs(int i) {
        SeekBar seekBar = this.cud;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk
    public void zn(boolean z) {
        TextView textView = this.hgd;
        if (textView != null) {
            jy.zmn((View) textView, (!this.kgc && z) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.btk, com.bytedance.sdk.openadsdk.core.widget.kw.zmn
    public void zmn(View view, boolean z) {
        if (iv()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            nqi nqiVar = this.doe;
            if (nqiVar != null && !TextUtils.isEmpty(nqiVar.db())) {
                zmn(this.doe.db());
            }
            this.ww.setText(format);
        } else {
            zmn("");
            this.ww.setText("");
        }
        if (this.rp) {
            return;
        }
        zn(this.kgc && !this.mhu);
        if (cyb()) {
            this.bjh.zmn(this, view, true, this.hhw.getVisibility() != 0);
        }
    }
}
