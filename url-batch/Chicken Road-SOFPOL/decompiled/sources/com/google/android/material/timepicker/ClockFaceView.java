package com.google.android.material.timepicker;

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
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q3.k0;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final SparseArray A;
    public final c B;
    public final int[] C;
    public final float[] D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final String[] I;
    public float J;
    public final ColorStateList K;

    /* renamed from: w, reason: collision with root package name */
    public final ClockHandView f2013w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f2014x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f2015y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f2016z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2014x = new Rect();
        this.f2015y = new RectF();
        this.f2016z = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.A = sparseArray;
        this.D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5.a.f2739d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList C = o.C(context, obtainStyledAttributes, 1);
        this.K = C;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2013w = clockHandView;
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = C.getColorForState(new int[]{android.R.attr.state_selected}, C.getDefaultColor());
        this.C = new int[]{colorForState, colorForState, C.getDefaultColor()};
        clockHandView.f2020f.add(this);
        int defaultColor = s6.a.q(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList C2 = o.C(context, obtainStyledAttributes, 0);
        setBackgroundColor(C2 != null ? C2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.B = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z3 = false;
        for (int i = 0; i < Math.max(this.I.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.I.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.I[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i8 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i8));
                z3 = i8 > 1 ? true : z3;
                k0.k(textView, this.B);
                textView.setTextColor(this.K);
            }
        }
        ClockHandView clockHandView2 = this.f2013w;
        if (clockHandView2.f2019e && !z3) {
            clockHandView2.f2029p = 1;
        }
        clockHandView2.f2019e = z3;
        clockHandView2.invalidate();
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.H = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        b3.o oVar = new b3.o();
        oVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i8 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i8 == null) {
                    i8 = 1;
                }
                if (!hashMap.containsKey(i8)) {
                    hashMap.put(i8, new ArrayList());
                }
                ((List) hashMap.get(i8)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2038u * 0.66f) : this.f2038u;
            Iterator it = list.iterator();
            float f6 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer valueOf = Integer.valueOf(id);
                HashMap hashMap2 = oVar.f1226c;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id), new b3.j());
                }
                b3.k kVar = ((b3.j) hashMap2.get(Integer.valueOf(id))).f1151d;
                kVar.f1194z = R.id.circle_center;
                kVar.A = round;
                kVar.B = f6;
                f6 += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.A;
            if (i9 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i9)).setVisibility(0);
            i9++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f2013w.f2023j;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.A;
            int size = sparseArray.size();
            rect = this.f2014x;
            rectF = this.f2015y;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f6) {
                    textView = textView2;
                    f6 = height;
                }
            }
            i++;
        }
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            TextView textView3 = (TextView) sparseArray.get(i8);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2016z);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.C, this.D, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.I.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        super.onLayout(z3, i, i8, i9, i10);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.H / Math.max(Math.max(this.F / displayMetrics.heightPixels, this.G / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
