package com.google.android.material.datepicker;

import K.A;
import K.Q;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fortunequest.neontrack.R;
import g0.Y;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends Y {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f2315u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f2316v;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2315u = textView;
        WeakHashMap weakHashMap = Q.f578a;
        new A(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f2316v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
