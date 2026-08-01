package com.bytedance.adsdk.icD;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.lottie.Jd;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.adsdk.lottie.Mxy;
import com.bytedance.adsdk.ugeno.component.icD;
import com.bytedance.adsdk.ugeno.pvs;
import com.bytedance.adsdk.ugeno.pvs.vG;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;

/* compiled from: LottieAnimationWidget.java */
/* loaded from: classes.dex */
public class pvs extends icD<LottieAnimationView> {
    private boolean BSi;
    private boolean CjQ;
    private float OyE;
    private String ZsW;
    private boolean cnN;
    private String ea;
    private float joF;
    protected ImageView.ScaleType pvs;
    private HashMap<String, Bitmap> thO;

    public pvs(Context context) {
        super(context);
        this.ZsW = "images";
        this.joF = 1.0f;
        this.pvs = ImageView.ScaleType.FIT_CENTER;
        this.thO = new HashMap<>();
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public LottieAnimationView vG() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.icD);
        lottieAnimationView.pvs(this);
        return lottieAnimationView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
        ((LottieAnimationView) this.NB).setProgress(this.OyE);
        if (this.joF <= 0.0f) {
            this.joF = 1.0f;
        }
        ((LottieAnimationView) this.NB).setSpeed(this.joF);
        if (this.ea.startsWith(ImagesContract.LOCAL)) {
            ((LottieAnimationView) this.NB).setAnimation(NB(this.ea));
            ((LottieAnimationView) this.NB).setImageAssetsFolder(this.ZsW);
        } else {
            ((LottieAnimationView) this.NB).setAnimationFromUrl(this.ea);
            ((LottieAnimationView) this.NB).setImageAssetDelegate(new Jd() { // from class: com.bytedance.adsdk.icD.pvs.1
                @Override // com.bytedance.adsdk.lottie.Jd
                public Bitmap pvs(final Mxy mxy) {
                    final String pvs;
                    if (mxy == null) {
                        return null;
                    }
                    String NB = mxy.NB();
                    String Jd = mxy.Jd();
                    if (!TextUtils.isEmpty(NB) && TextUtils.isEmpty(Jd)) {
                        pvs = vG.pvs(NB, pvs.this.Jd);
                    } else {
                        pvs = (TextUtils.isEmpty(Jd) || !TextUtils.isEmpty(NB)) ? (TextUtils.isEmpty(Jd) || TextUtils.isEmpty(NB)) ? null : vG.pvs(NB, pvs.this.Jd) + vG.pvs(Jd, pvs.this.Jd) : vG.pvs(Jd, pvs.this.Jd);
                    }
                    if (TextUtils.isEmpty(pvs)) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) pvs.this.thO.get(pvs);
                    if (bitmap != null) {
                        return bitmap;
                    }
                    com.bytedance.adsdk.ugeno.vG.pvs().icD().pvs(pvs.this.icD, pvs, -1.0f, new pvs.InterfaceC0037pvs() { // from class: com.bytedance.adsdk.icD.pvs.1.1
                        @Override // com.bytedance.adsdk.ugeno.pvs.InterfaceC0037pvs
                        public void pvs(Bitmap bitmap2) {
                            if (bitmap2 != null) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, mxy.pvs(), mxy.icD(), false);
                                pvs.this.thO.put(pvs, createScaledBitmap);
                                ((LottieAnimationView) pvs.this.NB).pvs(mxy.vG(), createScaledBitmap);
                            }
                        }
                    });
                    return (Bitmap) pvs.this.thO.get(pvs);
                }
            });
        }
        ((LottieAnimationView) this.NB).setScaleType(this.pvs);
        ((LottieAnimationView) this.NB).icD(this.BSi);
        ((LottieAnimationView) this.NB).pvs();
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pvs(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleType":
                this.pvs = sUS(str2);
                break;
            case "progress":
                this.OyE = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, 0.0f);
                break;
            case "imagePath":
                this.ZsW = str2;
                break;
            case "autoReverse":
                this.CjQ = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, false);
                break;
            case "src":
                this.ea = str2;
                break;
            case "loop":
                this.BSi = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, false);
                break;
            case "speed":
                this.joF = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, 1.0f);
                break;
            case "autoPlay":
                this.cnN = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, false);
                break;
        }
    }

    private String NB(String str) {
        return (!TextUtils.isEmpty(str) && str.contains(ImagesContract.LOCAL)) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
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
