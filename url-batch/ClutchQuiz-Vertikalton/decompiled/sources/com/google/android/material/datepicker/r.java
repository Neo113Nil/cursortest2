package com.google.android.material.datepicker;

import K.B;
import K.S;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clutchquizarena.app.R;
import f0.W;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends W {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1917t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1918u;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1917t = textView;
        WeakHashMap weakHashMap = S.f365a;
        new B(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f1918u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
