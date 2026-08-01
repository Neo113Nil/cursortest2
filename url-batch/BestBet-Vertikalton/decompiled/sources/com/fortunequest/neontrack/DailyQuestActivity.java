package com.fortunequest.neontrack;

import U0.ViewOnClickListenerC0031a;
import X0.f;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.J;
import com.fortunequest.neontrack.DailyQuestActivity;
import com.fortunequest.neontrack.R;
import com.fortunequest.neontrack.data.FortuneQuestDatabase;
import com.fortunequest.neontrack.ui.ColorWaveOverlay;
import com.fortunequest.neontrack.ui.NeonHabitBoardView;
import com.google.android.material.button.MaterialButton;
import g.AbstractActivityC0128i;
import j1.InterfaceC0170a;
import java.util.Arrays;
import java.util.Locale;
import s1.AbstractC0335s;
import t0.C0358k;
import t0.C0360m;
import u0.C0383v;
import v0.b;
import w0.c;

/* loaded from: classes.dex */
public final class DailyQuestActivity extends AbstractActivityC0128i implements c {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f2073C = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f2074A;

    /* renamed from: B, reason: collision with root package name */
    public C0358k f2075B;

    /* renamed from: y, reason: collision with root package name */
    public final f f2076y;

    /* renamed from: z, reason: collision with root package name */
    public final f f2077z;

