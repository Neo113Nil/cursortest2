package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpm extends cpg {
    public final IBinder g;
    final /* synthetic */ cpo h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpm(cpo cpoVar, int i, IBinder iBinder, Bundle bundle) {
        super(cpoVar, i, bundle);
        this.h = cpoVar;
        this.g = iBinder;
    }

    @Override // defpackage.cpg
    protected final void a(clg clgVar) {
        kee keeVar = this.h.r;
        if (keeVar != null) {
            keeVar.u(clgVar);
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [cnx, java.lang.Object] */
    @Override // defpackage.cpg
    protected final boolean b() {
        cpv cpvVar;
        try {
            IBinder iBinder = this.g;
            oy.at(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            cpo cpoVar = this.h;
            if (!cpoVar.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + cpoVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface b = cpoVar.b(this.g);
            if (b == null || !(cpoVar.F(2, 4, b) || cpoVar.F(3, 4, b))) {
                return false;
            }
            Bundle bundle = null;
            cpoVar.l = null;
            cpx cpxVar = (!cpoVar.D() || (cpvVar = cpoVar.n) == null) ? null : cpvVar.e;
            if (cpxVar != null) {
                bundle = new Bundle();
                bundle.putByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG", oy.p(cpxVar));
            }
            kee keeVar = cpoVar.s;
            if (keeVar == null) {
                return true;
            }
            keeVar.a.a(bundle);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
