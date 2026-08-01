package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.winworm.neongrid.R;
import p0.AbstractC0285a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final J0.e f1800a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.e f1801b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z1.d.j0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0285a.f3331l);
        J0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList t2 = z1.l.t(context, obtainStyledAttributes, 7);
        this.f1800a = J0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1801b = J0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(t2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
