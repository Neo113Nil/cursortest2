package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.playbag.tripgear.R;
import p0.AbstractC0282a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final J0.e f1769a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.e f1770b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w1.d.i0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0282a.f3438l);
        J0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList v2 = w1.l.v(context, obtainStyledAttributes, 7);
        this.f1769a = J0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1770b = J0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(v2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
