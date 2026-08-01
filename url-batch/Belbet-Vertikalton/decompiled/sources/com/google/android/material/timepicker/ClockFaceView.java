package com.google.android.material.timepicker;

import H1.l;
import M.P;
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
import com.winpower.neonfit.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.AbstractC0383a;
import x.C0418i;
import x.C0419j;
import x.n;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final c f2557A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f2558B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f2559C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2560D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2561E;

    /* renamed from: F, reason: collision with root package name */
    public final int f2562F;

    /* renamed from: G, reason: collision with root package name */
    public final int f2563G;
    public final String[] H;

    /* renamed from: I, reason: collision with root package name */
    public float f2564I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f2565J;

    /* renamed from: v, reason: collision with root package name */
    public final ClockHandView f2566v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2567w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f2568x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f2569y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f2570z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2567w = new Rect();
        this.f2568x = new RectF();
        this.f2569y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2570z = sparseArray;
        this.f2559C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.f4150d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList C2 = H1.d.C(context, obtainStyledAttributes, 1);
        this.f2565J = C2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2566v = clockHandView;
        this.f2560D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = C2.getColorForState(new int[]{android.R.attr.state_selected}, C2.getDefaultColor());
        this.f2558B = new int[]{colorForState, colorForState, C2.getDefaultColor()};
        clockHandView.f2573c.add(this);
        int defaultColor = l.v(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList C3 = H1.d.C(context, obtainStyledAttributes, 0);
        setBackgroundColor(C3 != null ? C3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2557A = new c(this);
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
                P.l(textView, this.f2557A);
                textView.setTextColor(this.f2565J);
            }
        }
        ClockHandView clockHandView2 = this.f2566v;
        if (clockHandView2.f2572b && !z2) {
            clockHandView2.f2580m = 1;
        }
        clockHandView2.f2572b = z2;
        clockHandView2.invalidate();
        this.f2561E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f2562F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2563G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
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
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2587t * 0.66f) : this.f2587t;
            Iterator it = list.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f4700c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C0418i());
                }
                C0419j c0419j = ((C0418i) hashMap2.get(Integer.valueOf(id))).f4609d;
                c0419j.f4673z = R.id.circle_center;
                c0419j.f4612A = round;
                c0419j.f4613B = f2;
                f2 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f2570z;
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
        RectF rectF2 = this.f2566v.f2576g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f2570z;
            int size = sparseArray.size();
            rectF = this.f2568x;
            rect = this.f2567w;
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
                textView3.getLineBounds(0, this.f2569y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2558B, this.f2559C, Shader.TileMode.CLAMP));
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
        int max = (int) (this.f2563G / Math.max(Math.max(this.f2561E / displayMetrics.heightPixels, this.f2562F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
