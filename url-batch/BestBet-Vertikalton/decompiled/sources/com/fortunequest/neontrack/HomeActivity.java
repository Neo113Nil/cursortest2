package com.fortunequest.neontrack;

import X0.f;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.J;
import com.fortunequest.neontrack.AddHabitActivity;
import com.fortunequest.neontrack.DailyQuestActivity;
import com.fortunequest.neontrack.HomeActivity;
import com.fortunequest.neontrack.R;
import com.fortunequest.neontrack.RulesActivity;
import com.fortunequest.neontrack.data.FortuneQuestDatabase;
import com.google.android.material.button.MaterialButton;
import g.AbstractActivityC0128i;
import j1.InterfaceC0170a;
import s1.AbstractC0335s;
import t0.s;
import u0.C0383v;
import v0.d;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0128i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2080A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final f f2081y;

    /* renamed from: z, reason: collision with root package name */
    public final f f2082z;

    public HomeActivity() {
        final int i = 0;
        this.f2081y = new f(new InterfaceC0170a(this) { // from class: t0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f4152b;

            {
                this.f4152b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                HomeActivity homeActivity = this.f4152b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f2080A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.bestStreakSummary;
                        TextView textView = (TextView) b1.g.l(inflate, R.id.bestStreakSummary);
                        if (textView != null) {
                            i3 = R.id.btnManageHabits;
                            MaterialButton materialButton = (MaterialButton) b1.g.l(inflate, R.id.btnManageHabits);
                            if (materialButton != null) {
                                i3 = R.id.btnRules;
                                MaterialButton materialButton2 = (MaterialButton) b1.g.l(inflate, R.id.btnRules);
                                if (materialButton2 != null) {
                                    i3 = R.id.btnStartQuest;
                                    MaterialButton materialButton3 = (MaterialButton) b1.g.l(inflate, R.id.btnStartQuest);
                                    if (materialButton3 != null) {
                                        i3 = R.id.homeSubtitle;
                                        if (((TextView) b1.g.l(inflate, R.id.homeSubtitle)) != null) {
                                            i3 = R.id.homeTitle;
                                            if (((TextView) b1.g.l(inflate, R.id.homeTitle)) != null) {
                                                i3 = R.id.streakSummary;
                                                TextView textView2 = (TextView) b1.g.l(inflate, R.id.streakSummary);
                                                if (textView2 != null) {
                                                    return new v0.d((FrameLayout) inflate, textView, materialButton, materialButton2, materialButton3, textView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f2080A;
                        return new C0383v(FortuneQuestDatabase.f2094l.a(homeActivity));
                }
            }
        });
        final int i2 = 1;
        this.f2082z = new f(new InterfaceC0170a(this) { // from class: t0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f4152b;

            {
                this.f4152b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                HomeActivity homeActivity = this.f4152b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f2080A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.bestStreakSummary;
                        TextView textView = (TextView) b1.g.l(inflate, R.id.bestStreakSummary);
                        if (textView != null) {
                            i3 = R.id.btnManageHabits;
                            MaterialButton materialButton = (MaterialButton) b1.g.l(inflate, R.id.btnManageHabits);
                            if (materialButton != null) {
                                i3 = R.id.btnRules;
                                MaterialButton materialButton2 = (MaterialButton) b1.g.l(inflate, R.id.btnRules);
                                if (materialButton2 != null) {
                                    i3 = R.id.btnStartQuest;
                                    MaterialButton materialButton3 = (MaterialButton) b1.g.l(inflate, R.id.btnStartQuest);
                                    if (materialButton3 != null) {
                                        i3 = R.id.homeSubtitle;
                                        if (((TextView) b1.g.l(inflate, R.id.homeSubtitle)) != null) {
                                            i3 = R.id.homeTitle;
                                            if (((TextView) b1.g.l(inflate, R.id.homeTitle)) != null) {
                                                i3 = R.id.streakSummary;
                                                TextView textView2 = (TextView) b1.g.l(inflate, R.id.streakSummary);
                                                if (textView2 != null) {
                                                    return new v0.d((FrameLayout) inflate, textView, materialButton, materialButton2, materialButton3, textView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f2080A;
                        return new C0383v(FortuneQuestDatabase.f2094l.a(homeActivity));
                }
            }
        });
    }

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f4455a);
        final int i = 0;
        t().f4458e.setOnClickListener(new View.OnClickListener(this) { // from class: t0.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f4154b;

            {
                this.f4154b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f4154b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) DailyQuestActivity.class));
                        break;
                    case 1:
                        int i3 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) AddHabitActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i2 = 1;
        t().f4457c.setOnClickListener(new View.OnClickListener(this) { // from class: t0.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f4154b;

            {
                this.f4154b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f4154b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) DailyQuestActivity.class));
                        break;
                    case 1:
                        int i3 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) AddHabitActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i3 = 2;
        t().d.setOnClickListener(new View.OnClickListener(this) { // from class: t0.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f4154b;

            {
                this.f4154b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f4154b;
                switch (i3) {
                    case 0:
                        int i22 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) DailyQuestActivity.class));
                        break;
                    case 1:
                        int i32 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) AddHabitActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f2080A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
    }

    @Override // g.AbstractActivityC0128i, android.app.Activity
    public final void onResume() {
        super.onResume();
        AbstractC0335s.g(J.e(this), null, new s(this, null), 3);
    }

    public final d t() {
        return (d) this.f2081y.a();
    }
}
