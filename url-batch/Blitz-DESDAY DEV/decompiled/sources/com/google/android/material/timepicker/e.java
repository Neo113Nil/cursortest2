package com.google.android.material.timepicker;

import L0.j;
import M.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.winfour.neondrop.R;
import java.util.WeakHashMap;
import q0.AbstractC0257a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final B.a f2070s;

    /* renamed from: t, reason: collision with root package name */
    public int f2071t;

    /* renamed from: u, reason: collision with root package name */
    public final L0.g f2072u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        L0.g gVar = new L0.g();
        this.f2072u = gVar;
        L0.h hVar = new L0.h(0.5f);
        j e2 = gVar.f433a.f419a.e();
        e2.f456e = hVar;
        e2.f457f = hVar;
        e2.f458g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2072u.l(ColorStateList.valueOf(-1));
        L0.g gVar2 = this.f2072u;
        WeakHashMap weakHashMap = Q.f513a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0257a.f3398v, R.attr.materialClockStyle, 0);
        this.f2071t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2070s = new B.a(11, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = Q.f513a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            B.a aVar = this.f2070s;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
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
            B.a aVar = this.f2070s;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2072u.l(ColorStateList.valueOf(i));
    }
}
