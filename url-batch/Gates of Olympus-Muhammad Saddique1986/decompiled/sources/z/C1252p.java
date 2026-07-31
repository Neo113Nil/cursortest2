package z;

import B.a0;
import C0.J;
import android.os.CancellationSignal;
import q2.m0;
import x.Q;

/* renamed from: z.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1252p implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10462b;

    public /* synthetic */ C1252p(int i3, Object obj) {
        this.f10461a = i3;
        this.f10462b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f10461a) {
            case 0:
                a0 a0Var = (a0) this.f10462b;
                if (a0Var != null) {
                    Q q3 = a0Var.f345d;
                    if (q3 != null) {
                        q3.e(J.f567b);
                    }
                    Q q4 = a0Var.f345d;
                    if (q4 != null) {
                        q4.f(J.f567b);
                        break;
                    }
                }
                break;
            default:
                ((m0) this.f10462b).a(null);
                break;
        }
    }
}
