package com.winworm.neongrid.ui;

import R0.a;
import S0.b;
import S0.c;
import S0.d;
import S0.f;
import S0.g;
import U0.e;
import V0.h;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.winworm.neongrid.R;
import com.winworm.neongrid.game.SnakeGameView;
import com.winworm.neongrid.ui.GameActivity;
import f1.InterfaceC0090a;
import g.AbstractActivityC0108i;
import java.util.List;

/* loaded from: classes.dex */
public final class GameActivity extends AbstractActivityC0108i implements g {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f2043G = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f2044A = 1;

    /* renamed from: B, reason: collision with root package name */
    public int f2045B = 5;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2046C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2047D;

    /* renamed from: E, reason: collision with root package name */
    public int f2048E;
    public int F;

    /* renamed from: y, reason: collision with root package name */
    public final e f2049y;

    /* renamed from: z, reason: collision with root package name */
    public final e f2050z;

    public GameActivity() {
        final int i = 0;
        this.f2049y = new e(new InterfaceC0090a(this) { // from class: T0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GameActivity f826b;

            {
                this.f826b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                GameActivity gameActivity = this.f826b;
                switch (i) {
                    case 0:
                        int i2 = GameActivity.f2043G;
                        View inflate = gameActivity.getLayoutInflater().inflate(R.layout.activity_game, (ViewGroup) null, false);
                        int i3 = R.id.foodText;
                        TextView textView = (TextView) i0.g.h(inflate, R.id.foodText);
                        if (textView != null) {
                            i3 = R.id.hudBar;
                            if (((LinearLayout) i0.g.h(inflate, R.id.hudBar)) != null) {
                                i3 = R.id.levelText;
                                TextView textView2 = (TextView) i0.g.h(inflate, R.id.levelText);
                                if (textView2 != null) {
                                    i3 = R.id.livesText;
                                    TextView textView3 = (TextView) i0.g.h(inflate, R.id.livesText);
                                    if (textView3 != null) {
                                        i3 = R.id.pauseButton;
                                        MaterialButton materialButton = (MaterialButton) i0.g.h(inflate, R.id.pauseButton);
                                        if (materialButton != null) {
                                            i3 = R.id.pauseOverlay;
                                            LinearLayout linearLayout = (LinearLayout) i0.g.h(inflate, R.id.pauseOverlay);
                                            if (linearLayout != null) {
                                                i3 = R.id.quitButton;
                                                MaterialButton materialButton2 = (MaterialButton) i0.g.h(inflate, R.id.quitButton);
                                                if (materialButton2 != null) {
                                                    i3 = R.id.resumeButton;
                                                    MaterialButton materialButton3 = (MaterialButton) i0.g.h(inflate, R.id.resumeButton);
                                                    if (materialButton3 != null) {
                                                        i3 = R.id.scoreText;
                                                        TextView textView4 = (TextView) i0.g.h(inflate, R.id.scoreText);
                                                        if (textView4 != null) {
                                                            i3 = R.id.snakeGameView;
                                                            SnakeGameView snakeGameView = (SnakeGameView) i0.g.h(inflate, R.id.snakeGameView);
                                                            if (snakeGameView != null) {
                                                                return new R0.a((ConstraintLayout) inflate, textView, textView2, textView3, materialButton, linearLayout, materialButton2, materialButton3, textView4, snakeGameView);
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
                        int i4 = GameActivity.f2043G;
                        return new Q0.a(gameActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2050z = new e(new InterfaceC0090a(this) { // from class: T0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GameActivity f826b;

            {
                this.f826b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                GameActivity gameActivity = this.f826b;
                switch (i2) {
                    case 0:
                        int i22 = GameActivity.f2043G;
                        View inflate = gameActivity.getLayoutInflater().inflate(R.layout.activity_game, (ViewGroup) null, false);
                        int i3 = R.id.foodText;
                        TextView textView = (TextView) i0.g.h(inflate, R.id.foodText);
                        if (textView != null) {
                            i3 = R.id.hudBar;
                            if (((LinearLayout) i0.g.h(inflate, R.id.hudBar)) != null) {
                                i3 = R.id.levelText;
                                TextView textView2 = (TextView) i0.g.h(inflate, R.id.levelText);
                                if (textView2 != null) {
                                    i3 = R.id.livesText;
                                    TextView textView3 = (TextView) i0.g.h(inflate, R.id.livesText);
                                    if (textView3 != null) {
                                        i3 = R.id.pauseButton;
                                        MaterialButton materialButton = (MaterialButton) i0.g.h(inflate, R.id.pauseButton);
                                        if (materialButton != null) {
                                            i3 = R.id.pauseOverlay;
                                            LinearLayout linearLayout = (LinearLayout) i0.g.h(inflate, R.id.pauseOverlay);
                                            if (linearLayout != null) {
                                                i3 = R.id.quitButton;
                                                MaterialButton materialButton2 = (MaterialButton) i0.g.h(inflate, R.id.quitButton);
                                                if (materialButton2 != null) {
                                                    i3 = R.id.resumeButton;
                                                    MaterialButton materialButton3 = (MaterialButton) i0.g.h(inflate, R.id.resumeButton);
                                                    if (materialButton3 != null) {
                                                        i3 = R.id.scoreText;
                                                        TextView textView4 = (TextView) i0.g.h(inflate, R.id.scoreText);
                                                        if (textView4 != null) {
                                                            i3 = R.id.snakeGameView;
                                                            SnakeGameView snakeGameView = (SnakeGameView) i0.g.h(inflate, R.id.snakeGameView);
                                                            if (snakeGameView != null) {
                                                                return new R0.a((ConstraintLayout) inflate, textView, textView2, textView3, materialButton, linearLayout, materialButton2, materialButton3, textView4, snakeGameView);
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
                        int i4 = GameActivity.f2043G;
                        return new Q0.a(gameActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0108i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f fVar;
        super.onCreate(bundle);
        setContentView(t().f736a);
        int e2 = i0.g.e(getIntent().getIntExtra("extra_level", 1), 1, 12);
        this.f2044A = e2;
        List list = b.f767a;
        d dVar = (d) list.get(i0.g.e(e2 - 1, 0, h.v0(list)));
        this.f2045B = dVar.f774c;
        t().f738c.setText(getString(R.string.level_label, Integer.valueOf(this.f2044A)));
        int i = dVar.d;
        v(0, 0, i);
        t().f742j.setGameListener(this);
        SnakeGameView snakeGameView = t().f742j;
        f fVar2 = new f(dVar);
        snakeGameView.i = fVar2;
        snakeGameView.f2037k = dVar.f773b;
        if (snakeGameView.getWidth() > 0 && snakeGameView.getHeight() > 0 && (fVar = snakeGameView.i) != null) {
            fVar.a(snakeGameView.a(), snakeGameView.b());
        }
        fVar2.a(snakeGameView.a(), snakeGameView.b());
        fVar2.h = 0;
        fVar2.i = 0;
        fVar2.f783j = i;
        fVar2.c();
        fVar2.e();
        fVar2.f784k = c.f768a;
        snakeGameView.f2041o = true;
        snakeGameView.d();
        snakeGameView.invalidate();
        snakeGameView.f();
        final int i2 = 0;
        t().f739e.setOnClickListener(new View.OnClickListener(this) { // from class: T0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GameActivity f828b;

            {
                this.f828b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameActivity gameActivity = this.f828b;
                switch (i2) {
                    case 0:
                        int i3 = GameActivity.f2043G;
                        gameActivity.u();
                        break;
                    case 1:
                        int i4 = GameActivity.f2043G;
                        gameActivity.u();
                        break;
                    default:
                        gameActivity.f2047D = true;
                        SnakeGameView snakeGameView2 = gameActivity.t().f742j;
                        snakeGameView2.f2041o = false;
                        snakeGameView2.f2030a.removeCallbacks(snakeGameView2.f2031b);
                        gameActivity.finish();
                        break;
                }
            }
        });
        final int i3 = 1;
        t().h.setOnClickListener(new View.OnClickListener(this) { // from class: T0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GameActivity f828b;

            {
                this.f828b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameActivity gameActivity = this.f828b;
                switch (i3) {
                    case 0:
                        int i32 = GameActivity.f2043G;
                        gameActivity.u();
                        break;
                    case 1:
                        int i4 = GameActivity.f2043G;
                        gameActivity.u();
                        break;
                    default:
                        gameActivity.f2047D = true;
                        SnakeGameView snakeGameView2 = gameActivity.t().f742j;
                        snakeGameView2.f2041o = false;
                        snakeGameView2.f2030a.removeCallbacks(snakeGameView2.f2031b);
                        gameActivity.finish();
                        break;
                }
            }
        });
        final int i4 = 2;
        t().f741g.setOnClickListener(new View.OnClickListener(this) { // from class: T0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GameActivity f828b;

            {
                this.f828b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameActivity gameActivity = this.f828b;
                switch (i4) {
                    case 0:
                        int i32 = GameActivity.f2043G;
                        gameActivity.u();
                        break;
                    case 1:
                        int i42 = GameActivity.f2043G;
                        gameActivity.u();
                        break;
                    default:
                        gameActivity.f2047D = true;
                        SnakeGameView snakeGameView2 = gameActivity.t().f742j;
                        snakeGameView2.f2041o = false;
                        snakeGameView2.f2030a.removeCallbacks(snakeGameView2.f2031b);
                        gameActivity.finish();
                        break;
                }
            }
        });
    }

    @Override // g.AbstractActivityC0108i, android.app.Activity
    public final void onDestroy() {
        SnakeGameView snakeGameView = t().f742j;
        snakeGameView.f2041o = false;
        snakeGameView.f2030a.removeCallbacks(snakeGameView.f2031b);
        super.onDestroy();
    }

    @Override // g.AbstractActivityC0108i, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f2047D || this.f2046C) {
            return;
        }
        t().f742j.e();
        this.f2046C = true;
        t().f740f.setVisibility(0);
        t().f739e.setText(getString(R.string.resume));
    }

    public final a t() {
        return (a) this.f2049y.a();
    }

    public final void u() {
        if (!this.f2046C) {
            t().f742j.e();
            t().f740f.setVisibility(0);
            t().f739e.setText(getString(R.string.resume));
            this.f2046C = true;
            return;
        }
        SnakeGameView snakeGameView = t().f742j;
        f fVar = snakeGameView.i;
        c cVar = fVar != null ? fVar.f784k : null;
        c cVar2 = c.f769b;
        if (cVar == cVar2) {
            if (fVar != null && fVar.f784k == cVar2) {
                fVar.f784k = c.f768a;
            }
            snakeGameView.f2041o = true;
            snakeGameView.f();
        }
        t().f740f.setVisibility(8);
        t().f739e.setText(getString(R.string.pause));
        this.f2046C = false;
    }

    public final void v(int i, int i2, int i3) {
        t().i.setText(getString(R.string.score_label, Integer.valueOf(i)));
        t().f737b.setText(getString(R.string.food_progress, Integer.valueOf(i2), Integer.valueOf(this.f2045B)));
        t().d.setText(getString(R.string.lives_label, Integer.valueOf(i3)));
    }
}
