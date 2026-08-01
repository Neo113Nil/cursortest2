package com.visualfortune.eyerest;

import C0.p;
import O0.c;
import O0.i;
import O0.m;
import O0.o;
import P0.e;
import Q0.d;
import Y0.a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.visualfortune.eyerest.EyeBreakCanvasView;
import com.visualfortune.eyerest.R;
import com.visualfortune.eyerest.SessionActivity;
import g.AbstractActivityC0131i;
import java.util.List;
import s1.l;

/* loaded from: classes.dex */
public final class SessionActivity extends AbstractActivityC0131i implements c {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f1937H = 0;

    /* renamed from: B, reason: collision with root package name */
    public i f1939B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1940C;

    /* renamed from: D, reason: collision with root package name */
    public CountDownTimer f1941D;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public int f1943G;

    /* renamed from: y, reason: collision with root package name */
    public final d f1944y;

    /* renamed from: z, reason: collision with root package name */
    public final d f1945z;

    /* renamed from: A, reason: collision with root package name */
    public int f1938A = 1;

    /* renamed from: E, reason: collision with root package name */
    public int f1942E = 120;

    public SessionActivity() {
        final int i = 0;
        this.f1944y = new d(new a(this) { // from class: O0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SessionActivity f633b;

            {
                this.f633b = this;
            }

            @Override // Y0.a
            public final Object a() {
                SessionActivity sessionActivity = this.f633b;
                switch (i) {
                    case 0:
                        int i2 = SessionActivity.f1937H;
                        View inflate = sessionActivity.getLayoutInflater().inflate(R.layout.activity_session, (ViewGroup) null, false);
                        int i3 = R.id.endBreakButton;
                        Button button = (Button) k1.c.j(inflate, R.id.endBreakButton);
                        if (button != null) {
                            i3 = R.id.exerciseText;
                            TextView textView = (TextView) k1.c.j(inflate, R.id.exerciseText);
                            if (textView != null) {
                                i3 = R.id.instructionText;
                                TextView textView2 = (TextView) k1.c.j(inflate, R.id.instructionText);
                                if (textView2 != null) {
                                    i3 = R.id.routineText;
                                    TextView textView3 = (TextView) k1.c.j(inflate, R.id.routineText);
                                    if (textView3 != null) {
                                        i3 = R.id.sessionView;
                                        EyeBreakCanvasView eyeBreakCanvasView = (EyeBreakCanvasView) k1.c.j(inflate, R.id.sessionView);
                                        if (eyeBreakCanvasView != null) {
                                            i3 = R.id.skipButton;
                                            Button button2 = (Button) k1.c.j(inflate, R.id.skipButton);
                                            if (button2 != null) {
                                                i3 = R.id.timeText;
                                                TextView textView4 = (TextView) k1.c.j(inflate, R.id.timeText);
                                                if (textView4 != null) {
                                                    return new P0.e((FrameLayout) inflate, button, textView, textView2, textView3, eyeBreakCanvasView, button2, textView4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = SessionActivity.f1937H;
                        return new a(sessionActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1945z = new d(new a(this) { // from class: O0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SessionActivity f633b;

            {
                this.f633b = this;
            }

            @Override // Y0.a
            public final Object a() {
                SessionActivity sessionActivity = this.f633b;
                switch (i2) {
                    case 0:
                        int i22 = SessionActivity.f1937H;
                        View inflate = sessionActivity.getLayoutInflater().inflate(R.layout.activity_session, (ViewGroup) null, false);
                        int i3 = R.id.endBreakButton;
                        Button button = (Button) k1.c.j(inflate, R.id.endBreakButton);
                        if (button != null) {
                            i3 = R.id.exerciseText;
                            TextView textView = (TextView) k1.c.j(inflate, R.id.exerciseText);
                            if (textView != null) {
                                i3 = R.id.instructionText;
                                TextView textView2 = (TextView) k1.c.j(inflate, R.id.instructionText);
                                if (textView2 != null) {
                                    i3 = R.id.routineText;
                                    TextView textView3 = (TextView) k1.c.j(inflate, R.id.routineText);
                                    if (textView3 != null) {
                                        i3 = R.id.sessionView;
                                        EyeBreakCanvasView eyeBreakCanvasView = (EyeBreakCanvasView) k1.c.j(inflate, R.id.sessionView);
                                        if (eyeBreakCanvasView != null) {
                                            i3 = R.id.skipButton;
                                            Button button2 = (Button) k1.c.j(inflate, R.id.skipButton);
                                            if (button2 != null) {
                                                i3 = R.id.timeText;
                                                TextView textView4 = (TextView) k1.c.j(inflate, R.id.timeText);
                                                if (textView4 != null) {
                                                    return new P0.e((FrameLayout) inflate, button, textView, textView2, textView3, eyeBreakCanvasView, button2, textView4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = SessionActivity.f1937H;
                        return new a(sessionActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0131i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(u().f650a);
        int o2 = l.o(getIntent().getIntExtra("routine", 1), 1, 3);
        this.f1938A = o2;
        List list = o.f637a;
        i iVar = (i) list.get(l.o(o2 - 1, 0, R0.i.k0(list)));
        this.f1939B = iVar;
        if (iVar == null) {
            Z0.d.h("config");
            throw null;
        }
        this.f1942E = iVar.d;
        this.F = 0;
        this.f1943G = 0;
        u().f654f.setListener(this);
        EyeBreakCanvasView eyeBreakCanvasView = u().f654f;
        i iVar2 = this.f1939B;
        if (iVar2 == null) {
            Z0.d.h("config");
            throw null;
        }
        eyeBreakCanvasView.f1901b = iVar2;
        final int i = 0;
        u().f651b.setOnClickListener(new View.OnClickListener(this) { // from class: O0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SessionActivity f631b;

            {
                this.f631b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SessionActivity sessionActivity = this.f631b;
                switch (i) {
                    case 0:
                        int i2 = SessionActivity.f1937H;
                        sessionActivity.t();
                        break;
                    default:
                        int i3 = SessionActivity.f1937H;
                        EyeBreakCanvasView eyeBreakCanvasView2 = sessionActivity.u().f654f;
                        if (eyeBreakCanvasView2.f1902c) {
                            eyeBreakCanvasView2.a();
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        u().f655g.setOnClickListener(new View.OnClickListener(this) { // from class: O0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SessionActivity f631b;

            {
                this.f631b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SessionActivity sessionActivity = this.f631b;
                switch (i2) {
                    case 0:
                        int i22 = SessionActivity.f1937H;
                        sessionActivity.t();
                        break;
                    default:
                        int i3 = SessionActivity.f1937H;
                        EyeBreakCanvasView eyeBreakCanvasView2 = sessionActivity.u().f654f;
                        if (eyeBreakCanvasView2.f1902c) {
                            eyeBreakCanvasView2.a();
                            break;
                        }
                        break;
                }
            }
        });
        v();
        CountDownTimer countDownTimer = this.f1941D;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f1941D = new m(this, this.f1942E * 1000).start();
        u().f654f.post(new p(6, this));
    }

    @Override // g.AbstractActivityC0131i, android.app.Activity
    public final void onDestroy() {
        CountDownTimer countDownTimer = this.f1941D;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        EyeBreakCanvasView eyeBreakCanvasView = u().f654f;
        eyeBreakCanvasView.f1902c = false;
        Choreographer.getInstance().removeFrameCallback(eyeBreakCanvasView);
        super.onDestroy();
    }

    public final void t() {
        if (this.f1940C) {
            return;
        }
        this.f1940C = true;
        CountDownTimer countDownTimer = this.f1941D;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        EyeBreakCanvasView eyeBreakCanvasView = u().f654f;
        eyeBreakCanvasView.f1902c = false;
        Choreographer.getInstance().removeFrameCallback(eyeBreakCanvasView);
        int i = this.F;
        if (i < 1) {
            i = 1;
        }
        O0.a aVar = (O0.a) this.f1945z.a();
        int i2 = aVar.f604a.getInt("total_sessions", 0) + 1;
        SharedPreferences sharedPreferences = aVar.f604a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i2 < 0) {
            i2 = 0;
        }
        edit.putInt("total_sessions", i2).apply();
        int i3 = sharedPreferences.getInt("total_minutes", 0) + ((i + 59) / 60);
        sharedPreferences.edit().putInt("total_minutes", i3 >= 0 ? i3 : 0).apply();
        startActivity(new Intent(this, (Class<?>) SessionCompleteActivity.class).putExtra("duration", i).putExtra("exercises", this.f1943G).putExtra("routine", this.f1938A));
        finish();
    }

    public final e u() {
        return (e) this.f1944y.a();
    }

    public final void v() {
        TextView textView = u().f653e;
        i iVar = this.f1939B;
        if (iVar == null) {
            Z0.d.h("config");
            throw null;
        }
        textView.setText(getString(R.string.routine_label, getString(iVar.f623b)));
        int i = u().f654f.f1904f;
        i iVar2 = this.f1939B;
        if (iVar2 == null) {
            Z0.d.h("config");
            throw null;
        }
        int size = (i % iVar2.f627g.size()) + 1;
        TextView textView2 = u().f652c;
        Integer valueOf = Integer.valueOf(size);
        i iVar3 = this.f1939B;
        if (iVar3 == null) {
            Z0.d.h("config");
            throw null;
        }
        textView2.setText(getString(R.string.exercise_label, valueOf, Integer.valueOf(iVar3.f627g.size())));
        u().h.setText(getString(R.string.time_label, Integer.valueOf(this.f1942E)));
    }
}
