package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class btk extends FrameLayout implements IAnimation, fkt, tf {
    private static final View.OnTouchListener doe = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener nqi = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    protected float btk;
    protected int bvs;
    protected View cn;
    protected boolean cyb;
    protected float fb;
    private float fs;
    protected float hhw;
    private float iqz;
    protected int iv;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.zn kgc;
    protected com.bytedance.sdk.component.adexpress.dynamic.fb.nps klz;
    private float kw;
    protected com.bytedance.sdk.component.adexpress.dynamic.fb.zg mw;
    protected int nps;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fs olo;
    private com.bytedance.sdk.component.utils.uqh phc;
    protected Context rc;
    protected DynamicRootView rt;
    protected int zg;
    private float zmn;
    protected float zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.fs = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.zmn;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.zmn = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.kw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.kw = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.iqz;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.iqz = f;
        this.kgc.zmn(this, f);
    }

    public btk(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context);
        this.rc = context;
        this.rt = dynamicRootView;
        this.mw = zgVar;
        this.zn = zgVar.hhw();
        this.fb = zgVar.nps();
        this.btk = zgVar.zg();
        this.hhw = zgVar.bvs();
        this.bvs = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.zn);
        this.iv = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.fb);
        this.nps = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.btk);
        this.zg = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.hhw);
        com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar = new com.bytedance.sdk.component.adexpress.dynamic.fb.nps(zgVar.iv());
        this.klz = npsVar;
        if (npsVar.kgc() > 0) {
            this.nps += this.klz.kgc() * 2;
            this.zg += this.klz.kgc() * 2;
            this.bvs -= this.klz.kgc();
            this.iv -= this.klz.kgc();
            List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> rc = zgVar.rc();
            if (rc != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar2 : rc) {
                    zgVar2.zn(zgVar2.hhw() + com.bytedance.sdk.component.adexpress.fb.nps.fs(this.rc, this.klz.kgc()));
                    zgVar2.fb(zgVar2.nps() + com.bytedance.sdk.component.adexpress.fb.nps.fs(this.rc, this.klz.kgc()));
                    zgVar2.zmn(com.bytedance.sdk.component.adexpress.fb.nps.fs(this.rc, this.klz.kgc()));
                    zgVar2.fs(com.bytedance.sdk.component.adexpress.fb.nps.fs(this.rc, this.klz.kgc()));
                }
            }
        }
        this.cyb = this.klz.rt() > 0.0d;
        this.kgc = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.zn();
    }

    public void setShouldInvisible(boolean z) {
        this.cyb = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.cyb;
    }

    public boolean zn() {
        bvs();
        hhw();
        fb();
        return true;
    }

    protected boolean fb() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.cn;
        if (view == null) {
            view = this;
        }
        if (btk()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = doe;
            onClickListener = nqi;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int zmn = com.bytedance.sdk.component.adexpress.dynamic.fs.zmn.zmn(this.klz);
            if (zmn == 2 || zmn == 3) {
                view.setOnClickListener(nqi);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        zmn(view);
        fs(view);
        return true;
    }

    protected void zmn(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.mw.zg());
            jSONObject.put("height", this.mw.bvs());
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.zmn.iqz, this.klz.nu());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.zmn.phc, this.mw.iv().fs());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.zmn.doe, this.mw.zn());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.zmn.nqi, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.klz.nu());
            view.setTag(2097610715, this.mw.iv().fs());
            view.setTag(2097610714, this.mw.zn());
            view.setTag(2097610713, jSONObject.toString());
            int zmn = com.bytedance.sdk.component.adexpress.dynamic.fs.zmn.zmn(this.klz);
            if (zmn == 1) {
                view.setTag(2097610707, new Pair(this.klz.bjh(), Long.valueOf(this.klz.rp())));
                view.setTag(2097610708, Integer.valueOf(zmn));
            }
        } catch (JSONException unused) {
        }
    }

    protected void fs(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk;
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar = this.mw;
        if (zgVar == null || (btk = zgVar.iv().btk()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(btk.pl()));
    }

    public boolean btk() {
        com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar = this.klz;
        return (npsVar == null || npsVar.kjb() == 0) ? false : true;
    }

    public void hhw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.nps, this.zg);
        layoutParams.topMargin = this.iv;
        int i = this.bvs;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.klz.kjb();
    }

    public String getImageObjectFit() {
        return this.klz.bxw();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn getDynamicClickListener() {
        return this.rt.getDynamicClickListener();
    }

    protected Drawable getBackgroundDrawable() {
        return zmn(false, "");
    }

    protected Drawable zmn(boolean z, String str) {
        String[] split;
        int[] iArr;
        int zak;
        if (!TextUtils.isEmpty(this.klz.hgd())) {
            try {
                String hgd = this.klz.hgd();
                String substring = hgd.substring(hgd.indexOf("(") + 1, hgd.length() - 1);
                if (substring.contains("rgba") && substring.contains("%")) {
                    split = new String[]{substring.substring(0, substring.indexOf(StringUtils.COMMA)).trim(), substring.substring(substring.indexOf(StringUtils.COMMA) + 1, substring.indexOf("%") + 1).trim(), substring.substring(substring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(split[1]), com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(split[2])};
                } else {
                    split = substring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(split[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(split[2].substring(0, 7))};
                }
                try {
                    double parseDouble = Double.parseDouble(substring.substring(substring.indexOf("linear-gradient(") + 1, substring.indexOf("deg")));
                    if (parseDouble > 225.0d && parseDouble < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable zmn = zmn(zmn(split[0]), iArr);
                zmn.setShape(0);
                zmn.setCornerRadius(com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.cn()));
                return zmn;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float zmn2 = com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.cn());
        drawable.setCornerRadius(zmn2);
        if (zmn2 < 1.0f) {
            float zmn3 = com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.yj());
            float zmn4 = com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.so());
            float zmn5 = com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.ev());
            float zmn6 = com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.tf());
            float[] fArr = new float[8];
            if (zmn3 > 0.0f) {
                fArr[0] = zmn3;
                fArr[1] = zmn3;
            }
            if (zmn4 > 0.0f) {
                fArr[2] = zmn4;
                fArr[3] = zmn4;
            }
            if (zmn5 > 0.0f) {
                fArr[4] = zmn5;
                fArr[5] = zmn5;
            }
            if (zmn6 > 0.0f) {
                fArr[6] = zmn6;
                fArr[7] = zmn6;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            zak = Color.parseColor(str);
        } else {
            zak = this.klz.zak();
        }
        drawable.setColor(zak);
        if (this.klz.olo() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.olo()), this.klz.cyb());
        } else if (this.klz.kgc() > 0) {
            drawable.setStroke(this.klz.kgc(), this.klz.cyb());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.mw.iv().fs(), "video-vd")) {
                setLayerType(1, null);
                return new kw((int) zmn2, this.klz.kgc());
            }
        }
        return drawable;
    }

    protected fs zmn(Bitmap bitmap) {
        return new zmn(bitmap, null);
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(zmn(fs(this.klz.hgd().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    private Drawable[] zmn(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] split = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = split.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(split[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable zmn = zmn(zmn(split[0]), iArr);
                zmn.setShape(0);
                zmn.setCornerRadius(com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.cn()));
                drawableArr[(list.size() - 1) - i] = zmn;
            }
        }
        return drawableArr;
    }

    private List<String> fs(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && i - 1 == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    protected GradientDrawable zmn(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new GradientDrawable();
        }
        if (iArr.length == 1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr[0]);
            return gradientDrawable;
        }
        return new GradientDrawable(orientation, iArr);
    }

    protected GradientDrawable.Orientation zmn(String str) {
        try {
            int parseFloat = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (parseFloat <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseFloat <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseFloat <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.kgc.zmn(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.zn znVar = this.kgc;
        View view = this.cn;
        if (view == null) {
            view = this;
        }
        znVar.zmn(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        nps();
        zmn();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        fs();
        super.onDetachedFromWindow();
    }

    public void nps() {
        if (zg()) {
            return;
        }
        View view = this.cn;
        if (view == null) {
            view = this;
        }
        this.olo = new com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fs(view, this.mw.iv().btk().hip());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fs fsVar = btk.this.olo;
                if (fsVar != null) {
                    fsVar.zmn();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkt
    public void fs() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fs fsVar = this.olo;
        if (fsVar != null) {
            fsVar.fs();
        }
    }

    protected boolean zg() {
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar = this.mw;
        return zgVar == null || zgVar.iv() == null || this.mw.iv().btk() == null || this.mw.iv().btk().hip() == null;
    }

    public int getDynamicWidth() {
        return this.nps;
    }

    public int getDynamicHeight() {
        return this.zg;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fb.hhw getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.fb.btk iv;
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar = this.mw;
        if (zgVar == null || (iv = zgVar.iv()) == null) {
            return null;
        }
        return iv.btk();
    }

    private void zmn() {
        if (isShown()) {
            int zmn = com.bytedance.sdk.component.adexpress.dynamic.fs.zmn.zmn(this.klz);
            if (zmn == 2) {
                if (this.phc == null) {
                    this.phc = new com.bytedance.sdk.component.utils.uqh(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk.4
                };
                com.bytedance.sdk.component.adexpress.fs.mw renderRequest = this.rt.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.cn();
                    renderRequest.phc();
                    renderRequest.kw();
                    return;
                }
                return;
            }
            if (zmn == 3) {
                if (this.phc == null) {
                    this.phc = new com.bytedance.sdk.component.utils.uqh(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk.5
                };
                com.bytedance.sdk.component.adexpress.fs.mw renderRequest2 = this.rt.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.olo();
                    renderRequest2.doe();
                    renderRequest2.kgc();
                    renderRequest2.iqz();
                }
            }
        }
    }
}
