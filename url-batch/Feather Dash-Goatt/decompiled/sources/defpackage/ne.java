package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ne implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ ne(int i, long j) {
        this.d = i;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tf tfVar;
        Object j31Var;
        int i = this.d;
        long j = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                oe oeVar = (oe) obj;
                Function1 function1 = oeVar.b;
                if (function1 != null && (tfVar = oeVar.a) != null) {
                    try {
                        i31 i31Var = k31.d;
                        j31Var = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        i31 i31Var2 = k31.d;
                        j31Var = new j31(th);
                    }
                    tfVar.l(j31Var);
                }
                return Unit.a;
            case 1:
                ((qn0) obj).d(d60.b, Long.valueOf(j));
                return null;
            default:
                hu huVar = (hu) obj;
                float min = Math.min(huVar.s(4.0f), Float.intBitsToFloat((int) (huVar.x() & 4294967295L)));
                float s = huVar.s(6.0f);
                float intBitsToFloat = (Float.intBitsToFloat((int) (huVar.x() & 4294967295L)) - min) / 2.0f;
                if (intBitsToFloat <= s) {
                    s = intBitsToFloat;
                }
                if (huVar.getLayoutDirection() == vc0.e) {
                    long N = huVar.N();
                    i8 v = huVar.v();
                    long i2 = v.i();
                    v.g().k();
                    try {
                        ((s40) v.e).x(-1.0f, 1.0f, N);
                        y90.p(huVar, j, min, s);
                    } finally {
                        qy0.s(v, i2);
                    }
                } else {
                    y90.p(huVar, j, min, s);
                }
                return Unit.a;
        }
    }
}
