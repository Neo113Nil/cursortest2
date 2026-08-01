package com.google.android.material.timepicker;

import K.X;
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
import com.luckyarcade.spinthrow.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.AbstractC0305a;
import v.C0355i;
import v.C0356j;
import v.n;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final c f2029A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f2030B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f2031C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2032D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2033E;
    public final int F;

    /* renamed from: G, reason: collision with root package name */
    public final int f2034G;

    /* renamed from: H, reason: collision with root package name */
    public final String[] f2035H;

    /* renamed from: I, reason: collision with root package name */
    public float f2036I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f2037J;

    /* renamed from: v, reason: collision with root package name */
    public final ClockHandView f2038v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2039w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f2040x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f2041y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f2042z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2039w = new Rect();
        this.f2040x = new RectF();
        this.f2041y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2042z = sparseArray;
        this.f2031C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0305a.f3637d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList y2 = q1.d.y(context, obtainStyledAttributes, 1);
        this.f2037J = y2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2038v = clockHandView;
        this.f2032D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = y2.getColorForState(new int[]{android.R.attr.state_selected}, y2.getDefaultColor());
        this.f2030B = new int[]{colorForState, colorForState, y2.getDefaultColor()};
        clockHandView.f2045c.add(this);
        int defaultColor = q1.d.w(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList y3 = q1.d.y(context, obtainStyledAttributes, 0);
        setBackgroundColor(y3 != null ? y3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2029A = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2035H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i = 0; i < Math.max(this.f2035H.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f2035H.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f2035H[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z2 = i2 > 1 ? true : z2;
                X.l(textView, this.f2029A);
                textView.setTextColor(this.f2037J);
            }
        }
        ClockHandView clockHandView2 = this.f2038v;
        if (clockHandView2.f2044b && !z2) {
            clockHandView2.f2053m = 1;
        }
        clockHandView2.f2044b = z2;
        clockHandView2.invalidate();
        this.f2033E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2034G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        n nVar = new n();
        nVar.b(this);
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
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2060t * 0.66f) : this.f2060t;
            Iterator it = list.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f4439c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C0355i());
                }
                C0356j c0356j = ((C0355i) hashMap2.get(Integer.valueOf(id))).f4344d;
                c0356j.f4409z = R.id.circle_center;
                c0356j.f4348A = round;
                c0356j.f4349B = f2;
                f2 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f2042z;
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
        RectF rectF2 = this.f2038v.f2049g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f2042z;
            int size = sparseArray.size();
            rectF = this.f2040x;
            rect = this.f2039w;
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
                textView3.getLineBounds(0, this.f2041y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2030B, this.f2031C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2035H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f2034G / Math.max(Math.max(this.f2033E / displayMetrics.heightPixels, this.F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
