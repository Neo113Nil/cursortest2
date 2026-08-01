package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.trembin.nirefon.betfury.R;
import defpackage.hm0;
import defpackage.vl0;
import defpackage.x80;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class d extends x80 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public d(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = hm0.a;
        new vl0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
