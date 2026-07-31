package com.bytedance.sdk.openadsdk.core.mw;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes5.dex */
public class fs {
    private int btk;
    private int bvs;
    private float cn;
    private float cyb;
    private boolean iqz;
    private TextUtils.TruncateAt iv;
    private float kgc;
    private float klz;
    private Context kw;
    private int mw;
    private int nps;
    private float olo;
    private float rc;
    private boolean rt;
    protected String zmn;
    protected int fs = -16777216;
    private float zn = 12.0f;
    private float fb = -1.0f;
    private int hhw = Integer.MAX_VALUE;
    private int zg = 8388611;

    public fs(Context context, boolean z) {
        this.kw = context;
        this.iqz = z;
    }

    public void zmn(com.bytedance.adsdk.ugeno.bvs.hhw.zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zmn)) {
            zmnVar.setText(TextUtils.equals(POBCommonConstants.NULL_VALUE, this.zmn) ? "" : this.zmn);
        }
        zmnVar.setTextSize(1, this.zn);
        zmnVar.setMinTextSize(zg.zmn(this.kw, this.fb));
        zmnVar.setTextColor(this.fs);
        zmnVar.setGravity(this.zg);
        zmnVar.setLines(this.nps);
        zmnVar.setMaxLines(this.hhw);
        int i = this.bvs;
        if (i != Integer.MAX_VALUE) {
            zmnVar.setPaintFlags(i);
        }
        zmnVar.setEllipsize(this.iv);
        if (this.rc > 0.0f) {
            if (this.iqz) {
                zn(zmnVar);
            } else {
                fs(zmnVar);
            }
        }
        zmnVar.setTypeface(zmn((int) this.klz));
        fb(zmnVar);
        float zmn = zg.zmn(this.kw, this.zn);
        if (zmn > 0.0f) {
            zmnVar.setLetterSpacing(this.kgc / zmn);
        }
        zmnVar.setIncludeFontPadding(false);
    }

    public void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "shadowColor":
                this.mw = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                this.rt = true;
                break;
            case "shadowOffsetX":
                this.cn = zg.zmn(this.kw, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.cyb = zg.zmn(this.kw, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "textAlign":
                this.zg = zmn(str2);
                break;
            case "textColor":
                this.fs = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case "textStyle":
                this.btk = fs(str2);
                break;
            case "shadowBlur":
                this.olo = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "textSize":
                this.zn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "textDecoration":
                this.bvs = fb(str2);
                break;
            case "fontWeight":
                float zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, -1.0f);
                this.klz = zmn;
                if (zmn < 1.0f || zmn > 1000.0f) {
                    this.klz = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.rc = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1.0f);
                break;
            case "text":
                this.zmn = str2;
                break;
            case "lines":
                this.nps = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0);
                break;
            case "ellipsis":
                this.iv = zn(str2);
                break;
            case "minTextSize":
                this.fb = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, -1.0f);
                break;
            case "maxLines":
                int zmn2 = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, Integer.MAX_VALUE);
                this.hhw = zmn2 > 0 ? zmn2 : Integer.MAX_VALUE;
                break;
            case "letterSpacing":
                this.kgc = zg.zmn(this.kw, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private int zmn(String str) {
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

    private int fs(String str) {
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

    private Typeface zmn(int i) {
        Typeface create;
        if (Build.VERSION.SDK_INT < 28) {
            return i >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
        }
        create = Typeface.create(Typeface.DEFAULT, i, false);
        return create;
    }

    private TextUtils.TruncateAt zn(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int fb(String str) {
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

    private void fs(com.bytedance.adsdk.ugeno.bvs.hhw.zmn zmnVar) {
        zmnVar.setLineSpacing(0.0f, this.rc);
    }

    private void zn(com.bytedance.adsdk.ugeno.bvs.hhw.zmn zmnVar) {
        float f = this.rc;
        if (f <= 3.0f) {
            zmnVar.setLineSpacing(0.0f, f);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int round = Math.round(zg.zmn(this.kw, (f - (this.zn * 1.2f)) / 2.0f));
            zmnVar.setPadding(zmnVar.getPaddingLeft(), zmnVar.getPaddingTop() + round, zmnVar.getPaddingRight(), zmnVar.getPaddingBottom() + round);
            zmnVar.setLineHeight(Math.round(zg.zmn(this.kw, this.rc)));
        }
    }

    private void fb(com.bytedance.adsdk.ugeno.bvs.hhw.zmn zmnVar) {
        if (this.iqz) {
            if (this.rt) {
                float f = this.olo;
                if (f <= 0.0f) {
                    f = 1.0E-5f;
                }
                zmnVar.setShadowLayer(f, this.cn, this.cyb, this.mw);
                return;
            }
            return;
        }
        zmnVar.setShadowLayer(this.olo, this.cn, this.cyb, this.mw);
    }
}
