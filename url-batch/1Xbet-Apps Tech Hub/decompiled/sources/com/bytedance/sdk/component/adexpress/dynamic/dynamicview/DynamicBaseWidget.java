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
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.bytedance.sdk.component.adexpress.dynamic.vG.sUS;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.dynamic.vG.yiw;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.component.utils.rCZ;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class DynamicBaseWidget extends FrameLayout implements IAnimation, Jd, NB {
    private static final View.OnTouchListener OT = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener ny = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    protected DynamicRootView IP;
    protected float Jd;
    protected so Ju;
    protected int Mxy;
    protected float NB;
    protected int Wyp;
    protected View bNS;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.pvs cR;
    private float icD;
    protected yiw kj;
    protected boolean mnm;
    private float pvs;
    protected Context qh;
    private rCZ rCZ;
    protected float sUS;
    protected int so;
    private float uc;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.icD vA;
    protected float vG;
    protected int yiw;
    private float zM;

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.icD = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.pvs;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.pvs = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.zM;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.zM = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.uc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.uc = f;
        this.cR.pvs(this, f);
    }

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context);
        this.qh = context;
        this.IP = dynamicRootView;
        this.Ju = soVar;
        this.vG = soVar.sUS();
        this.Jd = soVar.yiw();
        this.NB = soVar.so();
        this.sUS = soVar.Mxy();
        this.Mxy = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.vG);
        this.Wyp = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.Jd);
        this.yiw = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.NB);
        this.so = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.sUS);
        yiw yiwVar = new yiw(soVar.Wyp());
        this.kj = yiwVar;
        if (yiwVar.cR() > 0) {
            this.yiw += this.kj.cR() * 2;
            this.so += this.kj.cR() * 2;
            this.Mxy -= this.kj.cR();
            this.Wyp -= this.kj.cR();
            List<so> qh = soVar.qh();
            if (qh != null) {
                for (so soVar2 : qh) {
                    soVar2.vG(soVar2.sUS() + com.bytedance.sdk.component.adexpress.Jd.yiw.icD(this.qh, this.kj.cR()));
                    soVar2.Jd(soVar2.yiw() + com.bytedance.sdk.component.adexpress.Jd.yiw.icD(this.qh, this.kj.cR()));
                    soVar2.pvs(com.bytedance.sdk.component.adexpress.Jd.yiw.icD(this.qh, this.kj.cR()));
                    soVar2.icD(com.bytedance.sdk.component.adexpress.Jd.yiw.icD(this.qh, this.kj.cR()));
                }
            }
        }
        this.mnm = this.kj.IP() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.cR = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.pvs();
    }

    public void setShouldInvisible(boolean z) {
        this.mnm = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.mnm;
    }

    public boolean vG() {
        Mxy();
        sUS();
        Jd();
        return true;
    }

    public void pvs(int i) {
        yiw yiwVar = this.kj;
        if (yiwVar != null && yiwVar.pvs(i)) {
            Mxy();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).pvs(i);
                }
            }
        }
    }

    protected boolean Jd() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.bNS;
        if (view == null) {
            view = this;
        }
        if (NB()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = OT;
            onClickListener = ny;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int pvs = com.bytedance.sdk.component.adexpress.dynamic.icD.pvs.pvs(this.kj);
            if (pvs == 2 || pvs == 3) {
                view.setOnClickListener(ny);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        pvs(view);
        icD(view);
        return true;
    }

    protected void pvs(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.Ju.so());
            jSONObject.put("height", this.Ju.Mxy());
            if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.uc, this.kj.gSd());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.rCZ, this.Ju.Wyp().icD());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.OT, this.Ju.vG());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.ny, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.kj.gSd());
            view.setTag(2097610715, this.Ju.Wyp().icD());
            view.setTag(2097610714, this.Ju.vG());
            view.setTag(2097610713, jSONObject.toString());
            int pvs = com.bytedance.sdk.component.adexpress.dynamic.icD.pvs.pvs(this.kj);
            if (pvs == 1) {
                view.setTag(2097610707, new Pair(this.kj.dyT(), Long.valueOf(this.kj.dX())));
                view.setTag(2097610708, Integer.valueOf(pvs));
            }
        } catch (JSONException unused) {
        }
    }

    protected void icD(View view) {
        sUS NB;
        so soVar = this.Ju;
        if (soVar == null || (NB = soVar.Wyp().NB()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(NB.LEC()));
    }

    public boolean NB() {
        yiw yiwVar = this.kj;
        return (yiwVar == null || yiwVar.CvL() == 0) ? false : true;
    }

    public void sUS() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.yiw, this.so);
        layoutParams.topMargin = this.Wyp;
        layoutParams.leftMargin = this.Mxy;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.kj.CvL();
    }

    public String getImageObjectFit() {
        return this.kj.OyE();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.NB.pvs getDynamicClickListener() {
        return this.IP.getDynamicClickListener();
    }

    protected Drawable getBackgroundDrawable() {
        return pvs(false, "");
    }

    protected Drawable pvs(boolean z, String str) {
        String[] split;
        int[] iArr;
        int Gp;
        if (!TextUtils.isEmpty(this.kj.sP())) {
            try {
                String sP = this.kj.sP();
                String substring = sP.substring(sP.indexOf("(") + 1, sP.length() - 1);
                if (substring.contains("rgba") && substring.contains("%")) {
                    split = new String[]{substring.substring(0, substring.indexOf(",")).trim(), substring.substring(substring.indexOf(",") + 1, substring.indexOf("%") + 1).trim(), substring.substring(substring.indexOf("%") + 2).trim()};
                    iArr = new int[]{yiw.pvs(split[1]), yiw.pvs(split[2])};
                } else {
                    split = substring.split(", ");
                    iArr = new int[]{yiw.pvs(split[1].substring(0, 7)), yiw.pvs(split[2].substring(0, 7))};
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
                GradientDrawable pvs = pvs(pvs(split[0]), iArr);
                pvs.setShape(0);
                pvs.setCornerRadius(com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.kj.bNS()));
                return pvs;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float pvs2 = com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.kj.bNS());
        drawable.setCornerRadius(pvs2);
        if (pvs2 < 1.0f) {
            float pvs3 = com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.kj.gA());
            float pvs4 = com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.kj.jlb());
            float pvs5 = com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.kj.dx());
            float pvs6 = com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.kj.Pj());
            float[] fArr = new float[8];
            if (pvs3 > 0.0f) {
                fArr[0] = pvs3;
                fArr[1] = pvs3;
            }
            if (pvs4 > 0.0f) {
                fArr[2] = pvs4;
                fArr[3] = pvs4;
            }
            if (pvs5 > 0.0f) {
                fArr[4] = pvs5;
                fArr[5] = pvs5;
            }
            if (pvs6 > 0.0f) {
                fArr[6] = pvs6;
                fArr[7] = pvs6;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            Gp = Color.parseColor(str);
        } else {
            Gp = this.kj.Gp();
        }
        drawable.setColor(Gp);
        if (this.kj.vA() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.kj.vA()), this.kj.mnm());
            return drawable;
        }
        if (this.kj.cR() <= 0) {
            return drawable;
        }
        drawable.setStroke(this.kj.cR(), this.kj.mnm());
        drawable.setAlpha(50);
        if (!TextUtils.equals(this.Ju.Wyp().icD(), "video-vd")) {
            return drawable;
        }
        setLayerType(1, null);
        return new vG((int) pvs2, this.kj.cR());
    }

    protected icD pvs(Bitmap bitmap) {
        return new pvs(bitmap, null);
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(pvs(icD(this.kj.sP().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    private Drawable[] pvs(List<String> list) {
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
                    iArr[i2] = yiw.pvs(split[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable pvs = pvs(pvs(split[0]), iArr);
                pvs.setShape(0);
                pvs.setCornerRadius(com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.qh, this.kj.bNS()));
                drawableArr[(list.size() - 1) - i] = pvs;
            }
        }
        return drawableArr;
    }

    private List<String> icD(String str) {
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

    protected GradientDrawable pvs(GradientDrawable.Orientation orientation, int[] iArr) {
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

    protected GradientDrawable.Orientation pvs(String str) {
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
        this.cR.pvs(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.pvs pvsVar = this.cR;
        View view = this.bNS;
        if (view == null) {
            view = this;
        }
        pvsVar.pvs(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        yiw();
        pvs();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        icD();
        super.onDetachedFromWindow();
    }

    public void yiw() {
        if (so()) {
            return;
        }
        View view = this.bNS;
        if (view == null) {
            view = this;
        }
        com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.icD icd = new com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.icD(view, this.Ju.Wyp().NB().ABo());
        this.vA = icd;
        icd.pvs();
    }

    public void icD() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.icD icd = this.vA;
        if (icd != null) {
            icd.icD();
        }
    }

    protected boolean so() {
        so soVar = this.Ju;
        return soVar == null || soVar.Wyp() == null || this.Ju.Wyp().NB() == null || this.Ju.Wyp().NB().ABo() == null;
    }

    public int getDynamicWidth() {
        return this.yiw;
    }

    public int getDynamicHeight() {
        return this.so;
    }

    public sUS getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.vG.NB Wyp;
        so soVar = this.Ju;
        if (soVar == null || (Wyp = soVar.Wyp()) == null) {
            return null;
        }
        return Wyp.NB();
    }

    private void pvs() {
        if (isShown()) {
            int pvs = com.bytedance.sdk.component.adexpress.dynamic.icD.pvs.pvs(this.kj);
            if (pvs == 2) {
                if (this.rCZ == null) {
                    this.rCZ = new rCZ(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.3
                };
                Ju renderRequest = this.IP.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.bNS();
                    renderRequest.rCZ();
                    renderRequest.zM();
                    return;
                }
                return;
            }
            if (pvs == 3) {
                if (this.rCZ == null) {
                    this.rCZ = new rCZ(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.4
                };
                Ju renderRequest2 = this.IP.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.vA();
                    renderRequest2.OT();
                    renderRequest2.cR();
                    renderRequest2.uc();
                }
            }
        }
    }
}
