package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r81 extends pc0 implements Function2 {
    public static final r81 e;
    public static final r81 g;
    public static final r81 h;
    public final /* synthetic */ int d;

    static {
        int i = 2;
        e = new r81(i, 0);
        g = new r81(i, 1);
        h = new r81(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r81(int i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        String str;
        z30 z30Var;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z0 z0Var = (z0) obj;
                z0 z0Var2 = (z0) obj2;
                if (z0Var == null || (str = z0Var.a) == null) {
                    str = z0Var2.a;
                }
                if (z0Var == null || (z30Var = z0Var.b) == null) {
                    z30Var = z0Var2.b;
                }
                return new z0(str, z30Var);
            case 1:
                return obj == null ? obj2 : obj;
            default:
                l81 l81Var = (l81) obj2;
                Object valueOf = Float.valueOf(0.0f);
                h81 h81Var = ((l81) obj).d;
                t81 t81Var = p81.t;
                Object g2 = h81Var.d.g(t81Var);
                if (g2 == null) {
                    g2 = valueOf;
                }
                float floatValue = ((Number) g2).floatValue();
                Object g3 = l81Var.d.d.g(t81Var);
                if (g3 != null) {
                    valueOf = g3;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
