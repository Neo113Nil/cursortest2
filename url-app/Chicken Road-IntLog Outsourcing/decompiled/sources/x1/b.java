package x1;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.a {
    @Override // m1.InterfaceC1276c
    public final int f() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final l1.d[] r() {
        return h1.c.f5776b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean w() {
        return true;
    }
}
