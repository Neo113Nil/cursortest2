package e7;

import a7.k;
import a7.l;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c7.i;
import c7.o;
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends i {
    public final o F;

    public e(Context context, Looper looper, g2 g2Var, o oVar, k kVar, l lVar) {
        super(context, looper, 270, g2Var, kVar, lVar);
        this.F = oVar;
    }

    @Override // c7.f
    public final IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // c7.f
    public final z6.d[] g() {
        return m7.b.f6570c;
    }

    @Override // c7.f
    public final Bundle i() {
        o oVar = this.F;
        oVar.getClass();
        Bundle bundle = new Bundle();
        String str = oVar.f1960b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // c7.f
    public final int j() {
        return 203400000;
    }

    @Override // c7.f
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // c7.f
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // c7.f
    public final boolean p() {
        return true;
    }
}
