package com.luckyarcade.spinthrow;

import K.C0;
import K.E0;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsetsController;
import com.luckyarcade.spinthrow.databinding.ActivityRulesBinding;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0159k {
    private final N0.b binding$delegate = new N0.e(new b(this, 1));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityRulesBinding binding_delegate$lambda$0(RulesActivity rulesActivity) {
        return ActivityRulesBinding.inflate(rulesActivity.getLayoutInflater());
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

    private final ActivityRulesBinding getBinding() {
        return (ActivityRulesBinding) ((N0.e) this.binding$delegate).a();
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        enableFullscreen();
        setContentView(getBinding().getRoot());
        getBinding().backButton.setOnClickListener(new a(this, 1));
    }
}
