package defpackage;

import android.os.Vibrator;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x8 implements d00 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x8(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.d00
    public final Object e(Object obj, dn dnVar) {
        Object value;
        v8 v8Var;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                iw0 iw0Var = (iw0) obj;
                z8 z8Var = (z8) obj2;
                z8Var.g = iw0Var;
                be1 be1Var = z8Var.e;
                do {
                    value = be1Var.getValue();
                    v8Var = iw0Var.a;
                } while (!be1Var.h(value, w8.a((w8) value, null, null, v8Var, iw0Var.b, iw0Var.c, iw0Var.d, iw0Var.e, z8.e(iw0Var), null, false, 1795)));
                la laVar = z8Var.c;
                boolean z = v8Var.a;
                boolean z2 = v8Var.b;
                laVar.f = z;
                laVar.g = z2;
                if (z) {
                    an0 an0Var = laVar.h;
                    if (an0Var == an0.d) {
                        an0Var = null;
                    }
                    if (an0Var != null) {
                        laVar.a(an0Var);
                    }
                } else {
                    laVar.h = an0.d;
                    laVar.b();
                }
                rj0 rj0Var = z8Var.d;
                boolean z3 = v8Var.c;
                rj0Var.g = z3;
                if (!z3) {
                    try {
                        i31 i31Var = k31.d;
                        Vibrator vibrator = (Vibrator) rj0Var.h;
                        if (vibrator != null) {
                            vibrator.cancel();
                        }
                    } catch (Throwable unused) {
                        i31 i31Var2 = k31.d;
                    }
                }
                z8Var.u();
                return Unit.a;
            case 1:
                mp mpVar = (mp) obj2;
                if (mpVar.l.q() instanceof zy) {
                    return Unit.a;
                }
                Object e = mp.e(mpVar, true, dnVar);
                return e == tn.d ? e : Unit.a;
            case 2:
                ((z11) obj2).d = obj;
                throw new a(this);
            default:
                ((jm0) obj2).d.h(((Number) obj).floatValue());
                return Unit.a;
        }
    }
}
