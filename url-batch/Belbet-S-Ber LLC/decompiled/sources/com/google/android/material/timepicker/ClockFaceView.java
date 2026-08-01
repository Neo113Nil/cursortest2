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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.p0;
import y.n;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final RectF A;
    public final Rect B;
    public final SparseArray C;
    public final a D;
    public final int[] E;
    public final float[] F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final String[] K;
    public float L;
    public final ColorStateList M;
    public j N;

    /* renamed from: y, reason: collision with root package name */
    public final ClockHandView f1245y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1246z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1246z = new Rect();
        this.A = new RectF();
        this.B = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.C = sparseArray;
        this.F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.f3143e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i = 1;
        ColorStateList r4 = b4.l.r(context, obtainStyledAttributes, 1);
        this.M = r4;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1245y = clockHandView;
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = r4.getColorForState(new int[]{android.R.attr.state_selected}, r4.getDefaultColor());
        this.E = new int[]{colorForState, colorForState, r4.getDefaultColor()};
        clockHandView.h.add(this);
        int defaultColor = c0.c.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList r5 = b4.l.r(context, obtainStyledAttributes, 0);
        setBackgroundColor(r5 != null ? r5.getDefaultColor() : defaultColor);
        obtainStyledAttributes.recycle();
        setOutlineProvider(new c());
        setFocusable(true);
        setClipToOutline(true);
        this.D = new a(this, i);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.K = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < Math.max(this.K.length, size); i4++) {
            TextView textView = (TextView) sparseArray.get(i4);
            if (i4 >= this.K.length) {
                removeView(textView);
                sparseArray.remove(i4);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i4, textView);
                    addView(textView);
                }
                textView.setText(this.K[i4]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i4));
                int i5 = (i4 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i5));
                z4 = i5 > 1 ? true : z4;
                p0.m(textView, this.D);
                textView.setTextColor(this.M);
            }
        }
        ClockHandView clockHandView2 = this.f1245y;
        if (clockHandView2.f1249g && !z4) {
            clockHandView2.f1258r = 1;
        }
        clockHandView2.f1249g = z4;
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
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f1266w * 0.66f) : this.f1266w;
            Iterator it = list.iterator();
            float f5 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer valueOf = Integer.valueOf(id);
                HashMap hashMap2 = nVar.f4085c;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id), new y.i());
                }
                y.j jVar = ((y.i) hashMap2.get(Integer.valueOf(id))).d;
                jVar.f4059z = R.id.circle_center;
                jVar.A = round;
                jVar.B = f5;
                f5 += 360.0f / list.size();
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
        RectF rectF2 = this.f1245y.f1252l;
        float f5 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.C;
            int size = sparseArray.size();
            rect = this.f1246z;
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
                if (height < f5) {
                    textView = textView2;
                    f5 = height;
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

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i4;
        int length;
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i5 >= sparseArray.size()) {
                i4 = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i5);
            if (textView.isSelected()) {
                i4 = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i5++;
        }
        if (!isShown() || i4 == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            switch (i) {
                case 19:
                case 22:
                    length = (i4 + 1) % this.K.length;
                    break;
                case 20:
                case 21:
                    String[] strArr = this.K;
                    length = ((i4 - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == i4) {
                return super.onKeyDown(i, keyEvent);
            }
            int i6 = (length / 12) + 1;
            ClockHandView clockHandView = this.f1245y;
            if (i6 != clockHandView.f1258r) {
                clockHandView.f1258r = i6;
                clockHandView.invalidate();
            }
            clockHandView.b((length % 12) * 30.0f);
            n();
            return true;
        }
        j jVar = this.N;
        if (jVar != null) {
            jVar.f1268a.f1260v.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        super.onLayout(z4, i, i4, i5, i6);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.J / Math.max(Math.max(this.H / displayMetrics.heightPixels, this.I / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i4) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i4));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        ClockHandView clockHandView = this.f1245y;
        int i5 = ((max / 2) - clockHandView.i) - this.G;
        int i6 = this.f1266w;
        if (i5 != i6 && i5 != i6) {
            this.f1266w = i5;
            m();
            clockHandView.f1257q = this.f1266w;
            clockHandView.invalidate();
        }
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
