package e7;

import android.os.IBinder;
import android.os.IInterface;
import c7.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends i {
    @Override // c7.f
    public final IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new b(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 1);
    }

    @Override // c7.f
    public final z6.d[] g() {
        return m7.b.f6570c;
    }

    @Override // c7.f
    public final int j() {
        return 253600000;
    }

    @Override // c7.f
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // c7.f
    public final String o() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // c7.f
    public final boolean p() {
        return true;
    }
}
