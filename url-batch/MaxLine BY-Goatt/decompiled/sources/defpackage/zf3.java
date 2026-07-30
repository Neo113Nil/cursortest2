package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zf3 extends eb3 {
    public final IBinder g;
    public final /* synthetic */ ln h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf3(ln lnVar, int i, IBinder iBinder, Bundle bundle) {
        super(lnVar, i, bundle);
        this.h = lnVar;
        this.g = iBinder;
    }

    @Override // defpackage.eb3
    public final void a(c10 c10Var) {
        jn jnVar = this.h.B;
        if (jnVar != null) {
            jnVar.c(c10Var);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.eb3
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            ll3.v(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            ln lnVar = this.h;
            if (!lnVar.u().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + lnVar.u() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface n = lnVar.n(iBinder);
            if (n == null || !(ln.x(lnVar, 2, 4, n) || ln.x(lnVar, 3, 4, n))) {
                return false;
            }
            lnVar.F = null;
            in inVar = lnVar.A;
            if (inVar == null) {
                return true;
            }
            inVar.d();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
