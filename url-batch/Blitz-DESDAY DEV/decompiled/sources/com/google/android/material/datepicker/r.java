package com.google.android.material.datepicker;

import M.A;
import M.Q;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.winfour.neondrop.R;
import h0.X;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends X {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1920t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1921u;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1920t = textView;
        WeakHashMap weakHashMap = Q.f513a;
        new A(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1921u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
