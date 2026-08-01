package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.moontiko.really.admiralcasino.R;
import defpackage.ic0;
import defpackage.q20;
import defpackage.wb0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class d extends q20 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public d(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = ic0.a;
        new wb0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
