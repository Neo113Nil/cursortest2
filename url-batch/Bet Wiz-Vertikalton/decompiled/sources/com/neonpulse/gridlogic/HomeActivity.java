package com.neonpulse.gridlogic;

import Q0.a;
import R0.b;
import V0.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.neonpulse.gridlogic.HomeActivity;
import com.neonpulse.gridlogic.LevelsActivity;
import com.neonpulse.gridlogic.R;
import com.neonpulse.gridlogic.RulesActivity;
import d1.InterfaceC0081a;
import g.AbstractActivityC0132i;
import j0.AbstractC0142a;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0132i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1973A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f1974y;

    /* renamed from: z, reason: collision with root package name */
    public final d f1975z;

    public HomeActivity() {
        final int i = 0;
        this.f1974y = new d(new InterfaceC0081a(this) { // from class: O0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f674b;

            {
                this.f674b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                HomeActivity homeActivity = this.f674b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f1973A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.btnExit;
                        Button button = (Button) AbstractC0142a.f(inflate, R.id.btnExit);
                        if (button != null) {
                            i3 = R.id.btnPlay;
                            Button button2 = (Button) AbstractC0142a.f(inflate, R.id.btnPlay);
                            if (button2 != null) {
                                i3 = R.id.btnRules;
                                Button button3 = (Button) AbstractC0142a.f(inflate, R.id.btnRules);
                                if (button3 != null) {
                                    i3 = R.id.crystalsHome;
                                    TextView textView = (TextView) AbstractC0142a.f(inflate, R.id.crystalsHome);
                                    if (textView != null) {
                                        i3 = R.id.titleText;
                                        if (((TextView) AbstractC0142a.f(inflate, R.id.titleText)) != null) {
                                            return new R0.b((FrameLayout) inflate, button, button2, button3, textView);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f1973A;
                        return new Q0.a(homeActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1975z = new d(new InterfaceC0081a(this) { // from class: O0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f674b;

            {
                this.f674b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                HomeActivity homeActivity = this.f674b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f1973A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.btnExit;
                        Button button = (Button) AbstractC0142a.f(inflate, R.id.btnExit);
                        if (button != null) {
                            i3 = R.id.btnPlay;
                            Button button2 = (Button) AbstractC0142a.f(inflate, R.id.btnPlay);
                            if (button2 != null) {
                                i3 = R.id.btnRules;
                                Button button3 = (Button) AbstractC0142a.f(inflate, R.id.btnRules);
                                if (button3 != null) {
                                    i3 = R.id.crystalsHome;
                                    TextView textView = (TextView) AbstractC0142a.f(inflate, R.id.crystalsHome);
                                    if (textView != null) {
                                        i3 = R.id.titleText;
                                        if (((TextView) AbstractC0142a.f(inflate, R.id.titleText)) != null) {
                                            return new R0.b((FrameLayout) inflate, button, button2, button3, textView);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f1973A;
                        return new Q0.a(homeActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0132i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f736a);
        t().f739e.setText(getString(R.string.crystals_label, Integer.valueOf(((a) this.f1975z.a()).f727a.getInt("crystals", 0))));
        final int i = 0;
        t().f738c.setOnClickListener(new View.OnClickListener(this) { // from class: O0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f676b;

            {
                this.f676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f676b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f1973A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    case 1:
                        int i3 = HomeActivity.f1973A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1973A;
                        homeActivity.finishAffinity();
                        break;
                }
            }
        });
        final int i2 = 1;
        t().d.setOnClickListener(new View.OnClickListener(this) { // from class: O0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f676b;

            {
                this.f676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f676b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f1973A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    case 1:
                        int i3 = HomeActivity.f1973A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1973A;
                        homeActivity.finishAffinity();
                        break;
                }
            }
        });
        final int i3 = 2;
        t().f737b.setOnClickListener(new View.OnClickListener(this) { // from class: O0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f676b;

            {
                this.f676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f676b;
                switch (i3) {
                    case 0:
                        int i22 = HomeActivity.f1973A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    case 1:
                        int i32 = HomeActivity.f1973A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1973A;
                        homeActivity.finishAffinity();
                        break;
                }
            }
        });
    }

    @Override // g.AbstractActivityC0132i, android.app.Activity
    public final void onResume() {
        super.onResume();
        t().f739e.setText(getString(R.string.crystals_label, Integer.valueOf(((a) this.f1975z.a()).f727a.getInt("crystals", 0))));
    }

    public final b t() {
        return (b) this.f1974y.a();
    }
}
