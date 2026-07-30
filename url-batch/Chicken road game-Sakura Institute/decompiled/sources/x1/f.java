package x1;

import a0.x0;
import android.os.CancellationSignal;
import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import w.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9659b;

    public /* synthetic */ f(int i7, Object obj) {
        this.f9658a = i7;
        this.f9659b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f9658a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((m1) this.f9659b).c(null);
                break;
            default:
                x0 x0Var = (x0) this.f9659b;
                if (x0Var != null) {
                    j0 j0Var = x0Var.f178d;
                    if (j0Var != null) {
                        j0Var.e(a2.j0.f406b);
                    }
                    j0 j0Var2 = x0Var.f178d;
                    if (j0Var2 != null) {
                        j0Var2.f(a2.j0.f406b);
                        break;
                    }
                }
                break;
        }
    }
}
