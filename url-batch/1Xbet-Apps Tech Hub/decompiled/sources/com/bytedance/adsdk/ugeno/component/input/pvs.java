package com.bytedance.adsdk.ugeno.component.input;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.adsdk.ugeno.component.icD;

/* compiled from: UGInputWidget.java */
/* loaded from: classes.dex */
public class pvs extends icD<EditText> {
    private int BSi;
    private String CjQ;
    private String OyE;
    private float ZsW;
    private int cnN;
    private int ea;
    private int joF;
    private int pvs;
    private String qd;
    private String thO;

    public pvs(Context context) {
        super(context);
        this.pvs = 1;
        this.BSi = Integer.MAX_VALUE;
        this.joF = 2;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public EditText vG() {
        UGEditText uGEditText = new UGEditText(this.icD);
        uGEditText.pvs(this);
        return uGEditText;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        ((EditText) this.NB).setInputType(this.pvs);
        ((EditText) this.NB).setText(this.thO);
        ((EditText) this.NB).setTextSize(1, this.ZsW);
        ((EditText) this.NB).setTextColor(this.ea);
        ((EditText) this.NB).setLines(this.cnN);
        ((EditText) this.NB).setMaxLines(this.BSi);
        ((EditText) this.NB).setGravity(this.joF);
        ((EditText) this.NB).setHint(this.qd);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "textAlign":
                this.joF = sUS(str2);
                break;
            case "textColor":
                this.ea = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case "textStyle":
                this.CjQ = str2;
                break;
            case "textSize":
                this.ZsW = Float.parseFloat(str2);
                break;
            case "hint":
                this.qd = str2;
                break;
            case "text":
                this.thO = str2;
                break;
            case "lines":
                this.cnN = Integer.parseInt(str2);
                break;
            case "maxLines":
                this.BSi = Integer.parseInt(str2);
                break;
            case "ellipsize":
                this.OyE = str2;
                break;
            case "inputType":
                this.pvs = NB(str2);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int NB(String str) {
        char c;
        switch (str.hashCode()) {
            case -1034364087:
                if (str.equals("number")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96619420:
                if (str.equals("email")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 128;
        }
        if (c == 1) {
            return 3;
        }
        if (c != 2) {
            return c != 3 ? 1 : 32;
        }
        return 2;
    }

    private int sUS(String str) {
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
}
