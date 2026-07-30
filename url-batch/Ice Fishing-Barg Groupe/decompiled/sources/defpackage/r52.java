package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r52 extends PxuCJdSBwIXG {
    public final mk IAToe7bXGz4N;
    public final Bundle e6tOsSdd2EFb;
    public final Integer jyegZNwi31qc;
    public final boolean pnx5pC0XzaCw;

    public r52(Context context, Looper looper, mk mkVar, Bundle bundle, dh0 dh0Var, eh0 eh0Var) {
        super(context, looper, 44, mkVar, dh0Var, eh0Var);
        this.pnx5pC0XzaCw = true;
        this.IAToe7bXGz4N = mkVar;
        this.e6tOsSdd2EFb = bundle;
        this.jyegZNwi31qc = mkVar.a92UlCVFR9N8;
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final String RfyTYNmI9Srp() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final String XL4ISE6Oc65B() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.y8
    public final int Y1f8riQaR6yg() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final IInterface cpQdD2nAriOS(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof iw2 ? (iw2) queryLocalInterface : new iw2(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG
    public final Bundle gPXPFXrUH4XX() {
        mk mkVar = this.IAToe7bXGz4N;
        boolean equals = this.TSizfFm2Yiuu.getPackageName().equals(mkVar.TSizfFm2Yiuu);
        Bundle bundle = this.e6tOsSdd2EFb;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", mkVar.TSizfFm2Yiuu);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.PxuCJdSBwIXG, defpackage.y8
    public final boolean wdg6QnbFHrFF() {
        return this.pnx5pC0XzaCw;
    }
}
