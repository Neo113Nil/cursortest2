package com.bytedance.adsdk.ugeno.component.flexbox;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout;
import com.bytedance.adsdk.ugeno.component.pvs;

/* compiled from: UGFlexWidget.java */
/* loaded from: classes.dex */
public class NB extends com.bytedance.adsdk.ugeno.component.pvs<FlexboxLayout> {
    private int BSi;
    private int CjQ;
    private int ZsW;
    private int cnN;
    private int ea;

    public NB(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: cR, reason: merged with bridge method [inline-methods] */
    public FlexboxLayout vG() {
        FlexboxLayout flexboxLayout = new FlexboxLayout(this.icD);
        flexboxLayout.pvs(this);
        return flexboxLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.component.pvs, com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        ((FlexboxLayout) this.NB).setFlexDirection(this.ea);
        ((FlexboxLayout) this.NB).setFlexWrap(this.ZsW);
        ((FlexboxLayout) this.NB).setJustifyContent(this.CjQ);
        ((FlexboxLayout) this.NB).setAlignItems(this.BSi);
        ((FlexboxLayout) this.NB).setAlignContent(this.cnN);
    }

    @Override // com.bytedance.adsdk.ugeno.component.pvs
    public pvs.C0033pvs so() {
        return new pvs();
    }

    /* compiled from: UGFlexWidget.java */
    public static class pvs extends pvs.C0033pvs {
        public int Mxy = 1;
        public float Wyp = 0.0f;
        public float qh = 0.0f;
        public int kj = -1;
        public float Ju = -1.0f;
        public int IP = -1;
        public int bNS = -1;
        public int mnm = ViewCompat.MEASURED_SIZE_MASK;
        public int vA = ViewCompat.MEASURED_SIZE_MASK;

        @Override // com.bytedance.adsdk.ugeno.component.pvs.C0033pvs
        public void pvs(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.pvs(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasisPercent":
                    this.Ju = Jd(str2);
                    break;
                case "order":
                    this.Mxy = pvs(str2);
                    break;
                case "flexShrink":
                    this.qh = vG(str2);
                    break;
                case "flexGrow":
                    this.Wyp = icD(str2);
                    break;
                case "alignSelf":
                    this.kj = NB(str2);
                    break;
            }
        }

        private int pvs(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }

        private float icD(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float vG(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float Jd(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int NB(String str) {
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

        @Override // com.bytedance.adsdk.ugeno.component.pvs.C0033pvs
        /* renamed from: icD, reason: merged with bridge method [inline-methods] */
        public FlexboxLayout.pvs pvs() {
            FlexboxLayout.pvs pvsVar = new FlexboxLayout.pvs((int) this.pvs, (int) this.icD);
            pvsVar.leftMargin = (int) this.Jd;
            pvsVar.rightMargin = (int) this.NB;
            pvsVar.topMargin = (int) this.sUS;
            pvsVar.bottomMargin = (int) this.yiw;
            pvsVar.vG(this.Mxy);
            pvsVar.Jd(this.kj);
            pvsVar.pvs(this.Wyp);
            pvsVar.icD(this.qh);
            pvsVar.vG(this.Ju);
            return pvsVar;
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.pvs + ", mHeight=" + this.icD + ", mMargin=" + this.vG + ", mMarginLeft=" + this.Jd + ", mMarginRight=" + this.NB + ", mMarginTop=" + this.sUS + ", mMarginBottom=" + this.yiw + ", mParams=" + this.so + ", mOrder=" + this.Mxy + ", mFlexGrow=" + this.Wyp + ", mFlexShrink=" + this.qh + ", mAlignSelf=" + this.kj + ", mFlexBasisPercent=" + this.Ju + ", mMinWidth=" + this.IP + ", mMinHeight=" + this.bNS + ", mMaxWidth=" + this.mnm + ", mMaxHeight=" + this.vA + "} " + super.toString();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.BSi = so(str2);
                break;
            case "flexDirection":
                this.ea = NB(str2);
                break;
            case "alignContent":
                this.cnN = Mxy(str2);
                break;
            case "flexWrap":
                this.ZsW = sUS(str2);
                break;
            case "justifyContent":
                this.CjQ = yiw(str2);
                break;
        }
    }

    private int NB(String str) {
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

    private int sUS(String str) {
        str.hashCode();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int yiw(String str) {
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
    private int so(String str) {
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
    private int Mxy(String str) {
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
