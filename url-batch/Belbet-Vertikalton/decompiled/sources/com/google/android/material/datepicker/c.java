package com.google.android.material.datepicker;

import a.AbstractC0058a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.winpower.neonfit.R;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final N0.e f2361a;

    /* renamed from: b, reason: collision with root package name */
    public final N0.e f2362b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0058a.X(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0383a.f4155l);
        N0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        N0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        N0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        N0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList C2 = H1.d.C(context, obtainStyledAttributes, 7);
        this.f2361a = N0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        N0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2362b = N0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(C2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
