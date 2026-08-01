package com.clutchquizarena.app;

import U0.g;
import X.A;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.db.AppDatabase;
import com.clutchquizarena.app.db.GameSessionEntity;
import f1.a;
import g.AbstractActivityC0136i;
import g1.f;
import java.util.Iterator;
import java.util.List;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import r0.C0323d;
import r0.C0325f;
import r0.C0327h;
import r0.C0329j;
import s0.C0342a;
import s0.b;
import t0.C0359a;

/* loaded from: classes.dex */
public final class GameActivity extends AbstractActivityC0136i {
    public static final /* synthetic */ int F = 0;

    /* renamed from: A, reason: collision with root package name */
    public GameSessionEntity f1711A;

    /* renamed from: B, reason: collision with root package name */
    public CountDownTimer f1712B;

    /* renamed from: C, reason: collision with root package name */
    public long f1713C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1714D;

    /* renamed from: E, reason: collision with root package name */
    public final g f1715E = new g(new a() { // from class: r0.a
        @Override // f1.a
        public final Object c() {
            C0359a c0359a = GameActivity.this.f1716y;
            if (c0359a == null) {
                g1.f.g("binding");
                throw null;
            }
            return V0.f.S(c0359a.f3718a, c0359a.f3719b, c0359a.f3720c, c0359a.d);
        }
    });

    /* renamed from: y, reason: collision with root package name */
    public C0359a f1716y;

    /* renamed from: z, reason: collision with root package name */
    public AppDatabase f1717z;

