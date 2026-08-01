package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.neonpulse.gridlogic.R;
import o0.AbstractC0277a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final I0.e f1744a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.e f1745b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x1.d.b0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0277a.f3248l);
        I0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList x2 = x1.l.x(context, obtainStyledAttributes, 7);
        this.f1744a = I0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1745b = I0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(x2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
