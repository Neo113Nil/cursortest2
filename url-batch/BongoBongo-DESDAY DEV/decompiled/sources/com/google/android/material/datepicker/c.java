package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.winfour.winrandom.R;
import q0.AbstractC0285a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final K0.e f1868a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.e f1869b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A1.m.b0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0285a.f3509l);
        K0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        K0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        K0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        K0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList D2 = A1.d.D(context, obtainStyledAttributes, 7);
        this.f1868a = K0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        K0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1869b = K0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(D2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
