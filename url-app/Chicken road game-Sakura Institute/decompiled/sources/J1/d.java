package J1;

import B1.C0097d;
import G1.l;
import H1.i;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final i f3392y;

    public d(Context context, Looper looper, C0097d c0097d, i iVar, l lVar, l lVar2) {
        super(context, looper, 270, c0097d, lVar, lVar2);
        this.f3392y = iVar;
    }

    @Override // F1.a
    public final int n() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final E1.d[] p() {
        return P1.c.f3785b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle q() {
        this.f3392y.getClass();
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