    public DailyQuestActivity() {
        final int i = 0;
        this.f2076y = new f(new InterfaceC0170a(this) { // from class: t0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DailyQuestActivity f4136b;

            {
                this.f4136b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                DailyQuestActivity dailyQuestActivity = this.f4136b;
                switch (i) {
                    case 0:
                        int i2 = DailyQuestActivity.f2073C;
                        View inflate = dailyQuestActivity.getLayoutInflater().inflate(R.layout.activity_daily_quest, (ViewGroup) null, false);
                        int i3 = R.id.btnBackHome;
                        MaterialButton materialButton = (MaterialButton) b1.g.l(inflate, R.id.btnBackHome);
                        if (materialButton != null) {
                            i3 = R.id.colorWave;
                            ColorWaveOverlay colorWaveOverlay = (ColorWaveOverlay) b1.g.l(inflate, R.id.colorWave);
                            if (colorWaveOverlay != null) {
                                i3 = R.id.completedHud;
                                TextView textView = (TextView) b1.g.l(inflate, R.id.completedHud);
                                if (textView != null) {
                                    i3 = R.id.emptyState;
                                    TextView textView2 = (TextView) b1.g.l(inflate, R.id.emptyState);
                                    if (textView2 != null) {
                                        i3 = R.id.graceHud;
                                        TextView textView3 = (TextView) b1.g.l(inflate, R.id.graceHud);
                                        if (textView3 != null) {
                                            i3 = R.id.habitBoard;
                                            NeonHabitBoardView neonHabitBoardView = (NeonHabitBoardView) b1.g.l(inflate, R.id.habitBoard);
                                            if (neonHabitBoardView != null) {
                                                i3 = R.id.habitScroll;
                                                ScrollView scrollView = (ScrollView) b1.g.l(inflate, R.id.habitScroll);
                                                if (scrollView != null) {
                                                    i3 = R.id.hudBar;
                                                    if (((LinearLayout) b1.g.l(inflate, R.id.hudBar)) != null) {
                                                        i3 = R.id.levelHud;
                                                        TextView textView4 = (TextView) b1.g.l(inflate, R.id.levelHud);
                                                        if (textView4 != null) {
                                                            i3 = R.id.multiplierHud;
                                                            TextView textView5 = (TextView) b1.g.l(inflate, R.id.multiplierHud);
                                                            if (textView5 != null) {
                                                                i3 = R.id.streakHud;
                                                                TextView textView6 = (TextView) b1.g.l(inflate, R.id.streakHud);
                                                                if (textView6 != null) {
                                                                    i3 = R.id.tapHint;
                                                                    if (((TextView) b1.g.l(inflate, R.id.tapHint)) != null) {
                                                                        return new v0.b((FrameLayout) inflate, materialButton, colorWaveOverlay, textView, textView2, textView3, neonHabitBoardView, scrollView, textView4, textView5, textView6);
                                                                    }
                                                                }
                                                            }
                                                        }
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
                        int i4 = DailyQuestActivity.f2073C;
                        return new C0383v(FortuneQuestDatabase.f2094l.a(dailyQuestActivity));
                }
            }
        });
        final int i2 = 1;
        this.f2077z = new f(new InterfaceC0170a(this) { // from class: t0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DailyQuestActivity f4136b;

            {
                this.f4136b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                DailyQuestActivity dailyQuestActivity = this.f4136b;
                switch (i2) {
                    case 0:
                        int i22 = DailyQuestActivity.f2073C;
                        View inflate = dailyQuestActivity.getLayoutInflater().inflate(R.layout.activity_daily_quest, (ViewGroup) null, false);
                        int i3 = R.id.btnBackHome;
                        MaterialButton materialButton = (MaterialButton) b1.g.l(inflate, R.id.btnBackHome);
                        if (materialButton != null) {
                            i3 = R.id.colorWave;
                            ColorWaveOverlay colorWaveOverlay = (ColorWaveOverlay) b1.g.l(inflate, R.id.colorWave);
                            if (colorWaveOverlay != null) {
                                i3 = R.id.completedHud;
                                TextView textView = (TextView) b1.g.l(inflate, R.id.completedHud);
                                if (textView != null) {
                                    i3 = R.id.emptyState;
                                    TextView textView2 = (TextView) b1.g.l(inflate, R.id.emptyState);
                                    if (textView2 != null) {
                                        i3 = R.id.graceHud;
                                        TextView textView3 = (TextView) b1.g.l(inflate, R.id.graceHud);
                                        if (textView3 != null) {
                                            i3 = R.id.habitBoard;
                                            NeonHabitBoardView neonHabitBoardView = (NeonHabitBoardView) b1.g.l(inflate, R.id.habitBoard);
                                            if (neonHabitBoardView != null) {
                                                i3 = R.id.habitScroll;
                                                ScrollView scrollView = (ScrollView) b1.g.l(inflate, R.id.habitScroll);
                                                if (scrollView != null) {
                                                    i3 = R.id.hudBar;
                                                    if (((LinearLayout) b1.g.l(inflate, R.id.hudBar)) != null) {
                                                        i3 = R.id.levelHud;
                                                        TextView textView4 = (TextView) b1.g.l(inflate, R.id.levelHud);
                                                        if (textView4 != null) {
                                                            i3 = R.id.multiplierHud;
                                                            TextView textView5 = (TextView) b1.g.l(inflate, R.id.multiplierHud);
                                                            if (textView5 != null) {
                                                                i3 = R.id.streakHud;
                                                                TextView textView6 = (TextView) b1.g.l(inflate, R.id.streakHud);
                                                                if (textView6 != null) {
                                                                    i3 = R.id.tapHint;
                                                                    if (((TextView) b1.g.l(inflate, R.id.tapHint)) != null) {
                                                                        return new v0.b((FrameLayout) inflate, materialButton, colorWaveOverlay, textView, textView2, textView3, neonHabitBoardView, scrollView, textView4, textView5, textView6);
                                                                    }
                                                                }
                                                            }
                                                        }
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
                        int i4 = DailyQuestActivity.f2073C;
                        return new C0383v(FortuneQuestDatabase.f2094l.a(dailyQuestActivity));
                }
            }
        });
    }

    public static final void t(DailyQuestActivity dailyQuestActivity, float f2) {
        dailyQuestActivity.v().f4450j.setText(dailyQuestActivity.getString(R.string.multiplier_label, String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1))));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(2);
        dailyQuestActivity.v().f4450j.startAnimation(alphaAnimation);
    }

    public static final void u(DailyQuestActivity dailyQuestActivity, int i, float f2, int i2, int i3, int i4, int i5) {
        dailyQuestActivity.v().f4451k.setText(dailyQuestActivity.getString(R.string.streak_label, Integer.valueOf(i)));
        dailyQuestActivity.v().f4450j.setText(dailyQuestActivity.getString(R.string.multiplier_label, String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1))));
        dailyQuestActivity.v().f4448f.setText(dailyQuestActivity.getString(R.string.grace_label, Integer.valueOf(i2)));
        dailyQuestActivity.v().i.setText(dailyQuestActivity.getString(R.string.level_label, Integer.valueOf(i3)));
        dailyQuestActivity.v().d.setText(dailyQuestActivity.getString(R.string.completed_label, Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(v().f4444a);
        v().f4449g.setListener(this);
        v().f4445b.setOnClickListener(new ViewOnClickListenerC0031a(4, this));
    }

    @Override // g.AbstractActivityC0128i, android.app.Activity
    public final void onResume() {
        super.onResume();
        AbstractC0335s.g(J.e(this), null, new C0360m(this, null), 3);
    }

    public final b v() {
        return (b) this.f2076y.a();
    }
}
