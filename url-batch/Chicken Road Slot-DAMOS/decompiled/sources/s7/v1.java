package s7;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v1 implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r4 f9058e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f9059i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w1 f9060r;

    public /* synthetic */ v1(w1 w1Var, r4 r4Var, Bundle bundle, int i3) {
        this.f9057d = i3;
        this.f9058e = r4Var;
        this.f9059i = bundle;
        this.f9060r = w1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f9057d) {
            case 0:
                w1 w1Var = this.f9060r;
                w1Var.f9082d.V();
                return w1Var.f9082d.d0(this.f9059i, this.f9058e);
            default:
                w1 w1Var2 = this.f9060r;
                w1Var2.f9082d.V();
                return w1Var2.f9082d.d0(this.f9059i, this.f9058e);
        }
    }
}
