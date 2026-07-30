package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class br0 extends dr0 {
    public final /* synthetic */ ar0 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ w3 c;
    public final /* synthetic */ u3 d;
    public final /* synthetic */ fr0 e;

    public br0(fr0 fr0Var, ar0 ar0Var, AtomicReference atomicReference, w3 w3Var, u3 u3Var) {
        this.e = fr0Var;
        this.a = ar0Var;
        this.b = atomicReference;
        this.c = w3Var;
        this.d = u3Var;
    }

    @Override // defpackage.dr0
    public final void a() {
        i4 activityResultRegistry;
        fr0 fr0Var = this.e;
        String generateActivityResultKey = fr0Var.generateActivityResultKey();
        ar0 ar0Var = this.a;
        switch (ar0Var.m) {
            case 0:
                fr0 fr0Var2 = (fr0) ar0Var.n;
                Object obj = fr0Var2.mHost;
                if (!(obj instanceof m4)) {
                    activityResultRegistry = fr0Var2.requireActivity().getActivityResultRegistry();
                    break;
                } else {
                    activityResultRegistry = ((m4) obj).getActivityResultRegistry();
                    break;
                }
            default:
                activityResultRegistry = (i4) ar0Var.n;
                break;
        }
        this.b.set(activityResultRegistry.d(generateActivityResultKey, fr0Var, this.c, this.d));
    }
}
