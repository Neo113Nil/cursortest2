package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: RichTextWidget.java */
/* loaded from: classes.dex */
public class pvs extends com.bytedance.adsdk.ugeno.component.icD<RichTextView> {
    private int BSi;
    private String CjQ;
    private String OyE;
    private float ZsW;
    private int cnN;
    private int ea;
    private int joF;
    private String pvs;

    public pvs(Context context) {
        super(context);
        this.BSi = Integer.MAX_VALUE;
        this.joF = 2;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public RichTextView vG() {
        return new RichTextView(this.icD);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        ((RichTextView) this.NB).setRichText(this.pvs);
        ((RichTextView) this.NB).setTextSize(1, this.ZsW);
        ((RichTextView) this.NB).setTextColor(this.ea);
        ((RichTextView) this.NB).setLines(this.cnN);
        ((RichTextView) this.NB).setMaxLines(this.BSi);
        ((RichTextView) this.NB).setGravity(this.joF);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "textAlign":
                this.joF = NB(str2);
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
            case "text":
                this.pvs = str2;
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
        }
    }

    private int NB(String str) {
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
