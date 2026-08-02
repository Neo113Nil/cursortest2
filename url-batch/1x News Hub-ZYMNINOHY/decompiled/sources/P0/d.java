package P0;

import M0.m;
import N0.j;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final j f1256y;

    public d(Context context, Looper looper, F1.c cVar, j jVar, m mVar, m mVar2) {
        super(context, looper, 270, cVar, mVar, mVar2);
        this.f1256y = jVar;
    }

    @Override // L0.c
    public final int g() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final K0.d[] o() {
        return W0.c.f1621b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        this.f1256y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
