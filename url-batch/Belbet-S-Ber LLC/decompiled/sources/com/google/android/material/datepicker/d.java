package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f1049a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1050b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1051c;
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final c f1052e;

    /* renamed from: f, reason: collision with root package name */
    public final c f1053f;

    /* renamed from: g, reason: collision with root package name */
    public final c f1054g;

    public d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b4.d.Q(context, R.attr.materialCalendarStyle, q.class.getCanonicalName()).data, q1.a.f3155s);
        this.f1049a = c.e(context, obtainStyledAttributes.getResourceId(4, 0));
        this.f1054g = c.e(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f1050b = c.e(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f1051c = c.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList r4 = b4.l.r(context, obtainStyledAttributes, 7);
        this.d = c.e(context, obtainStyledAttributes.getResourceId(9, 0));
        this.f1052e = c.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1053f = c.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(r4.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
