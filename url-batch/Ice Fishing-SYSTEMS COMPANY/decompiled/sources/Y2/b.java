package Y2;

import O2.AbstractC0372i;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class b extends AbstractC0372i {
    @Override // O2.AbstractC0369f, M2.c
    public final int k() {
        return 212800000;
    }

    @Override // O2.AbstractC0369f
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // O2.AbstractC0369f
    public final L2.d[] r() {
        return H2.d.f1213b;
    }

    @Override // O2.AbstractC0369f
    public final String v() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // O2.AbstractC0369f
    public final String w() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // O2.AbstractC0369f
    public final boolean x() {
        return true;
    }
}
