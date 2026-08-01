package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.visualfortune.eyerest.R;
import o0.AbstractC0275a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final I0.e f1677a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.e f1678b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(s1.l.W(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0275a.f3347l);
        I0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList w2 = s1.d.w(context, obtainStyledAttributes, 7);
        this.f1677a = I0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        I0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1678b = I0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(w2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
