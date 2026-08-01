package com.winworm.neongrid.ui;

import M0.ViewOnClickListenerC0028a;
import P0.d;
import R0.f;
import T0.i;
import U0.e;
import android.os.Bundle;
import com.winworm.neongrid.R;
import g.AbstractActivityC0108i;

/* loaded from: classes.dex */
public final class ResultActivity extends AbstractActivityC0108i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2058z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f2059y = new e(new d(this, 1));

    @Override // g.AbstractActivityC0108i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f753a);
        int intExtra = getIntent().getIntExtra("extra_level", 1);
        int intExtra2 = getIntent().getIntExtra("extra_score", 0);
        int intExtra3 = getIntent().getIntExtra("extra_food", 0);
        if (getIntent().getBooleanExtra("extra_victory", false)) {
            t().f758g.setText(getString(R.string.result_victory));
            t().f758g.setTextColor(getColor(R.color.snake_head));
            t().f756e.setText(getString(R.string.result_victory_message));
            t().f755c.setVisibility(intExtra >= 12 ? 8 : 0);
        } else {
            t().f758g.setText(getString(R.string.result_defeat));
            t().f758g.setTextColor(getColor(R.color.accent_pink));
            t().f756e.setText(getString(R.string.result_defeat_message));
            t().f755c.setVisibility(8);
        }
        t().f757f.setText(getString(R.string.result_score, Integer.valueOf(intExtra2)));
        t().d.setText(getString(R.string.result_food, Integer.valueOf(intExtra3)));
        t().h.setOnClickListener(new i(this, intExtra, 0));
        t().f755c.setOnClickListener(new i(intExtra, this));
        t().f754b.setOnClickListener(new ViewOnClickListenerC0028a(4, this));
    }

    public final f t() {
        return (f) this.f2059y.a();
    }
}
