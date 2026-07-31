package t3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import q3.j;
import r3.g;
import r3.u;

/* loaded from: classes.dex */
public final class e extends g<a> {
    private final u I;

    public e(Context context, Looper looper, r3.d dVar, u uVar, q3.d dVar2, j jVar) {
        super(context, looper, 270, dVar, dVar2, jVar);
        this.I = uVar;
    }

    @Override // r3.c
    protected final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // r3.c
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // r3.c
    protected final boolean H() {
        return true;
    }

    @Override // r3.c
    public final int j() {
        return 203390000;
    }

    @Override // r3.c
    protected final /* bridge */ /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // r3.c
    public final o3.d[] v() {
        return a4.d.f212b;
    }

    @Override // r3.c
    protected final Bundle z() {
        return this.I.d();
    }
}
