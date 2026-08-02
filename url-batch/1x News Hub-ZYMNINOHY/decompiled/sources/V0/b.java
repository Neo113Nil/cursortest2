package V0;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.a {
    @Override // L0.c
    public final int g() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final K0.d[] o() {
        return H0.c.f602b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
