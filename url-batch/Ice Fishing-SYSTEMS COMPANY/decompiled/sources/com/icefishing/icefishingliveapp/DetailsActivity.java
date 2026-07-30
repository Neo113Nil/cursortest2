package com.icefishing.icefishingliveapp;

import O.L;
import O.X;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import h.AbstractActivityC4553l;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class DetailsActivity extends AbstractActivityC4553l {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f36545x = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f36546n = 0;

    /* renamed from: u, reason: collision with root package name */
    public TextView f36547u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f36548v;

    /* renamed from: w, reason: collision with root package name */
    public DetailsActivity f36549w;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        try {
            k4.m.e(this.f36549w).j(this, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new h4.c(20, this));
        } catch (ActivityNotFoundException e6) {
            e6.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 1;
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_details);
        View findViewById = findViewById(C5284R.id.main);
        com.anythink.core.common.n.b.A a9 = new com.anythink.core.common.n.b.A(2);
        WeakHashMap weakHashMap = X.f2240a;
        L.u(findViewById, a9);
        this.f36549w = this;
        this.f36548v = (TextView) findViewById(C5284R.id.tvtitle);
        this.f36547u = (TextView) findViewById(C5284R.id.tvData);
        k4.m.i(this.f36549w, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(this.f36549w, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        this.f36546n = getIntent().getIntExtra("discription", 0);
        this.f36548v.setSelected(true);
        int i4 = this.f36546n;
        if (i4 == 0) {
            this.f36547u.setText(C5284R.string.aa);
            this.f36548v.setText(C5284R.string.a);
        } else if (i4 == 1) {
            this.f36547u.setText(C5284R.string.bb);
            this.f36548v.setText(C5284R.string.b);
        } else if (i4 == 2) {
            this.f36547u.setText(C5284R.string.cc);
            this.f36548v.setText(C5284R.string.c);
        } else if (i4 == 3) {
            this.f36547u.setText(C5284R.string.dd);
            this.f36548v.setText(C5284R.string.d);
        } else if (i4 == 4) {
            this.f36547u.setText(C5284R.string.ee);
            this.f36548v.setText(C5284R.string.e);
        } else if (i4 == 5) {
            this.f36547u.setText(C5284R.string.ff);
            this.f36548v.setText(C5284R.string.f);
        } else if (i4 == 6) {
            this.f36547u.setText(C5284R.string.gg);
            this.f36548v.setText(C5284R.string.g);
        } else if (i4 == 7) {
            this.f36547u.setText(C5284R.string.hh);
            this.f36548v.setText(C5284R.string.h);
        }
        findViewById(C5284R.id.imgBack).setOnClickListener(new com.google.android.material.datepicker.j(i, this));
    }
}