    public static final void t(final GameActivity gameActivity) {
        GameSessionEntity gameSessionEntity = gameActivity.f1711A;
        if (gameSessionEntity == null) {
            return;
        }
        int currentQuestionIndex = gameSessionEntity.getCurrentQuestionIndex();
        List list = b.f3638a;
        if (currentQuestionIndex >= list.size()) {
            gameActivity.u(gameSessionEntity.getLives() > 0);
            return;
        }
        C0342a c0342a = (C0342a) list.get(currentQuestionIndex);
        C0359a c0359a = gameActivity.f1716y;
        if (c0359a == null) {
            f.g("binding");
            throw null;
        }
        c0359a.f3721e.setText(gameActivity.getString(R.string.level_label, Integer.valueOf(gameSessionEntity.getLevel())));
        C0359a c0359a2 = gameActivity.f1716y;
        if (c0359a2 == null) {
            f.g("binding");
            throw null;
        }
        c0359a2.f3722f.setText(gameActivity.getString(R.string.lives_label, Integer.valueOf(gameSessionEntity.getLives())));
        C0359a c0359a3 = gameActivity.f1716y;
        if (c0359a3 == null) {
            f.g("binding");
            throw null;
        }
        c0359a3.i.setText(gameActivity.getString(R.string.score_label, Integer.valueOf(gameSessionEntity.getScore())));
        C0359a c0359a4 = gameActivity.f1716y;
        if (c0359a4 == null) {
            f.g("binding");
            throw null;
        }
        c0359a4.f3723g.setText(gameActivity.getString(R.string.question_progress, Integer.valueOf(currentQuestionIndex + 1), 10));
        C0359a c0359a5 = gameActivity.f1716y;
        if (c0359a5 == null) {
            f.g("binding");
            throw null;
        }
        c0359a5.h.setText(c0342a.f3635a);
        final int i = 0;
        for (Object obj : (List) gameActivity.f1715E.a()) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            AppCompatButton appCompatButton = (AppCompatButton) obj;
            appCompatButton.setText((CharSequence) c0342a.f3636b.get(i));
            appCompatButton.setEnabled(true);
            appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: r0.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GameSessionEntity copy;
                    GameActivity gameActivity2 = GameActivity.this;
                    if (gameActivity2.f1714D) {
                        return;
                    }
                    gameActivity2.f1714D = true;
                    CountDownTimer countDownTimer = gameActivity2.f1712B;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    Iterator it = ((List) gameActivity2.f1715E.a()).iterator();
                    while (it.hasNext()) {
                        ((AppCompatButton) it.next()).setEnabled(false);
                    }
                    GameSessionEntity gameSessionEntity2 = gameActivity2.f1711A;
                    if (gameSessionEntity2 != null) {
                        if (i != ((C0342a) s0.b.f3638a.get(gameSessionEntity2.getCurrentQuestionIndex())).f3637c) {
                            gameActivity2.v();
                            return;
                        }
                        GameSessionEntity gameSessionEntity3 = gameActivity2.f1711A;
                        if (gameSessionEntity3 == null) {
                            return;
                        }
                        copy = gameSessionEntity3.copy((r28 & 1) != 0 ? gameSessionEntity3.id : 0L, (r28 & 2) != 0 ? gameSessionEntity3.score : gameSessionEntity3.getScore() + 10, (r28 & 4) != 0 ? gameSessionEntity3.lives : 0, (r28 & 8) != 0 ? gameSessionEntity3.currentQuestionIndex : gameSessionEntity3.getCurrentQuestionIndex() + 1, (r28 & 16) != 0 ? gameSessionEntity3.correctAnswers : gameSessionEntity3.getCorrectAnswers() + 1, (r28 & 32) != 0 ? gameSessionEntity3.totalQuestions : 0, (r28 & 64) != 0 ? gameSessionEntity3.elapsedTimeMs : System.currentTimeMillis() - gameActivity2.f1713C, (r28 & 128) != 0 ? gameSessionEntity3.level : 0, (r28 & 256) != 0 ? gameSessionEntity3.isActive : false, (r28 & 512) != 0 ? gameSessionEntity3.isWin : false, (r28 & 1024) != 0 ? gameSessionEntity3.finishedAt : null);
                        AbstractC0299s.h(J.e(gameActivity2), AbstractC0305y.f3370b, new C0329j(null, gameActivity2, copy));
                    }
                }
            });
            i = i2;
        }
        gameActivity.f1714D = false;
    }

    @Override // g.AbstractActivityC0136i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_game, (ViewGroup) null, false);
        int i = R.id.buttonAnswer1;
        AppCompatButton appCompatButton = (AppCompatButton) h0.g.d(inflate, R.id.buttonAnswer1);
        if (appCompatButton != null) {
            i = R.id.buttonAnswer2;
            AppCompatButton appCompatButton2 = (AppCompatButton) h0.g.d(inflate, R.id.buttonAnswer2);
            if (appCompatButton2 != null) {
                i = R.id.buttonAnswer3;
                AppCompatButton appCompatButton3 = (AppCompatButton) h0.g.d(inflate, R.id.buttonAnswer3);
                if (appCompatButton3 != null) {
                    i = R.id.buttonAnswer4;
                    AppCompatButton appCompatButton4 = (AppCompatButton) h0.g.d(inflate, R.id.buttonAnswer4);
                    if (appCompatButton4 != null) {
                        i = R.id.overlay;
                        if (h0.g.d(inflate, R.id.overlay) != null) {
                            i = R.id.statsRow;
                            if (((LinearLayout) h0.g.d(inflate, R.id.statsRow)) != null) {
                                i = R.id.textLevel;
                                TextView textView = (TextView) h0.g.d(inflate, R.id.textLevel);
                                if (textView != null) {
                                    i = R.id.textLives;
                                    TextView textView2 = (TextView) h0.g.d(inflate, R.id.textLives);
                                    if (textView2 != null) {
                                        i = R.id.textProgress;
                                        TextView textView3 = (TextView) h0.g.d(inflate, R.id.textProgress);
                                        if (textView3 != null) {
                                            i = R.id.textQuestion;
                                            TextView textView4 = (TextView) h0.g.d(inflate, R.id.textQuestion);
                                            if (textView4 != null) {
                                                i = R.id.textScore;
                                                TextView textView5 = (TextView) h0.g.d(inflate, R.id.textScore);
                                                if (textView5 != null) {
                                                    i = R.id.textTimer;
                                                    TextView textView6 = (TextView) h0.g.d(inflate, R.id.textTimer);
                                                    if (textView6 != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                        this.f1716y = new C0359a(constraintLayout, appCompatButton, appCompatButton2, appCompatButton3, appCompatButton4, textView, textView2, textView3, textView4, textView5, textView6);
                                                        setContentView(constraintLayout);
                                                        this.f1717z = AppDatabase.Companion.getInstance(this);
                                                        this.f1713C = System.currentTimeMillis();
                                                        i().a(this, new A(this, 1));
                                                        AbstractC0299s.h(J.e(this), AbstractC0305y.f3370b, new C0327h(this, null));
                                                        return;
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // g.AbstractActivityC0136i, android.app.Activity
    public final void onDestroy() {
        CountDownTimer countDownTimer = this.f1712B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    public final void u(boolean z2) {
        CountDownTimer countDownTimer = this.f1712B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        GameSessionEntity gameSessionEntity = this.f1711A;
        if (gameSessionEntity == null) {
            return;
        }
        AbstractC0299s.h(J.e(this), AbstractC0305y.f3370b, new C0323d(this, gameSessionEntity, z2, null));
    }

    public final void v() {
        GameSessionEntity copy;
        GameSessionEntity gameSessionEntity = this.f1711A;
        if (gameSessionEntity == null) {
            return;
        }
        int lives = gameSessionEntity.getLives() - 1;
        copy = gameSessionEntity.copy((r28 & 1) != 0 ? gameSessionEntity.id : 0L, (r28 & 2) != 0 ? gameSessionEntity.score : 0, (r28 & 4) != 0 ? gameSessionEntity.lives : lives, (r28 & 8) != 0 ? gameSessionEntity.currentQuestionIndex : gameSessionEntity.getCurrentQuestionIndex() + 1, (r28 & 16) != 0 ? gameSessionEntity.correctAnswers : 0, (r28 & 32) != 0 ? gameSessionEntity.totalQuestions : 0, (r28 & 64) != 0 ? gameSessionEntity.elapsedTimeMs : System.currentTimeMillis() - this.f1713C, (r28 & 128) != 0 ? gameSessionEntity.level : 0, (r28 & 256) != 0 ? gameSessionEntity.isActive : false, (r28 & 512) != 0 ? gameSessionEntity.isWin : false, (r28 & 1024) != 0 ? gameSessionEntity.finishedAt : null);
        if (lives <= 0) {
            AbstractC0299s.h(J.e(this), AbstractC0305y.f3370b, new C0325f(null, this, copy));
        } else {
            AbstractC0299s.h(J.e(this), AbstractC0305y.f3370b, new C0329j(null, this, copy));
        }
    }
}
