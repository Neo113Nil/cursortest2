package com.google.android.material.timepicker;

import K.T;
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
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p0.AbstractC0285a;
import v.j;
import v.k;
import v.o;
import z1.l;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final c f1986A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f1987B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f1988C;

    /* renamed from: D, reason: collision with root package name */
    public final int f1989D;

    /* renamed from: E, reason: collision with root package name */
    public final int f1990E;
    public final int F;

    /* renamed from: G, reason: collision with root package name */
    public final int f1991G;

    /* renamed from: H, reason: collision with root package name */
    public final String[] f1992H;

    /* renamed from: I, reason: collision with root package name */
    public float f1993I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f1994J;

    /* renamed from: v, reason: collision with root package name */
    public final ClockHandView f1995v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f1996w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f1997x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f1998y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f1999z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1996w = new Rect();
        this.f1997x = new RectF();
        this.f1998y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f1999z = sparseArray;
        this.f1988C = new float[]{RecyclerView.f1559A0, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList t2 = l.t(context, obtainStyledAttributes, 1);
        this.f1994J = t2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1995v = clockHandView;
        this.f1989D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = t2.getColorForState(new int[]{android.R.attr.state_selected}, t2.getDefaultColor());
        this.f1987B = new int[]{colorForState, colorForState, t2.getDefaultColor()};
        clockHandView.f2002c.add(this);
        int defaultColor = z1.d.C(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList t3 = l.t(context, obtainStyledAttributes, 0);
        setBackgroundColor(t3 != null ? t3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f1986A = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f1992H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i = 0; i < Math.max(this.f1992H.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f1992H.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f1992H[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z2 = i2 > 1 ? true : z2;
                T.l(textView, this.f1986A);
                textView.setTextColor(this.f1994J);
            }
        }
        ClockHandView clockHandView2 = this.f1995v;
        if (clockHandView2.f2001b && !z2) {
            clockHandView2.f2009m = 1;
        }
        clockHandView2.f2001b = z2;
        clockHandView2.invalidate();
        this.f1990E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f1991G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
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
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2015t * 0.66f) : this.f2015t;
            Iterator it = list.iterator();
            float f2 = RecyclerView.f1559A0;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = oVar.f3984c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new j());
                }
                k kVar = ((j) hashMap2.get(Integer.valueOf(id))).d;
                kVar.f3958z = R.id.circle_center;
                kVar.f3897A = round;
                kVar.f3898B = f2;
                f2 += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f1999z;
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
        RectF rectF2 = this.f1995v.f2005g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f1999z;
            int size = sparseArray.size();
            rectF = this.f1997x;
            rect = this.f1996w;
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
                textView3.getLineBounds(0, this.f1998y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f1987B, this.f1988C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f1992H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f1991G / Math.max(Math.max(this.f1990E / displayMetrics.heightPixels, this.F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
