package com.google.android.material.timepicker;

import K.Q;
import R0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fortunequest.neontrack.R;
import java.util.WeakHashMap;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final E0.b f2463s;

    /* renamed from: t, reason: collision with root package name */
    public int f2464t;

    /* renamed from: u, reason: collision with root package name */
    public final R0.g f2465u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        R0.g gVar = new R0.g();
        this.f2465u = gVar;
        R0.h hVar = new R0.h(0.5f);
        j e2 = gVar.f917a.f903a.e();
        e2.f940e = hVar;
        e2.f941f = hVar;
        e2.f942g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2465u.j(ColorStateList.valueOf(-1));
        R0.g gVar2 = this.f2465u;
        WeakHashMap weakHashMap = Q.f578a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0393a.f4559t, R.attr.materialClockStyle, 0);
        this.f2464t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2463s = new E0.b(10, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = Q.f578a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            E0.b bVar = this.f2463s;
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
            E0.b bVar = this.f2463s;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2465u.j(ColorStateList.valueOf(i));
    }
}
