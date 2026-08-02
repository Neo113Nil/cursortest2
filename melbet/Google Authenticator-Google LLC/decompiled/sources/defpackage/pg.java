package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pg {
    private by a;
    private boolean b;

    public pg(bd bdVar, ox oxVar) {
        if (oxVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        by F = bdVar.F();
        bdVar.L().a(new pf((pq) new agj(bdVar).a(pq.class)));
        c(false, F, bdVar, oxVar);
    }

    public static pq a(bd bdVar, boolean z) {
        agl D = z ? bdVar.D() : null;
        if (D == null) {
            D = bdVar.F;
        }
        if (D != null) {
            return (pq) new agj(D).a(pq.class);
        }
        throw new IllegalStateException("view model not found");
    }

    private final void c(boolean z, by byVar, agl aglVar, ox oxVar) {
        pq pqVar = (pq) new agj(aglVar).a(pq.class);
        this.b = z;
        this.a = byVar;
        pqVar.z = oxVar;
    }

    public final void b(pe peVar) {
        by byVar = this.a;
        if (byVar == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (byVar.X()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        pn pnVar = (pn) byVar.d("androidx.biometric.internal.BiometricFragment");
        if (pnVar == null) {
            boolean z = this.b;
            pn pnVar2 = new pn();
            Bundle bundle = new Bundle();
            bundle.putBoolean("host_activity", z);
            pnVar2.ah(bundle);
            ae aeVar = new ae(this.a);
            aeVar.d(0, pnVar2, "androidx.biometric.internal.BiometricFragment", 1);
            aeVar.h(true, true);
            this.a.Z();
            pnVar = pnVar2;
        }
        pq pqVar = pnVar.a;
        pqVar.a = peVar;
        pqVar.o();
        pq pqVar2 = pnVar.a;
        pqVar2.m = pb.b(pnVar.y()).c();
        pqVar2.o();
        pq pqVar3 = pnVar.a;
        pqVar3.b = null;
        if (Build.VERSION.SDK_INT < 30) {
            int i = pqVar3.a.e;
            int i2 = i & 32767;
            if ((i & 32752) == 0) {
                int i3 = 1;
                while (true) {
                    if (i3 > 15) {
                        break;
                    }
                    if (i3 == i2) {
                        pqVar3.b = ow.g();
                        break;
                    }
                    i3 = (i3 + i3) | 1;
                }
            }
        }
        pqVar3.o();
        if (pnVar.aG()) {
            pnVar.a.e = pnVar.R(R.string.confirm_device_credential_password);
        } else {
            pnVar.a.e = null;
        }
        Context x = pnVar.x();
        if ((Build.VERSION.SDK_INT == 29 && !pnVar.aF() && !pnVar.n.getBoolean("has_face", oy.e(pnVar.x())) && !pnVar.n.getBoolean("has_iris", oy.g(pnVar.x()))) || (pnVar.aG() && pb.b(x).a(255) != 0)) {
            pnVar.a.h = true;
            pnVar.n();
        } else if (pnVar.a.j) {
            pnVar.b.postDelayed(new pm(pnVar, 1), 600L);
        } else {
            pnVar.r();
        }
    }

    public pg(bg bgVar, ox oxVar) {
        c(true, bgVar.a(), bgVar, oxVar);
    }
}
