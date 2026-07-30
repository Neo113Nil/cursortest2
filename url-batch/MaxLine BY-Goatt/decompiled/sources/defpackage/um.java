package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class um {
    public final tq1 a;
    public final ru1 b;

    /* JADX WARN: Multi-variable type inference failed */
    public um(tq1 tq1Var, ru1 ru1Var) {
        this.a = tq1Var;
        this.b = ru1Var;
        if ((tq1Var == null ? ru1Var : tq1Var) != null) {
            return;
        }
        lh.e("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
