package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wq1 extends vr1 {
    public final /* synthetic */ IBinder e;
    public final /* synthetic */ ar1 g;

    public wq1(ar1 ar1Var, IBinder iBinder) {
        this.g = ar1Var;
        this.e = iBinder;
    }

    @Override // defpackage.vr1
    public final void b() {
        tr1 rr1Var;
        br1 br1Var = this.g.a;
        br1Var.i.getClass();
        int i = sr1.c;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            rr1Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            rr1Var = queryLocalInterface instanceof tr1 ? (tr1) queryLocalInterface : new rr1(iBinder);
        }
        br1Var.n = rr1Var;
        ur1 ur1Var = br1Var.b;
        int i2 = 0;
        ur1Var.a("linkToDeath", new Object[0]);
        try {
            ((rr1) br1Var.n).b.linkToDeath(br1Var.k, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            ur1Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ur1.b(ur1Var.a, "linkToDeath failed", objArr), e);
            }
        }
        br1Var.g = false;
        ArrayList arrayList = br1Var.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        br1Var.d.clear();
    }
}
