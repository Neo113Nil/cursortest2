package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class za3 extends pv0 {
    public final tt2 L;

    public za3(Context context, Looper looper, sf sfVar, tt2 tt2Var, aa3 aa3Var, aa3 aa3Var2) {
        super(context, looper, 270, sfVar, aa3Var, aa3Var2);
        this.L = tt2Var;
    }

    @Override // defpackage.ln, defpackage.ce
    public final int e() {
        return 203400000;
    }

    @Override // defpackage.ln
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof ta3 ? (ta3) queryLocalInterface : new ta3(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // defpackage.ln
    public final mk0[] q() {
        return iv1.i;
    }

    @Override // defpackage.ln
    public final Bundle r() {
        tt2 tt2Var = this.L;
        tt2Var.getClass();
        Bundle bundle = new Bundle();
        String str = tt2Var.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.ln
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.ln
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.ln
    public final boolean w() {
        return true;
    }
}
