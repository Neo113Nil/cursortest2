package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jr3 implements bl3 {
    public final ve3 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public jr3(AppMeasurementDynamiteService appMeasurementDynamiteService, ve3 ve3Var) {
        this.b = appMeasurementDynamiteService;
        this.a = ve3Var;
    }

    @Override // defpackage.bl3
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.i(str, str2, bundle, j);
        } catch (RemoteException e) {
            pj3 pj3Var = this.b.g;
            if (pj3Var != null) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.u.c(e, "Event listener threw exception");
            }
        }
    }
}
