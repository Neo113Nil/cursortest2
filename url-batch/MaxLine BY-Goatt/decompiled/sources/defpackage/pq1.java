package defpackage;

import androidx.compose.ui.layout.a;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pq1 implements oj1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ boolean c;

    public pq1(Function0 function0, Function2 function2, boolean z) {
        this.a = function0;
        this.b = function2;
        this.c = z;
    }

    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        float f;
        Object obj;
        n12 n12Var;
        Function2 function2;
        n12 n12Var2;
        pj1 G;
        pj1 G2;
        float floatValue = ((Number) this.a.invoke()).floatValue();
        long a = u10.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jj1 jj1Var = (jj1) list.get(i);
            if (Intrinsics.b(a.a(jj1Var), "icon")) {
                n12 c = jj1Var.c(a);
                int R = qj1Var.R(40.0f) + c.m;
                int b = si1.b(R * floatValue);
                int R2 = qj1Var.R(8.0f) + c.n;
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jj1 jj1Var2 = (jj1) list.get(i2);
                    if (Intrinsics.b(a.a(jj1Var2), "indicatorRipple")) {
                        if (!((R >= 0) & (R2 >= 0))) {
                            j21.a("width and height must be >= 0");
                        }
                        n12 c2 = jj1Var2.c(v10.h(R, R, R2, R2));
                        int size3 = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                f = floatValue;
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            f = floatValue;
                            if (Intrinsics.b(a.a((jj1) obj), "indicator")) {
                                break;
                            }
                            i3++;
                            floatValue = f;
                        }
                        jj1 jj1Var3 = (jj1) obj;
                        if (jj1Var3 != null) {
                            if (!((b >= 0) & (R2 >= 0))) {
                                j21.a("width and height must be >= 0");
                            }
                            n12Var = jj1Var3.c(v10.h(b, b, R2, R2));
                        } else {
                            n12Var = null;
                        }
                        Function2 function22 = this.b;
                        if (function22 != null) {
                            int size4 = list.size();
                            for (int i4 = 0; i4 < size4; i4++) {
                                jj1 jj1Var4 = (jj1) list.get(i4);
                                if (Intrinsics.b(a.a(jj1Var4), Constants.ScionAnalytics.PARAM_LABEL)) {
                                    n12Var2 = jj1Var4.c(a);
                                    function2 = function22;
                                }
                            }
                            ch2.k("Collection contains no element matching the predicate.");
                            return null;
                        }
                        function2 = function22;
                        n12Var2 = null;
                        if (function2 == null) {
                            int h = u10.h(j);
                            int f2 = v10.f(j, qj1Var.R(80.0f));
                            G2 = qj1Var.G(h, f2, mi1.c(), new qq1(n12Var, c, (h - c.m) / 2, (f2 - c.n) / 2, c2, (h - c2.m) / 2, (f2 - c2.n) / 2, h, f2));
                            return G2;
                        }
                        n12 n12Var3 = n12Var;
                        n12Var2.getClass();
                        float D = qj1Var.D(4.0f) + qj1Var.D(4.0f) + c.n + n12Var2.n;
                        float i5 = (u10.i(j) - D) / 2.0f;
                        float D2 = qj1Var.D(4.0f);
                        float f3 = i5 < D2 ? D2 : i5;
                        float f4 = (f3 * 2.0f) + D;
                        boolean z = this.c;
                        float f5 = (1.0f - f) * ((z ? f3 : (f4 - c.n) / 2.0f) - f3);
                        float D3 = qj1Var.D(4.0f) + qj1Var.D(4.0f) + c.n + f3;
                        int h2 = u10.h(j);
                        G = qj1Var.G(h2, si1.b(f4), mi1.c(), new rq1(n12Var3, z, f, n12Var2, (h2 - n12Var2.m) / 2, D3, f5, c, (h2 - c.m) / 2, f3, c2, (h2 - c2.m) / 2, f3 - qj1Var.D(4.0f), h2, qj1Var));
                        return G;
                    }
                }
                ch2.k("Collection contains no element matching the predicate.");
                return null;
            }
        }
        ch2.k("Collection contains no element matching the predicate.");
        return null;
    }
}
