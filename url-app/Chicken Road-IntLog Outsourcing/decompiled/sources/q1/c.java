package q1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import l.q0;
import l1.d;
import m1.i;
import m1.j;
import o1.C1374l;

/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.internal.a {

    /* renamed from: D, reason: collision with root package name */
    public final C1374l f11665D;

    public c(Context context, Looper looper, q0 q0Var, C1374l c1374l, i iVar, j jVar) {
        super(context, looper, 270, q0Var, iVar, jVar);
        this.f11665D = c1374l;
    }

    @Override // m1.InterfaceC1276c
    public final int f() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 2);
    }

    @Override // com.google.android.gms.common.internal.a
    public final d[] r() {
        return y1.b.f12341b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle s() {
        this.f11665D.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean w() {
        return true;
    }
}
