package com.visualfortune.eyerest;

import P0.b;
import Q0.d;
import Y0.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.visualfortune.eyerest.GuideActivity;
import com.visualfortune.eyerest.HomeActivity;
import com.visualfortune.eyerest.R;
import com.visualfortune.eyerest.RoutinesActivity;
import com.visualfortune.eyerest.SessionActivity;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0131i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1925A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f1926y;

    /* renamed from: z, reason: collision with root package name */
    public final d f1927z;

    public HomeActivity() {
        final int i = 0;
        this.f1926y = new d(new a(this) { // from class: O0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f612b;

            {
                this.f612b = this;
            }

            @Override // Y0.a
            public final Object a() {
                HomeActivity homeActivity = this.f612b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f1925A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.guideButton;
                        Button button = (Button) k1.c.j(inflate, R.id.guideButton);
                        if (button != null) {
                            i3 = R.id.minutesText;
                            TextView textView = (TextView) k1.c.j(inflate, R.id.minutesText);
                            if (textView != null) {
                                i3 = R.id.routinesButton;
                                Button button2 = (Button) k1.c.j(inflate, R.id.routinesButton);
                                if (button2 != null) {
                                    i3 = R.id.sessionsText;
                                    TextView textView2 = (TextView) k1.c.j(inflate, R.id.sessionsText);
                                    if (textView2 != null) {
                                        i3 = R.id.startBreakButton;
                                        Button button3 = (Button) k1.c.j(inflate, R.id.startBreakButton);
                                        if (button3 != null) {
                                            i3 = R.id.subtitleText;
                                            if (((TextView) k1.c.j(inflate, R.id.subtitleText)) != null) {
                                                i3 = R.id.titleText;
                                                if (((TextView) k1.c.j(inflate, R.id.titleText)) != null) {
                                                    return new P0.b((FrameLayout) inflate, button, textView, button2, textView2, button3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f1925A;
                        return new a(homeActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1927z = new d(new a(this) { // from class: O0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f612b;

            {
                this.f612b = this;
            }

            @Override // Y0.a
            public final Object a() {
                HomeActivity homeActivity = this.f612b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f1925A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.guideButton;
                        Button button = (Button) k1.c.j(inflate, R.id.guideButton);
                        if (button != null) {
                            i3 = R.id.minutesText;
                            TextView textView = (TextView) k1.c.j(inflate, R.id.minutesText);
                            if (textView != null) {
                                i3 = R.id.routinesButton;
                                Button button2 = (Button) k1.c.j(inflate, R.id.routinesButton);
                                if (button2 != null) {
                                    i3 = R.id.sessionsText;
                                    TextView textView2 = (TextView) k1.c.j(inflate, R.id.sessionsText);
                                    if (textView2 != null) {
                                        i3 = R.id.startBreakButton;
                                        Button button3 = (Button) k1.c.j(inflate, R.id.startBreakButton);
                                        if (button3 != null) {
                                            i3 = R.id.subtitleText;
                                            if (((TextView) k1.c.j(inflate, R.id.subtitleText)) != null) {
                                                i3 = R.id.titleText;
                                                if (((TextView) k1.c.j(inflate, R.id.titleText)) != null) {
                                                    return new P0.b((FrameLayout) inflate, button, textView, button2, textView2, button3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f1925A;
                        return new a(homeActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0131i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f641a);
        final int i = 0;
        t().f645f.setOnClickListener(new View.OnClickListener(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f614b;

            {
                this.f614b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f614b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) SessionActivity.class).putExtra("routine", 2));
                        break;
                    case 1:
                        int i3 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RoutinesActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GuideActivity.class));
                        break;
                }
            }
        });
        final int i2 = 1;
        t().d.setOnClickListener(new View.OnClickListener(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f614b;

            {
                this.f614b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f614b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) SessionActivity.class).putExtra("routine", 2));
                        break;
                    case 1:
                        int i3 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RoutinesActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GuideActivity.class));
                        break;
                }
            }
        });
        final int i3 = 2;
        t().f642b.setOnClickListener(new View.OnClickListener(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f614b;

            {
                this.f614b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f614b;
                switch (i3) {
                    case 0:
                        int i22 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) SessionActivity.class).putExtra("routine", 2));
                        break;
                    case 1:
                        int i32 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RoutinesActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f1925A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) GuideActivity.class));
                        break;
                }
            }
        });
    }

    @Override // g.AbstractActivityC0131i, android.app.Activity
    public final void onResume() {
        super.onResume();
        TextView textView = t().f644e;
        d dVar = this.f1927z;
        textView.setText(getString(R.string.total_sessions, Integer.valueOf(((O0.a) dVar.a()).f604a.getInt("total_sessions", 0))));
        t().f643c.setText(getString(R.string.total_minutes, Integer.valueOf(((O0.a) dVar.a()).f604a.getInt("total_minutes", 0))));
    }

    public final b t() {
        return (b) this.f1926y.a();
    }
}
