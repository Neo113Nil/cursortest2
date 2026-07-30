package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ph3 extends ln {
    @Override // defpackage.ln, defpackage.ce
    public final int e() {
        return 12451000;
    }

    @Override // defpackage.ln
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof yg3 ? (yg3) queryLocalInterface : new vg3(iBinder);
    }

    @Override // defpackage.ln
    public final String u() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.ln
    public final String v() {
        return "com.google.android.gms.measurement.START";
    }
}
