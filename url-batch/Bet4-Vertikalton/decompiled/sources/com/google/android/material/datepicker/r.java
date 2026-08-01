package com.google.android.material.datepicker;

import K.C;
import K.T;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.playbag.tripgear.R;
import g0.c0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends c0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f1834u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f1835v;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1834u = textView;
        WeakHashMap weakHashMap = T.f423a;
        new C(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1835v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
