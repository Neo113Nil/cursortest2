package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class rc extends hhw {
    private String zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public rc(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        if (!TextUtils.isEmpty(this.klz.zi()) && zgVar.kw()) {
            com.bytedance.sdk.component.adexpress.hhw.iv ivVar = new com.bytedance.sdk.component.adexpress.hhw.iv(context);
            ivVar.setAnimationsLoop(this.klz.nkt());
            ivVar.setImageLottieTosPath(this.klz.zi());
            ivVar.setLottieAppNameMaxLength(this.klz.mpi());
            ivVar.setLottieAdTitleMaxLength(this.klz.tdm());
            ivVar.setLottieAdDescMaxLength(this.klz.oep());
            ivVar.setData(zgVar.iqz());
            this.cn = ivVar;
        } else if (this.klz.cn() > 0.0f) {
            com.bytedance.sdk.component.adexpress.hhw.uqh uqhVar = new com.bytedance.sdk.component.adexpress.hhw.uqh(context);
            this.cn = uqhVar;
            uqhVar.setXRound((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, this.klz.cn()));
            ((com.bytedance.sdk.component.adexpress.hhw.uqh) this.cn).setYRound((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, this.klz.cn()));
        } else if (!zg() && "arrowButton".equals(zgVar.iv().fs())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.fs fsVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.fs(context);
            fsVar.setBrickNativeValue(this.klz);
            this.cn = fsVar;
        } else {
            this.cn = new ImageView(context);
        }
        this.zmn = getImageKey();
        this.cn.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(zgVar.iv().fs())) {
            if (this.klz.fs() > 0 || this.klz.zmn() > 0) {
                int min = Math.min(this.nps, this.zg);
                this.nps = min;
                this.zg = Math.min(min, this.zg);
                this.bvs = (int) (this.bvs + com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, this.klz.fs() + (this.klz.zmn() / 2) + 0.5f));
            } else {
                int max = Math.max(this.nps, this.zg);
                this.nps = max;
                this.zg = Math.max(max, this.zg);
            }
            this.klz.zmn(this.nps / 2);
        }
        addView(this.cn, new FrameLayout.LayoutParams(this.nps, this.zg));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.cn).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
            return;
        }
        zn$$ExternalSyntheticApiModelOutline0.m(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.cn).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
            return;
        }
        zn$$ExternalSyntheticApiModelOutline0.m(drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        int i;
        super.bvs();
        if (!TextUtils.isEmpty(this.klz.zi())) {
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int i2 = 0;
        if ("arrowButton".equals(this.mw.iv().fs())) {
            ((ImageView) this.cn).setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.rc, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.cn).getDrawable() != null) {
                ((ImageView) this.cn).getDrawable().setAutoMirrored(true);
            }
            this.cn.setPadding(0, 0, 0, 0);
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.cn.setBackgroundColor(this.klz.zak());
        String zn = this.mw.iv().zn();
        if (POBConstants.KEY_USER.equals(zn)) {
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.cn).setColorFilter(this.klz.nps());
            ((ImageView) this.cn).setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.cn;
            int i3 = this.nps;
            imageView.setPadding(i3 / 10, this.zg / 5, i3 / 10, 0);
        } else if (zn != null && zn.startsWith("@")) {
            try {
                ((ImageView) this.cn).setImageResource(Integer.parseInt(zn.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.btk.cn btk = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().btk();
        String rc = this.klz.rc();
        if (!TextUtils.isEmpty(rc) && !rc.startsWith("http:") && !rc.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.rt;
            rc = com.bytedance.sdk.component.adexpress.dynamic.btk.bvs.fs(rc, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.rt.getRenderRequest().uqh());
        }
        com.bytedance.sdk.component.adexpress.zmn.zmn.zn zn2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn();
        if (zn2 != null) {
            i2 = zn2.cyb();
            i = zn2.olo();
        } else {
            i = 0;
        }
        com.bytedance.sdk.component.btk.iv btk2 = btk.zmn(rc).zmn(this.zmn).zmn(this.nps).fs(this.zg).fb(i2).btk(i);
        String rt = this.rt.getRenderRequest().rt();
        if (!TextUtils.isEmpty(rt)) {
            btk2.fs(rt);
        }
        if (zmn()) {
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.FIT_CENTER);
            btk2.zmn(Bitmap.Config.ARGB_4444).zn(2).zmn(new zmn(this.rc)).zmn(new fs(this.cn, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                btk2.zn(1).zmn((ImageView) this.cn);
            }
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.cn instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    private static class zmn implements com.bytedance.sdk.component.btk.zg {
        private final WeakReference<Context> zmn;

        public zmn(Context context) {
            this.zmn = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.btk.zg
        public Bitmap zmn(Bitmap bitmap) {
            Context context = this.zmn.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.fb.zmn.zmn(context, bitmap, 25);
            }
            return null;
        }
    }

    private static class fs implements com.bytedance.sdk.component.btk.cyb {
        private Resources fs;
        private WeakReference<View> zmn;

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(int i, String str, @Nullable Throwable th) {
        }

        public fs(View view, Resources resources) {
            this.zmn = new WeakReference<>(view);
            this.fs = resources;
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            Object fs;
            View view = this.zmn.get();
            if (view == null || (fs = rcVar.fs()) == null || rcVar.zn() == null) {
                return;
            }
            if (fs instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.fs, (Bitmap) fs));
            } else if (fs instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(fs)) {
                    zn$$ExternalSyntheticApiModelOutline0.m(fs).start();
                }
                view.setBackground((Drawable) fs);
            }
        }
    }

    private boolean zmn() {
        String klz = this.klz.klz();
        if (this.klz.iqz()) {
            return true;
        }
        if (TextUtils.isEmpty(klz)) {
            return false;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(klz);
            return Math.abs((((float) this.nps) / (((float) this.zg) * 1.0f)) - (((float) jsonObjectInit.optInt("width")) / (((float) jsonObjectInit.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> rc = this.rt.getRenderRequest().rc();
        if (rc == null || rc.size() <= 0) {
            return null;
        }
        return rc.get(this.klz.rc());
    }
}
