package com.winfour.winrandom.ui;

import S0.c;
import U0.g;
import V0.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.winfour.winrandom.ui.GeneratorActivity;
import com.winfour.winrandom.ui.HistoryActivity;
import com.winfour.winrandom.ui.HomeActivity;
import com.winfour.winrandom.ui.PresetsActivity;
import com.winfour.winrandom.ui.RulesActivity;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0106i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2113z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f2114y = new d(new g(this, 0));

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f2114y;
        setContentView(((c) dVar.a()).f810a);
        final int i = 0;
        ((c) dVar.a()).f811b.setOnClickListener(new View.OnClickListener(this) { // from class: U0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f880b;

            {
                this.f880b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f880b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GeneratorActivity.class));
                        break;
                    case 1:
                        int i3 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) PresetsActivity.class));
                        break;
                    case 2:
                        int i4 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) HistoryActivity.class));
                        break;
                    default:
                        int i5 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i2 = 1;
        ((c) dVar.a()).d.setOnClickListener(new View.OnClickListener(this) { // from class: U0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f880b;

            {
                this.f880b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f880b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GeneratorActivity.class));
                        break;
                    case 1:
                        int i3 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) PresetsActivity.class));
                        break;
                    case 2:
                        int i4 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) HistoryActivity.class));
                        break;
                    default:
                        int i5 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i3 = 2;
        ((c) dVar.a()).f812c.setOnClickListener(new View.OnClickListener(this) { // from class: U0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f880b;

            {
                this.f880b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f880b;
                switch (i3) {
                    case 0:
                        int i22 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GeneratorActivity.class));
                        break;
                    case 1:
                        int i32 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) PresetsActivity.class));
                        break;
                    case 2:
                        int i4 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) HistoryActivity.class));
                        break;
                    default:
                        int i5 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i4 = 3;
        ((c) dVar.a()).f813e.setOnClickListener(new View.OnClickListener(this) { // from class: U0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f880b;

            {
                this.f880b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f880b;
                switch (i4) {
                    case 0:
                        int i22 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GeneratorActivity.class));
                        break;
                    case 1:
                        int i32 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) PresetsActivity.class));
                        break;
                    case 2:
                        int i42 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) HistoryActivity.class));
                        break;
                    default:
                        int i5 = HomeActivity.f2113z;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
    }
}
