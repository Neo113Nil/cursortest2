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
import com.snovikpovik.vuevnxsj.R;
import w5.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: t, reason: collision with root package name */
    public final g f2037t;

    /* renamed from: u, reason: collision with root package name */
    public int f2038u;

    /* renamed from: v, reason: collision with root package name */
    public final w5.j f2039v;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        w5.j jVar = new w5.j();
        this.f2039v = jVar;
        w5.k kVar = new w5.k(0.5f);
        m f6 = jVar.f8105e.f8087a.f();
        f6.f8131e = kVar;
        f6.f8132f = kVar;
        f6.f8133g = kVar;
        f6.f8134h = kVar;
        jVar.setShapeAppearanceModel(f6.a());
        this.f2039v.n(ColorStateList.valueOf(-1));
        setBackground(this.f2039v);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5.a.f2751q, R.attr.materialClockStyle, 0);
        this.f2038u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2037t = new Runnable() { // from class: com.google.android.material.timepicker.g
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
            g gVar = this.f2037t;
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
            g gVar = this.f2037t;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2039v.n(ColorStateList.valueOf(i));
    }
}
