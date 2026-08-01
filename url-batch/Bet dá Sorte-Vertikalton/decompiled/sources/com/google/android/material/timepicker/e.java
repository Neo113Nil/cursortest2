package com.google.android.material.timepicker;

import G0.o;
import K.S;
import M0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glasspulse.glasspulse.R;
import java.util.WeakHashMap;
import s0.AbstractC0283a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final o f1986s;

    /* renamed from: t, reason: collision with root package name */
    public int f1987t;

    /* renamed from: u, reason: collision with root package name */
    public final M0.g f1988u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        M0.g gVar = new M0.g();
        this.f1988u = gVar;
        M0.h hVar = new M0.h(0.5f);
        j e2 = gVar.f495a.f481a.e();
        e2.f518e = hVar;
        e2.f519f = hVar;
        e2.f520g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f1988u.j(ColorStateList.valueOf(-1));
        M0.g gVar2 = this.f1988u;
        WeakHashMap weakHashMap = S.f351a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0283a.f3759t, R.attr.materialClockStyle, 0);
        this.f1987t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1986s = new o(9, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = S.f351a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            o oVar = this.f1986s;
            handler.removeCallbacks(oVar);
            handler.post(oVar);
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
            o oVar = this.f1986s;
            handler.removeCallbacks(oVar);
            handler.post(oVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f1988u.j(ColorStateList.valueOf(i));
    }
}
