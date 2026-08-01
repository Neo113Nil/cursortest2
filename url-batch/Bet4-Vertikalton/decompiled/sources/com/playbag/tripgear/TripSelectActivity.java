package com.playbag.tripgear;

import P0.d;
import P0.r;
import Q0.g;
import R0.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.playbag.tripgear.TripSelectActivity;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class TripSelectActivity extends AbstractActivityC0106i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2009z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f2010y = new e(new d(this, 5));

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.f2010y;
        setContentView(((g) eVar.a()).f768a);
        final int i = 0;
        ((g) eVar.a()).f771e.setOnClickListener(new View.OnClickListener(this) { // from class: P0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripSelectActivity f716b;

            {
                this.f716b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TripSelectActivity tripSelectActivity = this.f716b;
                switch (i) {
                    case 0:
                        int i2 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f717a);
                        break;
                    case 1:
                        int i3 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f718b);
                        break;
                    case 2:
                        int i4 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f719c);
                        break;
                    default:
                        int i5 = TripSelectActivity.f2009z;
                        tripSelectActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((g) eVar.a()).d.setOnClickListener(new View.OnClickListener(this) { // from class: P0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripSelectActivity f716b;

            {
                this.f716b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TripSelectActivity tripSelectActivity = this.f716b;
                switch (i2) {
                    case 0:
                        int i22 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f717a);
                        break;
                    case 1:
                        int i3 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f718b);
                        break;
                    case 2:
                        int i4 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f719c);
                        break;
                    default:
                        int i5 = TripSelectActivity.f2009z;
                        tripSelectActivity.finish();
                        break;
                }
            }
        });
        final int i3 = 2;
        ((g) eVar.a()).f770c.setOnClickListener(new View.OnClickListener(this) { // from class: P0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripSelectActivity f716b;

            {
                this.f716b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TripSelectActivity tripSelectActivity = this.f716b;
                switch (i3) {
                    case 0:
                        int i22 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f717a);
                        break;
                    case 1:
                        int i32 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f718b);
                        break;
                    case 2:
                        int i4 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f719c);
                        break;
                    default:
                        int i5 = TripSelectActivity.f2009z;
                        tripSelectActivity.finish();
                        break;
                }
            }
        });
        final int i4 = 3;
        ((g) eVar.a()).f769b.setOnClickListener(new View.OnClickListener(this) { // from class: P0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripSelectActivity f716b;

            {
                this.f716b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TripSelectActivity tripSelectActivity = this.f716b;
                switch (i4) {
                    case 0:
                        int i22 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f717a);
                        break;
                    case 1:
                        int i32 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f718b);
                        break;
                    case 2:
                        int i42 = TripSelectActivity.f2009z;
                        tripSelectActivity.t(r.f719c);
                        break;
                    default:
                        int i5 = TripSelectActivity.f2009z;
                        tripSelectActivity.finish();
                        break;
                }
            }
        });
    }

    public final void t(r rVar) {
        Intent intent = new Intent(this, (Class<?>) ChecklistActivity.class);
        intent.putExtra("extra_trip", rVar.name());
        startActivity(intent);
    }
}
