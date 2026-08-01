package com.google.android.material.datepicker;

import L.C;
import L.T;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.winfour.winrandom.R;
import h0.a0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends a0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f1934u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f1935v;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1934u = textView;
        WeakHashMap weakHashMap = T.f490a;
        new C(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).d(textView, Boolean.TRUE);
        this.f1935v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
