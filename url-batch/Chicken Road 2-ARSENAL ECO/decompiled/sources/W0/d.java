package W0;

import S0.e;
import S0.f;
import U0.k;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c1.AbstractC0278c;
import k.v0;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.a {

    /* renamed from: D, reason: collision with root package name */
    public final k f2798D;

    public d(Context context, Looper looper, v0 v0Var, k kVar, e eVar, f fVar) {
        super(context, looper, 270, v0Var, eVar, fVar);
        this.f2798D = kVar;
    }

    @Override // S0.a
    public final int e() {
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
    public final R0.c[] p() {
        return AbstractC0278c.f3777b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle q() {
        this.f2798D.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean u() {
        return true;
    }
}
