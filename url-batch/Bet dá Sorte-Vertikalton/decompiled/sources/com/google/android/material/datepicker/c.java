package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.glasspulse.glasspulse.R;
import s0.AbstractC0283a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final M0.e f1773a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.e f1774b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(u1.l.h0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0283a.f3751l);
        M0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        M0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        M0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        M0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList C2 = u1.d.C(context, obtainStyledAttributes, 7);
        this.f1773a = M0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        M0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1774b = M0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(C2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
