package com.google.android.material.timepicker;

import B0.q;
import H0.j;
import K.X;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fortuneink.neonpad.R;
import java.util.WeakHashMap;
import n0.AbstractC0303a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final q f2081s;

    /* renamed from: t, reason: collision with root package name */
    public int f2082t;

    /* renamed from: u, reason: collision with root package name */
    public final H0.g f2083u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        H0.g gVar = new H0.g();
        this.f2083u = gVar;
        H0.h hVar = new H0.h(0.5f);
        j e2 = gVar.f273a.f258a.e();
        e2.f298e = hVar;
        e2.f299f = hVar;
        e2.f300g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2083u.j(ColorStateList.valueOf(-1));
        H0.g gVar2 = this.f2083u;
        WeakHashMap weakHashMap = X.f418a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0303a.f3647t, R.attr.materialClockStyle, 0);
        this.f2082t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2081s = new q(10, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = X.f418a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            q qVar = this.f2081s;
            handler.removeCallbacks(qVar);
            handler.post(qVar);
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
            q qVar = this.f2081s;
            handler.removeCallbacks(qVar);
            handler.post(qVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2083u.j(ColorStateList.valueOf(i));
    }
}
