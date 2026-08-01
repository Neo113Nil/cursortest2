package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.icD.Jd;
import com.bytedance.adsdk.ugeno.icD.so;
import com.bytedance.adsdk.ugeno.pvs;
import com.bytedance.adsdk.ugeno.vG;

/* compiled from: UGImageWidget.java */
/* loaded from: classes.dex */
public class icD extends com.bytedance.adsdk.ugeno.component.icD<RoundImageView> {
    private float BSi;
    private int CjQ;
    protected boolean ZsW;
    protected ImageView.ScaleType ea;
    protected String pvs;

    public icD(Context context) {
        super(context);
        this.ea = ImageView.ScaleType.FIT_CENTER;
        this.CjQ = -1;
        this.BSi = -1.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        so();
        ((RoundImageView) this.NB).setScaleType(this.ea);
        ((RoundImageView) this.NB).setBorderColor(this.gSd);
        ((RoundImageView) this.NB).setCornerRadius(this.gA);
        ((RoundImageView) this.NB).setBorderWidth(this.sP);
        if (this.CjQ != -1) {
            ((RoundImageView) this.NB).setColorFilter(this.CjQ);
        }
    }

    public void NB(String str) {
        this.pvs = str;
    }

    private void so() {
        if (TextUtils.isEmpty(this.pvs)) {
            return;
        }
        ((RoundImageView) this.NB).setImageDrawable(null);
        if (this.pvs.startsWith("local://")) {
            ((RoundImageView) this.NB).setImageResource(Jd.icD(this.icD, this.pvs.replace("local://", "")));
        } else {
            if (this.pvs.startsWith("@")) {
                try {
                    ((RoundImageView) this.NB).setImageResource(Integer.parseInt(this.pvs.substring(1)));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            vG.pvs().icD().pvs(this.icD, this.pvs, this.BSi, new pvs.InterfaceC0037pvs() { // from class: com.bytedance.adsdk.ugeno.component.image.icD.1
                @Override // com.bytedance.adsdk.ugeno.pvs.InterfaceC0037pvs
                public void pvs(Bitmap bitmap) {
                    Bitmap pvs;
                    if (bitmap == null) {
                        return;
                    }
                    ((RoundImageView) icD.this.NB).setImageBitmap(bitmap);
                    if (!icD.this.ZsW || (pvs = so.pvs(icD.this.icD, bitmap, 10)) == null) {
                        return;
                    }
                    ((RoundImageView) icD.this.NB).setBackground(new BitmapDrawable(icD.this.icD.getResources(), pvs));
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public RoundImageView vG() {
        RoundImageView roundImageView = new RoundImageView(this.icD);
        roundImageView.pvs(this);
        return roundImageView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleType":
                this.ea = sUS(str2);
                break;
            case "imageBlur":
                this.BSi = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                try {
                    this.ZsW = Boolean.parseBoolean(str2);
                    break;
                } catch (NumberFormatException unused) {
                    this.ZsW = false;
                    return;
                }
            case "src":
                this.pvs = str2;
                break;
            case "tintColor":
                this.CjQ = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
        }
    }

    private ImageView.ScaleType sUS(String str) {
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
