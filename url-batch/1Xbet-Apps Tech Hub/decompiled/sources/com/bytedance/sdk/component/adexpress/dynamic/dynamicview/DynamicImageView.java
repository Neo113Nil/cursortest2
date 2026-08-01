package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.NB.Wyp;
import com.bytedance.sdk.component.NB.bNS;
import com.bytedance.sdk.component.NB.mnm;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.Mxy;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationImageView;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;
import com.bytedance.sdk.component.adexpress.widget.GifView;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.utils.uc;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DynamicImageView extends DynamicBaseWidgetImp {
    private String pvs;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        if (!TextUtils.isEmpty(this.kj.Ye()) && soVar.zM()) {
            DynamicLottieView dynamicLottieView = new DynamicLottieView(context);
            dynamicLottieView.setAnimationsLoop(this.kj.Ayu());
            dynamicLottieView.setImageLottieTosPath(this.kj.Ye());
            dynamicLottieView.setLottieAppNameMaxLength(this.kj.tCd());
            dynamicLottieView.setLottieAdTitleMaxLength(this.kj.elv());
            dynamicLottieView.setLottieAdDescMaxLength(this.kj.tQ());
            dynamicLottieView.setData(soVar.uc());
            this.bNS = dynamicLottieView;
        } else if (this.kj.bNS() > 0.0f) {
            this.bNS = new TTRoundRectImageView(context);
            ((TTRoundRectImageView) this.bNS).setXRound((int) yiw.pvs(context, this.kj.bNS()));
            ((TTRoundRectImageView) this.bNS).setYRound((int) yiw.pvs(context, this.kj.bNS()));
        } else if (!so() && "arrowButton".equals(soVar.Wyp().icD())) {
            AnimationImageView animationImageView = new AnimationImageView(context);
            animationImageView.setBrickNativeValue(this.kj);
            this.bNS = animationImageView;
        } else if (com.bytedance.sdk.component.adexpress.Jd.so.icD(this.kj.qh())) {
            this.bNS = new GifView(context);
        } else {
            this.bNS = new ImageView(context);
        }
        this.pvs = getImageKey();
        this.bNS.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(soVar.Wyp().icD())) {
            if (this.kj.icD() > 0 || this.kj.pvs() > 0) {
                this.yiw = Math.min(this.yiw, this.so);
                this.so = Math.min(this.yiw, this.so);
                this.Mxy = (int) (this.Mxy + yiw.pvs(context, this.kj.icD() + (this.kj.pvs() / 2) + 0.5f));
            } else {
                this.yiw = Math.max(this.yiw, this.so);
                this.so = Math.max(this.yiw, this.so);
            }
            this.kj.pvs(this.yiw / 2);
        }
        addView(this.bNS, new FrameLayout.LayoutParams(this.yiw, this.so));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.bNS).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.bNS).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        if (!TextUtils.isEmpty(this.kj.Ye())) {
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        if ("arrowButton".equals(this.Ju.Wyp().icD())) {
            ((ImageView) this.bNS).setImageResource(uc.Jd(this.qh, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.bNS).getDrawable() != null) {
                ((ImageView) this.bNS).getDrawable().setAutoMirrored(true);
            }
            this.bNS.setPadding(0, 0, 0, 0);
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.bNS.setBackgroundColor(this.kj.Gp());
        String vG = this.Ju.Wyp().vG();
        if ("user".equals(vG)) {
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.bNS).setColorFilter(this.kj.yiw());
            ((ImageView) this.bNS).setImageDrawable(uc.vG(getContext(), "tt_user"));
            ((ImageView) this.bNS).setPadding(this.yiw / 10, this.so / 5, this.yiw / 10, 0);
        } else if (vG != null && vG.startsWith("@")) {
            try {
                ((ImageView) this.bNS).setImageResource(Integer.parseInt(vG.substring(1)));
            } catch (Exception unused) {
            }
        }
        bNS NB = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().NB();
        String qh = this.kj.qh();
        if (!TextUtils.isEmpty(qh) && !qh.startsWith("http:") && !qh.startsWith("https:")) {
            qh = Mxy.icD(qh, (this.IP == null || this.IP.getRenderRequest() == null) ? null : this.IP.getRenderRequest().ZhG());
        }
        Wyp pvs = NB.pvs(qh).pvs(this.pvs);
        String IP = this.IP.getRenderRequest().IP();
        if (!TextUtils.isEmpty(IP)) {
            pvs.icD(IP);
        }
        if (pvs()) {
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.FIT_CENTER);
            pvs.pvs(Bitmap.Config.ARGB_4444).vG(2).pvs(new com.bytedance.sdk.component.NB.so() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.2
                @Override // com.bytedance.sdk.component.NB.so
                public Bitmap pvs(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.Jd.pvs.pvs(DynamicImageView.this.qh, bitmap, 25);
                }
            }).pvs(new mnm<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.1
                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(qh<Bitmap> qhVar) {
                    Bitmap icD = qhVar.icD();
                    if (icD == null || qhVar.vG() == null) {
                        return;
                    }
                    DynamicImageView.this.bNS.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), icD));
                }
            });
        } else {
            if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                pvs.pvs((ImageView) this.bNS);
            }
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.bNS instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.bNS).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (!com.bytedance.sdk.component.adexpress.Jd.icD()) {
            pvs(pvs);
        }
        return true;
    }

    private boolean pvs() {
        String kj = this.kj.kj();
        if (this.kj.uc()) {
            return true;
        }
        if (TextUtils.isEmpty(kj)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(kj);
            return Math.abs((((float) this.yiw) / (((float) this.so) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> qh = this.IP.getRenderRequest().qh();
        if (qh == null || qh.size() <= 0) {
            return null;
        }
        return qh.get(this.kj.qh());
    }

    private void pvs(Wyp wyp) {
        wyp.vG(3).pvs(new mnm() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.3
            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(qh qhVar) {
                Object icD = qhVar.icD();
                if ((icD instanceof byte[]) && (DynamicImageView.this.bNS instanceof ImageView)) {
                    com.bytedance.sdk.component.adexpress.Jd.NB.pvs((ImageView) DynamicImageView.this.bNS, (byte[]) icD, DynamicImageView.this.yiw, DynamicImageView.this.so);
                }
            }
        });
    }
}
