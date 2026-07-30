package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qw2 extends PxuCJdSBwIXG {
    public final fe2 pnx5pC0XzaCw;

    public qw2(Context context, Looper looper, mk mkVar, fe2 fe2Var, uv2 uv2Var, uv2 uv2Var2) {
        super(context, looper, 270, mkVar, uv2Var, uv2Var2);
        this.pnx5pC0XzaCw = fe2Var;
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final boolean EcgxDIVH5in8() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final t70[] QrzZRwfaDlRX() {
        return f2.jyegZNwi31qc;
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final String RfyTYNmI9Srp() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final String XL4ISE6Oc65B() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.y8
    public final int Y1f8riQaR6yg() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final IInterface cpQdD2nAriOS(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof mw2 ? (mw2) queryLocalInterface : new mw2(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final Bundle gPXPFXrUH4XX() {
        fe2 fe2Var = this.pnx5pC0XzaCw;
        fe2Var.getClass();
        Bundle bundle = new Bundle();
        String str = fe2Var.PxuCJdSBwIXG;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
