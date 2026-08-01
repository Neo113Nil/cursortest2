package com.google.android.material.datepicker;

import K.B;
import K.S;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.glasspulse.glasspulse.R;
import f0.X;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends X {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1838t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1839u;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1838t = textView;
        WeakHashMap weakHashMap = S.f351a;
        new B(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1839u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
