package com.glasspulse.glasspulse;

import S0.c;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.glasspulse.glasspulse.GoalsActivity;
import com.glasspulse.glasspulse.HomeActivity;
import com.glasspulse.glasspulse.RulesActivity;
import com.glasspulse.glasspulse.TrackerActivity;
import g.AbstractActivityC0128i;
import o0.C0262e;
import q0.C0275a;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0128i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1602z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final c f1603y = new c(new C0262e(this, 0));

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = this.f1603y;
        setContentView(((C0275a) cVar.a()).f3475a);
        final int i = 0;
        ((C0275a) cVar.a()).d.setOnClickListener(new View.OnClickListener(this) { // from class: o0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f3376b;

            {
                this.f3376b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f3376b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) TrackerActivity.class));
                        break;
                    case 1:
                        int i3 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GoalsActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i2 = 1;
        ((C0275a) cVar.a()).f3476b.setOnClickListener(new View.OnClickListener(this) { // from class: o0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f3376b;

            {
                this.f3376b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f3376b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) TrackerActivity.class));
                        break;
                    case 1:
                        int i3 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GoalsActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i3 = 2;
        ((C0275a) cVar.a()).f3477c.setOnClickListener(new View.OnClickListener(this) { // from class: o0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f3376b;

            {
                this.f3376b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f3376b;
                switch (i3) {
                    case 0:
                        int i22 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) TrackerActivity.class));
                        break;
                    case 1:
                        int i32 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GoalsActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1602z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
    }
}
