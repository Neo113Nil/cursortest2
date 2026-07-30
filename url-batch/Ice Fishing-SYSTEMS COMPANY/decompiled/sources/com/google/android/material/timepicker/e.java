package com.google.android.material.timepicker;

import C3.j;
import D.RunnableC0281a;
import O.X;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class e extends ConstraintLayout {
    public final RunnableC0281a J;

    /* renamed from: K, reason: collision with root package name */
    public int f36340K;

    /* renamed from: L, reason: collision with root package name */
    public final C3.g f36341L;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(C5284R.layout.material_radial_view_group, this);
        C3.g gVar = new C3.g();
        this.f36341L = gVar;
        C3.h hVar = new C3.h(0.5f);
        j e6 = gVar.f413n.f383a.e();
        e6.f425e = hVar;
        e6.f426f = hVar;
        e6.f427g = hVar;
        e6.f428h = hVar;
        gVar.setShapeAppearanceModel(e6.a());
        this.f36341L.j(ColorStateList.valueOf(-1));
        C3.g gVar2 = this.f36341L;
        WeakHashMap weakHashMap = X.f2240a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4576a.f38310t, C5284R.attr.materialClockStyle, 0);
        this.f36340K = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.J = new RunnableC0281a(16, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = X.f2240a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0281a runnableC0281a = this.J;
            handler.removeCallbacks(runnableC0281a);
            handler.post(runnableC0281a);
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
            RunnableC0281a runnableC0281a = this.J;
            handler.removeCallbacks(runnableC0281a);
            handler.post(runnableC0281a);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f36341L.j(ColorStateList.valueOf(i));
    }
}
