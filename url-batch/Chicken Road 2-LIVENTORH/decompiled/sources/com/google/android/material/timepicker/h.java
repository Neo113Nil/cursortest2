package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oriondriftchasers.arordrft.R;
import l2.m;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public final g f1077v;

    /* renamed from: w, reason: collision with root package name */
    public int f1078w;

    /* renamed from: x, reason: collision with root package name */
    public final l2.j f1079x;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        l2.j jVar = new l2.j();
        this.f1079x = jVar;
        l2.k kVar = new l2.k(0.5f);
        m g4 = jVar.f2598g.f2581a.g();
        g4.f2621e = kVar;
        g4.f2622f = kVar;
        g4.f2623g = kVar;
        g4.f2624h = kVar;
        jVar.setShapeAppearanceModel(g4.a());
        this.f1079x.q(ColorStateList.valueOf(-1));
        setBackground(this.f1079x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.B, R.attr.materialClockStyle, 0);
        this.f1078w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1077v = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.m();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f1077v;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
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
            g gVar = this.f1077v;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f1079x.q(ColorStateList.valueOf(i));
    }
}
