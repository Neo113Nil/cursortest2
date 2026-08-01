package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.icD.vG;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: UGTextWidget.java */
/* loaded from: classes.dex */
public class icD extends com.bytedance.adsdk.ugeno.component.icD<TextView> {
    private int BSi;
    private float Ca;
    private int CjQ;
    private int Cwg;
    private int OyE;
    private float ZsW;
    private float cGU;
    private int cnN;
    private int ea;
    private int joF;
    private float neB;
    private String pvs;
    private float qd;
    private float rW;
    private TextUtils.TruncateAt thO;

    public icD(Context context) {
        super(context);
        this.BSi = Integer.MAX_VALUE;
        this.OyE = 2;
        this.qd = -1.0f;
        this.rW = -1.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public TextView vG() {
        UGTextView uGTextView = new UGTextView(this.icD);
        uGTextView.pvs(this);
        return uGTextView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, this.pvs)) {
            this.pvs = "";
        }
        NB(this.pvs);
        ((TextView) this.NB).setTextSize(1, this.ZsW);
        ((TextView) this.NB).setTextColor(this.ea);
        ((TextView) this.NB).setLines(this.cnN);
        ((TextView) this.NB).setMaxLines(this.BSi);
        ((TextView) this.NB).setGravity(this.OyE);
        ((TextView) this.NB).setIncludeFontPadding(false);
        vG(this.joF);
        pvs(this.thO);
        ((TextView) this.NB).setTypeface(Typeface.DEFAULT, this.CjQ);
        if (Build.VERSION.SDK_INT >= 28 && this.qd >= 0.0f) {
            ((TextView) this.NB).setLineSpacing(0.0f, this.qd);
        }
        ((TextView) this.NB).setShadowLayer(this.Ca, this.neB, this.cGU, this.Cwg);
    }

    public void NB(String str) {
        this.pvs = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            this.pvs = "";
        }
        ((TextView) this.NB).setText(this.pvs);
    }

    public void vG(int i) {
        this.joF = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((TextView) this.NB).setPaintFlags(i);
    }

    public void pvs(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((TextView) this.NB).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "shadowRadius":
                this.Ca = vG.pvs(str2, 0.0f);
                break;
            case "shadowColor":
                this.Cwg = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case "textAlign":
                this.OyE = so(str2);
                break;
            case "textColor":
                this.ea = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case "textStyle":
                this.CjQ = yiw(str2);
                break;
            case "textSize":
                this.ZsW = vG.pvs(str2, 0.0f);
                break;
            case "textDecoration":
                this.joF = Mxy(str2);
                break;
            case "shadowDx":
                this.neB = vG.pvs(str2, 0.0f);
                break;
            case "shadowDy":
                this.cGU = vG.pvs(str2, 0.0f);
                break;
            case "fontWeight":
                this.rW = vG.pvs(str2, -1.0f);
                break;
            case "lineHeight":
                this.qd = vG.pvs(str2, 1.0f);
                break;
            case "text":
                this.pvs = str2;
                break;
            case "lines":
                this.cnN = vG.pvs(str2, 0);
                break;
            case "maxLines":
                this.BSi = Integer.parseInt(str2);
                break;
            case "ellipsize":
                this.thO = sUS(str2);
                break;
        }
    }

    private TextUtils.TruncateAt sUS(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.thO = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.thO = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.thO = TextUtils.TruncateAt.START;
                break;
            default:
                this.thO = null;
                break;
        }
        return this.thO;
    }

    private int yiw(String str) {
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
            if (str.equals("normal")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? 0 : 2;
        }
        return 1;
    }

    private int so(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 17;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return 2;
        }
    }

    private int Mxy(String str) {
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
