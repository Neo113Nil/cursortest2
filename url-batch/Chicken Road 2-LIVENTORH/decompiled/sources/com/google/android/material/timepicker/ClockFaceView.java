package com.google.android.material.timepicker;

import a.y;
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
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.l0;
import y.n;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final RectF A;
    public final Rect B;
    public final SparseArray C;
    public final c D;
    public final int[] E;
    public final float[] F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final String[] K;
    public float L;
    public final ColorStateList M;

    /* renamed from: y, reason: collision with root package name */
    public final ClockHandView f1056y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1057z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1057z = new Rect();
        this.A = new RectF();
        this.B = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.C = sparseArray;
        this.F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f2814f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList t2 = h.a.t(context, obtainStyledAttributes, 1);
        this.M = t2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1056y = clockHandView;
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = t2.getColorForState(new int[]{android.R.attr.state_selected}, t2.getDefaultColor());
        this.E = new int[]{colorForState, colorForState, t2.getDefaultColor()};
        clockHandView.f1061h.add(this);
        int defaultColor = y.B(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList t3 = h.a.t(context, obtainStyledAttributes, 0);
        setBackgroundColor(t3 != null ? t3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.D = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.K = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z3 = false;
        for (int i = 0; i < Math.max(this.K.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.K.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.K[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i4 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i4));
                z3 = i4 > 1 ? true : z3;
                l0.m(textView, this.D);
                textView.setTextColor(this.M);
            }
        }
        ClockHandView clockHandView2 = this.f1056y;
        if (clockHandView2.f1060g && !z3) {
            clockHandView2.f1070r = 1;
        }
        clockHandView2.f1060g = z3;
        clockHandView2.invalidate();
        this.H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.I = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.J = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!hashMap.containsKey(i4)) {
                    hashMap.put(i4, new ArrayList());
                }
                ((List) hashMap.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f1078w * 0.66f) : this.f1078w;
            Iterator it = list.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer valueOf = Integer.valueOf(id);
                HashMap hashMap2 = nVar.f3765c;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id), new y.i());
                }
                y.j jVar = ((y.i) hashMap2.get(Integer.valueOf(id))).d;
                jVar.f3737z = R.id.circle_center;
                jVar.A = round;
                jVar.B = f2;
                f2 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i5 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i5)).setVisibility(0);
            i5++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f1056y.f1064l;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.C;
            int size = sparseArray.size();
            rect = this.f1057z;
            rectF = this.A;
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
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            TextView textView3 = (TextView) sparseArray.get(i4);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.B);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.E, this.F, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.K.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.J / Math.max(Math.max(this.H / displayMetrics.heightPixels, this.I / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
