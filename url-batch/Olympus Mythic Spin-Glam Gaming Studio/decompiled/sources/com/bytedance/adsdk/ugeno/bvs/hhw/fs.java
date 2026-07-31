package com.bytedance.adsdk.ugeno.bvs.hhw;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.fs.zn;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes6.dex */
public class fs extends zn<zmn> {
    private float ao;
    private int dey;
    private int eug;
    private int hip;
    private float hz;
    private int lgz;
    private float ljl;
    private float lwz;
    private int mrt;
    protected int ob;

    @Deprecated
    private float pl;
    private boolean quu;
    private float rsi;
    private float sl;
    private float tev;

    @Deprecated
    private float tj;
    private int uaq;

    @Deprecated
    private TextUtils.TruncateAt va;
    private float vgx;
    private TextUtils.TruncateAt vpd;
    protected String zmn;

    public fs(Context context) {
        super(context);
        this.ob = -16777216;
        this.tev = 12.0f;
        this.rsi = -1.0f;
        this.eug = Integer.MAX_VALUE;
        this.dey = 8388611;
        this.vpd = TextUtils.TruncateAt.END;
        this.lwz = -1.0f;
        this.ljl = 400.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public zmn zmn() {
        zmn zmnVar = new zmn(this.fs);
        zmnVar.zmn(this);
        return zmnVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        Typeface create;
        super.fs();
        if (TextUtils.equals(POBCommonConstants.NULL_VALUE, this.zmn)) {
            this.zmn = "";
        }
        rt(this.zmn);
        ((zmn) this.btk).setTextSize(1, this.tev);
        ((zmn) this.btk).setTextColor(this.ob);
        ((zmn) this.btk).setLines(this.mrt);
        ((zmn) this.btk).setMaxLines(this.eug);
        ((zmn) this.btk).setGravity(this.dey);
        ((zmn) this.btk).setIncludeFontPadding(false);
        ((zmn) this.btk).setMinTextSize(zg.zmn(this.fs, this.rsi));
        zmn(this.lgz);
        if (so()) {
            zmn(this.vpd);
        } else {
            zmn(this.va);
        }
        if (this.lwz > 0.0f) {
            if (so()) {
                bvs();
            } else {
                fb();
            }
        }
        int i = Build.VERSION.SDK_INT;
        ((zmn) this.btk).setBreakStrategy(0);
        if (so()) {
            if (this.quu) {
                if (this.hz <= 0.0f) {
                    this.hz = 1.0E-5f;
                }
                ((zmn) this.btk).setShadowLayer(this.hz, this.ao, this.vgx, this.uaq);
            }
        } else {
            ((zmn) this.btk).setShadowLayer(this.hz, this.pl, this.tj, this.uaq);
        }
        int i2 = this.hip;
        if (i2 == 1) {
            ((zmn) this.btk).setTypeface(Typeface.DEFAULT, i2);
        } else if (i >= 28) {
            create = Typeface.create(Typeface.DEFAULT, (int) this.ljl, i2 == 2);
            ((zmn) this.btk).setTypeface(create);
        } else if (this.ljl >= 500.0f) {
            ((zmn) this.btk).setTypeface(Typeface.DEFAULT, 1);
        }
        if (zg.zmn(this.fs, this.tev) > 0.0f) {
            ((zmn) this.btk).setLetterSpacing(this.sl / zg.zmn(this.fs, this.tev));
        }
    }

    private void fb() {
        ((zmn) this.btk).setLineSpacing(0.0f, this.lwz);
    }

    private void bvs() {
        float f = this.lwz;
        if (f <= 3.0f) {
            ((zmn) this.btk).setLineSpacing(0.0f, f);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int round = Math.round(zg.zmn(this.fs, (f - (this.tev * 1.2f)) / 2.0f));
            int paddingTop = ((zmn) this.btk).getPaddingTop() + round;
            int paddingBottom = ((zmn) this.btk).getPaddingBottom() + round;
            T t = this.btk;
            ((zmn) t).setPadding(((zmn) t).getPaddingLeft(), paddingTop, ((zmn) this.btk).getPaddingRight(), paddingBottom);
            ((zmn) this.btk).setLineHeight(Math.round(zg.zmn(this.fs, this.lwz)));
        }
    }

    public void rt(String str) {
        this.zmn = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(POBCommonConstants.NULL_VALUE, str)) {
            this.zmn = "";
        }
        ((zmn) this.btk).setText(this.zmn);
    }

    public void zmn(int i) {
        this.lgz = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((zmn) this.btk).setPaintFlags(i);
    }

    public void zmn(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((zmn) this.btk).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.hz = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "shadowColor":
                this.uaq = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                this.quu = true;
                break;
            case "shadowOffsetX":
                this.ao = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.vgx = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "textAlign":
                this.dey = olo(str2);
                break;
            case "textColor":
                this.ob = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case "textStyle":
                this.hip = cyb(str2);
                break;
            case "textSize":
                this.tev = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "textDecoration":
                this.lgz = kgc(str2);
                break;
            case "shadowDx":
                this.pl = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "shadowDy":
                this.tj = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "fontWeight":
                float zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, -1.0f);
                this.ljl = zmn;
                if (zmn < 1.0f || zmn > 1000.0f) {
                    this.ljl = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.lwz = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1.0f);
                break;
            case "text":
                this.zmn = str2;
                break;
            case "lines":
                this.mrt = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0);
                break;
            case "ellipsis":
                this.vpd = cn(str2);
                break;
            case "minTextSize":
                this.rsi = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, -1.0f);
                break;
            case "maxLines":
                int zmn2 = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, Integer.MAX_VALUE);
                this.eug = zmn2 > 0 ? zmn2 : Integer.MAX_VALUE;
                break;
            case "ellipsize":
                this.va = mw(str2);
                break;
            case "letterSpacing":
                this.sl = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
        }
    }

    private TextUtils.TruncateAt mw(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.va = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.va = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.va = TextUtils.TruncateAt.START;
                break;
            default:
                this.va = null;
                break;
        }
        return this.va;
    }

    private TextUtils.TruncateAt cn(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int cyb(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1178781136) {
            if (str.equals("italic")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -1039745817) {
            if (hashCode == 3029637 && str.equals("bold")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(Constants.NORMAL)) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private int olo(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -348726240:
                if (str.equals("center_vertical")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 1063616078:
                if (str.equals("center_horizontal")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 17;
            case 1:
                return 16;
            case 2:
            default:
                return 3;
            case 3:
                return 5;
            case 4:
                return 1;
        }
    }

    private int kgc(String str) {
        str.hashCode();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }
}
