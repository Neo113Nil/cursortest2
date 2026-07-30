package Q2;

import M2.i;
import M2.j;
import O2.AbstractC0372i;
import O2.o;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.c1;

/* loaded from: classes.dex */
public final class d extends AbstractC0372i {

    /* renamed from: X, reason: collision with root package name */
    public final o f2716X;

    public d(Context context, Looper looper, c1 c1Var, o oVar, i iVar, j jVar) {
        super(context, looper, 270, c1Var, iVar, jVar);
        this.f2716X = oVar;
    }

    @Override // O2.AbstractC0369f, M2.c
    public final int k() {
        return 203400000;
    }

    @Override // O2.AbstractC0369f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // O2.AbstractC0369f
    public final L2.d[] r() {
        return Z2.c.f4247b;
    }

    @Override // O2.AbstractC0369f
    public final Bundle s() {
        this.f2716X.getClass();
        return new Bundle();
    }

    @Override // O2.AbstractC0369f
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // O2.AbstractC0369f
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // O2.AbstractC0369f
    public final boolean x() {
        return true;
    }
}
