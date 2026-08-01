package com.google.android.material.timepicker;

import B0.q;
import H0.j;
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
import com.luckycalc.loanfinance.R;
import java.util.WeakHashMap;
import n0.AbstractC0278a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final q f1854s;

    /* renamed from: t, reason: collision with root package name */
    public int f1855t;

    /* renamed from: u, reason: collision with root package name */
    public final H0.g f1856u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        H0.g gVar = new H0.g();
        this.f1856u = gVar;
        H0.h hVar = new H0.h(0.5f);
        j e2 = gVar.f256a.f242a.e();
        e2.f279e = hVar;
        e2.f280f = hVar;
        e2.f281g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f1856u.j(ColorStateList.valueOf(-1));
        H0.g gVar2 = this.f1856u;
        WeakHashMap weakHashMap = T.f381a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0278a.f3294t, R.attr.materialClockStyle, 0);
        this.f1855t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1854s = new q(10, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = T.f381a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            q qVar = this.f1854s;
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
            q qVar = this.f1854s;
            handler.removeCallbacks(qVar);
            handler.post(qVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f1856u.j(ColorStateList.valueOf(i));
    }
}
