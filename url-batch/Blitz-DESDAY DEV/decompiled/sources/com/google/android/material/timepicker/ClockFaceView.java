package com.google.android.material.timepicker;

import M.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.winfour.neondrop.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q0.AbstractC0257a;
import x.C0309j;
import x.k;
import x.o;
import z1.l;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final c f2042A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f2043B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f2044C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2045D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2046E;

    /* renamed from: F, reason: collision with root package name */
    public final int f2047F;

    /* renamed from: G, reason: collision with root package name */
    public final int f2048G;
    public final String[] H;

    /* renamed from: I, reason: collision with root package name */
    public float f2049I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f2050J;

    /* renamed from: v, reason: collision with root package name */
    public final ClockHandView f2051v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2052w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f2053x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f2054y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f2055z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2052w = new Rect();
        this.f2053x = new RectF();
        this.f2054y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2055z = sparseArray;
        this.f2044C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0257a.f3383e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList v2 = z1.d.v(context, obtainStyledAttributes, 1);
        this.f2050J = v2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2051v = clockHandView;
        this.f2045D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = v2.getColorForState(new int[]{android.R.attr.state_selected}, v2.getDefaultColor());
        this.f2043B = new int[]{colorForState, colorForState, v2.getDefaultColor()};
        clockHandView.f2058c.add(this);
        int defaultColor = l.D(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList v3 = z1.d.v(context, obtainStyledAttributes, 0);
        setBackgroundColor(v3 != null ? v3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2042A = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i = 0; i < Math.max(this.H.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.H.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.H[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z2 = i2 > 1 ? true : z2;
                Q.l(textView, this.f2042A);
                textView.setTextColor(this.f2050J);
            }
        }
        ClockHandView clockHandView2 = this.f2051v;
        if (clockHandView2.f2057b && !z2) {
            clockHandView2.f2065m = 1;
        }
        clockHandView2.f2057b = z2;
        clockHandView2.invalidate();
        this.f2046E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f2047F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2048G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        o oVar = new o();
        oVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2071t * 0.66f) : this.f2071t;
            Iterator it = list.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = oVar.f4140c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C0309j());
                }
                k kVar = ((C0309j) hashMap2.get(Integer.valueOf(id))).d;
                kVar.f4114z = R.id.circle_center;
                kVar.f4052A = round;
                kVar.f4053B = f2;
                f2 += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f2055z;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2051v.f2061g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f2055z;
            int size = sparseArray.size();
            rectF = this.f2053x;
            rect = this.f2052w;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f2) {
                    textView = textView2;
                    f2 = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2054y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2043B, this.f2044C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f2048G / Math.max(Math.max(this.f2046E / displayMetrics.heightPixels, this.f2047F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
