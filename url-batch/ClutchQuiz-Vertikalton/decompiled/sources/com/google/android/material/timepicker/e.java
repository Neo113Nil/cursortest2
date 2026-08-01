package com.google.android.material.timepicker;

import K.S;
import O0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clutchquizarena.app.R;
import java.util.WeakHashMap;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final B0.b f2066s;

    /* renamed from: t, reason: collision with root package name */
    public int f2067t;

    /* renamed from: u, reason: collision with root package name */
    public final O0.g f2068u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        O0.g gVar = new O0.g();
        this.f2068u = gVar;
        O0.h hVar = new O0.h(0.5f);
        j e2 = gVar.f527a.f513a.e();
        e2.f550e = hVar;
        e2.f551f = hVar;
        e2.f552g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2068u.j(ColorStateList.valueOf(-1));
        O0.g gVar2 = this.f2068u;
        WeakHashMap weakHashMap = S.f365a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0361a.f3744t, R.attr.materialClockStyle, 0);
        this.f2067t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2066s = new B0.b(10, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = S.f365a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            B0.b bVar = this.f2066s;
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
            B0.b bVar = this.f2066s;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2068u.j(ColorStateList.valueOf(i));
    }
}
