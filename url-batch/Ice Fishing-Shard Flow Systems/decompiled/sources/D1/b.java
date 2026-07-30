package D1;

import android.os.IBinder;
import android.os.IInterface;
import p1.AbstractC0824g;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.a {
    @Override // r1.InterfaceC0844c
    public final int a() {
        return 261200000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final q1.d[] f() {
        return AbstractC0824g.f7175b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }
}
