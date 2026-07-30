package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ne3 extends w93 implements ve3 {
    public ne3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // defpackage.ve3
    public final int e() {
        Parcel c = c(d(), 2);
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    @Override // defpackage.ve3
    public final void i(String str, String str2, Bundle bundle, long j) {
        Parcel d = d();
        d.writeString(str);
        d.writeString(str2);
        od3.b(d, bundle);
        d.writeLong(j);
        H(d, 1);
    }
}
