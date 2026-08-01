package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.awerser.monnit.betplay.R;
import defpackage.c00;
import defpackage.e90;
import defpackage.s80;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d extends c00 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public d(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = e90.a;
        new s80(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
