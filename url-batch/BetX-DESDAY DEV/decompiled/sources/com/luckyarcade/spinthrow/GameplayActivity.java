package com.luckyarcade.spinthrow;

import K.C0;
import K.E0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.TextView;
import com.luckyarcade.spinthrow.KnifeThrowView;
import com.luckyarcade.spinthrow.databinding.ActivityGameplayBinding;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final class GameplayActivity extends AbstractActivityC0159k implements KnifeThrowView.Listener {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_DIFFICULTY = "difficulty";
    private final N0.b binding$delegate = new N0.e(new b(this, 0));
    private Difficulty difficulty;
    private LevelConfig levelConfig;

    public static final class Companion {
        public /* synthetic */ Companion(X0.c cVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityGameplayBinding binding_delegate$lambda$0(GameplayActivity gameplayActivity) {
        return ActivityGameplayBinding.inflate(gameplayActivity.getLayoutInflater());
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

    private final ActivityGameplayBinding getBinding() {
        return (ActivityGameplayBinding) ((N0.e) this.binding$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(GameplayActivity gameplayActivity, View view) {
        Intent intent = new Intent(gameplayActivity, (Class<?>) HomeActivity.class);
        intent.addFlags(603979776);
        gameplayActivity.startActivity(intent);
        gameplayActivity.finish();
    }

    private final void openResult(boolean z2, int i) {
        Intent intent = new Intent(this, (Class<?>) ResultActivity.class);
        intent.putExtra(ResultActivity.EXTRA_WON, z2);
        intent.putExtra(ResultActivity.EXTRA_SCORE, i);
        Difficulty difficulty = this.difficulty;
        if (difficulty == null) {
            X0.f.h("difficulty");
            throw null;
        }
        intent.putExtra("difficulty", difficulty.name());
        startActivity(intent);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        enableFullscreen();
        setContentView(getBinding().getRoot());
        String stringExtra = getIntent().getStringExtra("difficulty");
        if (stringExtra == null) {
            stringExtra = "EASY";
        }
        Difficulty valueOf = Difficulty.valueOf(stringExtra);
        this.difficulty = valueOf;
        GameConfig gameConfig = GameConfig.INSTANCE;
        if (valueOf == null) {
            X0.f.h("difficulty");
            throw null;
        }
        this.levelConfig = gameConfig.forDifficulty(valueOf);
        TextView textView = getBinding().levelText;
        int i = R.string.level_label;
        LevelConfig levelConfig = this.levelConfig;
        if (levelConfig == null) {
            X0.f.h("levelConfig");
            throw null;
        }
        textView.setText(getString(i, levelConfig.getDisplayName()));
        getBinding().scoreText.setText(getString(R.string.score_label, 0));
        TextView textView2 = getBinding().livesText;
        int i2 = R.string.lives_label;
        LevelConfig levelConfig2 = this.levelConfig;
        if (levelConfig2 == null) {
            X0.f.h("levelConfig");
            throw null;
        }
        textView2.setText(getString(i2, Integer.valueOf(levelConfig2.getLives())));
        TextView textView3 = getBinding().knivesText;
        int i3 = R.string.knives_label;
        LevelConfig levelConfig3 = this.levelConfig;
        if (levelConfig3 == null) {
            X0.f.h("levelConfig");
            throw null;
        }
        textView3.setText(getString(i3, Integer.valueOf(levelConfig3.getKnivesRequired())));
        getBinding().gameView.setListener(this);
        getBinding().quitButton.setOnClickListener(new a(this, 0));
        KnifeThrowView knifeThrowView = getBinding().gameView;
        LevelConfig levelConfig4 = this.levelConfig;
        if (levelConfig4 != null) {
            knifeThrowView.startLevel(levelConfig4);
        } else {
            X0.f.h("levelConfig");
            throw null;
        }
    }

    @Override // com.luckyarcade.spinthrow.KnifeThrowView.Listener
    public void onDefeat(int i) {
        openResult(false, i);
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onPause() {
        super.onPause();
        getBinding().gameView.pauseGame();
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onResume() {
        super.onResume();
        getBinding().gameView.resumeGame();
    }

    @Override // com.luckyarcade.spinthrow.KnifeThrowView.Listener
    public void onScoreChanged(int i, int i2, int i3) {
        getBinding().scoreText.setText(getString(R.string.score_label, Integer.valueOf(i)));
        getBinding().livesText.setText(getString(R.string.lives_label, Integer.valueOf(i2)));
        getBinding().knivesText.setText(getString(R.string.knives_label, Integer.valueOf(i3)));
    }

    @Override // com.luckyarcade.spinthrow.KnifeThrowView.Listener
    public void onVictory(int i) {
        openResult(true, i);
    }
}
