package s7;

import com.google.android.gms.internal.measurement.ca;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8753d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8754e;

    public /* synthetic */ j1(k1 k1Var) {
        this.f8754e = k1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8753d) {
            case 0:
                return new ca(((k1) this.f8754e).f8784z);
            default:
                w1 w1Var = (w1) this.f8754e;
                w1Var.f9082d.V();
                z0 z0Var = w1Var.f9082d.f8767v;
                j4.T(z0Var);
                z0Var.s();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public j1(w1 w1Var, u uVar, String str) {
        this.f8754e = w1Var;
    }
}
