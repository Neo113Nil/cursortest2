package o4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import l4.j;
import m4.i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final i f6841y;

    public d(Context context, Looper looper, b1.b bVar, i iVar, j jVar, j jVar2) {
        super(context, looper, 270, bVar, jVar, jVar2);
        this.f6841y = iVar;
    }

    @Override // k4.a
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
    public final j4.d[] p() {
        return u4.c.f9054b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle q() {
        this.f6841y.getClass();
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
