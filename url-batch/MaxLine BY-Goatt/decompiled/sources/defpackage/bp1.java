package defpackage;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bp1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ cp1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp1(cp1 cp1Var, int i) {
        super(0);
        this.m = i;
        this.n = cp1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        cp1 cp1Var = this.n;
        switch (i) {
            case 0:
                Context context = cp1Var.m;
                Object applicationContext = context != null ? context.getApplicationContext() : null;
                return new ae2(applicationContext instanceof Application ? (Application) applicationContext : null, cp1Var, cp1Var.a());
            default:
                if (!cp1Var.v) {
                    lh.g("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                kd1 kd1Var = cp1Var.t;
                if (kd1Var.c == zc1.m) {
                    lh.g("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                zo1 zo1Var = new zo1();
                zo1Var.a = cp1Var.u.b;
                zo1Var.b = kd1Var;
                js0 js0Var = new js0(cp1Var.getViewModelStore(), zo1Var, cp1Var.getDefaultViewModelCreationExtras());
                gu a = d82.a(ap1.class);
                String b = a.b();
                if (b != null) {
                    return ((ap1) js0Var.x(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
                }
                lh.e("Local and anonymous classes can not be ViewModels");
                return null;
        }
    }
}
