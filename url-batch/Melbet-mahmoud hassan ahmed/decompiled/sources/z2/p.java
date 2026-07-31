package z2;

import a3.g2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.yu;

/* loaded from: classes.dex */
public final class p {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z6) {
        if (adOverlayInfoParcel.f2419p != 4 || adOverlayInfoParcel.f2411h != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f2421r.f10304i);
            intent.putExtra("shouldCallOnOverlayOpened", z6);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!v3.l.g()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            y2.t.q();
            g2.q(context, intent);
            return;
        }
        yu yuVar = adOverlayInfoParcel.f2410g;
        if (yuVar != null) {
            yuVar.M();
        }
        pi1 pi1Var = adOverlayInfoParcel.D;
        if (pi1Var != null) {
            pi1Var.r();
        }
        Activity j7 = adOverlayInfoParcel.f2412i.j();
        f fVar = adOverlayInfoParcel.f2409f;
        if (fVar != null && fVar.f23645o && j7 != null) {
            context = j7;
        }
        y2.t.j();
        f fVar2 = adOverlayInfoParcel.f2409f;
        a.b(context, fVar2, adOverlayInfoParcel.f2417n, fVar2 != null ? fVar2.f23644n : null);
    }
}
