package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.winfour.neondrop.R;
import q0.AbstractC0257a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final L0.e f1853a;

    /* renamed from: b, reason: collision with root package name */
    public final L0.e f1854b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z1.l.o0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0257a.f3389m);
        L0.e.c(context, obtainStyledAttributes.getResourceId(4, 0));
        L0.e.c(context, obtainStyledAttributes.getResourceId(2, 0));
        L0.e.c(context, obtainStyledAttributes.getResourceId(3, 0));
        L0.e.c(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList v2 = z1.d.v(context, obtainStyledAttributes, 7);
        this.f1853a = L0.e.c(context, obtainStyledAttributes.getResourceId(9, 0));
        L0.e.c(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1854b = L0.e.c(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(v2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
