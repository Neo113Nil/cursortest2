package com.google.android.material.timepicker;

import K0.j;
import L.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.winfour.winrandom.R;
import java.util.WeakHashMap;
import q0.AbstractC0285a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final A.a f2091s;

    /* renamed from: t, reason: collision with root package name */
    public int f2092t;

    /* renamed from: u, reason: collision with root package name */
    public final K0.g f2093u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        K0.g gVar = new K0.g();
        this.f2093u = gVar;
        K0.h hVar = new K0.h(0.5f);
        j e2 = gVar.f397a.f382a.e();
        e2.f421e = hVar;
        e2.f422f = hVar;
        e2.f423g = hVar;
        e2.f424h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2093u.j(ColorStateList.valueOf(-1));
        K0.g gVar2 = this.f2093u;
        WeakHashMap weakHashMap = T.f490a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f3517t, R.attr.materialClockStyle, 0);
        this.f2092t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2091s = new A.a(12, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = T.f490a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            A.a aVar = this.f2091s;
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
            A.a aVar = this.f2091s;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2093u.j(ColorStateList.valueOf(i));
    }
}
