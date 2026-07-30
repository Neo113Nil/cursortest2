package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fu1 extends it1 {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu1(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.it1
    public final void a(fm fmVar) {
        nq0 nq0Var = this.h.o;
        if (nq0Var != null) {
            ((f50) nq0Var.e).b(fmVar);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.it1
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            y90.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface m = aVar.m(iBinder);
            if (m == null || !(a.u(aVar, 2, 4, m) || a.u(aVar, 3, 4, m))) {
                return false;
            }
            aVar.s = null;
            nq0 nq0Var = aVar.n;
            if (nq0Var == null) {
                return true;
            }
            ((e50) nq0Var.e).c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
