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
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.j0;
import v.n;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
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
    public final ClockHandView f1438y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1439z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1439z = new Rect();
        this.A = new RectF();
        this.B = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.C = sparseArray;
        this.F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.f2860d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i4 = 1;
        ColorStateList u3 = k3.m.u(context, obtainStyledAttributes, 1);
        this.M = u3;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1438y = clockHandView;
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = u3.getColorForState(new int[]{android.R.attr.state_selected}, u3.getDefaultColor());
        this.E = new int[]{colorForState, colorForState, u3.getDefaultColor()};
        clockHandView.h.add(this);
        int defaultColor = k3.d.D(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList u4 = k3.m.u(context, obtainStyledAttributes, 0);
        setBackgroundColor(u4 != null ? u4.getDefaultColor() : defaultColor);
        obtainStyledAttributes.recycle();
        setOutlineProvider(new c());
        setFocusable(true);
        setClipToOutline(true);
        this.D = new a(this, i4);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.K = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z3 = false;
        for (int i5 = 0; i5 < Math.max(this.K.length, size); i5++) {
            TextView textView = (TextView) sparseArray.get(i5);
            if (i5 >= this.K.length) {
                removeView(textView);
                sparseArray.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i5, textView);
                    addView(textView);
                }
                textView.setText(this.K[i5]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i5));
                int i6 = (i5 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i6));
                z3 = i6 > 1 ? true : z3;
                j0.m(textView, this.D);
                textView.setTextColor(this.M);
            }
        }
        ClockHandView clockHandView2 = this.f1438y;
        if (clockHandView2.g && !z3) {
            clockHandView2.f1451r = 1;
        }
        clockHandView2.g = z3;
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
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i5 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i5 == null) {
                    i5 = 1;
                }
                if (!hashMap.containsKey(i5)) {
                    hashMap.put(i5, new ArrayList());
                }
                ((List) hashMap.get(i5)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f1460w * 0.66f) : this.f1460w;
            Iterator it = list.iterator();
            float f4 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer valueOf = Integer.valueOf(id);
                HashMap hashMap2 = nVar.c;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id), new v.i());
                }
                v.j jVar = ((v.i) hashMap2.get(Integer.valueOf(id))).f3502d;
                jVar.f3541z = R.id.circle_center;
                jVar.A = round;
                jVar.B = f4;
                f4 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i6 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i6)).setVisibility(0);
            i6++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f1438y.f1445l;
        float f4 = Float.MAX_VALUE;
        TextView textView = null;
        int i4 = 0;
        while (true) {
            sparseArray = this.C;
            int size = sparseArray.size();
            rect = this.f1439z;
            rectF = this.A;
            if (i4 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i4);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f4) {
                    textView = textView2;
                    f4 = height;
                }
            }
            i4++;
        }
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            TextView textView3 = (TextView) sparseArray.get(i5);
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
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        int i5;
        int length;
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i6 >= sparseArray.size()) {
                i5 = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i6);
            if (textView.isSelected()) {
                i5 = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i6++;
        }
        if (!isShown() || i5 == -1) {
            return super.onKeyDown(i4, keyEvent);
        }
        if (i4 != 66) {
            switch (i4) {
                case 19:
                case 22:
                    length = (i5 + 1) % this.K.length;
                    break;
                case 20:
                case 21:
                    String[] strArr = this.K;
                    length = ((i5 - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i4, keyEvent);
            }
            if (length == i5) {
                return super.onKeyDown(i4, keyEvent);
            }
            int i7 = (length / 12) + 1;
            ClockHandView clockHandView = this.f1438y;
            if (i7 != clockHandView.f1451r) {
                clockHandView.f1451r = i7;
                clockHandView.invalidate();
            }
            clockHandView.b((length % 12) * 30.0f);
            n();
            return true;
        }
        j jVar = this.N;
        if (jVar != null) {
            jVar.f1462a.f1453v.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.J / Math.max(Math.max(this.H / displayMetrics.heightPixels, this.I / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i4) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i4));
        }
        if (View.MeasureSpec.getMode(i5) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i5));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        ClockHandView clockHandView = this.f1438y;
        int i6 = ((max / 2) - clockHandView.f1442i) - this.G;
        int i7 = this.f1460w;
        if (i6 != i7 && i6 != i7) {
            this.f1460w = i6;
            m();
            clockHandView.f1450q = this.f1460w;
            clockHandView.invalidate();
        }
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
