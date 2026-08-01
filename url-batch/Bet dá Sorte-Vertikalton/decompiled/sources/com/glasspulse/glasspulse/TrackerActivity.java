package com.glasspulse.glasspulse;

import S0.c;
import a1.InterfaceC0058a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import b1.d;
import com.glasspulse.glasspulse.R;
import com.glasspulse.glasspulse.TrackerActivity;
import com.glasspulse.glasspulse.view.WaterGlassView;
import g.AbstractActivityC0128i;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import k0.z;
import p0.AbstractC0266a;
import p0.C0267b;
import p0.C0268c;
import q0.f;
import r0.C0277a;
import u1.l;

/* loaded from: classes.dex */
public final class TrackerActivity extends AbstractActivityC0128i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1615A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final c f1616y;

    /* renamed from: z, reason: collision with root package name */
    public final c f1617z;

    public TrackerActivity() {
        final int i = 0;
        this.f1616y = new c(new InterfaceC0058a(this) { // from class: o0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackerActivity f3392b;

            {
                this.f3392b = this;
            }

            @Override // a1.InterfaceC0058a
            public final Object a() {
                TrackerActivity trackerActivity = this.f3392b;
                switch (i) {
                    case 0:
                        int i2 = TrackerActivity.f1615A;
                        View inflate = trackerActivity.getLayoutInflater().inflate(R.layout.activity_tracker, (ViewGroup) null, false);
                        int i3 = R.id.btnAdd250;
                        AppCompatButton appCompatButton = (AppCompatButton) z.g(inflate, R.id.btnAdd250);
                        if (appCompatButton != null) {
                            i3 = R.id.btnAdd500;
                            AppCompatButton appCompatButton2 = (AppCompatButton) z.g(inflate, R.id.btnAdd500);
                            if (appCompatButton2 != null) {
                                i3 = R.id.btnAdd750;
                                AppCompatButton appCompatButton3 = (AppCompatButton) z.g(inflate, R.id.btnAdd750);
                                if (appCompatButton3 != null) {
                                    i3 = R.id.btnBack;
                                    AppCompatButton appCompatButton4 = (AppCompatButton) z.g(inflate, R.id.btnBack);
                                    if (appCompatButton4 != null) {
                                        i3 = R.id.btnResetToday;
                                        AppCompatButton appCompatButton5 = (AppCompatButton) z.g(inflate, R.id.btnResetToday);
                                        if (appCompatButton5 != null) {
                                            i3 = R.id.hudBar;
                                            if (((LinearLayout) z.g(inflate, R.id.hudBar)) != null) {
                                                i3 = R.id.hudGoal;
                                                TextView textView = (TextView) z.g(inflate, R.id.hudGoal);
                                                if (textView != null) {
                                                    i3 = R.id.hudIntake;
                                                    TextView textView2 = (TextView) z.g(inflate, R.id.hudIntake);
                                                    if (textView2 != null) {
                                                        i3 = R.id.hudStreak;
                                                        TextView textView3 = (TextView) z.g(inflate, R.id.hudStreak);
                                                        if (textView3 != null) {
                                                            i3 = R.id.trackerHint;
                                                            if (((TextView) z.g(inflate, R.id.trackerHint)) != null) {
                                                                i3 = R.id.waterGlass;
                                                                WaterGlassView waterGlassView = (WaterGlassView) z.g(inflate, R.id.waterGlass);
                                                                if (waterGlassView != null) {
                                                                    return new q0.f((ScrollView) inflate, appCompatButton, appCompatButton2, appCompatButton3, appCompatButton4, appCompatButton5, textView, textView2, textView3, waterGlassView);
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
                        int i4 = TrackerActivity.f1615A;
                        return new C0268c(trackerActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1617z = new c(new InterfaceC0058a(this) { // from class: o0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackerActivity f3392b;

            {
                this.f3392b = this;
            }

            @Override // a1.InterfaceC0058a
            public final Object a() {
                TrackerActivity trackerActivity = this.f3392b;
                switch (i2) {
                    case 0:
                        int i22 = TrackerActivity.f1615A;
                        View inflate = trackerActivity.getLayoutInflater().inflate(R.layout.activity_tracker, (ViewGroup) null, false);
                        int i3 = R.id.btnAdd250;
                        AppCompatButton appCompatButton = (AppCompatButton) z.g(inflate, R.id.btnAdd250);
                        if (appCompatButton != null) {
                            i3 = R.id.btnAdd500;
                            AppCompatButton appCompatButton2 = (AppCompatButton) z.g(inflate, R.id.btnAdd500);
                            if (appCompatButton2 != null) {
                                i3 = R.id.btnAdd750;
                                AppCompatButton appCompatButton3 = (AppCompatButton) z.g(inflate, R.id.btnAdd750);
                                if (appCompatButton3 != null) {
                                    i3 = R.id.btnBack;
                                    AppCompatButton appCompatButton4 = (AppCompatButton) z.g(inflate, R.id.btnBack);
                                    if (appCompatButton4 != null) {
                                        i3 = R.id.btnResetToday;
                                        AppCompatButton appCompatButton5 = (AppCompatButton) z.g(inflate, R.id.btnResetToday);
                                        if (appCompatButton5 != null) {
                                            i3 = R.id.hudBar;
                                            if (((LinearLayout) z.g(inflate, R.id.hudBar)) != null) {
                                                i3 = R.id.hudGoal;
                                                TextView textView = (TextView) z.g(inflate, R.id.hudGoal);
                                                if (textView != null) {
                                                    i3 = R.id.hudIntake;
                                                    TextView textView2 = (TextView) z.g(inflate, R.id.hudIntake);
                                                    if (textView2 != null) {
                                                        i3 = R.id.hudStreak;
                                                        TextView textView3 = (TextView) z.g(inflate, R.id.hudStreak);
                                                        if (textView3 != null) {
                                                            i3 = R.id.trackerHint;
                                                            if (((TextView) z.g(inflate, R.id.trackerHint)) != null) {
                                                                i3 = R.id.waterGlass;
                                                                WaterGlassView waterGlassView = (WaterGlassView) z.g(inflate, R.id.waterGlass);
                                                                if (waterGlassView != null) {
                                                                    return new q0.f((ScrollView) inflate, appCompatButton, appCompatButton2, appCompatButton3, appCompatButton4, appCompatButton5, textView, textView2, textView3, waterGlassView);
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
                        int i4 = TrackerActivity.f1615A;
                        return new C0268c(trackerActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 0;
        final int i2 = 1;
        super.onCreate(bundle);
        setContentView(u().f3486a);
        List list = AbstractC0266a.f3416a;
        int i3 = v().f3420a.getInt("selected_goal", 1);
        List list2 = AbstractC0266a.f3416a;
        final List list3 = ((C0267b) ((i3 < 0 || i3 >= list2.size()) ? (C0267b) list2.get(1) : list2.get(i3))).d;
        u().f3492j.setOnGlassTapListener(new InterfaceC0058a() { // from class: o0.i
            @Override // a1.InterfaceC0058a
            public final Object a() {
                int i4 = TrackerActivity.f1615A;
                TrackerActivity.this.t(((Number) T0.h.n0(list3)).intValue());
                return S0.d.f774c;
            }
        });
        u().f3487b.setOnClickListener(new View.OnClickListener(this) { // from class: o0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackerActivity f3387b;

            {
                this.f3387b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackerActivity trackerActivity = this.f3387b;
                List list4 = list3;
                switch (i) {
                    case 0:
                        int i4 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(0)).intValue());
                        break;
                    case 1:
                        int i5 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(1)).intValue());
                        break;
                    default:
                        int i6 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(2)).intValue());
                        break;
                }
            }
        });
        u().f3488c.setOnClickListener(new View.OnClickListener(this) { // from class: o0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackerActivity f3387b;

            {
                this.f3387b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackerActivity trackerActivity = this.f3387b;
                List list4 = list3;
                switch (i2) {
                    case 0:
                        int i4 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(0)).intValue());
                        break;
                    case 1:
                        int i5 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(1)).intValue());
                        break;
                    default:
                        int i6 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(2)).intValue());
                        break;
                }
            }
        });
        final int i4 = 2;
        u().d.setOnClickListener(new View.OnClickListener(this) { // from class: o0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackerActivity f3387b;

            {
                this.f3387b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackerActivity trackerActivity = this.f3387b;
                List list4 = list3;
                switch (i4) {
                    case 0:
                        int i42 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(0)).intValue());
                        break;
                    case 1:
                        int i5 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(1)).intValue());
                        break;
                    default:
                        int i6 = TrackerActivity.f1615A;
                        trackerActivity.t(((Number) list4.get(2)).intValue());
                        break;
                }
            }
        });
        u().f3490f.setOnClickListener(new View.OnClickListener(this) { // from class: o0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackerActivity f3390b;

            {
                this.f3390b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackerActivity trackerActivity = this.f3390b;
                switch (i) {
                    case 0:
                        int i5 = TrackerActivity.f1615A;
                        C0268c v2 = trackerActivity.v();
                        v2.a();
                        SharedPreferences sharedPreferences = v2.f3420a;
                        sharedPreferences.edit().putInt("today_intake_ml", 0).putBoolean("goal_shown", false).commit();
                        v2.a();
                        int i6 = sharedPreferences.getInt("daily_goal_ml", 2000);
                        v2.a();
                        int i7 = sharedPreferences.getInt("streak_days", 0);
                        WaterGlassView waterGlassView = trackerActivity.u().f3492j;
                        waterGlassView.f1633n = 0.0f;
                        waterGlassView.f1638s = false;
                        waterGlassView.f1637r = 1.0f;
                        waterGlassView.f1639t = 0.4f;
                        waterGlassView.f1640u = "";
                        waterGlassView.f1641v = 0.0f;
                        waterGlassView.f1643x.clear();
                        waterGlassView.f1636q = 0L;
                        Choreographer.getInstance().postFrameCallback(waterGlassView);
                        trackerActivity.x(0, i6, i7);
                        break;
                    default:
                        int i8 = TrackerActivity.f1615A;
                        trackerActivity.finish();
                        break;
                }
            }
        });
        u().f3489e.setOnClickListener(new View.OnClickListener(this) { // from class: o0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackerActivity f3390b;

            {
                this.f3390b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackerActivity trackerActivity = this.f3390b;
                switch (i2) {
                    case 0:
                        int i5 = TrackerActivity.f1615A;
                        C0268c v2 = trackerActivity.v();
                        v2.a();
                        SharedPreferences sharedPreferences = v2.f3420a;
                        sharedPreferences.edit().putInt("today_intake_ml", 0).putBoolean("goal_shown", false).commit();
                        v2.a();
                        int i6 = sharedPreferences.getInt("daily_goal_ml", 2000);
                        v2.a();
                        int i7 = sharedPreferences.getInt("streak_days", 0);
                        WaterGlassView waterGlassView = trackerActivity.u().f3492j;
                        waterGlassView.f1633n = 0.0f;
                        waterGlassView.f1638s = false;
                        waterGlassView.f1637r = 1.0f;
                        waterGlassView.f1639t = 0.4f;
                        waterGlassView.f1640u = "";
                        waterGlassView.f1641v = 0.0f;
                        waterGlassView.f1643x.clear();
                        waterGlassView.f1636q = 0L;
                        Choreographer.getInstance().postFrameCallback(waterGlassView);
                        trackerActivity.x(0, i6, i7);
                        break;
                    default:
                        int i8 = TrackerActivity.f1615A;
                        trackerActivity.finish();
                        break;
                }
            }
        });
        w();
    }

    @Override // g.AbstractActivityC0128i, android.app.Activity
    public final void onResume() {
        super.onResume();
        w();
    }

    public final void t(int i) {
        C0268c v2 = v();
        v2.a();
        v2.a();
        SharedPreferences sharedPreferences = v2.f3420a;
        int i2 = sharedPreferences.getInt("daily_goal_ml", 2000);
        v2.a();
        boolean z2 = sharedPreferences.getInt("today_intake_ml", 0) >= i2;
        v2.a();
        int i3 = sharedPreferences.getInt("today_intake_ml", 0) + i;
        sharedPreferences.edit().putInt("today_intake_ml", i3).commit();
        boolean z3 = i3 >= i2;
        if (z3 && !z2) {
            String format = v2.f3421b.format(new Date());
            d.d(format, "format(...)");
            if (!d.a(sharedPreferences.getString("last_goal_day", null), format)) {
                sharedPreferences.edit().putInt("streak_days", sharedPreferences.getInt("streak_days", 0) + 1).putString("last_goal_day", format).commit();
            }
        }
        v2.a();
        int i4 = sharedPreferences.getInt("streak_days", 0);
        boolean z4 = z3 && !z2;
        WaterGlassView waterGlassView = u().f3492j;
        v().getClass();
        waterGlassView.f1633n = l.l(l.l(i3 / (i2 < 1 ? 1 : i2), 1.0f), 1.0f);
        waterGlassView.f1637r = 0.0f;
        waterGlassView.f1638s = true;
        waterGlassView.f1639t = 1.0f;
        waterGlassView.f1640u = "+" + i + " ml";
        waterGlassView.f1641v = 1.0f;
        ArrayList arrayList = waterGlassView.f1643x;
        arrayList.clear();
        int i5 = 0;
        while (i5 < 4) {
            float random = (((float) Math.random()) * 0.16f) + 0.42f;
            float random2 = (((float) Math.random()) * 0.25f) + 0.55f;
            float random3 = (((float) Math.random()) * 4.0f) + 3.0f;
            float random4 = (((float) Math.random()) * 36.0f) + 28.0f;
            float random5 = (((float) Math.random()) * 0.35f) + 0.55f;
            C0277a c0277a = new C0277a();
            c0277a.f3566a = random;
            c0277a.f3567b = random2;
            c0277a.f3568c = random3;
            c0277a.d = random4;
            c0277a.f3569e = random5;
            arrayList.add(c0277a);
            i5++;
            i3 = i3;
        }
        waterGlassView.f1636q = 0L;
        Choreographer.getInstance().postFrameCallback(waterGlassView);
        x(i3, i2, i4);
        if (!z4 || v().f3420a.getBoolean("goal_shown", false)) {
            return;
        }
        v().f3420a.edit().putBoolean("goal_shown", true).commit();
        startActivity(new Intent(this, (Class<?>) GoalReachedActivity.class));
    }

    public final f u() {
        return (f) this.f1616y.a();
    }

    public final C0268c v() {
        return (C0268c) this.f1617z.a();
    }

    public final void w() {
        C0268c v2 = v();
        v2.a();
        int i = v2.f3420a.getInt("today_intake_ml", 0);
        C0268c v3 = v();
        v3.a();
        int i2 = v3.f3420a.getInt("daily_goal_ml", 2000);
        C0268c v4 = v();
        v4.a();
        x(i, i2, v4.f3420a.getInt("streak_days", 0));
        WaterGlassView waterGlassView = u().f3492j;
        v().getClass();
        if (i2 < 1) {
            i2 = 1;
        }
        waterGlassView.f1633n = l.l(l.l(i / i2, 1.0f), 1.0f);
        waterGlassView.f1638s = false;
        waterGlassView.f1637r = 1.0f;
        waterGlassView.f1639t = 0.0f;
        waterGlassView.f1641v = 0.0f;
        waterGlassView.f1643x.clear();
        waterGlassView.f1634o = waterGlassView.f1633n;
        waterGlassView.invalidate();
    }

    public final void x(int i, int i2, int i3) {
        u().h.setText(getString(R.string.intake_label, Integer.valueOf(i)));
        u().f3491g.setText(getString(R.string.goal_label, Integer.valueOf(i2)));
        u().i.setText(getString(R.string.streak_label, Integer.valueOf(i3)));
    }
}
