package com.bytedance.adsdk.ugeno.bvs.zmn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.btk;
import com.bytedance.adsdk.ugeno.bvs.hhw.fs;
import com.bytedance.adsdk.ugeno.fs.zn;
import com.bytedance.adsdk.ugeno.nps.fb;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.bytedance.adsdk.ugeno.nps.zmn;
import com.bytedance.adsdk.ugeno.zmn;

/* loaded from: classes10.dex */
public class zmn extends fs {
    private zmn.C0112zmn dey;
    private String eug;
    private String hip;
    private int lgz;
    private int mrt;
    private String rsi;
    private String tev;
    private boolean va;
    private boolean vpd;

    public zmn(Context context) {
        super(context);
        this.rsi = "row";
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.hhw.fs, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        fb();
        ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    protected void vlj() {
        super.vlj();
        if (this.va) {
            ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setTextColor(this.lgz);
        }
        if (this.vpd) {
            if (this.mig) {
                zmn(this.dey);
            } else {
                fb(this.mrt);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    protected void yof() {
        super.yof();
        if (this.va) {
            ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setTextColor(((fs) this).ob);
        }
        if (this.vpd) {
            if (this.mig) {
                zmn(this.ouf);
            } else {
                fb(this.nu);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void fs(Drawable drawable) {
        char c;
        if (drawable == null) {
            return;
        }
        String str = this.rsi;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 113114:
                if (str.equals("row")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            return;
        }
        if (c == 1) {
            ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (c == 2) {
            ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        } else {
            ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void mw(String str) {
        Context context = this.fs;
        fs(zg.zmn(context, fb.fs(context, str)));
    }

    private void fb() {
        if (TextUtils.isEmpty(this.tev)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setCompoundDrawables(null, null, null, null);
        if (this.tev.startsWith("local://")) {
            try {
                mw(this.tev.replace("local://", ""));
            } catch (Throwable unused) {
            }
        } else {
            btk.zmn().fs().zmn(this.bvs, this.tev, new zmn.InterfaceC0116zmn() { // from class: com.bytedance.adsdk.ugeno.bvs.zmn.zmn.1
                @Override // com.bytedance.adsdk.ugeno.zmn.InterfaceC0116zmn
                public void zmn(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    zg.zmn(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bvs.zmn.zmn.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            zmn.this.fs(new BitmapDrawable(((zn) zmn.this).fs.getResources(), bitmap));
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.hhw.fs, com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "direction":
                this.rsi = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.lgz = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                this.va = true;
                break;
            case "image":
                this.tev = str2;
                break;
            case "highlightImage":
                this.hip = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.nps.zmn.zn(str2)) {
                    this.mig = true;
                    this.dey = com.bytedance.adsdk.ugeno.nps.zmn.fs(str2);
                } else {
                    this.mrt = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                    this.mig = false;
                }
                this.vpd = true;
                break;
            case "highlightBackgroundImage":
                this.eug = str2;
                break;
        }
    }
}
