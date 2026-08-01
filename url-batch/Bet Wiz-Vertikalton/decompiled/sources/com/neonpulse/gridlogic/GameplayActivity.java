package com.neonpulse.gridlogic;

import L0.ViewOnClickListenerC0025a;
import O0.c;
import T0.b;
import U0.a;
import V0.d;
import W0.h;
import W0.j;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.neonpulse.gridlogic.GameplayActivity;
import com.neonpulse.gridlogic.R;
import com.neonpulse.gridlogic.view.NodeChargeView;
import d1.InterfaceC0081a;
import g.AbstractActivityC0132i;
import j0.AbstractC0142a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class GameplayActivity extends AbstractActivityC0132i implements a {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f1965G = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f1966A = 1;

    /* renamed from: B, reason: collision with root package name */
    public int f1967B = 3;

    /* renamed from: C, reason: collision with root package name */
    public int f1968C;

    /* renamed from: D, reason: collision with root package name */
    public int f1969D;

    /* renamed from: E, reason: collision with root package name */
    public CountDownTimer f1970E;
    public boolean F;

    /* renamed from: y, reason: collision with root package name */
    public final d f1971y;

    /* renamed from: z, reason: collision with root package name */
    public final d f1972z;

    public GameplayActivity() {
        final int i = 0;
        this.f1971y = new d(new InterfaceC0081a(this) { // from class: O0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GameplayActivity f671b;

            {
                this.f671b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                GameplayActivity gameplayActivity = this.f671b;
                switch (i) {
                    case 0:
                        int i2 = GameplayActivity.f1965G;
                        View inflate = gameplayActivity.getLayoutInflater().inflate(R.layout.activity_gameplay, (ViewGroup) null, false);
                        int i3 = R.id.btnBackGame;
                        Button button = (Button) AbstractC0142a.f(inflate, R.id.btnBackGame);
                        if (button != null) {
                            i3 = R.id.btnReset;
                            Button button2 = (Button) AbstractC0142a.f(inflate, R.id.btnReset);
                            if (button2 != null) {
                                i3 = R.id.circuitView;
                                NodeChargeView nodeChargeView = (NodeChargeView) AbstractC0142a.f(inflate, R.id.circuitView);
                                if (nodeChargeView != null) {
                                    i3 = R.id.hudBar;
                                    if (((LinearLayout) AbstractC0142a.f(inflate, R.id.hudBar)) != null) {
                                        i3 = R.id.hudCrystals;
                                        TextView textView = (TextView) AbstractC0142a.f(inflate, R.id.hudCrystals);
                                        if (textView != null) {
                                            i3 = R.id.hudLevel;
                                            TextView textView2 = (TextView) AbstractC0142a.f(inflate, R.id.hudLevel);
                                            if (textView2 != null) {
                                                i3 = R.id.hudLives;
                                                TextView textView3 = (TextView) AbstractC0142a.f(inflate, R.id.hudLives);
                                                if (textView3 != null) {
                                                    i3 = R.id.hudScore;
                                                    TextView textView4 = (TextView) AbstractC0142a.f(inflate, R.id.hudScore);
                                                    if (textView4 != null) {
                                                        i3 = R.id.hudTime;
                                                        TextView textView5 = (TextView) AbstractC0142a.f(inflate, R.id.hudTime);
                                                        if (textView5 != null) {
                                                            return new R0.a((LinearLayout) inflate, button, button2, nodeChargeView, textView, textView2, textView3, textView4, textView5);
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
                        int i4 = GameplayActivity.f1965G;
                        return new Q0.a(gameplayActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1972z = new d(new InterfaceC0081a(this) { // from class: O0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GameplayActivity f671b;

            {
                this.f671b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                GameplayActivity gameplayActivity = this.f671b;
                switch (i2) {
                    case 0:
                        int i22 = GameplayActivity.f1965G;
                        View inflate = gameplayActivity.getLayoutInflater().inflate(R.layout.activity_gameplay, (ViewGroup) null, false);
                        int i3 = R.id.btnBackGame;
                        Button button = (Button) AbstractC0142a.f(inflate, R.id.btnBackGame);
                        if (button != null) {
                            i3 = R.id.btnReset;
                            Button button2 = (Button) AbstractC0142a.f(inflate, R.id.btnReset);
                            if (button2 != null) {
                                i3 = R.id.circuitView;
                                NodeChargeView nodeChargeView = (NodeChargeView) AbstractC0142a.f(inflate, R.id.circuitView);
                                if (nodeChargeView != null) {
                                    i3 = R.id.hudBar;
                                    if (((LinearLayout) AbstractC0142a.f(inflate, R.id.hudBar)) != null) {
                                        i3 = R.id.hudCrystals;
                                        TextView textView = (TextView) AbstractC0142a.f(inflate, R.id.hudCrystals);
                                        if (textView != null) {
                                            i3 = R.id.hudLevel;
                                            TextView textView2 = (TextView) AbstractC0142a.f(inflate, R.id.hudLevel);
                                            if (textView2 != null) {
                                                i3 = R.id.hudLives;
                                                TextView textView3 = (TextView) AbstractC0142a.f(inflate, R.id.hudLives);
                                                if (textView3 != null) {
                                                    i3 = R.id.hudScore;
                                                    TextView textView4 = (TextView) AbstractC0142a.f(inflate, R.id.hudScore);
                                                    if (textView4 != null) {
                                                        i3 = R.id.hudTime;
                                                        TextView textView5 = (TextView) AbstractC0142a.f(inflate, R.id.hudTime);
                                                        if (textView5 != null) {
                                                            return new R0.a((LinearLayout) inflate, button, button2, nodeChargeView, textView, textView2, textView3, textView4, textView5);
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
                        int i4 = GameplayActivity.f1965G;
                        return new Q0.a(gameplayActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0132i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f730a);
        this.f1966A = getIntent().getIntExtra("level", 1);
        this.f1967B = getIntent().getIntExtra("lives", 3);
        this.f1968C = getIntent().getIntExtra("score", 0);
        d dVar = P0.a.f698a;
        final b b2 = P0.a.b(this.f1966A);
        t().d.setListener(this);
        NodeChargeView nodeChargeView = t().d;
        nodeChargeView.f1992b = b2;
        List<T0.a> list = b2.d;
        ArrayList arrayList = new ArrayList(j.m0(list));
        for (T0.a aVar : list) {
            arrayList.add(T0.a.b(aVar, aVar.f845e));
        }
        nodeChargeView.f1993c = h.q0(arrayList);
        nodeChargeView.d = b2.f849e;
        nodeChargeView.f1996g = 0;
        nodeChargeView.f1997j = false;
        nodeChargeView.b();
        nodeChargeView.requestLayout();
        nodeChargeView.invalidate();
        if (b2.f850f) {
            this.f1969D = b2.f851g;
            t().i.setVisibility(0);
            v();
        } else {
            t().i.setVisibility(8);
        }
        w();
        t().f732c.setOnClickListener(new View.OnClickListener() { // from class: O0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = GameplayActivity.f1965G;
                GameplayActivity gameplayActivity = GameplayActivity.this;
                gameplayActivity.t().d.c();
                T0.b bVar = b2;
                if (bVar.f850f) {
                    CountDownTimer countDownTimer = gameplayActivity.f1970E;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    gameplayActivity.f1969D = bVar.f851g;
                    gameplayActivity.v();
                }
                gameplayActivity.w();
            }
        });
        t().f731b.setOnClickListener(new ViewOnClickListenerC0025a(3, this));
    }

    @Override // g.AbstractActivityC0132i, android.app.Activity
    public final void onDestroy() {
        CountDownTimer countDownTimer = this.f1970E;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    @Override // g.AbstractActivityC0132i, android.app.Activity
    public final void onPause() {
        super.onPause();
        NodeChargeView nodeChargeView = t().d;
        nodeChargeView.i = false;
        Choreographer.getInstance().removeFrameCallback(nodeChargeView);
        CountDownTimer countDownTimer = this.f1970E;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // g.AbstractActivityC0132i, android.app.Activity
    public final void onResume() {
        super.onResume();
        NodeChargeView nodeChargeView = t().d;
        if (!nodeChargeView.i) {
            nodeChargeView.i = true;
            Choreographer.getInstance().postFrameCallback(nodeChargeView);
        }
        d dVar = P0.a.f698a;
        if (!P0.a.b(this.f1966A).f850f || this.F || this.f1969D <= 0) {
            return;
        }
        v();
    }

    public final R0.a t() {
        return (R0.a) this.f1971y.a();
    }

    public final void u(boolean z2) {
        Intent intent = new Intent(this, (Class<?>) ResultActivity.class);
        intent.putExtra("won", z2);
        intent.putExtra("score", this.f1968C);
        intent.putExtra("level", this.f1966A);
        intent.putExtra("lives", this.f1967B);
        startActivity(intent);
        finish();
    }

    public final void v() {
        t().i.setText(getString(R.string.time_label, Integer.valueOf(this.f1969D)));
        CountDownTimer countDownTimer = this.f1970E;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f1970E = new c(this, this.f1969D * 1000).start();
    }

    public final void w() {
        t().h.setText(getString(R.string.score_label, Integer.valueOf(this.f1968C)));
        t().f733e.setText(getString(R.string.crystals_label, Integer.valueOf(((Q0.a) this.f1972z.a()).f727a.getInt("crystals", 0))));
        t().f735g.setText(getString(R.string.lives_label, Integer.valueOf(this.f1967B)));
        t().f734f.setText(getString(R.string.level_label, Integer.valueOf(this.f1966A)));
    }
}
