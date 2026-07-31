package com.bytedance.adsdk.ugeno.yoga.fs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.fb;
import com.bytedance.adsdk.ugeno.yoga.btk;
import com.bytedance.adsdk.ugeno.yoga.bvs;
import com.bytedance.adsdk.ugeno.yoga.hhw;
import com.bytedance.adsdk.ugeno.yoga.iv;
import com.bytedance.adsdk.ugeno.yoga.mw;
import com.bytedance.adsdk.ugeno.yoga.rc;
import com.bytedance.adsdk.ugeno.yoga.rt;
import com.bytedance.adsdk.ugeno.zmn.nps;
import com.bytedance.adsdk.ugeno.zmn.zg;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class zn extends ViewGroup implements com.bytedance.adsdk.ugeno.fs.fs, nps {
    private zg fb;
    private final iv fs;
    private final Map<View, iv> zmn;
    private fb zn;

    public zn(Context context) {
        this(context, null, 0);
    }

    public zn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fb = new zg(this);
        iv zmn2 = rc.zmn();
        this.fs = zmn2;
        this.zmn = new HashMap();
        zmn2.zmn(this);
        zmn2.zmn((com.bytedance.adsdk.ugeno.yoga.nps) new fs());
        zmn((zmn) generateDefaultLayoutParams(), zmn2, this);
    }

    public iv getYogaNode() {
        return this.fs;
    }

    public iv zmn(View view) {
        return this.zmn.get(view);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.fs
    public void zmn(int i) {
        iv ivVar = this.fs;
        if (ivVar != null) {
            zmn(ivVar, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.fs
    public void fs(int i) {
        iv ivVar = this.fs;
        if (ivVar != null) {
            fs(ivVar, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.fs
    public void zmn(View view, int i) {
        iv zmn2;
        if (view == null || (zmn2 = zmn(view)) == null) {
            return;
        }
        zmn(zmn2, i);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.fs.fs
    public void fs(View view, int i) {
        iv zmn2;
        if (view == null || (zmn2 = zmn(view)) == null) {
            return;
        }
        fs(zmn2, i);
        view.requestLayout();
    }

    private void zmn(iv ivVar, int i) {
        if (i == -1) {
            ivVar.btk(100.0f);
        } else if (i == -2) {
            ivVar.fb();
        } else {
            ivVar.fb(i);
        }
    }

    private void fs(iv ivVar, int i) {
        if (i == -1) {
            ivVar.nps(100.0f);
        } else if (i == -2) {
            ivVar.btk();
        } else {
            ivVar.hhw(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.fs
    public void zn(View view, int i) {
        fb(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        iv zmn2;
        this.fs.zmn((com.bytedance.adsdk.ugeno.yoga.nps) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.fs.fs) {
            throw null;
        }
        super.addView(view, i, layoutParams);
        if (this.zmn.containsKey(view)) {
            return;
        }
        if (view instanceof zn) {
            zmn2 = ((zn) view).getYogaNode();
        } else {
            if (this.zmn.containsKey(view)) {
                zmn2 = this.zmn.get(view);
            } else {
                zmn2 = rc.zmn();
            }
            zmn2.zmn(view);
            zmn2.zmn((com.bytedance.adsdk.ugeno.yoga.nps) new fs());
        }
        zmn((zmn) view.getLayoutParams(), zmn2, view);
        this.zmn.put(view, zmn2);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.fs.zmn()));
        } else {
            iv ivVar = this.fs;
            ivVar.zmn(zmn2, ivVar.zmn());
        }
    }

    public void fb(View view, int i) {
        int zmn2;
        view.setVisibility(i);
        try {
            iv ivVar = this.zmn.get(view);
            Object tag = view.getTag(151060224);
            if (i != 0) {
                if (i != 8 || (zmn2 = this.fs.zmn(ivVar)) == -1) {
                    return;
                }
                this.fs.fs(zmn2);
                view.setTag(151060224, Integer.valueOf(zmn2));
                zmn(this.fs);
                return;
            }
            if (tag == null || this.fs.zmn(ivVar) != -1) {
                return;
            }
            int intValue = ((Integer) tag).intValue();
            if (intValue < this.fs.zmn()) {
                this.fs.zmn(this.zmn.get(view), intValue);
            } else {
                this.fs.zmn(this.zmn.get(view), this.fs.zmn());
            }
            zmn(this.fs);
        } catch (Throwable unused) {
        }
    }

    private void zmn(iv ivVar) {
        if (ivVar.fs() != null) {
            zmn(ivVar.fs());
        } else {
            ivVar.zmn(Float.NaN, Float.NaN);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        zmn(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        zmn(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        zmn(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            zmn(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            zmn(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            zmn(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            zmn(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    private void zmn(View view, boolean z) {
        try {
            iv ivVar = this.zmn.get(view);
            if (ivVar == null) {
                return;
            }
            iv fs2 = ivVar.fs();
            int i = 0;
            while (true) {
                if (i >= fs2.zmn()) {
                    break;
                }
                if (fs2.zmn(i).equals(ivVar)) {
                    fs2.fs(i);
                    break;
                }
                i++;
            }
            ivVar.zmn((Object) null);
            this.zmn.remove(view);
            if (z) {
                this.fs.zmn(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void zmn(iv ivVar, float f, float f2) {
        View view = (View) ivVar.iv();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int round = Math.round(ivVar.hhw() + f);
            int round2 = Math.round(ivVar.nps() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(ivVar.zg()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(ivVar.bvs()), 1073741824));
            view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
        }
        int zmn2 = ivVar.zmn();
        for (int i = 0; i < zmn2; i++) {
            if (equals(view)) {
                zmn(ivVar.zmn(i), f, f2);
            } else if (!(view instanceof zn)) {
                zmn(ivVar.zmn(i), ivVar.hhw() + f, ivVar.nps() + f2);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.zmn(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.fs(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.hhw();
        }
        if (!(getParent() instanceof zn)) {
            zmn(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        zmn(this.fs, 0.0f, 0.0f);
        fb fbVar2 = this.zn;
        if (fbVar2 != null) {
            fbVar2.zmn(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(getParent() instanceof zn)) {
            zmn(i, i2);
        }
        fb fbVar = this.zn;
        if (fbVar != null) {
            int[] zmn2 = fbVar.zmn(i, i2);
            setMeasuredDimension(zmn2[0], zmn2[1]);
        } else {
            setMeasuredDimension(Math.round(this.fs.zg()), Math.round(this.fs.bvs()));
        }
        fb fbVar2 = this.zn;
        if (fbVar2 != null) {
            fbVar2.btk();
        }
    }

    private void zmn(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.fs.hhw(size2);
        }
        if (mode == 1073741824) {
            this.fs.fb(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.fs.rc(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.fs.iv(size);
        }
        this.fs.zmn(Float.NaN, Float.NaN);
    }

    protected static void zmn(zmn zmnVar, iv ivVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            ivVar.zmn(com.bytedance.adsdk.ugeno.yoga.zn.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.fb.LEFT, r0.left);
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.fb.TOP, r0.top);
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.fb.RIGHT, r0.right);
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.fb.BOTTOM, r0.bottom);
            }
        }
        for (int i = 0; i < zmnVar.zmn.size(); i++) {
            int keyAt = zmnVar.zmn.keyAt(i);
            float floatValue = zmnVar.zmn.valueAt(i).floatValue();
            if (keyAt == 4) {
                ivVar.zn(com.bytedance.adsdk.ugeno.yoga.zmn.zmn(Math.round(floatValue)));
            } else if (keyAt == 0) {
                ivVar.zmn(com.bytedance.adsdk.ugeno.yoga.zmn.zmn(Math.round(floatValue)));
            } else if (keyAt == 9) {
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.zmn.zmn(Math.round(floatValue)));
            } else if (keyAt == 25) {
                ivVar.klz(floatValue);
            } else if (keyAt == 8) {
                if (floatValue < 0.0f) {
                    ivVar.zn();
                } else {
                    ivVar.zn(floatValue);
                }
            } else if (keyAt == 1) {
                ivVar.zmn(btk.zmn(Math.round(floatValue)));
            } else if (keyAt == 6) {
                ivVar.zmn(floatValue);
            } else if (keyAt == 7) {
                ivVar.fs(floatValue);
            } else if (keyAt == 16) {
                if (floatValue == -1.0f) {
                    ivVar.nps(100.0f);
                } else if (floatValue == -2.0f) {
                    ivVar.btk();
                } else {
                    ivVar.hhw(floatValue);
                }
            } else if (keyAt == 18) {
                ivVar.zmn(com.bytedance.adsdk.ugeno.yoga.fb.LEFT, floatValue);
            } else if (keyAt == 3) {
                ivVar.zmn(hhw.zmn(Math.round(floatValue)));
            } else if (keyAt == 17) {
                ivVar.zmn(com.bytedance.adsdk.ugeno.yoga.fb.TOP, floatValue);
            } else if (keyAt == 20) {
                ivVar.zmn(com.bytedance.adsdk.ugeno.yoga.fb.RIGHT, floatValue);
            } else if (keyAt == 19) {
                ivVar.zmn(com.bytedance.adsdk.ugeno.yoga.fb.BOTTOM, floatValue);
            } else if (keyAt == 28) {
                ivVar.bvs(floatValue);
            } else if (keyAt == 27) {
                ivVar.zg(floatValue);
            } else if (keyAt == 22) {
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.fb.LEFT, floatValue);
            } else if (keyAt == 21) {
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.fb.TOP, floatValue);
            } else if (keyAt == 24) {
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.fb.RIGHT, floatValue);
            } else if (keyAt == 23) {
                ivVar.fs(com.bytedance.adsdk.ugeno.yoga.fb.BOTTOM, floatValue);
            } else if (keyAt == 11) {
                ivVar.zn(com.bytedance.adsdk.ugeno.yoga.fb.LEFT, floatValue);
            } else if (keyAt == 10) {
                ivVar.zn(com.bytedance.adsdk.ugeno.yoga.fb.TOP, floatValue);
            } else if (keyAt == 13) {
                ivVar.zn(com.bytedance.adsdk.ugeno.yoga.fb.RIGHT, floatValue);
            } else if (keyAt == 12) {
                ivVar.zn(com.bytedance.adsdk.ugeno.yoga.fb.BOTTOM, floatValue);
            } else if (keyAt == 14) {
                ivVar.zmn(mw.zmn(Math.round(floatValue)));
            } else if (keyAt == 15) {
                if (floatValue == -1.0f) {
                    ivVar.btk(100.0f);
                } else if (floatValue == -2.0f) {
                    ivVar.fb();
                } else {
                    ivVar.fb(floatValue);
                }
            } else if (keyAt == 2) {
                ivVar.zmn(rt.zmn(Math.round(floatValue)));
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new zmn(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new zmn(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zmn;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.zg();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.fs(i, i2, i3, i4);
        }
    }

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        this.zn = znVar;
    }

    public void setBorderRadius(float f) {
        this.fb.zmn(f);
    }

    public float getBorderRadius() {
        return this.fb.zmn();
    }

    public void setRipple(float f) {
        zg zgVar = this.fb;
        if (zgVar != null) {
            zgVar.fs(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getRipple() {
        return this.fb.getRipple();
    }

    public void setShine(float f) {
        zg zgVar = this.fb;
        if (zgVar != null) {
            zgVar.zn(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getShine() {
        return this.fb.getShine();
    }

    public void setStretch(float f) {
        zg zgVar = this.fb;
        if (zgVar != null) {
            zgVar.fb(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getStretch() {
        return this.fb.getStretch();
    }

    public void setRubIn(float f) {
        zg zgVar = this.fb;
        if (zgVar != null) {
            zgVar.btk(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getRubIn() {
        return this.fb.getRubIn();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.fb.zmn(i);
    }

    public static class zmn extends ViewGroup.LayoutParams {
        private float btk;
        private float bvs;
        private float cn;
        private float cyb;
        private float fb;
        SparseArray<String> fs;
        private float hhw;
        private float iv;
        private float kgc;
        private float klz;
        private float kw;
        private float mw;
        private float nps;
        private float olo;
        private float rc;
        private float rt;
        private float zg;
        SparseArray<Float> zmn;
        private float zn;

        public zmn(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof zmn) {
                zmn zmnVar = (zmn) layoutParams;
                this.zmn = zmnVar.zmn.clone();
                this.fs = zmnVar.fs.clone();
                return;
            }
            this.zmn = new SparseArray<>();
            this.fs = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.zmn.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.zmn.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public zmn(int i, int i2) {
            super(i, i2);
            this.zmn = new SparseArray<>();
            this.fs = new SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.zmn.put(15, Float.valueOf(i));
            }
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.zmn.put(16, Float.valueOf(i2));
            }
        }

        public void zmn(float f) {
            this.nps = f;
            this.zmn.put(5, Float.valueOf(f));
        }

        public void fs(float f) {
            this.zg = f;
            this.zmn.put(6, Float.valueOf(f));
        }

        public void zn(float f) {
            this.bvs = f;
            this.zmn.put(7, Float.valueOf(f));
        }

        public void fb(float f) {
            this.iv = f;
            this.zmn.put(8, Float.valueOf(f));
        }

        public void btk(float f) {
            this.rc = f;
            this.zmn.put(9, Float.valueOf(f));
        }

        public void hhw(float f) {
            this.klz = f;
            this.zmn.put(14, Float.valueOf(f));
        }

        public void nps(float f) {
            this.mw = f;
            this.zmn.put(10, Float.valueOf(f));
        }

        public void zg(float f) {
            this.rt = f;
            this.zmn.put(11, Float.valueOf(f));
        }

        public void bvs(float f) {
            this.cn = f;
            this.zmn.put(12, Float.valueOf(f));
        }

        public void iv(float f) {
            this.cyb = f;
            this.zmn.put(13, Float.valueOf(f));
        }

        public void rc(float f) {
            this.zn = f;
            this.zmn.put(17, Float.valueOf(f));
        }

        public void klz(float f) {
            this.fb = f;
            this.zmn.put(18, Float.valueOf(f));
        }

        public void mw(float f) {
            this.btk = f;
            this.zmn.put(19, Float.valueOf(f));
        }

        public void rt(float f) {
            this.hhw = f;
            this.zmn.put(20, Float.valueOf(f));
        }

        public void cn(float f) {
            this.olo = f;
            this.zmn.put(25, Float.valueOf(f));
        }

        public void cyb(float f) {
            this.kgc = f;
            this.zmn.put(27, Float.valueOf(f));
        }

        public void olo(float f) {
            this.kw = f;
            this.zmn.put(28, Float.valueOf(f));
        }
    }

    public static class fs implements com.bytedance.adsdk.ugeno.yoga.nps {
        @Override // com.bytedance.adsdk.ugeno.yoga.nps
        public long zmn(iv ivVar, float f, com.bytedance.adsdk.ugeno.yoga.zg zgVar, float f2, com.bytedance.adsdk.ugeno.yoga.zg zgVar2) {
            View view = (View) ivVar.iv();
            if (view == null || (view instanceof zn)) {
                return bvs.zmn(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f, zmn(zgVar)), View.MeasureSpec.makeMeasureSpec((int) f2, zmn(zgVar2)));
            return bvs.zmn(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int zmn(com.bytedance.adsdk.ugeno.yoga.zg zgVar) {
            if (zgVar == com.bytedance.adsdk.ugeno.yoga.zg.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return zgVar == com.bytedance.adsdk.ugeno.yoga.zg.EXACTLY ? 1073741824 : 0;
        }
    }
}
