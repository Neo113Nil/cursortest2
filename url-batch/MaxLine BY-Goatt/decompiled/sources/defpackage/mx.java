package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class mx implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ kr0 n;

    public /* synthetic */ mx(kr0 kr0Var, int i) {
        this.m = i;
        this.n = kr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        kr0 kr0Var = this.n;
        switch (i) {
            case 0:
                kr0Var.reportFullyDrawn();
                return Unit.a;
            case 1:
                return xx.c(kr0Var);
            case 2:
                jb0 jb0Var = new jb0();
                kr0Var.getNavigationEventDispatcher().b(jb0Var);
                return jb0Var;
            case 3:
                return new ae2(kr0Var.getApplication(), kr0Var, kr0Var.getIntent() != null ? kr0Var.getIntent().getExtras() : null);
            default:
                ru1 ru1Var = new ru1(new lx(kr0Var, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
                        kr0Var.getLifecycle().a(new nx(0, ru1Var, kr0Var));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new q1(7, kr0Var, ru1Var));
                    }
                }
                return ru1Var;
        }
    }
}
