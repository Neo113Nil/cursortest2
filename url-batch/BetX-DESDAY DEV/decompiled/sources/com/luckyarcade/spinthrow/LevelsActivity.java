package com.luckyarcade.spinthrow;

import K.C0;
import K.E0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.material.button.MaterialButton;
import com.luckyarcade.spinthrow.databinding.ActivityLevelsBinding;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final class LevelsActivity extends AbstractActivityC0159k {
    private final N0.b binding$delegate;
    private final N0.b progress$delegate;

    public LevelsActivity() {
        final int i = 0;
        this.binding$delegate = new N0.e(new W0.a(this) { // from class: com.luckyarcade.spinthrow.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f2079b;

            {
                this.f2079b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityLevelsBinding binding_delegate$lambda$0;
                GameProgress progress_delegate$lambda$1;
                switch (i) {
                    case 0:
                        binding_delegate$lambda$0 = LevelsActivity.binding_delegate$lambda$0(this.f2079b);
                        return binding_delegate$lambda$0;
                    default:
                        progress_delegate$lambda$1 = LevelsActivity.progress_delegate$lambda$1(this.f2079b);
                        return progress_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.progress$delegate = new N0.e(new W0.a(this) { // from class: com.luckyarcade.spinthrow.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f2079b;

            {
                this.f2079b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityLevelsBinding binding_delegate$lambda$0;
                GameProgress progress_delegate$lambda$1;
                switch (i2) {
                    case 0:
                        binding_delegate$lambda$0 = LevelsActivity.binding_delegate$lambda$0(this.f2079b);
                        return binding_delegate$lambda$0;
                    default:
                        progress_delegate$lambda$1 = LevelsActivity.progress_delegate$lambda$1(this.f2079b);
                        return progress_delegate$lambda$1;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityLevelsBinding binding_delegate$lambda$0(LevelsActivity levelsActivity) {
        return ActivityLevelsBinding.inflate(levelsActivity.getLayoutInflater());
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

    private final ActivityLevelsBinding getBinding() {
        return (ActivityLevelsBinding) ((N0.e) this.binding$delegate).a();
    }

    private final GameProgress getProgress() {
        return (GameProgress) ((N0.e) this.progress$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(LevelsActivity levelsActivity, View view) {
        levelsActivity.startGame(Difficulty.EASY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(LevelsActivity levelsActivity, View view) {
        GameProgress progress = levelsActivity.getProgress();
        Difficulty difficulty = Difficulty.MEDIUM;
        if (progress.isDifficultyUnlocked(difficulty)) {
            levelsActivity.startGame(difficulty);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(LevelsActivity levelsActivity, View view) {
        GameProgress progress = levelsActivity.getProgress();
        Difficulty difficulty = Difficulty.HARD;
        if (progress.isDifficultyUnlocked(difficulty)) {
            levelsActivity.startGame(difficulty);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameProgress progress_delegate$lambda$1(LevelsActivity levelsActivity) {
        return new GameProgress(levelsActivity);
    }

    private final void refreshButtons() {
        String str;
        String str2;
        boolean isDifficultyUnlocked = getProgress().isDifficultyUnlocked(Difficulty.MEDIUM);
        boolean isDifficultyUnlocked2 = getProgress().isDifficultyUnlocked(Difficulty.HARD);
        MaterialButton materialButton = getBinding().mediumButton;
        if (isDifficultyUnlocked) {
            str = getString(R.string.medium);
        } else {
            str = getString(R.string.medium) + " (" + getString(R.string.locked) + ")";
        }
        materialButton.setText(str);
        MaterialButton materialButton2 = getBinding().hardButton;
        if (isDifficultyUnlocked2) {
            str2 = getString(R.string.hard);
        } else {
            str2 = getString(R.string.hard) + " (" + getString(R.string.locked) + ")";
        }
        materialButton2.setText(str2);
        getBinding().mediumButton.setEnabled(isDifficultyUnlocked);
        getBinding().hardButton.setEnabled(isDifficultyUnlocked2);
        getBinding().mediumButton.setAlpha(isDifficultyUnlocked ? 1.0f : 0.45f);
        getBinding().hardButton.setAlpha(isDifficultyUnlocked2 ? 1.0f : 0.45f);
    }

    private final void startGame(Difficulty difficulty) {
        Intent intent = new Intent(this, (Class<?>) GameplayActivity.class);
        intent.putExtra("difficulty", difficulty.name());
        startActivity(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        enableFullscreen();
        setContentView(getBinding().getRoot());
        final int i = 0;
        getBinding().easyButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.luckyarcade.spinthrow.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f2077b;

            {
                this.f2077b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        LevelsActivity.onCreate$lambda$2(this.f2077b, view);
                        break;
                    case 1:
                        LevelsActivity.onCreate$lambda$3(this.f2077b, view);
                        break;
                    case 2:
                        LevelsActivity.onCreate$lambda$4(this.f2077b, view);
                        break;
                    default:
                        this.f2077b.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().mediumButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.luckyarcade.spinthrow.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f2077b;

            {
                this.f2077b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        LevelsActivity.onCreate$lambda$2(this.f2077b, view);
                        break;
                    case 1:
                        LevelsActivity.onCreate$lambda$3(this.f2077b, view);
                        break;
                    case 2:
                        LevelsActivity.onCreate$lambda$4(this.f2077b, view);
                        break;
                    default:
                        this.f2077b.finish();
                        break;
                }
            }
        });
        final int i3 = 2;
        getBinding().hardButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.luckyarcade.spinthrow.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f2077b;

            {
                this.f2077b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        LevelsActivity.onCreate$lambda$2(this.f2077b, view);
                        break;
                    case 1:
                        LevelsActivity.onCreate$lambda$3(this.f2077b, view);
                        break;
                    case 2:
                        LevelsActivity.onCreate$lambda$4(this.f2077b, view);
                        break;
                    default:
                        this.f2077b.finish();
                        break;
                }
            }
        });
        final int i4 = 3;
        getBinding().backButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.luckyarcade.spinthrow.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f2077b;

            {
                this.f2077b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        LevelsActivity.onCreate$lambda$2(this.f2077b, view);
                        break;
                    case 1:
                        LevelsActivity.onCreate$lambda$3(this.f2077b, view);
                        break;
                    case 2:
                        LevelsActivity.onCreate$lambda$4(this.f2077b, view);
                        break;
                    default:
                        this.f2077b.finish();
                        break;
                }
            }
        });
        refreshButtons();
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onResume() {
        super.onResume();
        refreshButtons();
    }
}
