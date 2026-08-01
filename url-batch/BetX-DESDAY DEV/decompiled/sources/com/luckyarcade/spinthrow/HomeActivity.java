package com.luckyarcade.spinthrow;

import K.C0;
import K.E0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.luckyarcade.spinthrow.databinding.ActivityHomeBinding;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0159k {
    private final N0.b binding$delegate;
    private final N0.b progress$delegate;

    public HomeActivity() {
        final int i = 0;
        this.binding$delegate = new N0.e(new W0.a(this) { // from class: com.luckyarcade.spinthrow.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f2071b;

            {
                this.f2071b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityHomeBinding binding_delegate$lambda$0;
                GameProgress progress_delegate$lambda$1;
                switch (i) {
                    case 0:
                        binding_delegate$lambda$0 = HomeActivity.binding_delegate$lambda$0(this.f2071b);
                        return binding_delegate$lambda$0;
                    default:
                        progress_delegate$lambda$1 = HomeActivity.progress_delegate$lambda$1(this.f2071b);
                        return progress_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.progress$delegate = new N0.e(new W0.a(this) { // from class: com.luckyarcade.spinthrow.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f2071b;

            {
                this.f2071b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityHomeBinding binding_delegate$lambda$0;
                GameProgress progress_delegate$lambda$1;
                switch (i2) {
                    case 0:
                        binding_delegate$lambda$0 = HomeActivity.binding_delegate$lambda$0(this.f2071b);
                        return binding_delegate$lambda$0;
                    default:
                        progress_delegate$lambda$1 = HomeActivity.progress_delegate$lambda$1(this.f2071b);
                        return progress_delegate$lambda$1;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityHomeBinding binding_delegate$lambda$0(HomeActivity homeActivity) {
        return ActivityHomeBinding.inflate(homeActivity.getLayoutInflater());
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

    private final ActivityHomeBinding getBinding() {
        return (ActivityHomeBinding) ((N0.e) this.binding$delegate).a();
    }

    private final GameProgress getProgress() {
        return (GameProgress) ((N0.e) this.progress$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(HomeActivity homeActivity, View view) {
        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(HomeActivity homeActivity, View view) {
        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameProgress progress_delegate$lambda$1(HomeActivity homeActivity) {
        return new GameProgress(homeActivity);
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        enableFullscreen();
        setContentView(getBinding().getRoot());
        final int i = 0;
        getBinding().playButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.luckyarcade.spinthrow.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f2073b;

            {
                this.f2073b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        HomeActivity.onCreate$lambda$2(this.f2073b, view);
                        break;
                    default:
                        HomeActivity.onCreate$lambda$3(this.f2073b, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().rulesButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.luckyarcade.spinthrow.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f2073b;

            {
                this.f2073b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        HomeActivity.onCreate$lambda$2(this.f2073b, view);
                        break;
                    default:
                        HomeActivity.onCreate$lambda$3(this.f2073b, view);
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onResume() {
        super.onResume();
        getBinding().bestScoreText.setText(getString(R.string.best_score, Integer.valueOf(getProgress().getBestScore())));
        getBinding().crystalsText.setText(getString(R.string.crystals, Integer.valueOf(getProgress().getCrystals())));
    }
}
