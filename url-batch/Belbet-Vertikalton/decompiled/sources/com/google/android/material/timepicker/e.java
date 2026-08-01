package com.google.android.material.timepicker;

import M.P;
import N0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.winpower.neonfit.R;
import java.util.WeakHashMap;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final A0.b f2586s;

    /* renamed from: t, reason: collision with root package name */
    public int f2587t;

    /* renamed from: u, reason: collision with root package name */
    public final N0.g f2588u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        N0.g gVar = new N0.g();
        this.f2588u = gVar;
        N0.h hVar = new N0.h(0.5f);
        j e = gVar.f900a.f886a.e();
        e.e = hVar;
        e.f924f = hVar;
        e.f925g = hVar;
        e.f926h = hVar;
        gVar.setShapeAppearanceModel(e.a());
        this.f2588u.j(ColorStateList.valueOf(-1));
        N0.g gVar2 = this.f2588u;
        WeakHashMap weakHashMap = P.f711a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.f4163t, R.attr.materialClockStyle, 0);
        this.f2587t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2586s = new A0.b(12, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = P.f711a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            A0.b bVar = this.f2586s;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
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
            A0.b bVar = this.f2586s;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2588u.j(ColorStateList.valueOf(i));
    }
}
