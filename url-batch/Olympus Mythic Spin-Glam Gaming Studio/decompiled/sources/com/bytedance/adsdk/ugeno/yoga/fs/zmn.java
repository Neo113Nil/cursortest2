package com.bytedance.adsdk.ugeno.yoga.fs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.fs.zmn;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.bytedance.adsdk.ugeno.yoga.btk;
import com.bytedance.adsdk.ugeno.yoga.fb;
import com.bytedance.adsdk.ugeno.yoga.fs.zn;
import com.bytedance.adsdk.ugeno.yoga.hhw;
import com.bytedance.adsdk.ugeno.yoga.iv;
import com.bytedance.adsdk.ugeno.yoga.mw;
import com.bytedance.adsdk.ugeno.yoga.rt;
import com.bytedance.adsdk.ugeno.zmn;

/* loaded from: classes12.dex */
public class zmn extends com.bytedance.adsdk.ugeno.fs.zmn<zn> {
    private com.bytedance.adsdk.ugeno.yoga.zmn eug;
    private com.bytedance.adsdk.ugeno.yoga.zmn hip;
    private iv mrt;
    private btk ob;
    private hhw rsi;
    private rt tev;

    public zmn(Context context) {
        super(context);
        this.ob = btk.ROW;
        this.tev = rt.NO_WRAP;
        this.rsi = hhw.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.zmn zmnVar = com.bytedance.adsdk.ugeno.yoga.zmn.STRETCH;
        this.hip = zmnVar;
        this.eug = zmnVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public zn zmn() {
        zn znVar = new zn(this.fs);
        znVar.zmn(this);
        this.mrt = znVar.getYogaNode();
        return znVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    protected void zak() {
        ImageView.ScaleType scaleType;
        if (this.vlj) {
            com.bytedance.adsdk.ugeno.btk.zmn().fs().zmn(this.bvs, this.ww, new zmn.InterfaceC0116zmn() { // from class: com.bytedance.adsdk.ugeno.yoga.fs.zmn.1
                @Override // com.bytedance.adsdk.ugeno.zmn.InterfaceC0116zmn
                public void zmn(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).bmc != null) {
                            com.bytedance.adsdk.ugeno.core.hhw unused = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).bmc;
                            String unused2 = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).ww;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).bmc != null) {
                        com.bytedance.adsdk.ugeno.core.hhw unused3 = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).bmc;
                        String unused4 = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).ww;
                    }
                    final Bitmap zmn = zg.zmn(((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).fs, bitmap, (int) ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).jy);
                    if (zmn != null) {
                        zg.zmn(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.fs.zmn.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                zmn.this.zmn(new BitmapDrawable(zmn));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.bvs.fb.zmn zmnVar = new com.bytedance.adsdk.ugeno.bvs.fb.zmn(this.fs);
        com.bytedance.adsdk.ugeno.btk.zmn().fs().zmn(this.bvs, this.ww, zmnVar, this.btk.getWidth(), this.btk.getHeight(), new zmn.InterfaceC0116zmn() { // from class: com.bytedance.adsdk.ugeno.yoga.fs.zmn.2
            @Override // com.bytedance.adsdk.ugeno.zmn.InterfaceC0116zmn
            public void zmn(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).bmc != null) {
                        com.bytedance.adsdk.ugeno.core.hhw unused = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).bmc;
                        String unused2 = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).ww;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).bmc != null) {
                    com.bytedance.adsdk.ugeno.core.hhw unused3 = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).bmc;
                    String unused4 = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).ww;
                }
            }
        });
        if (!this.yof || (scaleType = this.oub) == ImageView.ScaleType.FIT_XY) {
            zmnVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            zmnVar.setScaleType(scaleType);
        }
        zmnVar.setCornerRadius(this.dgt);
        zn.zmn zmnVar2 = new zn.zmn(-1, -1);
        zmnVar2.hhw(mw.ABSOLUTE.zmn());
        zmnVar2.nps(0.0f);
        zmnVar2.zg(0.0f);
        T t = this.btk;
        if (t instanceof zn) {
            ((zn) t).addView(zmnVar, 0, zmnVar2);
            zmn(zmnVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    protected void zmn(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.bvs.fb.zmn zmnVar = new com.bytedance.adsdk.ugeno.bvs.fb.zmn(this.fs);
        zmnVar.setImageDrawable(drawable);
        if (!this.yof || (scaleType = this.oub) == ImageView.ScaleType.FIT_XY) {
            zmnVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            zmnVar.setScaleType(scaleType);
        }
        zmnVar.setCornerRadius(this.dgt);
        zn.zmn zmnVar2 = new zn.zmn(-1, -1);
        zmnVar2.hhw(mw.ABSOLUTE.zmn());
        zmnVar2.nps(0.0f);
        zmnVar2.zg(0.0f);
        T t = this.btk;
        if (t instanceof zn) {
            ((zn) t).addView(zmnVar, 0, zmnVar2);
            zmn(zmnVar);
        }
    }

    private void zmn(final com.bytedance.adsdk.ugeno.bvs.fb.zmn zmnVar) {
        this.btk.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.fs.zmn.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                iv zmn;
                if (((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).btk == null || (zmn = ((zn) ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).btk).zmn(zmnVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).btk.getWidth();
                zmn.fb(width);
                int height = ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).btk.getHeight();
                zmn.hhw(height);
                zmnVar.setCornerRadius(((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).dgt);
                ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).btk.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.fs.zn) zmn.this).btk.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        this.mrt.zmn(this.ob);
        this.mrt.zmn(this.tev);
        this.mrt.zmn(this.rsi);
        this.mrt.zmn(this.hip);
        this.mrt.zn(this.eug);
        this.mrt.zmn(true);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    protected void rt() {
        if (this.so) {
            this.mrt.fs(fb.ALL, this.rp);
        }
        if (this.ev) {
            this.mrt.fs(fb.LEFT, this.kjb);
        }
        if (this.tf) {
            this.mrt.fs(fb.RIGHT, this.zak);
        }
        if (this.fkt) {
            this.mrt.fs(fb.TOP, this.am);
        }
        if (this.hgd) {
            this.mrt.fs(fb.BOTTOM, this.yj);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        super.zmn(znVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, ViewGroup.LayoutParams layoutParams) {
        if (znVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.add(znVar);
        View rc = znVar.rc();
        if (rc != null) {
            ((zn) this.btk).addView(rc, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public C0114zmn iv() {
        return new C0114zmn(this);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.hip = com.bytedance.adsdk.ugeno.yoga.zmn.zmn(str2);
                break;
            case "flexDirection":
                this.ob = btk.zmn(str2);
                break;
            case "alignContent":
                this.eug = com.bytedance.adsdk.ugeno.yoga.zmn.zmn(str2);
                break;
            case "flexWrap":
                this.tev = rt.zmn(str2);
                break;
            case "justifyContent":
                this.rsi = hhw.zmn(str2);
                break;
        }
    }

    public btk bxw() {
        return this.ob;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.fs.zmn$zmn, reason: collision with other inner class name */
    public static class C0114zmn extends zmn.C0110zmn {
        public int am;
        private boolean dgt;
        public int ev;
        public int fkt;
        public int hgd;
        private boolean jy;
        public float kjb;
        public float nu;
        private boolean oub;
        public int rp;
        public int so;
        public int tf;
        private boolean vlj;
        private boolean ww;
        public float yj;
        private boolean yof;
        public float zak;

        public C0114zmn(com.bytedance.adsdk.ugeno.fs.zmn zmnVar) {
            super(zmnVar);
            this.rp = 1;
            this.kjb = 0.0f;
            this.zak = 1.0f;
            this.am = com.bytedance.adsdk.ugeno.yoga.zmn.AUTO.zmn();
            this.yj = -1.0f;
            this.so = mw.RELATIVE.zmn();
        }

        @Override // com.bytedance.adsdk.ugeno.fs.zmn.C0110zmn
        public void zmn(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.zmn(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasis":
                    this.ww = true;
                    float zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, -1.0f);
                    this.yj = zmn;
                    this.yj = zg.zmn(context, zmn);
                    break;
                case "bottom":
                    this.jy = true;
                    this.tf = (int) zg.zmn(context, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0));
                    break;
                case "top":
                    this.oub = true;
                    this.ev = (int) zg.zmn(context, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0));
                    break;
                case "left":
                    this.vlj = true;
                    this.fkt = (int) zg.zmn(context, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0));
                    break;
                case "order":
                    this.rp = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1);
                    break;
                case "ratio":
                    this.dgt = true;
                    this.nu = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                    break;
                case "right":
                    this.yof = true;
                    this.hgd = (int) zg.zmn(context, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0));
                    break;
                case "position":
                    this.so = mw.zmn(str2).zmn();
                    break;
                case "flexShrink":
                    this.zak = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.kjb = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.am = com.bytedance.adsdk.ugeno.yoga.zmn.zmn(str2).zmn();
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.fs.zmn.C0110zmn
        /* renamed from: fs, reason: merged with bridge method [inline-methods] */
        public zn.zmn zmn() {
            fb();
            zn.zmn zmnVar = new zn.zmn((int) this.zmn, (int) this.fs);
            zmnVar.klz((int) (this.iqz ? this.hhw : this.btk));
            zmnVar.rt((int) (this.phc ? this.nps : this.btk));
            zmnVar.rc((int) (this.doe ? this.zg : this.btk));
            zmnVar.mw((int) (this.nqi ? this.bvs : this.btk));
            zmnVar.zmn(this.rp);
            zmnVar.btk(this.am);
            zmnVar.fs(this.kjb);
            zmnVar.zn(this.zak);
            zmnVar.cyb(this.zn);
            zmnVar.olo(this.fb);
            if (this.ww) {
                zmnVar.fb(this.yj);
            }
            zmnVar.hhw(this.so);
            if (this.oub) {
                zmnVar.nps(this.ev);
            }
            if (this.jy) {
                zmnVar.bvs(this.tf);
            }
            if (this.vlj) {
                zmnVar.zg(this.fkt);
            }
            if (this.yof) {
                zmnVar.iv(this.hgd);
            }
            if (this.dgt && zn()) {
                float f = this.nu;
                if (f > 0.0f) {
                    zmnVar.cn(f);
                    zmnVar.zn(0.0f);
                    zmnVar.fs(0.0f);
                }
            }
            return zmnVar;
        }

        public boolean zn() {
            float f = this.zmn;
            if (f == -1.0f && this.fs == -1.0f) {
                return false;
            }
            return f == -2.0f || this.fs == -2.0f;
        }

        private void fb() {
            com.bytedance.adsdk.ugeno.fs.zmn zmnVar = this.bjh;
            if (zmnVar instanceof zmn) {
                if (((zmn) zmnVar).bxw() == btk.ROW && this.bjh.hgd() == -2 && this.zmn == -1.0f && !this.bjh.dgt()) {
                    this.zmn = -2.0f;
                    this.zak = 1.0f;
                    this.kjb = 1.0f;
                    this.ww = true;
                    this.yj = -1.0f;
                }
                if (((zmn) this.bjh).bxw() == btk.COLUMN && this.bjh.nu() == -2 && this.fs == -1.0f && !this.bjh.dgt()) {
                    this.fs = -2.0f;
                    this.zak = 1.0f;
                    this.kjb = 1.0f;
                    this.ww = true;
                    this.yj = -1.0f;
                }
            }
        }

        @Override // com.bytedance.adsdk.ugeno.fs.zmn.C0110zmn
        public String toString() {
            return "LayoutParams{mOrder=" + this.rp + ", mFlexGrow=" + this.kjb + ", mFlexShrink=" + this.zak + ", mAlignSelf=" + this.am + ", mFlexBasis=" + this.yj + ", mPosition=" + this.so + ", mTop=" + this.ev + ", mBottom=" + this.tf + ", mLeft=" + this.fkt + ", mRight=" + this.hgd + '}';
        }
    }
}
