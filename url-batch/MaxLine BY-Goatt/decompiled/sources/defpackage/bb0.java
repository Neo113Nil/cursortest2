package defpackage;

import android.util.Pair;
import com.facebook.CallbackManager;
import com.facebook.internal.DialogPresenter;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class bb0 implements u3, cs2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bb0(f33 f33Var, gm gmVar, int i) {
        this.n = f33Var;
        this.o = gmVar;
        this.m = i;
    }

    @Override // defpackage.u3
    public void a(Object obj) {
        DialogPresenter.startActivityForResultWithAndroidX$lambda$2((CallbackManager) this.n, this.m, (c82) this.o, (Pair) obj);
    }

    @Override // defpackage.cs2
    public Object b() {
        f33 f33Var = (f33) this.n;
        f33Var.d.C((gm) this.o, this.m + 1, false);
        return null;
    }

    public /* synthetic */ bb0(CallbackManager callbackManager, int i, c82 c82Var) {
        this.n = callbackManager;
        this.m = i;
        this.o = c82Var;
    }
}
