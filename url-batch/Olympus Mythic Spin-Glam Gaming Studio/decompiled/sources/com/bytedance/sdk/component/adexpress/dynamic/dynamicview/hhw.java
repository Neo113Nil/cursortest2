package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class hhw extends btk {
    private static String iqz = "";
    private Runnable fs;
    protected com.bytedance.sdk.component.adexpress.dynamic.zn.bvs kw;
    private volatile boolean phc;
    private Runnable zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public hhw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        this.phc = true;
        setTag(Integer.valueOf(getClickArea()));
        String fs2 = zgVar.iv().fs();
        if ("logo-union".equals(fs2)) {
            dynamicRootView.setLogoUnionHeight(this.zg - ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, this.klz.fs() + this.klz.zmn())));
        } else if ("scoreCountWithIcon".equals(fs2)) {
            dynamicRootView.setScoreCountWithIcon(this.zg - ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, this.klz.fs() + this.klz.zmn())));
        }
    }

    private String fs(String str) {
        try {
            Map<String, String> rc = this.rt.getRenderRequest().rc();
            if (rc != null && rc.size() > 0) {
                return rc.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.nps, this.zg);
    }

    public boolean bvs() {
        int i;
        int i2;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject optJSONObject;
        final View view = this.cn;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.mw.zmn(this.klz.kjb()));
        String ax = this.klz.ax();
        String str = null;
        String zmn2 = (TextUtils.isEmpty(ax) || (dynamicRootView = this.rt) == null || dynamicRootView.getRenderRequest() == null || this.rt.getRenderRequest().zn() == null || (optJSONObject = this.rt.getRenderRequest().zn().optJSONObject("creative")) == null) ? null : zmn(optJSONObject.opt(ax));
        if (TextUtils.isEmpty(zmn2)) {
            zmn2 = this.klz.phc();
        }
        com.bytedance.sdk.component.adexpress.zmn.zmn.zn zn2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn();
        if (zn2 != null) {
            i = zn2.cyb();
            i2 = zn2.olo();
        } else {
            i = 0;
            i2 = 0;
        }
        if (this.klz.iqz()) {
            int kw = this.klz.kw();
            String str2 = this.klz.fs;
            com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().btk().zmn(str2).zmn(this.nps).fs(this.zg).fb(i).btk(i2).zmn(fs(str2)).zn(2).zmn(new zn(this.rc, kw)).zmn(new fs(view, this));
        } else if (!TextUtils.isEmpty(zmn2)) {
            if (!zmn2.startsWith("http:") && !zmn2.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.rt;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    str = this.rt.getRenderRequest().uqh();
                }
                zmn2 = com.bytedance.sdk.component.adexpress.dynamic.btk.bvs.fs(zmn2, str);
            }
            com.bytedance.sdk.component.btk.iv zn3 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().btk().zmn(zmn2).zmn(this.nps).fs(this.zg).fb(i).btk(i2).zmn(fs(zmn2)).zn(1);
            zmn(zn3);
            zn3.zmn(new zmn(view, this.rt, this.mw));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.klz.am() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (hhw.this.klz.fkt() > 0) {
                            hhw hhwVar = hhw.this;
                            Drawable zn4 = hhwVar.zn(hhwVar.rt.getBgMaterialCenterCalcColor().get(Integer.valueOf(hhw.this.klz.fkt())));
                            if (zn4 == null) {
                                hhw hhwVar2 = hhw.this;
                                zn4 = hhwVar2.zmn(true, hhwVar2.rt.getBgMaterialCenterCalcColor().get(Integer.valueOf(hhw.this.klz.fkt())));
                            }
                            if (zn4 != null) {
                                view.setBackground(zn4);
                                return;
                            }
                            View view2 = view;
                            hhw hhwVar3 = hhw.this;
                            view2.setBackground(hhwVar3.zmn(true, hhwVar3.rt.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.klz.am() * 1000.0d));
        }
        View view2 = this.cn;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.zn()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.fs()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.fb()), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.zmn()));
        }
        if (this.cyb || this.klz.rt() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    private static class zn implements com.bytedance.sdk.component.btk.zg {
        private final int fs;
        private final WeakReference<Context> zmn;

        public zn(Context context, int i) {
            this.zmn = new WeakReference<>(context);
            this.fs = i;
        }

        @Override // com.bytedance.sdk.component.btk.zg
        public Bitmap zmn(Bitmap bitmap) {
            Context context = this.zmn.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.fb.zmn.zmn(context, bitmap, this.fs);
            }
            return null;
        }
    }

    private static class fs implements com.bytedance.sdk.component.btk.cyb {
        private final WeakReference<btk> fs;
        private final WeakReference<View> zmn;

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(int i, String str, @Nullable Throwable th) {
        }

        public fs(View view, btk btkVar) {
            this.zmn = new WeakReference<>(view);
            this.fs = new WeakReference<>(btkVar);
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            Object fs;
            btk btkVar;
            View view = this.zmn.get();
            if (view == null || (fs = rcVar.fs()) == null || rcVar.zn() == null || (btkVar = this.fs.get()) == null || !(fs instanceof Bitmap)) {
                return;
            }
            view.setBackground(btkVar.zmn((Bitmap) fs));
        }
    }

    private static class zmn implements com.bytedance.sdk.component.btk.cyb {
        private final WeakReference<DynamicRootView> fs;
        private final WeakReference<View> zmn;
        private final com.bytedance.sdk.component.adexpress.dynamic.fb.zg zn;

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(int i, String str, @Nullable Throwable th) {
        }

        public zmn(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
            this.zmn = new WeakReference<>(view);
            this.fs = new WeakReference<>(dynamicRootView);
            this.zn = zgVar;
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            Drawable drawable;
            View view = this.zmn.get();
            Object fs = rcVar.fs();
            if (fs instanceof Bitmap) {
                drawable = new BitmapDrawable((Bitmap) fs);
            } else if (fs instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(fs)) {
                    zn$$ExternalSyntheticApiModelOutline0.m(fs).start();
                }
                drawable = (Drawable) fs;
            } else {
                drawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.fb.fs()) {
                DynamicRootView dynamicRootView = this.fs.get();
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().fb()) && !"splash_ad".equals(dynamicRootView.getRenderRequest().fb())) {
                    view.setBackground(drawable);
                    return;
                } else {
                    view.setBackground(drawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(drawable);
            com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar = this.zn;
            if (zgVar == null || zgVar.iv() == null || 6 != this.zn.iv().zmn() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    private String zmn(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return zmn(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return zmn((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable zn(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String str2 = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i));
                } else if (jSONArray.getString(i).endsWith("deg")) {
                    str2 = jSONArray.getString(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(((String) arrayList.get(i2)).substring(0, 7));
            }
            GradientDrawable zmn2 = zmn(zmn(str2), iArr);
            zmn2.setShape(0);
            zmn2.setCornerRadius(com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.cn()));
            return zmn2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void zmn(com.bytedance.sdk.component.btk.iv ivVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            ivVar.zmn(Bitmap.Config.ARGB_8888);
        }
    }

    private static String getBuildModel() {
        try {
            iqz = com.bytedance.sdk.component.utils.bjh.zmn();
        } catch (Throwable unused) {
            iqz = Build.MODEL;
        }
        if (TextUtils.isEmpty(iqz)) {
            iqz = Build.MODEL;
        }
        return iqz;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View view = this.cn;
        if (view == null) {
            view = this;
        }
        double iqz2 = this.mw.iv().btk().iqz();
        if (iqz2 < 90.0d && iqz2 > 0.0d) {
            com.bytedance.sdk.component.utils.bvs.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw.2
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.setVisibility(8);
                }
            }, (long) (iqz2 * 1000.0d));
        }
        zmn(this.mw.iv().btk().kw(), view);
        if (!TextUtils.isEmpty(this.klz.vlj())) {
            zmn();
        }
        super.onAttachedToWindow();
    }

    private void zmn(double d, final View view) {
        if (d > 0.0d) {
            com.bytedance.sdk.component.utils.bvs.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw.3
                @Override // java.lang.Runnable
                public void run() {
                    if (hhw.this.mw.iv().btk().hip() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    hhw.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.zmn);
            removeCallbacks(this.fs);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof com.bytedance.sdk.component.adexpress.dynamic.zn.bvs) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    private void zmn() {
        if (this.phc) {
            int uqd = this.klz.uqd();
            int kra = this.klz.kra();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw.4
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = hhw.this.rt;
                    if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                        com.bytedance.sdk.component.adexpress.fs.mw renderRequest = hhw.this.rt.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.fb.iv ivVar = new com.bytedance.sdk.component.adexpress.dynamic.fb.iv();
                        ivVar.zmn(renderRequest.cn());
                        ivVar.fs(renderRequest.cyb());
                        ivVar.zn(renderRequest.olo());
                        ivVar.zmn(renderRequest.kgc());
                        ivVar.fs(renderRequest.kw());
                        ivVar.zn(renderRequest.iqz());
                        ivVar.fb(renderRequest.phc());
                        ivVar.btk(renderRequest.doe());
                        hhw hhwVar = hhw.this;
                        hhw hhwVar2 = hhw.this;
                        hhwVar.kw = new com.bytedance.sdk.component.adexpress.dynamic.zn.bvs(hhwVar2.rc, hhwVar2, hhwVar2.klz, ivVar, renderRequest);
                    } else {
                        hhw hhwVar3 = hhw.this;
                        hhw hhwVar4 = hhw.this;
                        hhwVar3.kw = new com.bytedance.sdk.component.adexpress.dynamic.zn.bvs(hhwVar4.rc, hhwVar4, hhwVar4.klz);
                    }
                    hhw hhwVar5 = hhw.this;
                    hhwVar5.fs(hhwVar5.kw);
                    if (hhw.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) hhw.this.getParent()).setClipChildren(false);
                    }
                    hhw.this.setClipChildren(false);
                    hhw.this.kw.setTag(2);
                    hhw hhwVar6 = hhw.this;
                    hhwVar6.zmn((ViewGroup) hhwVar6);
                    hhw hhwVar7 = hhw.this;
                    hhwVar7.addView(hhwVar7.kw, new FrameLayout.LayoutParams(-1, -1));
                    hhw.this.kw.zn();
                }
            };
            this.zmn = runnable;
            postDelayed(runnable, uqd * 1000);
            if (this.klz.na() || kra >= Integer.MAX_VALUE || uqd >= kra) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw.5
                @Override // java.lang.Runnable
                public void run() {
                    hhw hhwVar = hhw.this;
                    if (hhwVar.kw != null) {
                        hhwVar.phc = false;
                        hhw.this.kw.fb();
                        hhw.this.kw.setVisibility(4);
                        hhw hhwVar2 = hhw.this;
                        hhwVar2.removeView(hhwVar2.kw);
                    }
                }
            };
            this.fs = runnable2;
            postDelayed(runnable2, kra * 1000);
        }
    }
}
