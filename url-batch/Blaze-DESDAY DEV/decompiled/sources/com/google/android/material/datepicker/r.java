package com.google.android.material.datepicker;

import K.C;
import K.T;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.winworm.neongrid.R;
import g0.a0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends a0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f1866u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f1867v;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1866u = textView;
        WeakHashMap weakHashMap = T.f440a;
        new C(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1867v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
