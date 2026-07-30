package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class et1 extends a {
    public final sg1 y;

    public et1(Context context, Looper looper, jb jbVar, sg1 sg1Var, es1 es1Var, es1 es1Var2) {
        super(context, looper, 270, jbVar, es1Var, es1Var2);
        this.y = sg1Var;
    }

    @Override // defpackage.b8
    public final int e() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof zs1 ? (zs1) queryLocalInterface : new zs1(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final vx[] o() {
        return mo.s;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        sg1 sg1Var = this.y;
        sg1Var.getClass();
        Bundle bundle = new Bundle();
        String str = sg1Var.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
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
