package com.playbag.tripgear;

import C.g;
import P0.d;
import P0.m;
import P0.r;
import Q0.f;
import R0.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.playbag.tripgear.ChecklistActivity;
import com.playbag.tripgear.HomeActivity;
import com.playbag.tripgear.SummaryActivity;
import com.playbag.tripgear.TripSelectActivity;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class SummaryActivity extends AbstractActivityC0106i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2007z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f2008y = new e(new d(this, 4));

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f762a);
        String stringExtra = getIntent().getStringExtra("extra_trip");
        if (stringExtra == null) {
            stringExtra = "SEA";
        }
        final r valueOf = r.valueOf(stringExtra);
        g gVar = new g((AbstractActivityC0106i) this);
        d1.d.e(valueOf, "trip");
        int size = gVar.y(valueOf).size();
        t().f766f.setText(getString(R.string.summary_ready));
        t().f767g.setText(m.b(valueOf));
        t().f765e.setText(getString(R.string.summary_items, Integer.valueOf(size)));
        t().f763b.setOnClickListener(new View.OnClickListener() { // from class: P0.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SummaryActivity.f2007z;
                SummaryActivity summaryActivity = SummaryActivity.this;
                Intent intent = new Intent(summaryActivity, (Class<?>) ChecklistActivity.class);
                intent.putExtra("extra_trip", valueOf.name());
                summaryActivity.startActivity(intent);
                summaryActivity.finish();
            }
        });
        final int i = 0;
        t().d.setOnClickListener(new View.OnClickListener(this) { // from class: P0.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryActivity f714b;

            {
                this.f714b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SummaryActivity summaryActivity = this.f714b;
                switch (i) {
                    case 0:
                        int i2 = SummaryActivity.f2007z;
                        summaryActivity.startActivity(new Intent(summaryActivity, (Class<?>) TripSelectActivity.class));
                        summaryActivity.finish();
                        break;
                    default:
                        int i3 = SummaryActivity.f2007z;
                        Intent intent = new Intent(summaryActivity, (Class<?>) HomeActivity.class);
                        intent.addFlags(335544320);
                        summaryActivity.startActivity(intent);
                        summaryActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        t().f764c.setOnClickListener(new View.OnClickListener(this) { // from class: P0.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryActivity f714b;

            {
                this.f714b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SummaryActivity summaryActivity = this.f714b;
                switch (i2) {
                    case 0:
                        int i22 = SummaryActivity.f2007z;
                        summaryActivity.startActivity(new Intent(summaryActivity, (Class<?>) TripSelectActivity.class));
                        summaryActivity.finish();
                        break;
                    default:
                        int i3 = SummaryActivity.f2007z;
                        Intent intent = new Intent(summaryActivity, (Class<?>) HomeActivity.class);
                        intent.addFlags(335544320);
                        summaryActivity.startActivity(intent);
                        summaryActivity.finish();
                        break;
                }
            }
        });
    }

    public final f t() {
        return (f) this.f2008y.a();
    }
}
