package com.google.android.material.datepicker;

import M.C0029z;
import M.P;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.winpower.neonfit.R;
import h0.V;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends V {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f2427t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f2428u;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2427t = textView;
        WeakHashMap weakHashMap = P.f711a;
        new C0029z(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f2428u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
