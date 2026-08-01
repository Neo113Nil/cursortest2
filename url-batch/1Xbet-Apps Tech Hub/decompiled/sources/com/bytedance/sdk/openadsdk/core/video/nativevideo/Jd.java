package com.bytedance.sdk.openadsdk.core.video.nativevideo;

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
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: NativeVideoDetailLayout.java */
/* loaded from: classes2.dex */
public class Jd extends NB {
    private final int Ayu;
    private ImageView BSi;
    private ColorStateList Ca;
    private TextView CjQ;
    private int Cwg;
    private final Rect EFw;
    private float FFl;
    private final Rect HWd;
    private ColorStateList MY;
    private ImageView OhP;
    private boolean OyE;
    private TextView Pj;
    private ImageView SE;
    private final Rect UYh;
    private float Wby;
    private int Ye;
    private float Zm;
    private TextView ZsW;
    private final Rect cGU;
    private ImageView cRf;
    private final dyT cnN;
    private SeekBar ea;
    private final com.bytedance.sdk.openadsdk.core.widget.Jd elv;
    private TextView gSd;
    private View jhZ;
    private boolean joF;
    private int neB;
    private TextView od;
    private final Rect pR;
    private TextView qD;
    private int qd;
    private int rW;
    private float rcB;
    private View sP;
    private View sq;
    private final View.OnTouchListener tCd;
    private final int tQ;
    private int thO;
    private float wjr;
    private TextView yWX;
    private ColorStateList yhq;

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB, com.bykv.vk.openvk.component.video.api.Jd.icD
    public /* bridge */ /* synthetic */ void pvs(cR cRVar, WeakReference weakReference, boolean z) {
        pvs(cRVar, (WeakReference<Context>) weakReference, z);
    }

