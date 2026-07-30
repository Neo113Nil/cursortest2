package v1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import n.w1;
import r1.k;
import r1.l;
import t1.C0924k;

/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.a {

    /* renamed from: E, reason: collision with root package name */
    public final C0924k f8214E;

    public e(Context context, Looper looper, w1 w1Var, C0924k c0924k, k kVar, l lVar) {
        super(context, looper, 270, w1Var, kVar, lVar);
        this.f8214E = c0924k;
    }

    @Override // r1.InterfaceC0844c
    public final int a() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final q1.d[] f() {
        return C1.c.f293c;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle g() {
        this.f8214E.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean l() {
        return true;
    }
}
