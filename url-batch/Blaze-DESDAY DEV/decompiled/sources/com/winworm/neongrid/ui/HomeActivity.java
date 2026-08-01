package com.winworm.neongrid.ui;

import Q0.a;
import R0.b;
import U0.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.winworm.neongrid.R;
import com.winworm.neongrid.ui.GameActivity;
import com.winworm.neongrid.ui.HomeActivity;
import com.winworm.neongrid.ui.LevelsActivity;
import com.winworm.neongrid.ui.RulesActivity;
import f1.InterfaceC0090a;
import g.AbstractActivityC0108i;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0108i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2051A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f2052y;

    /* renamed from: z, reason: collision with root package name */
    public final e f2053z;

    public HomeActivity() {
        final int i = 0;
        this.f2052y = new e(new InterfaceC0090a(this) { // from class: T0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f832b;

            {
                this.f832b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                HomeActivity homeActivity = this.f832b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f2051A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.crystalsText;
                        TextView textView = (TextView) i0.g.h(inflate, R.id.crystalsText);
                        if (textView != null) {
                            i3 = R.id.exitButton;
                            MaterialButton materialButton = (MaterialButton) i0.g.h(inflate, R.id.exitButton);
                            if (materialButton != null) {
                                i3 = R.id.levelsButton;
                                MaterialButton materialButton2 = (MaterialButton) i0.g.h(inflate, R.id.levelsButton);
                                if (materialButton2 != null) {
                                    i3 = R.id.logoImage;
                                    if (((ImageView) i0.g.h(inflate, R.id.logoImage)) != null) {
                                        i3 = R.id.quickPlayButton;
                                        MaterialButton materialButton3 = (MaterialButton) i0.g.h(inflate, R.id.quickPlayButton);
                                        if (materialButton3 != null) {
                                            i3 = R.id.rulesButton;
                                            MaterialButton materialButton4 = (MaterialButton) i0.g.h(inflate, R.id.rulesButton);
                                            if (materialButton4 != null) {
                                                i3 = R.id.subtitleText;
                                                if (((TextView) i0.g.h(inflate, R.id.subtitleText)) != null) {
                                                    i3 = R.id.titleText;
                                                    if (((TextView) i0.g.h(inflate, R.id.titleText)) != null) {
                                                        return new R0.b((ConstraintLayout) inflate, textView, materialButton, materialButton2, materialButton3, materialButton4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f2051A;
                        return new Q0.a(homeActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2053z = new e(new InterfaceC0090a(this) { // from class: T0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f832b;

            {
                this.f832b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                HomeActivity homeActivity = this.f832b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f2051A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.crystalsText;
                        TextView textView = (TextView) i0.g.h(inflate, R.id.crystalsText);
                        if (textView != null) {
                            i3 = R.id.exitButton;
                            MaterialButton materialButton = (MaterialButton) i0.g.h(inflate, R.id.exitButton);
                            if (materialButton != null) {
                                i3 = R.id.levelsButton;
                                MaterialButton materialButton2 = (MaterialButton) i0.g.h(inflate, R.id.levelsButton);
                                if (materialButton2 != null) {
                                    i3 = R.id.logoImage;
                                    if (((ImageView) i0.g.h(inflate, R.id.logoImage)) != null) {
                                        i3 = R.id.quickPlayButton;
                                        MaterialButton materialButton3 = (MaterialButton) i0.g.h(inflate, R.id.quickPlayButton);
                                        if (materialButton3 != null) {
                                            i3 = R.id.rulesButton;
                                            MaterialButton materialButton4 = (MaterialButton) i0.g.h(inflate, R.id.rulesButton);
                                            if (materialButton4 != null) {
                                                i3 = R.id.subtitleText;
                                                if (((TextView) i0.g.h(inflate, R.id.subtitleText)) != null) {
                                                    i3 = R.id.titleText;
                                                    if (((TextView) i0.g.h(inflate, R.id.titleText)) != null) {
                                                        return new R0.b((ConstraintLayout) inflate, textView, materialButton, materialButton2, materialButton3, materialButton4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f2051A;
                        return new Q0.a(homeActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0108i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f743a);
        final int i = 0;
        t().f746e.setOnClickListener(new View.OnClickListener(this) { // from class: T0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f830b;

            {
                this.f830b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f830b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f2051A;
                        Intent putExtra = new Intent(homeActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i0.g.e(((Q0.a) homeActivity.f2053z.a()).f734a.getInt("max_unlocked_level", 1), 1, 12));
                        g1.d.d(putExtra, "putExtra(...)");
                        homeActivity.startActivity(putExtra);
                        break;
                    case 1:
                        int i3 = HomeActivity.f2051A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    case 2:
                        int i4 = HomeActivity.f2051A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                    default:
                        int i5 = HomeActivity.f2051A;
                        homeActivity.finishAffinity();
                        break;
                }
            }
        });
        final int i2 = 1;
        t().d.setOnClickListener(new View.OnClickListener(this) { // from class: T0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f830b;

            {
                this.f830b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f830b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f2051A;
                        Intent putExtra = new Intent(homeActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i0.g.e(((Q0.a) homeActivity.f2053z.a()).f734a.getInt("max_unlocked_level", 1), 1, 12));
                        g1.d.d(putExtra, "putExtra(...)");
                        homeActivity.startActivity(putExtra);
                        break;
                    case 1:
                        int i3 = HomeActivity.f2051A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    case 2:
                        int i4 = HomeActivity.f2051A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                    default:
                        int i5 = HomeActivity.f2051A;
                        homeActivity.finishAffinity();
                        break;
                }
            }
        });
        final int i3 = 2;
        t().f747f.setOnClickListener(new View.OnClickListener(this) { // from class: T0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f830b;

            {
                this.f830b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f830b;
                switch (i3) {
                    case 0:
                        int i22 = HomeActivity.f2051A;
                        Intent putExtra = new Intent(homeActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i0.g.e(((Q0.a) homeActivity.f2053z.a()).f734a.getInt("max_unlocked_level", 1), 1, 12));
                        g1.d.d(putExtra, "putExtra(...)");
                        homeActivity.startActivity(putExtra);
                        break;
                    case 1:
                        int i32 = HomeActivity.f2051A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    case 2:
                        int i4 = HomeActivity.f2051A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                    default:
                        int i5 = HomeActivity.f2051A;
                        homeActivity.finishAffinity();
                        break;
                }
            }
        });
        final int i4 = 3;
        t().f745c.setOnClickListener(new View.OnClickListener(this) { // from class: T0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f830b;

            {
                this.f830b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f830b;
                switch (i4) {
                    case 0:
                        int i22 = HomeActivity.f2051A;
                        Intent putExtra = new Intent(homeActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i0.g.e(((Q0.a) homeActivity.f2053z.a()).f734a.getInt("max_unlocked_level", 1), 1, 12));
                        g1.d.d(putExtra, "putExtra(...)");
                        homeActivity.startActivity(putExtra);
                        break;
                    case 1:
                        int i32 = HomeActivity.f2051A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    case 2:
                        int i42 = HomeActivity.f2051A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                    default:
                        int i5 = HomeActivity.f2051A;
                        homeActivity.finishAffinity();
                        break;
                }
            }
        });
    }

    @Override // g.AbstractActivityC0108i, android.app.Activity
    public final void onResume() {
        super.onResume();
        t().f744b.setText(getString(R.string.crystals_label, Integer.valueOf(((a) this.f2053z.a()).f734a.getInt("total_crystals", 0))));
    }

    public final b t() {
        return (b) this.f2052y.a();
    }
}
