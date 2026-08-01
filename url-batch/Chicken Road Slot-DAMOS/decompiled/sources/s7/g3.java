package s7;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r4 f8709e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l3 f8710i;

    public g3(l3 l3Var, r4 r4Var) {
        this.f8708d = 4;
        this.f8709e = r4Var;
        Objects.requireNonNull(l3Var);
        this.f8710i = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8708d) {
            case 0:
                l3 l3Var = this.f8710i;
                h0 h0Var = l3Var.f8813r;
                q1 q1Var = (q1) l3Var.f1478d;
                if (h0Var != null) {
                    try {
                        h0Var.d(this.f8709e);
                    } catch (RemoteException e2) {
                        v0 v0Var = q1Var.f8937t;
                        q1.l(v0Var);
                        v0Var.f9050t.b(e2, "Failed to reset data on the service: remote exception");
                    }
                    l3Var.F();
                    break;
                } else {
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.a("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                l3 l3Var2 = this.f8710i;
                h0 h0Var2 = l3Var2.f8813r;
                q1 q1Var2 = (q1) l3Var2.f1478d;
                if (h0Var2 == null) {
                    v0 v0Var3 = q1Var2.f8937t;
                    q1.l(v0Var3);
                    v0Var3.f9050t.a("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        r4 r4Var = this.f8709e;
                        g gVar = q1Var2.f8935r;
                        d0 d0Var = e0.W0;
                        if (gVar.D(null, d0Var)) {
                            l3Var2.K(h0Var2, null, r4Var);
                        }
                        h0Var2.a(r4Var);
                        q1Var2.n().x();
                        q1Var2.f8935r.D(null, d0Var);
                        l3Var2.K(h0Var2, null, r4Var);
                        l3Var2.F();
                        break;
                    } catch (RemoteException e9) {
                        v0 v0Var4 = q1Var2.f8937t;
                        q1.l(v0Var4);
                        v0Var4.f9050t.b(e9, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                l3 l3Var3 = this.f8710i;
                h0 h0Var3 = l3Var3.f8813r;
                q1 q1Var3 = (q1) l3Var3.f1478d;
                if (h0Var3 == null) {
                    v0 v0Var5 = q1Var3.f8937t;
                    q1.l(v0Var5);
                    v0Var5.f9053w.a("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        h0Var3.f(this.f8709e);
                        l3Var3.F();
                        break;
                    } catch (RemoteException e10) {
                        v0 v0Var6 = q1Var3.f8937t;
                        q1.l(v0Var6);
                        v0Var6.f9050t.b(e10, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                l3 l3Var4 = this.f8710i;
                h0 h0Var4 = l3Var4.f8813r;
                q1 q1Var4 = (q1) l3Var4.f1478d;
                if (h0Var4 == null) {
                    v0 v0Var7 = q1Var4.f8937t;
                    q1.l(v0Var7);
                    v0Var7.f9050t.a("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        h0Var4.p(this.f8709e);
                        l3Var4.F();
                        break;
                    } catch (RemoteException e11) {
                        v0 v0Var8 = q1Var4.f8937t;
                        q1.l(v0Var8);
                        v0Var8.f9050t.b(e11, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                l3 l3Var5 = this.f8710i;
                h0 h0Var5 = l3Var5.f8813r;
                q1 q1Var5 = (q1) l3Var5.f1478d;
                if (h0Var5 == null) {
                    v0 v0Var9 = q1Var5.f8937t;
                    q1.l(v0Var9);
                    v0Var9.f9050t.a("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        h0Var5.q(this.f8709e);
                        l3Var5.F();
                        break;
                    } catch (RemoteException e12) {
                        v0 v0Var10 = q1Var5.f8937t;
                        q1.l(v0Var10);
                        v0Var10.f9050t.b(e12, "Failed to send consent settings to the service");
                    }
                }
        }
    }

    public /* synthetic */ g3(l3 l3Var, r4 r4Var, int i3) {
        this.f8708d = i3;
        this.f8709e = r4Var;
        this.f8710i = l3Var;
    }
}
