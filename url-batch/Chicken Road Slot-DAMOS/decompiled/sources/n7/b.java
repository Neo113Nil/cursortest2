package n7;

import android.os.IBinder;
import android.os.IInterface;
import c7.i;
import y6.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends i {
    @Override // c7.f
    public final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // c7.f
    public final z6.d[] g() {
        return g.f10643b;
    }

    @Override // c7.f
    public final int j() {
        return 261200000;
    }

    @Override // c7.f
    public final String n() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // c7.f
    public final String o() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }
}
