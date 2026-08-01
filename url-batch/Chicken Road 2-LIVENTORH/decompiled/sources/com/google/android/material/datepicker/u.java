package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import java.util.WeakHashMap;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u extends b1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f967u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f968v;

    public u(LinearLayout linearLayout, boolean z3) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f967u = textView;
        WeakHashMap weakHashMap = l0.f2757a;
        new n0.y(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f968v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z3) {
            return;
        }
        textView.setVisibility(8);
    }
}
