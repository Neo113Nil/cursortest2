package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ie3 extends w93 implements je3 {
    public ie3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 2);
    }

    @Override // defpackage.je3
    public final void m(Bundle bundle) {
        Parcel d = d();
        od3.b(d, bundle);
        H(d, 1);
    }
}
