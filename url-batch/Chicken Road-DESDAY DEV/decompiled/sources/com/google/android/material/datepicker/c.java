package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.playgen.securelock.R;
import o0.AbstractC0278a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final I0.e f1707a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.e f1708b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(u1.l.W(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0278a.f3342l);
        I0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList D2 = u1.d.D(context, obtainStyledAttributes, 7);
        this.f1707a = I0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1708b = I0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(D2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
