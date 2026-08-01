package com.google.android.material.datepicker;

import K.G;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.luckyarcade.spinthrow.R;
import e0.X;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends X {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1906t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1907u;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1906t = textView;
        WeakHashMap weakHashMap = K.X.f419a;
        new G(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1907u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
