package com.bytedance.adsdk.ugeno.btk;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.btk.btk;
import com.bytedance.adsdk.ugeno.fs.zmn;

/* loaded from: classes9.dex */
public class hhw extends com.bytedance.adsdk.ugeno.fs.zmn<btk> {
    private int eug;
    private int hip;
    private int ob;
    private int rsi;
    private int tev;

    public hhw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public btk zmn() {
        btk btkVar = new btk(this.fs);
        btkVar.zmn(this);
        return btkVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        ((btk) this.btk).setFlexDirection(this.ob);
        ((btk) this.btk).setFlexWrap(this.tev);
        ((btk) this.btk).setJustifyContent(this.rsi);
        ((btk) this.btk).setAlignItems(this.hip);
        ((btk) this.btk).setAlignContent(this.eug);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public zmn.C0110zmn iv() {
        return new zmn(this);
    }

    public static class zmn extends zmn.C0110zmn {
        public int am;
        public int ev;
        public int fkt;
        public float kjb;
        public int rp;
        public int so;
        public int tf;
        public float yj;
        public float zak;

        public zmn(com.bytedance.adsdk.ugeno.fs.zmn zmnVar) {
            super(zmnVar);
            this.rp = 1;
            this.kjb = 0.0f;
            this.zak = 0.0f;
            this.am = -1;
            this.yj = -1.0f;
            this.so = -1;
            this.ev = -1;
            this.tf = 16777215;
            this.fkt = 16777215;
        }

        @Override // com.bytedance.adsdk.ugeno.fs.zmn.C0110zmn
        public void zmn(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.zmn(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasisPercent":
                    this.yj = fb(str2);
                    break;
                case "order":
                    this.rp = zmn(str2);
                    break;
                case "flexShrink":
                    this.zak = zn(str2);
                    break;
                case "flexGrow":
                    this.kjb = fs(str2);
                    break;
                case "alignSelf":
                    this.am = btk(str2);
                    break;
            }
        }

        private int zmn(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }

        private float fs(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float zn(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float fb(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int btk(String str) {
            boolean z;
            str.hashCode();
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 1384876188:
                    if (str.equals("flex_start")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1744442261:
                    if (str.equals("flex_end")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    return 4;
                case true:
                    return 3;
                case true:
                    return 2;
                case true:
                    return 0;
                case true:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.fs.zmn.C0110zmn
        /* renamed from: fs, reason: merged with bridge method [inline-methods] */
        public btk.zmn zmn() {
            btk.zmn zmnVar = new btk.zmn((int) this.zmn, (int) this.fs);
            ((ViewGroup.MarginLayoutParams) zmnVar).leftMargin = (int) this.hhw;
            ((ViewGroup.MarginLayoutParams) zmnVar).rightMargin = (int) this.nps;
            ((ViewGroup.MarginLayoutParams) zmnVar).topMargin = (int) this.zg;
            ((ViewGroup.MarginLayoutParams) zmnVar).bottomMargin = (int) this.bvs;
            zmnVar.zn(this.rp);
            zmnVar.fb(this.am);
            zmnVar.zmn(this.kjb);
            zmnVar.fs(this.zak);
            zmnVar.zn(this.yj);
            return zmnVar;
        }

        @Override // com.bytedance.adsdk.ugeno.fs.zmn.C0110zmn
        public String toString() {
            return "LayoutParams{mWidth=" + this.zmn + ", mHeight=" + this.fs + ", mMargin=" + this.btk + ", mMarginLeft=" + this.hhw + ", mMarginRight=" + this.nps + ", mMarginTop=" + this.zg + ", mMarginBottom=" + this.bvs + ", mParams=" + this.uqh + ", mOrder=" + this.rp + ", mFlexGrow=" + this.kjb + ", mFlexShrink=" + this.zak + ", mAlignSelf=" + this.am + ", mFlexBasisPercent=" + this.yj + ", mMinWidth=" + this.so + ", mMinHeight=" + this.ev + ", mMaxWidth=" + this.tf + ", mMaxHeight=" + this.fkt + "} " + super.toString();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.hip = cyb(str2);
                break;
            case "flexDirection":
                this.ob = mw(str2);
                break;
            case "alignContent":
                this.eug = olo(str2);
                break;
            case "flexWrap":
                this.tev = rt(str2);
                break;
            case "justifyContent":
                this.rsi = cn(str2);
                break;
        }
    }

    int mw(String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    private int rt(String str) {
        str.hashCode();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int cn(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int cyb(String str) {
        char c;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c != 2) {
            return c != 3 ? 4 : 3;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int olo(String str) {
        char c;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c == 2) {
            return 2;
        }
        if (c != 3) {
            return c != 4 ? 5 : 3;
        }
        return 4;
    }
}
