package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l2.f f909a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.f f910b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(h.a.c0(context, R.attr.materialCalendarStyle, m.class.getCanonicalName()).data, n1.a.f2822o);
        l2.f.f(context, obtainStyledAttributes.getResourceId(4, 0));
        l2.f.f(context, obtainStyledAttributes.getResourceId(2, 0));
        l2.f.f(context, obtainStyledAttributes.getResourceId(3, 0));
        l2.f.f(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList t2 = h.a.t(context, obtainStyledAttributes, 7);
        this.f909a = l2.f.f(context, obtainStyledAttributes.getResourceId(9, 0));
        l2.f.f(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f910b = l2.f.f(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(t2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
