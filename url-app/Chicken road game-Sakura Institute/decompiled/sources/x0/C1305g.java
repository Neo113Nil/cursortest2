package x0;

import A.a0;
import A0.K;
import W2.r0;
import android.os.CancellationSignal;
import w.P;

/* renamed from: x0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1305g implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11432b;

    public /* synthetic */ C1305g(int i2, Object obj) {
        this.f11431a = i2;
        this.f11432b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f11431a) {
            case 0:
                ((r0) this.f11432b).a(null);
                break;
            default:
                a0 a0Var = (a0) this.f11432b;
                if (a0Var != null) {
                    P p4 = a0Var.f87d;
                    if (p4 != null) {
                        p4.e(K.f299b);
                    }
                    P p5 = a0Var.f87d;
                    if (p5 != null) {
                        p5.f(K.f299b);
                        break;
                    }
                }
                break;
        }
    }
}
