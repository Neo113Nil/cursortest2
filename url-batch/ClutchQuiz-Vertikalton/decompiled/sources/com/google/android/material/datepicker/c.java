package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.clutchquizarena.app.R;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final O0.e f1851a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.e f1852b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A.c.y0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0361a.f3736l);
        O0.e.a(context, obtainStyledAttributes.getResourceId(4, 0));
        O0.e.a(context, obtainStyledAttributes.getResourceId(2, 0));
        O0.e.a(context, obtainStyledAttributes.getResourceId(3, 0));
        O0.e.a(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList H2 = A.c.H(context, obtainStyledAttributes, 7);
        this.f1851a = O0.e.a(context, obtainStyledAttributes.getResourceId(9, 0));
        O0.e.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1852b = O0.e.a(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(H2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
