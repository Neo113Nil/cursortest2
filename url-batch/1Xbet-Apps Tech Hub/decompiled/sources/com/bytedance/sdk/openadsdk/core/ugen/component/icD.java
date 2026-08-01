package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.core.widget.GifView;

/* compiled from: UGGifWidget.java */
/* loaded from: classes2.dex */
public class icD extends com.bytedance.adsdk.ugeno.component.icD<GifView> {
    protected ImageView.ScaleType ea;
    protected String pvs;

    public icD(Context context) {
        super(context);
        this.ea = ImageView.ScaleType.FIT_CENTER;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public GifView vG() {
        this.NB = new GifView(this.icD);
        return (GifView) this.NB;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        so();
        ((GifView) this.NB).setScaleType(this.ea);
    }

    private void so() {
        if (TextUtils.isEmpty(this.pvs)) {
            return;
        }
        if (this.pvs.startsWith("local://")) {
            ((GifView) this.NB).pvs(com.bytedance.adsdk.ugeno.icD.Jd.icD(this.icD, this.pvs.replace("local://", "")), false);
        } else {
            com.bytedance.adsdk.ugeno.vG.pvs().icD().pvs(this.icD, this.pvs, (ImageView) this.NB);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        super.pvs(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        if (str.equals("scaleType")) {
            this.ea = NB(str2);
        } else if (str.equals("src")) {
            this.pvs = str2;
        }
    }

    private ImageView.ScaleType NB(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitXY":
                return ImageView.ScaleType.FIT_XY;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }
}
