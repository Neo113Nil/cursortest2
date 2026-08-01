package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.gdmhkmf.belbet.R;
import g1.q1;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b0 extends q1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f1038u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f1039v;

    public b0(LinearLayout linearLayout, boolean z4) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1038u = textView;
        WeakHashMap weakHashMap = p0.f2816a;
        new n0.c0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1039v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z4) {
            return;
        }
        textView.setVisibility(8);
    }
}