    public Jd(Context context, ViewGroup viewGroup, boolean z, int i, cR cRVar, com.bykv.vk.openvk.component.video.api.Jd.vG vGVar, boolean z2) {
        super(context, viewGroup, z, i, cRVar, vGVar, z2);
        this.cnN = new dyT(this);
        this.OyE = false;
        this.joF = false;
        this.thO = 0;
        this.qd = 0;
        this.rW = 0;
        this.Cwg = 0;
        this.neB = 0;
        this.cGU = new Rect();
        this.HWd = new Rect();
        this.Ye = 0;
        this.tCd = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Jd.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.UYh = new Rect();
        this.pR = new Rect();
        this.EFw = new Rect();
        this.ZhG = mnm.pvs().getApplicationContext();
        Jd(z2);
        this.pvs = viewGroup;
        this.zM = z;
        com.bytedance.sdk.openadsdk.core.widget.Jd jd = new com.bytedance.sdk.openadsdk.core.widget.Jd(this);
        this.elv = jd;
        jd.pvs(this.zM);
        DisplayMetrics displayMetrics = this.ZhG.getResources().getDisplayMetrics();
        this.Ayu = displayMetrics.widthPixels;
        this.tQ = displayMetrics.heightPixels;
        this.OT = i;
        this.ae = vGVar;
        this.ny = cRVar;
        Jd(8);
        pvs(context, this.pvs);
        Jd();
        kj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    protected void pvs(Context context, View view) {
        super.pvs(context, view);
        this.Pj = (TextView) view.findViewById(kj.CSZ);
        this.cRf = (ImageView) view.findViewById(kj.xa);
        this.sP = view.findViewById(kj.wr);
        this.OhP = (ImageView) view.findViewById(kj.MA);
        this.gSd = (TextView) view.findViewById(kj.LHy);
        this.qD = (TextView) view.findViewById(kj.mo);
        this.od = (TextView) view.findViewById(kj.eOd);
        this.jhZ = view.findViewById(kj.Irm);
        this.SE = (ImageView) view.findViewById(kj.qVe);
        TextView textView = (TextView) view.findViewById(kj.LEC);
        this.yWX = textView;
        textView.setText(uc.pvs(context, "tt_video_retry_des_txt"));
        this.ea = (SeekBar) view.findViewById(kj.VLm);
        this.ZsW = (TextView) view.findViewById(kj.LDD);
        this.CjQ = (TextView) view.findViewById(kj.Je);
        this.sq = view.findViewById(kj.SLG);
        this.BSi = (ImageView) view.findViewById(kj.cUm);
        this.yiw = view.findViewById(kj.Oa);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    protected void Jd() {
        super.Jd();
        this.elv.pvs(this.pvs);
        Pj.pvs((View) this.cRf, (this.zM || (this.OT & 1) == 1) ? 8 : 0);
        this.cRf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Jd.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Jd.this.mnm()) {
                    Jd.this.dX.vG(Jd.this, view);
                }
            }
        });
        Pj.pvs((View) this.Pj, (!this.zM || (this.OT & 2) == 2) ? 0 : 8);
        this.Pj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Jd.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Jd.this.mnm()) {
                    Jd.this.dX.Jd(Jd.this, view);
                }
            }
        });
        this.OhP.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Jd.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Jd.this.mnm()) {
                    Jd.this.dX.NB(Jd.this, view);
                }
            }
        });
        this.SE.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Jd.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Jd.this.icD(false, true);
                Jd.this.so();
                Jd.this.yiw();
                Jd.this.mnm();
            }
        });
        this.BSi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Jd.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Jd.this.mnm()) {
                    Jd.this.dX.icD(Jd.this, view);
                }
            }
        });
        this.ea.setThumbOffset(0);
        this.ea.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Jd.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!Jd.this.OyE && Jd.this.ZhG != null) {
                    seekBar.setThumb(so.pvs(mnm.pvs(), "tt_seek_thumb_normal"));
                }
                if (Jd.this.mnm()) {
                    seekBar.setThumbOffset(0);
                    Jd.this.dX.pvs(Jd.this, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!Jd.this.OyE && Jd.this.ZhG != null) {
                    seekBar.setThumb(so.pvs(mnm.pvs(), "tt_seek_thumb_press"));
                }
                if (Jd.this.mnm()) {
                    seekBar.setThumbOffset(0);
                    Jd.this.dX.icD(Jd.this, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (Jd.this.mnm()) {
                    Jd.this.dX.pvs(Jd.this, i, z);
                }
            }
        });
        this.ea.setOnTouchListener(this.tCd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void NB() {
        this.cnN.removeMessages(1);
        this.cnN.sendMessageDelayed(this.cnN.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void sUS() {
        this.cnN.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void icD(boolean z) {
        int i = Wyp() ? this.tQ : this.bNS;
        int i2 = Wyp() ? this.Ayu : this.mnm;
        if (this.cR <= 0 || this.vA <= 0 || i <= 0) {
            return;
        }
        if (!rCZ() && !Wyp() && (this.OT & 8) != 8) {
            i2 = this.ZhG.getResources().getDimensionPixelSize(uc.yiw(this.ZhG, "tt_video_container_maxheight"));
        }
        int i3 = (int) (this.cR * ((i * 1.0f) / this.vA));
        if (i3 > i2) {
            i = (int) (this.vA * ((i2 * 1.0f) / this.cR));
        } else {
            i2 = i3;
        }
        if (!z && !Wyp()) {
            i = this.bNS;
            i2 = this.mnm;
        }
        this.icD.pvs(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void pvs(String str) {
        TextView textView = this.gSd;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.qD;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void pvs(int i) {
        View view = this.sq;
        if (view == null || view.getVisibility() != 0) {
            this.ea.setProgress(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void pvs(long j, long j2) {
        this.ZsW.setText(com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(j2));
        this.CjQ.setText(com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(j));
        this.ea.setProgress(com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(j, j2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void yiw() {
        Pj.sUS(this.Jd);
        Pj.sUS(this.NB);
        Pj.NB(this.jhZ);
        if (this.sUS != null && this.ny != null && this.ny.od() != null && this.ny.od().Wyp() != null) {
            Pj.sUS(this.sUS);
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.ny.od().Wyp(), this.ny.od().vG(), this.ny.od().icD(), this.sUS, this.ny);
        }
        if (this.vG.getVisibility() == 0) {
            Pj.pvs((View) this.vG, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB, com.bykv.vk.openvk.component.video.api.Jd.icD
    public void pvs() {
        pvs(false, this.zM);
        zM();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void pvs(long j) {
        this.CjQ.setText(com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(j));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void pvs(cR cRVar, WeakReference<Context> weakReference, boolean z) {
        String rW;
        String pvs;
        if (cRVar == null) {
            return;
        }
        pvs(this.pvs, mnm.pvs());
        pvs(false, this.zM);
        Pj.pvs(this.so, 0);
        Pj.pvs((View) this.Mxy, 0);
        Pj.pvs(this.Wyp, 0);
        if (this.Mxy != null && this.ny != null && this.ny.od() != null && this.ny.od().Wyp() != null) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.ny.od().Wyp(), this.ny.od().vG(), this.ny.od().icD(), this.Mxy, this.ny);
        }
        if (!TextUtils.isEmpty(cRVar.OhP())) {
            rW = cRVar.OhP();
        } else if (!TextUtils.isEmpty(cRVar.qd())) {
            rW = cRVar.qd();
        } else {
            rW = !TextUtils.isEmpty(cRVar.rW()) ? cRVar.rW() : "";
        }
        if (this.ny != null && this.ny.ea() != null && this.ny.ea().pvs() != null) {
            Pj.pvs((View) this.qh, 0);
            Pj.pvs((View) this.kj, 4);
            if (this.qh != null) {
                com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.ny.ea(), this.qh, cRVar);
                this.qh.setOnClickListener(this.gA);
                this.qh.setOnTouchListener(this.gA);
            }
        } else if (!TextUtils.isEmpty(rW)) {
            Pj.pvs((View) this.qh, 4);
            Pj.pvs((View) this.kj, 0);
            if (this.kj != null) {
                this.kj.setText(rW.substring(0, 1));
                this.kj.setOnClickListener(this.gA);
                this.kj.setOnTouchListener(this.gA);
            }
        }
        if (this.Ju != null && !TextUtils.isEmpty(rW)) {
            this.Ju.setText(rW);
        }
        Pj.pvs((View) this.Ju, 0);
        Pj.pvs((View) this.IP, 0);
        int jhZ = cRVar.jhZ();
        if (jhZ == 4) {
            pvs = uc.pvs(this.ZhG, "tt_video_download_apk");
        } else if (jhZ == 5) {
            pvs = uc.pvs(this.ZhG, "tt_video_dial_phone");
        } else {
            pvs = uc.pvs(this.ZhG, "tt_video_mobile_go_detail");
        }
        if (this.IP != null) {
            this.IP.setText(pvs);
            this.IP.setOnClickListener(this.gA);
            this.IP.setOnTouchListener(this.gA);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void so() {
        Pj.NB(this.Jd);
        Pj.NB(this.jhZ);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void Mxy() {
        this.ea.setProgress(0);
        this.ea.setSecondaryProgress(0);
        this.ZsW.setText(uc.icD(this.ZhG, "tt_00_00"));
        this.CjQ.setText(uc.icD(this.ZhG, "tt_00_00"));
        Jd(8);
        if (ZhG()) {
            this.icD.setVisibility(8);
        }
        if (this.sUS != null) {
            this.sUS.setImageDrawable(null);
        }
        Jd(8);
        Pj.pvs(this.sq, 8);
        Pj.pvs(this.so, 8);
        Pj.pvs((View) this.Mxy, 8);
        Pj.pvs(this.Wyp, 8);
        Pj.pvs((View) this.qh, 8);
        Pj.pvs((View) this.kj, 8);
        Pj.pvs((View) this.Ju, 8);
        if (this.dyT != null) {
            this.dyT.pvs(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB, com.bytedance.sdk.openadsdk.core.widget.NB.icD
    public boolean Wyp() {
        return this.OyE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void pvs(ViewGroup viewGroup) {
        if (viewGroup != null && (this.pvs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.OyE = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.pvs.getLayoutParams();
            this.qd = marginLayoutParams.leftMargin;
            this.thO = marginLayoutParams.topMargin;
            this.rW = marginLayoutParams.width;
            this.Cwg = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.pvs.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.neB = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.cGU.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                Pj.icD(viewGroup, 0, 0, 0, 0);
            }
            icD(true);
            this.BSi.setImageDrawable(uc.vG(this.ZhG, "tt_shrink_video"));
            this.ea.setThumb(so.pvs(this.ZhG, "tt_seek_thumb_fullscreen_selector"));
            this.ea.setThumbOffset(0);
            com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs((View) this.pvs, false);
            NB(this.OyE);
            Pj.pvs(this.sP, 8);
            if (!this.zM) {
                Pj.pvs((View) this.cRf, 8);
                Pj.pvs((View) this.Pj, 8);
            } else if ((this.OT & 1) == 1) {
                Pj.pvs((View) this.cRf, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void icD(ViewGroup viewGroup) {
        Ju.pvs("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || this.pvs == null || !(this.pvs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.OyE = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.pvs.getLayoutParams();
        marginLayoutParams.width = this.rW;
        marginLayoutParams.height = this.Cwg;
        marginLayoutParams.leftMargin = this.qd;
        marginLayoutParams.topMargin = this.thO;
        this.pvs.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.neB);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Pj.icD(viewGroup, this.cGU.left, this.cGU.top, this.cGU.right, this.cGU.bottom);
        }
        icD(true);
        this.BSi.setImageDrawable(uc.vG(this.ZhG, "tt_enlarge_video"));
        this.ea.setThumb(so.pvs(this.ZhG, "tt_seek_thumb_normal"));
        this.ea.setThumbOffset(0);
        com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs((View) this.pvs, true);
        NB(this.OyE);
        Pj.pvs(this.sP, 8);
        if ((this.OT & 2) == 2) {
            Pj.pvs((View) this.Pj, 0);
        }
    }

    private void NB(boolean z) {
        if (z) {
            dyT();
        } else {
            dX();
        }
    }

    private void dyT() {
        DisplayMetrics displayMetrics = this.ZhG.getResources().getDisplayMetrics();
        TextView textView = this.CjQ;
        if (textView != null) {
            this.Wby = textView.getTextSize();
            this.CjQ.setTextSize(2, 14.0f);
            ColorStateList textColors = this.CjQ.getTextColors();
            this.MY = textColors;
            if (textColors != null) {
                this.CjQ.setTextColor(uc.so(this.ZhG, "tt_ssxinzi15"));
            }
            this.rcB = this.CjQ.getAlpha();
            this.CjQ.setAlpha(0.85f);
            this.CjQ.setShadowLayer(0.0f, Pj.icD(this.ZhG, 0.5f), Pj.icD(this.ZhG, 0.5f), uc.so(this.ZhG, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams = this.CjQ.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.UYh.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                Pj.icD(this.CjQ, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.UYh.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.UYh.bottom);
            }
        }
        TextView textView2 = this.ZsW;
        if (textView2 != null) {
            this.FFl = textView2.getTextSize();
            this.ZsW.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.ZsW.getTextColors();
            this.yhq = textColors2;
            if (textColors2 != null) {
                this.ZsW.setTextColor(uc.so(this.ZhG, "tt_ssxinzi15"));
            }
            this.wjr = this.ZsW.getAlpha();
            this.ZsW.setAlpha(0.85f);
            this.ZsW.setShadowLayer(0.0f, Pj.icD(this.ZhG, 0.5f), Pj.icD(this.ZhG, 0.5f), uc.so(this.ZhG, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams2 = this.ZsW.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.pR.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                Pj.icD(this.ZsW, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.pR.top, this.pR.right, this.pR.bottom);
            }
        }
        ImageView imageView = this.BSi;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.EFw.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                Pj.icD(this.BSi, this.EFw.left, this.EFw.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.EFw.bottom);
            }
        }
        ImageView imageView2 = this.BSi;
        if (imageView2 != null) {
            imageView2.setImageDrawable(uc.vG(this.ZhG, "tt_shrink_fullscreen"));
        }
        TextView textView3 = this.qD;
        if (textView3 != null) {
            ColorStateList textColors3 = textView3.getTextColors();
            this.Ca = textColors3;
            if (textColors3 != null) {
                this.qD.setTextColor(uc.so(this.ZhG, "tt_ssxinzi15"));
            }
            this.Zm = this.qD.getAlpha();
            this.qD.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.qD.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.HWd.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                Pj.icD(this.qD, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), this.pR.top, this.pR.right, this.pR.bottom);
            }
        }
        View view = this.sP;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.Ye = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.sP.setLayoutParams(layoutParams5);
            this.sP.setBackgroundResource(uc.Jd(this.ZhG, "tt_shadow_fullscreen_top"));
        }
        icD(false, true);
    }

    private void dX() {
        TextView textView = this.CjQ;
        if (textView != null) {
            textView.setTextSize(0, this.Wby);
            ColorStateList colorStateList = this.MY;
            if (colorStateList != null) {
                this.CjQ.setTextColor(colorStateList);
            }
            this.CjQ.setAlpha(this.rcB);
            this.CjQ.setShadowLayer(Pj.icD(this.ZhG, 1.0f), 0.0f, 0.0f, uc.so(this.ZhG, "tt_video_shadow_color"));
            Pj.icD(this.CjQ, this.UYh.left, this.UYh.top, this.UYh.right, this.UYh.bottom);
        }
        TextView textView2 = this.ZsW;
        if (textView2 != null) {
            textView2.setTextSize(0, this.FFl);
            ColorStateList colorStateList2 = this.yhq;
            if (colorStateList2 != null) {
                this.ZsW.setTextColor(colorStateList2);
            }
            this.ZsW.setAlpha(this.wjr);
            this.ZsW.setShadowLayer(Pj.icD(this.ZhG, 1.0f), 0.0f, 0.0f, uc.so(this.ZhG, "tt_video_shadow_color"));
            Pj.icD(this.ZsW, this.pR.left, this.pR.top, this.pR.right, this.pR.bottom);
        }
        ImageView imageView = this.BSi;
        if (imageView != null) {
            Pj.icD(imageView, this.EFw.left, this.EFw.top, this.EFw.right, this.EFw.bottom);
        }
        ImageView imageView2 = this.BSi;
        if (imageView2 != null) {
            imageView2.setImageDrawable(uc.vG(this.ZhG, "tt_enlarge_video"));
        }
        TextView textView3 = this.qD;
        if (textView3 != null) {
            ColorStateList colorStateList3 = this.Ca;
            if (colorStateList3 != null) {
                textView3.setTextColor(colorStateList3);
            }
            this.qD.setAlpha(this.Zm);
            Pj.icD(this.qD, this.pR.left, this.pR.top, this.pR.right, this.pR.bottom);
        }
        View view = this.sP;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.Ye;
            this.sP.setLayoutParams(layoutParams);
            this.sP.setBackground(so.pvs(this.ZhG, "tt_video_black_desc_gradient"));
        }
        icD(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB, com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        if (message.what != 1) {
            return;
        }
        qh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void pvs(boolean z, boolean z2, boolean z3) {
        Pj.pvs(this.sq, 0);
        if (this.OyE) {
            Pj.pvs(this.sP, 0);
            Pj.pvs((View) this.qD, 0);
        } else if (z3) {
            Pj.pvs(this.sP, 8);
        }
        Pj.pvs((View) this.vG, (!z || this.Jd.getVisibility() == 0) ? 8 : 0);
        if (!this.zM && !this.OyE) {
            if ((this.OT & 1) != 1 && !z3) {
                Pj.pvs((View) this.cRf, 0);
            }
            Pj.pvs((View) this.Pj, z3 ? 8 : 0);
        }
        Pj.pvs((View) this.ZsW, 0);
        Pj.pvs((View) this.CjQ, 0);
        Pj.pvs((View) this.ea, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void pvs(boolean z, boolean z2) {
        Pj.pvs(this.sq, 8);
        Pj.pvs(this.sP, 8);
        Pj.pvs((View) this.vG, 8);
        if (!this.zM && !this.OyE) {
            Pj.pvs((View) this.cRf, 8);
            if ((this.OT & 2) != 2) {
                Pj.pvs((View) this.Pj, 8);
            }
        } else if ((this.OT & 1) == 1) {
            Pj.pvs((View) this.cRf, 8);
        }
        if (z2) {
            Pj.pvs((View) this.cRf, 8);
            Pj.pvs((View) this.Pj, 8);
        }
        vG(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB, com.bytedance.sdk.openadsdk.core.widget.NB.icD
    public void qh() {
        pvs(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public boolean icD(int i) {
        SeekBar seekBar = this.ea;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB
    public void vG(boolean z) {
        TextView textView;
        TextView textView2;
        int i;
        if (this.gSd != null) {
            if (this.zM) {
                textView2 = this.gSd;
            } else {
                textView = this.gSd;
                if (z) {
                    i = 0;
                    Pj.pvs((View) textView, i);
                }
                textView2 = textView;
            }
            textView = textView2;
            i = 8;
            Pj.pvs((View) textView, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NB, com.bytedance.sdk.openadsdk.core.widget.Jd.pvs
    public void pvs(View view, boolean z) {
        if (Wyp()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            if (this.ny != null && !TextUtils.isEmpty(this.ny.qd())) {
                pvs(this.ny.qd());
            }
            this.od.setText(format);
        } else {
            pvs("");
            this.od.setText("");
        }
        if (this.CvL) {
            return;
        }
        vG(this.zM && !this.OyE);
        if (mnm()) {
            this.dX.pvs(this, view, true, this.Jd.getVisibility() != 0);
        }
    }
}
