package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.fortunequest.neontrack.R;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final R0.e f2249a;

    /* renamed from: b, reason: collision with root package name */
    public final R0.e f2250b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(H1.d.f0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0393a.f4551l);
        R0.e.f(context, obtainStyledAttributes.getResourceId(4, 0));
        R0.e.f(context, obtainStyledAttributes.getResourceId(2, 0));
        R0.e.f(context, obtainStyledAttributes.getResourceId(3, 0));
        R0.e.f(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList B2 = H1.l.B(context, obtainStyledAttributes, 7);
        this.f2249a = R0.e.f(context, obtainStyledAttributes.getResourceId(9, 0));
        R0.e.f(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2250b = R0.e.f(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(B2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
