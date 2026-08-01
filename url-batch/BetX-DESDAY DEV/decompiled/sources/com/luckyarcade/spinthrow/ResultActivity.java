package com.luckyarcade.spinthrow;

import K.C0;
import K.E0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.luckyarcade.spinthrow.databinding.ActivityResultBinding;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final class ResultActivity extends AbstractActivityC0159k {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_DIFFICULTY = "difficulty";
    public static final String EXTRA_SCORE = "score";
    public static final String EXTRA_WON = "won";
    private final N0.b binding$delegate;
    private Difficulty difficulty;
    private final N0.b progress$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(X0.c cVar) {
            this();
        }

        private Companion() {
        }
    }

    public ResultActivity() {
        final int i = 0;
        this.binding$delegate = new N0.e(new W0.a(this) { // from class: com.luckyarcade.spinthrow.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResultActivity f2089b;

            {
                this.f2089b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityResultBinding binding_delegate$lambda$0;
                GameProgress progress_delegate$lambda$1;
                switch (i) {
                    case 0:
                        binding_delegate$lambda$0 = ResultActivity.binding_delegate$lambda$0(this.f2089b);
                        return binding_delegate$lambda$0;
                    default:
                        progress_delegate$lambda$1 = ResultActivity.progress_delegate$lambda$1(this.f2089b);
                        return progress_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.progress$delegate = new N0.e(new W0.a(this) { // from class: com.luckyarcade.spinthrow.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResultActivity f2089b;

            {
                this.f2089b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityResultBinding binding_delegate$lambda$0;
                GameProgress progress_delegate$lambda$1;
                switch (i2) {
                    case 0:
                        binding_delegate$lambda$0 = ResultActivity.binding_delegate$lambda$0(this.f2089b);
                        return binding_delegate$lambda$0;
                    default:
                        progress_delegate$lambda$1 = ResultActivity.progress_delegate$lambda$1(this.f2089b);
                        return progress_delegate$lambda$1;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityResultBinding binding_delegate$lambda$0(ResultActivity resultActivity) {
        return ActivityResultBinding.inflate(resultActivity.getLayoutInflater());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void enableFullscreen() {
        C0 c02;
        WindowInsetsController insetsController;
        q1.l.n0(getWindow(), false);
        Window window = getWindow();
        B0.d dVar = new B0.d(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            E0 e02 = new E0(insetsController, dVar);
            e02.h = window;
            c02 = e02;
        } else {
            c02 = new C0(window, dVar);
        }
        c02.J();
        c02.q0();
    }

    private final ActivityResultBinding getBinding() {
        return (ActivityResultBinding) ((N0.e) this.binding$delegate).a();
    }

    private final GameProgress getProgress() {
        return (GameProgress) ((N0.e) this.progress$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(ResultActivity resultActivity, View view) {
        Intent intent = new Intent(resultActivity, (Class<?>) GameplayActivity.class);
        Difficulty difficulty = resultActivity.difficulty;
        if (difficulty == null) {
            X0.f.h("difficulty");
            throw null;
        }
        intent.putExtra("difficulty", difficulty.name());
        resultActivity.startActivity(intent);
        resultActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(ResultActivity resultActivity, View view) {
        Intent intent = new Intent(resultActivity, (Class<?>) HomeActivity.class);
        intent.addFlags(603979776);
        resultActivity.startActivity(intent);
        resultActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameProgress progress_delegate$lambda$1(ResultActivity resultActivity) {
        return new GameProgress(resultActivity);
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        enableFullscreen();
        setContentView(getBinding().getRoot());
        boolean booleanExtra = getIntent().getBooleanExtra(EXTRA_WON, false);
        int intExtra = getIntent().getIntExtra(EXTRA_SCORE, 0);
        String stringExtra = getIntent().getStringExtra("difficulty");
        if (stringExtra == null) {
            stringExtra = "EASY";
        }
        this.difficulty = Difficulty.valueOf(stringExtra);
        getProgress().setBestScore(intExtra);
        if (booleanExtra) {
            getBinding().resultTitle.setText(getString(R.string.result_victory));
            getBinding().resultTitle.setTextColor(getColor(R.color.neon_lime));
            getBinding().resultOutcome.setText(getString(R.string.result_outcome_win));
            GameProgress progress = getProgress();
            Difficulty difficulty = this.difficulty;
            if (difficulty == null) {
                X0.f.h("difficulty");
                throw null;
            }
            progress.unlockNext(difficulty);
            getProgress().addCrystals(5);
        } else {
            getBinding().resultTitle.setText(getString(R.string.result_defeat));
            getBinding().resultTitle.setTextColor(getColor(R.color.neon_magenta));
            getBinding().resultOutcome.setText(getString(R.string.result_outcome_lose));
        }
        getBinding().resultScore.setText(getString(R.string.result_score, Integer.valueOf(intExtra)));
        final int i = 0;
        getBinding().playAgainButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.luckyarcade.spinthrow.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResultActivity f2091b;

            {
                this.f2091b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        ResultActivity.onCreate$lambda$3(this.f2091b, view);
                        break;
                    default:
                        ResultActivity.onCreate$lambda$5(this.f2091b, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().menuButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.luckyarcade.spinthrow.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResultActivity f2091b;

            {
                this.f2091b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ResultActivity.onCreate$lambda$3(this.f2091b, view);
                        break;
                    default:
                        ResultActivity.onCreate$lambda$5(this.f2091b, view);
                        break;
                }
            }
        });
    }
}
