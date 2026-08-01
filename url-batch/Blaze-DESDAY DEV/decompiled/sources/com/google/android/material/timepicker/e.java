package com.google.android.material.timepicker;

import D0.p;
import J0.j;
import K.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.winworm.neongrid.R;
import java.util.WeakHashMap;
import p0.AbstractC0285a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final p f2014s;

    /* renamed from: t, reason: collision with root package name */
    public int f2015t;

    /* renamed from: u, reason: collision with root package name */
    public final J0.g f2016u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        J0.g gVar = new J0.g();
        this.f2016u = gVar;
        J0.h hVar = new J0.h(0.5f);
        j e2 = gVar.f352a.f338a.e();
        e2.f375e = hVar;
        e2.f376f = hVar;
        e2.f377g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2016u.j(ColorStateList.valueOf(-1));
        J0.g gVar2 = this.f2016u;
        WeakHashMap weakHashMap = T.f440a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f3339t, R.attr.materialClockStyle, 0);
        this.f2015t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2014s = new p(11, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = T.f440a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            p pVar = this.f2014s;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            p pVar = this.f2014s;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2016u.j(ColorStateList.valueOf(i));
    }
}
