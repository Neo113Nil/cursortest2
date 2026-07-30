package defpackage;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class mz implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((jo2) obj).f(null);
                break;
            default:
                gv2 gv2Var = (gv2) obj;
                if (gv2Var != null) {
                    sc1 sc1Var = gv2Var.d;
                    if (sc1Var != null) {
                        sc1Var.e(jw2.b);
                    }
                    sc1 sc1Var2 = gv2Var.d;
                    if (sc1Var2 != null) {
                        sc1Var2.f(jw2.b);
                        break;
                    }
                }
                break;
        }
    }
}
