package com.google.android.material.datepicker;

import K.G;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fortuneink.neonpad.R;
import e0.X;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends X {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1928t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1929u;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1928t = textView;
        WeakHashMap weakHashMap = K.X.f418a;
        new G(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1929u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
