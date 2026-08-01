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
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public final g f1459v;

    /* renamed from: w, reason: collision with root package name */
    public int f1460w;

    /* renamed from: x, reason: collision with root package name */
    public final g2.j f1461x;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g2.j jVar = new g2.j();
        this.f1461x = jVar;
        jVar.setShapeAppearanceModel(jVar.g.f1843a.a(new g2.k(0.5f)));
        this.f1461x.q(ColorStateList.valueOf(-1));
        setBackground(this.f1461x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.f2879y, R.attr.materialClockStyle, 0);
        this.f1460w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1459v = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.m();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f1459v;
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
            g gVar = this.f1459v;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i4) {
        this.f1461x.q(ColorStateList.valueOf(i4));
    }
}
