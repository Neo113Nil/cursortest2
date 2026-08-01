package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.luckyarcade.spinthrow.R;
import n0.AbstractC0305a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final H0.e f1840a;

    /* renamed from: b, reason: collision with root package name */
    public final H0.e f1841b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q1.l.h0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0305a.f3643l);
        H0.e.d(context, obtainStyledAttributes.getResourceId(4, 0));
        H0.e.d(context, obtainStyledAttributes.getResourceId(2, 0));
        H0.e.d(context, obtainStyledAttributes.getResourceId(3, 0));
        H0.e.d(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList y2 = q1.d.y(context, obtainStyledAttributes, 7);
        this.f1840a = H0.e.d(context, obtainStyledAttributes.getResourceId(9, 0));
        H0.e.d(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1841b = H0.e.d(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(y2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
