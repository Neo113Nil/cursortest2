package com.playbag.tripgear;

import P0.d;
import Q0.b;
import R0.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.playbag.tripgear.HomeActivity;
import com.playbag.tripgear.RulesActivity;
import com.playbag.tripgear.TripSelectActivity;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0106i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1994z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f1995y = new e(new d(this, 1));

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.f1995y;
        setContentView(((b) eVar.a()).f755a);
        final int i = 0;
        ((b) eVar.a()).f757c.setOnClickListener(new View.OnClickListener(this) { // from class: P0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f697b;

            {
                this.f697b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f697b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f1994z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) TripSelectActivity.class));
                        break;
                    default:
                        int i3 = HomeActivity.f1994z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i2 = 1;
        ((b) eVar.a()).f756b.setOnClickListener(new View.OnClickListener(this) { // from class: P0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f697b;

            {
                this.f697b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f697b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f1994z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) TripSelectActivity.class));
                        break;
                    default:
                        int i3 = HomeActivity.f1994z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
    }
}
