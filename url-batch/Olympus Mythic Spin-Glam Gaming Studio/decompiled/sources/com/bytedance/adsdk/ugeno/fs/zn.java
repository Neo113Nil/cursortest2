package com.bytedance.adsdk.ugeno.fs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.cyb;
import com.bytedance.adsdk.ugeno.core.fs.btk;
import com.bytedance.adsdk.ugeno.core.fs.fb;
import com.bytedance.adsdk.ugeno.core.hhw;
import com.bytedance.adsdk.ugeno.core.iv;
import com.bytedance.adsdk.ugeno.core.kgc;
import com.bytedance.adsdk.ugeno.core.nps;
import com.bytedance.adsdk.ugeno.core.rc;
import com.bytedance.adsdk.ugeno.core.zg;
import com.bytedance.adsdk.ugeno.fb;
import com.bytedance.adsdk.ugeno.fb.bvs;
import com.bytedance.adsdk.ugeno.fb.mw;
import com.bytedance.adsdk.ugeno.fb.rt;
import com.bytedance.adsdk.ugeno.fs.zmn;
import com.bytedance.adsdk.ugeno.nps.zmn;
import com.bytedance.adsdk.ugeno.zmn;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.B5;
import com.ironsource.X3;
import io.appmetrica.analytics.impl.M2;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class zn<T extends View> implements View.OnTouchListener, cn.fs, cn.zmn, fb {
    protected float am;

    @Deprecated
    private fb.zmn ao;
    protected float ax;
    protected boolean bjh;
    protected hhw bmc;
    private mw br;
    protected T btk;
    protected rc bvs;
    protected boolean bxw;
    protected int cd;
    protected float cn;
    protected float cud;
    protected float cyb;
    private boolean db;
    private boolean dey;
    protected float dgt;
    protected boolean doe;
    protected float es;
    private boolean eug;
    protected boolean ev;
    protected JSONObject fb;
    protected boolean fkt;
    protected Context fs;
    private float fw;
    protected float gn;
    private boolean gt;
    protected boolean hgd;
    protected zmn<ViewGroup> hhw;
    private boolean hip;
    private rt hr;
    protected float hsp;
    protected com.bytedance.adsdk.ugeno.zmn.zmn hwg;
    private String hz;

    /* renamed from: io, reason: collision with root package name */
    protected boolean f3733io;
    protected float iqz;
    protected boolean iv;
    private boolean ji;
    protected float jy;
    protected float kgc;
    private boolean kh;
    protected float kjb;
    protected String klz;
    protected float kra;
    protected float kw;
    protected ViewGroup.LayoutParams lbc;
    private boolean lgz;
    private com.bytedance.adsdk.ugeno.core.zmn ljl;
    protected float lt;
    private boolean ltf;
    private String lwz;
    private long mf;
    protected boolean mhu;
    protected boolean mig;
    protected float mpi;
    private boolean mrt;
    protected float mw;
    private boolean my;
    protected boolean na;
    protected float nkt;
    protected float nlz;
    protected zmn<ViewGroup> nps;
    protected boolean nqi;
    protected int nu;
    private boolean ob;
    protected float obg;
    protected float oep;
    protected float olo;
    protected ImageView.ScaleType oub;
    protected zmn.C0112zmn ouf;
    private boolean pa;
    private kgc pf;
    protected float phc;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.fs.zn pl;
    private JSONObject pw;
    private boolean qr;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.fs.fs quu;
    protected String rc;
    protected com.bytedance.adsdk.ugeno.zmn.hhw rje;
    protected float rp;
    private boolean rsi;
    protected float rt;
    protected float skn;
    private boolean sl;
    protected boolean so;
    protected bvs sxr;
    protected float tdm;
    protected boolean tet;
    private boolean tev;
    protected boolean tf;

    @Deprecated
    private btk tj;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.fs.hhw uaq;
    protected float uqd;
    protected boolean uqh;
    protected zg utx;
    protected cn uw;
    private boolean va;
    protected String ve;
    private iv vgx;
    protected boolean vlj;
    private GradientDrawable vpd;
    protected Map<Integer, com.bytedance.adsdk.ugeno.core.mw> vtz;
    private boolean wd;
    protected cyb wq;
    protected String ww;
    protected int xrr;
    protected float yj;
    protected float yo;
    protected boolean yof;
    protected float zak;
    private boolean ze;
    protected nps.zmn zg;
    protected float zi;
    private boolean zmn;
    protected JSONObject zn;
    private com.bytedance.adsdk.ugeno.fb.zmn.zmn zq;

    protected void vlj() {
    }

    protected void yof() {
    }

    public T zmn() {
        return null;
    }

    public void zmn(String str, Map<String, Object> map) {
    }

    public zn(Context context) {
        this(context, null);
    }

    public zn(Context context, zmn<ViewGroup> zmnVar) {
        this.mw = -2.0f;
        this.rt = -2.0f;
        this.ve = "solid";
        this.cd = 0;
        this.f3733io = true;
        this.zi = 0.0f;
        this.nkt = 0.0f;
        this.oep = 0.0f;
        this.tdm = 1.0f;
        this.mpi = 1.0f;
        this.skn = 1.0f;
        this.ax = 0.0f;
        this.obg = 0.0f;
        this.nlz = 0.0f;
        this.es = 0.0f;
        this.hsp = 1.0f;
        this.lgz = true;
        this.qr = true;
        this.my = false;
        this.ze = false;
        this.pa = false;
        this.ltf = false;
        this.fw = 12.0f;
        this.fs = context;
        this.hhw = zmnVar;
        this.vtz = new HashMap();
        this.vpd = new GradientDrawable();
        this.btk = zmn();
    }

    public T rc() {
        return this.btk;
    }

    public void fs(JSONObject jSONObject) {
        this.fb = jSONObject;
        mw();
    }

    public void zmn(JSONObject jSONObject) {
        this.fb = jSONObject;
        mw();
        JSONObject jSONObject2 = this.zn;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        zmn.C0110zmn iv = this.hhw != null ? this.hhw.iv() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(this.zn.optString(next), jSONObject);
            zmn(next, zmn);
            if (iv != null) {
                iv.zmn(this.fs, next, zmn);
            }
        }
        if (iv != null) {
            zmn(iv.zmn());
        }
        if (this.pw == null || this.fb == null) {
            return;
        }
        try {
            if (so()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("i18n", this.pw);
                this.fb.put("xNode", jSONObject3);
                return;
            }
            this.fb.put("i18n", this.pw);
        } catch (JSONException unused) {
        }
    }

    public JSONObject klz() {
        return this.fb;
    }

    public void mw() {
        boolean optBoolean = this.fb.optBoolean("gesture_through_enable", false);
        nps.zmn zmnVar = this.zg;
        boolean z = zmnVar == null || zmnVar.zn();
        this.pa = optBoolean && z;
        Log.d("GesThrough_UGenWidget", "gesBySettings: " + optBoolean + ", gesByTemplate: " + z + ", mGestureThroughEnabled: " + this.pa);
        this.ltf = this.fb.optBoolean("is_adapt_two_finger", false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void fs() {
        kjb();
        rt();
        zn(this.cd);
        zn();
        fb();
        bvs bvsVar = this.sxr;
        if (bvsVar != null) {
            bvsVar.zmn();
            this.sxr.fs();
            this.sxr.zn();
        }
        this.btk.setOnTouchListener(this);
        iv();
        ViewGroup viewGroup = (ViewGroup) this.btk.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.lgz);
        }
        com.bytedance.adsdk.ugeno.zmn.zmn zmnVar = this.hwg;
        if (zmnVar != null) {
            zmnVar.fb();
        }
        com.bytedance.adsdk.ugeno.zmn.hhw hhwVar = this.rje;
        if (hhwVar != null) {
            hhwVar.zmn();
        }
        bvs bvsVar2 = this.sxr;
        if (bvsVar2 != null) {
            bvsVar2.fb();
        }
        if (this.uw == null || !fs(22)) {
            return;
        }
        this.uw.zmn(this.vtz.get(22), this, this);
    }

    protected void rt() {
        this.btk.setPadding((int) (this.ev ? this.kjb : this.rp), (int) (this.fkt ? this.am : this.rp), (int) (this.tf ? this.zak : this.rp), (int) (this.hgd ? this.yj : this.rp));
    }

    private void zn() {
        if (this.zmn) {
            this.btk.setTranslationX(this.nkt);
        }
        if (this.ob) {
            this.btk.setTranslationY(this.oep);
        }
        if (this.tev) {
            this.btk.setScaleX(this.mpi);
        }
        if (this.rsi) {
            this.btk.setScaleY(this.skn);
        }
        if (this.hip) {
            this.btk.setRotation(this.ax);
        }
        if (this.eug) {
            this.btk.setRotationX(this.obg);
        }
        if (this.mrt) {
            this.btk.setRotationY(-this.nlz);
        }
        if (this.dey) {
            this.btk.setAlpha(this.hsp);
        }
        float f = this.es;
        if (f != 0.0f) {
            this.btk.setRotation(f);
        }
        if (this.hip || this.eug || this.mrt) {
            this.btk.setCameraDistance(10000.0f);
        }
    }

    public float cn() {
        return this.nkt;
    }

    public float cyb() {
        return this.oep;
    }

    public float olo() {
        return this.mpi;
    }

    public float kgc() {
        return this.skn;
    }

    public float kw() {
        return this.obg;
    }

    public float iqz() {
        return this.nlz;
    }

    public float phc() {
        return this.es;
    }

    public float doe() {
        return this.hsp;
    }

    public float nqi() {
        return this.dgt;
    }

    @Deprecated
    private void fb() {
        com.bytedance.adsdk.ugeno.core.fs.fb fb;
        this.btk.setVisibility(this.cd);
        float f = this.es;
        if (f != 0.0f) {
            this.btk.setRotation(f);
        }
        nps.zmn zmnVar = this.zg;
        if (zmnVar != null && TextUtils.isEmpty(zmnVar.fs())) {
            this.btk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.fs.zn.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    zn znVar = zn.this;
                    if (znVar.utx != null) {
                        boolean unused = znVar.qr;
                    }
                }
            });
        } else if (fs(1) && !this.sl) {
            this.btk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.fs.zn.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    zn znVar = zn.this;
                    if (znVar.uw == null || !znVar.qr) {
                        return;
                    }
                    zn znVar2 = zn.this;
                    cn cnVar = znVar2.uw;
                    com.bytedance.adsdk.ugeno.core.mw mwVar = znVar2.vtz.get(1);
                    zn znVar3 = zn.this;
                    cnVar.zmn(mwVar, znVar3, znVar3);
                }
            });
        }
        if (this.uw != null && fs(4)) {
            if (fs(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + tf());
                this.db = true;
                this.tj = new btk(this.fs, this.vtz.get(4), this.vtz.get(1), this.db, mhu(), this.ltf);
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + tf());
                this.tj = new btk(this.fs, this.vtz.get(4), this.db, mhu(), this.ltf);
            }
        }
        if (this.uw != null && fs(1) && this.sl) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.sl + ", view.id: " + tf());
            this.pl = new com.bytedance.adsdk.ugeno.core.fs.zn(this.fs, this.vtz.get(1));
        }
        bvs();
        if (this.uw != null && fs(3) && (fb = com.bytedance.adsdk.ugeno.btk.zmn().fb()) != null) {
            this.ao = fb.zmn(this.fs, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.fs.zn.3
            };
        }
        if (this.uw != null && fs(9)) {
            com.bytedance.adsdk.ugeno.core.fs.hhw hhwVar = new com.bytedance.adsdk.ugeno.core.fs.hhw(this.fs, this.vtz.get(9), this);
            this.uaq = hhwVar;
            hhwVar.zmn(this.uw);
        }
        if (fs(10)) {
            com.bytedance.adsdk.ugeno.core.fs.fs fsVar = new com.bytedance.adsdk.ugeno.core.fs.fs(this.fs, this.vtz.get(10), this);
            this.quu = fsVar;
            fsVar.zmn(this.uw);
        }
    }

    private void bvs() {
        com.bytedance.adsdk.ugeno.core.mw mwVar;
        if (this.uw == null || !fs(18) || (mwVar = this.vtz.get(18)) == null) {
            return;
        }
        JSONObject zn = mwVar.zn();
        if (zn != null) {
            try {
                zn.put("rotateZ", com.bytedance.adsdk.ugeno.zn.fs.zmn(zn.optString("rotateZ"), this.fb));
            } catch (JSONException unused) {
            }
        }
        this.uw.zmn(mwVar, this, this);
    }

    private void iv() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.rc);
        this.btk.setContentDescription(sb);
    }

    public void zmn(kgc kgcVar) {
        this.pf = kgcVar;
    }

    public void nps() {
        com.bytedance.adsdk.ugeno.core.zmn zmnVar = this.ljl;
        if (zmnVar != null) {
            iv ivVar = new iv(this.btk, zmnVar);
            this.vgx = ivVar;
            ivVar.zmn();
        }
        com.bytedance.adsdk.ugeno.zmn.zmn zmnVar2 = this.hwg;
        if (zmnVar2 != null) {
            zmnVar2.zmn();
        }
        com.bytedance.adsdk.ugeno.zmn.hhw hhwVar = this.rje;
        if (hhwVar != null) {
            hhwVar.fs();
        }
        bvs bvsVar = this.sxr;
        if (bvsVar != null) {
            bvsVar.btk();
        }
        if (this.quu != null && fs(10)) {
            this.quu.zmn();
        }
        if (this.uaq != null && fs(9)) {
            this.uaq.zmn();
        }
        btk btkVar = this.tj;
        if (btkVar != null) {
            btkVar.zmn();
        }
        this.mf = System.currentTimeMillis();
    }

    public void zg() {
        iv ivVar = this.vgx;
        if (ivVar != null) {
            ivVar.fs();
        }
        com.bytedance.adsdk.ugeno.zmn.zmn zmnVar = this.hwg;
        if (zmnVar != null) {
            zmnVar.zn();
        }
        com.bytedance.adsdk.ugeno.zmn.hhw hhwVar = this.rje;
        if (hhwVar != null) {
            hhwVar.zn();
        }
    }

    public cn uqh() {
        return this.uw;
    }

    public long bjh() {
        return this.mf;
    }

    public boolean fs(int i) {
        Map<Integer, com.bytedance.adsdk.ugeno.core.mw> map = this.vtz;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    public void zn(int i) {
        ViewParent viewParent = (ViewGroup) this.btk.getParent();
        if (viewParent instanceof fs) {
            ((fs) viewParent).zn(this.btk, i);
        } else {
            this.btk.setVisibility(i);
        }
    }

    public void zmn(cyb cybVar) {
        this.wq = cybVar;
    }

    public void zmn(cn cnVar) {
        this.uw = cnVar;
    }

    public void zn(JSONObject jSONObject) {
        this.zn = jSONObject;
    }

    public JSONObject rp() {
        return this.zn;
    }

    protected void kjb() {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        if (TextUtils.isEmpty(this.ww)) {
            if (this.mig) {
                zmn(this.ouf);
                return;
            } else {
                this.vpd.setColor(this.nu);
                fb(this.nu);
                return;
            }
        }
        if (this.ww.startsWith("local://")) {
            String replace = this.ww.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = this.vlj ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap decodeStream = BitmapFactory.decodeStream(this.fs.getResources().openRawResource(com.bytedance.adsdk.ugeno.nps.fb.fs(this.fs, replace)), null, options);
                if (this.vlj) {
                    Bitmap zmn = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, decodeStream, (int) this.jy);
                    if (zmn != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.fs.getResources(), zmn);
                        zmn(bitmapDrawable2);
                        return;
                    }
                    bitmapDrawable = new BitmapDrawable(this.fs.getResources(), decodeStream);
                } else {
                    bitmapDrawable = new BitmapDrawable(this.fs.getResources(), decodeStream);
                }
                bitmapDrawable2 = bitmapDrawable;
                zmn(bitmapDrawable2);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        zak();
    }

    protected void zak() {
        com.bytedance.adsdk.ugeno.btk.zmn().fs().zmn(this.bvs, this.ww, new zmn.InterfaceC0116zmn() { // from class: com.bytedance.adsdk.ugeno.fs.zn.4
            @Override // com.bytedance.adsdk.ugeno.zmn.InterfaceC0116zmn
            public void zmn(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                zn znVar = zn.this;
                if (znVar.vlj) {
                    final Bitmap zmn = com.bytedance.adsdk.ugeno.nps.zg.zmn(znVar.fs, bitmap, (int) znVar.jy);
                    if (zmn != null) {
                        com.bytedance.adsdk.ugeno.nps.zg.zmn(new Runnable() { // from class: com.bytedance.adsdk.ugeno.fs.zn.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                zn.this.zmn(new BitmapDrawable(zmn));
                            }
                        });
                        return;
                    }
                    return;
                }
                com.bytedance.adsdk.ugeno.nps.zg.zmn(new Runnable() { // from class: com.bytedance.adsdk.ugeno.fs.zn.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        zn.this.zmn(new BitmapDrawable(bitmap));
                    }
                });
            }
        });
    }

    protected void zmn(zmn.C0112zmn c0112zmn) {
        if (c0112zmn == null) {
            return;
        }
        this.vpd.setShape(0);
        this.vpd.setOrientation(c0112zmn.zmn);
        if (Build.VERSION.SDK_INT >= 29) {
            this.vpd.setColors(c0112zmn.fs, c0112zmn.zn);
        } else {
            this.vpd.setColors(c0112zmn.fs);
        }
        tet();
        bxw();
        this.btk.setBackground(this.vpd);
    }

    protected void fb(int i) {
        this.vpd.setShape(0);
        this.vpd.setColor(i);
        tet();
        bxw();
        this.btk.setBackground(this.vpd);
    }

    private void bxw() {
        if (TextUtils.equals("dashed", this.ve)) {
            GradientDrawable gradientDrawable = this.vpd;
            float f = this.yo;
            gradientDrawable.setStroke((int) f, this.xrr, 3.0f * f, f);
        } else {
            if (TextUtils.equals("dotted", this.ve)) {
                GradientDrawable gradientDrawable2 = this.vpd;
                float f2 = this.yo;
                gradientDrawable2.setStroke((int) f2, this.xrr, f2 / 2.0f, f2);
                return;
            }
            this.vpd.setStroke((int) this.yo, this.xrr);
        }
    }

    private void tet() {
        float f = this.na ? this.cud : this.dgt;
        float f2 = this.mhu ? this.uqd : this.dgt;
        float f3 = this.bxw ? this.gn : this.dgt;
        float f4 = this.tet ? this.kra : this.dgt;
        this.vpd.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    protected void zmn(Drawable drawable) {
        this.btk.setBackground(drawable);
    }

    public void zmn(ViewGroup.LayoutParams layoutParams) {
        T t = this.btk;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.lbc = layoutParams;
    }

    public ViewGroup.LayoutParams am() {
        return this.lbc;
    }

    public void zmn(boolean z, boolean z2) {
        if (this.btk != null) {
            zmn(this.lbc);
            if (z) {
                btk((int) this.mw);
            }
            if (z2) {
                hhw((int) this.rt);
            }
        }
    }

    public void zmn(nps.zmn zmnVar) {
        this.zg = zmnVar;
    }

    public nps.zmn yj() {
        return this.zg;
    }

    public zn<T> btk(String str) {
        return zmn(str);
    }

    protected zn<T> zmn(String str) {
        if (TextUtils.isEmpty(this.rc) || !TextUtils.equals(this.rc, str)) {
            return null;
        }
        return this;
    }

    public zn<T> hhw(String str) {
        return fs(str);
    }

    protected zn<T> fs(String str) {
        if (TextUtils.isEmpty(this.klz) || !TextUtils.equals(this.klz, str)) {
            return null;
        }
        return this;
    }

    public zn<T> nps(String str) {
        return zn(str);
    }

    protected zn<T> zn(String str) {
        if (!TextUtils.isEmpty(this.klz) && TextUtils.equals(this.klz, str) && this.cd == 0) {
            return this;
        }
        return null;
    }

    public zn<T> zg(String str) {
        return fb(str);
    }

    protected zn<T> fb(String str) {
        if (klz(str) != null) {
            return this;
        }
        return null;
    }

    public void zmn(boolean z) {
        this.iv = z;
    }

    public boolean so() {
        return this.iv;
    }

    public zmn ev() {
        return this.hhw;
    }

    public void zmn(zmn zmnVar) {
        this.hhw = zmnVar;
    }

    public void bvs(String str) {
        this.rc = str;
    }

    public String tf() {
        return this.rc;
    }

    public void iv(String str) {
        this.klz = str;
    }

    public String fkt() {
        return this.klz;
    }

    public int hgd() {
        return (int) this.mw;
    }

    public int nu() {
        return (int) this.rt;
    }

    public void zmn(rc rcVar) {
        this.bvs = rcVar;
    }

    public boolean ww() {
        return this.f3733io;
    }

    public void zmn(zg zgVar) {
        this.utx = zgVar;
    }

    public int oub() {
        return this.nu;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c = 0;
                    break;
                }
                break;
            case -1901681170:
                if (str.equals("onRenderSuccess")) {
                    c = 1;
                    break;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    c = 2;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c = 3;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c = 4;
                    break;
                }
                break;
            case -1375815020:
                if (str.equals("minWidth")) {
                    c = 5;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c = 6;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c = 7;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c = '\b';
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c = '\t';
                    break;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    c = '\n';
                    break;
                }
                break;
            case -1332194002:
                if (str.equals(M2.g)) {
                    c = 11;
                    break;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    c = '\f';
                    break;
                }
                break;
            case -1267206133:
                if (str.equals(VastAttributes.OPACITY)) {
                    c = '\r';
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c = 14;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = 15;
                    break;
                }
                break;
            case -1081309778:
                if (str.equals(VastAttributes.MARGIN)) {
                    c = 16;
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c = 17;
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c = 18;
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c = 19;
                    break;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    c = 20;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 21;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 22;
                    break;
                }
                break;
            case -806339567:
                if (str.equals(VastAttributes.PADDING)) {
                    c = 23;
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c = 24;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c = 25;
                    break;
                }
                break;
            case -133587431:
                if (str.equals("minHeight")) {
                    c = 26;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c = 27;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c = 28;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 29;
                    break;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    c = 30;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c = 31;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = ' ';
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c = '!';
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c = '\"';
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c = '#';
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = '$';
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c = '%';
                    break;
                }
                break;
            case 314070383:
                if (str.equals("animations")) {
                    c = '&';
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c = '\'';
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c = '(';
                    break;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c = ')';
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c = '*';
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c = '+';
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c = ',';
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c = '-';
                    break;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c = '.';
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c = '/';
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c = '0';
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c = '1';
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c = '2';
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c = '3';
                    break;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    c = '4';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c = '5';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c = '6';
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = '7';
                    break;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    c = '8';
                    break;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    c = '9';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = ':';
                    break;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    c = ';';
                    break;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    c = '<';
                    break;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    c = B5.U;
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c = '>';
                    break;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    c = '?';
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c = '@';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY)) {
                    c = 'A';
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c = 'B';
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c = 'C';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.qr = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 18:
            case '!':
            case '\'':
            case '0':
            case '3':
            case '6':
            case '>':
            case '@':
                fs(str, str2);
                break;
            case 2:
                this.zmn = true;
                this.nkt = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case 3:
                this.ob = true;
                this.oep = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case 4:
                this.kjb = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.ev = true;
                break;
            case 5:
                this.iqz = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case 11:
            case '7':
                if (com.bytedance.adsdk.ugeno.nps.zmn.zn(str2)) {
                    this.mig = true;
                    this.ouf = com.bytedance.adsdk.ugeno.nps.zmn.fs(str2);
                    break;
                } else {
                    this.nu = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2, 0);
                    this.mig = false;
                    break;
                }
            case '\f':
                this.sxr = bvs.zmn(this, str2);
                break;
            case '\r':
                this.dey = true;
                this.hsp = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1.0f);
                break;
            case 14:
                this.cud = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.na = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.rt = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.rt = -2.0f;
                } else {
                    this.rt = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                }
                this.ze = true;
                break;
            case 16:
                this.cn = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                break;
            case 17:
                this.kgc = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.uqh = true;
                break;
            case 19:
            case '8':
                this.ww = str2;
                break;
            case 20:
                this.hip = true;
                this.ax = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case 21:
                this.tev = true;
                this.mpi = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case 22:
                this.rsi = true;
                this.skn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case 23:
                this.rp = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.so = true;
                break;
            case 24:
                this.hz = str2;
                break;
            case 25:
                this.kw = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.bjh = true;
                break;
            case 26:
                this.phc = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case 27:
                this.rc = str2;
                break;
            case 28:
                this.pw = com.bytedance.adsdk.ugeno.nps.fs.zmn(str2, (JSONObject) null);
                break;
            case 29:
                this.klz = str2;
                break;
            case 30:
                float zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                this.jy = zmn;
                if (zmn > 0.0f) {
                    this.vlj = true;
                    break;
                }
                break;
            case 31:
                this.am = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.fkt = true;
                break;
            case ' ':
                this.lwz = str2;
                break;
            case '\"':
                this.lt = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case '#':
                this.tev = true;
                this.rsi = true;
                float[] fs = com.bytedance.adsdk.ugeno.zmn.fb.fs(str2, this.fb);
                this.mpi = fs[0];
                this.skn = fs[1];
                break;
            case '$':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.mw = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.mw = -2.0f;
                } else {
                    this.mw = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                }
                this.my = true;
                break;
            case '%':
                this.yj = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.hgd = true;
                break;
            case '&':
                List<com.bytedance.adsdk.ugeno.zmn.zn> zmn2 = com.bytedance.adsdk.ugeno.zmn.fb.zmn(str2, this.fb);
                if (zmn2 != null && !zmn2.isEmpty()) {
                    this.rje = new com.bytedance.adsdk.ugeno.zmn.hhw(this.fs, this, zmn2);
                    break;
                }
                break;
            case '(':
                this.uqd = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.mhu = true;
                break;
            case ')':
                this.lgz = rt(str2);
                break;
            case '*':
                this.gn = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.bxw = true;
                break;
            case '+':
                this.kra = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.tet = true;
                break;
            case ',':
                this.zak = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.tf = true;
                break;
            case '-':
                this.xrr = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case '.':
                this.ve = str2;
                break;
            case '/':
                this.yo = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                break;
            case '1':
                this.olo = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.nqi = true;
                break;
            case '2':
                this.zmn = true;
                this.ob = true;
                float[] fs2 = com.bytedance.adsdk.ugeno.zmn.fb.fs(str2, this.fb);
                this.nkt = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, fs2[0]);
                this.oep = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, fs2[1]);
                break;
            case '4':
                try {
                    this.hwg = new com.bytedance.adsdk.ugeno.zmn.zmn(this.fs, this, com.bytedance.adsdk.ugeno.zmn.fb.zmn(new JSONObject(str2), this.fb));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            case '5':
                this.ljl = com.bytedance.adsdk.ugeno.core.zmn.zmn(str2, this);
                break;
            case '9':
                this.yof = true;
                this.oub = mw(str2);
                break;
            case ':':
                this.dgt = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                break;
            case ';':
                this.eug = true;
                this.obg = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case '<':
                this.mrt = true;
                this.nlz = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case '=':
                this.es = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case '?':
                this.va = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, false);
                break;
            case 'A':
                if (TextUtils.equals(VastAttributes.VISIBLE, str2)) {
                    this.cd = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.cd = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.cd = 8;
                }
                this.btk.setVisibility(this.cd);
                break;
            case 'B':
                this.cyb = com.bytedance.adsdk.ugeno.nps.zg.zmn(this.fs, str2);
                this.doe = true;
                break;
            case 'C':
                this.f3733io = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    private ImageView.ScaleType mw(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.oub = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.oub = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.oub = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.oub = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.oub;
    }

    private boolean rt(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    protected void fs(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.vtz == null) {
            return;
        }
        try {
            int zmn = com.bytedance.adsdk.ugeno.core.rt.zmn(str).zmn();
            com.bytedance.adsdk.ugeno.core.mw mwVar = new com.bytedance.adsdk.ugeno.core.mw();
            mwVar.zmn(zmn);
            mwVar.zmn(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (zmn == 3) {
                try {
                    this.fw = Float.parseFloat(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("shakeAmplitude"), this.fb));
                } catch (NumberFormatException unused) {
                    this.fw = 12.0f;
                }
            }
            if (!(this.uw instanceof com.bytedance.adsdk.ugeno.core.zmn.fs)) {
                zmn(zmn, jSONObject, mwVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    @Deprecated
    protected void zmn(int i, JSONObject jSONObject, com.bytedance.adsdk.ugeno.core.mw mwVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("success");
        if (optJSONObject != null) {
            com.bytedance.adsdk.ugeno.core.mw mwVar2 = new com.bytedance.adsdk.ugeno.core.mw();
            mwVar2.zmn(optJSONObject);
            mwVar2.zmn(this);
            mwVar.zmn(mwVar2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(X3.g.e);
        if (optJSONObject2 != null) {
            com.bytedance.adsdk.ugeno.core.mw mwVar3 = new com.bytedance.adsdk.ugeno.core.mw();
            mwVar3.zmn(optJSONObject2);
            mwVar3.zmn(this);
            mwVar.fs(mwVar3);
        }
        mwVar.zmn(jSONObject);
        this.vtz.put(Integer.valueOf(i), mwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fb
    public void btk() {
        if (this.pf == null || this.gt) {
            return;
        }
        this.gt = true;
    }

    @Override // com.bytedance.adsdk.ugeno.fb
    public void hhw() {
        if (this.pf == null || this.ji) {
            return;
        }
        this.ji = true;
    }

    @Override // com.bytedance.adsdk.ugeno.fb
    public int[] zmn(int i, int i2) {
        if (this.lt > 0.0f) {
            if (this.my) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.lt;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.ze) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.lt;
                if (f2 != 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.pf != null && !this.wd) {
            this.wd = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.fb
    public void zmn(int i, int i2, int i3, int i4) {
        if (this.pf == null || this.kh) {
            return;
        }
        this.kh = true;
    }

    @Override // com.bytedance.adsdk.ugeno.fb
    public void zmn(Canvas canvas, IAnimation iAnimation) {
        iv ivVar = this.vgx;
        if (ivVar != null) {
            ivVar.zmn(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fb
    public void zmn(Canvas canvas) {
        if (this instanceof zmn) {
            return;
        }
        com.bytedance.adsdk.ugeno.zmn.zmn zmnVar = this.hwg;
        if (zmnVar != null) {
            zmnVar.zmn(canvas);
        }
        com.bytedance.adsdk.ugeno.zmn.hhw hhwVar = this.rje;
        if (hhwVar != null) {
            hhwVar.zmn(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fb
    public void fs(Canvas canvas) {
        if (this instanceof zmn) {
            com.bytedance.adsdk.ugeno.zmn.zmn zmnVar = this.hwg;
            if (zmnVar != null) {
                zmnVar.fs(canvas);
            }
            com.bytedance.adsdk.ugeno.zmn.hhw hhwVar = this.rje;
            if (hhwVar != null) {
                hhwVar.fs(canvas);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fb
    public void fs(int i, int i2, int i3, int i4) {
        iv ivVar = this.vgx;
        if (ivVar != null) {
            ivVar.zmn(i, i2);
        }
        com.bytedance.adsdk.ugeno.zmn.zmn zmnVar = this.hwg;
        if (zmnVar != null) {
            zmnVar.zmn(i, i2);
        }
        com.bytedance.adsdk.ugeno.zmn.hhw hhwVar = this.rje;
        if (hhwVar != null) {
            hhwVar.zmn(i, i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.cn.fs
    public void zmn(com.bytedance.adsdk.ugeno.core.mw mwVar) {
        zmn<ViewGroup> zmnVar;
        zn<T> btk;
        if (mwVar == null || mwVar.zn() == null || !TextUtils.equals(mwVar.zn().optString("type"), "onDismiss")) {
            return;
        }
        String optString = mwVar.zn().optString("nodeId");
        zn(8);
        this.nps = (zmn) fs(this);
        if (TextUtils.isEmpty(optString) || (zmnVar = this.nps) == null || (btk = zmnVar.btk(optString)) == null) {
            return;
        }
        btk.zn(8);
    }

    public void zmn(com.bytedance.adsdk.ugeno.fb.zmn.zmn zmnVar) {
        this.zq = zmnVar;
    }

    public com.bytedance.adsdk.ugeno.fb.zmn.zmn jy() {
        return this.zq;
    }

    public zn fs(zn znVar) {
        return (znVar.ev() == null && (znVar instanceof zmn)) ? znVar : fs(znVar.ev());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        btk btkVar;
        cn cnVar;
        com.bytedance.adsdk.ugeno.core.fs.zn znVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            vlj();
        } else if (action == 1 || action == 3) {
            yof();
        }
        cyb cybVar = this.wq;
        if (cybVar != null) {
            cybVar.zmn(this, motionEvent);
        }
        if (fs(17) && motionEvent.getAction() == 0) {
            this.uw.zmn(this.vtz.get(17), this, this);
        }
        if (fs(1) && this.sl && (cnVar = this.uw) != null && (znVar = this.pl) != null) {
            return znVar.zmn(cnVar, this, motionEvent);
        }
        cn cnVar2 = this.uw;
        if (cnVar2 != null && (btkVar = this.tj) != null) {
            return btkVar.zmn(cnVar2, this, motionEvent, mhu());
        }
        bvs bvsVar = this.sxr;
        if (bvsVar != null) {
            return bvsVar.zmn(motionEvent);
        }
        return false;
    }

    public boolean dgt() {
        return this.lt > 0.0f;
    }

    public float cud() {
        T t = this.btk;
        if (t instanceof com.bytedance.adsdk.ugeno.zmn.nps) {
            return ((com.bytedance.adsdk.ugeno.zmn.nps) t).getRipple();
        }
        return 0.0f;
    }

    public float gn() {
        T t = this.btk;
        if (t instanceof com.bytedance.adsdk.ugeno.zmn.nps) {
            return ((com.bytedance.adsdk.ugeno.zmn.nps) t).getShine();
        }
        return 0.0f;
    }

    public float uqd() {
        T t = this.btk;
        if (t instanceof com.bytedance.adsdk.ugeno.zmn.nps) {
            return ((com.bytedance.adsdk.ugeno.zmn.nps) t).getStretch();
        }
        return 0.0f;
    }

    public float kra() {
        T t = this.btk;
        if (t instanceof com.bytedance.adsdk.ugeno.zmn.nps) {
            return ((com.bytedance.adsdk.ugeno.zmn.nps) t).getRubIn();
        }
        return 0.0f;
    }

    public void btk(int i) {
        if (so()) {
            T t = this.btk;
            if (t instanceof fs) {
                ((fs) t).zmn(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof fs) {
                ((fs) viewParent).zmn(this.btk, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.btk.getLayoutParams();
        layoutParams.width = i;
        this.btk.setLayoutParams(layoutParams);
    }

    public void hhw(int i) {
        if (so()) {
            T t = this.btk;
            if (t instanceof fs) {
                ((fs) t).fs(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof fs) {
                ((fs) viewParent).fs(this.btk, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.btk.getLayoutParams();
        layoutParams.height = i;
        this.btk.setLayoutParams(layoutParams);
    }

    public boolean na() {
        return this.va;
    }

    public List<com.bytedance.adsdk.ugeno.fb.fb.zn> rc(String str) {
        bvs bvsVar;
        if (TextUtils.isEmpty(str) || (bvsVar = this.sxr) == null) {
            return null;
        }
        return bvsVar.zmn(str);
    }

    public void zmn(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> rc = rc(str);
        if (rc == null || rc.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar : rc) {
            znVar.zmn(this.sxr);
            znVar.zmn(objArr);
        }
    }

    public void zmn(com.bytedance.adsdk.ugeno.core.btk btkVar) {
        bvs bvsVar = this.sxr;
        if (bvsVar != null) {
            bvsVar.zmn(btkVar);
        }
    }

    public com.bytedance.adsdk.ugeno.zmn.zmn klz(String str) {
        com.bytedance.adsdk.ugeno.zmn.zmn zmnVar = this.hwg;
        if (zmnVar != null && TextUtils.equals(str, zmnVar.btk())) {
            return this.hwg;
        }
        com.bytedance.adsdk.ugeno.zmn.hhw hhwVar = this.rje;
        if (hhwVar != null) {
            return hhwVar.zmn(str);
        }
        return null;
    }

    public void zmn(hhw hhwVar) {
        this.bmc = hhwVar;
    }

    public boolean mhu() {
        return this.pa;
    }

    public void zmn(rt rtVar) {
        bvs bvsVar = this.sxr;
        if (bvsVar != null) {
            bvsVar.zmn(rtVar);
        }
        this.hr = rtVar;
    }

    public void zmn(mw mwVar) {
        bvs bvsVar = this.sxr;
        if (bvsVar != null) {
            bvsVar.zmn(mwVar);
        }
        this.br = mwVar;
    }
}
