package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i6 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i6(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        boolean z = false;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                yr1.O((j6) this.e);
                return Unit.a;
            case 1:
                return Float.valueOf(ka0.q(((sn) this.e).f()));
            case 2:
                return Integer.valueOf(((wf0) this.e).g().n);
            case 3:
                Object q = ((fg) this.e).q();
                return (qm0) (q instanceof og ? null : q);
            case 4:
                s6 s6Var = (s6) this.e;
                s6Var.getClass();
                try {
                    s6Var.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://featherrdash.com/privacy-policy.html")));
                    return Unit.a;
                } catch (ActivityNotFoundException e) {
                    throw new IllegalArgumentException("Can't open https://featherrdash.com/privacy-policy.html.", e);
                }
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                float floatValue = ((Number) ((Function0) this.e).invoke()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                return Float.valueOf(floatValue);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                o51 o51Var = (o51) this.e;
                h61 h61Var = o51Var.d;
                Object obj = o51Var.h;
                if (obj != null) {
                    return h61Var.c(o51Var, obj);
                }
                dd0.e("Value should be initialized");
                return null;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                c51 c51Var = ((w51) this.e).g;
                if (c51Var == null) {
                    return null;
                }
                ov.d.getClass();
                Bundle D = yr1.D((Pair[]) Arrays.copyOf(new Pair[0], 0));
                c51Var.j(D);
                if (D.isEmpty()) {
                    return null;
                }
                return D;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                e61 e61Var = (e61) this.e;
                e61Var.f().a(new r11(0, e61Var));
                return Unit.a;
            case 9:
                j71 j71Var = (j71) this.e;
                j5 j5Var = (j5) mo.k(j71Var, cu0.a);
                j71Var.D = j5Var;
                j71Var.E = j5Var != null ? new i5(j5Var.a, j5Var.b, j5Var.c, j5Var.d) : null;
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return this.e;
            case RequestError.STOP_TRACKING /* 11 */:
                r91 r91Var = (r91) this.e;
                av0 av0Var = r91Var.g;
                if (((va1) av0Var.getValue()).a == 9205357640488583168L || va1.c(((va1) av0Var.getValue()).a)) {
                    return null;
                }
                return r91Var.d.T(((va1) av0Var.getValue()).a);
            case 12:
                cc1 cc1Var = (cc1) this.e;
                while (true) {
                    synchronized (cc1Var.g) {
                        try {
                            if (!cc1Var.c) {
                                cc1Var.c = true;
                                try {
                                    eo0 eo0Var = cc1Var.f;
                                    Object[] objArr = eo0Var.d;
                                    int i2 = eo0Var.g;
                                    int i3 = z ? 1 : 0;
                                    boolean z2 = z;
                                    while (i3 < i2) {
                                        try {
                                            bc1 bc1Var = (bc1) objArr[i3];
                                            wn0 wn0Var = bc1Var.g;
                                            Function1 function1 = bc1Var.a;
                                            Object[] objArr2 = wn0Var.b;
                                            long[] jArr = wn0Var.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i4 = z2 ? 1 : 0;
                                                boolean z3 = z2;
                                                while (true) {
                                                    long j = jArr[i4];
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i5 = 8;
                                                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                        for (?? r2 = z3; r2 < i6; r2++) {
                                                            if ((j & 255) < 128) {
                                                                i = i5;
                                                                function1.invoke(objArr2[(i4 << 3) + r2]);
                                                            } else {
                                                                i = i5;
                                                            }
                                                            j >>= i;
                                                            i5 = i;
                                                        }
                                                        if (i6 != i5) {
                                                        }
                                                    }
                                                    if (i4 != length) {
                                                        i4++;
                                                        z3 = false;
                                                    }
                                                }
                                            }
                                            wn0Var.b();
                                            i3++;
                                            z2 = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            z = false;
                                            cc1Var.c = z;
                                            throw th;
                                        }
                                    }
                                    cc1Var.c = z2;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!cc1Var.a()) {
                        return Unit.a;
                    }
                    z = false;
                }
            case 13:
                sh1 sh1Var = (sh1) this.e;
                sh1Var.C = null;
                ka0.v(sh1Var);
                y90.t(sh1Var);
                yr1.O(sh1Var);
                return Boolean.TRUE;
            default:
                return Float.valueOf(((float[]) this.e)[0]);
        }
    }
}
