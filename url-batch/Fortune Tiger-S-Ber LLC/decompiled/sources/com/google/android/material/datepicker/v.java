package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import b1.c1;
import com.gglhk.bofio.fortunetiger.R;
import java.util.WeakHashMap;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v extends c1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f1335u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f1336v;

    public v(LinearLayout linearLayout, boolean z3) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1335u = textView;
        WeakHashMap weakHashMap = j0.f2752a;
        new k0.w(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1336v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z3) {
            return;
        }
        textView.setVisibility(8);
    }
}
