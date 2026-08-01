package com.google.android.material.timepicker;

import C0.p;
import I0.j;
import K.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.neonpulse.gridlogic.R;
import java.util.WeakHashMap;
import o0.AbstractC0277a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final p f1958s;

    /* renamed from: t, reason: collision with root package name */
    public int f1959t;

    /* renamed from: u, reason: collision with root package name */
    public final I0.g f1960u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        I0.g gVar = new I0.g();
        this.f1960u = gVar;
        I0.h hVar = new I0.h(0.5f);
        j e2 = gVar.f328a.f314a.e();
        e2.f351e = hVar;
        e2.f352f = hVar;
        e2.f353g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f1960u.j(ColorStateList.valueOf(-1));
        I0.g gVar2 = this.f1960u;
        WeakHashMap weakHashMap = S.f422a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0277a.f3256t, R.attr.materialClockStyle, 0);
        this.f1959t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1958s = new p(11, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = S.f422a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            p pVar = this.f1958s;
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
            p pVar = this.f1958s;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f1960u.j(ColorStateList.valueOf(i));
    }
}
