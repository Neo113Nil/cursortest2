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
import com.moontiko.really.admiralcasino.R;
import defpackage.a10;
import defpackage.ic0;
import defpackage.kr;
import defpackage.la0;
import defpackage.pb;
import defpackage.rb;
import defpackage.ud;
import defpackage.vd;
import defpackage.y00;
import defpackage.zd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
class ClockFaceView extends a10 implements rb {
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
    public e N;
    public final ClockHandView y;
    public final Rect z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = new Rect();
        this.A = new RectF();
        this.B = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.C = sparseArray;
        this.F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i = 1;
        ColorStateList w = kr.w(context, obtainStyledAttributes, 1);
        this.M = w;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.y = clockHandView;
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = w.getColorForState(new int[]{android.R.attr.state_selected}, w.getDefaultColor());
        this.E = new int[]{colorForState, colorForState, w.getDefaultColor()};
        clockHandView.h.add(this);
        int defaultColor = la0.w(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList w2 = kr.w(context, obtainStyledAttributes, 0);
        setBackgroundColor(w2 != null ? w2.getDefaultColor() : defaultColor);
        obtainStyledAttributes.recycle();
        setOutlineProvider(new pb());
        setFocusable(true);
        setClipToOutline(true);
        this.D = new a(this, i);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.K = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.K.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.K.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.K[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                ic0.m(textView, this.D);
                textView.setTextColor(this.M);
            }
        }
        ClockHandView clockHandView2 = this.y;
        if (clockHandView2.g && !z) {
            clockHandView2.r = 1;
        }
        clockHandView2.g = z;
        clockHandView2.invalidate();
        this.H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.I = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.J = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // defpackage.a10
    public final void m() {
        zd zdVar = new zd();
        zdVar.b(this);
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
            int intValue = ((Integer) entry.getKey()).intValue();
            int i3 = this.w;
            if (intValue == 2) {
                i3 = Math.round(i3 * 0.66f);
            }
            Iterator it = list.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer valueOf = Integer.valueOf(id);
                HashMap hashMap2 = zdVar.c;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id), new ud());
                }
                vd vdVar = ((ud) hashMap2.get(Integer.valueOf(id))).d;
                vdVar.z = R.id.circle_center;
                vdVar.A = i3;
                vdVar.B = f;
                f += 360.0f / list.size();
            }
        }
        zdVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.y.l;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.C;
            int size = sparseArray.size();
            rect = this.z;
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
                if (height < f) {
                    textView = textView2;
                    f = height;
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
        int i2;
        int length;
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i3 >= sparseArray.size()) {
                i2 = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i3);
            if (textView.isSelected()) {
                i2 = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i3++;
        }
        if (!isShown() || i2 == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            String[] strArr = this.K;
            switch (i) {
                case 19:
                case 22:
                    length = (i2 + 1) % strArr.length;
                    break;
                case 20:
                case 21:
                    length = ((i2 - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == i2) {
                return super.onKeyDown(i, keyEvent);
            }
            int i4 = (length / 12) + 1;
            ClockHandView clockHandView = this.y;
            if (i4 != clockHandView.r) {
                clockHandView.r = i4;
                clockHandView.invalidate();
            }
            clockHandView.a((length % 12) * 30.0f);
            n();
            return true;
        }
        e eVar = this.N;
        if (eVar != null) {
            eVar.a.v.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.J / Math.max(Math.max(this.H / displayMetrics.heightPixels, this.I / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i2));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        ClockHandView clockHandView = this.y;
        int i3 = ((max / 2) - clockHandView.i) - this.G;
        int i4 = this.w;
        if (i3 != i4 && i3 != i4) {
            this.w = i3;
            m();
            clockHandView.q = this.w;
            clockHandView.invalidate();
        }
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
