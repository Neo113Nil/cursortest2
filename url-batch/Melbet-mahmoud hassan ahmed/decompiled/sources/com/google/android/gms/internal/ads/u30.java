package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class u30 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12616a;

    public u30(Context context) {
        this.f12616a = context;
    }

    public final void a(fi0 fi0Var) {
        try {
            ((v30) no0.b(this.f12616a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new lo0() { // from class: com.google.android.gms.internal.ads.t30
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.lo0
                public final Object c(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof v30 ? (v30) queryLocalInterface : new v30(obj);
                }
            })).C3(fi0Var);
        } catch (RemoteException e7) {
            String valueOf = String.valueOf(e7.getMessage());
            io0.g(valueOf.length() != 0 ? "Error calling setFlagsAccessedBeforeInitializedListener: ".concat(valueOf) : new String("Error calling setFlagsAccessedBeforeInitializedListener: "));
        } catch (mo0 e8) {
            String valueOf2 = String.valueOf(e8.getMessage());
            io0.g(valueOf2.length() != 0 ? "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(valueOf2) : new String("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:"));
        }
    }
}
