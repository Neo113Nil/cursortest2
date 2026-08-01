package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.adsdk.lottie.Jd;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.adsdk.lottie.Mxy;
import com.bytedance.sdk.component.NB.mnm;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.NB.so;
import com.bytedance.sdk.component.adexpress.pvs.pvs.pvs;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicLottieView extends LottieAnimationView {
    private String icD;
    private Map<String, Bitmap> pvs;

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }

    public DynamicLottieView(Context context) {
        super(context);
        this.pvs = new HashMap();
    }

    public void setImageLottieTosPath(String str) {
        this.icD = str;
    }

    public void sUS() {
        if (TextUtils.isEmpty(this.icD)) {
            return;
        }
        setProgress(0.0f);
        icD(true);
        setAnimationFromUrl(this.icD);
        setImageAssetDelegate(new Jd() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1
            @Override // com.bytedance.adsdk.lottie.Jd
            public Bitmap pvs(final Mxy mxy) {
                final String vG = mxy.vG();
                String NB = mxy.NB();
                String Jd = mxy.Jd();
                if (TextUtils.equals(vG, "image_0") && TextUtils.equals(Jd, "Lark20201123-180048_2.png")) {
                    Jd = "hand.png";
                }
                Bitmap bitmap = (Bitmap) DynamicLottieView.this.pvs.get(vG);
                if (bitmap != null) {
                    return bitmap;
                }
                Object[] objArr = new Object[4];
                if (TextUtils.isEmpty(NB) || !TextUtils.isEmpty(Jd)) {
                    if (TextUtils.isEmpty(Jd) || !TextUtils.isEmpty(NB)) {
                        NB = (TextUtils.isEmpty(Jd) || TextUtils.isEmpty(NB)) ? "" : NB + Jd;
                    } else {
                        NB = Jd;
                    }
                }
                if (TextUtils.isEmpty(NB)) {
                    return null;
                }
                pvs.pvs().NB().pvs(NB).pvs(new so() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1.2
                    @Override // com.bytedance.sdk.component.NB.so
                    public Bitmap pvs(Bitmap bitmap2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, mxy.pvs(), mxy.icD(), false);
                        DynamicLottieView.this.pvs.put(vG, createScaledBitmap);
                        return createScaledBitmap;
                    }
                }).pvs(new mnm<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1.1
                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(qh<Bitmap> qhVar) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(qhVar.icD(), mxy.pvs(), mxy.icD(), false);
                        DynamicLottieView.this.pvs.put(vG, createScaledBitmap);
                        DynamicLottieView.this.pvs(mxy.vG(), createScaledBitmap);
                    }
                });
                return (Bitmap) DynamicLottieView.this.pvs.get(vG);
            }
        });
        pvs();
    }
}
